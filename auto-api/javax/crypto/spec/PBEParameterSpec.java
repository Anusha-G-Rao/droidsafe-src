package javax.crypto.spec;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.security.spec.AlgorithmParameterSpec;

public class PBEParameterSpec implements AlgorithmParameterSpec {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:59.961 -0400", hash_original_field = "CEB20772E0C9D240C75EB26B0E37ABEE", hash_generated_field = "8E8CA6A0D4A78C798E95C91BD86EA51C")

    private byte[] salt;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:59.961 -0400", hash_original_field = "40E092B298D076325C38C773B2D9BBAA", hash_generated_field = "98D2C6D733D1F0E9FD9E8AD73AA86C06")

    private int iterationCount;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:59.968 -0400", hash_original_method = "E4AD3F6E1F8504EC055E33BFD3FD6D04", hash_generated_method = "E087E647BF270273BCC3977DA04F99F5")
    public  PBEParameterSpec(byte[] salt, int iterationCount) {
        {
            if (DroidSafeAndroidRuntime.control) throw new NullPointerException("salt == null");
        } //End block
        this.salt = new byte[salt.length];
        System.arraycopy(salt, 0, this.salt, 0, salt.length);
        this.iterationCount = iterationCount;
        // ---------- Original Method ----------
        //if (salt == null) {
            //throw new NullPointerException("salt == null");
        //}
        //this.salt = new byte[salt.length];
        //System.arraycopy(salt, 0, this.salt, 0, salt.length);
        //this.iterationCount = iterationCount;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:59.968 -0400", hash_original_method = "DE7716C6003A9CBA24C4421C19D5F40E", hash_generated_method = "C6E409D7646D11A7D1496701EAA86B8A")
    public byte[] getSalt() {
        byte[] result;
        result = new byte[salt.length];
        System.arraycopy(salt, 0, result, 0, salt.length);
        byte[] var2F9C81BC6E497382285CD6B7A7E33DE1_1889248104 = {getTaintByte()};
        return var2F9C81BC6E497382285CD6B7A7E33DE1_1889248104;
        // ---------- Original Method ----------
        //byte[] result = new byte[salt.length];
        //System.arraycopy(salt, 0, result, 0, salt.length);
        //return result;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:59.972 -0400", hash_original_method = "3E24EA64DC831AAEDCCD9EAD88FFC369", hash_generated_method = "DA7651664AC8571F67A28DAD7CA5C523")
    public int getIterationCount() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_578681648 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_578681648;
        // ---------- Original Method ----------
        //return iterationCount;
    }

    
}

