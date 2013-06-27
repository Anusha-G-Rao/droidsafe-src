package org.bouncycastle.asn1.pkcs;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

public class PBEParameter extends ASN1Encodable {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:19.576 -0400", hash_original_field = "471DACEA75A62298F21BD08196E91EF6", hash_generated_field = "78F9CF53C7E0D6433DD6CC8969049302")

    DERInteger iterations;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:19.576 -0400", hash_original_field = "CEB20772E0C9D240C75EB26B0E37ABEE", hash_generated_field = "83822DE1D48BD51F36389108E6B20D1C")

    ASN1OctetString salt;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:19.576 -0400", hash_original_method = "F7EDA5A89282A21C4F04920900A9B0E0", hash_generated_method = "FCDF13641612A0BAF7926F7A4B2C01E9")
    public  PBEParameter(
        byte[]      salt,
        int         iterations) {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("salt length must be 8");
        } //End block
        this.salt = new DEROctetString(salt);
        this.iterations = new DERInteger(iterations);
        // ---------- Original Method ----------
        //if (salt.length != 8)
        //{
            //throw new IllegalArgumentException("salt length must be 8");
        //}
        //this.salt = new DEROctetString(salt);
        //this.iterations = new DERInteger(iterations);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:19.577 -0400", hash_original_method = "8CC750B4C495B3704F501666A3EEDBD9", hash_generated_method = "26541D40AC632625B229A9B94A06658B")
    public  PBEParameter(
        ASN1Sequence  seq) {
        salt = (ASN1OctetString)seq.getObjectAt(0);
        iterations = (DERInteger)seq.getObjectAt(1);
        // ---------- Original Method ----------
        //salt = (ASN1OctetString)seq.getObjectAt(0);
        //iterations = (DERInteger)seq.getObjectAt(1);
    }

    
        public static PBEParameter getInstance(
        Object  obj) {
        if (obj instanceof PBEParameter)
        {
            return (PBEParameter)obj;
        }
        else if (obj instanceof ASN1Sequence)
        {
            return new PBEParameter((ASN1Sequence)obj);
        }
        throw new IllegalArgumentException("unknown object in factory: " + obj.getClass().getName());
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:19.577 -0400", hash_original_method = "12A862718040CD6821608ED594311F7C", hash_generated_method = "6AE5B91BBD4539E2C0CB5400526741ED")
    public BigInteger getIterationCount() {
        BigInteger varB4EAC82CA7396A68D541C85D26508E83_1936015267 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1936015267 = iterations.getValue();
        varB4EAC82CA7396A68D541C85D26508E83_1936015267.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1936015267;
        // ---------- Original Method ----------
        //return iterations.getValue();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:19.585 -0400", hash_original_method = "54CCD4EF015960D2546AD9BCFDF4FA17", hash_generated_method = "8CDD0611E26279EA128E8EEF8E500383")
    public byte[] getSalt() {
        byte[] varD7F29CD46F35607CF852AA4F2D245CDC_307957820 = (salt.getOctets());
        byte[] var2F9C81BC6E497382285CD6B7A7E33DE1_957206522 = {getTaintByte()};
        return var2F9C81BC6E497382285CD6B7A7E33DE1_957206522;
        // ---------- Original Method ----------
        //return salt.getOctets();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:19.586 -0400", hash_original_method = "0DB5FC3A2AA27196084301AD64A15FCF", hash_generated_method = "44F00B73DB03BAD35C7FFE3DC7F554EE")
    public DERObject toASN1Object() {
        DERObject varB4EAC82CA7396A68D541C85D26508E83_1492421357 = null; //Variable for return #1
        ASN1EncodableVector v;
        v = new ASN1EncodableVector();
        v.add(salt);
        v.add(iterations);
        varB4EAC82CA7396A68D541C85D26508E83_1492421357 = new DERSequence(v);
        varB4EAC82CA7396A68D541C85D26508E83_1492421357.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1492421357;
        // ---------- Original Method ----------
        //ASN1EncodableVector  v = new ASN1EncodableVector();
        //v.add(salt);
        //v.add(iterations);
        //return new DERSequence(v);
    }

    
}

