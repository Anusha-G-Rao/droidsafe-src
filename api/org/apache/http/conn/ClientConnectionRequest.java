package org.apache.http.conn;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import java.util.concurrent.TimeUnit;

public interface ClientConnectionRequest {
    
    
    ManagedClientConnection getConnection(long timeout, TimeUnit tunit) 
        throws InterruptedException, ConnectionPoolTimeoutException;
    
    
    void abortRequest();

}
