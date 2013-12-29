package android.net.http;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import android.util.Log;
import droidsafe.annotations.*;
import java.io.IOException;
import java.net.Socket;

import org.apache.http.HttpHost;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;

import android.content.Context;




class HttpConnection extends Connection {

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:50:31.953 -0500", hash_original_method = "8B0FF76444F6FD4A7628D73D943DE9DB", hash_generated_method = "8B0FF76444F6FD4A7628D73D943DE9DB")
    HttpConnection(Context context, HttpHost host,
                   RequestFeeder requestFeeder) {
        super(context, host, requestFeeder);
    }

    /**
     * Opens the connection to a http server
     *
     * @return the opened low level connection
     * @throws IOException if the connection fails for any reason.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:50:31.954 -0500", hash_original_method = "EFF3BAA5D0EF7633E7DF2DAA76502E87", hash_generated_method = "376BE25A6A8379FB0723D68DD552DF63")
    @Override
AndroidHttpClientConnection openConnection(Request req) throws IOException {

        // Update the certificate info (connection not secure - set to null)
        EventHandler eventHandler = req.getEventHandler();
        mCertificate = null;
        eventHandler.certificate(mCertificate);

        AndroidHttpClientConnection conn = new AndroidHttpClientConnection();
        BasicHttpParams params = new BasicHttpParams();
        Socket sock = new Socket(mHost.getHostName(), mHost.getPort());
        params.setIntParameter(HttpConnectionParams.SOCKET_BUFFER_SIZE, 8192);
        conn.bind(sock, params);
        return conn;
    }

    /**
     * Closes the low level connection.
     *
     * If an exception is thrown then it is assumed that the
     * connection will have been closed (to the extent possible)
     * anyway and the caller does not need to take any further action.
     *
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:50:31.955 -0500", hash_original_method = "28229552049A2A2DB18166A64CE88A0A", hash_generated_method = "28229552049A2A2DB18166A64CE88A0A")
    void closeConnection() {
        try {
            if (mHttpClientConnection != null && mHttpClientConnection.isOpen()) {
                mHttpClientConnection.close();
            }
        } catch (IOException e) {
            if (HttpLog.LOGV) HttpLog.v(
                    "closeConnection(): failed closing connection " +
                    mHost);
            e.printStackTrace();
        }
    }

    /**
     * Restart a secure connection suspended waiting for user interaction.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:50:31.956 -0500", hash_original_method = "F65A3585D6DFE09EE931E3CB8D7B855F", hash_generated_method = "9E9C1487122124AAF78E9A685E07DF05")
    void restartConnection(boolean abort) {
        // not required for plain http connections
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:50:31.956 -0500", hash_original_method = "28A13316B46B35CCB565BDA96B57339B", hash_generated_method = "28A13316B46B35CCB565BDA96B57339B")
    String getScheme() {
        return "http";
    }

    
}

