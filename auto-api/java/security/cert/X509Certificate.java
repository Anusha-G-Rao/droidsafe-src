package java.security.cert;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.Principal;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.security.auth.x500.X500Principal;

public abstract class X509Certificate extends Certificate implements X509Extension {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:46.978 -0400", hash_original_method = "91BE0E39C67CC71AFC40C5A05860BC17", hash_generated_method = "FA912E7D2076329B07D35CCC0B73CE9D")
    protected  X509Certificate() {
        super("X.509");
        // ---------- Original Method ----------
    }

    
    public abstract void checkValidity()
            throws CertificateExpiredException, CertificateNotYetValidException;

    
    public abstract void checkValidity(Date date)
            throws CertificateExpiredException, CertificateNotYetValidException;

    
    public abstract int getVersion();

    
    public abstract BigInteger getSerialNumber();

    
    public abstract Principal getIssuerDN() ;

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:46.997 -0400", hash_original_method = "622364792700CAE6EDC2CD40345CDB0C", hash_generated_method = "A7D5500F90F77D66CD4BD7AB31426B39")
    public X500Principal getIssuerX500Principal() {
        X500Principal varB4EAC82CA7396A68D541C85D26508E83_2775022 = null; //Variable for return #1
        try 
        {
            CertificateFactory factory;
            factory = CertificateFactory
                    .getInstance("X.509");
            X509Certificate cert;
            cert = (X509Certificate) factory
                    .generateCertificate(new ByteArrayInputStream(getEncoded()));
            varB4EAC82CA7396A68D541C85D26508E83_2775022 = cert.getIssuerX500Principal();
        } //End block
        catch (Exception e)
        {
            if (DroidSafeAndroidRuntime.control) throw new RuntimeException("Failed to get X500Principal issuer", e);
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_2775022.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_2775022;
        // ---------- Original Method ----------
        //try {
            //CertificateFactory factory = CertificateFactory
                    //.getInstance("X.509");
            //X509Certificate cert = (X509Certificate) factory
                    //.generateCertificate(new ByteArrayInputStream(getEncoded()));
            //return cert.getIssuerX500Principal();
        //} catch (Exception e) {
            //throw new RuntimeException("Failed to get X500Principal issuer", e);
        //}
    }

    
    public abstract Principal getSubjectDN();

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:46.999 -0400", hash_original_method = "4B536E889AC2F831879320061DB28B36", hash_generated_method = "1A745726D202B9BA392032F0A418ECEB")
    public X500Principal getSubjectX500Principal() {
        X500Principal varB4EAC82CA7396A68D541C85D26508E83_1062549498 = null; //Variable for return #1
        try 
        {
            CertificateFactory factory;
            factory = CertificateFactory
                    .getInstance("X.509");
            X509Certificate cert;
            cert = (X509Certificate) factory
                    .generateCertificate(new ByteArrayInputStream(getEncoded()));
            varB4EAC82CA7396A68D541C85D26508E83_1062549498 = cert.getSubjectX500Principal();
        } //End block
        catch (Exception e)
        {
            if (DroidSafeAndroidRuntime.control) throw new RuntimeException("Failed to get X500Principal subject", e);
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1062549498.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1062549498;
        // ---------- Original Method ----------
        //try {
            //CertificateFactory factory = CertificateFactory
                    //.getInstance("X.509");
            //X509Certificate cert = (X509Certificate) factory
                    //.generateCertificate(new ByteArrayInputStream(getEncoded()));
            //return cert.getSubjectX500Principal();
        //} catch (Exception e) {
            //throw new RuntimeException("Failed to get X500Principal subject", e);
        //}
    }

    
    public abstract Date getNotBefore();

    
    public abstract Date getNotAfter();

    
    public abstract byte[] getTBSCertificate()
                                    throws CertificateEncodingException;

    
    public abstract byte[] getSignature();

    
    public abstract String getSigAlgName();

    
    public abstract String getSigAlgOID();

    
    public abstract byte[] getSigAlgParams();

    
    public abstract boolean[] getIssuerUniqueID();

    
    public abstract boolean[] getSubjectUniqueID();

    
    public abstract boolean[] getKeyUsage();

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:47.016 -0400", hash_original_method = "418B9B73EF0BB9A94B6F38EF0D0811CB", hash_generated_method = "E835E19601A659C4F15229965B1FF557")
    public List<String> getExtendedKeyUsage() throws CertificateParsingException {
        List<String> varB4EAC82CA7396A68D541C85D26508E83_1679401415 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1679401415 = null;
        varB4EAC82CA7396A68D541C85D26508E83_1679401415.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1679401415;
        // ---------- Original Method ----------
        //return null;
    }

    
    public abstract int getBasicConstraints();

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:47.024 -0400", hash_original_method = "2F7FC96FA38F720B2ACF5452CA7F8BC4", hash_generated_method = "78F2DDE7643ADE27B400525DEC95719F")
    public Collection<List<?>> getSubjectAlternativeNames() throws CertificateParsingException {
        Collection<List<?>> varB4EAC82CA7396A68D541C85D26508E83_2065404091 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_2065404091 = null;
        varB4EAC82CA7396A68D541C85D26508E83_2065404091.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_2065404091;
        // ---------- Original Method ----------
        //return null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:47.025 -0400", hash_original_method = "274C80A4A7372477807793557A7E6C15", hash_generated_method = "5F3858B64E57789FD760BCD4B9DAA4C4")
    public Collection<List<?>> getIssuerAlternativeNames() throws CertificateParsingException {
        Collection<List<?>> varB4EAC82CA7396A68D541C85D26508E83_582197834 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_582197834 = null;
        varB4EAC82CA7396A68D541C85D26508E83_582197834.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_582197834;
        // ---------- Original Method ----------
        //return null;
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:47.025 -0400", hash_original_field = "739DB704D6A3CC6EBE6C2811360DFAF7", hash_generated_field = "78EFF382CBDDD165A15F1183F2B52D86")

    private static long serialVersionUID = -2491127588187038216L;
}

