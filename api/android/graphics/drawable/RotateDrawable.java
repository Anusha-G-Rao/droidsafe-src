package android.graphics.drawable;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import android.util.Log;
import droidsafe.annotations.*;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;





public class RotateDrawable extends Drawable implements Drawable.Callback {
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:51.545 -0500", hash_original_field = "A209AB65EA72C034A89A158B6D35D299", hash_generated_field = "AF6B537CBDB90B8253BE1615E87A6B32")

    private static final float MAX_LEVEL = 10000.0f;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:51.546 -0500", hash_original_field = "D6053E1DDDD41C87BBF71E97400B36C4", hash_generated_field = "6525A0317A729C6A21603F930B262102")


    private RotateState mState;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:51.547 -0500", hash_original_field = "B15C308E96D0EEBD27CFE369FA349C15", hash_generated_field = "5CA5A1EF3CAA45117BCACBC34EF05952")

    private boolean mMutated;

    /**
     * <p>Create a new rotating drawable with an empty state.</p>
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:51.548 -0500", hash_original_method = "D68BBF88E63BC402EDEA5DC6DCE17035", hash_generated_method = "71F426AAD031F00583CE184548FEF9CC")
    public RotateDrawable() {
        this(null, null);
    }

    /**
     * <p>Create a new rotating drawable with the specified state. A copy of
     * this state is used as the internal state for the newly created
     * drawable.</p>
     *
     * @param rotateState the state for this drawable
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:51.549 -0500", hash_original_method = "995C0E9A95F93D2E12F98717831D2FCB", hash_generated_method = "AB05D3ED66A072D29C95A7328E33FA85")
    private RotateDrawable(RotateState rotateState, Resources res) {
        mState = new RotateState(rotateState, this, res);
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:51.550 -0500", hash_original_method = "66E42D309847A2E591E14284403E0AD8", hash_generated_method = "BBAFF2BE6C50F34BCF2B8BBCCFBA7E9B")
    public void draw(Canvas canvas) {
        int saveCount = canvas.save();

        Rect bounds = mState.mDrawable.getBounds();

        int w = bounds.right - bounds.left;
        int h = bounds.bottom - bounds.top;

        final RotateState st = mState;
        
        float px = st.mPivotXRel ? (w * st.mPivotX) : st.mPivotX;
        float py = st.mPivotYRel ? (h * st.mPivotY) : st.mPivotY;

        canvas.rotate(st.mCurrentDegrees, px + bounds.left, py + bounds.top);

        st.mDrawable.draw(canvas);

        canvas.restoreToCount(saveCount);
    }

    /**
     * Returns the drawable rotated by this RotateDrawable.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:51.551 -0500", hash_original_method = "CE08CCF44A5C011BE03C2CE7D256555D", hash_generated_method = "BEFA5166E237A523F1847A1483E2D376")
    public Drawable getDrawable() {
        return mState.mDrawable;
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:51.552 -0500", hash_original_method = "1BF1269A7F11A078222AE5900C6EC170", hash_generated_method = "F4C80938C81C1C6892334A7C3046F63C")
    @Override
public int getChangingConfigurations() {
        return super.getChangingConfigurations()
                | mState.mChangingConfigurations
                | mState.mDrawable.getChangingConfigurations();
    }
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:51.553 -0500", hash_original_method = "E07BF10440452C45B5D504184A6B58C8", hash_generated_method = "C0ECD2624D6CA10CD38C92A17BD6B8AC")
    public void setAlpha(int alpha) {
        mState.mDrawable.setAlpha(alpha);
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:51.553 -0500", hash_original_method = "6C570D1758B788EA390E83E99A76EB36", hash_generated_method = "57E12D7F67277B3DA8CEB2F6EEEB7C12")
    public void setColorFilter(ColorFilter cf) {
        mState.mDrawable.setColorFilter(cf);
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:51.554 -0500", hash_original_method = "7CC935EC38A8A9ED900F61C0DE237712", hash_generated_method = "6AEFC5E5119FBE730070031E99C8983B")
    public int getOpacity() {
        return mState.mDrawable.getOpacity();
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:51.555 -0500", hash_original_method = "289E4B14FC4BAEE8FBED5C03A1D9B634", hash_generated_method = "B516B8CE176B97B58ED719463429883C")
    public void invalidateDrawable(Drawable who) {
        final Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:51.556 -0500", hash_original_method = "A01CAF97CFFAA14450A9600E14E88C8D", hash_generated_method = "D916965E7ED92878F703EBB8407A3435")
    public void scheduleDrawable(Drawable who, Runnable what, long when) {
        final Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, what, when);
        }
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:51.557 -0500", hash_original_method = "CA144C86313E3C1A3DC044F014305D8E", hash_generated_method = "1F0141991B8511B6AE50284469FB44D8")
    public void unscheduleDrawable(Drawable who, Runnable what) {
        final Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, what);
        }
    }

   @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:51.557 -0500", hash_original_method = "02BC41BDC3ED3CF2C30379FA10185DFA", hash_generated_method = "EF37E14ABAA41BD949B44B96BCA98DD1")
    @Override
public boolean getPadding(Rect padding) {
        return mState.mDrawable.getPadding(padding);
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:51.558 -0500", hash_original_method = "BD39509C4CE6111239623166AC9A09DC", hash_generated_method = "E4769A7F6CE43D19F0D91F896E2EF83B")
    @Override
public boolean setVisible(boolean visible, boolean restart) {
        mState.mDrawable.setVisible(visible, restart);
        return super.setVisible(visible, restart);
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:51.559 -0500", hash_original_method = "6F66CB18BCF39D7C34F81BD35385E69D", hash_generated_method = "8D650BF6AB97FF0BA6CDB1926623C43C")
    @Override
public boolean isStateful() {
        return mState.mDrawable.isStateful();
    }
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:51.560 -0500", hash_original_method = "7EB4BF4364E02A64D78830D58D97433D", hash_generated_method = "B552F927AD48151D12DDCBCA6D1DC0A0")
    @Override
protected boolean onStateChange(int[] state) {
        boolean changed = mState.mDrawable.setState(state);
        onBoundsChange(getBounds());
        return changed;
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:51.561 -0500", hash_original_method = "83ABEEB83DB924D066F2C024127658DA", hash_generated_method = "F8EAF521CA2FB59AD0F4318A6820F99F")
    @Override
protected boolean onLevelChange(int level) {
        mState.mDrawable.setLevel(level);
        onBoundsChange(getBounds());

        mState.mCurrentDegrees = mState.mFromDegrees +
                (mState.mToDegrees - mState.mFromDegrees) *
                        ((float) level / MAX_LEVEL);

        invalidateSelf();
        return true;
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:51.561 -0500", hash_original_method = "EF65F96F81169D8EC042745FACAE10FF", hash_generated_method = "6B53241A301D10E115CDC4FD994DABEE")
    @Override
protected void onBoundsChange(Rect bounds) {
        mState.mDrawable.setBounds(bounds.left, bounds.top,
                bounds.right, bounds.bottom);
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:51.562 -0500", hash_original_method = "5B4218C80F47B6E11FBBAA9FF9621C9F", hash_generated_method = "E28C2E4A7B9402F89BB9614B8EB9AEEA")
    @Override
public int getIntrinsicWidth() {
        return mState.mDrawable.getIntrinsicWidth();
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:51.563 -0500", hash_original_method = "D5692643A14F3CC0D08138E7C727B99D", hash_generated_method = "7484AD6435F7AE8BD48190BEDCA8E9A4")
    @Override
public int getIntrinsicHeight() {
        return mState.mDrawable.getIntrinsicHeight();
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:51.564 -0500", hash_original_method = "810CA52F78245136A3D7374C4FDCA32A", hash_generated_method = "F7FD4C2E1CE6CB5A53EF92C865F3EA82")
    @Override
public ConstantState getConstantState() {
        if (mState.canConstantState()) {
            mState.mChangingConfigurations = getChangingConfigurations();
            return mState;
        }
        return null;
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:51.565 -0500", hash_original_method = "A81455DB3DC70DF6E6044DAADCB89002", hash_generated_method = "C9F3A055237B1843E0A1CFCA5B057C34")
    @Override
public void inflate(Resources r, XmlPullParser parser, AttributeSet attrs)
            throws XmlPullParserException, IOException {

        TypedArray a = r.obtainAttributes(attrs,
                com.android.internal.R.styleable.RotateDrawable);

        super.inflateWithAttributes(r, parser, a,
                com.android.internal.R.styleable.RotateDrawable_visible);
        
        TypedValue tv = a.peekValue(com.android.internal.R.styleable.RotateDrawable_pivotX);
        boolean pivotXRel;
        float pivotX;
        if (tv == null) {
            pivotXRel = true;
            pivotX = 0.5f;
        } else {
            pivotXRel = tv.type == TypedValue.TYPE_FRACTION;
            pivotX = pivotXRel ? tv.getFraction(1.0f, 1.0f) : tv.getFloat();
        }
        
        tv = a.peekValue(com.android.internal.R.styleable.RotateDrawable_pivotY);
        boolean pivotYRel;
        float pivotY;
        if (tv == null) {
            pivotYRel = true;
            pivotY = 0.5f;
        } else {
            pivotYRel = tv.type == TypedValue.TYPE_FRACTION;
            pivotY = pivotYRel ? tv.getFraction(1.0f, 1.0f) : tv.getFloat();
        }

        float fromDegrees = a.getFloat(
                com.android.internal.R.styleable.RotateDrawable_fromDegrees, 0.0f);
        float toDegrees = a.getFloat(
                com.android.internal.R.styleable.RotateDrawable_toDegrees, 360.0f);

        int res = a.getResourceId(
                com.android.internal.R.styleable.RotateDrawable_drawable, 0);
        Drawable drawable = null;
        if (res > 0) {
            drawable = r.getDrawable(res);
        }

        a.recycle();
        
        int outerDepth = parser.getDepth();
        int type;
        while ((type = parser.next()) != XmlPullParser.END_DOCUMENT &&
               (type != XmlPullParser.END_TAG || parser.getDepth() > outerDepth)) {

            if (type != XmlPullParser.START_TAG) {
                continue;
            }

            if ((drawable = Drawable.createFromXmlInner(r, parser, attrs)) == null) {
                Log.w("drawable", "Bad element under <rotate>: "
                        + parser .getName());
            }
        }

        if (drawable == null) {
            Log.w("drawable", "No drawable specified for <rotate>");
        }

        mState.mDrawable = drawable;
        mState.mPivotXRel = pivotXRel;
        mState.mPivotX = pivotX;
        mState.mPivotYRel = pivotYRel;
        mState.mPivotY = pivotY;
        mState.mFromDegrees = mState.mCurrentDegrees = fromDegrees;
        mState.mToDegrees = toDegrees;

        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    
    final static class RotateState extends Drawable.ConstantState {
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:51.567 -0500", hash_original_field = "38BA53DD394F85639C99ED8E666FF8FB", hash_generated_field = "38BA53DD394F85639C99ED8E666FF8FB")

        Drawable mDrawable;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:51.568 -0500", hash_original_field = "9BFAF00848476277D36D9BA586984BA7", hash_generated_field = "9BFAF00848476277D36D9BA586984BA7")


        int mChangingConfigurations;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:51.569 -0500", hash_original_field = "C85378C704A40C3EFC15605BD9C2CCB0", hash_generated_field = "C85378C704A40C3EFC15605BD9C2CCB0")

        
        boolean mPivotXRel;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:51.569 -0500", hash_original_field = "5936761CCB9106C6D82A6436A57EC343", hash_generated_field = "5936761CCB9106C6D82A6436A57EC343")

        float mPivotX;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:51.570 -0500", hash_original_field = "4EE5D55A1588E348C8DE32B74EC377A0", hash_generated_field = "4EE5D55A1588E348C8DE32B74EC377A0")

        boolean mPivotYRel;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:51.571 -0500", hash_original_field = "6CE864DEEFD86BFE91AA6D818A7F55C0", hash_generated_field = "6CE864DEEFD86BFE91AA6D818A7F55C0")

        float mPivotY;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:51.572 -0500", hash_original_field = "179D120EA21717CC6A9EB6675A09E18B", hash_generated_field = "179D120EA21717CC6A9EB6675A09E18B")


        float mFromDegrees;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:51.573 -0500", hash_original_field = "D04BBDA5B46FF274C82326C147187C72", hash_generated_field = "D04BBDA5B46FF274C82326C147187C72")

        float mToDegrees;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:51.573 -0500", hash_original_field = "EF0BD8ADAC303B1287CF1584E5AA1EDB", hash_generated_field = "EF0BD8ADAC303B1287CF1584E5AA1EDB")


        float mCurrentDegrees;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:51.574 -0500", hash_original_field = "09212A3A30B7E6D48DEECC4F4639CCBC", hash_generated_field = "F62F8D22C4EDE8B8E63C376677BD915C")


        private boolean mCanConstantState;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:51.575 -0500", hash_original_field = "04605894B57F7B3414AF620BF4AC040E", hash_generated_field = "63D49323436A33301C0DA6EDF88627FF")

        private boolean mCheckedConstantState;        

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:51.576 -0500", hash_original_method = "E49363C9B9277E418FC0CB021F74A645", hash_generated_method = "F01A71C2D6927072D466EECA361C56C7")
        public RotateState(RotateState source, RotateDrawable owner, Resources res) {
            if (source != null) {
                if (res != null) {
                    mDrawable = source.mDrawable.getConstantState().newDrawable(res);
                } else {
                    mDrawable = source.mDrawable.getConstantState().newDrawable();
                }
                mDrawable.setCallback(owner);
                mPivotXRel = source.mPivotXRel;
                mPivotX = source.mPivotX;
                mPivotYRel = source.mPivotYRel;
                mPivotY = source.mPivotY;
                mFromDegrees = mCurrentDegrees = source.mFromDegrees;
                mToDegrees = source.mToDegrees;
                mCanConstantState = mCheckedConstantState = true;
            }
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:51.577 -0500", hash_original_method = "9DE14D671D62BC2F01E2871493505073", hash_generated_method = "3FDDAEFAEEA27DF3505DB824B048376A")
        @Override
public Drawable newDrawable() {
            return new RotateDrawable(this, null);
        }
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:51.578 -0500", hash_original_method = "3300EE781F91D7B956F1DECE09B43C56", hash_generated_method = "CB58A5BF2826784B7A1D8EDCEBDC058F")
        @Override
public Drawable newDrawable(Resources res) {
            return new RotateDrawable(this, res);
        }
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:51.579 -0500", hash_original_method = "9E7D7C67EAC365FF19BD4971762612A5", hash_generated_method = "3AB30668ED270F2EDF2E0129C706FE4D")
        @Override
public int getChangingConfigurations() {
            return mChangingConfigurations;
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:51.580 -0500", hash_original_method = "8D2A3A495FE794F654E28C73CF35A2A1", hash_generated_method = "D7605CD8561469FF7F51AF0DC063DCC1")
        public boolean canConstantState() {
            if (!mCheckedConstantState) {
                mCanConstantState = mDrawable.getConstantState() != null;
                mCheckedConstantState = true;
            }

            return mCanConstantState;
        }

        
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:49:51.566 -0500", hash_original_method = "1ABB3B56372A1EBF2E80045724D492E3", hash_generated_method = "414636B1F74F02F73E1047B03CD83E9B")
    @Override
public Drawable mutate() {
        if (!mMutated && super.mutate() == this) {
            mState.mDrawable.mutate();
            mMutated = true;
        }
        return this;
    }
}

