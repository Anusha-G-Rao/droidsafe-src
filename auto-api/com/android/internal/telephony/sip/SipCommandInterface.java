package com.android.internal.telephony.sip;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.android.internal.telephony.BaseCommands;
import com.android.internal.telephony.CommandsInterface;
import com.android.internal.telephony.UUSInfo;
import com.android.internal.telephony.gsm.SmsBroadcastConfigInfo;

class SipCommandInterface extends BaseCommands implements CommandsInterface {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.626 -0400", hash_original_method = "A6511375FC27D28438216697969D84B8", hash_generated_method = "A859198BE8A3007C12546D581D9014DC")
      SipCommandInterface(Context context) {
        super(context);
        addTaint(context.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.626 -0400", hash_original_method = "7892594A38871B784C768CFB911D0AFF", hash_generated_method = "7BB1811FD31D6D6BA74ECE9BAE3A34D3")
    @Override
    public void setOnNITZTime(Handler h, int what, Object obj) {
        addTaint(h.getTaint());
        addTaint(what);
        addTaint(obj.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.632 -0400", hash_original_method = "4FF9B345C0ACD80EE0490BCC729EF93D", hash_generated_method = "F24701863F5458CA56139F025132F419")
    public void getIccCardStatus(Message result) {
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.632 -0400", hash_original_method = "312175F43C21A9CB89FD25F385D47375", hash_generated_method = "A7E19EB5DD8C2D50D6E22FDB15180A69")
    public void supplyIccPin(String pin, Message result) {
        addTaint(pin.getTaint());
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.632 -0400", hash_original_method = "8D2388C3F4BE09E9BCDF564DE7BCBB17", hash_generated_method = "9DC486579AC3B4B5D2310F37BCEDD99B")
    public void supplyIccPuk(String puk, String newPin, Message result) {
        addTaint(puk.getTaint());
        addTaint(newPin.getTaint());
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.633 -0400", hash_original_method = "498621A7956DB667721B9B2B71D65CFE", hash_generated_method = "CB394835C80FA38A97F1D7F3F674FD53")
    public void supplyIccPin2(String pin, Message result) {
        addTaint(pin.getTaint());
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.634 -0400", hash_original_method = "40AAC8CED8D5308D12D2E5CDAF9B6A47", hash_generated_method = "9D0098FA169D998B3E9DE7AFBC1E3A6E")
    public void supplyIccPuk2(String puk, String newPin2, Message result) {
        addTaint(puk.getTaint());
        addTaint(newPin2.getTaint());
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.644 -0400", hash_original_method = "B3FC9EBBB6773F816458111FF8F155DE", hash_generated_method = "733F7835960C5A4F6D94EC616D1F4D03")
    public void changeIccPin(String oldPin, String newPin, Message result) {
        addTaint(oldPin.getTaint());
        addTaint(newPin.getTaint());
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.645 -0400", hash_original_method = "8D51802625738E75E56F41DE488CEBFD", hash_generated_method = "71AC53C6CA8A6D3ED7916A88966F55A1")
    public void changeIccPin2(String oldPin2, String newPin2, Message result) {
        addTaint(oldPin2.getTaint());
        addTaint(newPin2.getTaint());
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.645 -0400", hash_original_method = "FE49297D5F160C632D8EB8B38400EA83", hash_generated_method = "9618D331C77D19152C8E5F1974CFDD93")
    public void changeBarringPassword(String facility, String oldPwd,
            String newPwd, Message result) {
        addTaint(facility.getTaint());
        addTaint(oldPwd.getTaint());
        addTaint(newPwd.getTaint());
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.645 -0400", hash_original_method = "CEDA07561D4A2E174B41C09240087336", hash_generated_method = "9827F76A3970A726C9D2C8E35CCF672A")
    public void supplyNetworkDepersonalization(String netpin, Message result) {
        addTaint(netpin.getTaint());
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.650 -0400", hash_original_method = "0065DCF0A6FA35BBD3B5D6CD7BC5264B", hash_generated_method = "A9FD7129926168194F8C81738F73B523")
    public void getCurrentCalls(Message result) {
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.650 -0400", hash_original_method = "1C2C08D3245326421BB25469D878BC40", hash_generated_method = "65E61C9D84233D07628E18B039C789FC")
    @Deprecated
    public void getPDPContextList(Message result) {
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.669 -0400", hash_original_method = "327D3ACFB77EFA2CD859CBEFD5183E40", hash_generated_method = "6B4B0DFBD4A658CE1D78BA583D8B89B4")
    public void getDataCallList(Message result) {
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.670 -0400", hash_original_method = "DAA1A0C85E21F9D3405F2D9B646EE982", hash_generated_method = "04D07079AE74E5DA6496BD83967F131B")
    public void dial(String address, int clirMode, Message result) {
        addTaint(address.getTaint());
        addTaint(clirMode);
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.671 -0400", hash_original_method = "013CAFE12783E64D183D4781FFBCA18A", hash_generated_method = "39BD0AC744DE4D6EEFEF5A6203215B45")
    public void dial(String address, int clirMode, UUSInfo uusInfo,
            Message result) {
        addTaint(address.getTaint());
        addTaint(clirMode);
        addTaint(uusInfo.getTaint());
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.671 -0400", hash_original_method = "1348EC8F8E592B792A235EF8BDA1A728", hash_generated_method = "1BC3CF6348D02C0F570A871C8BBFFA45")
    public void getIMSI(Message result) {
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.671 -0400", hash_original_method = "9CFFA6883C5B8E59E96AC7EBA98411BF", hash_generated_method = "4A2BAF0F00DC24A2AA69BBF374CCA3DD")
    public void getIMEI(Message result) {
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.671 -0400", hash_original_method = "16825ADE4AEE806A281B5593AC7D63E8", hash_generated_method = "3BB7929D47817BC305092EC99E5B8635")
    public void getIMEISV(Message result) {
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.686 -0400", hash_original_method = "367D9C3523440D236020890B46AD46EA", hash_generated_method = "DCEB5919A88AC013AE792AA7090096D2")
    public void hangupConnection(int gsmIndex, Message result) {
        addTaint(gsmIndex);
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.687 -0400", hash_original_method = "24CF4908E9C6B567B8992DC13D635451", hash_generated_method = "9CF931A7984CF9D3DFD49C044AD9E861")
    public void hangupWaitingOrBackground(Message result) {
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.687 -0400", hash_original_method = "B6BFA6F3A6A105C9D4B6C1E698A66938", hash_generated_method = "EB5FF15763B981051CDE84C45FC37FDD")
    public void hangupForegroundResumeBackground(Message result) {
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.688 -0400", hash_original_method = "E5CA3DEE020231D0A58CD27DCC9A3298", hash_generated_method = "2EB6B5FB9DD529E12232CA700C580183")
    public void switchWaitingOrHoldingAndActive(Message result) {
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.688 -0400", hash_original_method = "1DEC6D6ED7076F247D9C03337753D9B5", hash_generated_method = "00621E9ACCB42DF5B85E6254C9122846")
    public void conference(Message result) {
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.688 -0400", hash_original_method = "F8189B7D9A2D4B100A35E308752559C1", hash_generated_method = "07E1A79AC62B93E8C4A130965C3B27BC")
    public void setPreferredVoicePrivacy(boolean enable, Message result) {
        addTaint(enable);
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.688 -0400", hash_original_method = "7AC939257493C8EDA50728ACBE47AB6E", hash_generated_method = "044CDAD52FE5D5F0B5C779E0CE297612")
    public void getPreferredVoicePrivacy(Message result) {
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.689 -0400", hash_original_method = "0FFF3C40EB3863D408D749356210235C", hash_generated_method = "0AC5A3898A4E73E948F93C9AB82980F4")
    public void separateConnection(int gsmIndex, Message result) {
        addTaint(gsmIndex);
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.689 -0400", hash_original_method = "5D47CDCEE79D220D19ED199AB41576BB", hash_generated_method = "DFE95CFD54ECEF124528CED319D5697E")
    public void acceptCall(Message result) {
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.689 -0400", hash_original_method = "B0370CE1AC140C2D8FD8DDB138D51178", hash_generated_method = "0FE53FDD0041F1BCA7DF741C14DBE141")
    public void rejectCall(Message result) {
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.689 -0400", hash_original_method = "423F7E66395D67C4DDE50E0CD115AB32", hash_generated_method = "FD83E185257D53510C5E0E9D216695F3")
    public void explicitCallTransfer(Message result) {
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.690 -0400", hash_original_method = "452E3A07FEEB48EC41C26B70B19470A7", hash_generated_method = "682C0B022992F413C4D7A22CF5F801C5")
    public void getLastCallFailCause(Message result) {
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.690 -0400", hash_original_method = "866637DA865C177743D4ACCECF2320D1", hash_generated_method = "335BC2681608A5C56412A2FD0E8D2C2F")
    public void getLastPdpFailCause(Message result) {
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.690 -0400", hash_original_method = "5E09CD605032BAD12B5071D1198B480C", hash_generated_method = "5010C1BF40DDE1230AD9415958DAD666")
    public void getLastDataCallFailCause(Message result) {
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.690 -0400", hash_original_method = "47C0EC939F57E1591B76316E27B95AC6", hash_generated_method = "FA0437E13190C37444650206E03E7F19")
    public void setMute(boolean enableMute, Message response) {
        addTaint(enableMute);
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.691 -0400", hash_original_method = "18914EB1B73273C70F170F17B7ABD9F7", hash_generated_method = "61548E4FA53247DA0988874CDE5990B2")
    public void getMute(Message response) {
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.691 -0400", hash_original_method = "2E5F50302D75BF22D071DDE735D84DDB", hash_generated_method = "5BCBB88C39ABDACE5025F557438913AA")
    public void getSignalStrength(Message result) {
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.698 -0400", hash_original_method = "E48AE2BAAEA38C3013B3567C40E7D695", hash_generated_method = "1DD98F561D2F66B1206EACD26CAB0AA4")
    public void getVoiceRegistrationState(Message result) {
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.699 -0400", hash_original_method = "3D40BE498077599AA87C5D11079E9906", hash_generated_method = "53BCA2DDD180EE45B506353788C026C0")
    public void getDataRegistrationState(Message result) {
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.699 -0400", hash_original_method = "0ABE511CA2DC2D12C96958F57DAAD741", hash_generated_method = "27B44CA05C8A23318034154BD171C433")
    public void getOperator(Message result) {
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.700 -0400", hash_original_method = "AD70FA03EB7E7D9139EEB149F6091A1C", hash_generated_method = "66B12EE6203CB4613BD352988FD5EB04")
    public void sendDtmf(char c, Message result) {
        addTaint(c);
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.700 -0400", hash_original_method = "EE6742CCEC46FE0C371CDA35CEE96A7C", hash_generated_method = "19F8C7BEA1468F74D8488B708662AAEB")
    public void startDtmf(char c, Message result) {
        addTaint(c);
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.711 -0400", hash_original_method = "CE80A91715BFB5541CB44AB81DDE6D0F", hash_generated_method = "C6E4F2B30088D852AF2F167D7624A826")
    public void stopDtmf(Message result) {
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.712 -0400", hash_original_method = "9D33455A19E4CDFE7486EF4C6C2B8AAA", hash_generated_method = "4CD29E19227BC3CE9DF28CD6CD7BDC1A")
    public void sendBurstDtmf(String dtmfString, int on, int off,
            Message result) {
        addTaint(dtmfString.getTaint());
        addTaint(on);
        addTaint(off);
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.712 -0400", hash_original_method = "1A6264A9FF23649BF5DB6F7920F9A21A", hash_generated_method = "E7D34CF517AC466E5AF7076DBCA98F96")
    public void sendSMS(String smscPDU, String pdu, Message result) {
        addTaint(smscPDU.getTaint());
        addTaint(pdu.getTaint());
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.712 -0400", hash_original_method = "6EB636270661AC6BE13856E5BA601B13", hash_generated_method = "90EB92BB562079DDD7A8981FDF35B23C")
    public void sendCdmaSms(byte[] pdu, Message result) {
        addTaint(pdu[0]);
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.712 -0400", hash_original_method = "D5DE63795C5344B7C78E8B6314329432", hash_generated_method = "0F11036A47DC4DF370061ACA49BA4BC9")
    public void deleteSmsOnSim(int index, Message response) {
        addTaint(index);
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.713 -0400", hash_original_method = "03C10B95DDA41CA22B6255050F7053EA", hash_generated_method = "6E08EFCF33C800E0039AFE59B87CA8F0")
    public void deleteSmsOnRuim(int index, Message response) {
        addTaint(index);
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.714 -0400", hash_original_method = "E5ECA9ECE683BEAA97AF5287FA4FD73D", hash_generated_method = "1DEB37B8B1032EBE7D4575C978F85B69")
    public void writeSmsToSim(int status, String smsc, String pdu, Message response) {
        addTaint(status);
        addTaint(smsc.getTaint());
        addTaint(pdu.getTaint());
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.725 -0400", hash_original_method = "301EEEF677F35EBA7B87E2EF64620E88", hash_generated_method = "BE66822BFDEC1D5016D6BD5741C1DB02")
    public void writeSmsToRuim(int status, String pdu, Message response) {
        addTaint(status);
        addTaint(pdu.getTaint());
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.725 -0400", hash_original_method = "5419A5B08D65477966DC4B41045B2D43", hash_generated_method = "15D6DD87F857589D5008EE97612B3750")
    public void setupDataCall(String radioTechnology, String profile,
            String apn, String user, String password, String authType,
            String protocol, Message result) {
        addTaint(radioTechnology.getTaint());
        addTaint(profile.getTaint());
        addTaint(apn.getTaint());
        addTaint(user.getTaint());
        addTaint(password.getTaint());
        addTaint(authType.getTaint());
        addTaint(protocol.getTaint());
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.726 -0400", hash_original_method = "F4E5DEF79555248AC6400DB4F70FA346", hash_generated_method = "4C538E227954191E7B0F4E9FC3B6FA56")
    public void deactivateDataCall(int cid, int reason, Message result) {
        addTaint(cid);
        addTaint(reason);
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.726 -0400", hash_original_method = "658BFFD1699DF28E1FC33C876F64D0E2", hash_generated_method = "3D6166B628D59A7DF724E70EDFEC1563")
    public void setRadioPower(boolean on, Message result) {
        addTaint(on);
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.726 -0400", hash_original_method = "34A3D962E1CAE2FDD06754C7CD1F32F3", hash_generated_method = "34CBAAF55AB99FD4CBDC8DCA12750D59")
    public void setSuppServiceNotifications(boolean enable, Message result) {
        addTaint(enable);
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.726 -0400", hash_original_method = "04D2C2576FBA17CACB979DAC278A3D84", hash_generated_method = "13DC954BAFBE646E4C2B3869E23F2AC5")
    public void acknowledgeLastIncomingGsmSms(boolean success, int cause,
            Message result) {
        addTaint(success);
        addTaint(cause);
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.726 -0400", hash_original_method = "BBFEF1AC264FC2EFFBA144FBBD11A68E", hash_generated_method = "D30D0D5FA3EC2222789B76CF8091AB39")
    public void acknowledgeLastIncomingCdmaSms(boolean success, int cause,
            Message result) {
        addTaint(success);
        addTaint(cause);
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.727 -0400", hash_original_method = "281B95F00D12B8C721DC5976D4A537AE", hash_generated_method = "CB88A9C2000A1AF54EAC2277911C687C")
    public void acknowledgeIncomingGsmSmsWithPdu(boolean success, String ackPdu,
            Message result) {
        addTaint(success);
        addTaint(ackPdu.getTaint());
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.727 -0400", hash_original_method = "D56D36D653FFB0D666CDD952E4E3B98E", hash_generated_method = "C58D5FEDCF28A534E68ACFAD928409AF")
    public void iccIO(int command, int fileid, String path, int p1, int p2,
            int p3, String data, String pin2, Message result) {
        addTaint(command);
        addTaint(fileid);
        addTaint(path.getTaint());
        addTaint(p1);
        addTaint(p2);
        addTaint(p3);
        addTaint(data.getTaint());
        addTaint(pin2.getTaint());
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.727 -0400", hash_original_method = "97A78B1A23DB91BDC82BEB1858BCD95E", hash_generated_method = "DEFE694FDA9832A3244B7548A67F8BEA")
    public void getCLIR(Message result) {
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.727 -0400", hash_original_method = "B8D63B72DC65EE3608FC65F298DE2981", hash_generated_method = "A3E260FE3FFBEA6649883432E900D126")
    public void setCLIR(int clirMode, Message result) {
        addTaint(clirMode);
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.738 -0400", hash_original_method = "5B2012150FA92F57F4DA5FBC8874C419", hash_generated_method = "604CBA647BCEF1E9E2C4A721A0857410")
    public void queryCallWaiting(int serviceClass, Message response) {
        addTaint(serviceClass);
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.738 -0400", hash_original_method = "5B610ADF58E8A4CB2911C741C5D1D851", hash_generated_method = "627DF63F3F53798EAECEF66D95D68C46")
    public void setCallWaiting(boolean enable, int serviceClass,
            Message response) {
        addTaint(enable);
        addTaint(serviceClass);
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.739 -0400", hash_original_method = "958A118B1D6DEAAC3F2CD7A0471E8E5A", hash_generated_method = "7A56B99868460FC0089A1CFE78EAEABC")
    public void setNetworkSelectionModeAutomatic(Message response) {
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.739 -0400", hash_original_method = "A699748593EA9CB79EF65A1D8087DE87", hash_generated_method = "49398EB23E8549F5857F40C7084F8B0D")
    public void setNetworkSelectionModeManual(
            String operatorNumeric, Message response) {
        addTaint(operatorNumeric.getTaint());
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.740 -0400", hash_original_method = "37E66FF0A3AEDBEF007D30C9E2FF98CD", hash_generated_method = "CE677D930885CD53D9A4B104247DF930")
    public void getNetworkSelectionMode(Message response) {
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.740 -0400", hash_original_method = "F3D2B6350F8E1C278AFA7ECA9187C8D7", hash_generated_method = "8DE8805B27756ABC38F4FA4C3F7580C2")
    public void getAvailableNetworks(Message response) {
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.756 -0400", hash_original_method = "DA232DDE50E73AC5D636EAD7EF5FC864", hash_generated_method = "F1E5CBB4F96C79ECD304353335F81F33")
    public void setCallForward(int action, int cfReason, int serviceClass,
                String number, int timeSeconds, Message response) {
        addTaint(action);
        addTaint(cfReason);
        addTaint(serviceClass);
        addTaint(number.getTaint());
        addTaint(timeSeconds);
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.756 -0400", hash_original_method = "455A9434E862CC2E0C873DE31EB09A28", hash_generated_method = "C5D3643403949CA1A8FC7A08A89E3E49")
    public void queryCallForwardStatus(int cfReason, int serviceClass,
            String number, Message response) {
        addTaint(cfReason);
        addTaint(serviceClass);
        addTaint(number.getTaint());
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.756 -0400", hash_original_method = "1E5E60364AF2DDDA55FE9584B8EF0B2C", hash_generated_method = "9147641EFFDAF93914A6EABC0CFE6AB9")
    public void queryCLIP(Message response) {
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.757 -0400", hash_original_method = "EE7857BCB5A1D2385833186B6353BDF6", hash_generated_method = "8EF8B502E5543E4FA6B8D0E9B9B758FD")
    public void getBasebandVersion(Message response) {
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.757 -0400", hash_original_method = "A56D965167C62C2F95036EFE39C4CA71", hash_generated_method = "F1F5370A018ED9B1DA1E7F4F962811F6")
    @Override
    public void queryFacilityLock(String facility, String password,
            int serviceClass, Message response) {
        addTaint(facility.getTaint());
        addTaint(password.getTaint());
        addTaint(serviceClass);
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.758 -0400", hash_original_method = "230F3C7CDCF2BDF61799EBE662AE054E", hash_generated_method = "CACECCB542D7CEE0425C32328147A82A")
    @Override
    public void queryFacilityLockForApp(String facility, String password,
            int serviceClass, String appId, Message response) {
        addTaint(facility.getTaint());
        addTaint(password.getTaint());
        addTaint(serviceClass);
        addTaint(appId.getTaint());
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.758 -0400", hash_original_method = "AD3FF097428D5AB19C8EE6C9813E3899", hash_generated_method = "5DAB329B6638CC90F8BA34AA725C1277")
    @Override
    public void setFacilityLock(String facility, boolean lockState,
            String password, int serviceClass, Message response) {
        addTaint(facility.getTaint());
        addTaint(lockState);
        addTaint(password.getTaint());
        addTaint(serviceClass);
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.758 -0400", hash_original_method = "933F2123A615A9A39A40CBF915D35DBF", hash_generated_method = "B5FC8A2EB304AD1541DA34CBDA09BD25")
    @Override
    public void setFacilityLockForApp(String facility, boolean lockState,
            String password, int serviceClass, String appId, Message response) {
        addTaint(facility.getTaint());
        addTaint(lockState);
        addTaint(password.getTaint());
        addTaint(serviceClass);
        addTaint(appId.getTaint());
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.758 -0400", hash_original_method = "F9FFB06D76A77B7B92045DB70103041E", hash_generated_method = "265D468F29BCD7BB50D4B0B0931CD610")
    public void sendUSSD(String ussdString, Message response) {
        addTaint(ussdString.getTaint());
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.759 -0400", hash_original_method = "087B5572C84FB61528C8D96F1C079352", hash_generated_method = "236723AE7FCF2BF8A022AB9F84BA8CF8")
    public void cancelPendingUssd(Message response) {
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.770 -0400", hash_original_method = "B603C96410E7BFF356539653D85D8A4B", hash_generated_method = "48880F5B99EA0990FA58F3834AFA969F")
    public void resetRadio(Message result) {
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.770 -0400", hash_original_method = "304D94F0A203021B29E8BE917AB2A88E", hash_generated_method = "F0021750C2EE5A42CB8782825F7B4850")
    public void invokeOemRilRequestRaw(byte[] data, Message response) {
        addTaint(data[0]);
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.771 -0400", hash_original_method = "5FCB7D9B46CBA85CB2A2479605C5EBE0", hash_generated_method = "E85DC766656C17C99E4133FBA904C9AB")
    public void invokeOemRilRequestStrings(String[] strings, Message response) {
        addTaint(strings[0].getTaint());
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.771 -0400", hash_original_method = "B390B8B053975D6E247D6ADF9DE7B6FC", hash_generated_method = "6EE7B02DB1528C9BBC5AC36B7CF74B52")
    public void setBandMode(int bandMode, Message response) {
        addTaint(bandMode);
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.771 -0400", hash_original_method = "CDBADCA8574456832760B996C8943606", hash_generated_method = "9E905752474D54F07494DE0266882C50")
    public void queryAvailableBandMode(Message response) {
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.772 -0400", hash_original_method = "1B08354C58BC7E4FA9F6A992437EB8EB", hash_generated_method = "CA85BAD8BCAD04E804B2549E0C51C12A")
    public void sendTerminalResponse(String contents, Message response) {
        addTaint(contents.getTaint());
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.772 -0400", hash_original_method = "8510CB1FCB2D71445BC7D7948652F9FF", hash_generated_method = "91FA4D12921EB2362CB71CDBDB95D0B3")
    public void sendEnvelope(String contents, Message response) {
        addTaint(contents.getTaint());
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.772 -0400", hash_original_method = "A584A8270CEEFF3893478A017045D938", hash_generated_method = "15BC17C5C2966ED309C6C0C3DB81315E")
    public void sendEnvelopeWithStatus(String contents, Message response) {
        addTaint(contents.getTaint());
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.772 -0400", hash_original_method = "7D7F347B6C7F161149D5C29633177CD2", hash_generated_method = "49576094E779B922AD566E7A3A6FF07B")
    public void handleCallSetupRequestFromSim(
            boolean accept, Message response) {
        addTaint(accept);
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.772 -0400", hash_original_method = "27AB8573439D5EB2F33C81C73E25E8F8", hash_generated_method = "CE2A62FC8B22A278CA86AC4A1A713D24")
    public void setPreferredNetworkType(int networkType , Message response) {
        addTaint(networkType);
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.773 -0400", hash_original_method = "C86073EB20CA48BDFFC81AAA868A3BB1", hash_generated_method = "1AE3884B7769F676D97B43ED8992EB06")
    public void getPreferredNetworkType(Message response) {
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.777 -0400", hash_original_method = "1E1F359D4473F2441E02E8FE890DEF1C", hash_generated_method = "803A54BA31E9F8CEE7211DF5B414A74F")
    public void getNeighboringCids(Message response) {
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.777 -0400", hash_original_method = "8F4AD1B328B83D997278B06A4EE5820C", hash_generated_method = "2EBA5FF7F590C12619E712022852C55D")
    public void setLocationUpdates(boolean enable, Message response) {
        addTaint(enable);
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.777 -0400", hash_original_method = "341ECD479C88F08657B8FDC222C9F79A", hash_generated_method = "E69DF1715AEE0C76AF6DD5DA6BDA2970")
    public void getSmscAddress(Message result) {
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.778 -0400", hash_original_method = "7097F8C49B12B71CDD20291B3AB7964A", hash_generated_method = "32EF624D1A5E5698190E4D9B29E7C070")
    public void setSmscAddress(String address, Message result) {
        addTaint(address.getTaint());
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.778 -0400", hash_original_method = "BC0B755F5F01D800040615DED3BCDBA0", hash_generated_method = "FCFF45C82AE32C83E1E17FDBCA6B3C34")
    public void reportSmsMemoryStatus(boolean available, Message result) {
        addTaint(available);
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.779 -0400", hash_original_method = "F7AB9C173D1A57BFEBFB44A47237DF7D", hash_generated_method = "9B2A5E8BC9430E71FAC3D943F3EDA078")
    public void reportStkServiceIsRunning(Message result) {
        addTaint(result.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.796 -0400", hash_original_method = "9CF99F7F300A93DDBFE74502145A8475", hash_generated_method = "673B73A3BBF3B5793688DE676C55629D")
    @Override
    public void getCdmaSubscriptionSource(Message response) {
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.797 -0400", hash_original_method = "4329D3CD35E915BD99C5B818B449ACA1", hash_generated_method = "0F983DDFECA339A2571F58256E842EC7")
    public void getGsmBroadcastConfig(Message response) {
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.797 -0400", hash_original_method = "BEC32E28BD6A6EC85956F36B9D44924D", hash_generated_method = "CCE6EDDD9797C9D5B693C28D767C0D86")
    public void setGsmBroadcastConfig(SmsBroadcastConfigInfo[] config, Message response) {
        addTaint(config[0].getTaint());
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.797 -0400", hash_original_method = "2F3C945F2B405B443912668B2367D904", hash_generated_method = "2B2E3A4BAB6D4B70D36E70D48334038D")
    public void setGsmBroadcastActivation(boolean activate, Message response) {
        addTaint(activate);
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.797 -0400", hash_original_method = "BB255671D9D9AE82C00FD12FF12E7590", hash_generated_method = "DB24117E6DE10F13EFAC1A8522F70166")
    public void getDeviceIdentity(Message response) {
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.797 -0400", hash_original_method = "A28D6B43032903DAFA850C3B9E02D39E", hash_generated_method = "F4357765C51371751C336814DDF5280D")
    public void getCDMASubscription(Message response) {
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.797 -0400", hash_original_method = "6A64EDF04D6CCF6DA11C17A9004CF963", hash_generated_method = "A6502C086B19911110474955EBB8B371")
    public void setPhoneType(int phoneType) {
        addTaint(phoneType);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.798 -0400", hash_original_method = "A9CEBF170D0F656D33BCE6259BBB358F", hash_generated_method = "23F0FDDC3F629DFEEBDB3B08BA87060C")
    public void queryCdmaRoamingPreference(Message response) {
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.798 -0400", hash_original_method = "A524FD7F96F7FB62BB4ABD4057A9354C", hash_generated_method = "328242EBF9747C3B599D54374BCE75C3")
    public void setCdmaRoamingPreference(int cdmaRoamingType, Message response) {
        addTaint(cdmaRoamingType);
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.798 -0400", hash_original_method = "87C7978CD92754BB7623428AEFA60479", hash_generated_method = "A58F631A94B0D0B9AF3132905243BACF")
    public void setCdmaSubscriptionSource(int cdmaSubscription , Message response) {
        addTaint(cdmaSubscription);
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.798 -0400", hash_original_method = "DC6F83E2EE7B0408161F523478208FCE", hash_generated_method = "E756AE3736151DA11240B89608D0CA53")
    public void queryTTYMode(Message response) {
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.799 -0400", hash_original_method = "44348CEECDEE74EEC687675A834A99DA", hash_generated_method = "41B4652A6DB615EBD75D8FB2A70A291F")
    public void setTTYMode(int ttyMode, Message response) {
        addTaint(ttyMode);
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.799 -0400", hash_original_method = "D826071ECAAC08358EF9CEAACAFF0A2A", hash_generated_method = "A17405DC532345D5439D70E3180AE6F4")
    public void sendCDMAFeatureCode(String FeatureCode, Message response) {
        addTaint(FeatureCode.getTaint());
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.799 -0400", hash_original_method = "DCBE6B932ED9844344E5753E79DB999C", hash_generated_method = "58AC89E2B35F1C53FBB37DBB95FBFBCF")
    public void getCdmaBroadcastConfig(Message response) {
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.799 -0400", hash_original_method = "86E74F47BAC216027EBD89BDEFC4A2E0", hash_generated_method = "477F1C3E318388DDF32CCB4C58B9128E")
    public void setCdmaBroadcastConfig(int[] configValuesArray, Message response) {
        addTaint(configValuesArray[0]);
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.799 -0400", hash_original_method = "02EE3B357DCB6CF5847DAE1F69A62BD8", hash_generated_method = "A290CDC5A4E8EBE35496CB200CD62B2E")
    public void setCdmaBroadcastActivation(boolean activate, Message response) {
        addTaint(activate);
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.800 -0400", hash_original_method = "B73B7043BB86BD20367E2BA4C1F7579D", hash_generated_method = "F59E0E4F5F3C654DF2D57C3B4CF2BC39")
    public void exitEmergencyCallbackMode(Message response) {
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.808 -0400", hash_original_method = "A7B720D7AAE639C9AA81ACDD2FD07958", hash_generated_method = "58254258281098E0B76CE5A2BEDC9F5D")
    @Override
    public void supplyIccPinForApp(String pin, String aid, Message response) {
        addTaint(pin.getTaint());
        addTaint(aid.getTaint());
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.808 -0400", hash_original_method = "85052B085E211221DC52D076F63CDE51", hash_generated_method = "999D110A011D688B6CEC5F45B8E942E1")
    @Override
    public void supplyIccPukForApp(String puk, String newPin, String aid, Message response) {
        addTaint(puk.getTaint());
        addTaint(newPin.getTaint());
        addTaint(aid.getTaint());
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.808 -0400", hash_original_method = "4EA9B69CB4BB92F6CBD1A973DB39784D", hash_generated_method = "988CC51D567424766E7E57E6E8503158")
    @Override
    public void supplyIccPin2ForApp(String pin2, String aid, Message response) {
        addTaint(pin2.getTaint());
        addTaint(aid.getTaint());
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.808 -0400", hash_original_method = "FF125CC3CEA22589265ADC8CAED2B3CC", hash_generated_method = "C77CA366A5D68CEE4E37A830E1DBCC5B")
    @Override
    public void supplyIccPuk2ForApp(String puk2, String newPin2, String aid, Message response) {
        addTaint(puk2.getTaint());
        addTaint(newPin2.getTaint());
        addTaint(aid.getTaint());
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.809 -0400", hash_original_method = "A51A50ABC77958852F41695682CE2620", hash_generated_method = "41A84131B1F5FF8922D14CBE4560760C")
    @Override
    public void changeIccPinForApp(String oldPin, String newPin, String aidPtr, Message response) {
        addTaint(oldPin.getTaint());
        addTaint(newPin.getTaint());
        addTaint(aidPtr.getTaint());
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.809 -0400", hash_original_method = "39AB2DAFFDF72A29B22CB665239943F5", hash_generated_method = "98D48BA06FFBBB3C35D9BCF2FD287D5F")
    @Override
    public void changeIccPin2ForApp(String oldPin2, String newPin2, String aidPtr,
            Message response) {
        addTaint(oldPin2.getTaint());
        addTaint(newPin2.getTaint());
        addTaint(aidPtr.getTaint());
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:23.809 -0400", hash_original_method = "417EB29332801A205E6BDDA18E3F8488", hash_generated_method = "E011601C29B612C3C3ACD369E8154EE1")
    public void requestIsimAuthentication(String nonce, Message response) {
        addTaint(nonce.getTaint());
        addTaint(response.getTaint());
        // ---------- Original Method ----------
    }

    
}

