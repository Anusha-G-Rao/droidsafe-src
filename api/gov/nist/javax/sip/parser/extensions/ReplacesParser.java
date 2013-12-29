package gov.nist.javax.sip.parser.extensions;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import gov.nist.javax.sip.header.SIPHeader;
import gov.nist.javax.sip.header.extensions.Replaces;
import gov.nist.javax.sip.parser.Lexer;
import gov.nist.javax.sip.parser.ParametersParser;
import gov.nist.javax.sip.parser.TokenTypes;

import java.text.ParseException;





public class ReplacesParser extends ParametersParser {

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:10.591 -0500", hash_original_method = "692C1299D37731F69C2749F85944CAD1", hash_generated_method = "0778FB052F7B489AD21896898A219B9A")
    public static void main(String args[]) throws ParseException {
        String to[] =
            {   "Replaces: 12345th5z8z\n",
                "Replaces: 12345th5z8z;to-tag=tozght6-45;from-tag=fromzght789-337-2\n",
            };

        for (int i = 0; i < to.length; i++) {
            ReplacesParser tp = new ReplacesParser(to[i]);
            Replaces t = (Replaces) tp.parse();
            System.out.println("Parsing => " + to[i]);
            System.out.print("encoded = " + t.encode() + "==> ");
            System.out.println("callId " + t.getCallId() + " from-tag=" + t.getFromTag()
                    + " to-tag=" + t.getToTag()) ;

        }
    }

    /**
     * Creates new CallIDParser
     * @param callID message to parse
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:10.588 -0500", hash_original_method = "F53F10172FA8BD8FD32B526A24946E78", hash_generated_method = "282ADED346198690760F95FCEC2D8702")
    public ReplacesParser(String callID) {
        super(callID);
    }

    /**
     * Constructor
     * @param lexer Lexer to set
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:10.589 -0500", hash_original_method = "668CF87BAE793626F7B81C622AF1AD1A", hash_generated_method = "110B1695C4985FA9BBEFB26317F22327")
    protected ReplacesParser(Lexer lexer) {
        super(lexer);
    }

    /**
     * parse the String message
     * @return SIPHeader (CallID object)
     * @throws ParseException if the message does not respect the spec.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:10.590 -0500", hash_original_method = "C779AD4EE203E642C9A6B93773CE1027", hash_generated_method = "3518CD312AFC52DA7EF5346FA10E1FB5")
    public SIPHeader parse() throws ParseException {
        if (debug)
            dbg_enter("parse");
        try {
            headerName(TokenTypes.REPLACES_TO);

            Replaces replaces = new Replaces();
            this.lexer.SPorHT();
            String callId = lexer.byteStringNoSemicolon();
            this.lexer.SPorHT();
            super.parse(replaces);
            replaces.setCallId(callId);
            return replaces;
        } finally {
            if (debug)
                dbg_leave("parse");
        }
    }

    
}

