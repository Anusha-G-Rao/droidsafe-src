package javax.sip.header;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import java.text.ParseException;

public interface OrganizationHeader extends Header {
    String NAME = "Organization";

    String getOrganization();
    void setOrganization(String organization) throws ParseException;
}
