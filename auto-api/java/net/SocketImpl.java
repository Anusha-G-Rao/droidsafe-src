package java.net;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class SocketImpl implements SocketOptions {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:42.968 -0400", hash_original_field = "884D9804999FC47A3C2694E49AD2536A", hash_generated_field = "3EF85E4B8326DFDFB5F1248DB5848FBE")

    protected InetAddress address;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:42.968 -0400", hash_original_field = "901555FB06E346CB065CEB9808DCFC25", hash_generated_field = "C021A045CC358C8C262F3483738B3278")

    protected int port;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:42.968 -0400", hash_original_field = "36EBA1E1E343279857EA7F69A597324E", hash_generated_field = "22B1DDEE70BE0A6499271C452045F538")

    protected FileDescriptor fd;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:42.968 -0400", hash_original_field = "F7439E9867FD6BB737D74ED95E5B79AC", hash_generated_field = "ACF030B7409F7B39EDB4C92454C3B34B")

    protected int localport;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:42.968 -0400", hash_original_method = "64E339C1199B48FCA9D5B6162E68A4EE", hash_generated_method = "64E339C1199B48FCA9D5B6162E68A4EE")
    public SocketImpl ()
    {
        //Synthesized constructor
    }


    protected abstract void accept(SocketImpl newSocket) throws IOException;

    
    protected abstract int available() throws IOException;

    
    protected abstract void bind(InetAddress address, int port) throws IOException;

    
    protected abstract void close() throws IOException;

    
    protected abstract void connect(String host, int port) throws IOException;

    
    protected abstract void connect(InetAddress address, int port)
            throws IOException;

    
    protected abstract void create(boolean isStreaming) throws IOException;

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:42.982 -0400", hash_original_method = "C1B4172ED9A628993584DE4384B8AF55", hash_generated_method = "DF9BF3328508C132F10A29766323F301")
    protected FileDescriptor getFileDescriptor() {
        FileDescriptor varB4EAC82CA7396A68D541C85D26508E83_538081657 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_538081657 = fd;
        varB4EAC82CA7396A68D541C85D26508E83_538081657.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_538081657;
        // ---------- Original Method ----------
        //return fd;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:42.983 -0400", hash_original_method = "D80DA3748C8C317EA54CA4C7D2D15552", hash_generated_method = "A70B4FB49EA5CFD8829980EAFB06AD21")
    public FileDescriptor getFD$() {
        FileDescriptor varB4EAC82CA7396A68D541C85D26508E83_832040939 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_832040939 = fd;
        varB4EAC82CA7396A68D541C85D26508E83_832040939.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_832040939;
        // ---------- Original Method ----------
        //return fd;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:42.983 -0400", hash_original_method = "9059089CB1C35AC3C53D636B58746A1E", hash_generated_method = "02FA560C0B18FB922E38ADF707F85849")
    protected InetAddress getInetAddress() {
        InetAddress varB4EAC82CA7396A68D541C85D26508E83_232026078 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_232026078 = address;
        varB4EAC82CA7396A68D541C85D26508E83_232026078.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_232026078;
        // ---------- Original Method ----------
        //return address;
    }

    
    protected abstract InputStream getInputStream() throws IOException;

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:42.984 -0400", hash_original_method = "01F8313D57DE36AB40371D3553F872FB", hash_generated_method = "C55174EC29536224AC9CE604A86E4099")
    protected int getLocalPort() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_316371108 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_316371108;
        // ---------- Original Method ----------
        //return localport;
    }

    
    protected abstract OutputStream getOutputStream() throws IOException;

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:42.984 -0400", hash_original_method = "A5F7344FAECBE0D6DB15D1F6E7BEBC6E", hash_generated_method = "DB3ABB0DAD434A323E18BAD75FD66E78")
    protected int getPort() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_391471952 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_391471952;
        // ---------- Original Method ----------
        //return port;
    }

    
    protected abstract void listen(int backlog) throws IOException;

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:42.985 -0400", hash_original_method = "2E2A133215115434551D3BB5177B3CB7", hash_generated_method = "8DAD7EEC940E9F3EEA0187D78B24D181")
    @Override
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_1989666338 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1989666338 = "Socket[address=" + getInetAddress() +
                ",port=" + port + ",localPort=" + getLocalPort() + "]";
        varB4EAC82CA7396A68D541C85D26508E83_1989666338.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1989666338;
        // ---------- Original Method ----------
        //return "Socket[address=" + getInetAddress() +
                //",port=" + port + ",localPort=" + getLocalPort() + "]";
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:42.998 -0400", hash_original_method = "A81CC3909CCB8928C92493E5F4DBFE10", hash_generated_method = "E925D0506737B4FCC481BAFB05C06DE4")
    protected void shutdownInput() throws IOException {
        if (DroidSafeAndroidRuntime.control) throw new IOException("Method has not been implemented");
        // ---------- Original Method ----------
        //throw new IOException("Method has not been implemented");
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:42.999 -0400", hash_original_method = "C4499DE00FFEC19A29C9ABDAA427CE4E", hash_generated_method = "80CD3DAEE0AF6832955738958B6D9929")
    protected void shutdownOutput() throws IOException {
        if (DroidSafeAndroidRuntime.control) throw new IOException("Method has not been implemented");
        // ---------- Original Method ----------
        //throw new IOException("Method has not been implemented");
    }

    
    protected abstract void connect(SocketAddress remoteAddr, int timeout) throws IOException;

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:42.999 -0400", hash_original_method = "84442B2358C6BD30716C7D72481FD8C4", hash_generated_method = "0AFEA219B5B71EEB1D34EF5305A31A0B")
    protected boolean supportsUrgentData() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_294425480 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_294425480;
        // ---------- Original Method ----------
        //return false;
    }

    
    protected abstract void sendUrgentData(int value) throws IOException;

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:42.999 -0400", hash_original_method = "EE4DCDA11944F25F3B6AAA6A92D8AD2F", hash_generated_method = "DE3FBC58BBCD34A45E35EAE18C0F93DA")
    protected void setPerformancePreferences(int connectionTime, int latency, int bandwidth) {
        addTaint(connectionTime);
        addTaint(latency);
        addTaint(bandwidth);
        // ---------- Original Method ----------
    }

    
}

