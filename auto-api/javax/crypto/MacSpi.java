package javax.crypto;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;

public abstract class MacSpi {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:59.853 -0400", hash_original_method = "EEBADA04ED7B15342A993162A4F56017", hash_generated_method = "8D6409E06ABF820FA39D434786DC17A2")
    public  MacSpi() {
        // ---------- Original Method ----------
    }

    
    protected abstract int engineGetMacLength();

    
    protected abstract void engineInit(Key key, AlgorithmParameterSpec params)
            throws InvalidKeyException, InvalidAlgorithmParameterException;

    
    protected abstract void engineUpdate(byte input);

    
    protected abstract void engineUpdate(byte[] input, int offset, int len);

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:59.873 -0400", hash_original_method = "7BFE449B7BFB03ADBCFF5433860FD67B", hash_generated_method = "8D4902E0632B86C76FE9DA2C37129A91")
    protected void engineUpdate(ByteBuffer input) {
        {
            boolean varE54245A319FB90E6E4BB7E9A96B716C3_2036556533 = (!input.hasRemaining());
        } //End collapsed parenthetic
        byte[] bInput;
        {
            boolean var011961AA1A198646CB962085FB0562D5_777710029 = (input.hasArray());
            {
                bInput = input.array();
                int offset;
                offset = input.arrayOffset();
                int position;
                position = input.position();
                int limit;
                limit = input.limit();
                engineUpdate(bInput, offset + position, limit - position);
                input.position(limit);
            } //End block
            {
                bInput = new byte[input.limit() - input.position()];
                input.get(bInput);
                engineUpdate(bInput, 0, bInput.length);
            } //End block
        } //End collapsed parenthetic
        addTaint(input.getTaint());
        // ---------- Original Method ----------
        //if (!input.hasRemaining()) {
            //return;
        //}
        //byte[] bInput;
        //if (input.hasArray()) {
            //bInput = input.array();
            //int offset = input.arrayOffset();
            //int position = input.position();
            //int limit = input.limit();
            //engineUpdate(bInput, offset + position, limit - position);
            //input.position(limit);
        //} else {
            //bInput = new byte[input.limit() - input.position()];
            //input.get(bInput);
            //engineUpdate(bInput, 0, bInput.length);
        //}
    }

    
    protected abstract byte[] engineDoFinal();

    
    protected abstract void engineReset();

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:59.875 -0400", hash_original_method = "66DEBDF0D0405CDDBB7BD5DED76064DF", hash_generated_method = "563660186F0651A1E339564966E1A117")
    @Override
    public Object clone() throws CloneNotSupportedException {
        Object varB4EAC82CA7396A68D541C85D26508E83_1789659196 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1789659196 = super.clone();
        varB4EAC82CA7396A68D541C85D26508E83_1789659196.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1789659196;
        // ---------- Original Method ----------
        //return super.clone();
    }

    
}

