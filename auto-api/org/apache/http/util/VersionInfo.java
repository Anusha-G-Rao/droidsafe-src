package org.apache.http.util;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;
import java.util.ArrayList;

public class VersionInfo {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:18.671 -0400", hash_original_field = "5DC10C942C376F4D917341A8F6F35478", hash_generated_field = "B4EE0AE6CDFC7729E2DF3959619B27C8")

    private String infoPackage;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:18.671 -0400", hash_original_field = "BA892CFE0935336DF5E973F2BE5269FA", hash_generated_field = "7870583402D1236432A6F7D41D68C373")

    private String infoModule;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:18.671 -0400", hash_original_field = "2AC10596AA95DD9C7AED402610900006", hash_generated_field = "74D9C07996ADE3E83000645DFD186109")

    private String infoRelease;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:18.671 -0400", hash_original_field = "DFF8EFAF20F67E9BD2E5C73ED9544E0C", hash_generated_field = "EA392AC69F638BDF62EBE0A6225718A4")

    private String infoTimestamp;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:18.671 -0400", hash_original_field = "5215DDB0C971D4489020CDF1892A02D4", hash_generated_field = "CFCBDAB909290EB8EDE48215C3716785")

    private String infoClassloader;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:18.675 -0400", hash_original_method = "A021B9E0131A2ECDBAD4FC090EED8BCD", hash_generated_method = "E3976DDD11E594E7C8863065F3927FCE")
    protected  VersionInfo(String pckg, String module,
                          String release, String time, String clsldr) {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException
                ("Package identifier must not be null.");
        } //End block
        infoPackage     = pckg;
        infoModule      = (module  != null) ? module  : UNAVAILABLE;
        infoRelease     = (release != null) ? release : UNAVAILABLE;
        infoTimestamp   = (time    != null) ? time    : UNAVAILABLE;
        infoClassloader = (clsldr  != null) ? clsldr  : UNAVAILABLE;
        // ---------- Original Method ----------
        //if (pckg == null) {
            //throw new IllegalArgumentException
                //("Package identifier must not be null.");
        //}
        //infoPackage     = pckg;
        //infoModule      = (module  != null) ? module  : UNAVAILABLE;
        //infoRelease     = (release != null) ? release : UNAVAILABLE;
        //infoTimestamp   = (time    != null) ? time    : UNAVAILABLE;
        //infoClassloader = (clsldr  != null) ? clsldr  : UNAVAILABLE;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:18.676 -0400", hash_original_method = "252EB5EFBA4DF288F0FE3B9299593BCD", hash_generated_method = "841900EB6307991DEFD9B3F511437F6B")
    public final String getPackage() {
        String varB4EAC82CA7396A68D541C85D26508E83_1184085640 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1184085640 = infoPackage;
        varB4EAC82CA7396A68D541C85D26508E83_1184085640.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1184085640;
        // ---------- Original Method ----------
        //return infoPackage;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:18.677 -0400", hash_original_method = "817D4ED1C3BFE1B9928E002CE96AD55A", hash_generated_method = "039B66DCC3D639916D30F00C9D75EA2C")
    public final String getModule() {
        String varB4EAC82CA7396A68D541C85D26508E83_2022074048 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_2022074048 = infoModule;
        varB4EAC82CA7396A68D541C85D26508E83_2022074048.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_2022074048;
        // ---------- Original Method ----------
        //return infoModule;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:18.678 -0400", hash_original_method = "DAD9A741167B359FF642D16AB5684AA5", hash_generated_method = "37C0AD6DF49CB5C6576D3FC698E23381")
    public final String getRelease() {
        String varB4EAC82CA7396A68D541C85D26508E83_1174051999 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1174051999 = infoRelease;
        varB4EAC82CA7396A68D541C85D26508E83_1174051999.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1174051999;
        // ---------- Original Method ----------
        //return infoRelease;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:18.680 -0400", hash_original_method = "02D289A8C155EDCB8F2FF743050BA3A2", hash_generated_method = "ABAE4C35994747E1E466DF7DD9204C6B")
    public final String getTimestamp() {
        String varB4EAC82CA7396A68D541C85D26508E83_2070240443 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_2070240443 = infoTimestamp;
        varB4EAC82CA7396A68D541C85D26508E83_2070240443.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_2070240443;
        // ---------- Original Method ----------
        //return infoTimestamp;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:18.681 -0400", hash_original_method = "8670EE78560EBB156BF6A930F22A1F67", hash_generated_method = "95F0411E84D8DF7ACDD46D2AC0608BFD")
    public final String getClassloader() {
        String varB4EAC82CA7396A68D541C85D26508E83_845246434 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_845246434 = infoClassloader;
        varB4EAC82CA7396A68D541C85D26508E83_845246434.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_845246434;
        // ---------- Original Method ----------
        //return infoClassloader;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:18.692 -0400", hash_original_method = "8C041823EF127A6F9DCC25E0329C5A09", hash_generated_method = "4A7BA95F810A5E964794E71E5473BD44")
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_1778419366 = null; //Variable for return #1
        StringBuffer sb;
        sb = new StringBuffer
            (20 + infoPackage.length() + infoModule.length() +
             infoRelease.length() + infoTimestamp.length() +
             infoClassloader.length());
        sb.append("VersionInfo(")
            .append(infoPackage).append(':').append(infoModule);
        {
            boolean var514BD655C0FA6241BB918401B549E56E_131064547 = (!UNAVAILABLE.equals(infoRelease));
            sb.append(':').append(infoRelease);
        } //End collapsed parenthetic
        {
            boolean var7C023AE448755372426520078BF7A721_1455248613 = (!UNAVAILABLE.equals(infoTimestamp));
            sb.append(':').append(infoTimestamp);
        } //End collapsed parenthetic
        sb.append(')');
        {
            boolean var80E19259195E1F3295F3716B59BD8F92_1379602455 = (!UNAVAILABLE.equals(infoClassloader));
            sb.append('@').append(infoClassloader);
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_1778419366 = sb.toString();
        varB4EAC82CA7396A68D541C85D26508E83_1778419366.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1778419366;
        // ---------- Original Method ----------
        //StringBuffer sb = new StringBuffer
            //(20 + infoPackage.length() + infoModule.length() +
             //infoRelease.length() + infoTimestamp.length() +
             //infoClassloader.length());
        //sb.append("VersionInfo(")
            //.append(infoPackage).append(':').append(infoModule);
        //if (!UNAVAILABLE.equals(infoRelease))
            //sb.append(':').append(infoRelease);
        //if (!UNAVAILABLE.equals(infoTimestamp))
            //sb.append(':').append(infoTimestamp);
        //sb.append(')');
        //if (!UNAVAILABLE.equals(infoClassloader))
            //sb.append('@').append(infoClassloader);
        //return sb.toString();
    }

    
        public final static VersionInfo[] loadVersionInfo(String[] pckgs,
                                                      ClassLoader clsldr) {
        if (pckgs == null) {
            throw new IllegalArgumentException
                ("Package identifier list must not be null.");
        }
        ArrayList vil = new ArrayList(pckgs.length);
        for (int i=0; i<pckgs.length; i++) {
            VersionInfo vi = loadVersionInfo(pckgs[i], clsldr);
            if (vi != null)
                vil.add(vi);
        }
        return (VersionInfo[]) vil.toArray(new VersionInfo[vil.size()]);
    }

    
        public final static VersionInfo loadVersionInfo(final String pckg,
                                                    ClassLoader clsldr) {
        if (pckg == null) {
            throw new IllegalArgumentException
                ("Package identifier must not be null.");
        }
        if (clsldr == null)
            clsldr = Thread.currentThread().getContextClassLoader();
        Properties vip = null;
        try {
            InputStream is = clsldr.getResourceAsStream
                (pckg.replace('.', '/') + "/" + VERSION_PROPERTY_FILE);
            if (is != null) {
                try {
                    Properties props = new Properties();
                    props.load(is);
                    vip = props;
                } finally {
                    is.close();
                }
            }
        } catch (IOException ex) {
        }
        VersionInfo result = null;
        if (vip != null)
            result = fromMap(pckg, vip, clsldr);
        return result;
    }

    
        protected final static VersionInfo fromMap(String pckg, Map info,
                                               ClassLoader clsldr) {
        if (pckg == null) {
            throw new IllegalArgumentException
                ("Package identifier must not be null.");
        }
        String module = null;
        String release = null;
        String timestamp = null;
        if (info != null) {
            module = (String) info.get(PROPERTY_MODULE);
            if ((module != null) && (module.length() < 1))
                module = null;
            release = (String) info.get(PROPERTY_RELEASE);
            if ((release != null) && ((release.length() < 1) ||
                                      (release.equals("${pom.version}"))))
                release = null;
            timestamp = (String) info.get(PROPERTY_TIMESTAMP);
            if ((timestamp != null) &&
                ((timestamp.length() < 1) ||
                 (timestamp.equals("${mvn.timestamp}")))
                )
                timestamp = null;
        }
        String clsldrstr = null;
        if (clsldr != null)
            clsldrstr = clsldr.toString();
        return new VersionInfo(pckg, module, release, timestamp, clsldrstr);
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:18.700 -0400", hash_original_field = "B635CCE0A40F8F1EE4521FA0D3E9716F", hash_generated_field = "AFAF2F28F05D4061200FCFA3487DA249")

    public final static String UNAVAILABLE = "UNAVAILABLE";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:18.701 -0400", hash_original_field = "446166058F7865810E09BA231EA6BF9E", hash_generated_field = "0594314A1812329E1C3DCDC2FB3A25A4")

    public final static String VERSION_PROPERTY_FILE = "version.properties";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:18.701 -0400", hash_original_field = "C927DA1220424C71483A16BF17C774F9", hash_generated_field = "41E29EFD75D15AF6B8FD255DC62C3536")

    public final static String PROPERTY_MODULE    = "info.module";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:18.701 -0400", hash_original_field = "B66B46FB202D1A4007396DF1D63969D1", hash_generated_field = "7651AC9A1406175E054F8B0C10C0345A")

    public final static String PROPERTY_RELEASE   = "info.release";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:18.701 -0400", hash_original_field = "68B251BEE81E9CE5B4D4EDF6103A1A40", hash_generated_field = "ADDFC93497C4D56A7904659C216B56D5")

    public final static String PROPERTY_TIMESTAMP = "info.timestamp";
}

