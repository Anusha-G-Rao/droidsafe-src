package android.view;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

public final class InputDevice implements Parcelable {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.253 -0400", hash_original_field = "6AC7F06B6413A1BE9C136DC7DF0D2B60", hash_generated_field = "9AA2EA3A2433F5D6F841BEFD54A673B4")

    private int mId;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.253 -0400", hash_original_field = "311C2C8498DF6A626CBDB8AA4193499C", hash_generated_field = "886C24C67739C97CF77B8DD239E412F9")

    private String mName;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.253 -0400", hash_original_field = "DB16CA429360673C225135A6E95335E5", hash_generated_field = "93F8C3686E416465BD516F0456984FB5")

    private int mSources;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.253 -0400", hash_original_field = "4F373ED5F3CABA41929A1177EB3FB926", hash_generated_field = "A34912FA2700058D6266925EFA16F418")

    private int mKeyboardType;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.253 -0400", hash_original_field = "AB30725F38523A03DBBFE4BBA5B3B40D", hash_generated_field = "70C3EC525DB53326DF319F2822B78445")

    private String mKeyCharacterMapFile;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.253 -0400", hash_original_field = "7CF9875B144A6D9731314267623BF1A5", hash_generated_field = "ED9316D63E1CF23FDA7B5C0A265648D6")

    private ArrayList<MotionRange> mMotionRanges = new ArrayList<MotionRange>();
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.256 -0400", hash_original_method = "2C37C35B619B46784669EFC9CA5E5179", hash_generated_method = "93E63FA312CE70DEEBBCD18536A99918")
    private  InputDevice() {
        // ---------- Original Method ----------
    }

    
        public static InputDevice getDevice(int id) {
        IWindowManager wm = Display.getWindowManager();
        try {
            return wm.getInputDevice(id);
        } catch (RemoteException ex) {
            throw new RuntimeException(
                    "Could not get input device information from Window Manager.", ex);
        }
    }

    
        public static int[] getDeviceIds() {
        IWindowManager wm = Display.getWindowManager();
        try {
            return wm.getInputDeviceIds();
        } catch (RemoteException ex) {
            throw new RuntimeException(
                    "Could not get input device ids from Window Manager.", ex);
        }
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.267 -0400", hash_original_method = "849E83C6BA01C72387E236CA4FAA38B9", hash_generated_method = "13B09CDE0B49AA0236FAA3B7B57560F1")
    public int getId() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_945896356 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_945896356;
        // ---------- Original Method ----------
        //return mId;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.270 -0400", hash_original_method = "9194A7433912D38B9A3F1171AC921C56", hash_generated_method = "C28CDD0A80A78286A169ECFA62CEC50A")
    public String getName() {
        String varB4EAC82CA7396A68D541C85D26508E83_879759243 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_879759243 = mName;
        varB4EAC82CA7396A68D541C85D26508E83_879759243.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_879759243;
        // ---------- Original Method ----------
        //return mName;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.271 -0400", hash_original_method = "3BD5CDD2AD0F6E345998577876EA9513", hash_generated_method = "FBB59D09E32E71A117397EA77CCEAE28")
    public int getSources() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1361495451 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1361495451;
        // ---------- Original Method ----------
        //return mSources;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.271 -0400", hash_original_method = "3E019E9C92E6EAD3726AE49F913F1619", hash_generated_method = "15A10C3197D19B49E7DB4FDAC1918610")
    public int getKeyboardType() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1352282081 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1352282081;
        // ---------- Original Method ----------
        //return mKeyboardType;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.284 -0400", hash_original_method = "88E280A067EB975F01B9806455B5FBF9", hash_generated_method = "9A55DA7DD14E8D99D5403E3FACCE7918")
    public KeyCharacterMap getKeyCharacterMap() {
        KeyCharacterMap varB4EAC82CA7396A68D541C85D26508E83_1030844339 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1030844339 = KeyCharacterMap.load(mId);
        varB4EAC82CA7396A68D541C85D26508E83_1030844339.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1030844339;
        // ---------- Original Method ----------
        //return KeyCharacterMap.load(mId);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.285 -0400", hash_original_method = "6E63969CFD2DFD594C82531499F7DA54", hash_generated_method = "F43FE7B2342EE1778B2CC5935F327ACF")
     String getKeyCharacterMapFile() {
        String varB4EAC82CA7396A68D541C85D26508E83_112633278 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_112633278 = mKeyCharacterMapFile;
        varB4EAC82CA7396A68D541C85D26508E83_112633278.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_112633278;
        // ---------- Original Method ----------
        //return mKeyCharacterMapFile;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.353 -0400", hash_original_method = "496E5C96705FE1519429C9151F8650BC", hash_generated_method = "D4DD42AAAEC6D8C0B9101F54F69BE440")
    public MotionRange getMotionRange(int axis) {
        MotionRange varB4EAC82CA7396A68D541C85D26508E83_1995390892 = null; //Variable for return #1
        MotionRange varB4EAC82CA7396A68D541C85D26508E83_522066098 = null; //Variable for return #2
        int numRanges;
        numRanges = mMotionRanges.size();
        {
            int i;
            i = 0;
            {
                MotionRange range;
                range = mMotionRanges.get(i);
                {
                    varB4EAC82CA7396A68D541C85D26508E83_1995390892 = range;
                } //End block
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_522066098 = null;
        addTaint(axis);
        MotionRange varA7E53CE21691AB073D9660D615818899_568827489; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_568827489 = varB4EAC82CA7396A68D541C85D26508E83_1995390892;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_568827489 = varB4EAC82CA7396A68D541C85D26508E83_522066098;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_568827489.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_568827489;
        // ---------- Original Method ----------
        //final int numRanges = mMotionRanges.size();
        //for (int i = 0; i < numRanges; i++) {
            //final MotionRange range = mMotionRanges.get(i);
            //if (range.mAxis == axis) {
                //return range;
            //}
        //}
        //return null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.357 -0400", hash_original_method = "2F158E6F6F2CA810A33FC3C995F22831", hash_generated_method = "6723D9C9C6355610EAB249D74B394BBC")
    public MotionRange getMotionRange(int axis, int source) {
        MotionRange varB4EAC82CA7396A68D541C85D26508E83_1368275959 = null; //Variable for return #1
        MotionRange varB4EAC82CA7396A68D541C85D26508E83_1523597314 = null; //Variable for return #2
        int numRanges;
        numRanges = mMotionRanges.size();
        {
            int i;
            i = 0;
            {
                MotionRange range;
                range = mMotionRanges.get(i);
                {
                    varB4EAC82CA7396A68D541C85D26508E83_1368275959 = range;
                } //End block
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_1523597314 = null;
        addTaint(axis);
        addTaint(source);
        MotionRange varA7E53CE21691AB073D9660D615818899_551588034; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_551588034 = varB4EAC82CA7396A68D541C85D26508E83_1368275959;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_551588034 = varB4EAC82CA7396A68D541C85D26508E83_1523597314;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_551588034.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_551588034;
        // ---------- Original Method ----------
        //final int numRanges = mMotionRanges.size();
        //for (int i = 0; i < numRanges; i++) {
            //final MotionRange range = mMotionRanges.get(i);
            //if (range.mAxis == axis && range.mSource == source) {
                //return range;
            //}
        //}
        //return null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.358 -0400", hash_original_method = "8F0147E430687E8511683E1D47819832", hash_generated_method = "2959FA6F64969234F268BAC35B104E11")
    public List<MotionRange> getMotionRanges() {
        List<MotionRange> varB4EAC82CA7396A68D541C85D26508E83_1641561198 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1641561198 = mMotionRanges;
        varB4EAC82CA7396A68D541C85D26508E83_1641561198.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1641561198;
        // ---------- Original Method ----------
        //return mMotionRanges;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.358 -0400", hash_original_method = "F938DEDD59851FE8B4D63705E085118B", hash_generated_method = "A7B1006F6BA450A99A55035280FEF73A")
    private void addMotionRange(int axis, int source,
            float min, float max, float flat, float fuzz) {
        mMotionRanges.add(new MotionRange(axis, source, min, max, flat, fuzz));
        addTaint(axis);
        addTaint(source);
        addTaint(min);
        addTaint(max);
        addTaint(flat);
        addTaint(fuzz);
        // ---------- Original Method ----------
        //mMotionRanges.add(new MotionRange(axis, source, min, max, flat, fuzz));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.362 -0400", hash_original_method = "66E89B3285A9850971D96BAD9F2BB44F", hash_generated_method = "83E70F7D6F15BFDE322146A8893B3394")
    private void readFromParcel(Parcel in) {
        mId = in.readInt();
        mName = in.readString();
        mSources = in.readInt();
        mKeyboardType = in.readInt();
        mKeyCharacterMapFile = in.readString();
        {
            int axis;
            axis = in.readInt();
            addMotionRange(axis, in.readInt(),
                    in.readFloat(), in.readFloat(), in.readFloat(), in.readFloat());
        } //End block
        // ---------- Original Method ----------
        //mId = in.readInt();
        //mName = in.readString();
        //mSources = in.readInt();
        //mKeyboardType = in.readInt();
        //mKeyCharacterMapFile = in.readString();
        //for (;;) {
            //int axis = in.readInt();
            //if (axis < 0) {
                //break;
            //}
            //addMotionRange(axis, in.readInt(),
                    //in.readFloat(), in.readFloat(), in.readFloat(), in.readFloat());
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.364 -0400", hash_original_method = "91853B6BABA9CBC4F027C3C314DDF153", hash_generated_method = "EB6B7B60D05EB9C983B7FE470FC3F2C8")
    @Override
    public void writeToParcel(Parcel out, int flags) {
        out.writeInt(mId);
        out.writeString(mName);
        out.writeInt(mSources);
        out.writeInt(mKeyboardType);
        out.writeString(mKeyCharacterMapFile);
        int numRanges;
        numRanges = mMotionRanges.size();
        {
            int i;
            i = 0;
            {
                MotionRange range;
                range = mMotionRanges.get(i);
                out.writeInt(range.mAxis);
                out.writeInt(range.mSource);
                out.writeFloat(range.mMin);
                out.writeFloat(range.mMax);
                out.writeFloat(range.mFlat);
                out.writeFloat(range.mFuzz);
            } //End block
        } //End collapsed parenthetic
        out.writeInt(-1);
        addTaint(out.getTaint());
        addTaint(flags);
        // ---------- Original Method ----------
        //out.writeInt(mId);
        //out.writeString(mName);
        //out.writeInt(mSources);
        //out.writeInt(mKeyboardType);
        //out.writeString(mKeyCharacterMapFile);
        //final int numRanges = mMotionRanges.size();
        //for (int i = 0; i < numRanges; i++) {
            //MotionRange range = mMotionRanges.get(i);
            //out.writeInt(range.mAxis);
            //out.writeInt(range.mSource);
            //out.writeFloat(range.mMin);
            //out.writeFloat(range.mMax);
            //out.writeFloat(range.mFlat);
            //out.writeFloat(range.mFuzz);
        //}
        //out.writeInt(-1);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.367 -0400", hash_original_method = "00F8174F9E89D0C972FA6D3F19742382", hash_generated_method = "A2E8BD1740EBF2092C178188C03C498F")
    @Override
    public int describeContents() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2137279644 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2137279644;
        // ---------- Original Method ----------
        //return 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.374 -0400", hash_original_method = "9F735BD3745C12E449D13E0D45FB54C8", hash_generated_method = "BD38984112E6FCB8E5EF678554B3CF57")
    @Override
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_718023073 = null; //Variable for return #1
        StringBuilder description;
        description = new StringBuilder();
        description.append("Input Device ").append(mId).append(": ").append(mName).append("\n");
        description.append("  Keyboard Type: ");
        //Begin case KEYBOARD_TYPE_NONE 
        description.append("none");
        //End case KEYBOARD_TYPE_NONE 
        //Begin case KEYBOARD_TYPE_NON_ALPHABETIC 
        description.append("non-alphabetic");
        //End case KEYBOARD_TYPE_NON_ALPHABETIC 
        //Begin case KEYBOARD_TYPE_ALPHABETIC 
        description.append("alphabetic");
        //End case KEYBOARD_TYPE_ALPHABETIC 
        description.append("\n");
        description.append("  Key Character Map: ").append(mKeyCharacterMapFile).append("\n");
        description.append("  Sources: 0x").append(Integer.toHexString(mSources)).append(" (");
        appendSourceDescriptionIfApplicable(description, SOURCE_KEYBOARD, "keyboard");
        appendSourceDescriptionIfApplicable(description, SOURCE_DPAD, "dpad");
        appendSourceDescriptionIfApplicable(description, SOURCE_TOUCHSCREEN, "touchscreen");
        appendSourceDescriptionIfApplicable(description, SOURCE_MOUSE, "mouse");
        appendSourceDescriptionIfApplicable(description, SOURCE_STYLUS, "stylus");
        appendSourceDescriptionIfApplicable(description, SOURCE_TRACKBALL, "trackball");
        appendSourceDescriptionIfApplicable(description, SOURCE_TOUCHPAD, "touchpad");
        appendSourceDescriptionIfApplicable(description, SOURCE_JOYSTICK, "joystick");
        appendSourceDescriptionIfApplicable(description, SOURCE_GAMEPAD, "gamepad");
        description.append(" )\n");
        int numAxes;
        numAxes = mMotionRanges.size();
        {
            int i;
            i = 0;
            {
                MotionRange range;
                range = mMotionRanges.get(i);
                description.append("    ").append(MotionEvent.axisToString(range.mAxis));
                description.append(": source=0x").append(Integer.toHexString(range.mSource));
                description.append(" min=").append(range.mMin);
                description.append(" max=").append(range.mMax);
                description.append(" flat=").append(range.mFlat);
                description.append(" fuzz=").append(range.mFuzz);
                description.append("\n");
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_718023073 = description.toString();
        varB4EAC82CA7396A68D541C85D26508E83_718023073.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_718023073;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.392 -0400", hash_original_method = "C8D7AE07A3174BF8CEBA0E0E2EC288B0", hash_generated_method = "969A62E89D565AE9E26E67CB0D71270B")
    private void appendSourceDescriptionIfApplicable(StringBuilder description, int source,
            String sourceName) {
        {
            description.append(" ");
            description.append(sourceName);
        } //End block
        addTaint(description.getTaint());
        addTaint(source);
        addTaint(sourceName.getTaint());
        // ---------- Original Method ----------
        //if ((mSources & source) == source) {
            //description.append(" ");
            //description.append(sourceName);
        //}
    }

    
    public static final class MotionRange {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.392 -0400", hash_original_field = "DDDC097689F9367A976032A7CB2D356F", hash_generated_field = "291186BF7CD64560031686367E49FDA6")

        private int mAxis;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.392 -0400", hash_original_field = "6917951DFB797D97827BAAA584F128DE", hash_generated_field = "D564CAA4C2DB0DC0AAAD32F1767ED66A")

        private int mSource;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.392 -0400", hash_original_field = "5226ADEF3F3B32783B4143237DC7F62E", hash_generated_field = "C65C1A7B3549B2CAE727CE60B163A9D5")

        private float mMin;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.392 -0400", hash_original_field = "C886C6FF92A43B3F6833B7BAFD354FBA", hash_generated_field = "61EBA81EE8DC22B1F5E764B863E5361B")

        private float mMax;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.392 -0400", hash_original_field = "C5775080456E320FD2BA8673FDF85440", hash_generated_field = "EE76E1A2F0CC7EE13DBD206CE7906C7D")

        private float mFlat;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.392 -0400", hash_original_field = "A0A8D80651D8BE9B0B3FA9DF5C043C6F", hash_generated_field = "88080FE0B3D7FAD3C1754E24E4008D99")

        private float mFuzz;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.394 -0400", hash_original_method = "003C115B43ED25425A82F4C0BC4BFB2D", hash_generated_method = "F4F973ACE14B026CE8F881C426E10F2D")
        private  MotionRange(int axis, int source, float min, float max, float flat, float fuzz) {
            mAxis = axis;
            mSource = source;
            mMin = min;
            mMax = max;
            mFlat = flat;
            mFuzz = fuzz;
            // ---------- Original Method ----------
            //mAxis = axis;
            //mSource = source;
            //mMin = min;
            //mMax = max;
            //mFlat = flat;
            //mFuzz = fuzz;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.394 -0400", hash_original_method = "7AA123496C72318A01ADA9E2FDF13D66", hash_generated_method = "B55E3B419FC94FCDFEA2A91B5402FE26")
        public int getAxis() {
            int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1383828212 = getTaintInt();
            return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1383828212;
            // ---------- Original Method ----------
            //return mAxis;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.394 -0400", hash_original_method = "7037355E864C633C32E117AF9FFED93E", hash_generated_method = "44739137E3C43A32404369A56238BDD5")
        public int getSource() {
            int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_511213417 = getTaintInt();
            return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_511213417;
            // ---------- Original Method ----------
            //return mSource;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.398 -0400", hash_original_method = "5BD2FEA7B11B9283C78F11EA439073DF", hash_generated_method = "ACB3DE36161696764D923A3189AF06FA")
        public float getMin() {
            float var546ADE640B6EDFBC8A086EF31347E768_1350144125 = getTaintFloat();
            return var546ADE640B6EDFBC8A086EF31347E768_1350144125;
            // ---------- Original Method ----------
            //return mMin;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.399 -0400", hash_original_method = "CDE9D2624870C8EBE80058272C14174B", hash_generated_method = "4C8A1FA026D527C1F563A996CCBAC4AF")
        public float getMax() {
            float var546ADE640B6EDFBC8A086EF31347E768_232981263 = getTaintFloat();
            return var546ADE640B6EDFBC8A086EF31347E768_232981263;
            // ---------- Original Method ----------
            //return mMax;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.400 -0400", hash_original_method = "FCC48134B6B008CC9CD869CCEF03FE5F", hash_generated_method = "D80C8293522D0D31921203679224ADEB")
        public float getRange() {
            float var546ADE640B6EDFBC8A086EF31347E768_470618190 = getTaintFloat();
            return var546ADE640B6EDFBC8A086EF31347E768_470618190;
            // ---------- Original Method ----------
            //return mMax - mMin;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.400 -0400", hash_original_method = "6E70447A0F19559DDEE9B218BFC4E0A9", hash_generated_method = "6116B5E5CDB289784A5F5C928F52FE62")
        public float getFlat() {
            float var546ADE640B6EDFBC8A086EF31347E768_779431570 = getTaintFloat();
            return var546ADE640B6EDFBC8A086EF31347E768_779431570;
            // ---------- Original Method ----------
            //return mFlat;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.409 -0400", hash_original_method = "6C32BE9CB35AEE464A215A2BDA6324A6", hash_generated_method = "F3A178E302E2C90D1353304A81C413B0")
        public float getFuzz() {
            float var546ADE640B6EDFBC8A086EF31347E768_218786828 = getTaintFloat();
            return var546ADE640B6EDFBC8A086EF31347E768_218786828;
            // ---------- Original Method ----------
            //return mFuzz;
        }

        
    }


    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.409 -0400", hash_original_field = "CE278AAAC0EEDF0668BB29E5EFF55401", hash_generated_field = "79DB10EEA8A684684DB29410B9A96FA0")

    public static final int SOURCE_CLASS_MASK = 0x000000ff;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.411 -0400", hash_original_field = "417AF9EE29AAC27F93BD8A31462A6CD4", hash_generated_field = "E552F6201060CE6A7B2CE06101B73E27")

    public static final int SOURCE_CLASS_BUTTON = 0x00000001;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.411 -0400", hash_original_field = "9555DAB3EC96ACC4F728A7F10BB14481", hash_generated_field = "18DBBE7D23B1AA4FDF7D48FAFD16B7D1")

    public static final int SOURCE_CLASS_POINTER = 0x00000002;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.411 -0400", hash_original_field = "E433ACEBED4290DEA3D11D2D04462355", hash_generated_field = "37A91856BE5B43482A6CC532660B322F")

    public static final int SOURCE_CLASS_TRACKBALL = 0x00000004;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.411 -0400", hash_original_field = "D73C7E3D38AE7B6140145CEC65264C58", hash_generated_field = "0503278EA3937695357A92063C04A747")

    public static final int SOURCE_CLASS_POSITION = 0x00000008;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.411 -0400", hash_original_field = "33AE5DEDE5E9128ED4B35A28864E36B4", hash_generated_field = "AF06B443A783729C3E25A4612CDC3B0D")

    public static final int SOURCE_CLASS_JOYSTICK = 0x00000010;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.411 -0400", hash_original_field = "7A00188CF4A876FEC5734A8B07AE4AEC", hash_generated_field = "F6F380DD90283AD8ED2E8942E2CBEDE2")

    public static final int SOURCE_UNKNOWN = 0x00000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.411 -0400", hash_original_field = "D9AA0255E5CEBB40AE6691A4D0B57CC6", hash_generated_field = "441DB42929C199D0380A266A0DB14AA5")

    public static final int SOURCE_KEYBOARD = 0x00000100 | SOURCE_CLASS_BUTTON;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.411 -0400", hash_original_field = "FBD3811E34C4A016BD1048D4E3FF77BA", hash_generated_field = "6EDC9B58D615427A3172FD2132FF7676")

    public static final int SOURCE_DPAD = 0x00000200 | SOURCE_CLASS_BUTTON;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.411 -0400", hash_original_field = "306606F9C139C95841EE0A1DDBFE77E1", hash_generated_field = "7E0C514E09049DD5397963B1A29C34C4")

    public static final int SOURCE_GAMEPAD = 0x00000400 | SOURCE_CLASS_BUTTON;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.412 -0400", hash_original_field = "C2770E63F6DE49117109C6C86D0582C6", hash_generated_field = "515BC29AF997D9AB3CC8C7F1589F726B")

    public static final int SOURCE_TOUCHSCREEN = 0x00001000 | SOURCE_CLASS_POINTER;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.412 -0400", hash_original_field = "905E4411A356CA2F1749B2E6D938893F", hash_generated_field = "4CC18EC988EC3A098925B2A857E3567F")

    public static final int SOURCE_MOUSE = 0x00002000 | SOURCE_CLASS_POINTER;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.412 -0400", hash_original_field = "CC3EB4E32B3305159BA96EA999D33E2A", hash_generated_field = "92EEB77027297EE4EFF782F8EF1FF0F7")

    public static final int SOURCE_STYLUS = 0x00004000 | SOURCE_CLASS_POINTER;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.412 -0400", hash_original_field = "49B5C818013877148A116E0FCAA21BD2", hash_generated_field = "9E9C6DB0CFC4958D3637F63294124775")

    public static final int SOURCE_TRACKBALL = 0x00010000 | SOURCE_CLASS_TRACKBALL;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.412 -0400", hash_original_field = "B6A9B0231C193A980A8AE0717FD0EC96", hash_generated_field = "C53F1BB8BA42E382D162BEB6C06A5DA6")

    public static final int SOURCE_TOUCHPAD = 0x00100000 | SOURCE_CLASS_POSITION;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.412 -0400", hash_original_field = "4C26E6726FB7CAFA588649FBFBB3E698", hash_generated_field = "2611C3DA236978609FE6ADB1CA63EA73")

    public static final int SOURCE_JOYSTICK = 0x01000000 | SOURCE_CLASS_JOYSTICK;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.412 -0400", hash_original_field = "91B65E67AD0BCE504F7F9A190785F0B0", hash_generated_field = "E9DD51F79C072DFDE77333973F1DFBB8")

    public static final int SOURCE_ANY = 0xffffff00;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.412 -0400", hash_original_field = "CEE30D0EDF1C9DF608B6C89AA4B8D09C", hash_generated_field = "7B2FEF95F8CA0D6FBF240CB6110B772A")

    @Deprecated
    public static final int MOTION_RANGE_X = MotionEvent.AXIS_X;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.412 -0400", hash_original_field = "FA30E93BDDE6E4DF2B43399E4A187E66", hash_generated_field = "18F61B4D7D5E46C987CB6812F2F23765")

    @Deprecated
    public static final int MOTION_RANGE_Y = MotionEvent.AXIS_Y;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.412 -0400", hash_original_field = "FE1C53E61FDBC13AC4362D813A01CA8D", hash_generated_field = "78402228454C81DFEE033C1B1A06C2D9")

    @Deprecated
    public static final int MOTION_RANGE_PRESSURE = MotionEvent.AXIS_PRESSURE;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.412 -0400", hash_original_field = "368412F9365F9E92B4F5A84291E8C794", hash_generated_field = "D70BF0ADE61441527074BAD011B363EF")

    @Deprecated
    public static final int MOTION_RANGE_SIZE = MotionEvent.AXIS_SIZE;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.412 -0400", hash_original_field = "DB2BBF09F3B04F01AF6C6D133B5BE518", hash_generated_field = "CA1F1E21E04D0900660382D6C6FB2288")

    @Deprecated
    public static final int MOTION_RANGE_TOUCH_MAJOR = MotionEvent.AXIS_TOUCH_MAJOR;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.412 -0400", hash_original_field = "5F03D1C8DB410D3AAC45B85F5DE1B84D", hash_generated_field = "D4E5B4D1F104C8CA42C6BF23E778DEB1")

    @Deprecated
    public static final int MOTION_RANGE_TOUCH_MINOR = MotionEvent.AXIS_TOUCH_MINOR;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.412 -0400", hash_original_field = "41CC4BCD0AAFCEA34F21E781DDC3BFDE", hash_generated_field = "AD49F028075332D31893082B82F68E04")

    @Deprecated
    public static final int MOTION_RANGE_TOOL_MAJOR = MotionEvent.AXIS_TOOL_MAJOR;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.412 -0400", hash_original_field = "BAAE71D6D53DB3FDDB22E7336E3FB7F4", hash_generated_field = "511D721009CA62BDE2CC36BB8E606383")

    @Deprecated
    public static final int MOTION_RANGE_TOOL_MINOR = MotionEvent.AXIS_TOOL_MINOR;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.412 -0400", hash_original_field = "40E5DEEB843FB6AE9C1751F78DCF4C7D", hash_generated_field = "563E0FE22373B2EDB536DD2ED09C2EC5")

    @Deprecated
    public static final int MOTION_RANGE_ORIENTATION = MotionEvent.AXIS_ORIENTATION;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.412 -0400", hash_original_field = "6D932CBCC6B9EDD8C267B047D9A6A627", hash_generated_field = "507B4AF09182B5A80D31534C6DAEFF45")

    public static final int KEYBOARD_TYPE_NONE = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.412 -0400", hash_original_field = "21EDB24132D7DB1EB8CCA6AB24B125BE", hash_generated_field = "145C88DB25C6C4CA9096B45DFE955870")

    public static final int KEYBOARD_TYPE_NON_ALPHABETIC = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.412 -0400", hash_original_field = "9D712DCC960D74DECA08AA4F811EA526", hash_generated_field = "99F61A684F6C37D75D47C8B4FBE3DDA3")

    public static final int KEYBOARD_TYPE_ALPHABETIC = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:49.412 -0400", hash_original_field = "0D395022D7ACD5A6443859D3E67FCA44", hash_generated_field = "21D35EEA2F1A31C6EEE3B233C84334EE")

    public static final Parcelable.Creator<InputDevice> CREATOR
            = new Parcelable.Creator<InputDevice>() {
        public InputDevice createFromParcel(Parcel in) {
            InputDevice result = new InputDevice();
            result.readFromParcel(in);
            return result;
        }
        
        public InputDevice[] newArray(int size) {
            return new InputDevice[size];
        }
    };
}

