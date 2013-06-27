package android.support.v4.app;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.util.DebugUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View.OnCreateContextMenuListener;
import android.view.animation.Animation;
import android.widget.AdapterView;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.HashMap;

final class FragmentState implements Parcelable {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.630 -0400", hash_original_field = "E0F3773C57D5A4C143336ECFEFDE9748", hash_generated_field = "6BC238A3BDD37BF1CAC26EA2CE45C508")

    String mClassName;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.630 -0400", hash_original_field = "DEC4E8A5D764B68C732DE242B685EABE", hash_generated_field = "3FE793BBC68255EAC5B3588E7DE2E2C6")

    int mIndex;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.630 -0400", hash_original_field = "D9B77340C245436344B0149264025068", hash_generated_field = "D21475690426FA39A7733914F0F3A95D")

    boolean mFromLayout;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.630 -0400", hash_original_field = "743B83D822DFF54AE7E24307CEF26F0C", hash_generated_field = "C628DB5A0351ABB6B2BC170D76A5FF43")

    int mFragmentId;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.630 -0400", hash_original_field = "A2C9A3DA927DBE9AB0FC8FD8C7B637D9", hash_generated_field = "2072CAADE2B3735D2B37FDBC10B7F08E")

    int mContainerId;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.631 -0400", hash_original_field = "07496860B5C53FDD66588727158D5F73", hash_generated_field = "05B32B05746742D3A5261C827E7D8852")

    String mTag;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.631 -0400", hash_original_field = "FC2473D51E767C5008A9D428BAFC8661", hash_generated_field = "907988FDE235BE080FDDB6DB36EF9C83")

    boolean mRetainInstance;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.631 -0400", hash_original_field = "23906763A9631E67BD7C67265695AFF7", hash_generated_field = "F0A7088DB55E87649B19609F5563F724")

    boolean mDetached;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.631 -0400", hash_original_field = "5867CE8CB088E58E6D17882F8EE91C5B", hash_generated_field = "BC54B63AEA85D845C1AC338D041E1ED5")

    Bundle mArguments;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.631 -0400", hash_original_field = "74933D8F8D085F6D27B373C3AD9FBBC4", hash_generated_field = "F958FB3998EC484A7599A988303CD216")

    Bundle mSavedFragmentState;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.631 -0400", hash_original_field = "DD62467EBA66E288A1769E403146FE2D", hash_generated_field = "F83F5A158F2251FA12452672DC97E470")

    Fragment mInstance;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.632 -0400", hash_original_method = "116485142A61C36D4B47DBE9BCB45890", hash_generated_method = "9C8B1F3AA1DA7C8FAE9B803347EE426A")
    public  FragmentState(Fragment frag) {
        mClassName = frag.getClass().getName();
        mIndex = frag.mIndex;
        mFromLayout = frag.mFromLayout;
        mFragmentId = frag.mFragmentId;
        mContainerId = frag.mContainerId;
        mTag = frag.mTag;
        mRetainInstance = frag.mRetainInstance;
        mDetached = frag.mDetached;
        mArguments = frag.mArguments;
        // ---------- Original Method ----------
        //mClassName = frag.getClass().getName();
        //mIndex = frag.mIndex;
        //mFromLayout = frag.mFromLayout;
        //mFragmentId = frag.mFragmentId;
        //mContainerId = frag.mContainerId;
        //mTag = frag.mTag;
        //mRetainInstance = frag.mRetainInstance;
        //mDetached = frag.mDetached;
        //mArguments = frag.mArguments;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.645 -0400", hash_original_method = "46F838C8877526D395D980C698E03728", hash_generated_method = "1AEC5D39B1C46172E66E2ADE1F21E5F6")
    public  FragmentState(Parcel in) {
        mClassName = in.readString();
        mIndex = in.readInt();
        mFromLayout = in.readInt() != 0;
        mFragmentId = in.readInt();
        mContainerId = in.readInt();
        mTag = in.readString();
        mRetainInstance = in.readInt() != 0;
        mDetached = in.readInt() != 0;
        mArguments = in.readBundle();
        mSavedFragmentState = in.readBundle();
        // ---------- Original Method ----------
        //mClassName = in.readString();
        //mIndex = in.readInt();
        //mFromLayout = in.readInt() != 0;
        //mFragmentId = in.readInt();
        //mContainerId = in.readInt();
        //mTag = in.readString();
        //mRetainInstance = in.readInt() != 0;
        //mDetached = in.readInt() != 0;
        //mArguments = in.readBundle();
        //mSavedFragmentState = in.readBundle();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.647 -0400", hash_original_method = "929295C14EE92A06097EEC5737CFE8E9", hash_generated_method = "D93AB8F0FA56CED73967EBC9D2297FEE")
    public Fragment instantiate(FragmentActivity activity, Fragment parent) {
        Fragment varB4EAC82CA7396A68D541C85D26508E83_339779570 = null; //Variable for return #1
        Fragment varB4EAC82CA7396A68D541C85D26508E83_149846805 = null; //Variable for return #2
        {
            varB4EAC82CA7396A68D541C85D26508E83_339779570 = mInstance;
        } //End block
        {
            mArguments.setClassLoader(activity.getClassLoader());
        } //End block
        mInstance = Fragment.instantiate(activity, mClassName, mArguments);
        {
            mSavedFragmentState.setClassLoader(activity.getClassLoader());
            mInstance.mSavedFragmentState = mSavedFragmentState;
        } //End block
        mInstance.setIndex(mIndex, parent);
        mInstance.mFromLayout = mFromLayout;
        mInstance.mRestored = true;
        mInstance.mFragmentId = mFragmentId;
        mInstance.mContainerId = mContainerId;
        mInstance.mTag = mTag;
        mInstance.mRetainInstance = mRetainInstance;
        mInstance.mDetached = mDetached;
        mInstance.mFragmentManager = activity.mFragments;
        varB4EAC82CA7396A68D541C85D26508E83_149846805 = mInstance;
        addTaint(parent.getTaint());
        Fragment varA7E53CE21691AB073D9660D615818899_56826890; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_56826890 = varB4EAC82CA7396A68D541C85D26508E83_339779570;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_56826890 = varB4EAC82CA7396A68D541C85D26508E83_149846805;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_56826890.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_56826890;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.647 -0400", hash_original_method = "00F8174F9E89D0C972FA6D3F19742382", hash_generated_method = "3089E8918F1E20D8BDFC58E6916412CD")
    public int describeContents() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1564498356 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1564498356;
        // ---------- Original Method ----------
        //return 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.661 -0400", hash_original_method = "5938F2E0A344A05A5347D3909CB444C6", hash_generated_method = "3F956FAB5615EA38678EDAD56B20ED1C")
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mClassName);
        dest.writeInt(mIndex);
        dest.writeInt(mFromLayout ? 1 : 0);
        dest.writeInt(mFragmentId);
        dest.writeInt(mContainerId);
        dest.writeString(mTag);
        dest.writeInt(mRetainInstance ? 1 : 0);
        dest.writeInt(mDetached ? 1 : 0);
        dest.writeBundle(mArguments);
        dest.writeBundle(mSavedFragmentState);
        addTaint(dest.getTaint());
        addTaint(flags);
        // ---------- Original Method ----------
        //dest.writeString(mClassName);
        //dest.writeInt(mIndex);
        //dest.writeInt(mFromLayout ? 1 : 0);
        //dest.writeInt(mFragmentId);
        //dest.writeInt(mContainerId);
        //dest.writeString(mTag);
        //dest.writeInt(mRetainInstance ? 1 : 0);
        //dest.writeInt(mDetached ? 1 : 0);
        //dest.writeBundle(mArguments);
        //dest.writeBundle(mSavedFragmentState);
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.661 -0400", hash_original_field = "20C24B13B86A2BA0167AA1764B64C330", hash_generated_field = "33682AAE42971F2215D5844A73451D2E")

    public static final Parcelable.Creator<FragmentState> CREATOR
            = new Parcelable.Creator<FragmentState>() {
        public FragmentState createFromParcel(Parcel in) {
            return new FragmentState(in);
        }
        
        public FragmentState[] newArray(int size) {
            return new FragmentState[size];
        }
    };
}

public class Fragment implements ComponentCallbacks, OnCreateContextMenuListener {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.672 -0400", hash_original_field = "F6222ECFC0F3B677015F93D1974DAF06", hash_generated_field = "0294DD5CAC8ED58250DA531156A3A018")

    int mState = INITIALIZING;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.672 -0400", hash_original_field = "BDE9D2B3E8C16F6173B11304E226AD48", hash_generated_field = "5A7CC416AE8E502EE87A452D06D4A6F4")

    View mAnimatingAway;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.672 -0400", hash_original_field = "8ED4FBC10C3DA2C5D7785F68532DB880", hash_generated_field = "AA12B8E459D536EFC9893454A513D5AA")

    int mStateAfterAnimating;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.673 -0400", hash_original_field = "74933D8F8D085F6D27B373C3AD9FBBC4", hash_generated_field = "F958FB3998EC484A7599A988303CD216")

    Bundle mSavedFragmentState;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.673 -0400", hash_original_field = "2B7B591D0427765FF0500D38736CF518", hash_generated_field = "03C65AC0399DBB932968B6C681CFC16A")

    SparseArray<Parcelable> mSavedViewState;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.673 -0400", hash_original_field = "DBDF7BB492A85A363C47FDDA34C5BB3E", hash_generated_field = "6B9186F1D8E9AA88F21C8B70F0B9BCC7")

    int mIndex = -1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.673 -0400", hash_original_field = "3908523F58561C99703A7559AB29724C", hash_generated_field = "7ECAB8F1DFD4D8C88111D51780B29562")

    String mWho;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.673 -0400", hash_original_field = "5867CE8CB088E58E6D17882F8EE91C5B", hash_generated_field = "BC54B63AEA85D845C1AC338D041E1ED5")

    Bundle mArguments;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.673 -0400", hash_original_field = "562619214306F5C11A815E975B7D2477", hash_generated_field = "14E7923C6D3468CDFB90940EBE370C56")

    Fragment mTarget;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.673 -0400", hash_original_field = "4FB974C217F7C6C42183BA9DEC8C9619", hash_generated_field = "B3D14A57A7194FB87F01321513F81187")

    int mTargetIndex = -1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.673 -0400", hash_original_field = "9D7EC7B2039084EAAB4A7123EC5C6A65", hash_generated_field = "41D013C95CABF9ED0796F94F0CF16BD1")

    int mTargetRequestCode;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.673 -0400", hash_original_field = "78AB6CD708941FB2B40AE8854D535F2D", hash_generated_field = "CE47E8E592EB95BEB04FBBE625E99A8D")

    boolean mAdded;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.673 -0400", hash_original_field = "0F910DB84DA919CEA0C46A9368EB474F", hash_generated_field = "5C009156D3400624CB1FFDF310ECAFF1")

    boolean mRemoving;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.673 -0400", hash_original_field = "9933B84C738DC45A33F44AE2EFCBD30F", hash_generated_field = "23D2434AD22548E124B62AB7739838E9")

    boolean mResumed;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.673 -0400", hash_original_field = "D9B77340C245436344B0149264025068", hash_generated_field = "D21475690426FA39A7733914F0F3A95D")

    boolean mFromLayout;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.673 -0400", hash_original_field = "02B7C51C439DA5E343271787FAA8C822", hash_generated_field = "C7463435817ABA85E5AF0081505BD656")

    boolean mInLayout;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.674 -0400", hash_original_field = "F6C00A288B07FAA85B83595F41C31C30", hash_generated_field = "83846FEEE5AB5B668E6D933F96FB7819")

    boolean mRestored;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.674 -0400", hash_original_field = "48F5E8D87678F372810B137CFF79CDEE", hash_generated_field = "6F8CF3ED6C0707B98B23B55A256300E6")

    int mBackStackNesting;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.674 -0400", hash_original_field = "7D2A9E7103D695106505452E5AB8F67C", hash_generated_field = "58A45AD5F2F241F335F9B1ED7D27DC02")

    FragmentManagerImpl mFragmentManager;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.674 -0400", hash_original_field = "C145D87741EB407D6B1FF715AD484119", hash_generated_field = "DC6970CAF75184DB6DB1AAC52EA720C0")

    FragmentActivity mActivity;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.674 -0400", hash_original_field = "16580FFD258A8A6FD12273C56DB3BF65", hash_generated_field = "AE50D4C4DA0E1D5FC77314F7EF03878D")

    FragmentManagerImpl mChildFragmentManager;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.674 -0400", hash_original_field = "B718B1EF16C11B894ED91B7026350839", hash_generated_field = "9348AE179085F33BE67C4C84253837E6")

    Fragment mParentFragment;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.674 -0400", hash_original_field = "743B83D822DFF54AE7E24307CEF26F0C", hash_generated_field = "C628DB5A0351ABB6B2BC170D76A5FF43")

    int mFragmentId;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.674 -0400", hash_original_field = "A2C9A3DA927DBE9AB0FC8FD8C7B637D9", hash_generated_field = "2072CAADE2B3735D2B37FDBC10B7F08E")

    int mContainerId;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.674 -0400", hash_original_field = "07496860B5C53FDD66588727158D5F73", hash_generated_field = "05B32B05746742D3A5261C827E7D8852")

    String mTag;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.674 -0400", hash_original_field = "6E5D0646172E31357AC5264CFC6DCF7B", hash_generated_field = "DB81C7417E8D5BB2C252FB40F8D91CF8")

    boolean mHidden;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.674 -0400", hash_original_field = "23906763A9631E67BD7C67265695AFF7", hash_generated_field = "F0A7088DB55E87649B19609F5563F724")

    boolean mDetached;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.674 -0400", hash_original_field = "FC2473D51E767C5008A9D428BAFC8661", hash_generated_field = "907988FDE235BE080FDDB6DB36EF9C83")

    boolean mRetainInstance;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.674 -0400", hash_original_field = "DD825820C327E7F8D7347744CB13973E", hash_generated_field = "9B9EA230363F2EF227C5BE272DCC6838")

    boolean mRetaining;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.674 -0400", hash_original_field = "92B6BF5926849D268C59A8018D7DCB99", hash_generated_field = "98F2E6991F3565378DE3223CDDF9DBEB")

    boolean mHasMenu;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.675 -0400", hash_original_field = "6E83E1BA32D4FE911AA4EE969D8C81B5", hash_generated_field = "91D8D4C712F4EB13688BF2F27B945286")

    boolean mMenuVisible = true;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.675 -0400", hash_original_field = "8F73DC27B0DCA8E7133AEF9B7DBDC6C6", hash_generated_field = "6971FF9C6126C288092CCC2A5964E550")

    boolean mCalled;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.675 -0400", hash_original_field = "B87B5DA5CC417CB9E4D2331FCCCAB736", hash_generated_field = "778908554529C0B97FC9B63E5B9208AD")

    int mNextAnim;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.675 -0400", hash_original_field = "C64165C1B15EB68FDC5E7135FFE5DF5B", hash_generated_field = "583453E78C87ED885A174C885F834BB6")

    ViewGroup mContainer;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.675 -0400", hash_original_field = "7D6C73188D7990FE5A4B99F8F090B9EA", hash_generated_field = "6F4F028D1DE9C463F753A80DD0991753")

    View mView;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.675 -0400", hash_original_field = "77F7C832CCC3D571F9FC590C7CFA715C", hash_generated_field = "02054D032013112C607BBD1766707DC1")

    View mInnerView;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.675 -0400", hash_original_field = "E8D35768AE7CD7313BEF15C635AC96D9", hash_generated_field = "A8819B0E70BA304D51F44F47380E8807")

    boolean mDeferStart;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.675 -0400", hash_original_field = "2BDAE98A0CD238891DE96CFCEED42070", hash_generated_field = "149FC5E47A37645F1FE824C1875916A8")

    boolean mUserVisibleHint = true;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.675 -0400", hash_original_field = "780418B081227A51BFCB9EC0223B15ED", hash_generated_field = "6EE478DF5473556475C8D09C185A01BC")

    LoaderManagerImpl mLoaderManager;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.675 -0400", hash_original_field = "7B94EB60C9B740E67FF099B167511F7B", hash_generated_field = "D357ECA56BF47F1751443279339D50DF")

    boolean mLoadersStarted;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.675 -0400", hash_original_field = "E2FDF9701AF8C008E54F63B95BC75C79", hash_generated_field = "93A369593E1CC22C7DE8D4D5C675B065")

    boolean mCheckedForLoaderManager;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.676 -0400", hash_original_method = "450DCF9C44ABD4359E904BF858920888", hash_generated_method = "AF7EF93C180462CAFE5DFDA53E9C7DDF")
    public  Fragment() {
        // ---------- Original Method ----------
    }

    
        public static Fragment instantiate(Context context, String fname) {
        return instantiate(context, fname, null);
    }

    
        public static Fragment instantiate(Context context, String fname, Bundle args) {
        try {
            Class<?> clazz = sClassMap.get(fname);
            if (clazz == null) {
                clazz = context.getClassLoader().loadClass(fname);
                sClassMap.put(fname, clazz);
            }
            Fragment f = (Fragment)clazz.newInstance();
            if (args != null) {
                args.setClassLoader(f.getClass().getClassLoader());
                f.mArguments = args;
            }
            return f;
        } catch (ClassNotFoundException e) {
            throw new InstantiationException("Unable to instantiate fragment " + fname
                    + ": make sure class name exists, is public, and has an"
                    + " empty constructor that is public", e);
        } catch (java.lang.InstantiationException e) {
            throw new InstantiationException("Unable to instantiate fragment " + fname
                    + ": make sure class name exists, is public, and has an"
                    + " empty constructor that is public", e);
        } catch (IllegalAccessException e) {
            throw new InstantiationException("Unable to instantiate fragment " + fname
                    + ": make sure class name exists, is public, and has an"
                    + " empty constructor that is public", e);
        }
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.695 -0400", hash_original_method = "245153A377A25A4032F77A4E144CB5DC", hash_generated_method = "536527893A8656B55D666018E47B3360")
    final void restoreViewState(Bundle savedInstanceState) {
        {
            mInnerView.restoreHierarchyState(mSavedViewState);
            mSavedViewState = null;
        } //End block
        mCalled = false;
        onViewStateRestored(savedInstanceState);
        {
            if (DroidSafeAndroidRuntime.control) throw new SuperNotCalledException("Fragment " + this
                    + " did not call through to super.onViewStateRestored()");
        } //End block
        addTaint(savedInstanceState.getTaint());
        // ---------- Original Method ----------
        //if (mSavedViewState != null) {
            //mInnerView.restoreHierarchyState(mSavedViewState);
            //mSavedViewState = null;
        //}
        //mCalled = false;
        //onViewStateRestored(savedInstanceState);
        //if (!mCalled) {
            //throw new SuperNotCalledException("Fragment " + this
                    //+ " did not call through to super.onViewStateRestored()");
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.696 -0400", hash_original_method = "57A747EE3041ECA2E14E3727F10963D8", hash_generated_method = "1D17DDC30F55072C5F4F15D7C7F7F0BD")
    final void setIndex(int index, Fragment parent) {
        mIndex = index;
        {
            mWho = parent.mWho + ":" + mIndex;
        } //End block
        {
            mWho = "android:fragment:" + mIndex;
        } //End block
        // ---------- Original Method ----------
        //mIndex = index;
        //if (parent != null) {
            //mWho = parent.mWho + ":" + mIndex;
        //} else {
            //mWho = "android:fragment:" + mIndex;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.696 -0400", hash_original_method = "B0D28796550366EF842F99A3D9D59C11", hash_generated_method = "F656B033948ED2B04DB64E1062867F54")
    final boolean isInBackStack() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1809410095 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1809410095;
        // ---------- Original Method ----------
        //return mBackStackNesting > 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.696 -0400", hash_original_method = "055C1CABEC6B90DB231CF8138F07B9C1", hash_generated_method = "64F4880CADA9BED94B8250D7B466C386")
    @Override
    final public boolean equals(Object o) {
        boolean var3B9F582BFED1483DB479DB197565FAB5_923858647 = (super.equals(o));
        addTaint(o.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1925579289 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1925579289;
        // ---------- Original Method ----------
        //return super.equals(o);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.697 -0400", hash_original_method = "BBCDAD7BF06FB621822DBBAD11355700", hash_generated_method = "9C40FD4656BDAC95D4917D436131FFCF")
    @Override
    final public int hashCode() {
        int varC489EB7FF487A920847CC016ED55AE09_522549198 = (super.hashCode());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1373053215 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1373053215;
        // ---------- Original Method ----------
        //return super.hashCode();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.698 -0400", hash_original_method = "5350708001683FB5244A4F612B80A27C", hash_generated_method = "7441DF908EE03A2B0894282451EE8082")
    @Override
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_1425540432 = null; //Variable for return #1
        StringBuilder sb;
        sb = new StringBuilder(128);
        DebugUtils.buildShortClassTag(this, sb);
        {
            sb.append(" #");
            sb.append(mIndex);
        } //End block
        {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(mFragmentId));
        } //End block
        {
            sb.append(" ");
            sb.append(mTag);
        } //End block
        sb.append('}');
        varB4EAC82CA7396A68D541C85D26508E83_1425540432 = sb.toString();
        varB4EAC82CA7396A68D541C85D26508E83_1425540432.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1425540432;
        // ---------- Original Method ----------
        //StringBuilder sb = new StringBuilder(128);
        //DebugUtils.buildShortClassTag(this, sb);
        //if (mIndex >= 0) {
            //sb.append(" #");
            //sb.append(mIndex);
        //}
        //if (mFragmentId != 0) {
            //sb.append(" id=0x");
            //sb.append(Integer.toHexString(mFragmentId));
        //}
        //if (mTag != null) {
            //sb.append(" ");
            //sb.append(mTag);
        //}
        //sb.append('}');
        //return sb.toString();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.708 -0400", hash_original_method = "0D814DEC27C2F0AC661487D8C7B38979", hash_generated_method = "E2194A26066C60805D0B5251C8A41285")
    final public int getId() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_287375994 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_287375994;
        // ---------- Original Method ----------
        //return mFragmentId;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.708 -0400", hash_original_method = "ED26754F6A82B43F30EAE698B7941323", hash_generated_method = "8009507B5422D94256A62BDA3826B2B6")
    final public String getTag() {
        String varB4EAC82CA7396A68D541C85D26508E83_229697332 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_229697332 = mTag;
        varB4EAC82CA7396A68D541C85D26508E83_229697332.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_229697332;
        // ---------- Original Method ----------
        //return mTag;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.709 -0400", hash_original_method = "2D5CF4DC8DE7FCC73C8073BFA7412800", hash_generated_method = "1ED4BAF5C87366E8B439A343DBC39644")
    public void setArguments(Bundle args) {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalStateException("Fragment already active");
        } //End block
        mArguments = args;
        // ---------- Original Method ----------
        //if (mIndex >= 0) {
            //throw new IllegalStateException("Fragment already active");
        //}
        //mArguments = args;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.713 -0400", hash_original_method = "AD916C2ECBF1A5C9327A86449330505D", hash_generated_method = "8787CCFF94CA0CFAB5732D1D4E2520EA")
    final public Bundle getArguments() {
        Bundle varB4EAC82CA7396A68D541C85D26508E83_2016233515 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_2016233515 = mArguments;
        varB4EAC82CA7396A68D541C85D26508E83_2016233515.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_2016233515;
        // ---------- Original Method ----------
        //return mArguments;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.713 -0400", hash_original_method = "D968C46759760C7406AC68A668D9806D", hash_generated_method = "F0337EA9BD20EA06BB854A3FCF019A9D")
    public void setInitialSavedState(SavedState state) {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalStateException("Fragment already active");
        } //End block
        mSavedFragmentState = state != null && state.mState != null
                ? state.mState : null;
        // ---------- Original Method ----------
        //if (mIndex >= 0) {
            //throw new IllegalStateException("Fragment already active");
        //}
        //mSavedFragmentState = state != null && state.mState != null
                //? state.mState : null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.714 -0400", hash_original_method = "1E1EC1C5F204666846AC7A8EC55494F6", hash_generated_method = "A9E9A3E67F9FE2F0071A3B399678868D")
    public void setTargetFragment(Fragment fragment, int requestCode) {
        mTarget = fragment;
        mTargetRequestCode = requestCode;
        // ---------- Original Method ----------
        //mTarget = fragment;
        //mTargetRequestCode = requestCode;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.715 -0400", hash_original_method = "CBC4FCF13CA2895C8D01438D1D6F6EE8", hash_generated_method = "6497C82C8C2515D25F148036A282C68F")
    final public Fragment getTargetFragment() {
        Fragment varB4EAC82CA7396A68D541C85D26508E83_1202406726 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1202406726 = mTarget;
        varB4EAC82CA7396A68D541C85D26508E83_1202406726.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1202406726;
        // ---------- Original Method ----------
        //return mTarget;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.729 -0400", hash_original_method = "A4CEFC2C477EE57B614F4504E74127CE", hash_generated_method = "337978B5BFF7CB3ACE38E68DE1F5A5FD")
    final public int getTargetRequestCode() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1978858476 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1978858476;
        // ---------- Original Method ----------
        //return mTargetRequestCode;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.730 -0400", hash_original_method = "A48A2A81AB5F981679BE8C3496B55E59", hash_generated_method = "1EBBB7469E0EF8309F89161765E50B83")
    final public FragmentActivity getActivity() {
        FragmentActivity varB4EAC82CA7396A68D541C85D26508E83_1059628319 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1059628319 = mActivity;
        varB4EAC82CA7396A68D541C85D26508E83_1059628319.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1059628319;
        // ---------- Original Method ----------
        //return mActivity;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.731 -0400", hash_original_method = "A8E18DB36BC334E1CF5901C727187C18", hash_generated_method = "D83D687D08B743F2E1357C6C9B787586")
    final public Resources getResources() {
        Resources varB4EAC82CA7396A68D541C85D26508E83_682045565 = null; //Variable for return #1
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_682045565 = mActivity.getResources();
        varB4EAC82CA7396A68D541C85D26508E83_682045565.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_682045565;
        // ---------- Original Method ----------
        //if (mActivity == null) {
            //throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        //}
        //return mActivity.getResources();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.847 -0400", hash_original_method = "3F649A13E84C6501035126B3FEE231F4", hash_generated_method = "D5247386B158769127D773D6768B02DA")
    public final CharSequence getText(int resId) {
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_2121059849 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_2121059849 = getResources().getText(resId);
        addTaint(resId);
        varB4EAC82CA7396A68D541C85D26508E83_2121059849.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_2121059849;
        // ---------- Original Method ----------
        //return getResources().getText(resId);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.848 -0400", hash_original_method = "6096F9B7D678CAFA7D67C1784ABCB9A7", hash_generated_method = "8E479EB65F95C00185223C3937A78CC0")
    public final String getString(int resId) {
        String varB4EAC82CA7396A68D541C85D26508E83_1538294584 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1538294584 = getResources().getString(resId);
        addTaint(resId);
        varB4EAC82CA7396A68D541C85D26508E83_1538294584.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1538294584;
        // ---------- Original Method ----------
        //return getResources().getString(resId);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.849 -0400", hash_original_method = "524F00C5C13CBD3BD0D5C512A4C12294", hash_generated_method = "CAA4ABE5277891FF848F0A2451F49379")
    public final String getString(int resId, Object... formatArgs) {
        String varB4EAC82CA7396A68D541C85D26508E83_304833064 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_304833064 = getResources().getString(resId, formatArgs);
        addTaint(resId);
        addTaint(formatArgs[0].getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_304833064.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_304833064;
        // ---------- Original Method ----------
        //return getResources().getString(resId, formatArgs);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.849 -0400", hash_original_method = "ED1BD18F392C2062694622C1FF4A3A44", hash_generated_method = "147880681FBAF9DF4306B70C6CD18C84")
    final public FragmentManager getFragmentManager() {
        FragmentManager varB4EAC82CA7396A68D541C85D26508E83_1479388002 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1479388002 = mFragmentManager;
        varB4EAC82CA7396A68D541C85D26508E83_1479388002.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1479388002;
        // ---------- Original Method ----------
        //return mFragmentManager;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.850 -0400", hash_original_method = "CC97C175240EBBDE3DE45127B977288B", hash_generated_method = "CDC3F238566F23D57AFEF5A070D38156")
    final public FragmentManager getChildFragmentManager() {
        FragmentManager varB4EAC82CA7396A68D541C85D26508E83_1405696557 = null; //Variable for return #1
        {
            instantiateChildFragmentManager();
            {
                mChildFragmentManager.dispatchResume();
            } //End block
            {
                mChildFragmentManager.dispatchStart();
            } //End block
            {
                mChildFragmentManager.dispatchActivityCreated();
            } //End block
            {
                mChildFragmentManager.dispatchCreate();
            } //End block
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1405696557 = mChildFragmentManager;
        varB4EAC82CA7396A68D541C85D26508E83_1405696557.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1405696557;
        // ---------- Original Method ----------
        //if (mChildFragmentManager == null) {
            //instantiateChildFragmentManager();
            //if (mState >= RESUMED) {
                //mChildFragmentManager.dispatchResume();
            //} else if (mState >= STARTED) {
                //mChildFragmentManager.dispatchStart();
            //} else if (mState >= ACTIVITY_CREATED) {
                //mChildFragmentManager.dispatchActivityCreated();
            //} else if (mState >= CREATED) {
                //mChildFragmentManager.dispatchCreate();
            //}
        //}
        //return mChildFragmentManager;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.851 -0400", hash_original_method = "B31DB62F63300A3D3A62AFCA68722969", hash_generated_method = "BAABE2EF39BFF4D966AD450CC46B9A44")
    final public Fragment getParentFragment() {
        Fragment varB4EAC82CA7396A68D541C85D26508E83_1085020 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1085020 = mParentFragment;
        varB4EAC82CA7396A68D541C85D26508E83_1085020.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1085020;
        // ---------- Original Method ----------
        //return mParentFragment;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.851 -0400", hash_original_method = "C0D74F5DDFD9A01C19E54F3379BA7652", hash_generated_method = "7FF2401588EB93391EECC0A2D9D1D33A")
    final public boolean isAdded() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1125538206 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1125538206;
        // ---------- Original Method ----------
        //return mActivity != null && mAdded;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.852 -0400", hash_original_method = "2F8509F8C4A8638224A8FC9748BC6275", hash_generated_method = "1B2A5D6ADD4F5B18EEC16BFB600750D1")
    final public boolean isDetached() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1912275996 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1912275996;
        // ---------- Original Method ----------
        //return mDetached;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.852 -0400", hash_original_method = "914BD43FF0612F84BA345FA6F486595C", hash_generated_method = "7D30AF9454D6F5DE722EF1937BF36E66")
    final public boolean isRemoving() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_534543814 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_534543814;
        // ---------- Original Method ----------
        //return mRemoving;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.852 -0400", hash_original_method = "3C6E7329283D3C6C46FB3F90EF65A4A7", hash_generated_method = "4E28BB37B6EF19544A1E58CC69C75499")
    final public boolean isInLayout() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2082918596 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2082918596;
        // ---------- Original Method ----------
        //return mInLayout;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.853 -0400", hash_original_method = "58811A32FF0FF231CA3DA7AD72F98B09", hash_generated_method = "BADFC422353991AAF39A99E275604B40")
    final public boolean isResumed() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_915995562 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_915995562;
        // ---------- Original Method ----------
        //return mResumed;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.853 -0400", hash_original_method = "72982976B71B01DF2412198462460DF0", hash_generated_method = "E643484B37950C45071C21D19F9CE1A7")
    final public boolean isVisible() {
        boolean var643645FADE5E75870E219C4E3A66DBAE_263473212 = (isAdded() && !isHidden() && mView != null
                && mView.getWindowToken() != null && mView.getVisibility() == View.VISIBLE);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1378768550 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1378768550;
        // ---------- Original Method ----------
        //return isAdded() && !isHidden() && mView != null
                //&& mView.getWindowToken() != null && mView.getVisibility() == View.VISIBLE;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.853 -0400", hash_original_method = "E04FD968639295CCE5F791161EDE4496", hash_generated_method = "00EEE3F6CED7BAB41402EB9629AC3C1E")
    final public boolean isHidden() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_308164579 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_308164579;
        // ---------- Original Method ----------
        //return mHidden;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.866 -0400", hash_original_method = "FE8A5DF015D2662392185902D9D0AEDD", hash_generated_method = "764071413F7B945096A2936EA3340233")
    public void onHiddenChanged(boolean hidden) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(hidden);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.867 -0400", hash_original_method = "DD8E6A20AB766DE2DFF904C4C63DFDE5", hash_generated_method = "B609BAEF1B936256B05D620F42F6AFE5")
    public void setRetainInstance(boolean retain) {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalStateException(
                    "Can't retain fragements that are nested in other fragments");
        } //End block
        mRetainInstance = retain;
        // ---------- Original Method ----------
        //if (retain && mParentFragment != null) {
            //throw new IllegalStateException(
                    //"Can't retain fragements that are nested in other fragments");
        //}
        //mRetainInstance = retain;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.870 -0400", hash_original_method = "82A17104D5864E2285E97283523AA6C5", hash_generated_method = "8ECE4029C50003E6FE7397C5739B869B")
    final public boolean getRetainInstance() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_506662135 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_506662135;
        // ---------- Original Method ----------
        //return mRetainInstance;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.880 -0400", hash_original_method = "8AC8C0F5EC4C557D4FB057E17EB98486", hash_generated_method = "E76EAE3423DA6B042031D32B403459E3")
    public void setHasOptionsMenu(boolean hasMenu) {
        {
            mHasMenu = hasMenu;
            {
                boolean var6410BF1E9EE91D719771624EE688382C_1371490002 = (isAdded() && !isHidden());
                {
                    mActivity.supportInvalidateOptionsMenu();
                } //End block
            } //End collapsed parenthetic
        } //End block
        // ---------- Original Method ----------
        //if (mHasMenu != hasMenu) {
            //mHasMenu = hasMenu;
            //if (isAdded() && !isHidden()) {
                //mActivity.supportInvalidateOptionsMenu();
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.881 -0400", hash_original_method = "356D4C9378C3D90FECF449857449A450", hash_generated_method = "962D8D61215ABA4ABDB8C5BC37496859")
    public void setMenuVisibility(boolean menuVisible) {
        {
            mMenuVisible = menuVisible;
            {
                boolean var63EEDD19FAB3C7E50D3EC385E85195BC_1198246203 = (mHasMenu && isAdded() && !isHidden());
                {
                    mActivity.supportInvalidateOptionsMenu();
                } //End block
            } //End collapsed parenthetic
        } //End block
        // ---------- Original Method ----------
        //if (mMenuVisible != menuVisible) {
            //mMenuVisible = menuVisible;
            //if (mHasMenu && isAdded() && !isHidden()) {
                //mActivity.supportInvalidateOptionsMenu();
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.884 -0400", hash_original_method = "1B0128696FF26E02ABF181CBEC60E7DF", hash_generated_method = "6FDEB47DFBFCCF8C09B690FDC4838CA5")
    public void setUserVisibleHint(boolean isVisibleToUser) {
        {
            mFragmentManager.performPendingDeferredStart(this);
        } //End block
        mUserVisibleHint = isVisibleToUser;
        mDeferStart = !isVisibleToUser;
        // ---------- Original Method ----------
        //if (!mUserVisibleHint && isVisibleToUser && mState < STARTED) {
            //mFragmentManager.performPendingDeferredStart(this);
        //}
        //mUserVisibleHint = isVisibleToUser;
        //mDeferStart = !isVisibleToUser;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.888 -0400", hash_original_method = "16570E728AF342CDACA5E18099682804", hash_generated_method = "C2B1D8936CBE1B3DED91092BA95B6724")
    public boolean getUserVisibleHint() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2141727760 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2141727760;
        // ---------- Original Method ----------
        //return mUserVisibleHint;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.894 -0400", hash_original_method = "F00ECADA9A0E38D0B8B713B009F5D3F7", hash_generated_method = "676F26CEE0A76C51780163973391A107")
    public LoaderManager getLoaderManager() {
        LoaderManager varB4EAC82CA7396A68D541C85D26508E83_1698980105 = null; //Variable for return #1
        LoaderManager varB4EAC82CA7396A68D541C85D26508E83_164007934 = null; //Variable for return #2
        {
            varB4EAC82CA7396A68D541C85D26508E83_1698980105 = mLoaderManager;
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        } //End block
        mCheckedForLoaderManager = true;
        mLoaderManager = mActivity.getLoaderManager(mWho, mLoadersStarted, true);
        varB4EAC82CA7396A68D541C85D26508E83_164007934 = mLoaderManager;
        LoaderManager varA7E53CE21691AB073D9660D615818899_917225139; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_917225139 = varB4EAC82CA7396A68D541C85D26508E83_1698980105;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_917225139 = varB4EAC82CA7396A68D541C85D26508E83_164007934;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_917225139.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_917225139;
        // ---------- Original Method ----------
        //if (mLoaderManager != null) {
            //return mLoaderManager;
        //}
        //if (mActivity == null) {
            //throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        //}
        //mCheckedForLoaderManager = true;
        //mLoaderManager = mActivity.getLoaderManager(mWho, mLoadersStarted, true);
        //return mLoaderManager;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.894 -0400", hash_original_method = "B68B30EDC5AB3BE8EF657FB7051C7F7E", hash_generated_method = "034AFFA898CD52B33567D6F4ACA58FB1")
    public void startActivity(Intent intent) {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        } //End block
        mActivity.startActivityFromFragment(this, intent, -1);
        addTaint(intent.getTaint());
        // ---------- Original Method ----------
        //if (mActivity == null) {
            //throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        //}
        //mActivity.startActivityFromFragment(this, intent, -1);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.894 -0400", hash_original_method = "849399EB62F8B6EE6A6E550D7989B87C", hash_generated_method = "FA0152001483243EABA7E04774885D8D")
    public void startActivityForResult(Intent intent, int requestCode) {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        } //End block
        mActivity.startActivityFromFragment(this, intent, requestCode);
        addTaint(intent.getTaint());
        addTaint(requestCode);
        // ---------- Original Method ----------
        //if (mActivity == null) {
            //throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        //}
        //mActivity.startActivityFromFragment(this, intent, requestCode);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.895 -0400", hash_original_method = "6D8F676326F7C192A2903AC6F4C36AC9", hash_generated_method = "13FACCD4A154E6B91F08CDAC9AEA6EFF")
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(requestCode);
        addTaint(resultCode);
        addTaint(data.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.899 -0400", hash_original_method = "8FF008E86C71DF2CF57F1B9E3E9D8CD9", hash_generated_method = "78935F59AB007F3CC31EEC481162F6FB")
    public LayoutInflater getLayoutInflater(Bundle savedInstanceState) {
        LayoutInflater varB4EAC82CA7396A68D541C85D26508E83_1257142135 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1257142135 = mActivity.getLayoutInflater();
        addTaint(savedInstanceState.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1257142135.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1257142135;
        // ---------- Original Method ----------
        //return mActivity.getLayoutInflater();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.899 -0400", hash_original_method = "6B431F4170E83AA9D07B8C377544B225", hash_generated_method = "9DA4C20C8A19E611A8973863DB823C49")
    public void onInflate(Activity activity, AttributeSet attrs, Bundle savedInstanceState) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        mCalled = true;
        addTaint(activity.getTaint());
        addTaint(attrs.getTaint());
        addTaint(savedInstanceState.getTaint());
        // ---------- Original Method ----------
        //mCalled = true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.900 -0400", hash_original_method = "7FCB8118913FF635CB1CDE717E61023E", hash_generated_method = "8D44122C10CCAD99B6B0F3E7B51550CD")
    public void onAttach(Activity activity) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        mCalled = true;
        addTaint(activity.getTaint());
        // ---------- Original Method ----------
        //mCalled = true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.900 -0400", hash_original_method = "273C1CEA731372543F92C5C1B99E7FBF", hash_generated_method = "2CAA6BF2932B5F500132B7972487AE88")
    public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        Animation varB4EAC82CA7396A68D541C85D26508E83_502666183 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_502666183 = null;
        addTaint(transit);
        addTaint(enter);
        addTaint(nextAnim);
        varB4EAC82CA7396A68D541C85D26508E83_502666183.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_502666183;
        // ---------- Original Method ----------
        //return null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.924 -0400", hash_original_method = "00494AECA41C1730DF6E82548FC2C3D5", hash_generated_method = "A703DECD1A13E142CAFC14CA278F8464")
    public void onCreate(Bundle savedInstanceState) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        mCalled = true;
        addTaint(savedInstanceState.getTaint());
        // ---------- Original Method ----------
        //mCalled = true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.925 -0400", hash_original_method = "57C338AB393ED440CE12C76B2627A085", hash_generated_method = "2FE0576BFAAA344BE1CCC241E537600C")
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        View varB4EAC82CA7396A68D541C85D26508E83_1575672196 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1575672196 = null;
        addTaint(inflater.getTaint());
        addTaint(container.getTaint());
        addTaint(savedInstanceState.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1575672196.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1575672196;
        // ---------- Original Method ----------
        //return null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.926 -0400", hash_original_method = "F4318A499F9B06ABC9CCF0644AE6DC10", hash_generated_method = "0AC185C4D1405DA07D13BEEEF3A63E65")
    public void onViewCreated(View view, Bundle savedInstanceState) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(view.getTaint());
        addTaint(savedInstanceState.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.926 -0400", hash_original_method = "23562CAF30DEA91689886E5D0DFB3D0F", hash_generated_method = "7789101EE9BE5F7F0E22F03DFD1EBB02")
    public View getView() {
        View varB4EAC82CA7396A68D541C85D26508E83_24270093 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_24270093 = mView;
        varB4EAC82CA7396A68D541C85D26508E83_24270093.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_24270093;
        // ---------- Original Method ----------
        //return mView;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.929 -0400", hash_original_method = "C52625884C98429BE8DE42F4FBFE7367", hash_generated_method = "7167642356FF710749355DABB699B2F5")
    public void onActivityCreated(Bundle savedInstanceState) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        mCalled = true;
        addTaint(savedInstanceState.getTaint());
        // ---------- Original Method ----------
        //mCalled = true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.930 -0400", hash_original_method = "01C4E5BCA343F9B21B52342AACDB7055", hash_generated_method = "89724E38A912BE849724EECB293ACDC9")
    public void onViewStateRestored(Bundle savedInstanceState) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        mCalled = true;
        addTaint(savedInstanceState.getTaint());
        // ---------- Original Method ----------
        //mCalled = true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.931 -0400", hash_original_method = "EDAB2E7FCE4E0A13012A045AB5CD29D5", hash_generated_method = "8E60C60FEE8764EDA2458ADD05B31E92")
    public void onStart() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        mCalled = true;
        {
            mLoadersStarted = true;
            {
                mCheckedForLoaderManager = true;
                mLoaderManager = mActivity.getLoaderManager(mWho, mLoadersStarted, false);
            } //End block
            {
                mLoaderManager.doStart();
            } //End block
        } //End block
        // ---------- Original Method ----------
        //mCalled = true;
        //if (!mLoadersStarted) {
            //mLoadersStarted = true;
            //if (!mCheckedForLoaderManager) {
                //mCheckedForLoaderManager = true;
                //mLoaderManager = mActivity.getLoaderManager(mWho, mLoadersStarted, false);
            //}
            //if (mLoaderManager != null) {
                //mLoaderManager.doStart();
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.931 -0400", hash_original_method = "3B8608ED59C2663D271D57F8D8F534C0", hash_generated_method = "A35C9648644440B1AB73336CCB6DEAB5")
    public void onResume() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        mCalled = true;
        // ---------- Original Method ----------
        //mCalled = true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.931 -0400", hash_original_method = "9C4F98F3F5A4FCEFF66E261EDA5693F3", hash_generated_method = "AD15648AB8B6357D84B3060587BAA98F")
    public void onSaveInstanceState(Bundle outState) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(outState.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.942 -0400", hash_original_method = "16A05561D5415124B893EA7E2AFB953D", hash_generated_method = "F6F68BCCFBFEF8D06BF8C744D4370BE8")
    public void onConfigurationChanged(Configuration newConfig) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        mCalled = true;
        addTaint(newConfig.getTaint());
        // ---------- Original Method ----------
        //mCalled = true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.943 -0400", hash_original_method = "CEF2FF1DA31E7EE9D761807A037B37B2", hash_generated_method = "637684B70754E8D79E076DC6A513E031")
    public void onPause() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        mCalled = true;
        // ---------- Original Method ----------
        //mCalled = true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.943 -0400", hash_original_method = "FC062A9ECA017F6E5D455E8C973942F9", hash_generated_method = "7E26AAA6FA11DEDE75C340853A5FC7A3")
    public void onStop() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        mCalled = true;
        // ---------- Original Method ----------
        //mCalled = true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.948 -0400", hash_original_method = "28328842E1AEC7ECF313405184622A29", hash_generated_method = "A607A7A5A4E7888F4F9DD46B7BE5C1AF")
    public void onLowMemory() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        mCalled = true;
        // ---------- Original Method ----------
        //mCalled = true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.948 -0400", hash_original_method = "E54F17C7BAFD082A48D2152349C1815A", hash_generated_method = "D6DBBF3121DDE73B3DDC3BCBF558AE8E")
    public void onDestroyView() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        mCalled = true;
        // ---------- Original Method ----------
        //mCalled = true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.952 -0400", hash_original_method = "FBD8F2B4105FF1952BBC9E4FBE11F6B2", hash_generated_method = "5C724FDB233E5FE07CB5E0C6677110F6")
    public void onDestroy() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        mCalled = true;
        {
            mCheckedForLoaderManager = true;
            mLoaderManager = mActivity.getLoaderManager(mWho, mLoadersStarted, false);
        } //End block
        {
            mLoaderManager.doDestroy();
        } //End block
        // ---------- Original Method ----------
        //mCalled = true;
        //if (!mCheckedForLoaderManager) {
            //mCheckedForLoaderManager = true;
            //mLoaderManager = mActivity.getLoaderManager(mWho, mLoadersStarted, false);
        //}
        //if (mLoaderManager != null) {
            //mLoaderManager.doDestroy();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.967 -0400", hash_original_method = "04633BF5293F80973E1AA355DB2C35EF", hash_generated_method = "4C027456133F87915A9EF12926708CE0")
     void initState() {
        mIndex = -1;
        mWho = null;
        mAdded = false;
        mRemoving = false;
        mResumed = false;
        mFromLayout = false;
        mInLayout = false;
        mRestored = false;
        mBackStackNesting = 0;
        mFragmentManager = null;
        mActivity = null;
        mFragmentId = 0;
        mContainerId = 0;
        mTag = null;
        mHidden = false;
        mDetached = false;
        mRetaining = false;
        mLoaderManager = null;
        mLoadersStarted = false;
        mCheckedForLoaderManager = false;
        // ---------- Original Method ----------
        //mIndex = -1;
        //mWho = null;
        //mAdded = false;
        //mRemoving = false;
        //mResumed = false;
        //mFromLayout = false;
        //mInLayout = false;
        //mRestored = false;
        //mBackStackNesting = 0;
        //mFragmentManager = null;
        //mActivity = null;
        //mFragmentId = 0;
        //mContainerId = 0;
        //mTag = null;
        //mHidden = false;
        //mDetached = false;
        //mRetaining = false;
        //mLoaderManager = null;
        //mLoadersStarted = false;
        //mCheckedForLoaderManager = false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.968 -0400", hash_original_method = "EF609D2FD1394DFBC19807CB21AD7D10", hash_generated_method = "CD3AD86EF54BB27DA72F7E9F9B9DEA15")
    public void onDetach() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        mCalled = true;
        // ---------- Original Method ----------
        //mCalled = true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.968 -0400", hash_original_method = "B3C5F3D019B47C47E6111F1C7C38CA5D", hash_generated_method = "A2AC01879561E76B9598F6018B2688B1")
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(menu.getTaint());
        addTaint(inflater.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.968 -0400", hash_original_method = "4CE703F4C1FA6FC474411DFE6A3F5275", hash_generated_method = "32B650DEFAD74BF60D957C3D22EC9F79")
    public void onPrepareOptionsMenu(Menu menu) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(menu.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.978 -0400", hash_original_method = "0E8C037F224061747BFFD0611606AAB6", hash_generated_method = "EF044D3D33EBB476DBBCFB32576782C1")
    public void onDestroyOptionsMenu() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.978 -0400", hash_original_method = "8EF9A1828892EFEBF4B93362A866125C", hash_generated_method = "5A239101024278098B1FE56387794F3F")
    public boolean onOptionsItemSelected(MenuItem item) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(item.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1707119416 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1707119416;
        // ---------- Original Method ----------
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.978 -0400", hash_original_method = "D53E4189B6E7F0EC0F9883E9844F2140", hash_generated_method = "CC9F879215C8D6911F3F43FE45124EF9")
    public void onOptionsMenuClosed(Menu menu) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(menu.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.979 -0400", hash_original_method = "68082EA0714CB57B78AC95D3FF2A7AC8", hash_generated_method = "B68B5B7B29E7468FD3122292CC31611A")
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        getActivity().onCreateContextMenu(menu, v, menuInfo);
        addTaint(menu.getTaint());
        addTaint(v.getTaint());
        addTaint(menuInfo.getTaint());
        // ---------- Original Method ----------
        //getActivity().onCreateContextMenu(menu, v, menuInfo);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.979 -0400", hash_original_method = "1A123249F7C2C892EA53E2F44D60C1FB", hash_generated_method = "0FEECD9EF1102B65D35844FDFD151864")
    public void registerForContextMenu(View view) {
        //DSFIXME: CODE0010: Possible callback registration function detected
        view.setOnCreateContextMenuListener(this);
        addTaint(view.getTaint());
        // ---------- Original Method ----------
        //view.setOnCreateContextMenuListener(this);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.980 -0400", hash_original_method = "6A7E2B106BB1CEE7C3B668A773DE5A5B", hash_generated_method = "344591114B98358744F7FCF1C426D7AD")
    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
        addTaint(view.getTaint());
        // ---------- Original Method ----------
        //view.setOnCreateContextMenuListener(null);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.980 -0400", hash_original_method = "801D77DFDCCE5570587CA592634E3D3B", hash_generated_method = "DA6F2008F8C044C3919D5EE0D3A7FE9E")
    public boolean onContextItemSelected(MenuItem item) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(item.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_478825053 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_478825053;
        // ---------- Original Method ----------
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:32.990 -0400", hash_original_method = "4506E0F094FC2CBE2D517E6D81344EC6", hash_generated_method = "F030835EA25D27D80D17DE3F33D93CAC")
    public void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        writer.print(prefix);
        writer.print("mFragmentId=#");
        writer.print(Integer.toHexString(mFragmentId));
        writer.print(" mContainerId=#");
        writer.print(Integer.toHexString(mContainerId));
        writer.print(" mTag=");
        writer.println(mTag);
        writer.print(prefix);
        writer.print("mState=");
        writer.print(mState);
        writer.print(" mIndex=");
        writer.print(mIndex);
        writer.print(" mWho=");
        writer.print(mWho);
        writer.print(" mBackStackNesting=");
        writer.println(mBackStackNesting);
        writer.print(prefix);
        writer.print("mAdded=");
        writer.print(mAdded);
        writer.print(" mRemoving=");
        writer.print(mRemoving);
        writer.print(" mResumed=");
        writer.print(mResumed);
        writer.print(" mFromLayout=");
        writer.print(mFromLayout);
        writer.print(" mInLayout=");
        writer.println(mInLayout);
        writer.print(prefix);
        writer.print("mHidden=");
        writer.print(mHidden);
        writer.print(" mDetached=");
        writer.print(mDetached);
        writer.print(" mMenuVisible=");
        writer.print(mMenuVisible);
        writer.print(" mHasMenu=");
        writer.println(mHasMenu);
        writer.print(prefix);
        writer.print("mRetainInstance=");
        writer.print(mRetainInstance);
        writer.print(" mRetaining=");
        writer.print(mRetaining);
        writer.print(" mUserVisibleHint=");
        writer.println(mUserVisibleHint);
        {
            writer.print(prefix);
            writer.print("mFragmentManager=");
            writer.println(mFragmentManager);
        } //End block
        {
            writer.print(prefix);
            writer.print("mActivity=");
            writer.println(mActivity);
        } //End block
        {
            writer.print(prefix);
            writer.print("mParentFragment=");
            writer.println(mParentFragment);
        } //End block
        {
            writer.print(prefix);
            writer.print("mArguments=");
            writer.println(mArguments);
        } //End block
        {
            writer.print(prefix);
            writer.print("mSavedFragmentState=");
            writer.println(mSavedFragmentState);
        } //End block
        {
            writer.print(prefix);
            writer.print("mSavedViewState=");
            writer.println(mSavedViewState);
        } //End block
        {
            writer.print(prefix);
            writer.print("mTarget=");
            writer.print(mTarget);
            writer.print(" mTargetRequestCode=");
            writer.println(mTargetRequestCode);
        } //End block
        {
            writer.print(prefix);
            writer.print("mNextAnim=");
            writer.println(mNextAnim);
        } //End block
        {
            writer.print(prefix);
            writer.print("mContainer=");
            writer.println(mContainer);
        } //End block
        {
            writer.print(prefix);
            writer.print("mView=");
            writer.println(mView);
        } //End block
        {
            writer.print(prefix);
            writer.print("mInnerView=");
            writer.println(mView);
        } //End block
        {
            writer.print(prefix);
            writer.print("mAnimatingAway=");
            writer.println(mAnimatingAway);
            writer.print(prefix);
            writer.print("mStateAfterAnimating=");
            writer.println(mStateAfterAnimating);
        } //End block
        {
            writer.print(prefix);
            writer.println("Loader Manager:");
            mLoaderManager.dump(prefix + "  ", fd, writer, args);
        } //End block
        {
            writer.print(prefix);
            writer.println("Child " + mChildFragmentManager + ":");
            mChildFragmentManager.dump(prefix + "  ", fd, writer, args);
        } //End block
        addTaint(prefix.getTaint());
        addTaint(fd.getTaint());
        addTaint(writer.getTaint());
        addTaint(args[0].getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:33.005 -0400", hash_original_method = "61D88876092ADD5F15473E2AB4FA77D3", hash_generated_method = "9FB4259703433A0050D517886AAC3CF0")
     Fragment findFragmentByWho(String who) {
        Fragment varB4EAC82CA7396A68D541C85D26508E83_672024116 = null; //Variable for return #1
        Fragment varB4EAC82CA7396A68D541C85D26508E83_1623966475 = null; //Variable for return #2
        Fragment varB4EAC82CA7396A68D541C85D26508E83_1181394543 = null; //Variable for return #3
        {
            boolean varC7146AD42A60BAFDF58E0A6181ED7187_522268261 = (who.equals(mWho));
            {
                varB4EAC82CA7396A68D541C85D26508E83_672024116 = this;
            } //End block
        } //End collapsed parenthetic
        {
            varB4EAC82CA7396A68D541C85D26508E83_1623966475 = mChildFragmentManager.findFragmentByWho(who);
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1181394543 = null;
        addTaint(who.getTaint());
        Fragment varA7E53CE21691AB073D9660D615818899_387470701; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_387470701 = varB4EAC82CA7396A68D541C85D26508E83_672024116;
                break;
            case 2: //Assign result for return ordinal #2
                varA7E53CE21691AB073D9660D615818899_387470701 = varB4EAC82CA7396A68D541C85D26508E83_1623966475;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_387470701 = varB4EAC82CA7396A68D541C85D26508E83_1181394543;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_387470701.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_387470701;
        // ---------- Original Method ----------
        //if (who.equals(mWho)) {
            //return this;
        //}
        //if (mChildFragmentManager != null) {
            //return mChildFragmentManager.findFragmentByWho(who);
        //}
        //return null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:33.007 -0400", hash_original_method = "EDAB121E0E9B6E6FAA5680C6215916BF", hash_generated_method = "056E7C6EBC8B1B8143A313DF7774B83B")
     void instantiateChildFragmentManager() {
        mChildFragmentManager = new FragmentManagerImpl();
        mChildFragmentManager.attachActivity(mActivity, new FragmentContainer() {            
            @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:33.007 -0400", hash_original_method = "5BED041A00050D47AD1342402B9985BC", hash_generated_method = "F0E9C54AF3CE4F68C3FB18ADAE83FF67")
            @Override
            public View findViewById(int id) {
                View varB4EAC82CA7396A68D541C85D26508E83_1947713009 = null; //Variable for return #1
                {
                    if (DroidSafeAndroidRuntime.control) throw new IllegalStateException("Fragment does not have a view");
                } //End block
                varB4EAC82CA7396A68D541C85D26508E83_1947713009 = mView.findViewById(id);
                addTaint(id);
                varB4EAC82CA7396A68D541C85D26508E83_1947713009.addTaint(getTaint()); //Add taint from parent
                return varB4EAC82CA7396A68D541C85D26508E83_1947713009;
                // ---------- Original Method ----------
                //if (mView == null) {
                    //throw new IllegalStateException("Fragment does not have a view");
                //}
                //return mView.findViewById(id);
            }
}, this);
        // ---------- Original Method ----------
        //mChildFragmentManager = new FragmentManagerImpl();
        //mChildFragmentManager.attachActivity(mActivity, new FragmentContainer() {
            //@Override
            //public View findViewById(int id) {
                //if (mView == null) {
                    //throw new IllegalStateException("Fragment does not have a view");
                //}
                //return mView.findViewById(id);
            //}
        //}, this);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:33.018 -0400", hash_original_method = "3EE407E16277E3B3A8635005B5A0DEC4", hash_generated_method = "80A9C927DB57A061E617227227D9F42F")
     void performCreate(Bundle savedInstanceState) {
        {
            mChildFragmentManager.noteStateNotSaved();
        } //End block
        mCalled = false;
        onCreate(savedInstanceState);
        {
            if (DroidSafeAndroidRuntime.control) throw new SuperNotCalledException("Fragment " + this
                    + " did not call through to super.onCreate()");
        } //End block
        {
            Parcelable p;
            p = savedInstanceState.getParcelable(
                    FragmentActivity.FRAGMENTS_TAG);
            {
                {
                    instantiateChildFragmentManager();
                } //End block
                mChildFragmentManager.restoreAllState(p, null);
                mChildFragmentManager.dispatchCreate();
            } //End block
        } //End block
        addTaint(savedInstanceState.getTaint());
        // ---------- Original Method ----------
        //if (mChildFragmentManager != null) {
            //mChildFragmentManager.noteStateNotSaved();
        //}
        //mCalled = false;
        //onCreate(savedInstanceState);
        //if (!mCalled) {
            //throw new SuperNotCalledException("Fragment " + this
                    //+ " did not call through to super.onCreate()");
        //}
        //if (savedInstanceState != null) {
            //Parcelable p = savedInstanceState.getParcelable(
                    //FragmentActivity.FRAGMENTS_TAG);
            //if (p != null) {
                //if (mChildFragmentManager == null) {
                    //instantiateChildFragmentManager();
                //}
                //mChildFragmentManager.restoreAllState(p, null);
                //mChildFragmentManager.dispatchCreate();
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:33.019 -0400", hash_original_method = "C9098E0ABE3DD99AEB89FC060D15CE33", hash_generated_method = "BBF11F9D484C9A6E4B0F35105CED92DF")
     View performCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View varB4EAC82CA7396A68D541C85D26508E83_1684289605 = null; //Variable for return #1
        {
            mChildFragmentManager.noteStateNotSaved();
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1684289605 = onCreateView(inflater, container, savedInstanceState);
        addTaint(inflater.getTaint());
        addTaint(container.getTaint());
        addTaint(savedInstanceState.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1684289605.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1684289605;
        // ---------- Original Method ----------
        //if (mChildFragmentManager != null) {
            //mChildFragmentManager.noteStateNotSaved();
        //}
        //return onCreateView(inflater, container, savedInstanceState);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:33.020 -0400", hash_original_method = "6B9A0B76E81212CD14FFC5CCF383D5D3", hash_generated_method = "E65D9F2477C9069011B9E80BBB53A499")
     void performActivityCreated(Bundle savedInstanceState) {
        {
            mChildFragmentManager.noteStateNotSaved();
        } //End block
        mCalled = false;
        onActivityCreated(savedInstanceState);
        {
            if (DroidSafeAndroidRuntime.control) throw new SuperNotCalledException("Fragment " + this
                    + " did not call through to super.onActivityCreated()");
        } //End block
        {
            mChildFragmentManager.dispatchActivityCreated();
        } //End block
        addTaint(savedInstanceState.getTaint());
        // ---------- Original Method ----------
        //if (mChildFragmentManager != null) {
            //mChildFragmentManager.noteStateNotSaved();
        //}
        //mCalled = false;
        //onActivityCreated(savedInstanceState);
        //if (!mCalled) {
            //throw new SuperNotCalledException("Fragment " + this
                    //+ " did not call through to super.onActivityCreated()");
        //}
        //if (mChildFragmentManager != null) {
            //mChildFragmentManager.dispatchActivityCreated();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:33.027 -0400", hash_original_method = "FAC6959B7963C55ED04FD140D265CD92", hash_generated_method = "07BEAD395370EA3EC0727F1F6038B075")
     void performStart() {
        {
            mChildFragmentManager.noteStateNotSaved();
            mChildFragmentManager.execPendingActions();
        } //End block
        mCalled = false;
        onStart();
        {
            if (DroidSafeAndroidRuntime.control) throw new SuperNotCalledException("Fragment " + this
                    + " did not call through to super.onStart()");
        } //End block
        {
            mChildFragmentManager.dispatchStart();
        } //End block
        {
            mLoaderManager.doReportStart();
        } //End block
        // ---------- Original Method ----------
        //if (mChildFragmentManager != null) {
            //mChildFragmentManager.noteStateNotSaved();
            //mChildFragmentManager.execPendingActions();
        //}
        //mCalled = false;
        //onStart();
        //if (!mCalled) {
            //throw new SuperNotCalledException("Fragment " + this
                    //+ " did not call through to super.onStart()");
        //}
        //if (mChildFragmentManager != null) {
            //mChildFragmentManager.dispatchStart();
        //}
        //if (mLoaderManager != null) {
            //mLoaderManager.doReportStart();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:33.040 -0400", hash_original_method = "225800A7AAA9ACBE89033DE187291152", hash_generated_method = "B3F7593B0FEB6D6784493B39DBF02580")
     void performResume() {
        {
            mChildFragmentManager.noteStateNotSaved();
            mChildFragmentManager.execPendingActions();
        } //End block
        mCalled = false;
        onResume();
        {
            if (DroidSafeAndroidRuntime.control) throw new SuperNotCalledException("Fragment " + this
                    + " did not call through to super.onResume()");
        } //End block
        {
            mChildFragmentManager.dispatchResume();
            mChildFragmentManager.execPendingActions();
        } //End block
        // ---------- Original Method ----------
        //if (mChildFragmentManager != null) {
            //mChildFragmentManager.noteStateNotSaved();
            //mChildFragmentManager.execPendingActions();
        //}
        //mCalled = false;
        //onResume();
        //if (!mCalled) {
            //throw new SuperNotCalledException("Fragment " + this
                    //+ " did not call through to super.onResume()");
        //}
        //if (mChildFragmentManager != null) {
            //mChildFragmentManager.dispatchResume();
            //mChildFragmentManager.execPendingActions();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:33.040 -0400", hash_original_method = "4CF76F87E5378DAC79600BD4B0530AEF", hash_generated_method = "F765779D44D11859B1FEF5EB95F0986F")
     void performConfigurationChanged(Configuration newConfig) {
        onConfigurationChanged(newConfig);
        {
            mChildFragmentManager.dispatchConfigurationChanged(newConfig);
        } //End block
        addTaint(newConfig.getTaint());
        // ---------- Original Method ----------
        //onConfigurationChanged(newConfig);
        //if (mChildFragmentManager != null) {
            //mChildFragmentManager.dispatchConfigurationChanged(newConfig);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:33.046 -0400", hash_original_method = "F077F2C753E805161BC608B27E561A9B", hash_generated_method = "490F5AA86629811DBE459BE9E49EAC59")
     void performLowMemory() {
        onLowMemory();
        {
            mChildFragmentManager.dispatchLowMemory();
        } //End block
        // ---------- Original Method ----------
        //onLowMemory();
        //if (mChildFragmentManager != null) {
            //mChildFragmentManager.dispatchLowMemory();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:33.048 -0400", hash_original_method = "EDE9801703CADFBAB935432E700FE9D4", hash_generated_method = "810D34D736AAF3A9C419CE39428EAAA8")
     boolean performCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        boolean show;
        show = false;
        {
            {
                show = true;
                onCreateOptionsMenu(menu, inflater);
            } //End block
            {
                show |= mChildFragmentManager.dispatchCreateOptionsMenu(menu, inflater);
            } //End block
        } //End block
        addTaint(menu.getTaint());
        addTaint(inflater.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_197426962 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_197426962;
        // ---------- Original Method ----------
        //boolean show = false;
        //if (!mHidden) {
            //if (mHasMenu && mMenuVisible) {
                //show = true;
                //onCreateOptionsMenu(menu, inflater);
            //}
            //if (mChildFragmentManager != null) {
                //show |= mChildFragmentManager.dispatchCreateOptionsMenu(menu, inflater);
            //}
        //}
        //return show;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:33.048 -0400", hash_original_method = "27D1E8CFF71284C61956522356EF62A1", hash_generated_method = "F276D1A58E843DF65D953179C075B646")
     boolean performPrepareOptionsMenu(Menu menu) {
        boolean show;
        show = false;
        {
            {
                show = true;
                onPrepareOptionsMenu(menu);
            } //End block
            {
                show |= mChildFragmentManager.dispatchPrepareOptionsMenu(menu);
            } //End block
        } //End block
        addTaint(menu.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_315895497 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_315895497;
        // ---------- Original Method ----------
        //boolean show = false;
        //if (!mHidden) {
            //if (mHasMenu && mMenuVisible) {
                //show = true;
                //onPrepareOptionsMenu(menu);
            //}
            //if (mChildFragmentManager != null) {
                //show |= mChildFragmentManager.dispatchPrepareOptionsMenu(menu);
            //}
        //}
        //return show;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:33.062 -0400", hash_original_method = "AB066317960C5B7A87CEEFD90F19CB53", hash_generated_method = "F26655AF7503AB940D9E27756FC70394")
     boolean performOptionsItemSelected(MenuItem item) {
        {
            {
                {
                    boolean var0E7B279FC9BEB736499E8251F8A1A024_1370375095 = (onOptionsItemSelected(item));
                } //End collapsed parenthetic
            } //End block
            {
                {
                    boolean var15D8FEAD3E350BF8342201E9382C0D38_1020100565 = (mChildFragmentManager.dispatchOptionsItemSelected(item));
                } //End collapsed parenthetic
            } //End block
        } //End block
        addTaint(item.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1810668292 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1810668292;
        // ---------- Original Method ----------
        //if (!mHidden) {
            //if (mHasMenu && mMenuVisible) {
                //if (onOptionsItemSelected(item)) {
                    //return true;
                //}
            //}
            //if (mChildFragmentManager != null) {
                //if (mChildFragmentManager.dispatchOptionsItemSelected(item)) {
                    //return true;
                //}
            //}
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:33.063 -0400", hash_original_method = "78AAFDAC6C7C01B066E741BD144002F2", hash_generated_method = "F005235F0492925B8E11EF999BCD7AA6")
     boolean performContextItemSelected(MenuItem item) {
        {
            {
                boolean varD3737DE067E0588EDBE81C81E1C8DB66_1274393873 = (onContextItemSelected(item));
            } //End collapsed parenthetic
            {
                {
                    boolean var388B538438B883A53469174C8FD0D9B2_535947209 = (mChildFragmentManager.dispatchContextItemSelected(item));
                } //End collapsed parenthetic
            } //End block
        } //End block
        addTaint(item.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_679711205 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_679711205;
        // ---------- Original Method ----------
        //if (!mHidden) {
            //if (onContextItemSelected(item)) {
                //return true;
            //}
            //if (mChildFragmentManager != null) {
                //if (mChildFragmentManager.dispatchContextItemSelected(item)) {
                    //return true;
                //}
            //}
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:33.063 -0400", hash_original_method = "4DDEE08146B46D76D3DC17885A5DDDC2", hash_generated_method = "7C3BF09B170E9F4C6F74A155EBCDB10B")
     void performOptionsMenuClosed(Menu menu) {
        {
            {
                onOptionsMenuClosed(menu);
            } //End block
            {
                mChildFragmentManager.dispatchOptionsMenuClosed(menu);
            } //End block
        } //End block
        addTaint(menu.getTaint());
        // ---------- Original Method ----------
        //if (!mHidden) {
            //if (mHasMenu && mMenuVisible) {
                //onOptionsMenuClosed(menu);
            //}
            //if (mChildFragmentManager != null) {
                //mChildFragmentManager.dispatchOptionsMenuClosed(menu);
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:33.076 -0400", hash_original_method = "229F45787776B9C5A3449A8AF116842B", hash_generated_method = "1DD5D72D762D06D94C4267048D45BA00")
     void performSaveInstanceState(Bundle outState) {
        onSaveInstanceState(outState);
        {
            Parcelable p;
            p = mChildFragmentManager.saveAllState();
            {
                outState.putParcelable(FragmentActivity.FRAGMENTS_TAG, p);
            } //End block
        } //End block
        addTaint(outState.getTaint());
        // ---------- Original Method ----------
        //onSaveInstanceState(outState);
        //if (mChildFragmentManager != null) {
            //Parcelable p = mChildFragmentManager.saveAllState();
            //if (p != null) {
                //outState.putParcelable(FragmentActivity.FRAGMENTS_TAG, p);
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:33.076 -0400", hash_original_method = "E981410A628A778E5EC5758D81394A36", hash_generated_method = "653C8309A85CE9A8EA17024DE0FC9080")
     void performPause() {
        {
            mChildFragmentManager.dispatchPause();
        } //End block
        mCalled = false;
        onPause();
        {
            if (DroidSafeAndroidRuntime.control) throw new SuperNotCalledException("Fragment " + this
                    + " did not call through to super.onPause()");
        } //End block
        // ---------- Original Method ----------
        //if (mChildFragmentManager != null) {
            //mChildFragmentManager.dispatchPause();
        //}
        //mCalled = false;
        //onPause();
        //if (!mCalled) {
            //throw new SuperNotCalledException("Fragment " + this
                    //+ " did not call through to super.onPause()");
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:33.077 -0400", hash_original_method = "A54D340AC4C554E09C318AFC86BC07BD", hash_generated_method = "C822ED615142AFDBC1201FA4E5CACA07")
     void performStop() {
        {
            mChildFragmentManager.dispatchStop();
        } //End block
        mCalled = false;
        onStop();
        {
            if (DroidSafeAndroidRuntime.control) throw new SuperNotCalledException("Fragment " + this
                    + " did not call through to super.onStop()");
        } //End block
        // ---------- Original Method ----------
        //if (mChildFragmentManager != null) {
            //mChildFragmentManager.dispatchStop();
        //}
        //mCalled = false;
        //onStop();
        //if (!mCalled) {
            //throw new SuperNotCalledException("Fragment " + this
                    //+ " did not call through to super.onStop()");
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:33.077 -0400", hash_original_method = "E7DDF1CA54A3F6D13CAA1A65082611F8", hash_generated_method = "370166331D9A90701F6726520AB981D5")
     void performReallyStop() {
        {
            mChildFragmentManager.dispatchReallyStop();
        } //End block
        {
            mLoadersStarted = false;
            {
                mCheckedForLoaderManager = true;
                mLoaderManager = mActivity.getLoaderManager(mWho, mLoadersStarted, false);
            } //End block
            {
                {
                    mLoaderManager.doStop();
                } //End block
                {
                    mLoaderManager.doRetain();
                } //End block
            } //End block
        } //End block
        // ---------- Original Method ----------
        //if (mChildFragmentManager != null) {
            //mChildFragmentManager.dispatchReallyStop();
        //}
        //if (mLoadersStarted) {
            //mLoadersStarted = false;
            //if (!mCheckedForLoaderManager) {
                //mCheckedForLoaderManager = true;
                //mLoaderManager = mActivity.getLoaderManager(mWho, mLoadersStarted, false);
            //}
            //if (mLoaderManager != null) {
                //if (!mActivity.mRetaining) {
                    //mLoaderManager.doStop();
                //} else {
                    //mLoaderManager.doRetain();
                //}
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:33.078 -0400", hash_original_method = "A7577DB153B8A046DC326874EE7B0A4B", hash_generated_method = "79A13FE3BB7BF947AC0DD31F6530258D")
     void performDestroyView() {
        {
            mChildFragmentManager.dispatchDestroyView();
        } //End block
        mCalled = false;
        onDestroyView();
        {
            if (DroidSafeAndroidRuntime.control) throw new SuperNotCalledException("Fragment " + this
                    + " did not call through to super.onDestroyView()");
        } //End block
        {
            mLoaderManager.doReportNextStart();
        } //End block
        // ---------- Original Method ----------
        //if (mChildFragmentManager != null) {
            //mChildFragmentManager.dispatchDestroyView();
        //}
        //mCalled = false;
        //onDestroyView();
        //if (!mCalled) {
            //throw new SuperNotCalledException("Fragment " + this
                    //+ " did not call through to super.onDestroyView()");
        //}
        //if (mLoaderManager != null) {
            //mLoaderManager.doReportNextStart();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:33.079 -0400", hash_original_method = "6BD30978B327739DC7CB2841A03C0980", hash_generated_method = "CF3D78B284A299AFB33800D46BF0936D")
     void performDestroy() {
        {
            mChildFragmentManager.dispatchDestroy();
        } //End block
        mCalled = false;
        onDestroy();
        {
            if (DroidSafeAndroidRuntime.control) throw new SuperNotCalledException("Fragment " + this
                    + " did not call through to super.onDestroy()");
        } //End block
        // ---------- Original Method ----------
        //if (mChildFragmentManager != null) {
            //mChildFragmentManager.dispatchDestroy();
        //}
        //mCalled = false;
        //onDestroy();
        //if (!mCalled) {
            //throw new SuperNotCalledException("Fragment " + this
                    //+ " did not call through to super.onDestroy()");
        //}
    }

    
    public static class SavedState implements Parcelable {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:33.079 -0400", hash_original_field = "48A902C1D749B47EBC75C77370D5A1F0", hash_generated_field = "AA4A80FE6E8C28CFC04031C8CFFC3C9D")

        Bundle mState;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:33.079 -0400", hash_original_method = "7D4CB1BC3C04B99DC21EA19CB6BAF4D3", hash_generated_method = "BAE726BCB2EFD4A0280978447E5417B6")
          SavedState(Bundle state) {
            mState = state;
            // ---------- Original Method ----------
            //mState = state;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:33.086 -0400", hash_original_method = "E611F4C5C5E159704631D93ABD994DEF", hash_generated_method = "2C9CB5FE3CDE5ABA795E1EBDDA05A7F3")
          SavedState(Parcel in, ClassLoader loader) {
            mState = in.readBundle();
            {
                mState.setClassLoader(loader);
            } //End block
            addTaint(loader.getTaint());
            // ---------- Original Method ----------
            //mState = in.readBundle();
            //if (loader != null && mState != null) {
                //mState.setClassLoader(loader);
            //}
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:33.087 -0400", hash_original_method = "00F8174F9E89D0C972FA6D3F19742382", hash_generated_method = "E182F4B015FF835B814596ACAEA6B8EF")
        @Override
        public int describeContents() {
            int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1763096744 = getTaintInt();
            return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1763096744;
            // ---------- Original Method ----------
            //return 0;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:33.104 -0400", hash_original_method = "ACF88B4EF312D321A4777388A96F3566", hash_generated_method = "09F2B398AE4A3BD919542940FA9DB2FB")
        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeBundle(mState);
            addTaint(dest.getTaint());
            addTaint(flags);
            // ---------- Original Method ----------
            //dest.writeBundle(mState);
        }

        
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:33.104 -0400", hash_original_field = "A42D60237D21D4808CE78C5691FA3200", hash_generated_field = "FB9BD5541F55208F5BC20C32E5AB0F3E")

        public static final Parcelable.Creator<SavedState> CREATOR
                = new Parcelable.Creator<SavedState>() {
            public SavedState createFromParcel(Parcel in) {
                return new SavedState(in, null);
            }

            public SavedState[] newArray(int size) {
                return new SavedState[size];
            }
        };
    }


    
    static public class InstantiationException extends RuntimeException {
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:33.107 -0400", hash_original_method = "9A59F9C8F177B5B07F720376B1CE8BCE", hash_generated_method = "AF08BB7903F079548F45BF553D77E4CE")
        public  InstantiationException(String msg, Exception cause) {
            super(msg, cause);
            addTaint(msg.getTaint());
            addTaint(cause.getTaint());
            // ---------- Original Method ----------
        }

        
    }


    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:33.107 -0400", hash_original_field = "24A48BEA88D09CCBC63A8677385B95A8", hash_generated_field = "EC936C9C5D0B922668ED049E25D497DA")

    private static HashMap<String, Class<?>> sClassMap = new HashMap<String, Class<?>>();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:33.107 -0400", hash_original_field = "403EB1653B87B88BD21AEF72194EF5E0", hash_generated_field = "0C091E44AFB8BA04354F42E5BFDA5538")

    static int INITIALIZING = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:33.107 -0400", hash_original_field = "6EFDDF5DE9E2142D56B3E098F844AE40", hash_generated_field = "CEDB770EF4A00641AAB2FE353C52E8A0")

    static int CREATED = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:33.107 -0400", hash_original_field = "18C3D4E620F8352BDF3CA097C14B87F7", hash_generated_field = "DCBACC99FDFF341F4CAA38F714D88E77")

    static int ACTIVITY_CREATED = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:33.107 -0400", hash_original_field = "456918D615E944292D78BC88E852291C", hash_generated_field = "F9D4FF31AE738DD23EC55C599DDFC9C9")

    static int STOPPED = 3;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:33.107 -0400", hash_original_field = "C604B9D3F56F632433E5FA0C79127BB7", hash_generated_field = "052871D90DC5D19C955AA46F8AFB8452")

    static int STARTED = 4;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:33.107 -0400", hash_original_field = "FF953E97A61C82A8BD259E088591325D", hash_generated_field = "75F5BB1CDC49528C2C5DE4FBF02489AD")

    static int RESUMED = 5;
}

