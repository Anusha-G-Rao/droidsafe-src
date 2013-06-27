package com.android.internal.telephony;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.NetworkUtils;
import android.net.RouteInfo;
import android.os.SystemProperties;
import android.util.Log;
import com.android.internal.telephony.DataConnection.FailCause;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class DataCallState {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:15.061 -0400", hash_original_field = "A4622F7F72162611C8E075EE443BC26E", hash_generated_field = "E166BB3BF23871AD1CCDADD57F5267C8")

    private boolean DBG = true;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:15.061 -0400", hash_original_field = "41EBE7F32B96C1E2E9C209710486A443", hash_generated_field = "49CAE155C18469286958144249A8F7C8")

    private String LOG_TAG = "GSM";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:15.061 -0400", hash_original_field = "E4D9C90D170874FA2D2EEBFCE87692A7", hash_generated_field = "86EB4D9378DBDAFCDCF6A04185238499")

    public int version = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:15.061 -0400", hash_original_field = "11AA1CC800DDD43A042F03964DDE0860", hash_generated_field = "37B5BCF0BCD2F93BD4AA15407BF7DBA3")

    public int status = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:15.061 -0400", hash_original_field = "6B5C7A4B82D4D944889929EC20A02521", hash_generated_field = "2EF50DAD06B60CB00722667F904C5E27")

    public int cid = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:15.061 -0400", hash_original_field = "C4E9AD029D5B7FF6E6731F011ECA16D4", hash_generated_field = "BAA831B1264A2BC6C645E9888B97BBF7")

    public int active = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:15.061 -0400", hash_original_field = "B9E65EA3442DC1B079E97EFC2DFD99B8", hash_generated_field = "4E81F998F44759442ED704F68E8E7FD7")

    public String type = "";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:15.061 -0400", hash_original_field = "97C8B8D2CD6624719AF310BF49270E44", hash_generated_field = "B60C656CC37E056A85BB8FC04F122945")

    public String ifname = "";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:15.061 -0400", hash_original_field = "3A84D7E6072758A29E00FB6FF211A091", hash_generated_field = "0AE759B139BF13E410E57C78040C38A1")

    public String [] addresses = new String[0];
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:15.061 -0400", hash_original_field = "A960F775C1514D7112543863175FD6E2", hash_generated_field = "A868FF3FEC6A925E9D99748B84CDB989")

    public String [] dnses = new String[0];
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:15.061 -0400", hash_original_field = "E216C57D2AB1239A85729B5EBD119238", hash_generated_field = "B011EEECDCFB601B72F42A2830075BBE")

    public String[] gateways = new String[0];
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:15.061 -0400", hash_original_field = "DE88CB31022A76252599F1E5500A1C92", hash_generated_field = "7052EC282782F5FC34BAEDB134C88C47")

    public int suggestedRetryTime = -1;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:15.061 -0400", hash_original_method = "F9C84E8FBBA5D2B599538814C0144DA0", hash_generated_method = "F9C84E8FBBA5D2B599538814C0144DA0")
    public DataCallState ()
    {
        //Synthesized constructor
    }


    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:15.155 -0400", hash_original_method = "CAAE2D86A06B83EE392B769B8D61B847", hash_generated_method = "D19FF935C4AB4A2D934CCAB8600D9C45")
    @Override
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_1792843700 = null; //Variable for return #1
        StringBuffer sb;
        sb = new StringBuffer();
        sb.append("DataCallState: {")
           .append("version=").append(version)
           .append(" status=").append(status)
           .append(" retry=").append(suggestedRetryTime)
           .append(" cid=").append(cid)
           .append(" active=").append(active)
           .append(" type=").append(type)
           .append("' ifname='").append(ifname);
        sb.append("' addresses=[");
        {
            String addr = addresses[0];
            {
                sb.append(addr);
                sb.append(",");
            } //End block
        } //End collapsed parenthetic
        sb.deleteCharAt(sb.length()-1);
        sb.append("] dnses=[");
        {
            String addr = dnses[0];
            {
                sb.append(addr);
                sb.append(",");
            } //End block
        } //End collapsed parenthetic
        sb.deleteCharAt(sb.length()-1);
        sb.append("] gateways=[");
        {
            String addr = gateways[0];
            {
                sb.append(addr);
                sb.append(",");
            } //End block
        } //End collapsed parenthetic
        sb.deleteCharAt(sb.length()-1);
        sb.append("]}");
        varB4EAC82CA7396A68D541C85D26508E83_1792843700 = sb.toString();
        varB4EAC82CA7396A68D541C85D26508E83_1792843700.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1792843700;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:15.700 -0400", hash_original_method = "D215C550B13153D48FB1E7191C982EAA", hash_generated_method = "A29AB79060491559492C1B2BF3CAAE86")
    public SetupResult setLinkProperties(LinkProperties linkProperties,
            boolean okToUseSystemPropertyDns) {
        SetupResult varB4EAC82CA7396A68D541C85D26508E83_1428395291 = null; //Variable for return #1
        SetupResult result;
        linkProperties = new LinkProperties();
        linkProperties.clear();
        {
            boolean var898CA1FDE6CCA787B9A326BE718BB330_135853275 = (status == FailCause.NONE.getErrorCode());
            {
                String propertyPrefix;
                propertyPrefix = "net." + ifname + ".";
                try 
                {
                    linkProperties.setInterfaceName(ifname);
                    {
                        {
                            String addr = addresses[0];
                            {
                                addr = addr.trim();
                                {
                                    boolean var688A9E0C1A4BB39755E53EFB97CC9DC9_1882370016 = (addr.isEmpty());
                                } //End collapsed parenthetic
                                LinkAddress la;
                                int addrPrefixLen;
                                String [] ap;
                                ap = addr.split("/");
                                {
                                    addr = ap[0];
                                    addrPrefixLen = Integer.parseInt(ap[1]);
                                } //End block
                                {
                                    addrPrefixLen = 0;
                                } //End block
                                InetAddress ia;
                                try 
                                {
                                    ia = NetworkUtils.numericToInetAddress(addr);
                                } //End block
                                catch (IllegalArgumentException e)
                                {
                                    if (DroidSafeAndroidRuntime.control) throw new UnknownHostException("Non-numeric ip addr=" + addr);
                                } //End block
                                {
                                    boolean var4018297529DD3FE6783E85542C17AE62_735997195 = (! ia.isAnyLocalAddress());
                                    {
                                        {
                                            addrPrefixLen = (ia instanceof Inet4Address) ? 32 : 128;
                                        } //End block
                                        Log.d(LOG_TAG, "addr/pl=" + addr + "/" + addrPrefixLen);
                                        la = new LinkAddress(ia, addrPrefixLen);
                                        linkProperties.addLinkAddress(la);
                                    } //End block
                                } //End collapsed parenthetic
                            } //End block
                        } //End collapsed parenthetic
                    } //End block
                    {
                        if (DroidSafeAndroidRuntime.control) throw new UnknownHostException("no address for ifname=" + ifname);
                    } //End block
                    {
                        {
                            String addr = dnses[0];
                            {
                                addr = addr.trim();
                                {
                                    boolean var688A9E0C1A4BB39755E53EFB97CC9DC9_1031746545 = (addr.isEmpty());
                                } //End collapsed parenthetic
                                InetAddress ia;
                                try 
                                {
                                    ia = NetworkUtils.numericToInetAddress(addr);
                                } //End block
                                catch (IllegalArgumentException e)
                                {
                                    if (DroidSafeAndroidRuntime.control) throw new UnknownHostException("Non-numeric dns addr=" + addr);
                                } //End block
                                {
                                    boolean var4018297529DD3FE6783E85542C17AE62_623572815 = (! ia.isAnyLocalAddress());
                                    {
                                        linkProperties.addDns(ia);
                                    } //End block
                                } //End collapsed parenthetic
                            } //End block
                        } //End collapsed parenthetic
                    } //End block
                    {
                        String dnsServers[];
                        dnsServers = new String[2];
                        dnsServers[0] = SystemProperties.get(propertyPrefix + "dns1");
                        dnsServers[1] = SystemProperties.get(propertyPrefix + "dns2");
                        {
                            String dnsAddr = dnsServers[0];
                            {
                                dnsAddr = dnsAddr.trim();
                                {
                                    boolean varF1D7FD925482BB87366DB21E20C41D3D_1259068376 = (dnsAddr.isEmpty());
                                } //End collapsed parenthetic
                                InetAddress ia;
                                try 
                                {
                                    ia = NetworkUtils.numericToInetAddress(dnsAddr);
                                } //End block
                                catch (IllegalArgumentException e)
                                {
                                    if (DroidSafeAndroidRuntime.control) throw new UnknownHostException("Non-numeric dns addr=" + dnsAddr);
                                } //End block
                                {
                                    boolean var4018297529DD3FE6783E85542C17AE62_942918414 = (! ia.isAnyLocalAddress());
                                    {
                                        linkProperties.addDns(ia);
                                    } //End block
                                } //End collapsed parenthetic
                            } //End block
                        } //End collapsed parenthetic
                    } //End block
                    {
                        if (DroidSafeAndroidRuntime.control) throw new UnknownHostException("Empty dns response and no system default dns");
                    } //End block
                    {
                        String sysGateways;
                        sysGateways = SystemProperties.get(propertyPrefix + "gw");
                        {
                            gateways = sysGateways.split(" ");
                        } //End block
                        {
                            gateways = new String[0];
                        } //End block
                    } //End block
                    {
                        String addr = gateways[0];
                        {
                            addr = addr.trim();
                            {
                                boolean var79C1ADCD7F5287CC7E8E94A297E2BE8F_313539135 = (addr.isEmpty());
                            } //End collapsed parenthetic
                            InetAddress ia;
                            try 
                            {
                                ia = NetworkUtils.numericToInetAddress(addr);
                            } //End block
                            catch (IllegalArgumentException e)
                            {
                                if (DroidSafeAndroidRuntime.control) throw new UnknownHostException("Non-numeric gateway addr=" + addr);
                            } //End block
                            {
                                boolean varBB1F85E17F84871B2D79DF63B70EB29F_423731494 = (! ia.isAnyLocalAddress());
                                {
                                    linkProperties.addRoute(new RouteInfo(ia));
                                } //End block
                            } //End collapsed parenthetic
                        } //End block
                    } //End collapsed parenthetic
                    result = SetupResult.SUCCESS;
                } //End block
                catch (UnknownHostException e)
                {
                    Log.d(LOG_TAG, "setLinkProperties: UnknownHostException " + e);
                    e.printStackTrace();
                    result = SetupResult.ERR_UnacceptableParameter;
                } //End block
            } //End block
            {
                {
                    result = SetupResult.ERR_GetLastErrorFromRil;
                } //End block
                {
                    result = SetupResult.ERR_RilError;
                } //End block
            } //End block
        } //End collapsed parenthetic
        {
            {
                Log.d(LOG_TAG, "setLinkProperties: error clearing LinkProperties " +
                        "status=" + status + " result=" + result);
            } //End block
            linkProperties.clear();
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1428395291 = result;
        addTaint(linkProperties.getTaint());
        addTaint(okToUseSystemPropertyDns);
        varB4EAC82CA7396A68D541C85D26508E83_1428395291.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1428395291;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    public enum SetupResult {
        SUCCESS,
        ERR_BadCommand,
        ERR_UnacceptableParameter,
        ERR_GetLastErrorFromRil,
        ERR_Stale,
        ERR_RilError;
        public FailCause mFailCause;
        SetupResult() {
            mFailCause = FailCause.fromInt(0);
        }
        @Override
        public String toString() {
            return name() + "  SetupResult.mFailCause=" + mFailCause;
        }
    }

    
}

