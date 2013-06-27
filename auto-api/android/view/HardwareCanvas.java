package android.view;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

public abstract class HardwareCanvas extends Canvas {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:48.212 -0400", hash_original_method = "B9875B3DDCC23B593D0FCAB83616982C", hash_generated_method = "B9875B3DDCC23B593D0FCAB83616982C")
    public HardwareCanvas ()
    {
        //Synthesized constructor
    }


    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:48.213 -0400", hash_original_method = "BD882F06CCC6AC9974E10A9883BC45CA", hash_generated_method = "8C453C017E25E74AA9C5D162A1AFF335")
    @Override
    public boolean isHardwareAccelerated() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1680185994 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1680185994;
        // ---------- Original Method ----------
        //return true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:48.214 -0400", hash_original_method = "09BF352B013BE09D7407EC81EDFAD3C9", hash_generated_method = "BF1514EE48C976A7758AB254865300FC")
    @Override
    public void setBitmap(Bitmap bitmap) {
        if (DroidSafeAndroidRuntime.control) throw new UnsupportedOperationException();
        addTaint(bitmap.getTaint());
        // ---------- Original Method ----------
        //throw new UnsupportedOperationException();
    }

    
    abstract void onPreDraw(Rect dirty);

    
    abstract void onPostDraw();

    
    abstract boolean drawDisplayList(DisplayList displayList, int width, int height, Rect dirty);

    
    abstract void outputDisplayList(DisplayList displayList);

    
    abstract void drawHardwareLayer(HardwareLayer layer, float x, float y, Paint paint);

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:48.226 -0400", hash_original_method = "0FE8E55D6D4280D2FC5B882C82F13271", hash_generated_method = "68606C54B8C215A1C92F00F7FB07EA31")
    public boolean callDrawGLFunction(int drawGLFunction) {
        addTaint(drawGLFunction);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_429530344 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_429530344;
        // ---------- Original Method ----------
        //return false;
    }

    
}

