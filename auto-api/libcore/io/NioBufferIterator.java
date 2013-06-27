package libcore.io;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import libcore.io.Memory;

public final class NioBufferIterator extends BufferIterator {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:04.362 -0400", hash_original_field = "884D9804999FC47A3C2694E49AD2536A", hash_generated_field = "849BAB492558B51E7BC4F1C331A435E4")

    private int address;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:04.362 -0400", hash_original_field = "F7BD60B75B29D79B660A2859395C1A24", hash_generated_field = "F06612A05C836674433E69C513561353")

    private int size;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:04.362 -0400", hash_original_field = "F0A1DFDC675B0A14A64099F7AC1CEE83", hash_generated_field = "A6B25CFBA8585537085014684252B717")

    private boolean swap;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:04.362 -0400", hash_original_field = "4757FE07FD492A8BE0EA6A760D683D6E", hash_generated_field = "312206EA2404526B7BBC621459C87A80")

    private int position;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:04.363 -0400", hash_original_method = "1851358DA9BE5B3D125F1A8CE59A39B7", hash_generated_method = "0424634FEE076B20A42B61ECA5D4A252")
      NioBufferIterator(int address, int size, boolean swap) {
        this.address = address;
        this.size = size;
        this.swap = swap;
        // ---------- Original Method ----------
        //this.address = address;
        //this.size = size;
        //this.swap = swap;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:04.369 -0400", hash_original_method = "E36D4B83C08A879BB369FD4BF3E743B5", hash_generated_method = "D66EB936D868E838CC6FBF758BD016A1")
    public void seek(int offset) {
        position = offset;
        // ---------- Original Method ----------
        //position = offset;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:04.369 -0400", hash_original_method = "5C6BD475B81B38C95ED571F8A0E18EDC", hash_generated_method = "940E96887BCB1FBE664555A63C820A3C")
    public void skip(int byteCount) {
        position += byteCount;
        // ---------- Original Method ----------
        //position += byteCount;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:04.370 -0400", hash_original_method = "AF50505279F6805CCFBDD6FA7CF3687B", hash_generated_method = "492B02E09F3A360B48B8E4A16CF793B5")
    public void readByteArray(byte[] dst, int dstOffset, int byteCount) {
        Memory.peekByteArray(address + position, dst, dstOffset, byteCount);
        position += byteCount;
        addTaint(dst[0]);
        addTaint(dstOffset);
        // ---------- Original Method ----------
        //Memory.peekByteArray(address + position, dst, dstOffset, byteCount);
        //position += byteCount;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:04.372 -0400", hash_original_method = "47AEAAA269BE342FCE4A8C8B269BAED8", hash_generated_method = "1C71C6BE4F8FF5826EA7C04EFA32BE1F")
    public byte readByte() {
        byte result;
        result = Memory.peekByte(address + position);
        byte var40EA57D3EE3C07BF1C102B466E1C3091_102669948 = getTaintByte();
        return var40EA57D3EE3C07BF1C102B466E1C3091_102669948;
        // ---------- Original Method ----------
        //byte result = Memory.peekByte(address + position);
        //++position;
        //return result;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:04.374 -0400", hash_original_method = "F3BC6F7E073908C181908589CEF0FEA1", hash_generated_method = "C65BF6585C6A1E0FFDE45E3063F0D0BC")
    public int readInt() {
        int result;
        result = Memory.peekInt(address + position, swap);
        position += SizeOf.INT;
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_768384457 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_768384457;
        // ---------- Original Method ----------
        //int result = Memory.peekInt(address + position, swap);
        //position += SizeOf.INT;
        //return result;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:04.375 -0400", hash_original_method = "61F99480AF42C401222A5DDE05D611E9", hash_generated_method = "A1FE7CE6584C4C782D986A25243093A8")
    public void readIntArray(int[] dst, int dstOffset, int intCount) {
        Memory.peekIntArray(address + position, dst, dstOffset, intCount, swap);
        position += SizeOf.INT * intCount;
        addTaint(dst[0]);
        addTaint(dstOffset);
        // ---------- Original Method ----------
        //Memory.peekIntArray(address + position, dst, dstOffset, intCount, swap);
        //position += SizeOf.INT * intCount;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:04.375 -0400", hash_original_method = "34473D83268F7BAA3E1410708A3FD84F", hash_generated_method = "73CBB595199EB12FC2C85CB1EF3FCBD8")
    public short readShort() {
        short result;
        result = Memory.peekShort(address + position, swap);
        position += SizeOf.SHORT;
        short var4F09DAA9D95BCB166A302407A0E0BABE_1563195009 = getTaintShort();
        return var4F09DAA9D95BCB166A302407A0E0BABE_1563195009;
        // ---------- Original Method ----------
        //short result = Memory.peekShort(address + position, swap);
        //position += SizeOf.SHORT;
        //return result;
    }

    
}

