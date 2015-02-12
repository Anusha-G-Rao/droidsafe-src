package android.os;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import android.util.AndroidException;

public class RemoteException extends AndroidException {
    @DSComment("not sensitive/not an action")
    @DSSafe(DSCat.SAFE_OTHERS)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:33:42.169 -0500", hash_original_method = "5634FE974275AC57C23528565D1940A5", hash_generated_method = "3C58C92B1E8C14BB2A72ACFE9CAC413F")
    
public RemoteException() {
        super();
    }

    @DSSafe(DSCat.SAFE_OTHERS)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:33:42.172 -0500", hash_original_method = "DEE27A1F58443ED534CF6DB1DEBB024B", hash_generated_method = "2A817191D7257B6020578B2FF6544476")
    
public RemoteException(String message) {
        super(message);
    }
    
}
