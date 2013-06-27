package org.apache.http.impl.cookie;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;
import org.apache.http.cookie.SetCookie2;

public class RFC2965CommentUrlAttributeHandler implements CookieAttributeHandler {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:17.646 -0400", hash_original_method = "099D2A6A922F722517A29E0583320390", hash_generated_method = "345D1882F6B7C7775370B2F3368D9EB6")
    public  RFC2965CommentUrlAttributeHandler() {
        super();
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:17.647 -0400", hash_original_method = "7C96283B530725C6069CC0E44B32CD2E", hash_generated_method = "D6AB84FCA8ED3E83A9DF70EBD3DB04C1")
    public void parse(final SetCookie cookie, final String commenturl) throws MalformedCookieException {
        {
            SetCookie2 cookie2;
            cookie2 = (SetCookie2) cookie;
            cookie2.setCommentURL(commenturl);
        } //End block
        addTaint(cookie.getTaint());
        addTaint(commenturl.getTaint());
        // ---------- Original Method ----------
        //if (cookie instanceof SetCookie2) {
              //SetCookie2 cookie2 = (SetCookie2) cookie;
              //cookie2.setCommentURL(commenturl);
          //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:17.647 -0400", hash_original_method = "991845E9A77B56F0C05EBC8CED80518E", hash_generated_method = "896AC0A8A922EA5D73734B2C4AE621C8")
    public void validate(final Cookie cookie, final CookieOrigin origin) throws MalformedCookieException {
        addTaint(cookie.getTaint());
        addTaint(origin.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:17.647 -0400", hash_original_method = "768BC0018D608E66268B8C5C0AE76B3A", hash_generated_method = "60D16C4049A8B15B6C555A66DCCB72EE")
    public boolean match(final Cookie cookie, final CookieOrigin origin) {
        addTaint(cookie.getTaint());
        addTaint(origin.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1507765537 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1507765537;
        // ---------- Original Method ----------
        //return true;
    }

    
}

