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

public class DecelerateInterpolator implements Interpolator {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.561 -0400", hash_original_field = "7DECF88C2827213B3E7BC0566F9E08CD", hash_generated_field = "A4F5427DC6C0D3BD86B003B9F84706BC")

    private float mFactor = 1.0f;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.566 -0400", hash_original_method = "E95CC471518E4ACA9BF79FBE17893E65", hash_generated_method = "5083D8CB9C8622A55E9438CFA2C111F7")
    public  DecelerateInterpolator() {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.581 -0400", hash_original_method = "FDF29E6FEED3439F4AD5C9E93301F45A", hash_generated_method = "0F557EA38EE80DBBE69721BB20DCF311")
    public  DecelerateInterpolator(float factor) {
        mFactor = factor;
        // ---------- Original Method ----------
        //mFactor = factor;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.581 -0400", hash_original_method = "B4A81760BCCD97E1721CC54FAD915070", hash_generated_method = "2F9EB6B2EDB8F0590C77F75321DD2C37")
    public  DecelerateInterpolator(Context context, AttributeSet attrs) {
        TypedArray a;
        a = context.obtainStyledAttributes(attrs, com.android.internal.R.styleable.DecelerateInterpolator);
        mFactor = a.getFloat(com.android.internal.R.styleable.DecelerateInterpolator_factor, 1.0f);
        a.recycle();
        addTaint(context.getTaint());
        addTaint(attrs.getTaint());
        // ---------- Original Method ----------
        //TypedArray a =
            //context.obtainStyledAttributes(attrs, com.android.internal.R.styleable.DecelerateInterpolator);
        //mFactor = a.getFloat(com.android.internal.R.styleable.DecelerateInterpolator_factor, 1.0f);
        //a.recycle();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.582 -0400", hash_original_method = "53C85C7631357B3680FF88D2085C3BF7", hash_generated_method = "C41BC93D83B4EDA17C42161855E443DC")
    public float getInterpolation(float input) {
        float result;
        {
            result = (float)(1.0f - (1.0f - input) * (1.0f - input));
        } //End block
        {
            result = (float)(1.0f - Math.pow((1.0f - input), 2 * mFactor));
        } //End block
        addTaint(input);
        float var546ADE640B6EDFBC8A086EF31347E768_1278031253 = getTaintFloat();
        return var546ADE640B6EDFBC8A086EF31347E768_1278031253;
        // ---------- Original Method ----------
        //float result;
        //if (mFactor == 1.0f) {
            //result = (float)(1.0f - (1.0f - input) * (1.0f - input));
        //} else {
            //result = (float)(1.0f - Math.pow((1.0f - input), 2 * mFactor));
        //}
        //return result;
    }

    
}

