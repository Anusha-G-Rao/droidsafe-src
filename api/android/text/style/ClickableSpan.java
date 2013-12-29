package android.text.style;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import android.text.TextPaint;
import android.view.View;




public abstract class ClickableSpan extends CharacterStyle implements UpdateAppearance {
    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:39.954 -0400", hash_original_method = "779BDEA27573914565EB7FC3B293B826", hash_generated_method = "779BDEA27573914565EB7FC3B293B826")
    public ClickableSpan ()
    {
        //Synthesized constructor
    }

    /**
     * Performs the click action associated with this span.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:51.834 -0500", hash_original_method = "4553467B701B7D2A64C445DA132DB316", hash_generated_method = "56BD9F38BD46DB5803BBEE5C3975BA2C")
    public abstract void onClick(View widget);
   
    /**
     * Makes the text underlined and in the link color.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:51.835 -0500", hash_original_method = "6A446C4FD57B873C0000087B5918E9E8", hash_generated_method = "97B939C229540D035BC65804CEBBEA18")
    @Override
public void updateDrawState(TextPaint ds) {
        ds.setColor(ds.linkColor);
        ds.setUnderlineText(true);
    }

    
}

