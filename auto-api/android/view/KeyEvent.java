package android.view;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.method.MetaKeyKeyListener;
import android.util.Log;
import android.util.Slog;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.KeyCharacterMap;
import android.view.KeyCharacterMap.KeyData;

public class KeyEvent extends InputEvent implements Parcelable {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.519 -0400", hash_original_field = "2271A9775971F952514B94408144FAA0", hash_generated_field = "A21260B04ED5B32DBDB0093B175D9F6A")

    private KeyEvent mNext;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.524 -0400", hash_original_field = "1212A62D731F217836716E35FA12386C", hash_generated_field = "2C8375875524783DEB30CD6C7E943390")

    private boolean mRecycled;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.524 -0400", hash_original_field = "DD9A3A8FAD85AE1264DE035645B54BEC", hash_generated_field = "AE8D59B3F804A7C4665D164A31D2B414")

    private int mDeviceId;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.524 -0400", hash_original_field = "6917951DFB797D97827BAAA584F128DE", hash_generated_field = "D564CAA4C2DB0DC0AAAD32F1767ED66A")

    private int mSource;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.524 -0400", hash_original_field = "FAD32D411972E0A85D1D781044420C0A", hash_generated_field = "5788BD80C680CA2939C7A313728CCB63")

    private int mMetaState;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.524 -0400", hash_original_field = "A3988EEE869C06063B06A0C38A6A1E11", hash_generated_field = "3956BA6D0CE8EE1BF5FC1D59E23F807A")

    private int mAction;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.524 -0400", hash_original_field = "EE855499B412893552B9F8058CF94D19", hash_generated_field = "6029AC817F6EE7A2286BA05155E91FE2")

    private int mKeyCode;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.524 -0400", hash_original_field = "35B602FDCFF3043E48F719D54038B8B1", hash_generated_field = "CE155A0F438E428C3DB8864C35950D08")

    private int mScanCode;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.524 -0400", hash_original_field = "F545692334BC1E20E53D9FB0B2CFFF33", hash_generated_field = "5BB8D24C9FBE77141A5AB3C9B511ACFF")

    private int mRepeatCount;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.525 -0400", hash_original_field = "9C3CD7D37D3E1E66BE9B3B005FC98B3A", hash_generated_field = "43F71E9173849705E01112D0229448B4")

    private int mFlags;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.525 -0400", hash_original_field = "51587355C5A724D8637EF803C946DD2D", hash_generated_field = "81CDF43B84B5DBDAAD8AA19BDADDFBB2")

    private long mDownTime;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.525 -0400", hash_original_field = "3EE1D0D0A7FA96B4DEE335E6458397C2", hash_generated_field = "D6C2226ACD561C7062177E3F0AB4BB2A")

    private long mEventTime;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.525 -0400", hash_original_field = "07DD93A0E98DDF0EC16A351B095260A6", hash_generated_field = "1B791AACABCED1A688CA7D7F3414CCF4")

    private String mCharacters;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.525 -0400", hash_original_method = "E1777BC70B96D5008D693732650D9927", hash_generated_method = "560F8A7FDE8C5C12025FD3A840761BDA")
    private  KeyEvent() {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.526 -0400", hash_original_method = "CD3F04ECBB2EC92C58F1141FB07383F6", hash_generated_method = "9E340ECF295B6405C058125A8CBA7881")
    public  KeyEvent(int action, int code) {
        mAction = action;
        mKeyCode = code;
        mRepeatCount = 0;
        mDeviceId = KeyCharacterMap.VIRTUAL_KEYBOARD;
        // ---------- Original Method ----------
        //mAction = action;
        //mKeyCode = code;
        //mRepeatCount = 0;
        //mDeviceId = KeyCharacterMap.VIRTUAL_KEYBOARD;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.527 -0400", hash_original_method = "460E02BA0A36D9C6A0F4AFF64D96FF32", hash_generated_method = "0E7C5DCA42C9647434DB4ABB082B8DB0")
    public  KeyEvent(long downTime, long eventTime, int action,
                    int code, int repeat) {
        mDownTime = downTime;
        mEventTime = eventTime;
        mAction = action;
        mKeyCode = code;
        mRepeatCount = repeat;
        mDeviceId = KeyCharacterMap.VIRTUAL_KEYBOARD;
        // ---------- Original Method ----------
        //mDownTime = downTime;
        //mEventTime = eventTime;
        //mAction = action;
        //mKeyCode = code;
        //mRepeatCount = repeat;
        //mDeviceId = KeyCharacterMap.VIRTUAL_KEYBOARD;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.530 -0400", hash_original_method = "25AD2761B1583202D71C2F5EBFFC872D", hash_generated_method = "275AD3BEE78984753ACE16E0BADC010A")
    public  KeyEvent(long downTime, long eventTime, int action,
                    int code, int repeat, int metaState) {
        mDownTime = downTime;
        mEventTime = eventTime;
        mAction = action;
        mKeyCode = code;
        mRepeatCount = repeat;
        mMetaState = metaState;
        mDeviceId = KeyCharacterMap.VIRTUAL_KEYBOARD;
        // ---------- Original Method ----------
        //mDownTime = downTime;
        //mEventTime = eventTime;
        //mAction = action;
        //mKeyCode = code;
        //mRepeatCount = repeat;
        //mMetaState = metaState;
        //mDeviceId = KeyCharacterMap.VIRTUAL_KEYBOARD;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.531 -0400", hash_original_method = "A71C4CD2E48CE8A2B595D45DAD40720E", hash_generated_method = "944B2B9BDB09A7DE50769025DCA0C0BA")
    public  KeyEvent(long downTime, long eventTime, int action,
                    int code, int repeat, int metaState,
                    int deviceId, int scancode) {
        mDownTime = downTime;
        mEventTime = eventTime;
        mAction = action;
        mKeyCode = code;
        mRepeatCount = repeat;
        mMetaState = metaState;
        mDeviceId = deviceId;
        mScanCode = scancode;
        // ---------- Original Method ----------
        //mDownTime = downTime;
        //mEventTime = eventTime;
        //mAction = action;
        //mKeyCode = code;
        //mRepeatCount = repeat;
        //mMetaState = metaState;
        //mDeviceId = deviceId;
        //mScanCode = scancode;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.532 -0400", hash_original_method = "8535C41697CC0C68061B8A72D476CEA4", hash_generated_method = "7D4CDB10B03A10C0F62150208FD4918C")
    public  KeyEvent(long downTime, long eventTime, int action,
                    int code, int repeat, int metaState,
                    int deviceId, int scancode, int flags) {
        mDownTime = downTime;
        mEventTime = eventTime;
        mAction = action;
        mKeyCode = code;
        mRepeatCount = repeat;
        mMetaState = metaState;
        mDeviceId = deviceId;
        mScanCode = scancode;
        mFlags = flags;
        // ---------- Original Method ----------
        //mDownTime = downTime;
        //mEventTime = eventTime;
        //mAction = action;
        //mKeyCode = code;
        //mRepeatCount = repeat;
        //mMetaState = metaState;
        //mDeviceId = deviceId;
        //mScanCode = scancode;
        //mFlags = flags;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.533 -0400", hash_original_method = "7235AB46A09763BE60DBC1995AF7FBA4", hash_generated_method = "FFFAE3B9A32EE21D7971626798028812")
    public  KeyEvent(long downTime, long eventTime, int action,
                    int code, int repeat, int metaState,
                    int deviceId, int scancode, int flags, int source) {
        mDownTime = downTime;
        mEventTime = eventTime;
        mAction = action;
        mKeyCode = code;
        mRepeatCount = repeat;
        mMetaState = metaState;
        mDeviceId = deviceId;
        mScanCode = scancode;
        mFlags = flags;
        mSource = source;
        // ---------- Original Method ----------
        //mDownTime = downTime;
        //mEventTime = eventTime;
        //mAction = action;
        //mKeyCode = code;
        //mRepeatCount = repeat;
        //mMetaState = metaState;
        //mDeviceId = deviceId;
        //mScanCode = scancode;
        //mFlags = flags;
        //mSource = source;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.540 -0400", hash_original_method = "6373116C9B5FF479EB0DF8409EEE5FFB", hash_generated_method = "F95BA2D7C1145285F19A2911AC9FDE5D")
    public  KeyEvent(long time, String characters, int deviceId, int flags) {
        mDownTime = time;
        mEventTime = time;
        mCharacters = characters;
        mAction = ACTION_MULTIPLE;
        mKeyCode = KEYCODE_UNKNOWN;
        mRepeatCount = 0;
        mDeviceId = deviceId;
        mFlags = flags;
        mSource = InputDevice.SOURCE_KEYBOARD;
        // ---------- Original Method ----------
        //mDownTime = time;
        //mEventTime = time;
        //mCharacters = characters;
        //mAction = ACTION_MULTIPLE;
        //mKeyCode = KEYCODE_UNKNOWN;
        //mRepeatCount = 0;
        //mDeviceId = deviceId;
        //mFlags = flags;
        //mSource = InputDevice.SOURCE_KEYBOARD;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.541 -0400", hash_original_method = "DBCE0965BBC4352F0EBDFBB71CBA04FA", hash_generated_method = "477A037D98AB21C2F5E1ED48F265600D")
    public  KeyEvent(KeyEvent origEvent) {
        mDownTime = origEvent.mDownTime;
        mEventTime = origEvent.mEventTime;
        mAction = origEvent.mAction;
        mKeyCode = origEvent.mKeyCode;
        mRepeatCount = origEvent.mRepeatCount;
        mMetaState = origEvent.mMetaState;
        mDeviceId = origEvent.mDeviceId;
        mSource = origEvent.mSource;
        mScanCode = origEvent.mScanCode;
        mFlags = origEvent.mFlags;
        mCharacters = origEvent.mCharacters;
        // ---------- Original Method ----------
        //mDownTime = origEvent.mDownTime;
        //mEventTime = origEvent.mEventTime;
        //mAction = origEvent.mAction;
        //mKeyCode = origEvent.mKeyCode;
        //mRepeatCount = origEvent.mRepeatCount;
        //mMetaState = origEvent.mMetaState;
        //mDeviceId = origEvent.mDeviceId;
        //mSource = origEvent.mSource;
        //mScanCode = origEvent.mScanCode;
        //mFlags = origEvent.mFlags;
        //mCharacters = origEvent.mCharacters;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.542 -0400", hash_original_method = "1712784D81B05F738E3678B0ED7626EA", hash_generated_method = "0524BA17BB94C2A262CF63DD8345ECE8")
    @Deprecated
    public  KeyEvent(KeyEvent origEvent, long eventTime, int newRepeat) {
        mDownTime = origEvent.mDownTime;
        mEventTime = eventTime;
        mAction = origEvent.mAction;
        mKeyCode = origEvent.mKeyCode;
        mRepeatCount = newRepeat;
        mMetaState = origEvent.mMetaState;
        mDeviceId = origEvent.mDeviceId;
        mSource = origEvent.mSource;
        mScanCode = origEvent.mScanCode;
        mFlags = origEvent.mFlags;
        mCharacters = origEvent.mCharacters;
        // ---------- Original Method ----------
        //mDownTime = origEvent.mDownTime;
        //mEventTime = eventTime;
        //mAction = origEvent.mAction;
        //mKeyCode = origEvent.mKeyCode;
        //mRepeatCount = newRepeat;
        //mMetaState = origEvent.mMetaState;
        //mDeviceId = origEvent.mDeviceId;
        //mSource = origEvent.mSource;
        //mScanCode = origEvent.mScanCode;
        //mFlags = origEvent.mFlags;
        //mCharacters = origEvent.mCharacters;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.549 -0400", hash_original_method = "5AF6098C2FF410C0A9EE2BEE9470EC38", hash_generated_method = "33CAD1EFF43FC0C02F7B3E9661DD9448")
    private  KeyEvent(KeyEvent origEvent, int action) {
        mDownTime = origEvent.mDownTime;
        mEventTime = origEvent.mEventTime;
        mAction = action;
        mKeyCode = origEvent.mKeyCode;
        mRepeatCount = origEvent.mRepeatCount;
        mMetaState = origEvent.mMetaState;
        mDeviceId = origEvent.mDeviceId;
        mSource = origEvent.mSource;
        mScanCode = origEvent.mScanCode;
        mFlags = origEvent.mFlags;
        // ---------- Original Method ----------
        //mDownTime = origEvent.mDownTime;
        //mEventTime = origEvent.mEventTime;
        //mAction = action;
        //mKeyCode = origEvent.mKeyCode;
        //mRepeatCount = origEvent.mRepeatCount;
        //mMetaState = origEvent.mMetaState;
        //mDeviceId = origEvent.mDeviceId;
        //mSource = origEvent.mSource;
        //mScanCode = origEvent.mScanCode;
        //mFlags = origEvent.mFlags;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.550 -0400", hash_original_method = "6CD21CCD9028EF5AE389AE8F77253E73", hash_generated_method = "7875E9A704AEFC535275AEDFF1A3D334")
    private  KeyEvent(Parcel in) {
        mDeviceId = in.readInt();
        mSource = in.readInt();
        mAction = in.readInt();
        mKeyCode = in.readInt();
        mRepeatCount = in.readInt();
        mMetaState = in.readInt();
        mScanCode = in.readInt();
        mFlags = in.readInt();
        mDownTime = in.readLong();
        mEventTime = in.readLong();
        // ---------- Original Method ----------
        //mDeviceId = in.readInt();
        //mSource = in.readInt();
        //mAction = in.readInt();
        //mKeyCode = in.readInt();
        //mRepeatCount = in.readInt();
        //mMetaState = in.readInt();
        //mScanCode = in.readInt();
        //mFlags = in.readInt();
        //mDownTime = in.readLong();
        //mEventTime = in.readLong();
    }

    
        private static void populateKeycodeSymbolicNames() {
        SparseArray<String> names = KEYCODE_SYMBOLIC_NAMES;
        names.append(KEYCODE_UNKNOWN, "KEYCODE_UNKNOWN");
        names.append(KEYCODE_SOFT_LEFT, "KEYCODE_SOFT_LEFT");
        names.append(KEYCODE_SOFT_RIGHT, "KEYCODE_SOFT_RIGHT");
        names.append(KEYCODE_HOME, "KEYCODE_HOME");
        names.append(KEYCODE_BACK, "KEYCODE_BACK");
        names.append(KEYCODE_CALL, "KEYCODE_CALL");
        names.append(KEYCODE_ENDCALL, "KEYCODE_ENDCALL");
        names.append(KEYCODE_0, "KEYCODE_0");
        names.append(KEYCODE_1, "KEYCODE_1");
        names.append(KEYCODE_2, "KEYCODE_2");
        names.append(KEYCODE_3, "KEYCODE_3");
        names.append(KEYCODE_4, "KEYCODE_4");
        names.append(KEYCODE_5, "KEYCODE_5");
        names.append(KEYCODE_6, "KEYCODE_6");
        names.append(KEYCODE_7, "KEYCODE_7");
        names.append(KEYCODE_8, "KEYCODE_8");
        names.append(KEYCODE_9, "KEYCODE_9");
        names.append(KEYCODE_STAR, "KEYCODE_STAR");
        names.append(KEYCODE_POUND, "KEYCODE_POUND");
        names.append(KEYCODE_DPAD_UP, "KEYCODE_DPAD_UP");
        names.append(KEYCODE_DPAD_DOWN, "KEYCODE_DPAD_DOWN");
        names.append(KEYCODE_DPAD_LEFT, "KEYCODE_DPAD_LEFT");
        names.append(KEYCODE_DPAD_RIGHT, "KEYCODE_DPAD_RIGHT");
        names.append(KEYCODE_DPAD_CENTER, "KEYCODE_DPAD_CENTER");
        names.append(KEYCODE_VOLUME_UP, "KEYCODE_VOLUME_UP");
        names.append(KEYCODE_VOLUME_DOWN, "KEYCODE_VOLUME_DOWN");
        names.append(KEYCODE_POWER, "KEYCODE_POWER");
        names.append(KEYCODE_CAMERA, "KEYCODE_CAMERA");
        names.append(KEYCODE_CLEAR, "KEYCODE_CLEAR");
        names.append(KEYCODE_A, "KEYCODE_A");
        names.append(KEYCODE_B, "KEYCODE_B");
        names.append(KEYCODE_C, "KEYCODE_C");
        names.append(KEYCODE_D, "KEYCODE_D");
        names.append(KEYCODE_E, "KEYCODE_E");
        names.append(KEYCODE_F, "KEYCODE_F");
        names.append(KEYCODE_G, "KEYCODE_G");
        names.append(KEYCODE_H, "KEYCODE_H");
        names.append(KEYCODE_I, "KEYCODE_I");
        names.append(KEYCODE_J, "KEYCODE_J");
        names.append(KEYCODE_K, "KEYCODE_K");
        names.append(KEYCODE_L, "KEYCODE_L");
        names.append(KEYCODE_M, "KEYCODE_M");
        names.append(KEYCODE_N, "KEYCODE_N");
        names.append(KEYCODE_O, "KEYCODE_O");
        names.append(KEYCODE_P, "KEYCODE_P");
        names.append(KEYCODE_Q, "KEYCODE_Q");
        names.append(KEYCODE_R, "KEYCODE_R");
        names.append(KEYCODE_S, "KEYCODE_S");
        names.append(KEYCODE_T, "KEYCODE_T");
        names.append(KEYCODE_U, "KEYCODE_U");
        names.append(KEYCODE_V, "KEYCODE_V");
        names.append(KEYCODE_W, "KEYCODE_W");
        names.append(KEYCODE_X, "KEYCODE_X");
        names.append(KEYCODE_Y, "KEYCODE_Y");
        names.append(KEYCODE_Z, "KEYCODE_Z");
        names.append(KEYCODE_COMMA, "KEYCODE_COMMA");
        names.append(KEYCODE_PERIOD, "KEYCODE_PERIOD");
        names.append(KEYCODE_ALT_LEFT, "KEYCODE_ALT_LEFT");
        names.append(KEYCODE_ALT_RIGHT, "KEYCODE_ALT_RIGHT");
        names.append(KEYCODE_SHIFT_LEFT, "KEYCODE_SHIFT_LEFT");
        names.append(KEYCODE_SHIFT_RIGHT, "KEYCODE_SHIFT_RIGHT");
        names.append(KEYCODE_TAB, "KEYCODE_TAB");
        names.append(KEYCODE_SPACE, "KEYCODE_SPACE");
        names.append(KEYCODE_SYM, "KEYCODE_SYM");
        names.append(KEYCODE_EXPLORER, "KEYCODE_EXPLORER");
        names.append(KEYCODE_ENVELOPE, "KEYCODE_ENVELOPE");
        names.append(KEYCODE_ENTER, "KEYCODE_ENTER");
        names.append(KEYCODE_DEL, "KEYCODE_DEL");
        names.append(KEYCODE_GRAVE, "KEYCODE_GRAVE");
        names.append(KEYCODE_MINUS, "KEYCODE_MINUS");
        names.append(KEYCODE_EQUALS, "KEYCODE_EQUALS");
        names.append(KEYCODE_LEFT_BRACKET, "KEYCODE_LEFT_BRACKET");
        names.append(KEYCODE_RIGHT_BRACKET, "KEYCODE_RIGHT_BRACKET");
        names.append(KEYCODE_BACKSLASH, "KEYCODE_BACKSLASH");
        names.append(KEYCODE_SEMICOLON, "KEYCODE_SEMICOLON");
        names.append(KEYCODE_APOSTROPHE, "KEYCODE_APOSTROPHE");
        names.append(KEYCODE_SLASH, "KEYCODE_SLASH");
        names.append(KEYCODE_AT, "KEYCODE_AT");
        names.append(KEYCODE_NUM, "KEYCODE_NUM");
        names.append(KEYCODE_HEADSETHOOK, "KEYCODE_HEADSETHOOK");
        names.append(KEYCODE_FOCUS, "KEYCODE_FOCUS");
        names.append(KEYCODE_PLUS, "KEYCODE_PLUS");
        names.append(KEYCODE_MENU, "KEYCODE_MENU");
        names.append(KEYCODE_NOTIFICATION, "KEYCODE_NOTIFICATION");
        names.append(KEYCODE_SEARCH, "KEYCODE_SEARCH");
        names.append(KEYCODE_MEDIA_PLAY_PAUSE, "KEYCODE_MEDIA_PLAY_PAUSE");
        names.append(KEYCODE_MEDIA_STOP, "KEYCODE_MEDIA_STOP");
        names.append(KEYCODE_MEDIA_NEXT, "KEYCODE_MEDIA_NEXT");
        names.append(KEYCODE_MEDIA_PREVIOUS, "KEYCODE_MEDIA_PREVIOUS");
        names.append(KEYCODE_MEDIA_REWIND, "KEYCODE_MEDIA_REWIND");
        names.append(KEYCODE_MEDIA_FAST_FORWARD, "KEYCODE_MEDIA_FAST_FORWARD");
        names.append(KEYCODE_MUTE, "KEYCODE_MUTE");
        names.append(KEYCODE_PAGE_UP, "KEYCODE_PAGE_UP");
        names.append(KEYCODE_PAGE_DOWN, "KEYCODE_PAGE_DOWN");
        names.append(KEYCODE_PICTSYMBOLS, "KEYCODE_PICTSYMBOLS");
        names.append(KEYCODE_SWITCH_CHARSET, "KEYCODE_SWITCH_CHARSET");
        names.append(KEYCODE_BUTTON_A, "KEYCODE_BUTTON_A");
        names.append(KEYCODE_BUTTON_B, "KEYCODE_BUTTON_B");
        names.append(KEYCODE_BUTTON_C, "KEYCODE_BUTTON_C");
        names.append(KEYCODE_BUTTON_X, "KEYCODE_BUTTON_X");
        names.append(KEYCODE_BUTTON_Y, "KEYCODE_BUTTON_Y");
        names.append(KEYCODE_BUTTON_Z, "KEYCODE_BUTTON_Z");
        names.append(KEYCODE_BUTTON_L1, "KEYCODE_BUTTON_L1");
        names.append(KEYCODE_BUTTON_R1, "KEYCODE_BUTTON_R1");
        names.append(KEYCODE_BUTTON_L2, "KEYCODE_BUTTON_L2");
        names.append(KEYCODE_BUTTON_R2, "KEYCODE_BUTTON_R2");
        names.append(KEYCODE_BUTTON_THUMBL, "KEYCODE_BUTTON_THUMBL");
        names.append(KEYCODE_BUTTON_THUMBR, "KEYCODE_BUTTON_THUMBR");
        names.append(KEYCODE_BUTTON_START, "KEYCODE_BUTTON_START");
        names.append(KEYCODE_BUTTON_SELECT, "KEYCODE_BUTTON_SELECT");
        names.append(KEYCODE_BUTTON_MODE, "KEYCODE_BUTTON_MODE");
        names.append(KEYCODE_ESCAPE, "KEYCODE_ESCAPE");
        names.append(KEYCODE_FORWARD_DEL, "KEYCODE_FORWARD_DEL");
        names.append(KEYCODE_CTRL_LEFT, "KEYCODE_CTRL_LEFT");
        names.append(KEYCODE_CTRL_RIGHT, "KEYCODE_CTRL_RIGHT");
        names.append(KEYCODE_CAPS_LOCK, "KEYCODE_CAPS_LOCK");
        names.append(KEYCODE_SCROLL_LOCK, "KEYCODE_SCROLL_LOCK");
        names.append(KEYCODE_META_LEFT, "KEYCODE_META_LEFT");
        names.append(KEYCODE_META_RIGHT, "KEYCODE_META_RIGHT");
        names.append(KEYCODE_FUNCTION, "KEYCODE_FUNCTION");
        names.append(KEYCODE_SYSRQ, "KEYCODE_SYSRQ");
        names.append(KEYCODE_BREAK, "KEYCODE_BREAK");
        names.append(KEYCODE_MOVE_HOME, "KEYCODE_MOVE_HOME");
        names.append(KEYCODE_MOVE_END, "KEYCODE_MOVE_END");
        names.append(KEYCODE_INSERT, "KEYCODE_INSERT");
        names.append(KEYCODE_FORWARD, "KEYCODE_FORWARD");
        names.append(KEYCODE_MEDIA_PLAY, "KEYCODE_MEDIA_PLAY");
        names.append(KEYCODE_MEDIA_PAUSE, "KEYCODE_MEDIA_PAUSE");
        names.append(KEYCODE_MEDIA_CLOSE, "KEYCODE_MEDIA_CLOSE");
        names.append(KEYCODE_MEDIA_EJECT, "KEYCODE_MEDIA_EJECT");
        names.append(KEYCODE_MEDIA_RECORD, "KEYCODE_MEDIA_RECORD");
        names.append(KEYCODE_F1, "KEYCODE_F1");
        names.append(KEYCODE_F2, "KEYCODE_F2");
        names.append(KEYCODE_F3, "KEYCODE_F3");
        names.append(KEYCODE_F4, "KEYCODE_F4");
        names.append(KEYCODE_F5, "KEYCODE_F5");
        names.append(KEYCODE_F6, "KEYCODE_F6");
        names.append(KEYCODE_F7, "KEYCODE_F7");
        names.append(KEYCODE_F8, "KEYCODE_F8");
        names.append(KEYCODE_F9, "KEYCODE_F9");
        names.append(KEYCODE_F10, "KEYCODE_F10");
        names.append(KEYCODE_F11, "KEYCODE_F11");
        names.append(KEYCODE_F12, "KEYCODE_F12");
        names.append(KEYCODE_NUM_LOCK, "KEYCODE_NUM_LOCK");
        names.append(KEYCODE_NUMPAD_0, "KEYCODE_NUMPAD_0");
        names.append(KEYCODE_NUMPAD_1, "KEYCODE_NUMPAD_1");
        names.append(KEYCODE_NUMPAD_2, "KEYCODE_NUMPAD_2");
        names.append(KEYCODE_NUMPAD_3, "KEYCODE_NUMPAD_3");
        names.append(KEYCODE_NUMPAD_4, "KEYCODE_NUMPAD_4");
        names.append(KEYCODE_NUMPAD_5, "KEYCODE_NUMPAD_5");
        names.append(KEYCODE_NUMPAD_6, "KEYCODE_NUMPAD_6");
        names.append(KEYCODE_NUMPAD_7, "KEYCODE_NUMPAD_7");
        names.append(KEYCODE_NUMPAD_8, "KEYCODE_NUMPAD_8");
        names.append(KEYCODE_NUMPAD_9, "KEYCODE_NUMPAD_9");
        names.append(KEYCODE_NUMPAD_DIVIDE, "KEYCODE_NUMPAD_DIVIDE");
        names.append(KEYCODE_NUMPAD_MULTIPLY, "KEYCODE_NUMPAD_MULTIPLY");
        names.append(KEYCODE_NUMPAD_SUBTRACT, "KEYCODE_NUMPAD_SUBTRACT");
        names.append(KEYCODE_NUMPAD_ADD, "KEYCODE_NUMPAD_ADD");
        names.append(KEYCODE_NUMPAD_DOT, "KEYCODE_NUMPAD_DOT");
        names.append(KEYCODE_NUMPAD_COMMA, "KEYCODE_NUMPAD_COMMA");
        names.append(KEYCODE_NUMPAD_ENTER, "KEYCODE_NUMPAD_ENTER");
        names.append(KEYCODE_NUMPAD_EQUALS, "KEYCODE_NUMPAD_EQUALS");
        names.append(KEYCODE_NUMPAD_LEFT_PAREN, "KEYCODE_NUMPAD_LEFT_PAREN");
        names.append(KEYCODE_NUMPAD_RIGHT_PAREN, "KEYCODE_NUMPAD_RIGHT_PAREN");
        names.append(KEYCODE_VOLUME_MUTE, "KEYCODE_VOLUME_MUTE");
        names.append(KEYCODE_INFO, "KEYCODE_INFO");
        names.append(KEYCODE_CHANNEL_UP, "KEYCODE_CHANNEL_UP");
        names.append(KEYCODE_CHANNEL_DOWN, "KEYCODE_CHANNEL_DOWN");
        names.append(KEYCODE_ZOOM_IN, "KEYCODE_ZOOM_IN");
        names.append(KEYCODE_ZOOM_OUT, "KEYCODE_ZOOM_OUT");
        names.append(KEYCODE_TV, "KEYCODE_TV");
        names.append(KEYCODE_WINDOW, "KEYCODE_WINDOW");
        names.append(KEYCODE_GUIDE, "KEYCODE_GUIDE");
        names.append(KEYCODE_DVR, "KEYCODE_DVR");
        names.append(KEYCODE_BOOKMARK, "KEYCODE_BOOKMARK");
        names.append(KEYCODE_CAPTIONS, "KEYCODE_CAPTIONS");
        names.append(KEYCODE_SETTINGS, "KEYCODE_SETTINGS");
        names.append(KEYCODE_TV_POWER, "KEYCODE_TV_POWER");
        names.append(KEYCODE_TV_INPUT, "KEYCODE_TV_INPUT");
        names.append(KEYCODE_STB_INPUT, "KEYCODE_STB_INPUT");
        names.append(KEYCODE_STB_POWER, "KEYCODE_STB_POWER");
        names.append(KEYCODE_AVR_POWER, "KEYCODE_AVR_POWER");
        names.append(KEYCODE_AVR_INPUT, "KEYCODE_AVR_INPUT");
        names.append(KEYCODE_PROG_RED, "KEYCODE_PROG_RED");
        names.append(KEYCODE_PROG_GREEN, "KEYCODE_PROG_GREEN");
        names.append(KEYCODE_PROG_YELLOW, "KEYCODE_PROG_YELLOW");
        names.append(KEYCODE_PROG_BLUE, "KEYCODE_PROG_BLUE");
        names.append(KEYCODE_APP_SWITCH, "KEYCODE_APP_SWITCH");
        names.append(KEYCODE_BUTTON_1, "KEYCODE_BUTTON_1");
        names.append(KEYCODE_BUTTON_2, "KEYCODE_BUTTON_2");
        names.append(KEYCODE_BUTTON_3, "KEYCODE_BUTTON_3");
        names.append(KEYCODE_BUTTON_4, "KEYCODE_BUTTON_4");
        names.append(KEYCODE_BUTTON_5, "KEYCODE_BUTTON_5");
        names.append(KEYCODE_BUTTON_6, "KEYCODE_BUTTON_6");
        names.append(KEYCODE_BUTTON_7, "KEYCODE_BUTTON_7");
        names.append(KEYCODE_BUTTON_8, "KEYCODE_BUTTON_8");
        names.append(KEYCODE_BUTTON_9, "KEYCODE_BUTTON_9");
        names.append(KEYCODE_BUTTON_10, "KEYCODE_BUTTON_10");
        names.append(KEYCODE_BUTTON_11, "KEYCODE_BUTTON_11");
        names.append(KEYCODE_BUTTON_12, "KEYCODE_BUTTON_12");
        names.append(KEYCODE_BUTTON_13, "KEYCODE_BUTTON_13");
        names.append(KEYCODE_BUTTON_14, "KEYCODE_BUTTON_14");
        names.append(KEYCODE_BUTTON_15, "KEYCODE_BUTTON_15");
        names.append(KEYCODE_BUTTON_16, "KEYCODE_BUTTON_16");
        names.append(KEYCODE_LANGUAGE_SWITCH, "KEYCODE_LANGUAGE_SWITCH");
        names.append(KEYCODE_MANNER_MODE, "KEYCODE_MANNER_MODE");
        names.append(KEYCODE_3D_MODE, "KEYCODE_3D_MODE");
        names.append(KEYCODE_CONTACTS, "KEYCODE_CONTACTS");
        names.append(KEYCODE_CALENDAR, "KEYCODE_CALENDAR");
        names.append(KEYCODE_MUSIC, "KEYCODE_MUSIC");
        names.append(KEYCODE_CALCULATOR, "KEYCODE_CALCULATOR");
    }

    
        public static int getMaxKeyCode() {
        return LAST_KEYCODE;
    }

    
        public static int getDeadChar(int accent, int c) {
        return KeyCharacterMap.getDeadChar(accent, c);
    }

    
        private static KeyEvent obtain() {
        final KeyEvent ev;
        synchronized (gRecyclerLock) {
            ev = gRecyclerTop;
            if (ev == null) {
                return new KeyEvent();
            }
            gRecyclerTop = ev.mNext;
            gRecyclerUsed -= 1;
        }
        ev.mRecycled = false;
        ev.mNext = null;
        return ev;
    }

    
        public static KeyEvent obtain(long downTime, long eventTime, int action,
                    int code, int repeat, int metaState,
                    int deviceId, int scancode, int flags, int source, String characters) {
        KeyEvent ev = obtain();
        ev.mDownTime = downTime;
        ev.mEventTime = eventTime;
        ev.mAction = action;
        ev.mKeyCode = code;
        ev.mRepeatCount = repeat;
        ev.mMetaState = metaState;
        ev.mDeviceId = deviceId;
        ev.mScanCode = scancode;
        ev.mFlags = flags;
        ev.mSource = source;
        ev.mCharacters = characters;
        return ev;
    }

    
        public static KeyEvent obtain(KeyEvent other) {
        KeyEvent ev = obtain();
        ev.mDownTime = other.mDownTime;
        ev.mEventTime = other.mEventTime;
        ev.mAction = other.mAction;
        ev.mKeyCode = other.mKeyCode;
        ev.mRepeatCount = other.mRepeatCount;
        ev.mMetaState = other.mMetaState;
        ev.mDeviceId = other.mDeviceId;
        ev.mScanCode = other.mScanCode;
        ev.mFlags = other.mFlags;
        ev.mSource = other.mSource;
        ev.mCharacters = other.mCharacters;
        return ev;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.566 -0400", hash_original_method = "71F28D5E8589FEEEB25F09C6B26D40EA", hash_generated_method = "89528AC70DAD350673CDCCD81B1C8C92")
    @Override
    public KeyEvent copy() {
        KeyEvent varB4EAC82CA7396A68D541C85D26508E83_929749941 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_929749941 = obtain(this);
        varB4EAC82CA7396A68D541C85D26508E83_929749941.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_929749941;
        // ---------- Original Method ----------
        //return obtain(this);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.567 -0400", hash_original_method = "6B64621545DE4A3A123816F2DEDFC8C2", hash_generated_method = "90A8807665A99578518572ED178F8D6C")
    public final void recycle() {
        {
            if (DroidSafeAndroidRuntime.control) throw new RuntimeException(toString() + " recycled twice!");
        } //End block
        mRecycled = true;
        mCharacters = null;
        {
            {
                mNext = gRecyclerTop;
                gRecyclerTop = this;
            } //End block
        } //End block
        // ---------- Original Method ----------
        //if (mRecycled) {
            //throw new RuntimeException(toString() + " recycled twice!");
        //}
        //mRecycled = true;
        //mCharacters = null;
        //synchronized (gRecyclerLock) {
            //if (gRecyclerUsed < MAX_RECYCLED) {
                //gRecyclerUsed++;
                //mNext = gRecyclerTop;
                //gRecyclerTop = this;
            //}
        //}
    }

    
        public static KeyEvent changeTimeRepeat(KeyEvent event, long eventTime,
            int newRepeat) {
        return new KeyEvent(event, eventTime, newRepeat);
    }

    
        public static KeyEvent changeTimeRepeat(KeyEvent event, long eventTime,
            int newRepeat, int newFlags) {
        KeyEvent ret = new KeyEvent(event);
        ret.mEventTime = eventTime;
        ret.mRepeatCount = newRepeat;
        ret.mFlags = newFlags;
        return ret;
    }

    
        public static KeyEvent changeAction(KeyEvent event, int action) {
        return new KeyEvent(event, action);
    }

    
        public static KeyEvent changeFlags(KeyEvent event, int flags) {
        event = new KeyEvent(event);
        event.mFlags = flags;
        return event;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.569 -0400", hash_original_method = "F86D8C7B1180DE3A66C7F2BDF135A8B2", hash_generated_method = "B9DCC458F29BE9DC8C38F5D9D0719025")
    @Override
    public final boolean isTainted() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1093241646 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1093241646;
        // ---------- Original Method ----------
        //return (mFlags & FLAG_TAINTED) != 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.570 -0400", hash_original_method = "BF13334B6C13BDDF4754612AD733986A", hash_generated_method = "DBE85A001D43202923E7F0705E8D281D")
    @Override
    public final void setTainted(boolean tainted) {
        mFlags = tainted ? mFlags | FLAG_TAINTED : mFlags & ~FLAG_TAINTED;
        // ---------- Original Method ----------
        //mFlags = tainted ? mFlags | FLAG_TAINTED : mFlags & ~FLAG_TAINTED;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.571 -0400", hash_original_method = "CB44DB443D68CB8A4DB0177D0C026F61", hash_generated_method = "9906346DCC754D1680D76937808447C1")
    @Deprecated
    public final boolean isDown() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1087237025 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1087237025;
        // ---------- Original Method ----------
        //return mAction == ACTION_DOWN;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.571 -0400", hash_original_method = "CAD37C193D4DCF9F544C4B94A265DB37", hash_generated_method = "6B1A0CD95553795237FB42204746FD83")
    public final boolean isSystem() {
        boolean varE6AE4855DF83EA7EFECC7D1592082189_228107020 = (native_isSystemKey(mKeyCode));
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_349652965 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_349652965;
        // ---------- Original Method ----------
        //return native_isSystemKey(mKeyCode);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.572 -0400", hash_original_method = "FEBEE3014E41544B75A2E175FCF48721", hash_generated_method = "02B7F0D86ABBDE49C12981E9A240EABD")
    public final boolean hasDefaultAction() {
        boolean var3700A8CA622BABEEE0834C3658EDA3E8_290301000 = (native_hasDefaultAction(mKeyCode));
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1110111784 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1110111784;
        // ---------- Original Method ----------
        //return native_hasDefaultAction(mKeyCode);
    }

    
        public static final boolean isGamepadButton(int keyCode) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_BUTTON_A:
            case KeyEvent.KEYCODE_BUTTON_B:
            case KeyEvent.KEYCODE_BUTTON_C:
            case KeyEvent.KEYCODE_BUTTON_X:
            case KeyEvent.KEYCODE_BUTTON_Y:
            case KeyEvent.KEYCODE_BUTTON_Z:
            case KeyEvent.KEYCODE_BUTTON_L1:
            case KeyEvent.KEYCODE_BUTTON_R1:
            case KeyEvent.KEYCODE_BUTTON_L2:
            case KeyEvent.KEYCODE_BUTTON_R2:
            case KeyEvent.KEYCODE_BUTTON_THUMBL:
            case KeyEvent.KEYCODE_BUTTON_THUMBR:
            case KeyEvent.KEYCODE_BUTTON_START:
            case KeyEvent.KEYCODE_BUTTON_SELECT:
            case KeyEvent.KEYCODE_BUTTON_MODE:
            case KeyEvent.KEYCODE_BUTTON_1:
            case KeyEvent.KEYCODE_BUTTON_2:
            case KeyEvent.KEYCODE_BUTTON_3:
            case KeyEvent.KEYCODE_BUTTON_4:
            case KeyEvent.KEYCODE_BUTTON_5:
            case KeyEvent.KEYCODE_BUTTON_6:
            case KeyEvent.KEYCODE_BUTTON_7:
            case KeyEvent.KEYCODE_BUTTON_8:
            case KeyEvent.KEYCODE_BUTTON_9:
            case KeyEvent.KEYCODE_BUTTON_10:
            case KeyEvent.KEYCODE_BUTTON_11:
            case KeyEvent.KEYCODE_BUTTON_12:
            case KeyEvent.KEYCODE_BUTTON_13:
            case KeyEvent.KEYCODE_BUTTON_14:
            case KeyEvent.KEYCODE_BUTTON_15:
            case KeyEvent.KEYCODE_BUTTON_16:
                return true;
            default:
                return false;
        }
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.581 -0400", hash_original_method = "7BF185CA9C1C463FC99CEDE50E8D63D5", hash_generated_method = "7484767979833E7E8792CB3E7235C34C")
    @Override
    public final int getDeviceId() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2123657764 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2123657764;
        // ---------- Original Method ----------
        //return mDeviceId;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.581 -0400", hash_original_method = "7037355E864C633C32E117AF9FFED93E", hash_generated_method = "5D7F5D5FA7149949D85E40F67AEB0D34")
    @Override
    public final int getSource() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1907918669 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1907918669;
        // ---------- Original Method ----------
        //return mSource;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.582 -0400", hash_original_method = "38516F33934E20A73DA8FE7BA747BA99", hash_generated_method = "3E21BC346D9D226CDA48B7DE02082822")
    @Override
    public final void setSource(int source) {
        mSource = source;
        // ---------- Original Method ----------
        //mSource = source;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.582 -0400", hash_original_method = "8A0F7162152E6ECED85F47A14B4B5FFC", hash_generated_method = "AA867D86E8610C9C6E0CEE4C0AE9FB33")
    public final int getMetaState() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_166177888 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_166177888;
        // ---------- Original Method ----------
        //return mMetaState;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.583 -0400", hash_original_method = "B496E7302AF88C4E63C665D5FB521FB2", hash_generated_method = "211672AA3EDF910E665E6EF0860C56E6")
    public final int getModifiers() {
        int varBE1D060D57A6403B56DE9C919712B4F7_562488180 = (normalizeMetaState(mMetaState) & META_MODIFIER_MASK);
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_732613349 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_732613349;
        // ---------- Original Method ----------
        //return normalizeMetaState(mMetaState) & META_MODIFIER_MASK;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.585 -0400", hash_original_method = "CE8F8E5E4A30C515D6BD9049A49703B9", hash_generated_method = "A6DA21BC3194117D2D0B7989542C5F52")
    public final int getFlags() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_857722997 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_857722997;
        // ---------- Original Method ----------
        //return mFlags;
    }

    
        public static int getModifierMetaStateMask() {
        return META_MODIFIER_MASK;
    }

    
        public static boolean isModifierKey(int keyCode) {
        switch (keyCode) {
            case KEYCODE_SHIFT_LEFT:
            case KEYCODE_SHIFT_RIGHT:
            case KEYCODE_ALT_LEFT:
            case KEYCODE_ALT_RIGHT:
            case KEYCODE_CTRL_LEFT:
            case KEYCODE_CTRL_RIGHT:
            case KEYCODE_META_LEFT:
            case KEYCODE_META_RIGHT:
            case KEYCODE_SYM:
            case KEYCODE_NUM:
            case KEYCODE_FUNCTION:
                return true;
            default:
                return false;
        }
    }

    
        public static int normalizeMetaState(int metaState) {
        if ((metaState & (META_SHIFT_LEFT_ON | META_SHIFT_RIGHT_ON)) != 0) {
            metaState |= META_SHIFT_ON;
        }
        if ((metaState & (META_ALT_LEFT_ON | META_ALT_RIGHT_ON)) != 0) {
            metaState |= META_ALT_ON;
        }
        if ((metaState & (META_CTRL_LEFT_ON | META_CTRL_RIGHT_ON)) != 0) {
            metaState |= META_CTRL_ON;
        }
        if ((metaState & (META_META_LEFT_ON | META_META_RIGHT_ON)) != 0) {
            metaState |= META_META_ON;
        }
        if ((metaState & MetaKeyKeyListener.META_CAP_LOCKED) != 0) {
            metaState |= META_CAPS_LOCK_ON;
        }
        if ((metaState & MetaKeyKeyListener.META_ALT_LOCKED) != 0) {
            metaState |= META_ALT_ON;
        }
        if ((metaState & MetaKeyKeyListener.META_SYM_LOCKED) != 0) {
            metaState |= META_SYM_ON;
        }
        return metaState & META_ALL_MASK;
    }

    
        public static boolean metaStateHasNoModifiers(int metaState) {
        return (normalizeMetaState(metaState) & META_MODIFIER_MASK) == 0;
    }

    
        public static boolean metaStateHasModifiers(int metaState, int modifiers) {
        if ((modifiers & META_INVALID_MODIFIER_MASK) != 0) {
            throw new IllegalArgumentException("modifiers must not contain "
                    + "META_CAPS_LOCK_ON, META_NUM_LOCK_ON, META_SCROLL_LOCK_ON, "
                    + "META_CAP_LOCKED, META_ALT_LOCKED, META_SYM_LOCKED, "
                    + "or META_SELECTING");
        }
        metaState = normalizeMetaState(metaState) & META_MODIFIER_MASK;
        metaState = metaStateFilterDirectionalModifiers(metaState, modifiers,
                META_SHIFT_ON, META_SHIFT_LEFT_ON, META_SHIFT_RIGHT_ON);
        metaState = metaStateFilterDirectionalModifiers(metaState, modifiers,
                META_ALT_ON, META_ALT_LEFT_ON, META_ALT_RIGHT_ON);
        metaState = metaStateFilterDirectionalModifiers(metaState, modifiers,
                META_CTRL_ON, META_CTRL_LEFT_ON, META_CTRL_RIGHT_ON);
        metaState = metaStateFilterDirectionalModifiers(metaState, modifiers,
                META_META_ON, META_META_LEFT_ON, META_META_RIGHT_ON);
        return metaState == modifiers;
    }

    
        private static int metaStateFilterDirectionalModifiers(int metaState,
            int modifiers, int basic, int left, int right) {
        final boolean wantBasic = (modifiers & basic) != 0;
        final int directional = left | right;
        final boolean wantLeftOrRight = (modifiers & directional) != 0;
        if (wantBasic) {
            if (wantLeftOrRight) {
                throw new IllegalArgumentException("modifiers must not contain "
                        + metaStateToString(basic) + " combined with "
                        + metaStateToString(left) + " or " + metaStateToString(right));
            }
            return metaState & ~directional;
        } else if (wantLeftOrRight) {
            return metaState & ~basic;
        } else {
            return metaState;
        }
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.591 -0400", hash_original_method = "D8034B11074E9047AA16AF8491DBD005", hash_generated_method = "A50B5A44AAE983E8F83CEC8FF8AC48A8")
    public final boolean hasNoModifiers() {
        boolean var2EA5825E3B6BAF4D435678EE4FA290B6_719477826 = (metaStateHasNoModifiers(mMetaState));
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1478753420 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1478753420;
        // ---------- Original Method ----------
        //return metaStateHasNoModifiers(mMetaState);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.591 -0400", hash_original_method = "4E7169ABB8BE0091A9032E5C93093788", hash_generated_method = "091C74D09018D41C9E95E67D7976DE69")
    public final boolean hasModifiers(int modifiers) {
        boolean var648F7A9F0962E8E4161828F1E8BA6E46_5003532 = (metaStateHasModifiers(mMetaState, modifiers));
        addTaint(modifiers);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1488784263 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1488784263;
        // ---------- Original Method ----------
        //return metaStateHasModifiers(mMetaState, modifiers);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.598 -0400", hash_original_method = "97586FBB5F886A3B61BF136A6C082407", hash_generated_method = "2CA9C87BD43218B03588137D09511581")
    public final boolean isAltPressed() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_230258500 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_230258500;
        // ---------- Original Method ----------
        //return (mMetaState & META_ALT_ON) != 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.599 -0400", hash_original_method = "CCAFE012B2273AEF4F41D4D6D0D204B5", hash_generated_method = "A19EB71C6286BCD1DCE5FADBC79F2A7C")
    public final boolean isShiftPressed() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_343194316 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_343194316;
        // ---------- Original Method ----------
        //return (mMetaState & META_SHIFT_ON) != 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.601 -0400", hash_original_method = "FD9A49039B892920252DA37B3D678A2D", hash_generated_method = "FACBFD3FFEB7916CE3A128DA7AFE4924")
    public final boolean isSymPressed() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_462358693 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_462358693;
        // ---------- Original Method ----------
        //return (mMetaState & META_SYM_ON) != 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.603 -0400", hash_original_method = "3C82500C516E1BE610D84AED68B433EB", hash_generated_method = "A84098D3C1B790CA96567C9CA1ED187F")
    public final boolean isCtrlPressed() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1225723202 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1225723202;
        // ---------- Original Method ----------
        //return (mMetaState & META_CTRL_ON) != 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.603 -0400", hash_original_method = "465B8FC61E3DBB23D441220EDBBD9D13", hash_generated_method = "DBB929DAE99C3A13E1D40FAD4977CB17")
    public final boolean isMetaPressed() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1053329698 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1053329698;
        // ---------- Original Method ----------
        //return (mMetaState & META_META_ON) != 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.606 -0400", hash_original_method = "86852117C33E9887622BE81AA6AFA717", hash_generated_method = "80ECDAA29C4249A56FAF0F7766D3D2C7")
    public final boolean isFunctionPressed() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1227344663 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1227344663;
        // ---------- Original Method ----------
        //return (mMetaState & META_FUNCTION_ON) != 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.606 -0400", hash_original_method = "201DC9EDE3268FF70DC9BB453F3746A4", hash_generated_method = "CF57566AAB4710C5BCC33ED843B02FB5")
    public final boolean isCapsLockOn() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_587808386 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_587808386;
        // ---------- Original Method ----------
        //return (mMetaState & META_CAPS_LOCK_ON) != 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.606 -0400", hash_original_method = "F23D7F96DFD52760380CADC49A40315B", hash_generated_method = "AE9C234FEE9E3102282C271E9BA5B4F6")
    public final boolean isNumLockOn() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_830125203 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_830125203;
        // ---------- Original Method ----------
        //return (mMetaState & META_NUM_LOCK_ON) != 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.626 -0400", hash_original_method = "F7BF6BCE6DBC769F104CFC5352A06C66", hash_generated_method = "B257B5B8EE5474D9B8214D1F2268EB43")
    public final boolean isScrollLockOn() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1279879137 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1279879137;
        // ---------- Original Method ----------
        //return (mMetaState & META_SCROLL_LOCK_ON) != 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.626 -0400", hash_original_method = "96C17C1FB3A34A2A0AFECF0EC83B48C2", hash_generated_method = "5465823CAE72D2B9D9B40C78C72207E4")
    public final int getAction() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1261131552 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1261131552;
        // ---------- Original Method ----------
        //return mAction;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.627 -0400", hash_original_method = "67F2F19B4B996A0666B0A05E347C8968", hash_generated_method = "F5E67D81679D58CBC56A449797157A46")
    public final boolean isCanceled() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1291248063 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1291248063;
        // ---------- Original Method ----------
        //return (mFlags&FLAG_CANCELED) != 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.627 -0400", hash_original_method = "27796C2FEC9179970B535474C3BFAAB9", hash_generated_method = "2EE0466AB5C2F2727C33F7700B8007CE")
    public final void startTracking() {
        mFlags |= FLAG_START_TRACKING;
        // ---------- Original Method ----------
        //mFlags |= FLAG_START_TRACKING;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.628 -0400", hash_original_method = "D30D10CBEE1B4F7DBBD65FEDA5F644C1", hash_generated_method = "655C5FC2B289E2B052DD2C8A7549F383")
    public final boolean isTracking() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_369441735 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_369441735;
        // ---------- Original Method ----------
        //return (mFlags&FLAG_TRACKING) != 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.628 -0400", hash_original_method = "AC7740C0A8B7B97C4388CB1808E16854", hash_generated_method = "7D9B99A61BB8BEA4BE2CD6D2E252CFFF")
    public final boolean isLongPress() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1980490778 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1980490778;
        // ---------- Original Method ----------
        //return (mFlags&FLAG_LONG_PRESS) != 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.628 -0400", hash_original_method = "AA2A4756B9F9E3EBD53F7A185B310C03", hash_generated_method = "8CCD8A1FCA8326556DC35BCFD514FD8E")
    public final int getKeyCode() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1775440018 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1775440018;
        // ---------- Original Method ----------
        //return mKeyCode;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.630 -0400", hash_original_method = "E7E0F27294714D41CE9B0DB8FACE7352", hash_generated_method = "DBF866E19F8CD02DFDD37FDE0D419B27")
    public final String getCharacters() {
        String varB4EAC82CA7396A68D541C85D26508E83_365380429 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_365380429 = mCharacters;
        varB4EAC82CA7396A68D541C85D26508E83_365380429.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_365380429;
        // ---------- Original Method ----------
        //return mCharacters;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.635 -0400", hash_original_method = "C59C82C828E55FB1935E12A0581D4304", hash_generated_method = "DC6AE07E5F456C6D43D18616ECB47E8B")
    public final int getScanCode() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_464141810 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_464141810;
        // ---------- Original Method ----------
        //return mScanCode;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.636 -0400", hash_original_method = "4FE747AC8B0667617AE307ECFC6ED74A", hash_generated_method = "BE1E49B701A9C867B19616E376E2D753")
    public final int getRepeatCount() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1724885471 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1724885471;
        // ---------- Original Method ----------
        //return mRepeatCount;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.636 -0400", hash_original_method = "78B33B0396971A0CFD2DA3075372AEE4", hash_generated_method = "53B0A46BEB8B2B9AAE3F200A5382A844")
    public final long getDownTime() {
        long var0F5264038205EDFB1AC05FBB0E8C5E94_237732503 = getTaintLong();
        return var0F5264038205EDFB1AC05FBB0E8C5E94_237732503;
        // ---------- Original Method ----------
        //return mDownTime;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.646 -0400", hash_original_method = "9909149D86C7172035BFD4D31C880F99", hash_generated_method = "36E648F227C1195AEF5C260A18737613")
    public final long getEventTime() {
        long var0F5264038205EDFB1AC05FBB0E8C5E94_1904039769 = getTaintLong();
        return var0F5264038205EDFB1AC05FBB0E8C5E94_1904039769;
        // ---------- Original Method ----------
        //return mEventTime;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.646 -0400", hash_original_method = "E19EE848225D9E04BF4931E6C8BABFAF", hash_generated_method = "DF652E8B24D87172CF6A27F3C68CFCA2")
    @Override
    public final long getEventTimeNano() {
        long var0F5264038205EDFB1AC05FBB0E8C5E94_1345107760 = getTaintLong();
        return var0F5264038205EDFB1AC05FBB0E8C5E94_1345107760;
        // ---------- Original Method ----------
        //return mEventTime * 1000000L;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.647 -0400", hash_original_method = "DAE3D173E797B2BC058CC137FF578309", hash_generated_method = "DDB7BAF9D86E397E6F8ADD40FA553E14")
    @Deprecated
    public final int getKeyboardDevice() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_192955717 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_192955717;
        // ---------- Original Method ----------
        //return mDeviceId;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.652 -0400", hash_original_method = "E25038BBE92ACBB5F3F6678AD9978C07", hash_generated_method = "076DD84588158E26449E514BB0CCF1B8")
    public final KeyCharacterMap getKeyCharacterMap() {
        KeyCharacterMap varB4EAC82CA7396A68D541C85D26508E83_1105086988 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1105086988 = KeyCharacterMap.load(mDeviceId);
        varB4EAC82CA7396A68D541C85D26508E83_1105086988.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1105086988;
        // ---------- Original Method ----------
        //return KeyCharacterMap.load(mDeviceId);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.652 -0400", hash_original_method = "709AF61B9CAC868190EE8F0D7699E677", hash_generated_method = "9830F5AABD238EAF1FF4B69FF5E3C932")
    public char getDisplayLabel() {
        char var402815CACAA9DDFAEFEDC0C125FB2994_888941201 = (getKeyCharacterMap().getDisplayLabel(mKeyCode));
        char varA87DEB01C5F539E6BDA34829C8EF2368_1433762077 = getTaintChar();
        return varA87DEB01C5F539E6BDA34829C8EF2368_1433762077;
        // ---------- Original Method ----------
        //return getKeyCharacterMap().getDisplayLabel(mKeyCode);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.654 -0400", hash_original_method = "057CF77E1E85F6DA27F89D2E60B0B1BA", hash_generated_method = "F013340B35C20DD15DA2F5C8493B6A7F")
    public int getUnicodeChar() {
        int var1A789D027C8A5A0C16264D8FE1C23A29_600654911 = (getUnicodeChar(mMetaState));
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1920888953 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1920888953;
        // ---------- Original Method ----------
        //return getUnicodeChar(mMetaState);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.666 -0400", hash_original_method = "BE11FB783D347EE88A5E4A6075D1C256", hash_generated_method = "45868B47F59498033DDC62442ADDF9E7")
    public int getUnicodeChar(int metaState) {
        int varF80F7315F1665EF264F4B56CCC263B71_1862594196 = (getKeyCharacterMap().get(mKeyCode, metaState));
        addTaint(metaState);
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1684631318 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1684631318;
        // ---------- Original Method ----------
        //return getKeyCharacterMap().get(mKeyCode, metaState);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.666 -0400", hash_original_method = "81320F663D2FF6F236DC3275D51EA69E", hash_generated_method = "B1B6E06A7B6F516E8F72E2455DB07276")
    @Deprecated
    public boolean getKeyData(KeyData results) {
        boolean var9311F07A06D0009CABF0BB59BF9F1F37_847440703 = (getKeyCharacterMap().getKeyData(mKeyCode, results));
        addTaint(results.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2101833020 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2101833020;
        // ---------- Original Method ----------
        //return getKeyCharacterMap().getKeyData(mKeyCode, results);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.666 -0400", hash_original_method = "BA318507FAF878809BC342F154CE9211", hash_generated_method = "B786DB97E1E3ADADC086E5B566228C33")
    public char getMatch(char[] chars) {
        char varB7872EAEFF997D9A111291989861AD62_746498930 = (getMatch(chars, 0));
        addTaint(chars[0]);
        char varA87DEB01C5F539E6BDA34829C8EF2368_1659522769 = getTaintChar();
        return varA87DEB01C5F539E6BDA34829C8EF2368_1659522769;
        // ---------- Original Method ----------
        //return getMatch(chars, 0);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.669 -0400", hash_original_method = "37D22A361AC08A8D1E1BFBF631093A43", hash_generated_method = "3736F56F3D0E7661FFFC098E59F1CD8E")
    public char getMatch(char[] chars, int metaState) {
        char varB61CD108FAACC946B9AA0DE89FD2060B_209077656 = (getKeyCharacterMap().getMatch(mKeyCode, chars, metaState));
        addTaint(chars[0]);
        addTaint(metaState);
        char varA87DEB01C5F539E6BDA34829C8EF2368_1180323136 = getTaintChar();
        return varA87DEB01C5F539E6BDA34829C8EF2368_1180323136;
        // ---------- Original Method ----------
        //return getKeyCharacterMap().getMatch(mKeyCode, chars, metaState);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.669 -0400", hash_original_method = "8EE0DA8E3FFF6281CC8C4E46B5174FE9", hash_generated_method = "17F9F9401591EC8C5FF424439B48C60E")
    public char getNumber() {
        char varB4F648281DAF3DD70FE46CEDEBEDC863_1398526200 = (getKeyCharacterMap().getNumber(mKeyCode));
        char varA87DEB01C5F539E6BDA34829C8EF2368_2104274973 = getTaintChar();
        return varA87DEB01C5F539E6BDA34829C8EF2368_2104274973;
        // ---------- Original Method ----------
        //return getKeyCharacterMap().getNumber(mKeyCode);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.669 -0400", hash_original_method = "FD8BA26A71313E51F3A862B0A656FF64", hash_generated_method = "AFC4982B5471838527769C1A29D6D2A8")
    public boolean isPrintingKey() {
        boolean varF8D3C8E19AA06F294286F3275CCB7518_655364391 = (getKeyCharacterMap().isPrintingKey(mKeyCode));
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1257068065 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1257068065;
        // ---------- Original Method ----------
        //return getKeyCharacterMap().isPrintingKey(mKeyCode);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.670 -0400", hash_original_method = "1A3310CD4FC6031A54E66A6FF268F76E", hash_generated_method = "2D8C952016776B388E3C7CBE97737F79")
    @Deprecated
    public final boolean dispatch(Callback receiver) {
        boolean varC90D4E641E4ACDB8930DA9EB1973CAAD_1634864415 = (dispatch(receiver, null, null));
        addTaint(receiver.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_406660028 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_406660028;
        // ---------- Original Method ----------
        //return dispatch(receiver, null, null);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.672 -0400", hash_original_method = "486AD389F69CA9E805DF428CF28467C4", hash_generated_method = "CC1011C263F23BC4AB897ED1F215E84C")
    public final boolean dispatch(Callback receiver, DispatcherState state,
            Object target) {
        //Begin case ACTION_DOWN 
        {
            mFlags &= ~FLAG_START_TRACKING;
            boolean res;
            res = receiver.onKeyDown(mKeyCode, this);
            {
                {
                    state.startTracking(this, target);
                } //End block
                {
                    boolean var15107DBA9F13C4EA3AFAF1BF65D7423F_641765098 = (isLongPress() && state.isTracking(this));
                    {
                        try 
                        {
                            {
                                boolean varEA4A626A3C3882CC4284F222EB564648_2056773113 = (receiver.onKeyLongPress(mKeyCode, this));
                                {
                                    state.performedLongPress(this);
                                    res = true;
                                } //End block
                            } //End collapsed parenthetic
                        } //End block
                        catch (AbstractMethodError e)
                        { }
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End block
        //End case ACTION_DOWN 
        //Begin case ACTION_UP 
        {
            state.handleUpEvent(this);
        } //End block
        //End case ACTION_UP 
        //Begin case ACTION_UP 
        boolean var6AE796001B04D3F5946E38C8232FB430_937836979 = (receiver.onKeyUp(mKeyCode, this));
        //End case ACTION_UP 
        //Begin case ACTION_MULTIPLE 
        int count;
        count = mRepeatCount;
        //End case ACTION_MULTIPLE 
        //Begin case ACTION_MULTIPLE 
        int code;
        code = mKeyCode;
        //End case ACTION_MULTIPLE 
        //Begin case ACTION_MULTIPLE 
        {
            boolean varCD86412E58971559452CF2B6E9A652F6_1430337874 = (receiver.onKeyMultiple(code, count, this));
        } //End collapsed parenthetic
        //End case ACTION_MULTIPLE 
        //Begin case ACTION_MULTIPLE 
        {
            mAction = ACTION_DOWN;
            mRepeatCount = 0;
            boolean handled;
            handled = receiver.onKeyDown(code, this);
            {
                mAction = ACTION_UP;
                receiver.onKeyUp(code, this);
            } //End block
            mAction = ACTION_MULTIPLE;
            mRepeatCount = count;
        } //End block
        //End case ACTION_MULTIPLE 
        addTaint(receiver.getTaint());
        addTaint(state.getTaint());
        addTaint(target.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1989891436 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1989891436;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.699 -0400", hash_original_method = "EC719782A5F2654811BE56A8456234B4", hash_generated_method = "8ABB04CC7A5FE875834DA4A32D6FA04A")
    @Override
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_400858592 = null; //Variable for return #1
        StringBuilder msg;
        msg = new StringBuilder();
        msg.append("KeyEvent { action=").append(actionToString(mAction));
        msg.append(", keyCode=").append(keyCodeToString(mKeyCode));
        msg.append(", scanCode=").append(mScanCode);
        {
            msg.append(", characters=\"").append(mCharacters).append("\"");
        } //End block
        msg.append(", metaState=").append(metaStateToString(mMetaState));
        msg.append(", flags=0x").append(Integer.toHexString(mFlags));
        msg.append(", repeatCount=").append(mRepeatCount);
        msg.append(", eventTime=").append(mEventTime);
        msg.append(", downTime=").append(mDownTime);
        msg.append(", deviceId=").append(mDeviceId);
        msg.append(", source=0x").append(Integer.toHexString(mSource));
        msg.append(" }");
        varB4EAC82CA7396A68D541C85D26508E83_400858592 = msg.toString();
        varB4EAC82CA7396A68D541C85D26508E83_400858592.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_400858592;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
        public static String actionToString(int action) {
        switch (action) {
            case ACTION_DOWN:
                return "ACTION_DOWN";
            case ACTION_UP:
                return "ACTION_UP";
            case ACTION_MULTIPLE:
                return "ACTION_MULTIPLE";
            default:
                return Integer.toString(action);
        }
    }

    
        public static String keyCodeToString(int keyCode) {
        String symbolicName = KEYCODE_SYMBOLIC_NAMES.get(keyCode);
        return symbolicName != null ? symbolicName : Integer.toString(keyCode);
    }

    
        public static int keyCodeFromString(String symbolicName) {
        if (symbolicName == null) {
            throw new IllegalArgumentException("symbolicName must not be null");
        }
        final int count = KEYCODE_SYMBOLIC_NAMES.size();
        for (int i = 0; i < count; i++) {
            if (symbolicName.equals(KEYCODE_SYMBOLIC_NAMES.valueAt(i))) {
                return i;
            }
        }
        try {
            return Integer.parseInt(symbolicName, 10);
        } catch (NumberFormatException ex) {
            return KEYCODE_UNKNOWN;
        }
    }

    
        public static String metaStateToString(int metaState) {
        if (metaState == 0) {
            return "0";
        }
        StringBuilder result = null;
        int i = 0;
        while (metaState != 0) {
            final boolean isSet = (metaState & 1) != 0;
            metaState >>>= 1; 
            if (isSet) {
                final String name = META_SYMBOLIC_NAMES[i];
                if (result == null) {
                    if (metaState == 0) {
                        return name;
                    }
                    result = new StringBuilder(name);
                } else {
                    result.append('|');
                    result.append(name);
                }
            }
            i += 1;
        }
        return result.toString();
    }

    
        public static KeyEvent createFromParcelBody(Parcel in) {
        return new KeyEvent(in);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.702 -0400", hash_original_method = "12273F2E4594D26AD686DE1D2B663F84", hash_generated_method = "6D5340FF61E36119C05C17A63AE3343A")
    public void writeToParcel(Parcel out, int flags) {
        out.writeInt(PARCEL_TOKEN_KEY_EVENT);
        out.writeInt(mDeviceId);
        out.writeInt(mSource);
        out.writeInt(mAction);
        out.writeInt(mKeyCode);
        out.writeInt(mRepeatCount);
        out.writeInt(mMetaState);
        out.writeInt(mScanCode);
        out.writeInt(mFlags);
        out.writeLong(mDownTime);
        out.writeLong(mEventTime);
        addTaint(out.getTaint());
        addTaint(flags);
        // ---------- Original Method ----------
        //out.writeInt(PARCEL_TOKEN_KEY_EVENT);
        //out.writeInt(mDeviceId);
        //out.writeInt(mSource);
        //out.writeInt(mAction);
        //out.writeInt(mKeyCode);
        //out.writeInt(mRepeatCount);
        //out.writeInt(mMetaState);
        //out.writeInt(mScanCode);
        //out.writeInt(mFlags);
        //out.writeLong(mDownTime);
        //out.writeLong(mEventTime);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.702 -0400", hash_original_method = "7ECA2477AC40357C7C5AFE00DC4BDA17", hash_generated_method = "3746AED0A5E58502DB2861625CA9D820")
    private boolean native_isSystemKey(int keyCode) {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1072621328 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1072621328;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.706 -0400", hash_original_method = "B29C954784C1F1FDE17D757BB04FDB3D", hash_generated_method = "3B565C275852412BE88FB7F70964762E")
    private boolean native_hasDefaultAction(int keyCode) {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_307180361 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_307180361;
    }

    
    public static class DispatcherState {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.706 -0400", hash_original_field = "698F6771A467E3FC6EA4721CEF9D28B3", hash_generated_field = "09E1F61D6927630107A1B08B0819BA0E")

        int mDownKeyCode;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.706 -0400", hash_original_field = "995276C044F3030CC5D6203EC2E9E315", hash_generated_field = "5B628734B79397D95D8B3A85BB9AD1CB")

        Object mDownTarget;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.706 -0400", hash_original_field = "5DB98C21C8698B2531972DEF1082CC33", hash_generated_field = "EFB3A6F42762D745C780E8C741E6202A")

        SparseIntArray mActiveLongPresses = new SparseIntArray();
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.706 -0400", hash_original_method = "6A42904977F799CF06B04A57C142AD90", hash_generated_method = "6A42904977F799CF06B04A57C142AD90")
        public DispatcherState ()
        {
            //Synthesized constructor
        }


        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.707 -0400", hash_original_method = "554562900865028A00C4676EE39BA2E0", hash_generated_method = "CDE218CCBC4461C402BEA9142A3F1C83")
        public void reset() {
            mDownKeyCode = 0;
            mDownTarget = null;
            mActiveLongPresses.clear();
            // ---------- Original Method ----------
            //if (DEBUG) Log.v(TAG, "Reset: " + this);
            //mDownKeyCode = 0;
            //mDownTarget = null;
            //mActiveLongPresses.clear();
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.707 -0400", hash_original_method = "7A446B7A655E4D7578F3AEB4F96BA0A4", hash_generated_method = "6F3E1C09C97F4B915F220C789244AE2A")
        public void reset(Object target) {
            {
                mDownKeyCode = 0;
                mDownTarget = null;
            } //End block
            addTaint(target.getTaint());
            // ---------- Original Method ----------
            //if (mDownTarget == target) {
                //if (DEBUG) Log.v(TAG, "Reset in " + target + ": " + this);
                //mDownKeyCode = 0;
                //mDownTarget = null;
            //}
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.724 -0400", hash_original_method = "F359109F6941FCC4380DDA2E2CA9E676", hash_generated_method = "42A604BB285D93D0C9FC4DF8CC428823")
        public void startTracking(KeyEvent event, Object target) {
            {
                boolean varEFF761F3EEED65C62FBA77AF5B033178_237630497 = (event.getAction() != ACTION_DOWN);
                {
                    if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException(
                        "Can only start tracking on a down event");
                } //End block
            } //End collapsed parenthetic
            mDownKeyCode = event.getKeyCode();
            mDownTarget = target;
            // ---------- Original Method ----------
            //if (event.getAction() != ACTION_DOWN) {
                //throw new IllegalArgumentException(
                        //"Can only start tracking on a down event");
            //}
            //if (DEBUG) Log.v(TAG, "Start trackingt in " + target + ": " + this);
            //mDownKeyCode = event.getKeyCode();
            //mDownTarget = target;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.724 -0400", hash_original_method = "07F4929E2B3E025FC2215EF8E614ABBF", hash_generated_method = "9BA537100E699F3E42B03EC8D376DFED")
        public boolean isTracking(KeyEvent event) {
            boolean var296CB63EF97B12631998C71582F3F238_863306479 = (mDownKeyCode == event.getKeyCode());
            addTaint(event.getTaint());
            boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_48319700 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_48319700;
            // ---------- Original Method ----------
            //return mDownKeyCode == event.getKeyCode();
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.725 -0400", hash_original_method = "2266BAE243819DE7EACEEEA38A1E3CF0", hash_generated_method = "A4DDB47B54AB84538C5FAD60450DABF1")
        public void performedLongPress(KeyEvent event) {
            mActiveLongPresses.put(event.getKeyCode(), 1);
            addTaint(event.getTaint());
            // ---------- Original Method ----------
            //mActiveLongPresses.put(event.getKeyCode(), 1);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.727 -0400", hash_original_method = "4EC5A9A4246B9BB19D03F0E0F2DEA552", hash_generated_method = "D6257C696B5FFE0ABE8B78A9AEDB42DA")
        public void handleUpEvent(KeyEvent event) {
            int keyCode;
            keyCode = event.getKeyCode();
            int index;
            index = mActiveLongPresses.indexOfKey(keyCode);
            {
                event.mFlags |= FLAG_CANCELED | FLAG_CANCELED_LONG_PRESS;
                mActiveLongPresses.removeAt(index);
            } //End block
            {
                event.mFlags |= FLAG_TRACKING;
                mDownKeyCode = 0;
                mDownTarget = null;
            } //End block
            addTaint(event.getTaint());
            // ---------- Original Method ----------
            //final int keyCode = event.getKeyCode();
            //if (DEBUG) Log.v(TAG, "Handle key up " + event + ": " + this);
            //int index = mActiveLongPresses.indexOfKey(keyCode);
            //if (index >= 0) {
                //if (DEBUG) Log.v(TAG, "  Index: " + index);
                //event.mFlags |= FLAG_CANCELED | FLAG_CANCELED_LONG_PRESS;
                //mActiveLongPresses.removeAt(index);
            //}
            //if (mDownKeyCode == keyCode) {
                //if (DEBUG) Log.v(TAG, "  Tracking!");
                //event.mFlags |= FLAG_TRACKING;
                //mDownKeyCode = 0;
                //mDownTarget = null;
            //}
        }

        
    }


    
    public interface Callback {
        
        boolean onKeyDown(int keyCode, KeyEvent event);

        
        boolean onKeyLongPress(int keyCode, KeyEvent event);

        
        boolean onKeyUp(int keyCode, KeyEvent event);

        
        boolean onKeyMultiple(int keyCode, int count, KeyEvent event);
    }
    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.728 -0400", hash_original_field = "011C921856FB09CA0E3A49D40938C8B5", hash_generated_field = "7285BB49865BB7A73FF82101A3618DE1")

    public static final int KEYCODE_UNKNOWN         = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.728 -0400", hash_original_field = "5E124CEF417486EBF52764FC395FAF5B", hash_generated_field = "7C94641EF03C02ADAA58756441C6C3DC")

    public static final int KEYCODE_SOFT_LEFT       = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.728 -0400", hash_original_field = "7F995A8541793738E9D1D6A02AA91F3C", hash_generated_field = "CDC3B877D47F9C4322369F86769479DF")

    public static final int KEYCODE_SOFT_RIGHT      = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.728 -0400", hash_original_field = "77A5E1E303BD6E60AE0309357552CADA", hash_generated_field = "490508F022A786B3EA83848442FC843B")

    public static final int KEYCODE_HOME            = 3;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.728 -0400", hash_original_field = "1244391C0DBC2B54D968EE09EA164358", hash_generated_field = "D51C0A862C052245BF825EB6384D52D3")

    public static final int KEYCODE_BACK            = 4;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.728 -0400", hash_original_field = "8B5B7AC7331F921EF81A7E5122240C1D", hash_generated_field = "7A2223A55DC7CFA24F10E735748D6955")

    public static final int KEYCODE_CALL            = 5;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.728 -0400", hash_original_field = "139B7C7614C83AEA40AB020C85141D63", hash_generated_field = "D17C9FC1460345D0952CF048AE61FC1D")

    public static final int KEYCODE_ENDCALL         = 6;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.728 -0400", hash_original_field = "38F43238D8FC0D2AF061113DB859DC45", hash_generated_field = "1D30FD9FE8BC56040C49FEACE88B364B")

    public static final int KEYCODE_0               = 7;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.728 -0400", hash_original_field = "0CCA531B2581F6F01CED7754E5D4D3B1", hash_generated_field = "85B7AB842FD71F17EC7BCE1C46BEA181")

    public static final int KEYCODE_1               = 8;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.728 -0400", hash_original_field = "BFD38BC7760A7740DBE440663D3BA323", hash_generated_field = "65E61E691D4B7B19C63C5CB0B28ABB0C")

    public static final int KEYCODE_2               = 9;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.728 -0400", hash_original_field = "2237E6BC80EB1B0D716295DFBD96A5F9", hash_generated_field = "C7CABEBDC8381CC68FA0AFA9C9A9AC8A")

    public static final int KEYCODE_3               = 10;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.728 -0400", hash_original_field = "E1432DD5F44C07F99B2C94A4EF1D6F76", hash_generated_field = "152E6E4B19FD84F863F773B3D7DD591F")

    public static final int KEYCODE_4               = 11;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.729 -0400", hash_original_field = "67C14356C5B2F29899D601227603BBF1", hash_generated_field = "5DC1004D18DE0F68128F0FA6D852BEC9")

    public static final int KEYCODE_5               = 12;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.729 -0400", hash_original_field = "6F3E84EA138192BD20FB83B354BAFB70", hash_generated_field = "98EC3BCE189B3CFEC215F21C596DDE37")

    public static final int KEYCODE_6               = 13;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.729 -0400", hash_original_field = "06DC22FDEBD5832EA858A1F9446B796F", hash_generated_field = "5BCB95B1E2B3E9F6B32FF504407798FD")

    public static final int KEYCODE_7               = 14;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.729 -0400", hash_original_field = "B9D05EF9093BD029F933AF7F120733F5", hash_generated_field = "C6E1E1B256D66AD2FFC4B747DD3DCF28")

    public static final int KEYCODE_8               = 15;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.729 -0400", hash_original_field = "4CEC4F3E610ED5B5DD320B364E0732E7", hash_generated_field = "B26610D4BD1A1148B7FF394910B8E769")

    public static final int KEYCODE_9               = 16;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.729 -0400", hash_original_field = "9201660B8F6D565D294BD25EDE3868A4", hash_generated_field = "35594CC183F814819274A30608387241")

    public static final int KEYCODE_STAR            = 17;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.729 -0400", hash_original_field = "45F21BD800EB5A99F57069545C188EAE", hash_generated_field = "3A83FF10010434AFB5C188D35CE06EEF")

    public static final int KEYCODE_POUND           = 18;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.729 -0400", hash_original_field = "E5BF0F8FF253A9CA9610FCEE2073B75E", hash_generated_field = "9EE316237E281C65C81D00C07CAD1F2D")

    public static final int KEYCODE_DPAD_UP         = 19;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.729 -0400", hash_original_field = "9FC2AA0BED0A92C3B894ABEBDD5D4E5B", hash_generated_field = "F86065A07D76E85025B22C214604C6C5")

    public static final int KEYCODE_DPAD_DOWN       = 20;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.729 -0400", hash_original_field = "1E6E8A1F413882199400A5B7590D513F", hash_generated_field = "0D538E6811634082007F1A4295E6C282")

    public static final int KEYCODE_DPAD_LEFT       = 21;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.729 -0400", hash_original_field = "CBDA1B31C3767283E176FC29969557AB", hash_generated_field = "FC7106DDBEDEB52317C17161A149088A")

    public static final int KEYCODE_DPAD_RIGHT      = 22;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.729 -0400", hash_original_field = "4E124229D0F5FF9DAAAD35F372E8AFF1", hash_generated_field = "B6D3FD572D96FBBE59F70C08DCA24F50")

    public static final int KEYCODE_DPAD_CENTER     = 23;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.729 -0400", hash_original_field = "545EC0E3261889D7F7A2470655F0076D", hash_generated_field = "54FA1F0CEC07AE8A01E68E49B9F28087")

    public static final int KEYCODE_VOLUME_UP       = 24;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.729 -0400", hash_original_field = "98C05E9DC83618D812F653B6078B9518", hash_generated_field = "46079CFC3B8D06A0548408784301F54B")

    public static final int KEYCODE_VOLUME_DOWN     = 25;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.729 -0400", hash_original_field = "3918A74539706A2FAAA48CFA05604B70", hash_generated_field = "F77782D70F9385D92475B42E50FAED8A")

    public static final int KEYCODE_POWER           = 26;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.729 -0400", hash_original_field = "CDE06A0579758DB5E2DC0619300ACADA", hash_generated_field = "3D168BC1F37F3F611FAEC12DDA098EC7")

    public static final int KEYCODE_CAMERA          = 27;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.729 -0400", hash_original_field = "2B7B72A7FC79C1E519ECDD2C0EBE42CE", hash_generated_field = "5BDED08FAC40D8A5FFB67E26E2DEECBB")

    public static final int KEYCODE_CLEAR           = 28;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.729 -0400", hash_original_field = "BAD5FCE2305DD9E2E894CC62CEB513D1", hash_generated_field = "FE6BDB290A385F201E149C95B493321F")

    public static final int KEYCODE_A               = 29;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.729 -0400", hash_original_field = "EE0F9AAB89D95811227B2F680BEE08E8", hash_generated_field = "B878ACCC0EA947028E1990E04A14A80D")

    public static final int KEYCODE_B               = 30;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.729 -0400", hash_original_field = "408453F57FB588AFD79077FB72886D0A", hash_generated_field = "4BFB53E29798EB5EAB1B3D9D2AF34377")

    public static final int KEYCODE_C               = 31;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.729 -0400", hash_original_field = "FE475CCFE17CBEBEFE359DC4BA785CF5", hash_generated_field = "118423EFBA4BA6597CF3C5E45BFA3C03")

    public static final int KEYCODE_D               = 32;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.729 -0400", hash_original_field = "2279D2290CA236B86D76586EF0592750", hash_generated_field = "83E5F896260F3B178E1FB9A921F7BC77")

    public static final int KEYCODE_E               = 33;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.729 -0400", hash_original_field = "C67454F03D3339AD7CDFA33FA935F5FE", hash_generated_field = "F2B36B8817B8073D273D2B89786A1980")

    public static final int KEYCODE_F               = 34;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.729 -0400", hash_original_field = "276E9595887CD04DDAD31D2C5108B733", hash_generated_field = "C8AE23D8C939614D68040178CC4290CF")

    public static final int KEYCODE_G               = 35;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.729 -0400", hash_original_field = "21551270A7593637633FE943837EF016", hash_generated_field = "9F44E015730522E58C7AE884E596EF6E")

    public static final int KEYCODE_H               = 36;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.729 -0400", hash_original_field = "5FE2F51AEC126CEEADE64137D2983D14", hash_generated_field = "332CA0C3BAD0871B2C2CE5A5518B0C35")

    public static final int KEYCODE_I               = 37;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.729 -0400", hash_original_field = "CDA78671E87E4677FE335C9CACB7F66C", hash_generated_field = "0C49414BFBC1377D44DE62C18FBEFAD7")

    public static final int KEYCODE_J               = 38;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.729 -0400", hash_original_field = "38DA46AA05F279618FDE6FFB4C9B3C3A", hash_generated_field = "4C2DD393199B77C3F47233B85DBA315C")

    public static final int KEYCODE_K               = 39;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.729 -0400", hash_original_field = "21041C1885194410C6C42E2C47664110", hash_generated_field = "E700B923990CC2A17011E8A425314C44")

    public static final int KEYCODE_L               = 40;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.729 -0400", hash_original_field = "1C71425E095809684F6C661B876EEDD5", hash_generated_field = "E2F7A047CD31666C570BD7BD9B03E77B")

    public static final int KEYCODE_M               = 41;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.729 -0400", hash_original_field = "2310ADF0DDAF0CEEFFD7A94AA6B39817", hash_generated_field = "4A71C779109CE37B1DFB63D93E695137")

    public static final int KEYCODE_N               = 42;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.729 -0400", hash_original_field = "3B39B1A58559FAEEB1A7427C960A97DF", hash_generated_field = "7158648ECE23F4F4522AC2F0706C3080")

    public static final int KEYCODE_O               = 43;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.730 -0400", hash_original_field = "17F4E92180301C8C123A22C5CB800119", hash_generated_field = "0033F43B24F3947978DACE045A3E65E4")

    public static final int KEYCODE_P               = 44;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.730 -0400", hash_original_field = "4DF6267637ABB357898FC8F3F3B3D023", hash_generated_field = "3E823547FE71C57DE86DB081D500914B")

    public static final int KEYCODE_Q               = 45;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.730 -0400", hash_original_field = "D0A9F7719A3C019FBA2E2D6ED67F376D", hash_generated_field = "61B0804BF3D4901BE26F11EF9D7039A4")

    public static final int KEYCODE_R               = 46;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.744 -0400", hash_original_field = "D7F014E3A1112AA0D70CA093781D2882", hash_generated_field = "200A247ABD753B6E6E960DA4C25B5B7B")

    public static final int KEYCODE_S               = 47;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.744 -0400", hash_original_field = "332E2DEF074493C87827FC8AA31DEC88", hash_generated_field = "EAA1B9FE12EB2ED1730ACB1A0D91C211")

    public static final int KEYCODE_T               = 48;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.744 -0400", hash_original_field = "ECA4B5FB5DFBAC9D93F1B70B57541BDC", hash_generated_field = "58F43F94C037443F111AF28601BE9AA2")

    public static final int KEYCODE_U               = 49;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.744 -0400", hash_original_field = "B8F5919E18B2104D482F493A4EE11D46", hash_generated_field = "855DF147DB773B49A665B52450F2E47D")

    public static final int KEYCODE_V               = 50;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.744 -0400", hash_original_field = "A87FCD771B47CE6D9060E314ECFDB37E", hash_generated_field = "CA0A4E443CFFC3386FDB6C5AB42409C6")

    public static final int KEYCODE_W               = 51;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.744 -0400", hash_original_field = "8B043A0E05E8005982FBC8F3A72005EB", hash_generated_field = "D40E20635512C63E43B31D31AA08B920")

    public static final int KEYCODE_X               = 52;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.744 -0400", hash_original_field = "86EF67F3072DD1982D9519ED9BD7B4FC", hash_generated_field = "CE471BD86397F96881C51C568105E4C9")

    public static final int KEYCODE_Y               = 53;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.744 -0400", hash_original_field = "CBA7E6570B5C87E6BD9CD8DF94D5CFA3", hash_generated_field = "383E7871BB1F3CA11EF8025CF6526545")

    public static final int KEYCODE_Z               = 54;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.744 -0400", hash_original_field = "A1AFEF6A2019E961993E8CF1A26CCF2B", hash_generated_field = "BA57A8D20C6D43BACE8889F796360C4F")

    public static final int KEYCODE_COMMA           = 55;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.744 -0400", hash_original_field = "D7A4215664F9956E2D6653CFFFBA634D", hash_generated_field = "3727260E91B3CA590B88910781CA940D")

    public static final int KEYCODE_PERIOD          = 56;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.744 -0400", hash_original_field = "5D79C379FEB1D5AF1D87E7033D5BC2A7", hash_generated_field = "6546DB257EAFA6DFBF70E229C73FF202")

    public static final int KEYCODE_ALT_LEFT        = 57;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.744 -0400", hash_original_field = "AE953B15D3FD62F6229E809D74ECECC1", hash_generated_field = "60981BFA4690AB877C41BC68417F70A6")

    public static final int KEYCODE_ALT_RIGHT       = 58;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.745 -0400", hash_original_field = "FB47926A5B856619F4A20A23DAEA5023", hash_generated_field = "0E7262B2253D96CFB6646A353A9F5034")

    public static final int KEYCODE_SHIFT_LEFT      = 59;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.745 -0400", hash_original_field = "5815ADB0E028D44F9B0D46A89CD7E58C", hash_generated_field = "21947052029CA662950C510189D038C4")

    public static final int KEYCODE_SHIFT_RIGHT     = 60;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.745 -0400", hash_original_field = "46DF82A8FAC7905DA66A83A3C74A6C2D", hash_generated_field = "72FCC53488031C604837189A2CCD509D")

    public static final int KEYCODE_TAB             = 61;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.745 -0400", hash_original_field = "8A6F5E612871582B766A965F3F154DC1", hash_generated_field = "EBC570BDF039A249897CB707213F0B35")

    public static final int KEYCODE_SPACE           = 62;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.745 -0400", hash_original_field = "F72680C33946114F61087DA23F5060D8", hash_generated_field = "459B4EB126A209BEBFDEBF8457D8291E")

    public static final int KEYCODE_SYM             = 63;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.745 -0400", hash_original_field = "4422064F8D07B7628E43A02EDDDA24F5", hash_generated_field = "CB2185E6C3C26A135A1C9FAC3DE78E13")

    public static final int KEYCODE_EXPLORER        = 64;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.745 -0400", hash_original_field = "924B804687205A4CD89F5A4AF75C52A0", hash_generated_field = "5B5E0AE53DEC1768D4A030E3BF1C213C")

    public static final int KEYCODE_ENVELOPE        = 65;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.745 -0400", hash_original_field = "8EE5C068A694A5AFF990692FC83B80C6", hash_generated_field = "9E2401D49F830A30BCBEB327A12CE3D1")

    public static final int KEYCODE_ENTER           = 66;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.745 -0400", hash_original_field = "D9499B772891D7C69DD6EC1CD7FACEF3", hash_generated_field = "88F86DAE4F7A5F033CA9AE19421E94DF")

    public static final int KEYCODE_DEL             = 67;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.745 -0400", hash_original_field = "F42931C83AD8EAA6C7C240393B38B6D9", hash_generated_field = "463F9E92E5AFA54674F2C6C72E5028FA")

    public static final int KEYCODE_GRAVE           = 68;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.745 -0400", hash_original_field = "A0C854D6389D005B93C10A86133907A4", hash_generated_field = "5CEAB35A1DC86C4F3DBF02F70F6A674B")

    public static final int KEYCODE_MINUS           = 69;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.745 -0400", hash_original_field = "52C28CD70AD04791409A0EEC8597F7FC", hash_generated_field = "13CF728FEB0FCC69D9173C1DF9788E94")

    public static final int KEYCODE_EQUALS          = 70;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.745 -0400", hash_original_field = "A395AA77C82814BFEE1F765E2F4193CE", hash_generated_field = "83FF22F63EDAB467B7E351713DF703E4")

    public static final int KEYCODE_LEFT_BRACKET    = 71;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.745 -0400", hash_original_field = "C628A38C91A1130ADC4D8413CD631BD9", hash_generated_field = "E4DCE8B34CA7CCA10B47674F0D250F44")

    public static final int KEYCODE_RIGHT_BRACKET   = 72;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.745 -0400", hash_original_field = "9AA698D1E5238F31404899E10A74FE03", hash_generated_field = "5CD0FEFC7C4F9B1D4F2451A7E61C1E1C")

    public static final int KEYCODE_BACKSLASH       = 73;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.745 -0400", hash_original_field = "1B2AC6D8C094CD98D99E58D5BA9FDCC9", hash_generated_field = "6D3C43937A11F119AE384B24165D8BF4")

    public static final int KEYCODE_SEMICOLON       = 74;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.745 -0400", hash_original_field = "B9E217A90297F54578F23E7CB76D793B", hash_generated_field = "BC269C9B8A7BF1C78781BFC2675D16D1")

    public static final int KEYCODE_APOSTROPHE      = 75;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.745 -0400", hash_original_field = "3035FBE73422B9171BA083E838919683", hash_generated_field = "C915146C0867D19CACED2D4EADFEF8A0")

    public static final int KEYCODE_SLASH           = 76;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.745 -0400", hash_original_field = "DB7B664F2C61BC08DB8D68AF73556211", hash_generated_field = "86DB665B33F8C0F0EAF3A4B3E3D86A09")

    public static final int KEYCODE_AT              = 77;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.745 -0400", hash_original_field = "7A86BD576BEE410C919B16EDAE14DDE0", hash_generated_field = "A37C5151BD531FB2DDA5C5347CAB0BEA")

    public static final int KEYCODE_NUM             = 78;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.745 -0400", hash_original_field = "07CD0C1A645BC43FD6D931B6A85EE12F", hash_generated_field = "03898CD293C180DAF97F9B4681F10016")

    public static final int KEYCODE_HEADSETHOOK     = 79;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.745 -0400", hash_original_field = "6D87AACDFBFB784F4518C48BAD9CD625", hash_generated_field = "EC2FD7E482A8BEB9CEBBB333421D09D0")

    public static final int KEYCODE_FOCUS           = 80;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.745 -0400", hash_original_field = "12172EE213DCFF3CB0FA732B7BFAA64F", hash_generated_field = "F1D4A7E64DC25C73A297CFFB780F758F")

    public static final int KEYCODE_PLUS            = 81;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.745 -0400", hash_original_field = "DFF3CBDAB8B2987C2ED2851F59A70801", hash_generated_field = "55CB6E70448A2CA2DB215FAE50D85E2C")

    public static final int KEYCODE_MENU            = 82;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.745 -0400", hash_original_field = "5D1714674435993E91037CFB92106CB2", hash_generated_field = "7D2FB2ECF44C4EB9FEC258BBBCF02284")

    public static final int KEYCODE_NOTIFICATION    = 83;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.745 -0400", hash_original_field = "8DC0EF4A15F426A33E17436380887C30", hash_generated_field = "F32CD743E8C746123EFB275F5D823E38")

    public static final int KEYCODE_SEARCH          = 84;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.745 -0400", hash_original_field = "D255949D98EE5168DB66BD293927765F", hash_generated_field = "8FDBA2D86C71775735575861A79349BD")

    public static final int KEYCODE_MEDIA_PLAY_PAUSE= 85;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.745 -0400", hash_original_field = "49ABDC9422E55886C15AD11FA1856ADC", hash_generated_field = "06435042A6EE1EB03FBB8EB37EB2933E")

    public static final int KEYCODE_MEDIA_STOP      = 86;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.745 -0400", hash_original_field = "2C787E160D60DC61567570BBF92674BA", hash_generated_field = "1AD92793390C3B243F92413ADE0CBF79")

    public static final int KEYCODE_MEDIA_NEXT      = 87;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.745 -0400", hash_original_field = "023FA107390ADACF8AFD8693DE673315", hash_generated_field = "D15805A59182DF2676AE6606BD4B3E86")

    public static final int KEYCODE_MEDIA_PREVIOUS  = 88;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.745 -0400", hash_original_field = "63EFAB8D55A7807241DD00EAE39CA1B3", hash_generated_field = "2C1D13D83AD6AF6C4CFFB61B2D3ECDBD")

    public static final int KEYCODE_MEDIA_REWIND    = 89;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.745 -0400", hash_original_field = "57243417C29243C2CA084DEB7AABF7DC", hash_generated_field = "14ED8936291432095F0B6CA9194F32D0")

    public static final int KEYCODE_MEDIA_FAST_FORWARD = 90;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.746 -0400", hash_original_field = "92CE6DEDD42337F03F4FE60D2FDEB681", hash_generated_field = "8793EA7B43310482F68FFC6CFE4D6B73")

    public static final int KEYCODE_MUTE            = 91;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.746 -0400", hash_original_field = "623CF4C8BDC71B639AC08010D54488F5", hash_generated_field = "0E5DB3E164CCD49A57181C42098C77D0")

    public static final int KEYCODE_PAGE_UP         = 92;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.746 -0400", hash_original_field = "98967120CF2760B95FE38FB5DF980326", hash_generated_field = "5DE8822E84BF868BFBF6060D5AF39742")

    public static final int KEYCODE_PAGE_DOWN       = 93;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.746 -0400", hash_original_field = "5594AF47E40B2DD67CAF0996F628FA10", hash_generated_field = "4939F900B57DD2A2CB368B2E7DFAA14E")

    public static final int KEYCODE_PICTSYMBOLS     = 94;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.746 -0400", hash_original_field = "A04614F64D57DCAFF068E88412453A8F", hash_generated_field = "E55A8E96F756FDCB6C89F3763BD3AD13")

    public static final int KEYCODE_SWITCH_CHARSET  = 95;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.746 -0400", hash_original_field = "89EA55D8808EFA3E8163DF1018F552E8", hash_generated_field = "928F3CD6A1280A31D968F29D962680B0")

    public static final int KEYCODE_BUTTON_A        = 96;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.746 -0400", hash_original_field = "AC46E2FCFB9C2191A50738E8B357491E", hash_generated_field = "74B06ED1D5A60607361ACE3A03F23DE9")

    public static final int KEYCODE_BUTTON_B        = 97;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.746 -0400", hash_original_field = "88808603EA1541E0D21B3539497F6E9D", hash_generated_field = "3FABA08469D4ACF5666CC93B0BD53B24")

    public static final int KEYCODE_BUTTON_C        = 98;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.746 -0400", hash_original_field = "814D9F7277791676121B86C27564E7C2", hash_generated_field = "4F3E753216AE38FEB637D5151C82AADC")

    public static final int KEYCODE_BUTTON_X        = 99;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.746 -0400", hash_original_field = "D6C2157734AADD115BF40D29455B7763", hash_generated_field = "9C8F8431CEE390286A73BF0AB1C37E4F")

    public static final int KEYCODE_BUTTON_Y        = 100;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.746 -0400", hash_original_field = "4CE828269FA8523EA7E34EF4803CD1A6", hash_generated_field = "3298AA6F86A769AE7AB38C61A5573A0C")

    public static final int KEYCODE_BUTTON_Z        = 101;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.746 -0400", hash_original_field = "4F71E779AB213F2CFD419F9AD6985633", hash_generated_field = "16DADBC94B67672FDAA9AF8C91C72F08")

    public static final int KEYCODE_BUTTON_L1       = 102;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.746 -0400", hash_original_field = "BF7E7002CFC77854D517358AE36D1E29", hash_generated_field = "8833176B01A40CE2306604C72D80EA1B")

    public static final int KEYCODE_BUTTON_R1       = 103;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.746 -0400", hash_original_field = "37BE94F72E5A65AF03D2EFD8FEE94397", hash_generated_field = "070B93128C57985068EF6869F2854AD1")

    public static final int KEYCODE_BUTTON_L2       = 104;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.746 -0400", hash_original_field = "04B4886B843948E0388CE2FFE290A787", hash_generated_field = "9B2850E56B8C96CC90F7B4262C092BAA")

    public static final int KEYCODE_BUTTON_R2       = 105;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.746 -0400", hash_original_field = "FAB9502EDE0861C99B55AFC847E51F5B", hash_generated_field = "7BB77401B48782C1DA22536A6D1ACFC2")

    public static final int KEYCODE_BUTTON_THUMBL   = 106;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.746 -0400", hash_original_field = "F09F2668CBC536D1890A300996290D96", hash_generated_field = "957F71B0CEFC89FA603F7B7F9496E40C")

    public static final int KEYCODE_BUTTON_THUMBR   = 107;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.746 -0400", hash_original_field = "8070F7FE1712E8F097AE4D13A2366201", hash_generated_field = "3C2147BFD0A352215AED1CDDE74C4927")

    public static final int KEYCODE_BUTTON_START    = 108;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.746 -0400", hash_original_field = "B544442BFCD8723A7932CF071664E4FF", hash_generated_field = "486C95C9C17D5CE2FB5701AD2312165E")

    public static final int KEYCODE_BUTTON_SELECT   = 109;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.746 -0400", hash_original_field = "883A6EAAFDF3DF9D176A21806BCD9875", hash_generated_field = "91A92EDCBF3439CA7154016DBF6DBD31")

    public static final int KEYCODE_BUTTON_MODE     = 110;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.746 -0400", hash_original_field = "17021DBBE5A1B7B97C5CB94F74D275E8", hash_generated_field = "F4D8109F1A4C02A1F11832D4C39A453A")

    public static final int KEYCODE_ESCAPE          = 111;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.746 -0400", hash_original_field = "6D431729DDCEED069403FF50159BF85E", hash_generated_field = "0C1FC00B20C1E1A8C80ECA4CF560EA57")

    public static final int KEYCODE_FORWARD_DEL     = 112;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.746 -0400", hash_original_field = "AB2E8FE42892567E872E5BFD3BF97495", hash_generated_field = "7E6EC03CC110CB99368B7D6529B31AAF")

    public static final int KEYCODE_CTRL_LEFT       = 113;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.746 -0400", hash_original_field = "7C28AC606F54C80784048D1CF49BD004", hash_generated_field = "839FB9FFAB710CAB2E67757DBCEE6C07")

    public static final int KEYCODE_CTRL_RIGHT      = 114;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.746 -0400", hash_original_field = "521BDE0D4148A1DF116D920706ABB96C", hash_generated_field = "2C34DA128A3F93DD3EE287703E784C7E")

    public static final int KEYCODE_CAPS_LOCK       = 115;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.746 -0400", hash_original_field = "849C424C62A1C068B8C1E697BC936A25", hash_generated_field = "BFCBAA8C83B614BE3E433B4596A6E2CA")

    public static final int KEYCODE_SCROLL_LOCK     = 116;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.746 -0400", hash_original_field = "FDDA224385DCFC73BA681FBE5FF12C79", hash_generated_field = "0D4F3DB8F853DCD8828E4B5EDD90AFC3")

    public static final int KEYCODE_META_LEFT       = 117;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.746 -0400", hash_original_field = "7AB8D0227118E6DBC2DBEBF2D4AC499E", hash_generated_field = "F19FD8B2678E56118E9099A490A3EF43")

    public static final int KEYCODE_META_RIGHT      = 118;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.746 -0400", hash_original_field = "961C7FDAD12709CFD729C9FB8DDD4D58", hash_generated_field = "43EB65D1D46A2DB6037A79F135F647F0")

    public static final int KEYCODE_FUNCTION        = 119;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.746 -0400", hash_original_field = "F0D7D5C3F737AB45BAA8BBEA71C93987", hash_generated_field = "85A06C31533BD455AED0EBFACAAF99F6")

    public static final int KEYCODE_SYSRQ           = 120;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.746 -0400", hash_original_field = "20DBEBCB5ADA7E2D9E832A7A2DC2923A", hash_generated_field = "24E6F76F09E3DBA66C6E78E1AC0D6377")

    public static final int KEYCODE_BREAK           = 121;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.746 -0400", hash_original_field = "200E4BEBAE997B4545D18461ADEFA682", hash_generated_field = "40D11295ADF4AEFA4139EA8DA0E1629C")

    public static final int KEYCODE_MOVE_HOME       = 122;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.746 -0400", hash_original_field = "3261B016C29E09F1507335BB43EA2C21", hash_generated_field = "637D1DD3C96A0EBA62B9B18A0D077502")

    public static final int KEYCODE_MOVE_END        = 123;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.747 -0400", hash_original_field = "C8643BB9956F91212BC803B3C08BADED", hash_generated_field = "D5553617443672385F8B5FA58E06D02B")

    public static final int KEYCODE_INSERT          = 124;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.747 -0400", hash_original_field = "E64A9E9A2955B24F040912BDBC1A840F", hash_generated_field = "D89013950B1A88C29D00CB29B82B6CFE")

    public static final int KEYCODE_FORWARD         = 125;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.753 -0400", hash_original_field = "476F0B2A19FA873A77610F8815626F84", hash_generated_field = "9441A62B74F22725D4E5C7392C8E6558")

    public static final int KEYCODE_MEDIA_PLAY      = 126;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.753 -0400", hash_original_field = "7B7EBFA901993988107EF4A4CE39E107", hash_generated_field = "753187519748D9D0BAB26C6880E1DB28")

    public static final int KEYCODE_MEDIA_PAUSE     = 127;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.753 -0400", hash_original_field = "C0A5C84F901D54E7E0F51EEA1AB9D8A6", hash_generated_field = "E6DA4C66BA0A5A5C45F3B73A169E7B05")

    public static final int KEYCODE_MEDIA_CLOSE     = 128;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.753 -0400", hash_original_field = "033CEA86D5F390CCEE27E9412A9C326C", hash_generated_field = "53167516014E93CC3BEA619AB4DCCF8A")

    public static final int KEYCODE_MEDIA_EJECT     = 129;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.753 -0400", hash_original_field = "472EC4CAF9AD0A7B0A2A0A486739EFE8", hash_generated_field = "D0B7C1441F43A2FC8490E55B0453C41D")

    public static final int KEYCODE_MEDIA_RECORD    = 130;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.753 -0400", hash_original_field = "AB98884E818E4F08753865B111021466", hash_generated_field = "41935DB4FFE35F9FB36E8223813D9051")

    public static final int KEYCODE_F1              = 131;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.753 -0400", hash_original_field = "809F42BF833202DF6EDCA2A7CFB6E1CD", hash_generated_field = "78E7EA48B4D9AC8D3E63E3A78FAF5869")

    public static final int KEYCODE_F2              = 132;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.753 -0400", hash_original_field = "3375EDE339A178DE36DE312B6170CD7C", hash_generated_field = "418F881409ED2E93669C68C71F8D4CA5")

    public static final int KEYCODE_F3              = 133;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.753 -0400", hash_original_field = "C15388CE54AB3E3BC8B071987DC4C454", hash_generated_field = "E1AA61F15EEC5BA34FB6680DCE14397F")

    public static final int KEYCODE_F4              = 134;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.753 -0400", hash_original_field = "B0E791262448418E3CFADFBBC4A2456D", hash_generated_field = "97880C228CCAAB5352F34A43F284B38D")

    public static final int KEYCODE_F5              = 135;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.753 -0400", hash_original_field = "8D306504F0087DFB05D4AFFF7E5E8FD8", hash_generated_field = "9A8A20B5B0ABE1C469ECB076ED7621AE")

    public static final int KEYCODE_F6              = 136;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.753 -0400", hash_original_field = "68CD6E20674B2004DFEA1F6B0F628238", hash_generated_field = "8628B16B71353158721690BA70FBFDA8")

    public static final int KEYCODE_F7              = 137;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.753 -0400", hash_original_field = "5D8B81BF45A7A8EEA95E97E28479F12F", hash_generated_field = "1C3DF38BEEEA1277B43E74D535408577")

    public static final int KEYCODE_F8              = 138;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.753 -0400", hash_original_field = "43A3DCA48556A4F9072416295A43DD70", hash_generated_field = "AF49243EFD749B272F992886A023C12E")

    public static final int KEYCODE_F9              = 139;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.753 -0400", hash_original_field = "4B498CC5D63CE2228F7E8AB8642E4AB7", hash_generated_field = "2640BE5CBBF315157DFFD20FABA57503")

    public static final int KEYCODE_F10             = 140;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.753 -0400", hash_original_field = "224244D3CEF35BC7606522932DE16C74", hash_generated_field = "4721BBD295F0D13396182FD908941315")

    public static final int KEYCODE_F11             = 141;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.753 -0400", hash_original_field = "9665D9468083EAFD22FE2132113CD4CB", hash_generated_field = "EE0801DED18F1D0BCA459E861020D3AA")

    public static final int KEYCODE_F12             = 142;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.753 -0400", hash_original_field = "C62217271F2F58966AC8F1ADA9F49325", hash_generated_field = "E7B1297F34D10527EC47E93A01689239")

    public static final int KEYCODE_NUM_LOCK        = 143;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.753 -0400", hash_original_field = "F6E6F4259B9393E3943EA4C0EA2BB028", hash_generated_field = "F178ECA9E4F082BE7EBCF84C65804A50")

    public static final int KEYCODE_NUMPAD_0        = 144;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.753 -0400", hash_original_field = "54A55685C994ADFB8B469A78A1DE826C", hash_generated_field = "6A4E2CC78971158C3C56AC8B6D25EEF8")

    public static final int KEYCODE_NUMPAD_1        = 145;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.753 -0400", hash_original_field = "122EFAD23369B0F30430DE87958F69A2", hash_generated_field = "E64AEFD095100DAD616C739D73D20747")

    public static final int KEYCODE_NUMPAD_2        = 146;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.753 -0400", hash_original_field = "17437E0136A2123B9B1D6762A4F237FB", hash_generated_field = "C7962CF9464774D67F44699F98A1A98E")

    public static final int KEYCODE_NUMPAD_3        = 147;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.753 -0400", hash_original_field = "BCA7DAD71D862295EFD7236CC22A1AAB", hash_generated_field = "8174485E99FB498712D104900B1FA6E1")

    public static final int KEYCODE_NUMPAD_4        = 148;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.753 -0400", hash_original_field = "D419EC5EF4055FB21C4701E6766D5ED6", hash_generated_field = "E53C1BAB7566E6112738FD7E6FC54FB2")

    public static final int KEYCODE_NUMPAD_5        = 149;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.753 -0400", hash_original_field = "DB2A34FA4B58AFA93F21718F2951877F", hash_generated_field = "A099EA06B10BE4F4FEB8E1BAAF314943")

    public static final int KEYCODE_NUMPAD_6        = 150;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.754 -0400", hash_original_field = "D55837E4F748687030AFB84A50235438", hash_generated_field = "1C41733DF0F6DBE275EAE20CFBE7F850")

    public static final int KEYCODE_NUMPAD_7        = 151;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.754 -0400", hash_original_field = "89586346C4A87795FC6D806BF9D730BE", hash_generated_field = "D1114D54C9C9F46CF14FD0A8461B695B")

    public static final int KEYCODE_NUMPAD_8        = 152;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.754 -0400", hash_original_field = "A8510BBE9D4E96D9E6DBB97A46FBA3B9", hash_generated_field = "4C2190A91FDEA2A65F9B1BCDCF30B7DA")

    public static final int KEYCODE_NUMPAD_9        = 153;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.754 -0400", hash_original_field = "8C3262854C22AB5B090C7D4B22F4CD29", hash_generated_field = "95DA8633DB38C5B1079227DD1899F78D")

    public static final int KEYCODE_NUMPAD_DIVIDE   = 154;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.754 -0400", hash_original_field = "7F6CFA14E40CE22A3429A426CE3A8982", hash_generated_field = "2C99929BF9155401C81D0E1DC9128D97")

    public static final int KEYCODE_NUMPAD_MULTIPLY = 155;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.754 -0400", hash_original_field = "05DD71113ED57E98E12846A434D6CE10", hash_generated_field = "B83DCBE2EC5839402F13B659FFA984B4")

    public static final int KEYCODE_NUMPAD_SUBTRACT = 156;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.754 -0400", hash_original_field = "CC9769601A4AB735C06AF4F49E4498FB", hash_generated_field = "B37C36B8275B78CEDE9DE8E119AB99F8")

    public static final int KEYCODE_NUMPAD_ADD      = 157;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.754 -0400", hash_original_field = "6B695767BB4718DD2DF43CAB35AE6E1A", hash_generated_field = "DEB55AB3EEFECF2A2D3A6C7BAD086204")

    public static final int KEYCODE_NUMPAD_DOT      = 158;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.754 -0400", hash_original_field = "C38D9F843CB16CC41AAB8D66774208C0", hash_generated_field = "E7BA1246B397A372C303FB6BEDA05C41")

    public static final int KEYCODE_NUMPAD_COMMA    = 159;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.754 -0400", hash_original_field = "CDAA62D36C4A565202D0F021E3ED0205", hash_generated_field = "3AA10B522839DE0B8A23508939F4F2F7")

    public static final int KEYCODE_NUMPAD_ENTER    = 160;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.754 -0400", hash_original_field = "E6B23EE1E5D7EC51499A719A9A0E8C7B", hash_generated_field = "51C0B98952976BE77EFEC636079D030F")

    public static final int KEYCODE_NUMPAD_EQUALS   = 161;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.754 -0400", hash_original_field = "25FA832E0DB49B8C2F1A5051E6E18BEB", hash_generated_field = "80E3CB8500CE46B418C48285FAD32650")

    public static final int KEYCODE_NUMPAD_LEFT_PAREN = 162;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.754 -0400", hash_original_field = "BCEABD5B081D9D8856ABA530189ABD2A", hash_generated_field = "30EA1399B053CF5467F3CAB56CAFB91F")

    public static final int KEYCODE_NUMPAD_RIGHT_PAREN = 163;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.754 -0400", hash_original_field = "D62030495DF9C0E59BB25AE38500F701", hash_generated_field = "382A5F2BB6F20D95E6A69A8D3A50C50C")

    public static final int KEYCODE_VOLUME_MUTE     = 164;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.754 -0400", hash_original_field = "E806EF05AA51F22CF9B0820EF4AF218D", hash_generated_field = "CBC37F179A59326D26BA9D193835C780")

    public static final int KEYCODE_INFO            = 165;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.754 -0400", hash_original_field = "AE9D84F74FA2D8452448CC882271ABDE", hash_generated_field = "77C337F3E2FE3B1CC7653C583F48419D")

    public static final int KEYCODE_CHANNEL_UP      = 166;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.754 -0400", hash_original_field = "B634F9B79652A291FA2B2E9BBAC9F328", hash_generated_field = "FEBA0DDC25D9B460E8DF9B89F63B7D25")

    public static final int KEYCODE_CHANNEL_DOWN    = 167;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.754 -0400", hash_original_field = "F868843762E5E003EE298F391A5A04F7", hash_generated_field = "B37DF083E60B13A38E1D935192F269CF")

    public static final int KEYCODE_ZOOM_IN         = 168;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.754 -0400", hash_original_field = "3CC8B8734DEB6CA43016E825A35CA46C", hash_generated_field = "510DA9083E038F4EC2A860508BAF4CD3")

    public static final int KEYCODE_ZOOM_OUT        = 169;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.754 -0400", hash_original_field = "0793C18AB28D918E55B289BF2FBD1E46", hash_generated_field = "6DFE075DCEDF47B1E7FC81E18088A542")

    public static final int KEYCODE_TV              = 170;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.754 -0400", hash_original_field = "414E5135411E67B040D6050E374A941B", hash_generated_field = "FC8ACE3FC1F2DAF77B12E57AEB880469")

    public static final int KEYCODE_WINDOW          = 171;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.754 -0400", hash_original_field = "03CDD52F6A7D7B2EE89B28FA32571E22", hash_generated_field = "A7E4A2067FE83390E6363A0018E64AE6")

    public static final int KEYCODE_GUIDE           = 172;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.754 -0400", hash_original_field = "17F0C795F8AD17FE496B1D3D003625C8", hash_generated_field = "DC8596C92C6C18BF2291A38EBDBEF3E7")

    public static final int KEYCODE_DVR             = 173;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.754 -0400", hash_original_field = "03BE44379BAD5487018A30E8B5B7A334", hash_generated_field = "249CFB3940E57A5FC9C7538CF3B16777")

    public static final int KEYCODE_BOOKMARK        = 174;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.754 -0400", hash_original_field = "C77456CB0CA6B66396183A21BBDB0993", hash_generated_field = "10994FBFB90379026F33E31E9F8676B3")

    public static final int KEYCODE_CAPTIONS        = 175;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.754 -0400", hash_original_field = "27BF6156125A764DCA47AB96E6578AA6", hash_generated_field = "32117231F7825C9D433CE589AA172F4C")

    public static final int KEYCODE_SETTINGS        = 176;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.754 -0400", hash_original_field = "22CA87C2B56C935F1463D7748A74542B", hash_generated_field = "A563350C89DBA71E50BF90DEACEA7F8C")

    public static final int KEYCODE_TV_POWER        = 177;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.754 -0400", hash_original_field = "2473577020FC114815E0BE44F44B73FA", hash_generated_field = "8995A1762AC3B5C128D0D0EB2647BC85")

    public static final int KEYCODE_TV_INPUT        = 178;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.755 -0400", hash_original_field = "619F8834892B69EC4A830E122A7B96AF", hash_generated_field = "F8E75E7F7661E5FFB14404D9A734B047")

    public static final int KEYCODE_STB_POWER       = 179;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.755 -0400", hash_original_field = "EC4655E9A63875139933BE39FB96D38C", hash_generated_field = "157837C488907EA0EBB9A89CD330F134")

    public static final int KEYCODE_STB_INPUT       = 180;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.755 -0400", hash_original_field = "DD43AA470FD0A176579EB88018995359", hash_generated_field = "A8AF59437CC132191126B9326C7BB59F")

    public static final int KEYCODE_AVR_POWER       = 181;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.755 -0400", hash_original_field = "6BE7E3B7614CB0F3119676F806A78126", hash_generated_field = "1BF31BF57DD668AE53ECC723B318781F")

    public static final int KEYCODE_AVR_INPUT       = 182;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.755 -0400", hash_original_field = "D28B57463853D2762D7203284AA8B63F", hash_generated_field = "C50055D2B0BE732D1ADCFE5E60E7F48F")

    public static final int KEYCODE_PROG_RED        = 183;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.755 -0400", hash_original_field = "AAC490EB0DA731BD051630C1E0779BDD", hash_generated_field = "F736C071D2AF124120A411A9E9BD4341")

    public static final int KEYCODE_PROG_GREEN      = 184;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.755 -0400", hash_original_field = "4CC62A8F92E636C8D94C1C0439FE6D59", hash_generated_field = "00097C9C73776DDF440E171BB4786E11")

    public static final int KEYCODE_PROG_YELLOW     = 185;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.757 -0400", hash_original_field = "DF29A80457ADF745772E4C270F412C09", hash_generated_field = "AFE34EF29109971BC3FAE3DD327EA71B")

    public static final int KEYCODE_PROG_BLUE       = 186;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.757 -0400", hash_original_field = "E0FC3F9781DB827D589E368A51AB3AA0", hash_generated_field = "F32E5CCA62E47DA5CB6ED768F6984529")

    public static final int KEYCODE_APP_SWITCH      = 187;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.757 -0400", hash_original_field = "FC96A7EE51A8775E3C1D3668F8582229", hash_generated_field = "394AABDA6023425CD4A041238C00EC95")

    public static final int KEYCODE_BUTTON_1        = 188;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.757 -0400", hash_original_field = "FA0A7E7F476693BD373FFC381A406C6B", hash_generated_field = "4B69486DC6094DAF12CF39F02C4C1052")

    public static final int KEYCODE_BUTTON_2        = 189;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.757 -0400", hash_original_field = "CB18D89F1B98031A8F255AD42C4E9ACC", hash_generated_field = "6D9A2A53F672CC3E9A65CD2252190367")

    public static final int KEYCODE_BUTTON_3        = 190;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.757 -0400", hash_original_field = "0B02A65E9F3AD631DC228778226255A6", hash_generated_field = "25702203559C5D54F4F4A0DB3D8F8069")

    public static final int KEYCODE_BUTTON_4        = 191;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.757 -0400", hash_original_field = "9EE96BCA386411A73E241D2CCDBE6D86", hash_generated_field = "E7F3149F308CC7E53E8F65DF25A94826")

    public static final int KEYCODE_BUTTON_5        = 192;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.757 -0400", hash_original_field = "9397605068F25A5C935C7308FD6F7E34", hash_generated_field = "1ED6FBDFA01DB2E15B0C713B5BEE0F55")

    public static final int KEYCODE_BUTTON_6        = 193;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.757 -0400", hash_original_field = "56FB9F394D9DCD9DFC45D6DD4D51EA04", hash_generated_field = "D7B145850B009706A332264366F86FEA")

    public static final int KEYCODE_BUTTON_7        = 194;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.757 -0400", hash_original_field = "01CA2FB5A35E28E8F91DBB2292828FF7", hash_generated_field = "F09F97296ECAA6FD5149C4FED332A8D7")

    public static final int KEYCODE_BUTTON_8        = 195;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.757 -0400", hash_original_field = "DE47456523EA25C0FA8D64F271128C9E", hash_generated_field = "C5727DD8C40C5292179B5DF787AEA2DB")

    public static final int KEYCODE_BUTTON_9        = 196;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.757 -0400", hash_original_field = "2CAFCBF0CC41C866F6DEAFC974800085", hash_generated_field = "84293B771FF9DE8D9E1245F7EC542F63")

    public static final int KEYCODE_BUTTON_10       = 197;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.757 -0400", hash_original_field = "414324654017C9A4E645820A8AD11F7B", hash_generated_field = "81D4E1C463B6C0F0967232AD38E8EC39")

    public static final int KEYCODE_BUTTON_11       = 198;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.757 -0400", hash_original_field = "EEF0070E305E2B72F487053F90A8F4E9", hash_generated_field = "1ECD308FB87691D0645793B4A75D7821")

    public static final int KEYCODE_BUTTON_12       = 199;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.757 -0400", hash_original_field = "194DCDDC815CD453827A83B549406FEB", hash_generated_field = "DA3BDD17899EF863BCD79EE0A93CE72F")

    public static final int KEYCODE_BUTTON_13       = 200;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.757 -0400", hash_original_field = "E4896835580454C80848AF8B88ED8D79", hash_generated_field = "C8792BF5955A6121B7C0CF8AFB860F09")

    public static final int KEYCODE_BUTTON_14       = 201;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.757 -0400", hash_original_field = "6965427A8ED26C8FBEB6932BF90F318A", hash_generated_field = "64703277F4C1BAB4CF65A279AF576ADF")

    public static final int KEYCODE_BUTTON_15       = 202;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.757 -0400", hash_original_field = "40376FB2D81956175AE802C3675D7DF8", hash_generated_field = "0230AFBBAF9CA38EAA2F93E60AD0FCFD")

    public static final int KEYCODE_BUTTON_16       = 203;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.757 -0400", hash_original_field = "D45898AA313C1345D51EC215BD370F2D", hash_generated_field = "01404943ABD1AC6B853136A1B47F1E3F")

    public static final int KEYCODE_LANGUAGE_SWITCH = 204;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.757 -0400", hash_original_field = "C9705AF4301C18F67BDDD66190977B94", hash_generated_field = "06EE9D2655D6C3A1A58CD05F94F7F499")

    public static final int KEYCODE_MANNER_MODE     = 205;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.757 -0400", hash_original_field = "877BACF8A2A97F745788C84FFFE49574", hash_generated_field = "AC75AB32E54ED39910C713F0FF962C61")

    public static final int KEYCODE_3D_MODE         = 206;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.757 -0400", hash_original_field = "08FA823F6BA604B422388DA61A9860DC", hash_generated_field = "81393C443A769E5D0B9E2DE5EEA55C0D")

    public static final int KEYCODE_CONTACTS        = 207;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.757 -0400", hash_original_field = "63725FA59238DD15F23E15632223254F", hash_generated_field = "71E25264E1D04E84E8942BF044327976")

    public static final int KEYCODE_CALENDAR        = 208;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.758 -0400", hash_original_field = "69FBF22DE87D5F167DFB6955DACBB23B", hash_generated_field = "BF3C88E39135CC744209FEEC149C2ADF")

    public static final int KEYCODE_MUSIC           = 209;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.758 -0400", hash_original_field = "594B7D805D186EBDEF688B255C1FABB1", hash_generated_field = "C851640BB715C434DC738BA9253808FE")

    public static final int KEYCODE_CALCULATOR      = 210;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.758 -0400", hash_original_field = "0789AD7B9528C5D3A2BC05A9CB2365E4", hash_generated_field = "6748E460F0CFA81DB5F0F8E1ED26C181")

    private static int LAST_KEYCODE = KEYCODE_CALCULATOR;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.758 -0400", hash_original_field = "7B63AEF868E4FAE6B049A754E3E97AF5", hash_generated_field = "C956C7D8CF65F99FBCB5DB50C8321BF6")

    private static SparseArray<String> KEYCODE_SYMBOLIC_NAMES = new SparseArray<String>();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.758 -0400", hash_original_field = "B3F9B68D4B46BBCEFBA46373719C28B2", hash_generated_field = "73D756D98FEC365704F2D0C3E5C4F5F2")

    private static String[] META_SYMBOLIC_NAMES = new String[] {
        "META_SHIFT_ON",
        "META_ALT_ON",
        "META_SYM_ON",
        "META_FUNCTION_ON",
        "META_ALT_LEFT_ON",
        "META_ALT_RIGHT_ON",
        "META_SHIFT_LEFT_ON",
        "META_SHIFT_RIGHT_ON",
        "META_CAP_LOCKED",
        "META_ALT_LOCKED",
        "META_SYM_LOCKED",
        "0x00000800",
        "META_CTRL_ON",
        "META_CTRL_LEFT_ON",
        "META_CTRL_RIGHT_ON",
        "0x00008000",
        "META_META_ON",
        "META_META_LEFT_ON",
        "META_META_RIGHT_ON",
        "0x00080000",
        "META_CAPS_LOCK_ON",
        "META_NUM_LOCK_ON",
        "META_SCROLL_LOCK_ON",
        "0x00800000",
        "0x01000000",
        "0x02000000",
        "0x04000000",
        "0x08000000",
        "0x10000000",
        "0x20000000",
        "0x40000000",
        "0x80000000",
    };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.758 -0400", hash_original_field = "C730BD2CEB64C79FA38B6C55C6023CA9", hash_generated_field = "E29CFE04FAF452760D39B1555E3DA539")

    @Deprecated
    public static final int MAX_KEYCODE             = 84;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.758 -0400", hash_original_field = "05E3DA568602DAD9EA3C414607B71E65", hash_generated_field = "B56FBABE5CC8DDE909CEA8CDE98BA93D")

    public static final int ACTION_DOWN             = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.758 -0400", hash_original_field = "6D72F1F84E251024F9C1BAF7B002F529", hash_generated_field = "E9419BD1576C4C89CB972C93BF43E7C5")

    public static final int ACTION_UP               = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.758 -0400", hash_original_field = "976797732D49C8B52925D098E26731EF", hash_generated_field = "5280768339B678D3C0B5FC81EC5E3F1B")

    public static final int ACTION_MULTIPLE         = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.758 -0400", hash_original_field = "72B124BD2DDC8775D3E54A3BFEB47946", hash_generated_field = "6D1E08C6A5AE4E524201967D95640DD1")

    public static final int META_CAP_LOCKED = 0x100;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.758 -0400", hash_original_field = "9CF69C2D66791E776F0FCDC3880B199C", hash_generated_field = "BAEF4E0228894ED6E6042DD5E283E3A8")

    public static final int META_ALT_LOCKED = 0x200;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.758 -0400", hash_original_field = "C7F1541ACF2BBE32E10AE5421B6CD995", hash_generated_field = "5E488E5021CBDD9609C595AF0D84DAF8")

    public static final int META_SYM_LOCKED = 0x400;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.758 -0400", hash_original_field = "357440A6033BE27E735B723C4C47053E", hash_generated_field = "9E11181A5D6AD5CF1D060BED4D53A38D")

    public static final int META_SELECTING = 0x800;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.758 -0400", hash_original_field = "F8BAB689FC8400527552D425F6BD77A3", hash_generated_field = "6710F5CF1A580C4BA908F9DE44D69269")

    public static final int META_ALT_ON = 0x02;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.758 -0400", hash_original_field = "FC59992511F464E2567382488F6ABFD3", hash_generated_field = "038950DB00ED30A0C2A6EA7CA387D802")

    public static final int META_ALT_LEFT_ON = 0x10;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.758 -0400", hash_original_field = "83BCA82DC0EBC867778909BBE561E528", hash_generated_field = "2B7E2AEDA8A317216170029679D5FA3B")

    public static final int META_ALT_RIGHT_ON = 0x20;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.758 -0400", hash_original_field = "72C1A9F511FAF2864FDEA5ED196CA676", hash_generated_field = "CEF865A9A153704AB01AF0D53AFCB33B")

    public static final int META_SHIFT_ON = 0x1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.758 -0400", hash_original_field = "F31FA9A4CCDCBD4593459619EC4009D6", hash_generated_field = "B691B04D5E9486C5D8DD77F810B6D4EB")

    public static final int META_SHIFT_LEFT_ON = 0x40;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.758 -0400", hash_original_field = "B1FBD2E397F25142742FEEDF00CB04A8", hash_generated_field = "F1C6A0212FB21D9CEB1B9A92A9AAE09D")

    public static final int META_SHIFT_RIGHT_ON = 0x80;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.758 -0400", hash_original_field = "225D3D7B51D05803B0D7B3EAB852F119", hash_generated_field = "2FFDEC1D74A3F5599FE14C730D69BAA9")

    public static final int META_SYM_ON = 0x4;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.758 -0400", hash_original_field = "E0FE269F9F6831C063CE35F85ADC7210", hash_generated_field = "0C8C00C9836FBE3A682E91CE0D062118")

    public static final int META_FUNCTION_ON = 0x8;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.758 -0400", hash_original_field = "5D311E94A73813459F245C6FE409C416", hash_generated_field = "88C890EE21FF18ADBC8647F084CDC393")

    public static final int META_CTRL_ON = 0x1000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.758 -0400", hash_original_field = "7C4987756146BB3A706896AAD48AA587", hash_generated_field = "53ECB17B3D0175AF5F54E47B6597826A")

    public static final int META_CTRL_LEFT_ON = 0x2000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.758 -0400", hash_original_field = "88A90D92923C216DA8E950F05E300C52", hash_generated_field = "AEE5A230C75D01795A35ABF1D0FE8129")

    public static final int META_CTRL_RIGHT_ON = 0x4000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.766 -0400", hash_original_field = "8A985699DBA84254EA0F199651F05E31", hash_generated_field = "0AF47D16A49D9527E899DA14710C07E3")

    public static final int META_META_ON = 0x10000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.766 -0400", hash_original_field = "00F231B6A7A4EED795F0C983BEF7C368", hash_generated_field = "EA7EB2ABE6119E9E6AD87D0B0F5FAE53")

    public static final int META_META_LEFT_ON = 0x20000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.766 -0400", hash_original_field = "77266C4DB4B995387B1662D7CBDF4807", hash_generated_field = "86E858445C20D225D6860403B12B6724")

    public static final int META_META_RIGHT_ON = 0x40000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.766 -0400", hash_original_field = "2DB384B86F83AB36E0D66D6A3E7BCA51", hash_generated_field = "16BD993D31F187559A9D13A65F4B9FB7")

    public static final int META_CAPS_LOCK_ON = 0x100000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.766 -0400", hash_original_field = "BDB643C324031B4E1AF5BA4EE758E3FD", hash_generated_field = "4ABBC2D97836A92B9D6819070A70931F")

    public static final int META_NUM_LOCK_ON = 0x200000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.766 -0400", hash_original_field = "618C1532108006C7435F5EF0559EEC12", hash_generated_field = "248E0ED8289417F079704439322EB8B7")

    public static final int META_SCROLL_LOCK_ON = 0x400000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.767 -0400", hash_original_field = "9E726689B43AA6BE33674642E433E035", hash_generated_field = "A36A2D0A7C1D1324359E0C1FDFBF546A")

    public static final int META_SHIFT_MASK = META_SHIFT_ON
            | META_SHIFT_LEFT_ON | META_SHIFT_RIGHT_ON;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.767 -0400", hash_original_field = "EB1CFF08A08EA7993E7978D2AC83F605", hash_generated_field = "F6655C8725A6A6600D70749777DF2F82")

    public static final int META_ALT_MASK = META_ALT_ON
            | META_ALT_LEFT_ON | META_ALT_RIGHT_ON;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.767 -0400", hash_original_field = "657F3EC9CE1766F26B7C28CE6287CECD", hash_generated_field = "0FFC07F5B5FF9D8EB2A9866831C8FDB9")

    public static final int META_CTRL_MASK = META_CTRL_ON
            | META_CTRL_LEFT_ON | META_CTRL_RIGHT_ON;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.767 -0400", hash_original_field = "6494C7843D6835288E22098B7C213522", hash_generated_field = "BA47AFEFD3071E7C8C6529EB84FCC3B7")

    public static final int META_META_MASK = META_META_ON
            | META_META_LEFT_ON | META_META_RIGHT_ON;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.767 -0400", hash_original_field = "9EAA103D9E62787E0B9C6AE37CC4D038", hash_generated_field = "A300CC160CFE79419B3DEDCC06E71097")

    public static final int FLAG_WOKE_HERE = 0x1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.767 -0400", hash_original_field = "5DC556FD6B3127267FF59D7DB9E2AE6E", hash_generated_field = "4B4F9480F930564F31898860F0906503")

    public static final int FLAG_SOFT_KEYBOARD = 0x2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.767 -0400", hash_original_field = "F4E9B696782C0E928D5F81887933EE50", hash_generated_field = "6E5F9B07C4A519AEF8BA6A06CC07768C")

    public static final int FLAG_KEEP_TOUCH_MODE = 0x4;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.767 -0400", hash_original_field = "68EC924E9AB252A4552B64E634769CAE", hash_generated_field = "FC43BB2783BD04152DC976F3B0A2AEA8")

    public static final int FLAG_FROM_SYSTEM = 0x8;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.767 -0400", hash_original_field = "2FD971B65DD6EF0BB1EA26F22BFFD363", hash_generated_field = "7353455EAF673B88CA53AE815C1A8C90")

    public static final int FLAG_EDITOR_ACTION = 0x10;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.767 -0400", hash_original_field = "C6415A2DA9DE45E8C93EBBD85CB1C692", hash_generated_field = "536AAEA70D5496A245CAC1E6EDD36D4F")

    public static final int FLAG_CANCELED = 0x20;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.767 -0400", hash_original_field = "73295E5EF8D2A8EC440D0CCD62BA013F", hash_generated_field = "D2A6E6C2D49FF41694FCFD1ECD9D9A50")

    public static final int FLAG_VIRTUAL_HARD_KEY = 0x40;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.767 -0400", hash_original_field = "46FB013EF8C8F01A3D8E8BEFBF45BC87", hash_generated_field = "B994C337526288FB9487BB0BF0A7BF38")

    public static final int FLAG_LONG_PRESS = 0x80;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.767 -0400", hash_original_field = "E0DBDD5C78DE26547C531A853FF3F746", hash_generated_field = "F84442B2F3037477A654E80B75714AB9")

    public static final int FLAG_CANCELED_LONG_PRESS = 0x100;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.771 -0400", hash_original_field = "CA04B58B8B48AEF9B0DB57CF989CBB23", hash_generated_field = "9AC62BA5DB308EA7E59CBB8DB7167B2F")

    public static final int FLAG_TRACKING = 0x200;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.771 -0400", hash_original_field = "5AD91DCFF952F84D518DF69B1C4A57BB", hash_generated_field = "7AAB31488E327D5468CB5B93A3457D06")

    public static final int FLAG_FALLBACK = 0x400;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.771 -0400", hash_original_field = "8B7D8172D8C79A929C60FBF95E2BE171", hash_generated_field = "FF3FE95397D860480C18423499F713D3")

    public static final int FLAG_START_TRACKING = 0x40000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.771 -0400", hash_original_field = "550A819DF1874DD6CBEB9E34B7E02CA2", hash_generated_field = "22C757AFB129CA98FC86BD04BEE94F98")

    public static final int FLAG_TAINTED = 0x80000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.771 -0400", hash_original_field = "021906CCEC815FC820B74F760E7368C7", hash_generated_field = "99DFF1318F5BF79C590B7B00A696225C")

    static boolean DEBUG = false;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.771 -0400", hash_original_field = "8A42EF2A29D3EB0D85FC6A6C286FC0D6", hash_generated_field = "9E5F631FCDF23B79124BCAA2FA2F0FA0")

    static String TAG = "KeyEvent";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.771 -0400", hash_original_field = "4E0EEF34DE1E78AC4C7D48E7B28D3753", hash_generated_field = "A5933E4A5F04D439547A00DBB4EA1918")

    private static int MAX_RECYCLED = 10;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.776 -0400", hash_original_field = "79F53341661E7BAB58D441DAC7E61782", hash_generated_field = "BEC139CF931DD3E1019AC5E24E19DEE9")

    private static Object gRecyclerLock = new Object();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.776 -0400", hash_original_field = "62CB28CE8AC6DBF69FB484B561C6DE93", hash_generated_field = "695DE00CD65E15FE07938D99F2CA2696")

    private static int gRecyclerUsed;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.776 -0400", hash_original_field = "7BA7389C24C0F124608D5C2226AD35F9", hash_generated_field = "1BA0711EC13B8219450F3570393E04FA")

    private static KeyEvent gRecyclerTop;
    static {
        populateKeycodeSymbolicNames();
    }
    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.776 -0400", hash_original_field = "762E158197B9E4C59555D0A5CE1253B7", hash_generated_field = "4BF149696A6E5D4F2A92029586BF88B3")

    private static int META_MODIFIER_MASK = META_SHIFT_ON | META_SHIFT_LEFT_ON | META_SHIFT_RIGHT_ON
            | META_ALT_ON | META_ALT_LEFT_ON | META_ALT_RIGHT_ON
            | META_CTRL_ON | META_CTRL_LEFT_ON | META_CTRL_RIGHT_ON
            | META_META_ON | META_META_LEFT_ON | META_META_RIGHT_ON
            | META_SYM_ON | META_FUNCTION_ON;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.776 -0400", hash_original_field = "B98790F54B5E44A39E77C0219CAD0A5B", hash_generated_field = "F33E479427BAEA1608C4CC79DBAB2B10")

    private static int META_LOCK_MASK = META_CAPS_LOCK_ON | META_NUM_LOCK_ON | META_SCROLL_LOCK_ON;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.776 -0400", hash_original_field = "18124DB9BCEA3B08BCB8E91A7EC22D7D", hash_generated_field = "F325D7223B2FE632B256020FAFCFD5C1")

    private static int META_ALL_MASK = META_MODIFIER_MASK | META_LOCK_MASK;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.777 -0400", hash_original_field = "78CA52EA65A1CADD8973CD8674331E49", hash_generated_field = "703FC434C4C9913B5DC15FDB3BF4EC98")

    private static int META_SYNTHETIC_MASK = META_CAP_LOCKED | META_ALT_LOCKED | META_SYM_LOCKED | META_SELECTING;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.777 -0400", hash_original_field = "682342E505C09C31B3D8AAF752165A9B", hash_generated_field = "55C953FE861F3B5B64D026E862ABEAAC")

    private static int META_INVALID_MODIFIER_MASK = META_LOCK_MASK | META_SYNTHETIC_MASK;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:50.777 -0400", hash_original_field = "920C4A52D38CBE7E6A6542C0F9E0E2D9", hash_generated_field = "BB18ED46A8F92913C2C2DD003C5E50AA")

    public static final Parcelable.Creator<KeyEvent> CREATOR
            = new Parcelable.Creator<KeyEvent>() {
        public KeyEvent createFromParcel(Parcel in) {
            in.readInt(); 
            return KeyEvent.createFromParcelBody(in);
        }

        public KeyEvent[] newArray(int size) {
            return new KeyEvent[size];
        }
    };
}

