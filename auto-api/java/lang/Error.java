package java.lang;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;

public class Error extends Throwable {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:39.635 -0400", hash_original_method = "7D5BF5C7538ED3BFC2F69913B33169E2", hash_generated_method = "E209531049EACBDCA8E9D86003B7419F")
    public  Error() {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:39.644 -0400", hash_original_method = "C6CAA4A4AF257044103CFF33D3E9FE9A", hash_generated_method = "BA6104F93DF7E632F3B99CCF2AB73EAF")
    public  Error(String detailMessage) {
        super(detailMessage);
        addTaint(detailMessage.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:39.644 -0400", hash_original_method = "66AA244741442CFF9E9D4A286C858491", hash_generated_method = "0D8F6B4C54C54A2CAA93D91D6C164849")
    public  Error(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
        addTaint(detailMessage.getTaint());
        addTaint(throwable.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:39.644 -0400", hash_original_method = "4F891171DD00932FF603BE77BF813093", hash_generated_method = "591CF6D45CBAB7010B583E4819898275")
    public  Error(Throwable throwable) {
        super(throwable);
        addTaint(throwable.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:39.644 -0400", hash_original_field = "AA057B31F5429D746265653A5C2D4BB1", hash_generated_field = "ACA103BDB2A70956F75DE7ECDCC208B8")

    private static long serialVersionUID = 4980196508277280342L;
}

