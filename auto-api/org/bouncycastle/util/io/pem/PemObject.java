package org.bouncycastle.util.io.pem;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PemObject implements PemObjectGenerator {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:21.924 -0400", hash_original_field = "599DCCE2998A6B40B1E38E8C6006CB0A", hash_generated_field = "AB2C9E2EF2C4EBDBF6BF18A679B45B62")

    private String type;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:21.924 -0400", hash_original_field = "4340FD73E75DF7A9D9E45902A59BA3A4", hash_generated_field = "144EBE63A318E4E8C50ABA547D9431E1")

    private List headers;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:21.927 -0400", hash_original_field = "9A0364B9E99BB480DD25E1F0284C8555", hash_generated_field = "2AFA79670796B1E0B73AB75D7B8465D5")

    private byte[] content;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:21.931 -0400", hash_original_method = "E8E4F9BE36AC2F3679718F77E354BD1D", hash_generated_method = "B14EFFAD78A4A74F863F66794B97F24A")
    public  PemObject(String type, byte[] content) {
        this(type, EMPTY_LIST, content);
        addTaint(type.getTaint());
        addTaint(content[0]);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:21.931 -0400", hash_original_method = "A9F012093AAD72893A58BFC7BE174583", hash_generated_method = "56CA7597FDF3C3B709648C340A79F765")
    public  PemObject(String type, List headers, byte[] content) {
        this.type = type;
        this.headers = Collections.unmodifiableList(headers);
        this.content = content;
        // ---------- Original Method ----------
        //this.type = type;
        //this.headers = Collections.unmodifiableList(headers);
        //this.content = content;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:21.934 -0400", hash_original_method = "0E0B07C7C3039087C9D268CAF8DACC19", hash_generated_method = "2ED384A6D097C230E0491BEFF02C59E9")
    public String getType() {
        String varB4EAC82CA7396A68D541C85D26508E83_542529363 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_542529363 = type;
        varB4EAC82CA7396A68D541C85D26508E83_542529363.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_542529363;
        // ---------- Original Method ----------
        //return type;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:21.935 -0400", hash_original_method = "7A0337E547AB2E290525371E494B1A30", hash_generated_method = "9C4AA2783E89B6935C7B122343148B35")
    public List getHeaders() {
        List varB4EAC82CA7396A68D541C85D26508E83_224186631 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_224186631 = headers;
        varB4EAC82CA7396A68D541C85D26508E83_224186631.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_224186631;
        // ---------- Original Method ----------
        //return headers;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:21.935 -0400", hash_original_method = "CA0902D8AF35560815DA28546D2C787A", hash_generated_method = "7443A1055013150C3390C8075FBF5CE8")
    public byte[] getContent() {
        byte[] var2F9C81BC6E497382285CD6B7A7E33DE1_1509592816 = {getTaintByte()};
        return var2F9C81BC6E497382285CD6B7A7E33DE1_1509592816;
        // ---------- Original Method ----------
        //return content;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:21.946 -0400", hash_original_method = "E898D78DBFB1F3FB89A6D402FC0A6D27", hash_generated_method = "9C132D646AE438D4E72ECFCB0119C5D6")
    public PemObject generate() throws PemGenerationException {
        PemObject varB4EAC82CA7396A68D541C85D26508E83_1823995484 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1823995484 = this;
        varB4EAC82CA7396A68D541C85D26508E83_1823995484.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1823995484;
        // ---------- Original Method ----------
        //return this;
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:21.946 -0400", hash_original_field = "5D4B6FC0D382A15BAE3F1DA051A09980", hash_generated_field = "C7AC98161E15453735A8D89AAFEE507A")

    private static List EMPTY_LIST = Collections.unmodifiableList(new ArrayList());
}

