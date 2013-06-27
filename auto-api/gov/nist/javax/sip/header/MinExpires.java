package gov.nist.javax.sip.header;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import javax.sip.*;
import javax.sip.header.*;

public class MinExpires extends SIPHeader implements MinExpiresHeader {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:31.127 -0400", hash_original_field = "09BCB72D61C0D6D1EFF5336DA6881557", hash_generated_field = "E191433B1529B42724890251971016B1")

    protected int expires;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:31.128 -0400", hash_original_method = "E220E899B716906991999B2A4C081552", hash_generated_method = "CD25F29B29CDBECA1004AA69954293B5")
    public  MinExpires() {
        super(NAME);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:31.135 -0400", hash_original_method = "D42EEF06048E7D77F00EA781D2005D33", hash_generated_method = "6994B44A500EEFACD5B29F369594E71D")
    public String encodeBody() {
        String varB4EAC82CA7396A68D541C85D26508E83_466090318 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_466090318 = Integer.toString(expires);
        varB4EAC82CA7396A68D541C85D26508E83_466090318.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_466090318;
        // ---------- Original Method ----------
        //return Integer.toString(expires);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:31.135 -0400", hash_original_method = "47881175D7C463BCCB25030D767AD658", hash_generated_method = "F14F9CDBC902BC69596943464CA55080")
    public int getExpires() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_528828002 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_528828002;
        // ---------- Original Method ----------
        //return expires;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:31.136 -0400", hash_original_method = "A313D6724829247498596D0326F894CE", hash_generated_method = "1F94C2B6C4EFAB2003C10C5168D24F2A")
    public void setExpires(int expires) throws InvalidArgumentException {
        if (DroidSafeAndroidRuntime.control) throw new InvalidArgumentException("bad argument " + expires);
        this.expires = expires;
        // ---------- Original Method ----------
        //if (expires < 0)
            //throw new InvalidArgumentException("bad argument " + expires);
        //this.expires = expires;
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:31.137 -0400", hash_original_field = "D2AF3D0B8A0546A777A14BAF32F484A1", hash_generated_field = "9854615A27580BCC76F59F21A566B503")

    private static long serialVersionUID = 7001828209606095801L;
}

