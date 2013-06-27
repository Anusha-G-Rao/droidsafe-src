package libcore.io;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.net.InetAddress;

public final class StructGroupReq {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:04.565 -0400", hash_original_field = "58BB6CEF7E5B3002DB833E8A83DC0440", hash_generated_field = "A455D75F586868F1FEF5A4B336E5E17D")

    public int gr_interface;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:04.565 -0400", hash_original_field = "42B32413A950F02842364B7D18771792", hash_generated_field = "EF4F7D94FD71F04B44672F9CF0D0F3A0")

    public InetAddress gr_group;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:04.567 -0400", hash_original_method = "4D71F3877768E92734212FD10E1F3346", hash_generated_method = "5AF7044220FB4FCA67A8D725E0E8AA92")
    public  StructGroupReq(int gr_interface, InetAddress gr_group) {
        this.gr_interface = gr_interface;
        this.gr_group = gr_group;
        // ---------- Original Method ----------
        //this.gr_interface = gr_interface;
        //this.gr_group = gr_group;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:04.567 -0400", hash_original_method = "7C7A6CFDA39E9F15601C4EC14F339026", hash_generated_method = "8A12991E94E48C5C4165870C3F735FAF")
    @Override
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_1696820615 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1696820615 = "StructGroupReq[gr_interface=" + gr_interface + ",gr_group=" + gr_group + "]";
        varB4EAC82CA7396A68D541C85D26508E83_1696820615.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1696820615;
        // ---------- Original Method ----------
        //return "StructGroupReq[gr_interface=" + gr_interface + ",gr_group=" + gr_group + "]";
    }

    
}

