package org.bouncycastle.asn1;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.IOException;
import org.bouncycastle.util.Strings;

public class DERUTF8String extends ASN1Object implements DERString {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:19.353 -0400", hash_original_field = "B45CFFE084DD3D20D928BEE85E7B0F21", hash_generated_field = "38EA5C212184AA9651934368805B840B")

    String string;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:19.354 -0400", hash_original_method = "B56B53BD15659EE05E587584D616ACE1", hash_generated_method = "6038452F3CCD059F42051AF2029AA2EC")
    public  DERUTF8String(byte[] string) {
        try 
        {
            this.string = Strings.fromUTF8ByteArray(string);
        } //End block
        catch (ArrayIndexOutOfBoundsException e)
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("UTF8 encoding invalid");
        } //End block
        // ---------- Original Method ----------
        //try
        //{
            //this.string = Strings.fromUTF8ByteArray(string);
        //}
        //catch (ArrayIndexOutOfBoundsException e)
        //{
            //throw new IllegalArgumentException("UTF8 encoding invalid");
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:19.356 -0400", hash_original_method = "87C8A077EBDA5677CBB631FE5690C6A7", hash_generated_method = "D2E018E2E7CAA8F0E1405358E3911B97")
    public  DERUTF8String(String string) {
        this.string = string;
        // ---------- Original Method ----------
        //this.string = string;
    }

    
        public static DERUTF8String getInstance(Object obj) {
        if (obj == null || obj instanceof DERUTF8String)
        {
            return (DERUTF8String)obj;
        }
        throw new IllegalArgumentException("illegal object in getInstance: "
                + obj.getClass().getName());
    }

    
        public static DERUTF8String getInstance(
        ASN1TaggedObject obj,
        boolean explicit) {
        DERObject o = obj.getObject();
        if (explicit || o instanceof DERUTF8String)
        {
            return getInstance(o);
        }
        else
        {
            return new DERUTF8String(ASN1OctetString.getInstance(o).getOctets());
        }
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:19.361 -0400", hash_original_method = "3CB977BE316CAC9520A0E1ADE8D338F7", hash_generated_method = "0E037814AC8547CD472615DDA4D240CB")
    public String getString() {
        String varB4EAC82CA7396A68D541C85D26508E83_1515023162 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1515023162 = string;
        varB4EAC82CA7396A68D541C85D26508E83_1515023162.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1515023162;
        // ---------- Original Method ----------
        //return string;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:19.371 -0400", hash_original_method = "A7AD745E242BD88C36EC3708384A50C0", hash_generated_method = "E8DB8E992C88632BBE34E772FD3CC639")
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_324145605 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_324145605 = string;
        varB4EAC82CA7396A68D541C85D26508E83_324145605.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_324145605;
        // ---------- Original Method ----------
        //return string;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:19.372 -0400", hash_original_method = "929F8DA4B9097458735D9AC5748FD267", hash_generated_method = "78880259D5F365CB710328601F6A50FE")
    public int hashCode() {
        int var21276083EDE53370F5E1E00F33D2C218_317805812 = (this.getString().hashCode());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1652059510 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1652059510;
        // ---------- Original Method ----------
        //return this.getString().hashCode();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:19.372 -0400", hash_original_method = "DF88B5FE85EAF9BB2061A4AEA787A839", hash_generated_method = "3616158B216382D7A3449540289BDB7D")
     boolean asn1Equals(DERObject o) {
        DERUTF8String s;
        s = (DERUTF8String)o;
        boolean varEE57EA262042757EB3692934946962F3_1399179137 = (this.getString().equals(s.getString()));
        addTaint(o.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1965895229 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1965895229;
        // ---------- Original Method ----------
        //if (!(o instanceof DERUTF8String))
        //{
            //return false;
        //}
        //DERUTF8String s = (DERUTF8String)o;
        //return this.getString().equals(s.getString());
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:19.379 -0400", hash_original_method = "6841F545C98612C1AFE91CE39DFBA4FF", hash_generated_method = "13F2885577826CA2166D12C83C07F916")
     void encode(DEROutputStream out) throws IOException {
        out.writeEncoded(UTF8_STRING, Strings.toUTF8ByteArray(string));
        addTaint(out.getTaint());
        // ---------- Original Method ----------
        //out.writeEncoded(UTF8_STRING, Strings.toUTF8ByteArray(string));
    }

    
}

