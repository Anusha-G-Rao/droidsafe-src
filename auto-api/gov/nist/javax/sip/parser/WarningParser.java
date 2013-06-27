package gov.nist.javax.sip.parser;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import gov.nist.javax.sip.header.*;
import gov.nist.core.*;
import java.text.ParseException;
import javax.sip.*;

public class WarningParser extends HeaderParser {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:34.463 -0400", hash_original_method = "38623B910ABA654EC8C258B1F2DD35A3", hash_generated_method = "7571F0DA3DE7DAA09495023E92213CDE")
    public  WarningParser(String warning) {
        super(warning);
        addTaint(warning.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:34.463 -0400", hash_original_method = "AB9AC91F8631F4AA3239C3547D18BC09", hash_generated_method = "558DDFFCB57EFAB6AF04A2FE9DBB1F70")
    protected  WarningParser(Lexer lexer) {
        super(lexer);
        addTaint(lexer.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:34.466 -0400", hash_original_method = "5665BE3F4ECC43E3239D3F1D8B9B76A3", hash_generated_method = "EB65F3B74DCB28D0A77E7791796768CB")
    public SIPHeader parse() throws ParseException {
        SIPHeader varB4EAC82CA7396A68D541C85D26508E83_1564757845 = null; //Variable for return #1
        WarningList warningList;
        warningList = new WarningList();
        dbg_enter("WarningParser.parse");
        try 
        {
            headerName(TokenTypes.WARNING);
            {
                boolean varA38820C66B6BCE71087D920E2767FF09_455180485 = (lexer.lookAhead(0) != '\n');
                {
                    Warning warning;
                    warning = new Warning();
                    warning.setHeaderName(SIPHeaderNames.WARNING);
                    this.lexer.match(TokenTypes.ID);
                    Token token;
                    token = lexer.getNextToken();
                    try 
                    {
                        int code;
                        code = Integer.parseInt(token.getTokenValue());
                        warning.setCode(code);
                    } //End block
                    catch (NumberFormatException ex)
                    {
                        if (DroidSafeAndroidRuntime.control) throw createParseException(ex.getMessage());
                    } //End block
                    catch (InvalidArgumentException ex)
                    {
                        if (DroidSafeAndroidRuntime.control) throw createParseException(ex.getMessage());
                    } //End block
                    this.lexer.SPorHT();
                    this.lexer.match(TokenTypes.ID);
                    token = lexer.getNextToken();
                    {
                        boolean var14C8D39E8F94EF2F19C70A9DFC6A715B_919492862 = (lexer.lookAhead(0) == ':');
                        {
                            this.lexer.match(':');
                            this.lexer.match(TokenTypes.ID);
                            Token token2;
                            token2 = lexer.getNextToken();
                            warning.setAgent(token.getTokenValue() + ":"
                            + token2.getTokenValue());
                        } //End block
                        {
                            warning.setAgent(token.getTokenValue());
                        } //End block
                    } //End collapsed parenthetic
                    this.lexer.SPorHT();
                    String text;
                    text = this.lexer.quotedString();
                    warning.setText(text);
                    this.lexer.SPorHT();
                    warningList.add(warning);
                    {
                        boolean var7DC6EF7D2962860F171D1CEF6887AFF5_2044763975 = (lexer.lookAhead(0) == ',');
                        {
                            this.lexer.match(',');
                            this.lexer.SPorHT();
                            warning = new Warning();
                            this.lexer.match(TokenTypes.ID);
                            Token tok;
                            tok = lexer.getNextToken();
                            try 
                            {
                                int code;
                                code = Integer.parseInt(tok.getTokenValue());
                                warning.setCode(code);
                            } //End block
                            catch (NumberFormatException ex)
                            {
                                if (DroidSafeAndroidRuntime.control) throw createParseException(ex.getMessage());
                            } //End block
                            catch (InvalidArgumentException ex)
                            {
                                if (DroidSafeAndroidRuntime.control) throw createParseException(ex.getMessage());
                            } //End block
                            this.lexer.SPorHT();
                            this.lexer.match(TokenTypes.ID);
                            tok = lexer.getNextToken();
                            {
                                boolean varB1CE638DDED33E6167E387BE765A9361_1889471461 = (lexer.lookAhead(0) == ':');
                                {
                                    this.lexer.match(':');
                                    this.lexer.match(TokenTypes.ID);
                                    Token token2;
                                    token2 = lexer.getNextToken();
                                    warning.setAgent(tok.getTokenValue() + ":"
                                + token2.getTokenValue());
                                } //End block
                                {
                                    warning.setAgent(tok.getTokenValue());
                                } //End block
                            } //End collapsed parenthetic
                            this.lexer.SPorHT();
                            text = this.lexer.quotedString();
                            warning.setText(text);
                            this.lexer.SPorHT();
                            warningList.add(warning);
                        } //End block
                    } //End collapsed parenthetic
                } //End block
            } //End collapsed parenthetic
        } //End block
        finally 
        {
            dbg_leave("WarningParser.parse");
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1564757845 = warningList;
        varB4EAC82CA7396A68D541C85D26508E83_1564757845.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1564757845;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
}

