package android.widget;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.app.SearchDialog;
import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.ContentResolver.OpenResourceIdResult;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import com.android.internal.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.WeakHashMap;

class SuggestionsAdapter extends ResourceCursorAdapter implements OnClickListener {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.549 -0400", hash_original_field = "32BBEFAC8E5B50979F727CF657FBCDC5", hash_generated_field = "EC37B561700692089320F9D5E535EAC6")

    private SearchManager mSearchManager;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.549 -0400", hash_original_field = "D1972F87341AF3F5EA90C2B878C0DF14", hash_generated_field = "1366187FE3CF01EF5FC13B6B4154C3DB")

    private SearchView mSearchView;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.549 -0400", hash_original_field = "43A23F0BB5F798E421F2CC49BC43D947", hash_generated_field = "6F1511307A7DE5E4BDCE1D082D25D113")

    private SearchableInfo mSearchable;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.549 -0400", hash_original_field = "6126F3ADE7D1E4549FE0617BECDD3490", hash_generated_field = "7C7A305D33D1BC28D819A6E4A2AAAF6C")

    private Context mProviderContext;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.549 -0400", hash_original_field = "14D278A9ED4C8ACF824369307E3457F8", hash_generated_field = "B85E917372D3BED3B3CE8F4DA3D3A6D3")

    private WeakHashMap<String, Drawable.ConstantState> mOutsideDrawablesCache;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.549 -0400", hash_original_field = "D72871D5CE2EB17105099280224B0CCD", hash_generated_field = "0FB4858B613824FE6FDA94A379EBC4D0")

    private boolean mClosed = false;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.549 -0400", hash_original_field = "47B6CCCA247AD0969BBB9DFE3215D674", hash_generated_field = "EE7267ACB8B58771C9C5C8A0A163549B")

    private int mQueryRefinement = REFINE_BY_ENTRY;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.549 -0400", hash_original_field = "572AE80BBC94E324C0BFEBD467E07E42", hash_generated_field = "0BE8AC4A70015275FE70EEC0CAC1F0EC")

    private ColorStateList mUrlColor;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.549 -0400", hash_original_field = "5E58DD57932DBAE40306F966514F2E48", hash_generated_field = "B162451730ABFB26D08AF54099E233CC")

    private int mText1Col = INVALID_INDEX;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.549 -0400", hash_original_field = "75C325501E7825234D0F714A4256FF6C", hash_generated_field = "745DF2DCD7F688EC03809FDC06531CFD")

    private int mText2Col = INVALID_INDEX;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.549 -0400", hash_original_field = "EBA70A48EF4356CBB3A99AAD4D731AB6", hash_generated_field = "C018328754CF1F9AD85EF4F02F2ABCC4")

    private int mText2UrlCol = INVALID_INDEX;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.549 -0400", hash_original_field = "ACF51633A3F89F63F9253117F8735E9E", hash_generated_field = "ABAB9A496D404B9E527D4F1BABD73E1F")

    private int mIconName1Col = INVALID_INDEX;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.549 -0400", hash_original_field = "74BEF9EF815025303F456B54D93D06B1", hash_generated_field = "A3074C22725E90C5CD06EEE589A84779")

    private int mIconName2Col = INVALID_INDEX;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.550 -0400", hash_original_field = "E9D1C3E619DB3C340A682F18A7C6A32F", hash_generated_field = "8627CEDD9E8AF7896BE8D1B2E6FCBF94")

    private int mFlagsCol = INVALID_INDEX;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.566 -0400", hash_original_method = "190CAF11C7DD896719D5F8C797EB7D95", hash_generated_method = "66F85D3E0105CCBF5AC5F3C1CEE70148")
    public  SuggestionsAdapter(Context context, SearchView searchView,
            SearchableInfo searchable,
            WeakHashMap<String, Drawable.ConstantState> outsideDrawablesCache) {
        super(context,
                com.android.internal.R.layout.search_dropdown_item_icons_2line,
                null,   
                true);
        mSearchManager = (SearchManager) mContext.getSystemService(Context.SEARCH_SERVICE);
        mSearchView = searchView;
        mSearchable = searchable;
        Context activityContext;
        activityContext = mSearchable.getActivityContext(mContext);
        mProviderContext = mSearchable.getProviderContext(mContext, activityContext);
        mOutsideDrawablesCache = outsideDrawablesCache;
        getFilter().setDelayer(new Filter.Delayer() {            @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.564 -0400", hash_original_field = "4C620C4F670D4AEB734E374E4D2C5DE7", hash_generated_field = "3C2C3FA0C1C7472676EEF8CAC895BC8D")
            private int mPreviousLength = 0;
            @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.565 -0400", hash_original_method = "724CD13B980D98DDBE94BB34EF222B8A", hash_generated_method = "F730E9DE46390FA4F4546BB1C290E38A")
            public long getPostingDelay(CharSequence constraint) {
                long delay;
                boolean var86130193B74E4EA7B26601F90461C8D2_1099444500 = (constraint.length() < mPreviousLength);
                delay = DELETE_KEY_POST_DELAY;
                delay = 0;
                mPreviousLength = constraint.length();
                long var0F5264038205EDFB1AC05FBB0E8C5E94_566669142 = getTaintLong();
                return var0F5264038205EDFB1AC05FBB0E8C5E94_566669142;
                // ---------- Original Method ----------
                //if (constraint == null) return 0;
                //long delay = constraint.length() < mPreviousLength ? DELETE_KEY_POST_DELAY : 0;
                //mPreviousLength = constraint.length();
                //return delay;
            }
});
        addTaint(context.getTaint());
        // ---------- Original Method ----------
        //mSearchManager = (SearchManager) mContext.getSystemService(Context.SEARCH_SERVICE);
        //mSearchView = searchView;
        //mSearchable = searchable;
        //Context activityContext = mSearchable.getActivityContext(mContext);
        //mProviderContext = mSearchable.getProviderContext(mContext, activityContext);
        //mOutsideDrawablesCache = outsideDrawablesCache;
        //getFilter().setDelayer(new Filter.Delayer() {
            //private int mPreviousLength = 0;
            //public long getPostingDelay(CharSequence constraint) {
                //if (constraint == null) return 0;
                //long delay = constraint.length() < mPreviousLength ? DELETE_KEY_POST_DELAY : 0;
                //mPreviousLength = constraint.length();
                //return delay;
            //}
        //});
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.567 -0400", hash_original_method = "7E34E1FAECF41C65A10194A4E061AD6D", hash_generated_method = "C864B094F1586B649248412EF85B9AC7")
    public void setQueryRefinement(int refineWhat) {
        mQueryRefinement = refineWhat;
        // ---------- Original Method ----------
        //mQueryRefinement = refineWhat;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.568 -0400", hash_original_method = "986E9EFF340372ED6B6AF1389D87F9A0", hash_generated_method = "24CE290920322BFA6F4A4A153A52F357")
    public int getQueryRefinement() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_60817864 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_60817864;
        // ---------- Original Method ----------
        //return mQueryRefinement;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.568 -0400", hash_original_method = "715CB29FF3CEE320E11EC1BD997C9D63", hash_generated_method = "6DBF41C7F29709D62848FA2133DB8DB0")
    @Override
    public boolean hasStableIds() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1297008190 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1297008190;
        // ---------- Original Method ----------
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.570 -0400", hash_original_method = "94A214A70A9BD5FB24F7DC72C91FA8E3", hash_generated_method = "25653DB037E4B61896C473F81EE45B06")
    @Override
    public Cursor runQueryOnBackgroundThread(CharSequence constraint) {
        Cursor varB4EAC82CA7396A68D541C85D26508E83_741459696 = null; //Variable for return #1
        Cursor varB4EAC82CA7396A68D541C85D26508E83_138004022 = null; //Variable for return #2
        Cursor varB4EAC82CA7396A68D541C85D26508E83_1376196259 = null; //Variable for return #3
        Log.d(LOG_TAG, "runQueryOnBackgroundThread(" + constraint + ")");
        String query;
        query = "";
        query = constraint.toString();
        Cursor cursor;
        cursor = null;
        {
            boolean var1FD321E2413C37BB7BF6265879DF7132_368110023 = (mSearchView.getVisibility() != View.VISIBLE
                || mSearchView.getWindowVisibility() != View.VISIBLE);
            {
                varB4EAC82CA7396A68D541C85D26508E83_741459696 = null;
            } //End block
        } //End collapsed parenthetic
        try 
        {
            cursor = mSearchManager.getSuggestions(mSearchable, query, QUERY_LIMIT);
            {
                cursor.getCount();
                varB4EAC82CA7396A68D541C85D26508E83_138004022 = cursor;
            } //End block
        } //End block
        catch (RuntimeException e)
        { }
        varB4EAC82CA7396A68D541C85D26508E83_1376196259 = null;
        addTaint(constraint.getTaint());
        Cursor varA7E53CE21691AB073D9660D615818899_2081397528; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_2081397528 = varB4EAC82CA7396A68D541C85D26508E83_741459696;
                break;
            case 2: //Assign result for return ordinal #2
                varA7E53CE21691AB073D9660D615818899_2081397528 = varB4EAC82CA7396A68D541C85D26508E83_138004022;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_2081397528 = varB4EAC82CA7396A68D541C85D26508E83_1376196259;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_2081397528.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_2081397528;
        // ---------- Original Method ----------
        //if (DBG) Log.d(LOG_TAG, "runQueryOnBackgroundThread(" + constraint + ")");
        //String query = (constraint == null) ? "" : constraint.toString();
        //Cursor cursor = null;
        //if (mSearchView.getVisibility() != View.VISIBLE
                //|| mSearchView.getWindowVisibility() != View.VISIBLE) {
            //return null;
        //}
        //try {
            //cursor = mSearchManager.getSuggestions(mSearchable, query, QUERY_LIMIT);
            //if (cursor != null) {
                //cursor.getCount();
                //return cursor;
            //}
        //} catch (RuntimeException e) {
            //Log.w(LOG_TAG, "Search suggestions query threw an exception.", e);
        //}
        //return null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.572 -0400", hash_original_method = "31DDF4DC630B78B5374FE58E89B45EA8", hash_generated_method = "C7D7BD489C69CF8812EDED66E65A8F4C")
    public void close() {
        Log.d(LOG_TAG, "close()");
        changeCursor(null);
        mClosed = true;
        // ---------- Original Method ----------
        //if (DBG) Log.d(LOG_TAG, "close()");
        //changeCursor(null);
        //mClosed = true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.572 -0400", hash_original_method = "6C6F9D84444AF89C1AA3B4F24466FCA3", hash_generated_method = "8B9EEDC1009B20B2D1E17A6FA08ADD72")
    @Override
    public void notifyDataSetChanged() {
        Log.d(LOG_TAG, "notifyDataSetChanged");
        super.notifyDataSetChanged();
        updateSpinnerState(getCursor());
        // ---------- Original Method ----------
        //if (DBG) Log.d(LOG_TAG, "notifyDataSetChanged");
        //super.notifyDataSetChanged();
        //updateSpinnerState(getCursor());
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.572 -0400", hash_original_method = "C9146AC3C36F793606A0389850806FAD", hash_generated_method = "6B93AEE0079E5CB1BBCFFD1FCD57FEA0")
    @Override
    public void notifyDataSetInvalidated() {
        Log.d(LOG_TAG, "notifyDataSetInvalidated");
        super.notifyDataSetInvalidated();
        updateSpinnerState(getCursor());
        // ---------- Original Method ----------
        //if (DBG) Log.d(LOG_TAG, "notifyDataSetInvalidated");
        //super.notifyDataSetInvalidated();
        //updateSpinnerState(getCursor());
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.574 -0400", hash_original_method = "1E3B20B61BE1D7016BA8A5BF351CC500", hash_generated_method = "E6E39202EC345F13614CDEBB6151AAE3")
    private void updateSpinnerState(Cursor cursor) {
        Bundle extras;
        extras = cursor.getExtras();
        extras = null;
        {
            Log.d(LOG_TAG, "updateSpinnerState - extra = "
                + (extras != null
                        ? extras.getBoolean(SearchManager.CURSOR_EXTRA_KEY_IN_PROGRESS)
                        : null));
        } //End block
        {
            boolean var50462C069FC0D18F392466D196957EC9_1381379409 = (extras != null
                && extras.getBoolean(SearchManager.CURSOR_EXTRA_KEY_IN_PROGRESS));
        } //End collapsed parenthetic
        addTaint(cursor.getTaint());
        // ---------- Original Method ----------
        //Bundle extras = cursor != null ? cursor.getExtras() : null;
        //if (DBG) {
            //Log.d(LOG_TAG, "updateSpinnerState - extra = "
                //+ (extras != null
                        //? extras.getBoolean(SearchManager.CURSOR_EXTRA_KEY_IN_PROGRESS)
                        //: null));
        //}
        //if (extras != null
                //&& extras.getBoolean(SearchManager.CURSOR_EXTRA_KEY_IN_PROGRESS)) {
            //return;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.580 -0400", hash_original_method = "148392FC8CA03B9EFECB202A68AE28AE", hash_generated_method = "13DB8FA6532C059DCDAD7D2B0364B6D8")
    @Override
    public void changeCursor(Cursor c) {
        Log.d(LOG_TAG, "changeCursor(" + c + ")");
        {
            c.close();
        } //End block
        try 
        {
            super.changeCursor(c);
            {
                mText1Col = c.getColumnIndex(SearchManager.SUGGEST_COLUMN_TEXT_1);
                mText2Col = c.getColumnIndex(SearchManager.SUGGEST_COLUMN_TEXT_2);
                mText2UrlCol = c.getColumnIndex(SearchManager.SUGGEST_COLUMN_TEXT_2_URL);
                mIconName1Col = c.getColumnIndex(SearchManager.SUGGEST_COLUMN_ICON_1);
                mIconName2Col = c.getColumnIndex(SearchManager.SUGGEST_COLUMN_ICON_2);
                mFlagsCol = c.getColumnIndex(SearchManager.SUGGEST_COLUMN_FLAGS);
            } //End block
        } //End block
        catch (Exception e)
        { }
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.584 -0400", hash_original_method = "FF2C15D5C77CB986FFC483C5693D319F", hash_generated_method = "3D497ECBC743C999987B5515D72A1EE9")
    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        View varB4EAC82CA7396A68D541C85D26508E83_1955095603 = null; //Variable for return #1
        View v;
        v = super.newView(context, cursor, parent);
        v.setTag(new ChildViewCache(v));
        varB4EAC82CA7396A68D541C85D26508E83_1955095603 = v;
        addTaint(context.getTaint());
        addTaint(cursor.getTaint());
        addTaint(parent.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1955095603.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1955095603;
        // ---------- Original Method ----------
        //View v = super.newView(context, cursor, parent);
        //v.setTag(new ChildViewCache(v));
        //return v;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.589 -0400", hash_original_method = "9ABFACDD3FE80D43883DC10EAA51920C", hash_generated_method = "3E28CA13DE828C58B29FF99735592061")
    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        ChildViewCache views;
        views = (ChildViewCache) view.getTag();
        int flags;
        flags = 0;
        {
            flags = cursor.getInt(mFlagsCol);
        } //End block
        {
            String text1;
            text1 = getStringOrNull(cursor, mText1Col);
            setViewText(views.mText1, text1);
        } //End block
        {
            CharSequence text2;
            text2 = getStringOrNull(cursor, mText2UrlCol);
            {
                text2 = formatUrl(text2);
            } //End block
            {
                text2 = getStringOrNull(cursor, mText2Col);
            } //End block
            {
                boolean varB9DE4693D5C635CA8EC30AA4FD17DA9F_1579252858 = (TextUtils.isEmpty(text2));
                {
                    {
                        views.mText1.setSingleLine(false);
                        views.mText1.setMaxLines(2);
                    } //End block
                } //End block
                {
                    {
                        views.mText1.setSingleLine(true);
                        views.mText1.setMaxLines(1);
                    } //End block
                } //End block
            } //End collapsed parenthetic
            setViewText(views.mText2, text2);
        } //End block
        {
            setViewDrawable(views.mIcon1, getIcon1(cursor), View.INVISIBLE);
        } //End block
        {
            setViewDrawable(views.mIcon2, getIcon2(cursor), View.GONE);
        } //End block
        {
            views.mIconRefine.setVisibility(View.VISIBLE);
            views.mIconRefine.setTag(views.mText1.getText());
            views.mIconRefine.setOnClickListener(this);
        } //End block
        {
            views.mIconRefine.setVisibility(View.GONE);
        } //End block
        addTaint(view.getTaint());
        addTaint(context.getTaint());
        addTaint(cursor.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.590 -0400", hash_original_method = "21562F430356DF0ADAE2AB54659D8C55", hash_generated_method = "5C3D12526F65B1B2CED6D4C4B0C3CEB6")
    public void onClick(View v) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        Object tag;
        tag = v.getTag();
        {
            mSearchView.onQueryRefine((CharSequence) tag);
        } //End block
        addTaint(v.getTaint());
        // ---------- Original Method ----------
        //Object tag = v.getTag();
        //if (tag instanceof CharSequence) {
            //mSearchView.onQueryRefine((CharSequence) tag);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.591 -0400", hash_original_method = "9779DF5ADEE23E8777317BAD132048A5", hash_generated_method = "2E7DAA34F6CE3C5AFF77EE6ECBDE362F")
    private CharSequence formatUrl(CharSequence url) {
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_1022106136 = null; //Variable for return #1
        {
            TypedValue colorValue;
            colorValue = new TypedValue();
            mContext.getTheme().resolveAttribute(R.attr.textColorSearchUrl, colorValue, true);
            mUrlColor = mContext.getResources().getColorStateList(colorValue.resourceId);
        } //End block
        SpannableString text;
        text = new SpannableString(url);
        text.setSpan(new TextAppearanceSpan(null, 0, 0, mUrlColor, null),
                0, url.length(),
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        varB4EAC82CA7396A68D541C85D26508E83_1022106136 = text;
        addTaint(url.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1022106136.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1022106136;
        // ---------- Original Method ----------
        //if (mUrlColor == null) {
            //TypedValue colorValue = new TypedValue();
            //mContext.getTheme().resolveAttribute(R.attr.textColorSearchUrl, colorValue, true);
            //mUrlColor = mContext.getResources().getColorStateList(colorValue.resourceId);
        //}
        //SpannableString text = new SpannableString(url);
        //text.setSpan(new TextAppearanceSpan(null, 0, 0, mUrlColor, null),
                //0, url.length(),
                //Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        //return text;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.591 -0400", hash_original_method = "8F61D57F1A865E44B5C7D5D6842EB2D0", hash_generated_method = "0A7D9D3935C249BCF4F36C904FDFE348")
    private void setViewText(TextView v, CharSequence text) {
        v.setText(text);
        {
            boolean var6C86A511CD0D2845B6E0259573F6A612_1943589515 = (TextUtils.isEmpty(text));
            {
                v.setVisibility(View.GONE);
            } //End block
            {
                v.setVisibility(View.VISIBLE);
            } //End block
        } //End collapsed parenthetic
        addTaint(v.getTaint());
        addTaint(text.getTaint());
        // ---------- Original Method ----------
        //v.setText(text);
        //if (TextUtils.isEmpty(text)) {
            //v.setVisibility(View.GONE);
        //} else {
            //v.setVisibility(View.VISIBLE);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.595 -0400", hash_original_method = "11EBBD91023FF77979C98F4482283D5C", hash_generated_method = "E32EEEC8821D886A04143F041180A5D7")
    private Drawable getIcon1(Cursor cursor) {
        Drawable varB4EAC82CA7396A68D541C85D26508E83_2035435093 = null; //Variable for return #1
        Drawable varB4EAC82CA7396A68D541C85D26508E83_2008757676 = null; //Variable for return #2
        Drawable varB4EAC82CA7396A68D541C85D26508E83_1964646157 = null; //Variable for return #3
        {
            varB4EAC82CA7396A68D541C85D26508E83_2035435093 = null;
        } //End block
        String value;
        value = cursor.getString(mIconName1Col);
        Drawable drawable;
        drawable = getDrawableFromResourceValue(value);
        {
            varB4EAC82CA7396A68D541C85D26508E83_2008757676 = drawable;
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1964646157 = getDefaultIcon1(cursor);
        addTaint(cursor.getTaint());
        Drawable varA7E53CE21691AB073D9660D615818899_1441546552; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1441546552 = varB4EAC82CA7396A68D541C85D26508E83_2035435093;
                break;
            case 2: //Assign result for return ordinal #2
                varA7E53CE21691AB073D9660D615818899_1441546552 = varB4EAC82CA7396A68D541C85D26508E83_2008757676;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1441546552 = varB4EAC82CA7396A68D541C85D26508E83_1964646157;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1441546552.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1441546552;
        // ---------- Original Method ----------
        //if (mIconName1Col == INVALID_INDEX) {
            //return null;
        //}
        //String value = cursor.getString(mIconName1Col);
        //Drawable drawable = getDrawableFromResourceValue(value);
        //if (drawable != null) {
            //return drawable;
        //}
        //return getDefaultIcon1(cursor);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.596 -0400", hash_original_method = "E54FBD6C00322E8129D2706226F8DB3F", hash_generated_method = "70402AE423093FC8CE37AA7ED027E9C6")
    private Drawable getIcon2(Cursor cursor) {
        Drawable varB4EAC82CA7396A68D541C85D26508E83_1204201384 = null; //Variable for return #1
        Drawable varB4EAC82CA7396A68D541C85D26508E83_1617094683 = null; //Variable for return #2
        {
            varB4EAC82CA7396A68D541C85D26508E83_1204201384 = null;
        } //End block
        String value;
        value = cursor.getString(mIconName2Col);
        varB4EAC82CA7396A68D541C85D26508E83_1617094683 = getDrawableFromResourceValue(value);
        addTaint(cursor.getTaint());
        Drawable varA7E53CE21691AB073D9660D615818899_1471140686; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1471140686 = varB4EAC82CA7396A68D541C85D26508E83_1204201384;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1471140686 = varB4EAC82CA7396A68D541C85D26508E83_1617094683;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1471140686.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1471140686;
        // ---------- Original Method ----------
        //if (mIconName2Col == INVALID_INDEX) {
            //return null;
        //}
        //String value = cursor.getString(mIconName2Col);
        //return getDrawableFromResourceValue(value);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.598 -0400", hash_original_method = "DC13C6A1012A85758DE954F51DF05728", hash_generated_method = "9D85F41AC2B492F8E8C048A9E3029074")
    private void setViewDrawable(ImageView v, Drawable drawable, int nullVisibility) {
        v.setImageDrawable(drawable);
        {
            v.setVisibility(nullVisibility);
        } //End block
        {
            v.setVisibility(View.VISIBLE);
            drawable.setVisible(false, false);
            drawable.setVisible(true, false);
        } //End block
        addTaint(v.getTaint());
        addTaint(drawable.getTaint());
        addTaint(nullVisibility);
        // ---------- Original Method ----------
        //v.setImageDrawable(drawable);
        //if (drawable == null) {
            //v.setVisibility(nullVisibility);
        //} else {
            //v.setVisibility(View.VISIBLE);
            //drawable.setVisible(false, false);
            //drawable.setVisible(true, false);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.609 -0400", hash_original_method = "EEAFA1105ED04DD7E614744D210BB1BA", hash_generated_method = "F59A4D639E53B73EA6250F64794108F5")
    @Override
    public CharSequence convertToString(Cursor cursor) {
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_1352120480 = null; //Variable for return #1
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_1322636163 = null; //Variable for return #2
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_1398886720 = null; //Variable for return #3
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_477116609 = null; //Variable for return #4
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_1549743090 = null; //Variable for return #5
        {
            varB4EAC82CA7396A68D541C85D26508E83_1352120480 = null;
        } //End block
        String query;
        query = getColumnString(cursor, SearchManager.SUGGEST_COLUMN_QUERY);
        {
            varB4EAC82CA7396A68D541C85D26508E83_1322636163 = query;
        } //End block
        {
            boolean varE8FE5C36D8FE1523056BAB9AB236D1EA_317231110 = (mSearchable.shouldRewriteQueryFromData());
            {
                String data;
                data = getColumnString(cursor, SearchManager.SUGGEST_COLUMN_INTENT_DATA);
                {
                    varB4EAC82CA7396A68D541C85D26508E83_1398886720 = data;
                } //End block
            } //End block
        } //End collapsed parenthetic
        {
            boolean var29845B1F9A9491B3FE6CECDC2E20A3FE_53869185 = (mSearchable.shouldRewriteQueryFromText());
            {
                String text1;
                text1 = getColumnString(cursor, SearchManager.SUGGEST_COLUMN_TEXT_1);
                {
                    varB4EAC82CA7396A68D541C85D26508E83_477116609 = text1;
                } //End block
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_1549743090 = null;
        addTaint(cursor.getTaint());
        CharSequence varA7E53CE21691AB073D9660D615818899_1754224949; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1754224949 = varB4EAC82CA7396A68D541C85D26508E83_1352120480;
                break;
            case 2: //Assign result for return ordinal #2
                varA7E53CE21691AB073D9660D615818899_1754224949 = varB4EAC82CA7396A68D541C85D26508E83_1322636163;
                break;
            case 3: //Assign result for return ordinal #3
                varA7E53CE21691AB073D9660D615818899_1754224949 = varB4EAC82CA7396A68D541C85D26508E83_1398886720;
                break;
            case 4: //Assign result for return ordinal #4
                varA7E53CE21691AB073D9660D615818899_1754224949 = varB4EAC82CA7396A68D541C85D26508E83_477116609;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1754224949 = varB4EAC82CA7396A68D541C85D26508E83_1549743090;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1754224949.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1754224949;
        // ---------- Original Method ----------
        //if (cursor == null) {
            //return null;
        //}
        //String query = getColumnString(cursor, SearchManager.SUGGEST_COLUMN_QUERY);
        //if (query != null) {
            //return query;
        //}
        //if (mSearchable.shouldRewriteQueryFromData()) {
            //String data = getColumnString(cursor, SearchManager.SUGGEST_COLUMN_INTENT_DATA);
            //if (data != null) {
                //return data;
            //}
        //}
        //if (mSearchable.shouldRewriteQueryFromText()) {
            //String text1 = getColumnString(cursor, SearchManager.SUGGEST_COLUMN_TEXT_1);
            //if (text1 != null) {
                //return text1;
            //}
        //}
        //return null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.611 -0400", hash_original_method = "EC9A6ABF4CBFA211B4EDA728AA0B1D68", hash_generated_method = "28C839B7B8742548D4174BB09ABEC26F")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View varB4EAC82CA7396A68D541C85D26508E83_277274089 = null; //Variable for return #1
        View varB4EAC82CA7396A68D541C85D26508E83_1905268028 = null; //Variable for return #2
        try 
        {
            varB4EAC82CA7396A68D541C85D26508E83_277274089 = super.getView(position, convertView, parent);
        } //End block
        catch (RuntimeException e)
        {
            View v;
            v = newView(mContext, mCursor, parent);
            {
                ChildViewCache views;
                views = (ChildViewCache) v.getTag();
                TextView tv;
                tv = views.mText1;
                tv.setText(e.toString());
            } //End block
            varB4EAC82CA7396A68D541C85D26508E83_1905268028 = v;
        } //End block
        addTaint(position);
        addTaint(convertView.getTaint());
        addTaint(parent.getTaint());
        View varA7E53CE21691AB073D9660D615818899_982390336; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_982390336 = varB4EAC82CA7396A68D541C85D26508E83_277274089;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_982390336 = varB4EAC82CA7396A68D541C85D26508E83_1905268028;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_982390336.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_982390336;
        // ---------- Original Method ----------
        //try {
            //return super.getView(position, convertView, parent);
        //} catch (RuntimeException e) {
            //Log.w(LOG_TAG, "Search suggestions cursor threw exception.", e);
            //View v = newView(mContext, mCursor, parent);
            //if (v != null) {
                //ChildViewCache views = (ChildViewCache) v.getTag();
                //TextView tv = views.mText1;
                //tv.setText(e.toString());
            //}
            //return v;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.626 -0400", hash_original_method = "2062B3ECC79D4C838F6E4FC0FEE6243A", hash_generated_method = "443E42F15F2B09EC8388F7B0E1F4615D")
    private Drawable getDrawableFromResourceValue(String drawableId) {
        Drawable varB4EAC82CA7396A68D541C85D26508E83_1086339790 = null; //Variable for return #1
        Drawable varB4EAC82CA7396A68D541C85D26508E83_115028541 = null; //Variable for return #2
        Drawable varB4EAC82CA7396A68D541C85D26508E83_473235775 = null; //Variable for return #3
        Drawable varB4EAC82CA7396A68D541C85D26508E83_698764768 = null; //Variable for return #4
        Drawable varB4EAC82CA7396A68D541C85D26508E83_1905392672 = null; //Variable for return #5
        Drawable varB4EAC82CA7396A68D541C85D26508E83_1776417437 = null; //Variable for return #6
        {
            boolean var28BB864B60CF8C657D6DC33CCB43E344_864483959 = (drawableId == null || drawableId.length() == 0 || "0".equals(drawableId));
            {
                varB4EAC82CA7396A68D541C85D26508E83_1086339790 = null;
            } //End block
        } //End collapsed parenthetic
        try 
        {
            int resourceId;
            resourceId = Integer.parseInt(drawableId);
            String drawableUri;
            drawableUri = ContentResolver.SCHEME_ANDROID_RESOURCE
                    + "://" + mProviderContext.getPackageName() + "/" + resourceId;
            Drawable drawable;
            drawable = checkIconCache(drawableUri);
            {
                varB4EAC82CA7396A68D541C85D26508E83_115028541 = drawable;
            } //End block
            drawable = mProviderContext.getResources().getDrawable(resourceId);
            storeInIconCache(drawableUri, drawable);
            varB4EAC82CA7396A68D541C85D26508E83_473235775 = drawable;
        } //End block
        catch (NumberFormatException nfe)
        {
            Drawable drawable;
            drawable = checkIconCache(drawableId);
            {
                varB4EAC82CA7396A68D541C85D26508E83_698764768 = drawable;
            } //End block
            Uri uri;
            uri = Uri.parse(drawableId);
            drawable = getDrawable(uri);
            storeInIconCache(drawableId, drawable);
            varB4EAC82CA7396A68D541C85D26508E83_1905392672 = drawable;
        } //End block
        catch (Resources.NotFoundException nfe)
        {
            varB4EAC82CA7396A68D541C85D26508E83_1776417437 = null;
        } //End block
        addTaint(drawableId.getTaint());
        Drawable varA7E53CE21691AB073D9660D615818899_816216176; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_816216176 = varB4EAC82CA7396A68D541C85D26508E83_1086339790;
                break;
            case 2: //Assign result for return ordinal #2
                varA7E53CE21691AB073D9660D615818899_816216176 = varB4EAC82CA7396A68D541C85D26508E83_115028541;
                break;
            case 3: //Assign result for return ordinal #3
                varA7E53CE21691AB073D9660D615818899_816216176 = varB4EAC82CA7396A68D541C85D26508E83_473235775;
                break;
            case 4: //Assign result for return ordinal #4
                varA7E53CE21691AB073D9660D615818899_816216176 = varB4EAC82CA7396A68D541C85D26508E83_698764768;
                break;
            case 5: //Assign result for return ordinal #5
                varA7E53CE21691AB073D9660D615818899_816216176 = varB4EAC82CA7396A68D541C85D26508E83_1905392672;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_816216176 = varB4EAC82CA7396A68D541C85D26508E83_1776417437;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_816216176.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_816216176;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.631 -0400", hash_original_method = "3801EEB25227B54F215AA02CEF91B89D", hash_generated_method = "3254B28B8505D1C6258AA732D05EBBB7")
    private Drawable getDrawable(Uri uri) {
        Drawable varB4EAC82CA7396A68D541C85D26508E83_1794957161 = null; //Variable for return #1
        Drawable varB4EAC82CA7396A68D541C85D26508E83_1646282849 = null; //Variable for return #2
        Drawable varB4EAC82CA7396A68D541C85D26508E83_489303832 = null; //Variable for return #3
        try 
        {
            String scheme;
            scheme = uri.getScheme();
            {
                boolean varF1920ADB7A324A214864F4BBBDD05F45_1832755166 = (ContentResolver.SCHEME_ANDROID_RESOURCE.equals(scheme));
                {
                    OpenResourceIdResult r;
                    r = mProviderContext.getContentResolver().getResourceId(uri);
                    try 
                    {
                        varB4EAC82CA7396A68D541C85D26508E83_1794957161 = r.r.getDrawable(r.id);
                    } //End block
                    catch (Resources.NotFoundException ex)
                    {
                        if (DroidSafeAndroidRuntime.control) throw new FileNotFoundException("Resource does not exist: " + uri);
                    } //End block
                } //End block
                {
                    InputStream stream;
                    stream = mProviderContext.getContentResolver().openInputStream(uri);
                    {
                        if (DroidSafeAndroidRuntime.control) throw new FileNotFoundException("Failed to open " + uri);
                    } //End block
                    try 
                    {
                        varB4EAC82CA7396A68D541C85D26508E83_1646282849 = Drawable.createFromStream(stream, null);
                    } //End block
                    finally 
                    {
                        try 
                        {
                            stream.close();
                        } //End block
                        catch (IOException ex)
                        { }
                    } //End block
                } //End block
            } //End collapsed parenthetic
        } //End block
        catch (FileNotFoundException fnfe)
        {
            varB4EAC82CA7396A68D541C85D26508E83_489303832 = null;
        } //End block
        addTaint(uri.getTaint());
        Drawable varA7E53CE21691AB073D9660D615818899_2072281220; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_2072281220 = varB4EAC82CA7396A68D541C85D26508E83_1794957161;
                break;
            case 2: //Assign result for return ordinal #2
                varA7E53CE21691AB073D9660D615818899_2072281220 = varB4EAC82CA7396A68D541C85D26508E83_1646282849;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_2072281220 = varB4EAC82CA7396A68D541C85D26508E83_489303832;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_2072281220.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_2072281220;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.632 -0400", hash_original_method = "9553535B4A93F8E44A1EFE31D535ED8E", hash_generated_method = "77D45065D4F636FCAC08F76C8BFDB1D2")
    private Drawable checkIconCache(String resourceUri) {
        Drawable varB4EAC82CA7396A68D541C85D26508E83_531205711 = null; //Variable for return #1
        Drawable varB4EAC82CA7396A68D541C85D26508E83_164206120 = null; //Variable for return #2
        Drawable.ConstantState cached;
        cached = mOutsideDrawablesCache.get(resourceUri);
        {
            varB4EAC82CA7396A68D541C85D26508E83_531205711 = null;
        } //End block
        Log.d(LOG_TAG, "Found icon in cache: " + resourceUri);
        varB4EAC82CA7396A68D541C85D26508E83_164206120 = cached.newDrawable();
        addTaint(resourceUri.getTaint());
        Drawable varA7E53CE21691AB073D9660D615818899_506205341; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_506205341 = varB4EAC82CA7396A68D541C85D26508E83_531205711;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_506205341 = varB4EAC82CA7396A68D541C85D26508E83_164206120;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_506205341.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_506205341;
        // ---------- Original Method ----------
        //Drawable.ConstantState cached = mOutsideDrawablesCache.get(resourceUri);
        //if (cached == null) {
            //return null;
        //}
        //if (DBG) Log.d(LOG_TAG, "Found icon in cache: " + resourceUri);
        //return cached.newDrawable();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.640 -0400", hash_original_method = "7BF5C76588E6E73B227833C6CD1AD962", hash_generated_method = "498CEB28618E44C78E4C28702419267A")
    private void storeInIconCache(String resourceUri, Drawable drawable) {
        {
            mOutsideDrawablesCache.put(resourceUri, drawable.getConstantState());
        } //End block
        addTaint(resourceUri.getTaint());
        addTaint(drawable.getTaint());
        // ---------- Original Method ----------
        //if (drawable != null) {
            //mOutsideDrawablesCache.put(resourceUri, drawable.getConstantState());
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.644 -0400", hash_original_method = "24C6C5F14DA2AC5DBA34633E0C5BC43B", hash_generated_method = "1CAB1B546D1DDBD241302207C6BEC342")
    private Drawable getDefaultIcon1(Cursor cursor) {
        Drawable varB4EAC82CA7396A68D541C85D26508E83_778046771 = null; //Variable for return #1
        Drawable varB4EAC82CA7396A68D541C85D26508E83_646895239 = null; //Variable for return #2
        Drawable drawable;
        drawable = getActivityIconWithCache(mSearchable.getSearchActivity());
        {
            varB4EAC82CA7396A68D541C85D26508E83_778046771 = drawable;
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_646895239 = mContext.getPackageManager().getDefaultActivityIcon();
        addTaint(cursor.getTaint());
        Drawable varA7E53CE21691AB073D9660D615818899_241048684; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_241048684 = varB4EAC82CA7396A68D541C85D26508E83_778046771;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_241048684 = varB4EAC82CA7396A68D541C85D26508E83_646895239;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_241048684.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_241048684;
        // ---------- Original Method ----------
        //Drawable drawable = getActivityIconWithCache(mSearchable.getSearchActivity());
        //if (drawable != null) {
            //return drawable;
        //}
        //return mContext.getPackageManager().getDefaultActivityIcon();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.654 -0400", hash_original_method = "1ABDDD143C3A87EFB8B7D38CA2C4068F", hash_generated_method = "258A6FC50C622DEA1EDD7FCE93BBD93C")
    private Drawable getActivityIconWithCache(ComponentName component) {
        Drawable varB4EAC82CA7396A68D541C85D26508E83_941454992 = null; //Variable for return #1
        Drawable varB4EAC82CA7396A68D541C85D26508E83_184889556 = null; //Variable for return #2
        String componentIconKey;
        componentIconKey = component.flattenToShortString();
        {
            boolean var5A3FED2D0F34D844AB05B6B3BADFCD1F_1528757922 = (mOutsideDrawablesCache.containsKey(componentIconKey));
            {
                Drawable.ConstantState cached;
                cached = mOutsideDrawablesCache.get(componentIconKey);
                varB4EAC82CA7396A68D541C85D26508E83_941454992 = cached == null ? null : cached.newDrawable(mProviderContext.getResources());
            } //End block
        } //End collapsed parenthetic
        Drawable drawable;
        drawable = getActivityIcon(component);
        Drawable.ConstantState toCache;
        toCache = null;
        toCache = drawable.getConstantState();
        mOutsideDrawablesCache.put(componentIconKey, toCache);
        varB4EAC82CA7396A68D541C85D26508E83_184889556 = drawable;
        addTaint(component.getTaint());
        Drawable varA7E53CE21691AB073D9660D615818899_1949834768; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1949834768 = varB4EAC82CA7396A68D541C85D26508E83_941454992;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1949834768 = varB4EAC82CA7396A68D541C85D26508E83_184889556;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1949834768.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1949834768;
        // ---------- Original Method ----------
        //String componentIconKey = component.flattenToShortString();
        //if (mOutsideDrawablesCache.containsKey(componentIconKey)) {
            //Drawable.ConstantState cached = mOutsideDrawablesCache.get(componentIconKey);
            //return cached == null ? null : cached.newDrawable(mProviderContext.getResources());
        //}
        //Drawable drawable = getActivityIcon(component);
        //Drawable.ConstantState toCache = drawable == null ? null : drawable.getConstantState();
        //mOutsideDrawablesCache.put(componentIconKey, toCache);
        //return drawable;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.655 -0400", hash_original_method = "62EED478ECA0AB495E91A21A2EB22E87", hash_generated_method = "44BAD8C7FA09EB9C6465F14B6F2E187D")
    private Drawable getActivityIcon(ComponentName component) {
        Drawable varB4EAC82CA7396A68D541C85D26508E83_1498611611 = null; //Variable for return #1
        Drawable varB4EAC82CA7396A68D541C85D26508E83_260422364 = null; //Variable for return #2
        Drawable varB4EAC82CA7396A68D541C85D26508E83_659989697 = null; //Variable for return #3
        Drawable varB4EAC82CA7396A68D541C85D26508E83_1861205908 = null; //Variable for return #4
        PackageManager pm;
        pm = mContext.getPackageManager();
        ActivityInfo activityInfo;
        try 
        {
            activityInfo = pm.getActivityInfo(component, PackageManager.GET_META_DATA);
        } //End block
        catch (NameNotFoundException ex)
        {
            varB4EAC82CA7396A68D541C85D26508E83_1498611611 = null;
        } //End block
        int iconId;
        iconId = activityInfo.getIconResource();
        varB4EAC82CA7396A68D541C85D26508E83_260422364 = null;
        String pkg;
        pkg = component.getPackageName();
        Drawable drawable;
        drawable = pm.getDrawable(pkg, iconId, activityInfo.applicationInfo);
        {
            varB4EAC82CA7396A68D541C85D26508E83_659989697 = null;
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1861205908 = drawable;
        addTaint(component.getTaint());
        Drawable varA7E53CE21691AB073D9660D615818899_1020930878; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1020930878 = varB4EAC82CA7396A68D541C85D26508E83_1498611611;
                break;
            case 2: //Assign result for return ordinal #2
                varA7E53CE21691AB073D9660D615818899_1020930878 = varB4EAC82CA7396A68D541C85D26508E83_260422364;
                break;
            case 3: //Assign result for return ordinal #3
                varA7E53CE21691AB073D9660D615818899_1020930878 = varB4EAC82CA7396A68D541C85D26508E83_659989697;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1020930878 = varB4EAC82CA7396A68D541C85D26508E83_1861205908;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1020930878.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1020930878;
        // ---------- Original Method ----------
        //PackageManager pm = mContext.getPackageManager();
        //final ActivityInfo activityInfo;
        //try {
            //activityInfo = pm.getActivityInfo(component, PackageManager.GET_META_DATA);
        //} catch (NameNotFoundException ex) {
            //Log.w(LOG_TAG, ex.toString());
            //return null;
        //}
        //int iconId = activityInfo.getIconResource();
        //if (iconId == 0) return null;
        //String pkg = component.getPackageName();
        //Drawable drawable = pm.getDrawable(pkg, iconId, activityInfo.applicationInfo);
        //if (drawable == null) {
            //Log.w(LOG_TAG, "Invalid icon resource " + iconId + " for "
                    //+ component.flattenToShortString());
            //return null;
        //}
        //return drawable;
    }

    
        public static String getColumnString(Cursor cursor, String columnName) {
        int col = cursor.getColumnIndex(columnName);
        return getStringOrNull(cursor, col);
    }

    
        private static String getStringOrNull(Cursor cursor, int col) {
        if (col == INVALID_INDEX) {
            return null;
        }
        try {
            return cursor.getString(col);
        } catch (Exception e) {
            Log.e(LOG_TAG,
                    "unexpected error retrieving valid column from cursor, "
                            + "did the remote process die?", e);
            return null;
        }
    }

    
    private final static class ChildViewCache {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.656 -0400", hash_original_field = "205BE263C74C715DC52CF9A7EA2D73ED", hash_generated_field = "3275A8779DDA322EA97597C856F45009")

        public TextView mText1;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.656 -0400", hash_original_field = "1772A2F42FB317DE654726988EC76A3E", hash_generated_field = "E7E5E0130CDA035A703BB3365C609752")

        public TextView mText2;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.656 -0400", hash_original_field = "C673825E43818CD99105CCE1AF6F70BF", hash_generated_field = "B10EF113E51700A15611B304B30E7778")

        public ImageView mIcon1;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.656 -0400", hash_original_field = "401AE428E1A1CA95FD335942DA31956C", hash_generated_field = "055F53A680C450108241A4F35FFAA884")

        public ImageView mIcon2;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.656 -0400", hash_original_field = "424E64D4026EF571F7811E0460C74F68", hash_generated_field = "A8BC95870909A5381D4C019B25F5D8B2")

        public ImageView mIconRefine;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.666 -0400", hash_original_method = "0CE27F5D43D07582A33280C2CC2EDB09", hash_generated_method = "A23527F4592F77FB480D002A2CC11E38")
        public  ChildViewCache(View v) {
            mText1 = (TextView) v.findViewById(com.android.internal.R.id.text1);
            mText2 = (TextView) v.findViewById(com.android.internal.R.id.text2);
            mIcon1 = (ImageView) v.findViewById(com.android.internal.R.id.icon1);
            mIcon2 = (ImageView) v.findViewById(com.android.internal.R.id.icon2);
            mIconRefine = (ImageView) v.findViewById(com.android.internal.R.id.edit_query);
            // ---------- Original Method ----------
            //mText1 = (TextView) v.findViewById(com.android.internal.R.id.text1);
            //mText2 = (TextView) v.findViewById(com.android.internal.R.id.text2);
            //mIcon1 = (ImageView) v.findViewById(com.android.internal.R.id.icon1);
            //mIcon2 = (ImageView) v.findViewById(com.android.internal.R.id.icon2);
            //mIconRefine = (ImageView) v.findViewById(com.android.internal.R.id.edit_query);
        }

        
    }


    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.666 -0400", hash_original_field = "0F6F0EB642B3F46DE2B2DF48DA4427EF", hash_generated_field = "B7C4E93D97D072890A37A56076D870F8")

    private static boolean DBG = false;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.666 -0400", hash_original_field = "6B8D978304A97E85580800EE57FC5F42", hash_generated_field = "609DD6EF7D91E3E172BAB72FDDF3DC52")

    private static String LOG_TAG = "SuggestionsAdapter";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.666 -0400", hash_original_field = "DFECEA9C77B80DBC48160A07ACDBDEB4", hash_generated_field = "5D61AC336E10A2E16D45DCA3A83492C4")

    private static int QUERY_LIMIT = 50;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.667 -0400", hash_original_field = "EB7B121651A66593BC5AD08A505BE0A7", hash_generated_field = "B9B6358D09CAF7F7F0DB9CB30C3BF3FB")

    static int REFINE_NONE = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.667 -0400", hash_original_field = "7E8458192869CFB509A110D384FF690D", hash_generated_field = "6B4A7ED1BBAF063CB2E5E3A4248AAEB3")

    static int REFINE_BY_ENTRY = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.667 -0400", hash_original_field = "4C7A7BFA9F30302A906B93D55A815A86", hash_generated_field = "04D1849D0689738627F9B3DE382B8B80")

    static int REFINE_ALL = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.667 -0400", hash_original_field = "8C5E8C33309913A25C19F3D2DD557C14", hash_generated_field = "E9E380BE3F181D063151FCDDDCAFFEBF")

    static int INVALID_INDEX = -1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:11.667 -0400", hash_original_field = "C4DCE6A318023772AC49B35520D8998B", hash_generated_field = "6556736ADA17679B39279E13D50C8F9B")

    private static long DELETE_KEY_POST_DELAY = 500L;
}

