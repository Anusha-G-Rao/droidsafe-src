package java.net;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.IOException;

public class SocketException extends IOException {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:42.938 -0400", hash_original_method = "6370438F3E8FDAC390DBF5D95BB547E6", hash_generated_method = "16218E158583D4A8A5981F4E73EFCDEB")
    public  SocketException() {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:42.938 -0400", hash_original_method = "1136B1CF147D460660A0A79DDF1D5C0A", hash_generated_method = "DDE67733509D1360C97AF4D957306CA5")
    public  SocketException(String detailMessage) {
        super(detailMessage);
        addTaint(detailMessage.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:42.938 -0400", hash_original_method = "001E874571014D08FBFC41C7A23D02C6", hash_generated_method = "DE0A9D899FEC1F14602A6840D8DD9661")
    public  SocketException(Throwable cause) {
        super(cause);
        addTaint(cause.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:42.939 -0400", hash_original_method = "1ACC59770DF5E02FD5C6C8AE56F288AE", hash_generated_method = "48309C585500C2B9D5BE93BC1B3CE470")
    public  SocketException(String detailMessage, Throwable cause) {
        super(detailMessage, cause);
        addTaint(detailMessage.getTaint());
        addTaint(cause.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:42.939 -0400", hash_original_field = "94B8E3B7316984B68B929FD795C024C5", hash_generated_field = "E55CAD01A829BAF5E74BCAC20E9C02E9")

    private static long serialVersionUID = -5935874303556886934L;
}

