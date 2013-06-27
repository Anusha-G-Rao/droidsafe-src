package android.widget;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import static android.widget.SuggestionsAdapter.getColumnString;
import android.app.PendingIntent;
import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.speech.RecognizerIntent;
import android.text.Editable;
import android.text.InputType;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.CollapsibleActionView;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.TextView.OnEditorActionListener;
import com.android.internal.R;
import java.util.WeakHashMap;

public class SearchView extends LinearLayout implements CollapsibleActionView {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.190 -0400", hash_original_field = "F0FC83112FD93E69838BD6DEF95F60C7", hash_generated_field = "20DE7328B76C4576C54CEA1C31A5A5DD")

    private OnQueryTextListener mOnQueryChangeListener;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.190 -0400", hash_original_field = "47454ABD361EC45738FEDA04F526AE1A", hash_generated_field = "3E6EDBFCD15829E88C823AD6BD9DA13F")

    private OnCloseListener mOnCloseListener;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.190 -0400", hash_original_field = "2E08BF2645EEF4C8B5A42084F390A4B5", hash_generated_field = "5ED7A88B9A58B568EB225F4FC003710B")

    private OnFocusChangeListener mOnQueryTextFocusChangeListener;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.190 -0400", hash_original_field = "8DC5B64EAC058B5083CAE814ADBD7ED0", hash_generated_field = "8D8A066C35D08D2636C4C1260524D2BF")

    private OnSuggestionListener mOnSuggestionListener;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.190 -0400", hash_original_field = "9F1F9A6115F6CABB1E5C631E50B730EC", hash_generated_field = "4CE2C18E09AA7469BBEF676CF87B216F")

    private OnClickListener mOnSearchClickListener;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.190 -0400", hash_original_field = "240C319CE9511A3C6618BAF616D6A95D", hash_generated_field = "DBB17EC605FD9389E7F62B38DE47A3A4")

    private boolean mIconifiedByDefault;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.190 -0400", hash_original_field = "E490012EE9B46FF826CCD5B3B6B214A9", hash_generated_field = "77805A492451B977E1816BA9783A9397")

    private boolean mIconified;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.190 -0400", hash_original_field = "63055E537713F24C4C86BE6E68415FCE", hash_generated_field = "2E9A26C4761764604246CFEB2C060F9B")

    private CursorAdapter mSuggestionsAdapter;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.190 -0400", hash_original_field = "B09C96F2B0035B8D0A17B69A9CB42922", hash_generated_field = "95F86E17693F7357E97225DE31C237B8")

    private View mSearchButton;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.190 -0400", hash_original_field = "4D64642D297528CE69B9092F8D62B333", hash_generated_field = "5B6BED2A64238CE3908B3B8A74F943A0")

    private View mSubmitButton;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.190 -0400", hash_original_field = "01BCA17D3E9DDD8BF5B44F3E2EF1EE68", hash_generated_field = "BFE96959B9AF28F7C0E58BC61493C3DB")

    private View mSearchPlate;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.190 -0400", hash_original_field = "2BCB8DD6DB0886263B47A791A5E5A95E", hash_generated_field = "BC8307BFA7D8BAD259EA185F504A6263")

    private View mSubmitArea;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.190 -0400", hash_original_field = "9FCA0F272C23938FFED9C87C327F80A4", hash_generated_field = "F2F2EE3489EA7D1D3E79DE10F3C92864")

    private ImageView mCloseButton;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.190 -0400", hash_original_field = "3B421A34FA7A3F6F502112270464063B", hash_generated_field = "FA2C49A395FA13278ED063933D3B9887")

    private View mSearchEditFrame;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.190 -0400", hash_original_field = "82862F97F98548A9593F66521F19EB37", hash_generated_field = "008F39BAA0ECCE0EB48B634A42A71E8D")

    private View mVoiceButton;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.191 -0400", hash_original_field = "FCAFC8BB77AF346B28F95EAD1A6AEA60", hash_generated_field = "2624CFC6240E328ABC658DAF35FB4ED1")

    private SearchAutoComplete mQueryTextView;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.191 -0400", hash_original_field = "90D72399639ED88F9BD367E5BF80885E", hash_generated_field = "843247771C656AC3967CC38CD7762802")

    private View mDropDownAnchor;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.191 -0400", hash_original_field = "4DC96DD56935DDDBBA65DBA5782C5A44", hash_generated_field = "E9A5F2E0A5AECD994F77BB6139C386D7")

    private ImageView mSearchHintIcon;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.191 -0400", hash_original_field = "F51306B58E2668509E9043E7735E1FA4", hash_generated_field = "F0EDF0CA4EF3F26D48862E3A0541ACC7")

    private boolean mSubmitButtonEnabled;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.191 -0400", hash_original_field = "F19769AB62A92C3C10630D0D10DC860A", hash_generated_field = "986A565C1B04C031BC149F5E489100AA")

    private CharSequence mQueryHint;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.191 -0400", hash_original_field = "69EE6C3CFA8048276879EF4C552B5C72", hash_generated_field = "E038E258E9530F2A3E67A290C3460468")

    private boolean mQueryRefinement;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.191 -0400", hash_original_field = "86A1AA993B9284C3D6B764E936CD37E9", hash_generated_field = "9D126837B9B8B29E1CD350C323EA754B")

    private boolean mClearingFocus;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.191 -0400", hash_original_field = "C4C548A58212673838506E3498DE25A0", hash_generated_field = "538F7241A30BB30063B42E9CD336B31C")

    private int mMaxWidth;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.191 -0400", hash_original_field = "56FEC094E1F34E5A1FBB51577926300D", hash_generated_field = "6F563F6D96E3715972347A08AA7ECEA8")

    private boolean mVoiceButtonEnabled;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.191 -0400", hash_original_field = "C4702E681C3BD612CDA9DBDCFA59D47C", hash_generated_field = "548274ED005EA0BA1FFEE17A1050C8BD")

    private CharSequence mOldQueryText;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.191 -0400", hash_original_field = "336CD107D0D6B9BEBFB6CBC4E3350BF4", hash_generated_field = "3AEB2D2A42F37E91B98257CE593EDED2")

    private CharSequence mUserQuery;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.191 -0400", hash_original_field = "2ADA50DD7E29822F5E0707216EB09E8F", hash_generated_field = "EC81987BA3E4E312EA0C0424E31419B5")

    private boolean mExpandedInActionView;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.191 -0400", hash_original_field = "BB450BF1FD38EAFA71E793F3C559386F", hash_generated_field = "1D7B31D5465A178BB6E6B80FD3070C61")

    private int mCollapsedImeOptions;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.191 -0400", hash_original_field = "43A23F0BB5F798E421F2CC49BC43D947", hash_generated_field = "6F1511307A7DE5E4BDCE1D082D25D113")

    private SearchableInfo mSearchable;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.191 -0400", hash_original_field = "9AD25D597D917C37D99A80719B4F8F99", hash_generated_field = "59F218E5E058390715FC276BA2A49292")

    private Bundle mAppSearchData;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.192 -0400", hash_original_field = "53A427FD16557EC7A190A6A22832513B", hash_generated_field = "2FEA145A5676C108111A17124CAB832E")

    private Runnable mShowImeRunnable = new Runnable() {        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.192 -0400", hash_original_method = "0C9F4768975D596BB26A07FA95497352", hash_generated_method = "B40D8DB4A2FD60707CF1E6FE3690FD6A")
        public void run() {
            InputMethodManager imm;
            imm = (InputMethodManager)
                    getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
            {
                imm.showSoftInputUnchecked(0, null);
            } //End block
            // ---------- Original Method ----------
            //InputMethodManager imm = (InputMethodManager)
                    //getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
            //if (imm != null) {
                //imm.showSoftInputUnchecked(0, null);
            //}
        }

        
};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.192 -0400", hash_original_field = "E89A5EA49EA144C7FEB827EB20CCD537", hash_generated_field = "3E82A62C02A221DB46B64E9D6A72E0E4")

    private Runnable mUpdateDrawableStateRunnable = new Runnable() {        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.192 -0400", hash_original_method = "E7E2D783E1837F9E8B1A28FF4E183514", hash_generated_method = "B3EAFD427E9292CB229208955575A412")
        public void run() {
            updateFocusedState();
            // ---------- Original Method ----------
            //updateFocusedState();
        }

        
};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.192 -0400", hash_original_field = "D5FA47F6738ED48B04D60BB4B31A6FC7", hash_generated_field = "28944FD1EA21BA006295DAC30FF3D98B")

    private Runnable mReleaseCursorRunnable = new Runnable() {        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.192 -0400", hash_original_method = "EDF4C3DBCA8CFDCCDE7923F1B773494D", hash_generated_method = "5D09A5A32E2149C6D8DDAB1034633D73")
        public void run() {
            {
                mSuggestionsAdapter.changeCursor(null);
            } //End block
            // ---------- Original Method ----------
            //if (mSuggestionsAdapter != null && mSuggestionsAdapter instanceof SuggestionsAdapter) {
                //mSuggestionsAdapter.changeCursor(null);
            //}
        }

        
};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.192 -0400", hash_original_field = "04D6CDF64323839563B4F92092B41FA4", hash_generated_field = "72504DA1E4071FF872DD4C2D7A26922B")

    private Intent mVoiceWebSearchIntent;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.192 -0400", hash_original_field = "11E5F1DDAB281A77343908AB3E79EC12", hash_generated_field = "FEBA65D5D58AD1CB3F0ABB729B735300")

    private Intent mVoiceAppSearchIntent;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.193 -0400", hash_original_field = "25DE515824825836C5E934A10C853314", hash_generated_field = "3034E1502821518270FF828148D55FBA")

    private WeakHashMap<String, Drawable.ConstantState> mOutsideDrawablesCache = new WeakHashMap<String, Drawable.ConstantState>();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.193 -0400", hash_original_field = "E56B6AE5C5C1EC6D8C4214BFA55B7404", hash_generated_field = "136A16588FD063B769DD5FA42678D557")

    private OnClickListener mOnClickListener = new OnClickListener() {        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.193 -0400", hash_original_method = "7A1C93089C02ACFF37CDB0A860AADCE9", hash_generated_method = "857C3F42BD32BE6A104B549FBE8CE91E")
        public void onClick(View v) {
            //DSFIXME:  CODE0009: Possible callback target function detected
            {
                onSearchClicked();
            } //End block
            {
                onCloseClicked();
            } //End block
            {
                onSubmitQuery();
            } //End block
            {
                onVoiceClicked();
            } //End block
            {
                forceSuggestionQuery();
            } //End block
            addTaint(v.getTaint());
            // ---------- Original Method ----------
            //if (v == mSearchButton) {
                //onSearchClicked();
            //} else if (v == mCloseButton) {
                //onCloseClicked();
            //} else if (v == mSubmitButton) {
                //onSubmitQuery();
            //} else if (v == mVoiceButton) {
                //onVoiceClicked();
            //} else if (v == mQueryTextView) {
                //forceSuggestionQuery();
            //}
        }

        
};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.194 -0400", hash_original_field = "D5990E38F43E01B338867BDD320AE319", hash_generated_field = "16B8DA9828CF09F8181A51DE766A3E55")

    View.OnKeyListener mTextKeyListener = new View.OnKeyListener() {        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.194 -0400", hash_original_method = "6918EF31FF46DE3F47367E08809323A7", hash_generated_method = "1CAA3A9D020984D3735CB990C332F668")
        public boolean onKey(View v, int keyCode, KeyEvent event) {
            //DSFIXME:  CODE0009: Possible callback target function detected
            {
                Log.d(LOG_TAG, "mTextListener.onKey(" + keyCode + "," + event + "), selection: "
                        + mQueryTextView.getListSelection());
            } //End block
            {
                boolean varE6EA52064C48DD8716C3E906CB173C57_1440369543 = (mQueryTextView.isPopupShowing()
                    && mQueryTextView.getListSelection() != ListView.INVALID_POSITION);
                {
                    boolean var61B897F82409A70C761917364CAB3F30_1712421930 = (onSuggestionsKey(v, keyCode, event));
                } //End block
            } //End collapsed parenthetic
            {
                boolean varE59197EBDDDE38F1D5742B373FE3954C_1588125715 = (!mQueryTextView.isEmpty() && event.hasNoModifiers());
                {
                    {
                        boolean varA6D964A9D1A4D1D485BD8D60F2BFCDEE_379733899 = (event.getAction() == KeyEvent.ACTION_UP);
                        {
                            {
                                v.cancelLongPress();
                                launchQuerySearch(KeyEvent.KEYCODE_UNKNOWN, null, mQueryTextView.getText()
                                .toString());
                            } //End block
                        } //End block
                    } //End collapsed parenthetic
                    {
                        boolean var53B1438B0BA4D5FAD39095EFE3E69325_566863451 = (event.getAction() == KeyEvent.ACTION_DOWN);
                        {
                            SearchableInfo.ActionKeyInfo actionKey;
                            actionKey = mSearchable.findActionKey(keyCode);
                            {
                                boolean var2CE6658B093840CDBB7A8A4DB4461BFB_1727784077 = ((actionKey != null) && (actionKey.getQueryActionMsg() != null));
                                {
                                    launchQuerySearch(keyCode, actionKey.getQueryActionMsg(), mQueryTextView
                                .getText().toString());
                                } //End block
                            } //End collapsed parenthetic
                        } //End block
                    } //End collapsed parenthetic
                } //End block
            } //End collapsed parenthetic
            addTaint(v.getTaint());
            addTaint(keyCode);
            addTaint(event.getTaint());
            boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1412619948 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_1412619948;
            // ---------- Original Method ----------
            // Original Method Too Long, Refer to Original Implementation
        }

        
};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.195 -0400", hash_original_field = "0F7F47B24D27A009635AE79463FA69D4", hash_generated_field = "BE18056539FED75E84A9E2E165ADAE76")

    private OnEditorActionListener mOnEditorActionListener = new OnEditorActionListener() {        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.195 -0400", hash_original_method = "D29597D64DD97652D3ABF8CFD2738E45", hash_generated_method = "F78BE10E7A011A87005240F1C8139407")
        public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
            //DSFIXME:  CODE0009: Possible callback target function detected
            onSubmitQuery();
            addTaint(v.getTaint());
            addTaint(actionId);
            addTaint(event.getTaint());
            boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_198988687 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_198988687;
            // ---------- Original Method ----------
            //onSubmitQuery();
            //return true;
        }

        
};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.195 -0400", hash_original_field = "CA6AB8BFD0E4BC5A9CFF895D3BE46EF6", hash_generated_field = "822B86AF540733A6F6C388399050CF88")

    private OnItemClickListener mOnItemClickListener = new OnItemClickListener() {        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.195 -0400", hash_original_method = "5E212E5821217E2BB1A383DD15E7F009", hash_generated_method = "B4B056AC6204886414378AA45400D874")
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            //DSFIXME:  CODE0009: Possible callback target function detected
            Log.d(LOG_TAG, "onItemClick() position " + position);
            onItemClicked(position, KeyEvent.KEYCODE_UNKNOWN, null);
            addTaint(parent.getTaint());
            addTaint(view.getTaint());
            addTaint(position);
            addTaint(id);
            // ---------- Original Method ----------
            //if (DBG) Log.d(LOG_TAG, "onItemClick() position " + position);
            //onItemClicked(position, KeyEvent.KEYCODE_UNKNOWN, null);
        }

        
};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.212 -0400", hash_original_field = "6A3EFB855A77C09B3BD750B0273F292F", hash_generated_field = "0BA1F5B5C6BCC5B87843474BAA47AA52")

    private OnItemSelectedListener mOnItemSelectedListener = new OnItemSelectedListener() {        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.208 -0400", hash_original_method = "86CEF1E2408F388AD82C104FE40AC329", hash_generated_method = "E1005CD7FCFF5871C5EF1DEFF67BDB1A")
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            //DSFIXME:  CODE0009: Possible callback target function detected
            Log.d(LOG_TAG, "onItemSelected() position " + position);
            SearchView.this.onItemSelected(position);
            addTaint(parent.getTaint());
            addTaint(view.getTaint());
            addTaint(position);
            addTaint(id);
            // ---------- Original Method ----------
            //if (DBG) Log.d(LOG_TAG, "onItemSelected() position " + position);
            //SearchView.this.onItemSelected(position);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.212 -0400", hash_original_method = "4FDA6539116BD7730EFFECAC0128D708", hash_generated_method = "2DDB29F13F7959438D3B545352D01AE8")
        public void onNothingSelected(AdapterView<?> parent) {
            //DSFIXME:  CODE0009: Possible callback target function detected
            Log.d(LOG_TAG, "onNothingSelected()");
            addTaint(parent.getTaint());
            // ---------- Original Method ----------
            //if (DBG)
                //Log.d(LOG_TAG, "onNothingSelected()");
        }

        
};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.213 -0400", hash_original_field = "75D7929A1F386992A1A2654F9F8EC228", hash_generated_field = "4C7E4774FE4B1FC51EDD28D5CEC13065")

    private TextWatcher mTextWatcher = new TextWatcher() {        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.212 -0400", hash_original_method = "EAE2EA11EF016FE6B504EAA4A71A905F", hash_generated_method = "B9D33D7ABAFF92DBB026AAD80BA044BF")
        public void beforeTextChanged(CharSequence s, int start, int before, int after) {
            addTaint(s.getTaint());
            addTaint(start);
            addTaint(before);
            addTaint(after);
            // ---------- Original Method ----------
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.213 -0400", hash_original_method = "F1038C7BDD17D1F93B5C6C4513E79DEF", hash_generated_method = "E73A50E8246DFD8A4B60F7797FF258B8")
        public void onTextChanged(CharSequence s, int start,
                int before, int after) {
            //DSFIXME:  CODE0009: Possible callback target function detected
            SearchView.this.onTextChanged(s);
            addTaint(s.getTaint());
            addTaint(start);
            addTaint(before);
            addTaint(after);
            // ---------- Original Method ----------
            //SearchView.this.onTextChanged(s);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.213 -0400", hash_original_method = "2B62725FCE5BAC340D42F3403AAE31A5", hash_generated_method = "B1E73F6E6A3A9E89AEF9681CB19F89E5")
        public void afterTextChanged(Editable s) {
            addTaint(s.getTaint());
            // ---------- Original Method ----------
        }

        
};
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.213 -0400", hash_original_method = "C1ED4F339F78000C40B1DF7945901DEA", hash_generated_method = "599F11E85D18C4EE741C206F7CE214FA")
    public  SearchView(Context context) {
        this(context, null);
        addTaint(context.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.243 -0400", hash_original_method = "3896FE61014E55816F436D09C274C5F6", hash_generated_method = "CBB229DF248B455C32AA7DAC6781EDB5")
    public  SearchView(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater inflater;
        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.search_view, this, true);
        mSearchButton = findViewById(R.id.search_button);
        mQueryTextView = (SearchAutoComplete) findViewById(R.id.search_src_text);
        mQueryTextView.setSearchView(this);
        mSearchEditFrame = findViewById(R.id.search_edit_frame);
        mSearchPlate = findViewById(R.id.search_plate);
        mSubmitArea = findViewById(R.id.submit_area);
        mSubmitButton = findViewById(R.id.search_go_btn);
        mCloseButton = (ImageView) findViewById(R.id.search_close_btn);
        mVoiceButton = findViewById(R.id.search_voice_btn);
        mSearchHintIcon = (ImageView) findViewById(R.id.search_mag_icon);
        mSearchButton.setOnClickListener(mOnClickListener);
        mCloseButton.setOnClickListener(mOnClickListener);
        mSubmitButton.setOnClickListener(mOnClickListener);
        mVoiceButton.setOnClickListener(mOnClickListener);
        mQueryTextView.setOnClickListener(mOnClickListener);
        mQueryTextView.addTextChangedListener(mTextWatcher);
        mQueryTextView.setOnEditorActionListener(mOnEditorActionListener);
        mQueryTextView.setOnItemClickListener(mOnItemClickListener);
        mQueryTextView.setOnItemSelectedListener(mOnItemSelectedListener);
        mQueryTextView.setOnKeyListener(mTextKeyListener);
        mQueryTextView.setOnFocusChangeListener(new OnFocusChangeListener() {            
            @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.223 -0400", hash_original_method = "93DBFCC4F7C7F6082C428361FF73C717", hash_generated_method = "15BB0F029A2D9CBA0E147567850FF072")
            public void onFocusChange(View v, boolean hasFocus) {
                //DSFIXME:  CODE0009: Possible callback target function detected
                {
                    mOnQueryTextFocusChangeListener.onFocusChange(SearchView.this, hasFocus);
                } //End block
                addTaint(v.getTaint());
                addTaint(hasFocus);
                // ---------- Original Method ----------
                //if (mOnQueryTextFocusChangeListener != null) {
                    //mOnQueryTextFocusChangeListener.onFocusChange(SearchView.this, hasFocus);
                //}
            }
});
        TypedArray a;
        a = context.obtainStyledAttributes(attrs, R.styleable.SearchView, 0, 0);
        setIconifiedByDefault(a.getBoolean(R.styleable.SearchView_iconifiedByDefault, true));
        int maxWidth;
        maxWidth = a.getDimensionPixelSize(R.styleable.SearchView_maxWidth, -1);
        {
            setMaxWidth(maxWidth);
        } //End block
        CharSequence queryHint;
        queryHint = a.getText(R.styleable.SearchView_queryHint);
        {
            boolean varC80C3FDE5CDED7C0FBD0A83E98220CA5_371116190 = (!TextUtils.isEmpty(queryHint));
            {
                setQueryHint(queryHint);
            } //End block
        } //End collapsed parenthetic
        int imeOptions;
        imeOptions = a.getInt(R.styleable.SearchView_imeOptions, -1);
        {
            setImeOptions(imeOptions);
        } //End block
        int inputType;
        inputType = a.getInt(R.styleable.SearchView_inputType, -1);
        {
            setInputType(inputType);
        } //End block
        a.recycle();
        boolean focusable;
        focusable = true;
        a = context.obtainStyledAttributes(attrs, R.styleable.View, 0, 0);
        focusable = a.getBoolean(R.styleable.View_focusable, focusable);
        a.recycle();
        setFocusable(focusable);
        mVoiceWebSearchIntent = new Intent(RecognizerIntent.ACTION_WEB_SEARCH);
        mVoiceWebSearchIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mVoiceWebSearchIntent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_WEB_SEARCH);
        mVoiceAppSearchIntent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        mVoiceAppSearchIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mDropDownAnchor = findViewById(mQueryTextView.getDropDownAnchor());
        {
            mDropDownAnchor.addOnLayoutChangeListener(new OnLayoutChangeListener() {                
                @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.224 -0400", hash_original_method = "1877F5683C45A9DD10AF559CB44A52A8", hash_generated_method = "346E0E37BB8C5A92B30B1A933421EF74")
                @Override
                public void onLayoutChange(View v, int left, int top, int right, int bottom,
                        int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    //DSFIXME:  CODE0009: Possible callback target function detected
                    adjustDropDownSizeAndPosition();
                    addTaint(v.getTaint());
                    addTaint(left);
                    addTaint(top);
                    addTaint(right);
                    addTaint(bottom);
                    addTaint(oldLeft);
                    addTaint(oldTop);
                    addTaint(oldRight);
                    addTaint(oldBottom);
                    // ---------- Original Method ----------
                    //adjustDropDownSizeAndPosition();
                }
});
        } //End block
        updateViewsVisibility(mIconifiedByDefault);
        updateQueryHint();
        addTaint(context.getTaint());
        addTaint(attrs.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.248 -0400", hash_original_method = "D9A30BFA849ECE06409E134B6DE5C1F0", hash_generated_method = "4217E3830737A15019649D32BF3F9671")
    public void setSearchableInfo(SearchableInfo searchable) {
        mSearchable = searchable;
        {
            updateSearchAutoComplete();
            updateQueryHint();
        } //End block
        mVoiceButtonEnabled = hasVoiceSearch();
        {
            mQueryTextView.setPrivateImeOptions(IME_OPTION_NO_MICROPHONE);
        } //End block
        updateViewsVisibility(isIconified());
        // ---------- Original Method ----------
        //mSearchable = searchable;
        //if (mSearchable != null) {
            //updateSearchAutoComplete();
            //updateQueryHint();
        //}
        //mVoiceButtonEnabled = hasVoiceSearch();
        //if (mVoiceButtonEnabled) {
            //mQueryTextView.setPrivateImeOptions(IME_OPTION_NO_MICROPHONE);
        //}
        //updateViewsVisibility(isIconified());
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.249 -0400", hash_original_method = "EBA44227BB74F0B08E6F1C70EA9AD0F7", hash_generated_method = "9F0ED82A7B1E8B7E54C4455D92283D55")
    public void setAppSearchData(Bundle appSearchData) {
        mAppSearchData = appSearchData;
        // ---------- Original Method ----------
        //mAppSearchData = appSearchData;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.249 -0400", hash_original_method = "A9C55FF5F962662498ECAD2C137876AF", hash_generated_method = "89FA12C923C5B083B90193928D3BCB41")
    public void setImeOptions(int imeOptions) {
        mQueryTextView.setImeOptions(imeOptions);
        addTaint(imeOptions);
        // ---------- Original Method ----------
        //mQueryTextView.setImeOptions(imeOptions);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.249 -0400", hash_original_method = "48CC06180C89621288EE9E924CBC5764", hash_generated_method = "4BE085BDB602CE7E85A50562333E8D94")
    public void setInputType(int inputType) {
        mQueryTextView.setInputType(inputType);
        addTaint(inputType);
        // ---------- Original Method ----------
        //mQueryTextView.setInputType(inputType);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.250 -0400", hash_original_method = "83E343EB647417E47B475AFEA392BC7D", hash_generated_method = "237FE6C10087FE4DDD50CE27E166B2D0")
    @Override
    public boolean requestFocus(int direction, Rect previouslyFocusedRect) {
        {
            boolean var8DB70F00D9A309F787FE648FEF017045_327653966 = (!isFocusable());
        } //End collapsed parenthetic
        {
            boolean varCD5C141A0C77A05F6864C5164FA139BA_1278402310 = (!isIconified());
            {
                boolean result;
                result = mQueryTextView.requestFocus(direction, previouslyFocusedRect);
                {
                    updateViewsVisibility(false);
                } //End block
            } //End block
            {
                boolean var7EEFFE453EE8B06336FEADC34AE77D1B_1434280078 = (super.requestFocus(direction, previouslyFocusedRect));
            } //End block
        } //End collapsed parenthetic
        addTaint(direction);
        addTaint(previouslyFocusedRect.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_238570620 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_238570620;
        // ---------- Original Method ----------
        //if (mClearingFocus) return false;
        //if (!isFocusable()) return false;
        //if (!isIconified()) {
            //boolean result = mQueryTextView.requestFocus(direction, previouslyFocusedRect);
            //if (result) {
                //updateViewsVisibility(false);
            //}
            //return result;
        //} else {
            //return super.requestFocus(direction, previouslyFocusedRect);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.254 -0400", hash_original_method = "65B369A9FAEBC12EA58ACD6F427C9883", hash_generated_method = "A6CAF4E8BDA1F89ACF64F4B0D6BA3049")
    @Override
    public void clearFocus() {
        mClearingFocus = true;
        setImeVisibility(false);
        super.clearFocus();
        mQueryTextView.clearFocus();
        mClearingFocus = false;
        // ---------- Original Method ----------
        //mClearingFocus = true;
        //setImeVisibility(false);
        //super.clearFocus();
        //mQueryTextView.clearFocus();
        //mClearingFocus = false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.254 -0400", hash_original_method = "5F51E4234BD6E41AFB4ED2E85F8CC1A5", hash_generated_method = "9ED055F823619F93416123D3D749DA22")
    public void setOnQueryTextListener(OnQueryTextListener listener) {
        mOnQueryChangeListener = listener;
        // ---------- Original Method ----------
        //mOnQueryChangeListener = listener;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.266 -0400", hash_original_method = "5C0B64E237CFC180C92A60294DA35470", hash_generated_method = "53357DC670AF8DA5EBA61C8EACD2EFB0")
    public void setOnCloseListener(OnCloseListener listener) {
        mOnCloseListener = listener;
        // ---------- Original Method ----------
        //mOnCloseListener = listener;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.266 -0400", hash_original_method = "2E189EEDC80EC67610C89143836C4DBB", hash_generated_method = "0E136A746D1DACCB2ECA5B20AA0683B2")
    public void setOnQueryTextFocusChangeListener(OnFocusChangeListener listener) {
        mOnQueryTextFocusChangeListener = listener;
        // ---------- Original Method ----------
        //mOnQueryTextFocusChangeListener = listener;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.266 -0400", hash_original_method = "5242CF20D6A154AA5BAD996C3A14A890", hash_generated_method = "B2386EAE9CE311FF03E5CAA313730E12")
    public void setOnSuggestionListener(OnSuggestionListener listener) {
        mOnSuggestionListener = listener;
        // ---------- Original Method ----------
        //mOnSuggestionListener = listener;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.267 -0400", hash_original_method = "AFFD80E7D30CC6B8E84DA9D0AC11DA43", hash_generated_method = "8D05E5C8F36ECC1939C7C9EC7679070B")
    public void setOnSearchClickListener(OnClickListener listener) {
        mOnSearchClickListener = listener;
        // ---------- Original Method ----------
        //mOnSearchClickListener = listener;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.267 -0400", hash_original_method = "BDCF19F1BD9841AC2C41BDBA087D55A0", hash_generated_method = "516D314E11A0883004103A17D0DBECFE")
    public CharSequence getQuery() {
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_1276724225 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1276724225 = mQueryTextView.getText();
        varB4EAC82CA7396A68D541C85D26508E83_1276724225.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1276724225;
        // ---------- Original Method ----------
        //return mQueryTextView.getText();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.268 -0400", hash_original_method = "5407FC5F92134D6A89C79A4C1515F538", hash_generated_method = "80981CD6E9F1744B87FD3964131BAA9B")
    public void setQuery(CharSequence query, boolean submit) {
        mQueryTextView.setText(query);
        {
            mQueryTextView.setSelection(query.length());
            mUserQuery = query;
        } //End block
        {
            boolean var9242B3EAE17A7A89184E70A84C88F6F2_1254028912 = (submit && !TextUtils.isEmpty(query));
            {
                onSubmitQuery();
            } //End block
        } //End collapsed parenthetic
        addTaint(submit);
        // ---------- Original Method ----------
        //mQueryTextView.setText(query);
        //if (query != null) {
            //mQueryTextView.setSelection(query.length());
            //mUserQuery = query;
        //}
        //if (submit && !TextUtils.isEmpty(query)) {
            //onSubmitQuery();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.268 -0400", hash_original_method = "E72A59E6C313C94D91D305DFD6AC06A2", hash_generated_method = "C5258471F3F6A52B795E7A34BC1D0815")
    public void setQueryHint(CharSequence hint) {
        mQueryHint = hint;
        updateQueryHint();
        // ---------- Original Method ----------
        //mQueryHint = hint;
        //updateQueryHint();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.268 -0400", hash_original_method = "ACA6D63CA1F64B4CD762BEE0367B8A15", hash_generated_method = "C1C40590AD400E11F2F5E0F72062B442")
    public void setIconifiedByDefault(boolean iconified) {
        mIconifiedByDefault = iconified;
        updateViewsVisibility(iconified);
        updateQueryHint();
        // ---------- Original Method ----------
        //if (mIconifiedByDefault == iconified) return;
        //mIconifiedByDefault = iconified;
        //updateViewsVisibility(iconified);
        //updateQueryHint();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.269 -0400", hash_original_method = "B0C72E24DA4703D19B476F7F5669A367", hash_generated_method = "0F7CF517502790CD12EF6722867BEEEA")
    public boolean isIconfiedByDefault() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1987114630 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1987114630;
        // ---------- Original Method ----------
        //return mIconifiedByDefault;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.270 -0400", hash_original_method = "1D615B467973354655EE36C4E6E1B780", hash_generated_method = "C1BB4C26F03DA0B1EFB160E3FBBB56CB")
    public void setIconified(boolean iconify) {
        {
            onCloseClicked();
        } //End block
        {
            onSearchClicked();
        } //End block
        addTaint(iconify);
        // ---------- Original Method ----------
        //if (iconify) {
            //onCloseClicked();
        //} else {
            //onSearchClicked();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.270 -0400", hash_original_method = "844ED2B05054700D6A1A7C47A43DB3F5", hash_generated_method = "3AFB81013B6B010C587C39302F9A71CC")
    public boolean isIconified() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2073382358 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2073382358;
        // ---------- Original Method ----------
        //return mIconified;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.287 -0400", hash_original_method = "3C1CA8493C58EB873C43522E7F5B066C", hash_generated_method = "34E7EF197158544A73303BA658DD68FC")
    public void setSubmitButtonEnabled(boolean enabled) {
        mSubmitButtonEnabled = enabled;
        updateViewsVisibility(isIconified());
        // ---------- Original Method ----------
        //mSubmitButtonEnabled = enabled;
        //updateViewsVisibility(isIconified());
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.287 -0400", hash_original_method = "A8CFD3302CC6C1FBD45FF4B867C72D5B", hash_generated_method = "B80048386F325203F388F21A28FEDDF0")
    public boolean isSubmitButtonEnabled() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_289944411 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_289944411;
        // ---------- Original Method ----------
        //return mSubmitButtonEnabled;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.288 -0400", hash_original_method = "29051F8E555BD7A9218D5240E768869F", hash_generated_method = "F52DE3F2037C7D7B009F5749A8C303C2")
    public void setQueryRefinementEnabled(boolean enable) {
        mQueryRefinement = enable;
        {
            ((SuggestionsAdapter) mSuggestionsAdapter).setQueryRefinement(
                    enable ? SuggestionsAdapter.REFINE_ALL : SuggestionsAdapter.REFINE_BY_ENTRY);
        } //End block
        // ---------- Original Method ----------
        //mQueryRefinement = enable;
        //if (mSuggestionsAdapter instanceof SuggestionsAdapter) {
            //((SuggestionsAdapter) mSuggestionsAdapter).setQueryRefinement(
                    //enable ? SuggestionsAdapter.REFINE_ALL : SuggestionsAdapter.REFINE_BY_ENTRY);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.289 -0400", hash_original_method = "A374A24A58636548BF0B2ADA0B696601", hash_generated_method = "CEC03EEA98EC5ED8E476EB5E09A247D5")
    public boolean isQueryRefinementEnabled() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_761835527 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_761835527;
        // ---------- Original Method ----------
        //return mQueryRefinement;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.289 -0400", hash_original_method = "23DC9EA74A588F20B69495720EC7B1A3", hash_generated_method = "82E6E3C70E0F49F4867D93600C8A7BAD")
    public void setSuggestionsAdapter(CursorAdapter adapter) {
        mSuggestionsAdapter = adapter;
        mQueryTextView.setAdapter(mSuggestionsAdapter);
        // ---------- Original Method ----------
        //mSuggestionsAdapter = adapter;
        //mQueryTextView.setAdapter(mSuggestionsAdapter);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.299 -0400", hash_original_method = "D43CFDAE734651DCDEBEEE22CB7FB2A7", hash_generated_method = "0A8D948136041007203F26C0D9800019")
    public CursorAdapter getSuggestionsAdapter() {
        CursorAdapter varB4EAC82CA7396A68D541C85D26508E83_1876328872 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1876328872 = mSuggestionsAdapter;
        varB4EAC82CA7396A68D541C85D26508E83_1876328872.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1876328872;
        // ---------- Original Method ----------
        //return mSuggestionsAdapter;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.300 -0400", hash_original_method = "8FF296A57B18752E84CEF7286CDC8903", hash_generated_method = "EF695F3DEED2DE41932D6D479BE99F2A")
    public void setMaxWidth(int maxpixels) {
        mMaxWidth = maxpixels;
        requestLayout();
        // ---------- Original Method ----------
        //mMaxWidth = maxpixels;
        //requestLayout();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.301 -0400", hash_original_method = "455591DBA8980F8F128C9C99FA0F791A", hash_generated_method = "10E876F902B42232982CCCB5B7E959C2")
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        {
            boolean var9CB88D429CDA0C605332B4B8BAA0D08B_1088267590 = (isIconified());
            {
                super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            } //End block
        } //End collapsed parenthetic
        int widthMode;
        widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int width;
        width = MeasureSpec.getSize(widthMeasureSpec);
        //Begin case MeasureSpec.AT_MOST 
        {
            width = Math.min(mMaxWidth, width);
        } //End block
        {
            width = Math.min(getPreferredWidth(), width);
        } //End block
        //End case MeasureSpec.AT_MOST 
        //Begin case MeasureSpec.EXACTLY 
        {
            width = Math.min(mMaxWidth, width);
        } //End block
        //End case MeasureSpec.EXACTLY 
        //Begin case MeasureSpec.UNSPECIFIED 
        width = mMaxWidth > 0 ? mMaxWidth : getPreferredWidth();
        //End case MeasureSpec.UNSPECIFIED 
        widthMode = MeasureSpec.EXACTLY;
        super.onMeasure(MeasureSpec.makeMeasureSpec(width, widthMode), heightMeasureSpec);
        addTaint(widthMeasureSpec);
        addTaint(heightMeasureSpec);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.301 -0400", hash_original_method = "28B5EEA3A28B4F5F076920D5EA4FBBAC", hash_generated_method = "A6AB100FC200D6681D8BA93C0D3211EA")
    private int getPreferredWidth() {
        int var1DFA48C11562BB9C778ED25A8E5697EF_1347934840 = (getContext().getResources()
                .getDimensionPixelSize(R.dimen.search_view_preferred_width));
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_278490690 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_278490690;
        // ---------- Original Method ----------
        //return getContext().getResources()
                //.getDimensionPixelSize(R.dimen.search_view_preferred_width);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.302 -0400", hash_original_method = "7F3DE149B8C5E14764DBC69CC4EE105A", hash_generated_method = "BBF8A13F947B870C9E37ED8544E9229A")
    private void updateViewsVisibility(final boolean collapsed) {
        mIconified = collapsed;
        int visCollapsed;
        visCollapsed = VISIBLE;
        visCollapsed = GONE;
        boolean hasText;
        hasText = !TextUtils.isEmpty(mQueryTextView.getText());
        mSearchButton.setVisibility(visCollapsed);
        updateSubmitButton(hasText);
        mSearchEditFrame.setVisibility(collapsed ? GONE : VISIBLE);
        mSearchHintIcon.setVisibility(mIconifiedByDefault ? GONE : VISIBLE);
        updateCloseButton();
        updateVoiceButton(!hasText);
        updateSubmitArea();
        // ---------- Original Method ----------
        //mIconified = collapsed;
        //final int visCollapsed = collapsed ? VISIBLE : GONE;
        //final boolean hasText = !TextUtils.isEmpty(mQueryTextView.getText());
        //mSearchButton.setVisibility(visCollapsed);
        //updateSubmitButton(hasText);
        //mSearchEditFrame.setVisibility(collapsed ? GONE : VISIBLE);
        //mSearchHintIcon.setVisibility(mIconifiedByDefault ? GONE : VISIBLE);
        //updateCloseButton();
        //updateVoiceButton(!hasText);
        //updateSubmitArea();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.320 -0400", hash_original_method = "1F6B21487B2FA81D5679515DB4F108DF", hash_generated_method = "B523F8F3B2468D4DE25A0CD196C941CC")
    private boolean hasVoiceSearch() {
        {
            boolean var7CD733601A61864D0CEC141D0D3E93F1_79963767 = (mSearchable != null && mSearchable.getVoiceSearchEnabled());
            {
                Intent testIntent;
                testIntent = null;
                {
                    boolean varE115433D5D367A06EC1291A48F299B73_1171615203 = (mSearchable.getVoiceSearchLaunchWebSearch());
                    {
                        testIntent = mVoiceWebSearchIntent;
                    } //End block
                    {
                        boolean varDE5F6591B1893B8D2949FC45E45FA986_1513800630 = (mSearchable.getVoiceSearchLaunchRecognizer());
                        {
                            testIntent = mVoiceAppSearchIntent;
                        } //End block
                    } //End collapsed parenthetic
                } //End collapsed parenthetic
                {
                    ResolveInfo ri;
                    ri = getContext().getPackageManager().resolveActivity(testIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                } //End block
            } //End block
        } //End collapsed parenthetic
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1560894579 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1560894579;
        // ---------- Original Method ----------
        //if (mSearchable != null && mSearchable.getVoiceSearchEnabled()) {
            //Intent testIntent = null;
            //if (mSearchable.getVoiceSearchLaunchWebSearch()) {
                //testIntent = mVoiceWebSearchIntent;
            //} else if (mSearchable.getVoiceSearchLaunchRecognizer()) {
                //testIntent = mVoiceAppSearchIntent;
            //}
            //if (testIntent != null) {
                //ResolveInfo ri = getContext().getPackageManager().resolveActivity(testIntent,
                        //PackageManager.MATCH_DEFAULT_ONLY);
                //return ri != null;
            //}
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.321 -0400", hash_original_method = "E98BAF533B4581CBC109A603E4339AE5", hash_generated_method = "EB59E81C4C4F948CC464834B07453D32")
    private boolean isSubmitAreaEnabled() {
        boolean var81656F16A1D45B5B6822129878881E75_912563918 = ((mSubmitButtonEnabled || mVoiceButtonEnabled) && !isIconified());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_588644502 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_588644502;
        // ---------- Original Method ----------
        //return (mSubmitButtonEnabled || mVoiceButtonEnabled) && !isIconified();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.322 -0400", hash_original_method = "956EC0D217930FCBDABBCC447139885F", hash_generated_method = "1C9642449F106184D054EC720E422AF9")
    private void updateSubmitButton(boolean hasText) {
        int visibility;
        visibility = GONE;
        {
            boolean varC111929E1238EF6E7C5A396EC91615E0_1982205583 = (mSubmitButtonEnabled && isSubmitAreaEnabled() && hasFocus()
                && (hasText || !mVoiceButtonEnabled));
            {
                visibility = VISIBLE;
            } //End block
        } //End collapsed parenthetic
        mSubmitButton.setVisibility(visibility);
        addTaint(hasText);
        // ---------- Original Method ----------
        //int visibility = GONE;
        //if (mSubmitButtonEnabled && isSubmitAreaEnabled() && hasFocus()
                //&& (hasText || !mVoiceButtonEnabled)) {
            //visibility = VISIBLE;
        //}
        //mSubmitButton.setVisibility(visibility);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.322 -0400", hash_original_method = "FF9871F833F63C36B3921C4F59B0ED2F", hash_generated_method = "FC084A7690ABF92D9B413E89B15656BD")
    private void updateSubmitArea() {
        int visibility;
        visibility = GONE;
        {
            boolean var970FABBB7F1A591E8D4BEDE840BD2DF3_1681253410 = (isSubmitAreaEnabled()
                && (mSubmitButton.getVisibility() == VISIBLE
                        || mVoiceButton.getVisibility() == VISIBLE));
            {
                visibility = VISIBLE;
            } //End block
        } //End collapsed parenthetic
        mSubmitArea.setVisibility(visibility);
        // ---------- Original Method ----------
        //int visibility = GONE;
        //if (isSubmitAreaEnabled()
                //&& (mSubmitButton.getVisibility() == VISIBLE
                        //|| mVoiceButton.getVisibility() == VISIBLE)) {
            //visibility = VISIBLE;
        //}
        //mSubmitArea.setVisibility(visibility);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.326 -0400", hash_original_method = "31438C0932D7B883B0B6F7C1A8D11C73", hash_generated_method = "D53198375AD17F7978B8F3AB090BD95A")
    private void updateCloseButton() {
        boolean hasText;
        hasText = !TextUtils.isEmpty(mQueryTextView.getText());
        boolean showClose;
        showClose = hasText || (mIconifiedByDefault && !mExpandedInActionView);
        mCloseButton.setVisibility(showClose ? VISIBLE : GONE);
        mCloseButton.getDrawable().setState(hasText ? ENABLED_STATE_SET : EMPTY_STATE_SET);
        // ---------- Original Method ----------
        //final boolean hasText = !TextUtils.isEmpty(mQueryTextView.getText());
        //final boolean showClose = hasText || (mIconifiedByDefault && !mExpandedInActionView);
        //mCloseButton.setVisibility(showClose ? VISIBLE : GONE);
        //mCloseButton.getDrawable().setState(hasText ? ENABLED_STATE_SET : EMPTY_STATE_SET);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.330 -0400", hash_original_method = "A19187F7BD510E54AC677DCF71153712", hash_generated_method = "E58D53BF8B2730472056F6D862C2F112")
    private void postUpdateFocusedState() {
        post(mUpdateDrawableStateRunnable);
        // ---------- Original Method ----------
        //post(mUpdateDrawableStateRunnable);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.330 -0400", hash_original_method = "2FABE728CB7CDC63DD618939E6086EE5", hash_generated_method = "9F102B9A48DB7E4668EA50B8ACA81BBA")
    private void updateFocusedState() {
        boolean focused;
        focused = mQueryTextView.hasFocus();
        mSearchPlate.getBackground().setState(focused ? FOCUSED_STATE_SET : EMPTY_STATE_SET);
        mSubmitArea.getBackground().setState(focused ? FOCUSED_STATE_SET : EMPTY_STATE_SET);
        invalidate();
        // ---------- Original Method ----------
        //boolean focused = mQueryTextView.hasFocus();
        //mSearchPlate.getBackground().setState(focused ? FOCUSED_STATE_SET : EMPTY_STATE_SET);
        //mSubmitArea.getBackground().setState(focused ? FOCUSED_STATE_SET : EMPTY_STATE_SET);
        //invalidate();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.331 -0400", hash_original_method = "466B44C18A399269336D5B13075B3DD5", hash_generated_method = "541E8F066DEA567D4C20FD5E338EC369")
    @Override
    protected void onDetachedFromWindow() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        removeCallbacks(mUpdateDrawableStateRunnable);
        post(mReleaseCursorRunnable);
        super.onDetachedFromWindow();
        // ---------- Original Method ----------
        //removeCallbacks(mUpdateDrawableStateRunnable);
        //post(mReleaseCursorRunnable);
        //super.onDetachedFromWindow();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.331 -0400", hash_original_method = "10C83777364EAA061E75B08DB527338D", hash_generated_method = "32948940C05F8FBAE94818B4F50A9BA4")
    private void setImeVisibility(final boolean visible) {
        {
            post(mShowImeRunnable);
        } //End block
        {
            removeCallbacks(mShowImeRunnable);
            InputMethodManager imm;
            imm = (InputMethodManager)
                    getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
            {
                imm.hideSoftInputFromWindow(getWindowToken(), 0);
            } //End block
        } //End block
        addTaint(visible);
        // ---------- Original Method ----------
        //if (visible) {
            //post(mShowImeRunnable);
        //} else {
            //removeCallbacks(mShowImeRunnable);
            //InputMethodManager imm = (InputMethodManager)
                    //getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
            //if (imm != null) {
                //imm.hideSoftInputFromWindow(getWindowToken(), 0);
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.331 -0400", hash_original_method = "364D10214479FA13BFF6BDB192F3E0CD", hash_generated_method = "B80A5CCB6DF46041BC92C31F3029BD50")
     void onQueryRefine(CharSequence queryText) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        setQuery(queryText);
        addTaint(queryText.getTaint());
        // ---------- Original Method ----------
        //setQuery(queryText);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.332 -0400", hash_original_method = "E2E8A56E8AA279DA8CFFA9FDDF535879", hash_generated_method = "324CB09A6488E9FBA7481A7963F2165A")
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        SearchableInfo.ActionKeyInfo actionKey;
        actionKey = mSearchable.findActionKey(keyCode);
        {
            boolean var5CB2730BDD0F8A6AFECB97402B427F1B_1654678611 = ((actionKey != null) && (actionKey.getQueryActionMsg() != null));
            {
                launchQuerySearch(keyCode, actionKey.getQueryActionMsg(), mQueryTextView.getText()
                    .toString());
            } //End block
        } //End collapsed parenthetic
        boolean var8C6E6C19273FC56B5C56CC7DEF63ED7B_1352814862 = (super.onKeyDown(keyCode, event));
        addTaint(keyCode);
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1468436337 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1468436337;
        // ---------- Original Method ----------
        //if (mSearchable == null) {
            //return false;
        //}
        //SearchableInfo.ActionKeyInfo actionKey = mSearchable.findActionKey(keyCode);
        //if ((actionKey != null) && (actionKey.getQueryActionMsg() != null)) {
            //launchQuerySearch(keyCode, actionKey.getQueryActionMsg(), mQueryTextView.getText()
                    //.toString());
            //return true;
        //}
        //return super.onKeyDown(keyCode, event);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.347 -0400", hash_original_method = "2292125EFE6589DCDAE880647EC125AA", hash_generated_method = "BE9B87329E7EAF1580559DBD19882853")
    private boolean onSuggestionsKey(View v, int keyCode, KeyEvent event) {
        {
            boolean var96842DBF46FE1F5DB2349D1F8230BD47_1455278871 = (event.getAction() == KeyEvent.ACTION_DOWN && event.hasNoModifiers());
            {
                {
                    int position;
                    position = mQueryTextView.getListSelection();
                    boolean var524CB2E03CDD56BA662F9285090A5D2A_1256009938 = (onItemClicked(position, KeyEvent.KEYCODE_UNKNOWN, null));
                } //End block
                {
                    int selPoint;
                    selPoint = 0;
                    selPoint = mQueryTextView
                        .length();
                    mQueryTextView.setSelection(selPoint);
                    mQueryTextView.setListSelection(0);
                    mQueryTextView.clearListSelection();
                    mQueryTextView.ensureImeVisible(true);
                } //End block
                {
                    boolean var404CC5C85EC37EE7D9EAFA6391F0B425_912109165 = (keyCode == KeyEvent.KEYCODE_DPAD_UP && 0 == mQueryTextView.getListSelection());
                } //End collapsed parenthetic
                SearchableInfo.ActionKeyInfo actionKey;
                actionKey = mSearchable.findActionKey(keyCode);
                {
                    boolean varD6A63EA6CB82F1938533850645AC63CC_1416134760 = ((actionKey != null)
                    && ((actionKey.getSuggestActionMsg() != null) || (actionKey
                            .getSuggestActionMsgColumn() != null)));
                    {
                        int position;
                        position = mQueryTextView.getListSelection();
                        {
                            Cursor c;
                            c = mSuggestionsAdapter.getCursor();
                            {
                                boolean varAA3D0D8A8F9C1695507C58A83CA2F991_1730693073 = (c.moveToPosition(position));
                                {
                                    String actionMsg;
                                    actionMsg = getActionKeyMessage(c, actionKey);
                                    {
                                        boolean varCBF97EF6005E0ABB0B009E065E0E7581_562046159 = (actionMsg != null && (actionMsg.length() > 0));
                                        {
                                            boolean varEA30C83275615DF0CD0CC1A4EF5FFEC1_1109306865 = (onItemClicked(position, keyCode, actionMsg));
                                        } //End block
                                    } //End collapsed parenthetic
                                } //End block
                            } //End collapsed parenthetic
                        } //End block
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        addTaint(v.getTaint());
        addTaint(keyCode);
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1331278752 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1331278752;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
        private static String getActionKeyMessage(Cursor c, SearchableInfo.ActionKeyInfo actionKey) {
        String result = null;
        final String column = actionKey.getSuggestActionMsgColumn();
        if (column != null) {
            result = SuggestionsAdapter.getColumnString(c, column);
        }
        if (result == null) {
            result = actionKey.getSuggestActionMsg();
        }
        return result;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.348 -0400", hash_original_method = "587CD5DA65D790D90BAF0DE8B5BB2354", hash_generated_method = "82C4686B6B754E4D1084A6D0318AB317")
    private int getSearchIconId() {
        TypedValue outValue;
        outValue = new TypedValue();
        getContext().getTheme().resolveAttribute(com.android.internal.R.attr.searchViewSearchIcon,
                outValue, true);
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_333373994 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_333373994;
        // ---------- Original Method ----------
        //TypedValue outValue = new TypedValue();
        //getContext().getTheme().resolveAttribute(com.android.internal.R.attr.searchViewSearchIcon,
                //outValue, true);
        //return outValue.resourceId;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.349 -0400", hash_original_method = "BEC25B8B383259674E4804BA5A8143D3", hash_generated_method = "D35E7C10C59CE77AA17A14118F600C0C")
    private CharSequence getDecoratedHint(CharSequence hintText) {
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_252530162 = null; //Variable for return #1
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_676801181 = null; //Variable for return #2
        varB4EAC82CA7396A68D541C85D26508E83_252530162 = hintText;
        SpannableStringBuilder ssb;
        ssb = new SpannableStringBuilder("   ");
        ssb.append(hintText);
        Drawable searchIcon;
        searchIcon = getContext().getResources().getDrawable(getSearchIconId());
        int textSize;
        textSize = (int) (mQueryTextView.getTextSize() * 1.25);
        searchIcon.setBounds(0, 0, textSize, textSize);
        ssb.setSpan(new ImageSpan(searchIcon), 1, 2, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        varB4EAC82CA7396A68D541C85D26508E83_676801181 = ssb;
        addTaint(hintText.getTaint());
        CharSequence varA7E53CE21691AB073D9660D615818899_455755618; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_455755618 = varB4EAC82CA7396A68D541C85D26508E83_252530162;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_455755618 = varB4EAC82CA7396A68D541C85D26508E83_676801181;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_455755618.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_455755618;
        // ---------- Original Method ----------
        //if (!mIconifiedByDefault) return hintText;
        //SpannableStringBuilder ssb = new SpannableStringBuilder("   ");
        //ssb.append(hintText);
        //Drawable searchIcon = getContext().getResources().getDrawable(getSearchIconId());
        //int textSize = (int) (mQueryTextView.getTextSize() * 1.25);
        //searchIcon.setBounds(0, 0, textSize, textSize);
        //ssb.setSpan(new ImageSpan(searchIcon), 1, 2, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        //return ssb;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.349 -0400", hash_original_method = "86FF55CF6755F81D1B5EAA7CA81FA50B", hash_generated_method = "6C59B222F2990690BE5EC8F5F5426AE9")
    private void updateQueryHint() {
        {
            mQueryTextView.setHint(getDecoratedHint(mQueryHint));
        } //End block
        {
            CharSequence hint;
            hint = null;
            int hintId;
            hintId = mSearchable.getHintId();
            {
                hint = getContext().getString(hintId);
            } //End block
            {
                mQueryTextView.setHint(getDecoratedHint(hint));
            } //End block
        } //End block
        {
            mQueryTextView.setHint(getDecoratedHint(""));
        } //End block
        // ---------- Original Method ----------
        //if (mQueryHint != null) {
            //mQueryTextView.setHint(getDecoratedHint(mQueryHint));
        //} else if (mSearchable != null) {
            //CharSequence hint = null;
            //int hintId = mSearchable.getHintId();
            //if (hintId != 0) {
                //hint = getContext().getString(hintId);
            //}
            //if (hint != null) {
                //mQueryTextView.setHint(getDecoratedHint(hint));
            //}
        //} else {
            //mQueryTextView.setHint(getDecoratedHint(""));
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.361 -0400", hash_original_method = "923331D2E7E4B81B915A368FF3E97F8B", hash_generated_method = "1407F9F058E3ADADE3C960B94D94D7F1")
    private void updateSearchAutoComplete() {
        mQueryTextView.setDropDownAnimationStyle(0);
        mQueryTextView.setThreshold(mSearchable.getSuggestThreshold());
        mQueryTextView.setImeOptions(mSearchable.getImeOptions());
        int inputType;
        inputType = mSearchable.getInputType();
        {
            inputType &= ~InputType.TYPE_TEXT_FLAG_AUTO_COMPLETE;
            {
                boolean var35AC7A1761C1124F307704E7A9FB2780_346290320 = (mSearchable.getSuggestAuthority() != null);
                {
                    inputType |= InputType.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                } //End block
            } //End collapsed parenthetic
        } //End block
        mQueryTextView.setInputType(inputType);
        {
            mSuggestionsAdapter.changeCursor(null);
        } //End block
        {
            boolean var766631DCADAC65258B4B2AA4BC08BF1D_1895714042 = (mSearchable.getSuggestAuthority() != null);
            {
                mSuggestionsAdapter = new SuggestionsAdapter(getContext(),
                    this, mSearchable, mOutsideDrawablesCache);
                mQueryTextView.setAdapter(mSuggestionsAdapter);
                ((SuggestionsAdapter) mSuggestionsAdapter).setQueryRefinement(
                    mQueryRefinement ? SuggestionsAdapter.REFINE_ALL
                    : SuggestionsAdapter.REFINE_BY_ENTRY);
            } //End block
        } //End collapsed parenthetic
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.362 -0400", hash_original_method = "3C9F3ABEF9459DE6C607B751B6CB866E", hash_generated_method = "A8FD77C5977DADB0716E672EB95DC37B")
    private void updateVoiceButton(boolean empty) {
        int visibility;
        visibility = GONE;
        {
            boolean var90713B33485BF631D704E35E86303098_260527675 = (mVoiceButtonEnabled && !isIconified() && empty);
            {
                visibility = VISIBLE;
                mSubmitButton.setVisibility(GONE);
            } //End block
        } //End collapsed parenthetic
        mVoiceButton.setVisibility(visibility);
        addTaint(empty);
        // ---------- Original Method ----------
        //int visibility = GONE;
        //if (mVoiceButtonEnabled && !isIconified() && empty) {
            //visibility = VISIBLE;
            //mSubmitButton.setVisibility(GONE);
        //}
        //mVoiceButton.setVisibility(visibility);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.362 -0400", hash_original_method = "1411F54CFFACC3FC33F099091662F124", hash_generated_method = "9726D2B4716122404ACBA7AACFFF7A8C")
    private void onTextChanged(CharSequence newText) {
        CharSequence text;
        text = mQueryTextView.getText();
        mUserQuery = text;
        boolean hasText;
        hasText = !TextUtils.isEmpty(text);
        updateSubmitButton(hasText);
        updateVoiceButton(!hasText);
        updateCloseButton();
        updateSubmitArea();
        {
            boolean var323E3AECC67129F3B90BD3247116BE94_96355876 = (mOnQueryChangeListener != null && !TextUtils.equals(newText, mOldQueryText));
            {
                mOnQueryChangeListener.onQueryTextChange(newText.toString());
            } //End block
        } //End collapsed parenthetic
        mOldQueryText = newText.toString();
        // ---------- Original Method ----------
        //CharSequence text = mQueryTextView.getText();
        //mUserQuery = text;
        //boolean hasText = !TextUtils.isEmpty(text);
        //updateSubmitButton(hasText);
        //updateVoiceButton(!hasText);
        //updateCloseButton();
        //updateSubmitArea();
        //if (mOnQueryChangeListener != null && !TextUtils.equals(newText, mOldQueryText)) {
            //mOnQueryChangeListener.onQueryTextChange(newText.toString());
        //}
        //mOldQueryText = newText.toString();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.372 -0400", hash_original_method = "5AEA0BD14CD513B7E21145454A43DADF", hash_generated_method = "765D4B938EDA3A72B14A8023F3209B57")
    private void onSubmitQuery() {
        CharSequence query;
        query = mQueryTextView.getText();
        {
            boolean var0D033082B10BC0B3B14D4B2164FDB866_1255523360 = (query != null && TextUtils.getTrimmedLength(query) > 0);
            {
                {
                    boolean varEB8F49EA341CCD6D5D4625046BE9A9DC_423727858 = (mOnQueryChangeListener == null
                    || !mOnQueryChangeListener.onQueryTextSubmit(query.toString()));
                    {
                        {
                            launchQuerySearch(KeyEvent.KEYCODE_UNKNOWN, null, query.toString());
                            setImeVisibility(false);
                        } //End block
                        dismissSuggestions();
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        // ---------- Original Method ----------
        //CharSequence query = mQueryTextView.getText();
        //if (query != null && TextUtils.getTrimmedLength(query) > 0) {
            //if (mOnQueryChangeListener == null
                    //|| !mOnQueryChangeListener.onQueryTextSubmit(query.toString())) {
                //if (mSearchable != null) {
                    //launchQuerySearch(KeyEvent.KEYCODE_UNKNOWN, null, query.toString());
                    //setImeVisibility(false);
                //}
                //dismissSuggestions();
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.372 -0400", hash_original_method = "8D9A2C9AF67AD5F3EB2818A3F7453E73", hash_generated_method = "D7D68B4D8980045DB76C85CF1D652798")
    private void dismissSuggestions() {
        mQueryTextView.dismissDropDown();
        // ---------- Original Method ----------
        //mQueryTextView.dismissDropDown();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.373 -0400", hash_original_method = "E1C21CB17E5E6548A25ED1EEE1C98C9D", hash_generated_method = "77D1252DFBCB42C3A2E0799F2C8F4253")
    private void onCloseClicked() {
        CharSequence text;
        text = mQueryTextView.getText();
        {
            boolean var6C86A511CD0D2845B6E0259573F6A612_2081306461 = (TextUtils.isEmpty(text));
            {
                {
                    {
                        boolean varD565EFD0C61B0AA0DDB6D792ED5EB23E_509401322 = (mOnCloseListener == null || !mOnCloseListener.onClose());
                        {
                            clearFocus();
                            updateViewsVisibility(true);
                        } //End block
                    } //End collapsed parenthetic
                } //End block
            } //End block
            {
                mQueryTextView.setText("");
                mQueryTextView.requestFocus();
                setImeVisibility(true);
            } //End block
        } //End collapsed parenthetic
        // ---------- Original Method ----------
        //CharSequence text = mQueryTextView.getText();
        //if (TextUtils.isEmpty(text)) {
            //if (mIconifiedByDefault) {
                //if (mOnCloseListener == null || !mOnCloseListener.onClose()) {
                    //clearFocus();
                    //updateViewsVisibility(true);
                //}
            //}
        //} else {
            //mQueryTextView.setText("");
            //mQueryTextView.requestFocus();
            //setImeVisibility(true);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.374 -0400", hash_original_method = "4C174341C531719A99E642D8022F787E", hash_generated_method = "A1D5AAB78161FB95636B4F354E411467")
    private void onSearchClicked() {
        updateViewsVisibility(false);
        mQueryTextView.requestFocus();
        setImeVisibility(true);
        {
            mOnSearchClickListener.onClick(this);
        } //End block
        // ---------- Original Method ----------
        //updateViewsVisibility(false);
        //mQueryTextView.requestFocus();
        //setImeVisibility(true);
        //if (mOnSearchClickListener != null) {
            //mOnSearchClickListener.onClick(this);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.374 -0400", hash_original_method = "5B2168D9C175988BD80847D561C5C5CC", hash_generated_method = "A2D42643D9F01F739A857D3722258C4F")
    private void onVoiceClicked() {
        SearchableInfo searchable;
        searchable = mSearchable;
        try 
        {
            {
                boolean varA7C415A860984F74F13F2B5F35E99AF8_435993565 = (searchable.getVoiceSearchLaunchWebSearch());
                {
                    Intent webSearchIntent;
                    webSearchIntent = createVoiceWebSearchIntent(mVoiceWebSearchIntent,
                        searchable);
                    getContext().startActivity(webSearchIntent);
                } //End block
                {
                    boolean var645D8F4ECB1C0F7F11811AA98A572600_1450108273 = (searchable.getVoiceSearchLaunchRecognizer());
                    {
                        Intent appSearchIntent;
                        appSearchIntent = createVoiceAppSearchIntent(mVoiceAppSearchIntent,
                        searchable);
                        getContext().startActivity(appSearchIntent);
                    } //End block
                } //End collapsed parenthetic
            } //End collapsed parenthetic
        } //End block
        catch (ActivityNotFoundException e)
        { }
        // ---------- Original Method ----------
        //if (mSearchable == null) {
            //return;
        //}
        //SearchableInfo searchable = mSearchable;
        //try {
            //if (searchable.getVoiceSearchLaunchWebSearch()) {
                //Intent webSearchIntent = createVoiceWebSearchIntent(mVoiceWebSearchIntent,
                        //searchable);
                //getContext().startActivity(webSearchIntent);
            //} else if (searchable.getVoiceSearchLaunchRecognizer()) {
                //Intent appSearchIntent = createVoiceAppSearchIntent(mVoiceAppSearchIntent,
                        //searchable);
                //getContext().startActivity(appSearchIntent);
            //}
        //} catch (ActivityNotFoundException e) {
            //Log.w(LOG_TAG, "Could not find voice search activity");
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.375 -0400", hash_original_method = "4D3FC77D85FEC9D80C6560FAE74CDA60", hash_generated_method = "2D254560E76031117BF34F0B9F2FF9BD")
     void onTextFocusChanged() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        updateViewsVisibility(isIconified());
        postUpdateFocusedState();
        {
            boolean varD5B56093B4D5DB9CF48D5816CF04A069_1487105363 = (mQueryTextView.hasFocus());
            {
                forceSuggestionQuery();
            } //End block
        } //End collapsed parenthetic
        // ---------- Original Method ----------
        //updateViewsVisibility(isIconified());
        //postUpdateFocusedState();
        //if (mQueryTextView.hasFocus()) {
            //forceSuggestionQuery();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.375 -0400", hash_original_method = "6BC34AF35099192BA7E60BCC11E3C756", hash_generated_method = "39C6DB5AE969101BFF00F0D7A0CBD14C")
    @Override
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        super.onWindowFocusChanged(hasWindowFocus);
        postUpdateFocusedState();
        addTaint(hasWindowFocus);
        // ---------- Original Method ----------
        //super.onWindowFocusChanged(hasWindowFocus);
        //postUpdateFocusedState();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.375 -0400", hash_original_method = "5D7477A3D9C6D568A19E621F4FAE5DD7", hash_generated_method = "657A76175C5C027E0A83AC8F0E70E279")
    @Override
    public void onActionViewCollapsed() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        clearFocus();
        updateViewsVisibility(true);
        mQueryTextView.setImeOptions(mCollapsedImeOptions);
        mExpandedInActionView = false;
        // ---------- Original Method ----------
        //clearFocus();
        //updateViewsVisibility(true);
        //mQueryTextView.setImeOptions(mCollapsedImeOptions);
        //mExpandedInActionView = false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.376 -0400", hash_original_method = "F734C19BE6B7D5E142C7745125215DDF", hash_generated_method = "131F0E66390DDDCCE1C64EE3296721EB")
    @Override
    public void onActionViewExpanded() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        mExpandedInActionView = true;
        mCollapsedImeOptions = mQueryTextView.getImeOptions();
        mQueryTextView.setImeOptions(mCollapsedImeOptions | EditorInfo.IME_FLAG_NO_FULLSCREEN);
        mQueryTextView.setText("");
        setIconified(false);
        // ---------- Original Method ----------
        //if (mExpandedInActionView) return;
        //mExpandedInActionView = true;
        //mCollapsedImeOptions = mQueryTextView.getImeOptions();
        //mQueryTextView.setImeOptions(mCollapsedImeOptions | EditorInfo.IME_FLAG_NO_FULLSCREEN);
        //mQueryTextView.setText("");
        //setIconified(false);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.388 -0400", hash_original_method = "C8142821EB0396ABFD0EB3B305480E27", hash_generated_method = "5DCCFDEDCBF62CE37A76FF7D5056A4F7")
    private void adjustDropDownSizeAndPosition() {
        {
            boolean varBDFC2850FDF993A89C978164A3FC182E_367057905 = (mDropDownAnchor.getWidth() > 1);
            {
                Resources res;
                res = getContext().getResources();
                int anchorPadding;
                anchorPadding = mSearchPlate.getPaddingLeft();
                Rect dropDownPadding;
                dropDownPadding = new Rect();
                int iconOffset;
                iconOffset = res.getDimensionPixelSize(R.dimen.dropdownitem_icon_width)
                    + res.getDimensionPixelSize(R.dimen.dropdownitem_text_padding_left);
                iconOffset = 0;
                mQueryTextView.getDropDownBackground().getPadding(dropDownPadding);
                mQueryTextView.setDropDownHorizontalOffset(-(dropDownPadding.left + iconOffset)
                    + anchorPadding);
                mQueryTextView.setDropDownWidth(mDropDownAnchor.getWidth() + dropDownPadding.left
                    + dropDownPadding.right + iconOffset - (anchorPadding));
            } //End block
        } //End collapsed parenthetic
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.389 -0400", hash_original_method = "5FDC493391F791D62FF75AE849BF4213", hash_generated_method = "965DF60D085E8C29BFDD4C45FFD8D69A")
    private boolean onItemClicked(int position, int actionKey, String actionMsg) {
        {
            boolean var350FE6BC9A4CD5C160297254EB8318B3_520065440 = (mOnSuggestionListener == null
                || !mOnSuggestionListener.onSuggestionClick(position));
            {
                launchSuggestion(position, KeyEvent.KEYCODE_UNKNOWN, null);
                setImeVisibility(false);
                dismissSuggestions();
            } //End block
        } //End collapsed parenthetic
        addTaint(position);
        addTaint(actionKey);
        addTaint(actionMsg.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1512511253 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1512511253;
        // ---------- Original Method ----------
        //if (mOnSuggestionListener == null
                //|| !mOnSuggestionListener.onSuggestionClick(position)) {
            //launchSuggestion(position, KeyEvent.KEYCODE_UNKNOWN, null);
            //setImeVisibility(false);
            //dismissSuggestions();
            //return true;
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.389 -0400", hash_original_method = "08FFA8C71E803D9BC52878D0BDC1227B", hash_generated_method = "CE87E11889643378351127C148DEAE31")
    private boolean onItemSelected(int position) {
        {
            boolean varD0AB4A987152B8EC35399136FBAE5E5E_1895357669 = (mOnSuggestionListener == null
                || !mOnSuggestionListener.onSuggestionSelect(position));
            {
                rewriteQueryFromSuggestion(position);
            } //End block
        } //End collapsed parenthetic
        addTaint(position);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2123906664 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2123906664;
        // ---------- Original Method ----------
        //if (mOnSuggestionListener == null
                //|| !mOnSuggestionListener.onSuggestionSelect(position)) {
            //rewriteQueryFromSuggestion(position);
            //return true;
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.389 -0400", hash_original_method = "FE5C7BD493A3B7C4988BF7B094450FE1", hash_generated_method = "D8BA6B4E1AA1FB9339EAE797B2EB2C93")
    private void rewriteQueryFromSuggestion(int position) {
        CharSequence oldQuery;
        oldQuery = mQueryTextView.getText();
        Cursor c;
        c = mSuggestionsAdapter.getCursor();
        {
            boolean var13F64BF59FABCAB989EC616298EA3580_1738372706 = (c.moveToPosition(position));
            {
                CharSequence newQuery;
                newQuery = mSuggestionsAdapter.convertToString(c);
                {
                    setQuery(newQuery);
                } //End block
                {
                    setQuery(oldQuery);
                } //End block
            } //End block
            {
                setQuery(oldQuery);
            } //End block
        } //End collapsed parenthetic
        addTaint(position);
        // ---------- Original Method ----------
        //CharSequence oldQuery = mQueryTextView.getText();
        //Cursor c = mSuggestionsAdapter.getCursor();
        //if (c == null) {
            //return;
        //}
        //if (c.moveToPosition(position)) {
            //CharSequence newQuery = mSuggestionsAdapter.convertToString(c);
            //if (newQuery != null) {
                //setQuery(newQuery);
            //} else {
                //setQuery(oldQuery);
            //}
        //} else {
            //setQuery(oldQuery);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.390 -0400", hash_original_method = "1026A945AA7D5E936A04225BB74423F6", hash_generated_method = "6CF86D3B4C45C9A384A008FAEA2C72FE")
    private boolean launchSuggestion(int position, int actionKey, String actionMsg) {
        Cursor c;
        c = mSuggestionsAdapter.getCursor();
        {
            boolean var74E5271F2D14A3901C9E07AB7568B5C7_1505636746 = ((c != null) && c.moveToPosition(position));
            {
                Intent intent;
                intent = createIntentFromSuggestion(c, actionKey, actionMsg);
                launchIntent(intent);
            } //End block
        } //End collapsed parenthetic
        addTaint(position);
        addTaint(actionKey);
        addTaint(actionMsg.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1733592775 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1733592775;
        // ---------- Original Method ----------
        //Cursor c = mSuggestionsAdapter.getCursor();
        //if ((c != null) && c.moveToPosition(position)) {
            //Intent intent = createIntentFromSuggestion(c, actionKey, actionMsg);
            //launchIntent(intent);
            //return true;
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.390 -0400", hash_original_method = "B092F13CA13C6A372C37DCEFCF94B5BC", hash_generated_method = "707001C8A98FD878D136C21071E5A74A")
    private void launchIntent(Intent intent) {
        try 
        {
            getContext().startActivity(intent);
        } //End block
        catch (RuntimeException ex)
        { }
        addTaint(intent.getTaint());
        // ---------- Original Method ----------
        //if (intent == null) {
            //return;
        //}
        //try {
            //getContext().startActivity(intent);
        //} catch (RuntimeException ex) {
            //Log.e(LOG_TAG, "Failed launch activity: " + intent, ex);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.391 -0400", hash_original_method = "39B31EC96E94C2151059B7594679485C", hash_generated_method = "F05438A71D7B4C218CB339EA2B853A36")
    private void setQuery(CharSequence query) {
        mQueryTextView.setText(query, true);
        mQueryTextView.setSelection(TextUtils.isEmpty(query) ? 0 : query.length());
        addTaint(query.getTaint());
        // ---------- Original Method ----------
        //mQueryTextView.setText(query, true);
        //mQueryTextView.setSelection(TextUtils.isEmpty(query) ? 0 : query.length());
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.391 -0400", hash_original_method = "A610C255BB7D93FEE4A49CEF406D7E3C", hash_generated_method = "ACA8AE4996F69607308B40F576574D4A")
    private void launchQuerySearch(int actionKey, String actionMsg, String query) {
        String action;
        action = Intent.ACTION_SEARCH;
        Intent intent;
        intent = createIntent(action, null, null, query, actionKey, actionMsg);
        getContext().startActivity(intent);
        addTaint(actionKey);
        addTaint(actionMsg.getTaint());
        addTaint(query.getTaint());
        // ---------- Original Method ----------
        //String action = Intent.ACTION_SEARCH;
        //Intent intent = createIntent(action, null, null, query, actionKey, actionMsg);
        //getContext().startActivity(intent);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.404 -0400", hash_original_method = "7931502AE551A2F220A0C85C1181EB09", hash_generated_method = "F597372BB5A8C1295F14EFCF18EFCDE2")
    private Intent createIntent(String action, Uri data, String extraData, String query,
            int actionKey, String actionMsg) {
        Intent varB4EAC82CA7396A68D541C85D26508E83_966859080 = null; //Variable for return #1
        Intent intent;
        intent = new Intent(action);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        {
            intent.setData(data);
        } //End block
        intent.putExtra(SearchManager.USER_QUERY, mUserQuery);
        {
            intent.putExtra(SearchManager.QUERY, query);
        } //End block
        {
            intent.putExtra(SearchManager.EXTRA_DATA_KEY, extraData);
        } //End block
        {
            intent.putExtra(SearchManager.APP_DATA, mAppSearchData);
        } //End block
        {
            intent.putExtra(SearchManager.ACTION_KEY, actionKey);
            intent.putExtra(SearchManager.ACTION_MSG, actionMsg);
        } //End block
        intent.setComponent(mSearchable.getSearchActivity());
        varB4EAC82CA7396A68D541C85D26508E83_966859080 = intent;
        addTaint(action.getTaint());
        addTaint(data.getTaint());
        addTaint(extraData.getTaint());
        addTaint(query.getTaint());
        addTaint(actionKey);
        addTaint(actionMsg.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_966859080.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_966859080;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.405 -0400", hash_original_method = "88ED2A4CD1E55FCB278985A3652D43A1", hash_generated_method = "CD1ADEC2A71EBB8A111B79C46CCD6950")
    private Intent createVoiceWebSearchIntent(Intent baseIntent, SearchableInfo searchable) {
        Intent varB4EAC82CA7396A68D541C85D26508E83_1981021875 = null; //Variable for return #1
        Intent voiceIntent;
        voiceIntent = new Intent(baseIntent);
        ComponentName searchActivity;
        searchActivity = searchable.getSearchActivity();
        voiceIntent.putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE, searchActivity == null ? null
                : searchActivity.flattenToShortString());
        varB4EAC82CA7396A68D541C85D26508E83_1981021875 = voiceIntent;
        addTaint(baseIntent.getTaint());
        addTaint(searchable.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1981021875.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1981021875;
        // ---------- Original Method ----------
        //Intent voiceIntent = new Intent(baseIntent);
        //ComponentName searchActivity = searchable.getSearchActivity();
        //voiceIntent.putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE, searchActivity == null ? null
                //: searchActivity.flattenToShortString());
        //return voiceIntent;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.407 -0400", hash_original_method = "7F7E8A56997E65BDFC7ADF14F1E923E9", hash_generated_method = "1CE3465533185527799A80738BF5B5F1")
    private Intent createVoiceAppSearchIntent(Intent baseIntent, SearchableInfo searchable) {
        Intent varB4EAC82CA7396A68D541C85D26508E83_869925622 = null; //Variable for return #1
        ComponentName searchActivity;
        searchActivity = searchable.getSearchActivity();
        Intent queryIntent;
        queryIntent = new Intent(Intent.ACTION_SEARCH);
        queryIntent.setComponent(searchActivity);
        PendingIntent pending;
        pending = PendingIntent.getActivity(getContext(), 0, queryIntent,
                PendingIntent.FLAG_ONE_SHOT);
        Bundle queryExtras;
        queryExtras = new Bundle();
        Intent voiceIntent;
        voiceIntent = new Intent(baseIntent);
        String languageModel;
        languageModel = RecognizerIntent.LANGUAGE_MODEL_FREE_FORM;
        String prompt;
        prompt = null;
        String language;
        language = null;
        int maxResults;
        maxResults = 1;
        Resources resources;
        resources = getResources();
        {
            boolean varBBE4CD039A6A00BFEFC751059FE85B4F_1126546141 = (searchable.getVoiceLanguageModeId() != 0);
            {
                languageModel = resources.getString(searchable.getVoiceLanguageModeId());
            } //End block
        } //End collapsed parenthetic
        {
            boolean varAC8E073C8A191629EF47CD10960E1E5F_629910366 = (searchable.getVoicePromptTextId() != 0);
            {
                prompt = resources.getString(searchable.getVoicePromptTextId());
            } //End block
        } //End collapsed parenthetic
        {
            boolean varC746CB3F134BCAA7F8EF0771FDB78FED_1531811615 = (searchable.getVoiceLanguageId() != 0);
            {
                language = resources.getString(searchable.getVoiceLanguageId());
            } //End block
        } //End collapsed parenthetic
        {
            boolean var2E746E5A42346C8832AA6F44EE0CF45F_1440477459 = (searchable.getVoiceMaxResults() != 0);
            {
                maxResults = searchable.getVoiceMaxResults();
            } //End block
        } //End collapsed parenthetic
        voiceIntent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, languageModel);
        voiceIntent.putExtra(RecognizerIntent.EXTRA_PROMPT, prompt);
        voiceIntent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, language);
        voiceIntent.putExtra(RecognizerIntent.EXTRA_MAX_RESULTS, maxResults);
        voiceIntent.putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE, searchActivity == null ? null
                : searchActivity.flattenToShortString());
        voiceIntent.putExtra(RecognizerIntent.EXTRA_RESULTS_PENDINGINTENT, pending);
        voiceIntent.putExtra(RecognizerIntent.EXTRA_RESULTS_PENDINGINTENT_BUNDLE, queryExtras);
        varB4EAC82CA7396A68D541C85D26508E83_869925622 = voiceIntent;
        addTaint(baseIntent.getTaint());
        addTaint(searchable.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_869925622.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_869925622;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.420 -0400", hash_original_method = "830957C509294E2BDC3732D8A42E8F7A", hash_generated_method = "11A8D15EAD041260D38AB7341427B087")
    private Intent createIntentFromSuggestion(Cursor c, int actionKey, String actionMsg) {
        Intent varB4EAC82CA7396A68D541C85D26508E83_1290744241 = null; //Variable for return #1
        Intent varB4EAC82CA7396A68D541C85D26508E83_2128536719 = null; //Variable for return #2
        try 
        {
            String action;
            action = getColumnString(c, SearchManager.SUGGEST_COLUMN_INTENT_ACTION);
            {
                action = mSearchable.getSuggestIntentAction();
            } //End block
            {
                action = Intent.ACTION_SEARCH;
            } //End block
            String data;
            data = getColumnString(c, SearchManager.SUGGEST_COLUMN_INTENT_DATA);
            {
                data = mSearchable.getSuggestIntentData();
            } //End block
            {
                String id;
                id = getColumnString(c, SearchManager.SUGGEST_COLUMN_INTENT_DATA_ID);
                {
                    data = data + "/" + Uri.encode(id);
                } //End block
            } //End block
            Uri dataUri;
            dataUri = null;
            dataUri = Uri.parse(data);
            String query;
            query = getColumnString(c, SearchManager.SUGGEST_COLUMN_QUERY);
            String extraData;
            extraData = getColumnString(c, SearchManager.SUGGEST_COLUMN_INTENT_EXTRA_DATA);
            varB4EAC82CA7396A68D541C85D26508E83_1290744241 = createIntent(action, dataUri, extraData, query, actionKey, actionMsg);
        } //End block
        catch (RuntimeException e)
        {
            int rowNum;
            try 
            {
                rowNum = c.getPosition();
            } //End block
            catch (RuntimeException e2)
            {
                rowNum = -1;
            } //End block
            varB4EAC82CA7396A68D541C85D26508E83_2128536719 = null;
        } //End block
        addTaint(c.getTaint());
        addTaint(actionKey);
        addTaint(actionMsg.getTaint());
        Intent varA7E53CE21691AB073D9660D615818899_1755077932; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1755077932 = varB4EAC82CA7396A68D541C85D26508E83_1290744241;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1755077932 = varB4EAC82CA7396A68D541C85D26508E83_2128536719;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1755077932.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1755077932;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.425 -0400", hash_original_method = "7E9F5D2AEBB04ECB1BF9832E28C48CE5", hash_generated_method = "842B7E3CB61461A203AD10E7DC7E1B6F")
    private void forceSuggestionQuery() {
        mQueryTextView.doBeforeTextChanged();
        mQueryTextView.doAfterTextChanged();
        // ---------- Original Method ----------
        //mQueryTextView.doBeforeTextChanged();
        //mQueryTextView.doAfterTextChanged();
    }

    
        static boolean isLandscapeMode(Context context) {
        return context.getResources().getConfiguration().orientation
                == Configuration.ORIENTATION_LANDSCAPE;
    }

    
    public static class SearchAutoComplete extends AutoCompleteTextView {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.425 -0400", hash_original_field = "3C3C53D359DFC0BF874C1D7D1521B140", hash_generated_field = "2B2FC0AB3F9DED44C14A982417EA1993")

        private int mThreshold;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.426 -0400", hash_original_field = "D1972F87341AF3F5EA90C2B878C0DF14", hash_generated_field = "1366187FE3CF01EF5FC13B6B4154C3DB")

        private SearchView mSearchView;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.431 -0400", hash_original_method = "0EFA734BA823B47BC95B6AD45B9E23E2", hash_generated_method = "3692FB45DDFB24E73BA43FB5045688AC")
        public  SearchAutoComplete(Context context) {
            super(context);
            mThreshold = getThreshold();
            addTaint(context.getTaint());
            // ---------- Original Method ----------
            //mThreshold = getThreshold();
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.432 -0400", hash_original_method = "D2F6F380F4593BE38169820FCC450031", hash_generated_method = "D804F8CA9A4D3BF2C817008D029A0CFD")
        public  SearchAutoComplete(Context context, AttributeSet attrs) {
            super(context, attrs);
            mThreshold = getThreshold();
            addTaint(context.getTaint());
            addTaint(attrs.getTaint());
            // ---------- Original Method ----------
            //mThreshold = getThreshold();
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.432 -0400", hash_original_method = "6D01382B108C5B979A3DE77D2755BA0A", hash_generated_method = "134653A25408180D2DFC090D8F0141D9")
        public  SearchAutoComplete(Context context, AttributeSet attrs, int defStyle) {
            super(context, attrs, defStyle);
            mThreshold = getThreshold();
            addTaint(context.getTaint());
            addTaint(attrs.getTaint());
            addTaint(defStyle);
            // ---------- Original Method ----------
            //mThreshold = getThreshold();
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.433 -0400", hash_original_method = "BBDE2605DAB20A62DF5DDA8DAF1B33B9", hash_generated_method = "0D212706D2CE79F99D27416EE240A973")
         void setSearchView(SearchView searchView) {
            mSearchView = searchView;
            // ---------- Original Method ----------
            //mSearchView = searchView;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.433 -0400", hash_original_method = "2A2464279ECB52A9D86939A6AE2D6FFF", hash_generated_method = "688D0A5C066F7B7BC80C28BA72699E5D")
        @Override
        public void setThreshold(int threshold) {
            super.setThreshold(threshold);
            mThreshold = threshold;
            // ---------- Original Method ----------
            //super.setThreshold(threshold);
            //mThreshold = threshold;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.434 -0400", hash_original_method = "BA394CC4782335931E16390E53BDBA7F", hash_generated_method = "5A45621D968126B4E1F4250C73323150")
        private boolean isEmpty() {
            boolean var3DC6FA609B5525FAC46D05EECEA6786A_809592422 = (TextUtils.getTrimmedLength(getText()) == 0);
            boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2035189261 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_2035189261;
            // ---------- Original Method ----------
            //return TextUtils.getTrimmedLength(getText()) == 0;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.439 -0400", hash_original_method = "04EDD552CD5932834AB8E3EAD2670FCB", hash_generated_method = "2E00CC1DC27537AD22A88B7817BCCBE4")
        @Override
        protected void replaceText(CharSequence text) {
            addTaint(text.getTaint());
            // ---------- Original Method ----------
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.439 -0400", hash_original_method = "BBB8F048947DA4F8E171ED984E24E3AE", hash_generated_method = "65E30508731680C780234FF5491E8384")
        @Override
        public void performCompletion() {
            // ---------- Original Method ----------
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.439 -0400", hash_original_method = "3777C1088ADE560024EE2C32D034B492", hash_generated_method = "6E5B02FABB21758C0E5F02FE86BFE847")
        @Override
        public void onWindowFocusChanged(boolean hasWindowFocus) {
            //DSFIXME:  CODE0009: Possible callback target function detected
            super.onWindowFocusChanged(hasWindowFocus);
            {
                boolean var07827550B2C2F4C2AD19C2B83045B0B0_277405311 = (hasWindowFocus && mSearchView.hasFocus() && getVisibility() == VISIBLE);
                {
                    InputMethodManager inputManager;
                    inputManager = (InputMethodManager) getContext()
                        .getSystemService(Context.INPUT_METHOD_SERVICE);
                    inputManager.showSoftInput(this, 0);
                    {
                        boolean var962BF569303E770457EF5B953E22B6C6_732304034 = (isLandscapeMode(getContext()));
                        {
                            ensureImeVisible(true);
                        } //End block
                    } //End collapsed parenthetic
                } //End block
            } //End collapsed parenthetic
            addTaint(hasWindowFocus);
            // ---------- Original Method ----------
            //super.onWindowFocusChanged(hasWindowFocus);
            //if (hasWindowFocus && mSearchView.hasFocus() && getVisibility() == VISIBLE) {
                //InputMethodManager inputManager = (InputMethodManager) getContext()
                        //.getSystemService(Context.INPUT_METHOD_SERVICE);
                //inputManager.showSoftInput(this, 0);
                //if (isLandscapeMode(getContext())) {
                    //ensureImeVisible(true);
                //}
            //}
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.445 -0400", hash_original_method = "5F63BE621D8AAF87B5CC12EFB3AE40CE", hash_generated_method = "975839A07A74F2A3A30305B0A98BCCF9")
        @Override
        protected void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect) {
            //DSFIXME:  CODE0009: Possible callback target function detected
            super.onFocusChanged(focused, direction, previouslyFocusedRect);
            mSearchView.onTextFocusChanged();
            addTaint(focused);
            addTaint(direction);
            addTaint(previouslyFocusedRect.getTaint());
            // ---------- Original Method ----------
            //super.onFocusChanged(focused, direction, previouslyFocusedRect);
            //mSearchView.onTextFocusChanged();
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.447 -0400", hash_original_method = "E5C7430DC03439C4054C8D137460F5A5", hash_generated_method = "1088F68C6C3F44EA1AA2182347D4EF75")
        @Override
        public boolean enoughToFilter() {
            boolean varC2A9CA7695220720B0749D6800887CAB_527449430 = (mThreshold <= 0 || super.enoughToFilter());
            boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1881918360 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_1881918360;
            // ---------- Original Method ----------
            //return mThreshold <= 0 || super.enoughToFilter();
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.455 -0400", hash_original_method = "AB0021D21F9078098334FA1D38399275", hash_generated_method = "8DF952507B55D99A25CBB5F539F1B911")
        @Override
        public boolean onKeyPreIme(int keyCode, KeyEvent event) {
            //DSFIXME:  CODE0009: Possible callback target function detected
            {
                {
                    boolean var51947D54DEEA690F1B41A17DE6323711_619001073 = (event.getAction() == KeyEvent.ACTION_DOWN && event.getRepeatCount() == 0);
                    {
                        KeyEvent.DispatcherState state;
                        state = getKeyDispatcherState();
                        {
                            state.startTracking(event, this);
                        } //End block
                    } //End block
                    {
                        boolean varA6D964A9D1A4D1D485BD8D60F2BFCDEE_304084102 = (event.getAction() == KeyEvent.ACTION_UP);
                        {
                            KeyEvent.DispatcherState state;
                            state = getKeyDispatcherState();
                            {
                                state.handleUpEvent(event);
                            } //End block
                            {
                                boolean varBE09C907F92D135687297C67489D82A5_1258031137 = (event.isTracking() && !event.isCanceled());
                                {
                                    mSearchView.clearFocus();
                                    mSearchView.setImeVisibility(false);
                                } //End block
                            } //End collapsed parenthetic
                        } //End block
                    } //End collapsed parenthetic
                } //End collapsed parenthetic
            } //End block
            boolean var5970925D52CD103B5580C9C1CCD0A863_2078764402 = (super.onKeyPreIme(keyCode, event));
            addTaint(keyCode);
            addTaint(event.getTaint());
            boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1567265163 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_1567265163;
            // ---------- Original Method ----------
            // Original Method Too Long, Refer to Original Implementation
        }

        
    }


    
    public interface OnQueryTextListener {

        
        boolean onQueryTextSubmit(String query);

        
        boolean onQueryTextChange(String newText);
    }
    
    public interface OnCloseListener {

        
        boolean onClose();
    }
    
    public interface OnSuggestionListener {

        
        boolean onSuggestionSelect(int position);

        
        boolean onSuggestionClick(int position);
    }
    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.456 -0400", hash_original_field = "0F6F0EB642B3F46DE2B2DF48DA4427EF", hash_generated_field = "B7C4E93D97D072890A37A56076D870F8")

    private static boolean DBG = false;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.456 -0400", hash_original_field = "0587D8CE40F7F4AC1343388C2FEA1ED4", hash_generated_field = "F32CE5436F4C5858BAB24BE385857218")

    private static String LOG_TAG = "SearchView";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.456 -0400", hash_original_field = "B8CF89EB7E6552EBC5C9FCBB33074205", hash_generated_field = "61A82CC61263F39D464CE416448D85EF")

    private static String IME_OPTION_NO_MICROPHONE = "nm";
}

