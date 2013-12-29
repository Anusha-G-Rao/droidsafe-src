package org.apache.http.params;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.protocol.HTTP;



public final class HttpProtocolParams implements CoreProtocolPNames {

    /**
     * Returns the charset to be used for writing HTTP headers.
     * @return The charset
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:18.825 -0500", hash_original_method = "00B66FE3D1CE0A6DD6D66821BA877E97", hash_generated_method = "37D6854B75CDC88D01FDFA0DD25F7C93")
    public static String getHttpElementCharset(final HttpParams params) {
        if (params == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        String charset = (String) params.getParameter
            (CoreProtocolPNames.HTTP_ELEMENT_CHARSET);
        if (charset == null) {
            charset = HTTP.DEFAULT_PROTOCOL_CHARSET;
        }
        return charset;
    }
    
    /**
     * Sets the charset to be used for writing HTTP headers.
     * @param charset The charset
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:18.826 -0500", hash_original_method = "BE6E7DB3970F9F7088D2123F68254F7A", hash_generated_method = "C4618C1F1A2191D9F2FB10B276FC66C5")
    public static void setHttpElementCharset(final HttpParams params, final String charset) {
        if (params == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        params.setParameter(CoreProtocolPNames.HTTP_ELEMENT_CHARSET, charset);
    }

    /**
     * Returns the default charset to be used for writing content body, 
     * when no charset explicitly specified.
     * @return The charset
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:18.827 -0500", hash_original_method = "51318419CE3F0750EBE45FF064C5BA7C", hash_generated_method = "D87F902D69B7A2873132B5F0BB779081")
    public static String getContentCharset(final HttpParams params) {
        if (params == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        String charset = (String) params.getParameter
            (CoreProtocolPNames.HTTP_CONTENT_CHARSET);
        if (charset == null) {
            charset = HTTP.DEFAULT_CONTENT_CHARSET;
        }
        return charset;
    }
    
    /**
     * Sets the default charset to be used for writing content body,
     * when no charset explicitly specified.
     * @param charset The charset
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:18.828 -0500", hash_original_method = "D15B42373326BA435E97AD021D6AFFC0", hash_generated_method = "81EDDCB38C08637D7DFFB2CABC104FB5")
    public static void setContentCharset(final HttpParams params, final String charset) {
        if (params == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        params.setParameter(CoreProtocolPNames.HTTP_CONTENT_CHARSET, charset);
    }

    /**
     * Returns {@link ProtocolVersion protocol version} to be used per default. 
     *
     * @return {@link ProtocolVersion protocol version}
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:18.829 -0500", hash_original_method = "36B35D37A924AC197CD49B399E02A592", hash_generated_method = "D43D3C6D3D17D10EDFDF57F90EED034A")
    public static ProtocolVersion getVersion(final HttpParams params) { 
        if (params == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        Object param = params.getParameter
            (CoreProtocolPNames.PROTOCOL_VERSION);
        if (param == null) {
            return HttpVersion.HTTP_1_1;
        }
        return (ProtocolVersion)param;
    }
    
    /**
     * Assigns the {@link ProtocolVersion protocol version} to be used by the 
     * HTTP methods that this collection of parameters applies to. 
     *
     * @param version the {@link ProtocolVersion protocol version}
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:18.830 -0500", hash_original_method = "F828B0212A5A6C65405D444D09E56997", hash_generated_method = "2E2E6C23A798222B6C81B82B50F28CE6")
    public static void setVersion(final HttpParams params, final ProtocolVersion version) {
        if (params == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        params.setParameter(CoreProtocolPNames.PROTOCOL_VERSION, version);
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:18.831 -0500", hash_original_method = "51C03EF6F56000764239786BCF90AC80", hash_generated_method = "6B2C0D18276C0247E13075AB14C8E74D")
    public static String getUserAgent(final HttpParams params) { 
        if (params == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        return (String) params.getParameter(CoreProtocolPNames.USER_AGENT);
    }
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:18.831 -0500", hash_original_method = "F6093E7646C8A0B21B2B1B3BF37A7E05", hash_generated_method = "7CE29C1DC461E81442B4086E6030E2E1")
    public static void setUserAgent(final HttpParams params, final String useragent) {
        if (params == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        params.setParameter(CoreProtocolPNames.USER_AGENT, useragent);
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:18.832 -0500", hash_original_method = "8D91FA11949E3761E2879ECC7DDF24C5", hash_generated_method = "8DA2AE073A13C6F1FE44330F7F1C1BE9")
    public static boolean useExpectContinue(final HttpParams params) {
        if (params == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        return params.getBooleanParameter
            (CoreProtocolPNames.USE_EXPECT_CONTINUE, false);
    }
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:18.833 -0500", hash_original_method = "BD8A4B1902B173E8C87CFFD2C5324E32", hash_generated_method = "CCE993304467A7F0FC09E7656896E5A0")
    public static void setUseExpectContinue(final HttpParams params, boolean b) {
        if (params == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        params.setBooleanParameter(CoreProtocolPNames.USE_EXPECT_CONTINUE, b);
    }
    
    /**
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:18.824 -0500", hash_original_method = "97EF9A6B4AA92C207CBAC39297404AF3", hash_generated_method = "5AC7AADFBBE217262025737854AE0708")
    private HttpProtocolParams() {
        super();
    }

    
}

