package java.security.cert;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import java.util.Set;

public interface X509Extension {

    
    public Set<String> getCriticalExtensionOIDs();

    
    public byte[] getExtensionValue(String oid);

    
    public Set<String> getNonCriticalExtensionOIDs();

    
    public boolean hasUnsupportedCriticalExtension();
}
