package com.android.internal.os;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.app.ActivityManagerNative;
import android.app.ApplicationErrorReport;
import android.os.Build;
import android.os.Debug;
import android.os.IBinder;
import android.os.Process;
import android.os.SystemProperties;
import android.util.Log;
import android.util.Slog;
import com.android.internal.logging.AndroidConfig;
import com.android.server.NetworkManagementSocketTagger;
import dalvik.system.VMRuntime;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.TimeZone;
import java.util.logging.LogManager;
import org.apache.harmony.luni.internal.util.TimezoneGetter;

public class RuntimeInit {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:13.991 -0400", hash_original_method = "82505B17DF4892252BD2E987919E8FA9", hash_generated_method = "82505B17DF4892252BD2E987919E8FA9")
    public RuntimeInit ()
    {
        //Synthesized constructor
    }


        private static final void commonInit() {
        if (DEBUG) Slog.d(TAG, "Entered RuntimeInit!");
        Thread.setDefaultUncaughtExceptionHandler(new UncaughtHandler());
        int hasQwerty = getQwertyKeyboard();
        if (DEBUG) Slog.d(TAG, ">>>>> qwerty keyboard = " + hasQwerty);
        if (hasQwerty == 1) {
            System.setProperty("qwerty", "1");
        }
        TimezoneGetter.setInstance(new TimezoneGetter() {
            @Override
            public String getId() {
                return SystemProperties.get("persist.sys.timezone");
            }
        });
        TimeZone.setDefault(null);
        LogManager.getLogManager().reset();
        new AndroidConfig();
        String userAgent = getDefaultUserAgent();
        System.setProperty("http.agent", userAgent);
        NetworkManagementSocketTagger.install();
        String trace = SystemProperties.get("ro.kernel.android.tracing");
        if (trace.equals("1")) {
            Slog.i(TAG, "NOTE: emulator trace profiling enabled");
            Debug.enableEmulatorTraceOutput();
        }
        initialized = true;
    }

    
        private static String getDefaultUserAgent() {
        StringBuilder result = new StringBuilder(64);
        result.append("Dalvik/");
        result.append(System.getProperty("java.vm.version"));
        result.append(" (Linux; U; Android ");
        String version = Build.VERSION.RELEASE;
        result.append(version.length() > 0 ? version : "1.0");
        if ("REL".equals(Build.VERSION.CODENAME)) {
            String model = Build.MODEL;
            if (model.length() > 0) {
                result.append("; ");
                result.append(model);
            }
        }
        String id = Build.ID;
        if (id.length() > 0) {
            result.append(" Build/");
            result.append(id);
        }
        result.append(")");
        return result.toString();
    }

    
        private static void invokeStaticMain(String className, String[] argv) throws ZygoteInit.MethodAndArgsCaller {
        Class<?> cl;
        try {
            cl = Class.forName(className);
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(
                    "Missing class when invoking static main " + className,
                    ex);
        }
        Method m;
        try {
            m = cl.getMethod("main", new Class[] { String[].class });
        } catch (NoSuchMethodException ex) {
            throw new RuntimeException(
                    "Missing static main on " + className, ex);
        } catch (SecurityException ex) {
            throw new RuntimeException(
                    "Problem getting static main on " + className, ex);
        }
        int modifiers = m.getModifiers();
        if (! (Modifier.isStatic(modifiers) && Modifier.isPublic(modifiers))) {
            throw new RuntimeException(
                    "Main method is not public and static on " + className);
        }
        throw new ZygoteInit.MethodAndArgsCaller(m, argv);
    }

    
        public static final void main(String[] argv) {
        if (argv.length == 2 && argv[1].equals("application")) {
            if (DEBUG) Slog.d(TAG, "RuntimeInit: Starting application");
            redirectLogStreams();
        } else {
            if (DEBUG) Slog.d(TAG, "RuntimeInit: Starting tool");
        }
        commonInit();
        finishInit();
        if (DEBUG) Slog.d(TAG, "Leaving RuntimeInit!");
    }

    
        public static final void finishInit() {
    }

    
        public static final void zygoteInit(int targetSdkVersion, String[] argv) throws ZygoteInit.MethodAndArgsCaller {
        if (DEBUG) Slog.d(TAG, "RuntimeInit: Starting application from zygote");
        redirectLogStreams();
        commonInit();
        zygoteInitNative();
        applicationInit(targetSdkVersion, argv);
    }

    
        public static void wrapperInit(int targetSdkVersion, String[] argv) throws ZygoteInit.MethodAndArgsCaller {
        if (DEBUG) Slog.d(TAG, "RuntimeInit: Starting application from wrapper");
        applicationInit(targetSdkVersion, argv);
    }

    
        private static void applicationInit(int targetSdkVersion, String[] argv) throws ZygoteInit.MethodAndArgsCaller {
        VMRuntime.getRuntime().setTargetHeapUtilization(0.75f);
        VMRuntime.getRuntime().setTargetSdkVersion(targetSdkVersion);
        final Arguments args;
        try {
            args = new Arguments(argv);
        } catch (IllegalArgumentException ex) {
            Slog.e(TAG, ex.getMessage());
            return;
        }
        invokeStaticMain(args.startClass, args.startArgs);
    }

    
        public static void redirectLogStreams() {
        System.out.close();
        System.setOut(new AndroidPrintStream(Log.INFO, "System.out"));
        System.err.close();
        System.setErr(new AndroidPrintStream(Log.WARN, "System.err"));
    }

    
        public static final void zygoteInitNative() {
    }

    
        public static final int isComputerOn() {
        return DSUtils.UNKNOWN_INT;
    }

    
        public static final void turnComputerOn() {
    }

    
        public static int getQwertyKeyboard() {
        return DSUtils.UNKNOWN_INT;
    }

    
        public static void wtf(String tag, Throwable t) {
        try {
            if (ActivityManagerNative.getDefault().handleApplicationWtf(
                    mApplicationObject, tag, new ApplicationErrorReport.CrashInfo(t))) {
                Process.killProcess(Process.myPid());
                System.exit(10);
            }
        } catch (Throwable t2) {
            Slog.e(TAG, "Error reporting WTF", t2);
        }
    }

    
        public static final void setApplicationObject(IBinder app) {
        mApplicationObject = app;
    }

    
        public static final IBinder getApplicationObject() {
        return mApplicationObject;
    }

    
    private static class UncaughtHandler implements Thread.UncaughtExceptionHandler {
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:13.995 -0400", hash_original_method = "DEBC568C3CCF1424A96EDBFCCD0328BF", hash_generated_method = "DEBC568C3CCF1424A96EDBFCCD0328BF")
        public UncaughtHandler ()
        {
            //Synthesized constructor
        }


        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:14.012 -0400", hash_original_method = "498D7614C18F40B02B7387DE4641DDCF", hash_generated_method = "A98996ADEDBCAA208467608BF438E4F2")
        public void uncaughtException(Thread t, Throwable e) {
            try 
            {
                mCrashing = true;
                ActivityManagerNative.getDefault().handleApplicationCrash(
                        mApplicationObject, new ApplicationErrorReport.CrashInfo(e));
            } //End block
            catch (Throwable t2)
            { }
            finally 
            {
                Process.killProcess(Process.myPid());
                System.exit(10);
            } //End block
            addTaint(t.getTaint());
            addTaint(e.getTaint());
            // ---------- Original Method ----------
            // Original Method Too Long, Refer to Original Implementation
        }

        
    }


    
    static class Arguments {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:14.077 -0400", hash_original_field = "5FB52C4DFFDBD9F9BAD0FDF89CA414E2", hash_generated_field = "54F1E4F701E6BC5080DD319C8D10B220")

        String startClass;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:14.077 -0400", hash_original_field = "CC8D290819A005A96D012B30D48D8B94", hash_generated_field = "711B2441164D898E55743AC3E8A55306")

        String[] startArgs;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:14.077 -0400", hash_original_method = "35BDC5101A4DE38616FDCE6EF4D8CA10", hash_generated_method = "93727DD36372CF1A291DAD9D71E1FF73")
          Arguments(String args[]) throws IllegalArgumentException {
            parseArgs(args);
            addTaint(args.getTaint());
            // ---------- Original Method ----------
            //parseArgs(args);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:14.078 -0400", hash_original_method = "8231389587D8A1396F36A075174F3D3F", hash_generated_method = "E68AFD5EE8FCCA20F69AABFD0E7C164B")
        private void parseArgs(String args[]) throws IllegalArgumentException {
            int curArg;
            curArg = 0;
            {
                String arg;
                arg = args[curArg];
                {
                    boolean var566DD555814D764ED9A29C42F8874316_1633845367 = (arg.equals("--"));
                    {
                        boolean var8DF5AAC12FA4329A4CC6BF5AA3E9BEE4_920587246 = (!arg.startsWith("--"));
                    } //End collapsed parenthetic
                } //End collapsed parenthetic
            } //End block
            {
                if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Missing classname argument to RuntimeInit!");
            } //End block
            startClass = args[curArg++];
            startArgs = new String[args.length - curArg];
            System.arraycopy(args, curArg, startArgs, 0, startArgs.length);
            // ---------- Original Method ----------
            //int curArg = 0;
            //for (; curArg < args.length; curArg++) {
                //String arg = args[curArg];
                //if (arg.equals("--")) {
                    //curArg++;
                    //break;
                //} else if (!arg.startsWith("--")) {
                    //break;
                //}
            //}
            //if (curArg == args.length) {
                //throw new IllegalArgumentException("Missing classname argument to RuntimeInit!");
            //}
            //startClass = args[curArg++];
            //startArgs = new String[args.length - curArg];
            //System.arraycopy(args, curArg, startArgs, 0, startArgs.length);
        }

        
    }


    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:14.078 -0400", hash_original_field = "F88265C21754A18C5BC383814994D78A", hash_generated_field = "5EE5B1AF8151F27122B430818DCB5757")

    private static String TAG = "AndroidRuntime";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:14.078 -0400", hash_original_field = "021906CCEC815FC820B74F760E7368C7", hash_generated_field = "E83DF1E2E661A92B1AFDA8C473D190B2")

    private static boolean DEBUG = false;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:14.078 -0400", hash_original_field = "84D10A1ED612E61DBF6880F6E3EE533A", hash_generated_field = "9FD51B35B9E2224AA107F59D57389A34")

    private static boolean initialized;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:14.078 -0400", hash_original_field = "777B24D90C777256AC6D770CED6B0E76", hash_generated_field = "254F062FB27979B6C2E631565CC9502B")

    private static IBinder mApplicationObject;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:14.078 -0400", hash_original_field = "2C716F2860097FF2151CEBE01C614E86", hash_generated_field = "7061173743FAA271B75796C94B51B8DD")

    private static volatile boolean mCrashing = false;
    static {
        android.ddm.DdmRegister.registerHandlers();
    }
    
}

