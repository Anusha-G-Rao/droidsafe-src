package javax.xml.namespace;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.security.AccessController;
import java.security.PrivilegedAction;
import javax.xml.XMLConstants;

public class QName implements Serializable {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:01.019 -0400", hash_original_field = "5295F3E9C46315AF1C2132265086FA24", hash_generated_field = "CCE51D9450F9AA53957D024DB76AA394")

    private String namespaceURI;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:01.019 -0400", hash_original_field = "D0C143FE297B0E7007B1500CA456F91A", hash_generated_field = "BD4655D30926984A9436717671561554")

    private String localPart;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:01.019 -0400", hash_original_field = "851F5AC9941D720844D143ED9CFCF60A", hash_generated_field = "F717D382565968ED95842821FAEC62F9")

    private String prefix;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:01.019 -0400", hash_original_field = "9533F77F9BE25E0990AF8FC3CA64C259", hash_generated_field = "B78D2FE89B5FD5EFEBEAC57063EE018D")

    private transient String qNameAsString;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:01.020 -0400", hash_original_method = "60C18FFA0999928F4EF4CE38330EEA9C", hash_generated_method = "51B8E8BDEB0E271022481A9B0EF5D037")
    public  QName(final String namespaceURI, final String localPart) {
        this(namespaceURI, localPart, XMLConstants.DEFAULT_NS_PREFIX);
        addTaint(namespaceURI.getTaint());
        addTaint(localPart.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:01.020 -0400", hash_original_method = "87290A11E663766C5D730268BE60DA33", hash_generated_method = "2B6D61295B60BA177D4C50EA42A16290")
    public  QName(String namespaceURI, String localPart, String prefix) {
        {
            this.namespaceURI = XMLConstants.NULL_NS_URI;
        } //End block
        {
            this.namespaceURI = namespaceURI;
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("local part cannot be \"null\" when creating a QName");
        } //End block
        this.localPart = localPart;
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("prefix cannot be \"null\" when creating a QName");
        } //End block
        this.prefix = prefix;
        // ---------- Original Method ----------
        //if (namespaceURI == null) {
            //this.namespaceURI = XMLConstants.NULL_NS_URI;
        //} else {
            //this.namespaceURI = namespaceURI;
        //}
        //if (localPart == null) {
            //throw new IllegalArgumentException("local part cannot be \"null\" when creating a QName");
        //}
        //this.localPart = localPart;
        //if (prefix == null) {
            //throw new IllegalArgumentException("prefix cannot be \"null\" when creating a QName");
        //}
        //this.prefix = prefix;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:01.033 -0400", hash_original_method = "FB37276CA76194E00C121CCB514173FF", hash_generated_method = "D50DCD112C81B0CA312988143BD26BE7")
    public  QName(String localPart) {
        this(
            XMLConstants.NULL_NS_URI,
            localPart,
            XMLConstants.DEFAULT_NS_PREFIX);
        addTaint(localPart.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:01.034 -0400", hash_original_method = "1455FE8FE34AF373D39E8278191439A8", hash_generated_method = "15BBDD11A5E1ACC653A6FD68D0B86AC7")
    public String getNamespaceURI() {
        String varB4EAC82CA7396A68D541C85D26508E83_51213767 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_51213767 = namespaceURI;
        varB4EAC82CA7396A68D541C85D26508E83_51213767.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_51213767;
        // ---------- Original Method ----------
        //return namespaceURI;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:01.034 -0400", hash_original_method = "859D888619C719D6166AE581FCA9B720", hash_generated_method = "62FDBF117C5B99A1A0CE1346B6BEA172")
    public String getLocalPart() {
        String varB4EAC82CA7396A68D541C85D26508E83_1638417031 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1638417031 = localPart;
        varB4EAC82CA7396A68D541C85D26508E83_1638417031.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1638417031;
        // ---------- Original Method ----------
        //return localPart;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:01.043 -0400", hash_original_method = "FA5CE5A0FCC0C736D9446FFEBD0CAB9D", hash_generated_method = "3C8328BFE24DB50D26439A32D2F12321")
    public String getPrefix() {
        String varB4EAC82CA7396A68D541C85D26508E83_1152231549 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1152231549 = prefix;
        varB4EAC82CA7396A68D541C85D26508E83_1152231549.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1152231549;
        // ---------- Original Method ----------
        //return prefix;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:01.043 -0400", hash_original_method = "BFBDC6DCA93063BC73A64B69D67A34C1", hash_generated_method = "A29939C96EF437421D63B9CE38588206")
    public final boolean equals(Object objectToTest) {
        {
            boolean var1738C43110B80B68809A374A2DE0B400_1047454911 = (objectToTest == this);
        } //End collapsed parenthetic
        {
            QName qName;
            qName = (QName) objectToTest;
            boolean var0F7F156F09F7E96CBB489EE5EBBF4A09_982207376 = (localPart.equals(qName.localPart) && namespaceURI.equals(qName.namespaceURI));
        } //End block
        addTaint(objectToTest.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_570284786 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_570284786;
        // ---------- Original Method ----------
        //if (objectToTest == this) {
            //return true;
        //}
        //if (objectToTest instanceof QName) {
            //QName qName = (QName) objectToTest;
            //return localPart.equals(qName.localPart) && namespaceURI.equals(qName.namespaceURI);
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:01.049 -0400", hash_original_method = "DDE43EBD2CC957CB57AF503B05996F38", hash_generated_method = "8AA7C7FAB1709979D01D553F462EB9A3")
    public final int hashCode() {
        int varAE3A2D4E13A297882A9F0F7DFEDC82B1_178737436 = (namespaceURI.hashCode() ^ localPart.hashCode());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2043935168 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2043935168;
        // ---------- Original Method ----------
        //return namespaceURI.hashCode() ^ localPart.hashCode();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:01.051 -0400", hash_original_method = "140023602587BA12FA2AD0493531CEF5", hash_generated_method = "1577FFFF115D45E93AC8535BAF233C55")
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_981386283 = null; //Variable for return #1
        String _qNameAsString;
        _qNameAsString = qNameAsString;
        {
            int nsLength;
            nsLength = namespaceURI.length();
            {
                _qNameAsString = localPart;
            } //End block
            {
                StringBuilder buffer;
                buffer = new StringBuilder(nsLength + localPart.length() + 2);
                buffer.append('{');
                buffer.append(namespaceURI);
                buffer.append('}');
                buffer.append(localPart);
                _qNameAsString = buffer.toString();
            } //End block
            qNameAsString = _qNameAsString;
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_981386283 = _qNameAsString;
        varB4EAC82CA7396A68D541C85D26508E83_981386283.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_981386283;
        // ---------- Original Method ----------
        //String _qNameAsString = qNameAsString;
        //if (_qNameAsString == null) {
            //final int nsLength = namespaceURI.length();
            //if (nsLength == 0) {
                //_qNameAsString = localPart;
            //}
            //else {
                //StringBuilder buffer = new StringBuilder(nsLength + localPart.length() + 2);
                //buffer.append('{');
                //buffer.append(namespaceURI);
                //buffer.append('}');
                //buffer.append(localPart);
                //_qNameAsString = buffer.toString();
            //}
            //qNameAsString = _qNameAsString;
        //}
        //return _qNameAsString;
    }

    
        public static QName valueOf(String qNameAsString) {
        if (qNameAsString == null) {
            throw new IllegalArgumentException("cannot create QName from \"null\" or \"\" String");
        }
        if (qNameAsString.length() == 0) {
            return new QName(
                XMLConstants.NULL_NS_URI,
                qNameAsString,
                XMLConstants.DEFAULT_NS_PREFIX);
        }
        if (qNameAsString.charAt(0) != '{') {
            return new QName(
                XMLConstants.NULL_NS_URI,
                qNameAsString,
                XMLConstants.DEFAULT_NS_PREFIX);
        }
        if (qNameAsString.startsWith("{" + XMLConstants.NULL_NS_URI + "}")) {
            throw new IllegalArgumentException(
                "Namespace URI .equals(XMLConstants.NULL_NS_URI), "
                + ".equals(\"" + XMLConstants.NULL_NS_URI + "\"), "
                + "only the local part, "
                + "\"" + qNameAsString.substring(2 + XMLConstants.NULL_NS_URI.length()) + "\", "
                + "should be provided.");
        }
        int endOfNamespaceURI = qNameAsString.indexOf('}');
        if (endOfNamespaceURI == -1) {
            throw new IllegalArgumentException(
                "cannot create QName from \""
                    + qNameAsString
                    + "\", missing closing \"}\"");
        }
        return new QName(
            qNameAsString.substring(1, endOfNamespaceURI),
            qNameAsString.substring(endOfNamespaceURI + 1),
            XMLConstants.DEFAULT_NS_PREFIX);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:01.054 -0400", hash_original_method = "3A49E665D16E7BB62A75B8A236B62D06", hash_generated_method = "5165934C033A089A52E4D2327AA18185")
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        {
            prefix = XMLConstants.DEFAULT_NS_PREFIX;
        } //End block
        addTaint(in.getTaint());
        // ---------- Original Method ----------
        //in.defaultReadObject();
        //if (prefix == null) {
            //prefix = XMLConstants.DEFAULT_NS_PREFIX;
        //}
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:01.054 -0400", hash_original_field = "C6E1E520055C2B7E9948B6F1429B8974", hash_generated_field = "4D3F16E7238D756057D868633B8EE915")

    private static long serialVersionUID;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:01.054 -0400", hash_original_field = "EDD176DF6676514CA32D772644C30474", hash_generated_field = "01B25CB10B15A58EABA2E6DD2B4FD97B")

    private static long defaultSerialVersionUID = -9120448754896609940L;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:01.054 -0400", hash_original_field = "8717FC749EB098E6911ED18242327B60", hash_generated_field = "95E142EDF7E82FD4A5C2C6071A423DDA")

    private static long compatibilitySerialVersionUID = 4418622981026545151L;
    static {
        String compatPropValue = System.getProperty("org.apache.xml.namespace.QName.useCompatibleSerialVersionUID");
        serialVersionUID = !"1.0".equals(compatPropValue) ? defaultSerialVersionUID : compatibilitySerialVersionUID;
    }
    
}

