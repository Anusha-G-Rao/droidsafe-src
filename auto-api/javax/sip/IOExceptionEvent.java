package javax.sip;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.util.EventObject;

public class IOExceptionEvent extends EventObject {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:00.478 -0400", hash_original_field = "AE3E518F8FFDE1F8C00699B4C58E95B5", hash_generated_field = "C8F07C3E0F6788C43A05E20D5536D66C")

    private String mHost;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:00.478 -0400", hash_original_field = "5EFA61C4FCA92CA992BE37C2BAF4D350", hash_generated_field = "A2873EA11C139FA2F790281AB4EEDB4E")

    private int mPort;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:00.478 -0400", hash_original_field = "DDB508BA6BDDCDC9D416A8817238314C", hash_generated_field = "788577C3039958B2B9A8239518A26917")

    private String mTransport;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:00.479 -0400", hash_original_method = "B65431E37A5EA3D43D49DD68F5D308D7", hash_generated_method = "F0BFCC67DAF990D0FC5A438F3EC3816E")
    public  IOExceptionEvent(Object source, String host, int port,
            String transport) {
        super(source);
        mHost = host;
        mPort = port;
        mTransport = transport;
        addTaint(source.getTaint());
        // ---------- Original Method ----------
        //mHost = host;
        //mPort = port;
        //mTransport = transport;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:00.479 -0400", hash_original_method = "B21C2297C1E60D4D2D92DDE75D931874", hash_generated_method = "F7CEFF3F08A70EE6B9524FF4479E44B5")
    public String getHost() {
        String varB4EAC82CA7396A68D541C85D26508E83_1562191049 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1562191049 = mHost;
        varB4EAC82CA7396A68D541C85D26508E83_1562191049.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1562191049;
        // ---------- Original Method ----------
        //return mHost;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:00.480 -0400", hash_original_method = "D8DAED2CD8A0984A9202198C71DA9D83", hash_generated_method = "E8A6292D92D006BA9B8C851A315E78B8")
    public int getPort() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1680451760 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1680451760;
        // ---------- Original Method ----------
        //return mPort;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:00.480 -0400", hash_original_method = "CC293D4A58B4AE34EE1EAFE01D7A0F93", hash_generated_method = "011D8695855935F8D31CA2094E7BF241")
    public String getTransport() {
        String varB4EAC82CA7396A68D541C85D26508E83_1093869900 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1093869900 = mTransport;
        varB4EAC82CA7396A68D541C85D26508E83_1093869900.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1093869900;
        // ---------- Original Method ----------
        //return mTransport;
    }

    
}

