package gov.nist.javax.sip.header;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import gov.nist.core.HostPort;
import gov.nist.javax.sip.address.AddressImpl;
import gov.nist.javax.sip.parser.Parser;
import javax.sip.header.FromHeader;
import java.text.ParseException;

public final class From extends AddressParametersHeader implements javax.sip.header.FromHeader {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:31.013 -0400", hash_original_method = "A8AF16A2B82DF0D28539600E0CD03867", hash_generated_method = "8B4FB7A089C02734F178949F120FBE8D")
    public  From() {
        super(NAME);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:31.013 -0400", hash_original_method = "DD530C3FC2E9C76342F91D9F2F4B8C8E", hash_generated_method = "C668CDCF72836DF38F79E2CF0F636199")
    public  From(To to) {
        super(NAME);
        address = to.address;
        parameters = to.parameters;
        addTaint(to.getTaint());
        // ---------- Original Method ----------
        //address = to.address;
        //parameters = to.parameters;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:31.027 -0400", hash_original_method = "E7A2FB4AC135D29D78CE09D5448C290F", hash_generated_method = "30703540D84D9A0393F6ECEE142DDD80")
    protected String encodeBody() {
        String varB4EAC82CA7396A68D541C85D26508E83_861919885 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_861919885 = encodeBody(new StringBuffer()).toString();
        varB4EAC82CA7396A68D541C85D26508E83_861919885.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_861919885;
        // ---------- Original Method ----------
        //return encodeBody(new StringBuffer()).toString();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:31.028 -0400", hash_original_method = "27E6A85D53E8FED6E5ECB6F24D4DAAA6", hash_generated_method = "478BA4B7F9A4BEC92272ED40FE97E65E")
    protected StringBuffer encodeBody(StringBuffer buffer) {
        StringBuffer varB4EAC82CA7396A68D541C85D26508E83_1782077299 = null; //Variable for return #1
        {
            boolean varA8A94084CEDB8AE131E76CDFE26F1997_1946462538 = (address.getAddressType() == AddressImpl.ADDRESS_SPEC);
            {
                buffer.append(LESS_THAN);
            } //End block
        } //End collapsed parenthetic
        address.encode(buffer);
        {
            boolean varA8A94084CEDB8AE131E76CDFE26F1997_633813088 = (address.getAddressType() == AddressImpl.ADDRESS_SPEC);
            {
                buffer.append(GREATER_THAN);
            } //End block
        } //End collapsed parenthetic
        {
            boolean varB381AD842454BDB2397F4C2DAD0B3FA1_727378647 = (!parameters.isEmpty());
            {
                buffer.append(SEMICOLON);
                parameters.encode(buffer);
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_1782077299 = buffer;
        addTaint(buffer.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1782077299.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1782077299;
        // ---------- Original Method ----------
        //if (address.getAddressType() == AddressImpl.ADDRESS_SPEC) {
            //buffer.append(LESS_THAN);
        //}
        //address.encode(buffer);
        //if (address.getAddressType() == AddressImpl.ADDRESS_SPEC) {
            //buffer.append(GREATER_THAN);
        //}
        //if (!parameters.isEmpty()) {
            //buffer.append(SEMICOLON);
            //parameters.encode(buffer);
        //}
        //return buffer;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:31.029 -0400", hash_original_method = "44C2A950FA90F046EF96B0A5F25DEA38", hash_generated_method = "CC9570155B2B8009802C370168F6E1BD")
    public HostPort getHostPort() {
        HostPort varB4EAC82CA7396A68D541C85D26508E83_670491619 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_670491619 = address.getHostPort();
        varB4EAC82CA7396A68D541C85D26508E83_670491619.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_670491619;
        // ---------- Original Method ----------
        //return address.getHostPort();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:31.032 -0400", hash_original_method = "0AF5B36A8F5D506032669B65B9CFDD39", hash_generated_method = "43993202764D41F20794C66802DEBACA")
    public String getDisplayName() {
        String varB4EAC82CA7396A68D541C85D26508E83_1045516216 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1045516216 = address.getDisplayName();
        varB4EAC82CA7396A68D541C85D26508E83_1045516216.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1045516216;
        // ---------- Original Method ----------
        //return address.getDisplayName();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:31.046 -0400", hash_original_method = "2057D1C8F1E8BB8C55512212A4FDB01D", hash_generated_method = "68ACDEB9751F95C24325BF4132322840")
    public String getTag() {
        String varB4EAC82CA7396A68D541C85D26508E83_1153912611 = null; //Variable for return #1
        String varB4EAC82CA7396A68D541C85D26508E83_1963847777 = null; //Variable for return #2
        varB4EAC82CA7396A68D541C85D26508E83_1153912611 = null;
        varB4EAC82CA7396A68D541C85D26508E83_1963847777 = getParameter(ParameterNames.TAG);
        String varA7E53CE21691AB073D9660D615818899_1456661374; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1456661374 = varB4EAC82CA7396A68D541C85D26508E83_1153912611;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1456661374 = varB4EAC82CA7396A68D541C85D26508E83_1963847777;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1456661374.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1456661374;
        // ---------- Original Method ----------
        //if (parameters == null)
            //return null;
        //return getParameter(ParameterNames.TAG);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:31.046 -0400", hash_original_method = "17DACA856A7B157094F93A364689CD76", hash_generated_method = "81ACAEC55527E0F9620088786AD7DD95")
    public boolean hasTag() {
        boolean var6FA539423622336D479E26E4BC38CB5D_509827708 = (hasParameter(ParameterNames.TAG));
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1300372765 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1300372765;
        // ---------- Original Method ----------
        //return hasParameter(ParameterNames.TAG);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:31.047 -0400", hash_original_method = "6CBAE502E931683D712FFCD149457FE9", hash_generated_method = "591C4D746C800825165C55AACDA722E0")
    public void removeTag() {
        parameters.delete(ParameterNames.TAG);
        // ---------- Original Method ----------
        //parameters.delete(ParameterNames.TAG);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:31.047 -0400", hash_original_method = "2BC13538206715D5DC8E4E386607DAE6", hash_generated_method = "FCB09DD846F3388C4D68BC3653359E26")
    public void setAddress(javax.sip.address.Address address) {
        this.address = (AddressImpl) address;
        addTaint(address.getTaint());
        // ---------- Original Method ----------
        //this.address = (AddressImpl) address;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:31.063 -0400", hash_original_method = "8317B37B8D85C50DB928305D5320BE87", hash_generated_method = "5699316D34767019B630E0ED4ECDB2FC")
    public void setTag(String t) throws ParseException {
        Parser.checkToken(t);
        this.setParameter(ParameterNames.TAG, t);
        addTaint(t.getTaint());
        // ---------- Original Method ----------
        //Parser.checkToken(t);
        //this.setParameter(ParameterNames.TAG, t);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:31.064 -0400", hash_original_method = "37555C718EB6A285C8BC30DC0A9F7E97", hash_generated_method = "8EA2D13A25D1C282AD24C274A2924029")
    public String getUserAtHostPort() {
        String varB4EAC82CA7396A68D541C85D26508E83_936956166 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_936956166 = address.getUserAtHostPort();
        varB4EAC82CA7396A68D541C85D26508E83_936956166.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_936956166;
        // ---------- Original Method ----------
        //return address.getUserAtHostPort();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:31.064 -0400", hash_original_method = "C3BE149D6ECB953ABC4DB66247B816D2", hash_generated_method = "195483F50FAB797C08BCC15B4FE24C48")
    public boolean equals(Object other) {
        boolean var26F738A7BDC5DB0DA65628E1DFDFF566_1422276706 = ((other instanceof FromHeader) && super.equals(other));
        addTaint(other.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1981552438 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1981552438;
        // ---------- Original Method ----------
        //return (other instanceof FromHeader) && super.equals(other);
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:31.067 -0400", hash_original_field = "E22E7B803F01166739DD9E9BEF3A661F", hash_generated_field = "7F5EA88E0F3D27CAFA6DE94C8C42DF93")

    private static long serialVersionUID = -6312727234330643892L;
}

