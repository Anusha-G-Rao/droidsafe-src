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
import android.view.View;
import android.view.ViewGroup;
import java.util.Random;

public class LayoutAnimationController {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.635 -0400", hash_original_field = "9A46FC3BA66487AE56C5DCE37D0AA79A", hash_generated_field = "24E67EC6656CB0E8440535D7029988FE")

    protected Animation mAnimation;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.638 -0400", hash_original_field = "970C389A690CAE654EE6336AA068E17C", hash_generated_field = "2D35EFF44D7BEB70FAD342EC80A5CE7E")

    protected Random mRandomizer;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.638 -0400", hash_original_field = "DA3E6FC5A778B3C344EE09B26563FD22", hash_generated_field = "9557EEC9CBF12937FA6D035BD738A81B")

    protected Interpolator mInterpolator;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.638 -0400", hash_original_field = "4A07FB752767B90A168D4F2A331D5C36", hash_generated_field = "40E31E41BFDF10FA2549A57D1E0B2464")

    private float mDelay;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.638 -0400", hash_original_field = "6D112D2229BB97D14E6F55D683775A63", hash_generated_field = "5491D551C576BD6880788C5897A5BA8A")

    private int mOrder;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.638 -0400", hash_original_field = "25395741BFE51A7D136A5C7109AAD2D8", hash_generated_field = "8BF5222528387AE04CED3C727F9F8865")

    private long mDuration;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.638 -0400", hash_original_field = "6A66DFEF19618C77DCA9D07E8E24369A", hash_generated_field = "6858B6909E393C6400B9A7BBD2C111B0")

    private long mMaxDelay;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.639 -0400", hash_original_method = "E3D4984E609CD7A8F1E539254F42C7CB", hash_generated_method = "A05780F1B4573408A7DC5FAD3279E0AB")
    public  LayoutAnimationController(Context context, AttributeSet attrs) {
        TypedArray a;
        a = context.obtainStyledAttributes(attrs, com.android.internal.R.styleable.LayoutAnimation);
        Animation.Description d;
        d = Animation.Description.parseValue(
                a.peekValue(com.android.internal.R.styleable.LayoutAnimation_delay));
        mDelay = d.value;
        mOrder = a.getInt(com.android.internal.R.styleable.LayoutAnimation_animationOrder, ORDER_NORMAL);
        int resource;
        resource = a.getResourceId(com.android.internal.R.styleable.LayoutAnimation_animation, 0);
        {
            setAnimation(context, resource);
        } //End block
        resource = a.getResourceId(com.android.internal.R.styleable.LayoutAnimation_interpolator, 0);
        {
            setInterpolator(context, resource);
        } //End block
        a.recycle();
        addTaint(context.getTaint());
        addTaint(attrs.getTaint());
        // ---------- Original Method ----------
        //TypedArray a = context.obtainStyledAttributes(attrs, com.android.internal.R.styleable.LayoutAnimation);
        //Animation.Description d = Animation.Description.parseValue(
                //a.peekValue(com.android.internal.R.styleable.LayoutAnimation_delay));
        //mDelay = d.value;
        //mOrder = a.getInt(com.android.internal.R.styleable.LayoutAnimation_animationOrder, ORDER_NORMAL);
        //int resource = a.getResourceId(com.android.internal.R.styleable.LayoutAnimation_animation, 0);
        //if (resource > 0) {
            //setAnimation(context, resource);
        //}
        //resource = a.getResourceId(com.android.internal.R.styleable.LayoutAnimation_interpolator, 0);
        //if (resource > 0) {
            //setInterpolator(context, resource);
        //}
        //a.recycle();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.639 -0400", hash_original_method = "F5882907CA59BB2AE2BDFE73A922FA4E", hash_generated_method = "2EAF47A6EA8A6AEDDCA1D592BA1B3308")
    public  LayoutAnimationController(Animation animation) {
        this(animation, 0.5f);
        addTaint(animation.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.660 -0400", hash_original_method = "2D34A90DB159467DA6803B576AE47B5C", hash_generated_method = "3E3AAFA04004E2EAE67E32F7FF048143")
    public  LayoutAnimationController(Animation animation, float delay) {
        mDelay = delay;
        setAnimation(animation);
        addTaint(animation.getTaint());
        // ---------- Original Method ----------
        //mDelay = delay;
        //setAnimation(animation);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.661 -0400", hash_original_method = "BE8C43C510B8AF8546FEBBAA3EF0F0B1", hash_generated_method = "3A49777C7D461B2461E6EC3D97A11D2C")
    public int getOrder() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_835106542 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_835106542;
        // ---------- Original Method ----------
        //return mOrder;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.661 -0400", hash_original_method = "648C96BEF511A58A69E168C40D059B54", hash_generated_method = "23B5E85A7019C72C38679E0BA3B78B0E")
    public void setOrder(int order) {
        mOrder = order;
        // ---------- Original Method ----------
        //mOrder = order;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.661 -0400", hash_original_method = "DA137DCBF1E5E58EF4425067063E3D6F", hash_generated_method = "F06DC297E669BBFCA88B74AFA475E604")
    public void setAnimation(Context context, int resourceID) {
        setAnimation(AnimationUtils.loadAnimation(context, resourceID));
        addTaint(context.getTaint());
        addTaint(resourceID);
        // ---------- Original Method ----------
        //setAnimation(AnimationUtils.loadAnimation(context, resourceID));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.661 -0400", hash_original_method = "B4A74FA6048B5852F1E265E64E11FC0D", hash_generated_method = "650036FF6A01BD934E9A839927003C94")
    public void setAnimation(Animation animation) {
        mAnimation = animation;
        mAnimation.setFillBefore(true);
        // ---------- Original Method ----------
        //mAnimation = animation;
        //mAnimation.setFillBefore(true);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.662 -0400", hash_original_method = "DAC4606AD5070B4B7D220BEE34A17978", hash_generated_method = "A23F394CE5F35EB03D415AF651F91A6F")
    public Animation getAnimation() {
        Animation varB4EAC82CA7396A68D541C85D26508E83_1930682263 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1930682263 = mAnimation;
        varB4EAC82CA7396A68D541C85D26508E83_1930682263.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1930682263;
        // ---------- Original Method ----------
        //return mAnimation;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.662 -0400", hash_original_method = "66DF0F8C4443D43AC8C0B59FD3C0EE80", hash_generated_method = "DEC31EE6B52828DF0B8A5AA00C52AB87")
    public void setInterpolator(Context context, int resourceID) {
        setInterpolator(AnimationUtils.loadInterpolator(context, resourceID));
        addTaint(context.getTaint());
        addTaint(resourceID);
        // ---------- Original Method ----------
        //setInterpolator(AnimationUtils.loadInterpolator(context, resourceID));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.666 -0400", hash_original_method = "7D5A9A852D608ADF508B994526BF9EAC", hash_generated_method = "305B3174980281AD6A6C4213980CE615")
    public void setInterpolator(Interpolator interpolator) {
        mInterpolator = interpolator;
        // ---------- Original Method ----------
        //mInterpolator = interpolator;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.667 -0400", hash_original_method = "8AA04851FFB5BE49EA5890940035B142", hash_generated_method = "70EB577CB410F450CA625D7F063CFC25")
    public Interpolator getInterpolator() {
        Interpolator varB4EAC82CA7396A68D541C85D26508E83_957675996 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_957675996 = mInterpolator;
        varB4EAC82CA7396A68D541C85D26508E83_957675996.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_957675996;
        // ---------- Original Method ----------
        //return mInterpolator;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.667 -0400", hash_original_method = "55CD68136127075BB4939DEA602DB451", hash_generated_method = "262F8A239C498987A5955EA5D51AEE05")
    public float getDelay() {
        float var546ADE640B6EDFBC8A086EF31347E768_1690522759 = getTaintFloat();
        return var546ADE640B6EDFBC8A086EF31347E768_1690522759;
        // ---------- Original Method ----------
        //return mDelay;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.667 -0400", hash_original_method = "66A46BCEB9C76B70A4A3D1129198A613", hash_generated_method = "68B321DC0C555672B92725ED9120FBBD")
    public void setDelay(float delay) {
        mDelay = delay;
        // ---------- Original Method ----------
        //mDelay = delay;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.667 -0400", hash_original_method = "C391ED719773BAF357B5BB149771DE74", hash_generated_method = "44826C3F8AAC67E18097A183631E13F7")
    public boolean willOverlap() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2048921777 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2048921777;
        // ---------- Original Method ----------
        //return mDelay < 1.0f;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.668 -0400", hash_original_method = "78D31C459A561793AE549A78D34651C2", hash_generated_method = "28ED2DD3D8DE8D02B2A83588A15C5A4B")
    public void start() {
        mDuration = mAnimation.getDuration();
        mMaxDelay = Long.MIN_VALUE;
        mAnimation.setStartTime(-1);
        // ---------- Original Method ----------
        //mDuration = mAnimation.getDuration();
        //mMaxDelay = Long.MIN_VALUE;
        //mAnimation.setStartTime(-1);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.669 -0400", hash_original_method = "96F3EFCD32C49E23FCBCF1FC0105A7B0", hash_generated_method = "5EA40325865EE25F749AFF883E5FA925")
    public final Animation getAnimationForView(View view) {
        Animation varB4EAC82CA7396A68D541C85D26508E83_293400873 = null; //Variable for return #1
        Animation varB4EAC82CA7396A68D541C85D26508E83_1810665515 = null; //Variable for return #2
        long delay;
        delay = getDelayForView(view) + mAnimation.getStartOffset();
        mMaxDelay = Math.max(mMaxDelay, delay);
        try 
        {
            Animation animation;
            animation = mAnimation.clone();
            animation.setStartOffset(delay);
            varB4EAC82CA7396A68D541C85D26508E83_293400873 = animation;
        } //End block
        catch (CloneNotSupportedException e)
        {
            varB4EAC82CA7396A68D541C85D26508E83_1810665515 = null;
        } //End block
        addTaint(view.getTaint());
        Animation varA7E53CE21691AB073D9660D615818899_1375485481; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1375485481 = varB4EAC82CA7396A68D541C85D26508E83_293400873;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1375485481 = varB4EAC82CA7396A68D541C85D26508E83_1810665515;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1375485481.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1375485481;
        // ---------- Original Method ----------
        //final long delay = getDelayForView(view) + mAnimation.getStartOffset();
        //mMaxDelay = Math.max(mMaxDelay, delay);
        //try {
            //final Animation animation = mAnimation.clone();
            //animation.setStartOffset(delay);
            //return animation;
        //} catch (CloneNotSupportedException e) {
            //return null;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.669 -0400", hash_original_method = "F6685E165800CF46F16D582CC6341EDA", hash_generated_method = "BC48D1CB1CC1DB7A47830138B0680A16")
    public boolean isDone() {
        boolean varAA996CFF263FCCB06A70FF5712A8C20D_22194931 = (AnimationUtils.currentAnimationTimeMillis() >
                mAnimation.getStartTime() + mMaxDelay + mDuration);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_712340969 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_712340969;
        // ---------- Original Method ----------
        //return AnimationUtils.currentAnimationTimeMillis() >
                //mAnimation.getStartTime() + mMaxDelay + mDuration;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.678 -0400", hash_original_method = "C5014C66E1BA1577E6F39C7457247B02", hash_generated_method = "5CC6D0CD5FD4241F47621FC498B795E5")
    protected long getDelayForView(View view) {
        ViewGroup.LayoutParams lp;
        lp = view.getLayoutParams();
        AnimationParameters params;
        params = lp.layoutAnimationParameters;
        float delay;
        delay = mDelay * mAnimation.getDuration();
        long viewDelay;
        viewDelay = (long) (getTransformedIndex(params) * delay);
        float totalDelay;
        totalDelay = delay * params.count;
        {
            mInterpolator = new LinearInterpolator();
        } //End block
        float normalizedDelay;
        normalizedDelay = viewDelay / totalDelay;
        normalizedDelay = mInterpolator.getInterpolation(normalizedDelay);
        addTaint(view.getTaint());
        long var0F5264038205EDFB1AC05FBB0E8C5E94_1053447732 = getTaintLong();
        return var0F5264038205EDFB1AC05FBB0E8C5E94_1053447732;
        // ---------- Original Method ----------
        //ViewGroup.LayoutParams lp = view.getLayoutParams();
        //AnimationParameters params = lp.layoutAnimationParameters;
        //if (params == null) {
            //return 0;
        //}
        //final float delay = mDelay * mAnimation.getDuration();
        //final long viewDelay = (long) (getTransformedIndex(params) * delay);
        //final float totalDelay = delay * params.count;
        //if (mInterpolator == null) {
            //mInterpolator = new LinearInterpolator();
        //}
        //float normalizedDelay = viewDelay / totalDelay;
        //normalizedDelay = mInterpolator.getInterpolation(normalizedDelay);
        //return (long) (normalizedDelay * totalDelay);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.679 -0400", hash_original_method = "305795D5C2AE9556CA8D226C9088184E", hash_generated_method = "DF67677B8399D455A2C985C38D952881")
    protected int getTransformedIndex(AnimationParameters params) {
        {
            Object var998A9FCD617ED3F225652B49EC9B64C8_1812580255 = (getOrder());
            //Begin case ORDER_RANDOM 
            {
                mRandomizer = new Random();
            } //End block
            //End case ORDER_RANDOM 
            //Begin case ORDER_RANDOM 
            int var35A3E0E3BF8465C06EAD60D9C202EAD6_1949450407 = ((int) (params.count * mRandomizer.nextFloat()));
            //End case ORDER_RANDOM 
        } //End collapsed parenthetic
        addTaint(params.getTaint());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_370461130 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_370461130;
        // ---------- Original Method ----------
        //switch (getOrder()) {
            //case ORDER_REVERSE:
                //return params.count - 1 - params.index;
            //case ORDER_RANDOM:
                //if (mRandomizer == null) {
                    //mRandomizer = new Random();
                //}
                //return (int) (params.count * mRandomizer.nextFloat());
            //case ORDER_NORMAL:
            //default:
                //return params.index;
        //}
    }

    
    public static class AnimationParameters {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.679 -0400", hash_original_field = "E2942A04780E223B215EB8B663CF5353", hash_generated_field = "21B1DF5337CCD3E0731435FB1361ED67")

        public int count;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.679 -0400", hash_original_field = "6A992D5529F459A44FEE58C733255E86", hash_generated_field = "AE1343475DB0F2C28979E182E3B11BCC")

        public int index;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.679 -0400", hash_original_method = "838D907A76D7295751639A8A84C023C1", hash_generated_method = "838D907A76D7295751639A8A84C023C1")
        public AnimationParameters ()
        {
            //Synthesized constructor
        }


    }


    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.679 -0400", hash_original_field = "E45438A8F9A60BA7AC2587957426E9FE", hash_generated_field = "E859EC909F26DCFC9E7628E48052485C")

    public static final int ORDER_NORMAL  = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.680 -0400", hash_original_field = "7E153306CF50C4C37B7189EB0B1B4A93", hash_generated_field = "8AF0E7C910184642E51646CAC9E86C19")

    public static final int ORDER_REVERSE = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.680 -0400", hash_original_field = "DADA65EAD5CF7CD10F7A4D963D47457D", hash_generated_field = "96FD66E505BF01EB19B03EE5BB059919")

    public static final int ORDER_RANDOM  = 2;
}

