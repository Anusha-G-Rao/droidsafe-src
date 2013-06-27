package java.net;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.IOException;
import java.nio.channels.ServerSocketChannel;

public class ServerSocket {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:42.948 -0400", hash_original_field = "86CCEC3D9FF0E9C0514506E982CDC08B", hash_generated_field = "E5435F593B4B4C544AAC5D578CFF6639")

    private SocketImpl impl;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:42.948 -0400", hash_original_field = "8E4D35088206920061AAF7F347854388", hash_generated_field = "C0B93BC213B673FF2E47783C561E2823")

    private boolean isBound;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:42.948 -0400", hash_original_field = "7587750400D3C39AEAD7C1489F6FE7F3", hash_generated_field = "61C76B683BBEFCB5006250611D355A94")

    private boolean isClosed;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:42.958 -0400", hash_original_method = "31BB74D5896D397B1327C5B34E5CB836", hash_generated_method = "CC783DD97FFEF08036B1A4D90EFE45DF")
    public  ServerSocket() throws IOException {
        this.impl = factory != null ? factory.createSocketImpl()
                : new PlainServerSocketImpl();
        impl.create(true);
        // ---------- Original Method ----------
        //this.impl = factory != null ? factory.createSocketImpl()
                //: new PlainServerSocketImpl();
        //impl.create(true);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:42.958 -0400", hash_original_method = "17E5A7EAB5FF74551872A5C22051BFB5", hash_generated_method = "8188B0E7B9ACD2CC1652950807628542")
    public  ServerSocket(int port) throws IOException {
        this(port, DEFAULT_BACKLOG, Inet4Address.ANY);
        addTaint(port);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:42.958 -0400", hash_original_method = "B81C30D251B31CAFF71CF07C7882EF32", hash_generated_method = "F0AE178AE604AD8B8649389E2A81D277")
    public  ServerSocket(int port, int backlog) throws IOException {
        this(port, backlog, Inet4Address.ANY);
        addTaint(port);
        addTaint(backlog);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:42.970 -0400", hash_original_method = "6BB36DC8E15E305D7407A47C7739996C", hash_generated_method = "8D2E13A6A82513C911966AE4610C2C7E")
    public  ServerSocket(int port, int backlog, InetAddress localAddress) throws IOException {
        checkListen(port);
        this.impl = factory != null ? factory.createSocketImpl()
                : new PlainServerSocketImpl();
        InetAddress addr;
        addr = Inet4Address.ANY;
        addr = localAddress;
        {
            impl.create(true);
            try 
            {
                impl.bind(addr, port);
                isBound = true;
                impl.listen(backlog > 0 ? backlog : DEFAULT_BACKLOG);
            } //End block
            catch (IOException e)
            {
                close();
                if (DroidSafeAndroidRuntime.control) throw e;
            } //End block
        } //End block
        addTaint(port);
        addTaint(backlog);
        addTaint(localAddress.getTaint());
        // ---------- Original Method ----------
        //checkListen(port);
        //this.impl = factory != null ? factory.createSocketImpl()
                //: new PlainServerSocketImpl();
        //InetAddress addr = (localAddress == null) ? Inet4Address.ANY : localAddress;
        //synchronized (this) {
            //impl.create(true);
            //try {
                //impl.bind(addr, port);
                //isBound = true;
                //impl.listen(backlog > 0 ? backlog : DEFAULT_BACKLOG);
            //} catch (IOException e) {
                //close();
                //throw e;
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:42.971 -0400", hash_original_method = "847F07D140851DC7DF04F3DA230B7EED", hash_generated_method = "0CCB3D42F8B6293D6E6CDF72FB4B2704")
    public SocketImpl getImpl$() {
        SocketImpl varB4EAC82CA7396A68D541C85D26508E83_2075191365 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_2075191365 = impl;
        varB4EAC82CA7396A68D541C85D26508E83_2075191365.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_2075191365;
        // ---------- Original Method ----------
        //return impl;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:42.971 -0400", hash_original_method = "DE0153D2AABFEE83527E2EAC5D1F68DF", hash_generated_method = "A85A89FF16D9D62FF38FFACC1169FDC9")
    public Socket accept() throws IOException {
        Socket varB4EAC82CA7396A68D541C85D26508E83_1016932303 = null; //Variable for return #1
        checkOpen();
        {
            boolean var13C5778A8A7AC802C9965161944F9D76_1617264364 = (!isBound());
            {
                if (DroidSafeAndroidRuntime.control) throw new SocketException("Socket is not bound");
            } //End block
        } //End collapsed parenthetic
        Socket aSocket;
        aSocket = new Socket();
        try 
        {
            implAccept(aSocket);
        } //End block
        catch (IOException e)
        {
            aSocket.close();
            if (DroidSafeAndroidRuntime.control) throw e;
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1016932303 = aSocket;
        varB4EAC82CA7396A68D541C85D26508E83_1016932303.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1016932303;
        // ---------- Original Method ----------
        //checkOpen();
        //if (!isBound()) {
            //throw new SocketException("Socket is not bound");
        //}
        //Socket aSocket = new Socket();
        //try {
            //implAccept(aSocket);
        //} catch (IOException e) {
            //aSocket.close();
            //throw e;
        //}
        //return aSocket;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:42.973 -0400", hash_original_method = "C273B8F533783A3DE90657F5715801E0", hash_generated_method = "0C56E3FDAF8D797D3DCDEFE5047DA8AD")
    private void checkListen(int aPort) {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Port out of range: " + aPort);
        } //End block
        addTaint(aPort);
        // ---------- Original Method ----------
        //if (aPort < 0 || aPort > 65535) {
            //throw new IllegalArgumentException("Port out of range: " + aPort);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:42.973 -0400", hash_original_method = "8636C7CEC5FFD33F6CBF2C75F9E6A135", hash_generated_method = "09C692F3B9ABE75F75305B3C4044C0D5")
    public void close() throws IOException {
        isClosed = true;
        impl.close();
        // ---------- Original Method ----------
        //isClosed = true;
        //impl.close();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:42.987 -0400", hash_original_method = "0AAA019638F2B2CC41FFEEEB4E260F6C", hash_generated_method = "70831417F5831540F9837239AB08DAA6")
    public InetAddress getInetAddress() {
        InetAddress varB4EAC82CA7396A68D541C85D26508E83_1567995280 = null; //Variable for return #1
        InetAddress varB4EAC82CA7396A68D541C85D26508E83_891156250 = null; //Variable for return #2
        {
            boolean var13C5778A8A7AC802C9965161944F9D76_1848312211 = (!isBound());
            {
                varB4EAC82CA7396A68D541C85D26508E83_1567995280 = null;
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_891156250 = impl.getInetAddress();
        InetAddress varA7E53CE21691AB073D9660D615818899_1759039876; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1759039876 = varB4EAC82CA7396A68D541C85D26508E83_1567995280;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1759039876 = varB4EAC82CA7396A68D541C85D26508E83_891156250;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1759039876.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1759039876;
        // ---------- Original Method ----------
        //if (!isBound()) {
            //return null;
        //}
        //return impl.getInetAddress();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:42.987 -0400", hash_original_method = "F5BB694DF3469EBFBD82064FFB1FEAE0", hash_generated_method = "C62E8F7EA504ED3E4DD422428A27F450")
    public int getLocalPort() {
        {
            boolean var13C5778A8A7AC802C9965161944F9D76_890306769 = (!isBound());
        } //End collapsed parenthetic
        int var5201144B0B742B3A152781D672D1AA30_1986562527 = (impl.getLocalPort());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1461028753 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1461028753;
        // ---------- Original Method ----------
        //if (!isBound()) {
            //return -1;
        //}
        //return impl.getLocalPort();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:42.987 -0400", hash_original_method = "37BE74568AC5DDD629C634B42E81BFFA", hash_generated_method = "5B0B549C9EF0E3F5982E4DE2853E5E8F")
    public synchronized int getSoTimeout() throws IOException {
        checkOpen();
        int var97D6E04E407212E66322CDB8618B167A_737532854 = (((Integer) impl.getOption(SocketOptions.SO_TIMEOUT)).intValue());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_947517843 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_947517843;
        // ---------- Original Method ----------
        //checkOpen();
        //return ((Integer) impl.getOption(SocketOptions.SO_TIMEOUT)).intValue();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:43.000 -0400", hash_original_method = "BFFC5C44CB4D0AB53035D05D9EAC93F6", hash_generated_method = "6CC5BC16237DC902354AC0A460666FF0")
    protected final void implAccept(Socket aSocket) throws IOException {
        {
            impl.accept(aSocket.impl);
            aSocket.accepted();
        } //End block
        addTaint(aSocket.getTaint());
        // ---------- Original Method ----------
        //synchronized (this) {
            //impl.accept(aSocket.impl);
            //aSocket.accepted();
        //}
    }

    
        public static synchronized void setSocketFactory(SocketImplFactory aFactory) throws IOException {
        if (factory != null) {
            throw new SocketException("Factory already set");
        }
        factory = aFactory;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:43.001 -0400", hash_original_method = "E2A5F03981AB4BF932E59A553E83FA6F", hash_generated_method = "715987126166DD9C37EE215B53FACCCF")
    public synchronized void setSoTimeout(int timeout) throws SocketException {
        checkOpen();
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("timeout < 0");
        } //End block
        impl.setOption(SocketOptions.SO_TIMEOUT, Integer.valueOf(timeout));
        addTaint(timeout);
        // ---------- Original Method ----------
        //checkOpen();
        //if (timeout < 0) {
            //throw new IllegalArgumentException("timeout < 0");
        //}
        //impl.setOption(SocketOptions.SO_TIMEOUT, Integer.valueOf(timeout));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:43.002 -0400", hash_original_method = "577ACC2D572353EA5861EB3648159EF5", hash_generated_method = "39F26FC23608B2271A7725F43260B217")
    @Override
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_2109947143 = null; //Variable for return #1
        String varB4EAC82CA7396A68D541C85D26508E83_921204898 = null; //Variable for return #2
        StringBuilder result;
        result = new StringBuilder(64);
        result.append("ServerSocket[");
        {
            boolean var13C5778A8A7AC802C9965161944F9D76_212353191 = (!isBound());
            {
                varB4EAC82CA7396A68D541C85D26508E83_2109947143 = result.append("unbound]").toString();
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_921204898 = result.append("addr=")
                .append(getInetAddress().getHostName()).append("/")
                .append(getInetAddress().getHostAddress()).append(
                        ",port=0,localport=")
                .append(getLocalPort()).append("]")
                .toString();
        String varA7E53CE21691AB073D9660D615818899_972566133; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_972566133 = varB4EAC82CA7396A68D541C85D26508E83_2109947143;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_972566133 = varB4EAC82CA7396A68D541C85D26508E83_921204898;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_972566133.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_972566133;
        // ---------- Original Method ----------
        //StringBuilder result = new StringBuilder(64);
        //result.append("ServerSocket[");
        //if (!isBound()) {
            //return result.append("unbound]").toString();
        //}
        //return result.append("addr=")
                //.append(getInetAddress().getHostName()).append("/")
                //.append(getInetAddress().getHostAddress()).append(
                        //",port=0,localport=")
                //.append(getLocalPort()).append("]")
                //.toString();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:43.002 -0400", hash_original_method = "AB1F91AE5F8F2B3C00C4EDCF73D5B4D1", hash_generated_method = "2CAD37934CCBAF068B5EDB43E7CA5E1C")
    public void bind(SocketAddress localAddr) throws IOException {
        bind(localAddr, DEFAULT_BACKLOG);
        addTaint(localAddr.getTaint());
        // ---------- Original Method ----------
        //bind(localAddr, DEFAULT_BACKLOG);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:43.003 -0400", hash_original_method = "684D242B2EA0BE4D55F437B908E9CC5D", hash_generated_method = "118953B63D85EED26194AF647B5ED6C4")
    public void bind(SocketAddress localAddr, int backlog) throws IOException {
        checkOpen();
        {
            boolean var508204320144CEB3F447DE9CCDB64480_1409095293 = (isBound());
            {
                if (DroidSafeAndroidRuntime.control) throw new BindException("Socket is already bound");
            } //End block
        } //End collapsed parenthetic
        int port;
        port = 0;
        InetAddress addr;
        addr = Inet4Address.ANY;
        {
            {
                if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Local address not an InetSocketAddress: " +
                        localAddr.getClass());
            } //End block
            InetSocketAddress inetAddr;
            inetAddr = (InetSocketAddress) localAddr;
            {
                boolean varC74AE0463916E813FB227E6D8242C56F_1850295979 = ((addr = inetAddr.getAddress()) == null);
                {
                    if (DroidSafeAndroidRuntime.control) throw new SocketException("Host is unresolved: " + inetAddr.getHostName());
                } //End block
            } //End collapsed parenthetic
            port = inetAddr.getPort();
        } //End block
        {
            try 
            {
                impl.bind(addr, port);
                isBound = true;
                impl.listen(backlog > 0 ? backlog : DEFAULT_BACKLOG);
            } //End block
            catch (IOException e)
            {
                close();
                if (DroidSafeAndroidRuntime.control) throw e;
            } //End block
        } //End block
        addTaint(localAddr.getTaint());
        addTaint(backlog);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:43.010 -0400", hash_original_method = "7AD76537AA5A3220834213189640F2E9", hash_generated_method = "A8E1F76FA3F1563A49D736D749912626")
    public SocketAddress getLocalSocketAddress() {
        SocketAddress varB4EAC82CA7396A68D541C85D26508E83_1736126727 = null; //Variable for return #1
        SocketAddress varB4EAC82CA7396A68D541C85D26508E83_1995321589 = null; //Variable for return #2
        {
            boolean var13C5778A8A7AC802C9965161944F9D76_61687847 = (!isBound());
            {
                varB4EAC82CA7396A68D541C85D26508E83_1736126727 = null;
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_1995321589 = new InetSocketAddress(getInetAddress(), getLocalPort());
        SocketAddress varA7E53CE21691AB073D9660D615818899_152650723; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_152650723 = varB4EAC82CA7396A68D541C85D26508E83_1736126727;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_152650723 = varB4EAC82CA7396A68D541C85D26508E83_1995321589;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_152650723.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_152650723;
        // ---------- Original Method ----------
        //if (!isBound()) {
            //return null;
        //}
        //return new InetSocketAddress(getInetAddress(), getLocalPort());
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:43.015 -0400", hash_original_method = "589AFDD4CA6BF38ABB5F59E26BB3DC6D", hash_generated_method = "1858F22142AF928371E5361A92CC6A3A")
    public boolean isBound() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1672924037 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1672924037;
        // ---------- Original Method ----------
        //return isBound;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:43.015 -0400", hash_original_method = "2EEDDDEB8BA1CD500E3647BC397BF54F", hash_generated_method = "D13464A15B60FFD785E7D0EF858D761E")
    public boolean isClosed() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1796487635 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1796487635;
        // ---------- Original Method ----------
        //return isClosed;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:43.018 -0400", hash_original_method = "8DC54C39C6445BAF3181407C830C5887", hash_generated_method = "50BCE705B226AFBF234C33896EC695A3")
    private void checkOpen() throws SocketException {
        {
            boolean varF463C9E3EC09CF3DDC0E11AE27E5A7FD_1289391095 = (isClosed());
            {
                if (DroidSafeAndroidRuntime.control) throw new SocketException("Socket is closed");
            } //End block
        } //End collapsed parenthetic
        // ---------- Original Method ----------
        //if (isClosed()) {
            //throw new SocketException("Socket is closed");
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:43.018 -0400", hash_original_method = "D6CD69E67882E49578E557811A0FC457", hash_generated_method = "FC3E7A197DB1A0060F368E39CFC6FAA6")
    public void setReuseAddress(boolean reuse) throws SocketException {
        checkOpen();
        impl.setOption(SocketOptions.SO_REUSEADDR, Boolean.valueOf(reuse));
        addTaint(reuse);
        // ---------- Original Method ----------
        //checkOpen();
        //impl.setOption(SocketOptions.SO_REUSEADDR, Boolean.valueOf(reuse));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:43.018 -0400", hash_original_method = "8920D58954E3583481E89192EF874E86", hash_generated_method = "1DA54AFF38E3F71B48516501DD0CAA2C")
    public boolean getReuseAddress() throws SocketException {
        checkOpen();
        boolean var92F4A5EAF76459C680E3D19F2BDB3A81_1139253914 = (((Boolean) impl.getOption(SocketOptions.SO_REUSEADDR)).booleanValue());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1311581234 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1311581234;
        // ---------- Original Method ----------
        //checkOpen();
        //return ((Boolean) impl.getOption(SocketOptions.SO_REUSEADDR)).booleanValue();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:43.019 -0400", hash_original_method = "4A5F0E88940F2B7162C81724AB1FDFE4", hash_generated_method = "A9C53F0A23EF3A99BACC3D6A19C71CF7")
    public void setReceiveBufferSize(int size) throws SocketException {
        checkOpen();
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("size < 1");
        } //End block
        impl.setOption(SocketOptions.SO_RCVBUF, Integer.valueOf(size));
        addTaint(size);
        // ---------- Original Method ----------
        //checkOpen();
        //if (size < 1) {
            //throw new IllegalArgumentException("size < 1");
        //}
        //impl.setOption(SocketOptions.SO_RCVBUF, Integer.valueOf(size));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:43.019 -0400", hash_original_method = "1025A74ACDCA065D38BE1D18813D43DB", hash_generated_method = "63E451C451D598B5EEA24C46BD4E2D69")
    public int getReceiveBufferSize() throws SocketException {
        checkOpen();
        int var879D57EDA18A262547327AC0C51A7315_1185691071 = (((Integer) impl.getOption(SocketOptions.SO_RCVBUF)).intValue());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_470099651 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_470099651;
        // ---------- Original Method ----------
        //checkOpen();
        //return ((Integer) impl.getOption(SocketOptions.SO_RCVBUF)).intValue();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:43.038 -0400", hash_original_method = "3D28E6253835634FC7711C1CE3F0C48B", hash_generated_method = "4B799F8A9D6EDD704A1700F83DEA656A")
    public ServerSocketChannel getChannel() {
        ServerSocketChannel varB4EAC82CA7396A68D541C85D26508E83_945205936 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_945205936 = null;
        varB4EAC82CA7396A68D541C85D26508E83_945205936.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_945205936;
        // ---------- Original Method ----------
        //return null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:43.038 -0400", hash_original_method = "EE4DCDA11944F25F3B6AAA6A92D8AD2F", hash_generated_method = "5BDBFA2FBDAEAD861B5CE7312955EF38")
    public void setPerformancePreferences(int connectionTime, int latency, int bandwidth) {
        addTaint(connectionTime);
        addTaint(latency);
        addTaint(bandwidth);
        // ---------- Original Method ----------
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:43.038 -0400", hash_original_field = "4E99CD0551993624E0E83995EFF618A2", hash_generated_field = "5BFDC68C88DD2978F3BF4EE614A2091B")

    private static int DEFAULT_BACKLOG = 50;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:43.038 -0400", hash_original_field = "9549DD6065D019211460C59A86DD6536", hash_generated_field = "10D4EEC45D11B59A6B6543CD9427385B")

    static SocketImplFactory factory;
}

