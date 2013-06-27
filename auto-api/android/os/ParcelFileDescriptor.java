package android.os;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.Socket;

public class ParcelFileDescriptor implements Parcelable {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:28.056 -0400", hash_original_field = "D118306A98C1E7C12AA828417A60A6F6", hash_generated_field = "58A1B3A123725E48931BD35C0EB2D4CB")

    private FileDescriptor mFileDescriptor;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:28.056 -0400", hash_original_field = "C15A1B081B66F38188E926501ED5F8A7", hash_generated_field = "BD690B26D5468868AFAF08CAFB003D2A")

    private boolean mClosed;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:28.056 -0400", hash_original_field = "7CE9BC3451B021C57B703C29E2527A74", hash_generated_field = "9AA0DA752DD4578B6A205C30B394DEF2")

    private ParcelFileDescriptor mParcelDescriptor;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:28.074 -0400", hash_original_method = "DB42A2A8BBE574C2950DCEEDDCE79B62", hash_generated_method = "0D84580F8C4180A00E40F7A16F093250")
    public  ParcelFileDescriptor(ParcelFileDescriptor descriptor) {
        super();
        mParcelDescriptor = descriptor;
        mFileDescriptor = mParcelDescriptor.mFileDescriptor;
        // ---------- Original Method ----------
        //mParcelDescriptor = descriptor;
        //mFileDescriptor = mParcelDescriptor.mFileDescriptor;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:28.075 -0400", hash_original_method = "5987A31E1ECCB1911B1BA6CC4EEF72A2", hash_generated_method = "BCE3644BB6151AF5EE3D1F08790C958A")
      ParcelFileDescriptor(FileDescriptor descriptor) {
        super();
        {
            if (DroidSafeAndroidRuntime.control) throw new NullPointerException("descriptor must not be null");
        } //End block
        mFileDescriptor = descriptor;
        mParcelDescriptor = null;
        // ---------- Original Method ----------
        //if (descriptor == null) {
            //throw new NullPointerException("descriptor must not be null");
        //}
        //mFileDescriptor = descriptor;
        //mParcelDescriptor = null;
    }

    
        public static ParcelFileDescriptor open(File file, int mode) throws FileNotFoundException {
        String path = file.getPath();
        SecurityManager security = System.getSecurityManager();
        if (security != null) {
            security.checkRead(path);
            if ((mode&MODE_WRITE_ONLY) != 0) {
                security.checkWrite(path);
            }
        }
        if ((mode&MODE_READ_WRITE) == 0) {
            throw new IllegalArgumentException(
                    "Must specify MODE_READ_ONLY, MODE_WRITE_ONLY, or MODE_READ_WRITE");
        }
        FileDescriptor fd = Parcel.openFileDescriptor(path, mode);
        return fd != null ? new ParcelFileDescriptor(fd) : null;
    }

    
        public static ParcelFileDescriptor dup(FileDescriptor orig) throws IOException {
        FileDescriptor fd = Parcel.dupFileDescriptor(orig);
        return fd != null ? new ParcelFileDescriptor(fd) : null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:28.083 -0400", hash_original_method = "474327607EE56B056BCE4043FE865D8B", hash_generated_method = "A296FE6261D8D8A779AD54DE12627905")
    public ParcelFileDescriptor dup() throws IOException {
        ParcelFileDescriptor varB4EAC82CA7396A68D541C85D26508E83_1614284350 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1614284350 = dup(getFileDescriptor());
        varB4EAC82CA7396A68D541C85D26508E83_1614284350.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1614284350;
        // ---------- Original Method ----------
        //return dup(getFileDescriptor());
    }

    
        public static ParcelFileDescriptor fromFd(int fd) throws IOException {
        FileDescriptor fdesc = getFileDescriptorFromFd(fd);
        return new ParcelFileDescriptor(fdesc);
    }

    
        private static FileDescriptor getFileDescriptorFromFd(int fd) throws IOException {
        //DSFIXME:  CODE0012: Native static method requires manual modeling
    }

    
        public static ParcelFileDescriptor adoptFd(int fd) {
        FileDescriptor fdesc = getFileDescriptorFromFdNoDup(fd);
        return new ParcelFileDescriptor(fdesc);
    }

    
        private static FileDescriptor getFileDescriptorFromFdNoDup(int fd) {
        //DSFIXME:  CODE0012: Native static method requires manual modeling
    }

    
        public static ParcelFileDescriptor fromSocket(Socket socket) {
        FileDescriptor fd = socket.getFileDescriptor$();
        return fd != null ? new ParcelFileDescriptor(fd) : null;
    }

    
        public static ParcelFileDescriptor fromDatagramSocket(DatagramSocket datagramSocket) {
        FileDescriptor fd = datagramSocket.getFileDescriptor$();
        return fd != null ? new ParcelFileDescriptor(fd) : null;
    }

    
        public static ParcelFileDescriptor[] createPipe() throws IOException {
        FileDescriptor[] fds = new FileDescriptor[2];
        createPipeNative(fds);
        ParcelFileDescriptor[] pfds = new ParcelFileDescriptor[2];
        pfds[0] = new ParcelFileDescriptor(fds[0]);
        pfds[1] = new ParcelFileDescriptor(fds[1]);
        return pfds;
    }

    
        private static void createPipeNative(FileDescriptor[] outFds) throws IOException {
    }

    
        @Deprecated
    public static ParcelFileDescriptor fromData(byte[] data, String name) throws IOException {
        if (data == null) return null;
        MemoryFile file = new MemoryFile(name, data.length);
        if (data.length > 0) {
            file.writeBytes(data, 0, 0, data.length);
        }
        file.deactivate();
        FileDescriptor fd = file.getFileDescriptor();
        return fd != null ? new ParcelFileDescriptor(fd) : null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:28.103 -0400", hash_original_method = "949276D2764A2C9DACACDE44898698C8", hash_generated_method = "268F020DFF750D0575DAF0589FF63DD7")
    public FileDescriptor getFileDescriptor() {
        FileDescriptor varB4EAC82CA7396A68D541C85D26508E83_7688731 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_7688731 = mFileDescriptor;
        varB4EAC82CA7396A68D541C85D26508E83_7688731.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_7688731;
        // ---------- Original Method ----------
        //return mFileDescriptor;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:28.103 -0400", hash_original_method = "77F816B0B1C349FF3A8882E701737452", hash_generated_method = "2F65ACD5ABB4E751FEB8A3B745DFE06E")
    public long getStatSize() {
        long var0F5264038205EDFB1AC05FBB0E8C5E94_1364851518 = getTaintLong();
        return var0F5264038205EDFB1AC05FBB0E8C5E94_1364851518;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:28.103 -0400", hash_original_method = "0F9A3950A7A9E5BB31D919F8BB19673E", hash_generated_method = "4B560BFF9A26DAA2551F8DB1EAD85022")
    public long seekTo(long pos) {
        long var0F5264038205EDFB1AC05FBB0E8C5E94_1386027276 = getTaintLong();
        return var0F5264038205EDFB1AC05FBB0E8C5E94_1386027276;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:28.104 -0400", hash_original_method = "C747587E89EFBC650597F209F149B598", hash_generated_method = "85EDA5A022F4475E59EB4429EC22328D")
    public int getFd() {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalStateException("Already closed");
        } //End block
        int var751A6E18182434738AFEB29212FB434D_1605216948 = (getFdNative());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_724972183 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_724972183;
        // ---------- Original Method ----------
        //if (mClosed) {
            //throw new IllegalStateException("Already closed");
        //}
        //return getFdNative();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:28.104 -0400", hash_original_method = "48F8D374A617845984C88F484B28408C", hash_generated_method = "6ECB964799F46010FCB0A28526E7AC3D")
    private int getFdNative() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_990364725 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_990364725;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:28.107 -0400", hash_original_method = "AECA8304F263BE3AD120D5996456D31E", hash_generated_method = "630D6AB9B42928DD795C5A4CAD247599")
    public int detachFd() {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalStateException("Already closed");
        } //End block
        {
            int fd;
            fd = mParcelDescriptor.detachFd();
            mClosed = true;
        } //End block
        int fd;
        fd = getFd();
        mClosed = true;
        Parcel.clearFileDescriptor(mFileDescriptor);
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_668027464 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_668027464;
        // ---------- Original Method ----------
        //if (mClosed) {
            //throw new IllegalStateException("Already closed");
        //}
        //if (mParcelDescriptor != null) {
            //int fd = mParcelDescriptor.detachFd();
            //mClosed = true;
            //return fd;
        //}
        //int fd = getFd();
        //mClosed = true;
        //Parcel.clearFileDescriptor(mFileDescriptor);
        //return fd;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:28.108 -0400", hash_original_method = "39939000D7522F3E727F0E3243089AE5", hash_generated_method = "C93AE2836E4766793DDE4FD6C28D9C61")
    public void close() throws IOException {
        {
            mClosed = true;
        } //End block
        {
            mParcelDescriptor.close();
        } //End block
        {
            Parcel.closeFileDescriptor(mFileDescriptor);
        } //End block
        // ---------- Original Method ----------
        //synchronized (this) {
            //if (mClosed) return;
            //mClosed = true;
        //}
        //if (mParcelDescriptor != null) {
            //mParcelDescriptor.close();
        //} else {
            //Parcel.closeFileDescriptor(mFileDescriptor);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:28.125 -0400", hash_original_method = "BA9513A0FEF5B159A730B41F75EA216A", hash_generated_method = "64EE2A73A32A090949A04BBCA7043405")
    @Override
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_271439335 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_271439335 = "{ParcelFileDescriptor: " + mFileDescriptor + "}";
        varB4EAC82CA7396A68D541C85D26508E83_271439335.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_271439335;
        // ---------- Original Method ----------
        //return "{ParcelFileDescriptor: " + mFileDescriptor + "}";
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:28.126 -0400", hash_original_method = "47AC631E45892E7E44A62B81BC7ACB91", hash_generated_method = "5BFFCB83F2EFF1414AF3C5F71AB87D6E")
    @Override
    protected void finalize() throws Throwable {
        try 
        {
            {
                close();
            } //End block
        } //End block
        finally 
        {
            super.finalize();
        } //End block
        // ---------- Original Method ----------
        //try {
            //if (!mClosed) {
                //close();
            //}
        //} finally {
            //super.finalize();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:28.126 -0400", hash_original_method = "5C5A30224996A2D414D9176559E683A9", hash_generated_method = "BB962F87454E1412A58CE4094DD96C79")
    public int describeContents() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1958445068 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1958445068;
        // ---------- Original Method ----------
        //return Parcelable.CONTENTS_FILE_DESCRIPTOR;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:28.127 -0400", hash_original_method = "D9382402A3E15CFE2B7948813716CC7C", hash_generated_method = "A4060D8882E09B4E89CBADE79B077B5E")
    public void writeToParcel(Parcel out, int flags) {
        out.writeFileDescriptor(mFileDescriptor);
        {
            try 
            {
                close();
            } //End block
            catch (IOException e)
            { }
        } //End block
        addTaint(out.getTaint());
        addTaint(flags);
        // ---------- Original Method ----------
        //out.writeFileDescriptor(mFileDescriptor);
        //if ((flags&PARCELABLE_WRITE_RETURN_VALUE) != 0 && !mClosed) {
            //try {
                //close();
            //} catch (IOException e) {
            //}
        //}
    }

    
    public static class AutoCloseInputStream extends FileInputStream {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:28.146 -0400", hash_original_field = "E2307FD862BA74C9C9C26ACA0B7E5364", hash_generated_field = "AE959CCFA06A07F93FA2A8BEED883021")

        private ParcelFileDescriptor mFd;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:28.147 -0400", hash_original_method = "E3D4E7E6DEAE42263A4A251652766597", hash_generated_method = "4971668D7654AFFF55B2DDD509DBD7E3")
        public  AutoCloseInputStream(ParcelFileDescriptor fd) {
            super(fd.getFileDescriptor());
            mFd = fd;
            // ---------- Original Method ----------
            //mFd = fd;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:28.154 -0400", hash_original_method = "3297019645A62F287411C53B25C33F9A", hash_generated_method = "64EED0A8F37058D0517D6328F7FEB62F")
        @Override
        public void close() throws IOException {
            try 
            {
                mFd.close();
            } //End block
            finally 
            {
                super.close();
            } //End block
            // ---------- Original Method ----------
            //try {
                //mFd.close();
            //} finally {
                //super.close();
            //}
        }

        
    }


    
    public static class AutoCloseOutputStream extends FileOutputStream {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:28.155 -0400", hash_original_field = "E2307FD862BA74C9C9C26ACA0B7E5364", hash_generated_field = "AE959CCFA06A07F93FA2A8BEED883021")

        private ParcelFileDescriptor mFd;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:28.156 -0400", hash_original_method = "AC6B0F3765CD3D3DD6495992ADDCA299", hash_generated_method = "3519A8D63370D6208317BADE5496D9F6")
        public  AutoCloseOutputStream(ParcelFileDescriptor fd) {
            super(fd.getFileDescriptor());
            mFd = fd;
            // ---------- Original Method ----------
            //mFd = fd;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:28.156 -0400", hash_original_method = "3297019645A62F287411C53B25C33F9A", hash_generated_method = "64EED0A8F37058D0517D6328F7FEB62F")
        @Override
        public void close() throws IOException {
            try 
            {
                mFd.close();
            } //End block
            finally 
            {
                super.close();
            } //End block
            // ---------- Original Method ----------
            //try {
                //mFd.close();
            //} finally {
                //super.close();
            //}
        }

        
    }


    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:28.156 -0400", hash_original_field = "BA2BAC1F18752DA00A4F6572A504B359", hash_generated_field = "3A425E25D2158592F4B71395B73ABA48")

    public static final int MODE_WORLD_READABLE = 0x00000001;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:28.156 -0400", hash_original_field = "17D2B2ED3DC4B3B97CA172345DAD8657", hash_generated_field = "F70FF863E9B85A3B3C75BCAF712387C6")

    public static final int MODE_WORLD_WRITEABLE = 0x00000002;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:28.156 -0400", hash_original_field = "315D150280C704F0621DA42B7EABEA77", hash_generated_field = "6B866752AF78022533961EAFEC48BF90")

    public static final int MODE_READ_ONLY = 0x10000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:28.156 -0400", hash_original_field = "264C60EDCCFAB2B0358041AC33FEEE6B", hash_generated_field = "EE8DCC6B27D46EC2ED14ABA75E7783AA")

    public static final int MODE_WRITE_ONLY = 0x20000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:28.156 -0400", hash_original_field = "48FA6B9BAC27C5E37C2AC15B73BEB0F5", hash_generated_field = "6494B31AC04BF207173A1DA805A4DC2B")

    public static final int MODE_READ_WRITE = 0x30000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:28.156 -0400", hash_original_field = "64F9E90F65FFACE62B2054906BA03800", hash_generated_field = "C6F7880235FE436C915681552C8587CE")

    public static final int MODE_CREATE = 0x08000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:28.157 -0400", hash_original_field = "7507DA721AE1A637B2BABAD93D9F8266", hash_generated_field = "2EC651F48C0C7F452AF49E37006FEB27")

    public static final int MODE_TRUNCATE = 0x04000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:28.157 -0400", hash_original_field = "8E4ACDF6D243F49EEB6EAAF3B5A6BCCA", hash_generated_field = "299AF71922C12BCCD82076F57034ABBF")

    public static final int MODE_APPEND = 0x02000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:28.157 -0400", hash_original_field = "195ED69EAF088F7FA956DC093526DC53", hash_generated_field = "DA358939EDE4BFAAAF0FF49DA63A85F3")

    public static final Parcelable.Creator<ParcelFileDescriptor> CREATOR
            = new Parcelable.Creator<ParcelFileDescriptor>() {
        public ParcelFileDescriptor createFromParcel(Parcel in) {
            return in.readFileDescriptor();
        }
        public ParcelFileDescriptor[] newArray(int size) {
            return new ParcelFileDescriptor[size];
        }
    };
}

