package gov.nist.javax.sip.header;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import gov.nist.javax.sip.address.AddressImpl;
import javax.sip.header.RouteHeader;

public class Route extends AddressParametersHeader implements javax.sip.header.RouteHeader {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:31.428 -0400", hash_original_method = "B9CE287F547A57CF29833C977E422F42", hash_generated_method = "78BD04979B7BBC9CE0E7EF4486861FDE")
    public  Route() {
        super(NAME);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:31.428 -0400", hash_original_method = "D97B9DA75E98466FFB5CFE28F884D630", hash_generated_method = "39DA2D92B961A947E890F449A9EA9E62")
    public  Route(AddressImpl address) {
        super(NAME);
        this.address = address;
        addTaint(address.getTaint());
        // ---------- Original Method ----------
        //this.address = address;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:31.429 -0400", hash_original_method = "42825E09BC1306330D357AEB56059051", hash_generated_method = "E0E795FCF4CA5AEADBA5B43EF8EE32EE")
    public int hashCode() {
        int var9C79550AB94DC3847B947AFB716927DB_1831111111 = (this.address.getHostPort().encode().toLowerCase().hashCode());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1440222390 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1440222390;
        // ---------- Original Method ----------
        //return this.address.getHostPort().encode().toLowerCase().hashCode();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:31.429 -0400", hash_original_method = "E7A2FB4AC135D29D78CE09D5448C290F", hash_generated_method = "DC1C8768A79FCE49931083CC363B5FD6")
    public String encodeBody() {
        String varB4EAC82CA7396A68D541C85D26508E83_1598626238 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1598626238 = encodeBody(new StringBuffer()).toString();
        varB4EAC82CA7396A68D541C85D26508E83_1598626238.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1598626238;
        // ---------- Original Method ----------
        //return encodeBody(new StringBuffer()).toString();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:31.430 -0400", hash_original_method = "2891D97F5EA93E20B16E0A9272FB4B2C", hash_generated_method = "CD64BFF034D2849783CE258DFB05C215")
    protected StringBuffer encodeBody(StringBuffer buffer) {
        StringBuffer varB4EAC82CA7396A68D541C85D26508E83_1295889459 = null; //Variable for return #1
        boolean addrFlag;
        addrFlag = address.getAddressType() == AddressImpl.NAME_ADDR;
        {
            buffer.append('<');
            address.encode(buffer);
            buffer.append('>');
        } //End block
        {
            address.encode(buffer);
        } //End block
        {
            boolean varB381AD842454BDB2397F4C2DAD0B3FA1_636061652 = (!parameters.isEmpty());
            {
                buffer.append(SEMICOLON);
                parameters.encode(buffer);
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_1295889459 = buffer;
        addTaint(buffer.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1295889459.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1295889459;
        // ---------- Original Method ----------
        //boolean addrFlag = address.getAddressType() == AddressImpl.NAME_ADDR;
        //if (!addrFlag) {
            //buffer.append('<');
            //address.encode(buffer);
            //buffer.append('>');
        //} else {
            //address.encode(buffer);
        //}
        //if (!parameters.isEmpty()) {
            //buffer.append(SEMICOLON);
            //parameters.encode(buffer);
        //}
        //return buffer;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:31.430 -0400", hash_original_method = "53DB62040F48266C1BBF2CE5E963ACD1", hash_generated_method = "84A57BDBE4DF96C90AF4FD9D7B2BDF28")
    public boolean equals(Object other) {
        boolean var2F4AFEB523B482BB1EEA591882055F1B_1273940566 = ((other instanceof RouteHeader) && super.equals(other));
        addTaint(other.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_90748979 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_90748979;
        // ---------- Original Method ----------
        //return (other instanceof RouteHeader) && super.equals(other);
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:31.431 -0400", hash_original_field = "24947308B97B96B5EB000D870A381219", hash_generated_field = "B8A716CEE790D909B6E23BB7AF46C084")

    private static long serialVersionUID = 5683577362998368846L;
}

