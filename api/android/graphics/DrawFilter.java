package android.graphics;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;





public class DrawFilter {

    
    @DSModeled(DSC.SAFE)
    private static void nativeDestructor(int nativeDrawFilter) {
    }
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:35:39.379 -0500", hash_original_field = "7990335B7C7F3C24B77CFE6867E4212C", hash_generated_field = "BAEBD3AF3C580B730CE621E54F94F776")

    /* package */ int mNativeInt;
    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:10.204 -0400", hash_original_method = "6C5CDA0A99FCB0DEAFDD9ABA6ADEF22E", hash_generated_method = "6C5CDA0A99FCB0DEAFDD9ABA6ADEF22E")
    public DrawFilter ()
    {
        //Synthesized constructor
    }    // pointer to native object

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:56.545 -0500", hash_original_method = "AD4C46BBF7AD12904405D19E52AE287A", hash_generated_method = "FC07998296FA9FCE59C1BEA3D102AA9C")
    protected void finalize() throws Throwable {
        nativeDestructor(mNativeInt);
    }

    
}

