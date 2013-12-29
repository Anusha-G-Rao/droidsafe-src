package org.apache.http.client.methods;

// Droidsafe Imports
import droidsafe.annotations.*;
import droidsafe.helpers.*;

import droidsafe.runtime.*;
import java.io.IOException;
import java.net.URI;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.client.utils.CloneUtils;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ConnectionReleaseTrigger;
import org.apache.http.message.AbstractHttpMessage;
import org.apache.http.message.BasicRequestLine;
import org.apache.http.message.HeaderGroup;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

public abstract class HttpRequestBase extends AbstractHttpMessage implements HttpUriRequest, AbortableHttpRequest, Cloneable {
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:23.170 -0500", hash_original_field = "BE55E2806D75A87D6EA3B70A822FC2DC", hash_generated_field = "44B412448D230F2FF1F66097B168F5A5")


    private Lock abortLock;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:23.171 -0500", hash_original_field = "D257EA6B1465C401242DE11DC61376AA", hash_generated_field = "7C8E769DDEE22768B70313CCC815CA01")


    private boolean aborted;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:23.172 -0500", hash_original_field = "1154143EF3A042E6515BD6D5B42C64B6", hash_generated_field = "DDFAECCF21F90F28142F5C866534A5C3")

    
    private URI uri;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:23.173 -0500", hash_original_field = "CD3008586A4079C953F39C8A5CFFD1A4", hash_generated_field = "9BD569E8B5A75FB995CED8041D010CC7")

    private ClientConnectionRequest connRequest;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:23.174 -0500", hash_original_field = "0851AAE9FEDCF0EA48EAEC2B4D3D21E4", hash_generated_field = "67B34A5893107F972D9958340D6670E2")

    private ConnectionReleaseTrigger releaseTrigger;
    
    @DSModeled(DSC.SPEC)
	public HttpRequestBase() { 
		super();
	}

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:23.175 -0500", hash_original_method = "F352A3E640216B4F520D3B8AC71B6A25", hash_generated_method = "F22BE05CDA656AFEA2EF3612C7813D7B")
    public abstract String getMethod();

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:23.176 -0500", hash_original_method = "E43BB65B6EAF4E56B5A8181704221BD7", hash_generated_method = "A860B22AAC837FA469D513A502CECDBE")
    public ProtocolVersion getProtocolVersion() {
        return HttpProtocolParams.getVersion(getParams());
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:23.177 -0500", hash_original_method = "548D933490D1B58733888D02043A11B0", hash_generated_method = "FE9C67AB573105BAB4263EEFA9A78DCB")
    public URI getURI() {
        return this.uri;
    }
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:23.178 -0500", hash_original_method = "93E6AFEE57EFDA4898CAE2DF347D0D02", hash_generated_method = "7863C6385848DD68FDC6103A002E1909")
    public RequestLine getRequestLine() {
        String method = getMethod();
        ProtocolVersion ver = getProtocolVersion();
        URI uri = getURI();
        String uritext = null;
        if (uri != null) {
            uritext = uri.toASCIIString();
        }
        if (uritext == null || uritext.length() == 0) {
            uritext = "/";
        }
        return new BasicRequestLine(method, uritext, ver);
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:23.179 -0500", hash_original_method = "3320A765B2CE48350AC27D9599EAC026", hash_generated_method = "26209B88B14367E9C8A191527A27C7FB")
    public void setURI(final URI uri) {
        this.uri = uri;
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:23.179 -0500", hash_original_method = "AD26D5D661F235A4EA5BC460121EF4B1", hash_generated_method = "660883521A14FCC4A1609318421D519B")
    public void setConnectionRequest(final ClientConnectionRequest connRequest)
            throws IOException {
        this.abortLock.lock();
        try {
            if (this.aborted) {
                throw new IOException("Request already aborted");
            }
            
            this.releaseTrigger = null;
            this.connRequest = connRequest;
        } finally {
            this.abortLock.unlock();
        }
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:23.180 -0500", hash_original_method = "F06B06B54565935399EE76A02EF85A84", hash_generated_method = "EB3C7B529EA1255ECAEC9907318D0B4B")
    public void setReleaseTrigger(final ConnectionReleaseTrigger releaseTrigger)
            throws IOException {
        this.abortLock.lock();
        try {
            if (this.aborted) {
                throw new IOException("Request already aborted");
            }
            
            this.connRequest = null;
            this.releaseTrigger = releaseTrigger;
        } finally {
            this.abortLock.unlock();
        }
    }
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:23.181 -0500", hash_original_method = "DAE61D1D90E50FDB083EDE1BB1F7240A", hash_generated_method = "F04B70B4EE6550F70F5742DF03017CD9")
    public void abort() {
        ClientConnectionRequest localRequest;
        ConnectionReleaseTrigger localTrigger;
        
        this.abortLock.lock();
        try {
            if (this.aborted) {
                return;
            }            
            this.aborted = true;
            
            localRequest = connRequest;
            localTrigger = releaseTrigger;
        } finally {
            this.abortLock.unlock();
        }        

        // Trigger the callbacks outside of the lock, to prevent
        // deadlocks in the scenario where the callbacks have
        // their own locks that may be used while calling
        // setReleaseTrigger or setConnectionRequest.
        if (localRequest != null) {
            localRequest.abortRequest();
        }
        if (localTrigger != null) {
            try {
                localTrigger.abortConnection();
            } catch (IOException ex) {
                // ignore
            }
        }
    }
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:23.182 -0500", hash_original_method = "2E6315A95F3ECC29CFD4A6E95CF920AD", hash_generated_method = "546E054EC2C9FCC4E0B24B0FFD71EFDA")
    public boolean isAborted() {
        return this.aborted;
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:23.184 -0500", hash_original_method = "7E78C92898A9406CD028D56B8CBA9D93", hash_generated_method = "B2B1054171D5044B5D26A3B55A44AA53")
    @Override
public Object clone() throws CloneNotSupportedException {
        HttpRequestBase clone = (HttpRequestBase) super.clone();
        clone.abortLock = new ReentrantLock();
        clone.aborted = false;
        clone.releaseTrigger = null;
        clone.connRequest = null;
        clone.headergroup = (HeaderGroup) CloneUtils.clone(this.headergroup);
        clone.params = (HttpParams) CloneUtils.clone(this.params);
        return clone;
    }

    
}

