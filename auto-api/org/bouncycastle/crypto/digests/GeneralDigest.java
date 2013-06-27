package org.bouncycastle.crypto.digests;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import org.bouncycastle.crypto.ExtendedDigest;

public abstract class GeneralDigest implements ExtendedDigest {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:20.520 -0400", hash_original_field = "5A6404CE8F44AE5DF2E1D4C64517E9F8", hash_generated_field = "143ABAB13B7522AC48A1AF414B584EA6")

    private byte[] xBuf;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:20.527 -0400", hash_original_field = "B73BD1BA6F9DE097A99C46DA8F84D3F3", hash_generated_field = "9944C954EBE5AE117A9CFE73E4199E45")

    private int xBufOff;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:20.527 -0400", hash_original_field = "A43EF6D60A83013EA1A61A23BDB16029", hash_generated_field = "D3F3DF2B8C683F433F8C23530F50C011")

    private long byteCount;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:20.528 -0400", hash_original_method = "33929E7FC3CB1C0A7849A234D0A1D124", hash_generated_method = "3BCCC318CDF45D232F759196E9A77067")
    protected  GeneralDigest() {
        xBuf = new byte[4];
        xBufOff = 0;
        // ---------- Original Method ----------
        //xBuf = new byte[4];
        //xBufOff = 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:20.528 -0400", hash_original_method = "4340B9306D0B5D5E85547023830EA78A", hash_generated_method = "67EDBC22BDA2573689E6C40DEDCB9A16")
    protected  GeneralDigest(GeneralDigest t) {
        xBuf = new byte[t.xBuf.length];
        System.arraycopy(t.xBuf, 0, xBuf, 0, t.xBuf.length);
        xBufOff = t.xBufOff;
        byteCount = t.byteCount;
        // ---------- Original Method ----------
        //xBuf = new byte[t.xBuf.length];
        //System.arraycopy(t.xBuf, 0, xBuf, 0, t.xBuf.length);
        //xBufOff = t.xBufOff;
        //byteCount = t.byteCount;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:20.529 -0400", hash_original_method = "40E7CDF1E9D122AF3862D5C54DFC78EC", hash_generated_method = "8C9314156960D780D1EEBDD820EEF1B5")
    public void update(
        byte in) {
        xBuf[xBufOff++] = in;
        {
            processWord(xBuf, 0);
            xBufOff = 0;
        } //End block
        // ---------- Original Method ----------
        //xBuf[xBufOff++] = in;
        //if (xBufOff == xBuf.length)
        //{
            //processWord(xBuf, 0);
            //xBufOff = 0;
        //}
        //byteCount++;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:20.533 -0400", hash_original_method = "F796363C15CB3EC49C76DC6C83402CDE", hash_generated_method = "1258AF33D2E03E299D9CB09E21B0974A")
    public void update(
        byte[]  in,
        int     inOff,
        int     len) {
        {
            update(in[inOff]);
        } //End block
        {
            processWord(in, inOff);
            inOff += xBuf.length;
            len -= xBuf.length;
            byteCount += xBuf.length;
        } //End block
        {
            update(in[inOff]);
        } //End block
        addTaint(in[0]);
        addTaint(inOff);
        addTaint(len);
        // ---------- Original Method ----------
        //while ((xBufOff != 0) && (len > 0))
        //{
            //update(in[inOff]);
            //inOff++;
            //len--;
        //}
        //while (len > xBuf.length)
        //{
            //processWord(in, inOff);
            //inOff += xBuf.length;
            //len -= xBuf.length;
            //byteCount += xBuf.length;
        //}
        //while (len > 0)
        //{
            //update(in[inOff]);
            //inOff++;
            //len--;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:20.534 -0400", hash_original_method = "E3BD506664D5291ACBDD4523D9F73924", hash_generated_method = "5981046DC241064897BE3E8EDC578379")
    public void finish() {
        long bitLength;
        bitLength = (byteCount << 3);
        update((byte)128);
        {
            update((byte)0);
        } //End block
        processLength(bitLength);
        processBlock();
        // ---------- Original Method ----------
        //long    bitLength = (byteCount << 3);
        //update((byte)128);
        //while (xBufOff != 0)
        //{
            //update((byte)0);
        //}
        //processLength(bitLength);
        //processBlock();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:20.534 -0400", hash_original_method = "60263393C79297CFA49BF4ADA6FCDD6D", hash_generated_method = "2DEACCC1396EE9AD952FF2508B5CAF88")
    public void reset() {
        byteCount = 0;
        xBufOff = 0;
        {
            int i;
            i = 0;
            {
                xBuf[i] = 0;
            } //End block
        } //End collapsed parenthetic
        // ---------- Original Method ----------
        //byteCount = 0;
        //xBufOff = 0;
        //for (int i = 0; i < xBuf.length; i++)
        //{
            //xBuf[i] = 0;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:20.535 -0400", hash_original_method = "BDE19E4C77B0F308FC4C95638A0B9303", hash_generated_method = "0F330AD7FEC7D2C4D98EDE27F1FAD593")
    public int getByteLength() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_54065909 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_54065909;
        // ---------- Original Method ----------
        //return BYTE_LENGTH;
    }

    
    protected abstract void processWord(byte[] in, int inOff);

    
    protected abstract void processLength(long bitLength);

    
    protected abstract void processBlock();

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:20.535 -0400", hash_original_field = "B0EAB7EE3DAF5A2E42173AFEFC2BFC30", hash_generated_field = "9CE22E437FA66F873361CAB2DB4C4C7B")

    private static int BYTE_LENGTH = 64;
}

