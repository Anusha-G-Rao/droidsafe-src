package org.apache.http.client;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import java.io.IOException;

import org.apache.http.HttpResponse;

public interface ResponseHandler<T> {

    
    T handleResponse(HttpResponse response) throws ClientProtocolException, IOException;
    
}
