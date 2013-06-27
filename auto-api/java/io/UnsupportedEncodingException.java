package java.io;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;

public class UnsupportedEncodingException extends IOException {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:38.963 -0400", hash_original_method = "120B741722292072F71D190D9178D3DA", hash_generated_method = "7FBF0CFE4EECE294CF78ED69B3643DFF")
    public  UnsupportedEncodingException() {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:38.964 -0400", hash_original_method = "94DA8264158047F6F5B3A7DFC24D11B0", hash_generated_method = "0C997B919FD30A9E9D895FCD884B43F6")
    public  UnsupportedEncodingException(String detailMessage) {
        super(detailMessage);
        addTaint(detailMessage.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:38.964 -0400", hash_original_field = "AA19BCE7DAF08795CB7BF15D0EE6CC3A", hash_generated_field = "C0BA3C33C794A34151E96B2DB3B69B4A")

    private static long serialVersionUID = -4274276298326136670L;
}

