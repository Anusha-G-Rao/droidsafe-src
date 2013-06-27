package android.os;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class Parcel {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.090 -0400", hash_original_field = "48FF959108CFB83B8A6F31854D7CE0B4", hash_generated_field = "6861EF2C6719FB6BE9580A330103CA5F")

    @SuppressWarnings({"UnusedDeclaration"}) private int mObject;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.090 -0400", hash_original_field = "1E29C110658060053105607F6A69FCDF", hash_generated_field = "E2BD6B8F2FA33686C59551B5BF00B3B5")

    @SuppressWarnings({"UnusedDeclaration"}) private int mOwnObject;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.090 -0400", hash_original_field = "B1C29C43A1B3C1AF208A28E9F6889C94", hash_generated_field = "F06536DFCEF1B0A690687BA1BFE76D23")

    private RuntimeException mStack;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.091 -0400", hash_original_method = "96328320E65E9E5C73AE1A423ABA09C7", hash_generated_method = "FA39E9EC605AB9B220994F25AD2303F6")
    private  Parcel(int obj) {
        {
            mStack = new RuntimeException();
        } //End block
        init(obj);
        addTaint(obj);
        // ---------- Original Method ----------
        //if (DEBUG_RECYCLE) {
            //mStack = new RuntimeException();
        //}
        //init(obj);
    }

    
        public static Parcel obtain() {
        final Parcel[] pool = sOwnedPool;
        synchronized (pool) {
            Parcel p;
            for (int i=0; i<POOL_SIZE; i++) {
                p = pool[i];
                if (p != null) {
                    pool[i] = null;
                    if (DEBUG_RECYCLE) {
                        p.mStack = new RuntimeException();
                    }
                    return p;
                }
            }
        }
        return new Parcel(0);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.107 -0400", hash_original_method = "0B6C271774CE05661982DF3B6AC078FF", hash_generated_method = "FFB9A2A5872308A85CBFAE99E476A46C")
    public final void recycle() {
        mStack = null;
        freeBuffer();
        Parcel[] pool;
        pool = sOwnedPool;
        pool = sHolderPool;
        {
            {
                int i;
                i = 0;
                {
                    {
                        pool[i] = this;
                    } //End block
                } //End block
            } //End collapsed parenthetic
        } //End block
        // ---------- Original Method ----------
        //if (DEBUG_RECYCLE) mStack = null;
        //freeBuffer();
        //final Parcel[] pool = mOwnObject != 0 ? sOwnedPool : sHolderPool;
        //synchronized (pool) {
            //for (int i=0; i<POOL_SIZE; i++) {
                //if (pool[i] == null) {
                    //pool[i] = this;
                    //return;
                //}
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.108 -0400", hash_original_method = "DD534262B78755109918F5DCE98072D4", hash_generated_method = "7132228C13596395633D3691437B2268")
    public final int dataSize() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1647306967 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1647306967;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.108 -0400", hash_original_method = "0316AB8FD0A1B068176256EC0E481A72", hash_generated_method = "ECC72E2FF12649E5F1428658D44FFC65")
    public final int dataAvail() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_388097926 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_388097926;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.114 -0400", hash_original_method = "D1BE237E96D29A914DD3E05EDFD3F272", hash_generated_method = "83BFA85C483696F615A9454E98DE8923")
    public final int dataPosition() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2025063724 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2025063724;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.115 -0400", hash_original_method = "51F0EF05154419C189F36E1902F5F7AB", hash_generated_method = "E479A26D18992B145E1137E64E7179A2")
    public final int dataCapacity() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1498448415 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1498448415;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.116 -0400", hash_original_method = "D8CB87D9AB1E01DFD8357CBF456AE1C5", hash_generated_method = "DBDC326A5AD13E4C052782BF36EE04CC")
    public final void setDataSize(int size) {
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.123 -0400", hash_original_method = "900D9C4DE4FE3C2709BAAFC39AA9B06F", hash_generated_method = "F3CD9D97BEE6A7C9B1EDA27A460B2114")
    public final void setDataPosition(int pos) {
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.123 -0400", hash_original_method = "E063261D5EA5083378CEC188A4B78FE0", hash_generated_method = "F1A8A9E75C383307D41FF1C854241F7F")
    public final void setDataCapacity(int size) {
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.134 -0400", hash_original_method = "97650A42F80764D7062D6C7A9EDB6E4B", hash_generated_method = "FA109957ED9656FAF884E1A342B8E76C")
    public final boolean pushAllowFds(boolean allowFds) {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2125175870 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2125175870;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.141 -0400", hash_original_method = "D9541DA181394F49233EDC85EBA11372", hash_generated_method = "F726D88738028EDDB487D5C6B46AE462")
    public final void restoreAllowFds(boolean lastValue) {
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.141 -0400", hash_original_method = "203FAAB8CBC9466E61C8672BA6829403", hash_generated_method = "AC995575C65035AC15042E65DF17F32D")
    public final byte[] marshall() {
        byte[] var2F9C81BC6E497382285CD6B7A7E33DE1_539534677 = {getTaintByte()};
        return var2F9C81BC6E497382285CD6B7A7E33DE1_539534677;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.142 -0400", hash_original_method = "54EF2A5E543EFE1E280A4B6A4F3098CB", hash_generated_method = "9BFFC2D408472CD2885F9AA93E140122")
    public final void unmarshall(byte[] data, int offest, int length) {
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.142 -0400", hash_original_method = "E8A5DF9275FDA0D9B0B70C7334CB1E59", hash_generated_method = "06D0342998182488FBF1BB999A6534DB")
    public final void appendFrom(Parcel parcel, int offset, int length) {
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.159 -0400", hash_original_method = "A1C2B053FCB3ADAB79F2D704E198BAB1", hash_generated_method = "440043456DDCBBC5F683ABE6B9252F9F")
    public final boolean hasFileDescriptors() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1689890444 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1689890444;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.159 -0400", hash_original_method = "EBD07D08BBA21F0C5B4E86C34DC5CAC1", hash_generated_method = "482712869E70BA49180853C184A16263")
    public final void writeInterfaceToken(String interfaceName) {
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.160 -0400", hash_original_method = "5F95BF99C2626C7B3640C2D1B3B7BEE7", hash_generated_method = "288CBAB1B96B3BD6C3E43589A43CAA3F")
    public final void enforceInterface(String interfaceName) {
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.160 -0400", hash_original_method = "6AA57281F567FED2151D4FF51C5ADD5D", hash_generated_method = "220C60356D70D7A283C931B346603A4A")
    public final void writeByteArray(byte[] b) {
        writeByteArray(b, 0, (b != null) ? b.length : 0);
        addTaint(b[0]);
        // ---------- Original Method ----------
        //writeByteArray(b, 0, (b != null) ? b.length : 0);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.161 -0400", hash_original_method = "292A0D9A6E9AD589E2915A38A2AF794D", hash_generated_method = "5914254446C5E9C25C64599B3132C419")
    public final void writeByteArray(byte[] b, int offset, int len) {
        {
            writeInt(-1);
        } //End block
        Arrays.checkOffsetAndCount(b.length, offset, len);
        writeNative(b, offset, len);
        addTaint(b[0]);
        addTaint(offset);
        addTaint(len);
        // ---------- Original Method ----------
        //if (b == null) {
            //writeInt(-1);
            //return;
        //}
        //Arrays.checkOffsetAndCount(b.length, offset, len);
        //writeNative(b, offset, len);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.162 -0400", hash_original_method = "13EF9FAE46E0DC273567B76840FE8431", hash_generated_method = "B7B1791B1819FAA4AC4DF261A54493B1")
    private void writeNative(byte[] b, int offset, int len) {
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.162 -0400", hash_original_method = "EB7F50F11C67DFE7362846314C368039", hash_generated_method = "BEE33504B34EACD5CA9D841430805B0B")
    public final void writeInt(int val) {
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.162 -0400", hash_original_method = "6EE9E92592584E19EA2786245476EB1F", hash_generated_method = "0A06D5D9A178D52A875714A0E42A1A51")
    public final void writeLong(long val) {
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.176 -0400", hash_original_method = "8E6A3106AB0C4A6CA5D134BC13C79A46", hash_generated_method = "1DF7BBEB8EFD1C1A257BF6B7DBAA6EE3")
    public final void writeFloat(float val) {
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.176 -0400", hash_original_method = "580EB112F6684AC838EF0FAE39FE6143", hash_generated_method = "C77D5B12217694B3853A3DF91BCF81A4")
    public final void writeDouble(double val) {
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.177 -0400", hash_original_method = "148FED92CD1AE4975AE2973407FF84B1", hash_generated_method = "8FFD4EB8B720B24188B168257146AA4B")
    public final void writeString(String val) {
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.177 -0400", hash_original_method = "CEAF068B566AB67AE8F044276645F78A", hash_generated_method = "A2F25B64167993F48DA629A01FC4357A")
    public final void writeCharSequence(CharSequence val) {
        TextUtils.writeToParcel(val, this, 0);
        addTaint(val.getTaint());
        // ---------- Original Method ----------
        //TextUtils.writeToParcel(val, this, 0);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.178 -0400", hash_original_method = "7DA1E5E6DC1856828FF2B443CF2EA2D0", hash_generated_method = "0D95721DBACCC6601CFE11D2E34CD1FF")
    public final void writeStrongBinder(IBinder val) {
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.196 -0400", hash_original_method = "D29D74B8509F3EDC680AC67A58B2AE11", hash_generated_method = "F7B8635B17AFAED7F650ABEB6D1734CF")
    public final void writeStrongInterface(IInterface val) {
        writeStrongBinder(val == null ? null : val.asBinder());
        addTaint(val.getTaint());
        // ---------- Original Method ----------
        //writeStrongBinder(val == null ? null : val.asBinder());
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.197 -0400", hash_original_method = "F228581B9954F98E592DA68C1EE89409", hash_generated_method = "159C24B95EAD1045C52B3F0E4DD0B66A")
    public final void writeFileDescriptor(FileDescriptor val) {
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.197 -0400", hash_original_method = "B137ADD0EA125F15A647DF5EEF6060FE", hash_generated_method = "BB0303E6383EB2C6D21B8BBE98686C7B")
    public final void writeByte(byte val) {
        writeInt(val);
        addTaint(val);
        // ---------- Original Method ----------
        //writeInt(val);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.198 -0400", hash_original_method = "028C08B0E96835B592DD57E92E1A9654", hash_generated_method = "7CC3F53AC45D033B1436BAAAF054C373")
    public final void writeMap(Map val) {
        writeMapInternal((Map<String,Object>) val);
        addTaint(val.getTaint());
        // ---------- Original Method ----------
        //writeMapInternal((Map<String,Object>) val);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.268 -0400", hash_original_method = "254CF4BDBF55D33C4656934F15F7844A", hash_generated_method = "F5E51ACD199B74591B1B2AE03945AE23")
     void writeMapInternal(Map<String,Object> val) {
        {
            writeInt(-1);
        } //End block
        Set<Map.Entry<String,Object>> entries;
        entries = val.entrySet();
        writeInt(entries.size());
        {
            Iterator<Map.Entry<String,Object>> var0067E06DB1A13B6A25DDEC4BA2402C0D_1396652260 = (entries).iterator();
            var0067E06DB1A13B6A25DDEC4BA2402C0D_1396652260.hasNext();
            Map.Entry<String,Object> e = var0067E06DB1A13B6A25DDEC4BA2402C0D_1396652260.next();
            {
                writeValue(e.getKey());
                writeValue(e.getValue());
            } //End block
        } //End collapsed parenthetic
        addTaint(val.getTaint());
        // ---------- Original Method ----------
        //if (val == null) {
            //writeInt(-1);
            //return;
        //}
        //Set<Map.Entry<String,Object>> entries = val.entrySet();
        //writeInt(entries.size());
        //for (Map.Entry<String,Object> e : entries) {
            //writeValue(e.getKey());
            //writeValue(e.getValue());
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.269 -0400", hash_original_method = "1B271C6B96886293B3F46C86D8594D62", hash_generated_method = "2FFA68CA9C86DB44455DF2AE49798B9A")
    public final void writeBundle(Bundle val) {
        {
            writeInt(-1);
        } //End block
        val.writeToParcel(this, 0);
        addTaint(val.getTaint());
        // ---------- Original Method ----------
        //if (val == null) {
            //writeInt(-1);
            //return;
        //}
        //val.writeToParcel(this, 0);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.270 -0400", hash_original_method = "E7219AA1C86EB1036E36A514DFF44066", hash_generated_method = "4391EEE937EAB96A79A3C4FE107602AD")
    public final void writeList(List val) {
        {
            writeInt(-1);
        } //End block
        int N;
        N = val.size();
        int i;
        i = 0;
        writeInt(N);
        {
            writeValue(val.get(i));
        } //End block
        addTaint(val.getTaint());
        // ---------- Original Method ----------
        //if (val == null) {
            //writeInt(-1);
            //return;
        //}
        //int N = val.size();
        //int i=0;
        //writeInt(N);
        //while (i < N) {
            //writeValue(val.get(i));
            //i++;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.271 -0400", hash_original_method = "903390B15749D4F099959DBD9D939641", hash_generated_method = "836FD6A31E6464B844246F3411080443")
    public final void writeArray(Object[] val) {
        {
            writeInt(-1);
        } //End block
        int N;
        N = val.length;
        int i;
        i = 0;
        writeInt(N);
        {
            writeValue(val[i]);
        } //End block
        addTaint(val[0].getTaint());
        // ---------- Original Method ----------
        //if (val == null) {
            //writeInt(-1);
            //return;
        //}
        //int N = val.length;
        //int i=0;
        //writeInt(N);
        //while (i < N) {
            //writeValue(val[i]);
            //i++;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.272 -0400", hash_original_method = "932B15FDC26AECB59BA0DEB9D7727076", hash_generated_method = "20A91B094225EE591689F723BF8F4A40")
    public final void writeSparseArray(SparseArray<Object> val) {
        {
            writeInt(-1);
        } //End block
        int N;
        N = val.size();
        writeInt(N);
        int i;
        i = 0;
        {
            writeInt(val.keyAt(i));
            writeValue(val.valueAt(i));
        } //End block
        addTaint(val.getTaint());
        // ---------- Original Method ----------
        //if (val == null) {
            //writeInt(-1);
            //return;
        //}
        //int N = val.size();
        //writeInt(N);
        //int i=0;
        //while (i < N) {
            //writeInt(val.keyAt(i));
            //writeValue(val.valueAt(i));
            //i++;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.272 -0400", hash_original_method = "501AACE22AB4AEC41E440B95E2BF337F", hash_generated_method = "A7E40E8DDF386209E9FD7ED7BDC4BEB9")
    public final void writeSparseBooleanArray(SparseBooleanArray val) {
        {
            writeInt(-1);
        } //End block
        int N;
        N = val.size();
        writeInt(N);
        int i;
        i = 0;
        {
            writeInt(val.keyAt(i));
            writeByte((byte)(val.valueAt(i) ? 1 : 0));
        } //End block
        addTaint(val.getTaint());
        // ---------- Original Method ----------
        //if (val == null) {
            //writeInt(-1);
            //return;
        //}
        //int N = val.size();
        //writeInt(N);
        //int i=0;
        //while (i < N) {
            //writeInt(val.keyAt(i));
            //writeByte((byte)(val.valueAt(i) ? 1 : 0));
            //i++;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.288 -0400", hash_original_method = "D75DEF1EB05EA54B4B0A6C775E789115", hash_generated_method = "2738A5BE43BA026431C3D0649E8A4C11")
    public final void writeBooleanArray(boolean[] val) {
        {
            int N;
            N = val.length;
            writeInt(N);
            {
                int i;
                i = 0;
                {
                    writeInt(val[i] ? 1 : 0);
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            writeInt(-1);
        } //End block
        addTaint(val[0]);
        // ---------- Original Method ----------
        //if (val != null) {
            //int N = val.length;
            //writeInt(N);
            //for (int i=0; i<N; i++) {
                //writeInt(val[i] ? 1 : 0);
            //}
        //} else {
            //writeInt(-1);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.289 -0400", hash_original_method = "636C08B3912226F5C58D74422D1E9CB4", hash_generated_method = "E9EA74549B8EAB141200A92A28B9B77A")
    public final boolean[] createBooleanArray() {
        int N;
        N = readInt();
        {
            boolean var677D811DE399D0DE094E279FE647ADA9_365570955 = (N >= 0 && N <= (dataAvail() >> 2));
            {
                boolean[] val;
                val = new boolean[N];
                {
                    int i;
                    i = 0;
                    {
                        val[i] = readInt() != 0;
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        boolean[] var503EB2F420079C4024483971CE5EDEA8_296174572 = {getTaintBoolean()};
        return var503EB2F420079C4024483971CE5EDEA8_296174572;
        // ---------- Original Method ----------
        //int N = readInt();
        //if (N >= 0 && N <= (dataAvail() >> 2)) {
            //boolean[] val = new boolean[N];
            //for (int i=0; i<N; i++) {
                //val[i] = readInt() != 0;
            //}
            //return val;
        //} else {
            //return null;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.290 -0400", hash_original_method = "15202BE45A888A7FAE449643C1F651D3", hash_generated_method = "EA88CAE7C821654C7C742676EA1A246C")
    public final void readBooleanArray(boolean[] val) {
        int N;
        N = readInt();
        {
            {
                int i;
                i = 0;
                {
                    val[i] = readInt() != 0;
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw new RuntimeException("bad array lengths");
        } //End block
        addTaint(val[0]);
        // ---------- Original Method ----------
        //int N = readInt();
        //if (N == val.length) {
            //for (int i=0; i<N; i++) {
                //val[i] = readInt() != 0;
            //}
        //} else {
            //throw new RuntimeException("bad array lengths");
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.301 -0400", hash_original_method = "FC1109029B4BAAFE0FA31EEEF8F95A5F", hash_generated_method = "890EC8D8DE29B47E2AE2D89CA0FD8DAE")
    public final void writeCharArray(char[] val) {
        {
            int N;
            N = val.length;
            writeInt(N);
            {
                int i;
                i = 0;
                {
                    writeInt((int)val[i]);
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            writeInt(-1);
        } //End block
        addTaint(val[0]);
        // ---------- Original Method ----------
        //if (val != null) {
            //int N = val.length;
            //writeInt(N);
            //for (int i=0; i<N; i++) {
                //writeInt((int)val[i]);
            //}
        //} else {
            //writeInt(-1);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.320 -0400", hash_original_method = "0F2CB9A0B4BA672805C5DC7ABC31D142", hash_generated_method = "078179A160365AEBB7781CD3DA363EEC")
    public final char[] createCharArray() {
        int N;
        N = readInt();
        {
            boolean var677D811DE399D0DE094E279FE647ADA9_884885560 = (N >= 0 && N <= (dataAvail() >> 2));
            {
                char[] val;
                val = new char[N];
                {
                    int i;
                    i = 0;
                    {
                        val[i] = (char)readInt();
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        char[] var50607924ABD4C17119BAF3A1CE41C0EC_421485412 = {getTaintChar()};
        return var50607924ABD4C17119BAF3A1CE41C0EC_421485412;
        // ---------- Original Method ----------
        //int N = readInt();
        //if (N >= 0 && N <= (dataAvail() >> 2)) {
            //char[] val = new char[N];
            //for (int i=0; i<N; i++) {
                //val[i] = (char)readInt();
            //}
            //return val;
        //} else {
            //return null;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.321 -0400", hash_original_method = "3577ABA10B4218BCCE6B69B6327658D6", hash_generated_method = "99A00570DF74669970D764A5293931F1")
    public final void readCharArray(char[] val) {
        int N;
        N = readInt();
        {
            {
                int i;
                i = 0;
                {
                    val[i] = (char)readInt();
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw new RuntimeException("bad array lengths");
        } //End block
        addTaint(val[0]);
        // ---------- Original Method ----------
        //int N = readInt();
        //if (N == val.length) {
            //for (int i=0; i<N; i++) {
                //val[i] = (char)readInt();
            //}
        //} else {
            //throw new RuntimeException("bad array lengths");
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.322 -0400", hash_original_method = "426B3599371B897BFC6196C71A9C351C", hash_generated_method = "57100F550E149C8ACDEF82903C0CB80C")
    public final void writeIntArray(int[] val) {
        {
            int N;
            N = val.length;
            writeInt(N);
            {
                int i;
                i = 0;
                {
                    writeInt(val[i]);
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            writeInt(-1);
        } //End block
        addTaint(val[0]);
        // ---------- Original Method ----------
        //if (val != null) {
            //int N = val.length;
            //writeInt(N);
            //for (int i=0; i<N; i++) {
                //writeInt(val[i]);
            //}
        //} else {
            //writeInt(-1);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.344 -0400", hash_original_method = "2BFE53BE4AFBC39913D7CD537675C77F", hash_generated_method = "29DA0B10D1B1C4AE6239E8D271F4E89B")
    public final int[] createIntArray() {
        int N;
        N = readInt();
        {
            boolean var677D811DE399D0DE094E279FE647ADA9_1397760395 = (N >= 0 && N <= (dataAvail() >> 2));
            {
                int[] val;
                val = new int[N];
                {
                    int i;
                    i = 0;
                    {
                        val[i] = readInt();
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        int[] varB4CCCA26F9DB9189C32F33E82D425CFB_1744059229 = {getTaintInt()};
        return varB4CCCA26F9DB9189C32F33E82D425CFB_1744059229;
        // ---------- Original Method ----------
        //int N = readInt();
        //if (N >= 0 && N <= (dataAvail() >> 2)) {
            //int[] val = new int[N];
            //for (int i=0; i<N; i++) {
                //val[i] = readInt();
            //}
            //return val;
        //} else {
            //return null;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.352 -0400", hash_original_method = "D30E6FBEFEE072DBADEACBC994232724", hash_generated_method = "89E0C4B906EB5ECAFF6EED1455614EC6")
    public final void readIntArray(int[] val) {
        int N;
        N = readInt();
        {
            {
                int i;
                i = 0;
                {
                    val[i] = readInt();
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw new RuntimeException("bad array lengths");
        } //End block
        addTaint(val[0]);
        // ---------- Original Method ----------
        //int N = readInt();
        //if (N == val.length) {
            //for (int i=0; i<N; i++) {
                //val[i] = readInt();
            //}
        //} else {
            //throw new RuntimeException("bad array lengths");
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.353 -0400", hash_original_method = "6AE17F1911C710D67F0B38E1A6953312", hash_generated_method = "03D2424BADC3172903B11D86F856B505")
    public final void writeLongArray(long[] val) {
        {
            int N;
            N = val.length;
            writeInt(N);
            {
                int i;
                i = 0;
                {
                    writeLong(val[i]);
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            writeInt(-1);
        } //End block
        addTaint(val[0]);
        // ---------- Original Method ----------
        //if (val != null) {
            //int N = val.length;
            //writeInt(N);
            //for (int i=0; i<N; i++) {
                //writeLong(val[i]);
            //}
        //} else {
            //writeInt(-1);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.353 -0400", hash_original_method = "539AEF1878CDD8393DEC7B15A779334D", hash_generated_method = "96822318CA47E00213D0C9F9051CD5AD")
    public final long[] createLongArray() {
        int N;
        N = readInt();
        {
            boolean varAFA9B411100B0C263F15734A2739C902_1389350136 = (N >= 0 && N <= (dataAvail() >> 3));
            {
                long[] val;
                val = new long[N];
                {
                    int i;
                    i = 0;
                    {
                        val[i] = readLong();
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        long[] var3908C7C3AF5171CEE1F112DAE77A5C4D_639172863 = {getTaintLong()};
        return var3908C7C3AF5171CEE1F112DAE77A5C4D_639172863;
        // ---------- Original Method ----------
        //int N = readInt();
        //if (N >= 0 && N <= (dataAvail() >> 3)) {
            //long[] val = new long[N];
            //for (int i=0; i<N; i++) {
                //val[i] = readLong();
            //}
            //return val;
        //} else {
            //return null;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.366 -0400", hash_original_method = "EB1FE051AE6270C29877E320D05D2B1C", hash_generated_method = "EE3B65247CC68E6D1F0FB4A937A0B2B1")
    public final void readLongArray(long[] val) {
        int N;
        N = readInt();
        {
            {
                int i;
                i = 0;
                {
                    val[i] = readLong();
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw new RuntimeException("bad array lengths");
        } //End block
        addTaint(val[0]);
        // ---------- Original Method ----------
        //int N = readInt();
        //if (N == val.length) {
            //for (int i=0; i<N; i++) {
                //val[i] = readLong();
            //}
        //} else {
            //throw new RuntimeException("bad array lengths");
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.367 -0400", hash_original_method = "914127CC1FF235613675A4097238AE87", hash_generated_method = "C1DA8DD9DFF077545BA221C6DD5B1C46")
    public final void writeFloatArray(float[] val) {
        {
            int N;
            N = val.length;
            writeInt(N);
            {
                int i;
                i = 0;
                {
                    writeFloat(val[i]);
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            writeInt(-1);
        } //End block
        addTaint(val[0]);
        // ---------- Original Method ----------
        //if (val != null) {
            //int N = val.length;
            //writeInt(N);
            //for (int i=0; i<N; i++) {
                //writeFloat(val[i]);
            //}
        //} else {
            //writeInt(-1);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.368 -0400", hash_original_method = "AD11D1594D734C1EBF478FFED3A5EA0B", hash_generated_method = "77E988FAF851FF54D763CC79C1EB422F")
    public final float[] createFloatArray() {
        int N;
        N = readInt();
        {
            boolean var677D811DE399D0DE094E279FE647ADA9_1297868240 = (N >= 0 && N <= (dataAvail() >> 2));
            {
                float[] val;
                val = new float[N];
                {
                    int i;
                    i = 0;
                    {
                        val[i] = readFloat();
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        float[] varB2C245003BAB9224CFB496218F7DAFE0_390450709 = {getTaintFloat()};
        return varB2C245003BAB9224CFB496218F7DAFE0_390450709;
        // ---------- Original Method ----------
        //int N = readInt();
        //if (N >= 0 && N <= (dataAvail() >> 2)) {
            //float[] val = new float[N];
            //for (int i=0; i<N; i++) {
                //val[i] = readFloat();
            //}
            //return val;
        //} else {
            //return null;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.369 -0400", hash_original_method = "5BAAFA2155FE07D9BA992B0E92A02429", hash_generated_method = "14B25522CE1B6C2AF409E3A30DA2910C")
    public final void readFloatArray(float[] val) {
        int N;
        N = readInt();
        {
            {
                int i;
                i = 0;
                {
                    val[i] = readFloat();
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw new RuntimeException("bad array lengths");
        } //End block
        addTaint(val[0]);
        // ---------- Original Method ----------
        //int N = readInt();
        //if (N == val.length) {
            //for (int i=0; i<N; i++) {
                //val[i] = readFloat();
            //}
        //} else {
            //throw new RuntimeException("bad array lengths");
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.369 -0400", hash_original_method = "30BB607A5C46B583A0E7A88D0830BB99", hash_generated_method = "561E826B6C11C2F8933A6E912164FF64")
    public final void writeDoubleArray(double[] val) {
        {
            int N;
            N = val.length;
            writeInt(N);
            {
                int i;
                i = 0;
                {
                    writeDouble(val[i]);
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            writeInt(-1);
        } //End block
        addTaint(val[0]);
        // ---------- Original Method ----------
        //if (val != null) {
            //int N = val.length;
            //writeInt(N);
            //for (int i=0; i<N; i++) {
                //writeDouble(val[i]);
            //}
        //} else {
            //writeInt(-1);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.384 -0400", hash_original_method = "EADE9932A44C79075558F2C2E2C44BF9", hash_generated_method = "1FEB92069E4661373AC69CC49DC72DED")
    public final double[] createDoubleArray() {
        int N;
        N = readInt();
        {
            boolean varAFA9B411100B0C263F15734A2739C902_191765904 = (N >= 0 && N <= (dataAvail() >> 3));
            {
                double[] val;
                val = new double[N];
                {
                    int i;
                    i = 0;
                    {
                        val[i] = readDouble();
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        double[] var74D44D7D9EE6FE6C3433D694F869E521_1278827408 = {getTaintDouble()};
        return var74D44D7D9EE6FE6C3433D694F869E521_1278827408;
        // ---------- Original Method ----------
        //int N = readInt();
        //if (N >= 0 && N <= (dataAvail() >> 3)) {
            //double[] val = new double[N];
            //for (int i=0; i<N; i++) {
                //val[i] = readDouble();
            //}
            //return val;
        //} else {
            //return null;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.385 -0400", hash_original_method = "1E5CFF0988982B6DD3E5010F6E58EAB2", hash_generated_method = "1C8457836D1451E352FFAAA4DE556DAF")
    public final void readDoubleArray(double[] val) {
        int N;
        N = readInt();
        {
            {
                int i;
                i = 0;
                {
                    val[i] = readDouble();
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw new RuntimeException("bad array lengths");
        } //End block
        addTaint(val[0]);
        // ---------- Original Method ----------
        //int N = readInt();
        //if (N == val.length) {
            //for (int i=0; i<N; i++) {
                //val[i] = readDouble();
            //}
        //} else {
            //throw new RuntimeException("bad array lengths");
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.385 -0400", hash_original_method = "869784FDBD7A62BA6DC61589E5325593", hash_generated_method = "4E66B8DD87CB6C959EF863B6CB561938")
    public final void writeStringArray(String[] val) {
        {
            int N;
            N = val.length;
            writeInt(N);
            {
                int i;
                i = 0;
                {
                    writeString(val[i]);
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            writeInt(-1);
        } //End block
        addTaint(val[0].getTaint());
        // ---------- Original Method ----------
        //if (val != null) {
            //int N = val.length;
            //writeInt(N);
            //for (int i=0; i<N; i++) {
                //writeString(val[i]);
            //}
        //} else {
            //writeInt(-1);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.386 -0400", hash_original_method = "E25A6435806EEE9817C8F94878902077", hash_generated_method = "EC2BC9189660857238A785F2C2383BF3")
    public final String[] createStringArray() {
        String[] varB4EAC82CA7396A68D541C85D26508E83_61745407 = null; //Variable for return #1
        String[] varB4EAC82CA7396A68D541C85D26508E83_2035509857 = null; //Variable for return #2
        int N;
        N = readInt();
        {
            String[] val;
            val = new String[N];
            {
                int i;
                i = 0;
                {
                    val[i] = readString();
                } //End block
            } //End collapsed parenthetic
            varB4EAC82CA7396A68D541C85D26508E83_61745407 = val;
        } //End block
        {
            varB4EAC82CA7396A68D541C85D26508E83_2035509857 = null;
        } //End block
        String[] varA7E53CE21691AB073D9660D615818899_2143174047; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_2143174047 = varB4EAC82CA7396A68D541C85D26508E83_61745407;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_2143174047 = varB4EAC82CA7396A68D541C85D26508E83_2035509857;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_2143174047.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_2143174047;
        // ---------- Original Method ----------
        //int N = readInt();
        //if (N >= 0) {
            //String[] val = new String[N];
            //for (int i=0; i<N; i++) {
                //val[i] = readString();
            //}
            //return val;
        //} else {
            //return null;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.397 -0400", hash_original_method = "856C598346084C5A7CB0C8EC3C30AFE8", hash_generated_method = "2B9095FE4B077FA9FA582B880EB950DC")
    public final void readStringArray(String[] val) {
        int N;
        N = readInt();
        {
            {
                int i;
                i = 0;
                {
                    val[i] = readString();
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw new RuntimeException("bad array lengths");
        } //End block
        addTaint(val[0].getTaint());
        // ---------- Original Method ----------
        //int N = readInt();
        //if (N == val.length) {
            //for (int i=0; i<N; i++) {
                //val[i] = readString();
            //}
        //} else {
            //throw new RuntimeException("bad array lengths");
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.401 -0400", hash_original_method = "EF4C8799E7CA7F11199E2A94E26473B3", hash_generated_method = "0EAF8717A18C33E163736704A6B2C62A")
    public final void writeBinderArray(IBinder[] val) {
        {
            int N;
            N = val.length;
            writeInt(N);
            {
                int i;
                i = 0;
                {
                    writeStrongBinder(val[i]);
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            writeInt(-1);
        } //End block
        addTaint(val[0].getTaint());
        // ---------- Original Method ----------
        //if (val != null) {
            //int N = val.length;
            //writeInt(N);
            //for (int i=0; i<N; i++) {
                //writeStrongBinder(val[i]);
            //}
        //} else {
            //writeInt(-1);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.414 -0400", hash_original_method = "47477B6B20C2841826851A1DC451409B", hash_generated_method = "2BE2594F8BE29F54CC5DAE094DEA4A23")
    public final void writeCharSequenceArray(CharSequence[] val) {
        {
            int N;
            N = val.length;
            writeInt(N);
            {
                int i;
                i = 0;
                {
                    writeCharSequence(val[i]);
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            writeInt(-1);
        } //End block
        addTaint(val[0].getTaint());
        // ---------- Original Method ----------
        //if (val != null) {
            //int N = val.length;
            //writeInt(N);
            //for (int i=0; i<N; i++) {
                //writeCharSequence(val[i]);
            //}
        //} else {
            //writeInt(-1);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.416 -0400", hash_original_method = "4DE08401A529CB5616CDC9DFD50DAFB3", hash_generated_method = "7AEF60CDCDABF18B81C0A1E7FE7691C3")
    public final IBinder[] createBinderArray() {
        IBinder[] varB4EAC82CA7396A68D541C85D26508E83_351913176 = null; //Variable for return #1
        IBinder[] varB4EAC82CA7396A68D541C85D26508E83_1821834219 = null; //Variable for return #2
        int N;
        N = readInt();
        {
            IBinder[] val;
            val = new IBinder[N];
            {
                int i;
                i = 0;
                {
                    val[i] = readStrongBinder();
                } //End block
            } //End collapsed parenthetic
            varB4EAC82CA7396A68D541C85D26508E83_351913176 = val;
        } //End block
        {
            varB4EAC82CA7396A68D541C85D26508E83_1821834219 = null;
        } //End block
        IBinder[] varA7E53CE21691AB073D9660D615818899_607326352; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_607326352 = varB4EAC82CA7396A68D541C85D26508E83_351913176;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_607326352 = varB4EAC82CA7396A68D541C85D26508E83_1821834219;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_607326352.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_607326352;
        // ---------- Original Method ----------
        //int N = readInt();
        //if (N >= 0) {
            //IBinder[] val = new IBinder[N];
            //for (int i=0; i<N; i++) {
                //val[i] = readStrongBinder();
            //}
            //return val;
        //} else {
            //return null;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.417 -0400", hash_original_method = "3E3D11ECAF89B0D6B7212074DA0FB112", hash_generated_method = "636D88A9755F021521B43F38B0CA193C")
    public final void readBinderArray(IBinder[] val) {
        int N;
        N = readInt();
        {
            {
                int i;
                i = 0;
                {
                    val[i] = readStrongBinder();
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw new RuntimeException("bad array lengths");
        } //End block
        addTaint(val[0].getTaint());
        // ---------- Original Method ----------
        //int N = readInt();
        //if (N == val.length) {
            //for (int i=0; i<N; i++) {
                //val[i] = readStrongBinder();
            //}
        //} else {
            //throw new RuntimeException("bad array lengths");
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.431 -0400", hash_original_method = "5826C07CBD3614FC61FFE172F3E36C59", hash_generated_method = "86F8F92EA883D58D6AD9E65E161D23C6")
    public final <T extends Parcelable> void writeTypedList(List<T> val) {
        {
            writeInt(-1);
        } //End block
        int N;
        N = val.size();
        int i;
        i = 0;
        writeInt(N);
        {
            T item;
            item = val.get(i);
            {
                writeInt(1);
                item.writeToParcel(this, 0);
            } //End block
            {
                writeInt(0);
            } //End block
        } //End block
        addTaint(val.getTaint());
        // ---------- Original Method ----------
        //if (val == null) {
            //writeInt(-1);
            //return;
        //}
        //int N = val.size();
        //int i=0;
        //writeInt(N);
        //while (i < N) {
            //T item = val.get(i);
            //if (item != null) {
                //writeInt(1);
                //item.writeToParcel(this, 0);
            //} else {
                //writeInt(0);
            //}
            //i++;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.432 -0400", hash_original_method = "D0AECB36946CE861852315E400637CFF", hash_generated_method = "66AFC74CE3D950BE5057EB288CB0A305")
    public final void writeStringList(List<String> val) {
        {
            writeInt(-1);
        } //End block
        int N;
        N = val.size();
        int i;
        i = 0;
        writeInt(N);
        {
            writeString(val.get(i));
        } //End block
        addTaint(val.getTaint());
        // ---------- Original Method ----------
        //if (val == null) {
            //writeInt(-1);
            //return;
        //}
        //int N = val.size();
        //int i=0;
        //writeInt(N);
        //while (i < N) {
            //writeString(val.get(i));
            //i++;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.432 -0400", hash_original_method = "7137D7435CDB5CC040EE6A964998B66D", hash_generated_method = "EE2D7EA578D3DAAD36E7ABA3F754649E")
    public final void writeBinderList(List<IBinder> val) {
        {
            writeInt(-1);
        } //End block
        int N;
        N = val.size();
        int i;
        i = 0;
        writeInt(N);
        {
            writeStrongBinder(val.get(i));
        } //End block
        addTaint(val.getTaint());
        // ---------- Original Method ----------
        //if (val == null) {
            //writeInt(-1);
            //return;
        //}
        //int N = val.size();
        //int i=0;
        //writeInt(N);
        //while (i < N) {
            //writeStrongBinder(val.get(i));
            //i++;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.446 -0400", hash_original_method = "029988DBA55E380B93A4CDBDA2CB7F3E", hash_generated_method = "B4874F91CDF0A433FBED70D605FD922E")
    public final <T extends Parcelable> void writeTypedArray(T[] val,
            int parcelableFlags) {
        {
            int N;
            N = val.length;
            writeInt(N);
            {
                int i;
                i = 0;
                {
                    T item;
                    item = val[i];
                    {
                        writeInt(1);
                        item.writeToParcel(this, parcelableFlags);
                    } //End block
                    {
                        writeInt(0);
                    } //End block
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            writeInt(-1);
        } //End block
        addTaint(val[0].getTaint());
        addTaint(parcelableFlags);
        // ---------- Original Method ----------
        //if (val != null) {
            //int N = val.length;
            //writeInt(N);
            //for (int i=0; i<N; i++) {
                //T item = val[i];
                //if (item != null) {
                    //writeInt(1);
                    //item.writeToParcel(this, parcelableFlags);
                //} else {
                    //writeInt(0);
                //}
            //}
        //} else {
            //writeInt(-1);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.448 -0400", hash_original_method = "D9566C4BE63552F29703FA1385C84129", hash_generated_method = "013DA4F999026AAE579652781535EF9B")
    public final void writeValue(Object v) {
        {
            writeInt(VAL_NULL);
        } //End block
        {
            writeInt(VAL_STRING);
            writeString((String) v);
        } //End block
        {
            writeInt(VAL_INTEGER);
            writeInt((Integer) v);
        } //End block
        {
            writeInt(VAL_MAP);
            writeMap((Map) v);
        } //End block
        {
            writeInt(VAL_BUNDLE);
            writeBundle((Bundle) v);
        } //End block
        {
            writeInt(VAL_PARCELABLE);
            writeParcelable((Parcelable) v, 0);
        } //End block
        {
            writeInt(VAL_SHORT);
            writeInt(((Short) v).intValue());
        } //End block
        {
            writeInt(VAL_LONG);
            writeLong((Long) v);
        } //End block
        {
            writeInt(VAL_FLOAT);
            writeFloat((Float) v);
        } //End block
        {
            writeInt(VAL_DOUBLE);
            writeDouble((Double) v);
        } //End block
        {
            writeInt(VAL_BOOLEAN);
            writeInt((Boolean) v ? 1 : 0);
        } //End block
        {
            writeInt(VAL_CHARSEQUENCE);
            writeCharSequence((CharSequence) v);
        } //End block
        {
            writeInt(VAL_LIST);
            writeList((List) v);
        } //End block
        {
            writeInt(VAL_SPARSEARRAY);
            writeSparseArray((SparseArray) v);
        } //End block
        {
            writeInt(VAL_BOOLEANARRAY);
            writeBooleanArray((boolean[]) v);
        } //End block
        {
            writeInt(VAL_BYTEARRAY);
            writeByteArray((byte[]) v);
        } //End block
        {
            writeInt(VAL_STRINGARRAY);
            writeStringArray((String[]) v);
        } //End block
        {
            writeInt(VAL_CHARSEQUENCEARRAY);
            writeCharSequenceArray((CharSequence[]) v);
        } //End block
        {
            writeInt(VAL_IBINDER);
            writeStrongBinder((IBinder) v);
        } //End block
        {
            writeInt(VAL_PARCELABLEARRAY);
            writeParcelableArray((Parcelable[]) v, 0);
        } //End block
        {
            writeInt(VAL_OBJECTARRAY);
            writeArray((Object[]) v);
        } //End block
        {
            writeInt(VAL_INTARRAY);
            writeIntArray((int[]) v);
        } //End block
        {
            writeInt(VAL_LONGARRAY);
            writeLongArray((long[]) v);
        } //End block
        {
            writeInt(VAL_BYTE);
            writeInt((Byte) v);
        } //End block
        {
            writeInt(VAL_SERIALIZABLE);
            writeSerializable((Serializable) v);
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw new RuntimeException("Parcel: unable to marshal value " + v);
        } //End block
        addTaint(v.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.463 -0400", hash_original_method = "A58184BC725C2FE85E17C583E1DA6016", hash_generated_method = "05DC0370A064D93F9EFDAC93CD3A6D8B")
    public final void writeParcelable(Parcelable p, int parcelableFlags) {
        {
            writeString(null);
        } //End block
        String name;
        name = p.getClass().getName();
        writeString(name);
        p.writeToParcel(this, parcelableFlags);
        addTaint(p.getTaint());
        addTaint(parcelableFlags);
        // ---------- Original Method ----------
        //if (p == null) {
            //writeString(null);
            //return;
        //}
        //String name = p.getClass().getName();
        //writeString(name);
        //p.writeToParcel(this, parcelableFlags);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.464 -0400", hash_original_method = "BCB9F78F7EC1F484C61BF7865779B2F9", hash_generated_method = "21C56E7D44E99B42256D116ACD37987B")
    public final void writeSerializable(Serializable s) {
        {
            writeString(null);
        } //End block
        String name;
        name = s.getClass().getName();
        writeString(name);
        ByteArrayOutputStream baos;
        baos = new ByteArrayOutputStream();
        try 
        {
            ObjectOutputStream oos;
            oos = new ObjectOutputStream(baos);
            oos.writeObject(s);
            oos.close();
            writeByteArray(baos.toByteArray());
        } //End block
        catch (IOException ioe)
        {
            if (DroidSafeAndroidRuntime.control) throw new RuntimeException("Parcelable encountered " +
                "IOException writing serializable object (name = " + name +
                ")", ioe);
        } //End block
        addTaint(s.getTaint());
        // ---------- Original Method ----------
        //if (s == null) {
            //writeString(null);
            //return;
        //}
        //String name = s.getClass().getName();
        //writeString(name);
        //ByteArrayOutputStream baos = new ByteArrayOutputStream();
        //try {
            //ObjectOutputStream oos = new ObjectOutputStream(baos);
            //oos.writeObject(s);
            //oos.close();
            //writeByteArray(baos.toByteArray());
        //} catch (IOException ioe) {
            //throw new RuntimeException("Parcelable encountered " +
                //"IOException writing serializable object (name = " + name +
                //")", ioe);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.466 -0400", hash_original_method = "7DD11AC8769A37C0F9583E9AAFAA7192", hash_generated_method = "5C9839AA7C57A73C70F1A68247A494CB")
    public final void writeException(Exception e) {
        int code;
        code = 0;
        {
            code = EX_SECURITY;
        } //End block
        {
            code = EX_BAD_PARCELABLE;
        } //End block
        {
            code = EX_ILLEGAL_ARGUMENT;
        } //End block
        {
            code = EX_NULL_POINTER;
        } //End block
        {
            code = EX_ILLEGAL_STATE;
        } //End block
        writeInt(code);
        StrictMode.clearGatheredViolations();
        {
            {
                if (DroidSafeAndroidRuntime.control) throw (RuntimeException) e;
            } //End block
            if (DroidSafeAndroidRuntime.control) throw new RuntimeException(e);
        } //End block
        writeString(e.getMessage());
        addTaint(e.getTaint());
        // ---------- Original Method ----------
        //int code = 0;
        //if (e instanceof SecurityException) {
            //code = EX_SECURITY;
        //} else if (e instanceof BadParcelableException) {
            //code = EX_BAD_PARCELABLE;
        //} else if (e instanceof IllegalArgumentException) {
            //code = EX_ILLEGAL_ARGUMENT;
        //} else if (e instanceof NullPointerException) {
            //code = EX_NULL_POINTER;
        //} else if (e instanceof IllegalStateException) {
            //code = EX_ILLEGAL_STATE;
        //}
        //writeInt(code);
        //StrictMode.clearGatheredViolations();
        //if (code == 0) {
            //if (e instanceof RuntimeException) {
                //throw (RuntimeException) e;
            //}
            //throw new RuntimeException(e);
        //}
        //writeString(e.getMessage());
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.481 -0400", hash_original_method = "123C62676F5EFD49547DAF82EF108740", hash_generated_method = "2AD69B4085B15528AADFE9308BD7E5F7")
    public final void writeNoException() {
        {
            boolean var67AAFC75FFEDAFC4D52248FF88A9C8E7_2138883448 = (StrictMode.hasGatheredViolations());
            {
                writeInt(EX_HAS_REPLY_HEADER);
                int sizePosition;
                sizePosition = dataPosition();
                writeInt(0);
                StrictMode.writeGatheredViolationsToParcel(this);
                int payloadPosition;
                payloadPosition = dataPosition();
                setDataPosition(sizePosition);
                writeInt(payloadPosition - sizePosition);
                setDataPosition(payloadPosition);
            } //End block
            {
                writeInt(0);
            } //End block
        } //End collapsed parenthetic
        // ---------- Original Method ----------
        //if (StrictMode.hasGatheredViolations()) {
            //writeInt(EX_HAS_REPLY_HEADER);
            //final int sizePosition = dataPosition();
            //writeInt(0);  
            //StrictMode.writeGatheredViolationsToParcel(this);
            //final int payloadPosition = dataPosition();
            //setDataPosition(sizePosition);
            //writeInt(payloadPosition - sizePosition);  
            //setDataPosition(payloadPosition);
        //} else {
            //writeInt(0);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.482 -0400", hash_original_method = "82EBD768B4FCE70E559935E5298055BB", hash_generated_method = "F55C6933CEB93ACE162731DB834588A9")
    public final void readException() {
        int code;
        code = readExceptionCode();
        {
            String msg;
            msg = readString();
            readException(code, msg);
        } //End block
        // ---------- Original Method ----------
        //int code = readExceptionCode();
        //if (code != 0) {
            //String msg = readString();
            //readException(code, msg);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.483 -0400", hash_original_method = "38AAEB1276A409D21345CE71D5A4968D", hash_generated_method = "431481CFE39FCCF25423C6D2865202EE")
    public final int readExceptionCode() {
        int code;
        code = readInt();
        {
            int headerSize;
            headerSize = readInt();
            {
                StrictMode.readAndHandleBinderCallViolations(this);
            } //End block
        } //End block
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_15033517 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_15033517;
        // ---------- Original Method ----------
        //int code = readInt();
        //if (code == EX_HAS_REPLY_HEADER) {
            //int headerSize = readInt();
            //if (headerSize == 0) {
                //Log.e(TAG, "Unexpected zero-sized Parcel reply header.");
            //} else {
                //StrictMode.readAndHandleBinderCallViolations(this);
            //}
            //return 0;
        //}
        //return code;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.483 -0400", hash_original_method = "16B6C7096EAAE541E38738222303A695", hash_generated_method = "E1A6625007DA31B04BDAEDD7DCD27DD3")
    public final void readException(int code, String msg) {
        //Begin case EX_SECURITY 
        if (DroidSafeAndroidRuntime.control) throw new SecurityException(msg);
        //End case EX_SECURITY 
        //Begin case EX_BAD_PARCELABLE 
        if (DroidSafeAndroidRuntime.control) throw new BadParcelableException(msg);
        //End case EX_BAD_PARCELABLE 
        //Begin case EX_ILLEGAL_ARGUMENT 
        if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException(msg);
        //End case EX_ILLEGAL_ARGUMENT 
        //Begin case EX_NULL_POINTER 
        if (DroidSafeAndroidRuntime.control) throw new NullPointerException(msg);
        //End case EX_NULL_POINTER 
        //Begin case EX_ILLEGAL_STATE 
        if (DroidSafeAndroidRuntime.control) throw new IllegalStateException(msg);
        //End case EX_ILLEGAL_STATE 
        if (DroidSafeAndroidRuntime.control) throw new RuntimeException("Unknown exception code: " + code
                + " msg " + msg);
        addTaint(code);
        addTaint(msg.getTaint());
        // ---------- Original Method ----------
        //switch (code) {
            //case EX_SECURITY:
                //throw new SecurityException(msg);
            //case EX_BAD_PARCELABLE:
                //throw new BadParcelableException(msg);
            //case EX_ILLEGAL_ARGUMENT:
                //throw new IllegalArgumentException(msg);
            //case EX_NULL_POINTER:
                //throw new NullPointerException(msg);
            //case EX_ILLEGAL_STATE:
                //throw new IllegalStateException(msg);
        //}
        //throw new RuntimeException("Unknown exception code: " + code
                //+ " msg " + msg);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.484 -0400", hash_original_method = "97FB920EA9544B24495059FF8518145E", hash_generated_method = "1EFDD0A6C53F68F80922935F94E2BBB5")
    public final int readInt() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_807504509 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_807504509;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.484 -0400", hash_original_method = "88765326927052F47E1B04CC1A370299", hash_generated_method = "2A3FAF516C11F12EA703C8633B70D0D9")
    public final long readLong() {
        long var0F5264038205EDFB1AC05FBB0E8C5E94_775700660 = getTaintLong();
        return var0F5264038205EDFB1AC05FBB0E8C5E94_775700660;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.502 -0400", hash_original_method = "9BF95C525D78F630EDF572E34BF4D430", hash_generated_method = "8E866DF0442E50798B4BF2EF66CB6A49")
    public final float readFloat() {
        float var546ADE640B6EDFBC8A086EF31347E768_316955506 = getTaintFloat();
        return var546ADE640B6EDFBC8A086EF31347E768_316955506;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.503 -0400", hash_original_method = "FFE81D38F89970F2B0BAD4C68B43B4BA", hash_generated_method = "F780321676FDD90B33E34FBF306758FB")
    public final double readDouble() {
        double varE8CD7DA078A86726031AD64F35F5A6C0_2056501862 = getTaintDouble();
        return varE8CD7DA078A86726031AD64F35F5A6C0_2056501862;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.503 -0400", hash_original_method = "E5D101F44C406F4D63DCAF323A3DBE7A", hash_generated_method = "1C9A6574A6BB76E4DCFE30F009ECD100")
    public final String readString() {
        //DSFIXME: CODE0013:  Native method returns a complex type and requires manual reviews
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.504 -0400", hash_original_method = "1E262BAA6376F101519B67935298363E", hash_generated_method = "C77B0144AA00CA6755278047A5DAB799")
    public final CharSequence readCharSequence() {
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_1108851324 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1108851324 = TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this);
        varB4EAC82CA7396A68D541C85D26508E83_1108851324.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1108851324;
        // ---------- Original Method ----------
        //return TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.505 -0400", hash_original_method = "5B57CBCFFAE68CC288C10DD7232B6ED1", hash_generated_method = "44CAE844D4E5A4CBF2E99C7605E5B931")
    public final IBinder readStrongBinder() {
        //DSFIXME: CODE0013:  Native method returns a complex type and requires manual reviews
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.505 -0400", hash_original_method = "624419D3E87C84C27536CFAE1C7248DF", hash_generated_method = "C81CD7BAAF0A94DFC05E4196F9B6294B")
    public final ParcelFileDescriptor readFileDescriptor() {
        ParcelFileDescriptor varB4EAC82CA7396A68D541C85D26508E83_1601844613 = null; //Variable for return #1
        FileDescriptor fd;
        fd = internalReadFileDescriptor();
        varB4EAC82CA7396A68D541C85D26508E83_1601844613 = fd != null ? new ParcelFileDescriptor(fd) : null;
        varB4EAC82CA7396A68D541C85D26508E83_1601844613.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1601844613;
        // ---------- Original Method ----------
        //FileDescriptor fd = internalReadFileDescriptor();
        //return fd != null ? new ParcelFileDescriptor(fd) : null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.505 -0400", hash_original_method = "33B415422717616FBFFA4D8F233FE3A4", hash_generated_method = "0FD8D4B30F488C8E04BA04A3C811CF90")
    private FileDescriptor internalReadFileDescriptor() {
        //DSFIXME: CODE0013:  Native method returns a complex type and requires manual reviews
    }

    
        static FileDescriptor openFileDescriptor(String file,
            int mode) throws FileNotFoundException {
        //DSFIXME:  CODE0012: Native static method requires manual modeling
    }

    
        static FileDescriptor dupFileDescriptor(FileDescriptor orig) throws IOException {
        //DSFIXME:  CODE0012: Native static method requires manual modeling
    }

    
        static void closeFileDescriptor(FileDescriptor desc) throws IOException {
    }

    
        static void clearFileDescriptor(FileDescriptor desc) {
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.524 -0400", hash_original_method = "12B71841CE7C7BEB8DB394B4DC6EF58B", hash_generated_method = "F0BF1A11018D15F423CF14BF90EFF9F2")
    public final byte readByte() {
        byte varA3491D8E17C6029A18B5C5A7657736E0_1344812528 = ((byte)(readInt() & 0xff));
        byte var40EA57D3EE3C07BF1C102B466E1C3091_1710194473 = getTaintByte();
        return var40EA57D3EE3C07BF1C102B466E1C3091_1710194473;
        // ---------- Original Method ----------
        //return (byte)(readInt() & 0xff);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.524 -0400", hash_original_method = "82825CDD252FB884333A0468F1B46F6F", hash_generated_method = "DD80C69A4FBD75C22DA2DE0024EF0362")
    public final void readMap(Map outVal, ClassLoader loader) {
        int N;
        N = readInt();
        readMapInternal(outVal, N, loader);
        addTaint(outVal.getTaint());
        addTaint(loader.getTaint());
        // ---------- Original Method ----------
        //int N = readInt();
        //readMapInternal(outVal, N, loader);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.525 -0400", hash_original_method = "C60DBA65518C72AFC52918F8818E7A4A", hash_generated_method = "AA627E185336E392AF6129F205DC7155")
    public final void readList(List outVal, ClassLoader loader) {
        int N;
        N = readInt();
        readListInternal(outVal, N, loader);
        addTaint(outVal.getTaint());
        addTaint(loader.getTaint());
        // ---------- Original Method ----------
        //int N = readInt();
        //readListInternal(outVal, N, loader);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.526 -0400", hash_original_method = "0DC8809E3B9E75AF0CC28567E6782BE5", hash_generated_method = "290EDFE0F94CE64A407646BF14594998")
    public final HashMap readHashMap(ClassLoader loader) {
        HashMap varB4EAC82CA7396A68D541C85D26508E83_1943139570 = null; //Variable for return #1
        HashMap varB4EAC82CA7396A68D541C85D26508E83_203381229 = null; //Variable for return #2
        int N;
        N = readInt();
        {
            varB4EAC82CA7396A68D541C85D26508E83_1943139570 = null;
        } //End block
        HashMap m;
        m = new HashMap(N);
        readMapInternal(m, N, loader);
        varB4EAC82CA7396A68D541C85D26508E83_203381229 = m;
        addTaint(loader.getTaint());
        HashMap varA7E53CE21691AB073D9660D615818899_1223758664; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1223758664 = varB4EAC82CA7396A68D541C85D26508E83_1943139570;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1223758664 = varB4EAC82CA7396A68D541C85D26508E83_203381229;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1223758664.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1223758664;
        // ---------- Original Method ----------
        //int N = readInt();
        //if (N < 0) {
            //return null;
        //}
        //HashMap m = new HashMap(N);
        //readMapInternal(m, N, loader);
        //return m;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.526 -0400", hash_original_method = "30B879800FFE3D55BB9B30F39E994273", hash_generated_method = "E02DC0A1C771290FBC6CBD3BA4C1CD4E")
    public final Bundle readBundle() {
        Bundle varB4EAC82CA7396A68D541C85D26508E83_1229414545 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1229414545 = readBundle(null);
        varB4EAC82CA7396A68D541C85D26508E83_1229414545.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1229414545;
        // ---------- Original Method ----------
        //return readBundle(null);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.531 -0400", hash_original_method = "7DBD463E649AEA6A8616F4943C405C7A", hash_generated_method = "BAC6ED31B8ECD3F64DB14B99F5B6F6DC")
    public final Bundle readBundle(ClassLoader loader) {
        Bundle varB4EAC82CA7396A68D541C85D26508E83_1370831582 = null; //Variable for return #1
        Bundle varB4EAC82CA7396A68D541C85D26508E83_868698982 = null; //Variable for return #2
        int length;
        length = readInt();
        {
            varB4EAC82CA7396A68D541C85D26508E83_1370831582 = null;
        } //End block
        Bundle bundle;
        bundle = new Bundle(this, length);
        {
            bundle.setClassLoader(loader);
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_868698982 = bundle;
        addTaint(loader.getTaint());
        Bundle varA7E53CE21691AB073D9660D615818899_832390619; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_832390619 = varB4EAC82CA7396A68D541C85D26508E83_1370831582;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_832390619 = varB4EAC82CA7396A68D541C85D26508E83_868698982;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_832390619.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_832390619;
        // ---------- Original Method ----------
        //int length = readInt();
        //if (length < 0) {
            //return null;
        //}
        //final Bundle bundle = new Bundle(this, length);
        //if (loader != null) {
            //bundle.setClassLoader(loader);
        //}
        //return bundle;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.553 -0400", hash_original_method = "DCFF48487CDF8628FF2244CC4810775C", hash_generated_method = "0B8AA68D620ED69E1C7F5A1668339B4E")
    public final byte[] createByteArray() {
        byte[] var2F9C81BC6E497382285CD6B7A7E33DE1_811950596 = {getTaintByte()};
        return var2F9C81BC6E497382285CD6B7A7E33DE1_811950596;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.554 -0400", hash_original_method = "40FE8430590711C6D2AB472A3973EA8A", hash_generated_method = "C025AD6274F3E57547CC619D8003E25B")
    public final void readByteArray(byte[] val) {
        byte[] ba;
        ba = createByteArray();
        {
            System.arraycopy(ba, 0, val, 0, ba.length);
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw new RuntimeException("bad array lengths");
        } //End block
        addTaint(val[0]);
        // ---------- Original Method ----------
        //byte[] ba = createByteArray();
        //if (ba.length == val.length) {
           //System.arraycopy(ba, 0, val, 0, ba.length);
        //} else {
            //throw new RuntimeException("bad array lengths");
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.556 -0400", hash_original_method = "3F4E1D573E001DD6503628882E161682", hash_generated_method = "D5F60BA4D07CA8B6CAE2EA737FDEAFEB")
    public final String[] readStringArray() {
        String[] varB4EAC82CA7396A68D541C85D26508E83_1077413478 = null; //Variable for return #1
        String[] array;
        array = null;
        int length;
        length = readInt();
        {
            array = new String[length];
            {
                int i;
                i = 0;
                {
                    array[i] = readString();
                } //End block
            } //End collapsed parenthetic
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1077413478 = array;
        varB4EAC82CA7396A68D541C85D26508E83_1077413478.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1077413478;
        // ---------- Original Method ----------
        //String[] array = null;
        //int length = readInt();
        //if (length >= 0)
        //{
            //array = new String[length];
            //for (int i = 0 ; i < length ; i++)
            //{
                //array[i] = readString();
            //}
        //}
        //return array;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.557 -0400", hash_original_method = "0A6BC69D8060353BD0BABF3E9B4D1085", hash_generated_method = "70E9C3558A0C4602B66ABB6CD0F8D92D")
    public final CharSequence[] readCharSequenceArray() {
        CharSequence[] varB4EAC82CA7396A68D541C85D26508E83_661038732 = null; //Variable for return #1
        CharSequence[] array;
        array = null;
        int length;
        length = readInt();
        {
            array = new CharSequence[length];
            {
                int i;
                i = 0;
                {
                    array[i] = readCharSequence();
                } //End block
            } //End collapsed parenthetic
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_661038732 = array;
        varB4EAC82CA7396A68D541C85D26508E83_661038732.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_661038732;
        // ---------- Original Method ----------
        //CharSequence[] array = null;
        //int length = readInt();
        //if (length >= 0)
        //{
            //array = new CharSequence[length];
            //for (int i = 0 ; i < length ; i++)
            //{
                //array[i] = readCharSequence();
            //}
        //}
        //return array;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.563 -0400", hash_original_method = "0CB879EE6020D3E02716A43BE19D4D51", hash_generated_method = "04ADA144FA9159ADB03E70C3DB644079")
    public final ArrayList readArrayList(ClassLoader loader) {
        ArrayList varB4EAC82CA7396A68D541C85D26508E83_1848961589 = null; //Variable for return #1
        ArrayList varB4EAC82CA7396A68D541C85D26508E83_1943815030 = null; //Variable for return #2
        int N;
        N = readInt();
        {
            varB4EAC82CA7396A68D541C85D26508E83_1848961589 = null;
        } //End block
        ArrayList l;
        l = new ArrayList(N);
        readListInternal(l, N, loader);
        varB4EAC82CA7396A68D541C85D26508E83_1943815030 = l;
        addTaint(loader.getTaint());
        ArrayList varA7E53CE21691AB073D9660D615818899_1877740164; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1877740164 = varB4EAC82CA7396A68D541C85D26508E83_1848961589;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1877740164 = varB4EAC82CA7396A68D541C85D26508E83_1943815030;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1877740164.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1877740164;
        // ---------- Original Method ----------
        //int N = readInt();
        //if (N < 0) {
            //return null;
        //}
        //ArrayList l = new ArrayList(N);
        //readListInternal(l, N, loader);
        //return l;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.581 -0400", hash_original_method = "BFE5C5C5F5678C281D93BB53C31E26A0", hash_generated_method = "03AC064F8000A1A3B4F4663D35B9D279")
    public final Object[] readArray(ClassLoader loader) {
        Object[] varB4EAC82CA7396A68D541C85D26508E83_946003490 = null; //Variable for return #1
        Object[] varB4EAC82CA7396A68D541C85D26508E83_1834048900 = null; //Variable for return #2
        int N;
        N = readInt();
        {
            varB4EAC82CA7396A68D541C85D26508E83_946003490 = null;
        } //End block
        Object[] l;
        l = new Object[N];
        readArrayInternal(l, N, loader);
        varB4EAC82CA7396A68D541C85D26508E83_1834048900 = l;
        addTaint(loader.getTaint());
        Object[] varA7E53CE21691AB073D9660D615818899_1138308956; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1138308956 = varB4EAC82CA7396A68D541C85D26508E83_946003490;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1138308956 = varB4EAC82CA7396A68D541C85D26508E83_1834048900;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1138308956.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1138308956;
        // ---------- Original Method ----------
        //int N = readInt();
        //if (N < 0) {
            //return null;
        //}
        //Object[] l = new Object[N];
        //readArrayInternal(l, N, loader);
        //return l;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.582 -0400", hash_original_method = "53952EC2EA973438719A76F49C86D9F1", hash_generated_method = "141B133A345B66E094F6670FA16AE411")
    public final SparseArray readSparseArray(ClassLoader loader) {
        SparseArray varB4EAC82CA7396A68D541C85D26508E83_750186895 = null; //Variable for return #1
        SparseArray varB4EAC82CA7396A68D541C85D26508E83_2099896200 = null; //Variable for return #2
        int N;
        N = readInt();
        {
            varB4EAC82CA7396A68D541C85D26508E83_750186895 = null;
        } //End block
        SparseArray sa;
        sa = new SparseArray(N);
        readSparseArrayInternal(sa, N, loader);
        varB4EAC82CA7396A68D541C85D26508E83_2099896200 = sa;
        addTaint(loader.getTaint());
        SparseArray varA7E53CE21691AB073D9660D615818899_2090915114; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_2090915114 = varB4EAC82CA7396A68D541C85D26508E83_750186895;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_2090915114 = varB4EAC82CA7396A68D541C85D26508E83_2099896200;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_2090915114.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_2090915114;
        // ---------- Original Method ----------
        //int N = readInt();
        //if (N < 0) {
            //return null;
        //}
        //SparseArray sa = new SparseArray(N);
        //readSparseArrayInternal(sa, N, loader);
        //return sa;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.597 -0400", hash_original_method = "04DCF387CF40E8397784231DC7CB64F8", hash_generated_method = "78E663A21054C78925EC1F599B400C9D")
    public final SparseBooleanArray readSparseBooleanArray() {
        SparseBooleanArray varB4EAC82CA7396A68D541C85D26508E83_1781959355 = null; //Variable for return #1
        SparseBooleanArray varB4EAC82CA7396A68D541C85D26508E83_199880670 = null; //Variable for return #2
        int N;
        N = readInt();
        {
            varB4EAC82CA7396A68D541C85D26508E83_1781959355 = null;
        } //End block
        SparseBooleanArray sa;
        sa = new SparseBooleanArray(N);
        readSparseBooleanArrayInternal(sa, N);
        varB4EAC82CA7396A68D541C85D26508E83_199880670 = sa;
        SparseBooleanArray varA7E53CE21691AB073D9660D615818899_1444544406; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1444544406 = varB4EAC82CA7396A68D541C85D26508E83_1781959355;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1444544406 = varB4EAC82CA7396A68D541C85D26508E83_199880670;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1444544406.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1444544406;
        // ---------- Original Method ----------
        //int N = readInt();
        //if (N < 0) {
            //return null;
        //}
        //SparseBooleanArray sa = new SparseBooleanArray(N);
        //readSparseBooleanArrayInternal(sa, N);
        //return sa;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.599 -0400", hash_original_method = "456F7B8C59883BEB9D747B5AF3A070B1", hash_generated_method = "D8AF647AC0EA8FAF61E62D7B9F040F15")
    public final <T> ArrayList<T> createTypedArrayList(Parcelable.Creator<T> c) {
        ArrayList<T> varB4EAC82CA7396A68D541C85D26508E83_1779104671 = null; //Variable for return #1
        ArrayList<T> varB4EAC82CA7396A68D541C85D26508E83_312727064 = null; //Variable for return #2
        int N;
        N = readInt();
        {
            varB4EAC82CA7396A68D541C85D26508E83_1779104671 = null;
        } //End block
        ArrayList<T> l;
        l = new ArrayList<T>(N);
        {
            {
                boolean var3DB8322DDBEA41253B55CFA78FBE3A8A_928929182 = (readInt() != 0);
                {
                    l.add(c.createFromParcel(this));
                } //End block
                {
                    l.add(null);
                } //End block
            } //End collapsed parenthetic
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_312727064 = l;
        addTaint(c.getTaint());
        ArrayList<T> varA7E53CE21691AB073D9660D615818899_35066534; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_35066534 = varB4EAC82CA7396A68D541C85D26508E83_1779104671;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_35066534 = varB4EAC82CA7396A68D541C85D26508E83_312727064;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_35066534.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_35066534;
        // ---------- Original Method ----------
        //int N = readInt();
        //if (N < 0) {
            //return null;
        //}
        //ArrayList<T> l = new ArrayList<T>(N);
        //while (N > 0) {
            //if (readInt() != 0) {
                //l.add(c.createFromParcel(this));
            //} else {
                //l.add(null);
            //}
            //N--;
        //}
        //return l;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.605 -0400", hash_original_method = "B9FCE8B620ADC76BF3A577C32D057CDB", hash_generated_method = "C91A99B4ABCF788AAFFB6D938ED37C6A")
    public final <T> void readTypedList(List<T> list, Parcelable.Creator<T> c) {
        int M;
        M = list.size();
        int N;
        N = readInt();
        int i;
        i = 0;
        {
            {
                boolean var3DB8322DDBEA41253B55CFA78FBE3A8A_740424945 = (readInt() != 0);
                {
                    list.set(i, c.createFromParcel(this));
                } //End block
                {
                    list.set(i, null);
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            {
                boolean var3DB8322DDBEA41253B55CFA78FBE3A8A_1350038540 = (readInt() != 0);
                {
                    list.add(c.createFromParcel(this));
                } //End block
                {
                    list.add(null);
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            list.remove(N);
        } //End block
        addTaint(list.getTaint());
        addTaint(c.getTaint());
        // ---------- Original Method ----------
        //int M = list.size();
        //int N = readInt();
        //int i = 0;
        //for (; i < M && i < N; i++) {
            //if (readInt() != 0) {
                //list.set(i, c.createFromParcel(this));
            //} else {
                //list.set(i, null);
            //}
        //}
        //for (; i<N; i++) {
            //if (readInt() != 0) {
                //list.add(c.createFromParcel(this));
            //} else {
                //list.add(null);
            //}
        //}
        //for (; i<M; i++) {
            //list.remove(N);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.615 -0400", hash_original_method = "6BB9790DD7CE6638433A98D5801460E1", hash_generated_method = "98180A97FE3D1279F86A8A0CA65DD780")
    public final ArrayList<String> createStringArrayList() {
        ArrayList<String> varB4EAC82CA7396A68D541C85D26508E83_53851038 = null; //Variable for return #1
        ArrayList<String> varB4EAC82CA7396A68D541C85D26508E83_142643288 = null; //Variable for return #2
        int N;
        N = readInt();
        {
            varB4EAC82CA7396A68D541C85D26508E83_53851038 = null;
        } //End block
        ArrayList<String> l;
        l = new ArrayList<String>(N);
        {
            l.add(readString());
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_142643288 = l;
        ArrayList<String> varA7E53CE21691AB073D9660D615818899_382508817; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_382508817 = varB4EAC82CA7396A68D541C85D26508E83_53851038;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_382508817 = varB4EAC82CA7396A68D541C85D26508E83_142643288;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_382508817.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_382508817;
        // ---------- Original Method ----------
        //int N = readInt();
        //if (N < 0) {
            //return null;
        //}
        //ArrayList<String> l = new ArrayList<String>(N);
        //while (N > 0) {
            //l.add(readString());
            //N--;
        //}
        //return l;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.702 -0400", hash_original_method = "4AA47F929C1AD4C6AA4FF7E97EBA01C3", hash_generated_method = "7389855D3D9635675DA04BD4CDB58019")
    public final ArrayList<IBinder> createBinderArrayList() {
        ArrayList<IBinder> varB4EAC82CA7396A68D541C85D26508E83_1955508091 = null; //Variable for return #1
        ArrayList<IBinder> varB4EAC82CA7396A68D541C85D26508E83_1586241676 = null; //Variable for return #2
        int N;
        N = readInt();
        {
            varB4EAC82CA7396A68D541C85D26508E83_1955508091 = null;
        } //End block
        ArrayList<IBinder> l;
        l = new ArrayList<IBinder>(N);
        {
            l.add(readStrongBinder());
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1586241676 = l;
        ArrayList<IBinder> varA7E53CE21691AB073D9660D615818899_533652534; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_533652534 = varB4EAC82CA7396A68D541C85D26508E83_1955508091;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_533652534 = varB4EAC82CA7396A68D541C85D26508E83_1586241676;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_533652534.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_533652534;
        // ---------- Original Method ----------
        //int N = readInt();
        //if (N < 0) {
            //return null;
        //}
        //ArrayList<IBinder> l = new ArrayList<IBinder>(N);
        //while (N > 0) {
            //l.add(readStrongBinder());
            //N--;
        //}
        //return l;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.703 -0400", hash_original_method = "9CB504FEFB4242E237E17E2EB9A48FBD", hash_generated_method = "4E9626C7EAB2858510E9168A5E74A2A0")
    public final void readStringList(List<String> list) {
        int M;
        M = list.size();
        int N;
        N = readInt();
        int i;
        i = 0;
        {
            list.set(i, readString());
        } //End block
        {
            list.add(readString());
        } //End block
        {
            list.remove(N);
        } //End block
        addTaint(list.getTaint());
        // ---------- Original Method ----------
        //int M = list.size();
        //int N = readInt();
        //int i = 0;
        //for (; i < M && i < N; i++) {
            //list.set(i, readString());
        //}
        //for (; i<N; i++) {
            //list.add(readString());
        //}
        //for (; i<M; i++) {
            //list.remove(N);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.723 -0400", hash_original_method = "BD5E31C17A1894DBD3B1CCAA7C1D6816", hash_generated_method = "D3ABF3FE41CAB97FD77F58CE769727CB")
    public final void readBinderList(List<IBinder> list) {
        int M;
        M = list.size();
        int N;
        N = readInt();
        int i;
        i = 0;
        {
            list.set(i, readStrongBinder());
        } //End block
        {
            list.add(readStrongBinder());
        } //End block
        {
            list.remove(N);
        } //End block
        addTaint(list.getTaint());
        // ---------- Original Method ----------
        //int M = list.size();
        //int N = readInt();
        //int i = 0;
        //for (; i < M && i < N; i++) {
            //list.set(i, readStrongBinder());
        //}
        //for (; i<N; i++) {
            //list.add(readStrongBinder());
        //}
        //for (; i<M; i++) {
            //list.remove(N);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.724 -0400", hash_original_method = "3CEF6E6386B4F00BA8155F93C3068CB0", hash_generated_method = "EE6D824F56FF216334F661615FF58F6A")
    public final <T> T[] createTypedArray(Parcelable.Creator<T> c) {
        T[] varB4EAC82CA7396A68D541C85D26508E83_256300585 = null; //Variable for return #1
        T[] varB4EAC82CA7396A68D541C85D26508E83_1718704245 = null; //Variable for return #2
        int N;
        N = readInt();
        {
            varB4EAC82CA7396A68D541C85D26508E83_256300585 = null;
        } //End block
        T[] l;
        l = c.newArray(N);
        {
            int i;
            i = 0;
            {
                {
                    boolean varF3F4117B020949AD5A99383C367C3DCB_1109550802 = (readInt() != 0);
                    {
                        l[i] = c.createFromParcel(this);
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_1718704245 = l;
        addTaint(c.getTaint());
        T[] varA7E53CE21691AB073D9660D615818899_899163203; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_899163203 = varB4EAC82CA7396A68D541C85D26508E83_256300585;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_899163203 = varB4EAC82CA7396A68D541C85D26508E83_1718704245;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_899163203.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_899163203;
        // ---------- Original Method ----------
        //int N = readInt();
        //if (N < 0) {
            //return null;
        //}
        //T[] l = c.newArray(N);
        //for (int i=0; i<N; i++) {
            //if (readInt() != 0) {
                //l[i] = c.createFromParcel(this);
            //}
        //}
        //return l;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.726 -0400", hash_original_method = "94DCFDEC159CF16A54AB9BC1543AACB0", hash_generated_method = "DFF92DA3A6A2E7B696B9E48DCC17E084")
    public final <T> void readTypedArray(T[] val, Parcelable.Creator<T> c) {
        int N;
        N = readInt();
        {
            {
                int i;
                i = 0;
                {
                    {
                        boolean varDA2468261896472593A672B57BF55D76_1429989976 = (readInt() != 0);
                        {
                            val[i] = c.createFromParcel(this);
                        } //End block
                        {
                            val[i] = null;
                        } //End block
                    } //End collapsed parenthetic
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw new RuntimeException("bad array lengths");
        } //End block
        addTaint(val[0].getTaint());
        addTaint(c.getTaint());
        // ---------- Original Method ----------
        //int N = readInt();
        //if (N == val.length) {
            //for (int i=0; i<N; i++) {
                //if (readInt() != 0) {
                    //val[i] = c.createFromParcel(this);
                //} else {
                    //val[i] = null;
                //}
            //}
        //} else {
            //throw new RuntimeException("bad array lengths");
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.729 -0400", hash_original_method = "6C2CF48F71A46FC325FBB3DF7C6E0C74", hash_generated_method = "2A76DF92CF5E2B8D51B8E68BC3D26010")
    @Deprecated
    public final <T> T[] readTypedArray(Parcelable.Creator<T> c) {
        T[] varB4EAC82CA7396A68D541C85D26508E83_897817969 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_897817969 = createTypedArray(c);
        addTaint(c.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_897817969.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_897817969;
        // ---------- Original Method ----------
        //return createTypedArray(c);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.752 -0400", hash_original_method = "B6CF25F021EC35EAE7839E69AD502686", hash_generated_method = "64305CE80CAA68D1406B7E1AC771C21D")
    public final <T extends Parcelable> void writeParcelableArray(T[] value,
            int parcelableFlags) {
        {
            int N;
            N = value.length;
            writeInt(N);
            {
                int i;
                i = 0;
                {
                    writeParcelable(value[i], parcelableFlags);
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            writeInt(-1);
        } //End block
        addTaint(value[0].getTaint());
        addTaint(parcelableFlags);
        // ---------- Original Method ----------
        //if (value != null) {
            //int N = value.length;
            //writeInt(N);
            //for (int i=0; i<N; i++) {
                //writeParcelable(value[i], parcelableFlags);
            //}
        //} else {
            //writeInt(-1);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.779 -0400", hash_original_method = "BC2BD16709D000C887B8D48E60CFBD74", hash_generated_method = "4F39499AECDD55ABD3AAF96ED74955A3")
    public final Object readValue(ClassLoader loader) {
        Object varB4EAC82CA7396A68D541C85D26508E83_1277073289 = null; //Variable for return #1
        Object varB4EAC82CA7396A68D541C85D26508E83_1487322962 = null; //Variable for return #2
        Object varB4EAC82CA7396A68D541C85D26508E83_1684072783 = null; //Variable for return #3
        Object varB4EAC82CA7396A68D541C85D26508E83_535970002 = null; //Variable for return #4
        Object varB4EAC82CA7396A68D541C85D26508E83_1400842497 = null; //Variable for return #5
        Object varB4EAC82CA7396A68D541C85D26508E83_353572280 = null; //Variable for return #6
        Object varB4EAC82CA7396A68D541C85D26508E83_1252988332 = null; //Variable for return #7
        Object varB4EAC82CA7396A68D541C85D26508E83_367387239 = null; //Variable for return #8
        Object varB4EAC82CA7396A68D541C85D26508E83_1826925308 = null; //Variable for return #9
        Object varB4EAC82CA7396A68D541C85D26508E83_926706294 = null; //Variable for return #10
        Object varB4EAC82CA7396A68D541C85D26508E83_110596074 = null; //Variable for return #11
        Object varB4EAC82CA7396A68D541C85D26508E83_1626860790 = null; //Variable for return #12
        Object varB4EAC82CA7396A68D541C85D26508E83_2061845621 = null; //Variable for return #13
        Object varB4EAC82CA7396A68D541C85D26508E83_778893979 = null; //Variable for return #14
        Object varB4EAC82CA7396A68D541C85D26508E83_367643107 = null; //Variable for return #15
        Object varB4EAC82CA7396A68D541C85D26508E83_577808407 = null; //Variable for return #16
        Object varB4EAC82CA7396A68D541C85D26508E83_118832945 = null; //Variable for return #17
        Object varB4EAC82CA7396A68D541C85D26508E83_914689131 = null; //Variable for return #18
        Object varB4EAC82CA7396A68D541C85D26508E83_1772948786 = null; //Variable for return #19
        Object varB4EAC82CA7396A68D541C85D26508E83_216715506 = null; //Variable for return #20
        Object varB4EAC82CA7396A68D541C85D26508E83_1697595215 = null; //Variable for return #21
        Object varB4EAC82CA7396A68D541C85D26508E83_1845510764 = null; //Variable for return #22
        Object varB4EAC82CA7396A68D541C85D26508E83_953189095 = null; //Variable for return #23
        Object varB4EAC82CA7396A68D541C85D26508E83_593954333 = null; //Variable for return #24
        Object varB4EAC82CA7396A68D541C85D26508E83_1410840039 = null; //Variable for return #25
        Object varB4EAC82CA7396A68D541C85D26508E83_2059971491 = null; //Variable for return #26
        int type;
        type = readInt();
        //Begin case VAL_NULL 
        varB4EAC82CA7396A68D541C85D26508E83_1277073289 = null;
        //End case VAL_NULL 
        //Begin case VAL_STRING 
        varB4EAC82CA7396A68D541C85D26508E83_1487322962 = readString();
        //End case VAL_STRING 
        //Begin case VAL_INTEGER 
        varB4EAC82CA7396A68D541C85D26508E83_1684072783 = readInt();
        //End case VAL_INTEGER 
        //Begin case VAL_MAP 
        varB4EAC82CA7396A68D541C85D26508E83_535970002 = readHashMap(loader);
        //End case VAL_MAP 
        //Begin case VAL_PARCELABLE 
        varB4EAC82CA7396A68D541C85D26508E83_1400842497 = readParcelable(loader);
        //End case VAL_PARCELABLE 
        //Begin case VAL_SHORT 
        varB4EAC82CA7396A68D541C85D26508E83_353572280 = (short) readInt();
        //End case VAL_SHORT 
        //Begin case VAL_LONG 
        varB4EAC82CA7396A68D541C85D26508E83_1252988332 = readLong();
        //End case VAL_LONG 
        //Begin case VAL_FLOAT 
        varB4EAC82CA7396A68D541C85D26508E83_367387239 = readFloat();
        //End case VAL_FLOAT 
        //Begin case VAL_DOUBLE 
        varB4EAC82CA7396A68D541C85D26508E83_1826925308 = readDouble();
        //End case VAL_DOUBLE 
        //Begin case VAL_BOOLEAN 
        varB4EAC82CA7396A68D541C85D26508E83_926706294 = readInt() == 1;
        //End case VAL_BOOLEAN 
        //Begin case VAL_CHARSEQUENCE 
        varB4EAC82CA7396A68D541C85D26508E83_110596074 = readCharSequence();
        //End case VAL_CHARSEQUENCE 
        //Begin case VAL_LIST 
        varB4EAC82CA7396A68D541C85D26508E83_1626860790 = readArrayList(loader);
        //End case VAL_LIST 
        //Begin case VAL_BOOLEANARRAY 
        varB4EAC82CA7396A68D541C85D26508E83_2061845621 = createBooleanArray();
        //End case VAL_BOOLEANARRAY 
        //Begin case VAL_BYTEARRAY 
        varB4EAC82CA7396A68D541C85D26508E83_778893979 = createByteArray();
        //End case VAL_BYTEARRAY 
        //Begin case VAL_STRINGARRAY 
        varB4EAC82CA7396A68D541C85D26508E83_367643107 = readStringArray();
        //End case VAL_STRINGARRAY 
        //Begin case VAL_CHARSEQUENCEARRAY 
        varB4EAC82CA7396A68D541C85D26508E83_577808407 = readCharSequenceArray();
        //End case VAL_CHARSEQUENCEARRAY 
        //Begin case VAL_IBINDER 
        varB4EAC82CA7396A68D541C85D26508E83_118832945 = readStrongBinder();
        //End case VAL_IBINDER 
        //Begin case VAL_OBJECTARRAY 
        varB4EAC82CA7396A68D541C85D26508E83_914689131 = readArray(loader);
        //End case VAL_OBJECTARRAY 
        //Begin case VAL_INTARRAY 
        varB4EAC82CA7396A68D541C85D26508E83_1772948786 = createIntArray();
        //End case VAL_INTARRAY 
        //Begin case VAL_LONGARRAY 
        varB4EAC82CA7396A68D541C85D26508E83_216715506 = createLongArray();
        //End case VAL_LONGARRAY 
        //Begin case VAL_BYTE 
        varB4EAC82CA7396A68D541C85D26508E83_1697595215 = readByte();
        //End case VAL_BYTE 
        //Begin case VAL_SERIALIZABLE 
        varB4EAC82CA7396A68D541C85D26508E83_1845510764 = readSerializable();
        //End case VAL_SERIALIZABLE 
        //Begin case VAL_PARCELABLEARRAY 
        varB4EAC82CA7396A68D541C85D26508E83_953189095 = readParcelableArray(loader);
        //End case VAL_PARCELABLEARRAY 
        //Begin case VAL_SPARSEARRAY 
        varB4EAC82CA7396A68D541C85D26508E83_593954333 = readSparseArray(loader);
        //End case VAL_SPARSEARRAY 
        //Begin case VAL_SPARSEBOOLEANARRAY 
        varB4EAC82CA7396A68D541C85D26508E83_1410840039 = readSparseBooleanArray();
        //End case VAL_SPARSEBOOLEANARRAY 
        //Begin case VAL_BUNDLE 
        varB4EAC82CA7396A68D541C85D26508E83_2059971491 = readBundle(loader);
        //End case VAL_BUNDLE 
        //Begin case default 
        int off;
        off = dataPosition() - 4;
        //End case default 
        //Begin case default 
        if (DroidSafeAndroidRuntime.control) throw new RuntimeException(
                "Parcel " + this + ": Unmarshalling unknown type code " + type + " at offset " + off);
        //End case default 
        addTaint(loader.getTaint());
        Object varA7E53CE21691AB073D9660D615818899_78650521; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_78650521 = varB4EAC82CA7396A68D541C85D26508E83_1277073289;
                break;
            case 2: //Assign result for return ordinal #2
                varA7E53CE21691AB073D9660D615818899_78650521 = varB4EAC82CA7396A68D541C85D26508E83_1487322962;
                break;
            case 3: //Assign result for return ordinal #3
                varA7E53CE21691AB073D9660D615818899_78650521 = varB4EAC82CA7396A68D541C85D26508E83_1684072783;
                break;
            case 4: //Assign result for return ordinal #4
                varA7E53CE21691AB073D9660D615818899_78650521 = varB4EAC82CA7396A68D541C85D26508E83_535970002;
                break;
            case 5: //Assign result for return ordinal #5
                varA7E53CE21691AB073D9660D615818899_78650521 = varB4EAC82CA7396A68D541C85D26508E83_1400842497;
                break;
            case 6: //Assign result for return ordinal #6
                varA7E53CE21691AB073D9660D615818899_78650521 = varB4EAC82CA7396A68D541C85D26508E83_353572280;
                break;
            case 7: //Assign result for return ordinal #7
                varA7E53CE21691AB073D9660D615818899_78650521 = varB4EAC82CA7396A68D541C85D26508E83_1252988332;
                break;
            case 8: //Assign result for return ordinal #8
                varA7E53CE21691AB073D9660D615818899_78650521 = varB4EAC82CA7396A68D541C85D26508E83_367387239;
                break;
            case 9: //Assign result for return ordinal #9
                varA7E53CE21691AB073D9660D615818899_78650521 = varB4EAC82CA7396A68D541C85D26508E83_1826925308;
                break;
            case 10: //Assign result for return ordinal #10
                varA7E53CE21691AB073D9660D615818899_78650521 = varB4EAC82CA7396A68D541C85D26508E83_926706294;
                break;
            case 11: //Assign result for return ordinal #11
                varA7E53CE21691AB073D9660D615818899_78650521 = varB4EAC82CA7396A68D541C85D26508E83_110596074;
                break;
            case 12: //Assign result for return ordinal #12
                varA7E53CE21691AB073D9660D615818899_78650521 = varB4EAC82CA7396A68D541C85D26508E83_1626860790;
                break;
            case 13: //Assign result for return ordinal #13
                varA7E53CE21691AB073D9660D615818899_78650521 = varB4EAC82CA7396A68D541C85D26508E83_2061845621;
                break;
            case 14: //Assign result for return ordinal #14
                varA7E53CE21691AB073D9660D615818899_78650521 = varB4EAC82CA7396A68D541C85D26508E83_778893979;
                break;
            case 15: //Assign result for return ordinal #15
                varA7E53CE21691AB073D9660D615818899_78650521 = varB4EAC82CA7396A68D541C85D26508E83_367643107;
                break;
            case 16: //Assign result for return ordinal #16
                varA7E53CE21691AB073D9660D615818899_78650521 = varB4EAC82CA7396A68D541C85D26508E83_577808407;
                break;
            case 17: //Assign result for return ordinal #17
                varA7E53CE21691AB073D9660D615818899_78650521 = varB4EAC82CA7396A68D541C85D26508E83_118832945;
                break;
            case 18: //Assign result for return ordinal #18
                varA7E53CE21691AB073D9660D615818899_78650521 = varB4EAC82CA7396A68D541C85D26508E83_914689131;
                break;
            case 19: //Assign result for return ordinal #19
                varA7E53CE21691AB073D9660D615818899_78650521 = varB4EAC82CA7396A68D541C85D26508E83_1772948786;
                break;
            case 20: //Assign result for return ordinal #20
                varA7E53CE21691AB073D9660D615818899_78650521 = varB4EAC82CA7396A68D541C85D26508E83_216715506;
                break;
            case 21: //Assign result for return ordinal #21
                varA7E53CE21691AB073D9660D615818899_78650521 = varB4EAC82CA7396A68D541C85D26508E83_1697595215;
                break;
            case 22: //Assign result for return ordinal #22
                varA7E53CE21691AB073D9660D615818899_78650521 = varB4EAC82CA7396A68D541C85D26508E83_1845510764;
                break;
            case 23: //Assign result for return ordinal #23
                varA7E53CE21691AB073D9660D615818899_78650521 = varB4EAC82CA7396A68D541C85D26508E83_953189095;
                break;
            case 24: //Assign result for return ordinal #24
                varA7E53CE21691AB073D9660D615818899_78650521 = varB4EAC82CA7396A68D541C85D26508E83_593954333;
                break;
            case 25: //Assign result for return ordinal #25
                varA7E53CE21691AB073D9660D615818899_78650521 = varB4EAC82CA7396A68D541C85D26508E83_1410840039;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_78650521 = varB4EAC82CA7396A68D541C85D26508E83_2059971491;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_78650521.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_78650521;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.789 -0400", hash_original_method = "973DB4BA749CEAB3796DAD314F27DB98", hash_generated_method = "495F6B794E8FA5FB0301CC7AF531DA18")
    public final <T extends Parcelable> T readParcelable(ClassLoader loader) {
        T varB4EAC82CA7396A68D541C85D26508E83_1899227115 = null; //Variable for return #1
        T varB4EAC82CA7396A68D541C85D26508E83_110863544 = null; //Variable for return #2
        T varB4EAC82CA7396A68D541C85D26508E83_962909482 = null; //Variable for return #3
        String name;
        name = readString();
        {
            varB4EAC82CA7396A68D541C85D26508E83_1899227115 = null;
        } //End block
        Parcelable.Creator<T> creator;
        {
            HashMap<String,Parcelable.Creator> map;
            map = mCreators.get(loader);
            {
                map = new HashMap<String,Parcelable.Creator>();
                mCreators.put(loader, map);
            } //End block
            creator = map.get(name);
            {
                try 
                {
                    Class c;
                    c = Class.forName(name);
                    c = Class.forName(name, true, loader);
                    Field f;
                    f = c.getField("CREATOR");
                    creator = (Parcelable.Creator)f.get(null);
                } //End block
                catch (IllegalAccessException e)
                {
                    if (DroidSafeAndroidRuntime.control) throw new BadParcelableException(
                            "IllegalAccessException when unmarshalling: " + name);
                } //End block
                catch (ClassNotFoundException e)
                {
                    if (DroidSafeAndroidRuntime.control) throw new BadParcelableException(
                            "ClassNotFoundException when unmarshalling: " + name);
                } //End block
                catch (ClassCastException e)
                {
                    if (DroidSafeAndroidRuntime.control) throw new BadParcelableException("Parcelable protocol requires a "
                                        + "Parcelable.Creator object called "
                                        + " CREATOR on class " + name);
                } //End block
                catch (NoSuchFieldException e)
                {
                    if (DroidSafeAndroidRuntime.control) throw new BadParcelableException("Parcelable protocol requires a "
                                        + "Parcelable.Creator object called "
                                        + " CREATOR on class " + name);
                } //End block
                {
                    if (DroidSafeAndroidRuntime.control) throw new BadParcelableException("Parcelable protocol requires a "
                                        + "Parcelable.Creator object called "
                                        + " CREATOR on class " + name);
                } //End block
                map.put(name, creator);
            } //End block
        } //End block
        {
            varB4EAC82CA7396A68D541C85D26508E83_110863544 = ((Parcelable.ClassLoaderCreator<T>)creator).createFromParcel(this, loader);
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_962909482 = creator.createFromParcel(this);
        addTaint(loader.getTaint());
        T varA7E53CE21691AB073D9660D615818899_824648302; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_824648302 = varB4EAC82CA7396A68D541C85D26508E83_1899227115;
                break;
            case 2: //Assign result for return ordinal #2
                varA7E53CE21691AB073D9660D615818899_824648302 = varB4EAC82CA7396A68D541C85D26508E83_110863544;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_824648302 = varB4EAC82CA7396A68D541C85D26508E83_962909482;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_824648302.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_824648302;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.808 -0400", hash_original_method = "7F7B3246FDA8DADD28F39102743A1FDB", hash_generated_method = "014D098F11886008CD457E3D82637743")
    public final Parcelable[] readParcelableArray(ClassLoader loader) {
        Parcelable[] varB4EAC82CA7396A68D541C85D26508E83_765635747 = null; //Variable for return #1
        Parcelable[] varB4EAC82CA7396A68D541C85D26508E83_2145861546 = null; //Variable for return #2
        int N;
        N = readInt();
        {
            varB4EAC82CA7396A68D541C85D26508E83_765635747 = null;
        } //End block
        Parcelable[] p;
        p = new Parcelable[N];
        {
            int i;
            i = 0;
            {
                p[i] = (Parcelable) readParcelable(loader);
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_2145861546 = p;
        addTaint(loader.getTaint());
        Parcelable[] varA7E53CE21691AB073D9660D615818899_1176972411; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1176972411 = varB4EAC82CA7396A68D541C85D26508E83_765635747;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1176972411 = varB4EAC82CA7396A68D541C85D26508E83_2145861546;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1176972411.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1176972411;
        // ---------- Original Method ----------
        //int N = readInt();
        //if (N < 0) {
            //return null;
        //}
        //Parcelable[] p = new Parcelable[N];
        //for (int i = 0; i < N; i++) {
            //p[i] = (Parcelable) readParcelable(loader);
        //}
        //return p;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.809 -0400", hash_original_method = "71C92188775A0F7E9317C601C7CC8BB5", hash_generated_method = "B2E124386F5AAAF86B50DE05FE904E27")
    public final Serializable readSerializable() {
        Serializable varB4EAC82CA7396A68D541C85D26508E83_1157964922 = null; //Variable for return #1
        Serializable varB4EAC82CA7396A68D541C85D26508E83_1100635960 = null; //Variable for return #2
        String name;
        name = readString();
        {
            varB4EAC82CA7396A68D541C85D26508E83_1157964922 = null;
        } //End block
        byte[] serializedData;
        serializedData = createByteArray();
        ByteArrayInputStream bais;
        bais = new ByteArrayInputStream(serializedData);
        try 
        {
            ObjectInputStream ois;
            ois = new ObjectInputStream(bais);
            varB4EAC82CA7396A68D541C85D26508E83_1100635960 = (Serializable) ois.readObject();
        } //End block
        catch (IOException ioe)
        {
            if (DroidSafeAndroidRuntime.control) throw new RuntimeException("Parcelable encountered " +
                "IOException reading a Serializable object (name = " + name +
                ")", ioe);
        } //End block
        catch (ClassNotFoundException cnfe)
        {
            if (DroidSafeAndroidRuntime.control) throw new RuntimeException("Parcelable encountered" +
                "ClassNotFoundException reading a Serializable object (name = "
                + name + ")", cnfe);
        } //End block
        Serializable varA7E53CE21691AB073D9660D615818899_620611995; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_620611995 = varB4EAC82CA7396A68D541C85D26508E83_1157964922;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_620611995 = varB4EAC82CA7396A68D541C85D26508E83_1100635960;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_620611995.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_620611995;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
        static protected final Parcel obtain(int obj) {
        final Parcel[] pool = sHolderPool;
        synchronized (pool) {
            Parcel p;
            for (int i=0; i<POOL_SIZE; i++) {
                p = pool[i];
                if (p != null) {
                    pool[i] = null;
                    if (DEBUG_RECYCLE) {
                        p.mStack = new RuntimeException();
                    }
                    p.init(obj);
                    return p;
                }
            }
        }
        return new Parcel(obj);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.810 -0400", hash_original_method = "8123E4A6E665502F6F718041F61607F2", hash_generated_method = "CB3AB49BF1BB21FE6CF409EBFB0090B3")
    @Override
    protected void finalize() throws Throwable {
        destroy();
        // ---------- Original Method ----------
        //if (DEBUG_RECYCLE) {
            //if (mStack != null) {
                //Log.w(TAG, "Client did not call Parcel.recycle()", mStack);
            //}
        //}
        //destroy();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.810 -0400", hash_original_method = "C0427B473F1AF57292972C32F441E719", hash_generated_method = "61A4E66F7E3CD1708E9FB208543A8E37")
    private void freeBuffer() {
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.817 -0400", hash_original_method = "70F6A5F1801DEC2DB8BE38968C81061C", hash_generated_method = "2B68B9C20AB085D1D67AAC97913FD822")
    private void init(int obj) {
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.821 -0400", hash_original_method = "73111F72F4AB0474EB2CFBD7E4AF4E1A", hash_generated_method = "870C0C4D9949E316DFA0E367EFD712A9")
    private void destroy() {
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.835 -0400", hash_original_method = "377C79A0AFFA00A75F96A5842171AC58", hash_generated_method = "FDA77D8BED4227F7134F0A85F2304FC3")
     void readMapInternal(Map outVal, int N,
        ClassLoader loader) {
        {
            Object key;
            key = readValue(loader);
            Object value;
            value = readValue(loader);
            outVal.put(key, value);
        } //End block
        addTaint(outVal.getTaint());
        addTaint(N);
        addTaint(loader.getTaint());
        // ---------- Original Method ----------
        //while (N > 0) {
            //Object key = readValue(loader);
            //Object value = readValue(loader);
            //outVal.put(key, value);
            //N--;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.836 -0400", hash_original_method = "9EEE2505D88E68CC65378BE9FEB363CC", hash_generated_method = "A2A41D739E290B46EEE8B9D0EA453A11")
    private void readListInternal(List outVal, int N,
        ClassLoader loader) {
        {
            Object value;
            value = readValue(loader);
            outVal.add(value);
        } //End block
        addTaint(outVal.getTaint());
        addTaint(N);
        addTaint(loader.getTaint());
        // ---------- Original Method ----------
        //while (N > 0) {
            //Object value = readValue(loader);
            //outVal.add(value);
            //N--;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.837 -0400", hash_original_method = "8048910DC1D629DD4CA2AB6051E757D5", hash_generated_method = "7F94247DD046DF341C6E3D0C0D3D5B09")
    private void readArrayInternal(Object[] outVal, int N,
        ClassLoader loader) {
        {
            int i;
            i = 0;
            {
                Object value;
                value = readValue(loader);
                outVal[i] = value;
            } //End block
        } //End collapsed parenthetic
        addTaint(outVal[0].getTaint());
        addTaint(N);
        addTaint(loader.getTaint());
        // ---------- Original Method ----------
        //for (int i = 0; i < N; i++) {
            //Object value = readValue(loader);
            //outVal[i] = value;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.837 -0400", hash_original_method = "43DDAB261C65CF1F1B4E5B19576BB376", hash_generated_method = "69D30FA34C36146E1F984F8C0F1BE4F1")
    private void readSparseArrayInternal(SparseArray outVal, int N,
        ClassLoader loader) {
        {
            int key;
            key = readInt();
            Object value;
            value = readValue(loader);
            outVal.append(key, value);
        } //End block
        addTaint(outVal.getTaint());
        addTaint(N);
        addTaint(loader.getTaint());
        // ---------- Original Method ----------
        //while (N > 0) {
            //int key = readInt();
            //Object value = readValue(loader);
            //outVal.append(key, value);
            //N--;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.843 -0400", hash_original_method = "687B1CF2F9242ACE26C54A0109BE177B", hash_generated_method = "D55C2E7EE1098391CB3B9755C1B0F1A2")
    private void readSparseBooleanArrayInternal(SparseBooleanArray outVal, int N) {
        {
            int key;
            key = readInt();
            boolean value;
            value = this.readByte() == 1;
            outVal.append(key, value);
        } //End block
        addTaint(outVal.getTaint());
        addTaint(N);
        // ---------- Original Method ----------
        //while (N > 0) {
            //int key = readInt();
            //boolean value = this.readByte() == 1;
            //outVal.append(key, value);
            //N--;
        //}
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.843 -0400", hash_original_field = "A71BA10A20EF888B1EF8CA16D55D9309", hash_generated_field = "EBFA74D7F7857CADB3FF1E1AB48831B7")

    private static boolean DEBUG_RECYCLE = false;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.843 -0400", hash_original_field = "B28A49621CF2334B275ADEDF6302D3FE", hash_generated_field = "D23EF584E1746832C305403AD3AAD082")

    private static String TAG = "Parcel";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.843 -0400", hash_original_field = "8CC9C9BA8E0F199B497EC24ADC83BF65", hash_generated_field = "1C8618095D28CA488FE38676C2BBDDE9")

    private static int POOL_SIZE = 6;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.857 -0400", hash_original_field = "C8932CF14EADE23425A9D54B122FD8C9", hash_generated_field = "408FE67E4A83FB619009001722A1D9E2")

    private static Parcel[] sOwnedPool = new Parcel[POOL_SIZE];
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.858 -0400", hash_original_field = "7D0A268CFF89FF45FBD851483F1AA181", hash_generated_field = "32F8AA464FE2DB7D6C70747B9C2D225B")

    private static Parcel[] sHolderPool = new Parcel[POOL_SIZE];
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.858 -0400", hash_original_field = "ACEA6349EAE0AE22FE138A1505C3AC43", hash_generated_field = "BF4567EA4A93A5C4203B0F0097DDBAA3")

    private static int VAL_NULL = -1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.858 -0400", hash_original_field = "A383EB6C18224D1E8B49FDE74C52AD41", hash_generated_field = "FF52F8B7C7FFDB4ED1EA4A56775E3F6A")

    private static int VAL_STRING = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.858 -0400", hash_original_field = "90D1816FAD55D60EA32349F44BEE1FA1", hash_generated_field = "0DA5A11E30123514B69F5EE1EF18350A")

    private static int VAL_INTEGER = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.858 -0400", hash_original_field = "AE858B0C1836E5CD5EA56F704DF57D42", hash_generated_field = "A74CA1F86DFF484AEEFA7D0B2A43158F")

    private static int VAL_MAP = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.858 -0400", hash_original_field = "31533D34B6E9C81E65DCAE4C34B5EE04", hash_generated_field = "A74EC5515F4800CF7C84B39A9CECCBE7")

    private static int VAL_BUNDLE = 3;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.858 -0400", hash_original_field = "25D66E9FE0A96FA5502CB8C017BA33A7", hash_generated_field = "9EDF5EDBF4148B1BD8066D87AA952402")

    private static int VAL_PARCELABLE = 4;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.858 -0400", hash_original_field = "E4BD524F34367626F9C7CD376225C7FB", hash_generated_field = "6A74C05C8FD6026CD0A6A71CD73D4C32")

    private static int VAL_SHORT = 5;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.858 -0400", hash_original_field = "5DEC1A4B3D9350FA566473650ABEDC26", hash_generated_field = "A5161FF35430EEFBE67B97351C807046")

    private static int VAL_LONG = 6;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.859 -0400", hash_original_field = "7C773DA5B01AAAE7B478B5183F72E7A5", hash_generated_field = "47FC4E03B57840E2FC44E1893AC89403")

    private static int VAL_FLOAT = 7;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.859 -0400", hash_original_field = "B9673347A98E9E4F53B2D7677F3DB072", hash_generated_field = "5774246E92209FCF253BAA562BEC2812")

    private static int VAL_DOUBLE = 8;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.859 -0400", hash_original_field = "CF553E461BBB2ACE9C33C7AE3EC116BF", hash_generated_field = "D5D9F6351E771A12DCD37A6D9E1F250E")

    private static int VAL_BOOLEAN = 9;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.859 -0400", hash_original_field = "C4EFFF2F54E9F7853F6083EFC9E9D109", hash_generated_field = "E3D3620C43281E2F6FFB0C5AF51993D2")

    private static int VAL_CHARSEQUENCE = 10;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.859 -0400", hash_original_field = "CF19CCA45146ED659BC8BE0770B83850", hash_generated_field = "A48B92F7200B5E1CF2B0B508EFEC6939")

    private static int VAL_LIST = 11;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.859 -0400", hash_original_field = "A48C77C1642DC44BF3193BE6A03A4F27", hash_generated_field = "C2DF0DD57FA93039683C45724077C6C1")

    private static int VAL_SPARSEARRAY = 12;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.859 -0400", hash_original_field = "7A27992AF9A0ABD9406AFAD7F69432D1", hash_generated_field = "622EE750BD6A0858AB511B39CF671D52")

    private static int VAL_BYTEARRAY = 13;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.859 -0400", hash_original_field = "D293DEB200879D8E15F5D077CCFC795E", hash_generated_field = "4BDB13A662295CB4725004AC103E0742")

    private static int VAL_STRINGARRAY = 14;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.859 -0400", hash_original_field = "7864638DD0ECA8DB5FEA6648DBAC22C7", hash_generated_field = "ADF79B7803B3CA7B62F6610C6EC03832")

    private static int VAL_IBINDER = 15;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.859 -0400", hash_original_field = "8FF06F86C8A1DC58010E03FFF27D61BF", hash_generated_field = "33E8164E0026467FCAEB116E6DF06E34")

    private static int VAL_PARCELABLEARRAY = 16;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.859 -0400", hash_original_field = "8DA9E444EB65D0B5DBF7F59EF7B370BB", hash_generated_field = "81051B8AA57FC9FF3156BE8FAC242601")

    private static int VAL_OBJECTARRAY = 17;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.860 -0400", hash_original_field = "6857A57259DB7027514CD5286F44AA3D", hash_generated_field = "9770906FE34C56CF20EE4E7109A3B0AC")

    private static int VAL_INTARRAY = 18;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.860 -0400", hash_original_field = "03AC5509ED82DD27DDD80111B0D6F105", hash_generated_field = "47AD29658F6BBCC19F6833967F8AF1C6")

    private static int VAL_LONGARRAY = 19;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.860 -0400", hash_original_field = "E4540E289F5D42A14E7DC05C4CA668C0", hash_generated_field = "E35FABA610CBAFFDF6FEAB812A3CF1E9")

    private static int VAL_BYTE = 20;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.860 -0400", hash_original_field = "2E1327ABAE1B48B171CC4B553304BEA1", hash_generated_field = "23391ADD49708E8BC4C33A87D7A17BA4")

    private static int VAL_SERIALIZABLE = 21;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.860 -0400", hash_original_field = "A124CA776792D53D93CEC75233DBCF6A", hash_generated_field = "7D25677E90125E4AA8DDC750AB9A7909")

    private static int VAL_SPARSEBOOLEANARRAY = 22;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.860 -0400", hash_original_field = "696AF07A4832CE39E55C7E5208DB7A0B", hash_generated_field = "3DEAAB76D31B46690A2C6A569698433A")

    private static int VAL_BOOLEANARRAY = 23;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.860 -0400", hash_original_field = "FF01C04E922A7030EA9D324CCA0814E4", hash_generated_field = "DC431E1B8E0A12A43E2E2C5F87EF1CBD")

    private static int VAL_CHARSEQUENCEARRAY = 24;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.860 -0400", hash_original_field = "3565AB005C087B9C54508E43A859B614", hash_generated_field = "7748559B29BD8EBE2E8975E6B41C715F")

    private static int EX_SECURITY = -1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.860 -0400", hash_original_field = "02188DB64D8756EDBDBEB9D7F6FE9E72", hash_generated_field = "9303788E03E3CCD33C42715B32EC7E9D")

    private static int EX_BAD_PARCELABLE = -2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.860 -0400", hash_original_field = "4377EB88638F3CE9554BB7F18D23AE22", hash_generated_field = "9BF54B0B4B0E7239394F6255D56B8057")

    private static int EX_ILLEGAL_ARGUMENT = -3;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.860 -0400", hash_original_field = "2A43B7B02F2CF68642F5BDF80DED8567", hash_generated_field = "14299595E47BD7B67F4C8F6BE8FAF2A6")

    private static int EX_NULL_POINTER = -4;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.880 -0400", hash_original_field = "6E8C36F4CB9BC94CE915825BFAAF4E3B", hash_generated_field = "7C7D00AE20CDB51E3EE5AE35D3FFE307")

    private static int EX_ILLEGAL_STATE = -5;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.880 -0400", hash_original_field = "E1BCE24EB8484F3581021F6250445299", hash_generated_field = "5BF7F70B7502B663FD6620238E357D5D")

    private static int EX_HAS_REPLY_HEADER = -128;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.880 -0400", hash_original_field = "2D365FB9C0F84B811EE25074666800D6", hash_generated_field = "FB53F9F5DC3AAFE064E58E049D0C49AF")

    public final static Parcelable.Creator<String> STRING_CREATOR
             = new Parcelable.Creator<String>() {
        public String createFromParcel(Parcel source) {
            return source.readString();
        }
        public String[] newArray(int size) {
            return new String[size];
        }
    };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:29.880 -0400", hash_original_field = "EAE59FB152640F6C5452B3D15C76FF4C", hash_generated_field = "410773AF06E3723060E4C10BA0585B52")

    private static HashMap<ClassLoader,HashMap<String,Parcelable.Creator>> mCreators = new HashMap<ClassLoader,HashMap<String,Parcelable.Creator>>();
}

