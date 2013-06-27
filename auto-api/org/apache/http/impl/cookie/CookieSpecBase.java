package org.apache.http.impl.cookie;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;

public abstract class CookieSpecBase extends AbstractCookieSpec {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:17.474 -0400", hash_original_method = "934E7FA8F396BCCDD4329254EAF6D731", hash_generated_method = "934E7FA8F396BCCDD4329254EAF6D731")
    public CookieSpecBase ()
    {
        //Synthesized constructor
    }


        protected static String getDefaultPath(final CookieOrigin origin) {
        String defaultPath = origin.getPath();
        int lastSlashIndex = defaultPath.lastIndexOf('/');
        if (lastSlashIndex >= 0) {
            if (lastSlashIndex == 0) {
                lastSlashIndex = 1;
            }
            defaultPath = defaultPath.substring(0, lastSlashIndex);
        }
        return defaultPath;
    }

    
        protected static String getDefaultDomain(final CookieOrigin origin) {
        return origin.getHost();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:17.492 -0400", hash_original_method = "A25C1D1A915416DA39EA69206340D62E", hash_generated_method = "98E9C7EE3B70764519860FE8294B28AC")
    protected List<Cookie> parse(final HeaderElement[] elems, final CookieOrigin origin) throws MalformedCookieException {
        List<Cookie> varB4EAC82CA7396A68D541C85D26508E83_1833018358 = null; //Variable for return #1
        List<Cookie> cookies;
        cookies = new ArrayList<Cookie>(elems.length);
        {
            Iterator<HeaderElement> var64E4248F3E9583EF9C3B3FA1CE66BA8F_1941615012 = (elems).iterator();
            var64E4248F3E9583EF9C3B3FA1CE66BA8F_1941615012.hasNext();
            HeaderElement headerelement = var64E4248F3E9583EF9C3B3FA1CE66BA8F_1941615012.next();
            {
                String name;
                name = headerelement.getName();
                String value;
                value = headerelement.getValue();
                {
                    boolean var4461637DABA130E2A1B9BDCB33E9CE15_222972538 = (name == null || name.length() == 0);
                    {
                        if (DroidSafeAndroidRuntime.control) throw new MalformedCookieException("Cookie name may not be empty");
                    } //End block
                } //End collapsed parenthetic
                BasicClientCookie cookie;
                cookie = new BasicClientCookie(name, value);
                cookie.setPath(getDefaultPath(origin));
                cookie.setDomain(getDefaultDomain(origin));
                NameValuePair[] attribs;
                attribs = headerelement.getParameters();
                {
                    int j;
                    j = attribs.length - 1;
                    {
                        NameValuePair attrib;
                        attrib = attribs[j];
                        String s;
                        s = attrib.getName().toLowerCase(Locale.ENGLISH);
                        cookie.setAttribute(s, attrib.getValue());
                        CookieAttributeHandler handler;
                        handler = findAttribHandler(s);
                        {
                            handler.parse(cookie, attrib.getValue());
                        } //End block
                    } //End block
                } //End collapsed parenthetic
                cookies.add(cookie);
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_1833018358 = cookies;
        addTaint(elems[0].getTaint());
        addTaint(origin.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1833018358.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1833018358;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:17.502 -0400", hash_original_method = "CBCF0FF7E443EB1D3CDD692C0A263FBB", hash_generated_method = "7E6227E3B8F4E4B5641611D695CD998E")
    public void validate(final Cookie cookie, final CookieOrigin origin) throws MalformedCookieException {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Cookie may not be null");
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Cookie origin may not be null");
        } //End block
        {
            Iterator<CookieAttributeHandler> var935DBAECCC10E09271799D2725653C5D_1310119814 = (getAttribHandlers()).iterator();
            var935DBAECCC10E09271799D2725653C5D_1310119814.hasNext();
            CookieAttributeHandler handler = var935DBAECCC10E09271799D2725653C5D_1310119814.next();
            {
                handler.validate(cookie, origin);
            } //End block
        } //End collapsed parenthetic
        addTaint(cookie.getTaint());
        addTaint(origin.getTaint());
        // ---------- Original Method ----------
        //if (cookie == null) {
            //throw new IllegalArgumentException("Cookie may not be null");
        //}
        //if (origin == null) {
            //throw new IllegalArgumentException("Cookie origin may not be null");
        //}
        //for (CookieAttributeHandler handler: getAttribHandlers()) {
            //handler.validate(cookie, origin);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:17.525 -0400", hash_original_method = "23DBABC8C5DB2B0DC00C6D6715BA125E", hash_generated_method = "45493C7FD91778FB6ED2341293C219C2")
    public boolean match(final Cookie cookie, final CookieOrigin origin) {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Cookie may not be null");
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Cookie origin may not be null");
        } //End block
        {
            Iterator<CookieAttributeHandler> var935DBAECCC10E09271799D2725653C5D_1616026308 = (getAttribHandlers()).iterator();
            var935DBAECCC10E09271799D2725653C5D_1616026308.hasNext();
            CookieAttributeHandler handler = var935DBAECCC10E09271799D2725653C5D_1616026308.next();
            {
                {
                    boolean varC146CB0D67CFBC60B590703687472659_1931856543 = (!handler.match(cookie, origin));
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        addTaint(cookie.getTaint());
        addTaint(origin.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1653712806 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1653712806;
        // ---------- Original Method ----------
        //if (cookie == null) {
            //throw new IllegalArgumentException("Cookie may not be null");
        //}
        //if (origin == null) {
            //throw new IllegalArgumentException("Cookie origin may not be null");
        //}
        //for (CookieAttributeHandler handler: getAttribHandlers()) {
            //if (!handler.match(cookie, origin)) {
                //return false;
            //}
        //}
        //return true;
    }

    
}

