package java.nio;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import libcore.io.Memory;
import libcore.io.SizeOf;





abstract class HeapByteBuffer extends BaseByteBuffer {
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:40.026 -0500", hash_original_field = "09D04850ECF89DF686CB8B497D53F4F4", hash_generated_field = "09D04850ECF89DF686CB8B497D53F4F4")

     byte[] backingArray;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:40.026 -0500", hash_original_field = "B7E810BF01B52122CB927525A0CA4721", hash_generated_field = "B7E810BF01B52122CB927525A0CA4721")

     int offset;

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:40.027 -0500", hash_original_method = "E17EA7652E4F5A67C65770DE13DD4AE3", hash_generated_method = "E17EA7652E4F5A67C65770DE13DD4AE3")
    HeapByteBuffer(byte[] backingArray) {
        this(backingArray, backingArray.length, 0);
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:40.028 -0500", hash_original_method = "720B251A66EBAD61E39D94F5757C7908", hash_generated_method = "720B251A66EBAD61E39D94F5757C7908")
    HeapByteBuffer(int capacity) {
        this(new byte[capacity], capacity, 0);
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:40.029 -0500", hash_original_method = "7E0C48043B88A8991A81994678604015", hash_generated_method = "7E0C48043B88A8991A81994678604015")
    HeapByteBuffer(byte[] backingArray, int capacity, int offset) {
        super(capacity, null);
        this.backingArray = backingArray;
        this.offset = offset;
        if (offset + capacity > backingArray.length) {
            throw new IndexOutOfBoundsException("backingArray.length=" + backingArray.length +
                    ", capacity=" + capacity + ", offset=" + offset);
        }
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:40.031 -0500", hash_original_method = "A92B26D30665425608E93AFD3985B529", hash_generated_method = "6732978365731E917B2D2A2E8F9023E0")
    @Override
public final ByteBuffer get(byte[] dst, int dstOffset, int byteCount) {
        checkGetBounds(1, dst.length, dstOffset, byteCount);
        System.arraycopy(backingArray, offset + position, dst, dstOffset, byteCount);
        position += byteCount;
        return this;
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:40.031 -0500", hash_original_method = "ADCC30D9FE17E9265DD10F45753F8D68", hash_generated_method = "AF3DAD7D5DEEEA020DEC5496204E4270")
    final void get(char[] dst, int dstOffset, int charCount) {
        int byteCount = checkGetBounds(SizeOf.CHAR, dst.length, dstOffset, charCount);
        Memory.unsafeBulkGet(dst, dstOffset, byteCount, backingArray, offset + position, SizeOf.CHAR, order.needsSwap);
        position += byteCount;
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:40.032 -0500", hash_original_method = "83F82E1C4D1B0FECE4775D0F7331C2A9", hash_generated_method = "F19BB696E88307166D49AC935E17C019")
    final void get(double[] dst, int dstOffset, int doubleCount) {
        int byteCount = checkGetBounds(SizeOf.DOUBLE, dst.length, dstOffset, doubleCount);
        Memory.unsafeBulkGet(dst, dstOffset, byteCount, backingArray, offset + position, SizeOf.DOUBLE, order.needsSwap);
        position += byteCount;
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:40.033 -0500", hash_original_method = "28783106EE8F5B0602DB80B1FE3018CE", hash_generated_method = "679DF4C4E4AB469718CEEC566F88EACC")
    final void get(float[] dst, int dstOffset, int floatCount) {
        int byteCount = checkGetBounds(SizeOf.FLOAT, dst.length, dstOffset, floatCount);
        Memory.unsafeBulkGet(dst, dstOffset, byteCount, backingArray, offset + position, SizeOf.FLOAT, order.needsSwap);
        position += byteCount;
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:40.034 -0500", hash_original_method = "8AC7AD179B2BD3799E5966071FB1A6E9", hash_generated_method = "9DBE628069255A585160925679E99BD7")
    final void get(int[] dst, int dstOffset, int intCount) {
        int byteCount = checkGetBounds(SizeOf.INT, dst.length, dstOffset, intCount);
        Memory.unsafeBulkGet(dst, dstOffset, byteCount, backingArray, offset + position, SizeOf.INT, order.needsSwap);
        position += byteCount;
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:40.035 -0500", hash_original_method = "3C880FD9EFF1926FF9582E7F1291E034", hash_generated_method = "0F9FA0E24FF13B77CACDFF8DA596FFBC")
    final void get(long[] dst, int dstOffset, int longCount) {
        int byteCount = checkGetBounds(SizeOf.LONG, dst.length, dstOffset, longCount);
        Memory.unsafeBulkGet(dst, dstOffset, byteCount, backingArray, offset + position, SizeOf.LONG, order.needsSwap);
        position += byteCount;
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:40.036 -0500", hash_original_method = "89F4F4A0F85F41D910E8D20C3ACD7123", hash_generated_method = "2E1E13128C514A33CDE6E140CE4A0BA7")
    final void get(short[] dst, int dstOffset, int shortCount) {
        int byteCount = checkGetBounds(SizeOf.SHORT, dst.length, dstOffset, shortCount);
        Memory.unsafeBulkGet(dst, dstOffset, byteCount, backingArray, offset + position, SizeOf.SHORT, order.needsSwap);
        position += byteCount;
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:40.037 -0500", hash_original_method = "CB9AAD8BA04B2044061C99EDA53631A5", hash_generated_method = "6FFB0253F6DF9D80B987DCBF4AD8BF17")
    @Override
public final byte get() {
        if (position == limit) {
            throw new BufferUnderflowException();
        }
        return backingArray[offset + position++];
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:40.038 -0500", hash_original_method = "9AAE834531B3F44ED7B8F1D4ABA54327", hash_generated_method = "93551F6F1D01830FCE8B6DC74699B91E")
    @Override
public final byte get(int index) {
        checkIndex(index);
        return backingArray[offset + index];
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:40.039 -0500", hash_original_method = "A30CF2DCEAEB1ADBE9659D1E77D9D3A8", hash_generated_method = "76595C2BC79D04E923585B453C9AF035")
    @Override
public final char getChar() {
        int newPosition = position + SizeOf.CHAR;
        if (newPosition > limit) {
            throw new BufferUnderflowException();
        }
        char result = (char) Memory.peekShort(backingArray, offset + position, order);
        position = newPosition;
        return result;
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:40.040 -0500", hash_original_method = "9FC96B9C645980EC4C42FC8A098BD17B", hash_generated_method = "908A4C6FE6ABF3ADC3A9EE70EE960BCF")
    @Override
public final char getChar(int index) {
        checkIndex(index, SizeOf.CHAR);
        return (char) Memory.peekShort(backingArray, offset + index, order);
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:40.040 -0500", hash_original_method = "15CD222F9D1D43117CE6FF35DE1821E1", hash_generated_method = "A4416DEFB0C1395709F88F87B44B3F5F")
    @Override
public final double getDouble() {
        return Double.longBitsToDouble(getLong());
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:40.041 -0500", hash_original_method = "2A94C74E4D47B2870E4CD8E58AB3C61D", hash_generated_method = "32440A4529560120ADC095138747EE3F")
    @Override
public final double getDouble(int index) {
        return Double.longBitsToDouble(getLong(index));
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:40.042 -0500", hash_original_method = "47893679DF29F9C7305C0FEFB94D5263", hash_generated_method = "F7B0D99B98E65DBF168C7469CEC0F26F")
    @Override
public final float getFloat() {
        return Float.intBitsToFloat(getInt());
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:40.043 -0500", hash_original_method = "416C4BCEE10AD6D26C3C84E2597AE8E2", hash_generated_method = "E0AF2B6A4EE33CB5282675BA8E12EC75")
    @Override
public final float getFloat(int index) {
        return Float.intBitsToFloat(getInt(index));
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:40.044 -0500", hash_original_method = "915288BFB7584CF14BE85156D3784045", hash_generated_method = "63C3D271FB1FAB8A87ED7D2B662DF4FD")
    @Override
public final int getInt() {
        int newPosition = position + SizeOf.INT;
        if (newPosition > limit) {
            throw new BufferUnderflowException();
        }
        int result = Memory.peekInt(backingArray, offset + position, order);
        position = newPosition;
        return result;
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:40.045 -0500", hash_original_method = "458AAE21B6E3B170135E629CE400B5BC", hash_generated_method = "BA7D1737A4328D6F0E6A9301AC0FB021")
    @Override
public final int getInt(int index) {
        checkIndex(index, SizeOf.INT);
        return Memory.peekInt(backingArray, offset + index, order);
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:40.046 -0500", hash_original_method = "8649950490E02A38495D16EDE99C5440", hash_generated_method = "8AC0FE82525305BDA204BAAC5165CD80")
    @Override
public final long getLong() {
        int newPosition = position + SizeOf.LONG;
        if (newPosition > limit) {
            throw new BufferUnderflowException();
        }
        long result = Memory.peekLong(backingArray, offset + position, order);
        position = newPosition;
        return result;
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:40.048 -0500", hash_original_method = "DA73492717D47126159C560DCCEA76B8", hash_generated_method = "708D8895F786625D7E2405A79293CED1")
    @Override
public final long getLong(int index) {
        checkIndex(index, SizeOf.LONG);
        return Memory.peekLong(backingArray, offset + index, order);
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:40.049 -0500", hash_original_method = "D81DB9BF3EF98746269534EE74DB9F13", hash_generated_method = "5C9AB181884A14778C60AC90DDFA1B18")
    @Override
public final short getShort() {
        int newPosition = position + SizeOf.SHORT;
        if (newPosition > limit) {
            throw new BufferUnderflowException();
        }
        short result = Memory.peekShort(backingArray, offset + position, order);
        position = newPosition;
        return result;
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:40.050 -0500", hash_original_method = "1734D425058DF9CB5EF1DD869B4BCEDF", hash_generated_method = "CB578D58D9776C7FD576234B59444925")
    @Override
public final short getShort(int index) {
        checkIndex(index, SizeOf.SHORT);
        return Memory.peekShort(backingArray, offset + index, order);
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:40.051 -0500", hash_original_method = "5B6C9F359344527666A57577F107BCAE", hash_generated_method = "1EC9A508074FE2792E86546C8EBA9E2B")
    @Override
public final boolean isDirect() {
        return false;
    }

    
}

