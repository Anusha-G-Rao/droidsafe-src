package org.bouncycastle.asn1.x9;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DERSequence;

public class X9FieldID extends ASN1Encodable implements X9ObjectIdentifiers {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:20.465 -0400", hash_original_field = "B80BB7740288FDA1F201890375A60C8F", hash_generated_field = "C9026F3AA6576B332E83AF850E791F56")

    private DERObjectIdentifier id;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:20.465 -0400", hash_original_field = "166E64F6C3677D0C513901242A3E702D", hash_generated_field = "1557C13CB9AB38DEB6A065C70AD2F74E")

    private DERObject parameters;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:20.465 -0400", hash_original_method = "947D632CD3BB9C70FFB74606AF4AA65C", hash_generated_method = "336E537F452F8D6FB7E3AC232B57761F")
    public  X9FieldID(BigInteger primeP) {
        this.id = prime_field;
        this.parameters = new DERInteger(primeP);
        // ---------- Original Method ----------
        //this.id = prime_field;
        //this.parameters = new DERInteger(primeP);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:20.466 -0400", hash_original_method = "E68F2B5FEB9AA2D283212DC970B04168", hash_generated_method = "60A669307E939FD6EF343C5108646992")
    public  X9FieldID(int m, int k1, int k2, int k3) {
        this.id = characteristic_two_field;
        ASN1EncodableVector fieldIdParams;
        fieldIdParams = new ASN1EncodableVector();
        fieldIdParams.add(new DERInteger(m));
        {
            fieldIdParams.add(tpBasis);
            fieldIdParams.add(new DERInteger(k1));
        } //End block
        {
            fieldIdParams.add(ppBasis);
            ASN1EncodableVector pentanomialParams;
            pentanomialParams = new ASN1EncodableVector();
            pentanomialParams.add(new DERInteger(k1));
            pentanomialParams.add(new DERInteger(k2));
            pentanomialParams.add(new DERInteger(k3));
            fieldIdParams.add(new DERSequence(pentanomialParams));
        } //End block
        this.parameters = new DERSequence(fieldIdParams);
        addTaint(m);
        addTaint(k1);
        addTaint(k2);
        addTaint(k3);
        // ---------- Original Method ----------
        //this.id = characteristic_two_field;
        //ASN1EncodableVector fieldIdParams = new ASN1EncodableVector();
        //fieldIdParams.add(new DERInteger(m));
        //if (k2 == 0) 
        //{
            //fieldIdParams.add(tpBasis);
            //fieldIdParams.add(new DERInteger(k1));
        //} 
        //else 
        //{
            //fieldIdParams.add(ppBasis);
            //ASN1EncodableVector pentanomialParams = new ASN1EncodableVector();
            //pentanomialParams.add(new DERInteger(k1));
            //pentanomialParams.add(new DERInteger(k2));
            //pentanomialParams.add(new DERInteger(k3));
            //fieldIdParams.add(new DERSequence(pentanomialParams));
        //}
        //this.parameters = new DERSequence(fieldIdParams);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:20.466 -0400", hash_original_method = "DE0F1786B89D9192DA26A23CD26B072E", hash_generated_method = "EC736FBE556FC79705AF65DDF77AD0A8")
    public  X9FieldID(
        ASN1Sequence  seq) {
        this.id = (DERObjectIdentifier)seq.getObjectAt(0);
        this.parameters = (DERObject)seq.getObjectAt(1);
        // ---------- Original Method ----------
        //this.id = (DERObjectIdentifier)seq.getObjectAt(0);
        //this.parameters = (DERObject)seq.getObjectAt(1);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:20.467 -0400", hash_original_method = "A03C04E1D63CA4FFA1D88D7678177C2A", hash_generated_method = "2494C3053C07398A8D7CE66A7429F2B7")
    public DERObjectIdentifier getIdentifier() {
        DERObjectIdentifier varB4EAC82CA7396A68D541C85D26508E83_555397593 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_555397593 = id;
        varB4EAC82CA7396A68D541C85D26508E83_555397593.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_555397593;
        // ---------- Original Method ----------
        //return id;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:20.467 -0400", hash_original_method = "1898F00B5F10CC32C939404F88AE77E4", hash_generated_method = "0141B195280B197FFF3FCBF6AFF82C35")
    public DERObject getParameters() {
        DERObject varB4EAC82CA7396A68D541C85D26508E83_1536588042 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1536588042 = parameters;
        varB4EAC82CA7396A68D541C85D26508E83_1536588042.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1536588042;
        // ---------- Original Method ----------
        //return parameters;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:20.468 -0400", hash_original_method = "F64CE532B89E0DF8480CF348DC73F510", hash_generated_method = "42621ED6A605C024A098452C042E8106")
    public DERObject toASN1Object() {
        DERObject varB4EAC82CA7396A68D541C85D26508E83_1214670056 = null; //Variable for return #1
        ASN1EncodableVector v;
        v = new ASN1EncodableVector();
        v.add(this.id);
        v.add(this.parameters);
        varB4EAC82CA7396A68D541C85D26508E83_1214670056 = new DERSequence(v);
        varB4EAC82CA7396A68D541C85D26508E83_1214670056.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1214670056;
        // ---------- Original Method ----------
        //ASN1EncodableVector v = new ASN1EncodableVector();
        //v.add(this.id);
        //v.add(this.parameters);
        //return new DERSequence(v);
    }

    
}

