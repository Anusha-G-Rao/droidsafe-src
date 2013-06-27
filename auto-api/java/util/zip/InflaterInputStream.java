package java.util.zip;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import libcore.io.Streams;

public class InflaterInputStream extends FilterInputStream {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:59.604 -0400", hash_original_field = "EE7B630995E7A36B6420696989441E2D", hash_generated_field = "1E4B81450D564B8A8EB02BC28E6E6C0F")

    protected Inflater inf;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:59.604 -0400", hash_original_field = "CB7E52B21171FB9A53B498202607F0BD", hash_generated_field = "083037218D1B4F9535944A48D3FD1BCA")

    protected byte[] buf;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:59.604 -0400", hash_original_field = "F5A8E923F8CD24B56B3BAB32358CC58A", hash_generated_field = "5D5995101D8A63DD862FB3CCC8ECEF3F")

    protected int len;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:59.604 -0400", hash_original_field = "349E686330723975502E9EF4F939A5AC", hash_generated_field = "0B6D06FC66AB1A3316E7702989E3F923")

    boolean closed;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:59.604 -0400", hash_original_field = "2E51B1AB42E8A4A67F3445174BE5191B", hash_generated_field = "F63D5C2A3218247517725999753A7A52")

    boolean eof;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:59.604 -0400", hash_original_field = "8C71006A0A17320CD77ACB1DAD80DE7B", hash_generated_field = "7E70FEE52575958CC96A2F34CB55F620")

    int nativeEndBufSize = 0;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:59.606 -0400", hash_original_method = "E5B01AC162409617460AC7C3F79F7BB2", hash_generated_method = "11FC9829F371C62B2D8E7DBEDEBCF710")
    public  InflaterInputStream(InputStream is) {
        this(is, new Inflater(), BUF_SIZE);
        addTaint(is.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:59.606 -0400", hash_original_method = "FFCF6E0CDA6D7391850CE9D2857BF932", hash_generated_method = "DC5EC952F355E00DAED4FF42FBEE1D4A")
    public  InflaterInputStream(InputStream is, Inflater inflater) {
        this(is, inflater, BUF_SIZE);
        addTaint(is.getTaint());
        addTaint(inflater.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:59.607 -0400", hash_original_method = "C80CB7FC71CBD6181B9FF475CD694AFF", hash_generated_method = "C55AED601B835190C03CF3B653C6039A")
    public  InflaterInputStream(InputStream is, Inflater inflater, int bsize) {
        super(is);
        {
            if (DroidSafeAndroidRuntime.control) throw new NullPointerException();
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException();
        } //End block
        this.inf = inflater;
        {
            nativeEndBufSize = bsize;
        } //End block
        {
            buf = new byte[bsize];
        } //End block
        addTaint(is.getTaint());
        // ---------- Original Method ----------
        //if (is == null || inflater == null) {
            //throw new NullPointerException();
        //}
        //if (bsize <= 0) {
            //throw new IllegalArgumentException();
        //}
        //this.inf = inflater;
        //if (is instanceof ZipFile.RAFStream) {
            //nativeEndBufSize = bsize;
        //} else {
            //buf = new byte[bsize];
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:59.611 -0400", hash_original_method = "DEBABCFB0D5C81DCE0E37961227F43C9", hash_generated_method = "79152EC7968FC73A3F664B421C33EF1C")
    @Override
    public int read() throws IOException {
        int var5941BF1153E2E81479FC3BECE4E461FF_1717908319 = (Streams.readSingleByte(this));
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1150345088 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1150345088;
        // ---------- Original Method ----------
        //return Streams.readSingleByte(this);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:59.626 -0400", hash_original_method = "DE515D2D289FDA03BF01DDF0E0AD6AE1", hash_generated_method = "AAC7DDF26AE85F5A8C163A9E3DEEE5DC")
    @Override
    public int read(byte[] buffer, int offset, int byteCount) throws IOException {
        checkClosed();
        Arrays.checkOffsetAndCount(buffer.length, offset, byteCount);
        {
            {
                boolean var1A5A145F098DD1F555879555CE369339_93974399 = (inf.needsInput());
                {
                    fill();
                } //End block
            } //End collapsed parenthetic
            try 
            {
                int result;
                result = inf.inflate(buffer, offset, byteCount);
                eof = inf.finished();
                {
                    boolean var7BCCDB7D901E7D3A1DF620C3DD5F899C_1901868862 = (inf.needsDictionary());
                    {
                        eof = true;
                    } //End block
                    {
                        eof = true;
                        if (DroidSafeAndroidRuntime.control) throw new EOFException();
                    } //End block
                } //End collapsed parenthetic
            } //End block
            catch (DataFormatException e)
            {
                eof = true;
                {
                    if (DroidSafeAndroidRuntime.control) throw new EOFException();
                } //End block
                if (DroidSafeAndroidRuntime.control) throw (IOException) (new IOException().initCause(e));
            } //End block
        } //End block
        addTaint(buffer[0]);
        addTaint(offset);
        addTaint(byteCount);
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1272526636 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1272526636;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:59.628 -0400", hash_original_method = "92AAFAE1121490A2E461EB88A6DC741C", hash_generated_method = "730E4B6B7E0A00649F4A611C0C3A4896")
    protected void fill() throws IOException {
        checkClosed();
        {
            ZipFile.RAFStream is;
            is = (ZipFile.RAFStream)in;
            {
                long len;
                len = is.mLength - is.mOffset;
                len = nativeEndBufSize;
                int cnt;
                cnt = inf.setFileInput(is.mSharedRaf.getFD(), is.mOffset, nativeEndBufSize);
                is.skip(cnt);
            } //End block
        } //End block
        {
            {
                boolean var24AC157EF1A0A7950280F7E056FDB23C_1368911341 = ((len = in.read(buf)) > 0);
                {
                    inf.setInput(buf, 0, len);
                } //End block
            } //End collapsed parenthetic
        } //End block
        // ---------- Original Method ----------
        //checkClosed();
        //if (nativeEndBufSize > 0) {
            //ZipFile.RAFStream is = (ZipFile.RAFStream)in;
            //synchronized (is.mSharedRaf) {
                //long len = is.mLength - is.mOffset;
                //if (len > nativeEndBufSize) len = nativeEndBufSize;
                //int cnt = inf.setFileInput(is.mSharedRaf.getFD(), is.mOffset, nativeEndBufSize);
                //is.skip(cnt);
            //}
        //} else {
            //if ((len = in.read(buf)) > 0) {
                //inf.setInput(buf, 0, len);
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:59.640 -0400", hash_original_method = "A9123C6756DDC4D0ED42EE705B1E650B", hash_generated_method = "445B997CC1C9DB1ED59F3537D94ADAE9")
    @Override
    public long skip(long byteCount) throws IOException {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("byteCount < 0");
        } //End block
        long var242616A7471CF01D821614D0D0C41129_1552659869 = (Streams.skipByReading(this, byteCount));
        addTaint(byteCount);
        long var0F5264038205EDFB1AC05FBB0E8C5E94_1910233019 = getTaintLong();
        return var0F5264038205EDFB1AC05FBB0E8C5E94_1910233019;
        // ---------- Original Method ----------
        //if (byteCount < 0) {
            //throw new IllegalArgumentException("byteCount < 0");
        //}
        //return Streams.skipByReading(this, byteCount);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:59.641 -0400", hash_original_method = "CA27A6E1F269DA8120632D3AC729E489", hash_generated_method = "76B8F62400B1E9BD83B8A9BC43E2D0C5")
    @Override
    public int available() throws IOException {
        checkClosed();
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_661914118 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_661914118;
        // ---------- Original Method ----------
        //checkClosed();
        //if (eof) {
            //return 0;
        //}
        //return 1;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:59.642 -0400", hash_original_method = "EA60532C802B6FAE0DE9014BA74F497F", hash_generated_method = "08938E98150C81F0A8FCB3BCD6A8821B")
    @Override
    public void close() throws IOException {
        {
            inf.end();
            closed = true;
            eof = true;
            super.close();
        } //End block
        // ---------- Original Method ----------
        //if (!closed) {
            //inf.end();
            //closed = true;
            //eof = true;
            //super.close();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:59.672 -0400", hash_original_method = "99EDC8CF58ACEFC383E40E1B1F253896", hash_generated_method = "374E02FA36CE7C442AE21827EF6D82FC")
    @Override
    public void mark(int readlimit) {
        addTaint(readlimit);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:59.673 -0400", hash_original_method = "B2B0ACE34E24898AD20F33154DDE5ADD", hash_generated_method = "A9C0F826408505F69F969DEF2E274553")
    @Override
    public void reset() throws IOException {
        if (DroidSafeAndroidRuntime.control) throw new IOException();
        // ---------- Original Method ----------
        //throw new IOException();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:59.673 -0400", hash_original_method = "12DAC0CE56878A53F37AFF65E12010EB", hash_generated_method = "4A956F9086BA62794C2337BECB77123D")
    @Override
    public boolean markSupported() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_107391332 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_107391332;
        // ---------- Original Method ----------
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:59.673 -0400", hash_original_method = "249965AABC06DCB5B5F50760C9E2C49A", hash_generated_method = "6CFA37B07466A20BDBB88E064EBD8E21")
    private void checkClosed() throws IOException {
        {
            if (DroidSafeAndroidRuntime.control) throw new IOException("Stream is closed");
        } //End block
        // ---------- Original Method ----------
        //if (closed) {
            //throw new IOException("Stream is closed");
        //}
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:59.673 -0400", hash_original_field = "D1C827DB9A3BDE870AF89553E76D4553", hash_generated_field = "9880536815CC2F93011C070CDDEA4810")

    static int BUF_SIZE = 512;
}

