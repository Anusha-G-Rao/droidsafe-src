package com.android.internal.widget;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import com.android.internal.R;
import com.android.internal.view.menu.ActionMenuPresenter;
import com.android.internal.view.menu.ActionMenuView;
import com.android.internal.view.menu.MenuBuilder;
import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActionBarContextView extends AbsActionBarView implements AnimatorListener {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.849 -0400", hash_original_field = "4B03BBB3AD21DBD17B2B689923FCF1F6", hash_generated_field = "ECAB18871B55104BACD4283C12B1074D")

    private CharSequence mTitle;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.849 -0400", hash_original_field = "6EDD40BFDEB251E34BDCB1CE9C263665", hash_generated_field = "775125B4EBC8ED0F3E5FBA051277E18D")

    private CharSequence mSubtitle;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.849 -0400", hash_original_field = "6D2EE1E387531C84DD880458CD9B9060", hash_generated_field = "24F281CC402C90EA9D9EB00DDCF618F4")

    private View mClose;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.849 -0400", hash_original_field = "0F85706FF7ACEA880EA803CB0E63A48D", hash_generated_field = "58BF9FCCDFB47B7346A31DF060279244")

    private View mCustomView;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.849 -0400", hash_original_field = "E04DEDB0B406830A59065795F4A530C9", hash_generated_field = "53515DAB03CBCC904881F85C0D0B24F4")

    private LinearLayout mTitleLayout;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.849 -0400", hash_original_field = "5F3FDB05EE6E2581CC95AB22CADCE47B", hash_generated_field = "3B26FAD098CFEC3A217F2BF71097A83E")

    private TextView mTitleView;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.849 -0400", hash_original_field = "68B3FAC852E3272F9F54C6B1610054DA", hash_generated_field = "5B91EC47B0CD462AA7928A5697458750")

    private TextView mSubtitleView;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.849 -0400", hash_original_field = "F00D2B188EA8D8F58E0764D2012CA069", hash_generated_field = "CFEDF1432A06310A2FB06B788CC20410")

    private int mTitleStyleRes;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.849 -0400", hash_original_field = "C0606F823BBDDA71B84334C05C268230", hash_generated_field = "9FA8532B8CB2D1269C79565E301C661F")

    private int mSubtitleStyleRes;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.849 -0400", hash_original_field = "2225C949EA81FBFB7C5583F73183E256", hash_generated_field = "EAFF30D2C8DDA41FABEEAF56960F2296")

    private Drawable mSplitBackground;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.849 -0400", hash_original_field = "40A500CAA798F3EB011971DCA401C2FB", hash_generated_field = "33771BEA3F609DD1955FEC169216294A")

    private Animator mCurrentAnimation;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.849 -0400", hash_original_field = "2617AFF41B3BE696F7430186B046AEFC", hash_generated_field = "8265308A3A327A796C7CC259CBBF12AC")

    private boolean mAnimateInOnLayout;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.850 -0400", hash_original_field = "535E559CD7B99D09B7149CE1751E3916", hash_generated_field = "7231072E88C5D78E0458C5139E2E8DF1")

    private int mAnimationMode;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.859 -0400", hash_original_method = "2EBFD0846938BB846291BE9F4AD94F04", hash_generated_method = "36E4F0BA0A93AF1939B2F4DCD87398AA")
    public  ActionBarContextView(Context context) {
        this(context, null);
        addTaint(context.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.859 -0400", hash_original_method = "43CDEE17F6E403B0B882E0F499365FE4", hash_generated_method = "8E70D20FDB3F04B61DA16551FB4B3754")
    public  ActionBarContextView(Context context, AttributeSet attrs) {
        this(context, attrs, com.android.internal.R.attr.actionModeStyle);
        addTaint(context.getTaint());
        addTaint(attrs.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.861 -0400", hash_original_method = "19C70EFA7CD06BD307662BD45113B543", hash_generated_method = "05C40E61E59901B88D7933B87E80018E")
    public  ActionBarContextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        TypedArray a;
        a = context.obtainStyledAttributes(attrs, R.styleable.ActionMode, defStyle, 0);
        setBackgroundDrawable(a.getDrawable(
                com.android.internal.R.styleable.ActionMode_background));
        mTitleStyleRes = a.getResourceId(
                com.android.internal.R.styleable.ActionMode_titleTextStyle, 0);
        mSubtitleStyleRes = a.getResourceId(
                com.android.internal.R.styleable.ActionMode_subtitleTextStyle, 0);
        mContentHeight = a.getLayoutDimension(
                com.android.internal.R.styleable.ActionMode_height, 0);
        mSplitBackground = a.getDrawable(
                com.android.internal.R.styleable.ActionMode_backgroundSplit);
        a.recycle();
        addTaint(context.getTaint());
        addTaint(attrs.getTaint());
        addTaint(defStyle);
        // ---------- Original Method ----------
        //TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.ActionMode, defStyle, 0);
        //setBackgroundDrawable(a.getDrawable(
                //com.android.internal.R.styleable.ActionMode_background));
        //mTitleStyleRes = a.getResourceId(
                //com.android.internal.R.styleable.ActionMode_titleTextStyle, 0);
        //mSubtitleStyleRes = a.getResourceId(
                //com.android.internal.R.styleable.ActionMode_subtitleTextStyle, 0);
        //mContentHeight = a.getLayoutDimension(
                //com.android.internal.R.styleable.ActionMode_height, 0);
        //mSplitBackground = a.getDrawable(
                //com.android.internal.R.styleable.ActionMode_backgroundSplit);
        //a.recycle();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.861 -0400", hash_original_method = "B72CC99F1AE7F170915B2F32514E502E", hash_generated_method = "557C076842D7BAB87119015349CF3395")
    @Override
    public void onDetachedFromWindow() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        super.onDetachedFromWindow();
        {
            mActionMenuPresenter.hideOverflowMenu();
            mActionMenuPresenter.hideSubMenus();
        } //End block
        // ---------- Original Method ----------
        //super.onDetachedFromWindow();
        //if (mActionMenuPresenter != null) {
            //mActionMenuPresenter.hideOverflowMenu();
            //mActionMenuPresenter.hideSubMenus();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.879 -0400", hash_original_method = "E552720A78112C3EB9A59B322D8064C9", hash_generated_method = "A64A966C45E5198A81B41EC526BE624F")
    @Override
    public void setSplitActionBar(boolean split) {
        {
            {
                LayoutParams layoutParams;
                layoutParams = new LayoutParams(LayoutParams.WRAP_CONTENT,
                        LayoutParams.MATCH_PARENT);
                {
                    mMenuView = (ActionMenuView) mActionMenuPresenter.getMenuView(this);
                    mMenuView.setBackgroundDrawable(null);
                    ViewGroup oldParent;
                    oldParent = (ViewGroup) mMenuView.getParent();
                    oldParent.removeView(mMenuView);
                    addView(mMenuView, layoutParams);
                } //End block
                {
                    mActionMenuPresenter.setWidthLimit(
                            getContext().getResources().getDisplayMetrics().widthPixels, true);
                    mActionMenuPresenter.setItemLimit(Integer.MAX_VALUE);
                    layoutParams.width = LayoutParams.MATCH_PARENT;
                    layoutParams.height = mContentHeight;
                    mMenuView = (ActionMenuView) mActionMenuPresenter.getMenuView(this);
                    mMenuView.setBackgroundDrawable(mSplitBackground);
                    ViewGroup oldParent;
                    oldParent = (ViewGroup) mMenuView.getParent();
                    oldParent.removeView(mMenuView);
                    mSplitView.addView(mMenuView, layoutParams);
                } //End block
            } //End block
            super.setSplitActionBar(split);
        } //End block
        addTaint(split);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.882 -0400", hash_original_method = "2AF53FC77EF46E1AB46FFEE70D9B4BD3", hash_generated_method = "B605154034957D668B9E756F3C9F46CD")
    public void setContentHeight(int height) {
        mContentHeight = height;
        addTaint(height);
        // ---------- Original Method ----------
        //mContentHeight = height;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.883 -0400", hash_original_method = "BF35621F736CEABB1B31AE57D0749737", hash_generated_method = "6E197DFE3D2B6928F20A4E6ECFADB76F")
    public void setCustomView(View view) {
        {
            removeView(mCustomView);
        } //End block
        mCustomView = view;
        {
            removeView(mTitleLayout);
            mTitleLayout = null;
        } //End block
        {
            addView(view);
        } //End block
        requestLayout();
        // ---------- Original Method ----------
        //if (mCustomView != null) {
            //removeView(mCustomView);
        //}
        //mCustomView = view;
        //if (mTitleLayout != null) {
            //removeView(mTitleLayout);
            //mTitleLayout = null;
        //}
        //if (view != null) {
            //addView(view);
        //}
        //requestLayout();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.883 -0400", hash_original_method = "211EB79F55FBE601162C52B7DDCEAE29", hash_generated_method = "3068752903ECBB84927D6D1A0EFBCED0")
    public void setTitle(CharSequence title) {
        mTitle = title;
        initTitle();
        // ---------- Original Method ----------
        //mTitle = title;
        //initTitle();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.884 -0400", hash_original_method = "7D9357B6D11390EB60D28E00C6F28FA8", hash_generated_method = "B14BABC7DBB2EABEF924921B7507BA92")
    public void setSubtitle(CharSequence subtitle) {
        mSubtitle = subtitle;
        initTitle();
        // ---------- Original Method ----------
        //mSubtitle = subtitle;
        //initTitle();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.884 -0400", hash_original_method = "7D691BCB64236E7B5AF8F6CB0399C091", hash_generated_method = "62D3B5C1188ABDE55B4871B6298E498A")
    public CharSequence getTitle() {
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_1145232871 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1145232871 = mTitle;
        varB4EAC82CA7396A68D541C85D26508E83_1145232871.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1145232871;
        // ---------- Original Method ----------
        //return mTitle;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.885 -0400", hash_original_method = "8334E54E49A430BB5E2CB9D01857CDC7", hash_generated_method = "C0DB8F7D2E6BB18A59AB23F0EC43AE0B")
    public CharSequence getSubtitle() {
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_707844090 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_707844090 = mSubtitle;
        varB4EAC82CA7396A68D541C85D26508E83_707844090.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_707844090;
        // ---------- Original Method ----------
        //return mSubtitle;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.895 -0400", hash_original_method = "790F9E36BA88F469E91A3DDEB8BA7A0E", hash_generated_method = "D0036B9EDC6120BE2178DB87B67931DA")
    private void initTitle() {
        {
            LayoutInflater inflater;
            inflater = LayoutInflater.from(getContext());
            inflater.inflate(R.layout.action_bar_title_item, this);
            mTitleLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            mTitleView = (TextView) mTitleLayout.findViewById(R.id.action_bar_title);
            mSubtitleView = (TextView) mTitleLayout.findViewById(R.id.action_bar_subtitle);
            {
                mTitleView.setTextAppearance(mContext, mTitleStyleRes);
            } //End block
            {
                mSubtitleView.setTextAppearance(mContext, mSubtitleStyleRes);
            } //End block
        } //End block
        mTitleView.setText(mTitle);
        mSubtitleView.setText(mSubtitle);
        boolean hasTitle;
        hasTitle = !TextUtils.isEmpty(mTitle);
        boolean hasSubtitle;
        hasSubtitle = !TextUtils.isEmpty(mSubtitle);
        mSubtitleView.setVisibility(hasSubtitle ? VISIBLE : GONE);
        mTitleLayout.setVisibility(hasTitle || hasSubtitle ? VISIBLE : GONE);
        {
            boolean var3A8301BC648C0D99D98FE6154410787A_823503051 = (mTitleLayout.getParent() == null);
            {
                addView(mTitleLayout);
            } //End block
        } //End collapsed parenthetic
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.897 -0400", hash_original_method = "6CF0CC9D4208F5A3169016F9961CD359", hash_generated_method = "26C9175FF8B2B742C49074F492A50867")
    public void initForMode(final ActionMode mode) {
        {
            LayoutInflater inflater;
            inflater = LayoutInflater.from(mContext);
            mClose = inflater.inflate(R.layout.action_mode_close_item, this, false);
            addView(mClose);
        } //End block
        {
            boolean var3F2B07AD129A1B42F4010FDA38D1B689_1424832517 = (mClose.getParent() == null);
            {
                addView(mClose);
            } //End block
        } //End collapsed parenthetic
        View closeButton;
        closeButton = mClose.findViewById(R.id.action_mode_close_button);
        closeButton.setOnClickListener(new OnClickListener() {            
            @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.896 -0400", hash_original_method = "67B70578F0892507CE1943EF7ED1845C", hash_generated_method = "393BF4B4E68042F128F39E87CE78FB26")
            public void onClick(View v) {
                //DSFIXME:  CODE0009: Possible callback target function detected
                mode.finish();
                addTaint(v.getTaint());
                // ---------- Original Method ----------
                //mode.finish();
            }
});
        MenuBuilder menu;
        menu = (MenuBuilder) mode.getMenu();
        {
            mActionMenuPresenter.dismissPopupMenus();
        } //End block
        mActionMenuPresenter = new ActionMenuPresenter(mContext);
        mActionMenuPresenter.setReserveOverflow(true);
        LayoutParams layoutParams;
        layoutParams = new LayoutParams(LayoutParams.WRAP_CONTENT,
                LayoutParams.MATCH_PARENT);
        {
            menu.addMenuPresenter(mActionMenuPresenter);
            mMenuView = (ActionMenuView) mActionMenuPresenter.getMenuView(this);
            mMenuView.setBackgroundDrawable(null);
            addView(mMenuView, layoutParams);
        } //End block
        {
            mActionMenuPresenter.setWidthLimit(
                    getContext().getResources().getDisplayMetrics().widthPixels, true);
            mActionMenuPresenter.setItemLimit(Integer.MAX_VALUE);
            layoutParams.width = LayoutParams.MATCH_PARENT;
            layoutParams.height = mContentHeight;
            menu.addMenuPresenter(mActionMenuPresenter);
            mMenuView = (ActionMenuView) mActionMenuPresenter.getMenuView(this);
            mMenuView.setBackgroundDrawable(mSplitBackground);
            mSplitView.addView(mMenuView, layoutParams);
        } //End block
        mAnimateInOnLayout = true;
        addTaint(mode.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.900 -0400", hash_original_method = "45A4BF13DB4610A7D54223CBAAD97337", hash_generated_method = "745B8B66475F4A40396395F66FFF9CA0")
    public void closeMode() {
        {
            killMode();
        } //End block
        finishAnimation();
        mAnimationMode = ANIMATE_OUT;
        mCurrentAnimation = makeOutAnimation();
        mCurrentAnimation.start();
        // ---------- Original Method ----------
        //if (mAnimationMode == ANIMATE_OUT) {
            //return;
        //}
        //if (mClose == null) {
            //killMode();
            //return;
        //}
        //finishAnimation();
        //mAnimationMode = ANIMATE_OUT;
        //mCurrentAnimation = makeOutAnimation();
        //mCurrentAnimation.start();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.901 -0400", hash_original_method = "A219535592712D030952E62AEE6B3C28", hash_generated_method = "1F4EA41D6887CB0DF8C3EC659F8BF760")
    private void finishAnimation() {
        Animator a;
        a = mCurrentAnimation;
        {
            mCurrentAnimation = null;
            a.end();
        } //End block
        // ---------- Original Method ----------
        //final Animator a = mCurrentAnimation;
        //if (a != null) {
            //mCurrentAnimation = null;
            //a.end();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.910 -0400", hash_original_method = "2B49C690F775A4BD526B81BD0C8494DB", hash_generated_method = "F8B2017962A97F59AC5932BC0432217E")
    public void killMode() {
        finishAnimation();
        removeAllViews();
        {
            mSplitView.removeView(mMenuView);
        } //End block
        mCustomView = null;
        mMenuView = null;
        mAnimateInOnLayout = false;
        // ---------- Original Method ----------
        //finishAnimation();
        //removeAllViews();
        //if (mSplitView != null) {
            //mSplitView.removeView(mMenuView);
        //}
        //mCustomView = null;
        //mMenuView = null;
        //mAnimateInOnLayout = false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.911 -0400", hash_original_method = "6ECDD9C0917165AAFEF87E5E5EC8B474", hash_generated_method = "B1A3A77E8504A76C966CD8E348761099")
    @Override
    public boolean showOverflowMenu() {
        {
            boolean varE02B1D76FDCE55870555B6FA38688077_1929042017 = (mActionMenuPresenter.showOverflowMenu());
        } //End block
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1508467044 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1508467044;
        // ---------- Original Method ----------
        //if (mActionMenuPresenter != null) {
            //return mActionMenuPresenter.showOverflowMenu();
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.912 -0400", hash_original_method = "5D05982F33AF24415676BD0317DE2206", hash_generated_method = "15C40D53C60A0D039B47D8DE0F8ACF22")
    @Override
    public boolean hideOverflowMenu() {
        {
            boolean var8BAEDFF24230E7488EEC35AEFACB6A9F_2031958212 = (mActionMenuPresenter.hideOverflowMenu());
        } //End block
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1118265023 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1118265023;
        // ---------- Original Method ----------
        //if (mActionMenuPresenter != null) {
            //return mActionMenuPresenter.hideOverflowMenu();
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.913 -0400", hash_original_method = "2F838D8CBDDC91E04D7A8F0F52ABF2C8", hash_generated_method = "86B7194342B078D48F6A92AA5076EE4C")
    @Override
    public boolean isOverflowMenuShowing() {
        {
            boolean varD524E4D1CE3A164128E687BA5686CD0D_1681747312 = (mActionMenuPresenter.isOverflowMenuShowing());
        } //End block
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_502041633 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_502041633;
        // ---------- Original Method ----------
        //if (mActionMenuPresenter != null) {
            //return mActionMenuPresenter.isOverflowMenuShowing();
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.913 -0400", hash_original_method = "73CB5175F40E2B68B8D41267F726F54F", hash_generated_method = "C44C7CE276EE3AFFD2FD76E45EC03AE8")
    @Override
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ViewGroup.LayoutParams varB4EAC82CA7396A68D541C85D26508E83_1285785830 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1285785830 = new MarginLayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
        varB4EAC82CA7396A68D541C85D26508E83_1285785830.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1285785830;
        // ---------- Original Method ----------
        //return new MarginLayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.925 -0400", hash_original_method = "5C07F753B3F2B1F9F4C858C93EDD71AE", hash_generated_method = "0F11F60FB86B4494305CD95E95E364FF")
    @Override
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        ViewGroup.LayoutParams varB4EAC82CA7396A68D541C85D26508E83_1787313110 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1787313110 = new MarginLayoutParams(getContext(), attrs);
        addTaint(attrs.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1787313110.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1787313110;
        // ---------- Original Method ----------
        //return new MarginLayoutParams(getContext(), attrs);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.931 -0400", hash_original_method = "ADE259D11B02655AAFB5EBCEC641AC5E", hash_generated_method = "7A5DC6E9675C4915B630A7C2055B63DA")
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        int widthMode;
        widthMode = MeasureSpec.getMode(widthMeasureSpec);
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalStateException(getClass().getSimpleName() + " can only be used " +
                    "with android:layout_width=\"match_parent\" (or fill_parent)");
        } //End block
        int heightMode;
        heightMode = MeasureSpec.getMode(heightMeasureSpec);
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalStateException(getClass().getSimpleName() + " can only be used " +
                    "with android:layout_height=\"wrap_content\"");
        } //End block
        int contentWidth;
        contentWidth = MeasureSpec.getSize(widthMeasureSpec);
        int maxHeight;
        maxHeight = mContentHeight;
        maxHeight = MeasureSpec.getSize(heightMeasureSpec);
        int verticalPadding;
        verticalPadding = getPaddingTop() + getPaddingBottom();
        int availableWidth;
        availableWidth = contentWidth - getPaddingLeft() - getPaddingRight();
        int height;
        height = maxHeight - verticalPadding;
        int childSpecHeight;
        childSpecHeight = MeasureSpec.makeMeasureSpec(height, MeasureSpec.AT_MOST);
        {
            availableWidth = measureChildView(mClose, availableWidth, childSpecHeight, 0);
            MarginLayoutParams lp;
            lp = (MarginLayoutParams) mClose.getLayoutParams();
            availableWidth -= lp.leftMargin + lp.rightMargin;
        } //End block
        {
            boolean var1178C40D6B4B3394C757D204E5BDCC27_921906598 = (mMenuView != null && mMenuView.getParent() == this);
            {
                availableWidth = measureChildView(mMenuView, availableWidth,
                    childSpecHeight, 0);
            } //End block
        } //End collapsed parenthetic
        {
            availableWidth = measureChildView(mTitleLayout, availableWidth, childSpecHeight, 0);
        } //End block
        {
            ViewGroup.LayoutParams lp;
            lp = mCustomView.getLayoutParams();
            int customWidthMode;
            customWidthMode = MeasureSpec.EXACTLY;
            customWidthMode = MeasureSpec.AT_MOST;
            int customWidth;
            customWidth = Math.min(lp.width, availableWidth);
            customWidth = availableWidth;
            int customHeightMode;
            customHeightMode = MeasureSpec.EXACTLY;
            customHeightMode = MeasureSpec.AT_MOST;
            int customHeight;
            customHeight = Math.min(lp.height, height);
            customHeight = height;
            mCustomView.measure(MeasureSpec.makeMeasureSpec(customWidth, customWidthMode),
                    MeasureSpec.makeMeasureSpec(customHeight, customHeightMode));
        } //End block
        {
            int measuredHeight;
            measuredHeight = 0;
            int count;
            count = getChildCount();
            {
                int i;
                i = 0;
                {
                    View v;
                    v = getChildAt(i);
                    int paddedViewHeight;
                    paddedViewHeight = v.getMeasuredHeight() + verticalPadding;
                    {
                        measuredHeight = paddedViewHeight;
                    } //End block
                } //End block
            } //End collapsed parenthetic
            setMeasuredDimension(contentWidth, measuredHeight);
        } //End block
        {
            setMeasuredDimension(contentWidth, maxHeight);
        } //End block
        addTaint(widthMeasureSpec);
        addTaint(heightMeasureSpec);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.932 -0400", hash_original_method = "1F1E13F5C24EF6D24D9BF3983118D5E2", hash_generated_method = "BF6AA40883577BAA6D8F6DC6D6E4B607")
    private Animator makeInAnimation() {
        Animator varB4EAC82CA7396A68D541C85D26508E83_1040633449 = null; //Variable for return #1
        mClose.setTranslationX(-mClose.getWidth() -
                ((MarginLayoutParams) mClose.getLayoutParams()).leftMargin);
        ObjectAnimator buttonAnimator;
        buttonAnimator = ObjectAnimator.ofFloat(mClose, "translationX", 0);
        buttonAnimator.setDuration(200);
        buttonAnimator.addListener(this);
        buttonAnimator.setInterpolator(new DecelerateInterpolator());
        AnimatorSet set;
        set = new AnimatorSet();
        AnimatorSet.Builder b;
        b = set.play(buttonAnimator);
        {
            int count;
            count = mMenuView.getChildCount();
            {
                {
                    int i, j;
                    i = count - 1;
                    j = 0;
                    {
                        View child;
                        child = mMenuView.getChildAt(i);
                        child.setScaleY(0);
                        ObjectAnimator a;
                        a = ObjectAnimator.ofFloat(child, "scaleY", 0, 1);
                        a.setDuration(100);
                        a.setStartDelay(j * 70);
                        b.with(a);
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1040633449 = set;
        varB4EAC82CA7396A68D541C85D26508E83_1040633449.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1040633449;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.945 -0400", hash_original_method = "BAA3822313887C49DB18D4BC04440E7E", hash_generated_method = "1235A2CDF8A44C2671537785AF86781E")
    private Animator makeOutAnimation() {
        Animator varB4EAC82CA7396A68D541C85D26508E83_303735155 = null; //Variable for return #1
        ObjectAnimator buttonAnimator;
        buttonAnimator = ObjectAnimator.ofFloat(mClose, "translationX",
                -mClose.getWidth() - ((MarginLayoutParams) mClose.getLayoutParams()).leftMargin);
        buttonAnimator.setDuration(200);
        buttonAnimator.addListener(this);
        buttonAnimator.setInterpolator(new DecelerateInterpolator());
        AnimatorSet set;
        set = new AnimatorSet();
        AnimatorSet.Builder b;
        b = set.play(buttonAnimator);
        {
            int count;
            count = mMenuView.getChildCount();
            {
                {
                    int i;
                    i = 0;
                    {
                        View child;
                        child = mMenuView.getChildAt(i);
                        child.setScaleY(0);
                        ObjectAnimator a;
                        a = ObjectAnimator.ofFloat(child, "scaleY", 0);
                        a.setDuration(100);
                        a.setStartDelay(i * 70);
                        b.with(a);
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_303735155 = set;
        varB4EAC82CA7396A68D541C85D26508E83_303735155.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_303735155;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.946 -0400", hash_original_method = "EAC754957749E93A677F7BF2F54929F7", hash_generated_method = "735F724BFC3955FFCB631FBAA22477E2")
    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        int x;
        x = getPaddingLeft();
        int y;
        y = getPaddingTop();
        int contentHeight;
        contentHeight = b - t - getPaddingTop() - getPaddingBottom();
        {
            boolean var8961E9B959AFEC04EA20AF6092DB526E_1982285082 = (mClose != null && mClose.getVisibility() != GONE);
            {
                MarginLayoutParams lp;
                lp = (MarginLayoutParams) mClose.getLayoutParams();
                x += lp.leftMargin;
                x += positionChild(mClose, x, y, contentHeight);
                x += lp.rightMargin;
                {
                    mAnimationMode = ANIMATE_IN;
                    mCurrentAnimation = makeInAnimation();
                    mCurrentAnimation.start();
                    mAnimateInOnLayout = false;
                } //End block
            } //End block
        } //End collapsed parenthetic
        {
            x += positionChild(mTitleLayout, x, y, contentHeight);
        } //End block
        {
            x += positionChild(mCustomView, x, y, contentHeight);
        } //End block
        x = r - l - getPaddingRight();
        {
            x -= positionChildInverse(mMenuView, x, y, contentHeight);
        } //End block
        addTaint(changed);
        addTaint(l);
        addTaint(t);
        addTaint(r);
        addTaint(b);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.946 -0400", hash_original_method = "B990D1A680B01C8A5486D22741D7E96B", hash_generated_method = "B2B2A92B36E552BECB72262238AEF578")
    @Override
    public void onAnimationStart(Animator animation) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(animation.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.955 -0400", hash_original_method = "5DF138862D9EBBC48B8DDB31E593969C", hash_generated_method = "A4EB3E1952AEDA6F52397D481FF73618")
    @Override
    public void onAnimationEnd(Animator animation) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        {
            killMode();
        } //End block
        mAnimationMode = ANIMATE_IDLE;
        addTaint(animation.getTaint());
        // ---------- Original Method ----------
        //if (mAnimationMode == ANIMATE_OUT) {
            //killMode();
        //}
        //mAnimationMode = ANIMATE_IDLE;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.956 -0400", hash_original_method = "16FF962612CA0CC38B4765F38064800C", hash_generated_method = "87B148FBA6A6D3270D8BD7F9EEB4C6C1")
    @Override
    public void onAnimationCancel(Animator animation) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(animation.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.956 -0400", hash_original_method = "FA58700A4888ED9E658B43737D17A966", hash_generated_method = "4BE2C3EAC3B10B8BD5CE86F0E3077935")
    @Override
    public void onAnimationRepeat(Animator animation) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(animation.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.956 -0400", hash_original_method = "9DA99B4E01A506E72BA59AF598A3C38D", hash_generated_method = "5BEEB6820DE5DFF785684CA71D230761")
    @Override
    public boolean shouldDelayChildPressedState() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1589085636 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1589085636;
        // ---------- Original Method ----------
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.957 -0400", hash_original_method = "237F1A60A9E9685B4EADEDCFF21B9A19", hash_generated_method = "D13C8EE11E6B9CBA0697F855A82AD48F")
    @Override
    public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        {
            boolean varC84EC12C0993677C63B7E5F379D6D168_59291317 = (event.getEventType() == AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED);
            {
                event.setSource(this);
                event.setClassName(getClass().getName());
                event.setPackageName(getContext().getPackageName());
                event.setContentDescription(mTitle);
            } //End block
            {
                super.onInitializeAccessibilityEvent(event);
            } //End block
        } //End collapsed parenthetic
        addTaint(event.getTaint());
        // ---------- Original Method ----------
        //if (event.getEventType() == AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED) {
            //event.setSource(this);
            //event.setClassName(getClass().getName());
            //event.setPackageName(getContext().getPackageName());
            //event.setContentDescription(mTitle);
        //} else {
            //super.onInitializeAccessibilityEvent(event);
        //}
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.957 -0400", hash_original_field = "739489FAD6929E44E2450E802B918903", hash_generated_field = "3C64AF1E569A0A3F28E47812DD15F8C9")

    private static String TAG = "ActionBarContextView";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.958 -0400", hash_original_field = "AF00BC2BF674D3EFAB3DFBD00DBA4532", hash_generated_field = "C727E330DEFB6AF0448E759D562731AF")

    private static int ANIMATE_IDLE = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.958 -0400", hash_original_field = "3C1F5798ED90853371F7E27F97227A2D", hash_generated_field = "28145639A9E95CA5A857EBEBFBD7FCBE")

    private static int ANIMATE_IN = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:26.958 -0400", hash_original_field = "12EBE1750465D044EFC402BA687119AE", hash_generated_field = "2AFE78B43057E021BDC7C37069039BB5")

    private static int ANIMATE_OUT = 2;
}

