package android.graphics;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;




import droidsafe.helpers.DSUtils;

public class PorterDuffXfermode extends Xfermode {

    
    @DSModeled(DSC.SAFE)
    private static int nativeCreateXfermode(int mode) {
        return DSUtils.UNKNOWN_INT;
    }
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:56.831 -0500", hash_original_field = "0EEBD768349295274478FE908D38E6AA", hash_generated_field = "698BE6610509E128DA164E335568BD09")

    public  PorterDuff.Mode mode;

    /**
     * Create an xfermode that uses the specified porter-duff mode.
     *
     * @param mode           The porter-duff mode that is applied
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:56.832 -0500", hash_original_method = "051BEADE6290B35325837FC3FD526210", hash_generated_method = "A560E9C179CDEB0D924A8EF4EB359738")
    public PorterDuffXfermode(PorterDuff.Mode mode) {
        this.mode = mode;
        native_instance = nativeCreateXfermode(mode.nativeInt);
    }

    
}

