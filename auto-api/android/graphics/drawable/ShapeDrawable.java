package android.graphics.drawable;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.graphics.*;
import android.graphics.drawable.shapes.Shape;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;

public class ShapeDrawable extends Drawable {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.465 -0400", hash_original_field = "F650B6D51E8A0558B8CDC9DB09FD9330", hash_generated_field = "E775880DE66EC067EFB70E829A0DB9BA")

    private ShapeState mShapeState;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.466 -0400", hash_original_field = "9FB80C30383848C8D006680B5F3BDAF9", hash_generated_field = "5CA5A1EF3CAA45117BCACBC34EF05952")

    private boolean mMutated;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.483 -0400", hash_original_method = "0D9B9D363D3461B1F66ABDB4BD10ADF4", hash_generated_method = "F8142F9CA4A2ED9C1A4C2A61C668E2C1")
    public  ShapeDrawable() {
        this((ShapeState) null);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.483 -0400", hash_original_method = "F897BE84D7E0CD5527DF62F0C124D538", hash_generated_method = "50727A759836F61C98F8262C81B37DE0")
    public  ShapeDrawable(Shape s) {
        this((ShapeState) null);
        mShapeState.mShape = s;
        // ---------- Original Method ----------
        //mShapeState.mShape = s;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.484 -0400", hash_original_method = "1601A6C313758A231E2593A310142434", hash_generated_method = "BC1A7556F13C9F16471EEF9C585D7FC3")
    private  ShapeDrawable(ShapeState state) {
        mShapeState = new ShapeState(state);
        // ---------- Original Method ----------
        //mShapeState = new ShapeState(state);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.495 -0400", hash_original_method = "93DF953391DA58A2026A871408A81498", hash_generated_method = "09FAFC8A20134D853CC9F21F30F3583E")
    public Shape getShape() {
        Shape varB4EAC82CA7396A68D541C85D26508E83_443928412 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_443928412 = mShapeState.mShape;
        varB4EAC82CA7396A68D541C85D26508E83_443928412.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_443928412;
        // ---------- Original Method ----------
        //return mShapeState.mShape;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.499 -0400", hash_original_method = "91DE5C2C93AB9A1591999F92B24BB2F1", hash_generated_method = "333245D43C3894C20A8F2638360949CC")
    public void setShape(Shape s) {
        mShapeState.mShape = s;
        updateShape();
        // ---------- Original Method ----------
        //mShapeState.mShape = s;
        //updateShape();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.499 -0400", hash_original_method = "63480B19EB44379868D8321D7A96C7B7", hash_generated_method = "98C4B1E892C6B76796983BAC575AFE3D")
    public void setShaderFactory(ShaderFactory fact) {
        mShapeState.mShaderFactory = fact;
        // ---------- Original Method ----------
        //mShapeState.mShaderFactory = fact;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.503 -0400", hash_original_method = "E65D8AF971F17EDFF075456EB259C0A6", hash_generated_method = "DD3D59C8163CB7DF7051032CE55B0264")
    public ShaderFactory getShaderFactory() {
        ShaderFactory varB4EAC82CA7396A68D541C85D26508E83_2103533379 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_2103533379 = mShapeState.mShaderFactory;
        varB4EAC82CA7396A68D541C85D26508E83_2103533379.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_2103533379;
        // ---------- Original Method ----------
        //return mShapeState.mShaderFactory;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.515 -0400", hash_original_method = "F97BA42DC4507A8A136D2774D1D1BA0E", hash_generated_method = "1CCB3630EB5B71BDF125169E61765E00")
    public Paint getPaint() {
        Paint varB4EAC82CA7396A68D541C85D26508E83_1733943752 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1733943752 = mShapeState.mPaint;
        varB4EAC82CA7396A68D541C85D26508E83_1733943752.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1733943752;
        // ---------- Original Method ----------
        //return mShapeState.mPaint;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.519 -0400", hash_original_method = "B421F82679CD23EB7F3D507B70942FAD", hash_generated_method = "673EB58534CBA69C6F3917D50ED805DF")
    public void setPadding(int left, int top, int right, int bottom) {
        {
            mShapeState.mPadding = null;
        } //End block
        {
            {
                mShapeState.mPadding = new Rect();
            } //End block
            mShapeState.mPadding.set(left, top, right, bottom);
        } //End block
        invalidateSelf();
        addTaint(left);
        addTaint(top);
        addTaint(right);
        addTaint(bottom);
        // ---------- Original Method ----------
        //if ((left | top | right | bottom) == 0) {
            //mShapeState.mPadding = null;
        //} else {
            //if (mShapeState.mPadding == null) {
                //mShapeState.mPadding = new Rect();
            //}
            //mShapeState.mPadding.set(left, top, right, bottom);
        //}
        //invalidateSelf();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.540 -0400", hash_original_method = "416AA9F2AA0561BA0C5710C29E641860", hash_generated_method = "5F90EDCBFDA44F20F575472FA9049086")
    public void setPadding(Rect padding) {
        {
            mShapeState.mPadding = null;
        } //End block
        {
            {
                mShapeState.mPadding = new Rect();
            } //End block
            mShapeState.mPadding.set(padding);
        } //End block
        invalidateSelf();
        addTaint(padding.getTaint());
        // ---------- Original Method ----------
        //if (padding == null) {
            //mShapeState.mPadding = null;
        //} else {
            //if (mShapeState.mPadding == null) {
                //mShapeState.mPadding = new Rect();
            //}
            //mShapeState.mPadding.set(padding);
        //}
        //invalidateSelf();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.541 -0400", hash_original_method = "0038E10CC04EA446FBCFE7542F8A245A", hash_generated_method = "EF946B1AE5C472004D43406542B29B7C")
    public void setIntrinsicWidth(int width) {
        mShapeState.mIntrinsicWidth = width;
        invalidateSelf();
        // ---------- Original Method ----------
        //mShapeState.mIntrinsicWidth = width;
        //invalidateSelf();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.542 -0400", hash_original_method = "0D195260E9CE84B5EB7D22342052E56D", hash_generated_method = "E2059B6FDC44B6E7A4C61309E7061A2F")
    public void setIntrinsicHeight(int height) {
        mShapeState.mIntrinsicHeight = height;
        invalidateSelf();
        // ---------- Original Method ----------
        //mShapeState.mIntrinsicHeight = height;
        //invalidateSelf();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.550 -0400", hash_original_method = "2BA24D2DFEB102D9B9B4478CA4BDB4E4", hash_generated_method = "802A6AEBB857FFC3B4CEC8D7B64A6E80")
    @Override
    public int getIntrinsicWidth() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1117234356 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1117234356;
        // ---------- Original Method ----------
        //return mShapeState.mIntrinsicWidth;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.551 -0400", hash_original_method = "A17CBC5FDAD1E989314B42A85C195659", hash_generated_method = "FEB21A94FA30261DF4A1CF2ED8441B47")
    @Override
    public int getIntrinsicHeight() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_722220061 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_722220061;
        // ---------- Original Method ----------
        //return mShapeState.mIntrinsicHeight;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.551 -0400", hash_original_method = "57EA20106D2449A841F533A811E87EF0", hash_generated_method = "7220F215E95442A1AD3EF1D75695D679")
    @Override
    public boolean getPadding(Rect padding) {
        {
            padding.set(mShapeState.mPadding);
        } //End block
        {
            boolean var26681595319194856AEB3747307B6E08_468886884 = (super.getPadding(padding));
        } //End block
        addTaint(padding.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_543318079 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_543318079;
        // ---------- Original Method ----------
        //if (mShapeState.mPadding != null) {
            //padding.set(mShapeState.mPadding);
            //return true;
        //} else {
            //return super.getPadding(padding);
        //}
    }

    
        private static int modulateAlpha(int paintAlpha, int alpha) {
        int scale = alpha + (alpha >>> 7);
        return paintAlpha * scale >>> 8;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.567 -0400", hash_original_method = "94C805D8D565AE05BF02DE9855C838FE", hash_generated_method = "05C171D75EAACE6FF0C2F9DEE2E65292")
    protected void onDraw(Shape shape, Canvas canvas, Paint paint) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        shape.draw(canvas, paint);
        addTaint(shape.getTaint());
        addTaint(canvas.getTaint());
        addTaint(paint.getTaint());
        // ---------- Original Method ----------
        //shape.draw(canvas, paint);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.569 -0400", hash_original_method = "2D289F2C5870F3B95565E05840E163B8", hash_generated_method = "E8198FCD2C8F4CF873E26C6C953AED0C")
    @Override
    public void draw(Canvas canvas) {
        Rect r;
        r = getBounds();
        Paint paint;
        paint = mShapeState.mPaint;
        int prevAlpha;
        prevAlpha = paint.getAlpha();
        paint.setAlpha(modulateAlpha(prevAlpha, mShapeState.mAlpha));
        {
            int count;
            count = canvas.save();
            canvas.translate(r.left, r.top);
            onDraw(mShapeState.mShape, canvas, paint);
            canvas.restoreToCount(count);
        } //End block
        {
            canvas.drawRect(r, paint);
        } //End block
        paint.setAlpha(prevAlpha);
        addTaint(canvas.getTaint());
        // ---------- Original Method ----------
        //Rect r = getBounds();
        //Paint paint = mShapeState.mPaint;
        //int prevAlpha = paint.getAlpha();
        //paint.setAlpha(modulateAlpha(prevAlpha, mShapeState.mAlpha));
        //if (mShapeState.mShape != null) {
            //int count = canvas.save();
            //canvas.translate(r.left, r.top);
            //onDraw(mShapeState.mShape, canvas, paint);
            //canvas.restoreToCount(count);
        //} else {
            //canvas.drawRect(r, paint);
        //}
        //paint.setAlpha(prevAlpha);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.570 -0400", hash_original_method = "DB1A6AE8DEB59FB8C1923E504575EFF9", hash_generated_method = "79E26588ED5B31A4FBB53C1F7A351958")
    @Override
    public int getChangingConfigurations() {
        int var03C30E2DD78CE71D6B967BDA275B0525_511777798 = (super.getChangingConfigurations()
                | mShapeState.mChangingConfigurations);
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_841260290 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_841260290;
        // ---------- Original Method ----------
        //return super.getChangingConfigurations()
                //| mShapeState.mChangingConfigurations;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.586 -0400", hash_original_method = "6237C1F5A576324C3E69C30154E7DEFA", hash_generated_method = "7C2A4ABB1BBCDA7A1D9BBEFF61A8CB16")
    @Override
    public void setAlpha(int alpha) {
        mShapeState.mAlpha = alpha;
        invalidateSelf();
        // ---------- Original Method ----------
        //mShapeState.mAlpha = alpha;
        //invalidateSelf();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.592 -0400", hash_original_method = "DD3A0AA7864766F7FA9D12D24B53719B", hash_generated_method = "79D81861C668BEC463C1AF201C74DAC7")
    @Override
    public void setColorFilter(ColorFilter cf) {
        mShapeState.mPaint.setColorFilter(cf);
        invalidateSelf();
        addTaint(cf.getTaint());
        // ---------- Original Method ----------
        //mShapeState.mPaint.setColorFilter(cf);
        //invalidateSelf();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.596 -0400", hash_original_method = "056406D5393D0B46C202324FAF95659D", hash_generated_method = "D214AD70D0420E03AF35C01B78534DA3")
    @Override
    public int getOpacity() {
        {
            Paint p;
            p = mShapeState.mPaint;
            {
                boolean var9572989EFAB64708D1AB2CADA0B7F390_261385195 = (p.getXfermode() == null);
                {
                    int alpha;
                    alpha = p.getAlpha();
                } //End block
            } //End collapsed parenthetic
        } //End block
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_25576685 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_25576685;
        // ---------- Original Method ----------
        //if (mShapeState.mShape == null) {
            //final Paint p = mShapeState.mPaint;
            //if (p.getXfermode() == null) {
                //final int alpha = p.getAlpha();
                //if (alpha == 0) {
                    //return PixelFormat.TRANSPARENT;
                //}
                //if (alpha == 255) {
                    //return PixelFormat.OPAQUE;
                //}
            //}
        //}
        //return PixelFormat.TRANSLUCENT;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.597 -0400", hash_original_method = "3955BCB5252FAD61A7FDF156B0C32957", hash_generated_method = "B585A519E148E3637D1DFC6013F8AA52")
    @Override
    public void setDither(boolean dither) {
        mShapeState.mPaint.setDither(dither);
        invalidateSelf();
        addTaint(dither);
        // ---------- Original Method ----------
        //mShapeState.mPaint.setDither(dither);
        //invalidateSelf();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.614 -0400", hash_original_method = "E6B6299A3D5979543EAAC4DC6F8268D1", hash_generated_method = "2C59B04D180FD04CF0C98F1EC72068B9")
    @Override
    protected void onBoundsChange(Rect bounds) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        super.onBoundsChange(bounds);
        updateShape();
        addTaint(bounds.getTaint());
        // ---------- Original Method ----------
        //super.onBoundsChange(bounds);
        //updateShape();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.618 -0400", hash_original_method = "FCE81D70334945C2A418AF4A55A47945", hash_generated_method = "1D290E3AA57C696601DB513B20417CAE")
    protected boolean inflateTag(String name, Resources r, XmlPullParser parser,
            AttributeSet attrs) {
        {
            boolean varC590E54E2D929B80732C65F42F4C39A6_893227632 = ("padding".equals(name));
            {
                TypedArray a;
                a = r.obtainAttributes(attrs,
                    com.android.internal.R.styleable.ShapeDrawablePadding);
                setPadding(
                    a.getDimensionPixelOffset(
                            com.android.internal.R.styleable.ShapeDrawablePadding_left, 0),
                    a.getDimensionPixelOffset(
                            com.android.internal.R.styleable.ShapeDrawablePadding_top, 0),
                    a.getDimensionPixelOffset(
                            com.android.internal.R.styleable.ShapeDrawablePadding_right, 0),
                    a.getDimensionPixelOffset(
                            com.android.internal.R.styleable.ShapeDrawablePadding_bottom, 0));
                a.recycle();
            } //End block
        } //End collapsed parenthetic
        addTaint(name.getTaint());
        addTaint(r.getTaint());
        addTaint(parser.getTaint());
        addTaint(attrs.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1953556729 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1953556729;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.643 -0400", hash_original_method = "5F3462BA297EEEB891A1F24F05317325", hash_generated_method = "1A38FF4A789BFEF52F2675EC11EDD368")
    @Override
    public void inflate(Resources r, XmlPullParser parser, AttributeSet attrs) throws XmlPullParserException, IOException {
        super.inflate(r, parser, attrs);
        TypedArray a;
        a = r.obtainAttributes(attrs, com.android.internal.R.styleable.ShapeDrawable);
        int color;
        color = mShapeState.mPaint.getColor();
        color = a.getColor(com.android.internal.R.styleable.ShapeDrawable_color, color);
        mShapeState.mPaint.setColor(color);
        boolean dither;
        dither = a.getBoolean(com.android.internal.R.styleable.ShapeDrawable_dither, false);
        mShapeState.mPaint.setDither(dither);
        setIntrinsicWidth((int)
                a.getDimension(com.android.internal.R.styleable.ShapeDrawable_width, 0f));
        setIntrinsicHeight((int)
                a.getDimension(com.android.internal.R.styleable.ShapeDrawable_height, 0f));
        a.recycle();
        int type;
        int outerDepth;
        outerDepth = parser.getDepth();
        {
            boolean var49BAE650CF2F44016B0E4A15ECAD0A92_2100196380 = ((type=parser.next()) != XmlPullParser.END_DOCUMENT
               && (type != XmlPullParser.END_TAG || parser.getDepth() > outerDepth));
            {
                String name;
                name = parser.getName();
                {
                    boolean var35E72E680A0A661B0D620A4895DD21BC_271123309 = (!inflateTag(name, r, parser, attrs));
                    {
                        android.util.Log.w("drawable", "Unknown element: " + name +
                        " for ShapeDrawable " + this);
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        addTaint(r.getTaint());
        addTaint(parser.getTaint());
        addTaint(attrs.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.653 -0400", hash_original_method = "A8D04337EAFF1E34F1C3CFBFD3AD3EF7", hash_generated_method = "0B144EEEEF820C0B7D001637CA588C6E")
    private void updateShape() {
        {
            Rect r;
            r = getBounds();
            int w;
            w = r.width();
            int h;
            h = r.height();
            mShapeState.mShape.resize(w, h);
            {
                mShapeState.mPaint.setShader(mShapeState.mShaderFactory.resize(w, h));
            } //End block
        } //End block
        invalidateSelf();
        // ---------- Original Method ----------
        //if (mShapeState.mShape != null) {
            //final Rect r = getBounds();
            //final int w = r.width();
            //final int h = r.height();
            //mShapeState.mShape.resize(w, h);
            //if (mShapeState.mShaderFactory != null) {
                //mShapeState.mPaint.setShader(mShapeState.mShaderFactory.resize(w, h));
            //}
        //}
        //invalidateSelf();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.654 -0400", hash_original_method = "A9816EFD17AF344D0CD39D6855E6F73A", hash_generated_method = "14AAAECBFD081F720C5D1C65A389B188")
    @Override
    public ConstantState getConstantState() {
        ConstantState varB4EAC82CA7396A68D541C85D26508E83_162197685 = null; //Variable for return #1
        mShapeState.mChangingConfigurations = getChangingConfigurations();
        varB4EAC82CA7396A68D541C85D26508E83_162197685 = mShapeState;
        varB4EAC82CA7396A68D541C85D26508E83_162197685.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_162197685;
        // ---------- Original Method ----------
        //mShapeState.mChangingConfigurations = getChangingConfigurations();
        //return mShapeState;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.663 -0400", hash_original_method = "4A16C05F7F7E58EF657A6CA1B8182ABE", hash_generated_method = "559387A2F4660BADC4EE2B1A841F49E2")
    @Override
    public Drawable mutate() {
        Drawable varB4EAC82CA7396A68D541C85D26508E83_1067772245 = null; //Variable for return #1
        Drawable varB4EAC82CA7396A68D541C85D26508E83_1416451984 = null; //Variable for return #2
        {
            boolean varC94B19053599294E7944C8C841976773_610610026 = (!mMutated && super.mutate() == this);
            {
                mShapeState.mPaint = new Paint(mShapeState.mPaint);
                mShapeState.mPadding = new Rect(mShapeState.mPadding);
                try 
                {
                    mShapeState.mShape = mShapeState.mShape.clone();
                } //End block
                catch (CloneNotSupportedException e)
                {
                    varB4EAC82CA7396A68D541C85D26508E83_1067772245 = null;
                } //End block
                mMutated = true;
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_1416451984 = this;
        Drawable varA7E53CE21691AB073D9660D615818899_2096731974; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_2096731974 = varB4EAC82CA7396A68D541C85D26508E83_1067772245;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_2096731974 = varB4EAC82CA7396A68D541C85D26508E83_1416451984;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_2096731974.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_2096731974;
        // ---------- Original Method ----------
        //if (!mMutated && super.mutate() == this) {
            //mShapeState.mPaint = new Paint(mShapeState.mPaint);
            //mShapeState.mPadding = new Rect(mShapeState.mPadding);
            //try {
                //mShapeState.mShape = mShapeState.mShape.clone();
            //} catch (CloneNotSupportedException e) {
                //return null;
            //}
            //mMutated = true;
        //}
        //return this;
    }

    
    final static class ShapeState extends ConstantState {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.667 -0400", hash_original_field = "276E0645C4E2084773D0EB8C5576428C", hash_generated_field = "9BFAF00848476277D36D9BA586984BA7")

        int mChangingConfigurations;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.668 -0400", hash_original_field = "78E27F80AC0100441F897783EFA42851", hash_generated_field = "0344A2D91EF1BCE652EE63EFC12EEAC9")

        Paint mPaint;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.668 -0400", hash_original_field = "2926CB901374ACDDA1AEEBF2747A26F6", hash_generated_field = "E7A888C0E804BDEECC7B681F4946AFDC")

        Shape mShape;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.668 -0400", hash_original_field = "9AC2544B5F9B8F60AA16656C94B57A8E", hash_generated_field = "A053A94BBF9972B52A80E2FC510022E8")

        Rect mPadding;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.668 -0400", hash_original_field = "119DCE670C90F7AC3E6B6C08968A4DC8", hash_generated_field = "AAE27B48F9D50812AABD238DAF78161A")

        int mIntrinsicWidth;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.668 -0400", hash_original_field = "DFB49FFA7CD229538212E74A896D2963", hash_generated_field = "72B37F3E39E1F9B80F01AF0004B418D7")

        int mIntrinsicHeight;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.669 -0400", hash_original_field = "1439C01AF326A337A2401436745247DA", hash_generated_field = "A6B19F1E237A801306F5C3BB6F56FD1D")

        int mAlpha = 255;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.669 -0400", hash_original_field = "3F1C269B8DC8918282E82E3CC5AEEA3C", hash_generated_field = "ADCB4599C69CB10A0B4150CAF65EDF82")

        ShaderFactory mShaderFactory;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.699 -0400", hash_original_method = "EFBED6F0CFE384FE09150C9B37976B1A", hash_generated_method = "E8794C12CA154EFB1B8CDA4AECE9144F")
          ShapeState(ShapeState orig) {
            {
                mPaint = orig.mPaint;
                mShape = orig.mShape;
                mPadding = orig.mPadding;
                mIntrinsicWidth = orig.mIntrinsicWidth;
                mIntrinsicHeight = orig.mIntrinsicHeight;
                mAlpha = orig.mAlpha;
                mShaderFactory = orig.mShaderFactory;
            } //End block
            {
                mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
            } //End block
            // ---------- Original Method ----------
            //if (orig != null) {
                //mPaint = orig.mPaint;
                //mShape = orig.mShape;
                //mPadding = orig.mPadding;
                //mIntrinsicWidth = orig.mIntrinsicWidth;
                //mIntrinsicHeight = orig.mIntrinsicHeight;
                //mAlpha = orig.mAlpha;
                //mShaderFactory = orig.mShaderFactory;
            //} else {
                //mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
            //}
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.708 -0400", hash_original_method = "712D1F78574D9DF109190A3CBF508567", hash_generated_method = "4A25DD1BEC0DF6804766591EF6E49B4C")
        @Override
        public Drawable newDrawable() {
            Drawable varB4EAC82CA7396A68D541C85D26508E83_1838472623 = null; //Variable for return #1
            varB4EAC82CA7396A68D541C85D26508E83_1838472623 = new ShapeDrawable(this);
            varB4EAC82CA7396A68D541C85D26508E83_1838472623.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_1838472623;
            // ---------- Original Method ----------
            //return new ShapeDrawable(this);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.709 -0400", hash_original_method = "7ABD019570C442758FC9C41DDD5AE24E", hash_generated_method = "B98457D7736E68B7251FD189A2A86DAD")
        @Override
        public Drawable newDrawable(Resources res) {
            Drawable varB4EAC82CA7396A68D541C85D26508E83_39465848 = null; //Variable for return #1
            varB4EAC82CA7396A68D541C85D26508E83_39465848 = new ShapeDrawable(this);
            addTaint(res.getTaint());
            varB4EAC82CA7396A68D541C85D26508E83_39465848.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_39465848;
            // ---------- Original Method ----------
            //return new ShapeDrawable(this);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.710 -0400", hash_original_method = "9E7D7C67EAC365FF19BD4971762612A5", hash_generated_method = "9756D45690CB0D05F2DB0AF005757971")
        @Override
        public int getChangingConfigurations() {
            int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_8745369 = getTaintInt();
            return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_8745369;
            // ---------- Original Method ----------
            //return mChangingConfigurations;
        }

        
    }


    
    public static abstract class ShaderFactory {
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:16.710 -0400", hash_original_method = "3BAAD89D982163CC2C371B74D92AB9C1", hash_generated_method = "3BAAD89D982163CC2C371B74D92AB9C1")
        public ShaderFactory ()
        {
            //Synthesized constructor
        }


        public abstract Shader resize(int width, int height);

        
    }


    
}

