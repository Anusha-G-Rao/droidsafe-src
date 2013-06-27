package android.widget;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import com.android.internal.R;
import android.app.LocalActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.SoundEffectConstants;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.util.ArrayList;
import java.util.List;

public class TabHost extends FrameLayout implements ViewTreeObserver.OnTouchModeChangeListener {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.360 -0400", hash_original_field = "BD9EB412161EDE3095E73C7561A13D17", hash_generated_field = "216F44777CE4F68AB739BEBE93C294F9")

    private TabWidget mTabWidget;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.360 -0400", hash_original_field = "A7F1EA497040BBFBF8BE2A90A6E0B6E4", hash_generated_field = "77FD3C218A6BAD9F714CE5CA95EA4CA6")

    private FrameLayout mTabContent;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.360 -0400", hash_original_field = "E7320822C44EB689BE7746CC6AF343CE", hash_generated_field = "2D97E88ACCB60806D13703DBDD6845B4")

    private List<TabSpec> mTabSpecs = new ArrayList<TabSpec>(2);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.360 -0400", hash_original_field = "8BAB9D447E0B22F1F61BB3F1E7AC6396", hash_generated_field = "EBF64AB6B735156C87B0B9A0231F6E50")

    protected int mCurrentTab = -1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.360 -0400", hash_original_field = "C3E9C3C3B19D7F8BF41317696660FE8C", hash_generated_field = "C8EB085B592C5D26A6E1BFD0C692443B")

    private View mCurrentView = null;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.360 -0400", hash_original_field = "B950898C2FC7B46BB242C0B79D705704", hash_generated_field = "F5E4EFC7C2394AFB77154901FF2FBDDE")

    protected LocalActivityManager mLocalActivityManager = null;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.360 -0400", hash_original_field = "D55E0A212E5BEA43B1240B875AEBE97B", hash_generated_field = "6248C12AC19AE72AAA3A94E933F7A0A8")

    private OnTabChangeListener mOnTabChangeListener;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.360 -0400", hash_original_field = "EBC9C1440F16CAD95197DE77BA132C75", hash_generated_field = "91D7CD0B364B56EF4F58B7B937977D5A")

    private OnKeyListener mTabKeyListener;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.360 -0400", hash_original_field = "CB97DAC54535B44E8FF0A143C043A85A", hash_generated_field = "EC3CB9EB63ECAC6215AE20410DD9CC0F")

    private int mTabLayoutId;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.371 -0400", hash_original_method = "81177E2AB2CE2AADA9E4D9B57D5EE61E", hash_generated_method = "7B6726996C34C72B3A6F94B903C7DC5E")
    public  TabHost(Context context) {
        super(context);
        initTabHost();
        addTaint(context.getTaint());
        // ---------- Original Method ----------
        //initTabHost();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.371 -0400", hash_original_method = "6A9D0785655056C88014FFCBE8AF5DF8", hash_generated_method = "F4136316DB9089906020D30DFC0AD3CF")
    public  TabHost(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray a;
        a = context.obtainStyledAttributes(attrs,
                com.android.internal.R.styleable.TabWidget,
                com.android.internal.R.attr.tabWidgetStyle, 0);
        mTabLayoutId = a.getResourceId(R.styleable.TabWidget_tabLayout, 0);
        a.recycle();
        {
            mTabLayoutId = R.layout.tab_indicator_holo;
        } //End block
        initTabHost();
        addTaint(context.getTaint());
        addTaint(attrs.getTaint());
        // ---------- Original Method ----------
        //TypedArray a = context.obtainStyledAttributes(attrs,
                //com.android.internal.R.styleable.TabWidget,
                //com.android.internal.R.attr.tabWidgetStyle, 0);
        //mTabLayoutId = a.getResourceId(R.styleable.TabWidget_tabLayout, 0);
        //a.recycle();
        //if (mTabLayoutId == 0) {
            //mTabLayoutId = R.layout.tab_indicator_holo;
        //}
        //initTabHost();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.380 -0400", hash_original_method = "E225D110F749DDFECF8013DBC90AF66D", hash_generated_method = "AFD8B2E46F167093444B29ADE7F14CDB")
    private void initTabHost() {
        setFocusableInTouchMode(true);
        setDescendantFocusability(FOCUS_AFTER_DESCENDANTS);
        mCurrentTab = -1;
        mCurrentView = null;
        // ---------- Original Method ----------
        //setFocusableInTouchMode(true);
        //setDescendantFocusability(FOCUS_AFTER_DESCENDANTS);
        //mCurrentTab = -1;
        //mCurrentView = null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.381 -0400", hash_original_method = "9E260D3987C01C55D906A5443FE1F250", hash_generated_method = "DAC89ED971EF468F9ADA878306930DAF")
    public TabSpec newTabSpec(String tag) {
        TabSpec varB4EAC82CA7396A68D541C85D26508E83_2001053593 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_2001053593 = new TabSpec(tag);
        addTaint(tag.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_2001053593.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_2001053593;
        // ---------- Original Method ----------
        //return new TabSpec(tag);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.383 -0400", hash_original_method = "11DAEE90670B382AFFC7A5048665264E", hash_generated_method = "E80C6633539607FA0C975E11FBA8B14E")
    public void setup() {
        mTabWidget = (TabWidget) findViewById(com.android.internal.R.id.tabs);
        {
            if (DroidSafeAndroidRuntime.control) throw new RuntimeException(
                    "Your TabHost must have a TabWidget whose id attribute is 'android.R.id.tabs'");
        } //End block
        mTabKeyListener = new OnKeyListener() {            
            @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.382 -0400", hash_original_method = "C0EA49319FD8B41812699E631E771535", hash_generated_method = "593FA893035578B9506B1A176CA3F1C2")
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                //DSFIXME:  CODE0009: Possible callback target function detected
                mTabContent.requestFocus(View.FOCUS_FORWARD);
                boolean var84776A3E24D16F690695F1BDA914A798_1785950350 = (mTabContent.dispatchKeyEvent(event));
                addTaint(v.getTaint());
                addTaint(keyCode);
                addTaint(event.getTaint());
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_880044940 = getTaintBoolean();
                return var84E2C64F38F78BA3EA5C905AB5A2DA27_880044940;
                // ---------- Original Method ----------
                //switch (keyCode) {
                    //case KeyEvent.KEYCODE_DPAD_CENTER:
                    //case KeyEvent.KEYCODE_DPAD_LEFT:
                    //case KeyEvent.KEYCODE_DPAD_RIGHT:
                    //case KeyEvent.KEYCODE_DPAD_UP:
                    //case KeyEvent.KEYCODE_DPAD_DOWN:
                    //case KeyEvent.KEYCODE_ENTER:
                        //return false;
                //}
                //mTabContent.requestFocus(View.FOCUS_FORWARD);
                //return mTabContent.dispatchKeyEvent(event);
            }
};
        mTabWidget.setTabSelectionListener(new TabWidget.OnTabSelectionChanged() {            
            @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.382 -0400", hash_original_method = "A259B917D04BDEAF062BC2DB0803EBFA", hash_generated_method = "A5C09CDF9E6C00F459BEFBC10A2C1E66")
            public void onTabSelectionChanged(int tabIndex, boolean clicked) {
                //DSFIXME:  CODE0009: Possible callback target function detected
                setCurrentTab(tabIndex);
                {
                    mTabContent.requestFocus(View.FOCUS_FORWARD);
                } //End block
                addTaint(tabIndex);
                addTaint(clicked);
                // ---------- Original Method ----------
                //setCurrentTab(tabIndex);
                //if (clicked) {
                    //mTabContent.requestFocus(View.FOCUS_FORWARD);
                //}
            }
});
        mTabContent = (FrameLayout) findViewById(com.android.internal.R.id.tabcontent);
        {
            if (DroidSafeAndroidRuntime.control) throw new RuntimeException(
                    "Your TabHost must have a FrameLayout whose id attribute is "
                            + "'android.R.id.tabcontent'");
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.383 -0400", hash_original_method = "F557CD251A66C23831BE55ECFE0FD6EB", hash_generated_method = "6A09BD8EA53A915AB5F822E12CBC5F98")
    @Override
    public void sendAccessibilityEvent(int eventType) {
        addTaint(eventType);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.383 -0400", hash_original_method = "7224354A386E6E21E9006426BE4B5FE4", hash_generated_method = "DB89070E35CFC42DA1D1C60F5FB06ED5")
    public void setup(LocalActivityManager activityGroup) {
        setup();
        mLocalActivityManager = activityGroup;
        // ---------- Original Method ----------
        //setup();
        //mLocalActivityManager = activityGroup;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.383 -0400", hash_original_method = "1749A697E4E6C7318205DA9AE02BC223", hash_generated_method = "6361F15A7CB7EDAB03D0B493BE2DBDE0")
    @Override
    protected void onAttachedToWindow() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        super.onAttachedToWindow();
        ViewTreeObserver treeObserver;
        treeObserver = getViewTreeObserver();
        treeObserver.addOnTouchModeChangeListener(this);
        // ---------- Original Method ----------
        //super.onAttachedToWindow();
        //final ViewTreeObserver treeObserver = getViewTreeObserver();
        //treeObserver.addOnTouchModeChangeListener(this);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.396 -0400", hash_original_method = "56196D931FB093B5A1146C07A075CA12", hash_generated_method = "5EE2308C8C0163F9966B1CB2A884B020")
    @Override
    protected void onDetachedFromWindow() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        super.onDetachedFromWindow();
        ViewTreeObserver treeObserver;
        treeObserver = getViewTreeObserver();
        treeObserver.removeOnTouchModeChangeListener(this);
        // ---------- Original Method ----------
        //super.onDetachedFromWindow();
        //final ViewTreeObserver treeObserver = getViewTreeObserver();
        //treeObserver.removeOnTouchModeChangeListener(this);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.396 -0400", hash_original_method = "F30EBD0BC50E7240BEF5418DD0D95D1E", hash_generated_method = "E572B348CF632C5A4F02327C8A1C49FE")
    public void onTouchModeChanged(boolean isInTouchMode) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        {
            {
                boolean var831653FF85910083C1125271194BD078_664026774 = (mCurrentView != null && (!mCurrentView.hasFocus() || mCurrentView.isFocused()));
                {
                    mTabWidget.getChildTabViewAt(mCurrentTab).requestFocus();
                } //End block
            } //End collapsed parenthetic
        } //End block
        addTaint(isInTouchMode);
        // ---------- Original Method ----------
        //if (!isInTouchMode) {
            //if (mCurrentView != null && (!mCurrentView.hasFocus() || mCurrentView.isFocused())) {
                //mTabWidget.getChildTabViewAt(mCurrentTab).requestFocus();
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.397 -0400", hash_original_method = "7B3B3CDC4F6E22F75BE659816FB8A96F", hash_generated_method = "8DB69975278516F72B410DB0F6172A08")
    public void addTab(TabSpec tabSpec) {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("you must specify a way to create the tab indicator.");
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("you must specify a way to create the tab content");
        } //End block
        View tabIndicator;
        tabIndicator = tabSpec.mIndicatorStrategy.createIndicatorView();
        tabIndicator.setOnKeyListener(mTabKeyListener);
        {
            mTabWidget.setStripEnabled(false);
        } //End block
        mTabWidget.addView(tabIndicator);
        mTabSpecs.add(tabSpec);
        {
            setCurrentTab(0);
        } //End block
        addTaint(tabSpec.getTaint());
        // ---------- Original Method ----------
        //if (tabSpec.mIndicatorStrategy == null) {
            //throw new IllegalArgumentException("you must specify a way to create the tab indicator.");
        //}
        //if (tabSpec.mContentStrategy == null) {
            //throw new IllegalArgumentException("you must specify a way to create the tab content");
        //}
        //View tabIndicator = tabSpec.mIndicatorStrategy.createIndicatorView();
        //tabIndicator.setOnKeyListener(mTabKeyListener);
        //if (tabSpec.mIndicatorStrategy instanceof ViewIndicatorStrategy) {
            //mTabWidget.setStripEnabled(false);
        //}
        //mTabWidget.addView(tabIndicator);
        //mTabSpecs.add(tabSpec);
        //if (mCurrentTab == -1) {
            //setCurrentTab(0);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.397 -0400", hash_original_method = "FE75A14568F4641ABF7C1D51B3B055E3", hash_generated_method = "EDB41B266040C47F9666482EE95C9A5D")
    public void clearAllTabs() {
        mTabWidget.removeAllViews();
        initTabHost();
        mTabContent.removeAllViews();
        mTabSpecs.clear();
        requestLayout();
        invalidate();
        // ---------- Original Method ----------
        //mTabWidget.removeAllViews();
        //initTabHost();
        //mTabContent.removeAllViews();
        //mTabSpecs.clear();
        //requestLayout();
        //invalidate();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.398 -0400", hash_original_method = "43D996FE1B0AF9FB74C6533DD719F381", hash_generated_method = "620EA051588E9079BC11982D3C2D6AD1")
    public TabWidget getTabWidget() {
        TabWidget varB4EAC82CA7396A68D541C85D26508E83_2128255397 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_2128255397 = mTabWidget;
        varB4EAC82CA7396A68D541C85D26508E83_2128255397.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_2128255397;
        // ---------- Original Method ----------
        //return mTabWidget;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.398 -0400", hash_original_method = "715443AB3E5984F89EAA89C58AA4B1A0", hash_generated_method = "2F0F21893DEF86F8D152A289A2CC564D")
    public int getCurrentTab() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1099189828 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1099189828;
        // ---------- Original Method ----------
        //return mCurrentTab;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.398 -0400", hash_original_method = "4BF4FAE03E9E8C0B1DA1E933710D00F0", hash_generated_method = "D6CDFDF8F4FDF80BD2D19E60627778B6")
    public String getCurrentTabTag() {
        String varB4EAC82CA7396A68D541C85D26508E83_2027876001 = null; //Variable for return #1
        String varB4EAC82CA7396A68D541C85D26508E83_478143885 = null; //Variable for return #2
        {
            boolean varBFF1B1E49A84DE64A6516F714FB4E748_337593573 = (mCurrentTab >= 0 && mCurrentTab < mTabSpecs.size());
            {
                varB4EAC82CA7396A68D541C85D26508E83_2027876001 = mTabSpecs.get(mCurrentTab).getTag();
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_478143885 = null;
        String varA7E53CE21691AB073D9660D615818899_1951757021; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1951757021 = varB4EAC82CA7396A68D541C85D26508E83_2027876001;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1951757021 = varB4EAC82CA7396A68D541C85D26508E83_478143885;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1951757021.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1951757021;
        // ---------- Original Method ----------
        //if (mCurrentTab >= 0 && mCurrentTab < mTabSpecs.size()) {
            //return mTabSpecs.get(mCurrentTab).getTag();
        //}
        //return null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.399 -0400", hash_original_method = "42AE505B98E20EE6CD2716BFC7687421", hash_generated_method = "21B9DEB221A6044E0D6BE98EBCA5A99E")
    public View getCurrentTabView() {
        View varB4EAC82CA7396A68D541C85D26508E83_818793853 = null; //Variable for return #1
        View varB4EAC82CA7396A68D541C85D26508E83_1058095703 = null; //Variable for return #2
        {
            boolean varBFF1B1E49A84DE64A6516F714FB4E748_1277144335 = (mCurrentTab >= 0 && mCurrentTab < mTabSpecs.size());
            {
                varB4EAC82CA7396A68D541C85D26508E83_818793853 = mTabWidget.getChildTabViewAt(mCurrentTab);
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_1058095703 = null;
        View varA7E53CE21691AB073D9660D615818899_1366647949; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1366647949 = varB4EAC82CA7396A68D541C85D26508E83_818793853;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1366647949 = varB4EAC82CA7396A68D541C85D26508E83_1058095703;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1366647949.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1366647949;
        // ---------- Original Method ----------
        //if (mCurrentTab >= 0 && mCurrentTab < mTabSpecs.size()) {
            //return mTabWidget.getChildTabViewAt(mCurrentTab);
        //}
        //return null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.399 -0400", hash_original_method = "EEE501665EA90FABC7BF921A8CA32190", hash_generated_method = "202BB6B78261DDC08A68A204D3F778E2")
    public View getCurrentView() {
        View varB4EAC82CA7396A68D541C85D26508E83_1732068703 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1732068703 = mCurrentView;
        varB4EAC82CA7396A68D541C85D26508E83_1732068703.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1732068703;
        // ---------- Original Method ----------
        //return mCurrentView;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.411 -0400", hash_original_method = "8C15D02B8DC442237A4CA8C57AA1B8BD", hash_generated_method = "50BE948BC444F4A36C5D60D5CC3DA33B")
    public void setCurrentTabByTag(String tag) {
        int i;
        {
            i = 0;
            boolean varCC2648CD231FCF0E751F3AB31AA7004F_349092901 = (i < mTabSpecs.size());
            {
                {
                    boolean var4DA02596B8000A9C8E71A047104AEF87_1061987911 = (mTabSpecs.get(i).getTag().equals(tag));
                    {
                        setCurrentTab(i);
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        addTaint(tag.getTaint());
        // ---------- Original Method ----------
        //int i;
        //for (i = 0; i < mTabSpecs.size(); i++) {
            //if (mTabSpecs.get(i).getTag().equals(tag)) {
                //setCurrentTab(i);
                //break;
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.416 -0400", hash_original_method = "14B19444D2789515B31F45C4D21A2D48", hash_generated_method = "C41839D02D9F05038C485AB675EB4BC1")
    public FrameLayout getTabContentView() {
        FrameLayout varB4EAC82CA7396A68D541C85D26508E83_662149656 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_662149656 = mTabContent;
        varB4EAC82CA7396A68D541C85D26508E83_662149656.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_662149656;
        // ---------- Original Method ----------
        //return mTabContent;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.418 -0400", hash_original_method = "C8998AD47D2F3EF23C8F7D2AD28B98AB", hash_generated_method = "3FBD43EC57BDF76D2B39097E722D0712")
    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        boolean handled;
        handled = super.dispatchKeyEvent(event);
        {
            boolean var41B10C3D99F27CC71ABED2060C2015FB_1815679483 = (!handled
                && (event.getAction() == KeyEvent.ACTION_DOWN)
                && (event.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP)
                && (mCurrentView != null)
                && (mCurrentView.isRootNamespace())
                && (mCurrentView.hasFocus())
                && (mCurrentView.findFocus().focusSearch(View.FOCUS_UP) == null));
            {
                mTabWidget.getChildTabViewAt(mCurrentTab).requestFocus();
                playSoundEffect(SoundEffectConstants.NAVIGATION_UP);
            } //End block
        } //End collapsed parenthetic
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_63487923 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_63487923;
        // ---------- Original Method ----------
        //final boolean handled = super.dispatchKeyEvent(event);
        //if (!handled
                //&& (event.getAction() == KeyEvent.ACTION_DOWN)
                //&& (event.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP)
                //&& (mCurrentView != null)
                //&& (mCurrentView.isRootNamespace())
                //&& (mCurrentView.hasFocus())
                //&& (mCurrentView.findFocus().focusSearch(View.FOCUS_UP) == null)) {
            //mTabWidget.getChildTabViewAt(mCurrentTab).requestFocus();
            //playSoundEffect(SoundEffectConstants.NAVIGATION_UP);
            //return true;
        //}
        //return handled;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.420 -0400", hash_original_method = "96A22F6DD8439F6A02086A8F9D6622C9", hash_generated_method = "544E2E74B4D3F9B2265C2BE462ED504B")
    @Override
    public void dispatchWindowFocusChanged(boolean hasFocus) {
        {
            mCurrentView.dispatchWindowFocusChanged(hasFocus);
        } //End block
        addTaint(hasFocus);
        // ---------- Original Method ----------
        //if (mCurrentView != null){
            //mCurrentView.dispatchWindowFocusChanged(hasFocus);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.426 -0400", hash_original_method = "E2648DF1C44758803127AAF509A8077D", hash_generated_method = "8D7216C76BCE7239E547FA9FFD81EAA6")
    public void setCurrentTab(int index) {
        {
            boolean var12DC1F26A8790AE5636794CCB058F3B4_1809574526 = (index < 0 || index >= mTabSpecs.size());
        } //End collapsed parenthetic
        {
            mTabSpecs.get(mCurrentTab).mContentStrategy.tabClosed();
        } //End block
        mCurrentTab = index;
        TabHost.TabSpec spec;
        spec = mTabSpecs.get(index);
        mTabWidget.focusCurrentTab(mCurrentTab);
        mCurrentView = spec.mContentStrategy.getContentView();
        {
            boolean var276B63A14B830ADCE0115FB1D65C890A_2014774800 = (mCurrentView.getParent() == null);
            {
                mTabContent
                    .addView(
                            mCurrentView,
                            new ViewGroup.LayoutParams(
                                    ViewGroup.LayoutParams.MATCH_PARENT,
                                    ViewGroup.LayoutParams.MATCH_PARENT));
            } //End block
        } //End collapsed parenthetic
        {
            boolean varE1415C6CB1A85A422D5231164E146792_348720449 = (!mTabWidget.hasFocus());
            {
                mCurrentView.requestFocus();
            } //End block
        } //End collapsed parenthetic
        invokeOnTabChangeListener();
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.435 -0400", hash_original_method = "CAD2636558BA92FD3B25434077F437FA", hash_generated_method = "81BDC8026576E158152F1D6A433CB82E")
    public void setOnTabChangedListener(OnTabChangeListener l) {
        mOnTabChangeListener = l;
        // ---------- Original Method ----------
        //mOnTabChangeListener = l;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.435 -0400", hash_original_method = "1A4924ED406293CF6C6A6C1455DF4ECD", hash_generated_method = "635546385617DF117EBD1474C0C10777")
    private void invokeOnTabChangeListener() {
        {
            mOnTabChangeListener.onTabChanged(getCurrentTabTag());
        } //End block
        // ---------- Original Method ----------
        //if (mOnTabChangeListener != null) {
            //mOnTabChangeListener.onTabChanged(getCurrentTabTag());
        //}
    }

    
    public class TabSpec {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.435 -0400", hash_original_field = "07496860B5C53FDD66588727158D5F73", hash_generated_field = "0950070738D23525D6B35F116326FC98")

        private String mTag;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.435 -0400", hash_original_field = "DF854942C9043CEFD4BEC608F0EA2575", hash_generated_field = "50BB928D871FCE30C43D2A945AFF6AB0")

        private IndicatorStrategy mIndicatorStrategy;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.435 -0400", hash_original_field = "8514227FF9072119B8C98F24E4C63792", hash_generated_field = "D26BEBF611E08BB218DC29C4D4842A86")

        private ContentStrategy mContentStrategy;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.435 -0400", hash_original_method = "B448A25FB17665A97225C3E034B27800", hash_generated_method = "8C52576964B21F07DD2BCCD9B11DF51C")
        private  TabSpec(String tag) {
            mTag = tag;
            // ---------- Original Method ----------
            //mTag = tag;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.436 -0400", hash_original_method = "5E409F9D1F2DECB24B35FF4D25A5BAE5", hash_generated_method = "B4B75680123C048F700B24600A6CCE42")
        public TabSpec setIndicator(CharSequence label) {
            TabSpec varB4EAC82CA7396A68D541C85D26508E83_1314844620 = null; //Variable for return #1
            mIndicatorStrategy = new LabelIndicatorStrategy(label);
            varB4EAC82CA7396A68D541C85D26508E83_1314844620 = this;
            varB4EAC82CA7396A68D541C85D26508E83_1314844620.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_1314844620;
            // ---------- Original Method ----------
            //mIndicatorStrategy = new LabelIndicatorStrategy(label);
            //return this;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.437 -0400", hash_original_method = "23880839A48B028850E58B36E2EDF15E", hash_generated_method = "97053F400A61FDB013679A2B13A11C3D")
        public TabSpec setIndicator(CharSequence label, Drawable icon) {
            TabSpec varB4EAC82CA7396A68D541C85D26508E83_52749048 = null; //Variable for return #1
            mIndicatorStrategy = new LabelAndIconIndicatorStrategy(label, icon);
            varB4EAC82CA7396A68D541C85D26508E83_52749048 = this;
            varB4EAC82CA7396A68D541C85D26508E83_52749048.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_52749048;
            // ---------- Original Method ----------
            //mIndicatorStrategy = new LabelAndIconIndicatorStrategy(label, icon);
            //return this;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.438 -0400", hash_original_method = "BD5297BEFA4518E605FA03EA203960DD", hash_generated_method = "87A80E59CC89CB7065C9071261EEE323")
        public TabSpec setIndicator(View view) {
            TabSpec varB4EAC82CA7396A68D541C85D26508E83_2137482661 = null; //Variable for return #1
            mIndicatorStrategy = new ViewIndicatorStrategy(view);
            varB4EAC82CA7396A68D541C85D26508E83_2137482661 = this;
            varB4EAC82CA7396A68D541C85D26508E83_2137482661.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_2137482661;
            // ---------- Original Method ----------
            //mIndicatorStrategy = new ViewIndicatorStrategy(view);
            //return this;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.438 -0400", hash_original_method = "4C505DBFF1019A4E7D7D5286BB033694", hash_generated_method = "2B87C531A1FC6975B81C454CF9CE11AB")
        public TabSpec setContent(int viewId) {
            TabSpec varB4EAC82CA7396A68D541C85D26508E83_553648301 = null; //Variable for return #1
            mContentStrategy = new ViewIdContentStrategy(viewId);
            varB4EAC82CA7396A68D541C85D26508E83_553648301 = this;
            varB4EAC82CA7396A68D541C85D26508E83_553648301.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_553648301;
            // ---------- Original Method ----------
            //mContentStrategy = new ViewIdContentStrategy(viewId);
            //return this;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.447 -0400", hash_original_method = "B29A01466A3B1FB70EA06E4B795F088E", hash_generated_method = "D1D66461E692A6DC83B7793D7BFFB40D")
        public TabSpec setContent(TabContentFactory contentFactory) {
            TabSpec varB4EAC82CA7396A68D541C85D26508E83_1351081613 = null; //Variable for return #1
            mContentStrategy = new FactoryContentStrategy(mTag, contentFactory);
            varB4EAC82CA7396A68D541C85D26508E83_1351081613 = this;
            varB4EAC82CA7396A68D541C85D26508E83_1351081613.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_1351081613;
            // ---------- Original Method ----------
            //mContentStrategy = new FactoryContentStrategy(mTag, contentFactory);
            //return this;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.511 -0400", hash_original_method = "0D57BE6053E1E40100589C46AD4E8491", hash_generated_method = "FCA175C1C4516A12E20297C297AB82BA")
        public TabSpec setContent(Intent intent) {
            TabSpec varB4EAC82CA7396A68D541C85D26508E83_1133572712 = null; //Variable for return #1
            mContentStrategy = new IntentContentStrategy(mTag, intent);
            varB4EAC82CA7396A68D541C85D26508E83_1133572712 = this;
            varB4EAC82CA7396A68D541C85D26508E83_1133572712.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_1133572712;
            // ---------- Original Method ----------
            //mContentStrategy = new IntentContentStrategy(mTag, intent);
            //return this;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.512 -0400", hash_original_method = "ED26754F6A82B43F30EAE698B7941323", hash_generated_method = "4CEDE3CA2F3F4A8C400F1D1B301024B0")
        public String getTag() {
            String varB4EAC82CA7396A68D541C85D26508E83_1406503894 = null; //Variable for return #1
            varB4EAC82CA7396A68D541C85D26508E83_1406503894 = mTag;
            varB4EAC82CA7396A68D541C85D26508E83_1406503894.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_1406503894;
            // ---------- Original Method ----------
            //return mTag;
        }

        
    }


    
    private class LabelIndicatorStrategy implements IndicatorStrategy {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.512 -0400", hash_original_field = "D9334C2D55F77CE82F97CD28EFAAD24C", hash_generated_field = "35633BB7C9814BC2D57023D255065F26")

        private CharSequence mLabel;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.512 -0400", hash_original_method = "8DE7E2F209482BC83865CDCF3C7C3957", hash_generated_method = "08E3A6DB2473BDD30016B577A75C17DA")
        private  LabelIndicatorStrategy(CharSequence label) {
            mLabel = label;
            // ---------- Original Method ----------
            //mLabel = label;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.513 -0400", hash_original_method = "DC1E36DC8692A133E2BAD2847D81CB26", hash_generated_method = "11B1DF97C8E90B074D48E8F9DF522670")
        public View createIndicatorView() {
            View varB4EAC82CA7396A68D541C85D26508E83_721571436 = null; //Variable for return #1
            Context context;
            context = getContext();
            LayoutInflater inflater;
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View tabIndicator;
            tabIndicator = inflater.inflate(mTabLayoutId,
                    mTabWidget, 
                    false);
            TextView tv;
            tv = (TextView) tabIndicator.findViewById(R.id.title);
            tv.setText(mLabel);
            {
                boolean var28B97C77588ED043C122E84D836ACC17_389441056 = (context.getApplicationInfo().targetSdkVersion <= Build.VERSION_CODES.DONUT);
                {
                    tabIndicator.setBackgroundResource(R.drawable.tab_indicator_v4);
                    tv.setTextColor(context.getResources().getColorStateList(R.color.tab_indicator_text_v4));
                } //End block
            } //End collapsed parenthetic
            varB4EAC82CA7396A68D541C85D26508E83_721571436 = tabIndicator;
            varB4EAC82CA7396A68D541C85D26508E83_721571436.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_721571436;
            // ---------- Original Method ----------
            //final Context context = getContext();
            //LayoutInflater inflater =
                    //(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            //View tabIndicator = inflater.inflate(mTabLayoutId,
                    //mTabWidget, 
                    //false);
            //final TextView tv = (TextView) tabIndicator.findViewById(R.id.title);
            //tv.setText(mLabel);
            //if (context.getApplicationInfo().targetSdkVersion <= Build.VERSION_CODES.DONUT) {
                //tabIndicator.setBackgroundResource(R.drawable.tab_indicator_v4);
                //tv.setTextColor(context.getResources().getColorStateList(R.color.tab_indicator_text_v4));
            //}
            //return tabIndicator;
        }

        
    }


    
    private class LabelAndIconIndicatorStrategy implements IndicatorStrategy {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.513 -0400", hash_original_field = "D9334C2D55F77CE82F97CD28EFAAD24C", hash_generated_field = "35633BB7C9814BC2D57023D255065F26")

        private CharSequence mLabel;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.513 -0400", hash_original_field = "1A265556E59DF15CAEC4E55FB61E68C7", hash_generated_field = "FFB83F2A7C9A877B036AAEB7C21DDF6E")

        private Drawable mIcon;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.513 -0400", hash_original_method = "A623A8042A1AC955C3AA9DCF282E65F2", hash_generated_method = "FE807DD5917584DB1910CFAB97FFD970")
        private  LabelAndIconIndicatorStrategy(CharSequence label, Drawable icon) {
            mLabel = label;
            mIcon = icon;
            // ---------- Original Method ----------
            //mLabel = label;
            //mIcon = icon;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.514 -0400", hash_original_method = "9B2F586B6F3639CDD79EFCA223D857D6", hash_generated_method = "8B6E7A2847B9C23AD03CE26C0407CCED")
        public View createIndicatorView() {
            View varB4EAC82CA7396A68D541C85D26508E83_463516919 = null; //Variable for return #1
            Context context;
            context = getContext();
            LayoutInflater inflater;
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View tabIndicator;
            tabIndicator = inflater.inflate(mTabLayoutId,
                    mTabWidget, 
                    false);
            TextView tv;
            tv = (TextView) tabIndicator.findViewById(R.id.title);
            ImageView iconView;
            iconView = (ImageView) tabIndicator.findViewById(R.id.icon);
            boolean exclusive;
            exclusive = iconView.getVisibility() == View.GONE;
            boolean bindIcon;
            bindIcon = !exclusive || TextUtils.isEmpty(mLabel);
            tv.setText(mLabel);
            {
                iconView.setImageDrawable(mIcon);
                iconView.setVisibility(VISIBLE);
            } //End block
            {
                boolean var28B97C77588ED043C122E84D836ACC17_999642029 = (context.getApplicationInfo().targetSdkVersion <= Build.VERSION_CODES.DONUT);
                {
                    tabIndicator.setBackgroundResource(R.drawable.tab_indicator_v4);
                    tv.setTextColor(context.getResources().getColorStateList(R.color.tab_indicator_text_v4));
                } //End block
            } //End collapsed parenthetic
            varB4EAC82CA7396A68D541C85D26508E83_463516919 = tabIndicator;
            varB4EAC82CA7396A68D541C85D26508E83_463516919.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_463516919;
            // ---------- Original Method ----------
            // Original Method Too Long, Refer to Original Implementation
        }

        
    }


    
    private class ViewIndicatorStrategy implements IndicatorStrategy {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.523 -0400", hash_original_field = "7D6C73188D7990FE5A4B99F8F090B9EA", hash_generated_field = "E606D96B6FC531BB030B680E135C95D0")

        private View mView;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.523 -0400", hash_original_method = "70774C2CF3D512F90368753CBBBC1864", hash_generated_method = "EDE3C0618D5B4758FB8E879A8598955F")
        private  ViewIndicatorStrategy(View view) {
            mView = view;
            // ---------- Original Method ----------
            //mView = view;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.524 -0400", hash_original_method = "E81C3A0236D0948C1B54CB0897C263EB", hash_generated_method = "23A9209C0C93C57FF4279DB1CA9554AE")
        public View createIndicatorView() {
            View varB4EAC82CA7396A68D541C85D26508E83_1000513794 = null; //Variable for return #1
            varB4EAC82CA7396A68D541C85D26508E83_1000513794 = mView;
            varB4EAC82CA7396A68D541C85D26508E83_1000513794.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_1000513794;
            // ---------- Original Method ----------
            //return mView;
        }

        
    }


    
    private class ViewIdContentStrategy implements ContentStrategy {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.534 -0400", hash_original_field = "7D6C73188D7990FE5A4B99F8F090B9EA", hash_generated_field = "E606D96B6FC531BB030B680E135C95D0")

        private View mView;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.535 -0400", hash_original_method = "DD6B61194EE85E32120CD7630D172F73", hash_generated_method = "889A81EFFA59D817E0451EB3D5E14396")
        private  ViewIdContentStrategy(int viewId) {
            mView = mTabContent.findViewById(viewId);
            {
                mView.setVisibility(View.GONE);
            } //End block
            {
                if (DroidSafeAndroidRuntime.control) throw new RuntimeException("Could not create tab content because " +
                        "could not find view with id " + viewId);
            } //End block
            // ---------- Original Method ----------
            //mView = mTabContent.findViewById(viewId);
            //if (mView != null) {
                //mView.setVisibility(View.GONE);
            //} else {
                //throw new RuntimeException("Could not create tab content because " +
                        //"could not find view with id " + viewId);
            //}
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.536 -0400", hash_original_method = "FAF9C6C424D99CBF1D87945750D97718", hash_generated_method = "BB26B592844A701990AE045470EE08FA")
        public View getContentView() {
            View varB4EAC82CA7396A68D541C85D26508E83_395683996 = null; //Variable for return #1
            mView.setVisibility(View.VISIBLE);
            varB4EAC82CA7396A68D541C85D26508E83_395683996 = mView;
            varB4EAC82CA7396A68D541C85D26508E83_395683996.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_395683996;
            // ---------- Original Method ----------
            //mView.setVisibility(View.VISIBLE);
            //return mView;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.536 -0400", hash_original_method = "1538BDA0E7D9A0DE19E0F5AE4CBE24FE", hash_generated_method = "116E4E15B96A554AEE4000FB89294B7A")
        public void tabClosed() {
            mView.setVisibility(View.GONE);
            // ---------- Original Method ----------
            //mView.setVisibility(View.GONE);
        }

        
    }


    
    private class FactoryContentStrategy implements ContentStrategy {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.536 -0400", hash_original_field = "A7F1EA497040BBFBF8BE2A90A6E0B6E4", hash_generated_field = "26B32329200530E6945EB791CCFA7B16")

        private View mTabContent;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.536 -0400", hash_original_field = "07496860B5C53FDD66588727158D5F73", hash_generated_field = "90E823197545D5DE4C4A5E73822FE24E")

        private CharSequence mTag;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.536 -0400", hash_original_field = "06389DE86ED19AB1571A41645A1AFADC", hash_generated_field = "0AB71F610C660047CA6A684CD66A9872")

        private TabContentFactory mFactory;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.540 -0400", hash_original_method = "ADEE9FCDC20A1EAC6F11E73C35E4CE28", hash_generated_method = "A8E2CD4A1C77F30F180F465F0347A654")
        public  FactoryContentStrategy(CharSequence tag, TabContentFactory factory) {
            mTag = tag;
            mFactory = factory;
            // ---------- Original Method ----------
            //mTag = tag;
            //mFactory = factory;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.554 -0400", hash_original_method = "ED11D1341C028F4F2DA686CA9100CB0F", hash_generated_method = "C2F56C2EA81DF10E7D91FE4D446FAACC")
        public View getContentView() {
            View varB4EAC82CA7396A68D541C85D26508E83_1751916302 = null; //Variable for return #1
            {
                mTabContent = mFactory.createTabContent(mTag.toString());
            } //End block
            mTabContent.setVisibility(View.VISIBLE);
            varB4EAC82CA7396A68D541C85D26508E83_1751916302 = mTabContent;
            varB4EAC82CA7396A68D541C85D26508E83_1751916302.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_1751916302;
            // ---------- Original Method ----------
            //if (mTabContent == null) {
                //mTabContent = mFactory.createTabContent(mTag.toString());
            //}
            //mTabContent.setVisibility(View.VISIBLE);
            //return mTabContent;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.555 -0400", hash_original_method = "F4CF7743D7975FC61814EFF15B52191C", hash_generated_method = "A6B6F41E27B96F885E5ACD81C8BD5D11")
        public void tabClosed() {
            mTabContent.setVisibility(View.GONE);
            // ---------- Original Method ----------
            //mTabContent.setVisibility(View.GONE);
        }

        
    }


    
    private class IntentContentStrategy implements ContentStrategy {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.555 -0400", hash_original_field = "07496860B5C53FDD66588727158D5F73", hash_generated_field = "0950070738D23525D6B35F116326FC98")

        private String mTag;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.555 -0400", hash_original_field = "B1135DD88C82BCDD4DCD8391BCD99883", hash_generated_field = "5782C825DA3F61D408DF2DCA63E7F54A")

        private Intent mIntent;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.555 -0400", hash_original_field = "3FAD37ED8354BCCC7205B995A4E5D88D", hash_generated_field = "88756EAB8F8EDEB0E827033676248AB0")

        private View mLaunchedView;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.555 -0400", hash_original_method = "ED843E62CBFAC6E94798B5D03DF8D93E", hash_generated_method = "EE558715B969A8470C33B2F87416FE7A")
        private  IntentContentStrategy(String tag, Intent intent) {
            mTag = tag;
            mIntent = intent;
            // ---------- Original Method ----------
            //mTag = tag;
            //mIntent = intent;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.556 -0400", hash_original_method = "FE3CC83835F910E93083BF6BA67BB115", hash_generated_method = "ACFD2930BFF8E19E048E41AACFF884F8")
        public View getContentView() {
            View varB4EAC82CA7396A68D541C85D26508E83_1039388448 = null; //Variable for return #1
            {
                if (DroidSafeAndroidRuntime.control) throw new IllegalStateException("Did you forget to call 'public void setup(LocalActivityManager activityGroup)'?");
            } //End block
            Window w;
            w = mLocalActivityManager.startActivity(
                    mTag, mIntent);
            View wd;
            wd = w.getDecorView();
            wd = null;
            {
                {
                    boolean varA425BC4E1B0DD4835B1D70A02CB53CD6_1416896347 = (mLaunchedView.getParent() != null);
                    {
                        mTabContent.removeView(mLaunchedView);
                    } //End block
                } //End collapsed parenthetic
            } //End block
            mLaunchedView = wd;
            {
                mLaunchedView.setVisibility(View.VISIBLE);
                mLaunchedView.setFocusableInTouchMode(true);
                ((ViewGroup) mLaunchedView).setDescendantFocusability(
                        FOCUS_AFTER_DESCENDANTS);
            } //End block
            varB4EAC82CA7396A68D541C85D26508E83_1039388448 = mLaunchedView;
            varB4EAC82CA7396A68D541C85D26508E83_1039388448.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_1039388448;
            // ---------- Original Method ----------
            // Original Method Too Long, Refer to Original Implementation
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.557 -0400", hash_original_method = "94FBE3B8432975AC17E234FCD4A9B7F4", hash_generated_method = "E60E3F68ACC702E20FB585C2F9A96110")
        public void tabClosed() {
            {
                mLaunchedView.setVisibility(View.GONE);
            } //End block
            // ---------- Original Method ----------
            //if (mLaunchedView != null) {
                //mLaunchedView.setVisibility(View.GONE);
            //}
        }

        
    }


    
    public interface OnTabChangeListener {
        void onTabChanged(String tabId);
    }
    
    public interface TabContentFactory {
        
        View createTabContent(String tag);
    }
    
    private static interface IndicatorStrategy {

        
        View createIndicatorView();
    }
    
    private static interface ContentStrategy {

        
        View getContentView();

        
        void tabClosed();
    }
    
}

