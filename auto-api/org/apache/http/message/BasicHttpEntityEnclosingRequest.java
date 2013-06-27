package org.apache.http.message;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.protocol.HTTP;

public class BasicHttpEntityEnclosingRequest extends BasicHttpRequest implements HttpEntityEnclosingRequest {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:18.138 -0400", hash_original_field = "F5E638CC78DD325906C1298A0C21FB6B", hash_generated_field = "1845537B516494D16BEEE561F2E771CF")

    private HttpEntity entity;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:18.138 -0400", hash_original_method = "3B9AEA8ADDBEE1D3D457706DB0027555", hash_generated_method = "AA917BDE656AC32AF3F169C0A6688439")
    public  BasicHttpEntityEnclosingRequest(final String method, final String uri) {
        super(method, uri);
        addTaint(method.getTaint());
        addTaint(uri.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:18.138 -0400", hash_original_method = "81663ABF166B6EF77CF828F0FBB9FCD0", hash_generated_method = "D388CD6519AB2D589F9C56BDCBDDE73E")
    public  BasicHttpEntityEnclosingRequest(final String method, final String uri, 
            final ProtocolVersion ver) {
        this(new BasicRequestLine(method, uri, ver));
        addTaint(method.getTaint());
        addTaint(uri.getTaint());
        addTaint(ver.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:18.138 -0400", hash_original_method = "411AD89842852D4D934BE04E93AC495C", hash_generated_method = "859E7C832CEFE5C5AB9DA47E5E03C9FF")
    public  BasicHttpEntityEnclosingRequest(final RequestLine requestline) {
        super(requestline);
        addTaint(requestline.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:18.140 -0400", hash_original_method = "FCFC1A07171F7DE920C85D2DD77008FA", hash_generated_method = "F5AD591BDC5D3991A7567CB13AEDC013")
    public HttpEntity getEntity() {
        HttpEntity varB4EAC82CA7396A68D541C85D26508E83_1928208967 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1928208967 = this.entity;
        varB4EAC82CA7396A68D541C85D26508E83_1928208967.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1928208967;
        // ---------- Original Method ----------
        //return this.entity;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:18.140 -0400", hash_original_method = "ACC3C31B4104E926438E24B159B6E3A2", hash_generated_method = "FB3E9570D6065D0B91C8CE936F48D4CA")
    public void setEntity(final HttpEntity entity) {
        this.entity = entity;
        // ---------- Original Method ----------
        //this.entity = entity;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:18.140 -0400", hash_original_method = "A0F17E45777A46D709253948E7008FD4", hash_generated_method = "FEC01C0F7AB178AD9D44518FBCC8D966")
    public boolean expectContinue() {
        Header expect;
        expect = getFirstHeader(HTTP.EXPECT_DIRECTIVE);
        boolean var3EF098E96725F3E61B1788AFB48A2903_1950170826 = (expect != null && HTTP.EXPECT_CONTINUE.equalsIgnoreCase(expect.getValue()));
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_656747142 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_656747142;
        // ---------- Original Method ----------
        //Header expect = getFirstHeader(HTTP.EXPECT_DIRECTIVE);
        //return expect != null && HTTP.EXPECT_CONTINUE.equalsIgnoreCase(expect.getValue());
    }

    
}

