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

public class HeaderParser extends Parser {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:33.797 -0400", hash_original_method = "D7BF0781EB1B150DCC61F7ABE4F04AEB", hash_generated_method = "01DBEC03B2CB347A4566513BB13E1FE3")
    protected  HeaderParser(String header) {
        this.lexer = new Lexer("command_keywordLexer", header);
        addTaint(header.getTaint());
        // ---------- Original Method ----------
        //this.lexer = new Lexer("command_keywordLexer", header);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:33.798 -0400", hash_original_method = "844D98E200F4C4A3FE69D132F5D518A2", hash_generated_method = "F1A83F91A44FD4BA40A408F306CA687A")
    protected  HeaderParser(Lexer lexer) {
        this.lexer = lexer;
        this.lexer.selectLexer("command_keywordLexer");
        addTaint(lexer.getTaint());
        // ---------- Original Method ----------
        //this.lexer = lexer;
        //this.lexer.selectLexer("command_keywordLexer");
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:33.798 -0400", hash_original_method = "3252974D26894AAD7C4FB2AFA441C9B3", hash_generated_method = "70495942C25787F318F5218BFAA89DEF")
    protected int wkday() throws ParseException {
        dbg_enter("wkday");
        try 
        {
            String tok;
            tok = lexer.ttoken();
            String id;
            id = tok.toLowerCase();
            {
                boolean varFBBD09A165C3CD21B7CB07BB2947A8C6_1532641671 = (TokenNames.MON.equalsIgnoreCase(id));
                {
                    boolean varA0B9871A289865119D112F580831DCD0_201004511 = (TokenNames.TUE.equalsIgnoreCase(id));
                    {
                        boolean var35080559ECE6280BC3F96EB0045ED968_1176763372 = (TokenNames.WED.equalsIgnoreCase(id));
                        {
                            boolean var682C1883901FF8641C6B50F4B8DD6A10_1845025655 = (TokenNames.THU.equalsIgnoreCase(id));
                            {
                                boolean varA2A1C2732A98E67B628DE72612F71350_2002123545 = (TokenNames.FRI.equalsIgnoreCase(id));
                                {
                                    boolean varAED658A37D1D624744CAC013F45A97D1_589958176 = (TokenNames.SAT.equalsIgnoreCase(id));
                                    {
                                        boolean varD8F3B695147616021483803FA469195C_722672496 = (TokenNames.SUN.equalsIgnoreCase(id));
                                        if (DroidSafeAndroidRuntime.control) throw createParseException("bad wkday");
                                    } //End collapsed parenthetic
                                } //End collapsed parenthetic
                            } //End collapsed parenthetic
                        } //End collapsed parenthetic
                    } //End collapsed parenthetic
                } //End collapsed parenthetic
            } //End collapsed parenthetic
        } //End block
        finally 
        {
            dbg_leave("wkday");
        } //End block
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1847579987 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1847579987;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:33.800 -0400", hash_original_method = "C8449F66AC8DB5DC1EE33D138B3717DE", hash_generated_method = "02061E700B20DEED4DC5B603FBF15D06")
    protected Calendar date() throws ParseException {
        Calendar varB4EAC82CA7396A68D541C85D26508E83_1017413006 = null; //Variable for return #1
        try 
        {
            Calendar retval;
            retval = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
            String s1;
            s1 = lexer.number();
            int day;
            day = Integer.parseInt(s1);
            if (DroidSafeAndroidRuntime.control) throw createParseException("Bad day ");
            retval.set(Calendar.DAY_OF_MONTH, day);
            lexer.match(' ');
            String month;
            month = lexer.ttoken().toLowerCase();
            {
                boolean var9743F073DC13D11A170547C6332EA441_207686152 = (month.equals("jan"));
                {
                    retval.set(Calendar.MONTH, Calendar.JANUARY);
                } //End block
                {
                    boolean var2118529D719391BDEC0B6E339390CA00_1720006588 = (month.equals("feb"));
                    {
                        retval.set(Calendar.MONTH, Calendar.FEBRUARY);
                    } //End block
                    {
                        boolean varF2858B81441E0AABDAD312E1A6511F2E_592801257 = (month.equals("mar"));
                        {
                            retval.set(Calendar.MONTH, Calendar.MARCH);
                        } //End block
                        {
                            boolean var7C6B5F5685CF2B4C959CE97ACBFE690A_886653719 = (month.equals("apr"));
                            {
                                retval.set(Calendar.MONTH, Calendar.APRIL);
                            } //End block
                            {
                                boolean varFB33E58DBB0B2E1031E4918AF1E03AB5_1045937142 = (month.equals("may"));
                                {
                                    retval.set(Calendar.MONTH, Calendar.MAY);
                                } //End block
                                {
                                    boolean varE06819B3892FC278D4AEDDDF96946D0A_169392794 = (month.equals("jun"));
                                    {
                                        retval.set(Calendar.MONTH, Calendar.JUNE);
                                    } //End block
                                    {
                                        boolean var1A89EB1F66E757EFB63FBA3804435455_652563553 = (month.equals("jul"));
                                        {
                                            retval.set(Calendar.MONTH, Calendar.JULY);
                                        } //End block
                                        {
                                            boolean var6724DCBF558B5DA45EBF2AAE3F3F3E3B_1517615801 = (month.equals("aug"));
                                            {
                                                retval.set(Calendar.MONTH, Calendar.AUGUST);
                                            } //End block
                                            {
                                                boolean varD81EC2556AFC62DC4BD9B743B703BE5D_695553443 = (month.equals("sep"));
                                                {
                                                    retval.set(Calendar.MONTH, Calendar.SEPTEMBER);
                                                } //End block
                                                {
                                                    boolean var3B86497E6630B448890CD02542810333_1364422587 = (month.equals("oct"));
                                                    {
                                                        retval.set(Calendar.MONTH, Calendar.OCTOBER);
                                                    } //End block
                                                    {
                                                        boolean var37ADD223AA87DAFF3B87F6E4A98522E7_1146594054 = (month.equals("nov"));
                                                        {
                                                            retval.set(Calendar.MONTH, Calendar.NOVEMBER);
                                                        } //End block
                                                        {
                                                            boolean var4F0C3E471E78B53BFED0511B116F3AE6_772290876 = (month.equals("dec"));
                                                            {
                                                                retval.set(Calendar.MONTH, Calendar.DECEMBER);
                                                            } //End block
                                                        } //End collapsed parenthetic
                                                    } //End collapsed parenthetic
                                                } //End collapsed parenthetic
                                            } //End collapsed parenthetic
                                        } //End collapsed parenthetic
                                    } //End collapsed parenthetic
                                } //End collapsed parenthetic
                            } //End collapsed parenthetic
                        } //End collapsed parenthetic
                    } //End collapsed parenthetic
                } //End collapsed parenthetic
            } //End collapsed parenthetic
            lexer.match(' ');
            String s2;
            s2 = lexer.number();
            int yr;
            yr = Integer.parseInt(s2);
            retval.set(Calendar.YEAR, yr);
            varB4EAC82CA7396A68D541C85D26508E83_1017413006 = retval;
        } //End block
        catch (Exception ex)
        {
            if (DroidSafeAndroidRuntime.control) throw createParseException("bad date field");
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1017413006.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1017413006;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:33.807 -0400", hash_original_method = "A339A3BD9B311A61AF23D5CD23AA066A", hash_generated_method = "2237A6C9E3C26797E2E95C0F7372638F")
    protected void time(Calendar calendar) throws ParseException {
        try 
        {
            String s;
            s = lexer.number();
            int hour;
            hour = Integer.parseInt(s);
            calendar.set(Calendar.HOUR_OF_DAY, hour);
            lexer.match(':');
            s = lexer.number();
            int min;
            min = Integer.parseInt(s);
            calendar.set(Calendar.MINUTE, min);
            lexer.match(':');
            s = lexer.number();
            int sec;
            sec = Integer.parseInt(s);
            calendar.set(Calendar.SECOND, sec);
        } //End block
        catch (Exception ex)
        {
            if (DroidSafeAndroidRuntime.control) throw createParseException("error processing time ");
        } //End block
        addTaint(calendar.getTaint());
        // ---------- Original Method ----------
        //try {
            //String s = lexer.number();
            //int hour = Integer.parseInt(s);
            //calendar.set(Calendar.HOUR_OF_DAY, hour);
            //lexer.match(':');
            //s = lexer.number();
            //int min = Integer.parseInt(s);
            //calendar.set(Calendar.MINUTE, min);
            //lexer.match(':');
            //s = lexer.number();
            //int sec = Integer.parseInt(s);
            //calendar.set(Calendar.SECOND, sec);
        //} catch (Exception ex) {
            //throw createParseException("error processing time ");
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:33.811 -0400", hash_original_method = "D87C47C2DE06FF746589C19C83F3FD66", hash_generated_method = "CDC86D9900FE47191C893763F4B1FD0F")
    public SIPHeader parse() throws ParseException {
        SIPHeader varB4EAC82CA7396A68D541C85D26508E83_514950505 = null; //Variable for return #1
        String name;
        name = lexer.getNextToken(':');
        lexer.consume(1);
        String body;
        body = lexer.getLine().trim();
        ExtensionHeaderImpl retval;
        retval = new ExtensionHeaderImpl(name);
        retval.setValue(body);
        varB4EAC82CA7396A68D541C85D26508E83_514950505 = retval;
        varB4EAC82CA7396A68D541C85D26508E83_514950505.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_514950505;
        // ---------- Original Method ----------
        //String name = lexer.getNextToken(':');
        //lexer.consume(1);
        //String body = lexer.getLine().trim();
        //ExtensionHeaderImpl retval = new ExtensionHeaderImpl(name);
        //retval.setValue(body);
        //return retval;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:33.821 -0400", hash_original_method = "E611EE61C75972DE5AB5B484EC7DE89C", hash_generated_method = "B75AAFB90FCC5F82614CCBEA95FFED24")
    protected void headerName(int tok) throws ParseException {
        this.lexer.match(tok);
        this.lexer.SPorHT();
        this.lexer.match(':');
        this.lexer.SPorHT();
        addTaint(tok);
        // ---------- Original Method ----------
        //this.lexer.match(tok);
        //this.lexer.SPorHT();
        //this.lexer.match(':');
        //this.lexer.SPorHT();
    }

    
}

