package org.apache.http.message;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.protocol.HTTP;






public class BasicHttpEntityEnclosingRequest extends BasicHttpRequest implements HttpEntityEnclosingRequest {
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:25.155 -0500", hash_original_field = "84BEE3610D6DA557FD534AD24775E93F", hash_generated_field = "1845537B516494D16BEEE561F2E771CF")

    
    private HttpEntity entity;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:25.156 -0500", hash_original_method = "3B9AEA8ADDBEE1D3D457706DB0027555", hash_generated_method = "869E502C9963B3F827FA872F7F3C4CD8")
    public BasicHttpEntityEnclosingRequest(final String method, final String uri) {
        super(method, uri);
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:25.157 -0500", hash_original_method = "81663ABF166B6EF77CF828F0FBB9FCD0", hash_generated_method = "D3C930EB45D595B30DC5B64D88C841FF")
    public BasicHttpEntityEnclosingRequest(final String method, final String uri, 
            final ProtocolVersion ver) {
        this(new BasicRequestLine(method, uri, ver));
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:25.158 -0500", hash_original_method = "411AD89842852D4D934BE04E93AC495C", hash_generated_method = "20C3F1A1E8B84983C1941564A9A0CF43")
    public BasicHttpEntityEnclosingRequest(final RequestLine requestline) {
        super(requestline);
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:25.158 -0500", hash_original_method = "FCFC1A07171F7DE920C85D2DD77008FA", hash_generated_method = "F26E442D152B9CF496C6F072484628AD")
    public HttpEntity getEntity() {
        return this.entity;
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:25.159 -0500", hash_original_method = "ACC3C31B4104E926438E24B159B6E3A2", hash_generated_method = "79AAFF6E92B5322E414271D0A9826A70")
    public void setEntity(final HttpEntity entity) {
        this.entity = entity;
    }
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:25.160 -0500", hash_original_method = "A0F17E45777A46D709253948E7008FD4", hash_generated_method = "EC2F72FE5FD316F8F025D2DEB714BBEF")
    public boolean expectContinue() {
        Header expect = getFirstHeader(HTTP.EXPECT_DIRECTIVE);
        return expect != null && HTTP.EXPECT_CONTINUE.equalsIgnoreCase(expect.getValue());
    }

    
}

