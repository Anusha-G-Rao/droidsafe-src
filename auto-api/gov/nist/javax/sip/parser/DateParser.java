package gov.nist.javax.sip.parser;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import gov.nist.javax.sip.header.*;
import java.util.*;
import java.text.ParseException;

public class DateParser extends HeaderParser {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:33.710 -0400", hash_original_method = "12ABECDC99786B59BCBD31A7419E2B41", hash_generated_method = "31E9035441D49005C3879B8FD8D40DE2")
    public  DateParser(String date) {
        super(date);
        addTaint(date.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:33.710 -0400", hash_original_method = "00ADBDEF8E181F85BEA9DD7E552A7849", hash_generated_method = "3AA19BA386E9B78EC047238A34FE54CF")
    protected  DateParser(Lexer lexer) {
        super(lexer);
        addTaint(lexer.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:33.733 -0400", hash_original_method = "6D964EF3409A9BCD4AB46A00BDF7E85B", hash_generated_method = "F8BA8C0334FAC767D7BB79AC932E86E0")
    public SIPHeader parse() throws ParseException {
        SIPHeader varB4EAC82CA7396A68D541C85D26508E83_109394296 = null; //Variable for return #1
        dbg_enter("DateParser.parse");
        try 
        {
            headerName(TokenTypes.DATE);
            wkday();
            lexer.match(',');
            lexer.match(' ');
            Calendar cal;
            cal = date();
            lexer.match(' ');
            time(cal);
            lexer.match(' ');
            String tzone;
            tzone = this.lexer.ttoken().toLowerCase();
            {
                boolean var5EA11BFD516A0207FC02AAB158A24C09_903338769 = (!"gmt".equals(tzone));
                if (DroidSafeAndroidRuntime.control) throw createParseException("Bad Time Zone " + tzone);
            } //End collapsed parenthetic
            this.lexer.match('\n');
            SIPDateHeader retval;
            retval = new SIPDateHeader();
            retval.setDate(cal);
            varB4EAC82CA7396A68D541C85D26508E83_109394296 = retval;
        } //End block
        finally 
        {
            dbg_leave("DateParser.parse");
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_109394296.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_109394296;
        // ---------- Original Method ----------
        //if (debug)
            //dbg_enter("DateParser.parse");
        //try {
            //headerName(TokenTypes.DATE);
            //wkday();
            //lexer.match(',');
            //lexer.match(' ');
            //Calendar cal = date();
            //lexer.match(' ');
            //time(cal);
            //lexer.match(' ');
            //String tzone = this.lexer.ttoken().toLowerCase();
            //if (!"gmt".equals(tzone))
                //throw createParseException("Bad Time Zone " + tzone);
            //this.lexer.match('\n');
            //SIPDateHeader retval = new SIPDateHeader();
            //retval.setDate(cal);
            //return retval;
        //} finally {
            //if (debug)
                //dbg_leave("DateParser.parse");
        //}
    }

    
}

