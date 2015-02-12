package com.android.layoutlib.bridge;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;
import android.view.Gravity;
public class MockView extends TextView {

    @DSSafe(DSCat.SAFE_OTHERS)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 13:00:08.270 -0500", hash_original_method = "754CE43714B2EA9ED234F73E3E58D74C", hash_generated_method = "0552A3C7E3A64D6625E4C229F580D12E")
    
public MockView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        setText(this.getClass().getSimpleName());
        setTextColor(0xFF000000);
        setGravity(Gravity.CENTER);
    }

    @DSSafe(DSCat.SAFE_LIST)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 13:00:08.272 -0500", hash_original_method = "B0CB306F2707837E390C5BAE5CE6A873", hash_generated_method = "CCA795E47FD5F2944969273254CEE3BC")
    
@Override
    public void onDraw(Canvas canvas) {
        canvas.drawARGB(0xFF, 0x7F, 0x7F, 0x7F);

        super.onDraw(canvas);
    }
    
}
