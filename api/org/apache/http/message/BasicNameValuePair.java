package org.apache.http.message;

// Droidsafe Imports
import droidsafe.annotations.*;
import droidsafe.helpers.*;

import droidsafe.runtime.*;
import org.apache.http.NameValuePair;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.util.LangUtils;

public class BasicNameValuePair implements NameValuePair, Cloneable {
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:24.321 -0500", hash_original_field = "BF45F7481B8091DE3CBF80E94F7F940B", hash_generated_field = "531F96E2AEBFB44CD229EC4CB1F012B0")


    private  String name;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:24.322 -0500", hash_original_field = "EE6B270D979EDA88DA18EA680B9EE570", hash_generated_field = "424F4435B9052E77589D30873B9A7D2B")

    private  String value;
    
    @DSModeled(DSC.SAFE)
	public BasicNameValuePair(final String name, final String value) {
		addTaint(name.getTaint());
		addTaint(value.getTaint());
	}

    
    @DSModeled(DSC.SAFE)
    @Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

    
    @DSModeled(DSC.SAFE)
    @Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}

    
    /**
     * Get a string representation of this pair.
     * 
     * @return A string representation.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:24.326 -0500", hash_original_method = "93FF9F6BC44FD78A86FF56612368CE29", hash_generated_method = "9222A2A74E472CBBD21741C2076BECE7")
    public String toString() {
        // don't call complex default formatting for a simple toString

        int len = this.name.length();
        if (this.value != null)
            len += 1 + this.value.length();
        CharArrayBuffer buffer = new CharArrayBuffer(len);

        buffer.append(this.name);
        if (this.value != null) {
            buffer.append("=");
            buffer.append(this.value);
        }
        return buffer.toString();
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:24.327 -0500", hash_original_method = "3849D74FE9AE53A80E5FA00389489FFC", hash_generated_method = "7E95BB12D8AE441B52154DB0448B72CF")
    public boolean equals(final Object object) {
        if (object == null) return false;
        if (this == object) return true;
        if (object instanceof NameValuePair) {
            BasicNameValuePair that = (BasicNameValuePair) object;
            return this.name.equals(that.name)
                  && LangUtils.equals(this.value, that.value);
        } else {
            return false;
        }
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:24.327 -0500", hash_original_method = "A586BF0615CE91E5DB31F98DF42747A4", hash_generated_method = "92AA0EA6F5675590FB6F464F709CD33B")
    public int hashCode() {
        int hash = LangUtils.HASH_SEED;
        hash = LangUtils.hashCode(hash, this.name);
        hash = LangUtils.hashCode(hash, this.value);
        return hash;
    }
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:24.328 -0500", hash_original_method = "66DEBDF0D0405CDDBB7BD5DED76064DF", hash_generated_method = "587F7AA34F50D42D8C2635621B97F7C1")
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    
}

