package gov.nist.javax.sip.header;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.text.ParseException;
import gov.nist.javax.sip.address.*;
import javax.sip.address.*;

public final class AlertInfo extends ParametersHeader implements javax.sip.header.AlertInfoHeader {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:30.200 -0400", hash_original_field = "9305B73D359BD06734FEE0B3638079E1", hash_generated_field = "D17BDF81091C1074F22AD5D363A1EFEF")

    protected GenericURI uri;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:30.200 -0400", hash_original_field = "B45CFFE084DD3D20D928BEE85E7B0F21", hash_generated_field = "0515D9B755A4065CCD98BBCCA2A45812")

    protected String string;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:30.213 -0400", hash_original_method = "573DE3A32F61321788993C5785A09259", hash_generated_method = "427D589A7E774F7BCAE83A7C7B6EDB4C")
    public  AlertInfo() {
        super(NAME);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:30.214 -0400", hash_original_method = "9B65437FA923D12CE9D4363AF11C8369", hash_generated_method = "C9D8530FBA552A900EA7D2AB1EA97FFE")
    protected String encodeBody() {
        String varB4EAC82CA7396A68D541C85D26508E83_1784234184 = null; //Variable for return #1
        StringBuffer encoding;
        encoding = new StringBuffer();
        {
            encoding.append(LESS_THAN).append(uri.encode()).append(GREATER_THAN);
        } //End block
        {
            encoding.append(string);
        } //End block
        {
            boolean varB381AD842454BDB2397F4C2DAD0B3FA1_434872024 = (!parameters.isEmpty());
            {
                encoding.append(SEMICOLON).append(parameters.encode());
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_1784234184 = encoding.toString();
        varB4EAC82CA7396A68D541C85D26508E83_1784234184.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1784234184;
        // ---------- Original Method ----------
        //StringBuffer encoding = new StringBuffer();
        //if (uri != null) {
            //encoding.append(LESS_THAN).append(uri.encode()).append(GREATER_THAN);
        //} else if (string != null) {
            //encoding.append(string);
        //}
        //if (!parameters.isEmpty()) {
            //encoding.append(SEMICOLON).append(parameters.encode());
        //}
        //return encoding.toString();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:30.215 -0400", hash_original_method = "9100B3E97C317A9574634DF51E7BF148", hash_generated_method = "2A7E426316EE15F7DFB236079F127014")
    public void setAlertInfo(URI uri) {
        this.uri = (GenericURI) uri;
        // ---------- Original Method ----------
        //this.uri = (GenericURI) uri;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:30.215 -0400", hash_original_method = "70582DF127DE5708E4C226DA4F1719D4", hash_generated_method = "5CC62B65558F5189ED3430FEE8A6DEC0")
    public void setAlertInfo(String string) {
        this.string = string;
        // ---------- Original Method ----------
        //this.string = string;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:30.217 -0400", hash_original_method = "93EE3BCFF83F692256BB0B6CBD3B0531", hash_generated_method = "E1B2E6135C99D0BC057A660E9D6E1F6B")
    public URI getAlertInfo() {
        URI varB4EAC82CA7396A68D541C85D26508E83_1718446906 = null; //Variable for return #1
        URI alertInfoUri;
        alertInfoUri = null;
        {
            alertInfoUri = (URI) this.uri;
        } //End block
        {
            try 
            {
                alertInfoUri = (URI) new GenericURI(string);
            } //End block
            catch (ParseException e)
            {
                ;
            } //End block
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1718446906 = alertInfoUri;
        varB4EAC82CA7396A68D541C85D26508E83_1718446906.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1718446906;
        // ---------- Original Method ----------
        //URI alertInfoUri = null;
        //if (this.uri != null) {
            //alertInfoUri = (URI) this.uri;
        //} else {
            //try {
                //alertInfoUri = (URI) new GenericURI(string);
            //} catch (ParseException e) {
                //;  
            //}
        //}
        //return alertInfoUri;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:30.220 -0400", hash_original_method = "1467211F1910FD2BE16563F269CB9AF0", hash_generated_method = "F3C289182726CF86802DC5DDDFF20E37")
    public Object clone() {
        Object varB4EAC82CA7396A68D541C85D26508E83_27216833 = null; //Variable for return #1
        AlertInfo retval;
        retval = (AlertInfo) super.clone();
        {
            retval.uri = (GenericURI) this.uri.clone();
        } //End block
        {
            retval.string = this.string;
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_27216833 = retval;
        varB4EAC82CA7396A68D541C85D26508E83_27216833.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_27216833;
        // ---------- Original Method ----------
        //AlertInfo retval = (AlertInfo) super.clone();
        //if (this.uri != null) {
            //retval.uri = (GenericURI) this.uri.clone();
        //} else if (this.string != null) {
            //retval.string = this.string;
        //}
        //return retval;
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:30.223 -0400", hash_original_field = "F96C8A2DF33D2FE930751822FDAE4BDB", hash_generated_field = "62937C2B45878B96B038BAD91D5268B4")

    private static long serialVersionUID = 4159657362051508719L;
}

