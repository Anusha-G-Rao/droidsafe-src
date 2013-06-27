package android.widget;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.annotation.Widget;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.NumberPicker.OnValueChangeListener;
import com.android.internal.R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class DatePicker extends FrameLayout {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.838 -0400", hash_original_field = "8ED95193CF2BD359A1F40C120860D6B8", hash_generated_field = "57FC055B6C9771133CE6C857A7DABDD2")

    private LinearLayout mSpinners;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.838 -0400", hash_original_field = "5A9A969CFB8D8086B1FE2DD0169FE3B6", hash_generated_field = "E9AD14BD1E7C73448246017F61A6910F")

    private NumberPicker mDaySpinner;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.838 -0400", hash_original_field = "A52E01A57F27B740721F7C122B89AA94", hash_generated_field = "936D6FFF762C4ACBFCB2790E745CF627")

    private NumberPicker mMonthSpinner;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.838 -0400", hash_original_field = "1C92E397E6FF879517C64E647CABBF20", hash_generated_field = "0D7C6882B7118BD566A5477609D98248")

    private NumberPicker mYearSpinner;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.838 -0400", hash_original_field = "B8D2C6DF64E89393BFC4853CF107941C", hash_generated_field = "78DBE8E04B70C89A720FD198AB154490")

    private EditText mDaySpinnerInput;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.838 -0400", hash_original_field = "353E1901B27F26C47CCF10C8B1C9D852", hash_generated_field = "714D9147EB1533807E28758F3821E7DC")

    private EditText mMonthSpinnerInput;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.838 -0400", hash_original_field = "4A401C6EEE207DC69829661302C397C2", hash_generated_field = "2F520BDB0A7FFE00F22D9FBE511FE790")

    private EditText mYearSpinnerInput;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.838 -0400", hash_original_field = "06B125B857EEE352CA593584AE56A22D", hash_generated_field = "C49C583656EEC355FE817D0FB30D86B9")

    private CalendarView mCalendarView;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.838 -0400", hash_original_field = "A21C83444D8B0E7E33D76B52140C960A", hash_generated_field = "88175FFB524B6CC60F82A34D8C4EC643")

    private Locale mCurrentLocale;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.838 -0400", hash_original_field = "01C16DE86C0D9E7618B5DC9FBE3D0F18", hash_generated_field = "62B8B5E7AE7E284B45C195AD700263A4")

    private OnDateChangedListener mOnDateChangedListener;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.838 -0400", hash_original_field = "F8FA2D68BD3FAD10196FC3A202F1FE7B", hash_generated_field = "7C0E3CE4CDD41145783D01A374740E69")

    private String[] mShortMonths;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.838 -0400", hash_original_field = "D09E60E802BCF776E697BC72D82FD915", hash_generated_field = "DD6C69E67AB2E9F8A9F9FF9AC021283E")

    private java.text.DateFormat mDateFormat = new SimpleDateFormat(DATE_FORMAT);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.838 -0400", hash_original_field = "55A152A1E331FEA518A7D8F50D68C2BE", hash_generated_field = "FC72141C7BE09CB007FDA2A11DEAADED")

    private int mNumberOfMonths;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.838 -0400", hash_original_field = "2CD58DB7365E32A740CCEDC539E005B5", hash_generated_field = "915400C77BD703DACB8E97CD72BFFD5E")

    private Calendar mTempDate;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.838 -0400", hash_original_field = "E65E4BB5B38AD013B1E2F00B4ED9DF18", hash_generated_field = "681C6D172B5A021A54543F6E6ED5BD03")

    private Calendar mMinDate;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.838 -0400", hash_original_field = "022B7F9BF85FB96A21762C2F3C1B66E0", hash_generated_field = "4C58BCC5BEA466149D70675257F2009F")

    private Calendar mMaxDate;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.838 -0400", hash_original_field = "1B181112D1184C4C6442EEEED71CB9CD", hash_generated_field = "B33BB7B8B2F898A7B6FA7A6FCFAB9ED0")

    private Calendar mCurrentDate;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.838 -0400", hash_original_field = "9F4735C7D2833FBB144CCBE86DA0A2AE", hash_generated_field = "0D83C9894006124680A4C4A755D8D1E4")

    private boolean mIsEnabled = DEFAULT_ENABLED_STATE;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.851 -0400", hash_original_method = "50BCEA2D1017959FF4E69EAB1E77D8E2", hash_generated_method = "A03F272C99CFB63521217D746D3029B2")
    public  DatePicker(Context context) {
        this(context, null);
        addTaint(context.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.852 -0400", hash_original_method = "4453FDB9501009C031AB3C09BDDF68BA", hash_generated_method = "0FA6F84B458FDCF912EDE26D5B9E5399")
    public  DatePicker(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.datePickerStyle);
        addTaint(context.getTaint());
        addTaint(attrs.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.866 -0400", hash_original_method = "4E1923F4C9EC7B5B71246649E14A6878", hash_generated_method = "D82B41D062A34985268A20330B69E942")
    public  DatePicker(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setCurrentLocale(Locale.getDefault());
        TypedArray attributesArray;
        attributesArray = context.obtainStyledAttributes(attrs, R.styleable.DatePicker,
                defStyle, 0);
        boolean spinnersShown;
        spinnersShown = attributesArray.getBoolean(R.styleable.DatePicker_spinnersShown,
                DEFAULT_SPINNERS_SHOWN);
        boolean calendarViewShown;
        calendarViewShown = attributesArray.getBoolean(
                R.styleable.DatePicker_calendarViewShown, DEFAULT_CALENDAR_VIEW_SHOWN);
        int startYear;
        startYear = attributesArray.getInt(R.styleable.DatePicker_startYear,
                DEFAULT_START_YEAR);
        int endYear;
        endYear = attributesArray.getInt(R.styleable.DatePicker_endYear, DEFAULT_END_YEAR);
        String minDate;
        minDate = attributesArray.getString(R.styleable.DatePicker_minDate);
        String maxDate;
        maxDate = attributesArray.getString(R.styleable.DatePicker_maxDate);
        int layoutResourceId;
        layoutResourceId = attributesArray.getResourceId(R.styleable.DatePicker_layout,
                R.layout.date_picker);
        attributesArray.recycle();
        LayoutInflater inflater;
        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(layoutResourceId, this, true);
        OnValueChangeListener onChangeListener;
        onChangeListener = new OnValueChangeListener() {
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                updateInputState();
                mTempDate.setTimeInMillis(mCurrentDate.getTimeInMillis());
                if (picker == mDaySpinner) {
                    int maxDayOfMonth = mTempDate.getActualMaximum(Calendar.DAY_OF_MONTH);
                    if (oldVal == maxDayOfMonth && newVal == 1) {
                        mTempDate.add(Calendar.DAY_OF_MONTH, 1);
                    } else if (oldVal == 1 && newVal == maxDayOfMonth) {
                        mTempDate.add(Calendar.DAY_OF_MONTH, -1);
                    } else {
                        mTempDate.add(Calendar.DAY_OF_MONTH, newVal - oldVal);
                    }
                } else if (picker == mMonthSpinner) {
                    if (oldVal == 11 && newVal == 0) {
                        mTempDate.add(Calendar.MONTH, 1);
                    } else if (oldVal == 0 && newVal == 11) {
                        mTempDate.add(Calendar.MONTH, -1);
                    } else {
                        mTempDate.add(Calendar.MONTH, newVal - oldVal);
                    }
                } else if (picker == mYearSpinner) {
                    mTempDate.set(Calendar.YEAR, newVal);
                } else {
                    throw new IllegalArgumentException();
                }
                setDate(mTempDate.get(Calendar.YEAR), mTempDate.get(Calendar.MONTH),
                        mTempDate.get(Calendar.DAY_OF_MONTH));
                updateSpinners();
                updateCalendarView();
                notifyDateChanged();
            }
        };
        mSpinners = (LinearLayout) findViewById(R.id.pickers);
        mCalendarView = (CalendarView) findViewById(R.id.calendar_view);
        mCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {            
            @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.854 -0400", hash_original_method = "8EC92A24243B88F9F674F29B26D1EE2F", hash_generated_method = "6BD1278AAE492694E590CDC16AE2F4CF")
            public void onSelectedDayChange(CalendarView view, int year, int month, int monthDay) {
                //DSFIXME:  CODE0009: Possible callback target function detected
                setDate(year, month, monthDay);
                updateSpinners();
                notifyDateChanged();
                addTaint(view.getTaint());
                addTaint(year);
                addTaint(month);
                addTaint(monthDay);
                // ---------- Original Method ----------
                //setDate(year, month, monthDay);
                //updateSpinners();
                //notifyDateChanged();
            }
});
        mDaySpinner = (NumberPicker) findViewById(R.id.day);
        mDaySpinner.setFormatter(NumberPicker.TWO_DIGIT_FORMATTER);
        mDaySpinner.setOnLongPressUpdateInterval(100);
        mDaySpinner.setOnValueChangedListener(onChangeListener);
        mDaySpinnerInput = (EditText) mDaySpinner.findViewById(R.id.numberpicker_input);
        mMonthSpinner = (NumberPicker) findViewById(R.id.month);
        mMonthSpinner.setMinValue(0);
        mMonthSpinner.setMaxValue(mNumberOfMonths - 1);
        mMonthSpinner.setDisplayedValues(mShortMonths);
        mMonthSpinner.setOnLongPressUpdateInterval(200);
        mMonthSpinner.setOnValueChangedListener(onChangeListener);
        mMonthSpinnerInput = (EditText) mMonthSpinner.findViewById(R.id.numberpicker_input);
        mYearSpinner = (NumberPicker) findViewById(R.id.year);
        mYearSpinner.setOnLongPressUpdateInterval(100);
        mYearSpinner.setOnValueChangedListener(onChangeListener);
        mYearSpinnerInput = (EditText) mYearSpinner.findViewById(R.id.numberpicker_input);
        {
            setSpinnersShown(true);
        } //End block
        {
            setSpinnersShown(spinnersShown);
            setCalendarViewShown(calendarViewShown);
        } //End block
        mTempDate.clear();
        {
            boolean varB42B6FD90CE44C7AF0C803D461A4E66F_1377557943 = (!TextUtils.isEmpty(minDate));
            {
                {
                    boolean var238973CDF5952F2772E06FD4D70C236A_1527825374 = (!parseDate(minDate, mTempDate));
                    {
                        mTempDate.set(startYear, 0, 1);
                    } //End block
                } //End collapsed parenthetic
            } //End block
            {
                mTempDate.set(startYear, 0, 1);
            } //End block
        } //End collapsed parenthetic
        setMinDate(mTempDate.getTimeInMillis());
        mTempDate.clear();
        {
            boolean var5504FF0F945EFAF7382FEAD9CA760C61_59141210 = (!TextUtils.isEmpty(maxDate));
            {
                {
                    boolean varE39F8480BCF72E019FB738D67F843630_1156820916 = (!parseDate(maxDate, mTempDate));
                    {
                        mTempDate.set(endYear, 11, 31);
                    } //End block
                } //End collapsed parenthetic
            } //End block
            {
                mTempDate.set(endYear, 11, 31);
            } //End block
        } //End collapsed parenthetic
        setMaxDate(mTempDate.getTimeInMillis());
        mCurrentDate.setTimeInMillis(System.currentTimeMillis());
        init(mCurrentDate.get(Calendar.YEAR), mCurrentDate.get(Calendar.MONTH), mCurrentDate
                .get(Calendar.DAY_OF_MONTH), null);
        reorderSpinners();
        {
            boolean varFEF5E81D9E4B252970529F0E4C094F45_385329922 = (AccessibilityManager.getInstance(mContext).isEnabled());
            {
                setContentDescriptions();
            } //End block
        } //End collapsed parenthetic
        addTaint(context.getTaint());
        addTaint(attrs.getTaint());
        addTaint(defStyle);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.880 -0400", hash_original_method = "B0CBF7B6208A95C236DA6913EAA0D341", hash_generated_method = "07E4C50F93DE852CF9609C2B85B65526")
    public long getMinDate() {
        long varB40DE574B5EEB641C77EAC6A2031962A_1064998057 = (mCalendarView.getMinDate());
        long var0F5264038205EDFB1AC05FBB0E8C5E94_516190068 = getTaintLong();
        return var0F5264038205EDFB1AC05FBB0E8C5E94_516190068;
        // ---------- Original Method ----------
        //return mCalendarView.getMinDate();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.880 -0400", hash_original_method = "E09B6ABF429EE8C7F43BA1D2176E3476", hash_generated_method = "79924675656026449A7640D0A504DA1D")
    public void setMinDate(long minDate) {
        mTempDate.setTimeInMillis(minDate);
        {
            boolean var37BD6CA5F6D0A436AF1D33B6EE39E4BD_789517017 = (mTempDate.get(Calendar.YEAR) == mMinDate.get(Calendar.YEAR)
                && mTempDate.get(Calendar.DAY_OF_YEAR) != mMinDate.get(Calendar.DAY_OF_YEAR));
        } //End collapsed parenthetic
        mMinDate.setTimeInMillis(minDate);
        mCalendarView.setMinDate(minDate);
        {
            boolean varAF79101793B04954E3EDCCBE86F07279_1598247999 = (mCurrentDate.before(mMinDate));
            {
                mCurrentDate.setTimeInMillis(mMinDate.getTimeInMillis());
                updateCalendarView();
            } //End block
        } //End collapsed parenthetic
        updateSpinners();
        addTaint(minDate);
        // ---------- Original Method ----------
        //mTempDate.setTimeInMillis(minDate);
        //if (mTempDate.get(Calendar.YEAR) == mMinDate.get(Calendar.YEAR)
                //&& mTempDate.get(Calendar.DAY_OF_YEAR) != mMinDate.get(Calendar.DAY_OF_YEAR)) {
            //return;
        //}
        //mMinDate.setTimeInMillis(minDate);
        //mCalendarView.setMinDate(minDate);
        //if (mCurrentDate.before(mMinDate)) {
            //mCurrentDate.setTimeInMillis(mMinDate.getTimeInMillis());
            //updateCalendarView();
        //}
        //updateSpinners();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.881 -0400", hash_original_method = "DB8F47FF49EF5F4454748F1EF70370BC", hash_generated_method = "CB15F3669CC813ED4DA99026FEF0F6F5")
    public long getMaxDate() {
        long var9D614FA984E6C6E979B43BD42C2783CC_1157675878 = (mCalendarView.getMaxDate());
        long var0F5264038205EDFB1AC05FBB0E8C5E94_1579463731 = getTaintLong();
        return var0F5264038205EDFB1AC05FBB0E8C5E94_1579463731;
        // ---------- Original Method ----------
        //return mCalendarView.getMaxDate();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.882 -0400", hash_original_method = "2F38894A8B9E3D925CDD9D98E5823853", hash_generated_method = "B72B9D77E6B61EBD130DEC637C6D2385")
    public void setMaxDate(long maxDate) {
        mTempDate.setTimeInMillis(maxDate);
        {
            boolean var894F7585478762626FCC6E7184683B3E_714749393 = (mTempDate.get(Calendar.YEAR) == mMaxDate.get(Calendar.YEAR)
                && mTempDate.get(Calendar.DAY_OF_YEAR) != mMaxDate.get(Calendar.DAY_OF_YEAR));
        } //End collapsed parenthetic
        mMaxDate.setTimeInMillis(maxDate);
        mCalendarView.setMaxDate(maxDate);
        {
            boolean var9B6DC28EB93A6A885A2096EBCEF5C09A_1046728258 = (mCurrentDate.after(mMaxDate));
            {
                mCurrentDate.setTimeInMillis(mMaxDate.getTimeInMillis());
                updateCalendarView();
            } //End block
        } //End collapsed parenthetic
        updateSpinners();
        addTaint(maxDate);
        // ---------- Original Method ----------
        //mTempDate.setTimeInMillis(maxDate);
        //if (mTempDate.get(Calendar.YEAR) == mMaxDate.get(Calendar.YEAR)
                //&& mTempDate.get(Calendar.DAY_OF_YEAR) != mMaxDate.get(Calendar.DAY_OF_YEAR)) {
            //return;
        //}
        //mMaxDate.setTimeInMillis(maxDate);
        //mCalendarView.setMaxDate(maxDate);
        //if (mCurrentDate.after(mMaxDate)) {
            //mCurrentDate.setTimeInMillis(mMaxDate.getTimeInMillis());
            //updateCalendarView();
        //}
        //updateSpinners();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.895 -0400", hash_original_method = "515C7BC224A54DF2006916B644FD1165", hash_generated_method = "DF0204E7142EBB254568E952CBFBF0B6")
    @Override
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        mDaySpinner.setEnabled(enabled);
        mMonthSpinner.setEnabled(enabled);
        mYearSpinner.setEnabled(enabled);
        mCalendarView.setEnabled(enabled);
        mIsEnabled = enabled;
        // ---------- Original Method ----------
        //if (mIsEnabled == enabled) {
            //return;
        //}
        //super.setEnabled(enabled);
        //mDaySpinner.setEnabled(enabled);
        //mMonthSpinner.setEnabled(enabled);
        //mYearSpinner.setEnabled(enabled);
        //mCalendarView.setEnabled(enabled);
        //mIsEnabled = enabled;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.896 -0400", hash_original_method = "FE60B57F2ECB259E877433DACC7AAC95", hash_generated_method = "6430A2AFC2934EEC2A65140DC868EE73")
    @Override
    public boolean isEnabled() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_966612665 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_966612665;
        // ---------- Original Method ----------
        //return mIsEnabled;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.896 -0400", hash_original_method = "CFB95F18A35F8E50D440D10682646E0E", hash_generated_method = "E0FCBD88D260A5AC67E7000960471980")
    @Override
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        onPopulateAccessibilityEvent(event);
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1762625035 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1762625035;
        // ---------- Original Method ----------
        //onPopulateAccessibilityEvent(event);
        //return true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.897 -0400", hash_original_method = "C41A760D3D0D618DC4D1C9DC2EF8ACD9", hash_generated_method = "A9D2F03AB927EDCEBFF70957D822038F")
    @Override
    public void onPopulateAccessibilityEvent(AccessibilityEvent event) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        super.onPopulateAccessibilityEvent(event);
        int flags;
        flags = DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_SHOW_YEAR;
        String selectedDateUtterance;
        selectedDateUtterance = DateUtils.formatDateTime(mContext,
                mCurrentDate.getTimeInMillis(), flags);
        event.getText().add(selectedDateUtterance);
        addTaint(event.getTaint());
        // ---------- Original Method ----------
        //super.onPopulateAccessibilityEvent(event);
        //final int flags = DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_SHOW_YEAR;
        //String selectedDateUtterance = DateUtils.formatDateTime(mContext,
                //mCurrentDate.getTimeInMillis(), flags);
        //event.getText().add(selectedDateUtterance);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.897 -0400", hash_original_method = "C452430AEDBDDD78DF8F4D12B9175E89", hash_generated_method = "FB0A11FC0C47EF7B377125BF2E9C2DD7")
    @Override
    protected void onConfigurationChanged(Configuration newConfig) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        super.onConfigurationChanged(newConfig);
        setCurrentLocale(newConfig.locale);
        addTaint(newConfig.getTaint());
        // ---------- Original Method ----------
        //super.onConfigurationChanged(newConfig);
        //setCurrentLocale(newConfig.locale);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.898 -0400", hash_original_method = "F626AAF3D88CF2708A3C00197CF02609", hash_generated_method = "7DD0AC9B5A2964106CE28F642DEEF1DA")
    public boolean getCalendarViewShown() {
        boolean var855A46EE0F6F903AB771316F83829ECB_679991016 = (mCalendarView.isShown());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_594834521 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_594834521;
        // ---------- Original Method ----------
        //return mCalendarView.isShown();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.916 -0400", hash_original_method = "E5E91372452D81D0FC87710458852870", hash_generated_method = "DE38A2460D46162D62F5481A303ED7FA")
    public CalendarView getCalendarView() {
        CalendarView varB4EAC82CA7396A68D541C85D26508E83_1198900951 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1198900951 = mCalendarView;
        varB4EAC82CA7396A68D541C85D26508E83_1198900951.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1198900951;
        // ---------- Original Method ----------
        //return mCalendarView;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.917 -0400", hash_original_method = "A6F7D559BB2BFC23B5A4662DCD0F1C14", hash_generated_method = "DD58A28742AEAF3361BA58363A42E8ED")
    public void setCalendarViewShown(boolean shown) {
        mCalendarView.setVisibility(shown ? VISIBLE : GONE);
        addTaint(shown);
        // ---------- Original Method ----------
        //mCalendarView.setVisibility(shown ? VISIBLE : GONE);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.917 -0400", hash_original_method = "B5CFDF56FD0FFF53C840D3DAC615D008", hash_generated_method = "BCD464EE77ABADB2A6EA6B62C28E7646")
    public boolean getSpinnersShown() {
        boolean varEE3A01932ADE28CADE36247C8514FDF8_875336055 = (mSpinners.isShown());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_665811615 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_665811615;
        // ---------- Original Method ----------
        //return mSpinners.isShown();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.917 -0400", hash_original_method = "754F8D4BE212034B7CC0AFCD20BC9A92", hash_generated_method = "A2703A03B239C8D388BA724993E80FDC")
    public void setSpinnersShown(boolean shown) {
        mSpinners.setVisibility(shown ? VISIBLE : GONE);
        addTaint(shown);
        // ---------- Original Method ----------
        //mSpinners.setVisibility(shown ? VISIBLE : GONE);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.919 -0400", hash_original_method = "A700AEEDD57B848576647AE119590A45", hash_generated_method = "C4BEDCC57CCC6BC44078C4BEAC10F296")
    private void setCurrentLocale(Locale locale) {
        {
            boolean varD1CF46D36E6B1C6187CE68AE2BC3F432_192681070 = (locale.equals(mCurrentLocale));
        } //End collapsed parenthetic
        mCurrentLocale = locale;
        mTempDate = getCalendarForLocale(mTempDate, locale);
        mMinDate = getCalendarForLocale(mMinDate, locale);
        mMaxDate = getCalendarForLocale(mMaxDate, locale);
        mCurrentDate = getCalendarForLocale(mCurrentDate, locale);
        mNumberOfMonths = mTempDate.getActualMaximum(Calendar.MONTH) + 1;
        mShortMonths = new String[mNumberOfMonths];
        {
            int i;
            i = 0;
            {
                mShortMonths[i] = DateUtils.getMonthString(Calendar.JANUARY + i,
                    DateUtils.LENGTH_MEDIUM);
            } //End block
        } //End collapsed parenthetic
        // ---------- Original Method ----------
        //if (locale.equals(mCurrentLocale)) {
            //return;
        //}
        //mCurrentLocale = locale;
        //mTempDate = getCalendarForLocale(mTempDate, locale);
        //mMinDate = getCalendarForLocale(mMinDate, locale);
        //mMaxDate = getCalendarForLocale(mMaxDate, locale);
        //mCurrentDate = getCalendarForLocale(mCurrentDate, locale);
        //mNumberOfMonths = mTempDate.getActualMaximum(Calendar.MONTH) + 1;
        //mShortMonths = new String[mNumberOfMonths];
        //for (int i = 0; i < mNumberOfMonths; i++) {
            //mShortMonths[i] = DateUtils.getMonthString(Calendar.JANUARY + i,
                    //DateUtils.LENGTH_MEDIUM);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.932 -0400", hash_original_method = "FA738DF80665124C3A5E01ADC04827D9", hash_generated_method = "D1AFD4D1B823F1643691585C616BD91D")
    private Calendar getCalendarForLocale(Calendar oldCalendar, Locale locale) {
        Calendar varB4EAC82CA7396A68D541C85D26508E83_1175369347 = null; //Variable for return #1
        Calendar varB4EAC82CA7396A68D541C85D26508E83_287522054 = null; //Variable for return #2
        {
            varB4EAC82CA7396A68D541C85D26508E83_1175369347 = Calendar.getInstance(locale);
        } //End block
        {
            long currentTimeMillis;
            currentTimeMillis = oldCalendar.getTimeInMillis();
            Calendar newCalendar;
            newCalendar = Calendar.getInstance(locale);
            newCalendar.setTimeInMillis(currentTimeMillis);
            varB4EAC82CA7396A68D541C85D26508E83_287522054 = newCalendar;
        } //End block
        addTaint(oldCalendar.getTaint());
        addTaint(locale.getTaint());
        Calendar varA7E53CE21691AB073D9660D615818899_2037419901; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_2037419901 = varB4EAC82CA7396A68D541C85D26508E83_1175369347;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_2037419901 = varB4EAC82CA7396A68D541C85D26508E83_287522054;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_2037419901.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_2037419901;
        // ---------- Original Method ----------
        //if (oldCalendar == null) {
            //return Calendar.getInstance(locale);
        //} else {
            //final long currentTimeMillis = oldCalendar.getTimeInMillis();
            //Calendar newCalendar = Calendar.getInstance(locale);
            //newCalendar.setTimeInMillis(currentTimeMillis);
            //return newCalendar;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.933 -0400", hash_original_method = "EC825478EA562937FD242C7F7D2C8CF4", hash_generated_method = "C891519EF9A75C9F0F1C495954B17019")
    private void reorderSpinners() {
        mSpinners.removeAllViews();
        char[] order;
        order = DateFormat.getDateFormatOrder(getContext());
        int spinnerCount;
        spinnerCount = order.length;
        {
            int i;
            i = 0;
            {
                //Begin case DateFormat.DATE 
                mSpinners.addView(mDaySpinner);
                //End case DateFormat.DATE 
                //Begin case DateFormat.DATE 
                setImeOptions(mDaySpinner, spinnerCount, i);
                //End case DateFormat.DATE 
                //Begin case DateFormat.MONTH 
                mSpinners.addView(mMonthSpinner);
                //End case DateFormat.MONTH 
                //Begin case DateFormat.MONTH 
                setImeOptions(mMonthSpinner, spinnerCount, i);
                //End case DateFormat.MONTH 
                //Begin case DateFormat.YEAR 
                mSpinners.addView(mYearSpinner);
                //End case DateFormat.YEAR 
                //Begin case DateFormat.YEAR 
                setImeOptions(mYearSpinner, spinnerCount, i);
                //End case DateFormat.YEAR 
                //Begin case default 
                if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException();
                //End case default 
            } //End block
        } //End collapsed parenthetic
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.948 -0400", hash_original_method = "4C1492E37715D23031DBB004E3447195", hash_generated_method = "528C6323BB5F9A420897BFCB93EE02BF")
    public void updateDate(int year, int month, int dayOfMonth) {
        {
            boolean var47D61AB824D859560C1B4264C334F45F_667769351 = (!isNewDate(year, month, dayOfMonth));
        } //End collapsed parenthetic
        setDate(year, month, dayOfMonth);
        updateSpinners();
        updateCalendarView();
        notifyDateChanged();
        addTaint(year);
        addTaint(month);
        addTaint(dayOfMonth);
        // ---------- Original Method ----------
        //if (!isNewDate(year, month, dayOfMonth)) {
            //return;
        //}
        //setDate(year, month, dayOfMonth);
        //updateSpinners();
        //updateCalendarView();
        //notifyDateChanged();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.949 -0400", hash_original_method = "3B9D7DC916535DA1F64238687579C1A4", hash_generated_method = "E362119FE0F4B2603664E90AC9E36821")
    @Override
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> container) {
        dispatchThawSelfOnly(container);
        addTaint(container.getTaint());
        // ---------- Original Method ----------
        //dispatchThawSelfOnly(container);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.949 -0400", hash_original_method = "5DB0198ABA6176C6419BBD5D6E2C0EE9", hash_generated_method = "802D9EB214FC1BC42EC79045C3F14370")
    @Override
    protected Parcelable onSaveInstanceState() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        Parcelable varB4EAC82CA7396A68D541C85D26508E83_1025720673 = null; //Variable for return #1
        Parcelable superState;
        superState = super.onSaveInstanceState();
        varB4EAC82CA7396A68D541C85D26508E83_1025720673 = new SavedState(superState, getYear(), getMonth(), getDayOfMonth());
        varB4EAC82CA7396A68D541C85D26508E83_1025720673.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1025720673;
        // ---------- Original Method ----------
        //Parcelable superState = super.onSaveInstanceState();
        //return new SavedState(superState, getYear(), getMonth(), getDayOfMonth());
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:06.950 -0400", hash_original_method = "7BB26B54419EB3FE0435D4F561876035", hash_generated_method = "AB332F413C89080EB1658D881F83A60C")
    @Override
    protected void onRestoreInstanceState(Parcelable state) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        SavedState ss;
        ss = (SavedState) state;
        super.onRestoreInstanceState(ss.getSuperState());
        setDate(ss.mYear, ss.mMonth, ss.mDay);
        updateSpinners();
        updateCalendarView();
        addTaint(state.getTaint());
        // ---------- Original Method ----------
        //SavedState ss = (SavedState) state;
        //super.onRestoreInstanceState(ss.getSuperState());
        //setDate(ss.mYear, ss.mMonth, ss.mDay);
        //updateSpinners();
        //updateCalendarView();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:07.094 -0400", hash_original_method = "D658CCE01B7A83A418EB2AC2C82BF7D5", hash_generated_method = "2B28CD8DB7FB80876F6E76B8484228A3")
    public void init(int year, int monthOfYear, int dayOfMonth,
            OnDateChangedListener onDateChangedListener) {
        setDate(year, monthOfYear, dayOfMonth);
        updateSpinners();
        updateCalendarView();
        mOnDateChangedListener = onDateChangedListener;
        addTaint(year);
        addTaint(monthOfYear);
        addTaint(dayOfMonth);
        // ---------- Original Method ----------
        //setDate(year, monthOfYear, dayOfMonth);
        //updateSpinners();
        //updateCalendarView();
        //mOnDateChangedListener = onDateChangedListener;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:07.094 -0400", hash_original_method = "4EF37BB5E8B6D289AE6D0021CE0D4FEB", hash_generated_method = "10D75176C2B0D543D48DB0AD3DFD581F")
    private boolean parseDate(String date, Calendar outDate) {
        try 
        {
            outDate.setTime(mDateFormat.parse(date));
        } //End block
        catch (ParseException e)
        { }
        addTaint(date.getTaint());
        addTaint(outDate.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_901822001 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_901822001;
        // ---------- Original Method ----------
        //try {
            //outDate.setTime(mDateFormat.parse(date));
            //return true;
        //} catch (ParseException e) {
            //Log.w(LOG_TAG, "Date: " + date + " not in format: " + DATE_FORMAT);
            //return false;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:07.095 -0400", hash_original_method = "7DA7F7B10A47108B3DBE60145E22A8FC", hash_generated_method = "24BFE5A60BAD416D4AAD5DC1A7ADF8E0")
    private boolean isNewDate(int year, int month, int dayOfMonth) {
        boolean var4D4614F9AE94C6DD2555654907DCBA76_838310200 = ((mCurrentDate.get(Calendar.YEAR) != year
                || mCurrentDate.get(Calendar.MONTH) != dayOfMonth
                || mCurrentDate.get(Calendar.DAY_OF_MONTH) != month));
        addTaint(year);
        addTaint(month);
        addTaint(dayOfMonth);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_680818767 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_680818767;
        // ---------- Original Method ----------
        //return (mCurrentDate.get(Calendar.YEAR) != year
                //|| mCurrentDate.get(Calendar.MONTH) != dayOfMonth
                //|| mCurrentDate.get(Calendar.DAY_OF_MONTH) != month);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:07.096 -0400", hash_original_method = "421AA01E04B51628D97359BDD118BF23", hash_generated_method = "2F3796EA137E09891FC863134B0EB26E")
    private void setDate(int year, int month, int dayOfMonth) {
        mCurrentDate.set(year, month, dayOfMonth);
        {
            boolean varAF79101793B04954E3EDCCBE86F07279_926756621 = (mCurrentDate.before(mMinDate));
            {
                mCurrentDate.setTimeInMillis(mMinDate.getTimeInMillis());
            } //End block
            {
                boolean var55E331B3E292E1AA1BBB03ECF049DB7A_1889700031 = (mCurrentDate.after(mMaxDate));
                {
                    mCurrentDate.setTimeInMillis(mMaxDate.getTimeInMillis());
                } //End block
            } //End collapsed parenthetic
        } //End collapsed parenthetic
        addTaint(year);
        addTaint(month);
        addTaint(dayOfMonth);
        // ---------- Original Method ----------
        //mCurrentDate.set(year, month, dayOfMonth);
        //if (mCurrentDate.before(mMinDate)) {
            //mCurrentDate.setTimeInMillis(mMinDate.getTimeInMillis());
        //} else if (mCurrentDate.after(mMaxDate)) {
            //mCurrentDate.setTimeInMillis(mMaxDate.getTimeInMillis());
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:07.097 -0400", hash_original_method = "CC0C6797D7B0307D38215BFED9C815FE", hash_generated_method = "EC764E69D0153750D5B729247E07EFE6")
    private void updateSpinners() {
        {
            boolean var95A6AAC68083AF2858A365F505B34BDE_1120265714 = (mCurrentDate.equals(mMinDate));
            {
                mDaySpinner.setMinValue(mCurrentDate.get(Calendar.DAY_OF_MONTH));
                mDaySpinner.setMaxValue(mCurrentDate.getActualMaximum(Calendar.DAY_OF_MONTH));
                mDaySpinner.setWrapSelectorWheel(false);
                mMonthSpinner.setDisplayedValues(null);
                mMonthSpinner.setMinValue(mCurrentDate.get(Calendar.MONTH));
                mMonthSpinner.setMaxValue(mCurrentDate.getActualMaximum(Calendar.MONTH));
                mMonthSpinner.setWrapSelectorWheel(false);
            } //End block
            {
                boolean varFDB271A9A713B8545E92F73FD7F04833_1010869202 = (mCurrentDate.equals(mMaxDate));
                {
                    mDaySpinner.setMinValue(mCurrentDate.getActualMinimum(Calendar.DAY_OF_MONTH));
                    mDaySpinner.setMaxValue(mCurrentDate.get(Calendar.DAY_OF_MONTH));
                    mDaySpinner.setWrapSelectorWheel(false);
                    mMonthSpinner.setDisplayedValues(null);
                    mMonthSpinner.setMinValue(mCurrentDate.getActualMinimum(Calendar.MONTH));
                    mMonthSpinner.setMaxValue(mCurrentDate.get(Calendar.MONTH));
                    mMonthSpinner.setWrapSelectorWheel(false);
                } //End block
                {
                    mDaySpinner.setMinValue(1);
                    mDaySpinner.setMaxValue(mCurrentDate.getActualMaximum(Calendar.DAY_OF_MONTH));
                    mDaySpinner.setWrapSelectorWheel(true);
                    mMonthSpinner.setDisplayedValues(null);
                    mMonthSpinner.setMinValue(0);
                    mMonthSpinner.setMaxValue(11);
                    mMonthSpinner.setWrapSelectorWheel(true);
                } //End block
            } //End collapsed parenthetic
        } //End collapsed parenthetic
        String[] displayedValues;
        displayedValues = Arrays.copyOfRange(mShortMonths,
                mMonthSpinner.getMinValue(), mMonthSpinner.getMaxValue() + 1);
        mMonthSpinner.setDisplayedValues(displayedValues);
        mYearSpinner.setMinValue(mMinDate.get(Calendar.YEAR));
        mYearSpinner.setMaxValue(mMaxDate.get(Calendar.YEAR));
        mYearSpinner.setWrapSelectorWheel(false);
        mYearSpinner.setValue(mCurrentDate.get(Calendar.YEAR));
        mMonthSpinner.setValue(mCurrentDate.get(Calendar.MONTH));
        mDaySpinner.setValue(mCurrentDate.get(Calendar.DAY_OF_MONTH));
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:07.110 -0400", hash_original_method = "FCBFFA03953049B21025A6ECF65DCE7B", hash_generated_method = "1374E2CB7A57CFB36E9738E5446FFEF5")
    private void updateCalendarView() {
        mCalendarView.setDate(mCurrentDate.getTimeInMillis(), false, false);
        // ---------- Original Method ----------
        //mCalendarView.setDate(mCurrentDate.getTimeInMillis(), false, false);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:07.114 -0400", hash_original_method = "3B3D6844E7A836293DFA1A3CC86782AF", hash_generated_method = "C3AF39F6D0BD252C61E6B297BC7C048C")
    public int getYear() {
        int var127392EED27C8530975FF0FE230AF135_89179192 = (mCurrentDate.get(Calendar.YEAR));
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1479536700 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1479536700;
        // ---------- Original Method ----------
        //return mCurrentDate.get(Calendar.YEAR);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:07.114 -0400", hash_original_method = "38D3E39BF141F42FF09C6079CAB15EDC", hash_generated_method = "3FF413CEE146994DB92E7877DCD17DEF")
    public int getMonth() {
        int var63A8E5DF7D9BC7596A0A5D007CD5C869_1360130923 = (mCurrentDate.get(Calendar.MONTH));
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_439062670 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_439062670;
        // ---------- Original Method ----------
        //return mCurrentDate.get(Calendar.MONTH);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:07.114 -0400", hash_original_method = "8FBF5DD56EFFBE6D332AE82BD8F4BBB9", hash_generated_method = "9C6A1BCC52DA1785941D2B6CC517341F")
    public int getDayOfMonth() {
        int var3D3CCF368CDC433565A989130E1288C8_1688203354 = (mCurrentDate.get(Calendar.DAY_OF_MONTH));
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_571612116 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_571612116;
        // ---------- Original Method ----------
        //return mCurrentDate.get(Calendar.DAY_OF_MONTH);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:07.114 -0400", hash_original_method = "B58D4A1A16597327E1564790BB46799A", hash_generated_method = "5C583756E442F85E7D2007FBCA04FE32")
    private void notifyDateChanged() {
        sendAccessibilityEvent(AccessibilityEvent.TYPE_VIEW_SELECTED);
        {
            mOnDateChangedListener.onDateChanged(this, getYear(), getMonth(), getDayOfMonth());
        } //End block
        // ---------- Original Method ----------
        //sendAccessibilityEvent(AccessibilityEvent.TYPE_VIEW_SELECTED);
        //if (mOnDateChangedListener != null) {
            //mOnDateChangedListener.onDateChanged(this, getYear(), getMonth(), getDayOfMonth());
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:07.117 -0400", hash_original_method = "70CD174A23393C16E923952AAD4C91D4", hash_generated_method = "C8C1657FB0B93D7770F4CEF660D8D722")
    private void setImeOptions(NumberPicker spinner, int spinnerCount, int spinnerIndex) {
        int imeOptions;
        {
            imeOptions = EditorInfo.IME_ACTION_NEXT;
        } //End block
        {
            imeOptions = EditorInfo.IME_ACTION_DONE;
        } //End block
        TextView input;
        input = (TextView) spinner.findViewById(R.id.numberpicker_input);
        input.setImeOptions(imeOptions);
        addTaint(spinner.getTaint());
        addTaint(spinnerCount);
        addTaint(spinnerIndex);
        // ---------- Original Method ----------
        //final int imeOptions;
        //if (spinnerIndex < spinnerCount - 1) {
            //imeOptions = EditorInfo.IME_ACTION_NEXT;
        //} else {
            //imeOptions = EditorInfo.IME_ACTION_DONE;
        //}
        //TextView input = (TextView) spinner.findViewById(R.id.numberpicker_input);
        //input.setImeOptions(imeOptions);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:07.123 -0400", hash_original_method = "DB545D481E75722C0C153D7F54EF544D", hash_generated_method = "BA53D6B440865C808840F27DC84B241D")
    private void setContentDescriptions() {
        String text;
        text = mContext.getString(R.string.date_picker_increment_day_button);
        mDaySpinner.findViewById(R.id.increment).setContentDescription(text);
        text = mContext.getString(R.string.date_picker_decrement_day_button);
        mDaySpinner.findViewById(R.id.decrement).setContentDescription(text);
        text = mContext.getString(R.string.date_picker_increment_month_button);
        mMonthSpinner.findViewById(R.id.increment).setContentDescription(text);
        text = mContext.getString(R.string.date_picker_decrement_month_button);
        mMonthSpinner.findViewById(R.id.decrement).setContentDescription(text);
        text = mContext.getString(R.string.date_picker_increment_year_button);
        mYearSpinner.findViewById(R.id.increment).setContentDescription(text);
        text = mContext.getString(R.string.date_picker_decrement_year_button);
        mYearSpinner.findViewById(R.id.decrement).setContentDescription(text);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:07.123 -0400", hash_original_method = "CDABFADCA81181A0329F14F43A5F5848", hash_generated_method = "5D12D562E90F154926DCA33473C2B532")
    private void updateInputState() {
        InputMethodManager inputMethodManager;
        inputMethodManager = InputMethodManager.peekInstance();
        {
            {
                boolean var807341715775D0581525CF4B76A0CB2A_1629822611 = (inputMethodManager.isActive(mYearSpinnerInput));
                {
                    mYearSpinnerInput.clearFocus();
                    inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
                } //End block
                {
                    boolean var169EEC9AA654CE5D329697D904437F5D_291268986 = (inputMethodManager.isActive(mMonthSpinnerInput));
                    {
                        mMonthSpinnerInput.clearFocus();
                        inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
                    } //End block
                    {
                        boolean var21C60FD83F8FDCDFADA8279B0C7BEED5_1624354489 = (inputMethodManager.isActive(mDaySpinnerInput));
                        {
                            mDaySpinnerInput.clearFocus();
                            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
                        } //End block
                    } //End collapsed parenthetic
                } //End collapsed parenthetic
            } //End collapsed parenthetic
        } //End block
        // ---------- Original Method ----------
        //InputMethodManager inputMethodManager = InputMethodManager.peekInstance();
        //if (inputMethodManager != null) {
            //if (inputMethodManager.isActive(mYearSpinnerInput)) {
                //mYearSpinnerInput.clearFocus();
                //inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            //} else if (inputMethodManager.isActive(mMonthSpinnerInput)) {
                //mMonthSpinnerInput.clearFocus();
                //inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            //} else if (inputMethodManager.isActive(mDaySpinnerInput)) {
                //mDaySpinnerInput.clearFocus();
                //inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            //}
        //}
    }

    
    private static class SavedState extends BaseSavedState {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:07.125 -0400", hash_original_field = "11D990E1A246B4FE4069EE207D869D9B", hash_generated_field = "0FB397B5159C15D66CFFB31661F31030")

        private int mYear;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:07.125 -0400", hash_original_field = "17AC63C47F9382CDD83D410CF577C33A", hash_generated_field = "B60DEE2EFD4F8FC07E416B8343AFCB00")

        private int mMonth;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:07.125 -0400", hash_original_field = "A94ED4F55B6AE30F93C2C2635CEB056B", hash_generated_field = "084BEC9B9077623100292A9AB444BB6A")

        private int mDay;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:07.126 -0400", hash_original_method = "A02F651556C80A285B651552B4D99E55", hash_generated_method = "3B1A35DB0E8481CA43B8180EA9232649")
        private  SavedState(Parcelable superState, int year, int month, int day) {
            super(superState);
            mYear = year;
            mMonth = month;
            mDay = day;
            addTaint(superState.getTaint());
            // ---------- Original Method ----------
            //mYear = year;
            //mMonth = month;
            //mDay = day;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:07.129 -0400", hash_original_method = "CA21CAD6F1AA58ABF5FA7E877A966564", hash_generated_method = "529258F22E562DCA4D2F461195E4F6E4")
        private  SavedState(Parcel in) {
            super(in);
            mYear = in.readInt();
            mMonth = in.readInt();
            mDay = in.readInt();
            // ---------- Original Method ----------
            //mYear = in.readInt();
            //mMonth = in.readInt();
            //mDay = in.readInt();
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:07.129 -0400", hash_original_method = "AFDD7CDA63529FFA8C3C3C99BF58C7E4", hash_generated_method = "22986AAFFBD45B11FD7F1BE48177EE89")
        @Override
        public void writeToParcel(Parcel dest, int flags) {
            super.writeToParcel(dest, flags);
            dest.writeInt(mYear);
            dest.writeInt(mMonth);
            dest.writeInt(mDay);
            addTaint(dest.getTaint());
            addTaint(flags);
            // ---------- Original Method ----------
            //super.writeToParcel(dest, flags);
            //dest.writeInt(mYear);
            //dest.writeInt(mMonth);
            //dest.writeInt(mDay);
        }

        
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:07.130 -0400", hash_original_field = "D1498A1D28CCBBEB217C9EC7E28F9C3B", hash_generated_field = "FDAFF8F4064E6C5834BC3B23DD26F968")

        @SuppressWarnings("all")
        
        public static final Parcelable.Creator<SavedState> CREATOR = new Creator<SavedState>() {

            public SavedState createFromParcel(Parcel in) {
                return new SavedState(in);
            }

            public SavedState[] newArray(int size) {
                return new SavedState[size];
            }
        };
    }


    
    public interface OnDateChangedListener {

        
        void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth);
    }
    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:07.133 -0400", hash_original_field = "ACAE6EBC3CF48E844ECDEC6F258057CD", hash_generated_field = "ECE40A94602A6A0F40CEAE97AAFDD3A6")

    private static String LOG_TAG = DatePicker.class.getSimpleName();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:07.133 -0400", hash_original_field = "7D0AA228503FFF788A6CED655322E089", hash_generated_field = "1B81C4DDEAD135AB37016062483E4CB7")

    private static String DATE_FORMAT = "MM/dd/yyyy";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:07.133 -0400", hash_original_field = "F3F8F2E983FBDE4D0CFA413545412A88", hash_generated_field = "323410FF74F027AA3D9FA880DE524A46")

    private static int DEFAULT_START_YEAR = 1900;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:07.133 -0400", hash_original_field = "24226D6FB985CB71B2100819FF444D08", hash_generated_field = "606E96CE295002FCC0B3CFEBBA19C07D")

    private static int DEFAULT_END_YEAR = 2100;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:07.133 -0400", hash_original_field = "C1544E16BAB1221A60D8907F2F983D83", hash_generated_field = "A04448375F1239E9C8C4D4F3C8BA9EE7")

    private static boolean DEFAULT_CALENDAR_VIEW_SHOWN = true;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:07.133 -0400", hash_original_field = "943AEB93A0ADA1D13513A4CF976BD26F", hash_generated_field = "4A3655FF0DFADF0CE77A7A213F6CDEA9")

    private static boolean DEFAULT_SPINNERS_SHOWN = true;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:07.133 -0400", hash_original_field = "341D07F1E4A62FB066D5A2BBC1DD2D1E", hash_generated_field = "2055CC51361317ABAF24A6861F626B8D")

    private static boolean DEFAULT_ENABLED_STATE = true;
}

