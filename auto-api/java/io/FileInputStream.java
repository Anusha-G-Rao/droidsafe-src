package java.io;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import dalvik.system.CloseGuard;
import java.nio.NioUtils;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import libcore.io.ErrnoException;
import libcore.io.IoBridge;
import libcore.io.IoUtils;
import libcore.io.Libcore;
import libcore.io.Streams;
import static libcore.io.OsConstants.*;

public class FileInputStream extends InputStream implements Closeable {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:37.839 -0400", hash_original_field = "36EBA1E1E343279857EA7F69A597324E", hash_generated_field = "B11DAE17AB1D35227E8CB61CED7BC01D")

    private FileDescriptor fd;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:37.839 -0400", hash_original_field = "B9CEC40C2FA6FEB503BDD2E3E1AC4947", hash_generated_field = "84D2D8F04948CA1C168D3A3584462F87")

    private boolean shouldClose;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:37.839 -0400", hash_original_field = "C485D2ED5CC4CE64FCCCCA710C7A0BB7", hash_generated_field = "D2F54CF06A6D02676AAD3B9CA4DD4532")

    private FileChannel channel;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:37.840 -0400", hash_original_field = "73ABE739BEC4C3DB38D39FA43D36469F", hash_generated_field = "2D38C9B39338C5B15F94E3339CE63B3F")

    private CloseGuard guard = CloseGuard.get();
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:37.841 -0400", hash_original_method = "1BD49D518996D312C80F5CC2297619D7", hash_generated_method = "8F99C8DCDA594C0DBA1526DD21F66F0E")
    public  FileInputStream(File file) throws FileNotFoundException {
        {
            if (DroidSafeAndroidRuntime.control) throw new NullPointerException("file == null");
        } //End block
        this.fd = IoBridge.open(file.getAbsolutePath(), O_RDONLY);
        this.shouldClose = true;
        guard.open("close");
        // ---------- Original Method ----------
        //if (file == null) {
            //throw new NullPointerException("file == null");
        //}
        //this.fd = IoBridge.open(file.getAbsolutePath(), O_RDONLY);
        //this.shouldClose = true;
        //guard.open("close");
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:37.841 -0400", hash_original_method = "9A99F3F0C17344BC7A4198604236E89C", hash_generated_method = "D4321F3322982F3D7ACFF0337B8EDCAF")
    public  FileInputStream(FileDescriptor fd) {
        {
            if (DroidSafeAndroidRuntime.control) throw new NullPointerException("fd == null");
        } //End block
        this.fd = fd;
        this.shouldClose = false;
        // ---------- Original Method ----------
        //if (fd == null) {
            //throw new NullPointerException("fd == null");
        //}
        //this.fd = fd;
        //this.shouldClose = false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:37.842 -0400", hash_original_method = "3B135756B4C06BFF0359EE9E41EEDC20", hash_generated_method = "09BF0DBCFC9F6A5C54384ECD46733983")
    public  FileInputStream(String path) throws FileNotFoundException {
        this(new File(path));
        addTaint(path.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:37.842 -0400", hash_original_method = "EBD7B964937B6AA7FA3657DA1AAC30BC", hash_generated_method = "A2F194601EE6C5540F780ED6C6F0934C")
    @Override
    public int available() throws IOException {
        int var9C891A36C646640680B2116257EF3205_414200482 = (IoBridge.available(fd));
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_927213366 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_927213366;
        // ---------- Original Method ----------
        //return IoBridge.available(fd);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:37.846 -0400", hash_original_method = "F8E8B4DFEA301034B0C9D2DA47B66D8A", hash_generated_method = "CA7B11D8D9D676C2D46C3747A0F9596F")
    @Override
    public void close() throws IOException {
        guard.close();
        {
            {
                channel.close();
            } //End block
            {
                IoUtils.close(fd);
            } //End block
            {
                fd = new FileDescriptor();
            } //End block
        } //End block
        // ---------- Original Method ----------
        //guard.close();
        //synchronized (this) {
            //if (channel != null) {
                //channel.close();
            //}
            //if (shouldClose) {
                //IoUtils.close(fd);
            //} else {
                //fd = new FileDescriptor();
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:37.858 -0400", hash_original_method = "5577B21C22C8702738A871739D038C15", hash_generated_method = "65066866CC4C814D801C4B4403AC35AE")
    @Override
    protected void finalize() throws IOException {
        try 
        {
            {
                guard.warnIfOpen();
            } //End block
            close();
        } //End block
        finally 
        {
            try 
            {
                super.finalize();
            } //End block
            catch (Throwable t)
            {
                if (DroidSafeAndroidRuntime.control) throw new AssertionError(t);
            } //End block
        } //End block
        // ---------- Original Method ----------
        //try {
            //if (guard != null) {
                //guard.warnIfOpen();
            //}
            //close();
        //} finally {
            //try {
                //super.finalize();
            //} catch (Throwable t) {
                //throw new AssertionError(t);
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:37.859 -0400", hash_original_method = "BB4E25A77FBA5E31003F6019B5643EE2", hash_generated_method = "D3108D0CC590EF90A88324DFA1FC09B8")
    public FileChannel getChannel() {
        FileChannel varB4EAC82CA7396A68D541C85D26508E83_723077293 = null; //Variable for return #1
        {
            {
                channel = NioUtils.newFileChannel(this, fd, O_RDONLY);
            } //End block
            varB4EAC82CA7396A68D541C85D26508E83_723077293 = channel;
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_723077293.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_723077293;
        // ---------- Original Method ----------
        //synchronized (this) {
            //if (channel == null) {
                //channel = NioUtils.newFileChannel(this, fd, O_RDONLY);
            //}
            //return channel;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:37.860 -0400", hash_original_method = "7178DA6FA6DD367775EBAB657FD1BDA0", hash_generated_method = "42C87C0D0D64B3A336066FA72B9D923C")
    public final FileDescriptor getFD() throws IOException {
        FileDescriptor varB4EAC82CA7396A68D541C85D26508E83_252035106 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_252035106 = fd;
        varB4EAC82CA7396A68D541C85D26508E83_252035106.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_252035106;
        // ---------- Original Method ----------
        //return fd;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:37.861 -0400", hash_original_method = "DEBABCFB0D5C81DCE0E37961227F43C9", hash_generated_method = "CA7855BA7C0F23F139284DC138A9A4EA")
    @Override
    public int read() throws IOException {
        int var5941BF1153E2E81479FC3BECE4E461FF_856825414 = (Streams.readSingleByte(this));
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_169063369 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_169063369;
        // ---------- Original Method ----------
        //return Streams.readSingleByte(this);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:37.861 -0400", hash_original_method = "C5A4FB68C0A55B7975F40A4160EB1CAC", hash_generated_method = "2B2DDCC80F2E9C251C8DF4D06DAEA92C")
    @Override
    public int read(byte[] buffer, int byteOffset, int byteCount) throws IOException {
        int varA119A82C704C62A3513B82F79810D9CB_1132928545 = (IoBridge.read(fd, buffer, byteOffset, byteCount));
        addTaint(buffer[0]);
        addTaint(byteOffset);
        addTaint(byteCount);
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_382574962 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_382574962;
        // ---------- Original Method ----------
        //return IoBridge.read(fd, buffer, byteOffset, byteCount);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:37.868 -0400", hash_original_method = "4138A4F75DA401A9AB2AB0F0CF384113", hash_generated_method = "3A62911965913A56B950D80C3F156909")
    @Override
    public long skip(long byteCount) throws IOException {
        {
            if (DroidSafeAndroidRuntime.control) throw new IOException("byteCount < 0: " + byteCount);
        } //End block
        try 
        {
            Libcore.os.lseek(fd, byteCount, SEEK_CUR);
        } //End block
        catch (ErrnoException errnoException)
        {
            {
                long var4A2E40941A54551A3C4ADC5C3F68F40B_1154137218 = (super.skip(byteCount));
            } //End block
            if (DroidSafeAndroidRuntime.control) throw errnoException.rethrowAsIOException();
        } //End block
        addTaint(byteCount);
        long var0F5264038205EDFB1AC05FBB0E8C5E94_301663372 = getTaintLong();
        return var0F5264038205EDFB1AC05FBB0E8C5E94_301663372;
        // ---------- Original Method ----------
        //if (byteCount < 0) {
            //throw new IOException("byteCount < 0: " + byteCount);
        //}
        //try {
            //Libcore.os.lseek(fd, byteCount, SEEK_CUR);
            //return byteCount;
        //} catch (ErrnoException errnoException) {
            //if (errnoException.errno == ESPIPE) {
                //return super.skip(byteCount);
            //}
            //throw errnoException.rethrowAsIOException();
        //}
    }

    
}

