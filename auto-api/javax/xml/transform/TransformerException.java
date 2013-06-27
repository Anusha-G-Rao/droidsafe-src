package javax.xml.transform;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;

public class TransformerException extends Exception {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:03.474 -0400", hash_original_field = "AB1E07F86CA37C6521CC1969EE2AC6C9", hash_generated_field = "242C14456A521485BE94EFFE33D8EF15")

    SourceLocator locator;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:03.475 -0400", hash_original_field = "666707D818022CC67C8A24390966B951", hash_generated_field = "FB75E61C44B34E5DCDC79855DF4646BE")

    Throwable containedException;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:03.475 -0400", hash_original_method = "ABE089B555C0BBE77A7ADBD2839474AC", hash_generated_method = "E25E38F7449D8A85CF6494F84473C4E8")
    public  TransformerException(String message) {
        super(message);
        this.containedException = null;
        this.locator            = null;
        addTaint(message.getTaint());
        // ---------- Original Method ----------
        //this.containedException = null;
        //this.locator            = null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:03.476 -0400", hash_original_method = "BCE7B8322CC2320F24F40E1C57B1D6A6", hash_generated_method = "6B6F250FA67E31550203926FF836ECDC")
    public  TransformerException(Throwable e) {
        super(e.toString());
        this.containedException = e;
        this.locator            = null;
        // ---------- Original Method ----------
        //this.containedException = e;
        //this.locator            = null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:03.476 -0400", hash_original_method = "D45FC511BA6A923B19FFB66FC049AAEB", hash_generated_method = "02D43C0206009C96612E3A256C6D49E9")
    public  TransformerException(String message, Throwable e) {
        super(((message == null) || (message.length() == 0))
              ? e.toString()
              : message);
        this.containedException = e;
        this.locator            = null;
        addTaint(message.getTaint());
        // ---------- Original Method ----------
        //this.containedException = e;
        //this.locator            = null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:03.476 -0400", hash_original_method = "DD07B7FCC3EF7EDD2CCAD748CE266263", hash_generated_method = "D4AC2AB4A397BED69D05BF0034465BB6")
    public  TransformerException(String message, SourceLocator locator) {
        super(message);
        this.containedException = null;
        this.locator            = locator;
        addTaint(message.getTaint());
        // ---------- Original Method ----------
        //this.containedException = null;
        //this.locator            = locator;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:03.490 -0400", hash_original_method = "48CCF75E307E890A227C0CAEA85C6D48", hash_generated_method = "DF47D73B462BBA9715D7F826F815F8C2")
    public  TransformerException(String message, SourceLocator locator,
                                Throwable e) {
        super(message);
        this.containedException = e;
        this.locator            = locator;
        addTaint(message.getTaint());
        // ---------- Original Method ----------
        //this.containedException = e;
        //this.locator            = locator;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:03.490 -0400", hash_original_method = "78CCEDF93B9D36FA2F4D6EE8483F521D", hash_generated_method = "8E0E147FC62BBDD44D46B12E285D13A9")
    public SourceLocator getLocator() {
        SourceLocator varB4EAC82CA7396A68D541C85D26508E83_1216740047 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1216740047 = locator;
        varB4EAC82CA7396A68D541C85D26508E83_1216740047.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1216740047;
        // ---------- Original Method ----------
        //return locator;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:03.491 -0400", hash_original_method = "2730D26302DDFE02DFC9B94C57BA2229", hash_generated_method = "3A60D6D9C48F9C8CC784DDE0EBAB1BA2")
    public void setLocator(SourceLocator location) {
        locator = location;
        // ---------- Original Method ----------
        //locator = location;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:03.496 -0400", hash_original_method = "4E3501B9804FC98D0826FF297E292112", hash_generated_method = "2BDE5701C06291874149A1ACE26E1CF6")
    public Throwable getException() {
        Throwable varB4EAC82CA7396A68D541C85D26508E83_1106937340 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1106937340 = containedException;
        varB4EAC82CA7396A68D541C85D26508E83_1106937340.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1106937340;
        // ---------- Original Method ----------
        //return containedException;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:03.497 -0400", hash_original_method = "CFB99AF15EF81FE883309E381BCDFD32", hash_generated_method = "EFCA08450D285958339D17EF6B4DE394")
    public Throwable getCause() {
        Throwable varB4EAC82CA7396A68D541C85D26508E83_1892744343 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1892744343 = ((containedException == this)
                ? null
                : containedException);
        varB4EAC82CA7396A68D541C85D26508E83_1892744343.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1892744343;
        // ---------- Original Method ----------
        //return ((containedException == this)
                //? null
                //: containedException);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:03.497 -0400", hash_original_method = "480EED18E1765067FE991AF0B4A8D2D9", hash_generated_method = "BF065D85B14A51205811A33F9DE291B6")
    public synchronized Throwable initCause(Throwable cause) {
        Throwable varB4EAC82CA7396A68D541C85D26508E83_1469826263 = null; //Variable for return #1
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalStateException("Can't overwrite cause");
        } //End block
        {
            boolean var974C88151AE5388A12E2F75475C2D5B4_1408284047 = (cause == this);
            {
                if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException(
                "Self-causation not permitted");
            } //End block
        } //End collapsed parenthetic
        this.containedException = cause;
        varB4EAC82CA7396A68D541C85D26508E83_1469826263 = this;
        varB4EAC82CA7396A68D541C85D26508E83_1469826263.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1469826263;
        // ---------- Original Method ----------
        //if (this.containedException != null) {
            //throw new IllegalStateException("Can't overwrite cause");
        //}
        //if (cause == this) {
            //throw new IllegalArgumentException(
                //"Self-causation not permitted");
        //}
        //this.containedException = cause;
        //return this;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:03.501 -0400", hash_original_method = "5F0314D1FF4AABD6580ED0D63B1DE248", hash_generated_method = "D1E2B573354925259F5AD9F8A32F9E30")
    public String getMessageAndLocation() {
        String varB4EAC82CA7396A68D541C85D26508E83_1090689197 = null; //Variable for return #1
        StringBuilder sbuffer;
        sbuffer = new StringBuilder();
        String message;
        message = super.getMessage();
        {
            sbuffer.append(message);
        } //End block
        {
            String systemID;
            systemID = locator.getSystemId();
            int line;
            line = locator.getLineNumber();
            int column;
            column = locator.getColumnNumber();
            {
                sbuffer.append("; SystemID: ");
                sbuffer.append(systemID);
            } //End block
            {
                sbuffer.append("; Line#: ");
                sbuffer.append(line);
            } //End block
            {
                sbuffer.append("; Column#: ");
                sbuffer.append(column);
            } //End block
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1090689197 = sbuffer.toString();
        varB4EAC82CA7396A68D541C85D26508E83_1090689197.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1090689197;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:03.502 -0400", hash_original_method = "066E0A6F600039820661DC1AB443CC5D", hash_generated_method = "72ECD5B1587F95632C5FF3C66F7816D1")
    public String getLocationAsString() {
        String varB4EAC82CA7396A68D541C85D26508E83_759972976 = null; //Variable for return #1
        String varB4EAC82CA7396A68D541C85D26508E83_1839096212 = null; //Variable for return #2
        {
            StringBuilder sbuffer;
            sbuffer = new StringBuilder();
            String systemID;
            systemID = locator.getSystemId();
            int line;
            line = locator.getLineNumber();
            int column;
            column = locator.getColumnNumber();
            {
                sbuffer.append("; SystemID: ");
                sbuffer.append(systemID);
            } //End block
            {
                sbuffer.append("; Line#: ");
                sbuffer.append(line);
            } //End block
            {
                sbuffer.append("; Column#: ");
                sbuffer.append(column);
            } //End block
            varB4EAC82CA7396A68D541C85D26508E83_759972976 = sbuffer.toString();
        } //End block
        {
            varB4EAC82CA7396A68D541C85D26508E83_1839096212 = null;
        } //End block
        String varA7E53CE21691AB073D9660D615818899_264362532; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_264362532 = varB4EAC82CA7396A68D541C85D26508E83_759972976;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_264362532 = varB4EAC82CA7396A68D541C85D26508E83_1839096212;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_264362532.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_264362532;
        // ---------- Original Method ----------
        //if (null != locator) {
            //StringBuilder sbuffer  = new StringBuilder();
            //String       systemID = locator.getSystemId();
            //int          line     = locator.getLineNumber();
            //int          column   = locator.getColumnNumber();
            //if (null != systemID) {
                //sbuffer.append("; SystemID: ");
                //sbuffer.append(systemID);
            //}
            //if (0 != line) {
                //sbuffer.append("; Line#: ");
                //sbuffer.append(line);
            //}
            //if (0 != column) {
                //sbuffer.append("; Column#: ");
                //sbuffer.append(column);
            //}
            //return sbuffer.toString();
        //} else {
            //return null;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:03.503 -0400", hash_original_method = "BFEE5D773C8C1A637BA8549A5548CE5E", hash_generated_method = "5DE43A2AD9D57F579CB99E2DD2DEBB6F")
    public void printStackTrace() {
        printStackTrace(new java.io.PrintWriter(System.err, true));
        // ---------- Original Method ----------
        //printStackTrace(new java.io.PrintWriter(System.err, true));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:03.504 -0400", hash_original_method = "396FE4FDBD72A1A44CDA1D64A960A2B6", hash_generated_method = "173EF8E975CA82CE9E85AD7974FC0F51")
    public void printStackTrace(java.io.PrintStream s) {
        printStackTrace(new java.io.PrintWriter(s));
        addTaint(s.getTaint());
        // ---------- Original Method ----------
        //printStackTrace(new java.io.PrintWriter(s));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:03.505 -0400", hash_original_method = "A67ED2D6F45381C31C2891A6F92AFBC4", hash_generated_method = "FCA39CD9B8FA01F5D9F8B1AA410DDE83")
    public void printStackTrace(java.io.PrintWriter s) {
        {
            s = new java.io.PrintWriter(System.err, true);
        } //End block
        try 
        {
            String locInfo;
            locInfo = getLocationAsString();
            {
                s.println(locInfo);
            } //End block
            super.printStackTrace(s);
        } //End block
        catch (Throwable e)
        { }
        addTaint(s.getTaint());
        // ---------- Original Method ----------
        //if (s == null) {
            //s = new java.io.PrintWriter(System.err, true);
        //}
        //try {
            //String locInfo = getLocationAsString();
            //if (null != locInfo) {
                //s.println(locInfo);
            //}
            //super.printStackTrace(s);
        //} catch (Throwable e) {}
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:03.506 -0400", hash_original_field = "CF11F5DB9FDEA42A11ADE0EBA3C62E0F", hash_generated_field = "589AB82BCF12828044FD1B2328744990")

    private static long serialVersionUID = 975798773772956428L;
}

