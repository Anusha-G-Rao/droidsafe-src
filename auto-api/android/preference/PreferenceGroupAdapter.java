package android.preference;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import android.os.Handler;
import android.preference.Preference.OnPreferenceChangeInternalListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ListView;

class PreferenceGroupAdapter extends BaseAdapter implements OnPreferenceChangeInternalListener {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:30.137 -0400", hash_original_field = "60A1F576EA55DAAA9B029C3300F68D2D", hash_generated_field = "9E796A8BD15586231740457EF37FD47D")

    private PreferenceGroup mPreferenceGroup;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:30.137 -0400", hash_original_field = "49E5F06342B9A756471C57C41582CFFB", hash_generated_field = "18F192958EC897931FD8B3DA5BF85A77")

    private List<Preference> mPreferenceList;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:30.137 -0400", hash_original_field = "B17D80C739620B94B645CF4C17A79E8D", hash_generated_field = "DA3004DA159CA709DF746F6CEC7DBE4F")

    private ArrayList<PreferenceLayout> mPreferenceLayouts;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:30.137 -0400", hash_original_field = "0EA8349A74250C961790E8C2CB2711B0", hash_generated_field = "21E20E055E82593BC0F10B12A6DDF8CB")

    private PreferenceLayout mTempPreferenceLayout = new PreferenceLayout();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:30.137 -0400", hash_original_field = "EC716D907E12FB2C66058C9510972CEE", hash_generated_field = "68E5BAC937AEA9D08E6032C8918801F2")

    private boolean mHasReturnedViewTypeCount = false;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:30.137 -0400", hash_original_field = "ACF05BEDD3E446A1812760F79FD88601", hash_generated_field = "8BB536959B4C4BC77100BFD82203560A")

    private volatile boolean mIsSyncing = false;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:30.138 -0400", hash_original_field = "6781893E9FA50A9B7103FD3F674E566B", hash_generated_field = "2E60E17486AAEB1A4E1F1878A0354061")

    private Handler mHandler = new Handler();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:30.139 -0400", hash_original_field = "A759A4E7184E3E83FC4B81BC91EB49E4", hash_generated_field = "3F3E82BCCB615EBE24E10CF6ABD4D1FC")

    private Runnable mSyncRunnable = new Runnable() {        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:30.138 -0400", hash_original_method = "64E55F1CB25012944C9000EFC5F6389C", hash_generated_method = "098280FA3EF6FEBB87417E5331607D15")
        public void run() {
            syncMyPreferences();
            // ---------- Original Method ----------
            //syncMyPreferences();
        }

        
};
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:30.160 -0400", hash_original_method = "B0DE4241F694B745A6B6018AB0FE0031", hash_generated_method = "2348D0E06D92E9723DB46FBB01A918CF")
    public  PreferenceGroupAdapter(PreferenceGroup preferenceGroup) {
        mPreferenceGroup = preferenceGroup;
        mPreferenceGroup.setOnPreferenceChangeInternalListener(this);
        mPreferenceList = new ArrayList<Preference>();
        mPreferenceLayouts = new ArrayList<PreferenceLayout>();
        syncMyPreferences();
        // ---------- Original Method ----------
        //mPreferenceGroup = preferenceGroup;
        //mPreferenceGroup.setOnPreferenceChangeInternalListener(this);
        //mPreferenceList = new ArrayList<Preference>();
        //mPreferenceLayouts = new ArrayList<PreferenceLayout>();
        //syncMyPreferences();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:30.161 -0400", hash_original_method = "47CAC8934A77F33A41B8A2FADE539715", hash_generated_method = "C47F4C52AF893BC458AEB5870A6FA0D9")
    private void syncMyPreferences() {
        {
            mIsSyncing = true;
        } //End block
        List<Preference> newPreferenceList;
        newPreferenceList = new ArrayList<Preference>(mPreferenceList.size());
        flattenPreferenceGroup(newPreferenceList, mPreferenceGroup);
        mPreferenceList = newPreferenceList;
        notifyDataSetChanged();
        {
            mIsSyncing = false;
            notifyAll();
        } //End block
        // ---------- Original Method ----------
        //synchronized(this) {
            //if (mIsSyncing) {
                //return;
            //}
            //mIsSyncing = true;
        //}
        //List<Preference> newPreferenceList = new ArrayList<Preference>(mPreferenceList.size());
        //flattenPreferenceGroup(newPreferenceList, mPreferenceGroup);
        //mPreferenceList = newPreferenceList;
        //notifyDataSetChanged();
        //synchronized(this) {
            //mIsSyncing = false;
            //notifyAll();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:30.161 -0400", hash_original_method = "DB0831C85843D6D53F9495F3413A2CE3", hash_generated_method = "01E73EBB3DD23FB2782B397F5D16B5AA")
    private void flattenPreferenceGroup(List<Preference> preferences, PreferenceGroup group) {
        group.sortPreferences();
        int groupSize;
        groupSize = group.getPreferenceCount();
        {
            int i;
            i = 0;
            {
                Preference preference;
                preference = group.getPreference(i);
                preferences.add(preference);
                {
                    boolean var40B43CACDE7540D84B524CC399BFB861_370286347 = (!mHasReturnedViewTypeCount && !preference.hasSpecifiedLayout());
                    {
                        addPreferenceClassName(preference);
                    } //End block
                } //End collapsed parenthetic
                {
                    PreferenceGroup preferenceAsGroup;
                    preferenceAsGroup = (PreferenceGroup) preference;
                    {
                        boolean varE978992A5EA3610B487523EDFB788538_1147547755 = (preferenceAsGroup.isOnSameScreenAsChildren());
                        {
                            flattenPreferenceGroup(preferences, preferenceAsGroup);
                        } //End block
                    } //End collapsed parenthetic
                } //End block
                preference.setOnPreferenceChangeInternalListener(this);
            } //End block
        } //End collapsed parenthetic
        addTaint(preferences.getTaint());
        addTaint(group.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:30.178 -0400", hash_original_method = "B927BA6712254BD5B8D47CF220E79C5B", hash_generated_method = "85A651B137FC7F5BFD17787D57EB7C90")
    private PreferenceLayout createPreferenceLayout(Preference preference, PreferenceLayout in) {
        PreferenceLayout varB4EAC82CA7396A68D541C85D26508E83_540850453 = null; //Variable for return #1
        PreferenceLayout pl;
        pl = in;
        pl = new PreferenceLayout();
        pl.name = preference.getClass().getName();
        pl.resId = preference.getLayoutResource();
        pl.widgetResId = preference.getWidgetLayoutResource();
        varB4EAC82CA7396A68D541C85D26508E83_540850453 = pl;
        addTaint(preference.getTaint());
        addTaint(in.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_540850453.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_540850453;
        // ---------- Original Method ----------
        //PreferenceLayout pl = in != null? in : new PreferenceLayout();
        //pl.name = preference.getClass().getName();
        //pl.resId = preference.getLayoutResource();
        //pl.widgetResId = preference.getWidgetLayoutResource();
        //return pl;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:30.179 -0400", hash_original_method = "22004160B58BE5F5ED0505DF7AB89FF1", hash_generated_method = "87DF05775E0C868115C1C30C64377418")
    private void addPreferenceClassName(Preference preference) {
        PreferenceLayout pl;
        pl = createPreferenceLayout(preference, null);
        int insertPos;
        insertPos = Collections.binarySearch(mPreferenceLayouts, pl);
        {
            insertPos = insertPos * -1 - 1;
            mPreferenceLayouts.add(insertPos, pl);
        } //End block
        addTaint(preference.getTaint());
        // ---------- Original Method ----------
        //final PreferenceLayout pl = createPreferenceLayout(preference, null);
        //int insertPos = Collections.binarySearch(mPreferenceLayouts, pl);
        //if (insertPos < 0) {
            //insertPos = insertPos * -1 - 1;
            //mPreferenceLayouts.add(insertPos, pl);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:30.179 -0400", hash_original_method = "146D9A3F8F2485F6100744DF28993915", hash_generated_method = "6A32544E721B6E730142648BAC32205B")
    public int getCount() {
        int var0BB871AF6B245B4A49AE35894863E9A5_331180184 = (mPreferenceList.size());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_148029921 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_148029921;
        // ---------- Original Method ----------
        //return mPreferenceList.size();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:30.180 -0400", hash_original_method = "B1551AF468D615637FECD6277399376D", hash_generated_method = "8D978D309C98FF99963CD12D4BDE2618")
    public Preference getItem(int position) {
        Preference varB4EAC82CA7396A68D541C85D26508E83_761635850 = null; //Variable for return #1
        Preference varB4EAC82CA7396A68D541C85D26508E83_586041267 = null; //Variable for return #2
        {
            boolean var45192FB07B3B45171D06867ACD726073_1072695065 = (position < 0 || position >= getCount());
            varB4EAC82CA7396A68D541C85D26508E83_761635850 = null;
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_586041267 = mPreferenceList.get(position);
        addTaint(position);
        Preference varA7E53CE21691AB073D9660D615818899_2087070904; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_2087070904 = varB4EAC82CA7396A68D541C85D26508E83_761635850;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_2087070904 = varB4EAC82CA7396A68D541C85D26508E83_586041267;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_2087070904.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_2087070904;
        // ---------- Original Method ----------
        //if (position < 0 || position >= getCount()) return null;
        //return mPreferenceList.get(position);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:30.196 -0400", hash_original_method = "C2BB649F8AE8B2BA22DD6170BF8090F3", hash_generated_method = "6944233D9FC271AFA25C28F617A1BDC6")
    public long getItemId(int position) {
        {
            boolean var45192FB07B3B45171D06867ACD726073_236728882 = (position < 0 || position >= getCount());
        } //End collapsed parenthetic
        long var9A0649B1E597F61DA956857B024285E0_1375618628 = (this.getItem(position).getId());
        addTaint(position);
        long var0F5264038205EDFB1AC05FBB0E8C5E94_1637141260 = getTaintLong();
        return var0F5264038205EDFB1AC05FBB0E8C5E94_1637141260;
        // ---------- Original Method ----------
        //if (position < 0 || position >= getCount()) return ListView.INVALID_ROW_ID;
        //return this.getItem(position).getId();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:30.199 -0400", hash_original_method = "0A6038B272F94F277CAFD95B96B15A1A", hash_generated_method = "F6B8A6FEC10D6DC509D1C5B5B45A4D2C")
    public View getView(int position, View convertView, ViewGroup parent) {
        View varB4EAC82CA7396A68D541C85D26508E83_1952878756 = null; //Variable for return #1
        Preference preference;
        preference = this.getItem(position);
        mTempPreferenceLayout = createPreferenceLayout(preference, mTempPreferenceLayout);
        {
            boolean var0B0B396A5E36CD68AD5961924C81E087_541830442 = (Collections.binarySearch(mPreferenceLayouts, mTempPreferenceLayout) < 0);
            {
                convertView = null;
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_1952878756 = preference.getView(convertView, parent);
        addTaint(position);
        addTaint(convertView.getTaint());
        addTaint(parent.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1952878756.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1952878756;
        // ---------- Original Method ----------
        //final Preference preference = this.getItem(position);
        //mTempPreferenceLayout = createPreferenceLayout(preference, mTempPreferenceLayout);
        //if (Collections.binarySearch(mPreferenceLayouts, mTempPreferenceLayout) < 0) {
            //convertView = null;
        //}
        //return preference.getView(convertView, parent);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:30.203 -0400", hash_original_method = "ED75A4DEF716F8048DFD61CCEF0A4510", hash_generated_method = "8A9736957C6E289BBC85E4F808C1B523")
    @Override
    public boolean isEnabled(int position) {
        {
            boolean var45192FB07B3B45171D06867ACD726073_964953656 = (position < 0 || position >= getCount());
        } //End collapsed parenthetic
        boolean varDF36F1121016E2EC170CA94BD0653774_57122697 = (this.getItem(position).isSelectable());
        addTaint(position);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_303153649 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_303153649;
        // ---------- Original Method ----------
        //if (position < 0 || position >= getCount()) return true;
        //return this.getItem(position).isSelectable();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:30.204 -0400", hash_original_method = "19954EF3B060E791A26DF845CEE18A7B", hash_generated_method = "500951AB18B4026460D3AD88CFC0FE3F")
    @Override
    public boolean areAllItemsEnabled() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_603804323 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_603804323;
        // ---------- Original Method ----------
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:30.204 -0400", hash_original_method = "C2E233D65C74168849EC7AB5F1A2D9C0", hash_generated_method = "1DCFE1C6BDEA034C748E4C6D97AA424B")
    public void onPreferenceChange(Preference preference) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        notifyDataSetChanged();
        addTaint(preference.getTaint());
        // ---------- Original Method ----------
        //notifyDataSetChanged();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:30.223 -0400", hash_original_method = "96B325BF777CE525D2D64038C1261EF1", hash_generated_method = "A1FADCE7230F148BC856F774670D35AF")
    public void onPreferenceHierarchyChange(Preference preference) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        mHandler.removeCallbacks(mSyncRunnable);
        mHandler.post(mSyncRunnable);
        addTaint(preference.getTaint());
        // ---------- Original Method ----------
        //mHandler.removeCallbacks(mSyncRunnable);
        //mHandler.post(mSyncRunnable);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:30.223 -0400", hash_original_method = "047E07C1992C7400A48E08BF432AD584", hash_generated_method = "D32E64C5903021D1778A5D3F45BA8E98")
    @Override
    public boolean hasStableIds() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1049619932 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1049619932;
        // ---------- Original Method ----------
        //return true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:30.225 -0400", hash_original_method = "95969FB891958AA0335CF8E62A1ABF37", hash_generated_method = "7C47C9467E8004CE23A6E03F95B84370")
    @Override
    public int getItemViewType(int position) {
        {
            mHasReturnedViewTypeCount = true;
        } //End block
        Preference preference;
        preference = this.getItem(position);
        {
            boolean var19F6D64A36EFF1C69D8A34EB7BC97077_569296662 = (preference.hasSpecifiedLayout());
        } //End collapsed parenthetic
        mTempPreferenceLayout = createPreferenceLayout(preference, mTempPreferenceLayout);
        int viewType;
        viewType = Collections.binarySearch(mPreferenceLayouts, mTempPreferenceLayout);
        addTaint(position);
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1367921295 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1367921295;
        // ---------- Original Method ----------
        //if (!mHasReturnedViewTypeCount) {
            //mHasReturnedViewTypeCount = true;
        //}
        //final Preference preference = this.getItem(position);
        //if (preference.hasSpecifiedLayout()) {
            //return IGNORE_ITEM_VIEW_TYPE;
        //}
        //mTempPreferenceLayout = createPreferenceLayout(preference, mTempPreferenceLayout);
        //int viewType = Collections.binarySearch(mPreferenceLayouts, mTempPreferenceLayout);
        //if (viewType < 0) {
            //return IGNORE_ITEM_VIEW_TYPE;
        //} else {
            //return viewType;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:30.225 -0400", hash_original_method = "C26A2133E7F568EC0AF4EC87BB082A79", hash_generated_method = "D8FF89821F47AB919275F7303D843FB9")
    @Override
    public int getViewTypeCount() {
        {
            mHasReturnedViewTypeCount = true;
        } //End block
        int var2CB183217D2F693D68F15362DCAE0953_1077987509 = (Math.max(1, mPreferenceLayouts.size()));
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1536969779 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1536969779;
        // ---------- Original Method ----------
        //if (!mHasReturnedViewTypeCount) {
            //mHasReturnedViewTypeCount = true;
        //}
        //return Math.max(1, mPreferenceLayouts.size());
    }

    
    private static class PreferenceLayout implements Comparable<PreferenceLayout> {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:30.226 -0400", hash_original_field = "C0179AEDB850805806A31BDC39510289", hash_generated_field = "D57D54CAC1273148C7462B42AF5839E3")

        private int resId;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:30.227 -0400", hash_original_field = "2888237166571D1285BA13E4324E3AEE", hash_generated_field = "C72CD28C67C0D0B9F30E5D9DB8173BFF")

        private int widgetResId;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:30.227 -0400", hash_original_field = "B068931CC450442B63F5B3D276EA4297", hash_generated_field = "531F96E2AEBFB44CD229EC4CB1F012B0")

        private String name;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:30.227 -0400", hash_original_method = "12E8ADB8C3EE61AC77B7A82A93B07078", hash_generated_method = "12E8ADB8C3EE61AC77B7A82A93B07078")
        public PreferenceLayout ()
        {
            //Synthesized constructor
        }


        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:30.227 -0400", hash_original_method = "0A98309F64E867E673B1B3CFC2DB79CE", hash_generated_method = "ECD8E3F4AF963A505D87A84933B98B57")
        public int compareTo(PreferenceLayout other) {
            int compareNames;
            compareNames = name.compareTo(other.name);
            addTaint(other.getTaint());
            int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_296582456 = getTaintInt();
            return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_296582456;
            // ---------- Original Method ----------
            //int compareNames = name.compareTo(other.name);
            //if (compareNames == 0) {
                //if (resId == other.resId) {
                    //if (widgetResId == other.widgetResId) {
                        //return 0;
                    //} else {
                        //return widgetResId - other.widgetResId;
                    //}
                //} else {
                    //return resId - other.resId;
                //}
            //} else {
                //return compareNames;
            //}
        }

        
    }


    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:30.240 -0400", hash_original_field = "81DE64C3C34751C325BA93388532677A", hash_generated_field = "850AEBAEBD76F5FEB4AA561F9AE7785F")

    private static String TAG = "PreferenceGroupAdapter";
}

