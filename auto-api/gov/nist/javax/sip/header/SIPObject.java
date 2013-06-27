package gov.nist.javax.sip.header;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import gov.nist.core.GenericObject;
import gov.nist.core.GenericObjectList;
import gov.nist.core.InternalErrorHandler;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public abstract class SIPObject extends GenericObject {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:31.870 -0400", hash_original_method = "F2415C91D035ABB45320678077A163BD", hash_generated_method = "90A009E0ECCD723DE48100CDD9B85812")
    protected  SIPObject() {
        super();
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:31.870 -0400", hash_original_method = "BC21211AABBF5A727CE8CE0C8A5F5ABC", hash_generated_method = "07941E956AE5C75C7E5403F7A3FDE19E")
    public void dbgPrint() {
        super.dbgPrint();
        // ---------- Original Method ----------
        //super.dbgPrint();
    }

    
    public abstract String encode();

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:31.871 -0400", hash_original_method = "23BD5BF1494AAB1936A4882B6C7896EB", hash_generated_method = "8C161AB29C408CA19C2B84554EF015CD")
    public StringBuffer encode(StringBuffer buffer) {
        StringBuffer varB4EAC82CA7396A68D541C85D26508E83_1903836423 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1903836423 = buffer.append(encode());
        addTaint(buffer.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1903836423.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1903836423;
        // ---------- Original Method ----------
        //return buffer.append(encode());
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:31.885 -0400", hash_original_method = "C625D56C28F833180267D6A3AE3C9C8E", hash_generated_method = "D555C972B34842A350322003622B26EE")
    public boolean equals(Object other) {
        {
            boolean varE5000AFAE6691EEE0058A00BC83324BD_1379599122 = (!this.getClass().equals(other.getClass()));
        } //End collapsed parenthetic
        SIPObject that;
        that = (SIPObject) other;
        Class myclass;
        myclass = this.getClass();
        Class hisclass;
        hisclass = other.getClass();
        {
            Field[] fields;
            fields = myclass.getDeclaredFields();
            {
                boolean var9ADDFA0B18F8F828C161936DB04CEFF2_377306637 = (!hisclass.equals(myclass));
            } //End collapsed parenthetic
            Field[] hisfields;
            hisfields = hisclass.getDeclaredFields();
            {
                int i;
                i = 0;
                {
                    Field f;
                    f = fields[i];
                    Field g;
                    g = hisfields[i];
                    int modifier;
                    modifier = f.getModifiers();
                    Class fieldType;
                    fieldType = f.getType();
                    String fieldName;
                    fieldName = f.getName();
                    {
                        boolean var7406A77B5C83EDCF5377C17BF1AF8946_144941941 = (fieldName.compareTo("stringRepresentation") == 0);
                    } //End collapsed parenthetic
                    {
                        boolean var4BC3FF330F550C7BBF44DF279771A596_100757760 = (fieldName.compareTo("indentation") == 0);
                    } //End collapsed parenthetic
                    try 
                    {
                        {
                            boolean varA02EA4574D838DD5C519F1195763C1D8_49114959 = (fieldType.isPrimitive());
                            {
                                String fname;
                                fname = fieldType.toString();
                                {
                                    boolean var4FE1563E48DA3AE81064849A8926BED4_1010513817 = (fname.compareTo("int") == 0);
                                    {
                                        {
                                            boolean var9FFD589FB326B48E92092BBEC4F82DC8_354282047 = (f.getInt(this) != g.getInt(that));
                                        } //End collapsed parenthetic
                                    } //End block
                                    {
                                        boolean var460EE96C7907B5AECEF23E2913477551_210483934 = (fname.compareTo("short") == 0);
                                        {
                                            {
                                                boolean var61EE094D43808A12BFCF634C6C575280_555737917 = (f.getShort(this) != g.getShort(that));
                                            } //End collapsed parenthetic
                                        } //End block
                                        {
                                            boolean var4E4904AB74B6D2B83A1124020050C226_1215455873 = (fname.compareTo("char") == 0);
                                            {
                                                {
                                                    boolean varED9C2E334F82F90F5E41AE8950CDF3E4_703459138 = (f.getChar(this) != g.getChar(that));
                                                } //End collapsed parenthetic
                                            } //End block
                                            {
                                                boolean var28DA6C4AF68B340247A24B14D9A5EFA6_708417105 = (fname.compareTo("long") == 0);
                                                {
                                                    {
                                                        boolean varC71C62B8B7ED1D13CF4DAF6B4E8ECDB5_1051885526 = (f.getLong(this) != g.getLong(that));
                                                    } //End collapsed parenthetic
                                                } //End block
                                                {
                                                    boolean var544FBCB3A6888ED08F519AE301AB6CE2_1846048013 = (fname.compareTo("boolean") == 0);
                                                    {
                                                        {
                                                            boolean var8F07C617E4B46B2300AA4EE12C709278_560733999 = (f.getBoolean(this) != g.getBoolean(that));
                                                        } //End collapsed parenthetic
                                                    } //End block
                                                    {
                                                        boolean var8761AD76B1E1D1FE507E180A511DE8F6_1959838382 = (fname.compareTo("double") == 0);
                                                        {
                                                            {
                                                                boolean var22302C3D3326D92671FE4F1EA186F2CA_336527709 = (f.getDouble(this) != g.getDouble(that));
                                                            } //End collapsed parenthetic
                                                        } //End block
                                                        {
                                                            boolean var790B66226FF0DEFD9E067842BFE0C9AF_1702081068 = (fname.compareTo("float") == 0);
                                                            {
                                                                {
                                                                    boolean var1BD555D51FC2DE23003F271AFA8F6DBD_748693969 = (f.getFloat(this) != g.getFloat(that));
                                                                } //End collapsed parenthetic
                                                            } //End block
                                                        } //End collapsed parenthetic
                                                    } //End collapsed parenthetic
                                                } //End collapsed parenthetic
                                            } //End collapsed parenthetic
                                        } //End collapsed parenthetic
                                    } //End collapsed parenthetic
                                } //End collapsed parenthetic
                            } //End block
                            {
                                boolean varAA8F4E7F9752016DF7A866D138AF57F2_1895056144 = (g.get(that) == f.get(this));
                                {
                                    boolean var77209C918A38A144D72382BEE175E0D9_213579278 = (f.get(this) == null && g.get(that) != null);
                                    {
                                        boolean var38EA3AAB13A9E43EC20C16903B7464A5_192612638 = (g.get(that) == null && f.get(this) != null);
                                        {
                                            boolean var40760574C0FFA80349F6AC8002CC0D1A_559306441 = (!f.get(this).equals(g.get(that)));
                                        } //End collapsed parenthetic
                                    } //End collapsed parenthetic
                                } //End collapsed parenthetic
                            } //End collapsed parenthetic
                        } //End collapsed parenthetic
                    } //End block
                    catch (IllegalAccessException ex1)
                    {
                        System.out.println("accessed field " + fieldName);
                        System.out.println("modifier  " + modifier);
                        System.out.println("modifier.private  " + Modifier.PRIVATE);
                        InternalErrorHandler.handleException(ex1);
                    } //End block
                } //End block
            } //End collapsed parenthetic
            {
                boolean varB5EAA67C83B99E360F39896EE40AADA7_819164945 = (myclass.equals(SIPObject.class));
                {
                    myclass = myclass.getSuperclass();
                    hisclass = hisclass.getSuperclass();
                } //End block
            } //End collapsed parenthetic
        } //End block
        addTaint(other.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1701055367 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1701055367;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:31.908 -0400", hash_original_method = "060178C12313F034DC0CE078907A1CE4", hash_generated_method = "4A220BE802A308876E2B18868313A00E")
    public boolean match(Object other) {
        {
            boolean varE5000AFAE6691EEE0058A00BC83324BD_125038935 = (!this.getClass().equals(other.getClass()));
        } //End collapsed parenthetic
        GenericObject that;
        that = (GenericObject) other;
        Class myclass;
        myclass = this.getClass();
        Class hisclass;
        hisclass = other.getClass();
        {
            Field[] fields;
            fields = myclass.getDeclaredFields();
            Field[] hisfields;
            hisfields = hisclass.getDeclaredFields();
            {
                int i;
                i = 0;
                {
                    Field f;
                    f = fields[i];
                    Field g;
                    g = hisfields[i];
                    int modifier;
                    modifier = f.getModifiers();
                    Class fieldType;
                    fieldType = f.getType();
                    String fieldName;
                    fieldName = f.getName();
                    {
                        boolean var7406A77B5C83EDCF5377C17BF1AF8946_817511353 = (fieldName.compareTo("stringRepresentation") == 0);
                    } //End collapsed parenthetic
                    {
                        boolean var4BC3FF330F550C7BBF44DF279771A596_1100360764 = (fieldName.compareTo("indentation") == 0);
                    } //End collapsed parenthetic
                    try 
                    {
                        {
                            boolean varA02EA4574D838DD5C519F1195763C1D8_1359967957 = (fieldType.isPrimitive());
                            {
                                String fname;
                                fname = fieldType.toString();
                                {
                                    boolean var4FE1563E48DA3AE81064849A8926BED4_1155362461 = (fname.compareTo("int") == 0);
                                    {
                                        {
                                            boolean var9FFD589FB326B48E92092BBEC4F82DC8_1846125207 = (f.getInt(this) != g.getInt(that));
                                        } //End collapsed parenthetic
                                    } //End block
                                    {
                                        boolean var460EE96C7907B5AECEF23E2913477551_751139122 = (fname.compareTo("short") == 0);
                                        {
                                            {
                                                boolean var61EE094D43808A12BFCF634C6C575280_436451549 = (f.getShort(this) != g.getShort(that));
                                            } //End collapsed parenthetic
                                        } //End block
                                        {
                                            boolean var4E4904AB74B6D2B83A1124020050C226_792435192 = (fname.compareTo("char") == 0);
                                            {
                                                {
                                                    boolean varED9C2E334F82F90F5E41AE8950CDF3E4_1683656812 = (f.getChar(this) != g.getChar(that));
                                                } //End collapsed parenthetic
                                            } //End block
                                            {
                                                boolean var28DA6C4AF68B340247A24B14D9A5EFA6_1082867451 = (fname.compareTo("long") == 0);
                                                {
                                                    {
                                                        boolean varC71C62B8B7ED1D13CF4DAF6B4E8ECDB5_823166033 = (f.getLong(this) != g.getLong(that));
                                                    } //End collapsed parenthetic
                                                } //End block
                                                {
                                                    boolean var544FBCB3A6888ED08F519AE301AB6CE2_1928563740 = (fname.compareTo("boolean") == 0);
                                                    {
                                                        {
                                                            boolean var8F07C617E4B46B2300AA4EE12C709278_588992264 = (f.getBoolean(this) != g.getBoolean(that));
                                                        } //End collapsed parenthetic
                                                    } //End block
                                                    {
                                                        boolean var8761AD76B1E1D1FE507E180A511DE8F6_1300022990 = (fname.compareTo("double") == 0);
                                                        {
                                                            {
                                                                boolean var22302C3D3326D92671FE4F1EA186F2CA_1378431796 = (f.getDouble(this) != g.getDouble(that));
                                                            } //End collapsed parenthetic
                                                        } //End block
                                                        {
                                                            boolean var790B66226FF0DEFD9E067842BFE0C9AF_1908161638 = (fname.compareTo("float") == 0);
                                                            {
                                                                {
                                                                    boolean var1BD555D51FC2DE23003F271AFA8F6DBD_267815121 = (f.getFloat(this) != g.getFloat(that));
                                                                } //End collapsed parenthetic
                                                            } //End block
                                                            {
                                                                InternalErrorHandler.handleException(
                                "unknown type");
                                                            } //End block
                                                        } //End collapsed parenthetic
                                                    } //End collapsed parenthetic
                                                } //End collapsed parenthetic
                                            } //End collapsed parenthetic
                                        } //End collapsed parenthetic
                                    } //End collapsed parenthetic
                                } //End collapsed parenthetic
                            } //End block
                            {
                                Object myObj;
                                myObj = f.get(this);
                                Object hisObj;
                                hisObj = g.get(that);
                                {
                                    {
                                        boolean varE494E29739BB35A1FB64E1E8FE21BE78_2069593899 = ((((String) hisObj).trim()).equals(""));
                                    } //End collapsed parenthetic
                                    {
                                        boolean varDE40D545EC09CF05DB34B16AE2D8BFAD_38494274 = (((String) myObj)
                                .compareToIgnoreCase((String) hisObj)
                                != 0);
                                    } //End collapsed parenthetic
                                } //End block
                                {
                                    boolean var49F0B31231A0DE4891AB287D1C5C305A_612041569 = (hisObj != null
                                && GenericObject.isMySubclass(myObj.getClass())
                                && GenericObject.isMySubclass(hisObj.getClass())
                                && myObj.getClass().equals(hisObj.getClass())
                                && ((GenericObject) hisObj).getMatcher()
                                    != null);
                                    {
                                        String myObjEncoded;
                                        myObjEncoded = ((GenericObject) myObj).encode();
                                        boolean retval;
                                        retval = ((GenericObject) hisObj).getMatcher().match(
                                    myObjEncoded);
                                    } //End block
                                    {
                                        boolean var23E104026FF8191A6303BED8A98BF008_164723812 = (GenericObject.isMySubclass(myObj.getClass())
                                && !((GenericObject) myObj).match(hisObj));
                                        {
                                            boolean var2386E6059110DC674FEC38F1CD1B8812_907505814 = (GenericObjectList.isMySubclass(myObj.getClass())
                                && !((GenericObjectList) myObj).match(hisObj));
                                        } //End collapsed parenthetic
                                    } //End collapsed parenthetic
                                } //End collapsed parenthetic
                            } //End block
                        } //End collapsed parenthetic
                    } //End block
                    catch (IllegalAccessException ex1)
                    {
                        InternalErrorHandler.handleException(ex1);
                    } //End block
                } //End block
            } //End collapsed parenthetic
            {
                boolean varB5EAA67C83B99E360F39896EE40AADA7_311529992 = (myclass.equals(SIPObject.class));
                {
                    myclass = myclass.getSuperclass();
                    hisclass = hisclass.getSuperclass();
                } //End block
            } //End collapsed parenthetic
        } //End block
        addTaint(other.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_891798283 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_891798283;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:31.932 -0400", hash_original_method = "8C7E8103DEE2671781774C37BABA3BB5", hash_generated_method = "EF7E345DFA2B6A644E98FB2EF23BF51E")
    public String debugDump() {
        String varB4EAC82CA7396A68D541C85D26508E83_1075572664 = null; //Variable for return #1
        stringRepresentation = "";
        Class myclass;
        myclass = getClass();
        sprint(myclass.getName());
        sprint("{");
        Field[] fields;
        fields = myclass.getDeclaredFields();
        {
            int i;
            i = 0;
            {
                Field f;
                f = fields[i];
                int modifier;
                modifier = f.getModifiers();
                Class fieldType;
                fieldType = f.getType();
                String fieldName;
                fieldName = f.getName();
                {
                    boolean var9553731A42361BF7DC5CCD8CE3EA7CE0_1261030594 = (fieldName.compareTo("stringRepresentation") == 0);
                } //End collapsed parenthetic
                {
                    boolean varAEA832B4D7325A04DB2E217DE472721D_989995371 = (fieldName.compareTo("indentation") == 0);
                } //End collapsed parenthetic
                sprint(fieldName + ":");
                try 
                {
                    {
                        boolean varEB7331DA69828FA2B551971C05AF6235_764510723 = (fieldType.isPrimitive());
                        {
                            String fname;
                            fname = fieldType.toString();
                            sprint(fname + ":");
                            {
                                boolean var4CCBD530AB7CEC48FD13CB4D5B1284E0_1615219179 = (fname.compareTo("int") == 0);
                                {
                                    int intfield;
                                    intfield = f.getInt(this);
                                    sprint(intfield);
                                } //End block
                                {
                                    boolean varECBE882B00F953257800779B015A044A_995510350 = (fname.compareTo("short") == 0);
                                    {
                                        short shortField;
                                        shortField = f.getShort(this);
                                        sprint(shortField);
                                    } //End block
                                    {
                                        boolean varFF6F4832473A71F8EC5346F9584CA1A4_581597328 = (fname.compareTo("char") == 0);
                                        {
                                            char charField;
                                            charField = f.getChar(this);
                                            sprint(charField);
                                        } //End block
                                        {
                                            boolean varC3D60E7CA564385C1E6CA965551B84B9_1780563899 = (fname.compareTo("long") == 0);
                                            {
                                                long longField;
                                                longField = f.getLong(this);
                                                sprint(longField);
                                            } //End block
                                            {
                                                boolean varDEFD334EAB943FE4F6ADC4A9D68CC2D0_836719043 = (fname.compareTo("boolean") == 0);
                                                {
                                                    boolean booleanField;
                                                    booleanField = f.getBoolean(this);
                                                    sprint(booleanField);
                                                } //End block
                                                {
                                                    boolean var7199B82B3E59A867EA681451AF585474_1707008324 = (fname.compareTo("double") == 0);
                                                    {
                                                        double doubleField;
                                                        doubleField = f.getDouble(this);
                                                        sprint(doubleField);
                                                    } //End block
                                                    {
                                                        boolean varA4C55C1B6673FD16D2CEFF9326676E6A_217457052 = (fname.compareTo("float") == 0);
                                                        {
                                                            float floatField;
                                                            floatField = f.getFloat(this);
                                                            sprint(floatField);
                                                        } //End block
                                                    } //End collapsed parenthetic
                                                } //End collapsed parenthetic
                                            } //End collapsed parenthetic
                                        } //End collapsed parenthetic
                                    } //End collapsed parenthetic
                                } //End collapsed parenthetic
                            } //End collapsed parenthetic
                        } //End block
                        {
                            boolean varD5A8092938B037D2C43A6EAD0E6B9173_1248835149 = (GenericObject.class.isAssignableFrom(fieldType));
                            {
                                {
                                    boolean varFF6BA6C3E22248032CA1E2ADDB055F70_1539217811 = (f.get(this) != null);
                                    {
                                        sprint(
                            ((GenericObject) f.get(this)).debugDump(
                                indentation + 1));
                                    } //End block
                                    {
                                        sprint("<null>");
                                    } //End block
                                } //End collapsed parenthetic
                            } //End block
                            {
                                boolean var3D135DF8A6804404B214F5224E4565F6_578345218 = (GenericObjectList.class.isAssignableFrom(fieldType));
                                {
                                    {
                                        boolean var32C4A31DCBD23D1B28FA59D1C0318853_442289125 = (f.get(this) != null);
                                        {
                                            sprint(
                            ((GenericObjectList) f.get(this)).debugDump(
                                indentation + 1));
                                        } //End block
                                        {
                                            sprint("<null>");
                                        } //End block
                                    } //End collapsed parenthetic
                                } //End block
                                {
                                    {
                                        boolean var32C4A31DCBD23D1B28FA59D1C0318853_705057038 = (f.get(this) != null);
                                        {
                                            sprint(f.get(this).getClass().getName() + ":");
                                        } //End block
                                        {
                                            sprint(fieldType.getName() + ":");
                                        } //End block
                                    } //End collapsed parenthetic
                                    sprint("{");
                                    {
                                        boolean var32C4A31DCBD23D1B28FA59D1C0318853_2393106 = (f.get(this) != null);
                                        {
                                            sprint(f.get(this).toString());
                                        } //End block
                                        {
                                            sprint("<null>");
                                        } //End block
                                    } //End collapsed parenthetic
                                    sprint("}");
                                } //End block
                            } //End collapsed parenthetic
                        } //End collapsed parenthetic
                    } //End collapsed parenthetic
                } //End block
                catch (IllegalAccessException ex1)
                { }
            } //End block
        } //End collapsed parenthetic
        sprint("}");
        varB4EAC82CA7396A68D541C85D26508E83_1075572664 = stringRepresentation;
        varB4EAC82CA7396A68D541C85D26508E83_1075572664.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1075572664;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:31.933 -0400", hash_original_method = "85620320EA37710A8866ECA4B349D636", hash_generated_method = "C473684F310B12F4938E0121EFBD3635")
    public String debugDump(int indent) {
        String varB4EAC82CA7396A68D541C85D26508E83_1378708300 = null; //Variable for return #1
        int save;
        save = indentation;
        indentation = indent;
        String retval;
        retval = this.debugDump();
        indentation = save;
        varB4EAC82CA7396A68D541C85D26508E83_1378708300 = retval;
        addTaint(indent);
        varB4EAC82CA7396A68D541C85D26508E83_1378708300.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1378708300;
        // ---------- Original Method ----------
        //int save = indentation;
        //indentation = indent;
        //String retval = this.debugDump();
        //indentation = save;
        //return retval;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:31.934 -0400", hash_original_method = "9121421793EC5D37F14A312213FF0274", hash_generated_method = "1735F3F8F7BB1B59F9E95F086543C7F4")
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_694162036 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_694162036 = this.encode();
        varB4EAC82CA7396A68D541C85D26508E83_694162036.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_694162036;
        // ---------- Original Method ----------
        //return this.encode();
    }

    
}

