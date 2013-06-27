package android.view;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.content.ClipData;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Interpolator;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.FloatProperty;
import android.util.LocaleUtil;
import android.util.Log;
import android.util.Pool;
import android.util.Poolable;
import android.util.PoolableManager;
import android.util.Pools;
import android.util.Property;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityEventSource;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.ScrollBarDrawable;
import static android.os.Build.VERSION_CODES.*;
import com.android.internal.R;
import com.android.internal.util.Predicate;
import com.android.internal.view.menu.MenuBuilder;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

public class View implements Drawable.Callback, Drawable.Callback2, KeyEvent.Callback, AccessibilityEventSource {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.507 -0400", hash_original_field = "B2E23F53603EF963174A5DCDD21E377A", hash_generated_field = "DD721D19F83A9531A571F53535845605")

    private SparseArray<Object> mKeyedTags;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.507 -0400", hash_original_field = "81C8D8BB5EDA313C426D4F0583A37B0F", hash_generated_field = "1A75C99521C9A69968375361930C982C")

    protected Animation mCurrentAnimation = null;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.507 -0400", hash_original_field = "30AF844796D32E1DD6D14B620B8355DF", hash_generated_field = "8AF08A92D2F66E40D67BD95DF20644CE")

    @ViewDebug.ExportedProperty(category = "measurement") int mMeasuredWidth;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.508 -0400", hash_original_field = "0EF7F253195B445FA5A8B4E98FA98667", hash_generated_field = "92147C8788B6F0CA2DABA1FB3B19E8BF")

    @ViewDebug.ExportedProperty(category = "measurement") int mMeasuredHeight;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.508 -0400", hash_original_field = "FA31AC557740873AF5104338EBA7FC19", hash_generated_field = "2D6D8008671A06EF61654718BEF765EB")

    boolean mRecreateDisplayList = false;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.508 -0400", hash_original_field = "5FFDC6E17099498D1825C5220B9BD0AE", hash_generated_field = "AFA40CB29D8B77AA456CB799510E6286")

    @ViewDebug.ExportedProperty(resolveId = true) int mID = NO_ID;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.508 -0400", hash_original_field = "8EA4018BB68ADA26F78B9B1F42A67958", hash_generated_field = "CDDE4755ADE2BC204930CA88B5DBB470")

    int mAccessibilityViewId = NO_ID;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.509 -0400", hash_original_field = "07496860B5C53FDD66588727158D5F73", hash_generated_field = "91C972E269A3F4396E01E84D6E3CCC58")

    protected Object mTag;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.516 -0400", hash_original_field = "A3201A672D71DD5A79F87DF520AF188A", hash_generated_field = "7014A987CDECAA2300639BF21EC914DD")

    private int mOverScrollMode;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.516 -0400", hash_original_field = "08DEDF480C56042390504EEB5F2B5C59", hash_generated_field = "E798458702129E681480C3268D9EB850")

    protected ViewParent mParent;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.516 -0400", hash_original_field = "B1A49FF62D92BCD8AE5C70F97D680510", hash_generated_field = "7DACD6A85AA040B3D0EFA6ECFB8BF661")

    AttachInfo mAttachInfo;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.516 -0400", hash_original_field = "DD07F24B502147BA1093569C14614DF6", hash_generated_field = "4B9A7C2E7189666FEFF6FEA48770F96F")

    @ViewDebug.ExportedProperty(flagMapping = {
        @ViewDebug.FlagToString(mask = FORCE_LAYOUT, equals = FORCE_LAYOUT,
                name = "FORCE_LAYOUT"),
        @ViewDebug.FlagToString(mask = LAYOUT_REQUIRED, equals = LAYOUT_REQUIRED,
                name = "LAYOUT_REQUIRED"),
        @ViewDebug.FlagToString(mask = DRAWING_CACHE_VALID, equals = DRAWING_CACHE_VALID,
            name = "DRAWING_CACHE_INVALID", outputIf = false),
        @ViewDebug.FlagToString(mask = DRAWN, equals = DRAWN, name = "DRAWN", outputIf = true),
        @ViewDebug.FlagToString(mask = DRAWN, equals = DRAWN, name = "NOT_DRAWN", outputIf = false),
        @ViewDebug.FlagToString(mask = DIRTY_MASK, equals = DIRTY_OPAQUE, name = "DIRTY_OPAQUE"),
        @ViewDebug.FlagToString(mask = DIRTY_MASK, equals = DIRTY, name = "DIRTY")
    }) int mPrivateFlags;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.516 -0400", hash_original_field = "28E81DB49C33C12590DE3E9CA12A7A01", hash_generated_field = "A70874573E565834837AE3AE1A44105E")

    int mPrivateFlags2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.516 -0400", hash_original_field = "D03AF504A7FB8D1F39097D83B42BDFFD", hash_generated_field = "18478E9808210D74729295E4C33E2EEB")

    @ViewDebug.ExportedProperty(flagMapping = {
        @ViewDebug.FlagToString(mask = SYSTEM_UI_FLAG_LOW_PROFILE,
                                equals = SYSTEM_UI_FLAG_LOW_PROFILE,
                                name = "SYSTEM_UI_FLAG_LOW_PROFILE", outputIf = true),
        @ViewDebug.FlagToString(mask = SYSTEM_UI_FLAG_HIDE_NAVIGATION,
                                equals = SYSTEM_UI_FLAG_HIDE_NAVIGATION,
                                name = "SYSTEM_UI_FLAG_HIDE_NAVIGATION", outputIf = true),
        @ViewDebug.FlagToString(mask = PUBLIC_STATUS_BAR_VISIBILITY_MASK,
                                equals = SYSTEM_UI_FLAG_VISIBLE,
                                name = "SYSTEM_UI_FLAG_VISIBLE", outputIf = true)
    }) int mSystemUiVisibility;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.516 -0400", hash_original_field = "B4EADC228928954D156338C2784E8E5E", hash_generated_field = "AA3BA123C58FF5925198746B8B561359")

    int mWindowAttachCount;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.516 -0400", hash_original_field = "131BCA992A092424AD9B21CD196A5A23", hash_generated_field = "AC04A604736B65491405D9541E300EF7")

    protected ViewGroup.LayoutParams mLayoutParams;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.516 -0400", hash_original_field = "B4A6C3081B601CA613414848B92AAEAE", hash_generated_field = "D35E3C6B5D57FAA3D36920801FB7F998")

    @ViewDebug.ExportedProperty int mViewFlags;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.516 -0400", hash_original_field = "06B81BDBD4699F35D8DC8F52040A7EB4", hash_generated_field = "814413531F598274EEECF8BE645FBF8D")

    TransformationInfo mTransformationInfo;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.516 -0400", hash_original_field = "9FEFCB6583E51099148CCC96D70DF025", hash_generated_field = "62AEC70730E07CC33ABF33611E56E0C9")

    private boolean mLastIsOpaque;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.516 -0400", hash_original_field = "B5B776A6642DD69B16A47E6FCCAEEB6E", hash_generated_field = "B0CFD8B13BD2121822E87395D9B5EB0A")

    @ViewDebug.ExportedProperty(category = "layout") protected int mLeft;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.516 -0400", hash_original_field = "720807298C0DE3DCF41AEC725F26A5A1", hash_generated_field = "51E02A5FF8AC135FCB771EE787BDB4C9")

    @ViewDebug.ExportedProperty(category = "layout") protected int mRight;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.517 -0400", hash_original_field = "D09DA346C6637C81F0228C8D0347388B", hash_generated_field = "496CBAA35C1D669530329F97A9C74114")

    @ViewDebug.ExportedProperty(category = "layout") protected int mTop;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.517 -0400", hash_original_field = "2FFD20D7E48915664FDF7F12FC3889D8", hash_generated_field = "6F474ED228AC76685E91ED773CB73395")

    @ViewDebug.ExportedProperty(category = "layout") protected int mBottom;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.517 -0400", hash_original_field = "9DC8F9676E14E93147EBEA37CE364B55", hash_generated_field = "1ACB7D4E721E5C41E8206F696A6DB2DB")

    @ViewDebug.ExportedProperty(category = "scrolling") protected int mScrollX;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.517 -0400", hash_original_field = "4ABBFD585ECE4FE40BECD8E0C30C4E5E", hash_generated_field = "3AE77EDF3F10D09CA5B3A9FC1C16B667")

    @ViewDebug.ExportedProperty(category = "scrolling") protected int mScrollY;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.517 -0400", hash_original_field = "252F7DBD6188FA4BC0CBCF5785506FD8", hash_generated_field = "0D018CC517023EE199B2A8DAA6ECB500")

    @ViewDebug.ExportedProperty(category = "padding") protected int mPaddingLeft;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.517 -0400", hash_original_field = "1CC5609E099825B7F5335F0151334D28", hash_generated_field = "AEE809A9BA21DCA8517E2AD9D955D3B7")

    @ViewDebug.ExportedProperty(category = "padding") protected int mPaddingRight;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.517 -0400", hash_original_field = "160C8C8F6F0F40401734402AE62419A9", hash_generated_field = "12E040F5B926130031C2D0EA1ECAF1B8")

    @ViewDebug.ExportedProperty(category = "padding") protected int mPaddingTop;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.517 -0400", hash_original_field = "DC0A1BD9ED7E0615D8F16D5DA74E6D47", hash_generated_field = "AB005070934C3278D46BFF088EA941B9")

    @ViewDebug.ExportedProperty(category = "padding") protected int mPaddingBottom;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.517 -0400", hash_original_field = "073D0187C9F61FAD4E5B0B851BDDC2B3", hash_generated_field = "8594C4137F32107058E48C17931382B5")

    private CharSequence mContentDescription;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.517 -0400", hash_original_field = "72448C4AF26CE8C6C66360ACE1566CFE", hash_generated_field = "24275D1D330A85C524C74A0B09414AAB")

    @ViewDebug.ExportedProperty(category = "padding") protected int mUserPaddingRight;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.517 -0400", hash_original_field = "CEB8CA928CC6F1226E948D86A175A8FC", hash_generated_field = "0C4869EF67BF3E50F8F10A68C2F9D716")

    @ViewDebug.ExportedProperty(category = "padding") protected int mUserPaddingBottom;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.517 -0400", hash_original_field = "3C518AC9A0E1AF98691ADD3A8A1CCB30", hash_generated_field = "1BE3737E54325E6415262D1A90E67453")

    @ViewDebug.ExportedProperty(category = "padding") protected int mUserPaddingLeft;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.517 -0400", hash_original_field = "5E1288938438CBB6C9289BF968E78727", hash_generated_field = "B3EF2958202B8FBC0F390975B72C0AB1")

    @ViewDebug.ExportedProperty(category = "padding") boolean mUserPaddingRelative;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.517 -0400", hash_original_field = "82E152642CCF26B8B66B0CCCFE09EA44", hash_generated_field = "BFF4356AD8CC83E6872ED1781251B206")

    @ViewDebug.ExportedProperty(category = "padding") int mUserPaddingStart;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.517 -0400", hash_original_field = "4DBF4950DA8FCB8889499A80DAA6625F", hash_generated_field = "C099602A54FEC808EF713AD0C3E426B1")

    @ViewDebug.ExportedProperty(category = "padding") int mUserPaddingEnd;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.517 -0400", hash_original_field = "82845C8137ABB799EDEBA2102E5BC6CA", hash_generated_field = "3BFE3DAC86E051A37E15269C1EBC8E4B")

    int mOldWidthMeasureSpec = Integer.MIN_VALUE;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.517 -0400", hash_original_field = "F07A0625188625F817BFD34F6D66B011", hash_generated_field = "1C3D2A3A966DD51630301EB9B47C35E5")

    int mOldHeightMeasureSpec = Integer.MIN_VALUE;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.517 -0400", hash_original_field = "AE73D526548104E4C1E17F7F245F81BC", hash_generated_field = "CD7692461BCF8CBA84620403F5E57E2E")

    private Drawable mBGDrawable;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.517 -0400", hash_original_field = "402426C85408915526629956C0CDBBC1", hash_generated_field = "EFFE71B257E8A8B334669D80482775BC")

    private int mBackgroundResource;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.517 -0400", hash_original_field = "8AFEAE5A926044C2D360A11EA8458209", hash_generated_field = "308B2769E6A04DC50D717155A3FFF7C8")

    private boolean mBackgroundSizeChanged;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.517 -0400", hash_original_field = "78118D1764B56569D6B6E6C626D161A5", hash_generated_field = "29D621A32636521FA6951DD85766CC20")

    ListenerInfo mListenerInfo;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.517 -0400", hash_original_field = "51EF5995AD6B82C50AE546C1599EFFFA", hash_generated_field = "B3359F86E29A965BC1436888E98C55A8")

    protected Context mContext;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.517 -0400", hash_original_field = "0D8AC9B29D5FDF7FAC18EB1269D7F6D0", hash_generated_field = "8872E9F5EB468B447DB47434F2C2FEC9")

    private Resources mResources;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.517 -0400", hash_original_field = "AC1C3EE794A682BD562C18565142DA7C", hash_generated_field = "8ED80A3CDB45EFD1EC966904F18B0C41")

    private ScrollabilityCache mScrollCache;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.517 -0400", hash_original_field = "60876A8DC985533C9A9E5260A5B1C8A3", hash_generated_field = "51C006923E88A244E6B4A81FAACDA6EF")

    private int[] mDrawableState = null;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.517 -0400", hash_original_field = "A475F3D92E5FAC2EB37DD88F537E2964", hash_generated_field = "8763FD238D26A060847D5BFD5F110B02")

    public boolean mCachingFailed;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.517 -0400", hash_original_field = "00D13CF2B6143C87E634D4CF05F6DBCC", hash_generated_field = "3DD824BE1FD179F4F5718F6A857553E0")

    private Bitmap mDrawingCache;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.518 -0400", hash_original_field = "9D429DAE730251946D577870B67FB966", hash_generated_field = "03126783BB83E37A27CE046D8A79B1C7")

    private Bitmap mUnscaledDrawingCache;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.518 -0400", hash_original_field = "B56FE185AB9316DBDB054606F5602E90", hash_generated_field = "CE60F7E3CE3B2722E2B23845AC923EB1")

    private HardwareLayer mHardwareLayer;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.518 -0400", hash_original_field = "28797884D8917814D2A66A0146DC8FD5", hash_generated_field = "4FBA01527B47AF659DF19EA16E769B16")

    DisplayList mDisplayList;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.518 -0400", hash_original_field = "2205CD40A12D3B9963716F25F00C61E5", hash_generated_field = "45B02C2955F0D136C014E9DC60FE3184")

    private int mNextFocusLeftId = View.NO_ID;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.518 -0400", hash_original_field = "A47FAC14D63975AE3196CF8FC5EF36FD", hash_generated_field = "DF84F09C311C486A086B9C7EA2243503")

    private int mNextFocusRightId = View.NO_ID;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.518 -0400", hash_original_field = "EA75E9C31361CFF469517E9FD54298D6", hash_generated_field = "9F4730280C31C2719C1F46BE8E8450BA")

    private int mNextFocusUpId = View.NO_ID;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.518 -0400", hash_original_field = "A2B6D0B87912715ADB1AD5C9738CF374", hash_generated_field = "319D75290A4647F72AD3D5A42A864E5C")

    private int mNextFocusDownId = View.NO_ID;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.518 -0400", hash_original_field = "B00173086AA038860B98671358FAAC9B", hash_generated_field = "218707A9C3C12F8433C4FECF627C213D")

    int mNextFocusForwardId = View.NO_ID;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.518 -0400", hash_original_field = "956789F3DA470AD87E91A7076E41578B", hash_generated_field = "AAAA968A40447481F73888524A1890C6")

    private CheckForLongPress mPendingCheckForLongPress;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.518 -0400", hash_original_field = "775B249E2D7CD12DF12303812684BB7B", hash_generated_field = "B8AF3727C0596C63ED7DB54BAD71671F")

    private CheckForTap mPendingCheckForTap = null;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.518 -0400", hash_original_field = "83D78F1B989F8D62D88496F5EC6FF33F", hash_generated_field = "99E4AAED357F9D1925CADBAC4D6015A4")

    private PerformClick mPerformClick;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.518 -0400", hash_original_field = "3A6CE60FA7A6FA838255E6DD66DA4901", hash_generated_field = "4EE5120DCD6EBA553548CD3C570A5967")

    private SendViewScrolledAccessibilityEvent mSendViewScrolledAccessibilityEvent;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.518 -0400", hash_original_field = "1D15E7AFACCA72AA82FDEB1ED50C858E", hash_generated_field = "CDF30A3821A23955C4124811C1CA0AEA")

    private UnsetPressedState mUnsetPressedState;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.518 -0400", hash_original_field = "5A2F892720FCFD0DC61FB4EFF8239FF9", hash_generated_field = "751618E4ED7D5DBDA5B68F37D9865720")

    private boolean mHasPerformedLongPress;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.518 -0400", hash_original_field = "7B1C5936E045E46CDC7DE29B76B9E7F4", hash_generated_field = "F1A8CDC4E26D8D5C7DE32B2AF25C8740")

    @ViewDebug.ExportedProperty(category = "measurement") private int mMinHeight;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.518 -0400", hash_original_field = "2FB832D2671571BF4EC0C84F8DA6AA79", hash_generated_field = "4FCEB583348C4614E548F5AFAEC98A67")

    @ViewDebug.ExportedProperty(category = "measurement") private int mMinWidth;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.518 -0400", hash_original_field = "507FCACB9EF82E081076A9EEAEBF9B63", hash_generated_field = "E569734BF8D6E083A22CF46961923ECB")

    private TouchDelegate mTouchDelegate = null;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.518 -0400", hash_original_field = "6EDC251E57408BDC16F07004B6855199", hash_generated_field = "D92790A9877C98F11E8F179FB043C786")

    private int mDrawingCacheBackgroundColor = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.518 -0400", hash_original_field = "B97920548B94E92CFDC64D305AC20F69", hash_generated_field = "A0D36EEAADCE4EE07A5AC99F73C584E9")

    private ViewTreeObserver mFloatingTreeObserver;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.518 -0400", hash_original_field = "3DFFFAD10926598D18EEC50D61DE79CA", hash_generated_field = "3B323323DD6A6BF972666D993592C670")

    private int mTouchSlop;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.518 -0400", hash_original_field = "40F78C707625DBFDC188EF24918066C8", hash_generated_field = "031DB2A7C2250D8B7DE4F6272C82D45E")

    private ViewPropertyAnimator mAnimator = null;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.518 -0400", hash_original_field = "790487E83CF3B009D444C02267049200", hash_generated_field = "2607C5FC6CCACC3F7D721707ADA72671")

    private float mVerticalScrollFactor;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.518 -0400", hash_original_field = "87A1A37696C42230D03AF78A00037CA3", hash_generated_field = "4F21705D0823B901E43594B264DCB237")

    private int mVerticalScrollbarPosition;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.518 -0400", hash_original_field = "FFD6DFFEEF7D4409E878CD8773FFADFF", hash_generated_field = "76D9A2089F38CDD618BD49C87D710C3C")

    @ViewDebug.ExportedProperty(category = "drawing", mapping = {
            @ViewDebug.IntToString(from = LAYER_TYPE_NONE, to = "NONE"),
            @ViewDebug.IntToString(from = LAYER_TYPE_SOFTWARE, to = "SOFTWARE"),
            @ViewDebug.IntToString(from = LAYER_TYPE_HARDWARE, to = "HARDWARE")
    }) int mLayerType = LAYER_TYPE_NONE;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.518 -0400", hash_original_field = "5870A18F50D7C3B8DE43F07B2A8E2BC8", hash_generated_field = "DF81DF3E7FE84B1D663D7E8ECAF0C794")

    Paint mLayerPaint;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.518 -0400", hash_original_field = "FA0B46D25C5CFBAFDF9C3E8111032A29", hash_generated_field = "5423282DE76FBF7AAAD365160A805585")

    Rect mLocalDirtyRect;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.519 -0400", hash_original_field = "08B5E57DCB5E26E7EF1C647028B3CDC5", hash_generated_field = "D73DE13E5337A6B5E189A73C651B0933")

    private boolean mSendingHoverAccessibilityEvents;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.519 -0400", hash_original_field = "AB14B73F2A537D26873B7CD3721A2654", hash_generated_field = "ACE9AD3D63F4A66B9F893798ED18776A")

    AccessibilityDelegate mAccessibilityDelegate;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.519 -0400", hash_original_field = "56F776C2E6CE1ACD33CDE41CE78F02EC", hash_generated_field = "B72A5C45BF32E84602E6733FBFEC7DAD")

    @ViewDebug.ExportedProperty(category = "text", mapping = {
            @ViewDebug.IntToString(from = TEXT_DIRECTION_INHERIT, to = "INHERIT"),
            @ViewDebug.IntToString(from = TEXT_DIRECTION_FIRST_STRONG, to = "FIRST_STRONG"),
            @ViewDebug.IntToString(from = TEXT_DIRECTION_ANY_RTL, to = "ANY_RTL"),
            @ViewDebug.IntToString(from = TEXT_DIRECTION_LTR, to = "LTR"),
            @ViewDebug.IntToString(from = TEXT_DIRECTION_RTL, to = "RTL")
    }) private int mTextDirection = DEFAULT_TEXT_DIRECTION;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.519 -0400", hash_original_field = "CA7F7356F0500733AA9EAA872F25A83A", hash_generated_field = "318F54594F0F5ED162811E42E0595AEA")

    @ViewDebug.ExportedProperty(category = "text", mapping = {
            @ViewDebug.IntToString(from = TEXT_DIRECTION_INHERIT, to = "INHERIT"),
            @ViewDebug.IntToString(from = TEXT_DIRECTION_FIRST_STRONG, to = "FIRST_STRONG"),
            @ViewDebug.IntToString(from = TEXT_DIRECTION_ANY_RTL, to = "ANY_RTL"),
            @ViewDebug.IntToString(from = TEXT_DIRECTION_LTR, to = "LTR"),
            @ViewDebug.IntToString(from = TEXT_DIRECTION_RTL, to = "RTL")
    }) private int mResolvedTextDirection = TEXT_DIRECTION_INHERIT;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.519 -0400", hash_original_field = "EFB0BA2843C7293EEB82F8592A2A0298", hash_generated_field = "91250FC4721A0CB76E639A2E6754D1A8")

    protected InputEventConsistencyVerifier mInputEventConsistencyVerifier = InputEventConsistencyVerifier.isInstrumentationEnabled() ?
                    new InputEventConsistencyVerifier(this, 0) : null;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.522 -0400", hash_original_method = "6E480C32A7FC910695FE07C33ABF7A7A", hash_generated_method = "AD454F01B4A79F64B85B96CBA3B68A9E")
    public  View(Context context) {
        mContext = context;
        mResources = context != null ? context.getResources() : null;
        mViewFlags = SOUND_EFFECTS_ENABLED | HAPTIC_FEEDBACK_ENABLED | LAYOUT_DIRECTION_INHERIT;
        mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        setOverScrollMode(OVER_SCROLL_IF_CONTENT_SCROLLS);
        mUserPaddingStart = -1;
        mUserPaddingEnd = -1;
        mUserPaddingRelative = false;
        // ---------- Original Method ----------
        //mContext = context;
        //mResources = context != null ? context.getResources() : null;
        //mViewFlags = SOUND_EFFECTS_ENABLED | HAPTIC_FEEDBACK_ENABLED | LAYOUT_DIRECTION_INHERIT;
        //mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        //setOverScrollMode(OVER_SCROLL_IF_CONTENT_SCROLLS);
        //mUserPaddingStart = -1;
        //mUserPaddingEnd = -1;
        //mUserPaddingRelative = false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.527 -0400", hash_original_method = "7A0AD99F840E8369EC476A6B56BA8ADA", hash_generated_method = "00397D0AF16E98E30CF9582D6D39EE0E")
    public  View(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
        addTaint(context.getTaint());
        addTaint(attrs.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.555 -0400", hash_original_method = "F8E7269105FB2D522A5F7FAB2F89EE95", hash_generated_method = "25CCF86D206226DD1BD9A24E986ED0BF")
    public  View(Context context, AttributeSet attrs, int defStyle) {
        this(context);
        TypedArray a;
        a = context.obtainStyledAttributes(attrs, com.android.internal.R.styleable.View,
                defStyle, 0);
        Drawable background;
        background = null;
        int leftPadding;
        leftPadding = -1;
        int topPadding;
        topPadding = -1;
        int rightPadding;
        rightPadding = -1;
        int bottomPadding;
        bottomPadding = -1;
        int startPadding;
        startPadding = -1;
        int endPadding;
        endPadding = -1;
        int padding;
        padding = -1;
        int viewFlagValues;
        viewFlagValues = 0;
        int viewFlagMasks;
        viewFlagMasks = 0;
        boolean setScrollContainer;
        setScrollContainer = false;
        int x;
        x = 0;
        int y;
        y = 0;
        float tx;
        tx = 0;
        float ty;
        ty = 0;
        float rotation;
        rotation = 0;
        float rotationX;
        rotationX = 0;
        float rotationY;
        rotationY = 0;
        float sx;
        sx = 1f;
        float sy;
        sy = 1f;
        boolean transformSet;
        transformSet = false;
        int scrollbarStyle;
        scrollbarStyle = SCROLLBARS_INSIDE_OVERLAY;
        int overScrollMode;
        overScrollMode = mOverScrollMode;
        int N;
        N = a.getIndexCount();
        {
            int i;
            i = 0;
            {
                int attr;
                attr = a.getIndex(i);
                //Begin case com.android.internal.R.styleable.View_background 
                background = a.getDrawable(attr);
                //End case com.android.internal.R.styleable.View_background 
                //Begin case com.android.internal.R.styleable.View_padding 
                padding = a.getDimensionPixelSize(attr, -1);
                //End case com.android.internal.R.styleable.View_padding 
                //Begin case com.android.internal.R.styleable.View_paddingLeft 
                leftPadding = a.getDimensionPixelSize(attr, -1);
                //End case com.android.internal.R.styleable.View_paddingLeft 
                //Begin case com.android.internal.R.styleable.View_paddingTop 
                topPadding = a.getDimensionPixelSize(attr, -1);
                //End case com.android.internal.R.styleable.View_paddingTop 
                //Begin case com.android.internal.R.styleable.View_paddingRight 
                rightPadding = a.getDimensionPixelSize(attr, -1);
                //End case com.android.internal.R.styleable.View_paddingRight 
                //Begin case com.android.internal.R.styleable.View_paddingBottom 
                bottomPadding = a.getDimensionPixelSize(attr, -1);
                //End case com.android.internal.R.styleable.View_paddingBottom 
                //Begin case com.android.internal.R.styleable.View_paddingStart 
                startPadding = a.getDimensionPixelSize(attr, -1);
                //End case com.android.internal.R.styleable.View_paddingStart 
                //Begin case com.android.internal.R.styleable.View_paddingEnd 
                endPadding = a.getDimensionPixelSize(attr, -1);
                //End case com.android.internal.R.styleable.View_paddingEnd 
                //Begin case com.android.internal.R.styleable.View_scrollX 
                x = a.getDimensionPixelOffset(attr, 0);
                //End case com.android.internal.R.styleable.View_scrollX 
                //Begin case com.android.internal.R.styleable.View_scrollY 
                y = a.getDimensionPixelOffset(attr, 0);
                //End case com.android.internal.R.styleable.View_scrollY 
                //Begin case com.android.internal.R.styleable.View_alpha 
                setAlpha(a.getFloat(attr, 1f));
                //End case com.android.internal.R.styleable.View_alpha 
                //Begin case com.android.internal.R.styleable.View_transformPivotX 
                setPivotX(a.getDimensionPixelOffset(attr, 0));
                //End case com.android.internal.R.styleable.View_transformPivotX 
                //Begin case com.android.internal.R.styleable.View_transformPivotY 
                setPivotY(a.getDimensionPixelOffset(attr, 0));
                //End case com.android.internal.R.styleable.View_transformPivotY 
                //Begin case com.android.internal.R.styleable.View_translationX 
                tx = a.getDimensionPixelOffset(attr, 0);
                //End case com.android.internal.R.styleable.View_translationX 
                //Begin case com.android.internal.R.styleable.View_translationX 
                transformSet = true;
                //End case com.android.internal.R.styleable.View_translationX 
                //Begin case com.android.internal.R.styleable.View_translationY 
                ty = a.getDimensionPixelOffset(attr, 0);
                //End case com.android.internal.R.styleable.View_translationY 
                //Begin case com.android.internal.R.styleable.View_translationY 
                transformSet = true;
                //End case com.android.internal.R.styleable.View_translationY 
                //Begin case com.android.internal.R.styleable.View_rotation 
                rotation = a.getFloat(attr, 0);
                //End case com.android.internal.R.styleable.View_rotation 
                //Begin case com.android.internal.R.styleable.View_rotation 
                transformSet = true;
                //End case com.android.internal.R.styleable.View_rotation 
                //Begin case com.android.internal.R.styleable.View_rotationX 
                rotationX = a.getFloat(attr, 0);
                //End case com.android.internal.R.styleable.View_rotationX 
                //Begin case com.android.internal.R.styleable.View_rotationX 
                transformSet = true;
                //End case com.android.internal.R.styleable.View_rotationX 
                //Begin case com.android.internal.R.styleable.View_rotationY 
                rotationY = a.getFloat(attr, 0);
                //End case com.android.internal.R.styleable.View_rotationY 
                //Begin case com.android.internal.R.styleable.View_rotationY 
                transformSet = true;
                //End case com.android.internal.R.styleable.View_rotationY 
                //Begin case com.android.internal.R.styleable.View_scaleX 
                sx = a.getFloat(attr, 1f);
                //End case com.android.internal.R.styleable.View_scaleX 
                //Begin case com.android.internal.R.styleable.View_scaleX 
                transformSet = true;
                //End case com.android.internal.R.styleable.View_scaleX 
                //Begin case com.android.internal.R.styleable.View_scaleY 
                sy = a.getFloat(attr, 1f);
                //End case com.android.internal.R.styleable.View_scaleY 
                //Begin case com.android.internal.R.styleable.View_scaleY 
                transformSet = true;
                //End case com.android.internal.R.styleable.View_scaleY 
                //Begin case com.android.internal.R.styleable.View_id 
                mID = a.getResourceId(attr, NO_ID);
                //End case com.android.internal.R.styleable.View_id 
                //Begin case com.android.internal.R.styleable.View_tag 
                mTag = a.getText(attr);
                //End case com.android.internal.R.styleable.View_tag 
                //Begin case com.android.internal.R.styleable.View_fitsSystemWindows 
                {
                    boolean var45591D90FC7AE21A8CB6FE28079E45A9_1174909501 = (a.getBoolean(attr, false));
                    {
                        viewFlagValues |= FITS_SYSTEM_WINDOWS;
                        viewFlagMasks |= FITS_SYSTEM_WINDOWS;
                    } //End block
                } //End collapsed parenthetic
                //End case com.android.internal.R.styleable.View_fitsSystemWindows 
                //Begin case com.android.internal.R.styleable.View_focusable 
                {
                    boolean var45591D90FC7AE21A8CB6FE28079E45A9_953400050 = (a.getBoolean(attr, false));
                    {
                        viewFlagValues |= FOCUSABLE;
                        viewFlagMasks |= FOCUSABLE_MASK;
                    } //End block
                } //End collapsed parenthetic
                //End case com.android.internal.R.styleable.View_focusable 
                //Begin case com.android.internal.R.styleable.View_focusableInTouchMode 
                {
                    boolean var45591D90FC7AE21A8CB6FE28079E45A9_634421944 = (a.getBoolean(attr, false));
                    {
                        viewFlagValues |= FOCUSABLE_IN_TOUCH_MODE | FOCUSABLE;
                        viewFlagMasks |= FOCUSABLE_IN_TOUCH_MODE | FOCUSABLE_MASK;
                    } //End block
                } //End collapsed parenthetic
                //End case com.android.internal.R.styleable.View_focusableInTouchMode 
                //Begin case com.android.internal.R.styleable.View_clickable 
                {
                    boolean var45591D90FC7AE21A8CB6FE28079E45A9_1361886658 = (a.getBoolean(attr, false));
                    {
                        viewFlagValues |= CLICKABLE;
                        viewFlagMasks |= CLICKABLE;
                    } //End block
                } //End collapsed parenthetic
                //End case com.android.internal.R.styleable.View_clickable 
                //Begin case com.android.internal.R.styleable.View_longClickable 
                {
                    boolean var45591D90FC7AE21A8CB6FE28079E45A9_1716038104 = (a.getBoolean(attr, false));
                    {
                        viewFlagValues |= LONG_CLICKABLE;
                        viewFlagMasks |= LONG_CLICKABLE;
                    } //End block
                } //End collapsed parenthetic
                //End case com.android.internal.R.styleable.View_longClickable 
                //Begin case com.android.internal.R.styleable.View_saveEnabled 
                {
                    boolean varE83A5B5DD6F1EFE4CE2BCD602A46684B_478583159 = (!a.getBoolean(attr, true));
                    {
                        viewFlagValues |= SAVE_DISABLED;
                        viewFlagMasks |= SAVE_DISABLED_MASK;
                    } //End block
                } //End collapsed parenthetic
                //End case com.android.internal.R.styleable.View_saveEnabled 
                //Begin case com.android.internal.R.styleable.View_duplicateParentState 
                {
                    boolean var45591D90FC7AE21A8CB6FE28079E45A9_1201251825 = (a.getBoolean(attr, false));
                    {
                        viewFlagValues |= DUPLICATE_PARENT_STATE;
                        viewFlagMasks |= DUPLICATE_PARENT_STATE;
                    } //End block
                } //End collapsed parenthetic
                //End case com.android.internal.R.styleable.View_duplicateParentState 
                //Begin case com.android.internal.R.styleable.View_visibility 
                int visibility;
                visibility = a.getInt(attr, 0);
                //End case com.android.internal.R.styleable.View_visibility 
                //Begin case com.android.internal.R.styleable.View_visibility 
                {
                    viewFlagValues |= VISIBILITY_FLAGS[visibility];
                    viewFlagMasks |= VISIBILITY_MASK;
                } //End block
                //End case com.android.internal.R.styleable.View_visibility 
                //Begin case com.android.internal.R.styleable.View_layoutDirection 
                viewFlagValues &= ~LAYOUT_DIRECTION_MASK;
                //End case com.android.internal.R.styleable.View_layoutDirection 
                //Begin case com.android.internal.R.styleable.View_layoutDirection 
                int layoutDirection;
                layoutDirection = a.getInt(attr, -1);
                //End case com.android.internal.R.styleable.View_layoutDirection 
                //Begin case com.android.internal.R.styleable.View_layoutDirection 
                {
                    viewFlagValues |= LAYOUT_DIRECTION_FLAGS[layoutDirection];
                } //End block
                {
                    viewFlagValues |= LAYOUT_DIRECTION_DEFAULT;
                } //End block
                //End case com.android.internal.R.styleable.View_layoutDirection 
                //Begin case com.android.internal.R.styleable.View_layoutDirection 
                viewFlagMasks |= LAYOUT_DIRECTION_MASK;
                //End case com.android.internal.R.styleable.View_layoutDirection 
                //Begin case com.android.internal.R.styleable.View_drawingCacheQuality 
                int cacheQuality;
                cacheQuality = a.getInt(attr, 0);
                //End case com.android.internal.R.styleable.View_drawingCacheQuality 
                //Begin case com.android.internal.R.styleable.View_drawingCacheQuality 
                {
                    viewFlagValues |= DRAWING_CACHE_QUALITY_FLAGS[cacheQuality];
                    viewFlagMasks |= DRAWING_CACHE_QUALITY_MASK;
                } //End block
                //End case com.android.internal.R.styleable.View_drawingCacheQuality 
                //Begin case com.android.internal.R.styleable.View_contentDescription 
                mContentDescription = a.getString(attr);
                //End case com.android.internal.R.styleable.View_contentDescription 
                //Begin case com.android.internal.R.styleable.View_soundEffectsEnabled 
                {
                    boolean varE83A5B5DD6F1EFE4CE2BCD602A46684B_795756361 = (!a.getBoolean(attr, true));
                    {
                        viewFlagValues &= ~SOUND_EFFECTS_ENABLED;
                        viewFlagMasks |= SOUND_EFFECTS_ENABLED;
                    } //End block
                } //End collapsed parenthetic
                //End case com.android.internal.R.styleable.View_soundEffectsEnabled 
                //Begin case com.android.internal.R.styleable.View_hapticFeedbackEnabled 
                {
                    boolean varE83A5B5DD6F1EFE4CE2BCD602A46684B_1951922419 = (!a.getBoolean(attr, true));
                    {
                        viewFlagValues &= ~HAPTIC_FEEDBACK_ENABLED;
                        viewFlagMasks |= HAPTIC_FEEDBACK_ENABLED;
                    } //End block
                } //End collapsed parenthetic
                //End case com.android.internal.R.styleable.View_hapticFeedbackEnabled 
                //Begin case R.styleable.View_scrollbars 
                int scrollbars;
                scrollbars = a.getInt(attr, SCROLLBARS_NONE);
                //End case R.styleable.View_scrollbars 
                //Begin case R.styleable.View_scrollbars 
                {
                    viewFlagValues |= scrollbars;
                    viewFlagMasks |= SCROLLBARS_MASK;
                    initializeScrollbars(a);
                } //End block
                //End case R.styleable.View_scrollbars 
                //Begin case R.styleable.View_fadingEdge 
                {
                    boolean varC070C09F5C0916551B09381C0852B394_1566709159 = (context.getApplicationInfo().targetSdkVersion >= ICE_CREAM_SANDWICH);
                } //End collapsed parenthetic
                //End case R.styleable.View_fadingEdge 
                //Begin case R.styleable.View_requiresFadingEdge 
                int fadingEdge;
                fadingEdge = a.getInt(attr, FADING_EDGE_NONE);
                //End case R.styleable.View_requiresFadingEdge 
                //Begin case R.styleable.View_requiresFadingEdge 
                {
                    viewFlagValues |= fadingEdge;
                    viewFlagMasks |= FADING_EDGE_MASK;
                    initializeFadingEdge(a);
                } //End block
                //End case R.styleable.View_requiresFadingEdge 
                //Begin case R.styleable.View_scrollbarStyle 
                scrollbarStyle = a.getInt(attr, SCROLLBARS_INSIDE_OVERLAY);
                //End case R.styleable.View_scrollbarStyle 
                //Begin case R.styleable.View_scrollbarStyle 
                {
                    viewFlagValues |= scrollbarStyle & SCROLLBARS_STYLE_MASK;
                    viewFlagMasks |= SCROLLBARS_STYLE_MASK;
                } //End block
                //End case R.styleable.View_scrollbarStyle 
                //Begin case R.styleable.View_isScrollContainer 
                setScrollContainer = true;
                //End case R.styleable.View_isScrollContainer 
                //Begin case R.styleable.View_isScrollContainer 
                {
                    boolean var45591D90FC7AE21A8CB6FE28079E45A9_1421491685 = (a.getBoolean(attr, false));
                    {
                        setScrollContainer(true);
                    } //End block
                } //End collapsed parenthetic
                //End case R.styleable.View_isScrollContainer 
                //Begin case com.android.internal.R.styleable.View_keepScreenOn 
                {
                    boolean var45591D90FC7AE21A8CB6FE28079E45A9_1632148898 = (a.getBoolean(attr, false));
                    {
                        viewFlagValues |= KEEP_SCREEN_ON;
                        viewFlagMasks |= KEEP_SCREEN_ON;
                    } //End block
                } //End collapsed parenthetic
                //End case com.android.internal.R.styleable.View_keepScreenOn 
                //Begin case R.styleable.View_filterTouchesWhenObscured 
                {
                    boolean var45591D90FC7AE21A8CB6FE28079E45A9_205751524 = (a.getBoolean(attr, false));
                    {
                        viewFlagValues |= FILTER_TOUCHES_WHEN_OBSCURED;
                        viewFlagMasks |= FILTER_TOUCHES_WHEN_OBSCURED;
                    } //End block
                } //End collapsed parenthetic
                //End case R.styleable.View_filterTouchesWhenObscured 
                //Begin case R.styleable.View_nextFocusLeft 
                mNextFocusLeftId = a.getResourceId(attr, View.NO_ID);
                //End case R.styleable.View_nextFocusLeft 
                //Begin case R.styleable.View_nextFocusRight 
                mNextFocusRightId = a.getResourceId(attr, View.NO_ID);
                //End case R.styleable.View_nextFocusRight 
                //Begin case R.styleable.View_nextFocusUp 
                mNextFocusUpId = a.getResourceId(attr, View.NO_ID);
                //End case R.styleable.View_nextFocusUp 
                //Begin case R.styleable.View_nextFocusDown 
                mNextFocusDownId = a.getResourceId(attr, View.NO_ID);
                //End case R.styleable.View_nextFocusDown 
                //Begin case R.styleable.View_nextFocusForward 
                mNextFocusForwardId = a.getResourceId(attr, View.NO_ID);
                //End case R.styleable.View_nextFocusForward 
                //Begin case R.styleable.View_minWidth 
                mMinWidth = a.getDimensionPixelSize(attr, 0);
                //End case R.styleable.View_minWidth 
                //Begin case R.styleable.View_minHeight 
                mMinHeight = a.getDimensionPixelSize(attr, 0);
                //End case R.styleable.View_minHeight 
                //Begin case R.styleable.View_onClick 
                {
                    boolean var493A86E51AC82FCCEFBD5D9BA92432B0_762149412 = (context.isRestricted());
                    {
                        if (DroidSafeAndroidRuntime.control) throw new IllegalStateException("The android:onClick attribute cannot "
                                + "be used within a restricted context");
                    } //End block
                } //End collapsed parenthetic
                //End case R.styleable.View_onClick 
                //Begin case R.styleable.View_onClick 
                String handlerName;
                handlerName = a.getString(attr);
                //End case R.styleable.View_onClick 
                //Begin case R.styleable.View_onClick 
                {
                    setOnClickListener(new OnClickListener() {                        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.547 -0400", hash_original_field = "C78BEDFC523DB73DF63EFB071AF1C35B", hash_generated_field = "DD76E21366B40D00A372B0BC0CE30131")
                        private Method mHandler;
                        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.552 -0400", hash_original_method = "E9EFDD10534D1BAF541333BA74E853ED", hash_generated_method = "200124255911131B73C555F1D7AEDCFE")
                        public void onClick(View v) {
                            //DSFIXME:  CODE0009: Possible callback target function detected
                            {
                                try 
                                {
                                    mHandler = getContext().getClass().getMethod(handlerName,
                                                View.class);
                                } //End block
                                catch (NoSuchMethodException e)
                                {
                                    int id;
                                    id = getId();
                                    String idText;
                                    idText = "";
                                    idText = " with id '"
                                                + getContext().getResources().getResourceEntryName(
                                                    id) + "'";
                                    if (DroidSafeAndroidRuntime.control) throw new IllegalStateException("Could not find a method " +
                                                handlerName + "(View) in the activity "
                                                + getContext().getClass() + " for onClick handler"
                                                + " on view " + View.this.getClass() + idText, e);
                                } //End block
                            } //End block
                            try 
                            {
                                mHandler.invoke(getContext(), View.this);
                            } //End block
                            catch (IllegalAccessException e)
                            {
                                if (DroidSafeAndroidRuntime.control) throw new IllegalStateException("Could not execute non "
                                            + "public method of the activity", e);
                            } //End block
                            catch (InvocationTargetException e)
                            {
                                if (DroidSafeAndroidRuntime.control) throw new IllegalStateException("Could not execute "
                                            + "method of the activity", e);
                            } //End block
                            addTaint(v.getTaint());
                            // ---------- Original Method ----------
                            // Original Method Too Long, Refer to Original Implementation
                        }
});
                } //End block
                //End case R.styleable.View_onClick 
                //Begin case R.styleable.View_overScrollMode 
                overScrollMode = a.getInt(attr, OVER_SCROLL_IF_CONTENT_SCROLLS);
                //End case R.styleable.View_overScrollMode 
                //Begin case R.styleable.View_verticalScrollbarPosition 
                mVerticalScrollbarPosition = a.getInt(attr, SCROLLBAR_POSITION_DEFAULT);
                //End case R.styleable.View_verticalScrollbarPosition 
                //Begin case R.styleable.View_layerType 
                setLayerType(a.getInt(attr, LAYER_TYPE_NONE), null);
                //End case R.styleable.View_layerType 
                //Begin case R.styleable.View_textDirection 
                mTextDirection = a.getInt(attr, DEFAULT_TEXT_DIRECTION);
                //End case R.styleable.View_textDirection 
            } //End block
        } //End collapsed parenthetic
        a.recycle();
        setOverScrollMode(overScrollMode);
        {
            setBackgroundDrawable(background);
        } //End block
        mUserPaddingRelative = (startPadding >= 0 || endPadding >= 0);
        mUserPaddingStart = startPadding;
        mUserPaddingEnd = endPadding;
        {
            leftPadding = padding;
            topPadding = padding;
            rightPadding = padding;
            bottomPadding = padding;
        } //End block
        setPadding(leftPadding >= 0 ? leftPadding : mPaddingLeft,
                topPadding >= 0 ? topPadding : mPaddingTop,
                rightPadding >= 0 ? rightPadding : mPaddingRight,
                bottomPadding >= 0 ? bottomPadding : mPaddingBottom);
        {
            setFlags(viewFlagValues, viewFlagMasks);
        } //End block
        {
            recomputePadding();
        } //End block
        {
            scrollTo(x, y);
        } //End block
        {
            setTranslationX(tx);
            setTranslationY(ty);
            setRotation(rotation);
            setRotationX(rotationX);
            setRotationY(rotationY);
            setScaleX(sx);
            setScaleY(sy);
        } //End block
        {
            setScrollContainer(true);
        } //End block
        computeOpaqueFlags();
        addTaint(context.getTaint());
        addTaint(attrs.getTaint());
        addTaint(defStyle);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.566 -0400", hash_original_method = "5C3A364FECC6F7D07E7A546170C25E98", hash_generated_method = "32A2A5FFE588BE14FBF7F5D017C5A252")
      View() {
        mResources = null;
        // ---------- Original Method ----------
        //mResources = null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.567 -0400", hash_original_method = "F39CEBF0E5E47A818635618D8F975382", hash_generated_method = "D576B5DC26D7FBDAD21E367A9288C3E9")
    protected void initializeFadingEdge(TypedArray a) {
        initScrollCache();
        mScrollCache.fadingEdgeLength = a.getDimensionPixelSize(
                R.styleable.View_fadingEdgeLength,
                ViewConfiguration.get(mContext).getScaledFadingEdgeLength());
        // ---------- Original Method ----------
        //initScrollCache();
        //mScrollCache.fadingEdgeLength = a.getDimensionPixelSize(
                //R.styleable.View_fadingEdgeLength,
                //ViewConfiguration.get(mContext).getScaledFadingEdgeLength());
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.575 -0400", hash_original_method = "48BE981E65F7E857DD7A9FF8EF5006FF", hash_generated_method = "58ACC10CF2130BFDDE5FF1BCE9AE75B0")
    public int getVerticalFadingEdgeLength() {
        {
            boolean var50B16E908CD6883BB4A53F1CCAB8FFC0_933161326 = (isVerticalFadingEdgeEnabled());
            {
                ScrollabilityCache cache;
                cache = mScrollCache;
            } //End block
        } //End collapsed parenthetic
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1873321368 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1873321368;
        // ---------- Original Method ----------
        //if (isVerticalFadingEdgeEnabled()) {
            //ScrollabilityCache cache = mScrollCache;
            //if (cache != null) {
                //return cache.fadingEdgeLength;
            //}
        //}
        //return 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.576 -0400", hash_original_method = "F316E2F78DFC9160954B8650C58C0898", hash_generated_method = "09B2620993C628341922180F596184D1")
    public void setFadingEdgeLength(int length) {
        initScrollCache();
        mScrollCache.fadingEdgeLength = length;
        // ---------- Original Method ----------
        //initScrollCache();
        //mScrollCache.fadingEdgeLength = length;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.576 -0400", hash_original_method = "A8651530AFA26393AFB5F6425B22CDCD", hash_generated_method = "45590DF9C2BD2DB0064F7EC6DCF6122A")
    public int getHorizontalFadingEdgeLength() {
        {
            boolean var5D77CA7D5D90FF39CB3E108D33083F4D_2058185855 = (isHorizontalFadingEdgeEnabled());
            {
                ScrollabilityCache cache;
                cache = mScrollCache;
            } //End block
        } //End collapsed parenthetic
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1358754443 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1358754443;
        // ---------- Original Method ----------
        //if (isHorizontalFadingEdgeEnabled()) {
            //ScrollabilityCache cache = mScrollCache;
            //if (cache != null) {
                //return cache.fadingEdgeLength;
            //}
        //}
        //return 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.576 -0400", hash_original_method = "9E8BEE4EA7290E77910774FBF44231C2", hash_generated_method = "E7F1AB9C5251F1F3C14956C04EA5012E")
    public int getVerticalScrollbarWidth() {
        ScrollabilityCache cache;
        cache = mScrollCache;
        {
            ScrollBarDrawable scrollBar;
            scrollBar = cache.scrollBar;
            {
                int size;
                size = scrollBar.getSize(true);
                {
                    size = cache.scrollBarSize;
                } //End block
            } //End block
        } //End block
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_799733435 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_799733435;
        // ---------- Original Method ----------
        //ScrollabilityCache cache = mScrollCache;
        //if (cache != null) {
            //ScrollBarDrawable scrollBar = cache.scrollBar;
            //if (scrollBar != null) {
                //int size = scrollBar.getSize(true);
                //if (size <= 0) {
                    //size = cache.scrollBarSize;
                //}
                //return size;
            //}
            //return 0;
        //}
        //return 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.577 -0400", hash_original_method = "6872C13C59C68BCC5CF5DE777A5D5AA0", hash_generated_method = "0B1FF40D97898AC575B6AF0B00137FBB")
    protected int getHorizontalScrollbarHeight() {
        ScrollabilityCache cache;
        cache = mScrollCache;
        {
            ScrollBarDrawable scrollBar;
            scrollBar = cache.scrollBar;
            {
                int size;
                size = scrollBar.getSize(false);
                {
                    size = cache.scrollBarSize;
                } //End block
            } //End block
        } //End block
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1647729718 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1647729718;
        // ---------- Original Method ----------
        //ScrollabilityCache cache = mScrollCache;
        //if (cache != null) {
            //ScrollBarDrawable scrollBar = cache.scrollBar;
            //if (scrollBar != null) {
                //int size = scrollBar.getSize(false);
                //if (size <= 0) {
                    //size = cache.scrollBarSize;
                //}
                //return size;
            //}
            //return 0;
        //}
        //return 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.578 -0400", hash_original_method = "92AEC3F31170B251C0CC405CA4D3250A", hash_generated_method = "D4A9DA59DC4CF868D38B85486F0B8455")
    protected void initializeScrollbars(TypedArray a) {
        initScrollCache();
        ScrollabilityCache scrollabilityCache;
        scrollabilityCache = mScrollCache;
        {
            scrollabilityCache.scrollBar = new ScrollBarDrawable();
        } //End block
        boolean fadeScrollbars;
        fadeScrollbars = a.getBoolean(R.styleable.View_fadeScrollbars, true);
        {
            scrollabilityCache.state = ScrollabilityCache.ON;
        } //End block
        scrollabilityCache.fadeScrollBars = fadeScrollbars;
        scrollabilityCache.scrollBarFadeDuration = a.getInt(
                R.styleable.View_scrollbarFadeDuration, ViewConfiguration
                        .getScrollBarFadeDuration());
        scrollabilityCache.scrollBarDefaultDelayBeforeFade = a.getInt(
                R.styleable.View_scrollbarDefaultDelayBeforeFade,
                ViewConfiguration.getScrollDefaultDelay());
        scrollabilityCache.scrollBarSize = a.getDimensionPixelSize(
                com.android.internal.R.styleable.View_scrollbarSize,
                ViewConfiguration.get(mContext).getScaledScrollBarSize());
        Drawable track;
        track = a.getDrawable(R.styleable.View_scrollbarTrackHorizontal);
        scrollabilityCache.scrollBar.setHorizontalTrackDrawable(track);
        Drawable thumb;
        thumb = a.getDrawable(R.styleable.View_scrollbarThumbHorizontal);
        {
            scrollabilityCache.scrollBar.setHorizontalThumbDrawable(thumb);
        } //End block
        boolean alwaysDraw;
        alwaysDraw = a.getBoolean(R.styleable.View_scrollbarAlwaysDrawHorizontalTrack,
                false);
        {
            scrollabilityCache.scrollBar.setAlwaysDrawHorizontalTrack(true);
        } //End block
        track = a.getDrawable(R.styleable.View_scrollbarTrackVertical);
        scrollabilityCache.scrollBar.setVerticalTrackDrawable(track);
        thumb = a.getDrawable(R.styleable.View_scrollbarThumbVertical);
        {
            scrollabilityCache.scrollBar.setVerticalThumbDrawable(thumb);
        } //End block
        alwaysDraw = a.getBoolean(R.styleable.View_scrollbarAlwaysDrawVerticalTrack,
                false);
        {
            scrollabilityCache.scrollBar.setAlwaysDrawVerticalTrack(true);
        } //End block
        resolvePadding();
        addTaint(a.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.579 -0400", hash_original_method = "E049E8AF463EFBD39046D8F102EAF6B1", hash_generated_method = "006228A8170D06675B7944AFD610FE31")
    private void initScrollCache() {
        {
            mScrollCache = new ScrollabilityCache(ViewConfiguration.get(mContext), this);
        } //End block
        // ---------- Original Method ----------
        //if (mScrollCache == null) {
            //mScrollCache = new ScrollabilityCache(ViewConfiguration.get(mContext), this);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.579 -0400", hash_original_method = "6A347D034BA88A40E4761231BE70B8AA", hash_generated_method = "CBC9F0E4CC2229FC5210E4575370C152")
    public void setVerticalScrollbarPosition(int position) {
        {
            mVerticalScrollbarPosition = position;
            computeOpaqueFlags();
            resolvePadding();
        } //End block
        // ---------- Original Method ----------
        //if (mVerticalScrollbarPosition != position) {
            //mVerticalScrollbarPosition = position;
            //computeOpaqueFlags();
            //resolvePadding();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.588 -0400", hash_original_method = "0B028AFE1E9609D00D97AC9B679932DA", hash_generated_method = "4DA31C18DBD0BDABAD3EBCA512FA20E8")
    public int getVerticalScrollbarPosition() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1857415775 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1857415775;
        // ---------- Original Method ----------
        //return mVerticalScrollbarPosition;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.588 -0400", hash_original_method = "3F6307E0FF2B24CF42D639D72702E7A3", hash_generated_method = "395C77A6BE502545E0415AC0D150B74E")
     ListenerInfo getListenerInfo() {
        ListenerInfo varB4EAC82CA7396A68D541C85D26508E83_1266160704 = null; //Variable for return #1
        ListenerInfo varB4EAC82CA7396A68D541C85D26508E83_1735397516 = null; //Variable for return #2
        {
            varB4EAC82CA7396A68D541C85D26508E83_1266160704 = mListenerInfo;
        } //End block
        mListenerInfo = new ListenerInfo();
        varB4EAC82CA7396A68D541C85D26508E83_1735397516 = mListenerInfo;
        ListenerInfo varA7E53CE21691AB073D9660D615818899_1153404923; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1153404923 = varB4EAC82CA7396A68D541C85D26508E83_1266160704;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1153404923 = varB4EAC82CA7396A68D541C85D26508E83_1735397516;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1153404923.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1153404923;
        // ---------- Original Method ----------
        //if (mListenerInfo != null) {
            //return mListenerInfo;
        //}
        //mListenerInfo = new ListenerInfo();
        //return mListenerInfo;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.589 -0400", hash_original_method = "D8AB5E19AA18F69BACA6EC368D2591FE", hash_generated_method = "B562B80D34F4061A6A11FD4C9AB8BEF1")
    public void setOnFocusChangeListener(OnFocusChangeListener l) {
        getListenerInfo().mOnFocusChangeListener = l;
        addTaint(l.getTaint());
        // ---------- Original Method ----------
        //getListenerInfo().mOnFocusChangeListener = l;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.589 -0400", hash_original_method = "E2DB3817E7DB5D233E4A7D6EADE958A3", hash_generated_method = "A2120A1E534B8DA4221275650E57E6A4")
    public void addOnLayoutChangeListener(OnLayoutChangeListener listener) {
        ListenerInfo li;
        li = getListenerInfo();
        {
            li.mOnLayoutChangeListeners = new ArrayList<OnLayoutChangeListener>();
        } //End block
        {
            boolean var5BC5FBAFE932C29989D14499066114E0_545384780 = (!li.mOnLayoutChangeListeners.contains(listener));
            {
                li.mOnLayoutChangeListeners.add(listener);
            } //End block
        } //End collapsed parenthetic
        addTaint(listener.getTaint());
        // ---------- Original Method ----------
        //ListenerInfo li = getListenerInfo();
        //if (li.mOnLayoutChangeListeners == null) {
            //li.mOnLayoutChangeListeners = new ArrayList<OnLayoutChangeListener>();
        //}
        //if (!li.mOnLayoutChangeListeners.contains(listener)) {
            //li.mOnLayoutChangeListeners.add(listener);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.589 -0400", hash_original_method = "98A56C49B0A9E0F5D269641F74288A13", hash_generated_method = "F56A9D67656BD49E879A39B7109B9958")
    public void removeOnLayoutChangeListener(OnLayoutChangeListener listener) {
        ListenerInfo li;
        li = mListenerInfo;
        li.mOnLayoutChangeListeners.remove(listener);
        addTaint(listener.getTaint());
        // ---------- Original Method ----------
        //ListenerInfo li = mListenerInfo;
        //if (li == null || li.mOnLayoutChangeListeners == null) {
            //return;
        //}
        //li.mOnLayoutChangeListeners.remove(listener);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.598 -0400", hash_original_method = "BCC986125DE454FD64FA8CF6FF7B3375", hash_generated_method = "E6462A31520B780AD75390D70695F98D")
    public void addOnAttachStateChangeListener(OnAttachStateChangeListener listener) {
        ListenerInfo li;
        li = getListenerInfo();
        {
            li.mOnAttachStateChangeListeners
                    = new CopyOnWriteArrayList<OnAttachStateChangeListener>();
        } //End block
        li.mOnAttachStateChangeListeners.add(listener);
        addTaint(listener.getTaint());
        // ---------- Original Method ----------
        //ListenerInfo li = getListenerInfo();
        //if (li.mOnAttachStateChangeListeners == null) {
            //li.mOnAttachStateChangeListeners
                    //= new CopyOnWriteArrayList<OnAttachStateChangeListener>();
        //}
        //li.mOnAttachStateChangeListeners.add(listener);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.598 -0400", hash_original_method = "BB59F05E95A495FA9A30543444FC5E76", hash_generated_method = "792D06EE98F2BDBFBC4BE1D1A394D0CA")
    public void removeOnAttachStateChangeListener(OnAttachStateChangeListener listener) {
        ListenerInfo li;
        li = mListenerInfo;
        li.mOnAttachStateChangeListeners.remove(listener);
        addTaint(listener.getTaint());
        // ---------- Original Method ----------
        //ListenerInfo li = mListenerInfo;
        //if (li == null || li.mOnAttachStateChangeListeners == null) {
            //return;
        //}
        //li.mOnAttachStateChangeListeners.remove(listener);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.599 -0400", hash_original_method = "A3D291AC9D619397F7033ECE59D11B86", hash_generated_method = "AE2EAF6FD31E23AF3ADC6EE9DBD15F45")
    public OnFocusChangeListener getOnFocusChangeListener() {
        OnFocusChangeListener varB4EAC82CA7396A68D541C85D26508E83_1114314592 = null; //Variable for return #1
        ListenerInfo li;
        li = mListenerInfo;
        varB4EAC82CA7396A68D541C85D26508E83_1114314592 = li != null ? li.mOnFocusChangeListener : null;
        varB4EAC82CA7396A68D541C85D26508E83_1114314592.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1114314592;
        // ---------- Original Method ----------
        //ListenerInfo li = mListenerInfo;
        //return li != null ? li.mOnFocusChangeListener : null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.599 -0400", hash_original_method = "45F4C058CBC73D55564FBEB6E17C2099", hash_generated_method = "EC28911D09BD079B3A6734169387EA75")
    public void setOnClickListener(OnClickListener l) {
        {
            boolean var04EA38E4DA3FCC73953331C5213AFF9F_131617270 = (!isClickable());
            {
                setClickable(true);
            } //End block
        } //End collapsed parenthetic
        getListenerInfo().mOnClickListener = l;
        addTaint(l.getTaint());
        // ---------- Original Method ----------
        //if (!isClickable()) {
            //setClickable(true);
        //}
        //getListenerInfo().mOnClickListener = l;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.600 -0400", hash_original_method = "8038CCFA19DFF6DCB9855B2C21487DC3", hash_generated_method = "A03D7740AC77B4830BA9CF294A3987E0")
    public boolean hasOnClickListeners() {
        ListenerInfo li;
        li = mListenerInfo;
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_805140030 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_805140030;
        // ---------- Original Method ----------
        //ListenerInfo li = mListenerInfo;
        //return (li != null && li.mOnClickListener != null);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.600 -0400", hash_original_method = "C88CD920669EF9D2067A739196536F5A", hash_generated_method = "A44F3C5DCBE643F3C1C7F64464B636A4")
    public void setOnLongClickListener(OnLongClickListener l) {
        {
            boolean var4E9822764F29F607F332912995A375BC_260400799 = (!isLongClickable());
            {
                setLongClickable(true);
            } //End block
        } //End collapsed parenthetic
        getListenerInfo().mOnLongClickListener = l;
        addTaint(l.getTaint());
        // ---------- Original Method ----------
        //if (!isLongClickable()) {
            //setLongClickable(true);
        //}
        //getListenerInfo().mOnLongClickListener = l;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.600 -0400", hash_original_method = "3B1D28314D3140C1C25951340EB50400", hash_generated_method = "B3A3FC328D5682E7A39BFC4972F9ADE8")
    public void setOnCreateContextMenuListener(OnCreateContextMenuListener l) {
        {
            boolean var4E9822764F29F607F332912995A375BC_1162208389 = (!isLongClickable());
            {
                setLongClickable(true);
            } //End block
        } //End collapsed parenthetic
        getListenerInfo().mOnCreateContextMenuListener = l;
        addTaint(l.getTaint());
        // ---------- Original Method ----------
        //if (!isLongClickable()) {
            //setLongClickable(true);
        //}
        //getListenerInfo().mOnCreateContextMenuListener = l;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.601 -0400", hash_original_method = "F0CE5BDD9B8548BAC9D7A1A1FC9F10B8", hash_generated_method = "23BE2E378E155615A4CF1E9934CDDA85")
    public boolean performClick() {
        sendAccessibilityEvent(AccessibilityEvent.TYPE_VIEW_CLICKED);
        ListenerInfo li;
        li = mListenerInfo;
        {
            playSoundEffect(SoundEffectConstants.CLICK);
            li.mOnClickListener.onClick(this);
        } //End block
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_290709002 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_290709002;
        // ---------- Original Method ----------
        //sendAccessibilityEvent(AccessibilityEvent.TYPE_VIEW_CLICKED);
        //ListenerInfo li = mListenerInfo;
        //if (li != null && li.mOnClickListener != null) {
            //playSoundEffect(SoundEffectConstants.CLICK);
            //li.mOnClickListener.onClick(this);
            //return true;
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.601 -0400", hash_original_method = "102D936797B9C1FC40617DF92F54CFE2", hash_generated_method = "938F5C3C717433C86B68468440209B21")
    public boolean callOnClick() {
        ListenerInfo li;
        li = mListenerInfo;
        {
            li.mOnClickListener.onClick(this);
        } //End block
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1246984388 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1246984388;
        // ---------- Original Method ----------
        //ListenerInfo li = mListenerInfo;
        //if (li != null && li.mOnClickListener != null) {
            //li.mOnClickListener.onClick(this);
            //return true;
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.602 -0400", hash_original_method = "00035430EA6437DC8BB5C07835F45B65", hash_generated_method = "04DB19579727EC2F40E31828EEB542D3")
    public boolean performLongClick() {
        sendAccessibilityEvent(AccessibilityEvent.TYPE_VIEW_LONG_CLICKED);
        boolean handled;
        handled = false;
        ListenerInfo li;
        li = mListenerInfo;
        {
            handled = li.mOnLongClickListener.onLongClick(View.this);
        } //End block
        {
            handled = showContextMenu();
        } //End block
        {
            performHapticFeedback(HapticFeedbackConstants.LONG_PRESS);
        } //End block
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_952668936 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_952668936;
        // ---------- Original Method ----------
        //sendAccessibilityEvent(AccessibilityEvent.TYPE_VIEW_LONG_CLICKED);
        //boolean handled = false;
        //ListenerInfo li = mListenerInfo;
        //if (li != null && li.mOnLongClickListener != null) {
            //handled = li.mOnLongClickListener.onLongClick(View.this);
        //}
        //if (!handled) {
            //handled = showContextMenu();
        //}
        //if (handled) {
            //performHapticFeedback(HapticFeedbackConstants.LONG_PRESS);
        //}
        //return handled;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.602 -0400", hash_original_method = "0AFC4304DA44E934FA35FDC29342C80F", hash_generated_method = "D790D4D92F8D76022067AE93A29A376C")
    protected boolean performButtonActionOnTouchDown(MotionEvent event) {
        {
            boolean var431FF76FC0879DE3BD003EA2EA16B78F_1944414383 = ((event.getButtonState() & MotionEvent.BUTTON_SECONDARY) != 0);
            {
                {
                    boolean var1A9C8D31FBEACF9594778DB5C5D1B4C1_912980236 = (showContextMenu(event.getX(), event.getY(), event.getMetaState()));
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_365109409 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_365109409;
        // ---------- Original Method ----------
        //if ((event.getButtonState() & MotionEvent.BUTTON_SECONDARY) != 0) {
            //if (showContextMenu(event.getX(), event.getY(), event.getMetaState())) {
                //return true;
            //}
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.611 -0400", hash_original_method = "3A1C6F51C14FB3CA1856280BB08BDD78", hash_generated_method = "5C8934E6155AD38F34A903C75282C2FC")
    public boolean showContextMenu() {
        boolean var57558D56D4CFDCF7F086DB96E3562251_881998510 = (getParent().showContextMenuForChild(this));
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1850845681 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1850845681;
        // ---------- Original Method ----------
        //return getParent().showContextMenuForChild(this);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.611 -0400", hash_original_method = "B2C2D020E619A9A69ACCD76F29CBF0A8", hash_generated_method = "BDE8345D31764290AFD2EC63775B98E2")
    public boolean showContextMenu(float x, float y, int metaState) {
        boolean varA4958949E9E0853BF05BBEE347C0FF81_1683743142 = (showContextMenu());
        addTaint(x);
        addTaint(y);
        addTaint(metaState);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1826367075 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1826367075;
        // ---------- Original Method ----------
        //return showContextMenu();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.612 -0400", hash_original_method = "554809A43858BFBD98E9D476D5975BC9", hash_generated_method = "86AF31B2D3C438DAA708C179F6A991EC")
    public ActionMode startActionMode(ActionMode.Callback callback) {
        ActionMode varB4EAC82CA7396A68D541C85D26508E83_1051024013 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1051024013 = getParent().startActionModeForChild(this, callback);
        addTaint(callback.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1051024013.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1051024013;
        // ---------- Original Method ----------
        //return getParent().startActionModeForChild(this, callback);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.612 -0400", hash_original_method = "31C7524DA5B5B98F54BA6C8BE0DEBF7E", hash_generated_method = "294CB2950201588ED4A5114BA97E3763")
    public void setOnKeyListener(OnKeyListener l) {
        getListenerInfo().mOnKeyListener = l;
        addTaint(l.getTaint());
        // ---------- Original Method ----------
        //getListenerInfo().mOnKeyListener = l;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.612 -0400", hash_original_method = "D8E89DFA5C4F927FE4D243F514232285", hash_generated_method = "41A94930ECBAC1A7614AFF7CE35AA6E6")
    public void setOnTouchListener(OnTouchListener l) {
        getListenerInfo().mOnTouchListener = l;
        addTaint(l.getTaint());
        // ---------- Original Method ----------
        //getListenerInfo().mOnTouchListener = l;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.622 -0400", hash_original_method = "A6ED4A9DC8C6B322504EFE7525CB31A1", hash_generated_method = "CB031BE34EEF52F9B8F48225C8DBA900")
    public void setOnGenericMotionListener(OnGenericMotionListener l) {
        getListenerInfo().mOnGenericMotionListener = l;
        addTaint(l.getTaint());
        // ---------- Original Method ----------
        //getListenerInfo().mOnGenericMotionListener = l;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.622 -0400", hash_original_method = "A231A17C6E4AE608F5CD4B1132C585A7", hash_generated_method = "5D22CC0CB48D300F64F3712B52B69F0F")
    public void setOnHoverListener(OnHoverListener l) {
        getListenerInfo().mOnHoverListener = l;
        addTaint(l.getTaint());
        // ---------- Original Method ----------
        //getListenerInfo().mOnHoverListener = l;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.623 -0400", hash_original_method = "8FD55843B8D7F3FEDE7B7D516A1E3E35", hash_generated_method = "A9968561BDC0011E33B09237CF6CFF77")
    public void setOnDragListener(OnDragListener l) {
        getListenerInfo().mOnDragListener = l;
        addTaint(l.getTaint());
        // ---------- Original Method ----------
        //getListenerInfo().mOnDragListener = l;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.623 -0400", hash_original_method = "16B5A8656CEB6785661CF48B92B45991", hash_generated_method = "0E462B4578169A032465CD2E0962E903")
     void handleFocusGainInternal(int direction, Rect previouslyFocusedRect) {
        {
            System.out.println(this + " requestFocus()");
        } //End block
        {
            mPrivateFlags |= FOCUSED;
            {
                mParent.requestChildFocus(this, this);
            } //End block
            onFocusChanged(true, direction, previouslyFocusedRect);
            refreshDrawableState();
        } //End block
        addTaint(direction);
        addTaint(previouslyFocusedRect.getTaint());
        // ---------- Original Method ----------
        //if (DBG) {
            //System.out.println(this + " requestFocus()");
        //}
        //if ((mPrivateFlags & FOCUSED) == 0) {
            //mPrivateFlags |= FOCUSED;
            //if (mParent != null) {
                //mParent.requestChildFocus(this, this);
            //}
            //onFocusChanged(true, direction, previouslyFocusedRect);
            //refreshDrawableState();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.628 -0400", hash_original_method = "2192BF4A933C90A79FE0C71F9C0B2F3D", hash_generated_method = "0A9EA05A37B23B64D0550E758964FCAF")
    public boolean requestRectangleOnScreen(Rect rectangle) {
        boolean varB53A64F27CEF8B117CF782EC0F44B212_499889192 = (requestRectangleOnScreen(rectangle, false));
        addTaint(rectangle.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2132996274 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2132996274;
        // ---------- Original Method ----------
        //return requestRectangleOnScreen(rectangle, false);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.629 -0400", hash_original_method = "BDB750CCBE647F1CD5444CDF496F66A3", hash_generated_method = "E92D61FE5424E2F96DE4A026E56B74F6")
    public boolean requestRectangleOnScreen(Rect rectangle, boolean immediate) {
        View child;
        child = this;
        ViewParent parent;
        parent = mParent;
        boolean scrolled;
        scrolled = false;
        {
            scrolled |= parent.requestChildRectangleOnScreen(child,
                    rectangle, immediate);
            rectangle.offset(child.getLeft(), child.getTop());
            rectangle.offset(-child.getScrollX(), -child.getScrollY());
            child = (View) parent;
            parent = child.getParent();
        } //End block
        addTaint(rectangle.getTaint());
        addTaint(immediate);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_63683032 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_63683032;
        // ---------- Original Method ----------
        //View child = this;
        //ViewParent parent = mParent;
        //boolean scrolled = false;
        //while (parent != null) {
            //scrolled |= parent.requestChildRectangleOnScreen(child,
                    //rectangle, immediate);
            //rectangle.offset(child.getLeft(), child.getTop());
            //rectangle.offset(-child.getScrollX(), -child.getScrollY());
            //if (!(parent instanceof View)) {
                //break;
            //}
            //child = (View) parent;
            //parent = child.getParent();
        //}
        //return scrolled;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.630 -0400", hash_original_method = "A6F69BAD809415BD5537E3FD153C267F", hash_generated_method = "E804AFE297232281A3D184C897B2A3B3")
    public void clearFocus() {
        {
            System.out.println(this + " clearFocus()");
        } //End block
        {
            mPrivateFlags &= ~FOCUSED;
            {
                mParent.clearChildFocus(this);
            } //End block
            onFocusChanged(false, 0, null);
            refreshDrawableState();
        } //End block
        // ---------- Original Method ----------
        //if (DBG) {
            //System.out.println(this + " clearFocus()");
        //}
        //if ((mPrivateFlags & FOCUSED) != 0) {
            //mPrivateFlags &= ~FOCUSED;
            //if (mParent != null) {
                //mParent.clearChildFocus(this);
            //}
            //onFocusChanged(false, 0, null);
            //refreshDrawableState();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.630 -0400", hash_original_method = "B948A77A86E2A2242F3F753171415A6F", hash_generated_method = "E185FEEAEED513A145564C4D000D5AD6")
     void clearFocusForRemoval() {
        {
            mPrivateFlags &= ~FOCUSED;
            onFocusChanged(false, 0, null);
            refreshDrawableState();
        } //End block
        // ---------- Original Method ----------
        //if ((mPrivateFlags & FOCUSED) != 0) {
            //mPrivateFlags &= ~FOCUSED;
            //onFocusChanged(false, 0, null);
            //refreshDrawableState();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.631 -0400", hash_original_method = "895408B45B14DF7336768B76769FDFBE", hash_generated_method = "8CFD639286A261F7C8B5F8F3C689E3F6")
     void unFocus() {
        {
            System.out.println(this + " unFocus()");
        } //End block
        {
            mPrivateFlags &= ~FOCUSED;
            onFocusChanged(false, 0, null);
            refreshDrawableState();
        } //End block
        // ---------- Original Method ----------
        //if (DBG) {
            //System.out.println(this + " unFocus()");
        //}
        //if ((mPrivateFlags & FOCUSED) != 0) {
            //mPrivateFlags &= ~FOCUSED;
            //onFocusChanged(false, 0, null);
            //refreshDrawableState();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.640 -0400", hash_original_method = "337547862E6B052D2DEF8F8E7CCEA590", hash_generated_method = "404415C042A38D494822B9F2C3A1EBEC")
    @ViewDebug.ExportedProperty(category = "focus")
    public boolean hasFocus() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1602823089 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1602823089;
        // ---------- Original Method ----------
        //return (mPrivateFlags & FOCUSED) != 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.643 -0400", hash_original_method = "B2402A510BB29E4C255854E18659AE1B", hash_generated_method = "D22E8A76E4096443DC3B517526C22D11")
    public boolean hasFocusable() {
        boolean var45438BF76A2F167C289F26830B3A9B93_341683304 = ((mViewFlags & VISIBILITY_MASK) == VISIBLE && isFocusable());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1217946208 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1217946208;
        // ---------- Original Method ----------
        //return (mViewFlags & VISIBILITY_MASK) == VISIBLE && isFocusable();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.643 -0400", hash_original_method = "5A1E14083BB718E6700BA53BA3884697", hash_generated_method = "1FB892BF70273962FB3F386752A5C9E9")
    protected void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        {
            sendAccessibilityEvent(AccessibilityEvent.TYPE_VIEW_FOCUSED);
        } //End block
        InputMethodManager imm;
        imm = InputMethodManager.peekInstance();
        {
            {
                boolean varF27F491A5EAB0B2989FBEF44657192A7_1591865388 = (isPressed());
                {
                    setPressed(false);
                } //End block
            } //End collapsed parenthetic
            {
                imm.focusOut(this);
            } //End block
            onFocusLost();
        } //End block
        {
            imm.focusIn(this);
        } //End block
        invalidate(true);
        ListenerInfo li;
        li = mListenerInfo;
        {
            li.mOnFocusChangeListener.onFocusChange(this, gainFocus);
        } //End block
        {
            mAttachInfo.mKeyDispatchState.reset(this);
        } //End block
        addTaint(gainFocus);
        addTaint(direction);
        addTaint(previouslyFocusedRect.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.644 -0400", hash_original_method = "67C8279330D12E8D41FE4F9795D7EB79", hash_generated_method = "443DCFE8D319517E5CCCF7FDF2380E1F")
    public void sendAccessibilityEvent(int eventType) {
        {
            mAccessibilityDelegate.sendAccessibilityEvent(this, eventType);
        } //End block
        {
            sendAccessibilityEventInternal(eventType);
        } //End block
        addTaint(eventType);
        // ---------- Original Method ----------
        //if (mAccessibilityDelegate != null) {
            //mAccessibilityDelegate.sendAccessibilityEvent(this, eventType);
        //} else {
            //sendAccessibilityEventInternal(eventType);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.644 -0400", hash_original_method = "BE2AB20B544FD38FEA2111E9FF446FAD", hash_generated_method = "86C9F990A4770163E1EE3F0A5A8588B9")
     void sendAccessibilityEventInternal(int eventType) {
        {
            boolean varFEF5E81D9E4B252970529F0E4C094F45_840086575 = (AccessibilityManager.getInstance(mContext).isEnabled());
            {
                sendAccessibilityEventUnchecked(AccessibilityEvent.obtain(eventType));
            } //End block
        } //End collapsed parenthetic
        addTaint(eventType);
        // ---------- Original Method ----------
        //if (AccessibilityManager.getInstance(mContext).isEnabled()) {
            //sendAccessibilityEventUnchecked(AccessibilityEvent.obtain(eventType));
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.644 -0400", hash_original_method = "B790306D0C64AC6AB0D8747A1C899258", hash_generated_method = "E7C7A44253D65A405CDA02739031BA76")
    public void sendAccessibilityEventUnchecked(AccessibilityEvent event) {
        {
            mAccessibilityDelegate.sendAccessibilityEventUnchecked(this, event);
        } //End block
        {
            sendAccessibilityEventUncheckedInternal(event);
        } //End block
        addTaint(event.getTaint());
        // ---------- Original Method ----------
        //if (mAccessibilityDelegate != null) {
           //mAccessibilityDelegate.sendAccessibilityEventUnchecked(this, event);
        //} else {
            //sendAccessibilityEventUncheckedInternal(event);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.645 -0400", hash_original_method = "2BAF48857D95094002D2EF1740E1384F", hash_generated_method = "277FBA0DBB00D73A8A0A03CF736E8B73")
     void sendAccessibilityEventUncheckedInternal(AccessibilityEvent event) {
        {
            boolean var2E2E2221860B3DCAB8C5D4F0DAD9AC26_1631273342 = (!isShown());
        } //End collapsed parenthetic
        onInitializeAccessibilityEvent(event);
        {
            boolean var9D05604FB3FF39F2704B15C63CA7D337_418935366 = ((event.getEventType() & POPULATING_ACCESSIBILITY_EVENT_TYPES) != 0);
            {
                dispatchPopulateAccessibilityEvent(event);
            } //End block
        } //End collapsed parenthetic
        getParent().requestSendAccessibilityEvent(this, event);
        addTaint(event.getTaint());
        // ---------- Original Method ----------
        //if (!isShown()) {
            //return;
        //}
        //onInitializeAccessibilityEvent(event);
        //if ((event.getEventType() & POPULATING_ACCESSIBILITY_EVENT_TYPES) != 0) {
            //dispatchPopulateAccessibilityEvent(event);
        //}
        //getParent().requestSendAccessibilityEvent(this, event);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.645 -0400", hash_original_method = "927EED19E22DB3C930EC71946191C691", hash_generated_method = "5386A0FE86C526685474B7AE62ADE55E")
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        {
            boolean varC130CACCC03E1AF22AC94D08B8319DCD_943092721 = (mAccessibilityDelegate.dispatchPopulateAccessibilityEvent(this, event));
        } //End block
        {
            boolean var372DEE9301D724A2D11E91D3D5BF5A44_359656732 = (dispatchPopulateAccessibilityEventInternal(event));
        } //End block
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1552075169 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1552075169;
        // ---------- Original Method ----------
        //if (mAccessibilityDelegate != null) {
            //return mAccessibilityDelegate.dispatchPopulateAccessibilityEvent(this, event);
        //} else {
            //return dispatchPopulateAccessibilityEventInternal(event);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.646 -0400", hash_original_method = "8EC2668F1DC902F63C332D19DDE36094", hash_generated_method = "9EBB1D49C8460D68888956FB5C6CF62C")
     boolean dispatchPopulateAccessibilityEventInternal(AccessibilityEvent event) {
        onPopulateAccessibilityEvent(event);
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_999317392 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_999317392;
        // ---------- Original Method ----------
        //onPopulateAccessibilityEvent(event);
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.646 -0400", hash_original_method = "A0DF1F515FF193F86B7E130DE16E38CE", hash_generated_method = "810EF0AFD12B38CDE493EEDFECC93832")
    public void onPopulateAccessibilityEvent(AccessibilityEvent event) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        {
            mAccessibilityDelegate.onPopulateAccessibilityEvent(this, event);
        } //End block
        {
            onPopulateAccessibilityEventInternal(event);
        } //End block
        addTaint(event.getTaint());
        // ---------- Original Method ----------
        //if (mAccessibilityDelegate != null) {
            //mAccessibilityDelegate.onPopulateAccessibilityEvent(this, event);
        //} else {
            //onPopulateAccessibilityEventInternal(event);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.646 -0400", hash_original_method = "CF40AA9C4C55BD5A22FC0E76716C7875", hash_generated_method = "C1E3420DDE9B8190E6B3E3D06A3CF139")
     void onPopulateAccessibilityEventInternal(AccessibilityEvent event) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(event.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.657 -0400", hash_original_method = "28310CBBAED9E8F097DF5C90DBA9CD0F", hash_generated_method = "EF501DEAFC1D2AF86576632784174A7B")
    public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        {
            mAccessibilityDelegate.onInitializeAccessibilityEvent(this, event);
        } //End block
        {
            onInitializeAccessibilityEventInternal(event);
        } //End block
        addTaint(event.getTaint());
        // ---------- Original Method ----------
        //if (mAccessibilityDelegate != null) {
            //mAccessibilityDelegate.onInitializeAccessibilityEvent(this, event);
        //} else {
            //onInitializeAccessibilityEventInternal(event);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.657 -0400", hash_original_method = "43B5B6E634D7CF960BF74CE0E1DDA2CD", hash_generated_method = "181915C48CB840EC3E782CCC35501AE4")
     void onInitializeAccessibilityEventInternal(AccessibilityEvent event) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        event.setSource(this);
        event.setClassName(getClass().getName());
        event.setPackageName(getContext().getPackageName());
        event.setEnabled(isEnabled());
        event.setContentDescription(mContentDescription);
        {
            boolean var703D9E8BC245CC3A7B48B35F52188203_930846938 = (event.getEventType() == AccessibilityEvent.TYPE_VIEW_FOCUSED && mAttachInfo != null);
            {
                ArrayList<View> focusablesTempList;
                focusablesTempList = mAttachInfo.mFocusablesTempList;
                getRootView().addFocusables(focusablesTempList, View.FOCUS_FORWARD,
                    FOCUSABLES_ALL);
                event.setItemCount(focusablesTempList.size());
                event.setCurrentItemIndex(focusablesTempList.indexOf(this));
                focusablesTempList.clear();
            } //End block
        } //End collapsed parenthetic
        addTaint(event.getTaint());
        // ---------- Original Method ----------
        //event.setSource(this);
        //event.setClassName(getClass().getName());
        //event.setPackageName(getContext().getPackageName());
        //event.setEnabled(isEnabled());
        //event.setContentDescription(mContentDescription);
        //if (event.getEventType() == AccessibilityEvent.TYPE_VIEW_FOCUSED && mAttachInfo != null) {
            //ArrayList<View> focusablesTempList = mAttachInfo.mFocusablesTempList;
            //getRootView().addFocusables(focusablesTempList, View.FOCUS_FORWARD,
                    //FOCUSABLES_ALL);
            //event.setItemCount(focusablesTempList.size());
            //event.setCurrentItemIndex(focusablesTempList.indexOf(this));
            //focusablesTempList.clear();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.658 -0400", hash_original_method = "53F1596AC086DF0FD9B166B1443D793C", hash_generated_method = "413F4F93C10A7BEF4712B5A83D376964")
    public AccessibilityNodeInfo createAccessibilityNodeInfo() {
        AccessibilityNodeInfo varB4EAC82CA7396A68D541C85D26508E83_1897795774 = null; //Variable for return #1
        AccessibilityNodeInfo info;
        info = AccessibilityNodeInfo.obtain(this);
        onInitializeAccessibilityNodeInfo(info);
        varB4EAC82CA7396A68D541C85D26508E83_1897795774 = info;
        varB4EAC82CA7396A68D541C85D26508E83_1897795774.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1897795774;
        // ---------- Original Method ----------
        //AccessibilityNodeInfo info = AccessibilityNodeInfo.obtain(this);
        //onInitializeAccessibilityNodeInfo(info);
        //return info;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.659 -0400", hash_original_method = "BE2067901E907368432A8D9CCB431457", hash_generated_method = "B1DD873D32B686B6B0284A470F90D597")
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        {
            mAccessibilityDelegate.onInitializeAccessibilityNodeInfo(this, info);
        } //End block
        {
            onInitializeAccessibilityNodeInfoInternal(info);
        } //End block
        addTaint(info.getTaint());
        // ---------- Original Method ----------
        //if (mAccessibilityDelegate != null) {
            //mAccessibilityDelegate.onInitializeAccessibilityNodeInfo(this, info);
        //} else {
            //onInitializeAccessibilityNodeInfoInternal(info);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.669 -0400", hash_original_method = "8753AD1110C37F0E73AF31B4448B5211", hash_generated_method = "DF3B4EB1E54933C06B64D0FFD36F06FF")
     void onInitializeAccessibilityNodeInfoInternal(AccessibilityNodeInfo info) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        Rect bounds;
        bounds = mAttachInfo.mTmpInvalRect;
        getDrawingRect(bounds);
        info.setBoundsInParent(bounds);
        int[] locationOnScreen;
        locationOnScreen = mAttachInfo.mInvalidateChildLocation;
        getLocationOnScreen(locationOnScreen);
        bounds.offsetTo(0, 0);
        bounds.offset(locationOnScreen[0], locationOnScreen[1]);
        info.setBoundsInScreen(bounds);
        {
            ViewParent parent;
            parent = getParent();
            {
                View parentView;
                parentView = (View) parent;
                info.setParent(parentView);
            } //End block
        } //End block
        info.setPackageName(mContext.getPackageName());
        info.setClassName(getClass().getName());
        info.setContentDescription(getContentDescription());
        info.setEnabled(isEnabled());
        info.setClickable(isClickable());
        info.setFocusable(isFocusable());
        info.setFocused(isFocused());
        info.setSelected(isSelected());
        info.setLongClickable(isLongClickable());
        info.addAction(AccessibilityNodeInfo.ACTION_SELECT);
        info.addAction(AccessibilityNodeInfo.ACTION_CLEAR_SELECTION);
        {
            boolean var586AE4CCFE144A60D22CF3B21C623ACC_322838142 = (isFocusable());
            {
                {
                    boolean var807A689000786E69147E7D957AAAFB6F_1275528301 = (isFocused());
                    {
                        info.addAction(AccessibilityNodeInfo.ACTION_CLEAR_FOCUS);
                    } //End block
                    {
                        info.addAction(AccessibilityNodeInfo.ACTION_FOCUS);
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        addTaint(info.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.683 -0400", hash_original_method = "32F138BD45B7179C5519FF8B12AC5296", hash_generated_method = "54FEEF3A1A1C934FEB709560757E0564")
    public void setAccessibilityDelegate(AccessibilityDelegate delegate) {
        mAccessibilityDelegate = delegate;
        // ---------- Original Method ----------
        //mAccessibilityDelegate = delegate;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.683 -0400", hash_original_method = "64D1C3C95C84965C0C27E168EBDF3A77", hash_generated_method = "F812FBD74164074F2E398D1EB68ECBE9")
    public int getAccessibilityViewId() {
        {
            mAccessibilityViewId = sNextAccessibilityViewId++;
        } //End block
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_121745990 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_121745990;
        // ---------- Original Method ----------
        //if (mAccessibilityViewId == NO_ID) {
            //mAccessibilityViewId = sNextAccessibilityViewId++;
        //}
        //return mAccessibilityViewId;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.684 -0400", hash_original_method = "ABBCC5D3939BB662168BF84991E4D81C", hash_generated_method = "25F5E28679133FA8BF5D68A3AE1356BA")
    public int getAccessibilityWindowId() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1277745812 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1277745812;
        // ---------- Original Method ----------
        //return mAttachInfo != null ? mAttachInfo.mAccessibilityWindowId : NO_ID;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.684 -0400", hash_original_method = "6DAFF86A43A6BABA543C66C7DDAE7D00", hash_generated_method = "56AE0C2CB04E9AC10852A7C969555E7A")
    public CharSequence getContentDescription() {
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_2100817694 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_2100817694 = mContentDescription;
        varB4EAC82CA7396A68D541C85D26508E83_2100817694.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_2100817694;
        // ---------- Original Method ----------
        //return mContentDescription;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.685 -0400", hash_original_method = "1087954D5CDD3C4C18E361D3DD728844", hash_generated_method = "6C6918B8BBDB2D7D09C9C3B313E5E324")
    @RemotableViewMethod
    public void setContentDescription(CharSequence contentDescription) {
        mContentDescription = contentDescription;
        // ---------- Original Method ----------
        //mContentDescription = contentDescription;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.689 -0400", hash_original_method = "5C1A3C599F20DF55DE3C4471944CAAB7", hash_generated_method = "38E1F736D1D0CE663B8F46A26D06B1FF")
    protected void onFocusLost() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        resetPressedState();
        // ---------- Original Method ----------
        //resetPressedState();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.689 -0400", hash_original_method = "81136F7A8F96E00E1C77CED95B4F9DA3", hash_generated_method = "B07DA18A6C1C4A1B947219997AF3C58A")
    private void resetPressedState() {
        {
            boolean varCBC9727A244F165456D2D6CDD8022488_62300469 = (isPressed());
            {
                setPressed(false);
                {
                    removeLongPressCallback();
                } //End block
            } //End block
        } //End collapsed parenthetic
        // ---------- Original Method ----------
        //if ((mViewFlags & ENABLED_MASK) == DISABLED) {
            //return;
        //}
        //if (isPressed()) {
            //setPressed(false);
            //if (!mHasPerformedLongPress) {
                //removeLongPressCallback();
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.690 -0400", hash_original_method = "BAE18A1621CF10BDD62967DA8210DF90", hash_generated_method = "9134B8301F9C6E52AE3DB2FA87C22DF8")
    @ViewDebug.ExportedProperty(category = "focus")
    public boolean isFocused() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_17998729 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_17998729;
        // ---------- Original Method ----------
        //return (mPrivateFlags & FOCUSED) != 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.690 -0400", hash_original_method = "DDD0B2B4CCE06873AEE74BD63DE5A294", hash_generated_method = "4D0F2642A500FBE134C0F35CC414C1BA")
    public View findFocus() {
        View varB4EAC82CA7396A68D541C85D26508E83_1713470921 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1713470921 = (mPrivateFlags & FOCUSED) != 0 ? this : null;
        varB4EAC82CA7396A68D541C85D26508E83_1713470921.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1713470921;
        // ---------- Original Method ----------
        //return (mPrivateFlags & FOCUSED) != 0 ? this : null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.778 -0400", hash_original_method = "1D4A87A45389821BFC7421CA2D7AD61B", hash_generated_method = "935832AC3930E39C59A3AD0B36B2D958")
    public void setScrollContainer(boolean isScrollContainer) {
        {
            {
                mAttachInfo.mScrollContainers.add(this);
                mPrivateFlags |= SCROLL_CONTAINER_ADDED;
            } //End block
            mPrivateFlags |= SCROLL_CONTAINER;
        } //End block
        {
            {
                mAttachInfo.mScrollContainers.remove(this);
            } //End block
            mPrivateFlags &= ~(SCROLL_CONTAINER|SCROLL_CONTAINER_ADDED);
        } //End block
        addTaint(isScrollContainer);
        // ---------- Original Method ----------
        //if (isScrollContainer) {
            //if (mAttachInfo != null && (mPrivateFlags&SCROLL_CONTAINER_ADDED) == 0) {
                //mAttachInfo.mScrollContainers.add(this);
                //mPrivateFlags |= SCROLL_CONTAINER_ADDED;
            //}
            //mPrivateFlags |= SCROLL_CONTAINER;
        //} else {
            //if ((mPrivateFlags&SCROLL_CONTAINER_ADDED) != 0) {
                //mAttachInfo.mScrollContainers.remove(this);
            //}
            //mPrivateFlags &= ~(SCROLL_CONTAINER|SCROLL_CONTAINER_ADDED);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.778 -0400", hash_original_method = "B2DEE8CA09FADC0B572CF46E784DEFD4", hash_generated_method = "3230A33E8695ADAA87DB5756DA425C51")
    public int getDrawingCacheQuality() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_121999055 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_121999055;
        // ---------- Original Method ----------
        //return mViewFlags & DRAWING_CACHE_QUALITY_MASK;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.779 -0400", hash_original_method = "9D6669AC39CE9592E8D8B20B25494E51", hash_generated_method = "36A7C0E9E645CBC81EE5C481686480FA")
    public void setDrawingCacheQuality(int quality) {
        setFlags(quality, DRAWING_CACHE_QUALITY_MASK);
        addTaint(quality);
        // ---------- Original Method ----------
        //setFlags(quality, DRAWING_CACHE_QUALITY_MASK);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.779 -0400", hash_original_method = "03B1D1993EB8539284C7E9AFB4C193D6", hash_generated_method = "F5B93034008AD539FBC419A1F369010F")
    public boolean getKeepScreenOn() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1025395186 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1025395186;
        // ---------- Original Method ----------
        //return (mViewFlags & KEEP_SCREEN_ON) != 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.779 -0400", hash_original_method = "99FBDDFD33142E06617327BD1E6B4E35", hash_generated_method = "00AAF5587B8D93F79AA78116E2D71D7D")
    public void setKeepScreenOn(boolean keepScreenOn) {
        setFlags(keepScreenOn ? KEEP_SCREEN_ON : 0, KEEP_SCREEN_ON);
        addTaint(keepScreenOn);
        // ---------- Original Method ----------
        //setFlags(keepScreenOn ? KEEP_SCREEN_ON : 0, KEEP_SCREEN_ON);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.780 -0400", hash_original_method = "652E85B83FB56D2A13FFAE8255561FDD", hash_generated_method = "6E751EED457DDAAEF2D6162E6BB46B4F")
    public int getNextFocusLeftId() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_135859312 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_135859312;
        // ---------- Original Method ----------
        //return mNextFocusLeftId;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.781 -0400", hash_original_method = "38A879027311496175629221AC818202", hash_generated_method = "9E7B7FD166466BC7306079F36AA2B43B")
    public void setNextFocusLeftId(int nextFocusLeftId) {
        mNextFocusLeftId = nextFocusLeftId;
        // ---------- Original Method ----------
        //mNextFocusLeftId = nextFocusLeftId;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.782 -0400", hash_original_method = "C88A703CE946F61F0459BFCDB166A908", hash_generated_method = "5854D27FAAE5A810A749B39F2F431E5A")
    public int getNextFocusRightId() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_768068499 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_768068499;
        // ---------- Original Method ----------
        //return mNextFocusRightId;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.782 -0400", hash_original_method = "2FF4A363CCED3B1F6EFFEC35EA0E0480", hash_generated_method = "5996750AB6CEE625E7FEB111E630C7C3")
    public void setNextFocusRightId(int nextFocusRightId) {
        mNextFocusRightId = nextFocusRightId;
        // ---------- Original Method ----------
        //mNextFocusRightId = nextFocusRightId;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.783 -0400", hash_original_method = "88AE25872576F6D10940E7A2DFEC3C43", hash_generated_method = "19E5F0E9A3414B3D06CAA818BC4B914D")
    public int getNextFocusUpId() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1882207167 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1882207167;
        // ---------- Original Method ----------
        //return mNextFocusUpId;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.783 -0400", hash_original_method = "EB6C60D159C1D76D120BCAB59C29C293", hash_generated_method = "ABE6A764A0F99D568CE282D19BD22817")
    public void setNextFocusUpId(int nextFocusUpId) {
        mNextFocusUpId = nextFocusUpId;
        // ---------- Original Method ----------
        //mNextFocusUpId = nextFocusUpId;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.783 -0400", hash_original_method = "D4E7D4D04A0684EEEE5B75921F57CEF0", hash_generated_method = "6A10A4B7BDC6B50551421375FFC108F6")
    public int getNextFocusDownId() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_135668716 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_135668716;
        // ---------- Original Method ----------
        //return mNextFocusDownId;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.784 -0400", hash_original_method = "3F02629850152C987A67C858A1F48B49", hash_generated_method = "DDFE9F521C426810DDF7E2178663902C")
    public void setNextFocusDownId(int nextFocusDownId) {
        mNextFocusDownId = nextFocusDownId;
        // ---------- Original Method ----------
        //mNextFocusDownId = nextFocusDownId;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.784 -0400", hash_original_method = "73A79720EFCAB292687913BA58A7941B", hash_generated_method = "5F328AA1DA9997BEB4DA9A1067F8981B")
    public int getNextFocusForwardId() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1698320322 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1698320322;
        // ---------- Original Method ----------
        //return mNextFocusForwardId;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.784 -0400", hash_original_method = "E9ABC127C8FB8F8FC934426D38CB5040", hash_generated_method = "41F6E7361641184AD5AE6B06157A5559")
    public void setNextFocusForwardId(int nextFocusForwardId) {
        mNextFocusForwardId = nextFocusForwardId;
        // ---------- Original Method ----------
        //mNextFocusForwardId = nextFocusForwardId;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.785 -0400", hash_original_method = "9296F75E65D2F78CDC5D2F47E6CA50BF", hash_generated_method = "47CC00C401ECBBADD346B6FDE1D335CC")
    public boolean isShown() {
        View current;
        current = this;
        {
            ViewParent parent;
            parent = current.mParent;
            current = (View) parent;
        } //End block
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1673321935 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1673321935;
        // ---------- Original Method ----------
        //View current = this;
        //do {
            //if ((current.mViewFlags & VISIBILITY_MASK) != VISIBLE) {
                //return false;
            //}
            //ViewParent parent = current.mParent;
            //if (parent == null) {
                //return false; 
            //}
            //if (!(parent instanceof View)) {
                //return true;
            //}
            //current = (View) parent;
        //} while (current != null);
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.801 -0400", hash_original_method = "A39140C8CB73A931FE842774091348D2", hash_generated_method = "BE2EEE9F83D2DA3DEE43900ECD168604")
    protected boolean fitSystemWindows(Rect insets) {
        {
            mPaddingLeft = insets.left;
            mPaddingTop = insets.top;
            mPaddingRight = insets.right;
            mPaddingBottom = insets.bottom;
            requestLayout();
        } //End block
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_963115800 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_963115800;
        // ---------- Original Method ----------
        //if ((mViewFlags & FITS_SYSTEM_WINDOWS) == FITS_SYSTEM_WINDOWS) {
            //mPaddingLeft = insets.left;
            //mPaddingTop = insets.top;
            //mPaddingRight = insets.right;
            //mPaddingBottom = insets.bottom;
            //requestLayout();
            //return true;
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.801 -0400", hash_original_method = "E3CDF7FA6CDC2881F199FFB75CF3D7D5", hash_generated_method = "FF5A6377EA2F89F12F7A12CEEF188149")
    public void setFitsSystemWindows(boolean fitSystemWindows) {
        setFlags(fitSystemWindows ? FITS_SYSTEM_WINDOWS : 0, FITS_SYSTEM_WINDOWS);
        addTaint(fitSystemWindows);
        // ---------- Original Method ----------
        //setFlags(fitSystemWindows ? FITS_SYSTEM_WINDOWS : 0, FITS_SYSTEM_WINDOWS);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.802 -0400", hash_original_method = "5692CC010F12659264569BED146C3B41", hash_generated_method = "4A15B1C7FC5DAEB166C3EF6A896F7B19")
    public boolean fitsSystemWindows() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1100869970 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1100869970;
        // ---------- Original Method ----------
        //return (mViewFlags & FITS_SYSTEM_WINDOWS) == FITS_SYSTEM_WINDOWS;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.802 -0400", hash_original_method = "D2B31666DEBF08F8B4CA461C0B34FB1E", hash_generated_method = "A4F42F7DE548B2922A7E7E0237E020D8")
    @ViewDebug.ExportedProperty(mapping = {
        @ViewDebug.IntToString(from = VISIBLE,   to = "VISIBLE"),
        @ViewDebug.IntToString(from = INVISIBLE, to = "INVISIBLE"),
        @ViewDebug.IntToString(from = GONE,      to = "GONE")
    })
    public int getVisibility() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1252806546 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1252806546;
        // ---------- Original Method ----------
        //return mViewFlags & VISIBILITY_MASK;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.806 -0400", hash_original_method = "02AF8E28E646A9214DED62901D5A05AB", hash_generated_method = "2C0C53FFB22650D6FE393221DEFB4B76")
    @RemotableViewMethod
    public void setVisibility(int visibility) {
        setFlags(visibility, VISIBILITY_MASK);
        mBGDrawable.setVisible(visibility == VISIBLE, false);
        addTaint(visibility);
        // ---------- Original Method ----------
        //setFlags(visibility, VISIBILITY_MASK);
        //if (mBGDrawable != null) mBGDrawable.setVisible(visibility == VISIBLE, false);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.807 -0400", hash_original_method = "1FAAF1AA1B65BC3CCFA44E36A044FBA3", hash_generated_method = "7780CBE7D9DB2E6EE8BD1BDD28DEC990")
    @ViewDebug.ExportedProperty
    public boolean isEnabled() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1280220828 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1280220828;
        // ---------- Original Method ----------
        //return (mViewFlags & ENABLED_MASK) == ENABLED;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.807 -0400", hash_original_method = "82122684EF3D7563FCC0B376DF0849B5", hash_generated_method = "EFEE961DC169D0F25A7A823164B62BA5")
    @RemotableViewMethod
    public void setEnabled(boolean enabled) {
        {
            boolean var7DA8DB0EDBF2B3C1E618EFC1F33534DC_2137476529 = (enabled == isEnabled());
        } //End collapsed parenthetic
        setFlags(enabled ? ENABLED : DISABLED, ENABLED_MASK);
        refreshDrawableState();
        invalidate(true);
        addTaint(enabled);
        // ---------- Original Method ----------
        //if (enabled == isEnabled()) return;
        //setFlags(enabled ? ENABLED : DISABLED, ENABLED_MASK);
        //refreshDrawableState();
        //invalidate(true);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.809 -0400", hash_original_method = "C9881A9860604453F19A8665970456AB", hash_generated_method = "664333A1EA25CC82A0F4439E4CD26AEB")
    public void setFocusable(boolean focusable) {
        {
            setFlags(0, FOCUSABLE_IN_TOUCH_MODE);
        } //End block
        setFlags(focusable ? FOCUSABLE : NOT_FOCUSABLE, FOCUSABLE_MASK);
        addTaint(focusable);
        // ---------- Original Method ----------
        //if (!focusable) {
            //setFlags(0, FOCUSABLE_IN_TOUCH_MODE);
        //}
        //setFlags(focusable ? FOCUSABLE : NOT_FOCUSABLE, FOCUSABLE_MASK);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.809 -0400", hash_original_method = "2EADF8D169DEE1EA3C577B22372A4F29", hash_generated_method = "F4404B47505B58A113C56AFA417794D7")
    public void setFocusableInTouchMode(boolean focusableInTouchMode) {
        setFlags(focusableInTouchMode ? FOCUSABLE_IN_TOUCH_MODE : 0, FOCUSABLE_IN_TOUCH_MODE);
        {
            setFlags(FOCUSABLE, FOCUSABLE_MASK);
        } //End block
        addTaint(focusableInTouchMode);
        // ---------- Original Method ----------
        //setFlags(focusableInTouchMode ? FOCUSABLE_IN_TOUCH_MODE : 0, FOCUSABLE_IN_TOUCH_MODE);
        //if (focusableInTouchMode) {
            //setFlags(FOCUSABLE, FOCUSABLE_MASK);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.810 -0400", hash_original_method = "0616009511F2186FBF13D4B2BAEA6B3A", hash_generated_method = "F636D38F57C66EBB9793043D928DA120")
    public void setSoundEffectsEnabled(boolean soundEffectsEnabled) {
        setFlags(soundEffectsEnabled ? SOUND_EFFECTS_ENABLED: 0, SOUND_EFFECTS_ENABLED);
        addTaint(soundEffectsEnabled);
        // ---------- Original Method ----------
        //setFlags(soundEffectsEnabled ? SOUND_EFFECTS_ENABLED: 0, SOUND_EFFECTS_ENABLED);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.810 -0400", hash_original_method = "04FBA67AC1724C494C94FB884C5C883F", hash_generated_method = "937963539EFCC10D6870D37D48506CA0")
    @ViewDebug.ExportedProperty
    public boolean isSoundEffectsEnabled() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_738945048 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_738945048;
        // ---------- Original Method ----------
        //return SOUND_EFFECTS_ENABLED == (mViewFlags & SOUND_EFFECTS_ENABLED);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.810 -0400", hash_original_method = "665412B4BA3D450566C79B734C683A80", hash_generated_method = "D1B39588408E385BC53837E77F2E736F")
    public void setHapticFeedbackEnabled(boolean hapticFeedbackEnabled) {
        setFlags(hapticFeedbackEnabled ? HAPTIC_FEEDBACK_ENABLED: 0, HAPTIC_FEEDBACK_ENABLED);
        addTaint(hapticFeedbackEnabled);
        // ---------- Original Method ----------
        //setFlags(hapticFeedbackEnabled ? HAPTIC_FEEDBACK_ENABLED: 0, HAPTIC_FEEDBACK_ENABLED);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.816 -0400", hash_original_method = "69619136C00391879489C4434A4D0191", hash_generated_method = "57A8A6D8561AFAB744D062F229CFD0FC")
    @ViewDebug.ExportedProperty
    public boolean isHapticFeedbackEnabled() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1623241146 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1623241146;
        // ---------- Original Method ----------
        //return HAPTIC_FEEDBACK_ENABLED == (mViewFlags & HAPTIC_FEEDBACK_ENABLED);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.816 -0400", hash_original_method = "2C2C2D2C9CAFB887317333E5CB13B049", hash_generated_method = "3F8440887EFABBD7F21FD2551936A36C")
    @ViewDebug.ExportedProperty(category = "layout", mapping = {
        @ViewDebug.IntToString(from = LAYOUT_DIRECTION_LTR,     to = "LTR"),
        @ViewDebug.IntToString(from = LAYOUT_DIRECTION_RTL,     to = "RTL"),
        @ViewDebug.IntToString(from = LAYOUT_DIRECTION_INHERIT, to = "INHERIT"),
        @ViewDebug.IntToString(from = LAYOUT_DIRECTION_LOCALE,  to = "LOCALE")
    })
    public int getLayoutDirection() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1214747297 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1214747297;
        // ---------- Original Method ----------
        //return mViewFlags & LAYOUT_DIRECTION_MASK;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.817 -0400", hash_original_method = "72BED775868D43D3C5AF7895C4FF8A44", hash_generated_method = "54FB8B44FE682CFDA7930EA221A3B950")
    @RemotableViewMethod
    public void setLayoutDirection(int layoutDirection) {
        {
            boolean var321A562371C59BD383BBC58B39275A56_2026296481 = (getLayoutDirection() != layoutDirection);
            {
                resetResolvedLayoutDirection();
                setFlags(layoutDirection, LAYOUT_DIRECTION_MASK);
            } //End block
        } //End collapsed parenthetic
        addTaint(layoutDirection);
        // ---------- Original Method ----------
        //if (getLayoutDirection() != layoutDirection) {
            //resetResolvedLayoutDirection();
            //setFlags(layoutDirection, LAYOUT_DIRECTION_MASK);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.817 -0400", hash_original_method = "9F5111100CE328994E06DFE63B825110", hash_generated_method = "A6C093F31C4454157F754F5E6F91F528")
    @ViewDebug.ExportedProperty(category = "layout", mapping = {
        @ViewDebug.IntToString(from = LAYOUT_DIRECTION_LTR,     to = "RESOLVED_DIRECTION_LTR"),
        @ViewDebug.IntToString(from = LAYOUT_DIRECTION_RTL,     to = "RESOLVED_DIRECTION_RTL")
    })
    public int getResolvedLayoutDirection() {
        resolveLayoutDirectionIfNeeded();
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2026175506 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2026175506;
        // ---------- Original Method ----------
        //resolveLayoutDirectionIfNeeded();
        //return ((mPrivateFlags2 & LAYOUT_DIRECTION_RESOLVED_RTL) == LAYOUT_DIRECTION_RESOLVED_RTL) ?
                //LAYOUT_DIRECTION_RTL : LAYOUT_DIRECTION_LTR;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.818 -0400", hash_original_method = "F4E28248D2C3D2566E14BBF2219E2BCD", hash_generated_method = "53B7905E3DDA582E915C9D18EFDCC7BA")
    @ViewDebug.ExportedProperty(category = "layout")
    public boolean isLayoutRtl() {
        boolean varA36BF340EF5BBC5D48962FD8A0BF863A_1979974038 = ((getResolvedLayoutDirection() == LAYOUT_DIRECTION_RTL));
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1813060687 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1813060687;
        // ---------- Original Method ----------
        //return (getResolvedLayoutDirection() == LAYOUT_DIRECTION_RTL);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.818 -0400", hash_original_method = "F9FAF3BB929B9847B181A3D88FABD842", hash_generated_method = "913A20B99E96CE03CF598425BC83F2C3")
    public void setWillNotDraw(boolean willNotDraw) {
        setFlags(willNotDraw ? WILL_NOT_DRAW : 0, DRAW_MASK);
        addTaint(willNotDraw);
        // ---------- Original Method ----------
        //setFlags(willNotDraw ? WILL_NOT_DRAW : 0, DRAW_MASK);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.818 -0400", hash_original_method = "B6E391CBFCFD7EA26D5A2732CEE40DF4", hash_generated_method = "A01A51E1922A60E1F9E5A99C1C13F8A0")
    @ViewDebug.ExportedProperty(category = "drawing")
    public boolean willNotDraw() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1376172039 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1376172039;
        // ---------- Original Method ----------
        //return (mViewFlags & DRAW_MASK) == WILL_NOT_DRAW;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.822 -0400", hash_original_method = "60A2EABB5E8AA4648C06B0E0E4A2AF9C", hash_generated_method = "F94A42F4837B35CD7A18E49F6F7F2A5A")
    public void setWillNotCacheDrawing(boolean willNotCacheDrawing) {
        setFlags(willNotCacheDrawing ? WILL_NOT_CACHE_DRAWING : 0, WILL_NOT_CACHE_DRAWING);
        addTaint(willNotCacheDrawing);
        // ---------- Original Method ----------
        //setFlags(willNotCacheDrawing ? WILL_NOT_CACHE_DRAWING : 0, WILL_NOT_CACHE_DRAWING);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.825 -0400", hash_original_method = "4D65385BAE58DC536EC26F23A55907FF", hash_generated_method = "27889C48274A209428DE211D574A142D")
    @ViewDebug.ExportedProperty(category = "drawing")
    public boolean willNotCacheDrawing() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2050174763 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2050174763;
        // ---------- Original Method ----------
        //return (mViewFlags & WILL_NOT_CACHE_DRAWING) == WILL_NOT_CACHE_DRAWING;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.832 -0400", hash_original_method = "CAB421C9E4DB53058A0B9351F5E562C4", hash_generated_method = "C2EBF8F908D8F9948C15A540734EF276")
    @ViewDebug.ExportedProperty
    public boolean isClickable() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1242320551 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1242320551;
        // ---------- Original Method ----------
        //return (mViewFlags & CLICKABLE) == CLICKABLE;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.838 -0400", hash_original_method = "12111EA4E19255C8C0AB24AED3DDA51C", hash_generated_method = "4374D08E261D36E6FE00E0AF9F065003")
    public void setClickable(boolean clickable) {
        setFlags(clickable ? CLICKABLE : 0, CLICKABLE);
        addTaint(clickable);
        // ---------- Original Method ----------
        //setFlags(clickable ? CLICKABLE : 0, CLICKABLE);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.838 -0400", hash_original_method = "03A713DEC8C026709970488D282B8F0B", hash_generated_method = "663AB86804EAE9F231BA671C4AE66219")
    public boolean isLongClickable() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_905966516 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_905966516;
        // ---------- Original Method ----------
        //return (mViewFlags & LONG_CLICKABLE) == LONG_CLICKABLE;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.838 -0400", hash_original_method = "43536DF18C7BAF4AF88A04663CE8F089", hash_generated_method = "E1B74B95D9F2AD6E13CC75A43B18D3C5")
    public void setLongClickable(boolean longClickable) {
        setFlags(longClickable ? LONG_CLICKABLE : 0, LONG_CLICKABLE);
        addTaint(longClickable);
        // ---------- Original Method ----------
        //setFlags(longClickable ? LONG_CLICKABLE : 0, LONG_CLICKABLE);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.839 -0400", hash_original_method = "EED851B5F13351F1D2A34CF3C577E6B2", hash_generated_method = "C4057CF4BACA15652385B8746442BE91")
    public void setPressed(boolean pressed) {
        {
            mPrivateFlags |= PRESSED;
        } //End block
        {
            mPrivateFlags &= ~PRESSED;
        } //End block
        refreshDrawableState();
        dispatchSetPressed(pressed);
        addTaint(pressed);
        // ---------- Original Method ----------
        //if (pressed) {
            //mPrivateFlags |= PRESSED;
        //} else {
            //mPrivateFlags &= ~PRESSED;
        //}
        //refreshDrawableState();
        //dispatchSetPressed(pressed);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.840 -0400", hash_original_method = "AF011537E523E131D566F09FD5E6C732", hash_generated_method = "482399F15DBB51C97D7E5C81A9573A96")
    protected void dispatchSetPressed(boolean pressed) {
        addTaint(pressed);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.840 -0400", hash_original_method = "2EE8A3F216F87253226045E7C3E687D4", hash_generated_method = "F0EAAF785D968AEA4A0D68C81F3EE57A")
    public boolean isPressed() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1594749140 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1594749140;
        // ---------- Original Method ----------
        //return (mPrivateFlags & PRESSED) == PRESSED;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.840 -0400", hash_original_method = "A0C463B2F7163F6CE9FACC921DDDC0C1", hash_generated_method = "F6033376F6002F0783D4F5828598BDA8")
    public boolean isSaveEnabled() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_793586482 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_793586482;
        // ---------- Original Method ----------
        //return (mViewFlags & SAVE_DISABLED_MASK) != SAVE_DISABLED;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.845 -0400", hash_original_method = "245457DBE539B6534978F5D496F585EA", hash_generated_method = "3884A300598E0D18BAFFD2FE7E71BDEC")
    public void setSaveEnabled(boolean enabled) {
        setFlags(enabled ? 0 : SAVE_DISABLED, SAVE_DISABLED_MASK);
        addTaint(enabled);
        // ---------- Original Method ----------
        //setFlags(enabled ? 0 : SAVE_DISABLED, SAVE_DISABLED_MASK);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.850 -0400", hash_original_method = "A79886E869A4527EDC4A240CAA54713C", hash_generated_method = "8440F873AF8162A400807D82011304EA")
    @ViewDebug.ExportedProperty
    public boolean getFilterTouchesWhenObscured() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_229538161 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_229538161;
        // ---------- Original Method ----------
        //return (mViewFlags & FILTER_TOUCHES_WHEN_OBSCURED) != 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.850 -0400", hash_original_method = "EDB53D9F0799F64121B32D1526967A47", hash_generated_method = "566C41DA00E1F9BE3A83B4E671DBAD1F")
    public void setFilterTouchesWhenObscured(boolean enabled) {
        setFlags(enabled ? 0 : FILTER_TOUCHES_WHEN_OBSCURED,
                FILTER_TOUCHES_WHEN_OBSCURED);
        addTaint(enabled);
        // ---------- Original Method ----------
        //setFlags(enabled ? 0 : FILTER_TOUCHES_WHEN_OBSCURED,
                //FILTER_TOUCHES_WHEN_OBSCURED);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.852 -0400", hash_original_method = "48E76F9595084274E97DBE24F2087BC5", hash_generated_method = "7601AEA35758FA03DA82E95FDF2F87E3")
    public boolean isSaveFromParentEnabled() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1521578854 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1521578854;
        // ---------- Original Method ----------
        //return (mViewFlags & PARENT_SAVE_DISABLED_MASK) != PARENT_SAVE_DISABLED;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.853 -0400", hash_original_method = "72C3E4C29A0B231006D33E493310EA89", hash_generated_method = "E4484042BE0E5564A91AC960C81FCAF8")
    public void setSaveFromParentEnabled(boolean enabled) {
        setFlags(enabled ? 0 : PARENT_SAVE_DISABLED, PARENT_SAVE_DISABLED_MASK);
        addTaint(enabled);
        // ---------- Original Method ----------
        //setFlags(enabled ? 0 : PARENT_SAVE_DISABLED, PARENT_SAVE_DISABLED_MASK);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.854 -0400", hash_original_method = "C297173E860DE7426FAD1827D2AF0FEF", hash_generated_method = "918A2D6D33DB6128314A0790DE45EE94")
    @ViewDebug.ExportedProperty(category = "focus")
    public final boolean isFocusable() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1089489776 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1089489776;
        // ---------- Original Method ----------
        //return FOCUSABLE == (mViewFlags & FOCUSABLE_MASK);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.854 -0400", hash_original_method = "DC5548897986A7EA94B912A4E6E95490", hash_generated_method = "6002340229D5D709471E6C3172C2C543")
    @ViewDebug.ExportedProperty
    public final boolean isFocusableInTouchMode() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1324950009 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1324950009;
        // ---------- Original Method ----------
        //return FOCUSABLE_IN_TOUCH_MODE == (mViewFlags & FOCUSABLE_IN_TOUCH_MODE);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.854 -0400", hash_original_method = "0DA4F7FC608C37A46918AF583285CEAA", hash_generated_method = "262693B50705DD73A4CE886FD901BFEC")
    public View focusSearch(int direction) {
        View varB4EAC82CA7396A68D541C85D26508E83_1075075081 = null; //Variable for return #1
        View varB4EAC82CA7396A68D541C85D26508E83_454994350 = null; //Variable for return #2
        {
            varB4EAC82CA7396A68D541C85D26508E83_1075075081 = mParent.focusSearch(this, direction);
        } //End block
        {
            varB4EAC82CA7396A68D541C85D26508E83_454994350 = null;
        } //End block
        addTaint(direction);
        View varA7E53CE21691AB073D9660D615818899_123042521; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_123042521 = varB4EAC82CA7396A68D541C85D26508E83_1075075081;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_123042521 = varB4EAC82CA7396A68D541C85D26508E83_454994350;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_123042521.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_123042521;
        // ---------- Original Method ----------
        //if (mParent != null) {
            //return mParent.focusSearch(this, direction);
        //} else {
            //return null;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.860 -0400", hash_original_method = "3A7E0D4CA01222234C5493EC87211574", hash_generated_method = "988629E2074FC911B2B699EDCCA2339B")
    public boolean dispatchUnhandledMove(View focused, int direction) {
        addTaint(focused.getTaint());
        addTaint(direction);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_253694054 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_253694054;
        // ---------- Original Method ----------
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.865 -0400", hash_original_method = "402D36B98ACE611B6285D11A0B7474BF", hash_generated_method = "C8332550B7B418B13E147C0B6E025A1B")
     View findUserSetNextFocus(View root, int direction) {
        View varB4EAC82CA7396A68D541C85D26508E83_988049135 = null; //Variable for return #1
        View varB4EAC82CA7396A68D541C85D26508E83_854422241 = null; //Variable for return #2
        View varB4EAC82CA7396A68D541C85D26508E83_781715487 = null; //Variable for return #3
        View varB4EAC82CA7396A68D541C85D26508E83_212397450 = null; //Variable for return #4
        View varB4EAC82CA7396A68D541C85D26508E83_441896305 = null; //Variable for return #5
        View varB4EAC82CA7396A68D541C85D26508E83_926095098 = null; //Variable for return #6
        View varB4EAC82CA7396A68D541C85D26508E83_335310151 = null; //Variable for return #7
        View varB4EAC82CA7396A68D541C85D26508E83_876912506 = null; //Variable for return #8
        View varB4EAC82CA7396A68D541C85D26508E83_2071735994 = null; //Variable for return #9
        View varB4EAC82CA7396A68D541C85D26508E83_223079752 = null; //Variable for return #10
        View varB4EAC82CA7396A68D541C85D26508E83_1991377194 = null; //Variable for return #11
        View varB4EAC82CA7396A68D541C85D26508E83_1045149348 = null; //Variable for return #12
        //Begin case FOCUS_LEFT 
        varB4EAC82CA7396A68D541C85D26508E83_988049135 = null;
        //End case FOCUS_LEFT 
        //Begin case FOCUS_LEFT 
        varB4EAC82CA7396A68D541C85D26508E83_854422241 = findViewInsideOutShouldExist(root, mNextFocusLeftId);
        //End case FOCUS_LEFT 
        //Begin case FOCUS_RIGHT 
        varB4EAC82CA7396A68D541C85D26508E83_781715487 = null;
        //End case FOCUS_RIGHT 
        //Begin case FOCUS_RIGHT 
        varB4EAC82CA7396A68D541C85D26508E83_212397450 = findViewInsideOutShouldExist(root, mNextFocusRightId);
        //End case FOCUS_RIGHT 
        //Begin case FOCUS_UP 
        varB4EAC82CA7396A68D541C85D26508E83_441896305 = null;
        //End case FOCUS_UP 
        //Begin case FOCUS_UP 
        varB4EAC82CA7396A68D541C85D26508E83_926095098 = findViewInsideOutShouldExist(root, mNextFocusUpId);
        //End case FOCUS_UP 
        //Begin case FOCUS_DOWN 
        varB4EAC82CA7396A68D541C85D26508E83_335310151 = null;
        //End case FOCUS_DOWN 
        //Begin case FOCUS_DOWN 
        varB4EAC82CA7396A68D541C85D26508E83_876912506 = findViewInsideOutShouldExist(root, mNextFocusDownId);
        //End case FOCUS_DOWN 
        //Begin case FOCUS_FORWARD 
        varB4EAC82CA7396A68D541C85D26508E83_2071735994 = null;
        //End case FOCUS_FORWARD 
        //Begin case FOCUS_FORWARD 
        varB4EAC82CA7396A68D541C85D26508E83_223079752 = findViewInsideOutShouldExist(root, mNextFocusForwardId);
        //End case FOCUS_FORWARD 
        //Begin case FOCUS_BACKWARD 
        {
            int id;
            id = mID;
            varB4EAC82CA7396A68D541C85D26508E83_1991377194 = root.findViewByPredicateInsideOut(this, new Predicate<View>() {
                    @Override
                    public boolean apply(View t) {
                        return t.mNextFocusForwardId == id;
                    }
                });
        } //End block
        //End case FOCUS_BACKWARD 
        varB4EAC82CA7396A68D541C85D26508E83_1045149348 = null;
        addTaint(root.getTaint());
        addTaint(direction);
        View varA7E53CE21691AB073D9660D615818899_1651134438; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1651134438 = varB4EAC82CA7396A68D541C85D26508E83_988049135;
                break;
            case 2: //Assign result for return ordinal #2
                varA7E53CE21691AB073D9660D615818899_1651134438 = varB4EAC82CA7396A68D541C85D26508E83_854422241;
                break;
            case 3: //Assign result for return ordinal #3
                varA7E53CE21691AB073D9660D615818899_1651134438 = varB4EAC82CA7396A68D541C85D26508E83_781715487;
                break;
            case 4: //Assign result for return ordinal #4
                varA7E53CE21691AB073D9660D615818899_1651134438 = varB4EAC82CA7396A68D541C85D26508E83_212397450;
                break;
            case 5: //Assign result for return ordinal #5
                varA7E53CE21691AB073D9660D615818899_1651134438 = varB4EAC82CA7396A68D541C85D26508E83_441896305;
                break;
            case 6: //Assign result for return ordinal #6
                varA7E53CE21691AB073D9660D615818899_1651134438 = varB4EAC82CA7396A68D541C85D26508E83_926095098;
                break;
            case 7: //Assign result for return ordinal #7
                varA7E53CE21691AB073D9660D615818899_1651134438 = varB4EAC82CA7396A68D541C85D26508E83_335310151;
                break;
            case 8: //Assign result for return ordinal #8
                varA7E53CE21691AB073D9660D615818899_1651134438 = varB4EAC82CA7396A68D541C85D26508E83_876912506;
                break;
            case 9: //Assign result for return ordinal #9
                varA7E53CE21691AB073D9660D615818899_1651134438 = varB4EAC82CA7396A68D541C85D26508E83_2071735994;
                break;
            case 10: //Assign result for return ordinal #10
                varA7E53CE21691AB073D9660D615818899_1651134438 = varB4EAC82CA7396A68D541C85D26508E83_223079752;
                break;
            case 11: //Assign result for return ordinal #11
                varA7E53CE21691AB073D9660D615818899_1651134438 = varB4EAC82CA7396A68D541C85D26508E83_1991377194;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1651134438 = varB4EAC82CA7396A68D541C85D26508E83_1045149348;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1651134438.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1651134438;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.866 -0400", hash_original_method = "B3DFEFAC3DA8B2AFE30A5DD5BC4E600A", hash_generated_method = "48E8C9E5D47CD0DDC5D61D8780EDCD1C")
    private View findViewInsideOutShouldExist(View root, final int childViewId) {
        View varB4EAC82CA7396A68D541C85D26508E83_1572637156 = null; //Variable for return #1
        View result;
        result = root.findViewByPredicateInsideOut(this, new Predicate<View>() {
            @Override
            public boolean apply(View t) {
                return t.mID == childViewId;
            }
        });
        varB4EAC82CA7396A68D541C85D26508E83_1572637156 = result;
        addTaint(root.getTaint());
        addTaint(childViewId);
        varB4EAC82CA7396A68D541C85D26508E83_1572637156.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1572637156;
        // ---------- Original Method ----------
        //View result = root.findViewByPredicateInsideOut(this, new Predicate<View>() {
            //@Override
            //public boolean apply(View t) {
                //return t.mID == childViewId;
            //}
        //});
        //if (result == null) {
            //Log.w(VIEW_LOG_TAG, "couldn't find next focus view specified "
                    //+ "by user for id " + childViewId);
        //}
        //return result;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.867 -0400", hash_original_method = "464AB183F4A2042C34DE93C717198DDB", hash_generated_method = "34928135AB4AA9FC986EFE370AB0974A")
    public ArrayList<View> getFocusables(int direction) {
        ArrayList<View> varB4EAC82CA7396A68D541C85D26508E83_385707304 = null; //Variable for return #1
        ArrayList<View> result;
        result = new ArrayList<View>(24);
        addFocusables(result, direction);
        varB4EAC82CA7396A68D541C85D26508E83_385707304 = result;
        addTaint(direction);
        varB4EAC82CA7396A68D541C85D26508E83_385707304.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_385707304;
        // ---------- Original Method ----------
        //ArrayList<View> result = new ArrayList<View>(24);
        //addFocusables(result, direction);
        //return result;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.867 -0400", hash_original_method = "2428CCD79B4CEE814D080BAF1161F8B9", hash_generated_method = "5094D6BB39AFC12E74B6D1EB7B6739A8")
    public void addFocusables(ArrayList<View> views, int direction) {
        addFocusables(views, direction, FOCUSABLES_TOUCH_MODE);
        addTaint(views.getTaint());
        addTaint(direction);
        // ---------- Original Method ----------
        //addFocusables(views, direction, FOCUSABLES_TOUCH_MODE);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.868 -0400", hash_original_method = "C71740B3CD39B4D243A828C918021CDE", hash_generated_method = "4B91CAD0120948402E8795A8063C2B97")
    public void addFocusables(ArrayList<View> views, int direction, int focusableMode) {
        {
            boolean var8DB70F00D9A309F787FE648FEF017045_201442363 = (!isFocusable());
        } //End collapsed parenthetic
        {
            boolean var2850B2A852F5A5DCF1E2CF378227B555_1313763242 = ((focusableMode & FOCUSABLES_TOUCH_MODE) == FOCUSABLES_TOUCH_MODE &&
                isInTouchMode() && !isFocusableInTouchMode());
        } //End collapsed parenthetic
        {
            views.add(this);
        } //End block
        addTaint(views.getTaint());
        addTaint(direction);
        addTaint(focusableMode);
        // ---------- Original Method ----------
        //if (!isFocusable()) {
            //return;
        //}
        //if ((focusableMode & FOCUSABLES_TOUCH_MODE) == FOCUSABLES_TOUCH_MODE &&
                //isInTouchMode() && !isFocusableInTouchMode()) {
            //return;
        //}
        //if (views != null) {
            //views.add(this);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.868 -0400", hash_original_method = "DD343D81D813CE2B90520525DB465FA4", hash_generated_method = "5A58567E0FE98D014C0728D12A96DB2B")
    public void findViewsWithText(ArrayList<View> outViews, CharSequence searched, int flags) {
        {
            boolean var14B0D5F38B5F4B978CEA9F4FD1437EE5_458148382 = ((flags & FIND_VIEWS_WITH_CONTENT_DESCRIPTION) != 0 && !TextUtils.isEmpty(searched)
                && !TextUtils.isEmpty(mContentDescription));
            {
                String searchedLowerCase;
                searchedLowerCase = searched.toString().toLowerCase();
                String contentDescriptionLowerCase;
                contentDescriptionLowerCase = mContentDescription.toString().toLowerCase();
                {
                    boolean var5F42F50A6B3B93A57712332F7515E0D4_1919317938 = (contentDescriptionLowerCase.contains(searchedLowerCase));
                    {
                        outViews.add(this);
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        addTaint(outViews.getTaint());
        addTaint(searched.getTaint());
        addTaint(flags);
        // ---------- Original Method ----------
        //if ((flags & FIND_VIEWS_WITH_CONTENT_DESCRIPTION) != 0 && !TextUtils.isEmpty(searched)
                //&& !TextUtils.isEmpty(mContentDescription)) {
            //String searchedLowerCase = searched.toString().toLowerCase();
            //String contentDescriptionLowerCase = mContentDescription.toString().toLowerCase();
            //if (contentDescriptionLowerCase.contains(searchedLowerCase)) {
                //outViews.add(this);
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.869 -0400", hash_original_method = "FFA271D2293E365BAC2553CB237E7BDA", hash_generated_method = "4C3C40437E7B6D285C54058D8652E609")
    public ArrayList<View> getTouchables() {
        ArrayList<View> varB4EAC82CA7396A68D541C85D26508E83_448845704 = null; //Variable for return #1
        ArrayList<View> result;
        result = new ArrayList<View>();
        addTouchables(result);
        varB4EAC82CA7396A68D541C85D26508E83_448845704 = result;
        varB4EAC82CA7396A68D541C85D26508E83_448845704.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_448845704;
        // ---------- Original Method ----------
        //ArrayList<View> result = new ArrayList<View>();
        //addTouchables(result);
        //return result;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.873 -0400", hash_original_method = "4A9E887CF81CB13B9475E90E8F7B101A", hash_generated_method = "844EB7C9704D913A6C38C93040F1D523")
    public void addTouchables(ArrayList<View> views) {
        int viewFlags;
        viewFlags = mViewFlags;
        {
            views.add(this);
        } //End block
        addTaint(views.getTaint());
        // ---------- Original Method ----------
        //final int viewFlags = mViewFlags;
        //if (((viewFlags & CLICKABLE) == CLICKABLE || (viewFlags & LONG_CLICKABLE) == LONG_CLICKABLE)
                //&& (viewFlags & ENABLED_MASK) == ENABLED) {
            //views.add(this);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.877 -0400", hash_original_method = "D80138743E3873A119DEBFC486319C6F", hash_generated_method = "33FDE3E6AFF8D2E7B21941EE57AB0736")
    public final boolean requestFocus() {
        boolean varB33B1AB5B273EC528C5AE67F69172D01_1013953012 = (requestFocus(View.FOCUS_DOWN));
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_378625042 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_378625042;
        // ---------- Original Method ----------
        //return requestFocus(View.FOCUS_DOWN);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.878 -0400", hash_original_method = "0231248B41677D14ABD4C75C00BF9F51", hash_generated_method = "2F7889FB666878EDDB99ADA9B1B7B358")
    public final boolean requestFocus(int direction) {
        boolean varBEB132F64DDBBBEA263C94C9131D5FCE_801325819 = (requestFocus(direction, null));
        addTaint(direction);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_638679886 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_638679886;
        // ---------- Original Method ----------
        //return requestFocus(direction, null);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.878 -0400", hash_original_method = "4D4D948013EFF9FDAFD5232E182C7F46", hash_generated_method = "D4209F2594C849DE635A5121E0B69708")
    public boolean requestFocus(int direction, Rect previouslyFocusedRect) {
        {
            boolean varD02361A86C03997E5AE6B9686A81F1C2_781823096 = (isInTouchMode() &&
            (FOCUSABLE_IN_TOUCH_MODE != (mViewFlags & FOCUSABLE_IN_TOUCH_MODE)));
        } //End collapsed parenthetic
        {
            boolean varFCFFB1819C9B89AC39385EED17BA34F3_1421990459 = (hasAncestorThatBlocksDescendantFocus());
        } //End collapsed parenthetic
        handleFocusGainInternal(direction, previouslyFocusedRect);
        addTaint(direction);
        addTaint(previouslyFocusedRect.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_677295858 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_677295858;
        // ---------- Original Method ----------
        //if ((mViewFlags & FOCUSABLE_MASK) != FOCUSABLE ||
                //(mViewFlags & VISIBILITY_MASK) != VISIBLE) {
            //return false;
        //}
        //if (isInTouchMode() &&
            //(FOCUSABLE_IN_TOUCH_MODE != (mViewFlags & FOCUSABLE_IN_TOUCH_MODE))) {
               //return false;
        //}
        //if (hasAncestorThatBlocksDescendantFocus()) {
            //return false;
        //}
        //handleFocusGainInternal(direction, previouslyFocusedRect);
        //return true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.879 -0400", hash_original_method = "7FA91653ABFF57A00EB7068CB83E321B", hash_generated_method = "FEEED2CB3E22FECCBB6CC8DB6D11F4A4")
     ViewRootImpl getViewRootImpl() {
        ViewRootImpl varB4EAC82CA7396A68D541C85D26508E83_1095839147 = null; //Variable for return #1
        View root;
        root = getRootView();
        varB4EAC82CA7396A68D541C85D26508E83_1095839147 = root != null ? (ViewRootImpl)root.getParent() : null;
        varB4EAC82CA7396A68D541C85D26508E83_1095839147.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1095839147;
        // ---------- Original Method ----------
        //View root = getRootView();
        //return root != null ? (ViewRootImpl)root.getParent() : null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.879 -0400", hash_original_method = "1F9F6F0DA182BB29AC330886C262C4C3", hash_generated_method = "61F373685A824C78D68F8563E380E6DC")
    public final boolean requestFocusFromTouch() {
        {
            boolean varA7F65F2C3551E1C19C22954843677DD3_985274400 = (isInTouchMode());
            {
                ViewRootImpl viewRoot;
                viewRoot = getViewRootImpl();
                {
                    viewRoot.ensureTouchMode(false);
                } //End block
            } //End block
        } //End collapsed parenthetic
        boolean varB33B1AB5B273EC528C5AE67F69172D01_18514436 = (requestFocus(View.FOCUS_DOWN));
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1424438049 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1424438049;
        // ---------- Original Method ----------
        //if (isInTouchMode()) {
            //ViewRootImpl viewRoot = getViewRootImpl();
            //if (viewRoot != null) {
                //viewRoot.ensureTouchMode(false);
            //}
        //}
        //return requestFocus(View.FOCUS_DOWN);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.879 -0400", hash_original_method = "AF1FEBD7D3DF68D5685D255FEFA73D33", hash_generated_method = "F578F2A77423BD306B60AA080244A757")
    private boolean hasAncestorThatBlocksDescendantFocus() {
        ViewParent ancestor;
        ancestor = mParent;
        {
            ViewGroup vgAncestor;
            vgAncestor = (ViewGroup) ancestor;
            {
                boolean var6A93B533F786283E71D28D2D3BB8654E_1749556796 = (vgAncestor.getDescendantFocusability() == ViewGroup.FOCUS_BLOCK_DESCENDANTS);
                {
                    ancestor = vgAncestor.getParent();
                } //End block
            } //End collapsed parenthetic
        } //End block
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2069960281 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2069960281;
        // ---------- Original Method ----------
        //ViewParent ancestor = mParent;
        //while (ancestor instanceof ViewGroup) {
            //final ViewGroup vgAncestor = (ViewGroup) ancestor;
            //if (vgAncestor.getDescendantFocusability() == ViewGroup.FOCUS_BLOCK_DESCENDANTS) {
                //return true;
            //} else {
                //ancestor = vgAncestor.getParent();
            //}
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.884 -0400", hash_original_method = "9E8D01E3E35914BE1B580652C44B6D92", hash_generated_method = "4068A66B11C8A715D0155C9B0F768AA3")
    public void dispatchStartTemporaryDetach() {
        onStartTemporaryDetach();
        // ---------- Original Method ----------
        //onStartTemporaryDetach();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.895 -0400", hash_original_method = "7B585748E6C2A3CE6D3BA7FDB91AA5A9", hash_generated_method = "835E4082F4217105CFFD467CF28422B0")
    public void onStartTemporaryDetach() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        removeUnsetPressCallback();
        mPrivateFlags |= CANCEL_NEXT_UP_EVENT;
        // ---------- Original Method ----------
        //removeUnsetPressCallback();
        //mPrivateFlags |= CANCEL_NEXT_UP_EVENT;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.895 -0400", hash_original_method = "07C22BEB43BC8453BE2AEA4BC85C2345", hash_generated_method = "3223FB93CB255E66A3AC95410D228D51")
    public void dispatchFinishTemporaryDetach() {
        onFinishTemporaryDetach();
        // ---------- Original Method ----------
        //onFinishTemporaryDetach();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.895 -0400", hash_original_method = "B87297DA0096F2C31AB92D13B4246B81", hash_generated_method = "25EA709CBA250441F08254F97B05DEE6")
    public void onFinishTemporaryDetach() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.896 -0400", hash_original_method = "5346C33A691675BA7E77EC00779EE7C7", hash_generated_method = "F3D6449EF8A49EC2BCCA158AD127153C")
    public KeyEvent.DispatcherState getKeyDispatcherState() {
        KeyEvent.DispatcherState varB4EAC82CA7396A68D541C85D26508E83_1262546685 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1262546685 = mAttachInfo != null ? mAttachInfo.mKeyDispatchState : null;
        varB4EAC82CA7396A68D541C85D26508E83_1262546685.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1262546685;
        // ---------- Original Method ----------
        //return mAttachInfo != null ? mAttachInfo.mKeyDispatchState : null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.896 -0400", hash_original_method = "6BC846EF16EEF6AFE683BBB51F853755", hash_generated_method = "0BEADCF282BF7BBA75F9FFD6BEE848EA")
    public boolean dispatchKeyEventPreIme(KeyEvent event) {
        boolean varA1D1F09794689B9E696354A29B1E7AC6_979645431 = (onKeyPreIme(event.getKeyCode(), event));
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1832734105 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1832734105;
        // ---------- Original Method ----------
        //return onKeyPreIme(event.getKeyCode(), event);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.897 -0400", hash_original_method = "E10762B11C67C141BFF5425226FAC8FB", hash_generated_method = "E481EDAF619A24554B2115234A4B7E15")
    public boolean dispatchKeyEvent(KeyEvent event) {
        {
            mInputEventConsistencyVerifier.onKeyEvent(event, 0);
        } //End block
        ListenerInfo li;
        li = mListenerInfo;
        {
            boolean var1AD81DB769C1B29F43EBC2BE5F7D22DB_1279552885 = (li != null && li.mOnKeyListener != null && (mViewFlags & ENABLED_MASK) == ENABLED
                && li.mOnKeyListener.onKey(this, event.getKeyCode(), event));
        } //End collapsed parenthetic
        {
            boolean varE1E9B80914776D83D3B032515F60B979_626947430 = (event.dispatch(this, mAttachInfo != null
                ? mAttachInfo.mKeyDispatchState : null, this)); //DSFIXME:  CODE0008: Nested ternary operator in expression
        } //End collapsed parenthetic
        {
            mInputEventConsistencyVerifier.onUnhandledEvent(event, 0);
        } //End block
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_754366356 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_754366356;
        // ---------- Original Method ----------
        //if (mInputEventConsistencyVerifier != null) {
            //mInputEventConsistencyVerifier.onKeyEvent(event, 0);
        //}
        //ListenerInfo li = mListenerInfo;
        //if (li != null && li.mOnKeyListener != null && (mViewFlags & ENABLED_MASK) == ENABLED
                //&& li.mOnKeyListener.onKey(this, event.getKeyCode(), event)) {
            //return true;
        //}
        //if (event.dispatch(this, mAttachInfo != null
                //? mAttachInfo.mKeyDispatchState : null, this)) {
            //return true;
        //}
        //if (mInputEventConsistencyVerifier != null) {
            //mInputEventConsistencyVerifier.onUnhandledEvent(event, 0);
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.897 -0400", hash_original_method = "24CC3891BCF06B080FB3833309F877D3", hash_generated_method = "53FF5175823AD29E0E56F997516BD043")
    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        boolean varB65319FC5255424F872A964CBDE1432E_2020162398 = (onKeyShortcut(event.getKeyCode(), event));
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_244919195 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_244919195;
        // ---------- Original Method ----------
        //return onKeyShortcut(event.getKeyCode(), event);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.898 -0400", hash_original_method = "600B8A393DB97B903182B7AB1891AC3E", hash_generated_method = "A6B1D6ED2F2893D5AA7A889CA895EA80")
    public boolean dispatchTouchEvent(MotionEvent event) {
        {
            mInputEventConsistencyVerifier.onTouchEvent(event, 0);
        } //End block
        {
            boolean var6607193D9DAC59E34045E90E7ECB0599_713062561 = (onFilterTouchEventForSecurity(event));
            {
                ListenerInfo li;
                li = mListenerInfo;
                {
                    boolean var710CB5FED0ECEB52EC22DD1CD141A5D7_75144164 = (li != null && li.mOnTouchListener != null && (mViewFlags & ENABLED_MASK) == ENABLED
                    && li.mOnTouchListener.onTouch(this, event));
                } //End collapsed parenthetic
                {
                    boolean var430E552CCD38EECE5F1A81AADC330527_43932571 = (onTouchEvent(event));
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        {
            mInputEventConsistencyVerifier.onUnhandledEvent(event, 0);
        } //End block
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_462420738 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_462420738;
        // ---------- Original Method ----------
        //if (mInputEventConsistencyVerifier != null) {
            //mInputEventConsistencyVerifier.onTouchEvent(event, 0);
        //}
        //if (onFilterTouchEventForSecurity(event)) {
            //ListenerInfo li = mListenerInfo;
            //if (li != null && li.mOnTouchListener != null && (mViewFlags & ENABLED_MASK) == ENABLED
                    //&& li.mOnTouchListener.onTouch(this, event)) {
                //return true;
            //}
            //if (onTouchEvent(event)) {
                //return true;
            //}
        //}
        //if (mInputEventConsistencyVerifier != null) {
            //mInputEventConsistencyVerifier.onUnhandledEvent(event, 0);
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.899 -0400", hash_original_method = "D22D4E22492930B2B9E3C8840958D4D7", hash_generated_method = "B80E91D992C917489147C324F716E213")
    public boolean onFilterTouchEventForSecurity(MotionEvent event) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        {
            boolean var702D316B06A93F4CCE85A9302F846D5C_764350092 = ((mViewFlags & FILTER_TOUCHES_WHEN_OBSCURED) != 0
                && (event.getFlags() & MotionEvent.FLAG_WINDOW_IS_OBSCURED) != 0);
        } //End collapsed parenthetic
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1956071919 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1956071919;
        // ---------- Original Method ----------
        //if ((mViewFlags & FILTER_TOUCHES_WHEN_OBSCURED) != 0
                //&& (event.getFlags() & MotionEvent.FLAG_WINDOW_IS_OBSCURED) != 0) {
            //return false;
        //}
        //return true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.899 -0400", hash_original_method = "7D8730AF428F1F83C6EA34686735DEE9", hash_generated_method = "5F5F04E6A3324C0330390E204D8A4CB6")
    public boolean dispatchTrackballEvent(MotionEvent event) {
        {
            mInputEventConsistencyVerifier.onTrackballEvent(event, 0);
        } //End block
        boolean var138C9D0D373C5EB915EF41E377253C34_1707643111 = (onTrackballEvent(event));
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_977477295 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_977477295;
        // ---------- Original Method ----------
        //if (mInputEventConsistencyVerifier != null) {
            //mInputEventConsistencyVerifier.onTrackballEvent(event, 0);
        //}
        //return onTrackballEvent(event);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.900 -0400", hash_original_method = "4D54FFDFE0E351BCF8C37A3BD601042A", hash_generated_method = "641222506068B2A1DDB5EAAA25463C0E")
    public boolean dispatchGenericMotionEvent(MotionEvent event) {
        {
            mInputEventConsistencyVerifier.onGenericMotionEvent(event, 0);
        } //End block
        int source;
        source = event.getSource();
        {
            int action;
            action = event.getAction();
            {
                {
                    boolean varB883F6E8D34F34A7AC9A1C8473B6C6B6_1850842839 = (dispatchHoverEvent(event));
                } //End collapsed parenthetic
            } //End block
            {
                boolean var2FA64A05C793C37BF00E4ECBCAD6D479_1814085010 = (dispatchGenericPointerEvent(event));
            } //End collapsed parenthetic
        } //End block
        {
            boolean var1E07621182DE67A8830891F3EE4A3942_2050982947 = (dispatchGenericFocusedEvent(event));
        } //End collapsed parenthetic
        {
            boolean varB9448C36962D13B58BD66CC5B67304A5_280671110 = (dispatchGenericMotionEventInternal(event));
        } //End collapsed parenthetic
        {
            mInputEventConsistencyVerifier.onUnhandledEvent(event, 0);
        } //End block
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1295486961 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1295486961;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.904 -0400", hash_original_method = "C7F259FDC1DD0446D3E9FDACCE813628", hash_generated_method = "4F62CFAF02FA06716CC55DA05B7A1E35")
    private boolean dispatchGenericMotionEventInternal(MotionEvent event) {
        ListenerInfo li;
        li = mListenerInfo;
        {
            boolean varF5508584668781871F7A8EEF6203DF63_2139316128 = (li != null && li.mOnGenericMotionListener != null
                && (mViewFlags & ENABLED_MASK) == ENABLED
                && li.mOnGenericMotionListener.onGenericMotion(this, event));
        } //End collapsed parenthetic
        {
            boolean varB02F8946AC0F1C42DF139AA516995E2E_1584090451 = (onGenericMotionEvent(event));
        } //End collapsed parenthetic
        {
            mInputEventConsistencyVerifier.onUnhandledEvent(event, 0);
        } //End block
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_952582523 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_952582523;
        // ---------- Original Method ----------
        //ListenerInfo li = mListenerInfo;
        //if (li != null && li.mOnGenericMotionListener != null
                //&& (mViewFlags & ENABLED_MASK) == ENABLED
                //&& li.mOnGenericMotionListener.onGenericMotion(this, event)) {
            //return true;
        //}
        //if (onGenericMotionEvent(event)) {
            //return true;
        //}
        //if (mInputEventConsistencyVerifier != null) {
            //mInputEventConsistencyVerifier.onUnhandledEvent(event, 0);
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.905 -0400", hash_original_method = "648EC8AE542E2EA418563108E4E24BE8", hash_generated_method = "38899E5BACF4993A4E2D06B1998DBCD3")
    protected boolean dispatchHoverEvent(MotionEvent event) {
        ListenerInfo li;
        li = mListenerInfo;
        {
            boolean varE708EAD4945B3336974BCEC5E5692CEB_1936725463 = (li != null && li.mOnHoverListener != null
                && (mViewFlags & ENABLED_MASK) == ENABLED
                && li.mOnHoverListener.onHover(this, event));
        } //End collapsed parenthetic
        boolean var20FA514C60FFF8C5D29FC4243A17D964_1676156834 = (onHoverEvent(event));
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_898940819 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_898940819;
        // ---------- Original Method ----------
        //ListenerInfo li = mListenerInfo;
        //if (li != null && li.mOnHoverListener != null
                //&& (mViewFlags & ENABLED_MASK) == ENABLED
                //&& li.mOnHoverListener.onHover(this, event)) {
            //return true;
        //}
        //return onHoverEvent(event);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.905 -0400", hash_original_method = "6C63870709E0BCE3150AB1DBD762BE1B", hash_generated_method = "3E764297C703589C639A8D284C153A33")
    protected boolean hasHoveredChild() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1475407579 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1475407579;
        // ---------- Original Method ----------
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.905 -0400", hash_original_method = "3E380A63A40D63CB8A25C818C007B9B3", hash_generated_method = "7A240EA563B58E63A0CD334F33FC4D2A")
    protected boolean dispatchGenericPointerEvent(MotionEvent event) {
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_678114885 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_678114885;
        // ---------- Original Method ----------
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.912 -0400", hash_original_method = "A2221AB8B5038CA8B5C4F66BF8310DCB", hash_generated_method = "4C262960E8094EE52B10D120424719EC")
    protected boolean dispatchGenericFocusedEvent(MotionEvent event) {
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_892768365 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_892768365;
        // ---------- Original Method ----------
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.916 -0400", hash_original_method = "5F3F937CAC1AD8405FC854A70098D82C", hash_generated_method = "9B0A3B95C667C34AB328A0F148EBB586")
    public final boolean dispatchPointerEvent(MotionEvent event) {
        {
            boolean var15DC5053D55881959B9A5AB5DA0AE67E_1198532112 = (event.isTouchEvent());
            {
                boolean varB6BDA87406308A510ABCADF589E94032_1317512883 = (dispatchTouchEvent(event));
            } //End block
            {
                boolean var34A3B038B9117B3BA5FBBDB0BBF251D9_1976352722 = (dispatchGenericMotionEvent(event));
            } //End block
        } //End collapsed parenthetic
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1051370003 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1051370003;
        // ---------- Original Method ----------
        //if (event.isTouchEvent()) {
            //return dispatchTouchEvent(event);
        //} else {
            //return dispatchGenericMotionEvent(event);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.917 -0400", hash_original_method = "F6C86F5501B65BFAFB8121E3F717BD02", hash_generated_method = "9EE6786DF4A3CDC7D219D109C602A1E2")
    public void dispatchWindowFocusChanged(boolean hasFocus) {
        onWindowFocusChanged(hasFocus);
        addTaint(hasFocus);
        // ---------- Original Method ----------
        //onWindowFocusChanged(hasFocus);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.919 -0400", hash_original_method = "F57E7738E41C9719BB0FA37E2B51EE61", hash_generated_method = "D8F47138AA1E88545F868AE0BBC5C7E9")
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        InputMethodManager imm;
        imm = InputMethodManager.peekInstance();
        {
            {
                boolean varF27F491A5EAB0B2989FBEF44657192A7_1814903097 = (isPressed());
                {
                    setPressed(false);
                } //End block
            } //End collapsed parenthetic
            {
                imm.focusOut(this);
            } //End block
            removeLongPressCallback();
            removeTapCallback();
            onFocusLost();
        } //End block
        {
            imm.focusIn(this);
        } //End block
        refreshDrawableState();
        addTaint(hasWindowFocus);
        // ---------- Original Method ----------
        //InputMethodManager imm = InputMethodManager.peekInstance();
        //if (!hasWindowFocus) {
            //if (isPressed()) {
                //setPressed(false);
            //}
            //if (imm != null && (mPrivateFlags & FOCUSED) != 0) {
                //imm.focusOut(this);
            //}
            //removeLongPressCallback();
            //removeTapCallback();
            //onFocusLost();
        //} else if (imm != null && (mPrivateFlags & FOCUSED) != 0) {
            //imm.focusIn(this);
        //}
        //refreshDrawableState();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.920 -0400", hash_original_method = "43B27055CE530161D72F65ED0A59B9EC", hash_generated_method = "8326DD120351DF8C852F4BE587C2A9BE")
    public boolean hasWindowFocus() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2079756488 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2079756488;
        // ---------- Original Method ----------
        //return mAttachInfo != null && mAttachInfo.mHasWindowFocus;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.920 -0400", hash_original_method = "5A92DDE8F02B8EC7BB05F90066C877DB", hash_generated_method = "3243E710BCE99C464D873F2CD3F3B3CF")
    protected void dispatchVisibilityChanged(View changedView, int visibility) {
        onVisibilityChanged(changedView, visibility);
        addTaint(changedView.getTaint());
        addTaint(visibility);
        // ---------- Original Method ----------
        //onVisibilityChanged(changedView, visibility);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.920 -0400", hash_original_method = "96367A8B641E87C53B477CCACD2EFDC5", hash_generated_method = "BE002024D6470FC82F23EA0B55EDBD9C")
    protected void onVisibilityChanged(View changedView, int visibility) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        {
            {
                initialAwakenScrollBars();
            } //End block
            {
                mPrivateFlags |= AWAKEN_SCROLL_BARS_ON_ATTACH;
            } //End block
        } //End block
        addTaint(changedView.getTaint());
        addTaint(visibility);
        // ---------- Original Method ----------
        //if (visibility == VISIBLE) {
            //if (mAttachInfo != null) {
                //initialAwakenScrollBars();
            //} else {
                //mPrivateFlags |= AWAKEN_SCROLL_BARS_ON_ATTACH;
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.928 -0400", hash_original_method = "5C1461045BB49CF5D091FC620162B930", hash_generated_method = "60D369FD538ED62F4DBE65FF896401D5")
    public void dispatchDisplayHint(int hint) {
        onDisplayHint(hint);
        addTaint(hint);
        // ---------- Original Method ----------
        //onDisplayHint(hint);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.928 -0400", hash_original_method = "5A8656B423BEB4FF4CA5CD6E6B7C0CE2", hash_generated_method = "7AFA45852F4248855F8AF6C17DF3F6DF")
    protected void onDisplayHint(int hint) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(hint);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.929 -0400", hash_original_method = "3D097367CCB5A92F4CA94066B4093669", hash_generated_method = "D2986C6E5C42F87CC2951A63F2E58CF5")
    public void dispatchWindowVisibilityChanged(int visibility) {
        onWindowVisibilityChanged(visibility);
        addTaint(visibility);
        // ---------- Original Method ----------
        //onWindowVisibilityChanged(visibility);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.931 -0400", hash_original_method = "B52A85A1B1D14AC974ADC7B2B6CB318A", hash_generated_method = "63A3183908E1FB7A83B4B299FE6A9E1D")
    protected void onWindowVisibilityChanged(int visibility) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        {
            initialAwakenScrollBars();
        } //End block
        addTaint(visibility);
        // ---------- Original Method ----------
        //if (visibility == VISIBLE) {
            //initialAwakenScrollBars();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.931 -0400", hash_original_method = "B335923547853AC72EE9B6DCDADA38B5", hash_generated_method = "A1686E1CC93A99F2C87EC2395828E8D5")
    public int getWindowVisibility() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1618473748 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1618473748;
        // ---------- Original Method ----------
        //return mAttachInfo != null ? mAttachInfo.mWindowVisibility : GONE;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.932 -0400", hash_original_method = "D236207A35AB4B4964A2350C5EB42480", hash_generated_method = "580966B133D4BB99282D4D6C991DEDBE")
    public void getWindowVisibleDisplayFrame(Rect outRect) {
        {
            try 
            {
                mAttachInfo.mSession.getDisplayFrame(mAttachInfo.mWindow, outRect);
            } //End block
            catch (RemoteException e)
            { }
            Rect insets;
            insets = mAttachInfo.mVisibleInsets;
            outRect.left += insets.left;
            outRect.top += insets.top;
            outRect.right -= insets.right;
            outRect.bottom -= insets.bottom;
        } //End block
        Display d;
        d = WindowManagerImpl.getDefault().getDefaultDisplay();
        d.getRectSize(outRect);
        addTaint(outRect.getTaint());
        // ---------- Original Method ----------
        //if (mAttachInfo != null) {
            //try {
                //mAttachInfo.mSession.getDisplayFrame(mAttachInfo.mWindow, outRect);
            //} catch (RemoteException e) {
                //return;
            //}
            //final Rect insets = mAttachInfo.mVisibleInsets;
            //outRect.left += insets.left;
            //outRect.top += insets.top;
            //outRect.right -= insets.right;
            //outRect.bottom -= insets.bottom;
            //return;
        //}
        //Display d = WindowManagerImpl.getDefault().getDefaultDisplay();
        //d.getRectSize(outRect);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.932 -0400", hash_original_method = "54CB795C069B52CC42B32E2AD26066B2", hash_generated_method = "2E26EAE6FBBFDA96B514A4920ABDB823")
    public void dispatchConfigurationChanged(Configuration newConfig) {
        onConfigurationChanged(newConfig);
        addTaint(newConfig.getTaint());
        // ---------- Original Method ----------
        //onConfigurationChanged(newConfig);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.932 -0400", hash_original_method = "8287235C28E9D1E310027A2DDEB95FCD", hash_generated_method = "466D77C1E8E53A4547ADE90D240CE428")
    protected void onConfigurationChanged(Configuration newConfig) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(newConfig.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.939 -0400", hash_original_method = "4092DD0F41D441E58BB892F3C094C4B3", hash_generated_method = "AB1108C2478BF4D14408840B84F8B890")
     void dispatchCollectViewAttributes(int visibility) {
        performCollectViewAttributes(visibility);
        addTaint(visibility);
        // ---------- Original Method ----------
        //performCollectViewAttributes(visibility);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.940 -0400", hash_original_method = "01D7FE9ADD969187268E5CA00DFC8244", hash_generated_method = "B9791F27FBDD9DAAD952EBEBA6967DAA")
     void performCollectViewAttributes(int visibility) {
        {
            {
                mAttachInfo.mKeepScreenOn = true;
            } //End block
            mAttachInfo.mSystemUiVisibility |= mSystemUiVisibility;
            ListenerInfo li;
            li = mListenerInfo;
            {
                mAttachInfo.mHasSystemUiListeners = true;
            } //End block
        } //End block
        addTaint(visibility);
        // ---------- Original Method ----------
        //if ((visibility & VISIBILITY_MASK) == VISIBLE && mAttachInfo != null) {
            //if ((mViewFlags & KEEP_SCREEN_ON) == KEEP_SCREEN_ON) {
                //mAttachInfo.mKeepScreenOn = true;
            //}
            //mAttachInfo.mSystemUiVisibility |= mSystemUiVisibility;
            //ListenerInfo li = mListenerInfo;
            //if (li != null && li.mOnSystemUiVisibilityChangeListener != null) {
                //mAttachInfo.mHasSystemUiListeners = true;
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.941 -0400", hash_original_method = "9FE32A4CBB26C218394F35C255A8CF99", hash_generated_method = "2BDC4EBC3A5BC0BA4A4EDC6D0538985F")
     void needGlobalAttributesUpdate(boolean force) {
        AttachInfo ai;
        ai = mAttachInfo;
        {
            {
                ai.mRecomputeGlobalAttributes = true;
            } //End block
        } //End block
        addTaint(force);
        // ---------- Original Method ----------
        //final AttachInfo ai = mAttachInfo;
        //if (ai != null) {
            //if (force || ai.mKeepScreenOn || (ai.mSystemUiVisibility != 0)
                    //|| ai.mHasSystemUiListeners) {
                //ai.mRecomputeGlobalAttributes = true;
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.942 -0400", hash_original_method = "ED47CAF0B3847455A70DC2CFF6AB9C90", hash_generated_method = "D419E0126DC79C9B1EDA52544A06C535")
    @ViewDebug.ExportedProperty
    public boolean isInTouchMode() {
        {
            boolean varFF1875034CF47A81AA6602BEECB01842_1686675738 = (ViewRootImpl.isInTouchMode());
        } //End block
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1945281648 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1945281648;
        // ---------- Original Method ----------
        //if (mAttachInfo != null) {
            //return mAttachInfo.mInTouchMode;
        //} else {
            //return ViewRootImpl.isInTouchMode();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.943 -0400", hash_original_method = "4F4EBC54D108D66F416C93B46580E117", hash_generated_method = "DF6F8384E757B3BFD442811EA2066F94")
    @ViewDebug.CapturedViewProperty
    public final Context getContext() {
        Context varB4EAC82CA7396A68D541C85D26508E83_592616183 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_592616183 = mContext;
        varB4EAC82CA7396A68D541C85D26508E83_592616183.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_592616183;
        // ---------- Original Method ----------
        //return mContext;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.943 -0400", hash_original_method = "3F070CAC61386FAD746F2003533AED25", hash_generated_method = "21C2A7656A6C4169A229D63A491EE04A")
    public boolean onKeyPreIme(int keyCode, KeyEvent event) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(keyCode);
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2078284735 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2078284735;
        // ---------- Original Method ----------
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.953 -0400", hash_original_method = "30943D321BC4BC956C4D9D744FC13942", hash_generated_method = "95AA72E7EC62EC7E5576F9902F4C789F")
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        boolean result;
        result = false;
        //Begin case KeyEvent.KEYCODE_DPAD_CENTER KeyEvent.KEYCODE_ENTER 
        {
            {
                boolean var213035B3AC0E21AB8BF383FF63EBF5BC_492805326 = (((mViewFlags & CLICKABLE) == CLICKABLE ||
                        (mViewFlags & LONG_CLICKABLE) == LONG_CLICKABLE) &&
                        (event.getRepeatCount() == 0));
                {
                    setPressed(true);
                    checkForLongClick(0);
                } //End block
            } //End collapsed parenthetic
        } //End block
        //End case KeyEvent.KEYCODE_DPAD_CENTER KeyEvent.KEYCODE_ENTER 
        addTaint(keyCode);
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2026099687 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2026099687;
        // ---------- Original Method ----------
        //boolean result = false;
        //switch (keyCode) {
            //case KeyEvent.KEYCODE_DPAD_CENTER:
            //case KeyEvent.KEYCODE_ENTER: {
                //if ((mViewFlags & ENABLED_MASK) == DISABLED) {
                    //return true;
                //}
                //if (((mViewFlags & CLICKABLE) == CLICKABLE ||
                        //(mViewFlags & LONG_CLICKABLE) == LONG_CLICKABLE) &&
                        //(event.getRepeatCount() == 0)) {
                    //setPressed(true);
                    //checkForLongClick(0);
                    //return true;
                //}
                //break;
            //}
        //}
        //return result;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.954 -0400", hash_original_method = "2A75FF2C44C4D96068DDAFC2643F0C8B", hash_generated_method = "622F33B65FAD4F9648E141B8EE92C065")
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(keyCode);
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_324829 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_324829;
        // ---------- Original Method ----------
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.954 -0400", hash_original_method = "5AB62313644D9CD032AD8CDBAB33BB4C", hash_generated_method = "D8F68FC134357D7F2D53B7C83425EFAF")
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        boolean result;
        result = false;
        //Begin case KeyEvent.KEYCODE_DPAD_CENTER KeyEvent.KEYCODE_ENTER 
        {
            {
                boolean var22CDF6A8C6A4F6AF8C611FA66D791C64_158854714 = ((mViewFlags & CLICKABLE) == CLICKABLE && isPressed());
                {
                    setPressed(false);
                    {
                        removeLongPressCallback();
                        result = performClick();
                    } //End block
                } //End block
            } //End collapsed parenthetic
        } //End block
        //End case KeyEvent.KEYCODE_DPAD_CENTER KeyEvent.KEYCODE_ENTER 
        addTaint(keyCode);
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_647941986 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_647941986;
        // ---------- Original Method ----------
        //boolean result = false;
        //switch (keyCode) {
            //case KeyEvent.KEYCODE_DPAD_CENTER:
            //case KeyEvent.KEYCODE_ENTER: {
                //if ((mViewFlags & ENABLED_MASK) == DISABLED) {
                    //return true;
                //}
                //if ((mViewFlags & CLICKABLE) == CLICKABLE && isPressed()) {
                    //setPressed(false);
                    //if (!mHasPerformedLongPress) {
                        //removeLongPressCallback();
                        //result = performClick();
                    //}
                //}
                //break;
            //}
        //}
        //return result;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.955 -0400", hash_original_method = "E364C67ED15F0AA31C6DCFFA6137C8C0", hash_generated_method = "B8A7DE4AE2F8D07116496BB97ACFCC9F")
    public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(keyCode);
        addTaint(repeatCount);
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2019569995 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2019569995;
        // ---------- Original Method ----------
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.956 -0400", hash_original_method = "2ECF3E4914B4B3BE2238F799B7435A51", hash_generated_method = "10E919912A159B606AF3D96F73F37C2A")
    public boolean onKeyShortcut(int keyCode, KeyEvent event) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(keyCode);
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_996122244 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_996122244;
        // ---------- Original Method ----------
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.956 -0400", hash_original_method = "47FC099EDD591711C69A21361EB96357", hash_generated_method = "E6FA60B6A1886F12B1B90976E4CD4C29")
    public boolean onCheckIsTextEditor() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1551394395 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1551394395;
        // ---------- Original Method ----------
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.956 -0400", hash_original_method = "0601401EB37355AF70FCC37B4ABEB0DF", hash_generated_method = "2350B6627DBFAEDD303AE632C44CF074")
    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        InputConnection varB4EAC82CA7396A68D541C85D26508E83_2018921281 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_2018921281 = null;
        addTaint(outAttrs.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_2018921281.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_2018921281;
        // ---------- Original Method ----------
        //return null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.960 -0400", hash_original_method = "225D79BB0F164EDB8833C9EDCA3E1422", hash_generated_method = "E1F0289B9BE1901E57B8BDC6B0FF7784")
    public boolean checkInputConnectionProxy(View view) {
        addTaint(view.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1673092289 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1673092289;
        // ---------- Original Method ----------
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.965 -0400", hash_original_method = "3CE367A3F7143B170AAF00E81005E914", hash_generated_method = "258C3C51BA2E3BEF541B4D16803BE554")
    public void createContextMenu(ContextMenu menu) {
        ContextMenuInfo menuInfo;
        menuInfo = getContextMenuInfo();
        ((MenuBuilder)menu).setCurrentMenuInfo(menuInfo);
        onCreateContextMenu(menu);
        ListenerInfo li;
        li = mListenerInfo;
        {
            li.mOnCreateContextMenuListener.onCreateContextMenu(menu, this, menuInfo);
        } //End block
        ((MenuBuilder)menu).setCurrentMenuInfo(null);
        {
            mParent.createContextMenu(menu);
        } //End block
        addTaint(menu.getTaint());
        // ---------- Original Method ----------
        //ContextMenuInfo menuInfo = getContextMenuInfo();
        //((MenuBuilder)menu).setCurrentMenuInfo(menuInfo);
        //onCreateContextMenu(menu);
        //ListenerInfo li = mListenerInfo;
        //if (li != null && li.mOnCreateContextMenuListener != null) {
            //li.mOnCreateContextMenuListener.onCreateContextMenu(menu, this, menuInfo);
        //}
        //((MenuBuilder)menu).setCurrentMenuInfo(null);
        //if (mParent != null) {
            //mParent.createContextMenu(menu);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.966 -0400", hash_original_method = "5F63695E16A345A992F87C295B6530DF", hash_generated_method = "62A12766E9A4F9F2192DAD491581BB36")
    protected ContextMenuInfo getContextMenuInfo() {
        ContextMenuInfo varB4EAC82CA7396A68D541C85D26508E83_1499288891 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1499288891 = null;
        varB4EAC82CA7396A68D541C85D26508E83_1499288891.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1499288891;
        // ---------- Original Method ----------
        //return null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.966 -0400", hash_original_method = "6522DD22D3C6D7A95FA248A3D5D95901", hash_generated_method = "015D5DE2243E972B4786C923AF15F92B")
    protected void onCreateContextMenu(ContextMenu menu) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(menu.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.970 -0400", hash_original_method = "4A983FDB3FF481E2165B7D8D641CDD48", hash_generated_method = "A666860BF32BBCE0CD205F4379CCC027")
    public boolean onTrackballEvent(MotionEvent event) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1636532247 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1636532247;
        // ---------- Original Method ----------
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.975 -0400", hash_original_method = "0E59A005881F30C798F764BCF32D89A3", hash_generated_method = "CD2976879E96545D5D15A32D2CFB347B")
    public boolean onGenericMotionEvent(MotionEvent event) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1354252516 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1354252516;
        // ---------- Original Method ----------
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.976 -0400", hash_original_method = "5922A88C022E21B0C70489BC0DBE35EF", hash_generated_method = "4692F224309A5C7449B64FC440EFF008")
    public boolean onHoverEvent(MotionEvent event) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        int action;
        action = event.getAction();
        {
            {
                boolean var50C2C1648FCAD417F5DFCEAC97574026_551344401 = ((action == MotionEvent.ACTION_HOVER_ENTER
                    || action == MotionEvent.ACTION_HOVER_MOVE)
                    && !hasHoveredChild()
                    && pointInView(event.getX(), event.getY()));
                {
                    mSendingHoverAccessibilityEvents = true;
                    sendAccessibilityEvent(AccessibilityEvent.TYPE_VIEW_HOVER_ENTER);
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            {
                boolean var96DFD226589477FD552DD4E5C844A258_587342991 = (action == MotionEvent.ACTION_HOVER_EXIT
                    || (action == MotionEvent.ACTION_HOVER_MOVE
                            && !pointInView(event.getX(), event.getY())));
                {
                    mSendingHoverAccessibilityEvents = false;
                    sendAccessibilityEvent(AccessibilityEvent.TYPE_VIEW_HOVER_EXIT);
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            boolean var25FE040CDD1CBE5B8AA6184119AEA24C_1394289460 = (isHoverable());
            {
                //Begin case MotionEvent.ACTION_HOVER_ENTER 
                setHovered(true);
                //End case MotionEvent.ACTION_HOVER_ENTER 
                //Begin case MotionEvent.ACTION_HOVER_EXIT 
                setHovered(false);
                //End case MotionEvent.ACTION_HOVER_EXIT 
                dispatchGenericMotionEventInternal(event);
            } //End block
        } //End collapsed parenthetic
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1069469878 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1069469878;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.980 -0400", hash_original_method = "B9B35BD663CAB028DDAC5D67FB09103D", hash_generated_method = "01C5E87F5B50DCFF08B66B70F1AF0E26")
    private boolean isHoverable() {
        int viewFlags;
        viewFlags = mViewFlags;
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_773785595 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_773785595;
        // ---------- Original Method ----------
        //final int viewFlags = mViewFlags;
        //if ((viewFlags & ENABLED_MASK) == DISABLED) {
            //return false;
        //}
        //return (viewFlags & CLICKABLE) == CLICKABLE
                //|| (viewFlags & LONG_CLICKABLE) == LONG_CLICKABLE;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.986 -0400", hash_original_method = "0724AE81F4A3A3591BB9677111DA3959", hash_generated_method = "26C20D1130BCFBC9935EEF293999A6C5")
    @ViewDebug.ExportedProperty
    public boolean isHovered() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_806125821 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_806125821;
        // ---------- Original Method ----------
        //return (mPrivateFlags & HOVERED) != 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.987 -0400", hash_original_method = "6A44BB0DB1E9547ADB3859B33BB1BB33", hash_generated_method = "F4C348D2D76DF2801A8E28E86F01E51D")
    public void setHovered(boolean hovered) {
        {
            {
                mPrivateFlags |= HOVERED;
                refreshDrawableState();
                onHoverChanged(true);
            } //End block
        } //End block
        {
            {
                mPrivateFlags &= ~HOVERED;
                refreshDrawableState();
                onHoverChanged(false);
            } //End block
        } //End block
        addTaint(hovered);
        // ---------- Original Method ----------
        //if (hovered) {
            //if ((mPrivateFlags & HOVERED) == 0) {
                //mPrivateFlags |= HOVERED;
                //refreshDrawableState();
                //onHoverChanged(true);
            //}
        //} else {
            //if ((mPrivateFlags & HOVERED) != 0) {
                //mPrivateFlags &= ~HOVERED;
                //refreshDrawableState();
                //onHoverChanged(false);
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:57.988 -0400", hash_original_method = "E702D19B1B952DDC0E28AFCA7C53007F", hash_generated_method = "AE8841589F9FD221B263AD22F6BB1DA2")
    public void onHoverChanged(boolean hovered) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(hovered);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.012 -0400", hash_original_method = "F0667DD3F99E763B1BFE85806FBAFB16", hash_generated_method = "3FB0AC9F1D437C7C21B3B32AD75A5B5E")
    public boolean onTouchEvent(MotionEvent event) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        int viewFlags;
        viewFlags = mViewFlags;
        {
            {
                boolean var603A4D4D69ECAA84FEB3324C67F6C844_829434922 = (event.getAction() == MotionEvent.ACTION_UP && (mPrivateFlags & PRESSED) != 0);
                {
                    mPrivateFlags &= ~PRESSED;
                    refreshDrawableState();
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            {
                boolean var2FD9894A0B8D17E7D63035FBAFAC4F4A_1560736094 = (mTouchDelegate.onTouchEvent(event));
            } //End collapsed parenthetic
        } //End block
        {
            {
                Object var96ADA7CB150D39A55358E742474108F2_1826142223 = (event.getAction());
                //Begin case MotionEvent.ACTION_UP 
                boolean prepressed;
                prepressed = (mPrivateFlags & PREPRESSED) != 0;
                //End case MotionEvent.ACTION_UP 
                //Begin case MotionEvent.ACTION_UP 
                {
                    boolean focusTaken;
                    focusTaken = false;
                    {
                        boolean var4010B45C9110D5523B114A445C2F69F9_1935608982 = (isFocusable() && isFocusableInTouchMode() && !isFocused());
                        {
                            focusTaken = requestFocus();
                        } //End block
                    } //End collapsed parenthetic
                    {
                        mPrivateFlags |= PRESSED;
                        refreshDrawableState();
                    } //End block
                    {
                        removeLongPressCallback();
                        {
                            {
                                mPerformClick = new PerformClick();
                            } //End block
                            {
                                boolean var7529B8C360AE15DA8B22EFD2F54DEBE4_1219921897 = (!post(mPerformClick));
                                {
                                    performClick();
                                } //End block
                            } //End collapsed parenthetic
                        } //End block
                    } //End block
                    {
                        mUnsetPressedState = new UnsetPressedState();
                    } //End block
                    {
                        postDelayed(mUnsetPressedState,
                                    ViewConfiguration.getPressedStateDuration());
                    } //End block
                    {
                        boolean var78C79A084528017AFFB727F82C6C54F8_1601618408 = (!post(mUnsetPressedState));
                        {
                            mUnsetPressedState.run();
                        } //End block
                    } //End collapsed parenthetic
                    removeTapCallback();
                } //End block
                //End case MotionEvent.ACTION_UP 
                //Begin case MotionEvent.ACTION_DOWN 
                mHasPerformedLongPress = false;
                //End case MotionEvent.ACTION_DOWN 
                //Begin case MotionEvent.ACTION_DOWN 
                {
                    boolean var05FA8261FD36A1DB58AD7618577A33AB_1659243790 = (performButtonActionOnTouchDown(event));
                } //End collapsed parenthetic
                //End case MotionEvent.ACTION_DOWN 
                //Begin case MotionEvent.ACTION_DOWN 
                boolean isInScrollingContainer;
                isInScrollingContainer = isInScrollingContainer();
                //End case MotionEvent.ACTION_DOWN 
                //Begin case MotionEvent.ACTION_DOWN 
                {
                    mPrivateFlags |= PREPRESSED;
                    {
                        mPendingCheckForTap = new CheckForTap();
                    } //End block
                    postDelayed(mPendingCheckForTap, ViewConfiguration.getTapTimeout());
                } //End block
                {
                    mPrivateFlags |= PRESSED;
                    refreshDrawableState();
                    checkForLongClick(0);
                } //End block
                //End case MotionEvent.ACTION_DOWN 
                //Begin case MotionEvent.ACTION_CANCEL 
                mPrivateFlags &= ~PRESSED;
                //End case MotionEvent.ACTION_CANCEL 
                //Begin case MotionEvent.ACTION_CANCEL 
                refreshDrawableState();
                //End case MotionEvent.ACTION_CANCEL 
                //Begin case MotionEvent.ACTION_CANCEL 
                removeTapCallback();
                //End case MotionEvent.ACTION_CANCEL 
                //Begin case MotionEvent.ACTION_MOVE 
                int x;
                x = (int) event.getX();
                //End case MotionEvent.ACTION_MOVE 
                //Begin case MotionEvent.ACTION_MOVE 
                int y;
                y = (int) event.getY();
                //End case MotionEvent.ACTION_MOVE 
                //Begin case MotionEvent.ACTION_MOVE 
                {
                    boolean var08A986E19E681C372CEFA5E47F3A6BEE_813894380 = (!pointInView(x, y, mTouchSlop));
                    {
                        removeTapCallback();
                        {
                            removeLongPressCallback();
                            mPrivateFlags &= ~PRESSED;
                            refreshDrawableState();
                        } //End block
                    } //End block
                } //End collapsed parenthetic
                //End case MotionEvent.ACTION_MOVE 
            } //End collapsed parenthetic
        } //End block
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_960765356 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_960765356;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.013 -0400", hash_original_method = "7808B21D2BE87077131F031A801646DE", hash_generated_method = "2A53EA1947ED31AE8D10B1990496F896")
    public boolean isInScrollingContainer() {
        ViewParent p;
        p = getParent();
        {
            {
                boolean var4881E0F2577352AD9B4EFF88E10A0FFC_446641791 = (((ViewGroup) p).shouldDelayChildPressedState());
            } //End collapsed parenthetic
            p = p.getParent();
        } //End block
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1841422183 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1841422183;
        // ---------- Original Method ----------
        //ViewParent p = getParent();
        //while (p != null && p instanceof ViewGroup) {
            //if (((ViewGroup) p).shouldDelayChildPressedState()) {
                //return true;
            //}
            //p = p.getParent();
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.014 -0400", hash_original_method = "A93CC85053AADAF4A404AD13182B9757", hash_generated_method = "4E0E89E0095C87865BEDCEA23B30D854")
    private void removeLongPressCallback() {
        {
            removeCallbacks(mPendingCheckForLongPress);
        } //End block
        // ---------- Original Method ----------
        //if (mPendingCheckForLongPress != null) {
          //removeCallbacks(mPendingCheckForLongPress);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.014 -0400", hash_original_method = "E1C00ACE8BB8560C240B3C5D040006A3", hash_generated_method = "2A0B9175108CA8E4055A6F572B30050D")
    private void removePerformClickCallback() {
        {
            removeCallbacks(mPerformClick);
        } //End block
        // ---------- Original Method ----------
        //if (mPerformClick != null) {
            //removeCallbacks(mPerformClick);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.014 -0400", hash_original_method = "6062C7F52024ACE8958D902CC4268271", hash_generated_method = "D17473916BA8EEE9CD65D95E79C2DB43")
    private void removeUnsetPressCallback() {
        {
            setPressed(false);
            removeCallbacks(mUnsetPressedState);
        } //End block
        // ---------- Original Method ----------
        //if ((mPrivateFlags & PRESSED) != 0 && mUnsetPressedState != null) {
            //setPressed(false);
            //removeCallbacks(mUnsetPressedState);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.014 -0400", hash_original_method = "B67FA3EAF595424C7D0F48DB4ECBF54E", hash_generated_method = "29D4BD3D693368C16CBA0386A785A065")
    private void removeTapCallback() {
        {
            mPrivateFlags &= ~PREPRESSED;
            removeCallbacks(mPendingCheckForTap);
        } //End block
        // ---------- Original Method ----------
        //if (mPendingCheckForTap != null) {
            //mPrivateFlags &= ~PREPRESSED;
            //removeCallbacks(mPendingCheckForTap);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.019 -0400", hash_original_method = "B45EC6A62A5C3981A23AB3F41840A566", hash_generated_method = "B4CC4E5CE3C81DAAFE2FEB90BADA5B6E")
    public void cancelLongPress() {
        removeLongPressCallback();
        removeTapCallback();
        // ---------- Original Method ----------
        //removeLongPressCallback();
        //removeTapCallback();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.019 -0400", hash_original_method = "8D4D94E2FFA3D8907911FEF22F0F072D", hash_generated_method = "15573115AF3E86DFF34CBB843D8CC1D8")
    private void removeSendViewScrolledAccessibilityEventCallback() {
        {
            removeCallbacks(mSendViewScrolledAccessibilityEvent);
        } //End block
        // ---------- Original Method ----------
        //if (mSendViewScrolledAccessibilityEvent != null) {
            //removeCallbacks(mSendViewScrolledAccessibilityEvent);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.019 -0400", hash_original_method = "61F54D1D0A5A4D0B5C8BE62B3B180D19", hash_generated_method = "E776BADE28CB148BB0B06BC8200B2011")
    public void setTouchDelegate(TouchDelegate delegate) {
        mTouchDelegate = delegate;
        // ---------- Original Method ----------
        //mTouchDelegate = delegate;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.020 -0400", hash_original_method = "C13C756E7E3DD9AFF35525DE74B6A0AE", hash_generated_method = "0884D50F96E48E078C31B7655F520746")
    public TouchDelegate getTouchDelegate() {
        TouchDelegate varB4EAC82CA7396A68D541C85D26508E83_988460614 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_988460614 = mTouchDelegate;
        varB4EAC82CA7396A68D541C85D26508E83_988460614.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_988460614;
        // ---------- Original Method ----------
        //return mTouchDelegate;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.034 -0400", hash_original_method = "DB01C6D64C7923FFF91C0044F6A0DAD3", hash_generated_method = "E9D6E2EA174A45B5152038866E8648D1")
     void setFlags(int flags, int mask) {
        int old;
        old = mViewFlags;
        mViewFlags = (mViewFlags & ~mask) | (flags & mask);
        int changed;
        changed = mViewFlags ^ old;
        int privateFlags;
        privateFlags = mPrivateFlags;
        {
            {
                clearFocus();
            } //End block
            {
                mParent.focusableViewAvailable(this);
            } //End block
        } //End block
        {
            {
                mPrivateFlags |= DRAWN;
                invalidate(true);
                needGlobalAttributesUpdate(true);
                {
                    mParent.focusableViewAvailable(this);
                } //End block
            } //End block
        } //End block
        {
            needGlobalAttributesUpdate(false);
            requestLayout();
            {
                {
                    boolean var045EBE37E9FC6E3EB86868C8822165CE_2098541348 = (hasFocus());
                    clearFocus();
                } //End collapsed parenthetic
                destroyDrawingCache();
                {
                    ((View) mParent).invalidate(true);
                } //End block
                mPrivateFlags |= DRAWN;
            } //End block
            {
                mAttachInfo.mViewVisibilityChanged = true;
            } //End block
        } //End block
        {
            needGlobalAttributesUpdate(false);
            mPrivateFlags |= DRAWN;
            {
                boolean varB31FEE083FA3FF4FCB5289BE9151CED2_1234183979 = (((mViewFlags & VISIBILITY_MASK) == INVISIBLE) && hasFocus());
                {
                    {
                        boolean var7EE5FF448100B409C00AA55A4D5A2579_1480894100 = (getRootView() != this);
                        {
                            clearFocus();
                        } //End block
                    } //End collapsed parenthetic
                } //End block
            } //End collapsed parenthetic
            {
                mAttachInfo.mViewVisibilityChanged = true;
            } //End block
        } //End block
        {
            {
                ((ViewGroup) mParent).onChildVisibilityChanged(this, (flags & VISIBILITY_MASK));
                ((View) mParent).invalidate(true);
            } //End block
            {
                mParent.invalidateChild(this, null);
            } //End block
            dispatchVisibilityChanged(this, (flags & VISIBILITY_MASK));
        } //End block
        {
            destroyDrawingCache();
        } //End block
        {
            destroyDrawingCache();
            mPrivateFlags &= ~DRAWING_CACHE_VALID;
            invalidateParentCaches();
        } //End block
        {
            destroyDrawingCache();
            mPrivateFlags &= ~DRAWING_CACHE_VALID;
        } //End block
        {
            {
                {
                    mPrivateFlags &= ~SKIP_DRAW;
                    mPrivateFlags |= ONLY_DRAWS_BACKGROUND;
                } //End block
                {
                    mPrivateFlags |= SKIP_DRAW;
                } //End block
            } //End block
            {
                mPrivateFlags &= ~SKIP_DRAW;
            } //End block
            requestLayout();
            invalidate(true);
        } //End block
        {
            {
                mParent.recomputeViewAttributes(this);
            } //End block
        } //End block
        {
            requestLayout();
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.035 -0400", hash_original_method = "D3A1B9777480096EBBD21F82F884FF88", hash_generated_method = "B3254F2076864AE69DB273BC05B806B7")
    public void bringToFront() {
        {
            mParent.bringChildToFront(this);
        } //End block
        // ---------- Original Method ----------
        //if (mParent != null) {
            //mParent.bringChildToFront(this);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.036 -0400", hash_original_method = "EDEAEC3E48D287D80E86A711CB6F1FA1", hash_generated_method = "A26653B9B30CA925D994619AAA17B6ED")
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        {
            boolean varFEF5E81D9E4B252970529F0E4C094F45_1593975789 = (AccessibilityManager.getInstance(mContext).isEnabled());
            {
                postSendViewScrolledAccessibilityEventCallback();
            } //End block
        } //End collapsed parenthetic
        mBackgroundSizeChanged = true;
        AttachInfo ai;
        ai = mAttachInfo;
        {
            ai.mViewScrollChanged = true;
        } //End block
        addTaint(l);
        addTaint(t);
        addTaint(oldl);
        addTaint(oldt);
        // ---------- Original Method ----------
        //if (AccessibilityManager.getInstance(mContext).isEnabled()) {
            //postSendViewScrolledAccessibilityEventCallback();
        //}
        //mBackgroundSizeChanged = true;
        //final AttachInfo ai = mAttachInfo;
        //if (ai != null) {
            //ai.mViewScrollChanged = true;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.047 -0400", hash_original_method = "B552DCA4F8335CB071F137C97CB4545F", hash_generated_method = "581C6460081BA9AED29EF85B1284ED4B")
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(w);
        addTaint(h);
        addTaint(oldw);
        addTaint(oldh);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.047 -0400", hash_original_method = "0296ECFD4FBB578ABFB3DEE9D2F54084", hash_generated_method = "3BF445E04BA2666375DFCD58601723DA")
    protected void dispatchDraw(Canvas canvas) {
        addTaint(canvas.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.047 -0400", hash_original_method = "23990FCA043695388FDF30165FAB53F8", hash_generated_method = "AE853B6FAE3CF47F32D40832E14127C2")
    public final ViewParent getParent() {
        ViewParent varB4EAC82CA7396A68D541C85D26508E83_1176370278 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1176370278 = mParent;
        varB4EAC82CA7396A68D541C85D26508E83_1176370278.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1176370278;
        // ---------- Original Method ----------
        //return mParent;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.049 -0400", hash_original_method = "A54235C6FCDDA2041C8AFAE3E4C1E483", hash_generated_method = "4D5E276078D4703D79AAC9E64AA62422")
    public void setScrollX(int value) {
        scrollTo(value, mScrollY);
        addTaint(value);
        // ---------- Original Method ----------
        //scrollTo(value, mScrollY);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.049 -0400", hash_original_method = "F511D71F344E6F66807E97ABB51DFE9B", hash_generated_method = "48F0CDA0C46AE53A124A91A7E04F580D")
    public void setScrollY(int value) {
        scrollTo(mScrollX, value);
        addTaint(value);
        // ---------- Original Method ----------
        //scrollTo(mScrollX, value);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.049 -0400", hash_original_method = "37E422003D62C4BD4746E9CFAAF79E84", hash_generated_method = "4A30B92D12592686E94524743AF38F63")
    public final int getScrollX() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_738687346 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_738687346;
        // ---------- Original Method ----------
        //return mScrollX;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.057 -0400", hash_original_method = "1E7AE64F8D32210A6E2C97F4869FB31A", hash_generated_method = "63B8CE1A64079C3EB46E16010D8E27C9")
    public final int getScrollY() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_76166029 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_76166029;
        // ---------- Original Method ----------
        //return mScrollY;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.057 -0400", hash_original_method = "FFF18028F96DB13B23AA35EC8A354DA6", hash_generated_method = "BD3AB239507471143EE2296FD2328EB3")
    @ViewDebug.ExportedProperty(category = "layout")
    public final int getWidth() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2064949971 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2064949971;
        // ---------- Original Method ----------
        //return mRight - mLeft;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.058 -0400", hash_original_method = "DB8E3D4F51A57F2E0389486CC016C662", hash_generated_method = "D9A38430614E5D0519756758315055A3")
    @ViewDebug.ExportedProperty(category = "layout")
    public final int getHeight() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1799661504 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1799661504;
        // ---------- Original Method ----------
        //return mBottom - mTop;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.059 -0400", hash_original_method = "7CEA71A6443E0B0137E2E074FCAA909B", hash_generated_method = "06428B37B746EB9DAE5B5BA3D5265775")
    public void getDrawingRect(Rect outRect) {
        outRect.left = mScrollX;
        outRect.top = mScrollY;
        outRect.right = mScrollX + (mRight - mLeft);
        outRect.bottom = mScrollY + (mBottom - mTop);
        addTaint(outRect.getTaint());
        // ---------- Original Method ----------
        //outRect.left = mScrollX;
        //outRect.top = mScrollY;
        //outRect.right = mScrollX + (mRight - mLeft);
        //outRect.bottom = mScrollY + (mBottom - mTop);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.059 -0400", hash_original_method = "A160459557267C576C1546F5990AEB19", hash_generated_method = "5843220BC2AE277332F9B56DB6C19E3C")
    public final int getMeasuredWidth() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2065840568 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2065840568;
        // ---------- Original Method ----------
        //return mMeasuredWidth & MEASURED_SIZE_MASK;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.064 -0400", hash_original_method = "C38A45A87603EC21B0D791190210A10A", hash_generated_method = "C1E90A051DE06AE2C58489B2FD35EAEC")
    public final int getMeasuredWidthAndState() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_488835916 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_488835916;
        // ---------- Original Method ----------
        //return mMeasuredWidth;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.064 -0400", hash_original_method = "DA51B2F5E67991A819725ED6FD645434", hash_generated_method = "E746590E4189D303A1EA4E47CDA64B31")
    public final int getMeasuredHeight() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1683872975 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1683872975;
        // ---------- Original Method ----------
        //return mMeasuredHeight & MEASURED_SIZE_MASK;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.068 -0400", hash_original_method = "380B2985895F884CFF464A15E274F566", hash_generated_method = "81A87485C818B90E71F44D47B1D5D904")
    public final int getMeasuredHeightAndState() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_729603477 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_729603477;
        // ---------- Original Method ----------
        //return mMeasuredHeight;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.069 -0400", hash_original_method = "12D9B5BDD1AC8F21212E58A2AB0D2736", hash_generated_method = "DAADD69AC787D6261B7D3B02E8BA9F6F")
    public final int getMeasuredState() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1018017620 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1018017620;
        // ---------- Original Method ----------
        //return (mMeasuredWidth&MEASURED_STATE_MASK)
                //| ((mMeasuredHeight>>MEASURED_HEIGHT_STATE_SHIFT)
                        //& (MEASURED_STATE_MASK>>MEASURED_HEIGHT_STATE_SHIFT));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.082 -0400", hash_original_method = "B4B4CEBFEE2F615BED379C4D0CB9432E", hash_generated_method = "F46E23383D01D371B8C45C3777CB131E")
    public Matrix getMatrix() {
        Matrix varB4EAC82CA7396A68D541C85D26508E83_1157365493 = null; //Variable for return #1
        Matrix varB4EAC82CA7396A68D541C85D26508E83_1969543498 = null; //Variable for return #2
        {
            updateMatrix();
            varB4EAC82CA7396A68D541C85D26508E83_1157365493 = mTransformationInfo.mMatrix;
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1969543498 = Matrix.IDENTITY_MATRIX;
        Matrix varA7E53CE21691AB073D9660D615818899_1072073139; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1072073139 = varB4EAC82CA7396A68D541C85D26508E83_1157365493;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1072073139 = varB4EAC82CA7396A68D541C85D26508E83_1969543498;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1072073139.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1072073139;
        // ---------- Original Method ----------
        //if (mTransformationInfo != null) {
            //updateMatrix();
            //return mTransformationInfo.mMatrix;
        //}
        //return Matrix.IDENTITY_MATRIX;
    }

    
        private static boolean nonzero(float value) {
        return (value < -NONZERO_EPSILON || value > NONZERO_EPSILON);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.082 -0400", hash_original_method = "5E74D6706011574C7C512DCC96608456", hash_generated_method = "0F905FAD898D01BABE0C4059EC549ECC")
    final boolean hasIdentityMatrix() {
        {
            updateMatrix();
        } //End block
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_198059640 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_198059640;
        // ---------- Original Method ----------
        //if (mTransformationInfo != null) {
            //updateMatrix();
            //return mTransformationInfo.mMatrixIsIdentity;
        //}
        //return true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.083 -0400", hash_original_method = "4153D754422EE39DF2ACBB08A45B169B", hash_generated_method = "BD5D26DA166F862ABB1F598913894B2C")
     void ensureTransformationInfo() {
        {
            mTransformationInfo = new TransformationInfo();
        } //End block
        // ---------- Original Method ----------
        //if (mTransformationInfo == null) {
            //mTransformationInfo = new TransformationInfo();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.088 -0400", hash_original_method = "1DF4F5A3EE086291C2134A9A06069FA8", hash_generated_method = "F86C661A1C95A3B6935B9359365BFC53")
    private void updateMatrix() {
        TransformationInfo info;
        info = mTransformationInfo;
        {
            {
                {
                    info.mPrevWidth = mRight - mLeft;
                    info.mPrevHeight = mBottom - mTop;
                    info.mPivotX = info.mPrevWidth / 2f;
                    info.mPivotY = info.mPrevHeight / 2f;
                } //End block
            } //End block
            info.mMatrix.reset();
            {
                boolean varAB848ECD95BE565B20450DBD0CDBCCC2_735328638 = (!nonzero(info.mRotationX) && !nonzero(info.mRotationY));
                {
                    info.mMatrix.setTranslate(info.mTranslationX, info.mTranslationY);
                    info.mMatrix.preRotate(info.mRotation, info.mPivotX, info.mPivotY);
                    info.mMatrix.preScale(info.mScaleX, info.mScaleY, info.mPivotX, info.mPivotY);
                } //End block
                {
                    {
                        info.mCamera = new Camera();
                        info.matrix3D = new Matrix();
                    } //End block
                    info.mCamera.save();
                    info.mMatrix.preScale(info.mScaleX, info.mScaleY, info.mPivotX, info.mPivotY);
                    info.mCamera.rotate(info.mRotationX, info.mRotationY, -info.mRotation);
                    info.mCamera.getMatrix(info.matrix3D);
                    info.matrix3D.preTranslate(-info.mPivotX, -info.mPivotY);
                    info.matrix3D.postTranslate(info.mPivotX + info.mTranslationX,
                        info.mPivotY + info.mTranslationY);
                    info.mMatrix.postConcat(info.matrix3D);
                    info.mCamera.restore();
                } //End block
            } //End collapsed parenthetic
            info.mMatrixDirty = false;
            info.mMatrixIsIdentity = info.mMatrix.isIdentity();
            info.mInverseMatrixDirty = true;
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.090 -0400", hash_original_method = "9D52A0CAB8326A9AD998EDD411D2DD92", hash_generated_method = "7B654498B9F56DD7B754A9B117309464")
    final Matrix getInverseMatrix() {
        Matrix varB4EAC82CA7396A68D541C85D26508E83_1206272677 = null; //Variable for return #1
        Matrix varB4EAC82CA7396A68D541C85D26508E83_2101138239 = null; //Variable for return #2
        TransformationInfo info;
        info = mTransformationInfo;
        {
            updateMatrix();
            {
                {
                    info.mInverseMatrix = new Matrix();
                } //End block
                info.mMatrix.invert(info.mInverseMatrix);
                info.mInverseMatrixDirty = false;
            } //End block
            varB4EAC82CA7396A68D541C85D26508E83_1206272677 = info.mInverseMatrix;
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_2101138239 = Matrix.IDENTITY_MATRIX;
        Matrix varA7E53CE21691AB073D9660D615818899_1881796358; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1881796358 = varB4EAC82CA7396A68D541C85D26508E83_1206272677;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1881796358 = varB4EAC82CA7396A68D541C85D26508E83_2101138239;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1881796358.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1881796358;
        // ---------- Original Method ----------
        //final TransformationInfo info = mTransformationInfo;
        //if (info != null) {
            //updateMatrix();
            //if (info.mInverseMatrixDirty) {
                //if (info.mInverseMatrix == null) {
                    //info.mInverseMatrix = new Matrix();
                //}
                //info.mMatrix.invert(info.mInverseMatrix);
                //info.mInverseMatrixDirty = false;
            //}
            //return info.mInverseMatrix;
        //}
        //return Matrix.IDENTITY_MATRIX;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.097 -0400", hash_original_method = "210DCA800515E4777DE0E07A52837B76", hash_generated_method = "11BFC4AA85644F2D0717FA24E9E5CD5F")
    public void setCameraDistance(float distance) {
        invalidateParentCaches();
        invalidate(false);
        ensureTransformationInfo();
        float dpi;
        dpi = mResources.getDisplayMetrics().densityDpi;
        TransformationInfo info;
        info = mTransformationInfo;
        {
            info.mCamera = new Camera();
            info.matrix3D = new Matrix();
        } //End block
        info.mCamera.setLocation(0.0f, 0.0f, -Math.abs(distance) / dpi);
        info.mMatrixDirty = true;
        invalidate(false);
        addTaint(distance);
        // ---------- Original Method ----------
        //invalidateParentCaches();
        //invalidate(false);
        //ensureTransformationInfo();
        //final float dpi = mResources.getDisplayMetrics().densityDpi;
        //final TransformationInfo info = mTransformationInfo;
        //if (info.mCamera == null) {
            //info.mCamera = new Camera();
            //info.matrix3D = new Matrix();
        //}
        //info.mCamera.setLocation(0.0f, 0.0f, -Math.abs(distance) / dpi);
        //info.mMatrixDirty = true;
        //invalidate(false);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.097 -0400", hash_original_method = "6D5D42AE33FC6FF98224E10EE022285B", hash_generated_method = "E1646E6EA17EAEA511A57F21E0A91BB6")
    public float getRotation() {
        float var546ADE640B6EDFBC8A086EF31347E768_530416171 = getTaintFloat();
        return var546ADE640B6EDFBC8A086EF31347E768_530416171;
        // ---------- Original Method ----------
        //return mTransformationInfo != null ? mTransformationInfo.mRotation : 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.098 -0400", hash_original_method = "5A5E2BB985CAA77255785D52BE0C3968", hash_generated_method = "E1376EDE9F18642278A58F357DE2DE7D")
    public void setRotation(float rotation) {
        ensureTransformationInfo();
        TransformationInfo info;
        info = mTransformationInfo;
        {
            invalidateParentCaches();
            invalidate(false);
            info.mRotation = rotation;
            info.mMatrixDirty = true;
            mPrivateFlags |= DRAWN;
            invalidate(false);
        } //End block
        addTaint(rotation);
        // ---------- Original Method ----------
        //ensureTransformationInfo();
        //final TransformationInfo info = mTransformationInfo;
        //if (info.mRotation != rotation) {
            //invalidateParentCaches();
            //invalidate(false);
            //info.mRotation = rotation;
            //info.mMatrixDirty = true;
            //mPrivateFlags |= DRAWN; 
            //invalidate(false);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.106 -0400", hash_original_method = "AE949F6C8375A0B1C86B95F13F6ACDFA", hash_generated_method = "8BE4349BCDC827026C384D2F46F44A10")
    public float getRotationY() {
        float var546ADE640B6EDFBC8A086EF31347E768_1212988938 = getTaintFloat();
        return var546ADE640B6EDFBC8A086EF31347E768_1212988938;
        // ---------- Original Method ----------
        //return mTransformationInfo != null ? mTransformationInfo.mRotationY : 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.106 -0400", hash_original_method = "5A233F5FAA167B597E6F53F6A1ED05E0", hash_generated_method = "CD3B5454D1BC380D337D3679DCADF553")
    public void setRotationY(float rotationY) {
        ensureTransformationInfo();
        TransformationInfo info;
        info = mTransformationInfo;
        {
            invalidateParentCaches();
            invalidate(false);
            info.mRotationY = rotationY;
            info.mMatrixDirty = true;
            mPrivateFlags |= DRAWN;
            invalidate(false);
        } //End block
        addTaint(rotationY);
        // ---------- Original Method ----------
        //ensureTransformationInfo();
        //final TransformationInfo info = mTransformationInfo;
        //if (info.mRotationY != rotationY) {
            //invalidateParentCaches();
            //invalidate(false);
            //info.mRotationY = rotationY;
            //info.mMatrixDirty = true;
            //mPrivateFlags |= DRAWN; 
            //invalidate(false);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.107 -0400", hash_original_method = "A555D00D0BA60E223889AA9DD2F251D5", hash_generated_method = "59B609524A5A0B53CC577394EFECD15C")
    public float getRotationX() {
        float var546ADE640B6EDFBC8A086EF31347E768_123362792 = getTaintFloat();
        return var546ADE640B6EDFBC8A086EF31347E768_123362792;
        // ---------- Original Method ----------
        //return mTransformationInfo != null ? mTransformationInfo.mRotationX : 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.107 -0400", hash_original_method = "6E42F99146F1D6958E2B3C15F474346C", hash_generated_method = "0B2C8DD82EA65C60E8C043178FFBE22E")
    public void setRotationX(float rotationX) {
        ensureTransformationInfo();
        TransformationInfo info;
        info = mTransformationInfo;
        {
            invalidateParentCaches();
            invalidate(false);
            info.mRotationX = rotationX;
            info.mMatrixDirty = true;
            mPrivateFlags |= DRAWN;
            invalidate(false);
        } //End block
        addTaint(rotationX);
        // ---------- Original Method ----------
        //ensureTransformationInfo();
        //final TransformationInfo info = mTransformationInfo;
        //if (info.mRotationX != rotationX) {
            //invalidateParentCaches();
            //invalidate(false);
            //info.mRotationX = rotationX;
            //info.mMatrixDirty = true;
            //mPrivateFlags |= DRAWN; 
            //invalidate(false);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.114 -0400", hash_original_method = "632CD3DC31F3C9373697ECAF67FAF844", hash_generated_method = "0CF51CCF99324EBE39295FF2C91BAA24")
    public float getScaleX() {
        float var546ADE640B6EDFBC8A086EF31347E768_1142304075 = getTaintFloat();
        return var546ADE640B6EDFBC8A086EF31347E768_1142304075;
        // ---------- Original Method ----------
        //return mTransformationInfo != null ? mTransformationInfo.mScaleX : 1;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.117 -0400", hash_original_method = "5D4E1982532E84086C93276B88F3BB0F", hash_generated_method = "E0688097331B4DDF4F97FC4675904273")
    public void setScaleX(float scaleX) {
        ensureTransformationInfo();
        TransformationInfo info;
        info = mTransformationInfo;
        {
            invalidateParentCaches();
            invalidate(false);
            info.mScaleX = scaleX;
            info.mMatrixDirty = true;
            mPrivateFlags |= DRAWN;
            invalidate(false);
        } //End block
        addTaint(scaleX);
        // ---------- Original Method ----------
        //ensureTransformationInfo();
        //final TransformationInfo info = mTransformationInfo;
        //if (info.mScaleX != scaleX) {
            //invalidateParentCaches();
            //invalidate(false);
            //info.mScaleX = scaleX;
            //info.mMatrixDirty = true;
            //mPrivateFlags |= DRAWN; 
            //invalidate(false);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.118 -0400", hash_original_method = "0DC96E7C5CC6BBD5C09BD0CF27C74A57", hash_generated_method = "9373057CF703983019D9B5F74F37FF3C")
    public float getScaleY() {
        float var546ADE640B6EDFBC8A086EF31347E768_1498727583 = getTaintFloat();
        return var546ADE640B6EDFBC8A086EF31347E768_1498727583;
        // ---------- Original Method ----------
        //return mTransformationInfo != null ? mTransformationInfo.mScaleY : 1;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.119 -0400", hash_original_method = "31C6EE08A123288B2AD5FB7A2AB8A50C", hash_generated_method = "D4CB2D2897357804B48BF6024666E950")
    public void setScaleY(float scaleY) {
        ensureTransformationInfo();
        TransformationInfo info;
        info = mTransformationInfo;
        {
            invalidateParentCaches();
            invalidate(false);
            info.mScaleY = scaleY;
            info.mMatrixDirty = true;
            mPrivateFlags |= DRAWN;
            invalidate(false);
        } //End block
        addTaint(scaleY);
        // ---------- Original Method ----------
        //ensureTransformationInfo();
        //final TransformationInfo info = mTransformationInfo;
        //if (info.mScaleY != scaleY) {
            //invalidateParentCaches();
            //invalidate(false);
            //info.mScaleY = scaleY;
            //info.mMatrixDirty = true;
            //mPrivateFlags |= DRAWN; 
            //invalidate(false);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.119 -0400", hash_original_method = "AEC7496CCA4C936C6BC2B5B4BAFC57DA", hash_generated_method = "6EF90B8970D680440D37809863222D96")
    public float getPivotX() {
        float var546ADE640B6EDFBC8A086EF31347E768_1873224130 = getTaintFloat();
        return var546ADE640B6EDFBC8A086EF31347E768_1873224130;
        // ---------- Original Method ----------
        //return mTransformationInfo != null ? mTransformationInfo.mPivotX : 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.132 -0400", hash_original_method = "DBB537948450A8273883C6E25FB642C5", hash_generated_method = "AC365084F7B5301B15A424C39EDD9759")
    public void setPivotX(float pivotX) {
        ensureTransformationInfo();
        mPrivateFlags |= PIVOT_EXPLICITLY_SET;
        TransformationInfo info;
        info = mTransformationInfo;
        {
            invalidateParentCaches();
            invalidate(false);
            info.mPivotX = pivotX;
            info.mMatrixDirty = true;
            mPrivateFlags |= DRAWN;
            invalidate(false);
        } //End block
        addTaint(pivotX);
        // ---------- Original Method ----------
        //ensureTransformationInfo();
        //mPrivateFlags |= PIVOT_EXPLICITLY_SET;
        //final TransformationInfo info = mTransformationInfo;
        //if (info.mPivotX != pivotX) {
            //invalidateParentCaches();
            //invalidate(false);
            //info.mPivotX = pivotX;
            //info.mMatrixDirty = true;
            //mPrivateFlags |= DRAWN; 
            //invalidate(false);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.132 -0400", hash_original_method = "0240E9206D9E9715A6B3E78480FB3A00", hash_generated_method = "240830E4E23D105E4B77AD83414F333C")
    public float getPivotY() {
        float var546ADE640B6EDFBC8A086EF31347E768_1907684628 = getTaintFloat();
        return var546ADE640B6EDFBC8A086EF31347E768_1907684628;
        // ---------- Original Method ----------
        //return mTransformationInfo != null ? mTransformationInfo.mPivotY : 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.133 -0400", hash_original_method = "6A61D38311657070A62B2EA4ECB210D8", hash_generated_method = "6BEF1D121D0A9E45FF2DDE5D9121707B")
    public void setPivotY(float pivotY) {
        ensureTransformationInfo();
        mPrivateFlags |= PIVOT_EXPLICITLY_SET;
        TransformationInfo info;
        info = mTransformationInfo;
        {
            invalidateParentCaches();
            invalidate(false);
            info.mPivotY = pivotY;
            info.mMatrixDirty = true;
            mPrivateFlags |= DRAWN;
            invalidate(false);
        } //End block
        addTaint(pivotY);
        // ---------- Original Method ----------
        //ensureTransformationInfo();
        //mPrivateFlags |= PIVOT_EXPLICITLY_SET;
        //final TransformationInfo info = mTransformationInfo;
        //if (info.mPivotY != pivotY) {
            //invalidateParentCaches();
            //invalidate(false);
            //info.mPivotY = pivotY;
            //info.mMatrixDirty = true;
            //mPrivateFlags |= DRAWN; 
            //invalidate(false);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.137 -0400", hash_original_method = "93EFA4392922E182D3B77409B1564364", hash_generated_method = "8EA9A51EDFC8EC2B522BBF1AD35BA0EE")
    public float getAlpha() {
        float var546ADE640B6EDFBC8A086EF31347E768_1571139616 = getTaintFloat();
        return var546ADE640B6EDFBC8A086EF31347E768_1571139616;
        // ---------- Original Method ----------
        //return mTransformationInfo != null ? mTransformationInfo.mAlpha : 1;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.157 -0400", hash_original_method = "D47D7B67C2848D6684CE263C68979D07", hash_generated_method = "7EEBA3983B822B0C5948722A0BF03746")
    public void setAlpha(float alpha) {
        ensureTransformationInfo();
        mTransformationInfo.mAlpha = alpha;
        invalidateParentCaches();
        {
            boolean var27A92F9962D09A8451E041A66077AE9B_898197751 = (onSetAlpha((int) (alpha * 255)));
            {
                mPrivateFlags |= ALPHA_SET;
                invalidate(true);
            } //End block
            {
                mPrivateFlags &= ~ALPHA_SET;
                invalidate(false);
            } //End block
        } //End collapsed parenthetic
        // ---------- Original Method ----------
        //ensureTransformationInfo();
        //mTransformationInfo.mAlpha = alpha;
        //invalidateParentCaches();
        //if (onSetAlpha((int) (alpha * 255))) {
            //mPrivateFlags |= ALPHA_SET;
            //invalidate(true);
        //} else {
            //mPrivateFlags &= ~ALPHA_SET;
            //invalidate(false);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.158 -0400", hash_original_method = "3CB99BAEF01722CCB474EC85E6659EEE", hash_generated_method = "735B5FEB30E132BB864EF99C394BD98C")
     boolean setAlphaNoInvalidation(float alpha) {
        ensureTransformationInfo();
        mTransformationInfo.mAlpha = alpha;
        boolean subclassHandlesAlpha;
        subclassHandlesAlpha = onSetAlpha((int) (alpha * 255));
        {
            mPrivateFlags |= ALPHA_SET;
        } //End block
        {
            mPrivateFlags &= ~ALPHA_SET;
        } //End block
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1352854882 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1352854882;
        // ---------- Original Method ----------
        //ensureTransformationInfo();
        //mTransformationInfo.mAlpha = alpha;
        //boolean subclassHandlesAlpha = onSetAlpha((int) (alpha * 255));
        //if (subclassHandlesAlpha) {
            //mPrivateFlags |= ALPHA_SET;
        //} else {
            //mPrivateFlags &= ~ALPHA_SET;
        //}
        //return subclassHandlesAlpha;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.158 -0400", hash_original_method = "7F5BCC343553D8AF12DD736B7A32ED37", hash_generated_method = "57CE750FEB07C358E6DA77B2290D1340")
    @ViewDebug.CapturedViewProperty
    public final int getTop() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_764988862 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_764988862;
        // ---------- Original Method ----------
        //return mTop;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.169 -0400", hash_original_method = "B40CE7C2F79D3592297A6568172CADD8", hash_generated_method = "7443D0667B955140A1843FD61DA200C6")
    public final void setTop(int top) {
        {
            updateMatrix();
            boolean matrixIsIdentity;
            matrixIsIdentity = mTransformationInfo == null
                    || mTransformationInfo.mMatrixIsIdentity;
            {
                {
                    int minTop;
                    int yLoc;
                    {
                        minTop = top;
                        yLoc = top - mTop;
                    } //End block
                    {
                        minTop = mTop;
                        yLoc = 0;
                    } //End block
                    invalidate(0, yLoc, mRight - mLeft, mBottom - minTop);
                } //End block
            } //End block
            {
                invalidate(true);
            } //End block
            int width;
            width = mRight - mLeft;
            int oldHeight;
            oldHeight = mBottom - mTop;
            mTop = top;
            onSizeChanged(width, mBottom - mTop, width, oldHeight);
            {
                {
                    mTransformationInfo.mMatrixDirty = true;
                } //End block
                mPrivateFlags |= DRAWN;
                invalidate(true);
            } //End block
            mBackgroundSizeChanged = true;
            invalidateParentIfNeeded();
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.169 -0400", hash_original_method = "D7B6007ED4F8CEAF5E034DAB4DC51ADC", hash_generated_method = "18A025AEDBACFFAE1E19F9335E3212A9")
    @ViewDebug.CapturedViewProperty
    public final int getBottom() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_431760474 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_431760474;
        // ---------- Original Method ----------
        //return mBottom;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.169 -0400", hash_original_method = "389E1BFAE78D9C18A209C3C1F1063911", hash_generated_method = "E17095FAD10971119982964A1F29D155")
    public boolean isDirty() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_803452570 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_803452570;
        // ---------- Original Method ----------
        //return (mPrivateFlags & DIRTY_MASK) != 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.170 -0400", hash_original_method = "23478A87AB3417F9EDAE904815FA444D", hash_generated_method = "2CB02EDE4AB215EEE101203DB2F53BA8")
    public final void setBottom(int bottom) {
        {
            updateMatrix();
            boolean matrixIsIdentity;
            matrixIsIdentity = mTransformationInfo == null
                    || mTransformationInfo.mMatrixIsIdentity;
            {
                {
                    int maxBottom;
                    {
                        maxBottom = mBottom;
                    } //End block
                    {
                        maxBottom = bottom;
                    } //End block
                    invalidate(0, 0, mRight - mLeft, maxBottom - mTop);
                } //End block
            } //End block
            {
                invalidate(true);
            } //End block
            int width;
            width = mRight - mLeft;
            int oldHeight;
            oldHeight = mBottom - mTop;
            mBottom = bottom;
            onSizeChanged(width, mBottom - mTop, width, oldHeight);
            {
                {
                    mTransformationInfo.mMatrixDirty = true;
                } //End block
                mPrivateFlags |= DRAWN;
                invalidate(true);
            } //End block
            mBackgroundSizeChanged = true;
            invalidateParentIfNeeded();
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.171 -0400", hash_original_method = "73B96062BAB5FB21A32F13529B38306E", hash_generated_method = "FBD1B390623DA5542204CE61E67D5DCB")
    @ViewDebug.CapturedViewProperty
    public final int getLeft() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_48249061 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_48249061;
        // ---------- Original Method ----------
        //return mLeft;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.172 -0400", hash_original_method = "400602AE9C159A853CD1519C8EEA2C4D", hash_generated_method = "C69DACE3D4AE992A2B128B787F65A71C")
    public final void setLeft(int left) {
        {
            updateMatrix();
            boolean matrixIsIdentity;
            matrixIsIdentity = mTransformationInfo == null
                    || mTransformationInfo.mMatrixIsIdentity;
            {
                {
                    int minLeft;
                    int xLoc;
                    {
                        minLeft = left;
                        xLoc = left - mLeft;
                    } //End block
                    {
                        minLeft = mLeft;
                        xLoc = 0;
                    } //End block
                    invalidate(xLoc, 0, mRight - minLeft, mBottom - mTop);
                } //End block
            } //End block
            {
                invalidate(true);
            } //End block
            int oldWidth;
            oldWidth = mRight - mLeft;
            int height;
            height = mBottom - mTop;
            mLeft = left;
            onSizeChanged(mRight - mLeft, height, oldWidth, height);
            {
                {
                    mTransformationInfo.mMatrixDirty = true;
                } //End block
                mPrivateFlags |= DRAWN;
                invalidate(true);
            } //End block
            mBackgroundSizeChanged = true;
            invalidateParentIfNeeded();
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.172 -0400", hash_original_method = "BAA591F437367FFFE3E50F2B2874B150", hash_generated_method = "277CF474F50B2DD5995FF5A55610A739")
    @ViewDebug.CapturedViewProperty
    public final int getRight() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_949549404 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_949549404;
        // ---------- Original Method ----------
        //return mRight;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.276 -0400", hash_original_method = "2D86637EDDF21E63210ED8568FEA8F8B", hash_generated_method = "EBE91F3FF6A7D47438400C93848987CC")
    public final void setRight(int right) {
        {
            updateMatrix();
            boolean matrixIsIdentity;
            matrixIsIdentity = mTransformationInfo == null
                    || mTransformationInfo.mMatrixIsIdentity;
            {
                {
                    int maxRight;
                    {
                        maxRight = mRight;
                    } //End block
                    {
                        maxRight = right;
                    } //End block
                    invalidate(0, 0, maxRight - mLeft, mBottom - mTop);
                } //End block
            } //End block
            {
                invalidate(true);
            } //End block
            int oldWidth;
            oldWidth = mRight - mLeft;
            int height;
            height = mBottom - mTop;
            mRight = right;
            onSizeChanged(mRight - mLeft, height, oldWidth, height);
            {
                {
                    mTransformationInfo.mMatrixDirty = true;
                } //End block
                mPrivateFlags |= DRAWN;
                invalidate(true);
            } //End block
            mBackgroundSizeChanged = true;
            invalidateParentIfNeeded();
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.277 -0400", hash_original_method = "245DBA10F47190D5F336E33CB089C2B3", hash_generated_method = "E044B4006CE298859DB472FD5201240F")
    public float getX() {
        float var546ADE640B6EDFBC8A086EF31347E768_627571065 = getTaintFloat();
        return var546ADE640B6EDFBC8A086EF31347E768_627571065;
        // ---------- Original Method ----------
        //return mLeft + (mTransformationInfo != null ? mTransformationInfo.mTranslationX : 0);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.277 -0400", hash_original_method = "CF32EA1F394F68FC79E0B0DE51F0C329", hash_generated_method = "BAEE0B5E3AC636509CFAC98493EB23E6")
    public void setX(float x) {
        setTranslationX(x - mLeft);
        addTaint(x);
        // ---------- Original Method ----------
        //setTranslationX(x - mLeft);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.278 -0400", hash_original_method = "52DD2F53B3B778139AEDE644F53CC413", hash_generated_method = "5CA10648B5C6750D7F59B34A9163FDB3")
    public float getY() {
        float var546ADE640B6EDFBC8A086EF31347E768_1843289354 = getTaintFloat();
        return var546ADE640B6EDFBC8A086EF31347E768_1843289354;
        // ---------- Original Method ----------
        //return mTop + (mTransformationInfo != null ? mTransformationInfo.mTranslationY : 0);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.278 -0400", hash_original_method = "17990A784E3651A021C8D9C97053B995", hash_generated_method = "F01548C85E60534244C8021D99D8F2A1")
    public void setY(float y) {
        setTranslationY(y - mTop);
        addTaint(y);
        // ---------- Original Method ----------
        //setTranslationY(y - mTop);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.295 -0400", hash_original_method = "A376723ACFB723DF70FCDB72B84F3B74", hash_generated_method = "6D3323B044A4A62E3228B4C40E6A003C")
    public float getTranslationX() {
        float var546ADE640B6EDFBC8A086EF31347E768_710393738 = getTaintFloat();
        return var546ADE640B6EDFBC8A086EF31347E768_710393738;
        // ---------- Original Method ----------
        //return mTransformationInfo != null ? mTransformationInfo.mTranslationX : 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.296 -0400", hash_original_method = "099C9E42CAA9B2F0466F96FB99A2B049", hash_generated_method = "A40EBE33E2D522B09843C3FCF1FBFDDC")
    public void setTranslationX(float translationX) {
        ensureTransformationInfo();
        TransformationInfo info;
        info = mTransformationInfo;
        {
            invalidateParentCaches();
            invalidate(false);
            info.mTranslationX = translationX;
            info.mMatrixDirty = true;
            mPrivateFlags |= DRAWN;
            invalidate(false);
        } //End block
        addTaint(translationX);
        // ---------- Original Method ----------
        //ensureTransformationInfo();
        //final TransformationInfo info = mTransformationInfo;
        //if (info.mTranslationX != translationX) {
            //invalidateParentCaches();
            //invalidate(false);
            //info.mTranslationX = translationX;
            //info.mMatrixDirty = true;
            //mPrivateFlags |= DRAWN; 
            //invalidate(false);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.296 -0400", hash_original_method = "3533DDBA4926D8143F5FEBC602AC7438", hash_generated_method = "92EA16FBBD0917D028F30B6EE0381B62")
    public float getTranslationY() {
        float var546ADE640B6EDFBC8A086EF31347E768_2095678977 = getTaintFloat();
        return var546ADE640B6EDFBC8A086EF31347E768_2095678977;
        // ---------- Original Method ----------
        //return mTransformationInfo != null ? mTransformationInfo.mTranslationY : 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.298 -0400", hash_original_method = "162C2FF9FF4565DE36BAE7FE449EEB59", hash_generated_method = "767C0B0E4A0EF7E5DD5BEF7A11BE7303")
    public void setTranslationY(float translationY) {
        ensureTransformationInfo();
        TransformationInfo info;
        info = mTransformationInfo;
        {
            invalidateParentCaches();
            invalidate(false);
            info.mTranslationY = translationY;
            info.mMatrixDirty = true;
            mPrivateFlags |= DRAWN;
            invalidate(false);
        } //End block
        addTaint(translationY);
        // ---------- Original Method ----------
        //ensureTransformationInfo();
        //final TransformationInfo info = mTransformationInfo;
        //if (info.mTranslationY != translationY) {
            //invalidateParentCaches();
            //invalidate(false);
            //info.mTranslationY = translationY;
            //info.mMatrixDirty = true;
            //mPrivateFlags |= DRAWN; 
            //invalidate(false);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.312 -0400", hash_original_method = "02B92D2EDB4EF774368BD328DB9464D0", hash_generated_method = "51ADF6C468629B07C87F4CD47DC7C195")
    public void setFastTranslationX(float x) {
        ensureTransformationInfo();
        TransformationInfo info;
        info = mTransformationInfo;
        info.mTranslationX = x;
        info.mMatrixDirty = true;
        addTaint(x);
        // ---------- Original Method ----------
        //ensureTransformationInfo();
        //final TransformationInfo info = mTransformationInfo;
        //info.mTranslationX = x;
        //info.mMatrixDirty = true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.313 -0400", hash_original_method = "7A3DD70389071B86917A72495144388B", hash_generated_method = "3ABD16DE9576C14EED04C1D13447448A")
    public void setFastTranslationY(float y) {
        ensureTransformationInfo();
        TransformationInfo info;
        info = mTransformationInfo;
        info.mTranslationY = y;
        info.mMatrixDirty = true;
        addTaint(y);
        // ---------- Original Method ----------
        //ensureTransformationInfo();
        //final TransformationInfo info = mTransformationInfo;
        //info.mTranslationY = y;
        //info.mMatrixDirty = true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.321 -0400", hash_original_method = "27E5E5A6B58B43EDE1C38FBEFFB0B4F7", hash_generated_method = "FE9A6675AE2304041C287B68B9573C0C")
    public void setFastX(float x) {
        ensureTransformationInfo();
        TransformationInfo info;
        info = mTransformationInfo;
        info.mTranslationX = x - mLeft;
        info.mMatrixDirty = true;
        addTaint(x);
        // ---------- Original Method ----------
        //ensureTransformationInfo();
        //final TransformationInfo info = mTransformationInfo;
        //info.mTranslationX = x - mLeft;
        //info.mMatrixDirty = true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.322 -0400", hash_original_method = "435AAC5941937B26A66754F689D5E36E", hash_generated_method = "CFF1C28C5E8ED31545C9DDF3F052ADB3")
    public void setFastY(float y) {
        ensureTransformationInfo();
        TransformationInfo info;
        info = mTransformationInfo;
        info.mTranslationY = y - mTop;
        info.mMatrixDirty = true;
        addTaint(y);
        // ---------- Original Method ----------
        //ensureTransformationInfo();
        //final TransformationInfo info = mTransformationInfo;
        //info.mTranslationY = y - mTop;
        //info.mMatrixDirty = true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.322 -0400", hash_original_method = "8FBF5EB14D6023B3D32370623C07D6EB", hash_generated_method = "01BB43201B91E665E323EA2EB2FBEC5C")
    public void setFastScaleX(float x) {
        ensureTransformationInfo();
        TransformationInfo info;
        info = mTransformationInfo;
        info.mScaleX = x;
        info.mMatrixDirty = true;
        addTaint(x);
        // ---------- Original Method ----------
        //ensureTransformationInfo();
        //final TransformationInfo info = mTransformationInfo;
        //info.mScaleX = x;
        //info.mMatrixDirty = true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.322 -0400", hash_original_method = "AA6BDD2065E69990CAD75C2A9525B2D0", hash_generated_method = "A2D1F45EDCC715C18E92BF9E26D0507F")
    public void setFastScaleY(float y) {
        ensureTransformationInfo();
        TransformationInfo info;
        info = mTransformationInfo;
        info.mScaleY = y;
        info.mMatrixDirty = true;
        addTaint(y);
        // ---------- Original Method ----------
        //ensureTransformationInfo();
        //final TransformationInfo info = mTransformationInfo;
        //info.mScaleY = y;
        //info.mMatrixDirty = true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.323 -0400", hash_original_method = "AD7F6BBA7BB1872387A16DCF0021D7AA", hash_generated_method = "621D2591E23FA811817E9AE822951428")
    public void setFastAlpha(float alpha) {
        ensureTransformationInfo();
        mTransformationInfo.mAlpha = alpha;
        // ---------- Original Method ----------
        //ensureTransformationInfo();
        //mTransformationInfo.mAlpha = alpha;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.323 -0400", hash_original_method = "3ADB507BF62ACDA7E6B7E6725B1B98A0", hash_generated_method = "65C8B19E036C63192C7C0218DC873947")
    public void setFastRotationY(float y) {
        ensureTransformationInfo();
        TransformationInfo info;
        info = mTransformationInfo;
        info.mRotationY = y;
        info.mMatrixDirty = true;
        addTaint(y);
        // ---------- Original Method ----------
        //ensureTransformationInfo();
        //final TransformationInfo info = mTransformationInfo;
        //info.mRotationY = y;
        //info.mMatrixDirty = true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.328 -0400", hash_original_method = "CD4FEC45EB5F7DBC5B440DED4446311E", hash_generated_method = "7DABE68E7CEE8D66496CE55057CF2011")
    public void getHitRect(Rect outRect) {
        updateMatrix();
        TransformationInfo info;
        info = mTransformationInfo;
        {
            outRect.set(mLeft, mTop, mRight, mBottom);
        } //End block
        {
            RectF tmpRect;
            tmpRect = mAttachInfo.mTmpTransformRect;
            tmpRect.set(-info.mPivotX, -info.mPivotY,
                    getWidth() - info.mPivotX, getHeight() - info.mPivotY);
            info.mMatrix.mapRect(tmpRect);
            outRect.set((int) tmpRect.left + mLeft, (int) tmpRect.top + mTop,
                    (int) tmpRect.right + mLeft, (int) tmpRect.bottom + mTop);
        } //End block
        addTaint(outRect.getTaint());
        // ---------- Original Method ----------
        //updateMatrix();
        //final TransformationInfo info = mTransformationInfo;
        //if (info == null || info.mMatrixIsIdentity || mAttachInfo == null) {
            //outRect.set(mLeft, mTop, mRight, mBottom);
        //} else {
            //final RectF tmpRect = mAttachInfo.mTmpTransformRect;
            //tmpRect.set(-info.mPivotX, -info.mPivotY,
                    //getWidth() - info.mPivotX, getHeight() - info.mPivotY);
            //info.mMatrix.mapRect(tmpRect);
            //outRect.set((int) tmpRect.left + mLeft, (int) tmpRect.top + mTop,
                    //(int) tmpRect.right + mLeft, (int) tmpRect.bottom + mTop);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.344 -0400", hash_original_method = "E2A76004025C1F44E382F6372B86BB53", hash_generated_method = "DBB47A49DFABB2E446A558D21916C3DF")
    final boolean pointInView(float localX, float localY) {
        addTaint(localX);
        addTaint(localY);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1257061157 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1257061157;
        // ---------- Original Method ----------
        //return localX >= 0 && localX < (mRight - mLeft)
                //&& localY >= 0 && localY < (mBottom - mTop);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.344 -0400", hash_original_method = "D00244756776E7D2FD65633E1CF43263", hash_generated_method = "DD7BDCD5BD7086C4CD8E60690A1DE0E9")
    private boolean pointInView(float localX, float localY, float slop) {
        addTaint(localX);
        addTaint(localY);
        addTaint(slop);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_328714874 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_328714874;
        // ---------- Original Method ----------
        //return localX >= -slop && localY >= -slop && localX < ((mRight - mLeft) + slop) &&
                //localY < ((mBottom - mTop) + slop);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.345 -0400", hash_original_method = "DDDABA6E6D899E7EA47B4452312088BE", hash_generated_method = "AC09A9567DAAAEDD7A9EEB650F041E19")
    public void getFocusedRect(Rect r) {
        getDrawingRect(r);
        addTaint(r.getTaint());
        // ---------- Original Method ----------
        //getDrawingRect(r);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.345 -0400", hash_original_method = "24BDD9FA3E3C2FB6EA31ED75B384BDD9", hash_generated_method = "A38B531DEB9C84F48680DA55EF373F0F")
    public boolean getGlobalVisibleRect(Rect r, Point globalOffset) {
        int width;
        width = mRight - mLeft;
        int height;
        height = mBottom - mTop;
        {
            r.set(0, 0, width, height);
            {
                globalOffset.set(-mScrollX, -mScrollY);
            } //End block
            boolean varD0C4A40C45EF46AFF22F080E1528CE15_965255159 = (mParent == null || mParent.getChildVisibleRect(this, r, globalOffset));
        } //End block
        addTaint(r.getTaint());
        addTaint(globalOffset.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1556586205 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1556586205;
        // ---------- Original Method ----------
        //int width = mRight - mLeft;
        //int height = mBottom - mTop;
        //if (width > 0 && height > 0) {
            //r.set(0, 0, width, height);
            //if (globalOffset != null) {
                //globalOffset.set(-mScrollX, -mScrollY);
            //}
            //return mParent == null || mParent.getChildVisibleRect(this, r, globalOffset);
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.345 -0400", hash_original_method = "EADCD4C63731C6547F1C03CEAFC09A53", hash_generated_method = "A2223B0EB354978AC8B875F93AE6DE75")
    public final boolean getGlobalVisibleRect(Rect r) {
        boolean varA0E19E10963694B496EAF71FD83982B3_15278957 = (getGlobalVisibleRect(r, null));
        addTaint(r.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1929034031 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1929034031;
        // ---------- Original Method ----------
        //return getGlobalVisibleRect(r, null);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.346 -0400", hash_original_method = "CB024757CF5A14ECB6F9DCD9789CD2F8", hash_generated_method = "30A7901421984AC02B5C54B46A507864")
    public final boolean getLocalVisibleRect(Rect r) {
        Point offset;
        offset = new Point();
        {
            boolean varBBF18CCA515610662C9382F2D4C23619_350994567 = (getGlobalVisibleRect(r, offset));
            {
                r.offset(-offset.x, -offset.y);
            } //End block
        } //End collapsed parenthetic
        addTaint(r.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_157423006 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_157423006;
        // ---------- Original Method ----------
        //Point offset = new Point();
        //if (getGlobalVisibleRect(r, offset)) {
            //r.offset(-offset.x, -offset.y); 
            //return true;
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.347 -0400", hash_original_method = "5A4ADD2D1ADF5703ED27FAE1582BB62A", hash_generated_method = "FD4BCCACB8F1EC5BB217A6BC39E20E7F")
    public void offsetTopAndBottom(int offset) {
        {
            updateMatrix();
            boolean matrixIsIdentity;
            matrixIsIdentity = mTransformationInfo == null
                    || mTransformationInfo.mMatrixIsIdentity;
            {
                ViewParent p;
                p = mParent;
                {
                    Rect r;
                    r = mAttachInfo.mTmpInvalRect;
                    int minTop;
                    int maxBottom;
                    int yLoc;
                    {
                        minTop = mTop + offset;
                        maxBottom = mBottom;
                        yLoc = offset;
                    } //End block
                    {
                        minTop = mTop;
                        maxBottom = mBottom + offset;
                        yLoc = 0;
                    } //End block
                    r.set(0, yLoc, mRight - mLeft, maxBottom - minTop);
                    p.invalidateChild(this, r);
                } //End block
            } //End block
            {
                invalidate(false);
            } //End block
            mTop += offset;
            mBottom += offset;
            {
                mPrivateFlags |= DRAWN;
                invalidate(false);
            } //End block
            invalidateParentIfNeeded();
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.356 -0400", hash_original_method = "A934BA60BC3812BC980C4328CCEB9557", hash_generated_method = "7B9754A82E954A45F4A0C00B38F2E685")
    public void offsetLeftAndRight(int offset) {
        {
            updateMatrix();
            boolean matrixIsIdentity;
            matrixIsIdentity = mTransformationInfo == null
                    || mTransformationInfo.mMatrixIsIdentity;
            {
                ViewParent p;
                p = mParent;
                {
                    Rect r;
                    r = mAttachInfo.mTmpInvalRect;
                    int minLeft;
                    int maxRight;
                    {
                        minLeft = mLeft + offset;
                        maxRight = mRight;
                    } //End block
                    {
                        minLeft = mLeft;
                        maxRight = mRight + offset;
                    } //End block
                    r.set(0, 0, maxRight - minLeft, mBottom - mTop);
                    p.invalidateChild(this, r);
                } //End block
            } //End block
            {
                invalidate(false);
            } //End block
            mLeft += offset;
            mRight += offset;
            {
                mPrivateFlags |= DRAWN;
                invalidate(false);
            } //End block
            invalidateParentIfNeeded();
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.356 -0400", hash_original_method = "5EB740A9A129A62709C940CDC3C1FA90", hash_generated_method = "197A50261AA24BF684D907013EEE8CBD")
    @ViewDebug.ExportedProperty(deepExport = true, prefix = "layout_")
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams varB4EAC82CA7396A68D541C85D26508E83_1999212012 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1999212012 = mLayoutParams;
        varB4EAC82CA7396A68D541C85D26508E83_1999212012.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1999212012;
        // ---------- Original Method ----------
        //return mLayoutParams;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.357 -0400", hash_original_method = "279E70A70FA2B2FEFF6E7E1E87EEDC2B", hash_generated_method = "8E0A191BC3BEC45F342B8D12A19BA2C3")
    public void setLayoutParams(ViewGroup.LayoutParams params) {
        {
            if (DroidSafeAndroidRuntime.control) throw new NullPointerException("Layout parameters cannot be null");
        } //End block
        mLayoutParams = params;
        requestLayout();
        // ---------- Original Method ----------
        //if (params == null) {
            //throw new NullPointerException("Layout parameters cannot be null");
        //}
        //mLayoutParams = params;
        //requestLayout();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.385 -0400", hash_original_method = "C9DC0366B539164245F3B3ACA0A07797", hash_generated_method = "116FE26B5BB657072CBCD4904D1EE7D5")
    public void scrollTo(int x, int y) {
        {
            int oldX;
            oldX = mScrollX;
            int oldY;
            oldY = mScrollY;
            mScrollX = x;
            mScrollY = y;
            invalidateParentCaches();
            onScrollChanged(mScrollX, mScrollY, oldX, oldY);
            {
                boolean varC828E793AFDA5CD988FA9008B6EB3B30_411046106 = (!awakenScrollBars());
                {
                    invalidate(true);
                } //End block
            } //End collapsed parenthetic
        } //End block
        // ---------- Original Method ----------
        //if (mScrollX != x || mScrollY != y) {
            //int oldX = mScrollX;
            //int oldY = mScrollY;
            //mScrollX = x;
            //mScrollY = y;
            //invalidateParentCaches();
            //onScrollChanged(mScrollX, mScrollY, oldX, oldY);
            //if (!awakenScrollBars()) {
                //invalidate(true);
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.386 -0400", hash_original_method = "9A3BFF0D9282AAB8B07B22048D68076B", hash_generated_method = "1A9AAA4081652147B61CFEDF7EFA4EA4")
    public void scrollBy(int x, int y) {
        scrollTo(mScrollX + x, mScrollY + y);
        addTaint(x);
        addTaint(y);
        // ---------- Original Method ----------
        //scrollTo(mScrollX + x, mScrollY + y);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.386 -0400", hash_original_method = "08F687B40826EF7DBBF2573184DC2210", hash_generated_method = "C63414FD0E5E2A9F7B1989904B0B506E")
    protected boolean awakenScrollBars() {
        boolean var70EE0F5768F31DAF2C1A8B4E95A75A4F_366077990 = (mScrollCache != null &&
                awakenScrollBars(mScrollCache.scrollBarDefaultDelayBeforeFade, true));
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_963684667 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_963684667;
        // ---------- Original Method ----------
        //return mScrollCache != null &&
                //awakenScrollBars(mScrollCache.scrollBarDefaultDelayBeforeFade, true);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.386 -0400", hash_original_method = "2B4CF6E85FAE9FF55F32C24BEFDC5081", hash_generated_method = "3D2070CB39DAA65A1AB60A0738374585")
    private boolean initialAwakenScrollBars() {
        boolean var92AEF1EA9E316D77EDD85ABCDC19B36B_1421222422 = (mScrollCache != null &&
                awakenScrollBars(mScrollCache.scrollBarDefaultDelayBeforeFade * 4, true));
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_490223745 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_490223745;
        // ---------- Original Method ----------
        //return mScrollCache != null &&
                //awakenScrollBars(mScrollCache.scrollBarDefaultDelayBeforeFade * 4, true);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.387 -0400", hash_original_method = "D5CE7E5EDCD7F839910A14AF470AF787", hash_generated_method = "3685C1183DD7FE212D3052450CD164E8")
    protected boolean awakenScrollBars(int startDelay) {
        boolean varF0BE7569E2898F8A7748258008B8FAFD_796587326 = (awakenScrollBars(startDelay, true));
        addTaint(startDelay);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_887901309 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_887901309;
        // ---------- Original Method ----------
        //return awakenScrollBars(startDelay, true);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.389 -0400", hash_original_method = "CAD4350A25772201F660B41D91481A2E", hash_generated_method = "B7A6F2C59040DE3FA5D7047DB122496A")
    protected boolean awakenScrollBars(int startDelay, boolean invalidate) {
        ScrollabilityCache scrollCache;
        scrollCache = mScrollCache;
        {
            scrollCache.scrollBar = new ScrollBarDrawable();
        } //End block
        {
            boolean var5422F660D44B0D1544FC157071290861_2108244484 = (isHorizontalScrollBarEnabled() || isVerticalScrollBarEnabled());
            {
                {
                    invalidate(true);
                } //End block
                {
                    int KEY_REPEAT_FIRST_DELAY;
                    KEY_REPEAT_FIRST_DELAY = 750;
                    startDelay = Math.max(KEY_REPEAT_FIRST_DELAY, startDelay);
                } //End block
                long fadeStartTime;
                fadeStartTime = AnimationUtils.currentAnimationTimeMillis() + startDelay;
                scrollCache.fadeStartTime = fadeStartTime;
                scrollCache.state = ScrollabilityCache.ON;
                {
                    mAttachInfo.mHandler.removeCallbacks(scrollCache);
                    mAttachInfo.mHandler.postAtTime(scrollCache, fadeStartTime);
                } //End block
            } //End block
        } //End collapsed parenthetic
        addTaint(startDelay);
        addTaint(invalidate);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1071209557 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1071209557;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.390 -0400", hash_original_method = "FC7DFAD8D0391FACDB1212D1D56F8C7D", hash_generated_method = "BAF72B5D1C298D0D46B3A3BFD880A81D")
    private boolean skipInvalidate() {
        boolean var8D9B0BE46D426CBE2B5119C4603A668E_587249255 = ((mViewFlags & VISIBILITY_MASK) != VISIBLE && mCurrentAnimation == null &&
                (!(mParent instanceof ViewGroup) ||
                        !((ViewGroup) mParent).isViewTransitioning(this)));
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1783868083 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1783868083;
        // ---------- Original Method ----------
        //return (mViewFlags & VISIBILITY_MASK) != VISIBLE && mCurrentAnimation == null &&
                //(!(mParent instanceof ViewGroup) ||
                        //!((ViewGroup) mParent).isViewTransitioning(this));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.391 -0400", hash_original_method = "C9F4885B3240AC42BDB62659847A9804", hash_generated_method = "08DD3FFE587077C7D2AD8722F1BDC0AF")
    public void invalidate(Rect dirty) {
        {
            ViewDebug.trace(this, ViewDebug.HierarchyTraceType.INVALIDATE);
        } //End block
        {
            boolean varD5DC22E7E87E4B26C6AA34C5FC18E1F5_1854878281 = (skipInvalidate());
        } //End collapsed parenthetic
        {
            mPrivateFlags &= ~DRAWING_CACHE_VALID;
            mPrivateFlags |= INVALIDATED;
            mPrivateFlags |= DIRTY;
            ViewParent p;
            p = mParent;
            AttachInfo ai;
            ai = mAttachInfo;
            {
                {
                    p.invalidateChild(this, null);
                } //End block
            } //End block
            {
                int scrollX;
                scrollX = mScrollX;
                int scrollY;
                scrollY = mScrollY;
                Rect r;
                r = ai.mTmpInvalRect;
                r.set(dirty.left - scrollX, dirty.top - scrollY,
                        dirty.right - scrollX, dirty.bottom - scrollY);
                mParent.invalidateChild(this, r);
            } //End block
        } //End block
        addTaint(dirty.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.393 -0400", hash_original_method = "ADB8190FF1114977057C1857B6D8BC7D", hash_generated_method = "69A3FCE798BEFC75781EF19B8A977765")
    public void invalidate(int l, int t, int r, int b) {
        {
            ViewDebug.trace(this, ViewDebug.HierarchyTraceType.INVALIDATE);
        } //End block
        {
            boolean varD5DC22E7E87E4B26C6AA34C5FC18E1F5_217557800 = (skipInvalidate());
        } //End collapsed parenthetic
        {
            mPrivateFlags &= ~DRAWING_CACHE_VALID;
            mPrivateFlags |= INVALIDATED;
            mPrivateFlags |= DIRTY;
            ViewParent p;
            p = mParent;
            AttachInfo ai;
            ai = mAttachInfo;
            {
                {
                    p.invalidateChild(this, null);
                } //End block
            } //End block
            {
                int scrollX;
                scrollX = mScrollX;
                int scrollY;
                scrollY = mScrollY;
                Rect tmpr;
                tmpr = ai.mTmpInvalRect;
                tmpr.set(l - scrollX, t - scrollY, r - scrollX, b - scrollY);
                p.invalidateChild(this, tmpr);
            } //End block
        } //End block
        addTaint(l);
        addTaint(t);
        addTaint(r);
        addTaint(b);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.393 -0400", hash_original_method = "DD9880156AB041E4BB31F756D1AB2189", hash_generated_method = "BF85BB9D7AA11B7869ED1AB59ACA8EDC")
    public void invalidate() {
        invalidate(true);
        // ---------- Original Method ----------
        //invalidate(true);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.413 -0400", hash_original_method = "2A2B8D7DA5636907090E85C40DC13DF0", hash_generated_method = "B4C14ABF29CEF7D549958FB89EBAA2D1")
     void invalidate(boolean invalidateCache) {
        {
            ViewDebug.trace(this, ViewDebug.HierarchyTraceType.INVALIDATE);
        } //End block
        {
            boolean varD5DC22E7E87E4B26C6AA34C5FC18E1F5_249443134 = (skipInvalidate());
        } //End collapsed parenthetic
        {
            boolean var5D4EC7C3849E23BFDACCE7FE932C2ED1_949020305 = ((mPrivateFlags & (DRAWN | HAS_BOUNDS)) == (DRAWN | HAS_BOUNDS) ||
                (invalidateCache && (mPrivateFlags & DRAWING_CACHE_VALID) == DRAWING_CACHE_VALID) ||
                (mPrivateFlags & INVALIDATED) != INVALIDATED || isOpaque() != mLastIsOpaque);
            {
                mLastIsOpaque = isOpaque();
                mPrivateFlags &= ~DRAWN;
                mPrivateFlags |= DIRTY;
                {
                    mPrivateFlags |= INVALIDATED;
                    mPrivateFlags &= ~DRAWING_CACHE_VALID;
                } //End block
                AttachInfo ai;
                ai = mAttachInfo;
                ViewParent p;
                p = mParent;
                {
                    {
                        p.invalidateChild(this, null);
                    } //End block
                } //End block
                {
                    Rect r;
                    r = ai.mTmpInvalRect;
                    r.set(0, 0, mRight - mLeft, mBottom - mTop);
                    p.invalidateChild(this, r);
                } //End block
            } //End block
        } //End collapsed parenthetic
        addTaint(invalidateCache);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.415 -0400", hash_original_method = "9E49D44B70542B7D202A00B58BCD901B", hash_generated_method = "307A4BAD4FDBEC59B50AAC35A0BEF9AD")
    public void fastInvalidate() {
        {
            boolean varD5DC22E7E87E4B26C6AA34C5FC18E1F5_416477577 = (skipInvalidate());
        } //End collapsed parenthetic
        {
            {
                ((View) mParent).mPrivateFlags |= INVALIDATED;
            } //End block
            mPrivateFlags &= ~DRAWN;
            mPrivateFlags |= DIRTY;
            mPrivateFlags |= INVALIDATED;
            mPrivateFlags &= ~DRAWING_CACHE_VALID;
            {
                {
                    mParent.invalidateChild(this, null);
                } //End block
                {
                    Rect r;
                    r = mAttachInfo.mTmpInvalRect;
                    r.set(0, 0, mRight - mLeft, mBottom - mTop);
                    mParent.invalidateChild(this, r);
                } //End block
            } //End block
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.415 -0400", hash_original_method = "74A87B1768814B24E7FEDDF99D8537F0", hash_generated_method = "259EF29A518D154D0008BBE13AE3F86A")
    protected void invalidateParentCaches() {
        {
            ((View) mParent).mPrivateFlags |= INVALIDATED;
        } //End block
        // ---------- Original Method ----------
        //if (mParent instanceof View) {
            //((View) mParent).mPrivateFlags |= INVALIDATED;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.420 -0400", hash_original_method = "A648B59C2EE20F29A9B99BF448851618", hash_generated_method = "4D81760EFF8C417957D9ED7DD3F3052B")
    protected void invalidateParentIfNeeded() {
        {
            boolean var0CFA59CC9046639DFA3FC76B3FAFF415_1690678824 = (isHardwareAccelerated() && mParent instanceof View);
            {
                ((View) mParent).invalidate(true);
            } //End block
        } //End collapsed parenthetic
        // ---------- Original Method ----------
        //if (isHardwareAccelerated() && mParent instanceof View) {
            //((View) mParent).invalidate(true);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.420 -0400", hash_original_method = "E9C24F17558159FB485FCFC13D70293E", hash_generated_method = "3749D005EDC226BC8DC61D022DC4DABF")
    @ViewDebug.ExportedProperty(category = "drawing")
    public boolean isOpaque() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1680175286 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1680175286;
        // ---------- Original Method ----------
        //return (mPrivateFlags & OPAQUE_MASK) == OPAQUE_MASK &&
                //((mTransformationInfo != null ? mTransformationInfo.mAlpha : 1)
                        //>= 1.0f - ViewConfiguration.ALPHA_THRESHOLD);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.421 -0400", hash_original_method = "497EF7DE92B2945B2FEC8F46EAD33430", hash_generated_method = "A6B5C535E888929A8AA982473448963D")
    protected void computeOpaqueFlags() {
        {
            boolean var4EAF945C1787CBA8CB4548E7AF4BB4B5_317009094 = (mBGDrawable != null && mBGDrawable.getOpacity() == PixelFormat.OPAQUE);
            {
                mPrivateFlags |= OPAQUE_BACKGROUND;
            } //End block
            {
                mPrivateFlags &= ~OPAQUE_BACKGROUND;
            } //End block
        } //End collapsed parenthetic
        int flags;
        flags = mViewFlags;
        {
            mPrivateFlags |= OPAQUE_SCROLLBARS;
        } //End block
        {
            mPrivateFlags &= ~OPAQUE_SCROLLBARS;
        } //End block
        // ---------- Original Method ----------
        //if (mBGDrawable != null && mBGDrawable.getOpacity() == PixelFormat.OPAQUE) {
            //mPrivateFlags |= OPAQUE_BACKGROUND;
        //} else {
            //mPrivateFlags &= ~OPAQUE_BACKGROUND;
        //}
        //final int flags = mViewFlags;
        //if (((flags & SCROLLBARS_VERTICAL) == 0 && (flags & SCROLLBARS_HORIZONTAL) == 0) ||
                //(flags & SCROLLBARS_STYLE_MASK) == SCROLLBARS_INSIDE_OVERLAY) {
            //mPrivateFlags |= OPAQUE_SCROLLBARS;
        //} else {
            //mPrivateFlags &= ~OPAQUE_SCROLLBARS;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.422 -0400", hash_original_method = "7EE186D55064FCDB5B25DFE594562441", hash_generated_method = "EEA820A47094DA16E6A02370763DF047")
    protected boolean hasOpaqueScrollbars() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1014934875 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1014934875;
        // ---------- Original Method ----------
        //return (mPrivateFlags & OPAQUE_SCROLLBARS) == OPAQUE_SCROLLBARS;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.423 -0400", hash_original_method = "DDF5EC42ADE793605447903B93381C32", hash_generated_method = "AAEC84149BF5B4D524856CDBFFE64FA3")
    public Handler getHandler() {
        Handler varB4EAC82CA7396A68D541C85D26508E83_1533794512 = null; //Variable for return #1
        Handler varB4EAC82CA7396A68D541C85D26508E83_1544961922 = null; //Variable for return #2
        {
            varB4EAC82CA7396A68D541C85D26508E83_1533794512 = mAttachInfo.mHandler;
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1544961922 = null;
        Handler varA7E53CE21691AB073D9660D615818899_1056278043; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1056278043 = varB4EAC82CA7396A68D541C85D26508E83_1533794512;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1056278043 = varB4EAC82CA7396A68D541C85D26508E83_1544961922;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1056278043.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1056278043;
        // ---------- Original Method ----------
        //if (mAttachInfo != null) {
            //return mAttachInfo.mHandler;
        //}
        //return null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.423 -0400", hash_original_method = "8EDFE6EE958B917F012E9131A0AEA287", hash_generated_method = "1A7D1402D25B46134E64C2B15F52F67A")
    public boolean post(Runnable action) {
        Handler handler;
        AttachInfo attachInfo;
        attachInfo = mAttachInfo;
        {
            handler = attachInfo.mHandler;
        } //End block
        {
            ViewRootImpl.getRunQueue().post(action);
        } //End block
        boolean var4B5FBEF08D1252F680BD85D523D3F99E_1078750077 = (handler.post(action));
        addTaint(action.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1475852385 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1475852385;
        // ---------- Original Method ----------
        //Handler handler;
        //AttachInfo attachInfo = mAttachInfo;
        //if (attachInfo != null) {
            //handler = attachInfo.mHandler;
        //} else {
            //ViewRootImpl.getRunQueue().post(action);
            //return true;
        //}
        //return handler.post(action);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.424 -0400", hash_original_method = "D354828971EFD085BD14FC0D83048A19", hash_generated_method = "D6673E26C469CE2B6C8DEF44FD1D0E33")
    public boolean postDelayed(Runnable action, long delayMillis) {
        Handler handler;
        AttachInfo attachInfo;
        attachInfo = mAttachInfo;
        {
            handler = attachInfo.mHandler;
        } //End block
        {
            ViewRootImpl.getRunQueue().postDelayed(action, delayMillis);
        } //End block
        boolean varA94056EFF6A774C97C990690CB98EF64_1498847118 = (handler.postDelayed(action, delayMillis));
        addTaint(action.getTaint());
        addTaint(delayMillis);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1867697786 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1867697786;
        // ---------- Original Method ----------
        //Handler handler;
        //AttachInfo attachInfo = mAttachInfo;
        //if (attachInfo != null) {
            //handler = attachInfo.mHandler;
        //} else {
            //ViewRootImpl.getRunQueue().postDelayed(action, delayMillis);
            //return true;
        //}
        //return handler.postDelayed(action, delayMillis);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.424 -0400", hash_original_method = "924A8BEE16A312E53AB8660A02DEF27E", hash_generated_method = "4EBEE53E6E95FC8578C26FB5D93DC0B8")
    public boolean removeCallbacks(Runnable action) {
        Handler handler;
        AttachInfo attachInfo;
        attachInfo = mAttachInfo;
        {
            handler = attachInfo.mHandler;
        } //End block
        {
            ViewRootImpl.getRunQueue().removeCallbacks(action);
        } //End block
        handler.removeCallbacks(action);
        addTaint(action.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1814703185 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1814703185;
        // ---------- Original Method ----------
        //Handler handler;
        //AttachInfo attachInfo = mAttachInfo;
        //if (attachInfo != null) {
            //handler = attachInfo.mHandler;
        //} else {
            //ViewRootImpl.getRunQueue().removeCallbacks(action);
            //return true;
        //}
        //handler.removeCallbacks(action);
        //return true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.424 -0400", hash_original_method = "B784E31CF9F406A65D385399252675E5", hash_generated_method = "E1CD8F02A4425412097D3886A78B39EF")
    public void postInvalidate() {
        postInvalidateDelayed(0);
        // ---------- Original Method ----------
        //postInvalidateDelayed(0);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.425 -0400", hash_original_method = "F30B35993A01DC68F672A7097988A2B2", hash_generated_method = "75B38AEF6E4ACE44458A3F112ED60DFC")
    public void postInvalidate(int left, int top, int right, int bottom) {
        postInvalidateDelayed(0, left, top, right, bottom);
        addTaint(left);
        addTaint(top);
        addTaint(right);
        addTaint(bottom);
        // ---------- Original Method ----------
        //postInvalidateDelayed(0, left, top, right, bottom);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.439 -0400", hash_original_method = "04635C950E88519FA950A99E2186B20C", hash_generated_method = "6EA2ED8DCC54EB485D205E66B084C393")
    public void postInvalidateDelayed(long delayMilliseconds) {
        AttachInfo attachInfo;
        attachInfo = mAttachInfo;
        {
            Message msg;
            msg = Message.obtain();
            msg.what = AttachInfo.INVALIDATE_MSG;
            msg.obj = this;
            attachInfo.mHandler.sendMessageDelayed(msg, delayMilliseconds);
        } //End block
        addTaint(delayMilliseconds);
        // ---------- Original Method ----------
        //AttachInfo attachInfo = mAttachInfo;
        //if (attachInfo != null) {
            //Message msg = Message.obtain();
            //msg.what = AttachInfo.INVALIDATE_MSG;
            //msg.obj = this;
            //attachInfo.mHandler.sendMessageDelayed(msg, delayMilliseconds);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.440 -0400", hash_original_method = "2AD5AD2CFDC403E5ADB3F0CF5F7AB2F6", hash_generated_method = "C0019E5559FE88ADB9BB6B99E96D8143")
    public void postInvalidateDelayed(long delayMilliseconds, int left, int top,
            int right, int bottom) {
        AttachInfo attachInfo;
        attachInfo = mAttachInfo;
        {
            AttachInfo.InvalidateInfo info;
            info = AttachInfo.InvalidateInfo.acquire();
            info.target = this;
            info.left = left;
            info.top = top;
            info.right = right;
            info.bottom = bottom;
            Message msg;
            msg = Message.obtain();
            msg.what = AttachInfo.INVALIDATE_RECT_MSG;
            msg.obj = info;
            attachInfo.mHandler.sendMessageDelayed(msg, delayMilliseconds);
        } //End block
        addTaint(delayMilliseconds);
        addTaint(left);
        addTaint(top);
        addTaint(right);
        addTaint(bottom);
        // ---------- Original Method ----------
        //AttachInfo attachInfo = mAttachInfo;
        //if (attachInfo != null) {
            //final AttachInfo.InvalidateInfo info = AttachInfo.InvalidateInfo.acquire();
            //info.target = this;
            //info.left = left;
            //info.top = top;
            //info.right = right;
            //info.bottom = bottom;
            //final Message msg = Message.obtain();
            //msg.what = AttachInfo.INVALIDATE_RECT_MSG;
            //msg.obj = info;
            //attachInfo.mHandler.sendMessageDelayed(msg, delayMilliseconds);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.445 -0400", hash_original_method = "BB237226F39DBA7BCAA624BDCB91F777", hash_generated_method = "37B71AD809B5E3FDDFA60D04296093DB")
    private void postSendViewScrolledAccessibilityEventCallback() {
        {
            mSendViewScrolledAccessibilityEvent = new SendViewScrolledAccessibilityEvent();
        } //End block
        {
            mSendViewScrolledAccessibilityEvent.mIsPending = true;
            postDelayed(mSendViewScrolledAccessibilityEvent,
                    ViewConfiguration.getSendRecurringAccessibilityEventsInterval());
        } //End block
        // ---------- Original Method ----------
        //if (mSendViewScrolledAccessibilityEvent == null) {
            //mSendViewScrolledAccessibilityEvent = new SendViewScrolledAccessibilityEvent();
        //}
        //if (!mSendViewScrolledAccessibilityEvent.mIsPending) {
            //mSendViewScrolledAccessibilityEvent.mIsPending = true;
            //postDelayed(mSendViewScrolledAccessibilityEvent,
                    //ViewConfiguration.getSendRecurringAccessibilityEventsInterval());
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.451 -0400", hash_original_method = "7821AAE99E52242CE62352C839CCDCC3", hash_generated_method = "DC60F051596188244856202A1C5C2CDD")
    public void computeScroll() {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.451 -0400", hash_original_method = "2F1443E103CAC5C1C2808AA2ECBBD417", hash_generated_method = "C85755475665EA633EEE72335D57F798")
    public boolean isHorizontalFadingEdgeEnabled() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1365677861 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1365677861;
        // ---------- Original Method ----------
        //return (mViewFlags & FADING_EDGE_HORIZONTAL) == FADING_EDGE_HORIZONTAL;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.451 -0400", hash_original_method = "EC0EB62D805892CAAD99FC80B5C4BCFE", hash_generated_method = "E2BE57A09E00C4B0D7E6A4AA367BFC47")
    public void setHorizontalFadingEdgeEnabled(boolean horizontalFadingEdgeEnabled) {
        {
            boolean varA3A448941DEDEC343F4D869D70054393_2105392899 = (isHorizontalFadingEdgeEnabled() != horizontalFadingEdgeEnabled);
            {
                {
                    initScrollCache();
                } //End block
                mViewFlags ^= FADING_EDGE_HORIZONTAL;
            } //End block
        } //End collapsed parenthetic
        addTaint(horizontalFadingEdgeEnabled);
        // ---------- Original Method ----------
        //if (isHorizontalFadingEdgeEnabled() != horizontalFadingEdgeEnabled) {
            //if (horizontalFadingEdgeEnabled) {
                //initScrollCache();
            //}
            //mViewFlags ^= FADING_EDGE_HORIZONTAL;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.452 -0400", hash_original_method = "DC4B7092961F5604BD589F14B65154AC", hash_generated_method = "7760A98D42BDB7E829811AE4B2BC7775")
    public boolean isVerticalFadingEdgeEnabled() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_340299656 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_340299656;
        // ---------- Original Method ----------
        //return (mViewFlags & FADING_EDGE_VERTICAL) == FADING_EDGE_VERTICAL;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.452 -0400", hash_original_method = "EAF2758FE6F0D2FA48FD42C13EB7A789", hash_generated_method = "6CC05F3CB248FE2D7F03E2C0D149EEF4")
    public void setVerticalFadingEdgeEnabled(boolean verticalFadingEdgeEnabled) {
        {
            boolean var01488E834A57F3E5162EDF629729F011_766943966 = (isVerticalFadingEdgeEnabled() != verticalFadingEdgeEnabled);
            {
                {
                    initScrollCache();
                } //End block
                mViewFlags ^= FADING_EDGE_VERTICAL;
            } //End block
        } //End collapsed parenthetic
        addTaint(verticalFadingEdgeEnabled);
        // ---------- Original Method ----------
        //if (isVerticalFadingEdgeEnabled() != verticalFadingEdgeEnabled) {
            //if (verticalFadingEdgeEnabled) {
                //initScrollCache();
            //}
            //mViewFlags ^= FADING_EDGE_VERTICAL;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.452 -0400", hash_original_method = "CA0383E2F77249B4067FF4C25AA980FC", hash_generated_method = "674355201C57C3D96400F249D121D1D1")
    protected float getTopFadingEdgeStrength() {
        {
            boolean var95C748EB7173291A5F92BA7AE0D550D8_1144027156 = (computeVerticalScrollOffset() > 0);
        } //End flattened ternary
        float var546ADE640B6EDFBC8A086EF31347E768_1129885395 = getTaintFloat();
        return var546ADE640B6EDFBC8A086EF31347E768_1129885395;
        // ---------- Original Method ----------
        //return computeVerticalScrollOffset() > 0 ? 1.0f : 0.0f;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.453 -0400", hash_original_method = "DD443087D4013745234D8B8402D9412B", hash_generated_method = "CA5E21A79A3376EF1906DB1D628C5DCA")
    protected float getBottomFadingEdgeStrength() {
        {
            boolean varD919087A08EBAF1D1A5831A04C61CDFE_620084738 = (computeVerticalScrollOffset() + computeVerticalScrollExtent() <
                computeVerticalScrollRange());
        } //End flattened ternary
        float var546ADE640B6EDFBC8A086EF31347E768_46095626 = getTaintFloat();
        return var546ADE640B6EDFBC8A086EF31347E768_46095626;
        // ---------- Original Method ----------
        //return computeVerticalScrollOffset() + computeVerticalScrollExtent() <
                //computeVerticalScrollRange() ? 1.0f : 0.0f;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.453 -0400", hash_original_method = "7D1377787749722D9D47682EF553F1ED", hash_generated_method = "66DAA02CF881BC0BAF0379299F59DF63")
    protected float getLeftFadingEdgeStrength() {
        {
            boolean var7654C1BFABAF507D7C3E35D81F9F8DFD_121968072 = (computeHorizontalScrollOffset() > 0);
        } //End flattened ternary
        float var546ADE640B6EDFBC8A086EF31347E768_1939087319 = getTaintFloat();
        return var546ADE640B6EDFBC8A086EF31347E768_1939087319;
        // ---------- Original Method ----------
        //return computeHorizontalScrollOffset() > 0 ? 1.0f : 0.0f;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.454 -0400", hash_original_method = "1558452CB016696B11D09745F34240BE", hash_generated_method = "6F2D3254CF48D0E908D2FBDA0A0884DB")
    protected float getRightFadingEdgeStrength() {
        {
            boolean var769CCFA152889A66107FC92852AF7E99_1116755949 = (computeHorizontalScrollOffset() + computeHorizontalScrollExtent() <
                computeHorizontalScrollRange());
        } //End flattened ternary
        float var546ADE640B6EDFBC8A086EF31347E768_1274445354 = getTaintFloat();
        return var546ADE640B6EDFBC8A086EF31347E768_1274445354;
        // ---------- Original Method ----------
        //return computeHorizontalScrollOffset() + computeHorizontalScrollExtent() <
                //computeHorizontalScrollRange() ? 1.0f : 0.0f;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.454 -0400", hash_original_method = "4C9FBABF966493498122F359EE4D62B4", hash_generated_method = "FE58BDAA37C4D00A40579ACD14265A4D")
    public boolean isHorizontalScrollBarEnabled() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_566848126 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_566848126;
        // ---------- Original Method ----------
        //return (mViewFlags & SCROLLBARS_HORIZONTAL) == SCROLLBARS_HORIZONTAL;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.454 -0400", hash_original_method = "5F4F07B15655223ADE33A1CCE75F1A0B", hash_generated_method = "3FF6997CB0E3AC1B2EC1353FEB9BE253")
    public void setHorizontalScrollBarEnabled(boolean horizontalScrollBarEnabled) {
        {
            boolean varCE11BC275FFF6C79CD0949C3947FA397_117326185 = (isHorizontalScrollBarEnabled() != horizontalScrollBarEnabled);
            {
                mViewFlags ^= SCROLLBARS_HORIZONTAL;
                computeOpaqueFlags();
                resolvePadding();
            } //End block
        } //End collapsed parenthetic
        addTaint(horizontalScrollBarEnabled);
        // ---------- Original Method ----------
        //if (isHorizontalScrollBarEnabled() != horizontalScrollBarEnabled) {
            //mViewFlags ^= SCROLLBARS_HORIZONTAL;
            //computeOpaqueFlags();
            //resolvePadding();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.455 -0400", hash_original_method = "0838EB3187C4C037AF0DBFBDE06C59DB", hash_generated_method = "3375681E3C5C45FB75E68BC37327EA15")
    public boolean isVerticalScrollBarEnabled() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_655296991 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_655296991;
        // ---------- Original Method ----------
        //return (mViewFlags & SCROLLBARS_VERTICAL) == SCROLLBARS_VERTICAL;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.466 -0400", hash_original_method = "B0D859209D4F0DED05F4B405F254CC50", hash_generated_method = "0AE83AD154C8B4E7C5DD30779C17C567")
    public void setVerticalScrollBarEnabled(boolean verticalScrollBarEnabled) {
        {
            boolean varA8AB3C7A9451600FFE608568BE46B787_1163363875 = (isVerticalScrollBarEnabled() != verticalScrollBarEnabled);
            {
                mViewFlags ^= SCROLLBARS_VERTICAL;
                computeOpaqueFlags();
                resolvePadding();
            } //End block
        } //End collapsed parenthetic
        addTaint(verticalScrollBarEnabled);
        // ---------- Original Method ----------
        //if (isVerticalScrollBarEnabled() != verticalScrollBarEnabled) {
            //mViewFlags ^= SCROLLBARS_VERTICAL;
            //computeOpaqueFlags();
            //resolvePadding();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.466 -0400", hash_original_method = "DC71A98728014C366336C5BC467178FD", hash_generated_method = "796EA4F4D2AC58DE61356F54ACDA4918")
    protected void recomputePadding() {
        setPadding(mUserPaddingLeft, mPaddingTop, mUserPaddingRight, mUserPaddingBottom);
        // ---------- Original Method ----------
        //setPadding(mUserPaddingLeft, mPaddingTop, mUserPaddingRight, mUserPaddingBottom);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.467 -0400", hash_original_method = "2388F31C9368DE1EC14347F689733603", hash_generated_method = "E116B3D9BD00B7D6624A7BF8D3C6B756")
    public void setScrollbarFadingEnabled(boolean fadeScrollbars) {
        initScrollCache();
        ScrollabilityCache scrollabilityCache;
        scrollabilityCache = mScrollCache;
        scrollabilityCache.fadeScrollBars = fadeScrollbars;
        {
            scrollabilityCache.state = ScrollabilityCache.OFF;
        } //End block
        {
            scrollabilityCache.state = ScrollabilityCache.ON;
        } //End block
        addTaint(fadeScrollbars);
        // ---------- Original Method ----------
        //initScrollCache();
        //final ScrollabilityCache scrollabilityCache = mScrollCache;
        //scrollabilityCache.fadeScrollBars = fadeScrollbars;
        //if (fadeScrollbars) {
            //scrollabilityCache.state = ScrollabilityCache.OFF;
        //} else {
            //scrollabilityCache.state = ScrollabilityCache.ON;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.467 -0400", hash_original_method = "95A2058DEEA36EE0618643627EDFFE13", hash_generated_method = "FE9CDC33FA2FB6C96CC37929573210A4")
    public boolean isScrollbarFadingEnabled() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_824597596 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_824597596;
        // ---------- Original Method ----------
        //return mScrollCache != null && mScrollCache.fadeScrollBars;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.468 -0400", hash_original_method = "A645B31717E594F6C2DC0D0454AA457D", hash_generated_method = "D359C933AC2B4F10167F3A26D67F3B86")
    public void setScrollBarStyle(int style) {
        {
            mViewFlags = (mViewFlags & ~SCROLLBARS_STYLE_MASK) | (style & SCROLLBARS_STYLE_MASK);
            computeOpaqueFlags();
            resolvePadding();
        } //End block
        // ---------- Original Method ----------
        //if (style != (mViewFlags & SCROLLBARS_STYLE_MASK)) {
            //mViewFlags = (mViewFlags & ~SCROLLBARS_STYLE_MASK) | (style & SCROLLBARS_STYLE_MASK);
            //computeOpaqueFlags();
            //resolvePadding();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.468 -0400", hash_original_method = "05D4731F6FA79F6CC5101E8AAB13BDF7", hash_generated_method = "88F77FC3BF48973340FAF77831200DA9")
    @ViewDebug.ExportedProperty(mapping = {
            @ViewDebug.IntToString(from = SCROLLBARS_INSIDE_OVERLAY, to = "INSIDE_OVERLAY"),
            @ViewDebug.IntToString(from = SCROLLBARS_INSIDE_INSET, to = "INSIDE_INSET"),
            @ViewDebug.IntToString(from = SCROLLBARS_OUTSIDE_OVERLAY, to = "OUTSIDE_OVERLAY"),
            @ViewDebug.IntToString(from = SCROLLBARS_OUTSIDE_INSET, to = "OUTSIDE_INSET")
    })
    public int getScrollBarStyle() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1031766651 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1031766651;
        // ---------- Original Method ----------
        //return mViewFlags & SCROLLBARS_STYLE_MASK;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.468 -0400", hash_original_method = "70416A9E9D98F77424E9346E007FCC75", hash_generated_method = "0686F328240720736EB09272749730F2")
    protected int computeHorizontalScrollRange() {
        int varF667BBC2F2CB62FFC46148012DBF7327_416703700 = (getWidth());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1008745086 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1008745086;
        // ---------- Original Method ----------
        //return getWidth();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.469 -0400", hash_original_method = "1DA5A8790403B0D1F6BBC5796ED90152", hash_generated_method = "90E8C56789E5F68340FCC9215B9D1B62")
    protected int computeHorizontalScrollOffset() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_750577316 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_750577316;
        // ---------- Original Method ----------
        //return mScrollX;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.469 -0400", hash_original_method = "4D7C9CACEB957F5429D7FE01BD0E831F", hash_generated_method = "FD6872DE9799F2DBE9CB61C83306739E")
    protected int computeHorizontalScrollExtent() {
        int varF667BBC2F2CB62FFC46148012DBF7327_1679551970 = (getWidth());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1855314291 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1855314291;
        // ---------- Original Method ----------
        //return getWidth();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.469 -0400", hash_original_method = "BA8A199276036F5D8FAFD83598D6B62F", hash_generated_method = "41095455E297D5DC1313074966C2F379")
    protected int computeVerticalScrollRange() {
        int var9D46C65F317DA6DFB2EFABEBB82BEC5F_1059079050 = (getHeight());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_675146606 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_675146606;
        // ---------- Original Method ----------
        //return getHeight();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.469 -0400", hash_original_method = "CE20178D0022D78BDA31343037F660C9", hash_generated_method = "4B884AEE64C6039593937EAB45ECE905")
    protected int computeVerticalScrollOffset() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_131425723 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_131425723;
        // ---------- Original Method ----------
        //return mScrollY;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.480 -0400", hash_original_method = "3058943AF0E0D63E8ED42ACDC59A7606", hash_generated_method = "5485FEB03DB1738AAE375B63CC09762A")
    protected int computeVerticalScrollExtent() {
        int var9D46C65F317DA6DFB2EFABEBB82BEC5F_2141894166 = (getHeight());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_608715052 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_608715052;
        // ---------- Original Method ----------
        //return getHeight();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.481 -0400", hash_original_method = "F18C2F0ACE32F9BDC531C26946C884DB", hash_generated_method = "284614469129F9FA87FBE8B204F844E9")
    public boolean canScrollHorizontally(int direction) {
        int offset;
        offset = computeHorizontalScrollOffset();
        int range;
        range = computeHorizontalScrollRange() - computeHorizontalScrollExtent();
        addTaint(direction);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1677518097 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1677518097;
        // ---------- Original Method ----------
        //final int offset = computeHorizontalScrollOffset();
        //final int range = computeHorizontalScrollRange() - computeHorizontalScrollExtent();
        //if (range == 0) return false;
        //if (direction < 0) {
            //return offset > 0;
        //} else {
            //return offset < range - 1;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.482 -0400", hash_original_method = "222CDEC9A5062ECAF96BF1766D04B3AA", hash_generated_method = "C0BDED97828E7CE585F9EBF0D03E8BFA")
    public boolean canScrollVertically(int direction) {
        int offset;
        offset = computeVerticalScrollOffset();
        int range;
        range = computeVerticalScrollRange() - computeVerticalScrollExtent();
        addTaint(direction);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1312167231 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1312167231;
        // ---------- Original Method ----------
        //final int offset = computeVerticalScrollOffset();
        //final int range = computeVerticalScrollRange() - computeVerticalScrollExtent();
        //if (range == 0) return false;
        //if (direction < 0) {
            //return offset > 0;
        //} else {
            //return offset < range - 1;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.484 -0400", hash_original_method = "BC6A073022E6E75A0ACBB97281459E6B", hash_generated_method = "55B7834EBF309C8900DC8A8081E30DB9")
    protected final void onDrawScrollBars(Canvas canvas) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        ScrollabilityCache cache;
        cache = mScrollCache;
        {
            int state;
            state = cache.state;
            boolean invalidate;
            invalidate = false;
            {
                {
                    cache.interpolatorValues = new float[1];
                } //End block
                float[] values;
                values = cache.interpolatorValues;
                {
                    boolean var34F9F3B00BE1502DFF6FE96B14D049B7_1676941044 = (cache.scrollBarInterpolator.timeToValues(values) ==
                        Interpolator.Result.FREEZE_END);
                    {
                        cache.state = ScrollabilityCache.OFF;
                    } //End block
                    {
                        cache.scrollBar.setAlpha(Math.round(values[0]));
                    } //End block
                } //End collapsed parenthetic
                invalidate = true;
            } //End block
            {
                cache.scrollBar.setAlpha(255);
            } //End block
            int viewFlags;
            viewFlags = mViewFlags;
            boolean drawHorizontalScrollBar;
            drawHorizontalScrollBar = (viewFlags & SCROLLBARS_HORIZONTAL) == SCROLLBARS_HORIZONTAL;
            boolean drawVerticalScrollBar;
            drawVerticalScrollBar = (viewFlags & SCROLLBARS_VERTICAL) == SCROLLBARS_VERTICAL
                && !isVerticalScrollBarHidden();
            {
                int width;
                width = mRight - mLeft;
                int height;
                height = mBottom - mTop;
                ScrollBarDrawable scrollBar;
                scrollBar = cache.scrollBar;
                int scrollX;
                scrollX = mScrollX;
                int scrollY;
                scrollY = mScrollY;
                int inside;
                inside = ~0;
                inside = 0;
                int left, top, right, bottom;
                {
                    int size;
                    size = scrollBar.getSize(false);
                    {
                        size = cache.scrollBarSize;
                    } //End block
                    scrollBar.setParameters(computeHorizontalScrollRange(),
                                            computeHorizontalScrollOffset(),
                                            computeHorizontalScrollExtent(), false);
                    int verticalScrollBarGap;
                    verticalScrollBarGap = getVerticalScrollbarWidth();
                    verticalScrollBarGap = 0;
                    top = scrollY + height - size - (mUserPaddingBottom & inside);
                    left = scrollX + (mPaddingLeft & inside);
                    right = scrollX + width - (mUserPaddingRight & inside) - verticalScrollBarGap;
                    bottom = top + size;
                    onDrawHorizontalScrollBar(canvas, scrollBar, left, top, right, bottom);
                    {
                        invalidate(left, top, right, bottom);
                    } //End block
                } //End block
                {
                    int size;
                    size = scrollBar.getSize(true);
                    {
                        size = cache.scrollBarSize;
                    } //End block
                    scrollBar.setParameters(computeVerticalScrollRange(),
                                            computeVerticalScrollOffset(),
                                            computeVerticalScrollExtent(), true);
                    //Begin case default SCROLLBAR_POSITION_DEFAULT SCROLLBAR_POSITION_RIGHT 
                    left = scrollX + width - size - (mUserPaddingRight & inside);
                    //End case default SCROLLBAR_POSITION_DEFAULT SCROLLBAR_POSITION_RIGHT 
                    //Begin case SCROLLBAR_POSITION_LEFT 
                    left = scrollX + (mUserPaddingLeft & inside);
                    //End case SCROLLBAR_POSITION_LEFT 
                    top = scrollY + (mPaddingTop & inside);
                    right = left + size;
                    bottom = scrollY + height - (mUserPaddingBottom & inside);
                    onDrawVerticalScrollBar(canvas, scrollBar, left, top, right, bottom);
                    {
                        invalidate(left, top, right, bottom);
                    } //End block
                } //End block
            } //End block
        } //End block
        addTaint(canvas.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.484 -0400", hash_original_method = "27496C077301642151620030AE06D353", hash_generated_method = "966A3790CB93EA2F37CA3DA4E009E032")
    protected boolean isVerticalScrollBarHidden() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1171471063 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1171471063;
        // ---------- Original Method ----------
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.500 -0400", hash_original_method = "2196C3E195A3664813647CA1F4571C34", hash_generated_method = "07E1C0FFD1A8985E1AF22CBEA90959AD")
    protected void onDrawHorizontalScrollBar(Canvas canvas, Drawable scrollBar,
            int l, int t, int r, int b) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        scrollBar.setBounds(l, t, r, b);
        scrollBar.draw(canvas);
        addTaint(canvas.getTaint());
        addTaint(scrollBar.getTaint());
        addTaint(l);
        addTaint(t);
        addTaint(r);
        addTaint(b);
        // ---------- Original Method ----------
        //scrollBar.setBounds(l, t, r, b);
        //scrollBar.draw(canvas);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.500 -0400", hash_original_method = "4DC59479DF5AED0094F453B5C8C1A8B1", hash_generated_method = "F0D29B608DF77C2213FE35532E3D924D")
    protected void onDrawVerticalScrollBar(Canvas canvas, Drawable scrollBar,
            int l, int t, int r, int b) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        scrollBar.setBounds(l, t, r, b);
        scrollBar.draw(canvas);
        addTaint(canvas.getTaint());
        addTaint(scrollBar.getTaint());
        addTaint(l);
        addTaint(t);
        addTaint(r);
        addTaint(b);
        // ---------- Original Method ----------
        //scrollBar.setBounds(l, t, r, b);
        //scrollBar.draw(canvas);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.500 -0400", hash_original_method = "88C9EEC1EB66ECE8EDFB3E744FAAD32C", hash_generated_method = "8DE2AC8CD08D4DCB5B0CCD9E40E1637E")
    protected void onDraw(Canvas canvas) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(canvas.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.501 -0400", hash_original_method = "B5B7B4C6E477A3DDB1740C53E1D10BEA", hash_generated_method = "EF16987149809AEC71C11FD659B0A8FD")
     void assignParent(ViewParent parent) {
        {
            mParent = parent;
        } //End block
        {
            mParent = null;
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw new RuntimeException("view " + this + " being added, but"
                    + " it already has a parent");
        } //End block
        // ---------- Original Method ----------
        //if (mParent == null) {
            //mParent = parent;
        //} else if (parent == null) {
            //mParent = null;
        //} else {
            //throw new RuntimeException("view " + this + " being added, but"
                    //+ " it already has a parent");
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.502 -0400", hash_original_method = "6BE89DDC01776115240A35D213D194B1", hash_generated_method = "79BBFB6A45500D617F9B5B7A93467A51")
    protected void onAttachedToWindow() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        {
            mParent.requestTransparentRegion(this);
        } //End block
        {
            initialAwakenScrollBars();
            mPrivateFlags &= ~AWAKEN_SCROLL_BARS_ON_ATTACH;
        } //End block
        jumpDrawablesToCurrentState();
        resolveLayoutDirectionIfNeeded();
        resolvePadding();
        resolveTextDirection();
        {
            boolean var1C23F183BE3EEE2A8667855A22865324_438886444 = (isFocused());
            {
                InputMethodManager imm;
                imm = InputMethodManager.peekInstance();
                imm.focusIn(this);
            } //End block
        } //End collapsed parenthetic
        // ---------- Original Method ----------
        //if ((mPrivateFlags & REQUEST_TRANSPARENT_REGIONS) != 0) {
            //mParent.requestTransparentRegion(this);
        //}
        //if ((mPrivateFlags & AWAKEN_SCROLL_BARS_ON_ATTACH) != 0) {
            //initialAwakenScrollBars();
            //mPrivateFlags &= ~AWAKEN_SCROLL_BARS_ON_ATTACH;
        //}
        //jumpDrawablesToCurrentState();
        //resolveLayoutDirectionIfNeeded();
        //resolvePadding();
        //resolveTextDirection();
        //if (isFocused()) {
            //InputMethodManager imm = InputMethodManager.peekInstance();
            //imm.focusIn(this);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.507 -0400", hash_original_method = "6355C1E1C593C70CD9AB72CB2C730A4B", hash_generated_method = "366B711E1C2B0DA2DFC7EECA9834CBE6")
    private void resolveLayoutDirectionIfNeeded() {
        mPrivateFlags2 &= ~LAYOUT_DIRECTION_RESOLVED_RTL;
        resetResolvedTextDirection();
        {
            Object varEB32B57BDD0405313F1A009DC7D6D94F_1215311085 = (getLayoutDirection());
            //Begin case LAYOUT_DIRECTION_INHERIT 
            {
                ViewGroup viewGroup;
                viewGroup = ((ViewGroup) mParent);
                {
                    boolean varD7173ED74EF8FD4D8C167811281857D6_430007946 = (! viewGroup.canResolveLayoutDirection());
                } //End collapsed parenthetic
                {
                    boolean var8E862BF7D39882400271E2867FE65A16_2122463399 = (viewGroup.getResolvedLayoutDirection() == LAYOUT_DIRECTION_RTL);
                    {
                        mPrivateFlags2 |= LAYOUT_DIRECTION_RESOLVED_RTL;
                    } //End block
                } //End collapsed parenthetic
            } //End block
            //End case LAYOUT_DIRECTION_INHERIT 
            //Begin case LAYOUT_DIRECTION_RTL 
            mPrivateFlags2 |= LAYOUT_DIRECTION_RESOLVED_RTL;
            //End case LAYOUT_DIRECTION_RTL 
            //Begin case LAYOUT_DIRECTION_LOCALE 
            {
                boolean var9876FCC9113762996D6F4DE738D751FA_130707486 = (isLayoutDirectionRtl(Locale.getDefault()));
                {
                    mPrivateFlags2 |= LAYOUT_DIRECTION_RESOLVED_RTL;
                } //End block
            } //End collapsed parenthetic
            //End case LAYOUT_DIRECTION_LOCALE 
        } //End collapsed parenthetic
        mPrivateFlags2 |= LAYOUT_DIRECTION_RESOLVED;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.518 -0400", hash_original_method = "9FC12AEA6DFF38CE52A88C8E970B863F", hash_generated_method = "A36CCE520F0395F533791535C90B8FC9")
    protected void resolvePadding() {
        {
            Object varAFC6EB2C684D509A17B3A4EFF5D9CB9D_462336672 = (getResolvedLayoutDirection());
            //Begin case LAYOUT_DIRECTION_RTL 
            {
                mUserPaddingRight = mUserPaddingStart;
            } //End block
            {
                mUserPaddingRight = mPaddingRight;
            } //End block
            //End case LAYOUT_DIRECTION_RTL 
            //Begin case LAYOUT_DIRECTION_RTL 
            {
                mUserPaddingLeft = mUserPaddingEnd;
            } //End block
            {
                mUserPaddingLeft = mPaddingLeft;
            } //End block
            //End case LAYOUT_DIRECTION_RTL 
            //Begin case LAYOUT_DIRECTION_LTR default 
            {
                mUserPaddingLeft = mUserPaddingStart;
            } //End block
            {
                mUserPaddingLeft = mPaddingLeft;
            } //End block
            //End case LAYOUT_DIRECTION_LTR default 
            //Begin case LAYOUT_DIRECTION_LTR default 
            {
                mUserPaddingRight = mUserPaddingEnd;
            } //End block
            {
                mUserPaddingRight = mPaddingRight;
            } //End block
            //End case LAYOUT_DIRECTION_LTR default 
        } //End collapsed parenthetic
        mUserPaddingBottom = (mUserPaddingBottom >= 0) ? mUserPaddingBottom : mPaddingBottom;
        recomputePadding();
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.519 -0400", hash_original_method = "2870C28D9742C58342A5849284011E72", hash_generated_method = "338BE13D6605111100A5D4C0A7543181")
    protected boolean canResolveLayoutDirection() {
        {
            Object varEB32B57BDD0405313F1A009DC7D6D94F_162227827 = (getLayoutDirection());
        } //End collapsed parenthetic
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_862831042 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_862831042;
        // ---------- Original Method ----------
        //switch (getLayoutDirection()) {
            //case LAYOUT_DIRECTION_INHERIT:
                //return (mParent != null);
            //default:
                //return true;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.520 -0400", hash_original_method = "A8A20BDA6F309AE6FE3C70FD4EB76C3B", hash_generated_method = "146E092F23602F5144B45F38ADE2CB14")
    protected void resetResolvedLayoutDirection() {
        mPrivateFlags2 &= ~LAYOUT_DIRECTION_RESOLVED;
        // ---------- Original Method ----------
        //mPrivateFlags2 &= ~LAYOUT_DIRECTION_RESOLVED;
    }

    
        protected static boolean isLayoutDirectionRtl(Locale locale) {
        return (LocaleUtil.TEXT_LAYOUT_DIRECTION_RTL_DO_NOT_USE ==
                LocaleUtil.getLayoutDirectionFromLocale(locale));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.533 -0400", hash_original_method = "C1067653123E460806048F14F4245D8D", hash_generated_method = "82C2297B1CF23C48EAF943AEB85EF44C")
    protected void onDetachedFromWindow() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        mPrivateFlags &= ~CANCEL_NEXT_UP_EVENT;
        removeUnsetPressCallback();
        removeLongPressCallback();
        removePerformClickCallback();
        removeSendViewScrolledAccessibilityEventCallback();
        destroyDrawingCache();
        destroyLayer();
        {
            mDisplayList.invalidate();
        } //End block
        {
            mAttachInfo.mHandler.removeMessages(AttachInfo.INVALIDATE_MSG, this);
        } //End block
        mCurrentAnimation = null;
        resetResolvedLayoutDirection();
        resetResolvedTextDirection();
        // ---------- Original Method ----------
        //mPrivateFlags &= ~CANCEL_NEXT_UP_EVENT;
        //removeUnsetPressCallback();
        //removeLongPressCallback();
        //removePerformClickCallback();
        //removeSendViewScrolledAccessibilityEventCallback();
        //destroyDrawingCache();
        //destroyLayer();
        //if (mDisplayList != null) {
            //mDisplayList.invalidate();
        //}
        //if (mAttachInfo != null) {
            //mAttachInfo.mHandler.removeMessages(AttachInfo.INVALIDATE_MSG, this);
        //}
        //mCurrentAnimation = null;
        //resetResolvedLayoutDirection();
        //resetResolvedTextDirection();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.534 -0400", hash_original_method = "96241ADC2AE65F6434F9D187AAD690E3", hash_generated_method = "FA7AB61CE2029D73D8F788DB92210D64")
    protected int getWindowAttachCount() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_803918167 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_803918167;
        // ---------- Original Method ----------
        //return mWindowAttachCount;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.535 -0400", hash_original_method = "B5E940E178CF821C1ABFCBA8A2963390", hash_generated_method = "1E8111308A841184233B3DE87C96241C")
    public IBinder getWindowToken() {
        IBinder varB4EAC82CA7396A68D541C85D26508E83_842024312 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_842024312 = mAttachInfo != null ? mAttachInfo.mWindowToken : null;
        varB4EAC82CA7396A68D541C85D26508E83_842024312.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_842024312;
        // ---------- Original Method ----------
        //return mAttachInfo != null ? mAttachInfo.mWindowToken : null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.536 -0400", hash_original_method = "2166F0BF16D53373B488A496114897F8", hash_generated_method = "1D8A63453F458C898A9DD8A0B3FCD74F")
    public IBinder getApplicationWindowToken() {
        IBinder varB4EAC82CA7396A68D541C85D26508E83_1583255639 = null; //Variable for return #1
        IBinder varB4EAC82CA7396A68D541C85D26508E83_886885134 = null; //Variable for return #2
        AttachInfo ai;
        ai = mAttachInfo;
        {
            IBinder appWindowToken;
            appWindowToken = ai.mPanelParentWindowToken;
            {
                appWindowToken = ai.mWindowToken;
            } //End block
            varB4EAC82CA7396A68D541C85D26508E83_1583255639 = appWindowToken;
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_886885134 = null;
        IBinder varA7E53CE21691AB073D9660D615818899_1957824351; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1957824351 = varB4EAC82CA7396A68D541C85D26508E83_1583255639;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1957824351 = varB4EAC82CA7396A68D541C85D26508E83_886885134;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1957824351.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1957824351;
        // ---------- Original Method ----------
        //AttachInfo ai = mAttachInfo;
        //if (ai != null) {
            //IBinder appWindowToken = ai.mPanelParentWindowToken;
            //if (appWindowToken == null) {
                //appWindowToken = ai.mWindowToken;
            //}
            //return appWindowToken;
        //}
        //return null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.536 -0400", hash_original_method = "502E0CC6497F900AADF2990690A51539", hash_generated_method = "4447A6ACA7134FFD52D1A919F44C038C")
     IWindowSession getWindowSession() {
        IWindowSession varB4EAC82CA7396A68D541C85D26508E83_19966165 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_19966165 = mAttachInfo != null ? mAttachInfo.mSession : null;
        varB4EAC82CA7396A68D541C85D26508E83_19966165.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_19966165;
        // ---------- Original Method ----------
        //return mAttachInfo != null ? mAttachInfo.mSession : null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:58.823 -0400", hash_original_method = "8BF487FADEB8B54B52A076F5E8F3B4CC", hash_generated_method = "207AF6104F203E5FB9C51EAAA0ADE078")
     void dispatchAttachedToWindow(AttachInfo info, int visibility) {
        mAttachInfo = info;
        mPrivateFlags |= DRAWABLE_STATE_DIRTY;
        {
            info.mTreeObserver.merge(mFloatingTreeObserver);
            mFloatingTreeObserver = null;
        } //End block
        {
            mAttachInfo.mScrollContainers.add(this);
            mPrivateFlags |= SCROLL_CONTAINER_ADDED;
        } //End block
        performCollectViewAttributes(visibility);
        onAttachedToWindow();
        ListenerInfo li;
        li = mListenerInfo;
        CopyOnWriteArrayList<OnAttachStateChangeListener> listeners;
        listeners = li.mOnAttachStateChangeListeners;
        listeners = null;
        {
            boolean varB49AD54BBDCF0D9B63D70B14581FDB17_1350389619 = (listeners != null && listeners.size() > 0);
            {
                {
                    Iterator<OnAttachStateChangeListener> varE0997CFEC81DEDF84B9808E9E6718DCA_1780726090 = (listeners).iterator();
                    varE0997CFEC81DEDF84B9808E9E6718DCA_1780726090.hasNext();
                    OnAttachStateChangeListener listener = varE0997CFEC81DEDF84B9808E9E6718DCA_1780726090.next();
                    {
                        listener.onViewAttachedToWindow(this);
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        int vis;
        vis = info.mWindowVisibility;
        {
            onWindowVisibilityChanged(vis);
        } //End block
        {
            refreshDrawableState();
        } //End block
        addTaint(visibility);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.144 -0400", hash_original_method = "6B0EA8A7D63E280C74DFE6EC34A7421B", hash_generated_method = "245BF45945CA21D5380E5794301AF947")
     void dispatchDetachedFromWindow() {
        AttachInfo info;
        info = mAttachInfo;
        {
            int vis;
            vis = info.mWindowVisibility;
            {
                onWindowVisibilityChanged(GONE);
            } //End block
        } //End block
        onDetachedFromWindow();
        ListenerInfo li;
        li = mListenerInfo;
        CopyOnWriteArrayList<OnAttachStateChangeListener> listeners;
        listeners = li.mOnAttachStateChangeListeners;
        listeners = null;
        {
            boolean varB49AD54BBDCF0D9B63D70B14581FDB17_82386319 = (listeners != null && listeners.size() > 0);
            {
                {
                    Iterator<OnAttachStateChangeListener> varE0997CFEC81DEDF84B9808E9E6718DCA_488441091 = (listeners).iterator();
                    varE0997CFEC81DEDF84B9808E9E6718DCA_488441091.hasNext();
                    OnAttachStateChangeListener listener = varE0997CFEC81DEDF84B9808E9E6718DCA_488441091.next();
                    {
                        listener.onViewDetachedFromWindow(this);
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        {
            mAttachInfo.mScrollContainers.remove(this);
            mPrivateFlags &= ~SCROLL_CONTAINER_ADDED;
        } //End block
        mAttachInfo = null;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.144 -0400", hash_original_method = "DE35B85EA98822B631F87F0518C5E70D", hash_generated_method = "25DF76D1DD427F646D947B9E90F83B45")
    public void saveHierarchyState(SparseArray<Parcelable> container) {
        dispatchSaveInstanceState(container);
        addTaint(container.getTaint());
        // ---------- Original Method ----------
        //dispatchSaveInstanceState(container);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.166 -0400", hash_original_method = "946C013753556BBC605C0B72B86403CC", hash_generated_method = "752C83A765C6E1E071D334FF14F387CB")
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> container) {
        {
            mPrivateFlags &= ~SAVE_STATE_CALLED;
            Parcelable state;
            state = onSaveInstanceState();
            {
                if (DroidSafeAndroidRuntime.control) throw new IllegalStateException(
                        "Derived class did not call super.onSaveInstanceState()");
            } //End block
            {
                container.put(mID, state);
            } //End block
        } //End block
        addTaint(container.getTaint());
        // ---------- Original Method ----------
        //if (mID != NO_ID && (mViewFlags & SAVE_DISABLED_MASK) == 0) {
            //mPrivateFlags &= ~SAVE_STATE_CALLED;
            //Parcelable state = onSaveInstanceState();
            //if ((mPrivateFlags & SAVE_STATE_CALLED) == 0) {
                //throw new IllegalStateException(
                        //"Derived class did not call super.onSaveInstanceState()");
            //}
            //if (state != null) {
                //container.put(mID, state);
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.167 -0400", hash_original_method = "071A0CD98D5CB5717BF4FD06D9363A03", hash_generated_method = "C89F338811D5309ABD834D4FAEFCADAA")
    protected Parcelable onSaveInstanceState() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        Parcelable varB4EAC82CA7396A68D541C85D26508E83_1395517265 = null; //Variable for return #1
        mPrivateFlags |= SAVE_STATE_CALLED;
        varB4EAC82CA7396A68D541C85D26508E83_1395517265 = BaseSavedState.EMPTY_STATE;
        varB4EAC82CA7396A68D541C85D26508E83_1395517265.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1395517265;
        // ---------- Original Method ----------
        //mPrivateFlags |= SAVE_STATE_CALLED;
        //return BaseSavedState.EMPTY_STATE;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.168 -0400", hash_original_method = "6EAC0E9F5E844401043B6CA1D363D57E", hash_generated_method = "ED418AE0D0CD450335FE01A6AD720B3D")
    public void restoreHierarchyState(SparseArray<Parcelable> container) {
        dispatchRestoreInstanceState(container);
        addTaint(container.getTaint());
        // ---------- Original Method ----------
        //dispatchRestoreInstanceState(container);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.169 -0400", hash_original_method = "1E9589C1E01E87FD9C38DCF9C7B7C90F", hash_generated_method = "574000A5B44839ED22DC917C249774CF")
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> container) {
        {
            Parcelable state;
            state = container.get(mID);
            {
                mPrivateFlags &= ~SAVE_STATE_CALLED;
                onRestoreInstanceState(state);
                {
                    if (DroidSafeAndroidRuntime.control) throw new IllegalStateException(
                            "Derived class did not call super.onRestoreInstanceState()");
                } //End block
            } //End block
        } //End block
        addTaint(container.getTaint());
        // ---------- Original Method ----------
        //if (mID != NO_ID) {
            //Parcelable state = container.get(mID);
            //if (state != null) {
                //mPrivateFlags &= ~SAVE_STATE_CALLED;
                //onRestoreInstanceState(state);
                //if ((mPrivateFlags & SAVE_STATE_CALLED) == 0) {
                    //throw new IllegalStateException(
                            //"Derived class did not call super.onRestoreInstanceState()");
                //}
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.170 -0400", hash_original_method = "CCFCBEB3529A8F3F9E941DB1236D802B", hash_generated_method = "E15824D701CB7571D33BBB1CE5800874")
    protected void onRestoreInstanceState(Parcelable state) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        mPrivateFlags |= SAVE_STATE_CALLED;
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Wrong state class, expecting View State but "
                    + "received " + state.getClass().toString() + " instead. This usually happens "
                    + "when two views of different type have the same id in the same hierarchy. "
                    + "This view's id is " + ViewDebug.resolveId(mContext, getId()) + ". Make sure "
                    + "other views do not use the same id.");
        } //End block
        addTaint(state.getTaint());
        // ---------- Original Method ----------
        //mPrivateFlags |= SAVE_STATE_CALLED;
        //if (state != BaseSavedState.EMPTY_STATE && state != null) {
            //throw new IllegalArgumentException("Wrong state class, expecting View State but "
                    //+ "received " + state.getClass().toString() + " instead. This usually happens "
                    //+ "when two views of different type have the same id in the same hierarchy. "
                    //+ "This view's id is " + ViewDebug.resolveId(mContext, getId()) + ". Make sure "
                    //+ "other views do not use the same id.");
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.175 -0400", hash_original_method = "120BB71A812D687D5EF2F0B8F5C8CCD2", hash_generated_method = "643D7299122FBB3E32BD3C5D4BE53F27")
    public long getDrawingTime() {
        long var0F5264038205EDFB1AC05FBB0E8C5E94_1650604572 = getTaintLong();
        return var0F5264038205EDFB1AC05FBB0E8C5E94_1650604572;
        // ---------- Original Method ----------
        //return mAttachInfo != null ? mAttachInfo.mDrawingTime : 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.176 -0400", hash_original_method = "CAE567A7C394D0DF999555076FD0D1ED", hash_generated_method = "4FA1EC564E386560E2AA3D0205DA225B")
    public void setDuplicateParentStateEnabled(boolean enabled) {
        setFlags(enabled ? DUPLICATE_PARENT_STATE : 0, DUPLICATE_PARENT_STATE);
        addTaint(enabled);
        // ---------- Original Method ----------
        //setFlags(enabled ? DUPLICATE_PARENT_STATE : 0, DUPLICATE_PARENT_STATE);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.176 -0400", hash_original_method = "AF26528701A515059D58013186164554", hash_generated_method = "37A7739A1DFE6D286E21DE517309B8B8")
    public boolean isDuplicateParentStateEnabled() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_11866746 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_11866746;
        // ---------- Original Method ----------
        //return (mViewFlags & DUPLICATE_PARENT_STATE) == DUPLICATE_PARENT_STATE;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.189 -0400", hash_original_method = "280CFBA803CA9107455CB03D3F8C277D", hash_generated_method = "49ECA84D66AD4E7A2D500405C15FB346")
    public void setLayerType(int layerType, Paint paint) {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Layer type can only be one of: LAYER_TYPE_NONE, "
                    + "LAYER_TYPE_SOFTWARE or LAYER_TYPE_HARDWARE");
        } //End block
        {
            {
                mLayerPaint = paint == null ? new Paint() : paint;
                invalidateParentCaches();
                invalidate(true);
            } //End block
        } //End block
        //Begin case LAYER_TYPE_HARDWARE 
        destroyLayer();
        //End case LAYER_TYPE_HARDWARE 
        //Begin case LAYER_TYPE_SOFTWARE 
        destroyDrawingCache();
        //End case LAYER_TYPE_SOFTWARE 
        mLayerType = layerType;
        boolean layerDisabled;
        layerDisabled = mLayerType == LAYER_TYPE_NONE;
        mLayerPaint = layerDisabled ? null : (paint == null ? new Paint() : paint);
        mLocalDirtyRect = layerDisabled ? null : new Rect();
        invalidateParentCaches();
        invalidate(true);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.190 -0400", hash_original_method = "E009407DF0C30C68D152BB83BB3493E0", hash_generated_method = "B953C938126D7039F65D74CCDE86E78A")
     boolean hasStaticLayer() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1874072792 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1874072792;
        // ---------- Original Method ----------
        //return mLayerType == LAYER_TYPE_NONE;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.190 -0400", hash_original_method = "10BDECB6A9FC24A5B9656AF2BA9D9819", hash_generated_method = "DD60C4D5609560FF3C2AC2CA658DEDDD")
    public int getLayerType() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_229437166 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_229437166;
        // ---------- Original Method ----------
        //return mLayerType;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.191 -0400", hash_original_method = "FDD83A77B112AC8CB3AC65707C3CB088", hash_generated_method = "60AA3281B98DE373BEBD0801A8EE82C1")
    public void buildLayer() {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalStateException("This view must be attached to a window first");
        } //End block
        //Begin case LAYER_TYPE_HARDWARE 
        {
            boolean var938BC3BB177101C2D5D80B665B48EFE4_1175238375 = (mAttachInfo.mHardwareRenderer != null &&
                        mAttachInfo.mHardwareRenderer.isEnabled() &&
                        mAttachInfo.mHardwareRenderer.validate());
            {
                getHardwareLayer();
            } //End block
        } //End collapsed parenthetic
        //End case LAYER_TYPE_HARDWARE 
        //Begin case LAYER_TYPE_SOFTWARE 
        buildDrawingCache(true);
        //End case LAYER_TYPE_SOFTWARE 
        // ---------- Original Method ----------
        //if (mLayerType == LAYER_TYPE_NONE) return;
        //if (mAttachInfo == null) {
            //throw new IllegalStateException("This view must be attached to a window first");
        //}
        //switch (mLayerType) {
            //case LAYER_TYPE_HARDWARE:
                //if (mAttachInfo.mHardwareRenderer != null &&
                        //mAttachInfo.mHardwareRenderer.isEnabled() &&
                        //mAttachInfo.mHardwareRenderer.validate()) {
                    //getHardwareLayer();
                //}
                //break;
            //case LAYER_TYPE_SOFTWARE:
                //buildDrawingCache(true);
                //break;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.206 -0400", hash_original_method = "1C756BC3105DE982313252676EF7BEA5", hash_generated_method = "03ED9228BD1E1A7A70B14EB24CDED163")
     HardwareLayer getHardwareLayer() {
        HardwareLayer varB4EAC82CA7396A68D541C85D26508E83_1746699083 = null; //Variable for return #1
        HardwareLayer varB4EAC82CA7396A68D541C85D26508E83_831560774 = null; //Variable for return #2
        HardwareLayer varB4EAC82CA7396A68D541C85D26508E83_343231305 = null; //Variable for return #3
        HardwareLayer varB4EAC82CA7396A68D541C85D26508E83_1048768286 = null; //Variable for return #4
        HardwareLayer varB4EAC82CA7396A68D541C85D26508E83_469977631 = null; //Variable for return #5
        {
            boolean var1795335A66B1FC7BB4C3B32BDFD3180D_1701712702 = (mAttachInfo == null || mAttachInfo.mHardwareRenderer == null ||
                !mAttachInfo.mHardwareRenderer.isEnabled());
            {
                varB4EAC82CA7396A68D541C85D26508E83_1746699083 = null;
            } //End block
        } //End collapsed parenthetic
        int width;
        width = mRight - mLeft;
        int height;
        height = mBottom - mTop;
        {
            varB4EAC82CA7396A68D541C85D26508E83_831560774 = null;
        } //End block
        {
            {
                mHardwareLayer = mAttachInfo.mHardwareRenderer.createHardwareLayer(
                        width, height, isOpaque());
                mLocalDirtyRect.setEmpty();
            } //End block
            {
                boolean var5013B1CC39A5DD383313D5E39F51669C_872830657 = (mHardwareLayer.getWidth() != width || mHardwareLayer.getHeight() != height);
                {
                    mHardwareLayer.resize(width, height);
                    mLocalDirtyRect.setEmpty();
                } //End block
            } //End collapsed parenthetic
            {
                boolean var08F8E6CAF5391532E58CACD43013438A_1728959648 = (!mHardwareLayer.isValid());
                {
                    varB4EAC82CA7396A68D541C85D26508E83_343231305 = null;
                } //End block
            } //End collapsed parenthetic
            HardwareCanvas currentCanvas;
            currentCanvas = mAttachInfo.mHardwareCanvas;
            HardwareCanvas canvas;
            canvas = mHardwareLayer.start(currentCanvas);
            {
                mHardwareLayer.end(currentCanvas);
                varB4EAC82CA7396A68D541C85D26508E83_1048768286 = null;
            } //End block
            mAttachInfo.mHardwareCanvas = canvas;
            try 
            {
                canvas.setViewport(width, height);
                canvas.onPreDraw(mLocalDirtyRect);
                mLocalDirtyRect.setEmpty();
                int restoreCount;
                restoreCount = canvas.save();
                computeScroll();
                canvas.translate(-mScrollX, -mScrollY);
                mPrivateFlags |= DRAWN | DRAWING_CACHE_VALID;
                {
                    mPrivateFlags &= ~DIRTY_MASK;
                    dispatchDraw(canvas);
                } //End block
                {
                    draw(canvas);
                } //End block
                canvas.restoreToCount(restoreCount);
            } //End block
            finally 
            {
                canvas.onPostDraw();
                mHardwareLayer.end(currentCanvas);
                mAttachInfo.mHardwareCanvas = currentCanvas;
            } //End block
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_469977631 = mHardwareLayer;
        HardwareLayer varA7E53CE21691AB073D9660D615818899_57931408; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_57931408 = varB4EAC82CA7396A68D541C85D26508E83_1746699083;
                break;
            case 2: //Assign result for return ordinal #2
                varA7E53CE21691AB073D9660D615818899_57931408 = varB4EAC82CA7396A68D541C85D26508E83_831560774;
                break;
            case 3: //Assign result for return ordinal #3
                varA7E53CE21691AB073D9660D615818899_57931408 = varB4EAC82CA7396A68D541C85D26508E83_343231305;
                break;
            case 4: //Assign result for return ordinal #4
                varA7E53CE21691AB073D9660D615818899_57931408 = varB4EAC82CA7396A68D541C85D26508E83_1048768286;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_57931408 = varB4EAC82CA7396A68D541C85D26508E83_469977631;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_57931408.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_57931408;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.217 -0400", hash_original_method = "46CD3F4D955A0CC35E16981FB59107BF", hash_generated_method = "DD740B20507F6F3D98FEF5BC8250D444")
     boolean destroyLayer() {
        {
            mHardwareLayer.destroy();
            mHardwareLayer = null;
            invalidate(true);
            invalidateParentCaches();
        } //End block
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_465057931 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_465057931;
        // ---------- Original Method ----------
        //if (mHardwareLayer != null) {
            //mHardwareLayer.destroy();
            //mHardwareLayer = null;
            //invalidate(true);
            //invalidateParentCaches();
            //return true;
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.219 -0400", hash_original_method = "2A28B7876CAFDC07E0FAFA28070957E8", hash_generated_method = "40E2B8629BC48C8FF763F010A3364CFD")
    protected void destroyHardwareResources() {
        destroyLayer();
        // ---------- Original Method ----------
        //destroyLayer();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.220 -0400", hash_original_method = "8AD6975BC71E736FF7830468F6E8AB45", hash_generated_method = "7F7B67CF162864CE8896D60184B0CEEB")
    public void setDrawingCacheEnabled(boolean enabled) {
        mCachingFailed = false;
        setFlags(enabled ? DRAWING_CACHE_ENABLED : 0, DRAWING_CACHE_ENABLED);
        addTaint(enabled);
        // ---------- Original Method ----------
        //mCachingFailed = false;
        //setFlags(enabled ? DRAWING_CACHE_ENABLED : 0, DRAWING_CACHE_ENABLED);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.220 -0400", hash_original_method = "B123D3E623B7638C240DD8280788F70C", hash_generated_method = "BC13879D579C5013C3E8E0B409B71DC4")
    @ViewDebug.ExportedProperty(category = "drawing")
    public boolean isDrawingCacheEnabled() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_941064781 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_941064781;
        // ---------- Original Method ----------
        //return (mViewFlags & DRAWING_CACHE_ENABLED) == DRAWING_CACHE_ENABLED;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.221 -0400", hash_original_method = "ED3E6074026E0275E7BADCEAD02A1919", hash_generated_method = "A04E9B736E3D6AFE59B7B8BD450C90E1")
    @SuppressWarnings({"UnusedDeclaration"})
    public void outputDirtyFlags(String indent, boolean clear, int clearMask) {
        Log.d("View", indent + this + "             DIRTY(" + (mPrivateFlags & View.DIRTY_MASK) +
                ") DRAWN(" + (mPrivateFlags & DRAWN) + ")" + " CACHE_VALID(" +
                (mPrivateFlags & View.DRAWING_CACHE_VALID) +
                ") INVALIDATED(" + (mPrivateFlags & INVALIDATED) + ")");
        {
            mPrivateFlags &= clearMask;
        } //End block
        {
            ViewGroup parent;
            parent = (ViewGroup) this;
            int count;
            count = parent.getChildCount();
            {
                int i;
                i = 0;
                {
                    View child;
                    child = parent.getChildAt(i);
                    child.outputDirtyFlags(indent + "  ", clear, clearMask);
                } //End block
            } //End collapsed parenthetic
        } //End block
        addTaint(indent.getTaint());
        addTaint(clear);
        // ---------- Original Method ----------
        //Log.d("View", indent + this + "             DIRTY(" + (mPrivateFlags & View.DIRTY_MASK) +
                //") DRAWN(" + (mPrivateFlags & DRAWN) + ")" + " CACHE_VALID(" +
                //(mPrivateFlags & View.DRAWING_CACHE_VALID) +
                //") INVALIDATED(" + (mPrivateFlags & INVALIDATED) + ")");
        //if (clear) {
            //mPrivateFlags &= clearMask;
        //}
        //if (this instanceof ViewGroup) {
            //ViewGroup parent = (ViewGroup) this;
            //final int count = parent.getChildCount();
            //for (int i = 0; i < count; i++) {
                //final View child = parent.getChildAt(i);
                //child.outputDirtyFlags(indent + "  ", clear, clearMask);
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.221 -0400", hash_original_method = "F520ED30BD4141F0E67AE80815EDDC89", hash_generated_method = "7D5447D36AD4507DE6BB8070E0DEAF7B")
    protected void dispatchGetDisplayList() {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.221 -0400", hash_original_method = "AB7D77CF9F94D5BD05F1DB3F0B62C9D0", hash_generated_method = "66B7A65DFBD4EBC2AEC703887124E08D")
    public boolean canHaveDisplayList() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1393130082 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1393130082;
        // ---------- Original Method ----------
        //return !(mAttachInfo == null || mAttachInfo.mHardwareRenderer == null);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.240 -0400", hash_original_method = "A79479675DF460DA0EF507C879CE4B27", hash_generated_method = "4878B7374CE11649BAF4F6375B194243")
    public DisplayList getDisplayList() {
        DisplayList varB4EAC82CA7396A68D541C85D26508E83_1208587882 = null; //Variable for return #1
        DisplayList varB4EAC82CA7396A68D541C85D26508E83_1451017522 = null; //Variable for return #2
        DisplayList varB4EAC82CA7396A68D541C85D26508E83_1690857819 = null; //Variable for return #3
        {
            boolean var1B563759F0FD29B833433E2C0DB5143B_1661052537 = (!canHaveDisplayList());
            {
                varB4EAC82CA7396A68D541C85D26508E83_1208587882 = null;
            } //End block
        } //End collapsed parenthetic
        {
            boolean varCB7B81962DE3C7E60B368CFD3080CE5F_1984001702 = (((mPrivateFlags & DRAWING_CACHE_VALID) == 0 ||
                mDisplayList == null || !mDisplayList.isValid() ||
                mRecreateDisplayList));
            {
                {
                    boolean var7C6A47F38E12A6EB14BB2C741855538D_1739084718 = (mDisplayList != null && mDisplayList.isValid() &&
                    !mRecreateDisplayList);
                    {
                        mPrivateFlags |= DRAWN | DRAWING_CACHE_VALID;
                        mPrivateFlags &= ~DIRTY_MASK;
                        dispatchGetDisplayList();
                        varB4EAC82CA7396A68D541C85D26508E83_1451017522 = mDisplayList;
                    } //End block
                } //End collapsed parenthetic
                mRecreateDisplayList = true;
                {
                    mDisplayList = mAttachInfo.mHardwareRenderer.createDisplayList();
                    invalidateParentCaches();
                } //End block
                HardwareCanvas canvas;
                canvas = mDisplayList.start();
                int restoreCount;
                restoreCount = 0;
                try 
                {
                    int width;
                    width = mRight - mLeft;
                    int height;
                    height = mBottom - mTop;
                    canvas.setViewport(width, height);
                    canvas.onPreDraw(null);
                    computeScroll();
                    restoreCount = canvas.save();
                    canvas.translate(-mScrollX, -mScrollY);
                    mPrivateFlags |= DRAWN | DRAWING_CACHE_VALID;
                    mPrivateFlags &= ~DIRTY_MASK;
                    {
                        dispatchDraw(canvas);
                    } //End block
                    {
                        draw(canvas);
                    } //End block
                } //End block
                finally 
                {
                    canvas.restoreToCount(restoreCount);
                    canvas.onPostDraw();
                    mDisplayList.end();
                } //End block
            } //End block
            {
                mPrivateFlags |= DRAWN | DRAWING_CACHE_VALID;
                mPrivateFlags &= ~DIRTY_MASK;
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_1690857819 = mDisplayList;
        DisplayList varA7E53CE21691AB073D9660D615818899_1133427555; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1133427555 = varB4EAC82CA7396A68D541C85D26508E83_1208587882;
                break;
            case 2: //Assign result for return ordinal #2
                varA7E53CE21691AB073D9660D615818899_1133427555 = varB4EAC82CA7396A68D541C85D26508E83_1451017522;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1133427555 = varB4EAC82CA7396A68D541C85D26508E83_1690857819;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1133427555.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1133427555;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.241 -0400", hash_original_method = "16C485E3429312C7E841D79823374233", hash_generated_method = "16C36171DF0754C0D07682CA48A96008")
    public Bitmap getDrawingCache() {
        Bitmap varB4EAC82CA7396A68D541C85D26508E83_1115654013 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1115654013 = getDrawingCache(false);
        varB4EAC82CA7396A68D541C85D26508E83_1115654013.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1115654013;
        // ---------- Original Method ----------
        //return getDrawingCache(false);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.242 -0400", hash_original_method = "CA92F18E14EB0519BF84A3C226CE3F4A", hash_generated_method = "13D4A3AB2BC63DF3AB72264D19CBCE08")
    public Bitmap getDrawingCache(boolean autoScale) {
        Bitmap varB4EAC82CA7396A68D541C85D26508E83_1769970290 = null; //Variable for return #1
        Bitmap varB4EAC82CA7396A68D541C85D26508E83_2032109416 = null; //Variable for return #2
        {
            varB4EAC82CA7396A68D541C85D26508E83_1769970290 = null;
        } //End block
        {
            buildDrawingCache(autoScale);
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_2032109416 = autoScale ? mDrawingCache : mUnscaledDrawingCache;
        addTaint(autoScale);
        Bitmap varA7E53CE21691AB073D9660D615818899_917453530; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_917453530 = varB4EAC82CA7396A68D541C85D26508E83_1769970290;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_917453530 = varB4EAC82CA7396A68D541C85D26508E83_2032109416;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_917453530.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_917453530;
        // ---------- Original Method ----------
        //if ((mViewFlags & WILL_NOT_CACHE_DRAWING) == WILL_NOT_CACHE_DRAWING) {
            //return null;
        //}
        //if ((mViewFlags & DRAWING_CACHE_ENABLED) == DRAWING_CACHE_ENABLED) {
            //buildDrawingCache(autoScale);
        //}
        //return autoScale ? mDrawingCache : mUnscaledDrawingCache;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.242 -0400", hash_original_method = "0E5E783B90E69DDC86CBB5AF4D60343F", hash_generated_method = "C9706D70B692B74D47204D29B73FA2A9")
    public void destroyDrawingCache() {
        {
            mDrawingCache.recycle();
            mDrawingCache = null;
        } //End block
        {
            mUnscaledDrawingCache.recycle();
            mUnscaledDrawingCache = null;
        } //End block
        // ---------- Original Method ----------
        //if (mDrawingCache != null) {
            //mDrawingCache.recycle();
            //mDrawingCache = null;
        //}
        //if (mUnscaledDrawingCache != null) {
            //mUnscaledDrawingCache.recycle();
            //mUnscaledDrawingCache = null;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.242 -0400", hash_original_method = "2126772517D4D51A0CCD7D5847A54B89", hash_generated_method = "6AB9CA1F59D97FF52C15A4630A0A9C3E")
    public void setDrawingCacheBackgroundColor(int color) {
        {
            mDrawingCacheBackgroundColor = color;
            mPrivateFlags &= ~DRAWING_CACHE_VALID;
        } //End block
        // ---------- Original Method ----------
        //if (color != mDrawingCacheBackgroundColor) {
            //mDrawingCacheBackgroundColor = color;
            //mPrivateFlags &= ~DRAWING_CACHE_VALID;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.243 -0400", hash_original_method = "4BEC5ECE79612E1091BBCBD880B92D6A", hash_generated_method = "264168E30DC135072ED6D05135E20240")
    public int getDrawingCacheBackgroundColor() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1657977991 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1657977991;
        // ---------- Original Method ----------
        //return mDrawingCacheBackgroundColor;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.243 -0400", hash_original_method = "8A1B171D557613DB7E4B9E775A2E64AA", hash_generated_method = "7863622F5BA5FABAB7E5B62D4108044D")
    public void buildDrawingCache() {
        buildDrawingCache(false);
        // ---------- Original Method ----------
        //buildDrawingCache(false);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.249 -0400", hash_original_method = "8AFFFACECE9FE8C2DF57758245D0721D", hash_generated_method = "AB5F683602D96AEB494A8EDAE3130206")
    public void buildDrawingCache(boolean autoScale) {
        {
            mCachingFailed = false;
            {
                ViewDebug.trace(this, ViewDebug.HierarchyTraceType.BUILD_CACHE);
            } //End block
            int width;
            width = mRight - mLeft;
            int height;
            height = mBottom - mTop;
            AttachInfo attachInfo;
            attachInfo = mAttachInfo;
            boolean scalingRequired;
            scalingRequired = attachInfo != null && attachInfo.mScalingRequired;
            {
                width = (int) ((width * attachInfo.mApplicationScale) + 0.5f);
                height = (int) ((height * attachInfo.mApplicationScale) + 0.5f);
            } //End block
            int drawingCacheBackgroundColor;
            drawingCacheBackgroundColor = mDrawingCacheBackgroundColor;
            boolean opaque;
            opaque = drawingCacheBackgroundColor != 0 || isOpaque();
            boolean use32BitCache;
            use32BitCache = attachInfo != null && attachInfo.mUse32BitDrawingCache;
            {
                boolean var555C1BA5A9771D8E1776E57A9469E7A6_131348680 = (width <= 0 || height <= 0 ||
                    (width * height * (opaque && !use32BitCache ? 2 : 4) >
                            ViewConfiguration.get(mContext).getScaledMaximumDrawingCacheSize())); //DSFIXME:  CODE0008: Nested ternary operator in expression
                {
                    destroyDrawingCache();
                    mCachingFailed = true;
                } //End block
            } //End collapsed parenthetic
            boolean clear;
            clear = true;
            Bitmap bitmap;
            bitmap = mDrawingCache;
            bitmap = mUnscaledDrawingCache;
            {
                boolean var112855DB511D640A3CBF7592003CEA59_1719706931 = (bitmap == null || bitmap.getWidth() != width || bitmap.getHeight() != height);
                {
                    Bitmap.Config quality;
                    {
                        //Begin case DRAWING_CACHE_QUALITY_AUTO 
                        quality = Bitmap.Config.ARGB_8888;
                        //End case DRAWING_CACHE_QUALITY_AUTO 
                        //Begin case DRAWING_CACHE_QUALITY_LOW 
                        quality = Bitmap.Config.ARGB_8888;
                        //End case DRAWING_CACHE_QUALITY_LOW 
                        //Begin case DRAWING_CACHE_QUALITY_HIGH 
                        quality = Bitmap.Config.ARGB_8888;
                        //End case DRAWING_CACHE_QUALITY_HIGH 
                        //Begin case default 
                        quality = Bitmap.Config.ARGB_8888;
                        //End case default 
                    } //End block
                    {
                        quality = use32BitCache ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                    } //End block
                    bitmap.recycle();
                    try 
                    {
                        bitmap = Bitmap.createBitmap(width, height, quality);
                        bitmap.setDensity(getResources().getDisplayMetrics().densityDpi);
                        {
                            mDrawingCache = bitmap;
                        } //End block
                        {
                            mUnscaledDrawingCache = bitmap;
                        } //End block
                        bitmap.setHasAlpha(false);
                    } //End block
                    catch (OutOfMemoryError e)
                    {
                        {
                            mDrawingCache = null;
                        } //End block
                        {
                            mUnscaledDrawingCache = null;
                        } //End block
                        mCachingFailed = true;
                    } //End block
                    clear = drawingCacheBackgroundColor != 0;
                } //End block
            } //End collapsed parenthetic
            Canvas canvas;
            {
                canvas = attachInfo.mCanvas;
                {
                    canvas = new Canvas();
                } //End block
                canvas.setBitmap(bitmap);
                attachInfo.mCanvas = null;
            } //End block
            {
                canvas = new Canvas(bitmap);
            } //End block
            {
                bitmap.eraseColor(drawingCacheBackgroundColor);
            } //End block
            computeScroll();
            int restoreCount;
            restoreCount = canvas.save();
            {
                float scale;
                scale = attachInfo.mApplicationScale;
                canvas.scale(scale, scale);
            } //End block
            canvas.translate(-mScrollX, -mScrollY);
            mPrivateFlags |= DRAWN;
            {
                mPrivateFlags |= DRAWING_CACHE_VALID;
            } //End block
            {
                {
                    ViewDebug.trace(this, ViewDebug.HierarchyTraceType.DRAW);
                } //End block
                mPrivateFlags &= ~DIRTY_MASK;
                dispatchDraw(canvas);
            } //End block
            {
                draw(canvas);
            } //End block
            canvas.restoreToCount(restoreCount);
            canvas.setBitmap(null);
            {
                attachInfo.mCanvas = canvas;
            } //End block
        } //End block
        addTaint(autoScale);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.266 -0400", hash_original_method = "9EC32975405209F06A6AEBC988E2ADFA", hash_generated_method = "3949BC28F1D7F808EF656F4B5979AD90")
     Bitmap createSnapshot(Bitmap.Config quality, int backgroundColor, boolean skipChildren) {
        Bitmap varB4EAC82CA7396A68D541C85D26508E83_1434795705 = null; //Variable for return #1
        int width;
        width = mRight - mLeft;
        int height;
        height = mBottom - mTop;
        AttachInfo attachInfo;
        attachInfo = mAttachInfo;
        float scale;
        scale = attachInfo.mApplicationScale;
        scale = 1.0f;
        width = (int) ((width * scale) + 0.5f);
        height = (int) ((height * scale) + 0.5f);
        Bitmap bitmap;
        bitmap = Bitmap.createBitmap(width > 0 ? width : 1, height > 0 ? height : 1, quality);//DSFIXME:  CODE0008: Nested ternary operator in expression
        {
            if (DroidSafeAndroidRuntime.control) throw new OutOfMemoryError();
        } //End block
        Resources resources;
        resources = getResources();
        {
            bitmap.setDensity(resources.getDisplayMetrics().densityDpi);
        } //End block
        Canvas canvas;
        {
            canvas = attachInfo.mCanvas;
            {
                canvas = new Canvas();
            } //End block
            canvas.setBitmap(bitmap);
            attachInfo.mCanvas = null;
        } //End block
        {
            canvas = new Canvas(bitmap);
        } //End block
        {
            bitmap.eraseColor(backgroundColor);
        } //End block
        computeScroll();
        int restoreCount;
        restoreCount = canvas.save();
        canvas.scale(scale, scale);
        canvas.translate(-mScrollX, -mScrollY);
        int flags;
        flags = mPrivateFlags;
        mPrivateFlags &= ~DIRTY_MASK;
        {
            dispatchDraw(canvas);
        } //End block
        {
            draw(canvas);
        } //End block
        mPrivateFlags = flags;
        canvas.restoreToCount(restoreCount);
        canvas.setBitmap(null);
        {
            attachInfo.mCanvas = canvas;
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1434795705 = bitmap;
        addTaint(quality.getTaint());
        addTaint(backgroundColor);
        addTaint(skipChildren);
        varB4EAC82CA7396A68D541C85D26508E83_1434795705.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1434795705;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.286 -0400", hash_original_method = "B880B01C07154F288A73209778F72869", hash_generated_method = "12B37A483D84CD5EE9049EF047307CF4")
    public boolean isInEditMode() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1672734513 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1672734513;
        // ---------- Original Method ----------
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.287 -0400", hash_original_method = "FAE0811CBF87AAE1D612614CB5EBE838", hash_generated_method = "1F9E9D33B12F209DBF4749B8C67E9A7F")
    protected boolean isPaddingOffsetRequired() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_908392966 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_908392966;
        // ---------- Original Method ----------
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.287 -0400", hash_original_method = "4C949B81A8DC7FEE598CF97986A5D947", hash_generated_method = "34308AAC233E4A4F1061EF848E08315C")
    protected int getLeftPaddingOffset() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_155053460 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_155053460;
        // ---------- Original Method ----------
        //return 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.287 -0400", hash_original_method = "074FFDE548FCC46FA1E9A30627AB8A7C", hash_generated_method = "1303F4A3F8FB82CD6F84595E3297251C")
    protected int getRightPaddingOffset() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_534414905 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_534414905;
        // ---------- Original Method ----------
        //return 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.287 -0400", hash_original_method = "A9CEAAEF3075A726E0EAEBF5F9AFAFB2", hash_generated_method = "26B0E8D58821D130A163AF9E6273E2F3")
    protected int getTopPaddingOffset() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1361310975 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1361310975;
        // ---------- Original Method ----------
        //return 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.288 -0400", hash_original_method = "8428DF91FD33A9244C31B60F9D34D200", hash_generated_method = "B75C9F5E7B786CD1282118A9EA8C03EA")
    protected int getBottomPaddingOffset() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1323983531 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1323983531;
        // ---------- Original Method ----------
        //return 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.288 -0400", hash_original_method = "6D1FD6806CEFCA87F4934C6F8CB34AD2", hash_generated_method = "C3F68B4548B63B180CE101CFE5578F64")
    protected int getFadeTop(boolean offsetRequired) {
        int top;
        top = mPaddingTop;
        top += getTopPaddingOffset();
        addTaint(offsetRequired);
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1617320916 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1617320916;
        // ---------- Original Method ----------
        //int top = mPaddingTop;
        //if (offsetRequired) top += getTopPaddingOffset();
        //return top;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.297 -0400", hash_original_method = "9B6486C3AB53B66EA69662D43A443B3A", hash_generated_method = "BFD446F8D9023B7D5283BA677B1992CC")
    protected int getFadeHeight(boolean offsetRequired) {
        int padding;
        padding = mPaddingTop;
        padding += getTopPaddingOffset();
        addTaint(offsetRequired);
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1102550954 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1102550954;
        // ---------- Original Method ----------
        //int padding = mPaddingTop;
        //if (offsetRequired) padding += getTopPaddingOffset();
        //return mBottom - mTop - mPaddingBottom - padding;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.297 -0400", hash_original_method = "E6CC46F2CB7AE1B25C3F8DA9B9857709", hash_generated_method = "A5C47237D184176A20C72E475A3E9EFD")
    public boolean isHardwareAccelerated() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1048734164 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1048734164;
        // ---------- Original Method ----------
        //return mAttachInfo != null && mAttachInfo.mHardwareAccelerated;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.303 -0400", hash_original_method = "788C5C753E694A468D30095348832570", hash_generated_method = "392ADAEB056876AE6335FA73F5198442")
    public void draw(Canvas canvas) {
        {
            ViewDebug.trace(this, ViewDebug.HierarchyTraceType.DRAW);
        } //End block
        int privateFlags;
        privateFlags = mPrivateFlags;
        boolean dirtyOpaque;
        dirtyOpaque = (privateFlags & DIRTY_MASK) == DIRTY_OPAQUE &&
                (mAttachInfo == null || !mAttachInfo.mIgnoreDirtyState);
        mPrivateFlags = (privateFlags & ~DIRTY_MASK) | DRAWN;
        int saveCount;
        {
            Drawable background;
            background = mBGDrawable;
            {
                int scrollX;
                scrollX = mScrollX;
                int scrollY;
                scrollY = mScrollY;
                {
                    background.setBounds(0, 0,  mRight - mLeft, mBottom - mTop);
                    mBackgroundSizeChanged = false;
                } //End block
                {
                    background.draw(canvas);
                } //End block
                {
                    canvas.translate(scrollX, scrollY);
                    background.draw(canvas);
                    canvas.translate(-scrollX, -scrollY);
                } //End block
            } //End block
        } //End block
        int viewFlags;
        viewFlags = mViewFlags;
        boolean horizontalEdges;
        horizontalEdges = (viewFlags & FADING_EDGE_HORIZONTAL) != 0;
        boolean verticalEdges;
        verticalEdges = (viewFlags & FADING_EDGE_VERTICAL) != 0;
        {
            onDraw(canvas);
            dispatchDraw(canvas);
            onDrawScrollBars(canvas);
        } //End block
        boolean drawTop;
        drawTop = false;
        boolean drawBottom;
        drawBottom = false;
        boolean drawLeft;
        drawLeft = false;
        boolean drawRight;
        drawRight = false;
        float topFadeStrength;
        topFadeStrength = 0.0f;
        float bottomFadeStrength;
        bottomFadeStrength = 0.0f;
        float leftFadeStrength;
        leftFadeStrength = 0.0f;
        float rightFadeStrength;
        rightFadeStrength = 0.0f;
        int paddingLeft;
        paddingLeft = mPaddingLeft;
        boolean offsetRequired;
        offsetRequired = isPaddingOffsetRequired();
        {
            paddingLeft += getLeftPaddingOffset();
        } //End block
        int left;
        left = mScrollX + paddingLeft;
        int right;
        right = left + mRight - mLeft - mPaddingRight - paddingLeft;
        int top;
        top = mScrollY + getFadeTop(offsetRequired);
        int bottom;
        bottom = top + getFadeHeight(offsetRequired);
        {
            right += getRightPaddingOffset();
            bottom += getBottomPaddingOffset();
        } //End block
        ScrollabilityCache scrollabilityCache;
        scrollabilityCache = mScrollCache;
        float fadeHeight;
        fadeHeight = scrollabilityCache.fadingEdgeLength;
        int length;
        length = (int) fadeHeight;
        {
            length = (bottom - top) / 2;
        } //End block
        {
            length = (right - left) / 2;
        } //End block
        {
            topFadeStrength = Math.max(0.0f, Math.min(1.0f, getTopFadingEdgeStrength()));
            drawTop = topFadeStrength * fadeHeight > 1.0f;
            bottomFadeStrength = Math.max(0.0f, Math.min(1.0f, getBottomFadingEdgeStrength()));
            drawBottom = bottomFadeStrength * fadeHeight > 1.0f;
        } //End block
        {
            leftFadeStrength = Math.max(0.0f, Math.min(1.0f, getLeftFadingEdgeStrength()));
            drawLeft = leftFadeStrength * fadeHeight > 1.0f;
            rightFadeStrength = Math.max(0.0f, Math.min(1.0f, getRightFadingEdgeStrength()));
            drawRight = rightFadeStrength * fadeHeight > 1.0f;
        } //End block
        saveCount = canvas.getSaveCount();
        int solidColor;
        solidColor = getSolidColor();
        {
            int flags;
            flags = Canvas.HAS_ALPHA_LAYER_SAVE_FLAG;
            {
                canvas.saveLayer(left, top, right, top + length, null, flags);
            } //End block
            {
                canvas.saveLayer(left, bottom - length, right, bottom, null, flags);
            } //End block
            {
                canvas.saveLayer(left, top, left + length, bottom, null, flags);
            } //End block
            {
                canvas.saveLayer(right - length, top, right, bottom, null, flags);
            } //End block
        } //End block
        {
            scrollabilityCache.setFadeColor(solidColor);
        } //End block
        onDraw(canvas);
        dispatchDraw(canvas);
        Paint p;
        p = scrollabilityCache.paint;
        Matrix matrix;
        matrix = scrollabilityCache.matrix;
        Shader fade;
        fade = scrollabilityCache.shader;
        {
            matrix.setScale(1, fadeHeight * topFadeStrength);
            matrix.postTranslate(left, top);
            fade.setLocalMatrix(matrix);
            canvas.drawRect(left, top, right, top + length, p);
        } //End block
        {
            matrix.setScale(1, fadeHeight * bottomFadeStrength);
            matrix.postRotate(180);
            matrix.postTranslate(left, bottom);
            fade.setLocalMatrix(matrix);
            canvas.drawRect(left, bottom - length, right, bottom, p);
        } //End block
        {
            matrix.setScale(1, fadeHeight * leftFadeStrength);
            matrix.postRotate(-90);
            matrix.postTranslate(left, top);
            fade.setLocalMatrix(matrix);
            canvas.drawRect(left, top, left + length, bottom, p);
        } //End block
        {
            matrix.setScale(1, fadeHeight * rightFadeStrength);
            matrix.postRotate(90);
            matrix.postTranslate(right, top);
            fade.setLocalMatrix(matrix);
            canvas.drawRect(right - length, top, right, bottom, p);
        } //End block
        canvas.restoreToCount(saveCount);
        onDrawScrollBars(canvas);
        addTaint(canvas.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.304 -0400", hash_original_method = "6ABCD0F86C11EBC98FE78FD55BB4B1CF", hash_generated_method = "CE59254E25A253EE4A599759926A379D")
    @ViewDebug.ExportedProperty(category = "drawing")
    public int getSolidColor() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1725247095 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1725247095;
        // ---------- Original Method ----------
        //return 0;
    }

    
        private static String printFlags(int flags) {
        String output = "";
        int numFlags = 0;
        if ((flags & FOCUSABLE_MASK) == FOCUSABLE) {
            output += "TAKES_FOCUS";
            numFlags++;
        }
        switch (flags & VISIBILITY_MASK) {
        case INVISIBLE:
            if (numFlags > 0) {
                output += " ";
            }
            output += "INVISIBLE";
            break;
        case GONE:
            if (numFlags > 0) {
                output += " ";
            }
            output += "GONE";
            break;
        default:
            break;
        }
        return output;
    }

    
        private static String printPrivateFlags(int privateFlags) {
        String output = "";
        int numFlags = 0;
        if ((privateFlags & WANTS_FOCUS) == WANTS_FOCUS) {
            output += "WANTS_FOCUS";
            numFlags++;
        }
        if ((privateFlags & FOCUSED) == FOCUSED) {
            if (numFlags > 0) {
                output += " ";
            }
            output += "FOCUSED";
            numFlags++;
        }
        if ((privateFlags & SELECTED) == SELECTED) {
            if (numFlags > 0) {
                output += " ";
            }
            output += "SELECTED";
            numFlags++;
        }
        if ((privateFlags & IS_ROOT_NAMESPACE) == IS_ROOT_NAMESPACE) {
            if (numFlags > 0) {
                output += " ";
            }
            output += "IS_ROOT_NAMESPACE";
            numFlags++;
        }
        if ((privateFlags & HAS_BOUNDS) == HAS_BOUNDS) {
            if (numFlags > 0) {
                output += " ";
            }
            output += "HAS_BOUNDS";
            numFlags++;
        }
        if ((privateFlags & DRAWN) == DRAWN) {
            if (numFlags > 0) {
                output += " ";
            }
            output += "DRAWN";
        }
        return output;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.311 -0400", hash_original_method = "AB08A97FC3701C702D6BD81573091B60", hash_generated_method = "136D2F23250C0456E640F94DBD28044F")
    public boolean isLayoutRequested() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_751776856 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_751776856;
        // ---------- Original Method ----------
        //return (mPrivateFlags & FORCE_LAYOUT) == FORCE_LAYOUT;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.315 -0400", hash_original_method = "288ECB50C55148E98CF66115292FF462", hash_generated_method = "1A005ED5D30740384B7EB160E64084DC")
    @SuppressWarnings({"unchecked"})
    public void layout(int l, int t, int r, int b) {
        int oldL;
        oldL = mLeft;
        int oldT;
        oldT = mTop;
        int oldB;
        oldB = mBottom;
        int oldR;
        oldR = mRight;
        boolean changed;
        changed = setFrame(l, t, r, b);
        {
            {
                ViewDebug.trace(this, ViewDebug.HierarchyTraceType.ON_LAYOUT);
            } //End block
            onLayout(changed, l, t, r, b);
            mPrivateFlags &= ~LAYOUT_REQUIRED;
            ListenerInfo li;
            li = mListenerInfo;
            {
                ArrayList<OnLayoutChangeListener> listenersCopy;
                listenersCopy = (ArrayList<OnLayoutChangeListener>)li.mOnLayoutChangeListeners.clone();
                int numListeners;
                numListeners = listenersCopy.size();
                {
                    int i;
                    i = 0;
                    {
                        listenersCopy.get(i).onLayoutChange(this, l, t, r, b, oldL, oldT, oldR, oldB);
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End block
        mPrivateFlags &= ~FORCE_LAYOUT;
        addTaint(l);
        addTaint(t);
        addTaint(r);
        addTaint(b);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.320 -0400", hash_original_method = "E68A871B23A3BFC32DE9705D7524956B", hash_generated_method = "1B89AD1313654EB103FF1DC413353CED")
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(changed);
        addTaint(left);
        addTaint(top);
        addTaint(right);
        addTaint(bottom);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.324 -0400", hash_original_method = "D0D9CDE5209D8FC4BFA1DB8710882914", hash_generated_method = "A5DFF6DB46D62820E6C1F910A27EE103")
    protected boolean setFrame(int left, int top, int right, int bottom) {
        boolean changed;
        changed = false;
        {
            Log.d("View", this + " View.setFrame(" + left + "," + top + ","
                    + right + "," + bottom + ")");
        } //End block
        {
            changed = true;
            int drawn;
            drawn = mPrivateFlags & DRAWN;
            int oldWidth;
            oldWidth = mRight - mLeft;
            int oldHeight;
            oldHeight = mBottom - mTop;
            int newWidth;
            newWidth = right - left;
            int newHeight;
            newHeight = bottom - top;
            boolean sizeChanged;
            sizeChanged = (newWidth != oldWidth) || (newHeight != oldHeight);
            invalidate(sizeChanged);
            mLeft = left;
            mTop = top;
            mRight = right;
            mBottom = bottom;
            mPrivateFlags |= HAS_BOUNDS;
            {
                {
                    {
                        mTransformationInfo.mMatrixDirty = true;
                    } //End block
                } //End block
                onSizeChanged(newWidth, newHeight, oldWidth, oldHeight);
            } //End block
            {
                mPrivateFlags |= DRAWN;
                invalidate(sizeChanged);
                invalidateParentCaches();
            } //End block
            mPrivateFlags |= drawn;
            mBackgroundSizeChanged = true;
        } //End block
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1268451619 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1268451619;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.329 -0400", hash_original_method = "BECA18BF96D1F48EBBDC02908C938AE4", hash_generated_method = "A5AD1675E772B469DDBDD7D413837A2E")
    protected void onFinishInflate() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.333 -0400", hash_original_method = "9FEC9CB1792EB215E49CBF732B0DBF5B", hash_generated_method = "030273B69ACB76E9827DF4953FCB81C6")
    public Resources getResources() {
        Resources varB4EAC82CA7396A68D541C85D26508E83_17846537 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_17846537 = mResources;
        varB4EAC82CA7396A68D541C85D26508E83_17846537.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_17846537;
        // ---------- Original Method ----------
        //return mResources;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.333 -0400", hash_original_method = "1B5315B2A2E6007B07F436EFC340A168", hash_generated_method = "7A365708FBCD5A6CA5F5521AAB5F64D4")
    public void invalidateDrawable(Drawable drawable) {
        {
            boolean var6429BFA2CE72B3A4B0873DE16CAD3D14_52633778 = (verifyDrawable(drawable));
            {
                Rect dirty;
                dirty = drawable.getBounds();
                int scrollX;
                scrollX = mScrollX;
                int scrollY;
                scrollY = mScrollY;
                invalidate(dirty.left + scrollX, dirty.top + scrollY,
                    dirty.right + scrollX, dirty.bottom + scrollY);
            } //End block
        } //End collapsed parenthetic
        addTaint(drawable.getTaint());
        // ---------- Original Method ----------
        //if (verifyDrawable(drawable)) {
            //final Rect dirty = drawable.getBounds();
            //final int scrollX = mScrollX;
            //final int scrollY = mScrollY;
            //invalidate(dirty.left + scrollX, dirty.top + scrollY,
                    //dirty.right + scrollX, dirty.bottom + scrollY);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.337 -0400", hash_original_method = "8ECDB7E126F9B8C9FE155246E2EA10DA", hash_generated_method = "5B5430EB03F9C02B7E7D360BDF402BA0")
    public void scheduleDrawable(Drawable who, Runnable what, long when) {
        {
            boolean var0BB4EEBD6C8C02FF72C32851AF5ED118_631069986 = (verifyDrawable(who) && what != null);
            {
                {
                    mAttachInfo.mHandler.postAtTime(what, who, when);
                } //End block
                {
                    ViewRootImpl.getRunQueue().postDelayed(what, when - SystemClock.uptimeMillis());
                } //End block
            } //End block
        } //End collapsed parenthetic
        addTaint(who.getTaint());
        addTaint(what.getTaint());
        addTaint(when);
        // ---------- Original Method ----------
        //if (verifyDrawable(who) && what != null) {
            //if (mAttachInfo != null) {
                //mAttachInfo.mHandler.postAtTime(what, who, when);
            //} else {
                //ViewRootImpl.getRunQueue().postDelayed(what, when - SystemClock.uptimeMillis());
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.342 -0400", hash_original_method = "20282D900D1527E5779752DD2D1E3601", hash_generated_method = "28325E47FFC10219FED13ABA99410CA8")
    public void unscheduleDrawable(Drawable who, Runnable what) {
        {
            boolean var0BB4EEBD6C8C02FF72C32851AF5ED118_1586746766 = (verifyDrawable(who) && what != null);
            {
                {
                    mAttachInfo.mHandler.removeCallbacks(what, who);
                } //End block
                {
                    ViewRootImpl.getRunQueue().removeCallbacks(what);
                } //End block
            } //End block
        } //End collapsed parenthetic
        addTaint(who.getTaint());
        addTaint(what.getTaint());
        // ---------- Original Method ----------
        //if (verifyDrawable(who) && what != null) {
            //if (mAttachInfo != null) {
                //mAttachInfo.mHandler.removeCallbacks(what, who);
            //} else {
                //ViewRootImpl.getRunQueue().removeCallbacks(what);
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.346 -0400", hash_original_method = "5631E9137ED00BCDF82AA1F70C739531", hash_generated_method = "4FE7C72FE45902F69318841012997219")
    public void unscheduleDrawable(Drawable who) {
        {
            mAttachInfo.mHandler.removeCallbacksAndMessages(who);
        } //End block
        addTaint(who.getTaint());
        // ---------- Original Method ----------
        //if (mAttachInfo != null) {
            //mAttachInfo.mHandler.removeCallbacksAndMessages(who);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.347 -0400", hash_original_method = "AE0F8179B8268398E41F65FF0C6F4434", hash_generated_method = "34F9F319E2C1C5EFD39891A6154AA693")
    public int getResolvedLayoutDirection(Drawable who) {
        {
            Object varAFC6EB2C684D509A17B3A4EFF5D9CB9D_179415452 = (getResolvedLayoutDirection());
        } //End flattened ternary
        addTaint(who.getTaint());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1275061629 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1275061629;
        // ---------- Original Method ----------
        //return (who == mBGDrawable) ? getResolvedLayoutDirection() : LAYOUT_DIRECTION_DEFAULT;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.347 -0400", hash_original_method = "4F9A094C3230B8AB80716D2738225FBB", hash_generated_method = "789E0E9B845DAD0F204F42F2641F42CB")
    protected boolean verifyDrawable(Drawable who) {
        addTaint(who.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_333833286 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_333833286;
        // ---------- Original Method ----------
        //return who == mBGDrawable;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.348 -0400", hash_original_method = "73C0FB6C39E14C0EF8F5708E9524F27F", hash_generated_method = "AAA54F904BC8360FB603510E25A891F2")
    protected void drawableStateChanged() {
        Drawable d;
        d = mBGDrawable;
        {
            boolean var9E4512E9555DA1255DDDA9AE20837176_2107203242 = (d != null && d.isStateful());
            {
                d.setState(getDrawableState());
            } //End block
        } //End collapsed parenthetic
        // ---------- Original Method ----------
        //Drawable d = mBGDrawable;
        //if (d != null && d.isStateful()) {
            //d.setState(getDrawableState());
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.348 -0400", hash_original_method = "3D0ECB50F3069F68F8A036B0BBF9CAA8", hash_generated_method = "41E30C873BB11DFD438925E1193393D7")
    public void refreshDrawableState() {
        mPrivateFlags |= DRAWABLE_STATE_DIRTY;
        drawableStateChanged();
        ViewParent parent;
        parent = mParent;
        {
            parent.childDrawableStateChanged(this);
        } //End block
        // ---------- Original Method ----------
        //mPrivateFlags |= DRAWABLE_STATE_DIRTY;
        //drawableStateChanged();
        //ViewParent parent = mParent;
        //if (parent != null) {
            //parent.childDrawableStateChanged(this);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.352 -0400", hash_original_method = "7B628D8EF95C580B0BB9FD927C61FF3F", hash_generated_method = "169B91E3235D4D1B7CE02EABE4B62B8B")
    public final int[] getDrawableState() {
        {
            mDrawableState = onCreateDrawableState(0);
            mPrivateFlags &= ~DRAWABLE_STATE_DIRTY;
        } //End block
        int[] varB4CCCA26F9DB9189C32F33E82D425CFB_1535111043 = {getTaintInt()};
        return varB4CCCA26F9DB9189C32F33E82D425CFB_1535111043;
        // ---------- Original Method ----------
        //if ((mDrawableState != null) && ((mPrivateFlags & DRAWABLE_STATE_DIRTY) == 0)) {
            //return mDrawableState;
        //} else {
            //mDrawableState = onCreateDrawableState(0);
            //mPrivateFlags &= ~DRAWABLE_STATE_DIRTY;
            //return mDrawableState;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.358 -0400", hash_original_method = "65DFC58C78CED9A3B9AF9F7EEF9C3470", hash_generated_method = "B3E45B7CB47E63331DF17BFA2544E2A3")
    protected int[] onCreateDrawableState(int extraSpace) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        {
            int[] varCE673B688BFA7856C9D2543AAE971FB2_444794544 = (((View) mParent).onCreateDrawableState(extraSpace));
        } //End block
        int[] drawableState;
        int privateFlags;
        privateFlags = mPrivateFlags;
        int viewStateIndex;
        viewStateIndex = 0;
        viewStateIndex |= VIEW_STATE_PRESSED;
        viewStateIndex |= VIEW_STATE_ENABLED;
        {
            boolean var1C23F183BE3EEE2A8667855A22865324_1254845914 = (isFocused());
            viewStateIndex |= VIEW_STATE_FOCUSED;
        } //End collapsed parenthetic
        viewStateIndex |= VIEW_STATE_SELECTED;
        {
            boolean var34B5A1F13735F7DF66C5DC4570B68E80_443930710 = (hasWindowFocus());
            viewStateIndex |= VIEW_STATE_WINDOW_FOCUSED;
        } //End collapsed parenthetic
        viewStateIndex |= VIEW_STATE_ACTIVATED;
        {
            boolean varFEAE3CEA2D5FFAE7121F7CB82052FEED_77939878 = (mAttachInfo != null && mAttachInfo.mHardwareAccelerationRequested &&
                HardwareRenderer.isAvailable());
            {
                viewStateIndex |= VIEW_STATE_ACCELERATED;
            } //End block
        } //End collapsed parenthetic
        viewStateIndex |= VIEW_STATE_HOVERED;
        int privateFlags2;
        privateFlags2 = mPrivateFlags2;
        viewStateIndex |= VIEW_STATE_DRAG_CAN_ACCEPT;
        viewStateIndex |= VIEW_STATE_DRAG_HOVERED;
        drawableState = VIEW_STATE_SETS[viewStateIndex];
        int[] fullState;
        {
            fullState = new int[drawableState.length + extraSpace];
            System.arraycopy(drawableState, 0, fullState, 0, drawableState.length);
        } //End block
        {
            fullState = new int[extraSpace];
        } //End block
        addTaint(extraSpace);
        int[] varB4CCCA26F9DB9189C32F33E82D425CFB_1568908264 = {getTaintInt()};
        return varB4CCCA26F9DB9189C32F33E82D425CFB_1568908264;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
        protected static int[] mergeDrawableStates(int[] baseState, int[] additionalState) {
        final int N = baseState.length;
        int i = N - 1;
        while (i >= 0 && baseState[i] == 0) {
            i--;
        }
        System.arraycopy(additionalState, 0, baseState, i + 1, additionalState.length);
        return baseState;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.359 -0400", hash_original_method = "9FD34CE508D1EA4936B2EE985D9CB024", hash_generated_method = "737A8B438A0C896E7E589DCB6D2BBB55")
    public void jumpDrawablesToCurrentState() {
        {
            mBGDrawable.jumpToCurrentState();
        } //End block
        // ---------- Original Method ----------
        //if (mBGDrawable != null) {
            //mBGDrawable.jumpToCurrentState();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.365 -0400", hash_original_method = "0F7EB0FE33D439CD82034214A1B516F3", hash_generated_method = "A35D4A4B2F0FC192E8191EAC0AB45D14")
    @RemotableViewMethod
    public void setBackgroundColor(int color) {
        {
            ((ColorDrawable) mBGDrawable).setColor(color);
        } //End block
        {
            setBackgroundDrawable(new ColorDrawable(color));
        } //End block
        addTaint(color);
        // ---------- Original Method ----------
        //if (mBGDrawable instanceof ColorDrawable) {
            //((ColorDrawable) mBGDrawable).setColor(color);
        //} else {
            //setBackgroundDrawable(new ColorDrawable(color));
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.366 -0400", hash_original_method = "009D5DD04F6FB534689B81D1D35D5DCC", hash_generated_method = "77BBD95F55A58AF472C32E1D3E38EFFA")
    @RemotableViewMethod
    public void setBackgroundResource(int resid) {
        Drawable d;
        d = null;
        {
            d = mResources.getDrawable(resid);
        } //End block
        setBackgroundDrawable(d);
        mBackgroundResource = resid;
        // ---------- Original Method ----------
        //if (resid != 0 && resid == mBackgroundResource) {
            //return;
        //}
        //Drawable d= null;
        //if (resid != 0) {
            //d = mResources.getDrawable(resid);
        //}
        //setBackgroundDrawable(d);
        //mBackgroundResource = resid;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.371 -0400", hash_original_method = "925AEEB36C7C1277949151BD876A29D4", hash_generated_method = "AC517BD240770B85B54CDA298D1B40FA")
    public void setBackgroundDrawable(Drawable d) {
        boolean requestLayout;
        requestLayout = false;
        mBackgroundResource = 0;
        {
            mBGDrawable.setCallback(null);
            unscheduleDrawable(mBGDrawable);
        } //End block
        {
            Rect padding;
            padding = sThreadLocal.get();
            {
                padding = new Rect();
                sThreadLocal.set(padding);
            } //End block
            {
                boolean var77F8DEC95ED142E00E9340D4E6309A49_910629813 = (d.getPadding(padding));
                {
                    {
                        Object var539EB19FF2B3A749E138242972103033_888530064 = (d.getResolvedLayoutDirectionSelf());
                        //Begin case LAYOUT_DIRECTION_RTL 
                        setPadding(padding.right, padding.top, padding.left, padding.bottom);
                        //End case LAYOUT_DIRECTION_RTL 
                        //Begin case LAYOUT_DIRECTION_LTR default 
                        setPadding(padding.left, padding.top, padding.right, padding.bottom);
                        //End case LAYOUT_DIRECTION_LTR default 
                    } //End collapsed parenthetic
                } //End block
            } //End collapsed parenthetic
            {
                boolean varD26CE81CD77ABD9AB1A61C65E203B0B1_311214657 = (mBGDrawable == null || mBGDrawable.getMinimumHeight() != d.getMinimumHeight() ||
                    mBGDrawable.getMinimumWidth() != d.getMinimumWidth());
                {
                    requestLayout = true;
                } //End block
            } //End collapsed parenthetic
            d.setCallback(this);
            {
                boolean var732D4E5C808363BC9BF454DD27943961_511754637 = (d.isStateful());
                {
                    d.setState(getDrawableState());
                } //End block
            } //End collapsed parenthetic
            d.setVisible(getVisibility() == VISIBLE, false);
            mBGDrawable = d;
            {
                mPrivateFlags &= ~SKIP_DRAW;
                mPrivateFlags |= ONLY_DRAWS_BACKGROUND;
                requestLayout = true;
            } //End block
        } //End block
        {
            mBGDrawable = null;
            {
                mPrivateFlags &= ~ONLY_DRAWS_BACKGROUND;
                mPrivateFlags |= SKIP_DRAW;
            } //End block
            requestLayout = true;
        } //End block
        computeOpaqueFlags();
        {
            requestLayout();
        } //End block
        mBackgroundSizeChanged = true;
        invalidate(true);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.372 -0400", hash_original_method = "80971671F36DCDE8D8060A8575F1E0DF", hash_generated_method = "D88301487A99A04BEE8355E19E8977EA")
    public Drawable getBackground() {
        Drawable varB4EAC82CA7396A68D541C85D26508E83_726269636 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_726269636 = mBGDrawable;
        varB4EAC82CA7396A68D541C85D26508E83_726269636.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_726269636;
        // ---------- Original Method ----------
        //return mBGDrawable;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.379 -0400", hash_original_method = "518320784120938CAC15B0472A139DBB", hash_generated_method = "7B3B9720FF05B0E9688FAFDC24002E15")
    public void setPadding(int left, int top, int right, int bottom) {
        boolean changed;
        changed = false;
        mUserPaddingRelative = false;
        mUserPaddingLeft = left;
        mUserPaddingRight = right;
        mUserPaddingBottom = bottom;
        int viewFlags;
        viewFlags = mViewFlags;
        {
            {
                int offset;
                offset = 0;
                offset = getVerticalScrollbarWidth();
                //Begin case SCROLLBAR_POSITION_DEFAULT 
                {
                    boolean varDD88345AFC6B206805F2994C7FB7F6F7_1643994246 = (getResolvedLayoutDirection() == LAYOUT_DIRECTION_RTL);
                    {
                        left += offset;
                    } //End block
                    {
                        right += offset;
                    } //End block
                } //End collapsed parenthetic
                //End case SCROLLBAR_POSITION_DEFAULT 
                //Begin case SCROLLBAR_POSITION_RIGHT 
                right += offset;
                //End case SCROLLBAR_POSITION_RIGHT 
                //Begin case SCROLLBAR_POSITION_LEFT 
                left += offset;
                //End case SCROLLBAR_POSITION_LEFT 
            } //End block
            {
                bottom += (viewFlags & SCROLLBARS_INSET_MASK) == 0
                        ? 0 : getHorizontalScrollbarHeight();
            } //End block
        } //End block
        {
            changed = true;
            mPaddingLeft = left;
        } //End block
        {
            changed = true;
            mPaddingTop = top;
        } //End block
        {
            changed = true;
            mPaddingRight = right;
        } //End block
        {
            changed = true;
            mPaddingBottom = bottom;
        } //End block
        {
            requestLayout();
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.386 -0400", hash_original_method = "F50D0F04B3AF13DC9F9192544EA8BA6E", hash_generated_method = "C88CB3014DB83D5C1CDC1BEDA81708F0")
    public void setPaddingRelative(int start, int top, int end, int bottom) {
        mUserPaddingRelative = true;
        mUserPaddingStart = start;
        mUserPaddingEnd = end;
        {
            Object varAFC6EB2C684D509A17B3A4EFF5D9CB9D_1092194300 = (getResolvedLayoutDirection());
            //Begin case LAYOUT_DIRECTION_RTL 
            setPadding(end, top, start, bottom);
            //End case LAYOUT_DIRECTION_RTL 
            //Begin case LAYOUT_DIRECTION_LTR default 
            setPadding(start, top, end, bottom);
            //End case LAYOUT_DIRECTION_LTR default 
        } //End collapsed parenthetic
        addTaint(top);
        addTaint(bottom);
        // ---------- Original Method ----------
        //mUserPaddingRelative = true;
        //mUserPaddingStart = start;
        //mUserPaddingEnd = end;
        //switch(getResolvedLayoutDirection()) {
            //case LAYOUT_DIRECTION_RTL:
                //setPadding(end, top, start, bottom);
                //break;
            //case LAYOUT_DIRECTION_LTR:
            //default:
                //setPadding(start, top, end, bottom);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.392 -0400", hash_original_method = "71BE64DF9CA1E548604AD18ADE3DFBDD", hash_generated_method = "9C7CB69E07011BB120B767BD169EFC28")
    public int getPaddingTop() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1113338138 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1113338138;
        // ---------- Original Method ----------
        //return mPaddingTop;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.394 -0400", hash_original_method = "472EE1BBE725DA831283E7FA94BE4536", hash_generated_method = "564D98B0A72D88074EB6E2A465A0A20F")
    public int getPaddingBottom() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1179108393 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1179108393;
        // ---------- Original Method ----------
        //return mPaddingBottom;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.394 -0400", hash_original_method = "F854F7F8F07B4C3AC7B7FE5B9B528BAE", hash_generated_method = "3436FF1A0B2E58D124EC9FDA1442F784")
    public int getPaddingLeft() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1797593609 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1797593609;
        // ---------- Original Method ----------
        //return mPaddingLeft;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.400 -0400", hash_original_method = "78A5E196850432C8DD415DC0673D2C8F", hash_generated_method = "A08C4E429D6D1F9ECE45DDB48524AF1E")
    public int getPaddingStart() {
        {
            boolean varCF77AC373D50E68CC74CEB17E0D05088_1407549309 = ((getResolvedLayoutDirection() == LAYOUT_DIRECTION_RTL));
        } //End flattened ternary
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1150446966 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1150446966;
        // ---------- Original Method ----------
        //return (getResolvedLayoutDirection() == LAYOUT_DIRECTION_RTL) ?
                //mPaddingRight : mPaddingLeft;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.401 -0400", hash_original_method = "6AC4AEB4D1AD621C23B7EB8B08E4182E", hash_generated_method = "0D9D2C2314D4998774A13E78D97E84F2")
    public int getPaddingRight() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_514852238 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_514852238;
        // ---------- Original Method ----------
        //return mPaddingRight;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.401 -0400", hash_original_method = "EE58EF7C85312E1C063201AE8CA23F8D", hash_generated_method = "305E48F9F363BF86ACC5E60BCDADD991")
    public int getPaddingEnd() {
        {
            boolean varCF77AC373D50E68CC74CEB17E0D05088_634935083 = ((getResolvedLayoutDirection() == LAYOUT_DIRECTION_RTL));
        } //End flattened ternary
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_65850058 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_65850058;
        // ---------- Original Method ----------
        //return (getResolvedLayoutDirection() == LAYOUT_DIRECTION_RTL) ?
                //mPaddingLeft : mPaddingRight;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.406 -0400", hash_original_method = "84D71EDE4F7EF14E19771B4AB735B283", hash_generated_method = "6DFC2D09835729D06CA9C0A8765B50D5")
    public boolean isPaddingRelative() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_81322311 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_81322311;
        // ---------- Original Method ----------
        //return mUserPaddingRelative;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.408 -0400", hash_original_method = "91676949986DAC4CFDCFD2A3FAD3A69B", hash_generated_method = "2AD1BA286B2A767741E035B42D243C92")
    public void setSelected(boolean selected) {
        {
            mPrivateFlags = (mPrivateFlags & ~SELECTED) | (selected ? SELECTED : 0);
            resetPressedState();
            invalidate(true);
            refreshDrawableState();
            dispatchSetSelected(selected);
        } //End block
        // ---------- Original Method ----------
        //if (((mPrivateFlags & SELECTED) != 0) != selected) {
            //mPrivateFlags = (mPrivateFlags & ~SELECTED) | (selected ? SELECTED : 0);
            //if (!selected) resetPressedState();
            //invalidate(true);
            //refreshDrawableState();
            //dispatchSetSelected(selected);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.409 -0400", hash_original_method = "64CD219059FB9E526665FE8867E1D4B8", hash_generated_method = "D0F40E63E0975CE8FE5A4FA8E00A2A22")
    protected void dispatchSetSelected(boolean selected) {
        addTaint(selected);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.409 -0400", hash_original_method = "48002052E4D321A2B2BAD55BEF8E0A66", hash_generated_method = "3C02D5E4B5D57FB13AB3242A3E527AA3")
    @ViewDebug.ExportedProperty
    public boolean isSelected() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1869162727 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1869162727;
        // ---------- Original Method ----------
        //return (mPrivateFlags & SELECTED) != 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.415 -0400", hash_original_method = "449C65D8ABD541EEF5AF1DFBC99BE952", hash_generated_method = "49E234D147E234DC90F8558D403E6854")
    public void setActivated(boolean activated) {
        {
            mPrivateFlags = (mPrivateFlags & ~ACTIVATED) | (activated ? ACTIVATED : 0);
            invalidate(true);
            refreshDrawableState();
            dispatchSetActivated(activated);
        } //End block
        // ---------- Original Method ----------
        //if (((mPrivateFlags & ACTIVATED) != 0) != activated) {
            //mPrivateFlags = (mPrivateFlags & ~ACTIVATED) | (activated ? ACTIVATED : 0);
            //invalidate(true);
            //refreshDrawableState();
            //dispatchSetActivated(activated);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.420 -0400", hash_original_method = "857B49EDB2F7375261DD6F1ED2F34094", hash_generated_method = "51446F3DB68DBD70CEFE789714FC4FCB")
    protected void dispatchSetActivated(boolean activated) {
        addTaint(activated);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.420 -0400", hash_original_method = "807E5BA633430E7244B8D5311A7423DE", hash_generated_method = "D94650184D944581D7B11B7D8B704C6D")
    @ViewDebug.ExportedProperty
    public boolean isActivated() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1204215726 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1204215726;
        // ---------- Original Method ----------
        //return (mPrivateFlags & ACTIVATED) != 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.425 -0400", hash_original_method = "99F6A92222C13DFFEF0BA3B363A5F1C1", hash_generated_method = "3D509D5EF2F4D8E9BB5C2DD10A5E5CC1")
    public ViewTreeObserver getViewTreeObserver() {
        ViewTreeObserver varB4EAC82CA7396A68D541C85D26508E83_432788447 = null; //Variable for return #1
        ViewTreeObserver varB4EAC82CA7396A68D541C85D26508E83_145130924 = null; //Variable for return #2
        {
            varB4EAC82CA7396A68D541C85D26508E83_432788447 = mAttachInfo.mTreeObserver;
        } //End block
        {
            mFloatingTreeObserver = new ViewTreeObserver();
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_145130924 = mFloatingTreeObserver;
        ViewTreeObserver varA7E53CE21691AB073D9660D615818899_276637422; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_276637422 = varB4EAC82CA7396A68D541C85D26508E83_432788447;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_276637422 = varB4EAC82CA7396A68D541C85D26508E83_145130924;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_276637422.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_276637422;
        // ---------- Original Method ----------
        //if (mAttachInfo != null) {
            //return mAttachInfo.mTreeObserver;
        //}
        //if (mFloatingTreeObserver == null) {
            //mFloatingTreeObserver = new ViewTreeObserver();
        //}
        //return mFloatingTreeObserver;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.426 -0400", hash_original_method = "399BB6B1CB98987E45F7FD1BEC4104A8", hash_generated_method = "692CAC26133312436C416299B99ACA8F")
    public View getRootView() {
        View varB4EAC82CA7396A68D541C85D26508E83_1345644095 = null; //Variable for return #1
        View varB4EAC82CA7396A68D541C85D26508E83_230473569 = null; //Variable for return #2
        {
            View v;
            v = mAttachInfo.mRootView;
            {
                varB4EAC82CA7396A68D541C85D26508E83_1345644095 = v;
            } //End block
        } //End block
        View parent;
        parent = this;
        {
            parent = (View) parent.mParent;
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_230473569 = parent;
        View varA7E53CE21691AB073D9660D615818899_331274560; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_331274560 = varB4EAC82CA7396A68D541C85D26508E83_1345644095;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_331274560 = varB4EAC82CA7396A68D541C85D26508E83_230473569;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_331274560.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_331274560;
        // ---------- Original Method ----------
        //if (mAttachInfo != null) {
            //final View v = mAttachInfo.mRootView;
            //if (v != null) {
                //return v;
            //}
        //}
        //View parent = this;
        //while (parent.mParent != null && parent.mParent instanceof View) {
            //parent = (View) parent.mParent;
        //}
        //return parent;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.427 -0400", hash_original_method = "6E1F3A14CB89D70C54E776D2215F970D", hash_generated_method = "B30B93EEC7B014500AE676C3D4FEBDEE")
    public void getLocationOnScreen(int[] location) {
        getLocationInWindow(location);
        AttachInfo info;
        info = mAttachInfo;
        {
            location[0] += info.mWindowLeft;
            location[1] += info.mWindowTop;
        } //End block
        addTaint(location[0]);
        // ---------- Original Method ----------
        //getLocationInWindow(location);
        //final AttachInfo info = mAttachInfo;
        //if (info != null) {
            //location[0] += info.mWindowLeft;
            //location[1] += info.mWindowTop;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.430 -0400", hash_original_method = "D5745CE4077A3F8C966A99FAE28757B4", hash_generated_method = "4DB5E636B7310861213091362378C6A4")
    public void getLocationInWindow(int[] location) {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("location must be an array of two integers");
        } //End block
        float[] position;
        position = mAttachInfo.mTmpTransformLocation;
        position[0] = position[1] = 0.0f;
        {
            boolean var72C5EB038B47497B7FA123412E9ED288_945007081 = (!hasIdentityMatrix());
            {
                getMatrix().mapPoints(position);
            } //End block
        } //End collapsed parenthetic
        position[0] += mLeft;
        position[1] += mTop;
        ViewParent viewParent;
        viewParent = mParent;
        {
            View view;
            view = (View) viewParent;
            position[0] -= view.mScrollX;
            position[1] -= view.mScrollY;
            {
                boolean varA98FC0C227FABB5530C6DB9897E9E044_83770733 = (!view.hasIdentityMatrix());
                {
                    view.getMatrix().mapPoints(position);
                } //End block
            } //End collapsed parenthetic
            position[0] += view.mLeft;
            position[1] += view.mTop;
            viewParent = view.mParent;
        } //End block
        {
            ViewRootImpl vr;
            vr = (ViewRootImpl) viewParent;
            position[1] -= vr.mCurScrollY;
        } //End block
        location[0] = (int) (position[0] + 0.5f);
        location[1] = (int) (position[1] + 0.5f);
        addTaint(location[0]);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.431 -0400", hash_original_method = "0641E50E124E0C6CE4C02F73E2175BDE", hash_generated_method = "43E94379CA2289D0FAC62767A4AF129F")
    protected View findViewTraversal(int id) {
        View varB4EAC82CA7396A68D541C85D26508E83_302569878 = null; //Variable for return #1
        View varB4EAC82CA7396A68D541C85D26508E83_1486649324 = null; //Variable for return #2
        {
            varB4EAC82CA7396A68D541C85D26508E83_302569878 = this;
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1486649324 = null;
        addTaint(id);
        View varA7E53CE21691AB073D9660D615818899_329653374; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_329653374 = varB4EAC82CA7396A68D541C85D26508E83_302569878;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_329653374 = varB4EAC82CA7396A68D541C85D26508E83_1486649324;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_329653374.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_329653374;
        // ---------- Original Method ----------
        //if (id == mID) {
            //return this;
        //}
        //return null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.439 -0400", hash_original_method = "B50CD4B4D228C210BD89E9DF598807C7", hash_generated_method = "A09A4B40C8BE9A3BBB631DCAFD99D532")
    protected View findViewWithTagTraversal(Object tag) {
        View varB4EAC82CA7396A68D541C85D26508E83_177244404 = null; //Variable for return #1
        View varB4EAC82CA7396A68D541C85D26508E83_1452593539 = null; //Variable for return #2
        {
            boolean var400CEDD09F5544D49C9E372D9C42B91E_81547782 = (tag != null && tag.equals(mTag));
            {
                varB4EAC82CA7396A68D541C85D26508E83_177244404 = this;
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_1452593539 = null;
        addTaint(tag.getTaint());
        View varA7E53CE21691AB073D9660D615818899_2131729589; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_2131729589 = varB4EAC82CA7396A68D541C85D26508E83_177244404;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_2131729589 = varB4EAC82CA7396A68D541C85D26508E83_1452593539;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_2131729589.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_2131729589;
        // ---------- Original Method ----------
        //if (tag != null && tag.equals(mTag)) {
            //return this;
        //}
        //return null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.440 -0400", hash_original_method = "65DA32C16954A521B825F7D31B571CEF", hash_generated_method = "50B80257B7D899CA00FBCFC019C1B6DA")
    protected View findViewByPredicateTraversal(Predicate<View> predicate, View childToSkip) {
        View varB4EAC82CA7396A68D541C85D26508E83_730808065 = null; //Variable for return #1
        View varB4EAC82CA7396A68D541C85D26508E83_1841132416 = null; //Variable for return #2
        {
            boolean var9DB3C1E357F4608DF2A7064AE311774F_1347532481 = (predicate.apply(this));
            {
                varB4EAC82CA7396A68D541C85D26508E83_730808065 = this;
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_1841132416 = null;
        addTaint(predicate.getTaint());
        addTaint(childToSkip.getTaint());
        View varA7E53CE21691AB073D9660D615818899_2096745593; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_2096745593 = varB4EAC82CA7396A68D541C85D26508E83_730808065;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_2096745593 = varB4EAC82CA7396A68D541C85D26508E83_1841132416;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_2096745593.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_2096745593;
        // ---------- Original Method ----------
        //if (predicate.apply(this)) {
            //return this;
        //}
        //return null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.440 -0400", hash_original_method = "C8E06C0ED5E3D035BF7CE8B77FB6FB02", hash_generated_method = "28F6E7F7EE197925D23CD4D28C29AE43")
    public final View findViewById(int id) {
        View varB4EAC82CA7396A68D541C85D26508E83_660244740 = null; //Variable for return #1
        View varB4EAC82CA7396A68D541C85D26508E83_673886257 = null; //Variable for return #2
        {
            varB4EAC82CA7396A68D541C85D26508E83_660244740 = null;
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_673886257 = findViewTraversal(id);
        addTaint(id);
        View varA7E53CE21691AB073D9660D615818899_2143125998; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_2143125998 = varB4EAC82CA7396A68D541C85D26508E83_660244740;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_2143125998 = varB4EAC82CA7396A68D541C85D26508E83_673886257;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_2143125998.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_2143125998;
        // ---------- Original Method ----------
        //if (id < 0) {
            //return null;
        //}
        //return findViewTraversal(id);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.451 -0400", hash_original_method = "DAB2723BE4C5F25FDBDAA56D4A941A95", hash_generated_method = "8046F822CB82D8602BD4B4FFD0572EF0")
    final View findViewByAccessibilityId(int accessibilityId) {
        View varB4EAC82CA7396A68D541C85D26508E83_1686608642 = null; //Variable for return #1
        View varB4EAC82CA7396A68D541C85D26508E83_609145934 = null; //Variable for return #2
        {
            varB4EAC82CA7396A68D541C85D26508E83_1686608642 = null;
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_609145934 = findViewByAccessibilityIdTraversal(accessibilityId);
        addTaint(accessibilityId);
        View varA7E53CE21691AB073D9660D615818899_110279444; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_110279444 = varB4EAC82CA7396A68D541C85D26508E83_1686608642;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_110279444 = varB4EAC82CA7396A68D541C85D26508E83_609145934;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_110279444.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_110279444;
        // ---------- Original Method ----------
        //if (accessibilityId < 0) {
            //return null;
        //}
        //return findViewByAccessibilityIdTraversal(accessibilityId);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.458 -0400", hash_original_method = "0033D4DC027C6D84BC9CA79DB06FA7C7", hash_generated_method = "B857023A87D47C56FBB7E37E2A0810DA")
     View findViewByAccessibilityIdTraversal(int accessibilityId) {
        View varB4EAC82CA7396A68D541C85D26508E83_1666464103 = null; //Variable for return #1
        View varB4EAC82CA7396A68D541C85D26508E83_741569950 = null; //Variable for return #2
        {
            boolean varA0F894C9F7ECB9E8C9290E6F95BA5394_2056702299 = (getAccessibilityViewId() == accessibilityId);
            {
                varB4EAC82CA7396A68D541C85D26508E83_1666464103 = this;
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_741569950 = null;
        addTaint(accessibilityId);
        View varA7E53CE21691AB073D9660D615818899_877986060; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_877986060 = varB4EAC82CA7396A68D541C85D26508E83_1666464103;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_877986060 = varB4EAC82CA7396A68D541C85D26508E83_741569950;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_877986060.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_877986060;
        // ---------- Original Method ----------
        //if (getAccessibilityViewId() == accessibilityId) {
            //return this;
        //}
        //return null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.459 -0400", hash_original_method = "DB0D3478EC5FC406F90807706EB086DC", hash_generated_method = "5BEE381CA9893E9473FFC6D48F23D5B3")
    public final View findViewWithTag(Object tag) {
        View varB4EAC82CA7396A68D541C85D26508E83_1115398533 = null; //Variable for return #1
        View varB4EAC82CA7396A68D541C85D26508E83_2132133892 = null; //Variable for return #2
        {
            varB4EAC82CA7396A68D541C85D26508E83_1115398533 = null;
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_2132133892 = findViewWithTagTraversal(tag);
        addTaint(tag.getTaint());
        View varA7E53CE21691AB073D9660D615818899_880692322; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_880692322 = varB4EAC82CA7396A68D541C85D26508E83_1115398533;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_880692322 = varB4EAC82CA7396A68D541C85D26508E83_2132133892;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_880692322.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_880692322;
        // ---------- Original Method ----------
        //if (tag == null) {
            //return null;
        //}
        //return findViewWithTagTraversal(tag);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.468 -0400", hash_original_method = "1599799F36C9F7803A0B97DCCA829DED", hash_generated_method = "47CC7CDF6C2ED7144EFED9211190641F")
    public final View findViewByPredicate(Predicate<View> predicate) {
        View varB4EAC82CA7396A68D541C85D26508E83_1724269458 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1724269458 = findViewByPredicateTraversal(predicate, null);
        addTaint(predicate.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1724269458.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1724269458;
        // ---------- Original Method ----------
        //return findViewByPredicateTraversal(predicate, null);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.479 -0400", hash_original_method = "485BA369E24687F2D5FF0693ABF816B2", hash_generated_method = "0BF5EED14E9898D0DBCF9DDCC49B9F1A")
    public final View findViewByPredicateInsideOut(View start, Predicate<View> predicate) {
        View varB4EAC82CA7396A68D541C85D26508E83_1270117564 = null; //Variable for return #1
        View varB4EAC82CA7396A68D541C85D26508E83_2094687380 = null; //Variable for return #2
        View childToSkip;
        childToSkip = null;
        {
            View view;
            view = start.findViewByPredicateTraversal(predicate, childToSkip);
            {
                boolean var7558536A6954E6545716F82725118232_341119351 = (view != null || start == this);
                {
                    varB4EAC82CA7396A68D541C85D26508E83_1270117564 = view;
                } //End block
            } //End collapsed parenthetic
            ViewParent parent;
            parent = start.getParent();
            {
                varB4EAC82CA7396A68D541C85D26508E83_2094687380 = null;
            } //End block
            childToSkip = start;
            start = (View) parent;
        } //End block
        addTaint(start.getTaint());
        addTaint(predicate.getTaint());
        View varA7E53CE21691AB073D9660D615818899_138450570; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_138450570 = varB4EAC82CA7396A68D541C85D26508E83_1270117564;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_138450570 = varB4EAC82CA7396A68D541C85D26508E83_2094687380;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_138450570.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_138450570;
        // ---------- Original Method ----------
        //View childToSkip = null;
        //for (;;) {
            //View view = start.findViewByPredicateTraversal(predicate, childToSkip);
            //if (view != null || start == this) {
                //return view;
            //}
            //ViewParent parent = start.getParent();
            //if (parent == null || !(parent instanceof View)) {
                //return null;
            //}
            //childToSkip = start;
            //start = (View) parent;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.480 -0400", hash_original_method = "125195EB8F3EB02BBD72A4003F2E03BD", hash_generated_method = "491B6D8B484C16297DCBDA4E3A5ECCE1")
    public void setId(int id) {
        mID = id;
        // ---------- Original Method ----------
        //mID = id;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.581 -0400", hash_original_method = "B06467135FDA3C6D538127B3AC355349", hash_generated_method = "E3039F9ACF302E27C0A590FA5D28A2C8")
    public void setIsRootNamespace(boolean isRoot) {
        {
            mPrivateFlags |= IS_ROOT_NAMESPACE;
        } //End block
        {
            mPrivateFlags &= ~IS_ROOT_NAMESPACE;
        } //End block
        addTaint(isRoot);
        // ---------- Original Method ----------
        //if (isRoot) {
            //mPrivateFlags |= IS_ROOT_NAMESPACE;
        //} else {
            //mPrivateFlags &= ~IS_ROOT_NAMESPACE;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.582 -0400", hash_original_method = "74A41C2D2B744E005149431B820C27E4", hash_generated_method = "6920B4E6C05646115448325E5711ECE1")
    public boolean isRootNamespace() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_5236099 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_5236099;
        // ---------- Original Method ----------
        //return (mPrivateFlags&IS_ROOT_NAMESPACE) != 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.582 -0400", hash_original_method = "B0378653037A8E20BF93620A5E0AA660", hash_generated_method = "CC6A718344B178F7537A977C5A0799C4")
    @ViewDebug.CapturedViewProperty
    public int getId() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1777797250 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1777797250;
        // ---------- Original Method ----------
        //return mID;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.583 -0400", hash_original_method = "15C9157ADF1B79E512CAFF71050D7BD7", hash_generated_method = "4187452C7EFA868E34046A230BEFA884")
    @ViewDebug.ExportedProperty
    public Object getTag() {
        Object varB4EAC82CA7396A68D541C85D26508E83_1859889602 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1859889602 = mTag;
        varB4EAC82CA7396A68D541C85D26508E83_1859889602.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1859889602;
        // ---------- Original Method ----------
        //return mTag;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.583 -0400", hash_original_method = "8D2B18A079B1EE90519A06D435C647B9", hash_generated_method = "A88DBE9CF3CA0D1CB8F5AC3014136EA5")
    public void setTag(final Object tag) {
        mTag = tag;
        // ---------- Original Method ----------
        //mTag = tag;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.584 -0400", hash_original_method = "8295DF3154C0458AF2AF3A51D79A598B", hash_generated_method = "6E1C1C3A3DA259008A7F56E38CA7CD73")
    public Object getTag(int key) {
        Object varB4EAC82CA7396A68D541C85D26508E83_391886475 = null; //Variable for return #1
        Object varB4EAC82CA7396A68D541C85D26508E83_1478900210 = null; //Variable for return #2
        varB4EAC82CA7396A68D541C85D26508E83_391886475 = mKeyedTags.get(key);
        varB4EAC82CA7396A68D541C85D26508E83_1478900210 = null;
        addTaint(key);
        Object varA7E53CE21691AB073D9660D615818899_866742066; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_866742066 = varB4EAC82CA7396A68D541C85D26508E83_391886475;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_866742066 = varB4EAC82CA7396A68D541C85D26508E83_1478900210;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_866742066.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_866742066;
        // ---------- Original Method ----------
        //if (mKeyedTags != null) return mKeyedTags.get(key);
        //return null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.584 -0400", hash_original_method = "C739488AB1D92CB0D6B67C6D73AEF4DA", hash_generated_method = "295E62BE5127CCE56665DED2F5D1429E")
    public void setTag(int key, final Object tag) {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("The key must be an application-specific "
                    + "resource id.");
        } //End block
        setKeyedTag(key, tag);
        addTaint(key);
        addTaint(tag.getTaint());
        // ---------- Original Method ----------
        //if ((key >>> 24) < 2) {
            //throw new IllegalArgumentException("The key must be an application-specific "
                    //+ "resource id.");
        //}
        //setKeyedTag(key, tag);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.584 -0400", hash_original_method = "5A92838330F5A71B83A0155FDDE52450", hash_generated_method = "C5DB8DF53B5E4D167518DCA436949243")
    public void setTagInternal(int key, Object tag) {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("The key must be a framework-specific "
                    + "resource id.");
        } //End block
        setKeyedTag(key, tag);
        addTaint(key);
        addTaint(tag.getTaint());
        // ---------- Original Method ----------
        //if ((key >>> 24) != 0x1) {
            //throw new IllegalArgumentException("The key must be a framework-specific "
                    //+ "resource id.");
        //}
        //setKeyedTag(key, tag);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.585 -0400", hash_original_method = "0255761BE2D8372B1493AF7283C8F5B5", hash_generated_method = "06A89F7CB14EBD2C93511CB0C5FFCEA8")
    private void setKeyedTag(int key, Object tag) {
        {
            mKeyedTags = new SparseArray<Object>();
        } //End block
        mKeyedTags.put(key, tag);
        addTaint(key);
        addTaint(tag.getTaint());
        // ---------- Original Method ----------
        //if (mKeyedTags == null) {
            //mKeyedTags = new SparseArray<Object>();
        //}
        //mKeyedTags.put(key, tag);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.585 -0400", hash_original_method = "C5EE38E619F11A07C2A1169818F1E749", hash_generated_method = "596ECA12D5B3F18E142221AFA829ACF7")
    protected boolean dispatchConsistencyCheck(int consistency) {
        boolean var696CB6BB2A7239589CBDDD711F9F9275_2100350464 = (onConsistencyCheck(consistency));
        addTaint(consistency);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_509429506 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_509429506;
        // ---------- Original Method ----------
        //return onConsistencyCheck(consistency);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.586 -0400", hash_original_method = "2064C42F46AA0108673BA11B037AF3A0", hash_generated_method = "FDB7FF538A7FBBB686AF5162AF330164")
    protected boolean onConsistencyCheck(int consistency) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        boolean result;
        result = true;
        boolean checkLayout;
        checkLayout = (consistency & ViewDebug.CONSISTENCY_LAYOUT) != 0;
        boolean checkDrawing;
        checkDrawing = (consistency & ViewDebug.CONSISTENCY_DRAWING) != 0;
        {
            {
                boolean varDE1E2D0AA459DE6E8FAB425D9EAC441E_1036590620 = (getParent() == null);
                {
                    result = false;
                    android.util.Log.d(ViewDebug.CONSISTENCY_LOG_TAG,
                        "View " + this + " does not have a parent.");
                } //End block
            } //End collapsed parenthetic
            {
                result = false;
                android.util.Log.d(ViewDebug.CONSISTENCY_LOG_TAG,
                        "View " + this + " is not attached to a window.");
            } //End block
        } //End block
        {
            {
                result = false;
                android.util.Log.d(ViewDebug.CONSISTENCY_LOG_TAG,
                        "View " + this + " was invalidated but its drawing cache is valid.");
            } //End block
        } //End block
        addTaint(consistency);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_641346001 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_641346001;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.587 -0400", hash_original_method = "6F90E3DC82B178E80E1C9DDC98738197", hash_generated_method = "D147ED463C0B27338F948465FB673FC2")
    public void debug() {
        debug(0);
        // ---------- Original Method ----------
        //debug(0);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.590 -0400", hash_original_method = "3D5CB916992FEDBE62B11876DD1CF29A", hash_generated_method = "1301D0A6A7B4A5EEA0941161420389E6")
    protected void debug(int depth) {
        String output;
        output = debugIndent(depth - 1);
        output += "+ " + this;
        int id;
        id = getId();
        {
            output += " (id=" + id + ")";
        } //End block
        Object tag;
        tag = getTag();
        {
            output += " (tag=" + tag + ")";
        } //End block
        Log.d(VIEW_LOG_TAG, output);
        {
            output = debugIndent(depth) + " FOCUSED";
            Log.d(VIEW_LOG_TAG, output);
        } //End block
        output = debugIndent(depth);
        output += "frame={" + mLeft + ", " + mTop + ", " + mRight
                + ", " + mBottom + "} scroll={" + mScrollX + ", " + mScrollY
                + "} ";
        Log.d(VIEW_LOG_TAG, output);
        {
            output = debugIndent(depth);
            output += "padding={" + mPaddingLeft + ", " + mPaddingTop
                    + ", " + mPaddingRight + ", " + mPaddingBottom + "}";
            Log.d(VIEW_LOG_TAG, output);
        } //End block
        output = debugIndent(depth);
        output += "mMeasureWidth=" + mMeasuredWidth +
                " mMeasureHeight=" + mMeasuredHeight;
        Log.d(VIEW_LOG_TAG, output);
        output = debugIndent(depth);
        {
            output += "BAD! no layout params";
        } //End block
        {
            output = mLayoutParams.debug(output);
        } //End block
        Log.d(VIEW_LOG_TAG, output);
        output = debugIndent(depth);
        output += "flags={";
        output += View.printFlags(mViewFlags);
        output += "}";
        Log.d(VIEW_LOG_TAG, output);
        output = debugIndent(depth);
        output += "privateFlags={";
        output += View.printPrivateFlags(mPrivateFlags);
        output += "}";
        Log.d(VIEW_LOG_TAG, output);
        addTaint(depth);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
        protected static String debugIndent(int depth) {
        StringBuilder spaces = new StringBuilder((depth * 2 + 3) * 2);
        for (int i = 0; i < (depth * 2) + 3; i++) {
            spaces.append(' ').append(' ');
        }
        return spaces.toString();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.613 -0400", hash_original_method = "04C72C8D15A6DF3440AFF547FAD30ABA", hash_generated_method = "DE1ED167B487E2AFC016CE9020781D99")
    @ViewDebug.ExportedProperty(category = "layout")
    public int getBaseline() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_786508592 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_786508592;
        // ---------- Original Method ----------
        //return -1;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.620 -0400", hash_original_method = "B7CE3104FF9ED0677BFFACD05F948960", hash_generated_method = "EDBC47AFC30A9FFABB51F77AB40B0D79")
    public void requestLayout() {
        {
            ViewDebug.trace(this, ViewDebug.HierarchyTraceType.REQUEST_LAYOUT);
        } //End block
        mPrivateFlags |= FORCE_LAYOUT;
        mPrivateFlags |= INVALIDATED;
        {
            {
                mLayoutParams.resolveWithDirection(getResolvedLayoutDirection());
            } //End block
            {
                boolean var3A2DB0BB7B6E5FB8768388F8E364ED16_1195473105 = (!mParent.isLayoutRequested());
                {
                    mParent.requestLayout();
                } //End block
            } //End collapsed parenthetic
        } //End block
        // ---------- Original Method ----------
        //if (ViewDebug.TRACE_HIERARCHY) {
            //ViewDebug.trace(this, ViewDebug.HierarchyTraceType.REQUEST_LAYOUT);
        //}
        //mPrivateFlags |= FORCE_LAYOUT;
        //mPrivateFlags |= INVALIDATED;
        //if (mParent != null) {
            //if (mLayoutParams != null) {
                //mLayoutParams.resolveWithDirection(getResolvedLayoutDirection());
            //}
            //if (!mParent.isLayoutRequested()) {
                //mParent.requestLayout();
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.621 -0400", hash_original_method = "5F70867C98C203969EB162B4B724A790", hash_generated_method = "1F7ADA8EF52B745DA17A5F28CC890DA3")
    public void forceLayout() {
        mPrivateFlags |= FORCE_LAYOUT;
        mPrivateFlags |= INVALIDATED;
        // ---------- Original Method ----------
        //mPrivateFlags |= FORCE_LAYOUT;
        //mPrivateFlags |= INVALIDATED;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.621 -0400", hash_original_method = "26BA2349651C8679968382F6A84D9E92", hash_generated_method = "42AD92EB4D7181C601BDC4659B482D71")
    public final void measure(int widthMeasureSpec, int heightMeasureSpec) {
        {
            mPrivateFlags &= ~MEASURED_DIMENSION_SET;
            {
                ViewDebug.trace(this, ViewDebug.HierarchyTraceType.ON_MEASURE);
            } //End block
            onMeasure(widthMeasureSpec, heightMeasureSpec);
            {
                if (DroidSafeAndroidRuntime.control) throw new IllegalStateException("onMeasure() did not set the"
                        + " measured dimension by calling"
                        + " setMeasuredDimension()");
            } //End block
            mPrivateFlags |= LAYOUT_REQUIRED;
        } //End block
        mOldWidthMeasureSpec = widthMeasureSpec;
        mOldHeightMeasureSpec = heightMeasureSpec;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.622 -0400", hash_original_method = "2024EA7D99B2D61F149E7A5A9BB7EB8E", hash_generated_method = "A1685498757267B70C369301E6769581")
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        setMeasuredDimension(getDefaultSize(getSuggestedMinimumWidth(), widthMeasureSpec),
                getDefaultSize(getSuggestedMinimumHeight(), heightMeasureSpec));
        addTaint(widthMeasureSpec);
        addTaint(heightMeasureSpec);
        // ---------- Original Method ----------
        //setMeasuredDimension(getDefaultSize(getSuggestedMinimumWidth(), widthMeasureSpec),
                //getDefaultSize(getSuggestedMinimumHeight(), heightMeasureSpec));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.622 -0400", hash_original_method = "5AB327430FB1DFBD1DD895A1A32A2AA8", hash_generated_method = "8B2B36A03163D56C56910520694D78FC")
    protected final void setMeasuredDimension(int measuredWidth, int measuredHeight) {
        mMeasuredWidth = measuredWidth;
        mMeasuredHeight = measuredHeight;
        mPrivateFlags |= MEASURED_DIMENSION_SET;
        // ---------- Original Method ----------
        //mMeasuredWidth = measuredWidth;
        //mMeasuredHeight = measuredHeight;
        //mPrivateFlags |= MEASURED_DIMENSION_SET;
    }

    
        public static int combineMeasuredStates(int curState, int newState) {
        return curState | newState;
    }

    
        public static int resolveSize(int size, int measureSpec) {
        return resolveSizeAndState(size, measureSpec, 0) & MEASURED_SIZE_MASK;
    }

    
        public static int resolveSizeAndState(int size, int measureSpec, int childMeasuredState) {
        int result = size;
        int specMode = MeasureSpec.getMode(measureSpec);
        int specSize =  MeasureSpec.getSize(measureSpec);
        switch (specMode) {
        case MeasureSpec.UNSPECIFIED:
            result = size;
            break;
        case MeasureSpec.AT_MOST:
            if (specSize < size) {
                result = specSize | MEASURED_STATE_TOO_SMALL;
            } else {
                result = size;
            }
            break;
        case MeasureSpec.EXACTLY:
            result = specSize;
            break;
        }
        return result | (childMeasuredState&MEASURED_STATE_MASK);
    }

    
        public static int getDefaultSize(int size, int measureSpec) {
        int result = size;
        int specMode = MeasureSpec.getMode(measureSpec);
        int specSize = MeasureSpec.getSize(measureSpec);
        switch (specMode) {
        case MeasureSpec.UNSPECIFIED:
            result = size;
            break;
        case MeasureSpec.AT_MOST:
        case MeasureSpec.EXACTLY:
            result = specSize;
            break;
        }
        return result;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.637 -0400", hash_original_method = "B59EA0BF10E69D3FFCA86CC30267F8DC", hash_generated_method = "3734AA7F369767F7D1A86D3803C6170A")
    protected int getSuggestedMinimumHeight() {
        int suggestedMinHeight;
        suggestedMinHeight = mMinHeight;
        {
            int bgMinHeight;
            bgMinHeight = mBGDrawable.getMinimumHeight();
            {
                suggestedMinHeight = bgMinHeight;
            } //End block
        } //End block
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1958239192 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1958239192;
        // ---------- Original Method ----------
        //int suggestedMinHeight = mMinHeight;
        //if (mBGDrawable != null) {
            //final int bgMinHeight = mBGDrawable.getMinimumHeight();
            //if (suggestedMinHeight < bgMinHeight) {
                //suggestedMinHeight = bgMinHeight;
            //}
        //}
        //return suggestedMinHeight;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.637 -0400", hash_original_method = "008B87CD2B3ED33B965CD69B13D61BFC", hash_generated_method = "AC55E7B5AB3F2AC020DADEFBA38FCD86")
    protected int getSuggestedMinimumWidth() {
        int suggestedMinWidth;
        suggestedMinWidth = mMinWidth;
        {
            int bgMinWidth;
            bgMinWidth = mBGDrawable.getMinimumWidth();
            {
                suggestedMinWidth = bgMinWidth;
            } //End block
        } //End block
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_677019320 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_677019320;
        // ---------- Original Method ----------
        //int suggestedMinWidth = mMinWidth;
        //if (mBGDrawable != null) {
            //final int bgMinWidth = mBGDrawable.getMinimumWidth();
            //if (suggestedMinWidth < bgMinWidth) {
                //suggestedMinWidth = bgMinWidth;
            //}
        //}
        //return suggestedMinWidth;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.637 -0400", hash_original_method = "879BFA5FA0241047CB6974ED67682297", hash_generated_method = "A39DF7CE68D27AD1F832F37EFF38AC83")
    public void setMinimumHeight(int minHeight) {
        mMinHeight = minHeight;
        // ---------- Original Method ----------
        //mMinHeight = minHeight;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.638 -0400", hash_original_method = "CE129FBEAB6CCA0889899FF1E8E78A67", hash_generated_method = "94906ED9E91744BCBB1BA063108152BC")
    public void setMinimumWidth(int minWidth) {
        mMinWidth = minWidth;
        // ---------- Original Method ----------
        //mMinWidth = minWidth;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.639 -0400", hash_original_method = "CDBB00D26F9C60D5F3E6B97847853936", hash_generated_method = "A67F86B1F68427980E06C1F1EE472125")
    public Animation getAnimation() {
        Animation varB4EAC82CA7396A68D541C85D26508E83_835606790 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_835606790 = mCurrentAnimation;
        varB4EAC82CA7396A68D541C85D26508E83_835606790.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_835606790;
        // ---------- Original Method ----------
        //return mCurrentAnimation;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.639 -0400", hash_original_method = "8B9244EE03042EB67F130AFDAD9A68F9", hash_generated_method = "0D849D6C10BD44515578B9EF5F3E1FDE")
    public void startAnimation(Animation animation) {
        animation.setStartTime(Animation.START_ON_FIRST_FRAME);
        setAnimation(animation);
        invalidateParentCaches();
        invalidate(true);
        addTaint(animation.getTaint());
        // ---------- Original Method ----------
        //animation.setStartTime(Animation.START_ON_FIRST_FRAME);
        //setAnimation(animation);
        //invalidateParentCaches();
        //invalidate(true);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.653 -0400", hash_original_method = "743A148D3AA9DA63FB0D1635C16263C7", hash_generated_method = "D8BDC865788F545FD5DB6A92DA533D21")
    public void clearAnimation() {
        {
            mCurrentAnimation.detach();
        } //End block
        mCurrentAnimation = null;
        invalidateParentIfNeeded();
        // ---------- Original Method ----------
        //if (mCurrentAnimation != null) {
            //mCurrentAnimation.detach();
        //}
        //mCurrentAnimation = null;
        //invalidateParentIfNeeded();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.653 -0400", hash_original_method = "80992FCFACCF22F26EEB305124C3026E", hash_generated_method = "F0E380EE622343CB0DADA43AC76C72C0")
    public void setAnimation(Animation animation) {
        mCurrentAnimation = animation;
        {
            animation.reset();
        } //End block
        // ---------- Original Method ----------
        //mCurrentAnimation = animation;
        //if (animation != null) {
            //animation.reset();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.654 -0400", hash_original_method = "AAD5AA561778224F71E3AF6921CD4105", hash_generated_method = "06D6C8F61FFE52559A40E6B98F790853")
    protected void onAnimationStart() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        mPrivateFlags |= ANIMATION_STARTED;
        // ---------- Original Method ----------
        //mPrivateFlags |= ANIMATION_STARTED;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.654 -0400", hash_original_method = "F4AD81FC3499666E7AC93E3735AFEF8E", hash_generated_method = "05026BAADDDB17252B779F88E55782F5")
    protected void onAnimationEnd() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        mPrivateFlags &= ~ANIMATION_STARTED;
        // ---------- Original Method ----------
        //mPrivateFlags &= ~ANIMATION_STARTED;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.654 -0400", hash_original_method = "DC47911C20E58BC47F643D76AAAF3E73", hash_generated_method = "6059BE81CF1A5132DA7C90D0BB2374E1")
    protected boolean onSetAlpha(int alpha) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(alpha);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_703971698 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_703971698;
        // ---------- Original Method ----------
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.659 -0400", hash_original_method = "A01500863A3F6668743C7034A9645220", hash_generated_method = "6835CAAC1C4D6C9C92450EBFFBD11E51")
    public boolean gatherTransparentRegion(Region region) {
        AttachInfo attachInfo;
        attachInfo = mAttachInfo;
        {
            int pflags;
            pflags = mPrivateFlags;
            {
                int[] location;
                location = attachInfo.mTransparentLocation;
                getLocationInWindow(location);
                region.op(location[0], location[1], location[0] + mRight - mLeft,
                        location[1] + mBottom - mTop, Region.Op.DIFFERENCE);
            } //End block
            {
                applyDrawableToTransparentRegion(mBGDrawable, region);
            } //End block
        } //End block
        addTaint(region.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1387005985 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1387005985;
        // ---------- Original Method ----------
        //final AttachInfo attachInfo = mAttachInfo;
        //if (region != null && attachInfo != null) {
            //final int pflags = mPrivateFlags;
            //if ((pflags & SKIP_DRAW) == 0) {
                //final int[] location = attachInfo.mTransparentLocation;
                //getLocationInWindow(location);
                //region.op(location[0], location[1], location[0] + mRight - mLeft,
                        //location[1] + mBottom - mTop, Region.Op.DIFFERENCE);
            //} else if ((pflags & ONLY_DRAWS_BACKGROUND) != 0 && mBGDrawable != null) {
                //applyDrawableToTransparentRegion(mBGDrawable, region);
            //}
        //}
        //return true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.673 -0400", hash_original_method = "92BFD91D600C047225F186391F6079B0", hash_generated_method = "B9757D1FAD05910C885933EF6D8AA390")
    public void playSoundEffect(int soundConstant) {
        {
            boolean var1E4326663BC68D529F79DE6FC2643778_677209973 = (mAttachInfo == null || mAttachInfo.mRootCallbacks == null || !isSoundEffectsEnabled());
        } //End collapsed parenthetic
        mAttachInfo.mRootCallbacks.playSoundEffect(soundConstant);
        addTaint(soundConstant);
        // ---------- Original Method ----------
        //if (mAttachInfo == null || mAttachInfo.mRootCallbacks == null || !isSoundEffectsEnabled()) {
            //return;
        //}
        //mAttachInfo.mRootCallbacks.playSoundEffect(soundConstant);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.674 -0400", hash_original_method = "75954C55ABC6CE5681E22BCDE96F4903", hash_generated_method = "CFCD887075DFEECD20BC38A336C62805")
    public boolean performHapticFeedback(int feedbackConstant) {
        boolean var47DA1E759FDC3E51245046642463FE5C_1258656910 = (performHapticFeedback(feedbackConstant, 0));
        addTaint(feedbackConstant);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_457211398 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_457211398;
        // ---------- Original Method ----------
        //return performHapticFeedback(feedbackConstant, 0);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.674 -0400", hash_original_method = "A19669526C11317AB6CCDC764945F176", hash_generated_method = "A8DE48B16BED94D607A496BFF671CA38")
    public boolean performHapticFeedback(int feedbackConstant, int flags) {
        {
            boolean varA5539A907B715B189715B7DC683584E6_1393271801 = ((flags & HapticFeedbackConstants.FLAG_IGNORE_VIEW_SETTING) == 0
                && !isHapticFeedbackEnabled());
        } //End collapsed parenthetic
        boolean var504ECB78099BB3639952FEB46DA1CEC5_1647723811 = (mAttachInfo.mRootCallbacks.performHapticFeedback(feedbackConstant,
                (flags & HapticFeedbackConstants.FLAG_IGNORE_GLOBAL_SETTING) != 0));
        addTaint(feedbackConstant);
        addTaint(flags);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_988197981 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_988197981;
        // ---------- Original Method ----------
        //if (mAttachInfo == null) {
            //return false;
        //}
        //if ((flags & HapticFeedbackConstants.FLAG_IGNORE_VIEW_SETTING) == 0
                //&& !isHapticFeedbackEnabled()) {
            //return false;
        //}
        //return mAttachInfo.mRootCallbacks.performHapticFeedback(feedbackConstant,
                //(flags & HapticFeedbackConstants.FLAG_IGNORE_GLOBAL_SETTING) != 0);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.675 -0400", hash_original_method = "1F6436CCBBD24CDC20D09B9CE44A0912", hash_generated_method = "C501877563CED89188474EC8CE497D73")
    public void setSystemUiVisibility(int visibility) {
        {
            mSystemUiVisibility = visibility;
            {
                mParent.recomputeViewAttributes(this);
            } //End block
        } //End block
        // ---------- Original Method ----------
        //if (visibility != mSystemUiVisibility) {
            //mSystemUiVisibility = visibility;
            //if (mParent != null && mAttachInfo != null && !mAttachInfo.mRecomputeGlobalAttributes) {
                //mParent.recomputeViewAttributes(this);
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.676 -0400", hash_original_method = "FA02CCE186B627C6CF56D55D5156174E", hash_generated_method = "7B7F80A3C9BEB2DDCF95E66AB1617753")
    public int getSystemUiVisibility() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_768572418 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_768572418;
        // ---------- Original Method ----------
        //return mSystemUiVisibility;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.676 -0400", hash_original_method = "1911D5DDAC8087DF02FDB915711E3D30", hash_generated_method = "5082BD11025AEF1DE33FFE0132594858")
    public void setOnSystemUiVisibilityChangeListener(OnSystemUiVisibilityChangeListener l) {
        getListenerInfo().mOnSystemUiVisibilityChangeListener = l;
        {
            mParent.recomputeViewAttributes(this);
        } //End block
        addTaint(l.getTaint());
        // ---------- Original Method ----------
        //getListenerInfo().mOnSystemUiVisibilityChangeListener = l;
        //if (mParent != null && mAttachInfo != null && !mAttachInfo.mRecomputeGlobalAttributes) {
            //mParent.recomputeViewAttributes(this);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.687 -0400", hash_original_method = "31A60EE50D18A3986849FF003231E28E", hash_generated_method = "BDE9EB74D273463D2A349F6AD5676D98")
    public void dispatchSystemUiVisibilityChanged(int visibility) {
        ListenerInfo li;
        li = mListenerInfo;
        {
            li.mOnSystemUiVisibilityChangeListener.onSystemUiVisibilityChange(
                    visibility & PUBLIC_STATUS_BAR_VISIBILITY_MASK);
        } //End block
        addTaint(visibility);
        // ---------- Original Method ----------
        //ListenerInfo li = mListenerInfo;
        //if (li != null && li.mOnSystemUiVisibilityChangeListener != null) {
            //li.mOnSystemUiVisibilityChangeListener.onSystemUiVisibilityChange(
                    //visibility & PUBLIC_STATUS_BAR_VISIBILITY_MASK);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.688 -0400", hash_original_method = "BE707BAA551F425B19E1E4FBE454F716", hash_generated_method = "770A461AE39651AA1A607D528EDC1229")
     void updateLocalSystemUiVisibility(int localValue, int localChanges) {
        int val;
        val = (mSystemUiVisibility&~localChanges) | (localValue&localChanges);
        {
            setSystemUiVisibility(val);
        } //End block
        addTaint(localValue);
        addTaint(localChanges);
        // ---------- Original Method ----------
        //int val = (mSystemUiVisibility&~localChanges) | (localValue&localChanges);
        //if (val != mSystemUiVisibility) {
            //setSystemUiVisibility(val);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.689 -0400", hash_original_method = "F914DF1AC479022C6AA4BFD6DD1247D7", hash_generated_method = "08CC92D9EC928109003773AFCDC50289")
    public final boolean startDrag(ClipData data, DragShadowBuilder shadowBuilder,
            Object myLocalState, int flags) {
        {
            Log.d(VIEW_LOG_TAG, "startDrag: data=" + data + " flags=" + flags);
        } //End block
        boolean okay;
        okay = false;
        Point shadowSize;
        shadowSize = new Point();
        Point shadowTouchPoint;
        shadowTouchPoint = new Point();
        shadowBuilder.onProvideShadowMetrics(shadowSize, shadowTouchPoint);
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalStateException("Drag shadow dimensions must not be negative");
        } //End block
        {
            Log.d(VIEW_LOG_TAG, "drag shadow: width=" + shadowSize.x + " height=" + shadowSize.y
                    + " shadowX=" + shadowTouchPoint.x + " shadowY=" + shadowTouchPoint.y);
        } //End block
        Surface surface;
        surface = new Surface();
        try 
        {
            IBinder token;
            token = mAttachInfo.mSession.prepareDrag(mAttachInfo.mWindow,
                    flags, shadowSize.x, shadowSize.y, surface);
            Log.d(VIEW_LOG_TAG, "prepareDrag returned token=" + token
                    + " surface=" + surface);
            {
                Canvas canvas;
                canvas = surface.lockCanvas(null);
                try 
                {
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    shadowBuilder.onDrawShadow(canvas);
                } //End block
                finally 
                {
                    surface.unlockCanvasAndPost(canvas);
                } //End block
                ViewRootImpl root;
                root = getViewRootImpl();
                root.setLocalDragState(myLocalState);
                root.getLastTouchPoint(shadowSize);
                okay = mAttachInfo.mSession.performDrag(mAttachInfo.mWindow, token,
                        shadowSize.x, shadowSize.y,
                        shadowTouchPoint.x, shadowTouchPoint.y, data);
                Log.d(VIEW_LOG_TAG, "performDrag returned " + okay);
                surface.release();
            } //End block
        } //End block
        catch (Exception e)
        {
            surface.destroy();
        } //End block
        addTaint(data.getTaint());
        addTaint(shadowBuilder.getTaint());
        addTaint(myLocalState.getTaint());
        addTaint(flags);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2085986308 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2085986308;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.690 -0400", hash_original_method = "7E645D896E88F7A2CE991A302B5729A7", hash_generated_method = "C5C316A0C851FD4EBECF574904ECB7D3")
    public boolean onDragEvent(DragEvent event) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_383201514 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_383201514;
        // ---------- Original Method ----------
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.700 -0400", hash_original_method = "2E7102A43746FEAE9D11C37FDA834A21", hash_generated_method = "F38CD1E50617DC5217F8D05642B55FF9")
    public boolean dispatchDragEvent(DragEvent event) {
        ListenerInfo li;
        li = mListenerInfo;
        {
            boolean var335DF3A408D4F144DA69CF42853FDB1A_1976182683 = (li != null && li.mOnDragListener != null && (mViewFlags & ENABLED_MASK) == ENABLED
                && li.mOnDragListener.onDrag(this, event));
        } //End collapsed parenthetic
        boolean var0587795787D505B85471C0D6F567FE89_885043295 = (onDragEvent(event));
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1159417281 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1159417281;
        // ---------- Original Method ----------
        //ListenerInfo li = mListenerInfo;
        //if (li != null && li.mOnDragListener != null && (mViewFlags & ENABLED_MASK) == ENABLED
                //&& li.mOnDragListener.onDrag(this, event)) {
            //return true;
        //}
        //return onDragEvent(event);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.700 -0400", hash_original_method = "C990D75777DFB098F96F21BE433F897F", hash_generated_method = "F62857A54DBD424D3172480571D9C80E")
     boolean canAcceptDrag() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_127940135 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_127940135;
        // ---------- Original Method ----------
        //return (mPrivateFlags2 & DRAG_CAN_ACCEPT) != 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.701 -0400", hash_original_method = "059265693C3FBF9CA8D6100876A0DA7C", hash_generated_method = "4027BFE56A9421810369202A60B7D2BD")
    public void onCloseSystemDialogs(String reason) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(reason.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.702 -0400", hash_original_method = "14C9DBE3395E98A8750BC15A93AD3A45", hash_generated_method = "A10860F62D0837A82C23157DADA36387")
    public void applyDrawableToTransparentRegion(Drawable dr, Region region) {
        Region r;
        r = dr.getTransparentRegion();
        Rect db;
        db = dr.getBounds();
        AttachInfo attachInfo;
        attachInfo = mAttachInfo;
        {
            int w;
            w = getRight()-getLeft();
            int h;
            h = getBottom()-getTop();
            {
                r.op(0, 0, db.left, h, Region.Op.UNION);
            } //End block
            {
                r.op(db.right, 0, w, h, Region.Op.UNION);
            } //End block
            {
                r.op(0, 0, w, db.top, Region.Op.UNION);
            } //End block
            {
                r.op(0, db.bottom, w, h, Region.Op.UNION);
            } //End block
            int[] location;
            location = attachInfo.mTransparentLocation;
            getLocationInWindow(location);
            r.translate(location[0], location[1]);
            region.op(r, Region.Op.INTERSECT);
        } //End block
        {
            region.op(db, Region.Op.DIFFERENCE);
        } //End block
        addTaint(dr.getTaint());
        addTaint(region.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.712 -0400", hash_original_method = "3A330A3DE83C0EE0C70042D452F74FC4", hash_generated_method = "29B4F79DBE6EE8C697B8E208D37D084B")
    private void checkForLongClick(int delayOffset) {
        {
            mHasPerformedLongPress = false;
            {
                mPendingCheckForLongPress = new CheckForLongPress();
            } //End block
            mPendingCheckForLongPress.rememberWindowAttachCount();
            postDelayed(mPendingCheckForLongPress,
                    ViewConfiguration.getLongPressTimeout() - delayOffset);
        } //End block
        addTaint(delayOffset);
        // ---------- Original Method ----------
        //if ((mViewFlags & LONG_CLICKABLE) == LONG_CLICKABLE) {
            //mHasPerformedLongPress = false;
            //if (mPendingCheckForLongPress == null) {
                //mPendingCheckForLongPress = new CheckForLongPress();
            //}
            //mPendingCheckForLongPress.rememberWindowAttachCount();
            //postDelayed(mPendingCheckForLongPress,
                    //ViewConfiguration.getLongPressTimeout() - delayOffset);
        //}
    }

    
        public static View inflate(Context context, int resource, ViewGroup root) {
        LayoutInflater factory = LayoutInflater.from(context);
        return factory.inflate(resource, root);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.714 -0400", hash_original_method = "5E47C984391EE91860CD25320EB410A4", hash_generated_method = "28A2F260DE23542E71E514354DA0B1DC")
    @SuppressWarnings({"UnusedParameters"})
    protected boolean overScrollBy(int deltaX, int deltaY,
            int scrollX, int scrollY,
            int scrollRangeX, int scrollRangeY,
            int maxOverScrollX, int maxOverScrollY,
            boolean isTouchEvent) {
        int overScrollMode;
        overScrollMode = mOverScrollMode;
        boolean canScrollHorizontal;
        canScrollHorizontal = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean canScrollVertical;
        canScrollVertical = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean overScrollHorizontal;
        overScrollHorizontal = overScrollMode == OVER_SCROLL_ALWAYS ||
                (overScrollMode == OVER_SCROLL_IF_CONTENT_SCROLLS && canScrollHorizontal);
        boolean overScrollVertical;
        overScrollVertical = overScrollMode == OVER_SCROLL_ALWAYS ||
                (overScrollMode == OVER_SCROLL_IF_CONTENT_SCROLLS && canScrollVertical);
        int newScrollX;
        newScrollX = scrollX + deltaX;
        {
            maxOverScrollX = 0;
        } //End block
        int newScrollY;
        newScrollY = scrollY + deltaY;
        {
            maxOverScrollY = 0;
        } //End block
        int left;
        left = -maxOverScrollX;
        int right;
        right = maxOverScrollX + scrollRangeX;
        int top;
        top = -maxOverScrollY;
        int bottom;
        bottom = maxOverScrollY + scrollRangeY;
        boolean clampedX;
        clampedX = false;
        {
            newScrollX = right;
            clampedX = true;
        } //End block
        {
            newScrollX = left;
            clampedX = true;
        } //End block
        boolean clampedY;
        clampedY = false;
        {
            newScrollY = bottom;
            clampedY = true;
        } //End block
        {
            newScrollY = top;
            clampedY = true;
        } //End block
        onOverScrolled(newScrollX, newScrollY, clampedX, clampedY);
        addTaint(deltaX);
        addTaint(deltaY);
        addTaint(scrollX);
        addTaint(scrollY);
        addTaint(scrollRangeX);
        addTaint(scrollRangeY);
        addTaint(maxOverScrollX);
        addTaint(maxOverScrollY);
        addTaint(isTouchEvent);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_757247816 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_757247816;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.714 -0400", hash_original_method = "4CE95B84751ED417CECEABF7E9F1BBA1", hash_generated_method = "F8EFF254F7D42120039BE2F323D4218D")
    protected void onOverScrolled(int scrollX, int scrollY,
            boolean clampedX, boolean clampedY) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(scrollX);
        addTaint(scrollY);
        addTaint(clampedX);
        addTaint(clampedY);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.720 -0400", hash_original_method = "89CDC9D85B7569FFDF89FB6E096C8833", hash_generated_method = "8329515F7CA70C6CEBFFE356CB491B68")
    public int getOverScrollMode() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1752710170 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1752710170;
        // ---------- Original Method ----------
        //return mOverScrollMode;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.720 -0400", hash_original_method = "D7A7F397651806FFF8FA254EEF23303B", hash_generated_method = "69A208CEAB0A2C4781F6242469E9A6A4")
    public void setOverScrollMode(int overScrollMode) {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Invalid overscroll mode " + overScrollMode);
        } //End block
        mOverScrollMode = overScrollMode;
        // ---------- Original Method ----------
        //if (overScrollMode != OVER_SCROLL_ALWAYS &&
                //overScrollMode != OVER_SCROLL_IF_CONTENT_SCROLLS &&
                //overScrollMode != OVER_SCROLL_NEVER) {
            //throw new IllegalArgumentException("Invalid overscroll mode " + overScrollMode);
        //}
        //mOverScrollMode = overScrollMode;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.721 -0400", hash_original_method = "9CF1D38E8E376FF50D8C64A9F9733663", hash_generated_method = "508A601436BAAED105727A3AAF4DF81C")
    protected float getVerticalScrollFactor() {
        {
            TypedValue outValue;
            outValue = new TypedValue();
            {
                boolean var0AC7698B51F94BDA888C18D716FEABFB_1781784585 = (!mContext.getTheme().resolveAttribute(
                    com.android.internal.R.attr.listPreferredItemHeight, outValue, true));
                {
                    if (DroidSafeAndroidRuntime.control) throw new IllegalStateException(
                        "Expected theme to define listPreferredItemHeight.");
                } //End block
            } //End collapsed parenthetic
            mVerticalScrollFactor = outValue.getDimension(
                    mContext.getResources().getDisplayMetrics());
        } //End block
        float var546ADE640B6EDFBC8A086EF31347E768_23489621 = getTaintFloat();
        return var546ADE640B6EDFBC8A086EF31347E768_23489621;
        // ---------- Original Method ----------
        //if (mVerticalScrollFactor == 0) {
            //TypedValue outValue = new TypedValue();
            //if (!mContext.getTheme().resolveAttribute(
                    //com.android.internal.R.attr.listPreferredItemHeight, outValue, true)) {
                //throw new IllegalStateException(
                        //"Expected theme to define listPreferredItemHeight.");
            //}
            //mVerticalScrollFactor = outValue.getDimension(
                    //mContext.getResources().getDisplayMetrics());
        //}
        //return mVerticalScrollFactor;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.721 -0400", hash_original_method = "E54E00038FC64298D390BA41C98DC1D8", hash_generated_method = "D10829B8EBC3873F15AEE747325442ED")
    protected float getHorizontalScrollFactor() {
        float varB4E039AD370F52FF248539199AD3C0AB_1794588373 = (getVerticalScrollFactor());
        float var546ADE640B6EDFBC8A086EF31347E768_806051855 = getTaintFloat();
        return var546ADE640B6EDFBC8A086EF31347E768_806051855;
        // ---------- Original Method ----------
        //return getVerticalScrollFactor();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.721 -0400", hash_original_method = "66C84E939C2024746D4813377EE28DA8", hash_generated_method = "00D4DEB972B59CC0EABE2DB172C0A693")
    public int getTextDirection() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2107552600 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2107552600;
        // ---------- Original Method ----------
        //return mTextDirection;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.722 -0400", hash_original_method = "A0414376D9ECFBC599F5D349FFC72987", hash_generated_method = "DD1E7770572FD6A2FE8582C6C9B18489")
    public void setTextDirection(int textDirection) {
        {
            mTextDirection = textDirection;
            resetResolvedTextDirection();
            requestLayout();
        } //End block
        // ---------- Original Method ----------
        //if (textDirection != mTextDirection) {
            //mTextDirection = textDirection;
            //resetResolvedTextDirection();
            //requestLayout();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.722 -0400", hash_original_method = "99501F3EA14EF54863B388ACFA67B227", hash_generated_method = "E77BC7C7D9ABB1FB7220B4204C6AD5FB")
    public int getResolvedTextDirection() {
        {
            resolveTextDirection();
        } //End block
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_408912461 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_408912461;
        // ---------- Original Method ----------
        //if (mResolvedTextDirection == TEXT_DIRECTION_INHERIT) {
            //resolveTextDirection();
        //}
        //return mResolvedTextDirection;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.739 -0400", hash_original_method = "DF8FC39519D36B1AC7371F6D87C199FC", hash_generated_method = "D6167440D0E281A5592F1E06303EA124")
    protected void resolveTextDirection() {
        {
            mResolvedTextDirection = mTextDirection;
        } //End block
        {
            mResolvedTextDirection = ((ViewGroup) mParent).getResolvedTextDirection();
        } //End block
        mResolvedTextDirection = TEXT_DIRECTION_FIRST_STRONG;
        // ---------- Original Method ----------
        //if (mTextDirection != TEXT_DIRECTION_INHERIT) {
            //mResolvedTextDirection = mTextDirection;
            //return;
        //}
        //if (mParent != null && mParent instanceof ViewGroup) {
            //mResolvedTextDirection = ((ViewGroup) mParent).getResolvedTextDirection();
            //return;
        //}
        //mResolvedTextDirection = TEXT_DIRECTION_FIRST_STRONG;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.739 -0400", hash_original_method = "BB79EF6AB24983F71C49AA466BBC15FC", hash_generated_method = "7309B27E3B8E0EA585A6CF1593E51E30")
    protected void resetResolvedTextDirection() {
        mResolvedTextDirection = TEXT_DIRECTION_INHERIT;
        // ---------- Original Method ----------
        //mResolvedTextDirection = TEXT_DIRECTION_INHERIT;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.740 -0400", hash_original_method = "AF21ED671E180E70DBE0B7255059F75E", hash_generated_method = "9A6BA26B98FE57B58A6B05E019D06035")
    public void hackTurnOffWindowResizeAnim(boolean off) {
        mAttachInfo.mTurnOffWindowResizeAnim = off;
        // ---------- Original Method ----------
        //mAttachInfo.mTurnOffWindowResizeAnim = off;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.740 -0400", hash_original_method = "E195CA02B57C3CA07D3D00B98A2A4177", hash_generated_method = "BD85EF44B8A0A85D9EC6FB15F68BAB3B")
    public ViewPropertyAnimator animate() {
        ViewPropertyAnimator varB4EAC82CA7396A68D541C85D26508E83_1774101875 = null; //Variable for return #1
        {
            mAnimator = new ViewPropertyAnimator(this);
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1774101875 = mAnimator;
        varB4EAC82CA7396A68D541C85D26508E83_1774101875.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1774101875;
        // ---------- Original Method ----------
        //if (mAnimator == null) {
            //mAnimator = new ViewPropertyAnimator(this);
        //}
        //return mAnimator;
    }

    
    static class TransformationInfo {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.740 -0400", hash_original_field = "01A5A714698019F46F7B3BE18D3A81EF", hash_generated_field = "719C86522231DE5EF80B52586802F698")

        private Matrix mMatrix = new Matrix();
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.740 -0400", hash_original_field = "892FD7717D9FE700C26A99B107E83D2D", hash_generated_field = "5F11E3B225AB20CA6908F99BD2DCCD69")

        private Matrix mInverseMatrix;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.740 -0400", hash_original_field = "E6AF1B5575F48589B11F67F181886D00", hash_generated_field = "39319A786965FE4B527A01145F904472")

        boolean mMatrixDirty = false;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.741 -0400", hash_original_field = "DFB8A8C1AC71929285F6E9C21422BD39", hash_generated_field = "0D5DDC0830CE5F8AD2A6C72FEF2EE898")

        private boolean mInverseMatrixDirty = true;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.741 -0400", hash_original_field = "91D62B45A9A6983F3FF66229817A7939", hash_generated_field = "067E11491097A23D40918282A928EBA9")

        private boolean mMatrixIsIdentity = true;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.741 -0400", hash_original_field = "114805850A4BFF346FD6EAF00216606F", hash_generated_field = "EDD47554C3CEE3D946B262053B454BFB")

        private Camera mCamera = null;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.741 -0400", hash_original_field = "CC31A142BE3901700F0A5BABD448641D", hash_generated_field = "19CC34893873FBEA96612C704706273A")

        private Matrix matrix3D = null;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.741 -0400", hash_original_field = "0E1D00ACFA6A3EE1137A1995B4598449", hash_generated_field = "888097DA3FEAC04F59E84914FC3B299F")

        private int mPrevWidth = -1;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.741 -0400", hash_original_field = "B16CB4E01E2F0EC3C3D762413BCFA3EA", hash_generated_field = "3F17D196FD1B71E4E9A79484B73B3DC2")

        private int mPrevHeight = -1;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.741 -0400", hash_original_field = "8461EF13A0961B85C57153ADEACDA2AF", hash_generated_field = "5BFF8D9CD2F407BBEC3BAA9D3113E814")

        @ViewDebug.ExportedProperty float mRotationY = 0f;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.741 -0400", hash_original_field = "91D13B8ABAABE76FB1A1DB257483240D", hash_generated_field = "1773CD64DE2B81950EEC26683C7BFC12")

        @ViewDebug.ExportedProperty float mRotationX = 0f;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.741 -0400", hash_original_field = "3EA2C3E9FA82D448BC8E393E6731068D", hash_generated_field = "CBCF8195E197871A173AFD82B249BEE8")

        @ViewDebug.ExportedProperty float mRotation = 0f;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.741 -0400", hash_original_field = "FC3C2A4E393ED24A270EF0FBD816080B", hash_generated_field = "7E653D53DDF7B3176405F85A676F9E8E")

        @ViewDebug.ExportedProperty float mTranslationX = 0f;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.741 -0400", hash_original_field = "48CC9A3909395E2C748DF341969B13EE", hash_generated_field = "477946415FF37E50D7898E1A45EA53F2")

        @ViewDebug.ExportedProperty float mTranslationY = 0f;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.741 -0400", hash_original_field = "76B60FCE9805D699B1614259B56C0AB4", hash_generated_field = "39698B539B591C7643D57DD23054914D")

        @ViewDebug.ExportedProperty float mScaleX = 1f;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.741 -0400", hash_original_field = "63BF484C692B6E739EBA4C830C8776F0", hash_generated_field = "37E347D4565A795C12A91CA0C0BB20C1")

        @ViewDebug.ExportedProperty float mScaleY = 1f;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.741 -0400", hash_original_field = "64048540B5D91324BCD1C40B4709FFB9", hash_generated_field = "C294D047888DF6C232DB6BC89AB6C1DE")

        @ViewDebug.ExportedProperty float mPivotX = 0f;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.741 -0400", hash_original_field = "802D68E29E0889774E6BCE439C574FF3", hash_generated_field = "65227B6A59140FE7F7093243C8409FD1")

        @ViewDebug.ExportedProperty float mPivotY = 0f;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.741 -0400", hash_original_field = "14E45EEE3993C8F9A0BE01602FD0F58C", hash_generated_field = "3F07B4C8BDBAF8B8C3DFBAA769694247")

        @ViewDebug.ExportedProperty float mAlpha = 1f;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.741 -0400", hash_original_method = "047CC1B263AEE84E056E34E366D57D72", hash_generated_method = "047CC1B263AEE84E056E34E366D57D72")
        public TransformationInfo ()
        {
            //Synthesized constructor
        }


    }


    
    static class ListenerInfo {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.741 -0400", hash_original_field = "5EDF09010D7E466461FD8808B8CD4E69", hash_generated_field = "E3E0A2AA3DAD3D497FEC69653B249F3D")

        protected OnFocusChangeListener mOnFocusChangeListener;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.741 -0400", hash_original_field = "80A99C2B2F1995E5AD3272A74B10D327", hash_generated_field = "3E61511956959B716B0660A267A5DDB6")

        private ArrayList<OnLayoutChangeListener> mOnLayoutChangeListeners;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.741 -0400", hash_original_field = "0929A78505E1C2FDC3DC86E818DAF2F7", hash_generated_field = "7FB9E86C55D3FC29D5ABA87F653B7F5E")

        private CopyOnWriteArrayList<OnAttachStateChangeListener> mOnAttachStateChangeListeners;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.741 -0400", hash_original_field = "AA894545820F13D1E6598CEEF475CCC9", hash_generated_field = "65DB77DAF20E9BC1F7135E1B0259ED25")

        public OnClickListener mOnClickListener;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.741 -0400", hash_original_field = "1F048D1AF1E6F6E42591AF652558180F", hash_generated_field = "5EAF3560EF7F9BB7565DBDF37FE7A2AA")

        protected OnLongClickListener mOnLongClickListener;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.741 -0400", hash_original_field = "6996D732079774CBDC0064D12CA733BA", hash_generated_field = "ADA44730A1380CB9786AA8F8DC39301D")

        protected OnCreateContextMenuListener mOnCreateContextMenuListener;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.741 -0400", hash_original_field = "2A4FF7110738976278729426D6DBEF1F", hash_generated_field = "E9EAFA3F5F183CD7232E888DAC035728")

        private OnKeyListener mOnKeyListener;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.741 -0400", hash_original_field = "E3CF51F249FF4488CF47961A962A84DF", hash_generated_field = "538D6DAEFDEDFC1E31809D314A35E30B")

        private OnTouchListener mOnTouchListener;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.742 -0400", hash_original_field = "3DD3E58D944D15D906FC81C9FFCDF4EB", hash_generated_field = "9960EE08CE022E6057B016EBE9068862")

        private OnHoverListener mOnHoverListener;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.742 -0400", hash_original_field = "1E80FECA9E68B33E73223CA0C1DB09A3", hash_generated_field = "6F0FC6D93F2673180702A6C98E43EB3F")

        private OnGenericMotionListener mOnGenericMotionListener;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.742 -0400", hash_original_field = "F02B5B95401314D0E43EFCAB5D8909E7", hash_generated_field = "BB6976B05A50BD6226C5F3224361BE75")

        private OnDragListener mOnDragListener;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.742 -0400", hash_original_field = "99F78B64D05DD39CB96527A5F31D1B1F", hash_generated_field = "BCD3219BF0AB6E6E91E075D0ABDA8C97")

        private OnSystemUiVisibilityChangeListener mOnSystemUiVisibilityChangeListener;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.742 -0400", hash_original_method = "30D31F497118E5B2F2D60734B7298038", hash_generated_method = "30D31F497118E5B2F2D60734B7298038")
        public ListenerInfo ()
        {
            //Synthesized constructor
        }


    }


    
    public static class DragShadowBuilder {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.742 -0400", hash_original_field = "7D6C73188D7990FE5A4B99F8F090B9EA", hash_generated_field = "08E85E83D778EC246746E6855B21BE82")

        private WeakReference<View> mView;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.743 -0400", hash_original_method = "0B0DC4A9FB3A9C12A7904682E22ADAD8", hash_generated_method = "1DC795717C9F5A625AFA7215FE485718")
        public  DragShadowBuilder(View view) {
            mView = new WeakReference<View>(view);
            // ---------- Original Method ----------
            //mView = new WeakReference<View>(view);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.752 -0400", hash_original_method = "39157EB374747DFD28056DCE3D5D84EC", hash_generated_method = "1653C54FAA06D8A2D8309AF09F1D8648")
        public  DragShadowBuilder() {
            mView = new WeakReference<View>(null);
            // ---------- Original Method ----------
            //mView = new WeakReference<View>(null);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.753 -0400", hash_original_method = "12EFA38B650211F3F0DA583E081C360F", hash_generated_method = "DDA7829336E376A5E3FE3BFFE4C182C4")
        @SuppressWarnings({"JavadocReference"})
        final public View getView() {
            View varB4EAC82CA7396A68D541C85D26508E83_881317198 = null; //Variable for return #1
            varB4EAC82CA7396A68D541C85D26508E83_881317198 = mView.get();
            varB4EAC82CA7396A68D541C85D26508E83_881317198.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_881317198;
            // ---------- Original Method ----------
            //return mView.get();
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.754 -0400", hash_original_method = "7C575AFDC5B7223F530AD0DF57B52E75", hash_generated_method = "309D4A149A47922F79C10803F128928F")
        public void onProvideShadowMetrics(Point shadowSize, Point shadowTouchPoint) {
            //DSFIXME:  CODE0009: Possible callback target function detected
            View view;
            view = mView.get();
            {
                shadowSize.set(view.getWidth(), view.getHeight());
                shadowTouchPoint.set(shadowSize.x / 2, shadowSize.y / 2);
            } //End block
            addTaint(shadowSize.getTaint());
            addTaint(shadowTouchPoint.getTaint());
            // ---------- Original Method ----------
            //final View view = mView.get();
            //if (view != null) {
                //shadowSize.set(view.getWidth(), view.getHeight());
                //shadowTouchPoint.set(shadowSize.x / 2, shadowSize.y / 2);
            //} else {
                //Log.e(View.VIEW_LOG_TAG, "Asked for drag thumb metrics but no view");
            //}
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.761 -0400", hash_original_method = "F5A2B90321F064D0A4C62262ED411079", hash_generated_method = "7893303D9E7CAF274BE60B82BA93AECD")
        public void onDrawShadow(Canvas canvas) {
            //DSFIXME:  CODE0009: Possible callback target function detected
            View view;
            view = mView.get();
            {
                view.draw(canvas);
            } //End block
            addTaint(canvas.getTaint());
            // ---------- Original Method ----------
            //final View view = mView.get();
            //if (view != null) {
                //view.draw(canvas);
            //} else {
                //Log.e(View.VIEW_LOG_TAG, "Asked to draw drag shadow but no view");
            //}
        }

        
    }


    
    public static class MeasureSpec {
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.762 -0400", hash_original_method = "2EA619F0F89BA048B9092F3C9EFB9775", hash_generated_method = "2EA619F0F89BA048B9092F3C9EFB9775")
        public MeasureSpec ()
        {
            //Synthesized constructor
        }


                public static int makeMeasureSpec(int size, int mode) {
            return size + mode;
        }

        
                public static int getMode(int measureSpec) {
            return (measureSpec & MODE_MASK);
        }

        
                public static int getSize(int measureSpec) {
            return (measureSpec & ~MODE_MASK);
        }

        
                public static String toString(int measureSpec) {
            int mode = getMode(measureSpec);
            int size = getSize(measureSpec);
            StringBuilder sb = new StringBuilder("MeasureSpec: ");
            if (mode == UNSPECIFIED)
                sb.append("UNSPECIFIED ");
            else if (mode == EXACTLY)
                sb.append("EXACTLY ");
            else if (mode == AT_MOST)
                sb.append("AT_MOST ");
            else
                sb.append(mode).append(" ");
            sb.append(size);
            return sb.toString();
        }

        
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.773 -0400", hash_original_field = "2765924A26051A383644CD53D86A0033", hash_generated_field = "FC8906679E28CD6914874851BDC7A641")

        private static int MODE_SHIFT = 30;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.773 -0400", hash_original_field = "52AD9C81A7DF8D66D374004C50CC933D", hash_generated_field = "8E042C986818D577C33C4D2D7BE7F620")

        private static int MODE_MASK = 0x3 << MODE_SHIFT;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.773 -0400", hash_original_field = "3E92AA0FE7738A8CA58BD3891BC70636", hash_generated_field = "A67A5415D6CD099BE0676E65CF93997F")

        public static final int UNSPECIFIED = 0 << MODE_SHIFT;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.773 -0400", hash_original_field = "28026BF47C29664BEB4B773976B4D4D7", hash_generated_field = "89B436B79BB9AD4BDF272AC596A5C764")

        public static final int EXACTLY     = 1 << MODE_SHIFT;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.773 -0400", hash_original_field = "0920EC621B50E1BCDC08E0162D119463", hash_generated_field = "29BD87BC74A43396432B999614D66E82")

        public static final int AT_MOST     = 2 << MODE_SHIFT;
    }


    
    class CheckForLongPress implements Runnable {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.773 -0400", hash_original_field = "FECF4FD7C8A3DE72E8F25B320193017C", hash_generated_field = "440C867B7432C58C78CA96D4BD4198E7")

        private int mOriginalWindowAttachCount;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.773 -0400", hash_original_method = "C4F936F21A8F70C0274337932B924B19", hash_generated_method = "C4F936F21A8F70C0274337932B924B19")
        public CheckForLongPress ()
        {
            //Synthesized constructor
        }


        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.774 -0400", hash_original_method = "01CD5F3DDC5391038879A6F141003B2C", hash_generated_method = "998DEAAEF3852C8657E0E2ABF8DCC494")
        public void run() {
            {
                boolean varFB827A206CA2F483F96FD1D1A0A39D9F_1453766273 = (isPressed() && (mParent != null)
                    && mOriginalWindowAttachCount == mWindowAttachCount);
                {
                    {
                        boolean var9620ED46504D3117149539056E35032D_749252692 = (performLongClick());
                        {
                            mHasPerformedLongPress = true;
                        } //End block
                    } //End collapsed parenthetic
                } //End block
            } //End collapsed parenthetic
            // ---------- Original Method ----------
            //if (isPressed() && (mParent != null)
                    //&& mOriginalWindowAttachCount == mWindowAttachCount) {
                //if (performLongClick()) {
                    //mHasPerformedLongPress = true;
                //}
            //}
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.775 -0400", hash_original_method = "52714AB9B90C75C7141A8D07DDC0C4CA", hash_generated_method = "AB01C47E8931054C927C8BF677A5865E")
        public void rememberWindowAttachCount() {
            mOriginalWindowAttachCount = mWindowAttachCount;
            // ---------- Original Method ----------
            //mOriginalWindowAttachCount = mWindowAttachCount;
        }

        
    }


    
    private final class CheckForTap implements Runnable {
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.775 -0400", hash_original_method = "AB5DEBF7CC7D6BE3A48A21837827B410", hash_generated_method = "AB5DEBF7CC7D6BE3A48A21837827B410")
        public CheckForTap ()
        {
            //Synthesized constructor
        }


        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.776 -0400", hash_original_method = "8B4AC781B811E80364C995C3750D80D8", hash_generated_method = "AB19EB04DF28937B1DF516E63AC74EFA")
        public void run() {
            mPrivateFlags &= ~PREPRESSED;
            mPrivateFlags |= PRESSED;
            refreshDrawableState();
            checkForLongClick(ViewConfiguration.getTapTimeout());
            // ---------- Original Method ----------
            //mPrivateFlags &= ~PREPRESSED;
            //mPrivateFlags |= PRESSED;
            //refreshDrawableState();
            //checkForLongClick(ViewConfiguration.getTapTimeout());
        }

        
    }


    
    private final class PerformClick implements Runnable {
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.776 -0400", hash_original_method = "88B4BB962521E66182F1BC580E9EB222", hash_generated_method = "88B4BB962521E66182F1BC580E9EB222")
        public PerformClick ()
        {
            //Synthesized constructor
        }


        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.776 -0400", hash_original_method = "566460B544C528A9D4CEF77A7D21BD20", hash_generated_method = "6E0C9FA1A1110473D753CE2E91D91FD7")
        public void run() {
            performClick();
            // ---------- Original Method ----------
            //performClick();
        }

        
    }


    
    private final class UnsetPressedState implements Runnable {
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.776 -0400", hash_original_method = "6C14B43BA30389F098070D93AD09F5B4", hash_generated_method = "6C14B43BA30389F098070D93AD09F5B4")
        public UnsetPressedState ()
        {
            //Synthesized constructor
        }


        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.789 -0400", hash_original_method = "8ADFD7FB5655235FFF1C14FE5EF3EDC3", hash_generated_method = "51E5C56E0FC59533122E120E30019564")
        public void run() {
            setPressed(false);
            // ---------- Original Method ----------
            //setPressed(false);
        }

        
    }


    
    public static class BaseSavedState extends AbsSavedState {
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.789 -0400", hash_original_method = "0710B1BECA4AE2A64DE9C58BFD4A1161", hash_generated_method = "EE939DE64E4E13C6649033F638632686")
        public  BaseSavedState(Parcel source) {
            super(source);
            addTaint(source.getTaint());
            // ---------- Original Method ----------
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.789 -0400", hash_original_method = "C61013DFD638DC996F3EF4CC52F40C74", hash_generated_method = "E01D93B6DF9621DF15B2FA6FE9F6F642")
        public  BaseSavedState(Parcelable superState) {
            super(superState);
            addTaint(superState.getTaint());
            // ---------- Original Method ----------
        }

        
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.789 -0400", hash_original_field = "F69D27D6C01716FC1482B26F47E53A23", hash_generated_field = "1603EC57FF7A24DE0B9CE75D44794F2A")

        public static final Parcelable.Creator<BaseSavedState> CREATOR =
                new Parcelable.Creator<BaseSavedState>() {
            public BaseSavedState createFromParcel(Parcel in) {
                return new BaseSavedState(in);
            }

            public BaseSavedState[] newArray(int size) {
                return new BaseSavedState[size];
            }
        };
    }


    
    static class AttachInfo {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.790 -0400", hash_original_field = "585864B1433B33593F88424BEC9E09EF", hash_generated_field = "380F2E6581760A76AE57EA2F3E243A67")

        IWindowSession mSession;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.790 -0400", hash_original_field = "F4214BE1FFE044F8CA79EEDDDED72016", hash_generated_field = "B4A12BFD7130A50D27FFF405887EA83D")

        IWindow mWindow;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.790 -0400", hash_original_field = "2C6E9C841DFC028F3BFE93152F5069A6", hash_generated_field = "794F056D6C296F490A191063CBE7D73B")

        IBinder mWindowToken;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.790 -0400", hash_original_field = "560034CC43D7EBF06318F6BD9836E171", hash_generated_field = "D9C5224ACF349426CF4E47DACA6240CF")

        Callbacks mRootCallbacks;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.790 -0400", hash_original_field = "0512EB3F1C233A640787AA69FB3C6BC3", hash_generated_field = "CDD863CC905A95D66D4F1A2915FF3C29")

        HardwareCanvas mHardwareCanvas;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.790 -0400", hash_original_field = "03503F4E2878305C59038D192AB3AC15", hash_generated_field = "6D0C26C611FBD233667A9FA9104CED21")

        View mRootView;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.790 -0400", hash_original_field = "53546B13F3B3308728C0CD603626602C", hash_generated_field = "942BE5BD2F034C6C8D3F0E7C02B28BE8")

        IBinder mPanelParentWindowToken;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.790 -0400", hash_original_field = "76C3E3B9188F3B101287AE8BD0308DA5", hash_generated_field = "718CD3BE0BDD64302FC8F6AC61AA9980")

        Surface mSurface;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.790 -0400", hash_original_field = "6AB4A5F453379ED66BAA79CE64FDFD98", hash_generated_field = "68B6EC09532005E80B3FF968D0432D9B")

        boolean mHardwareAccelerated;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.790 -0400", hash_original_field = "53166A41533AEFA4A0E24E658361324F", hash_generated_field = "74EE98E39C4C179E4AA66BC509EA4A56")

        boolean mHardwareAccelerationRequested;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.790 -0400", hash_original_field = "8B3DB6BF4469C5CF02B1DDD03F5B6055", hash_generated_field = "D13B4D472586A36E031009AA64FCFC65")

        HardwareRenderer mHardwareRenderer;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.790 -0400", hash_original_field = "BA56BB6DE53CE1621F0CD780B0B7B006", hash_generated_field = "D30A01C9AA1020553FD9B357D21DBD2D")

        float mApplicationScale;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.790 -0400", hash_original_field = "7C5648CE63D60A3EFBF527D9F67B890F", hash_generated_field = "491DD861F0499CC9AE05718FA07FF84E")

        boolean mScalingRequired;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.790 -0400", hash_original_field = "A67458ADF8F3C4889CE90A27B584015A", hash_generated_field = "463612CF0072B2D91F7638B2CC4F4779")

        boolean mTurnOffWindowResizeAnim;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.790 -0400", hash_original_field = "EAF515EB51AE996EDE42F4E5B627AD5E", hash_generated_field = "027A7FFA44C832AF6DBE17CAF301CFD3")

        int mWindowLeft;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.790 -0400", hash_original_field = "0F58D99361211F88A00F2836CB54C580", hash_generated_field = "2CCD3F58E4022E0E51EBBEE7A97CEEC6")

        int mWindowTop;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.790 -0400", hash_original_field = "07DA16BCBAA87C3CB8254BCB048BC847", hash_generated_field = "1E46B60B1C8864BF9327E726C9FC6A9D")

        boolean mUse32BitDrawingCache;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.790 -0400", hash_original_field = "5E83131046575CE08F0EE6BB5ECA21AF", hash_generated_field = "290E9F8E6A73A2B3125DD9995CBD7840")

        Rect mContentInsets = new Rect();
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.790 -0400", hash_original_field = "CDCC88BCD1FA2B6E7E3A22E8D09269CC", hash_generated_field = "FFC6F470A4680792125A2753E4F0C9F9")

        Rect mVisibleInsets = new Rect();
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.791 -0400", hash_original_field = "B9C1A8313191AF75B3FDD14AE8272BBF", hash_generated_field = "2407BE01A9B70C13966089FA004856A5")

        ViewTreeObserver.InternalInsetsInfo mGivenInternalInsets = new ViewTreeObserver.InternalInsetsInfo();
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.791 -0400", hash_original_field = "19E9C980D069B1B740AB2CC0BC312416", hash_generated_field = "B6DD4962B6B0417BCEB3D785E8763FEB")

        ArrayList<View> mScrollContainers = new ArrayList<View>();
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.791 -0400", hash_original_field = "D89222A2A8F942CB3BB02A6B7C95EB1C", hash_generated_field = "DEFCA1253F755C96C140877CEA2F5326")

        KeyEvent.DispatcherState mKeyDispatchState = new KeyEvent.DispatcherState();
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.791 -0400", hash_original_field = "057FC6CF6E6C2229CBCF27ECD410FEE9", hash_generated_field = "A03D646FF0D655946847407BDB557086")

        boolean mHasWindowFocus;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.791 -0400", hash_original_field = "9DB03FBC1019FA899D003FDB9C62771D", hash_generated_field = "3A96D9774881A4202AEE797B3EE3C1D7")

        int mWindowVisibility;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.791 -0400", hash_original_field = "993AB8FD817B53B283DAECCB59F45A16", hash_generated_field = "28D76E2182EF97A430A42D24DED52D44")

        long mDrawingTime;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.791 -0400", hash_original_field = "431974CC97F96D1DF9B4087E57810191", hash_generated_field = "37B2655ADC8B3B21EEDE7EC8BFE1453D")

        boolean mIgnoreDirtyState;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.791 -0400", hash_original_field = "6C8B75CB378D7E6E081C4786CF1119C4", hash_generated_field = "E92F335BE2D9512E3DDCA1603BFA0A77")

        boolean mSetIgnoreDirtyState = false;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.791 -0400", hash_original_field = "8AA89BDDF6ED14A8B3486A6AC69598E8", hash_generated_field = "24BF563E82E7B3377EAF3AE738C5792F")

        boolean mInTouchMode;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.791 -0400", hash_original_field = "C60259BC6FCF33DB61A1381FA9E441E6", hash_generated_field = "E29840F7AED8F4EF12BD623D6B7943B5")

        boolean mRecomputeGlobalAttributes;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.791 -0400", hash_original_field = "20C86703DA01BC32FBE3795085CE94E7", hash_generated_field = "D34584B0CD3D73B43FC67A71CBBCEDA5")

        boolean mForceReportNewAttributes;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.791 -0400", hash_original_field = "18D19E1FD7B728605825EF18061C519E", hash_generated_field = "3FE2095DEBDC328EDDA9F609AE6396C1")

        boolean mKeepScreenOn;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.791 -0400", hash_original_field = "D03AF504A7FB8D1F39097D83B42BDFFD", hash_generated_field = "BA594DC97B7780A916BA2DC51EC8AB28")

        int mSystemUiVisibility;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.791 -0400", hash_original_field = "AE823141C20BCF628969BBCA7EBCC5B2", hash_generated_field = "DE4F434008ACCD754FC4F174AA6749F2")

        boolean mHasSystemUiListeners;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.791 -0400", hash_original_field = "C364A0DEF59116677330BF528B9D4525", hash_generated_field = "880659755C401DC1FD279B3CDCEB5013")

        boolean mViewVisibilityChanged;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.791 -0400", hash_original_field = "578BCFB5A4EF012FBD6B92643DCE1C39", hash_generated_field = "EC57C8BF7094A89AF638ACD00871F015")

        boolean mViewScrollChanged;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.791 -0400", hash_original_field = "9686DBE15950AE62BFE7FE798270EC39", hash_generated_field = "C3C53F9010127A157023B905F36D534F")

        int[] mTransparentLocation = new int[2];
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.791 -0400", hash_original_field = "EE057DEB82EEF457E13733F3DEDC0B17", hash_generated_field = "95AE803E723103E1D490A230691BF2D8")

        int[] mInvalidateChildLocation = new int[2];
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.791 -0400", hash_original_field = "00AA4723378DFABB790D518F5A26D40E", hash_generated_field = "03A968061B896F83CD0DE645EA8735B3")

        float[] mTmpTransformLocation = new float[2];
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.791 -0400", hash_original_field = "58CDF2679DDF2A5B177BCDC3A6E7BA17", hash_generated_field = "3E601C26EBCAD7D4AC2FBD4D14A7355C")

        ViewTreeObserver mTreeObserver = new ViewTreeObserver();
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.791 -0400", hash_original_field = "B27B52DEE91FF1260919C0152F8A3F5A", hash_generated_field = "D8DB47E921EE865182E76421C432A14B")

        Canvas mCanvas;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.791 -0400", hash_original_field = "C78BEDFC523DB73DF63EFB071AF1C35B", hash_generated_field = "A163099B522120C606A3CA562F90E927")

        Handler mHandler;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.791 -0400", hash_original_field = "EBC79DD6C9AD45ACA6AB5072C3340A8B", hash_generated_field = "64B8CC68905174D2EB397C6FDD469ED5")

        Rect mTmpInvalRect = new Rect();
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.791 -0400", hash_original_field = "A9C4430F886F001DD9A9AF970C3078A8", hash_generated_field = "03A665FC8D6526486D1AD8B0473EC5F3")

        RectF mTmpTransformRect = new RectF();
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.791 -0400", hash_original_field = "2251E9E672C5A755A127E5EF1B510FD8", hash_generated_field = "A0A8D04CA2A965DD3F9D9152367A6522")

        ArrayList<View> mFocusablesTempList = new ArrayList<View>(24);
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.791 -0400", hash_original_field = "F4C54CBDEE3AB8CB436DCB41CB5AF49E", hash_generated_field = "2E729681C5CD99C66AC4181B19223EFE")

        int mAccessibilityWindowId = View.NO_ID;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.792 -0400", hash_original_method = "0CDE5ADA82BD9455683884E38A135C3D", hash_generated_method = "48395FA4C7CA9BF9A79558648C28309A")
          AttachInfo(IWindowSession session, IWindow window,
                Handler handler, Callbacks effectPlayer) {
            mSession = session;
            mWindow = window;
            mWindowToken = window.asBinder();
            mHandler = handler;
            mRootCallbacks = effectPlayer;
            // ---------- Original Method ----------
            //mSession = session;
            //mWindow = window;
            //mWindowToken = window.asBinder();
            //mHandler = handler;
            //mRootCallbacks = effectPlayer;
        }

        
        static class InvalidateInfo implements Poolable<InvalidateInfo> {
            @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.803 -0400", hash_original_field = "2271A9775971F952514B94408144FAA0", hash_generated_field = "E9AD1A72A0CA1F1648249A15490614B6")

            private InvalidateInfo mNext;
            @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.803 -0400", hash_original_field = "224D05F4261498DA1D9DF38424832532", hash_generated_field = "BD952C5DD2D86B34B4D5F4AFE196E837")

            private boolean mIsPooled;
            @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.804 -0400", hash_original_field = "42AEFBAE01D2DFD981F7DA7D823D689E", hash_generated_field = "4A3D67FC5D08B2108A5D942762FE7F37")

            View target;
            @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.804 -0400", hash_original_field = "811882FECD5C7618D7099EBBD39EA254", hash_generated_field = "F8DAB7F926CD7972429F7B948D9F5533")

            int left;
            @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.804 -0400", hash_original_field = "B28354B543375BFA94DABAEDA722927F", hash_generated_field = "9620536E5A5D6E12CC93092A5EBB857E")

            int top;
            @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.804 -0400", hash_original_field = "7C4F29407893C334A6CB7A87BF045C0D", hash_generated_field = "49C6BE2EEC7270CFEAEFBD796F2C423B")

            int right;
            @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.804 -0400", hash_original_field = "71F262D796BED1AB30E8A2D5A8DDEE6F", hash_generated_field = "7F74B1869951CB3A6660AA746710A714")

            int bottom;
            
            @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.804 -0400", hash_original_method = "7F8409C46E15AE6EC7087A7F4E97E2BF", hash_generated_method = "7F8409C46E15AE6EC7087A7F4E97E2BF")
            public InvalidateInfo ()
            {
                //Synthesized constructor
            }


            @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.804 -0400", hash_original_method = "AAFC70DDA5FB82CEF5E58C1F01C303B7", hash_generated_method = "F6E2001C60EDD672A67B8BFFD0EA80B4")
            public void setNextPoolable(InvalidateInfo element) {
                mNext = element;
                // ---------- Original Method ----------
                //mNext = element;
            }

            
            @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.805 -0400", hash_original_method = "8D8571C3CBC87318B5EA7A031BC44388", hash_generated_method = "2B97EF6F5E444BAF78CDF22CF13B266A")
            public InvalidateInfo getNextPoolable() {
                InvalidateInfo varB4EAC82CA7396A68D541C85D26508E83_1407070032 = null; //Variable for return #1
                varB4EAC82CA7396A68D541C85D26508E83_1407070032 = mNext;
                varB4EAC82CA7396A68D541C85D26508E83_1407070032.addTaint(getTaint()); //Add taint from parent
                return varB4EAC82CA7396A68D541C85D26508E83_1407070032;
                // ---------- Original Method ----------
                //return mNext;
            }

            
                        static InvalidateInfo acquire() {
                return sPool.acquire();
            }

            
            @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.806 -0400", hash_original_method = "8830525D8149BF52E4AE797FF2AC88D3", hash_generated_method = "E9DF48B1A3244CDF3D09900CA1C3DD95")
             void release() {
                sPool.release(this);
                // ---------- Original Method ----------
                //sPool.release(this);
            }

            
            @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.806 -0400", hash_original_method = "4CB4F04617162A1F2BEBBAC63163A5FB", hash_generated_method = "D7214516C833D3587E00E19366440845")
            public boolean isPooled() {
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_175994784 = getTaintBoolean();
                return var84E2C64F38F78BA3EA5C905AB5A2DA27_175994784;
                // ---------- Original Method ----------
                //return mIsPooled;
            }

            
            @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.806 -0400", hash_original_method = "CCE0492C3FBB65D8A1644633FE9AA3DF", hash_generated_method = "31CEC37D69D770078DC2E4A0F4797B2A")
            public void setPooled(boolean isPooled) {
                mIsPooled = isPooled;
                // ---------- Original Method ----------
                //mIsPooled = isPooled;
            }

            
            @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.806 -0400", hash_original_field = "39F2AAED9AA054FDE5289F88EBF184A3", hash_generated_field = "395DFC67437CBD28BAA3576C6A99F79B")

            private static int POOL_LIMIT = 10;
            @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.807 -0400", hash_original_field = "A44E5FD188239AC11EA0848B9AD6048D", hash_generated_field = "5D3D165F4667FB0AC8A96C5DE639710F")

            private static Pool<InvalidateInfo> sPool = Pools.synchronizedPool(
                    Pools.finitePool(new PoolableManager<InvalidateInfo>() {
                        public InvalidateInfo newInstance() {
                            return new InvalidateInfo();
                        }

                        public void onAcquired(InvalidateInfo element) {
                        }

                        public void onReleased(InvalidateInfo element) {
                            element.target = null;
                        }
                    }, POOL_LIMIT)
            );
        }


        
        interface Callbacks {
            void playSoundEffect(int effectId);
            boolean performHapticFeedback(int effectId, boolean always);
        }
        
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.807 -0400", hash_original_field = "D23B25F3A767CD848A78CCBE0431BFF8", hash_generated_field = "AEA3E45F1114876B24C23295044E6733")

        static int INVALIDATE_MSG = 0x1;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.807 -0400", hash_original_field = "83760A1BB0DB99F124FB0ACBE07D9D1C", hash_generated_field = "6A38B579DD9070B853DE7AAE5C28D57E")

        static int INVALIDATE_RECT_MSG = 0x2;
    }


    
    private static class ScrollabilityCache implements Runnable {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.807 -0400", hash_original_field = "36CF4BED2347A59BA24D1080B4773D94", hash_generated_field = "C6A1369EC898F10B405072E1D6B6F8F1")

        public boolean fadeScrollBars;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.807 -0400", hash_original_field = "6F6698AC7C7E3B95006C569A10C73321", hash_generated_field = "1655F035B56E41B8BE16E5CF56B77BA2")

        public int fadingEdgeLength;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.807 -0400", hash_original_field = "82987CB0DFB57EF0D7E6071CBAEED976", hash_generated_field = "0B6D856A35EB0627FF7887D758165295")

        public int scrollBarDefaultDelayBeforeFade;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.807 -0400", hash_original_field = "F330F5B1F62629DE00AA6130936F3A51", hash_generated_field = "E863540FC8628DCB2E031D759E080999")

        public int scrollBarFadeDuration;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.807 -0400", hash_original_field = "16D99E080DA3394608D0C10D69303259", hash_generated_field = "83B1C5317C031D0AB20405882919848B")

        public int scrollBarSize;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.807 -0400", hash_original_field = "5D1F5486649A4BAD621B1C4B13A5092E", hash_generated_field = "C08FDE67EA8E9E077C57F9B7B9A2DF77")

        public ScrollBarDrawable scrollBar;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.807 -0400", hash_original_field = "4CCF1E17C0001A4A25316D33537A790B", hash_generated_field = "CB96A972AA75A47BFD6582D710EC82DF")

        public float[] interpolatorValues;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.807 -0400", hash_original_field = "67B3DBA8BC6778101892EB77249DB32E", hash_generated_field = "56B8BC9706D6E065A7599937E8F804CC")

        public View host;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.807 -0400", hash_original_field = "C1940AEEB9693A02E28C52EB85CE261C", hash_generated_field = "7AA4ED035C35711F4B33B0135B4A7789")

        public Paint paint;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.807 -0400", hash_original_field = "21B72C0B7ADC5C7B4A50FFCB90D92DD6", hash_generated_field = "2ED3478F7527E1ECF1A41F8EA29E0792")

        public Matrix matrix;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.807 -0400", hash_original_field = "842E3E5FE6C1B834705ABD4BCB213342", hash_generated_field = "BD5E2F7CC0958EF9E9784897D7D71294")

        public Shader shader;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.807 -0400", hash_original_field = "9171F43D541F940B89A7FB26C6794AE8", hash_generated_field = "5E24D5E47F6A869472884432C044336D")

        public Interpolator scrollBarInterpolator = new Interpolator(1, 2);
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.807 -0400", hash_original_field = "83ADDA5FC3DEE395042A82E7A1746419", hash_generated_field = "FA7A925863D78B977D2FC3469F1DC9E9")

        public long fadeStartTime;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.807 -0400", hash_original_field = "60A253603933185CFAB4CA7DE20B9E69", hash_generated_field = "41AF84CAED377B81AC74E102DF2E9D6D")

        public int state = OFF;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.807 -0400", hash_original_field = "F62531BE971FA5E1FC4011E8E61EFD62", hash_generated_field = "AC03B4B52C8DAA90037D992009D92CB0")

        private int mLastColor;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.825 -0400", hash_original_method = "AB4B2D8281C9D79EC8FB184A37CE88FD", hash_generated_method = "05F8FAC0C3110F2BB5070A90BB23F048")
        public  ScrollabilityCache(ViewConfiguration configuration, View host) {
            fadingEdgeLength = configuration.getScaledFadingEdgeLength();
            scrollBarSize = configuration.getScaledScrollBarSize();
            scrollBarDefaultDelayBeforeFade = ViewConfiguration.getScrollDefaultDelay();
            scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration();
            paint = new Paint();
            matrix = new Matrix();
            shader = new LinearGradient(0, 0, 0, 1, 0xFF000000, 0, Shader.TileMode.CLAMP);
            paint.setShader(shader);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            this.host = host;
            // ---------- Original Method ----------
            //fadingEdgeLength = configuration.getScaledFadingEdgeLength();
            //scrollBarSize = configuration.getScaledScrollBarSize();
            //scrollBarDefaultDelayBeforeFade = ViewConfiguration.getScrollDefaultDelay();
            //scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration();
            //paint = new Paint();
            //matrix = new Matrix();
            //shader = new LinearGradient(0, 0, 0, 1, 0xFF000000, 0, Shader.TileMode.CLAMP);
            //paint.setShader(shader);
            //paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            //this.host = host;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.826 -0400", hash_original_method = "96C29AC8476B3BD548A01E55E35CBC04", hash_generated_method = "0CE02932C57478EA22B2478361CDDFCF")
        public void setFadeColor(int color) {
            {
                mLastColor = color;
                color |= 0xFF000000;
                shader = new LinearGradient(0, 0, 0, 1, color | 0xFF000000,
                        color & 0x00FFFFFF, Shader.TileMode.CLAMP);
                paint.setShader(shader);
                paint.setXfermode(null);
            } //End block
            // ---------- Original Method ----------
            //if (color != 0 && color != mLastColor) {
                //mLastColor = color;
                //color |= 0xFF000000;
                //shader = new LinearGradient(0, 0, 0, 1, color | 0xFF000000,
                        //color & 0x00FFFFFF, Shader.TileMode.CLAMP);
                //paint.setShader(shader);
                //paint.setXfermode(null);
            //}
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.827 -0400", hash_original_method = "14A33F30726B3AE59CE909C1A535F2F0", hash_generated_method = "D0408B972431EC505803D096E7C8DC6F")
        public void run() {
            long now;
            now = AnimationUtils.currentAnimationTimeMillis();
            {
                int nextFrame;
                nextFrame = (int) now;
                int framesCount;
                framesCount = 0;
                Interpolator interpolator;
                interpolator = scrollBarInterpolator;
                interpolator.setKeyFrame(framesCount++, nextFrame, OPAQUE);
                nextFrame += scrollBarFadeDuration;
                interpolator.setKeyFrame(framesCount, nextFrame, TRANSPARENT);
                state = FADING;
                host.invalidate(true);
            } //End block
            // ---------- Original Method ----------
            //long now = AnimationUtils.currentAnimationTimeMillis();
            //if (now >= fadeStartTime) {
                //int nextFrame = (int) now;
                //int framesCount = 0;
                //Interpolator interpolator = scrollBarInterpolator;
                //interpolator.setKeyFrame(framesCount++, nextFrame, OPAQUE);
                //nextFrame += scrollBarFadeDuration;
                //interpolator.setKeyFrame(framesCount, nextFrame, TRANSPARENT);
                //state = FADING;
                //host.invalidate(true);
            //}
        }

        
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.828 -0400", hash_original_field = "5A25F59FDD7EADE938232D542AC9DF31", hash_generated_field = "7C2FCAABFF0839BC46F5A1C3AF188D77")

        public static final int OFF = 0;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.829 -0400", hash_original_field = "D4174A52FA4F808F71BC2954FF2D0727", hash_generated_field = "4AEC3247A48615FF5865CC0B1A3C7705")

        public static final int ON = 1;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.834 -0400", hash_original_field = "EC0311F896B24AC1A92AD2C030F6530B", hash_generated_field = "656FDD706C20A529B22AC373F45EB16E")

        public static final int FADING = 2;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.834 -0400", hash_original_field = "AE0BB3ACA40F6E07B62845DE2F1E0641", hash_generated_field = "EB52E5107EBBF3FB0D5F008483E7DD4B")

        private static float[] OPAQUE = { 255 };
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.834 -0400", hash_original_field = "128E3645098B3255219073257445D573", hash_generated_field = "67FD7E89532F090261DC8EE2E95E3700")

        private static float[] TRANSPARENT = { 0.0f };
    }


    
    private class SendViewScrolledAccessibilityEvent implements Runnable {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.840 -0400", hash_original_field = "AD12063E8FC163523FAE892D8D8BEA2B", hash_generated_field = "8E5087238AE27D181E6487D7D8E8CADB")

        public volatile boolean mIsPending;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.840 -0400", hash_original_method = "67D827D7B507D3EF133C26B0E057ECB2", hash_generated_method = "67D827D7B507D3EF133C26B0E057ECB2")
        public SendViewScrolledAccessibilityEvent ()
        {
            //Synthesized constructor
        }


        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.840 -0400", hash_original_method = "13F513362861425D1A8D234F009B3F81", hash_generated_method = "53A034A606164AD076ADC134C6992AE7")
        public void run() {
            sendAccessibilityEvent(AccessibilityEvent.TYPE_VIEW_SCROLLED);
            mIsPending = false;
            // ---------- Original Method ----------
            //sendAccessibilityEvent(AccessibilityEvent.TYPE_VIEW_SCROLLED);
            //mIsPending = false;
        }

        
    }


    
    public static class AccessibilityDelegate {
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.841 -0400", hash_original_method = "B81C1E38B66B1195ED1D00E194D402D3", hash_generated_method = "B81C1E38B66B1195ED1D00E194D402D3")
        public AccessibilityDelegate ()
        {
            //Synthesized constructor
        }


        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.841 -0400", hash_original_method = "BC0125D947E50318963E057CA3B612F3", hash_generated_method = "11B9A1B40697495580EE81AD22F7F373")
        public void sendAccessibilityEvent(View host, int eventType) {
            host.sendAccessibilityEventInternal(eventType);
            addTaint(host.getTaint());
            addTaint(eventType);
            // ---------- Original Method ----------
            //host.sendAccessibilityEventInternal(eventType);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.841 -0400", hash_original_method = "C58028C1DB413A86B928F475AB0100FB", hash_generated_method = "F977BB689C0D190F9BB723A8F0E63AF2")
        public void sendAccessibilityEventUnchecked(View host, AccessibilityEvent event) {
            host.sendAccessibilityEventUncheckedInternal(event);
            addTaint(host.getTaint());
            addTaint(event.getTaint());
            // ---------- Original Method ----------
            //host.sendAccessibilityEventUncheckedInternal(event);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.842 -0400", hash_original_method = "5A39804E8EC5B74D862B80B866B8F576", hash_generated_method = "73734A2BB94D612CE59DAD14AC6F36F7")
        public boolean dispatchPopulateAccessibilityEvent(View host, AccessibilityEvent event) {
            boolean var07851A778B664A4380C5AF2DDC5C4AEC_61959466 = (host.dispatchPopulateAccessibilityEventInternal(event));
            addTaint(host.getTaint());
            addTaint(event.getTaint());
            boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_46626468 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_46626468;
            // ---------- Original Method ----------
            //return host.dispatchPopulateAccessibilityEventInternal(event);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.842 -0400", hash_original_method = "D41C8BE91A25AAE323FB25E37AFB61F0", hash_generated_method = "8BD8A02C2629352DFDDE1159CA67BC87")
        public void onPopulateAccessibilityEvent(View host, AccessibilityEvent event) {
            //DSFIXME:  CODE0009: Possible callback target function detected
            host.onPopulateAccessibilityEventInternal(event);
            addTaint(host.getTaint());
            addTaint(event.getTaint());
            // ---------- Original Method ----------
            //host.onPopulateAccessibilityEventInternal(event);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.843 -0400", hash_original_method = "D490954174BD599BC02D1199D955E569", hash_generated_method = "3B81173127E6A60F360915F54C4470BC")
        public void onInitializeAccessibilityEvent(View host, AccessibilityEvent event) {
            //DSFIXME:  CODE0009: Possible callback target function detected
            host.onInitializeAccessibilityEventInternal(event);
            addTaint(host.getTaint());
            addTaint(event.getTaint());
            // ---------- Original Method ----------
            //host.onInitializeAccessibilityEventInternal(event);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.843 -0400", hash_original_method = "E392CA582CA236DC9AD11007B17CF1A9", hash_generated_method = "6019E578184B08E640FCA5EA063DDEF4")
        public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfo info) {
            //DSFIXME:  CODE0009: Possible callback target function detected
            host.onInitializeAccessibilityNodeInfoInternal(info);
            addTaint(host.getTaint());
            addTaint(info.getTaint());
            // ---------- Original Method ----------
            //host.onInitializeAccessibilityNodeInfoInternal(info);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.847 -0400", hash_original_method = "4AE2346D08FE5ECB588C47045A997DF1", hash_generated_method = "DF07C728BB7EE7A0A9953EB48B477D66")
        public boolean onRequestSendAccessibilityEvent(ViewGroup host, View child,
                AccessibilityEvent event) {
            //DSFIXME:  CODE0009: Possible callback target function detected
            boolean var9559FB15F4F4402574377E5F8741F1FA_1020035790 = (host.onRequestSendAccessibilityEventInternal(child, event));
            addTaint(host.getTaint());
            addTaint(child.getTaint());
            addTaint(event.getTaint());
            boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1650542247 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_1650542247;
            // ---------- Original Method ----------
            //return host.onRequestSendAccessibilityEventInternal(child, event);
        }

        
    }


    
    public interface OnLayoutChangeListener {
        
        void onLayoutChange(View v, int left, int top, int right, int bottom,
            int oldLeft, int oldTop, int oldRight, int oldBottom);
    }
    
    public interface OnKeyListener {
        
        boolean onKey(View v, int keyCode, KeyEvent event);
    }
    
    public interface OnTouchListener {
        
        boolean onTouch(View v, MotionEvent event);
    }
    
    public interface OnHoverListener {
        
        boolean onHover(View v, MotionEvent event);
    }
    
    public interface OnGenericMotionListener {
        
        boolean onGenericMotion(View v, MotionEvent event);
    }
    
    public interface OnLongClickListener {
        
        boolean onLongClick(View v);
    }
    
    public interface OnDragListener {
        
        boolean onDrag(View v, DragEvent event);
    }
    
    public interface OnFocusChangeListener {
        
        void onFocusChange(View v, boolean hasFocus);
    }
    
    public interface OnClickListener {
        
        void onClick(View v);
    }
    
    public interface OnCreateContextMenuListener {
        
        void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo);
    }
    
    public interface OnSystemUiVisibilityChangeListener {
        
        public void onSystemUiVisibilityChange(int visibility);
    }
    
    public interface OnAttachStateChangeListener {
        
        public void onViewAttachedToWindow(View v);
        
        public void onViewDetachedFromWindow(View v);
    }
    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.848 -0400", hash_original_field = "0F6F0EB642B3F46DE2B2DF48DA4427EF", hash_generated_field = "B7C4E93D97D072890A37A56076D870F8")

    private static boolean DBG = false;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.848 -0400", hash_original_field = "B21E54ADF6F1EC7B79C6C1AE44FBD181", hash_generated_field = "E4BF36869D2EA1A97A35B0BE7176C11E")

    protected static String VIEW_LOG_TAG = "View";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.848 -0400", hash_original_field = "88123DE8DF5143F6086D0A4BB7B00CB8", hash_generated_field = "181E1190C48C3A15B723E1972525FFE6")

    public static final int NO_ID = -1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.848 -0400", hash_original_field = "CFE01EBDF16FDABBC2834404C207239C", hash_generated_field = "CE0025BBE1AAEB5A44E72D0FE168C2C2")

    private static int NOT_FOCUSABLE = 0x00000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.848 -0400", hash_original_field = "0AD9E0CCD4B721DF1CC94B96EC4D5898", hash_generated_field = "365D41C0C061373622DBF977EC3320D3")

    private static int FOCUSABLE = 0x00000001;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.848 -0400", hash_original_field = "719E9855B3D953E2EE9987A580012D6B", hash_generated_field = "E7795005C63A7AD4BE59B03ED39E80B2")

    private static int FOCUSABLE_MASK = 0x00000001;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.848 -0400", hash_original_field = "6FB94F3D7A7CDF037678C662A9689D7D", hash_generated_field = "9B9574D4112C34DDC1B183C0C0C4618C")

    private static int FITS_SYSTEM_WINDOWS = 0x00000002;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.848 -0400", hash_original_field = "136D41ED3DF9DD9EF3A9A81DADD58165", hash_generated_field = "829F05479D332281B757C73E71A7184A")

    public static final int VISIBLE = 0x00000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.848 -0400", hash_original_field = "0DA34D083070BE2C2BFC30813441B002", hash_generated_field = "24C25C40295AD2D0D5F7C693CBE8FFEE")

    public static final int INVISIBLE = 0x00000004;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.848 -0400", hash_original_field = "E019C9B7503AD69082F721EC41DE4F50", hash_generated_field = "DADE7E47CBB0DBC6ACF868046DED7DE3")

    public static final int GONE = 0x00000008;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.848 -0400", hash_original_field = "638A50E778AE3706DD0D02F81C3A69AB", hash_generated_field = "7C3DD525CEC655ACA240469420FF19A4")

    static int VISIBILITY_MASK = 0x0000000C;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.848 -0400", hash_original_field = "B46EF765402AAEC87B7D8B6CB93C354D", hash_generated_field = "D3CD6D5211F36B20945AA8CF63F23F35")

    private static int[] VISIBILITY_FLAGS = {VISIBLE, INVISIBLE, GONE};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.848 -0400", hash_original_field = "943A232E38D580886D6006ECC118446C", hash_generated_field = "CBD63FD76537756D8684E73758810A63")

    static int ENABLED = 0x00000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.848 -0400", hash_original_field = "C0CCF30A42F7B85896FEB21D5D80087A", hash_generated_field = "42DEF0D9F1C9C5B116788D8BC105ACE2")

    static int DISABLED = 0x00000020;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.848 -0400", hash_original_field = "09EBD9C5DC9B7133964216D0458D4EB5", hash_generated_field = "9E6415F22E722219962D8606EFDA8EE0")

    static int ENABLED_MASK = 0x00000020;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.848 -0400", hash_original_field = "223956AEDC09AE3486F61724D9FE32DF", hash_generated_field = "3986FC0081272995AB19C5DDD14A74CA")

    static int WILL_NOT_DRAW = 0x00000080;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.848 -0400", hash_original_field = "72902DCD9DEC9AD627AE18B829F03F6C", hash_generated_field = "3DD9CD1B1AEDA89C8C294F9C3500484A")

    static int DRAW_MASK = 0x00000080;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.848 -0400", hash_original_field = "C0E5737567CB3157DA185632001CA225", hash_generated_field = "AE5BC816528880F23B2972F5FA0FFF58")

    static int SCROLLBARS_NONE = 0x00000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.848 -0400", hash_original_field = "8D26450D077C1E00326EA645922486EF", hash_generated_field = "42D4B80C21CFCDFB141AB559AA8A028A")

    static int SCROLLBARS_HORIZONTAL = 0x00000100;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.848 -0400", hash_original_field = "BAA86D9ECDBE9A3AEEAC46D1513B3AF6", hash_generated_field = "CF74E281FDBC97A51E2B182B2390341A")

    static int SCROLLBARS_VERTICAL = 0x00000200;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.848 -0400", hash_original_field = "AEDA673F22AC5A75D39DAD07ACEB90E6", hash_generated_field = "1621669458EAFD1C3F71F8FDC44132EA")

    static int SCROLLBARS_MASK = 0x00000300;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.848 -0400", hash_original_field = "73E0703DA900EFA90928C97AE715BC6D", hash_generated_field = "6912B346D54B318500407F5DCF1ECB74")

    static int FILTER_TOUCHES_WHEN_OBSCURED = 0x00000400;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.848 -0400", hash_original_field = "D24F1A8E6549666B005031D398FEE558", hash_generated_field = "326636B10900EE177468533417B54A2C")

    static int FADING_EDGE_NONE = 0x00000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.849 -0400", hash_original_field = "3A7A261ACE5B30ECA9279C1BE5DE1696", hash_generated_field = "B4BF003BF00C4C1D0431D27380EA0DBE")

    static int FADING_EDGE_HORIZONTAL = 0x00001000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.849 -0400", hash_original_field = "EEC6CF3A171DE7EDA9EC195460F15A88", hash_generated_field = "1661226B27FE44EE4EB145CFF3483D60")

    static int FADING_EDGE_VERTICAL = 0x00002000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.849 -0400", hash_original_field = "18F27278FD3AAB92633A835806666397", hash_generated_field = "F9657FC1A89EBF6E919C6161B9312958")

    static int FADING_EDGE_MASK = 0x00003000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.849 -0400", hash_original_field = "45B15C364F25251A3C127619E90B5F7F", hash_generated_field = "A88685D39BA5E1ACBE24818E882A14BD")

    static int CLICKABLE = 0x00004000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.849 -0400", hash_original_field = "51A3AB9F876C508B5C1D05DB9E1A930D", hash_generated_field = "801504E75B195585AB4D8FD935F89D3D")

    static int DRAWING_CACHE_ENABLED = 0x00008000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.849 -0400", hash_original_field = "D8742CC8D1D72215607E7D4AC10BC8C0", hash_generated_field = "FBF0315CF0304F2C5F3BE1037056CB80")

    static int SAVE_DISABLED = 0x000010000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.849 -0400", hash_original_field = "A75506DA371A486D311CDD4D029A330E", hash_generated_field = "6364225F8898974857F3A073EFD16029")

    static int SAVE_DISABLED_MASK = 0x000010000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.849 -0400", hash_original_field = "A6FA078274716D518128E150581D2851", hash_generated_field = "145B4CA1DD4ECB5CB57E3CD3F11E73C5")

    static int WILL_NOT_CACHE_DRAWING = 0x000020000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.849 -0400", hash_original_field = "E03A3305D740CA16331145E801848E22", hash_generated_field = "1D7F4342CE8C6A94A04571832047C041")

    static int FOCUSABLE_IN_TOUCH_MODE = 0x00040000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.849 -0400", hash_original_field = "FA3A1555CC434AC18D966F00D2423C82", hash_generated_field = "00C745D591E053E355D9F95CAA502483")

    public static final int DRAWING_CACHE_QUALITY_LOW = 0x00080000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.849 -0400", hash_original_field = "1C715F9A3E4D054995D7540181249A42", hash_generated_field = "5C1456CB937D24EC2357B82160B57D70")

    public static final int DRAWING_CACHE_QUALITY_HIGH = 0x00100000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.849 -0400", hash_original_field = "4AF63F90FCB3729D33ED8E285AF2B74E", hash_generated_field = "1F818F030504ADAB1788120175C0B1E5")

    public static final int DRAWING_CACHE_QUALITY_AUTO = 0x00000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.849 -0400", hash_original_field = "3207B6651A0BF5F174E5CAF999AB8905", hash_generated_field = "2086BBAD5962AA38868B5E2286E3E892")

    private static int[] DRAWING_CACHE_QUALITY_FLAGS = {
            DRAWING_CACHE_QUALITY_AUTO, DRAWING_CACHE_QUALITY_LOW, DRAWING_CACHE_QUALITY_HIGH
    };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.849 -0400", hash_original_field = "510EB04A8874ADFC53C33C3DB0F22789", hash_generated_field = "E8F768365A70E4A7C1BF0E6651B10F98")

    static int DRAWING_CACHE_QUALITY_MASK = 0x00180000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.849 -0400", hash_original_field = "B2686CD8BA58915A28F18A2290D383B1", hash_generated_field = "D275012756FAB7E94F4BE312C6412DA1")

    static int LONG_CLICKABLE = 0x00200000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.849 -0400", hash_original_field = "6F25A9D7ED2043A0A5C3D937F4EE60B0", hash_generated_field = "213A3898A32C104ED31B9720AB0CFA17")

    static int DUPLICATE_PARENT_STATE = 0x00400000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.849 -0400", hash_original_field = "2747E2837D818C6355EE71D69B9684B7", hash_generated_field = "3942DDD065BFB4D5847FE6C074D13B8C")

    public static final int SCROLLBARS_INSIDE_OVERLAY = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.849 -0400", hash_original_field = "234F4C5DCDC5DE24A3652BD6011D93D9", hash_generated_field = "99D8798FCB61EE70472EB6CEB2B1D2BD")

    public static final int SCROLLBARS_INSIDE_INSET = 0x01000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.849 -0400", hash_original_field = "ED751E830351C6E99A81725F83CA320D", hash_generated_field = "26082E7DF00E5D63F0836B2C3593B9A1")

    public static final int SCROLLBARS_OUTSIDE_OVERLAY = 0x02000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.849 -0400", hash_original_field = "98278E487E36D61B5EFF4EB199CD5F66", hash_generated_field = "8D486D5878BEE68EEDFC2466A5593564")

    public static final int SCROLLBARS_OUTSIDE_INSET = 0x03000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.849 -0400", hash_original_field = "C9838B952BE0085ABBD5F18638048C95", hash_generated_field = "10CAFFD09DA3DF0162FEA072F07A9259")

    static int SCROLLBARS_INSET_MASK = 0x01000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.849 -0400", hash_original_field = "FB72F7534C13B44CC119CFC03DC847EA", hash_generated_field = "EE732960ED9502B0F062B952AB822AF1")

    static int SCROLLBARS_OUTSIDE_MASK = 0x02000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.857 -0400", hash_original_field = "237A29BBCB2DB13E041F3DA844444538", hash_generated_field = "095CA9F16A3AF640FE2F83D19427C9D2")

    static int SCROLLBARS_STYLE_MASK = 0x03000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.857 -0400", hash_original_field = "5A93B62D57F19F1248E061B9DF6D4586", hash_generated_field = "026A7CCCB8A871DB74312537DD84B5CB")

    public static final int KEEP_SCREEN_ON = 0x04000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.858 -0400", hash_original_field = "EBF2D0C0B786CD060B5AE41494DA59C6", hash_generated_field = "65C2782715263C009044AB84624A4EB2")

    public static final int SOUND_EFFECTS_ENABLED = 0x08000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.858 -0400", hash_original_field = "1078F74C572D9516578E7FA7289C750A", hash_generated_field = "104909D35DACCE7A451CA8A4158F790C")

    public static final int HAPTIC_FEEDBACK_ENABLED = 0x10000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.858 -0400", hash_original_field = "F23DDA0E5F90CEFBF8B46DBA0BCB190F", hash_generated_field = "C6F3E850B9604EFD7C2B700F5337750D")

    static int PARENT_SAVE_DISABLED = 0x20000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.858 -0400", hash_original_field = "6B97792AE6AB5644826FC2B8CA55EA66", hash_generated_field = "110629F025CD2386C74027DC1B93C0B3")

    static int PARENT_SAVE_DISABLED_MASK = 0x20000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.858 -0400", hash_original_field = "042290192ED37463656C62A299DCD56C", hash_generated_field = "A688099F9FE53C57D5410ECB0B78ECF6")

    public static final int LAYOUT_DIRECTION_LTR = 0x00000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.858 -0400", hash_original_field = "D50A627E81AC5EE86F73722012E61B2A", hash_generated_field = "1E680499F28E2DB403E520F9B378996F")

    public static final int LAYOUT_DIRECTION_RTL = 0x40000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.858 -0400", hash_original_field = "A405E7709C580A39852B4DEBD01E0B25", hash_generated_field = "3C8F75DD79F0631A6C45E4E961B35BE6")

    public static final int LAYOUT_DIRECTION_INHERIT = 0x80000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.858 -0400", hash_original_field = "352E9691543D117A79FEE50BA922BA21", hash_generated_field = "309700780AC169B61849F35A862B3E65")

    public static final int LAYOUT_DIRECTION_LOCALE = 0xC0000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.858 -0400", hash_original_field = "62FB84FF84367768D9A8010C1DE8DFE5", hash_generated_field = "6769962C99918F8E2942A50151C2FD60")

    static int LAYOUT_DIRECTION_MASK = 0xC0000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.858 -0400", hash_original_field = "45F3ED7F85CB672108B49A6F1CBFF483", hash_generated_field = "7BFEFC6184122B21572B1A2AE12E7203")

    private static int[] LAYOUT_DIRECTION_FLAGS = {LAYOUT_DIRECTION_LTR,
        LAYOUT_DIRECTION_RTL, LAYOUT_DIRECTION_INHERIT, LAYOUT_DIRECTION_LOCALE};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.858 -0400", hash_original_field = "A4258B7D410E3ABEA2DAED93E7FC2DBF", hash_generated_field = "50B06CBE737802CBE729C9F8413E1D5B")

    private static int LAYOUT_DIRECTION_DEFAULT = LAYOUT_DIRECTION_INHERIT;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.858 -0400", hash_original_field = "60991A843680A700D8903D1037CD1027", hash_generated_field = "4E5D1049C9EF75861592546EF88DBF53")

    public static final int FOCUSABLES_ALL = 0x00000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.858 -0400", hash_original_field = "75B8D0D830284C8413D9475FE15DED7B", hash_generated_field = "FDC3A4AE8FBDEDEDFB25081E70F0EAFA")

    public static final int FOCUSABLES_TOUCH_MODE = 0x00000001;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.858 -0400", hash_original_field = "16EA4D0DF6A96534ED21707D0DC9D7D1", hash_generated_field = "169DA3FC15889071D72206CA09A960FA")

    public static final int FOCUS_BACKWARD = 0x00000001;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.858 -0400", hash_original_field = "6FAD780F10ED98A64C11256A4F65B843", hash_generated_field = "4B7B29E11785A4D3C7319284FE29BB61")

    public static final int FOCUS_FORWARD = 0x00000002;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.858 -0400", hash_original_field = "3748FE498607ED50B4BEA594F402D00E", hash_generated_field = "936F919E08FC8B9F1C931D6E632F8DE0")

    public static final int FOCUS_LEFT = 0x00000011;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.858 -0400", hash_original_field = "8C5862526CF4B48EEE48CD48164CF908", hash_generated_field = "E877EF3790B7F3E0F15FFC2846DA5A4A")

    public static final int FOCUS_UP = 0x00000021;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.858 -0400", hash_original_field = "7836E0401589D48A18437C3C00FB92B1", hash_generated_field = "8A54B461A03C16A38D0974EA5435F806")

    public static final int FOCUS_RIGHT = 0x00000042;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.858 -0400", hash_original_field = "DA9FCEAFDE994E9275E734E38EC26AF2", hash_generated_field = "32373BABA82126482CBABBE76E9F36D3")

    public static final int FOCUS_DOWN = 0x00000082;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.858 -0400", hash_original_field = "7C5B34C3F66563DEDF69054B4573D7A0", hash_generated_field = "3584CE2038396D56F00CBCE4E0AF47E7")

    public static final int MEASURED_SIZE_MASK = 0x00ffffff;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.858 -0400", hash_original_field = "26BC6B4F75C09AA87725780145BF0053", hash_generated_field = "874FE93B404AA4B2617E7E2F47B091CC")

    public static final int MEASURED_STATE_MASK = 0xff000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.858 -0400", hash_original_field = "BEAD869C6CD87263DD66EA8E7F53CAB5", hash_generated_field = "859653BE0AACCFF2DA07F4D6CA30948B")

    public static final int MEASURED_HEIGHT_STATE_SHIFT = 16;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.858 -0400", hash_original_field = "58C4E838736B52712EDDA9AADE5146ED", hash_generated_field = "499640E6C451DA0A8A056EE1F14203E6")

    public static final int MEASURED_STATE_TOO_SMALL = 0x01000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.858 -0400", hash_original_field = "51B7591E0F578681A0C2EE5DA47C2D4E", hash_generated_field = "A60706A950ABFA6787DAFE2333D1D63E")

    protected static int[] EMPTY_STATE_SET;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.858 -0400", hash_original_field = "1487025A5AB6A88FEACB03AB7990FFA5", hash_generated_field = "99443560A8BB02795565A31C7E7FF7B1")

    protected static int[] ENABLED_STATE_SET;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.859 -0400", hash_original_field = "7263334C9DDB4A7D666B1C3DD61A0C6A", hash_generated_field = "11C8381528C7451EAC51D425793F56C2")

    protected static int[] FOCUSED_STATE_SET;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.859 -0400", hash_original_field = "E33DADA1965FE739883D993B5AA18F9F", hash_generated_field = "3A452259C52C53C1EFB914A335939407")

    protected static int[] SELECTED_STATE_SET;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.859 -0400", hash_original_field = "88939EA751CCCC7A7DB0509EA010F6DA", hash_generated_field = "1150481E1245BD4252FBDD6D8BF7F65F")

    protected static int[] PRESSED_STATE_SET;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.859 -0400", hash_original_field = "2E3E59175269A05F91C5A19CB85A694E", hash_generated_field = "8E5DAB90AC5DCA5817D14D9B6C547303")

    protected static int[] WINDOW_FOCUSED_STATE_SET;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.859 -0400", hash_original_field = "6C90D4BB8E9AC1B71CDEEBC3645B2780", hash_generated_field = "7288DEFD6843DAD9B8306502492E9853")

    protected static int[] ENABLED_FOCUSED_STATE_SET;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.859 -0400", hash_original_field = "0BA64AB46B8FBDF51E936CAF79AD944B", hash_generated_field = "26F780CD73153C56C935B863B7CA60FA")

    protected static int[] ENABLED_SELECTED_STATE_SET;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.859 -0400", hash_original_field = "77BE7752F47EB351E50B3E41073FEC4B", hash_generated_field = "4E4EEFF45753D32998559D55A6EF44B8")

    protected static int[] ENABLED_WINDOW_FOCUSED_STATE_SET;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.859 -0400", hash_original_field = "A25D57A9D8267C415AE05F818FF6AC5E", hash_generated_field = "E4F27C2333C782D6E4D173DE3B06BF18")

    protected static int[] FOCUSED_SELECTED_STATE_SET;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.859 -0400", hash_original_field = "919907B0612F6254887EB3E97A22BF9C", hash_generated_field = "89F4391F6DDF155A225E114339942430")

    protected static int[] FOCUSED_WINDOW_FOCUSED_STATE_SET;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.859 -0400", hash_original_field = "611D21495AB54356BC2E7665025343B3", hash_generated_field = "94022B56BE402F58E4270EB350792883")

    protected static int[] SELECTED_WINDOW_FOCUSED_STATE_SET;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.859 -0400", hash_original_field = "4B146E73AB4ADACFAAF2647A8B055DF1", hash_generated_field = "15E50E4B54201BE1BE6EB6674087A2FF")

    protected static int[] ENABLED_FOCUSED_SELECTED_STATE_SET;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.859 -0400", hash_original_field = "8262D29B4D0A9F17177FD6254B2D3930", hash_generated_field = "FDA0C2E170F0F36949DABE497139E672")

    protected static int[] ENABLED_FOCUSED_WINDOW_FOCUSED_STATE_SET;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.859 -0400", hash_original_field = "FBD49E3069AD0761FCFAD89ED56531BE", hash_generated_field = "7B5D9A889C2FFA9A561E0EA4250EBE37")

    protected static int[] ENABLED_SELECTED_WINDOW_FOCUSED_STATE_SET;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.859 -0400", hash_original_field = "26E63DE2BE2B46BFEBC5C441C4D6E1F9", hash_generated_field = "C7506CCBA97AA185D5649A7B40AB28D9")

    protected static int[] FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.859 -0400", hash_original_field = "BE4CEC84B4BE8BFFB0455DE22E885108", hash_generated_field = "21701468D299EEF2E6314D17CDA4A09B")

    protected static int[] ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.859 -0400", hash_original_field = "9A1FBDAD10063482B7658C13B8A0B02F", hash_generated_field = "F8383F641270D614B30774F08FA72D27")

    protected static int[] PRESSED_WINDOW_FOCUSED_STATE_SET;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.859 -0400", hash_original_field = "4B4B3833D917124D356E8A05CEE57412", hash_generated_field = "D26868EDEAAF82B3EF5953C4049C5BF8")

    protected static int[] PRESSED_SELECTED_STATE_SET;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.859 -0400", hash_original_field = "945046E9CCAB02225F85C9AEF80FD0F1", hash_generated_field = "DB8F785F4FD804A28291B083216F3C9E")

    protected static int[] PRESSED_SELECTED_WINDOW_FOCUSED_STATE_SET;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.859 -0400", hash_original_field = "32DFD335BE0EC6D93B8CB7E154077B5A", hash_generated_field = "FF997AEB254DFD2B8E8AF4DC32EF1D31")

    protected static int[] PRESSED_FOCUSED_STATE_SET;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.859 -0400", hash_original_field = "BC1A2C878ED403A3DC4AB16C2C5236C4", hash_generated_field = "B219816DBAFB4C4AE58A96AEE6F32010")

    protected static int[] PRESSED_FOCUSED_WINDOW_FOCUSED_STATE_SET;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.859 -0400", hash_original_field = "10128D4A007A2E3A355578602006E698", hash_generated_field = "EB888E73506F6FA9D225D7A6FC4285F7")

    protected static int[] PRESSED_FOCUSED_SELECTED_STATE_SET;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.859 -0400", hash_original_field = "13BF55722C5919CC13ABB211D7D8FC34", hash_generated_field = "DA91E046B143C9258573479BFD455473")

    protected static int[] PRESSED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.859 -0400", hash_original_field = "EEBB047B97E6CC005B66BB4DF8F94E74", hash_generated_field = "47A198E35052CA7F982234E83E6AE0B5")

    protected static int[] PRESSED_ENABLED_STATE_SET;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.859 -0400", hash_original_field = "8EA96FD8BA37E8726D3FF37428005A84", hash_generated_field = "1241C342AD96CD3177F39E12E55B08A1")

    protected static int[] PRESSED_ENABLED_WINDOW_FOCUSED_STATE_SET;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.859 -0400", hash_original_field = "D7F5B6940CEB03AF4DB7C638C8DB86C9", hash_generated_field = "B8447E4F384C40AC956314579E0EC168")

    protected static int[] PRESSED_ENABLED_SELECTED_STATE_SET;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.859 -0400", hash_original_field = "CD5B9CAE61BF5681D131974B48D45F35", hash_generated_field = "F3A6207F343FCB93F7AD3D66BE9819DE")

    protected static int[] PRESSED_ENABLED_SELECTED_WINDOW_FOCUSED_STATE_SET;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.860 -0400", hash_original_field = "2B786A01E298E73EF07DF178EFA649DE", hash_generated_field = "92A36B4EAE93002927F999631B9F3F0B")

    protected static int[] PRESSED_ENABLED_FOCUSED_STATE_SET;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.860 -0400", hash_original_field = "8C8090C7CEA34E704C4D34265493EFB7", hash_generated_field = "95A751D33F39D2426A2D5C87AED66425")

    protected static int[] PRESSED_ENABLED_FOCUSED_WINDOW_FOCUSED_STATE_SET;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.860 -0400", hash_original_field = "EB47BA02ACDC4579D77D7F37C47E607B", hash_generated_field = "7FA35EC1F5140E40D7F86CA44E6DBA3D")

    protected static int[] PRESSED_ENABLED_FOCUSED_SELECTED_STATE_SET;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.860 -0400", hash_original_field = "D944FE429EDF53CE63EEC14D8093A840", hash_generated_field = "74D8BB51BDEF099D4EDB19D4AB388E56")

    protected static int[] PRESSED_ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.860 -0400", hash_original_field = "7CACA492F8EB04441960954CE8E31F4E", hash_generated_field = "07E5728FFC69B34D451F1FFD96A500DE")

    private static int[][] VIEW_STATE_SETS;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.860 -0400", hash_original_field = "840023F54AE77F6B7CB6EA057A29345F", hash_generated_field = "3D1D5307A13A64F4AF51066634C0D38E")

    static int VIEW_STATE_WINDOW_FOCUSED = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.860 -0400", hash_original_field = "30BF9633946B236206204B1B228F9B4E", hash_generated_field = "020F6699A8C965FA70F8CD5602F3BD4E")

    static int VIEW_STATE_SELECTED = 1 << 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.872 -0400", hash_original_field = "13F309EA19E97FDCAB0F34A82B513727", hash_generated_field = "0A31EACC4410263395F7F8077D84A700")

    static int VIEW_STATE_FOCUSED = 1 << 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.872 -0400", hash_original_field = "3DBC2F54FADC09E29BF1B8FBBEA3FB0D", hash_generated_field = "87D163F2655A9FAC89A0CF29BBCDD8E6")

    static int VIEW_STATE_ENABLED = 1 << 3;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.872 -0400", hash_original_field = "73B0F4C3283212372DB4AD900092822F", hash_generated_field = "414F7509F3CE20C2A348AEA36EDFA0EA")

    static int VIEW_STATE_PRESSED = 1 << 4;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.872 -0400", hash_original_field = "76ECEEDE7E2BE2C35DBAF0A9660EF84E", hash_generated_field = "613957A8BB2407CAD7425A4A9DE8654C")

    static int VIEW_STATE_ACTIVATED = 1 << 5;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.872 -0400", hash_original_field = "B0A3894D2E7A8DECC31DDF557084056F", hash_generated_field = "E3540F4929FD095CD2C3F689DE33ADE1")

    static int VIEW_STATE_ACCELERATED = 1 << 6;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.872 -0400", hash_original_field = "CD5EC9C04D78EAE85439A49EE43548B7", hash_generated_field = "B3CF65C0D914A6936465E21E5AD6EE16")

    static int VIEW_STATE_HOVERED = 1 << 7;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.872 -0400", hash_original_field = "7963B56E34789A515DD35DC186470423", hash_generated_field = "B62A9F1FA28AB02938B4C3FEE26DE221")

    static int VIEW_STATE_DRAG_CAN_ACCEPT = 1 << 8;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.872 -0400", hash_original_field = "1D0657EAA0C99CDDC29972AFF5927F66", hash_generated_field = "5586F193DEE0E8ED6676B2B5EF5813F7")

    static int VIEW_STATE_DRAG_HOVERED = 1 << 9;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.872 -0400", hash_original_field = "F0FE506AC7CE0271C963DE2DFB2246CA", hash_generated_field = "DE5C17ACDCEC0294C4A36E88A131A023")

    static int[] VIEW_STATE_IDS = new int[] {
        R.attr.state_window_focused,    VIEW_STATE_WINDOW_FOCUSED,
        R.attr.state_selected,          VIEW_STATE_SELECTED,
        R.attr.state_focused,           VIEW_STATE_FOCUSED,
        R.attr.state_enabled,           VIEW_STATE_ENABLED,
        R.attr.state_pressed,           VIEW_STATE_PRESSED,
        R.attr.state_activated,         VIEW_STATE_ACTIVATED,
        R.attr.state_accelerated,       VIEW_STATE_ACCELERATED,
        R.attr.state_hovered,           VIEW_STATE_HOVERED,
        R.attr.state_drag_can_accept,   VIEW_STATE_DRAG_CAN_ACCEPT,
        R.attr.state_drag_hovered,      VIEW_STATE_DRAG_HOVERED,
    };
    static {
        if ((VIEW_STATE_IDS.length/2) != R.styleable.ViewDrawableStates.length) {
            throw new IllegalStateException(
                    "VIEW_STATE_IDs array length does not match ViewDrawableStates style array");
        }
        int[] orderedIds = new int[VIEW_STATE_IDS.length];
        for (int i = 0; i < R.styleable.ViewDrawableStates.length; i++) {
            int viewState = R.styleable.ViewDrawableStates[i];
            for (int j = 0; j<VIEW_STATE_IDS.length; j += 2) {
                if (VIEW_STATE_IDS[j] == viewState) {
                    orderedIds[i * 2] = viewState;
                    orderedIds[i * 2 + 1] = VIEW_STATE_IDS[j + 1];
                }
            }
        }
        final int NUM_BITS = VIEW_STATE_IDS.length / 2;
        VIEW_STATE_SETS = new int[1 << NUM_BITS][];
        for (int i = 0; i < VIEW_STATE_SETS.length; i++) {
            int numBits = Integer.bitCount(i);
            int[] set = new int[numBits];
            int pos = 0;
            for (int j = 0; j < orderedIds.length; j += 2) {
                if ((i & orderedIds[j+1]) != 0) {
                    set[pos++] = orderedIds[j];
                }
            }
            VIEW_STATE_SETS[i] = set;
        }
        EMPTY_STATE_SET = VIEW_STATE_SETS[0];
        WINDOW_FOCUSED_STATE_SET = VIEW_STATE_SETS[VIEW_STATE_WINDOW_FOCUSED];
        SELECTED_STATE_SET = VIEW_STATE_SETS[VIEW_STATE_SELECTED];
        SELECTED_WINDOW_FOCUSED_STATE_SET = VIEW_STATE_SETS[
                VIEW_STATE_WINDOW_FOCUSED | VIEW_STATE_SELECTED];
        FOCUSED_STATE_SET = VIEW_STATE_SETS[VIEW_STATE_FOCUSED];
        FOCUSED_WINDOW_FOCUSED_STATE_SET = VIEW_STATE_SETS[
                VIEW_STATE_WINDOW_FOCUSED | VIEW_STATE_FOCUSED];
        FOCUSED_SELECTED_STATE_SET = VIEW_STATE_SETS[
                VIEW_STATE_SELECTED | VIEW_STATE_FOCUSED];
        FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET = VIEW_STATE_SETS[
                VIEW_STATE_WINDOW_FOCUSED | VIEW_STATE_SELECTED
                | VIEW_STATE_FOCUSED];
        ENABLED_STATE_SET = VIEW_STATE_SETS[VIEW_STATE_ENABLED];
        ENABLED_WINDOW_FOCUSED_STATE_SET = VIEW_STATE_SETS[
                VIEW_STATE_WINDOW_FOCUSED | VIEW_STATE_ENABLED];
        ENABLED_SELECTED_STATE_SET = VIEW_STATE_SETS[
                VIEW_STATE_SELECTED | VIEW_STATE_ENABLED];
        ENABLED_SELECTED_WINDOW_FOCUSED_STATE_SET = VIEW_STATE_SETS[
                VIEW_STATE_WINDOW_FOCUSED | VIEW_STATE_SELECTED
                | VIEW_STATE_ENABLED];
        ENABLED_FOCUSED_STATE_SET = VIEW_STATE_SETS[
                VIEW_STATE_FOCUSED | VIEW_STATE_ENABLED];
        ENABLED_FOCUSED_WINDOW_FOCUSED_STATE_SET = VIEW_STATE_SETS[
                VIEW_STATE_WINDOW_FOCUSED | VIEW_STATE_FOCUSED
                | VIEW_STATE_ENABLED];
        ENABLED_FOCUSED_SELECTED_STATE_SET = VIEW_STATE_SETS[
                VIEW_STATE_SELECTED | VIEW_STATE_FOCUSED
                | VIEW_STATE_ENABLED];
        ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET = VIEW_STATE_SETS[
                VIEW_STATE_WINDOW_FOCUSED | VIEW_STATE_SELECTED
                | VIEW_STATE_FOCUSED| VIEW_STATE_ENABLED];
        PRESSED_STATE_SET = VIEW_STATE_SETS[VIEW_STATE_PRESSED];
        PRESSED_WINDOW_FOCUSED_STATE_SET = VIEW_STATE_SETS[
                VIEW_STATE_WINDOW_FOCUSED | VIEW_STATE_PRESSED];
        PRESSED_SELECTED_STATE_SET = VIEW_STATE_SETS[
                VIEW_STATE_SELECTED | VIEW_STATE_PRESSED];
        PRESSED_SELECTED_WINDOW_FOCUSED_STATE_SET = VIEW_STATE_SETS[
                VIEW_STATE_WINDOW_FOCUSED | VIEW_STATE_SELECTED
                | VIEW_STATE_PRESSED];
        PRESSED_FOCUSED_STATE_SET = VIEW_STATE_SETS[
                VIEW_STATE_FOCUSED | VIEW_STATE_PRESSED];
        PRESSED_FOCUSED_WINDOW_FOCUSED_STATE_SET = VIEW_STATE_SETS[
                VIEW_STATE_WINDOW_FOCUSED | VIEW_STATE_FOCUSED
                | VIEW_STATE_PRESSED];
        PRESSED_FOCUSED_SELECTED_STATE_SET = VIEW_STATE_SETS[
                VIEW_STATE_SELECTED | VIEW_STATE_FOCUSED
                | VIEW_STATE_PRESSED];
        PRESSED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET = VIEW_STATE_SETS[
                VIEW_STATE_WINDOW_FOCUSED | VIEW_STATE_SELECTED
                | VIEW_STATE_FOCUSED | VIEW_STATE_PRESSED];
        PRESSED_ENABLED_STATE_SET = VIEW_STATE_SETS[
                VIEW_STATE_ENABLED | VIEW_STATE_PRESSED];
        PRESSED_ENABLED_WINDOW_FOCUSED_STATE_SET = VIEW_STATE_SETS[
                VIEW_STATE_WINDOW_FOCUSED | VIEW_STATE_ENABLED
                | VIEW_STATE_PRESSED];
        PRESSED_ENABLED_SELECTED_STATE_SET = VIEW_STATE_SETS[
                VIEW_STATE_SELECTED | VIEW_STATE_ENABLED
                | VIEW_STATE_PRESSED];
        PRESSED_ENABLED_SELECTED_WINDOW_FOCUSED_STATE_SET = VIEW_STATE_SETS[
                VIEW_STATE_WINDOW_FOCUSED | VIEW_STATE_SELECTED
                | VIEW_STATE_ENABLED | VIEW_STATE_PRESSED];
        PRESSED_ENABLED_FOCUSED_STATE_SET = VIEW_STATE_SETS[
                VIEW_STATE_FOCUSED | VIEW_STATE_ENABLED
                | VIEW_STATE_PRESSED];
        PRESSED_ENABLED_FOCUSED_WINDOW_FOCUSED_STATE_SET = VIEW_STATE_SETS[
                VIEW_STATE_WINDOW_FOCUSED | VIEW_STATE_FOCUSED
                | VIEW_STATE_ENABLED | VIEW_STATE_PRESSED];
        PRESSED_ENABLED_FOCUSED_SELECTED_STATE_SET = VIEW_STATE_SETS[
                VIEW_STATE_SELECTED | VIEW_STATE_FOCUSED
                | VIEW_STATE_ENABLED | VIEW_STATE_PRESSED];
        PRESSED_ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET = VIEW_STATE_SETS[
                VIEW_STATE_WINDOW_FOCUSED | VIEW_STATE_SELECTED
                | VIEW_STATE_FOCUSED| VIEW_STATE_ENABLED
                | VIEW_STATE_PRESSED];
    }
    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.872 -0400", hash_original_field = "BC732632754162FEA3F07CEB5C7D8AE4", hash_generated_field = "7BFC73268C254E49493575266E904AE5")

    private static int POPULATING_ACCESSIBILITY_EVENT_TYPES = AccessibilityEvent.TYPE_VIEW_CLICKED
            | AccessibilityEvent.TYPE_VIEW_LONG_CLICKED
            | AccessibilityEvent.TYPE_VIEW_SELECTED
            | AccessibilityEvent.TYPE_VIEW_FOCUSED
            | AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED
            | AccessibilityEvent.TYPE_VIEW_HOVER_ENTER
            | AccessibilityEvent.TYPE_VIEW_HOVER_EXIT
            | AccessibilityEvent.TYPE_VIEW_TEXT_CHANGED
            | AccessibilityEvent.TYPE_VIEW_TEXT_SELECTION_CHANGED;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.872 -0400", hash_original_field = "E3D3FC8D07AB0B919D55A05D03BD2DDA", hash_generated_field = "CB1D3BADF567509B2CC5E7B8914854D7")

    static ThreadLocal<Rect> sThreadLocal = new ThreadLocal<Rect>();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.872 -0400", hash_original_field = "D7DE0ACE26DFCBFA81B727E7D697D6DC", hash_generated_field = "7D4D749E981D95615D6EBF2D704DB8B6")

    private static int sNextAccessibilityViewId;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.872 -0400", hash_original_field = "500117F1360ECD0E2A1C758A384C6BDE", hash_generated_field = "0940C4C14E426DBD6C2BAA1B89A0BF05")

    static int WANTS_FOCUS = 0x00000001;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.872 -0400", hash_original_field = "83B85F39C701A1CD9E8E850630AFB73D", hash_generated_field = "34E2DAC83BF0C356F863F21F7BF13207")

    static int FOCUSED = 0x00000002;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.872 -0400", hash_original_field = "AEFAC5139B1F408F0396832810DBCEB7", hash_generated_field = "239E0B1DFBD68B1A18ABA6CC8969DB12")

    static int SELECTED = 0x00000004;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.872 -0400", hash_original_field = "96DF4F8FC6E2AD4704C5C57F486C62A7", hash_generated_field = "C30F8CAF6A18C893CEF1B7DDFC9A80E5")

    static int IS_ROOT_NAMESPACE = 0x00000008;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.872 -0400", hash_original_field = "CA7D68B3A5540FFD5359787C666DB078", hash_generated_field = "990D9E737E4C6AC8EFEDB69944FC4827")

    static int HAS_BOUNDS = 0x00000010;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.873 -0400", hash_original_field = "ACA3CC4C13B40B8ECB3C6210C98DFCA5", hash_generated_field = "55D84BE32BE39303E1CC205643E17CD9")

    static int DRAWN = 0x00000020;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.873 -0400", hash_original_field = "3FB0E221E190E60E340F7D7FED25A8A9", hash_generated_field = "E5094EF5A8913D56A4E4430299C6B262")

    static int DRAW_ANIMATION = 0x00000040;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.873 -0400", hash_original_field = "A949A8DDF17378D569923BDB3BD3CE4D", hash_generated_field = "7D23068522F5BE29F27DA2FC4708D24F")

    static int SKIP_DRAW = 0x00000080;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.873 -0400", hash_original_field = "7DEECFEEC7611D16BD2F9A3756FA2BB1", hash_generated_field = "7C1CDC3CC2A7B1D126888F41261551FB")

    static int ONLY_DRAWS_BACKGROUND = 0x00000100;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.873 -0400", hash_original_field = "2A62805F3B4B271B6D733C06F3A3786F", hash_generated_field = "DD1A5BE94C9F9838B7E118160CE8E037")

    static int REQUEST_TRANSPARENT_REGIONS = 0x00000200;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.873 -0400", hash_original_field = "7A69759A1E34A3948363D6F2AD631B39", hash_generated_field = "DA3E548087DA48262A57E44D43CC016C")

    static int DRAWABLE_STATE_DIRTY = 0x00000400;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.873 -0400", hash_original_field = "6C0298510DAE034B4A70716048ADE945", hash_generated_field = "8C6C8257C313E96634A58CFD2FE2E40F")

    static int MEASURED_DIMENSION_SET = 0x00000800;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.873 -0400", hash_original_field = "6A440126BB00967A51CCB88DAACD1292", hash_generated_field = "C4DA572E99931907E9CAC03A2699390C")

    static int FORCE_LAYOUT = 0x00001000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.873 -0400", hash_original_field = "4FEA9D60E4244C5452CD42C4851D13F1", hash_generated_field = "D31C8655406ECDAFF2590CDCA225F6F8")

    static int LAYOUT_REQUIRED = 0x00002000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.873 -0400", hash_original_field = "3B39792FDAC39DE65F7ED2FD34A515EA", hash_generated_field = "AB1192B3988FB0856FC0172A352C8778")

    private static int PRESSED = 0x00004000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.873 -0400", hash_original_field = "CA4B0F471AC38326CCE490FE95DD9DBF", hash_generated_field = "DA30C3E08011D1F1DA83BB7AF59AD5E8")

    static int DRAWING_CACHE_VALID = 0x00008000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.873 -0400", hash_original_field = "C008718263AEA3F654A7431B2FEE1AE0", hash_generated_field = "BB22687534233E565A30A5468D45BA3F")

    static int ANIMATION_STARTED = 0x00010000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.873 -0400", hash_original_field = "520300B25E15DC461FC807E3DDE2EC9D", hash_generated_field = "35043BA6E7DD45F21433302371B0D82B")

    private static int SAVE_STATE_CALLED = 0x00020000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.873 -0400", hash_original_field = "7A9B464E0EC754E6120D11506C660E74", hash_generated_field = "93BC374BB1F882A76433AFE114A4057F")

    static int ALPHA_SET = 0x00040000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.873 -0400", hash_original_field = "F2642ABC015872B1D18A10BA26436F68", hash_generated_field = "0131C682F4C79D2B3451EE7EFCF0F760")

    static int SCROLL_CONTAINER = 0x00080000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.873 -0400", hash_original_field = "77FD38926931873CE64CCCD9AAA636EE", hash_generated_field = "AD406BA74FA0F7504C619032897A30B1")

    static int SCROLL_CONTAINER_ADDED = 0x00100000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.873 -0400", hash_original_field = "D12AE92211483CEAE28211A899954171", hash_generated_field = "D46FEFCEF96759D951212F4F233DFFBF")

    static int DIRTY = 0x00200000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.873 -0400", hash_original_field = "90A4B5DC715FC521F95E6BF53938EA44", hash_generated_field = "C930A5635BB2F397FE479F35E5031251")

    static int DIRTY_OPAQUE = 0x00400000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.873 -0400", hash_original_field = "FE623C860E0D6689B3FAA8DCFDE2DA83", hash_generated_field = "D9DE68B063A967F1D7BF6B5B7768F494")

    static int DIRTY_MASK = 0x00600000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.873 -0400", hash_original_field = "AD218DA12A70673BD9767DB67BAE40E2", hash_generated_field = "92E29918880CEE17F89126C5AAC99AA4")

    static int OPAQUE_BACKGROUND = 0x00800000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.873 -0400", hash_original_field = "152E9A4D03C0868595B1B3A98EC5DD59", hash_generated_field = "125CF020F84F0896584D17739D12FCCA")

    static int OPAQUE_SCROLLBARS = 0x01000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.874 -0400", hash_original_field = "1FF0D2CB4E21A22B233B4091B7F3EA7A", hash_generated_field = "779F02EC18FAE6B8C5E7989C3F5AA972")

    static int OPAQUE_MASK = 0x01800000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.874 -0400", hash_original_field = "F344EC503BD86AEEBCFDAC09D95E8E68", hash_generated_field = "EBDE6C07B57305C92C5A11400F1BDDA5")

    private static int PREPRESSED = 0x02000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.874 -0400", hash_original_field = "89B3AE233E472F6B44029C702E7C3F9D", hash_generated_field = "7E8B1A97FEC8AA7B334EDE3F80B9CA45")

    static int CANCEL_NEXT_UP_EVENT = 0x04000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.874 -0400", hash_original_field = "36D406F449B7F4F8631F62229F52A4AA", hash_generated_field = "ADEE76CAA62BE9A726E7A2D0D7B761A1")

    private static int AWAKEN_SCROLL_BARS_ON_ATTACH = 0x08000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.874 -0400", hash_original_field = "682EFAC34FCD91477D1163FC4F0544CA", hash_generated_field = "33DA05E595A219EBB50651A4940296AB")

    private static int HOVERED = 0x10000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.874 -0400", hash_original_field = "311BEC00A2A57CF70925B2CB9CFA061F", hash_generated_field = "853B424464E8B46C98B183BAF76E8268")

    private static int PIVOT_EXPLICITLY_SET = 0x20000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.878 -0400", hash_original_field = "9E6EB47515D35AE672239BCA100D80B5", hash_generated_field = "DDD0FAD0B92505ACA7EA7B23E420BCD5")

    static int ACTIVATED = 0x40000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.878 -0400", hash_original_field = "38FB36FF33AF5682C9A3C817ACE91449", hash_generated_field = "9089C636D1DD0D37C01CF68F92BBD144")

    static int INVALIDATED = 0x80000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.878 -0400", hash_original_field = "7A41027FA0D80172C61A63E1749F8522", hash_generated_field = "72DD983F0B3E223704448DC0C59A1197")

    static int DRAG_CAN_ACCEPT = 0x00000001;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.878 -0400", hash_original_field = "3AB4DF7D76BF92F0AF881CE9B561B121", hash_generated_field = "1D11A5061B72D32B7A8C67ECC910C0E8")

    static int DRAG_HOVERED = 0x00000002;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.878 -0400", hash_original_field = "F115C5B400B4AD33E411E3D853951590", hash_generated_field = "61698A6591F4C3E64F4707C5D1A9F97A")

    static int LAYOUT_DIRECTION_RESOLVED_RTL = 0x00000004;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.878 -0400", hash_original_field = "E38A74D27FDCCB03C2FA1DF706DB289B", hash_generated_field = "40A1C7008A1F6D207DACA29F46EF922D")

    static int LAYOUT_DIRECTION_RESOLVED = 0x00000008;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.878 -0400", hash_original_field = "3C7B642C2343EB20487AA2B5D199EA6B", hash_generated_field = "2E14F3D23B80E80374FEFB9A924ADF06")

    static int DRAG_MASK = DRAG_CAN_ACCEPT | DRAG_HOVERED;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.878 -0400", hash_original_field = "7EB0B2502005C4CB40D46FF10A6B736D", hash_generated_field = "8F276B4C86F06142AEDE0C97A7FE2F68")

    public static final int OVER_SCROLL_ALWAYS = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.878 -0400", hash_original_field = "67D34493973359A97A217AD3B17DA6CF", hash_generated_field = "218BFE0FF46A804B55589DCE0FFD7D0A")

    public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.878 -0400", hash_original_field = "E1779A27D7E8D7DB9FBA34E6E8D0F4A8", hash_generated_field = "009B55485034BF3BF55F8691DA9788F7")

    public static final int OVER_SCROLL_NEVER = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.878 -0400", hash_original_field = "BF7D37DAD8E455C992BC7E68A0990530", hash_generated_field = "125903A773621693E8ED9CD79E76CEE2")

    public static final int SYSTEM_UI_FLAG_VISIBLE = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.878 -0400", hash_original_field = "906B1D91F782CE5AC8B7F0D668A6C3DE", hash_generated_field = "D22EB113F7E463630AC5C1BF53857810")

    public static final int SYSTEM_UI_FLAG_LOW_PROFILE = 0x00000001;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.879 -0400", hash_original_field = "4F3ABEF5C072D169DE48CFCD8D83ACB3", hash_generated_field = "C08307181AE930BB4EB97AF7E4BA99C2")

    public static final int SYSTEM_UI_FLAG_HIDE_NAVIGATION = 0x00000002;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.879 -0400", hash_original_field = "5D67A0854A678B7421A5D8EB5EE8C592", hash_generated_field = "E2BDD60871070DE88B6211D48982B8C2")

    public static final int STATUS_BAR_HIDDEN = SYSTEM_UI_FLAG_LOW_PROFILE;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.879 -0400", hash_original_field = "0F4BC827AD7F800E9D5FBFE4091527AC", hash_generated_field = "8B75629E21794DD2B63C2EBB0F5C5651")

    public static final int STATUS_BAR_VISIBLE = SYSTEM_UI_FLAG_VISIBLE;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.887 -0400", hash_original_field = "B8E435BADA682778215DD51A19DF8FFB", hash_generated_field = "B2C2F68118A98B0D9DC29F6548450BB1")

    public static final int STATUS_BAR_DISABLE_EXPAND = 0x00010000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.887 -0400", hash_original_field = "3C2F21B6325236E297702C891D965A0C", hash_generated_field = "F15A9A270E6E94C57BE4C34A504CA2E4")

    public static final int STATUS_BAR_DISABLE_NOTIFICATION_ICONS = 0x00020000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.887 -0400", hash_original_field = "F1CA414B01FED44D125FD7D69B8A2752", hash_generated_field = "A29040D2CCE82CD2248FC7CE5DD6F34C")

    public static final int STATUS_BAR_DISABLE_NOTIFICATION_ALERTS = 0x00040000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.887 -0400", hash_original_field = "7FEF4130863D936A12C0424A654E5D3E", hash_generated_field = "16D9107672695454170019843C771E6E")

    public static final int STATUS_BAR_DISABLE_NOTIFICATION_TICKER = 0x00080000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.887 -0400", hash_original_field = "C3C38A73496A3D57718587B370F541F7", hash_generated_field = "F95F66DC605FC858FD4E71DFA5C0F9BD")

    public static final int STATUS_BAR_DISABLE_SYSTEM_INFO = 0x00100000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.887 -0400", hash_original_field = "7E1FCA75C299F4E34A9DD82FD57BBDFD", hash_generated_field = "AAFD5A01803D7358E81163F32EB064CC")

    public static final int STATUS_BAR_DISABLE_HOME = 0x00200000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.887 -0400", hash_original_field = "A35BDA216974994591355F84D3B5274C", hash_generated_field = "E23FAA42E397EEA07B1B79A8F58007E0")

    public static final int STATUS_BAR_DISABLE_BACK = 0x00400000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.888 -0400", hash_original_field = "E9E375135941614B6E6CB8C9E2379A94", hash_generated_field = "DCC7B8B91738A06DD4F62CA9D5735F60")

    public static final int STATUS_BAR_DISABLE_CLOCK = 0x00800000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.888 -0400", hash_original_field = "5CCE851821E73C19D62138787ABDCA10", hash_generated_field = "CCF974A2E5C1C62EC6B351C6AF50C578")

    public static final int STATUS_BAR_DISABLE_RECENT = 0x01000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.888 -0400", hash_original_field = "B43FB7EFDEC3382EC0990C0A9E8B271C", hash_generated_field = "0C7A3AEFD08471993D7A4F0326BFA356")

    @Deprecated
    public static final int STATUS_BAR_DISABLE_NAVIGATION = 
            STATUS_BAR_DISABLE_HOME | STATUS_BAR_DISABLE_RECENT;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.888 -0400", hash_original_field = "C1B7F07AFA8039E59BC19145B086410C", hash_generated_field = "C93A2BBD1CA42547C4B5B418761D706E")

    public static final int PUBLIC_STATUS_BAR_VISIBILITY_MASK = 0x0000FFFF;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.888 -0400", hash_original_field = "C0E867B817C5074EE01AB86DFED8F6C6", hash_generated_field = "9B73CC22DA15165280173F1866272945")

    public static final int SYSTEM_UI_CLEARABLE_FLAGS =
            SYSTEM_UI_FLAG_LOW_PROFILE | SYSTEM_UI_FLAG_HIDE_NAVIGATION;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.888 -0400", hash_original_field = "51FF96EA2D2BD34250562D6F671E164F", hash_generated_field = "7B20A663B4D3B5566CC5C719038AA2BA")

    public static final int FIND_VIEWS_WITH_TEXT = 0x00000001;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.888 -0400", hash_original_field = "2EB0F42C98B29EF37AEA628C8410E67D", hash_generated_field = "DC0F2D99F610668CF27C5B6686754038")

    public static final int FIND_VIEWS_WITH_CONTENT_DESCRIPTION = 0x00000002;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.888 -0400", hash_original_field = "311CAB010F7D36E164A93EFE4C4E86BD", hash_generated_field = "E0280A6EC6471052BC597E7E964577FD")

    private static float NONZERO_EPSILON = .001f;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.888 -0400", hash_original_field = "C6E278D91B5DF64AC1C4D714250083AB", hash_generated_field = "C08C16CB7F1DD117251F7E01BD2A9C0A")

    public static final int DRAG_FLAG_GLOBAL = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.888 -0400", hash_original_field = "16240D771FB90A67263EFE9E2C291DEA", hash_generated_field = "A5FF12741D477D00096166439C6E6A47")

    public static final int SCROLLBAR_POSITION_DEFAULT = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.888 -0400", hash_original_field = "D30F0164D22B00A11A1CCB2B977A764B", hash_generated_field = "DC33B736EF2AA325AA97A5FCD399D9D8")

    public static final int SCROLLBAR_POSITION_LEFT = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.888 -0400", hash_original_field = "3DC6508AD3033900527EC4DB3791E127", hash_generated_field = "3F9EAAC738BDA10511E9A3B6436EF6E3")

    public static final int SCROLLBAR_POSITION_RIGHT = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.888 -0400", hash_original_field = "96AA91F8A048281129229FD083B1358D", hash_generated_field = "4B71A3CAAC0983C5CC19785C41F5E14C")

    public static final int LAYER_TYPE_NONE = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.888 -0400", hash_original_field = "DCBB776A50163456B0C217708A748171", hash_generated_field = "9362C41130448D1BEC071BA7F3927A19")

    public static final int LAYER_TYPE_SOFTWARE = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.888 -0400", hash_original_field = "047EE5E7394F65AAAF3F8809914E0CE3", hash_generated_field = "339CEE307F54C01A3C41187443B4553A")

    public static final int LAYER_TYPE_HARDWARE = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.888 -0400", hash_original_field = "7E5F4F35F076DD4A01417879834ED5A8", hash_generated_field = "8B7A964E0E3D6E1CA183DED21E99796E")

    public static final int TEXT_DIRECTION_INHERIT = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.888 -0400", hash_original_field = "C9DC0711FEE92DC0E5A418B930214358", hash_generated_field = "A11F693FD1415D67D865FDE1AE59FAC8")

    public static final int TEXT_DIRECTION_FIRST_STRONG = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.888 -0400", hash_original_field = "C0ED02B1DFA8E1E0002994F29FE0DBF1", hash_generated_field = "FE7C3FEA62FE2BEB4EAF36B5581E7BE1")

    public static final int TEXT_DIRECTION_ANY_RTL = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.888 -0400", hash_original_field = "5BAC4FF9879DCA7AFE5C4CA8A82E2F9A", hash_generated_field = "7D98B23250113084506842828EB2DF5B")

    public static final int TEXT_DIRECTION_LTR = 3;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.888 -0400", hash_original_field = "213E189EFF089F8F261EBA1867B24AC5", hash_generated_field = "9D4940C20853BDAD0B50AED80FB5511C")

    public static final int TEXT_DIRECTION_RTL = 4;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.888 -0400", hash_original_field = "4E44E9C56C5AB65B582CBC8E90D683E3", hash_generated_field = "08FC45D9BA58A3E9219785E4F9BE4255")

    protected static int DEFAULT_TEXT_DIRECTION = TEXT_DIRECTION_INHERIT;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.889 -0400", hash_original_field = "FA09DC8AEDA5E8EC77C5C9595F5C0901", hash_generated_field = "9B4FBCE5889B38B997DBE883BE7ADFA2")

    public static Property<View, Float> ALPHA = new FloatProperty<View>("alpha") {        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.889 -0400", hash_original_method = "1511B05B546CB67262D01EAC74D91223", hash_generated_method = "014FC564C485D78CC18EDE0C8BB618E8")
        @Override
        public void setValue(View object, float value) {
            object.setAlpha(value);
            addTaint(object.getTaint());
            addTaint(value);
            // ---------- Original Method ----------
            //object.setAlpha(value);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.889 -0400", hash_original_method = "0828A056C08A4787018BC5ECB849DDAD", hash_generated_method = "996D5CEED2D89556C676F54E02E910A7")
        @Override
        public Float get(View object) {
            Float varB4EAC82CA7396A68D541C85D26508E83_501173520 = null; //Variable for return #1
            varB4EAC82CA7396A68D541C85D26508E83_501173520 = object.getAlpha();
            addTaint(object.getTaint());
            varB4EAC82CA7396A68D541C85D26508E83_501173520.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_501173520;
            // ---------- Original Method ----------
            //return object.getAlpha();
        }

        
};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.907 -0400", hash_original_field = "2463A82C1B3B068FBED45F14B07DEA60", hash_generated_field = "A0FE4378F0225F91C5389EAA52B9415C")

    public static Property<View, Float> TRANSLATION_X = new FloatProperty<View>("translationX") {        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.906 -0400", hash_original_method = "71D30789CC0083AAA14E647D4066A62B", hash_generated_method = "613A1F383C5C797BB24708632A46223C")
        @Override
        public void setValue(View object, float value) {
            object.setTranslationX(value);
            addTaint(object.getTaint());
            addTaint(value);
            // ---------- Original Method ----------
            //object.setTranslationX(value);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.907 -0400", hash_original_method = "AE4ED8B1A0B86A64F67E6D55304484F8", hash_generated_method = "3D34DD67BBE34DF4B7CFCEBBEAAB209E")
        @Override
        public Float get(View object) {
            Float varB4EAC82CA7396A68D541C85D26508E83_1655613193 = null; //Variable for return #1
            varB4EAC82CA7396A68D541C85D26508E83_1655613193 = object.getTranslationX();
            addTaint(object.getTaint());
            varB4EAC82CA7396A68D541C85D26508E83_1655613193.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_1655613193;
            // ---------- Original Method ----------
            //return object.getTranslationX();
        }

        
};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.908 -0400", hash_original_field = "7372D8389B757BEF40F84E15ACD0B19E", hash_generated_field = "72697B1378F0156B218925573827A7F2")

    public static Property<View, Float> TRANSLATION_Y = new FloatProperty<View>("translationY") {        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.908 -0400", hash_original_method = "35EB991A21102AE6A66798A0E05F4EB7", hash_generated_method = "859D2DBB0F6F143B9E2065EC1314D06E")
        @Override
        public void setValue(View object, float value) {
            object.setTranslationY(value);
            addTaint(object.getTaint());
            addTaint(value);
            // ---------- Original Method ----------
            //object.setTranslationY(value);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.908 -0400", hash_original_method = "602B4C29E3FDDB39DD10FBFA4C1D4EAD", hash_generated_method = "4DF677462FC22C110C7AF08614E17C4E")
        @Override
        public Float get(View object) {
            Float varB4EAC82CA7396A68D541C85D26508E83_2057974377 = null; //Variable for return #1
            varB4EAC82CA7396A68D541C85D26508E83_2057974377 = object.getTranslationY();
            addTaint(object.getTaint());
            varB4EAC82CA7396A68D541C85D26508E83_2057974377.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_2057974377;
            // ---------- Original Method ----------
            //return object.getTranslationY();
        }

        
};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.909 -0400", hash_original_field = "7ABCFD2CD0D4C099DC453E558FE85F44", hash_generated_field = "87F9082E7D10F0627F82C05F91170E9B")

    public static Property<View, Float> X = new FloatProperty<View>("x") {        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.909 -0400", hash_original_method = "942D12A2907E436F9DD2D5A3BB599D1C", hash_generated_method = "5673AD22F2B7A4B4A4DB7FC87A386EBB")
        @Override
        public void setValue(View object, float value) {
            object.setX(value);
            addTaint(object.getTaint());
            addTaint(value);
            // ---------- Original Method ----------
            //object.setX(value);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.909 -0400", hash_original_method = "87F550DC0E1D4FED879AF17D796C775D", hash_generated_method = "BCB52F3F900E6B102E4AEB892B36AF5A")
        @Override
        public Float get(View object) {
            Float varB4EAC82CA7396A68D541C85D26508E83_1457771451 = null; //Variable for return #1
            varB4EAC82CA7396A68D541C85D26508E83_1457771451 = object.getX();
            addTaint(object.getTaint());
            varB4EAC82CA7396A68D541C85D26508E83_1457771451.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_1457771451;
            // ---------- Original Method ----------
            //return object.getX();
        }

        
};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.927 -0400", hash_original_field = "CFD3CAFD4126436BCB87BFC085957E57", hash_generated_field = "CBC741CF2F13B748CC62BF98ABF914D3")

    public static Property<View, Float> Y = new FloatProperty<View>("y") {        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.926 -0400", hash_original_method = "F66C6BF603238C3B745DBF80CCB68E15", hash_generated_method = "DEA583D8267371BB5F5499D21CFA9376")
        @Override
        public void setValue(View object, float value) {
            object.setY(value);
            addTaint(object.getTaint());
            addTaint(value);
            // ---------- Original Method ----------
            //object.setY(value);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.927 -0400", hash_original_method = "107F13AA20F45AE0A7AF10B2A89B1B3D", hash_generated_method = "A29CF327AB675662887DACEB206FA881")
        @Override
        public Float get(View object) {
            Float varB4EAC82CA7396A68D541C85D26508E83_2067722010 = null; //Variable for return #1
            varB4EAC82CA7396A68D541C85D26508E83_2067722010 = object.getY();
            addTaint(object.getTaint());
            varB4EAC82CA7396A68D541C85D26508E83_2067722010.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_2067722010;
            // ---------- Original Method ----------
            //return object.getY();
        }

        
};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.928 -0400", hash_original_field = "E56D0E5046417B3F74FFC7B03E80BE5C", hash_generated_field = "CBD7F64925BF2F0B6B4951C1B9C65B6C")

    public static Property<View, Float> ROTATION = new FloatProperty<View>("rotation") {        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.927 -0400", hash_original_method = "E4DD5C8F5E4B6A35D65B3372F3D8BFBA", hash_generated_method = "7B87B76B28B2CCC97296B3440E96F4B8")
        @Override
        public void setValue(View object, float value) {
            object.setRotation(value);
            addTaint(object.getTaint());
            addTaint(value);
            // ---------- Original Method ----------
            //object.setRotation(value);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.928 -0400", hash_original_method = "6F0DC1763312BEA34F1272E5458BA30D", hash_generated_method = "E9720FC077B3BCCC255A2D38835C2ED3")
        @Override
        public Float get(View object) {
            Float varB4EAC82CA7396A68D541C85D26508E83_220143312 = null; //Variable for return #1
            varB4EAC82CA7396A68D541C85D26508E83_220143312 = object.getRotation();
            addTaint(object.getTaint());
            varB4EAC82CA7396A68D541C85D26508E83_220143312.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_220143312;
            // ---------- Original Method ----------
            //return object.getRotation();
        }

        
};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.929 -0400", hash_original_field = "E6B3F0C9E4238E32ABB7463CE9AD008B", hash_generated_field = "ED46F079C5B738B30FF35A2D367267DD")

    public static Property<View, Float> ROTATION_X = new FloatProperty<View>("rotationX") {        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.928 -0400", hash_original_method = "D8E97A391BF9703940D7A06280ABBB3F", hash_generated_method = "50B23055286DFEC2BEF078575B84D379")
        @Override
        public void setValue(View object, float value) {
            object.setRotationX(value);
            addTaint(object.getTaint());
            addTaint(value);
            // ---------- Original Method ----------
            //object.setRotationX(value);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.929 -0400", hash_original_method = "3FE8B70962F32AF948528D0D6E8ED1AF", hash_generated_method = "E5E7A1AF5F28F8241A9F63A9034E678A")
        @Override
        public Float get(View object) {
            Float varB4EAC82CA7396A68D541C85D26508E83_310182210 = null; //Variable for return #1
            varB4EAC82CA7396A68D541C85D26508E83_310182210 = object.getRotationX();
            addTaint(object.getTaint());
            varB4EAC82CA7396A68D541C85D26508E83_310182210.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_310182210;
            // ---------- Original Method ----------
            //return object.getRotationX();
        }

        
};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.940 -0400", hash_original_field = "E871DD5638C4B35E145FF614A448D053", hash_generated_field = "C50BCEC834F8924596101B1FF3C07C7C")

    public static Property<View, Float> ROTATION_Y = new FloatProperty<View>("rotationY") {        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.929 -0400", hash_original_method = "CDE80AB2A44D5B173DB76AD6CA4559A4", hash_generated_method = "6BFA4FE5AFEE6877C144D55E489FA238")
        @Override
        public void setValue(View object, float value) {
            object.setRotationY(value);
            addTaint(object.getTaint());
            addTaint(value);
            // ---------- Original Method ----------
            //object.setRotationY(value);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.940 -0400", hash_original_method = "EE835584282672E99083546AE5304355", hash_generated_method = "3D5E2E75550C10AF4511E58F7F043764")
        @Override
        public Float get(View object) {
            Float varB4EAC82CA7396A68D541C85D26508E83_516423459 = null; //Variable for return #1
            varB4EAC82CA7396A68D541C85D26508E83_516423459 = object.getRotationY();
            addTaint(object.getTaint());
            varB4EAC82CA7396A68D541C85D26508E83_516423459.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_516423459;
            // ---------- Original Method ----------
            //return object.getRotationY();
        }

        
};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.941 -0400", hash_original_field = "D10E65978F70513DFF3F1897F968D4D2", hash_generated_field = "8FE555A50663D2666B29485794D2DF67")

    public static Property<View, Float> SCALE_X = new FloatProperty<View>("scaleX") {        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.940 -0400", hash_original_method = "1B653DA1FDE36CFBF0835E42B933826F", hash_generated_method = "6407D9D8200FAC2F976B75EF5CEBDEB3")
        @Override
        public void setValue(View object, float value) {
            object.setScaleX(value);
            addTaint(object.getTaint());
            addTaint(value);
            // ---------- Original Method ----------
            //object.setScaleX(value);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.941 -0400", hash_original_method = "A2F336BAC519262505475338F6D5EC55", hash_generated_method = "B8FCB3BDA4A0C55CD62E3EC9F4E4B080")
        @Override
        public Float get(View object) {
            Float varB4EAC82CA7396A68D541C85D26508E83_360691364 = null; //Variable for return #1
            varB4EAC82CA7396A68D541C85D26508E83_360691364 = object.getScaleX();
            addTaint(object.getTaint());
            varB4EAC82CA7396A68D541C85D26508E83_360691364.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_360691364;
            // ---------- Original Method ----------
            //return object.getScaleX();
        }

        
};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.942 -0400", hash_original_field = "5ABACA635607E234A6DDA7D7BAA57212", hash_generated_field = "1EE894EA2A4980D5D127440855D52877")

    public static Property<View, Float> SCALE_Y = new FloatProperty<View>("scaleY") {        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.941 -0400", hash_original_method = "1D5FE7CAB5F43F92B9050D214C28178E", hash_generated_method = "D1BA0A2967AE20F37607AFC8879E09FD")
        @Override
        public void setValue(View object, float value) {
            object.setScaleY(value);
            addTaint(object.getTaint());
            addTaint(value);
            // ---------- Original Method ----------
            //object.setScaleY(value);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:59.942 -0400", hash_original_method = "CDBF0205ED6FCB3C37D74DE97C039D1E", hash_generated_method = "3E77671310C7C88576F5D5A7BD84B19A")
        @Override
        public Float get(View object) {
            Float varB4EAC82CA7396A68D541C85D26508E83_1514398114 = null; //Variable for return #1
            varB4EAC82CA7396A68D541C85D26508E83_1514398114 = object.getScaleY();
            addTaint(object.getTaint());
            varB4EAC82CA7396A68D541C85D26508E83_1514398114.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_1514398114;
            // ---------- Original Method ----------
            //return object.getScaleY();
        }

        
};
}

