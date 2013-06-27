package com.android.internal.telephony.sip;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import com.android.internal.telephony.Call;
import com.android.internal.telephony.Connection;
import com.android.internal.telephony.Phone;
import com.android.internal.telephony.UUSInfo;
import android.net.sip.SipAudioCall;
import android.os.SystemClock;
import android.util.Log;
import android.telephony.PhoneNumberUtils;

abstract class SipConnectionBase extends Connection {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.699 -0400", hash_original_field = "DF701BED26C9A6E82B434D3ADA19F19A", hash_generated_field = "D1359B5A0587476130FC171DA764AC68")

    private SipAudioCall mSipAudioCall;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.699 -0400", hash_original_field = "6BEE54DB0A5A8BDBAB5D2767D60E4A06", hash_generated_field = "E672830D2E0B106901DACBA6E0B923A6")

    private String dialString;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.699 -0400", hash_original_field = "651EFD6FB9FDDF9C1713795AFFA34606", hash_generated_field = "6F94828D80A08223A3D2C4840C810E5C")

    private String postDialString;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.699 -0400", hash_original_field = "0F847399DDED77AD45DD7EA28753707C", hash_generated_field = "A0D8F46E603AB3E7C2624AFEC4BCC56F")

    private int nextPostDialChar;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.699 -0400", hash_original_field = "BC23EBAFF55FFCC779696072ED387D2F", hash_generated_field = "899B35935BADAD00E40EEE48034FA777")

    private boolean isIncoming;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.699 -0400", hash_original_field = "1ED2E1B19B6E55D52D2473BE17A4AFD9", hash_generated_field = "2B7C094BB4119A5846E4078843652104")

    private long createTime;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.699 -0400", hash_original_field = "2A390E9117109AD2E2B8D0011E8B167F", hash_generated_field = "3A10CD6DE0D1F8841131E8E3B55CDF17")

    private long connectTime;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.699 -0400", hash_original_field = "AD92DC1F9C0B5401DB7C9C68DE643AD5", hash_generated_field = "4A468F625B3893CC4E044A175513CACE")

    private long disconnectTime;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.699 -0400", hash_original_field = "109C61524952CEA8F4A768697A2B73EA", hash_generated_field = "BD81C614EFF599A99945A7CA6F0301ED")

    private long connectTimeReal;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.699 -0400", hash_original_field = "B233BB93E83D178371054578F279C542", hash_generated_field = "B71E8F5397B52F575D65D0F3A413011B")

    private long duration = -1L;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.699 -0400", hash_original_field = "A2E64D805CF0AE78B184102EDC3BD0CA", hash_generated_field = "0C720B6C915AEB7736CF4596137134F0")

    private long holdingStartTime;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.699 -0400", hash_original_field = "2C3EDA892EC57CCBFC8A3FC4EDCA5971", hash_generated_field = "A263BBCF4D1AE1517BA0D25DE4E6D1FC")

    private DisconnectCause mCause = DisconnectCause.NOT_DISCONNECTED;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.699 -0400", hash_original_field = "9D7046FD56054C9553777648B65C3DFB", hash_generated_field = "D20AEA8FE258625EB4F340AF843F84F8")

    private PostDialState postDialState = PostDialState.NOT_STARTED;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.703 -0400", hash_original_method = "D12ADA666E21FFAC81BC845F1B1B388F", hash_generated_method = "0A147067DDC7E6520776E477ED6F8818")
      SipConnectionBase(String dialString) {
        this.dialString = dialString;
        postDialString = PhoneNumberUtils.extractPostDialPortion(dialString);
        isIncoming = false;
        createTime = System.currentTimeMillis();
        // ---------- Original Method ----------
        //this.dialString = dialString;
        //postDialString = PhoneNumberUtils.extractPostDialPortion(dialString);
        //isIncoming = false;
        //createTime = System.currentTimeMillis();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.703 -0400", hash_original_method = "9D87CB1ACC156683FA215308BE25D1D9", hash_generated_method = "F5656525211514DEA1ADCE820CBCC947")
    protected void setState(Call.State state) {
        //Begin case ACTIVE 
        {
            connectTimeReal = SystemClock.elapsedRealtime();
            connectTime = System.currentTimeMillis();
        } //End block
        //End case ACTIVE 
        //Begin case DISCONNECTED 
        duration = getDurationMillis();
        //End case DISCONNECTED 
        //Begin case DISCONNECTED 
        disconnectTime = System.currentTimeMillis();
        //End case DISCONNECTED 
        //Begin case HOLDING 
        holdingStartTime = SystemClock.elapsedRealtime();
        //End case HOLDING 
        addTaint(state.getTaint());
        // ---------- Original Method ----------
        //switch (state) {
            //case ACTIVE:
                //if (connectTime == 0) {
                    //connectTimeReal = SystemClock.elapsedRealtime();
                    //connectTime = System.currentTimeMillis();
                //}
                //break;
            //case DISCONNECTED:
                //duration = getDurationMillis();
                //disconnectTime = System.currentTimeMillis();
                //break;
            //case HOLDING:
                //holdingStartTime = SystemClock.elapsedRealtime();
                //break;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.704 -0400", hash_original_method = "A8956DD6ACAC2731E62816490C646631", hash_generated_method = "CCDED9384AE58DB66FB3494EB9D7ED6C")
    @Override
    public long getCreateTime() {
        long var0F5264038205EDFB1AC05FBB0E8C5E94_1647581511 = getTaintLong();
        return var0F5264038205EDFB1AC05FBB0E8C5E94_1647581511;
        // ---------- Original Method ----------
        //return createTime;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.704 -0400", hash_original_method = "540CF01EF64CF5C6BAC1246743ECA8F1", hash_generated_method = "5DE28F421302B616B0B0112A4D52BD62")
    @Override
    public long getConnectTime() {
        long var0F5264038205EDFB1AC05FBB0E8C5E94_564269357 = getTaintLong();
        return var0F5264038205EDFB1AC05FBB0E8C5E94_564269357;
        // ---------- Original Method ----------
        //return connectTime;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.704 -0400", hash_original_method = "D17BC9E58BABC2D5CE1B7492B59E2165", hash_generated_method = "8AC4E3B1325B192790FF0CBABC78CBB7")
    @Override
    public long getDisconnectTime() {
        long var0F5264038205EDFB1AC05FBB0E8C5E94_1908092847 = getTaintLong();
        return var0F5264038205EDFB1AC05FBB0E8C5E94_1908092847;
        // ---------- Original Method ----------
        //return disconnectTime;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.705 -0400", hash_original_method = "8E0034C90F1E75659D16C0CDCE6F5793", hash_generated_method = "028384673201ADEF85BD1B5B16AD73E5")
    @Override
    public long getDurationMillis() {
        {
            long var2E584F737203A878ED4A9BB9708321A8_1173620487 = (SystemClock.elapsedRealtime() - connectTimeReal);
        } //End block
        long var0F5264038205EDFB1AC05FBB0E8C5E94_231510522 = getTaintLong();
        return var0F5264038205EDFB1AC05FBB0E8C5E94_231510522;
        // ---------- Original Method ----------
        //if (connectTimeReal == 0) {
            //return 0;
        //} else if (duration < 0) {
            //return SystemClock.elapsedRealtime() - connectTimeReal;
        //} else {
            //return duration;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.705 -0400", hash_original_method = "2CFF5FB4AC83B238AC9B892D795EB1DE", hash_generated_method = "900B947006900A03EFEF31BD815EA9A6")
    @Override
    public long getHoldDurationMillis() {
        {
            boolean var65303E1BDDCE597941A633CC414B8ACE_1929961063 = (getState() != Call.State.HOLDING);
            {
                long var2C126D63011C35D772AC44944CB08D74_1272311462 = (SystemClock.elapsedRealtime() - holdingStartTime);
            } //End block
        } //End collapsed parenthetic
        long var0F5264038205EDFB1AC05FBB0E8C5E94_996649381 = getTaintLong();
        return var0F5264038205EDFB1AC05FBB0E8C5E94_996649381;
        // ---------- Original Method ----------
        //if (getState() != Call.State.HOLDING) {
            //return 0;
        //} else {
            //return SystemClock.elapsedRealtime() - holdingStartTime;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.717 -0400", hash_original_method = "28455B27DA94996FB17C07BF72898FB4", hash_generated_method = "497E88C736883AE259EC5C859F29E8A2")
    @Override
    public DisconnectCause getDisconnectCause() {
        DisconnectCause varB4EAC82CA7396A68D541C85D26508E83_1875103674 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1875103674 = mCause;
        varB4EAC82CA7396A68D541C85D26508E83_1875103674.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1875103674;
        // ---------- Original Method ----------
        //return mCause;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.717 -0400", hash_original_method = "04AFA3AB4AAFB99A0A1522AC045EFCCB", hash_generated_method = "CC2251B1F2D7B949CA5CE6AAB3C0D01C")
     void setDisconnectCause(DisconnectCause cause) {
        mCause = cause;
        // ---------- Original Method ----------
        //mCause = cause;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.717 -0400", hash_original_method = "4EE87D2E41D94C18F614BA2D1494AD36", hash_generated_method = "AC38C503E1B46D0189ECAC0EF9F8BBB5")
    @Override
    public PostDialState getPostDialState() {
        PostDialState varB4EAC82CA7396A68D541C85D26508E83_1749412056 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1749412056 = postDialState;
        varB4EAC82CA7396A68D541C85D26508E83_1749412056.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1749412056;
        // ---------- Original Method ----------
        //return postDialState;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.718 -0400", hash_original_method = "0751315CA6FC4E16145F947C7FEC6A28", hash_generated_method = "BB3C4E9784C28AF1655F838F726D7EED")
    @Override
    public void proceedAfterWaitChar() {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.718 -0400", hash_original_method = "1CC81519C3754B491F6AACE2E776B1AA", hash_generated_method = "9904AF5CB47E02718508F28B9EA971B1")
    @Override
    public void proceedAfterWildChar(String str) {
        addTaint(str.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.718 -0400", hash_original_method = "A990DB72552DFD3D94264491EEB59CEC", hash_generated_method = "34D7B16591BBD4AA8BCBE387281F2D17")
    @Override
    public void cancelPostDial() {
        // ---------- Original Method ----------
    }

    
    protected abstract Phone getPhone();

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.719 -0400", hash_original_method = "0D579DEEA4ADF8476D536663A83CC650", hash_generated_method = "EB8F3D8EE6600403F1952E516A83251C")
    @Override
    public String getRemainingPostDialString() {
        String varB4EAC82CA7396A68D541C85D26508E83_542737785 = null; //Variable for return #1
        String varB4EAC82CA7396A68D541C85D26508E83_2006770904 = null; //Variable for return #2
        {
            boolean varCBE29C650BD63B7D36FF87F87B8A05C3_1294450669 = (postDialState == PostDialState.CANCELLED
            || postDialState == PostDialState.COMPLETE
            || postDialString == null
            || postDialString.length() <= nextPostDialChar);
            {
                varB4EAC82CA7396A68D541C85D26508E83_542737785 = "";
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_2006770904 = postDialString.substring(nextPostDialChar);
        String varA7E53CE21691AB073D9660D615818899_1595524778; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1595524778 = varB4EAC82CA7396A68D541C85D26508E83_542737785;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1595524778 = varB4EAC82CA7396A68D541C85D26508E83_2006770904;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1595524778.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1595524778;
        // ---------- Original Method ----------
        //if (postDialState == PostDialState.CANCELLED
            //|| postDialState == PostDialState.COMPLETE
            //|| postDialString == null
            //|| postDialString.length() <= nextPostDialChar) {
            //return "";
        //}
        //return postDialString.substring(nextPostDialChar);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.719 -0400", hash_original_method = "780D5AE6347C99C37A99BA1F1D4E1D8E", hash_generated_method = "DA7B580AD573139BAECDC3B4C2D224F0")
    private void log(String msg) {
        Log.d(LOG_TAG, "[SipConn] " + msg);
        addTaint(msg.getTaint());
        // ---------- Original Method ----------
        //Log.d(LOG_TAG, "[SipConn] " + msg);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.719 -0400", hash_original_method = "6B6F8D6F29C0FEAF9C52CC30010D6FE2", hash_generated_method = "1E4965D4AD6EA4E4FD9C4720EE1508B8")
    @Override
    public int getNumberPresentation() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_681467075 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_681467075;
        // ---------- Original Method ----------
        //return Connection.PRESENTATION_ALLOWED;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.720 -0400", hash_original_method = "8B171385F62C7AA97B0882209EC3A206", hash_generated_method = "62FE4C5FA43989F71147478F57D6F36E")
    @Override
    public UUSInfo getUUSInfo() {
        UUSInfo varB4EAC82CA7396A68D541C85D26508E83_525000365 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_525000365 = null;
        varB4EAC82CA7396A68D541C85D26508E83_525000365.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_525000365;
        // ---------- Original Method ----------
        //return null;
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.720 -0400", hash_original_field = "37941D035922D251546A654E3A92595A", hash_generated_field = "77B5E98216F64AFE461D3FD01C0BA152")

    private static String LOG_TAG = "SIP_CONN";
}

