package dalvik.system;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import java.io.File;





import droidsafe.helpers.DSUtils;

public class Zygote {

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:43.935 -0500", hash_original_method = "48FA3E87F3B01C5B7451B6F18816C44C", hash_generated_method = "ADA12113D5D8110B14919D9438E16B6D")
    private static void preFork() {
        Daemons.stop();
        waitUntilAllThreadsStopped();
    }

    /**
     * We must not fork until we're single-threaded again. Wait until /proc shows we're
     * down to just one thread.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:43.935 -0500", hash_original_method = "E907105D6B58D9053A1938DE7DF89ED1", hash_generated_method = "9FCEF8C8DF6D21C2526B583BB43BE6DA")
    private static void waitUntilAllThreadsStopped() {
        File tasks = new File("/proc/self/task");
        while (tasks.list().length > 1) {
            try {
                // Experimentally, booting and playing about with a stingray, I never saw us
                // go round this loop more than once with a 10ms sleep.
                Thread.sleep(10);
            } catch (InterruptedException ignored) {
            }
        }
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:43.936 -0500", hash_original_method = "A79881836E3F6AC14C6223324389064A", hash_generated_method = "2A8FB1CE86DFF5A8312306EAA5D4DFAF")
    private static void postFork() {
        Daemons.start();
    }

    /**
     * Forks a new Zygote instance, but does not leave the zygote mode.
     * The current VM must have been started with the -Xzygote flag. The
     * new child is expected to eventually call forkAndSpecialize()
     *
     * @return 0 if this is the child, pid of the child
     * if this is the parent, or -1 on error
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:43.937 -0500", hash_original_method = "5F71AEAFC7DD0E06D31189B8E9285CCC", hash_generated_method = "8CCB824803E59AD7B5D63B6370F27795")
    public static int fork() {
        preFork();
        int pid = nativeFork();
        postFork();
        return pid;
    }

    
    @DSModeled(DSC.SAFE)
    public static int nativeFork() {
        return DSUtils.UNKNOWN_INT;
    }

    /**
     * Forks a new VM instance.  The current VM must have been started
     * with the -Xzygote flag. <b>NOTE: new instance keeps all
     * root capabilities. The new process is expected to call capset()</b>.
     *
     * @param uid the UNIX uid that the new process should setuid() to after
     * fork()ing and and before spawning any threads.
     * @param gid the UNIX gid that the new process should setgid() to after
     * fork()ing and and before spawning any threads.
     * @param gids null-ok; a list of UNIX gids that the new process should
     * setgroups() to after fork and before spawning any threads.
     * @param debugFlags bit flags that enable debugging features.
     * @param rlimits null-ok an array of rlimit tuples, with the second
     * dimension having a length of 3 and representing
     * (resource, rlim_cur, rlim_max). These are set via the posix
     * setrlimit(2) call.
     *
     * @return 0 if this is the child, pid of the child
     * if this is the parent, or -1 on error.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:43.939 -0500", hash_original_method = "167631196A2C66990E7F61BE07899D2B", hash_generated_method = "C6783A608B0F532475DDA84D780EA823")
    public static int forkAndSpecialize(int uid, int gid, int[] gids,
            int debugFlags, int[][] rlimits) {
        preFork();
        int pid = nativeForkAndSpecialize(uid, gid, gids, debugFlags, rlimits);
        postFork();
        return pid;
    }

    
    @DSModeled(DSC.BAN)
    public static int nativeForkAndSpecialize(int uid, int gid,
            int[] gids, int debugFlags, int[][] rlimits) {
        return DSUtils.UNKNOWN_INT;
    }

    /**
     * Forks a new VM instance.
     * @deprecated use {@link Zygote#forkAndSpecialize(int, int, int[], int, int[][])}
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:43.942 -0500", hash_original_method = "911AB9C595BBE3DEF39975B1C146C2FC", hash_generated_method = "070660DD5CE59C01FA4AEB53FF32B37A")
    @Deprecated
public static int forkAndSpecialize(int uid, int gid, int[] gids,
            boolean enableDebugger, int[][] rlimits) {
        int debugFlags = enableDebugger ? DEBUG_ENABLE_DEBUGGER : 0;
        return forkAndSpecialize(uid, gid, gids, debugFlags, rlimits);
    }

    /**
     * Special method to start the system server process. In addition to the
     * common actions performed in forkAndSpecialize, the pid of the child
     * process is recorded such that the death of the child process will cause
     * zygote to exit.
     *
     * @param uid the UNIX uid that the new process should setuid() to after
     * fork()ing and and before spawning any threads.
     * @param gid the UNIX gid that the new process should setgid() to after
     * fork()ing and and before spawning any threads.
     * @param gids null-ok; a list of UNIX gids that the new process should
     * setgroups() to after fork and before spawning any threads.
     * @param debugFlags bit flags that enable debugging features.
     * @param rlimits null-ok an array of rlimit tuples, with the second
     * dimension having a length of 3 and representing
     * (resource, rlim_cur, rlim_max). These are set via the posix
     * setrlimit(2) call.
     * @param permittedCapabilities argument for setcap()
     * @param effectiveCapabilities argument for setcap()
     *
     * @return 0 if this is the child, pid of the child
     * if this is the parent, or -1 on error.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:43.942 -0500", hash_original_method = "11B9FD6CF8A852954DB9868CF618C4FB", hash_generated_method = "5637AF34F74A18AB5F4962975C9CF687")
    public static int forkSystemServer(int uid, int gid, int[] gids,
            int debugFlags, int[][] rlimits,
            long permittedCapabilities, long effectiveCapabilities) {
        preFork();
        int pid = nativeForkSystemServer(uid, gid, gids, debugFlags, rlimits,
                                         permittedCapabilities,
                                         effectiveCapabilities);
        postFork();
        return pid;
    }

    /**
     * Special method to start the system server process.
     * @deprecated use {@link Zygote#forkSystemServer(int, int, int[], int, int[][])}
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:43.943 -0500", hash_original_method = "824CBDF635DB37660DCC074284E4485A", hash_generated_method = "222C6F00DD65DEEC71A0E0FB0975E7EE")
    @Deprecated
public static int forkSystemServer(int uid, int gid, int[] gids,
            boolean enableDebugger, int[][] rlimits) {
        int debugFlags = enableDebugger ? DEBUG_ENABLE_DEBUGGER : 0;
        return forkAndSpecialize(uid, gid, gids, debugFlags, rlimits);
    }

    
    @DSModeled(DSC.BAN)
    public static int nativeForkSystemServer(int uid, int gid,
            int[] gids, int debugFlags, int[][] rlimits,
            long permittedCapabilities, long effectiveCapabilities) {
        return DSUtils.UNKNOWN_INT;
    }

    /**
     * Executes "/system/bin/sh -c &lt;command&gt;" using the exec() system call.
     * This method never returns.
     *
     * @param command The shell command to execute.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:43.946 -0500", hash_original_method = "4E298BD73CB3CE4838A0E376A85EE2C2", hash_generated_method = "9F8B92C222B5ED89131795F1C9479C84")
    public static void execShell(String command) {
        nativeExecShell(command);
    }

    /**
     * Appends quotes shell arguments to the specified string builder.
     * The arguments are quoted using single-quotes, escaped if necessary,
     * prefixed with a space, and appended to the command.
     *
     * @param command A string builder for the shell command being constructed.
     * @param args An array of argument strings to be quoted and appended to the command.
     * @see #execShell(String)
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:43.947 -0500", hash_original_method = "1725E87F4919C96ACB03BE0E2182C74B", hash_generated_method = "90C5B29A4950490C67CE08A54E835D64")
    public static void appendQuotedShellArgs(StringBuilder command, String[] args) {
        for (String arg : args) {
            command.append(" '").append(arg.replace("'", "'\\''")).append("'");
        }
    }

    
    @DSModeled(DSC.SAFE)
    private static void nativeExecShell(String command) {
    }
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:43.928 -0500", hash_original_field = "A21A7AB1279FC9EE4ADB7753815CF78F", hash_generated_field = "3C082D15F14125569237697FB7CFFEB4")

    /** enable debugging over JDWP */
    public static final int DEBUG_ENABLE_DEBUGGER   = 1;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:43.929 -0500", hash_original_field = "B9EFE928ECFE71E5602B11162FEAEC18", hash_generated_field = "EEAFD51BAD32654E04639ACFF5839374")

    public static final int DEBUG_ENABLE_CHECKJNI   = 1 << 1;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:43.930 -0500", hash_original_field = "0848BD0D182D875831988F94D43D1532", hash_generated_field = "0ACA4785FA848463023739816DE1A5F6")

    public static final int DEBUG_ENABLE_ASSERT     = 1 << 2;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:43.931 -0500", hash_original_field = "35256C5373C2960A6E0873CFAB973E6C", hash_generated_field = "8594DF714AE9156F640CE5A4596EF5BA")

    public static final int DEBUG_ENABLE_SAFEMODE   = 1 << 3;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:43.932 -0500", hash_original_field = "BE42CACB52E5CD159552A14E6481331C", hash_generated_field = "DE5D45FDEDBAB0F663B24A18EC2B810F")

    public static final int DEBUG_ENABLE_JNI_LOGGING = 1 << 4;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:43.933 -0500", hash_original_field = "FE4F78311BA9408ABAC0100A52FF5ECD", hash_generated_field = "570F80464594D1C85487F9B8B7117AD9")

    public static boolean systemInSafeMode = false;

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:43.934 -0500", hash_original_method = "571209F1E0BFAC649B933D0F6DC3BC96", hash_generated_method = "56FC9AAA080079361AC478620488538B")
    private Zygote() {}
}

