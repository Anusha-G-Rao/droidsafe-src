package org.bouncycastle.asn1;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.IOException;

public class DERBMPString extends ASN1Object implements DERString {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:18.967 -0400", hash_original_field = "B45CFFE084DD3D20D928BEE85E7B0F21", hash_generated_field = "38EA5C212184AA9651934368805B840B")

    String string;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:18.968 -0400", hash_original_method = "78F8AAB34A37706FEFE708907754C8E8", hash_generated_method = "47520CDE71D6A0525B636F7973CB879B")
    public  DERBMPString(
        byte[]   string) {
        char[] cs;
        cs = new char[string.length / 2];
        {
            int i;
            i = 0;
            {
                cs[i] = (char)((string[2 * i] << 8) | (string[2 * i + 1] & 0xff));
            } //End block
        } //End collapsed parenthetic
        this.string = new String(cs);
        // ---------- Original Method ----------
        //char[]  cs = new char[string.length / 2];
        //for (int i = 0; i != cs.length; i++)
        //{
            //cs[i] = (char)((string[2 * i] << 8) | (string[2 * i + 1] & 0xff));
        //}
        //this.string = new String(cs);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:18.968 -0400", hash_original_method = "6B5E4F39ED8278020082E899D53170B5", hash_generated_method = "BA47B4DA0E258D9BDA4360123DE13384")
    public  DERBMPString(
        String   string) {
        this.string = string;
        // ---------- Original Method ----------
        //this.string = string;
    }

    
        public static DERBMPString getInstance(
        Object  obj) {
        if (obj == null || obj instanceof DERBMPString)
        {
            return (DERBMPString)obj;
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    
        public static DERBMPString getInstance(
        ASN1TaggedObject obj,
        boolean          explicit) {
        DERObject o = obj.getObject();
        if (explicit || o instanceof DERBMPString)
        {
            return getInstance(o);
        }
        else
        {
            return new DERBMPString(ASN1OctetString.getInstance(o).getOctets());
        }
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:18.982 -0400", hash_original_method = "3CB977BE316CAC9520A0E1ADE8D338F7", hash_generated_method = "5877FA738DFF88292F387A71CB201220")
    public String getString() {
        String varB4EAC82CA7396A68D541C85D26508E83_2098136480 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_2098136480 = string;
        varB4EAC82CA7396A68D541C85D26508E83_2098136480.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_2098136480;
        // ---------- Original Method ----------
        //return string;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:18.983 -0400", hash_original_method = "A7AD745E242BD88C36EC3708384A50C0", hash_generated_method = "96376E6C963506B6444D1542BF454C7A")
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_752580264 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_752580264 = string;
        varB4EAC82CA7396A68D541C85D26508E83_752580264.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_752580264;
        // ---------- Original Method ----------
        //return string;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:18.983 -0400", hash_original_method = "929F8DA4B9097458735D9AC5748FD267", hash_generated_method = "9E99D0E977A6E90F0D08BA95F7FEF89E")
    public int hashCode() {
        int var21276083EDE53370F5E1E00F33D2C218_199843488 = (this.getString().hashCode());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_760097509 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_760097509;
        // ---------- Original Method ----------
        //return this.getString().hashCode();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:18.995 -0400", hash_original_method = "7D03FB23F5FAD453913811002EB3F146", hash_generated_method = "B077171CFD8D66E0BEA1699BFBADD6F0")
    protected boolean asn1Equals(
        DERObject  o) {
        DERBMPString s;
        s = (DERBMPString)o;
        boolean varEE57EA262042757EB3692934946962F3_1219049492 = (this.getString().equals(s.getString()));
        addTaint(o.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1352342469 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1352342469;
        // ---------- Original Method ----------
        //if (!(o instanceof DERBMPString))
        //{
            //return false;
        //}
        //DERBMPString  s = (DERBMPString)o;
        //return this.getString().equals(s.getString());
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:18.997 -0400", hash_original_method = "FF137816E9C451A6CEB1C43EC2D7AD7D", hash_generated_method = "9DB0ACD7E021A42B9D01DA03DDB9F489")
     void encode(
        DEROutputStream  out) throws IOException {
        char[] c;
        c = string.toCharArray();
        byte[] b;
        b = new byte[c.length * 2];
        {
            int i;
            i = 0;
            {
                b[2 * i] = (byte)(c[i] >> 8);
                b[2 * i + 1] = (byte)c[i];
            } //End block
        } //End collapsed parenthetic
        out.writeEncoded(BMP_STRING, b);
        addTaint(out.getTaint());
        // ---------- Original Method ----------
        //char[]  c = string.toCharArray();
        //byte[]  b = new byte[c.length * 2];
        //for (int i = 0; i != c.length; i++)
        //{
            //b[2 * i] = (byte)(c[i] >> 8);
            //b[2 * i + 1] = (byte)c[i];
        //}
        //out.writeEncoded(BMP_STRING, b);
    }

    
}

