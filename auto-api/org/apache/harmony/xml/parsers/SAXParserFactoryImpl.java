package org.apache.harmony.xml.parsers;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXNotRecognizedException;

public class SAXParserFactoryImpl extends SAXParserFactory {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:12.088 -0400", hash_original_field = "987495AE8EA75D7FFAE9F17C211F4863", hash_generated_field = "BBF36E0D89D30BFFC00EE4B538D5AA0E")

    private Map<String, Boolean> features = new HashMap<String, Boolean>();
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:12.088 -0400", hash_original_method = "BB7DD052856C5F48FEF96C6EA9CF9D9A", hash_generated_method = "BB7DD052856C5F48FEF96C6EA9CF9D9A")
    public SAXParserFactoryImpl ()
    {
        //Synthesized constructor
    }


    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:12.100 -0400", hash_original_method = "7A2715D86ACB75E2F46F70864B886736", hash_generated_method = "2832DDBB7AB7D52CDBA1B225C2E50290")
    @Override
    public boolean getFeature(String name) throws SAXNotRecognizedException {
        {
            if (DroidSafeAndroidRuntime.control) throw new NullPointerException();
        } //End block
        {
            boolean var0DD90ED7C4F94A2541AADCD92B315247_269516716 = (!name.startsWith("http://xml.org/sax/features/"));
            {
                if (DroidSafeAndroidRuntime.control) throw new SAXNotRecognizedException(name);
            } //End block
        } //End collapsed parenthetic
        boolean varD7EF5C05A876DA5F362CC7F45E3B2539_1650380455 = (Boolean.TRUE.equals(features.get(name)));
        addTaint(name.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_250504226 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_250504226;
        // ---------- Original Method ----------
        //if (name == null) {
            //throw new NullPointerException();
        //}
        //if (!name.startsWith("http://xml.org/sax/features/")) {
            //throw new SAXNotRecognizedException(name);
        //}
        //return Boolean.TRUE.equals(features.get(name));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:12.100 -0400", hash_original_method = "D0236E56EB7DBB7A9FD9FE0F0B030A07", hash_generated_method = "382FABA21D5076FB6973AFE7D06B75A0")
    @Override
    public boolean isNamespaceAware() {
        try 
        {
            boolean var25A733CB16E2C08AEAA35CEBC6C1F171_687822499 = (getFeature(NAMESPACES));
        } //End block
        catch (SAXNotRecognizedException ex)
        {
            if (DroidSafeAndroidRuntime.control) throw new AssertionError(ex);
        } //End block
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1812621300 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1812621300;
        // ---------- Original Method ----------
        //try {
            //return getFeature(NAMESPACES);
        //} catch (SAXNotRecognizedException ex) {
            //throw new AssertionError(ex);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:12.101 -0400", hash_original_method = "8429289DC0C07EE6D0C2B7B5BD1C7C0B", hash_generated_method = "547A5BD4738FDD8499A109540D8AA1FC")
    @Override
    public boolean isValidating() {
        try 
        {
            boolean var546AC4507E23F527F77ACB41D0E0B2EA_168662346 = (getFeature(VALIDATION));
        } //End block
        catch (SAXNotRecognizedException ex)
        {
            if (DroidSafeAndroidRuntime.control) throw new AssertionError(ex);
        } //End block
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_186112992 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_186112992;
        // ---------- Original Method ----------
        //try {
            //return getFeature(VALIDATION);
        //} catch (SAXNotRecognizedException ex) {
            //throw new AssertionError(ex);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:12.102 -0400", hash_original_method = "296E37D815DC1709C2AEF832AA03671B", hash_generated_method = "637D57835773796CD0C39425F3017012")
    @Override
    public SAXParser newSAXParser() throws ParserConfigurationException {
        SAXParser varB4EAC82CA7396A68D541C85D26508E83_825245139 = null; //Variable for return #1
        {
            boolean var4E297FF2ACA5FE750738C034402DA121_726152498 = (isValidating());
            {
                if (DroidSafeAndroidRuntime.control) throw new ParserConfigurationException(
                    "No validating SAXParser implementation available");
            } //End block
        } //End collapsed parenthetic
        try 
        {
            varB4EAC82CA7396A68D541C85D26508E83_825245139 = new SAXParserImpl(features);
        } //End block
        catch (Exception ex)
        {
            if (DroidSafeAndroidRuntime.control) throw new ParserConfigurationException(ex.toString());
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_825245139.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_825245139;
        // ---------- Original Method ----------
        //if (isValidating()) {
            //throw new ParserConfigurationException(
                    //"No validating SAXParser implementation available");
        //}
        //try {
            //return new SAXParserImpl(features);
        //} catch (Exception ex) {
            //throw new ParserConfigurationException(ex.toString());
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:12.102 -0400", hash_original_method = "F8C86ADBC38F5FA5C922066DFA926032", hash_generated_method = "CB1145A870323F5ECB79220DEBE74883")
    @Override
    public void setFeature(String name, boolean value) throws SAXNotRecognizedException {
        {
            if (DroidSafeAndroidRuntime.control) throw new NullPointerException();
        } //End block
        {
            boolean var0DD90ED7C4F94A2541AADCD92B315247_1632563281 = (!name.startsWith("http://xml.org/sax/features/"));
            {
                if (DroidSafeAndroidRuntime.control) throw new SAXNotRecognizedException(name);
            } //End block
        } //End collapsed parenthetic
        {
            features.put(name, Boolean.TRUE);
        } //End block
        {
            features.put(name, Boolean.FALSE);
        } //End block
        addTaint(name.getTaint());
        addTaint(value);
        // ---------- Original Method ----------
        //if (name == null) {
            //throw new NullPointerException();
        //}
        //if (!name.startsWith("http://xml.org/sax/features/")) {
            //throw new SAXNotRecognizedException(name);
        //}
        //if (value) {
            //features.put(name, Boolean.TRUE);
        //} else {
            //features.put(name, Boolean.FALSE);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:12.111 -0400", hash_original_method = "2AAB52F0B6288669A1F1A42BDA5388FA", hash_generated_method = "933E0F2800F06846B852563B7B015D0E")
    @Override
    public void setNamespaceAware(boolean value) {
        try 
        {
            setFeature(NAMESPACES, value);
        } //End block
        catch (SAXNotRecognizedException ex)
        {
            if (DroidSafeAndroidRuntime.control) throw new AssertionError(ex);
        } //End block
        addTaint(value);
        // ---------- Original Method ----------
        //try {
            //setFeature(NAMESPACES, value);
        //} catch (SAXNotRecognizedException ex) {
            //throw new AssertionError(ex);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:12.112 -0400", hash_original_method = "FD755E093F221B14C5D40C6AB8BA5348", hash_generated_method = "564D70865B9E88C5AB718774D3F0F001")
    @Override
    public void setValidating(boolean value) {
        try 
        {
            setFeature(VALIDATION, value);
        } //End block
        catch (SAXNotRecognizedException ex)
        {
            if (DroidSafeAndroidRuntime.control) throw new AssertionError(ex);
        } //End block
        addTaint(value);
        // ---------- Original Method ----------
        //try {
            //setFeature(VALIDATION, value);
        //} catch (SAXNotRecognizedException ex) {
            //throw new AssertionError(ex);
        //}
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:12.112 -0400", hash_original_field = "57DAABD72ED77A96967246F7788B1447", hash_generated_field = "BCE4439DC294C3DB7FEC2C74272B80EB")

    private static String NAMESPACES = "http://xml.org/sax/features/namespaces";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:12.112 -0400", hash_original_field = "1A6983F26F9A43F675933304E11A084C", hash_generated_field = "5EA15C53594AC6CC1F8287E14EB07B9A")

    private static String VALIDATION = "http://xml.org/sax/features/validation";
}

