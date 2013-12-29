package gov.nist.javax.sip.header.ims;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import javax.sip.address.URI;
import javax.sip.header.Header;
import javax.sip.header.HeaderAddress;
import javax.sip.header.Parameters;

public interface PAssociatedURIHeader
    extends HeaderAddress, Parameters, Header
{

    
    public final static String NAME = "P-Associated-URI";


    
    public void setAssociatedURI(URI associatedURI) throws NullPointerException;

    
    public URI getAssociatedURI();

    
    




}
