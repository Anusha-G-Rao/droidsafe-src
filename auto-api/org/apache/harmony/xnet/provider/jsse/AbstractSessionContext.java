package org.apache.harmony.xnet.provider.jsse;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import org.apache.harmony.security.provider.cert.X509CertImpl;

abstract class AbstractSessionContext implements SSLSessionContext {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:12.264 -0400", hash_original_field = "F7558008F30251ED687039538F2EE14F", hash_generated_field = "7A30EE95E508037D9FEE1354CEFAC193")

    volatile int maximumSize;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:12.264 -0400", hash_original_field = "90272DDA245AE1FB3CF197E91A8689DC", hash_generated_field = "66A9610107B22FE560E0442C7F3278C6")

    volatile int timeout;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:12.264 -0400", hash_original_field = "D010BAA5FA490CA90193AD7819E7A15C", hash_generated_field = "252155234ECFEA9B5523A07896E7063B")

    int sslCtxNativePointer = NativeCrypto.SSL_CTX_new();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:12.265 -0400", hash_original_field = "BA23DE027615123BDB3690D617C0A3EB", hash_generated_field = "F50F3A7F55EF223D4E5E3C5F3B0451D0")

    private Map<ByteArray, SSLSession> sessions = new LinkedHashMap<ByteArray, SSLSession>() {        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:12.265 -0400", hash_original_method = "50C1CC90C9158408C79488CFE262DC7E", hash_generated_method = "BCC5851B802896BE260EDE62B6B1514D")
        @Override
        protected boolean removeEldestEntry(
                Map.Entry<ByteArray, SSLSession> eldest) {
            boolean var952E6B41D9F0F5AC085097F04FB5925E_1378684805 = (maximumSize > 0 && size() > maximumSize);
            addTaint(eldest.getTaint());
            boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_898332136 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_898332136;
            // ---------- Original Method ----------
            //return maximumSize > 0 && size() > maximumSize;
        }

        
};
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:12.265 -0400", hash_original_method = "B86A9D4A1D1D4BFB528024933586DA07", hash_generated_method = "2BA638231C8AD53D155EB67E486801A1")
      AbstractSessionContext(int maximumSize, int timeout) {
        this.maximumSize = maximumSize;
        this.timeout = timeout;
        // ---------- Original Method ----------
        //this.maximumSize = maximumSize;
        //this.timeout = timeout;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:12.266 -0400", hash_original_method = "A58241B75AD2B44C3E74E917DCCEF491", hash_generated_method = "CC4361BCA13CFAFBD72E317E945FC9C6")
    private Iterator<SSLSession> sessionIterator() {
        Iterator<SSLSession> varB4EAC82CA7396A68D541C85D26508E83_182540034 = null; //Variable for return #1
        {
            SSLSession[] array;
            array = sessions.values().toArray(
                    new SSLSession[sessions.size()]);
            varB4EAC82CA7396A68D541C85D26508E83_182540034 = Arrays.asList(array).iterator();
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_182540034.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_182540034;
        // ---------- Original Method ----------
        //synchronized (sessions) {
            //SSLSession[] array = sessions.values().toArray(
                    //new SSLSession[sessions.size()]);
            //return Arrays.asList(array).iterator();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:12.266 -0400", hash_original_method = "106825D731C9327C3D7A99A6486CA67E", hash_generated_method = "385E2FD83A3EBA79D09B43BA589337AF")
    public final Enumeration getIds() {
        Enumeration varB4EAC82CA7396A68D541C85D26508E83_1642106554 = null; //Variable for return #1
        Iterator<SSLSession> i;
        i = sessionIterator();
        varB4EAC82CA7396A68D541C85D26508E83_1642106554 = new Enumeration<byte[]>() {
            private SSLSession next;
            public boolean hasMoreElements() {
                if (next != null) {
                    return true;
                }
                while (i.hasNext()) {
                    SSLSession session = i.next();
                    if (session.isValid()) {
                        next = session;
                        return true;
                    }
                }
                next = null;
                return false;
            }
            public byte[] nextElement() {
                if (hasMoreElements()) {
                    byte[] id = next.getId();
                    next = null;
                    return id;
                }
                throw new NoSuchElementException();
            }
        };
        varB4EAC82CA7396A68D541C85D26508E83_1642106554.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1642106554;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:12.281 -0400", hash_original_method = "D0015EDFECCAD43C3752A19176DA2F6D", hash_generated_method = "01C9F94FA2E87DC5C57CC9B59826BF47")
    public final int getSessionCacheSize() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1146890507 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1146890507;
        // ---------- Original Method ----------
        //return maximumSize;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:12.282 -0400", hash_original_method = "4FB73E0AB538272543472A54EAEE75CD", hash_generated_method = "F81955E010E062309A2098718D95167D")
    public final int getSessionTimeout() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_301942290 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_301942290;
        // ---------- Original Method ----------
        //return timeout;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:12.293 -0400", hash_original_method = "8615761B2210F074D79DA775AC19AA71", hash_generated_method = "8C4BCF3C8C09FA87E9E768219DF9DBD9")
    protected void trimToSize() {
        {
            int size;
            size = sessions.size();
            {
                int removals;
                removals = size - maximumSize;
                Iterator<SSLSession> i;
                i = sessions.values().iterator();
                {
                    SSLSession session;
                    session = i.next();
                    i.remove();
                    sessionRemoved(session);
                } //End block
            } //End block
        } //End block
        // ---------- Original Method ----------
        //synchronized (sessions) {
            //int size = sessions.size();
            //if (size > maximumSize) {
                //int removals = size - maximumSize;
                //Iterator<SSLSession> i = sessions.values().iterator();
                //do {
                    //SSLSession session = i.next();
                    //i.remove();
                    //sessionRemoved(session);
                //} while (--removals > 0);
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:12.294 -0400", hash_original_method = "39A7527C252FC67E9B785D11757CBC70", hash_generated_method = "E9C83236349D4124B083C42D3CAE5416")
    public void setSessionTimeout(int seconds) throws IllegalArgumentException {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("seconds < 0");
        } //End block
        timeout = seconds;
        {
            Iterator<SSLSession> i;
            i = sessions.values().iterator();
            {
                boolean varD8B5E52A597500CBD863E52A46B42708_2146060239 = (i.hasNext());
                {
                    SSLSession session;
                    session = i.next();
                    {
                        boolean var5781757318888F5EAFBBB43D777C1BE7_1467788900 = (!session.isValid());
                        {
                            i.remove();
                            sessionRemoved(session);
                        } //End block
                    } //End collapsed parenthetic
                } //End block
            } //End collapsed parenthetic
        } //End block
        // ---------- Original Method ----------
        //if (seconds < 0) {
            //throw new IllegalArgumentException("seconds < 0");
        //}
        //timeout = seconds;
        //synchronized (sessions) {
            //Iterator<SSLSession> i = sessions.values().iterator();
            //while (i.hasNext()) {
                //SSLSession session = i.next();
                //if (!session.isValid()) {
                    //i.remove();
                    //sessionRemoved(session);
                //}
            //}
        //}
    }

    
    protected abstract void sessionRemoved(SSLSession session);

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:12.295 -0400", hash_original_method = "ACCBBC1F3ACDB7C97A3E02614B766E1C", hash_generated_method = "7F1B476CBFDF7070049763E277C8D4F1")
    public final void setSessionCacheSize(int size) throws IllegalArgumentException {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("size < 0");
        } //End block
        int oldMaximum;
        oldMaximum = maximumSize;
        maximumSize = size;
        {
            trimToSize();
        } //End block
        // ---------- Original Method ----------
        //if (size < 0) {
            //throw new IllegalArgumentException("size < 0");
        //}
        //int oldMaximum = maximumSize;
        //maximumSize = size;
        //if (size < oldMaximum) {
            //trimToSize();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:12.397 -0400", hash_original_method = "B42ED13DCD08C26044D05FD9CDF469CF", hash_generated_method = "C91715DB3A4D34542C3740CC76D7EBDC")
     byte[] toBytes(SSLSession session) {
        OpenSSLSessionImpl sslSession;
        sslSession = (OpenSSLSessionImpl) session;
        try 
        {
            ByteArrayOutputStream baos;
            baos = new ByteArrayOutputStream();
            DataOutputStream daos;
            daos = new DataOutputStream(baos);
            daos.writeInt(OPEN_SSL);
            byte[] data;
            data = sslSession.getEncoded();
            daos.writeInt(data.length);
            daos.write(data);
            Certificate[] certs;
            certs = session.getPeerCertificates();
            daos.writeInt(certs.length);
            {
                Certificate cert = certs[0];
                {
                    data = cert.getEncoded();
                    daos.writeInt(data.length);
                    daos.write(data);
                } //End block
            } //End collapsed parenthetic
            byte[] var99E4F7F59DC442B21AA2E171B7120389_1120382197 = (baos.toByteArray());
        } //End block
        catch (IOException e)
        {
            log(e);
        } //End block
        catch (CertificateEncodingException e)
        {
            log(e);
        } //End block
        addTaint(session.getTaint());
        byte[] var2F9C81BC6E497382285CD6B7A7E33DE1_1491159602 = {getTaintByte()};
        return var2F9C81BC6E497382285CD6B7A7E33DE1_1491159602;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:12.398 -0400", hash_original_method = "1F6A50EAF05C581243DFC8EDF15FF940", hash_generated_method = "99727CCA70403C7894E34D5CBD298880")
     SSLSession toSession(byte[] data, String host, int port) {
        SSLSession varB4EAC82CA7396A68D541C85D26508E83_1417489475 = null; //Variable for return #1
        SSLSession varB4EAC82CA7396A68D541C85D26508E83_136138868 = null; //Variable for return #2
        SSLSession varB4EAC82CA7396A68D541C85D26508E83_693718938 = null; //Variable for return #3
        ByteArrayInputStream bais;
        bais = new ByteArrayInputStream(data);
        DataInputStream dais;
        dais = new DataInputStream(bais);
        try 
        {
            int type;
            type = dais.readInt();
            {
                log(new AssertionError("Unexpected type ID: " + type));
                varB4EAC82CA7396A68D541C85D26508E83_1417489475 = null;
            } //End block
            int length;
            length = dais.readInt();
            byte[] sessionData;
            sessionData = new byte[length];
            dais.readFully(sessionData);
            int count;
            count = dais.readInt();
            X509CertImpl[] certs;
            certs = new X509CertImpl[count];
            {
                int i;
                i = 0;
                {
                    length = dais.readInt();
                    byte[] certData;
                    certData = new byte[length];
                    dais.readFully(certData);
                    certs[i] = new X509CertImpl(certData);
                } //End block
            } //End collapsed parenthetic
            varB4EAC82CA7396A68D541C85D26508E83_136138868 = new OpenSSLSessionImpl(sessionData, host, port, certs, this);
        } //End block
        catch (IOException e)
        {
            log(e);
            varB4EAC82CA7396A68D541C85D26508E83_693718938 = null;
        } //End block
        addTaint(data[0]);
        addTaint(host.getTaint());
        addTaint(port);
        SSLSession varA7E53CE21691AB073D9660D615818899_416548375; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_416548375 = varB4EAC82CA7396A68D541C85D26508E83_1417489475;
                break;
            case 2: //Assign result for return ordinal #2
                varA7E53CE21691AB073D9660D615818899_416548375 = varB4EAC82CA7396A68D541C85D26508E83_136138868;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_416548375 = varB4EAC82CA7396A68D541C85D26508E83_693718938;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_416548375.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_416548375;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:12.399 -0400", hash_original_method = "C269704A4F254C894FBE48E4ADC3F7DA", hash_generated_method = "3E38966F3BFB7505BAD8E4514BE42315")
    public SSLSession getSession(byte[] sessionId) {
        SSLSession varB4EAC82CA7396A68D541C85D26508E83_417096837 = null; //Variable for return #1
        SSLSession varB4EAC82CA7396A68D541C85D26508E83_782460468 = null; //Variable for return #2
        {
            if (DroidSafeAndroidRuntime.control) throw new NullPointerException("sessionId == null");
        } //End block
        ByteArray key;
        key = new ByteArray(sessionId);
        SSLSession session;
        {
            session = sessions.get(key);
        } //End block
        {
            boolean var784A1CDA62AB9B2C753832FCE828B745_331222726 = (session != null && session.isValid());
            {
                varB4EAC82CA7396A68D541C85D26508E83_417096837 = session;
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_782460468 = null;
        addTaint(sessionId[0]);
        SSLSession varA7E53CE21691AB073D9660D615818899_329823934; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_329823934 = varB4EAC82CA7396A68D541C85D26508E83_417096837;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_329823934 = varB4EAC82CA7396A68D541C85D26508E83_782460468;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_329823934.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_329823934;
        // ---------- Original Method ----------
        //if (sessionId == null) {
            //throw new NullPointerException("sessionId == null");
        //}
        //ByteArray key = new ByteArray(sessionId);
        //SSLSession session;
        //synchronized (sessions) {
            //session = sessions.get(key);
        //}
        //if (session != null && session.isValid()) {
            //return session;
        //}
        //return null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:12.399 -0400", hash_original_method = "01E7B06223DFEA7D5DECA9A679FEAED7", hash_generated_method = "9066BEA81C93559AE4F48476E543C09D")
     void putSession(SSLSession session) {
        byte[] id;
        id = session.getId();
        ByteArray key;
        key = new ByteArray(id);
        {
            sessions.put(key, session);
        } //End block
        addTaint(session.getTaint());
        // ---------- Original Method ----------
        //byte[] id = session.getId();
        //if (id.length == 0) {
            //return;
        //}
        //ByteArray key = new ByteArray(id);
        //synchronized (sessions) {
            //sessions.put(key, session);
        //}
    }

    
        static void log(Throwable t) {
        System.logW("Error converting session.", t);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:12.401 -0400", hash_original_method = "F38656E203DF2568CDB8FB5A6C876744", hash_generated_method = "415C95D5B1D7C63D7DD32000B7CCE6AC")
    @Override
    protected void finalize() throws Throwable {
        try 
        {
            NativeCrypto.SSL_CTX_free(sslCtxNativePointer);
        } //End block
        finally 
        {
            super.finalize();
        } //End block
        // ---------- Original Method ----------
        //try {
            //NativeCrypto.SSL_CTX_free(sslCtxNativePointer);
        //} finally {
            //super.finalize();
        //}
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:12.401 -0400", hash_original_field = "926D9B14F0F0E3D940ACF8FD74B8BEC9", hash_generated_field = "9C962EFDC206D44A2342330DC00B7E57")

    static int OPEN_SSL = 1;
}

