package java.security;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.Serializable;
import java.security.cert.CertPath;
import java.util.Date;

public final class Timestamp implements Serializable {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:46.622 -0400", hash_original_field = "D7E6D55BA379A13D08C25D15FAF2A23B", hash_generated_field = "19EEE56AC3C62FACD5625A14E692FA43")

    private Date timestamp;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:46.623 -0400", hash_original_field = "6E0FA7FC9CEF8E5B39B9BB28B636A6B5", hash_generated_field = "FC883EA50AB2FDD2C3073E407E6CEA66")

    private CertPath signerCertPath;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:46.623 -0400", hash_original_field = "0800FC577294C34E0B28AD2839435945", hash_generated_field = "0316D82713F1CE4A6BE9BC97E8C831C1")

    private transient int hash;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:46.624 -0400", hash_original_method = "AAE6CDDCBB2AA770835AE5337F9257E2", hash_generated_method = "C4CF743D8DABB29EAB8D05602EE01023")
    public  Timestamp(Date timestamp, CertPath signerCertPath) {
        {
            if (DroidSafeAndroidRuntime.control) throw new NullPointerException("timestamp == null");
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw new NullPointerException("signerCertPath == null");
        } //End block
        this.timestamp = new Date(timestamp.getTime());
        this.signerCertPath = signerCertPath;
        // ---------- Original Method ----------
        //if (timestamp == null) {
            //throw new NullPointerException("timestamp == null");
        //}
        //if (signerCertPath == null) {
            //throw new NullPointerException("signerCertPath == null");
        //}
        //this.timestamp = new Date(timestamp.getTime());
        //this.signerCertPath = signerCertPath;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:46.642 -0400", hash_original_method = "5EC26C09389FD151E3B15C0B386F0A3D", hash_generated_method = "0C92312794D9035CBDFB890EFE1DA5B6")
    @Override
    public boolean equals(Object obj) {
        {
            boolean var8D1D3E5F4C020ED4FA594AED365B4BD8_2116985834 = (obj == this);
        } //End collapsed parenthetic
        {
            Timestamp that;
            that = (Timestamp) obj;
            boolean var2709CFC34CE811BA8682DC086775E595_1608874160 = (timestamp.equals(that.timestamp)
                    && signerCertPath.equals(that.signerCertPath));
        } //End block
        addTaint(obj.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_948712033 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_948712033;
        // ---------- Original Method ----------
        //if (obj == this) {
            //return true;
        //}
        //if (obj instanceof Timestamp) {
            //Timestamp that = (Timestamp) obj;
            //return timestamp.equals(that.timestamp)
                    //&& signerCertPath.equals(that.signerCertPath);
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:46.642 -0400", hash_original_method = "30F2DDB76579221F80A186A0F4D6B0C1", hash_generated_method = "E40C87E0EC810858696573ED72362AE2")
    public CertPath getSignerCertPath() {
        CertPath varB4EAC82CA7396A68D541C85D26508E83_1667682249 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1667682249 = signerCertPath;
        varB4EAC82CA7396A68D541C85D26508E83_1667682249.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1667682249;
        // ---------- Original Method ----------
        //return signerCertPath;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:46.643 -0400", hash_original_method = "9F5E9DF58C2165A57C2B03C2ABFACB32", hash_generated_method = "ECA0FA79231B9DF389E568F7912A3334")
    public Date getTimestamp() {
        Date varB4EAC82CA7396A68D541C85D26508E83_102155582 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_102155582 = (Date) timestamp.clone();
        varB4EAC82CA7396A68D541C85D26508E83_102155582.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_102155582;
        // ---------- Original Method ----------
        //return (Date) timestamp.clone();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:46.643 -0400", hash_original_method = "31DF5B7E8A0074E9903AAC481766C16B", hash_generated_method = "13D19D9B8C3CEE7321E3175DF5F3E5E5")
    @Override
    public int hashCode() {
        {
            hash = timestamp.hashCode() ^ signerCertPath.hashCode();
        } //End block
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_148526009 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_148526009;
        // ---------- Original Method ----------
        //if (hash == 0) {
            //hash = timestamp.hashCode() ^ signerCertPath.hashCode();
        //}
        //return hash;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:46.644 -0400", hash_original_method = "515CC78E7249E5726FD47C9B8B62F1A0", hash_generated_method = "5F7FA7127E00D5524844BD9623D70BB1")
    @Override
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_1647965015 = null; //Variable for return #1
        StringBuilder buf;
        buf = new StringBuilder(256);
        buf.append("Timestamp [").append(timestamp).append(" certPath=");
        buf.append(signerCertPath.getCertificates().get(0)).append("]");
        varB4EAC82CA7396A68D541C85D26508E83_1647965015 = buf.toString();
        varB4EAC82CA7396A68D541C85D26508E83_1647965015.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1647965015;
        // ---------- Original Method ----------
        //StringBuilder buf = new StringBuilder(256);
        //buf.append("Timestamp [").append(timestamp).append(" certPath=");
        //buf.append(signerCertPath.getCertificates().get(0)).append("]");
        //return buf.toString();
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:46.644 -0400", hash_original_field = "B3E56E4CB108BFE836E4A5A57F75FAC2", hash_generated_field = "5D1DE4072790A67BC7E94709725B3580")

    private static long serialVersionUID = -5502683707821851294L;
}

