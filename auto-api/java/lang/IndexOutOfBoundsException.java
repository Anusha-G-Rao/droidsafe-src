package java.lang;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;

public class IndexOutOfBoundsException extends RuntimeException {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:39.786 -0400", hash_original_method = "D4CD8ADEE84F45A3C2932250B7EFAD5E", hash_generated_method = "21F705B9E81BD76361B6BB1EE50EEEC3")
    public  IndexOutOfBoundsException() {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:39.786 -0400", hash_original_method = "43F047B4ECB1C9194E62BC668739E967", hash_generated_method = "EFB4BD9A2A5EEB126591B4F73F003DC9")
    public  IndexOutOfBoundsException(String detailMessage) {
        super(detailMessage);
        addTaint(detailMessage.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:39.786 -0400", hash_original_field = "41FBF03317C826A6604F3CF2E773984A", hash_generated_field = "A5A5F78A1B7DC431E4A33130BB258340")

    private static long serialVersionUID = 234122996006267687L;
}

