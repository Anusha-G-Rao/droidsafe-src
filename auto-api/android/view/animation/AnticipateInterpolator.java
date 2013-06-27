package android.view.animation;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public class AnticipateInterpolator implements Interpolator {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.503 -0400", hash_original_field = "BACCDDE44E4D1D72971417472395EF45", hash_generated_field = "D99941F5581612BAF56000DD0A59C563")

    private float mTension;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.504 -0400", hash_original_method = "7C2506D70A86643AB33B7796EA331F9D", hash_generated_method = "761E0AC6C5BE23250969F07445914E84")
    public  AnticipateInterpolator() {
        mTension = 2.0f;
        // ---------- Original Method ----------
        //mTension = 2.0f;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.504 -0400", hash_original_method = "9BAE6E66C77EF37188591BAA368F1B92", hash_generated_method = "41BB8ADF848B4D75A305C8076C5221D1")
    public  AnticipateInterpolator(float tension) {
        mTension = tension;
        // ---------- Original Method ----------
        //mTension = tension;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.504 -0400", hash_original_method = "82BFA8AC47DF9DDA6D8E3F7FE8B02F6B", hash_generated_method = "A374820FEA8D2787B8FA5A398F22DDA1")
    public  AnticipateInterpolator(Context context, AttributeSet attrs) {
        TypedArray a;
        a = context.obtainStyledAttributes(attrs,
                com.android.internal.R.styleable.AnticipateInterpolator);
        mTension =
                a.getFloat(com.android.internal.R.styleable.AnticipateInterpolator_tension, 2.0f);
        a.recycle();
        addTaint(context.getTaint());
        addTaint(attrs.getTaint());
        // ---------- Original Method ----------
        //TypedArray a = context.obtainStyledAttributes(attrs,
                //com.android.internal.R.styleable.AnticipateInterpolator);
        //mTension =
                //a.getFloat(com.android.internal.R.styleable.AnticipateInterpolator_tension, 2.0f);
        //a.recycle();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.505 -0400", hash_original_method = "708C87963D95E01AE56D23D7408FFDE5", hash_generated_method = "E0C2A4C69D2132D241CAF1C70EA33218")
    public float getInterpolation(float t) {
        addTaint(t);
        float var546ADE640B6EDFBC8A086EF31347E768_2102367766 = getTaintFloat();
        return var546ADE640B6EDFBC8A086EF31347E768_2102367766;
        // ---------- Original Method ----------
        //return t * t * ((mTension + 1) * t - mTension);
    }

    
}

