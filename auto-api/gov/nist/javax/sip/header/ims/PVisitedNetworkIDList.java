package gov.nist.javax.sip.header.ims;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import gov.nist.javax.sip.header.SIPHeaderList;
import gov.nist.javax.sip.header.ims.PVisitedNetworkIDHeader;

public class PVisitedNetworkIDList extends SIPHeaderList<PVisitedNetworkID> {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:32.564 -0400", hash_original_method = "755748D1B1A32FE22452F6E783BD15E2", hash_generated_method = "0F82AF3A13009C31F1061E0FD71C3D3E")
    public  PVisitedNetworkIDList() {
        super(PVisitedNetworkID.class, PVisitedNetworkIDHeader.NAME);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:32.565 -0400", hash_original_method = "7C4CA7398653F51DA5C0E61CD8209B41", hash_generated_method = "4F9A82F1D72F73D1A04DF36039346CFD")
    public Object clone() {
        Object varB4EAC82CA7396A68D541C85D26508E83_833935077 = null; //Variable for return #1
        PVisitedNetworkIDList retval;
        retval = new PVisitedNetworkIDList();
        varB4EAC82CA7396A68D541C85D26508E83_833935077 = retval.clonehlist(this.hlist);
        varB4EAC82CA7396A68D541C85D26508E83_833935077.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_833935077;
        // ---------- Original Method ----------
        //PVisitedNetworkIDList retval = new PVisitedNetworkIDList();
        //return retval.clonehlist(this.hlist);
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:32.565 -0400", hash_original_field = "32DCF15511677F4191CD259156DD8BE2", hash_generated_field = "8248CB1375B7E7B14EC3BE40EADB22FC")

    private static long serialVersionUID = -4346667490341752478L;
}

