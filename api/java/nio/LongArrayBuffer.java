package java.nio;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;





abstract class LongArrayBuffer extends LongBuffer {
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:35.471 -0500", hash_original_field = "E767141AD2A9691035B7D6080D48C564", hash_generated_field = "328A8BF34389CAFD34319C79BCDE07B5")


    protected  long[] backingArray;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:35.472 -0500", hash_original_field = "B7E810BF01B52122CB927525A0CA4721", hash_generated_field = "22BBBB3BDBDCD622FED3EBF1A70B4EC5")


    protected  int offset;

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:35.473 -0500", hash_original_method = "D20A97F337BC1EF41CF62C2D80A010BB", hash_generated_method = "D20A97F337BC1EF41CF62C2D80A010BB")
    LongArrayBuffer(long[] array) {
        this(array.length, array, 0);
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:35.474 -0500", hash_original_method = "EE894B007B87BC6BD13255E42716BBF0", hash_generated_method = "EE894B007B87BC6BD13255E42716BBF0")
    LongArrayBuffer(int capacity) {
        this(capacity, new long[capacity], 0);
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:35.475 -0500", hash_original_method = "C693B30298FFAD9EFA29C4595321A1EB", hash_generated_method = "C693B30298FFAD9EFA29C4595321A1EB")
    LongArrayBuffer(int capacity, long[] backingArray, int offset) {
        super(capacity);
        this.backingArray = backingArray;
        this.offset = offset;
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:35.476 -0500", hash_original_method = "E2FF30257BFFCB6B65D7425E7B88C7B2", hash_generated_method = "A3A189D5C44D04E11EE6C105CD763853")
    @Override
public final long get() {
        if (position == limit) {
            throw new BufferUnderflowException();
        }
        return backingArray[offset + position++];
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:35.477 -0500", hash_original_method = "E501A733A2C96D5405AAE01CF07D222B", hash_generated_method = "9ABF9E10528DA276BC0352030FE41B74")
    @Override
public final long get(int index) {
        checkIndex(index);
        return backingArray[offset + index];
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:35.478 -0500", hash_original_method = "E85CBDF91AD45B8A94165F7B57575CBE", hash_generated_method = "524D3B860D2F69FBB1C115495288FCD5")
    @Override
public final LongBuffer get(long[] dst, int dstOffset, int longCount) {
        if (longCount > remaining()) {
            throw new BufferUnderflowException();
        }
        System.arraycopy(backingArray, offset + position, dst, dstOffset, longCount);
        position += longCount;
        return this;
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:35.479 -0500", hash_original_method = "5B6C9F359344527666A57577F107BCAE", hash_generated_method = "1EC9A508074FE2792E86546C8EBA9E2B")
    @Override
public final boolean isDirect() {
        return false;
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:35.480 -0500", hash_original_method = "A08DEC6C777D2C1D29E23F2F39FEA4AD", hash_generated_method = "FF53E3A2EB4F54AB08FAE8FA7C0C29DD")
    @Override
public final ByteOrder order() {
        return ByteOrder.nativeOrder();
    }

    
}

