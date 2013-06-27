package android.os;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.util.AndroidException;

public class RemoteException extends AndroidException {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:28.410 -0400", hash_original_method = "5634FE974275AC57C23528565D1940A5", hash_generated_method = "466007FF5A418054331F795B68538629")
    public  RemoteException() {
        super();
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:28.411 -0400", hash_original_method = "DEE27A1F58443ED534CF6DB1DEBB024B", hash_generated_method = "39A434E7824C2E9104D6F7F92AADF3C0")
    public  RemoteException(String message) {
        super(message);
        addTaint(message.getTaint());
        // ---------- Original Method ----------
    }

    
}

