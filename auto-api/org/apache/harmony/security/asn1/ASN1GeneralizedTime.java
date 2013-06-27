package org.apache.harmony.security.asn1;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.IOException;
import java.nio.charset.Charsets;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public final class ASN1GeneralizedTime extends ASN1Time {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:09.315 -0400", hash_original_method = "BB0F4D8A317B403CA2CD2FD0C74F8C92", hash_generated_method = "AB7ED863FCD9D63D36CDA59E2988CC10")
    public  ASN1GeneralizedTime() {
        super(TAG_GENERALIZEDTIME);
        // ---------- Original Method ----------
    }

    
        public static ASN1GeneralizedTime getInstance() {
        return ASN1;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:09.317 -0400", hash_original_method = "9601D88CE03A72C3505152153428ACD0", hash_generated_method = "9EEB37C4B9C89B67834408D77B222C7B")
    public Object decode(BerInputStream in) throws IOException {
        Object varB4EAC82CA7396A68D541C85D26508E83_353284365 = null; //Variable for return #1
        Object varB4EAC82CA7396A68D541C85D26508E83_1076300982 = null; //Variable for return #2
        in.readGeneralizedTime();
        {
            varB4EAC82CA7396A68D541C85D26508E83_353284365 = null;
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1076300982 = getDecodedObject(in);
        addTaint(in.getTaint());
        Object varA7E53CE21691AB073D9660D615818899_1194224463; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1194224463 = varB4EAC82CA7396A68D541C85D26508E83_353284365;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1194224463 = varB4EAC82CA7396A68D541C85D26508E83_1076300982;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1194224463.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1194224463;
        // ---------- Original Method ----------
        //in.readGeneralizedTime();
        //if (in.isVerify) {
            //return null;
        //}
        //return getDecodedObject(in);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:09.321 -0400", hash_original_method = "815E5B13588CE775C73F05D1D7B36D43", hash_generated_method = "07EA86AD64B9979A045C94D243E60921")
    public void encodeContent(BerOutputStream out) {
        out.encodeGeneralizedTime();
        addTaint(out.getTaint());
        // ---------- Original Method ----------
        //out.encodeGeneralizedTime();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:09.331 -0400", hash_original_method = "D33B8806BE3331999BE0A247A6FB02E4", hash_generated_method = "4EC2DC0C34ACEA801D03D538B882CDBD")
    public void setEncodingContent(BerOutputStream out) {
        SimpleDateFormat sdf;
        sdf = new SimpleDateFormat(GEN_PATTERN);
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        String temp;
        temp = sdf.format(out.content);
        int nullId;
        int currLength;
        {
            boolean varEA3B2EF7AD4FD6854C0460808E435C91_1897884031 = (((nullId = temp.lastIndexOf('0', currLength = temp.length() - 1)) != -1)
                & (nullId == currLength));
            {
                temp = temp.substring(0, nullId);
            } //End block
        } //End collapsed parenthetic
        {
            boolean var20645FD268BF4909ADE246C840DD0211_2052211422 = (temp.charAt(currLength) == '.');
            {
                temp = temp.substring(0, currLength);
            } //End block
        } //End collapsed parenthetic
        out.content = (temp + "Z").getBytes(Charsets.UTF_8);
        out.length = ((byte[]) out.content).length;
        addTaint(out.getTaint());
        // ---------- Original Method ----------
        //SimpleDateFormat sdf = new SimpleDateFormat(GEN_PATTERN);
        //sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        //String temp = sdf.format(out.content);
        //int nullId;
        //int currLength;
        //while (((nullId = temp.lastIndexOf('0', currLength = temp.length() - 1)) != -1)
                //& (nullId == currLength)) {
            //temp = temp.substring(0, nullId);
        //}
        //if (temp.charAt(currLength) == '.') {
            //temp = temp.substring(0, currLength);
        //}
        //out.content = (temp + "Z").getBytes(Charsets.UTF_8);
        //out.length = ((byte[]) out.content).length;
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:09.334 -0400", hash_original_field = "0F3C7EF5E3C60EA92CED4C3504F2779F", hash_generated_field = "0317DDBCCACD6D2749CC233A09964625")

    private static ASN1GeneralizedTime ASN1 = new ASN1GeneralizedTime();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:09.334 -0400", hash_original_field = "A2534DA841AAEDBC550D45A7FE68CB06", hash_generated_field = "77324DAA54B6679F0F29168F97E1497F")

    private static String GEN_PATTERN = "yyyyMMddHHmmss.SSS";
}

