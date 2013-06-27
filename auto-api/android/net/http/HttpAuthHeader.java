package android.net.http;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;

public class HttpAuthHeader {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:22.907 -0400", hash_original_field = "51CA147512905722A26C3D219A583C78", hash_generated_field = "E6BEC331CEEA80F82B83B12255B86465")

    private int mScheme;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:22.907 -0400", hash_original_field = "152C8B4B0CCFD745368735E28EBFFA00", hash_generated_field = "F1E8A28CAB6C00E7A6B325F09B3FED3E")

    private boolean mStale;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:22.907 -0400", hash_original_field = "D6C54CCF8E100F0747350A2B2CAC95FD", hash_generated_field = "5A777CBABA6AAC673CE6F5CC9C524A3C")

    private String mRealm;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:22.907 -0400", hash_original_field = "63EA1DF1089A1758FF90C84142C0B973", hash_generated_field = "2EDF64CB0EA09AFD7AB8BCF896D658BC")

    private String mNonce;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:22.907 -0400", hash_original_field = "D57F412B2FBE34E5266AB85A3EC09555", hash_generated_field = "23C76B623A92D22536ACABC3A6FBC3E5")

    private String mOpaque;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:22.907 -0400", hash_original_field = "669AC09116EDE1210AE984751680B609", hash_generated_field = "39F05D5CDDC8244A3C6F7C97D22D161B")

    private String mQop;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:22.907 -0400", hash_original_field = "F6E257862B80390CD13E2E0129E87947", hash_generated_field = "956ACE7C8B70403F27CAFAD0405E65A1")

    private String mAlgorithm;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:22.907 -0400", hash_original_field = "DE5F3ADAFBA0C6CBA55780675ACC563E", hash_generated_field = "17B726A8F381AA988EF07CFC9F1FA12A")

    private boolean mIsProxy;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:22.907 -0400", hash_original_field = "2FB3EB7CD104D0E14FE0487884A12591", hash_generated_field = "50564F75BBDED0F5A11BFE739FB8373A")

    private String mUsername;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:22.908 -0400", hash_original_field = "5C6B7EE711155A7472DA571800057A96", hash_generated_field = "44A1332F4D6AD461D600A43252892695")

    private String mPassword;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:22.908 -0400", hash_original_method = "1FD1D3A9087ED95F87943CC7E812BAFE", hash_generated_method = "CE896D69A4909608CB69BB7C189C9898")
    public  HttpAuthHeader(String header) {
        {
            parseHeader(header);
        } //End block
        addTaint(header.getTaint());
        // ---------- Original Method ----------
        //if (header != null) {
            //parseHeader(header);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:22.909 -0400", hash_original_method = "E3B47ECF178F55BDD1E428FED9536544", hash_generated_method = "303787B1F94F60898AF3199D5A725648")
    public boolean isProxy() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_317224830 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_317224830;
        // ---------- Original Method ----------
        //return mIsProxy;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:22.924 -0400", hash_original_method = "F484596B8E11A4861D504E7FDD37DA10", hash_generated_method = "DD3E3DD04D17DDB30604953E8A9252B1")
    public void setProxy() {
        mIsProxy = true;
        // ---------- Original Method ----------
        //mIsProxy = true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:22.925 -0400", hash_original_method = "DC420B5834A563247800515BC4094ADD", hash_generated_method = "69EF1E75E7310645844F445D08BA6D1A")
    public String getUsername() {
        String varB4EAC82CA7396A68D541C85D26508E83_1419652781 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1419652781 = mUsername;
        varB4EAC82CA7396A68D541C85D26508E83_1419652781.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1419652781;
        // ---------- Original Method ----------
        //return mUsername;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:22.925 -0400", hash_original_method = "0E33D9E279BEDC5DAB4D3AD6DE953552", hash_generated_method = "3955AB7BA77A651158545815C33BA20C")
    public void setUsername(String username) {
        mUsername = username;
        // ---------- Original Method ----------
        //mUsername = username;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:22.926 -0400", hash_original_method = "352B20CA8286B4BCFAD735A80A162186", hash_generated_method = "CD58A34DE2FEA867DB1A960102937735")
    public String getPassword() {
        String varB4EAC82CA7396A68D541C85D26508E83_654039301 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_654039301 = mPassword;
        varB4EAC82CA7396A68D541C85D26508E83_654039301.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_654039301;
        // ---------- Original Method ----------
        //return mPassword;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:22.927 -0400", hash_original_method = "5BECAD2A732AB83E1664BF3A6C903529", hash_generated_method = "0844A0EC752FFDF12DBAC561F066925A")
    public void setPassword(String password) {
        mPassword = password;
        // ---------- Original Method ----------
        //mPassword = password;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:22.930 -0400", hash_original_method = "C2242C4025DD65A560A889E41F117AB7", hash_generated_method = "995D7028943FE935A1574822501AB382")
    public boolean isBasic() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_231659243 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_231659243;
        // ---------- Original Method ----------
        //return mScheme == BASIC;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:22.931 -0400", hash_original_method = "C6AFC1E0D0B142E9C4DE27602A4BC054", hash_generated_method = "FD365DE512770966E45659B8586EF334")
    public boolean isDigest() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_263182269 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_263182269;
        // ---------- Original Method ----------
        //return mScheme == DIGEST;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:22.932 -0400", hash_original_method = "29E6CF58C110B66305B7C71C00259314", hash_generated_method = "0A0C49631515C5C5F14A88C3A53378E7")
    public int getScheme() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1792594276 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1792594276;
        // ---------- Original Method ----------
        //return mScheme;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:22.950 -0400", hash_original_method = "3E3CDB0E616B9E56522984F92CB979FB", hash_generated_method = "ACA44B763723DE2242393D95B8A46F90")
    public boolean getStale() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_350592659 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_350592659;
        // ---------- Original Method ----------
        //return mStale;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:22.950 -0400", hash_original_method = "E61C0128BAAE9B474452BFCEF0497CDD", hash_generated_method = "9D111502BF23B87C3282389D6053410F")
    public String getRealm() {
        String varB4EAC82CA7396A68D541C85D26508E83_336933527 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_336933527 = mRealm;
        varB4EAC82CA7396A68D541C85D26508E83_336933527.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_336933527;
        // ---------- Original Method ----------
        //return mRealm;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:22.951 -0400", hash_original_method = "B08110B485A4DA24A232A0CC9BEA47F4", hash_generated_method = "3700FCC3B9708472B92A9572EA7F61C2")
    public String getNonce() {
        String varB4EAC82CA7396A68D541C85D26508E83_337453223 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_337453223 = mNonce;
        varB4EAC82CA7396A68D541C85D26508E83_337453223.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_337453223;
        // ---------- Original Method ----------
        //return mNonce;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:22.965 -0400", hash_original_method = "40DED5E91C6F5AFDC12D505952D89AC1", hash_generated_method = "CC9A097984B60C8CEEE7A1951F34696B")
    public String getOpaque() {
        String varB4EAC82CA7396A68D541C85D26508E83_260413805 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_260413805 = mOpaque;
        varB4EAC82CA7396A68D541C85D26508E83_260413805.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_260413805;
        // ---------- Original Method ----------
        //return mOpaque;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:22.967 -0400", hash_original_method = "7F9926D57780B6A835584FF0B4884044", hash_generated_method = "A2078AA1A349D49A91D5CB0D92B0CB01")
    public String getQop() {
        String varB4EAC82CA7396A68D541C85D26508E83_1369423951 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1369423951 = mQop;
        varB4EAC82CA7396A68D541C85D26508E83_1369423951.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1369423951;
        // ---------- Original Method ----------
        //return mQop;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:22.968 -0400", hash_original_method = "0FF39221585FBFD96D2157CC36F75665", hash_generated_method = "61A871843294243D5B52C688B4570403")
    public String getAlgorithm() {
        String varB4EAC82CA7396A68D541C85D26508E83_174241019 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_174241019 = mAlgorithm;
        varB4EAC82CA7396A68D541C85D26508E83_174241019.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_174241019;
        // ---------- Original Method ----------
        //return mAlgorithm;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:22.972 -0400", hash_original_method = "1B2B63EC3C55FEF6363AE03FA64546E8", hash_generated_method = "F507E7B1072FF4D10B30FCC646AB53B8")
    public boolean isSupportedScheme() {
        {
            {
                {
                    boolean var74F77E97056CDC845905F625FD4FAE6E_1261628506 = (mAlgorithm.equals("md5") &&
                        (mQop == null || mQop.equals("auth")));
                } //End block
            } //End block
        } //End block
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1239350615 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1239350615;
        // ---------- Original Method ----------
        //if (mRealm != null) {
            //if (mScheme == BASIC) {
                //return true;
            //} else {
                //if (mScheme == DIGEST) {
                    //return
                        //mAlgorithm.equals("md5") &&
                        //(mQop == null || mQop.equals("auth"));
                //}
            //}
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:22.982 -0400", hash_original_method = "5A9C556851102A9977303C7DFC694964", hash_generated_method = "CC42302048170C85D1E7180C2D74FE80")
    private void parseHeader(String header) {
        {
            HttpLog.v("HttpAuthHeader.parseHeader(): header: " + header);
        } //End block
        {
            String parameters;
            parameters = parseScheme(header);
            {
                {
                    parseParameters(parameters);
                } //End block
            } //End block
        } //End block
        addTaint(header.getTaint());
        // ---------- Original Method ----------
        //if (HttpLog.LOGV) {
            //HttpLog.v("HttpAuthHeader.parseHeader(): header: " + header);
        //}
        //if (header != null) {
            //String parameters = parseScheme(header);
            //if (parameters != null) {
                //if (mScheme != UNKNOWN) {
                    //parseParameters(parameters);
                //}
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:23.004 -0400", hash_original_method = "BA2F0752C4374C507095962D429C28E1", hash_generated_method = "2E13CD0B8E8982B6FFCAD520599F54F5")
    private String parseScheme(String header) {
        String varB4EAC82CA7396A68D541C85D26508E83_602567176 = null; //Variable for return #1
        String varB4EAC82CA7396A68D541C85D26508E83_914551160 = null; //Variable for return #2
        {
            int i;
            i = header.indexOf(' ');
            {
                String scheme;
                scheme = header.substring(0, i).trim();
                {
                    boolean var3F3171EEAA43F511CD6F1C3DB88CF340_1976600541 = (scheme.equalsIgnoreCase(DIGEST_TOKEN));
                    {
                        mScheme = DIGEST;
                        mAlgorithm = "md5";
                    } //End block
                    {
                        {
                            boolean var16CB325F43B7CEA678BFF5231E7CFB88_1847644755 = (scheme.equalsIgnoreCase(BASIC_TOKEN));
                            {
                                mScheme = BASIC;
                            } //End block
                        } //End collapsed parenthetic
                    } //End block
                } //End collapsed parenthetic
                varB4EAC82CA7396A68D541C85D26508E83_602567176 = header.substring(i + 1);
            } //End block
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_914551160 = null;
        addTaint(header.getTaint());
        String varA7E53CE21691AB073D9660D615818899_1381663439; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1381663439 = varB4EAC82CA7396A68D541C85D26508E83_602567176;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1381663439 = varB4EAC82CA7396A68D541C85D26508E83_914551160;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1381663439.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1381663439;
        // ---------- Original Method ----------
        //if (header != null) {
            //int i = header.indexOf(' ');
            //if (i >= 0) {
                //String scheme = header.substring(0, i).trim();
                //if (scheme.equalsIgnoreCase(DIGEST_TOKEN)) {
                    //mScheme = DIGEST;
                    //mAlgorithm = "md5";
                //} else {
                    //if (scheme.equalsIgnoreCase(BASIC_TOKEN)) {
                        //mScheme = BASIC;
                    //}
                //}
                //return header.substring(i + 1);
            //}
        //}
        //return null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:23.009 -0400", hash_original_method = "2438A746B67FAB4E454DBFA828DCDAA3", hash_generated_method = "73CCFFF0CCC4B765FD35B53AD2A08E5E")
    private void parseParameters(String parameters) {
        {
            HttpLog.v("HttpAuthHeader.parseParameters():" +
                      " parameters: " + parameters);
        } //End block
        {
            int i;
            {
                i = parameters.indexOf(',');
                {
                    parseParameter(parameters);
                } //End block
                {
                    parseParameter(parameters.substring(0, i));
                    parameters = parameters.substring(i + 1);
                } //End block
            } //End block
        } //End block
        addTaint(parameters.getTaint());
        // ---------- Original Method ----------
        //if (HttpLog.LOGV) {
            //HttpLog.v("HttpAuthHeader.parseParameters():" +
                      //" parameters: " + parameters);
        //}
        //if (parameters != null) {
            //int i;
            //do {
                //i = parameters.indexOf(',');
                //if (i < 0) {
                    //parseParameter(parameters);
                //} else {
                    //parseParameter(parameters.substring(0, i));
                    //parameters = parameters.substring(i + 1);
                //}
            //} while (i >= 0);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:23.015 -0400", hash_original_method = "5835A4879F5A1904E0EE047AD8542D67", hash_generated_method = "DBD526AE26A21A267DD108F2DA043DA1")
    private void parseParameter(String parameter) {
        {
            int i;
            i = parameter.indexOf('=');
            {
                String token;
                token = parameter.substring(0, i).trim();
                String value;
                value = trimDoubleQuotesIfAny(parameter.substring(i + 1).trim());
                {
                    HttpLog.v("HttpAuthHeader.parseParameter():" +
                              " token: " + token +
                              " value: " + value);
                } //End block
                {
                    boolean varCEC1DBC4ECC877291DF9F6E9273F6D58_454101318 = (token.equalsIgnoreCase(REALM_TOKEN));
                    {
                        mRealm = value;
                    } //End block
                    {
                        {
                            parseParameter(token, value);
                        } //End block
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End block
        addTaint(parameter.getTaint());
        // ---------- Original Method ----------
        //if (parameter != null) {
            //int i = parameter.indexOf('=');
            //if (i >= 0) {
                //String token = parameter.substring(0, i).trim();
                //String value =
                    //trimDoubleQuotesIfAny(parameter.substring(i + 1).trim());
                //if (HttpLog.LOGV) {
                    //HttpLog.v("HttpAuthHeader.parseParameter():" +
                              //" token: " + token +
                              //" value: " + value);
                //}
                //if (token.equalsIgnoreCase(REALM_TOKEN)) {
                    //mRealm = value;
                //} else {
                    //if (mScheme == DIGEST) {
                        //parseParameter(token, value);
                    //}
                //}
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:23.044 -0400", hash_original_method = "5C1E65D88B1AA36ECF03FA5CEB305F59", hash_generated_method = "2D80DBA326DF3AD75E2167CE9DA758DC")
    private void parseParameter(String token, String value) {
        {
            {
                boolean var15BA235533ABCE547E0797A898456E7C_2007561855 = (token.equalsIgnoreCase(NONCE_TOKEN));
                {
                    mNonce = value;
                } //End block
            } //End collapsed parenthetic
            {
                boolean varB44C547194E6F53089412783571B2447_1917501830 = (token.equalsIgnoreCase(STALE_TOKEN));
                {
                    parseStale(value);
                } //End block
            } //End collapsed parenthetic
            {
                boolean var60D1503A4A333BAFF728E7D81DC09722_612657846 = (token.equalsIgnoreCase(OPAQUE_TOKEN));
                {
                    mOpaque = value;
                } //End block
            } //End collapsed parenthetic
            {
                boolean var22053CACB180CCB306D6CA26A6BD8471_1229688366 = (token.equalsIgnoreCase(QOP_TOKEN));
                {
                    mQop = value.toLowerCase();
                } //End block
            } //End collapsed parenthetic
            {
                boolean varD433831E97890454AF3D37C7538A019B_1122931018 = (token.equalsIgnoreCase(ALGORITHM_TOKEN));
                {
                    mAlgorithm = value.toLowerCase();
                } //End block
            } //End collapsed parenthetic
        } //End block
        addTaint(token.getTaint());
        // ---------- Original Method ----------
        //if (token != null && value != null) {
            //if (token.equalsIgnoreCase(NONCE_TOKEN)) {
                //mNonce = value;
                //return;
            //}
            //if (token.equalsIgnoreCase(STALE_TOKEN)) {
                //parseStale(value);
                //return;
            //}
            //if (token.equalsIgnoreCase(OPAQUE_TOKEN)) {
                //mOpaque = value;
                //return;
            //}
            //if (token.equalsIgnoreCase(QOP_TOKEN)) {
                //mQop = value.toLowerCase();
                //return;
            //}
            //if (token.equalsIgnoreCase(ALGORITHM_TOKEN)) {
                //mAlgorithm = value.toLowerCase();
                //return;
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:23.045 -0400", hash_original_method = "76A5C02B3DC683D5BF99D1052171A66C", hash_generated_method = "FE0448E60FF476A004999A8211C86A73")
    private void parseStale(String value) {
        {
            {
                boolean varF9F03D746A978112631EA8BA624DD149_2027183632 = (value.equalsIgnoreCase("true"));
                {
                    mStale = true;
                } //End block
            } //End collapsed parenthetic
        } //End block
        addTaint(value.getTaint());
        // ---------- Original Method ----------
        //if (value != null) {
            //if (value.equalsIgnoreCase("true")) {
                //mStale = true;
            //}
        //}
    }

    
        static private String trimDoubleQuotesIfAny(String value) {
        if (value != null) {
            int len = value.length();
            if (len > 2 &&
                value.charAt(0) == '\"' && value.charAt(len - 1) == '\"') {
                return value.substring(1, len - 1);
            }
        }
        return value;
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:23.053 -0400", hash_original_field = "62F0D6DB44FFD6767F4DA02B347D55CD", hash_generated_field = "986C424100AA2C3A2DDC20F5EE727677")

    public final static String BASIC_TOKEN = "Basic";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:23.053 -0400", hash_original_field = "E52D22C623D30409901F6AFE282F08E6", hash_generated_field = "D52B97DABBD8FCDD390C982C4167F6B8")

    public final static String DIGEST_TOKEN = "Digest";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:23.053 -0400", hash_original_field = "B0912BBD4ACDE3258F57D5DF55282454", hash_generated_field = "607E02B303CAD9F44B9CC154C732BBA0")

    private static String REALM_TOKEN = "realm";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:23.053 -0400", hash_original_field = "A6A1BB8AFE958AA07077FF8CA4A566BB", hash_generated_field = "8E069C0DBF778ADB46D46D2B2E58290C")

    private static String NONCE_TOKEN = "nonce";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:23.053 -0400", hash_original_field = "0C8A401D125645B459114E0E35EC58C2", hash_generated_field = "8B84469A641370CDBB43C610ABB1A534")

    private static String STALE_TOKEN = "stale";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:23.053 -0400", hash_original_field = "A5A1D4C16CEDCC27568022EA37A317FF", hash_generated_field = "7F75B4D8AEBD3B42ACB0A9D40DA85651")

    private static String OPAQUE_TOKEN = "opaque";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:23.053 -0400", hash_original_field = "03CE70FBE077F3DFDEC017814765A5FC", hash_generated_field = "681392983FFDC8D5780A250B57C8AE6D")

    private static String QOP_TOKEN = "qop";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:23.053 -0400", hash_original_field = "FE6A5F2F87A68DB77C03C0F759E3739B", hash_generated_field = "B5E5249E3F1544B0EFDDF26461D3ADB7")

    private static String ALGORITHM_TOKEN = "algorithm";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:23.053 -0400", hash_original_field = "94E61C192E6109B85BABEC62149624F0", hash_generated_field = "847D4677A6A1533A543ECA012114829C")

    public static final int UNKNOWN = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:23.053 -0400", hash_original_field = "8BE3D57849A09DB037F845BA2CBCB6D0", hash_generated_field = "B0822A45DCF04E972AB9BA01D4ACE62D")

    public static final int BASIC = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:23.053 -0400", hash_original_field = "39DBEBA79D94DA916843FBD7FF49E9AA", hash_generated_field = "8CA30E62B2B8C2B08E10EA394B68719F")

    public static final int DIGEST = 2;
}

