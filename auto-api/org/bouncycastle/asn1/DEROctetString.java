package org.bouncycastle.asn1;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.IOException;

public class DEROctetString extends ASN1OctetString {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:19.170 -0400", hash_original_method = "3336CFEFF4BF2C133797CC5732C4278D", hash_generated_method = "55E10A9027C26741CA350E2B8D2C37B2")
    public  DEROctetString(
        byte[]  string) {
        super(string);
        addTaint(string[0]);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:19.171 -0400", hash_original_method = "233295F4410DDA4CBE3EEAAA15D96B59", hash_generated_method = "DA8270FD014C701DDAD0999A66B20776")
    public  DEROctetString(
        DEREncodable  obj) {
        super(obj);
        addTaint(obj.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:19.171 -0400", hash_original_method = "88699FAFA7E37B1C694783679D50E3CD", hash_generated_method = "617B43E2106CC35A9725E2C6BA33B484")
     void encode(
        DEROutputStream out) throws IOException {
        out.writeEncoded(OCTET_STRING, string);
        addTaint(out.getTaint());
        // ---------- Original Method ----------
        //out.writeEncoded(OCTET_STRING, string);
    }

    
        static void encode(
        DEROutputStream derOut,
        byte[]          bytes) throws IOException {
        derOut.writeEncoded(DERTags.OCTET_STRING, bytes);
    }

    
}

