package org.apache.http.conn;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import java.net.ConnectException;

import org.apache.http.HttpHost;






public class HttpHostConnectException extends ConnectException {
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:18.127 -0500", hash_original_field = "C56B5507638C4F63E5460BEB67253202", hash_generated_field = "A69580887BB1364AC479063D7D0209BA")


    private static final long serialVersionUID = -3194482710275220224L;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:18.128 -0500", hash_original_field = "91AD5DEFDD396BDE62D0A211E7EB1B1C", hash_generated_field = "A05924381413D1FF5A0ADAC711A8D56A")


    private  HttpHost host;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:18.129 -0500", hash_original_method = "D25CD4256FF06B874DEF78FBD87843BC", hash_generated_method = "1D3A55F0AE3EBD19DF557E801B08BE61")
    public HttpHostConnectException(final HttpHost host, final ConnectException cause) {
        super("Connection to " + host + " refused");
        this.host = host;
        initCause(cause);
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:18.129 -0500", hash_original_method = "6529E0B2BF5C95A4487D992F02B2AAA6", hash_generated_method = "B1E2DD5572B5B83158013204CC3A8925")
    public HttpHost getHost() {
        return this.host;
    }
}

