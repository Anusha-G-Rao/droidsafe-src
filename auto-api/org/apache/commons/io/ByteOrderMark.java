package org.apache.commons.io;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.Serializable;

public class ByteOrderMark implements Serializable {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:06.651 -0400", hash_original_field = "2016A4FE38556B6598C5FEB99F123C01", hash_generated_field = "294F0480F54B014FA8831418027DC6AA")

    private String charsetName;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:06.651 -0400", hash_original_field = "4B3A6218BB3E3A7303E8A171A60FCF92", hash_generated_field = "0C5E046695D7217A9F5EC920641D817A")

    private int[] bytes;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:06.658 -0400", hash_original_method = "482ECF37ABE57D8C1F1786C0CD279E80", hash_generated_method = "F57646F1FD801DA4A127F4DB0BBE9409")
    public  ByteOrderMark(String charsetName, int... bytes) {
        {
            boolean var38201DF889B785BE56363727018BD2A6_1962078905 = (charsetName == null || charsetName.length() == 0);
            {
                if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("No charsetName specified");
            } //End block
        } //End collapsed parenthetic
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("No bytes specified");
        } //End block
        this.charsetName = charsetName;
        this.bytes = new int[bytes.length];
        System.arraycopy(bytes, 0, this.bytes, 0, bytes.length);
        // ---------- Original Method ----------
        //if (charsetName == null || charsetName.length() == 0) {
            //throw new IllegalArgumentException("No charsetName specified");
        //}
        //if (bytes == null || bytes.length == 0) {
            //throw new IllegalArgumentException("No bytes specified");
        //}
        //this.charsetName = charsetName;
        //this.bytes = new int[bytes.length];
        //System.arraycopy(bytes, 0, this.bytes, 0, bytes.length);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:06.659 -0400", hash_original_method = "62D3F36CA78A6EC4185A2D1A05C169E6", hash_generated_method = "8347F328DDE6B12AE461B3B1A05A4EAC")
    public String getCharsetName() {
        String varB4EAC82CA7396A68D541C85D26508E83_53410982 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_53410982 = charsetName;
        varB4EAC82CA7396A68D541C85D26508E83_53410982.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_53410982;
        // ---------- Original Method ----------
        //return charsetName;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:06.660 -0400", hash_original_method = "52567BA40A41F53DE2F6B00E0A08B85C", hash_generated_method = "B64E88FF0A1AF81125F7E50F8E5B34D9")
    public int length() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1182105478 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1182105478;
        // ---------- Original Method ----------
        //return bytes.length;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:06.676 -0400", hash_original_method = "97E73E03DAE09D2D62A9AEEE833FF79F", hash_generated_method = "E2D001E4965A49F3D0E0DBEABED3DDC1")
    public int get(int pos) {
        addTaint(pos);
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1173633957 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1173633957;
        // ---------- Original Method ----------
        //return bytes[pos];
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:06.676 -0400", hash_original_method = "78D0BF90C8B8ABA8109AF21E9A6358BA", hash_generated_method = "7AA5F0647C63DA9EEDA6E0A7BD039A41")
    public byte[] getBytes() {
        byte[] copy;
        copy = new byte[bytes.length];
        {
            int i;
            i = 0;
            {
                copy[i] = (byte)bytes[i];
            } //End block
        } //End collapsed parenthetic
        byte[] var2F9C81BC6E497382285CD6B7A7E33DE1_667799831 = {getTaintByte()};
        return var2F9C81BC6E497382285CD6B7A7E33DE1_667799831;
        // ---------- Original Method ----------
        //byte[] copy = new byte[bytes.length];
        //for (int i = 0; i < bytes.length; i++) {
            //copy[i] = (byte)bytes[i];
        //}
        //return copy;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:06.677 -0400", hash_original_method = "17B283E675F13C0A62946A353F07CD53", hash_generated_method = "E6AD120DBBE85D1EC4851E0A30435855")
    @Override
    public boolean equals(Object obj) {
        ByteOrderMark bom;
        bom = (ByteOrderMark)obj;
        {
            boolean varDE8E93702D1ED924E289FF092039F16F_796930097 = (bytes.length != bom.length());
        } //End collapsed parenthetic
        {
            int i;
            i = 0;
            {
                {
                    boolean var0CD15BA894BABF88F05A49FB84564CC3_572331889 = (bytes[i] != bom.get(i));
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        addTaint(obj.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1370730821 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1370730821;
        // ---------- Original Method ----------
        //if (!(obj instanceof ByteOrderMark)) {
            //return false;
        //}
        //ByteOrderMark bom = (ByteOrderMark)obj;
        //if (bytes.length != bom.length()) {
            //return false;
        //}
        //for (int i = 0; i < bytes.length; i++) {
            //if (bytes[i] != bom.get(i)) {
                //return false;
            //}
        //}
        //return true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:06.702 -0400", hash_original_method = "16009F7E89FC8CC2A15B27C66C701DE5", hash_generated_method = "ED68DB4850AC85B87915B8A35EA787B3")
    @Override
    public int hashCode() {
        int hashCode;
        hashCode = getClass().hashCode();
        {
            int b = bytes[0];
            {
                hashCode += b;
            } //End block
        } //End collapsed parenthetic
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1859792679 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1859792679;
        // ---------- Original Method ----------
        //int hashCode = getClass().hashCode();
        //for (int b : bytes) {
            //hashCode += b;
        //}
        //return hashCode;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:06.706 -0400", hash_original_method = "C1269ADA454FD9CDC780161D09FCDB9A", hash_generated_method = "360AFA977376DBC57BF80C9F8D4F2ABA")
    @Override
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_1506859166 = null; //Variable for return #1
        StringBuilder builder;
        builder = new StringBuilder();
        builder.append(getClass().getSimpleName());
        builder.append('[');
        builder.append(charsetName);
        builder.append(": ");
        {
            int i;
            i = 0;
            {
                {
                    builder.append(",");
                } //End block
                builder.append("0x");
                builder.append(Integer.toHexString(0xFF & bytes[i]).toUpperCase());
            } //End block
        } //End collapsed parenthetic
        builder.append(']');
        varB4EAC82CA7396A68D541C85D26508E83_1506859166 = builder.toString();
        varB4EAC82CA7396A68D541C85D26508E83_1506859166.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1506859166;
        // ---------- Original Method ----------
        //StringBuilder builder = new StringBuilder();
        //builder.append(getClass().getSimpleName());
        //builder.append('[');
        //builder.append(charsetName);
        //builder.append(": ");
        //for (int i = 0; i < bytes.length; i++) {
            //if (i > 0) {
                //builder.append(",");
            //}
            //builder.append("0x");
            //builder.append(Integer.toHexString(0xFF & bytes[i]).toUpperCase());
        //}
        //builder.append(']');
        //return builder.toString();
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:06.715 -0400", hash_original_field = "0B32F171B7F0DF451D414BE461B5698C", hash_generated_field = "027A87B98733155076ED3CAB6436C7AB")

    private static long serialVersionUID = 1L;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:06.715 -0400", hash_original_field = "ED585B0204695D74D53F52576F764BA1", hash_generated_field = "0EE4AB34DF3A7FE0C980C2CEA09B7D92")

    public static final ByteOrderMark UTF_8    = new ByteOrderMark("UTF-8",    0xEF, 0xBB, 0xBF);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:06.715 -0400", hash_original_field = "2B39F9C61BFB39EE08DBD75AB78B168E", hash_generated_field = "3D14B45311CE99ADDEB6EC56F8774A9D")

    public static final ByteOrderMark UTF_16BE = new ByteOrderMark("UTF-16BE", 0xFE, 0xFF);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:06.715 -0400", hash_original_field = "7135D42E0AFDD2026439864A2D42CD3B", hash_generated_field = "3750D0C2B02CE14E57B1BE9ACECF0D11")

    public static final ByteOrderMark UTF_16LE = new ByteOrderMark("UTF-16LE", 0xFF, 0xFE);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:06.715 -0400", hash_original_field = "C1858D7A0F0E3C2CFB406EC025F3A86F", hash_generated_field = "1DEE4DE7020627F1CE1135D702465501")

    public static final ByteOrderMark UTF_32BE = new ByteOrderMark("UTF-32BE", 0x00, 0x00, 0xFE, 0xFF);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:06.715 -0400", hash_original_field = "B2C1E2E560456827271C5E64F7E162AF", hash_generated_field = "A3C920E79D82B803677D117982E9CAFA")

    public static final ByteOrderMark UTF_32LE = new ByteOrderMark("UTF-32LE", 0xFF, 0xFE, 0x00, 0x00);
}

