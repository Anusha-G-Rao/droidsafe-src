package java.util;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;

final class HugeEnumSet<E extends Enum<E>> extends EnumSet<E> {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:52.024 -0400", hash_original_field = "407482FEF87D1B9F3A34AF46A705ABA8", hash_generated_field = "783D81D695A8378E8654E8D6DD3B9BE2")

    private E[] enums;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:52.024 -0400", hash_original_field = "CC411E6C13670E52124629B8AC83F7D0", hash_generated_field = "487233F7143B18DBA481DB90C8ACD8D3")

    private long[] bits;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:52.024 -0400", hash_original_field = "F7BD60B75B29D79B660A2859395C1A24", hash_generated_field = "F06612A05C836674433E69C513561353")

    private int size;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:52.024 -0400", hash_original_method = "EEA55C49C96425F7EA6FAB4AE055FF38", hash_generated_method = "A69E040A9B48E6B565F7177BCD72C055")
      HugeEnumSet(Class<E> elementType, E[] enums) {
        super(elementType);
        this.enums = enums;
        bits = new long[(enums.length + BIT_IN_LONG - 1) / BIT_IN_LONG];
        addTaint(elementType.getTaint());
        // ---------- Original Method ----------
        //this.enums = enums;
        //bits = new long[(enums.length + BIT_IN_LONG - 1) / BIT_IN_LONG];
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:52.025 -0400", hash_original_method = "AA8C9EBB2E9808034C94DE14598C355D", hash_generated_method = "D5E192F8AD0F986CFEB74F710B5726AC")
    @Override
    public boolean add(E element) {
        elementClass.cast(element);
        int ordinal;
        ordinal = element.ordinal();
        int index;
        index = ordinal / BIT_IN_LONG;
        int inBits;
        inBits = ordinal % BIT_IN_LONG;
        long oldBits;
        oldBits = bits[index];
        long newBits;
        newBits = oldBits | (1L << inBits);
        {
            bits[index] = newBits;
        } //End block
        addTaint(element.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_448459750 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_448459750;
        // ---------- Original Method ----------
        //elementClass.cast(element);
        //int ordinal = element.ordinal();
        //int index = ordinal / BIT_IN_LONG;
        //int inBits = ordinal % BIT_IN_LONG;
        //long oldBits = bits[index];
        //long newBits = oldBits | (1L << inBits);
        //if (oldBits != newBits) {
            //bits[index] = newBits;
            //size++;
            //return true;
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:52.026 -0400", hash_original_method = "E12827AAC6F89269FBC667C494374EA1", hash_generated_method = "3A4B15AC4C951A10553F2640D12EF7F3")
    @Override
    public boolean addAll(Collection<? extends E> collection) {
        {
            boolean var3B2CA533278FD3BC25287536E014CB23_1005575658 = (collection.isEmpty() || collection == this);
        } //End collapsed parenthetic
        {
            EnumSet<?> set;
            set = (EnumSet) collection;
            set.elementClass.asSubclass(elementClass);
            HugeEnumSet<E> hugeSet;
            hugeSet = (HugeEnumSet<E>) set;
            boolean changed;
            changed = false;
            {
                int i;
                i = 0;
                {
                    long oldBits;
                    oldBits = bits[i];
                    long newBits;
                    newBits = oldBits | hugeSet.bits[i];
                    {
                        bits[i] = newBits;
                        size += Long.bitCount(newBits) - Long.bitCount(oldBits);
                        changed = true;
                    } //End block
                } //End block
            } //End collapsed parenthetic
        } //End block
        boolean varEB611C777D04833FE5AA6B71D18D3718_941055387 = (super.addAll(collection));
        addTaint(collection.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_84486057 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_84486057;
        // ---------- Original Method ----------
        //if (collection.isEmpty() || collection == this) {
            //return false;
        //}
        //if (collection instanceof EnumSet) {
            //EnumSet<?> set = (EnumSet) collection; 
            //set.elementClass.asSubclass(elementClass); 
            //HugeEnumSet<E> hugeSet = (HugeEnumSet<E>) set;
            //boolean changed = false;
            //for (int i = 0; i < bits.length; i++) {
                //long oldBits = bits[i];
                //long newBits = oldBits | hugeSet.bits[i];
                //if (oldBits != newBits) {
                    //bits[i] = newBits;
                    //size += Long.bitCount(newBits) - Long.bitCount(oldBits);
                    //changed = true;
                //}
            //}
            //return changed;
        //}
        //return super.addAll(collection);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:52.026 -0400", hash_original_method = "3CA361324F026F8C9B0AA94A864ACDD9", hash_generated_method = "AFCD82687A74BAECC47199292DCD9890")
    @Override
    public int size() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1422954591 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1422954591;
        // ---------- Original Method ----------
        //return size;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:52.027 -0400", hash_original_method = "DCEAB8467BE76F2C68D656B465986296", hash_generated_method = "44B0C7C748288EE706DEDE8A6C28EFB5")
    @Override
    public void clear() {
        Arrays.fill(bits, 0);
        size = 0;
        // ---------- Original Method ----------
        //Arrays.fill(bits, 0);
        //size = 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:52.042 -0400", hash_original_method = "A9576B1054BBEFBD598CED30CCA4181D", hash_generated_method = "39FA04FC98B0699BD5846ABE89979540")
    @Override
    protected void complement() {
        size = 0;
        {
            int i, length;
            i = 0;
            length = bits.length;
            {
                long b;
                b = ~bits[i];
                {
                    b &= -1L >>> (BIT_IN_LONG - (enums.length % BIT_IN_LONG));
                } //End block
                size += Long.bitCount(b);
                bits[i] = b;
            } //End block
        } //End collapsed parenthetic
        // ---------- Original Method ----------
        //size = 0;
        //for (int i = 0, length = bits.length; i < length; i++) {
            //long b = ~bits[i];
            //if (i == length - 1) {
                //b &= -1L >>> (BIT_IN_LONG - (enums.length % BIT_IN_LONG));
            //}
            //size += Long.bitCount(b);
            //bits[i] = b;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:52.043 -0400", hash_original_method = "B006F695BBA9ACB2815E6A6799929FF8", hash_generated_method = "8E1A061F73ACEAF89F269AB73E6CF850")
    @Override
    public boolean contains(Object object) {
        {
            boolean varE5952BCD6CF6F9557D7D5FDD0B6C62AB_167248009 = (object == null || !isValidType(object.getClass()));
        } //End collapsed parenthetic
        @SuppressWarnings("unchecked") int ordinal;
        ordinal = ((E) object).ordinal();
        int index;
        index = ordinal / BIT_IN_LONG;
        int inBits;
        inBits = ordinal % BIT_IN_LONG;
        addTaint(object.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_285925334 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_285925334;
        // ---------- Original Method ----------
        //if (object == null || !isValidType(object.getClass())) {
            //return false;
        //}
        //@SuppressWarnings("unchecked") 
        //int ordinal = ((E) object).ordinal();
        //int index = ordinal / BIT_IN_LONG;
        //int inBits = ordinal % BIT_IN_LONG;
        //return (bits[index] & (1L << inBits)) != 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:52.043 -0400", hash_original_method = "826B98DAC190E2D4BDC8BAF1B8E9FA22", hash_generated_method = "FDC22E9735C1DB537B0703EE103F8D1A")
    @Override
    public HugeEnumSet<E> clone() {
        HugeEnumSet<E> varB4EAC82CA7396A68D541C85D26508E83_886131192 = null; //Variable for return #1
        HugeEnumSet<E> set;
        set = (HugeEnumSet<E>) super.clone();
        set.bits = bits.clone();
        varB4EAC82CA7396A68D541C85D26508E83_886131192 = set;
        varB4EAC82CA7396A68D541C85D26508E83_886131192.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_886131192;
        // ---------- Original Method ----------
        //HugeEnumSet<E> set = (HugeEnumSet<E>) super.clone();
        //set.bits = bits.clone();
        //return set;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:52.044 -0400", hash_original_method = "339CE6C6AEA3B599DB9A44E737F0BFCB", hash_generated_method = "48892D454BE5A9036FDBFC7AC99A4CFF")
    @Override
    public boolean containsAll(Collection<?> collection) {
        {
            boolean var8E459D14D8063CC6C44012E6D0BE3338_2126863708 = (collection.isEmpty());
        } //End collapsed parenthetic
        {
            HugeEnumSet<?> set;
            set = (HugeEnumSet<?>) collection;
            {
                boolean varDE391B62B6D66788B807EF0C5A492585_430727607 = (isValidType(set.elementClass));
                {
                    {
                        int i;
                        i = 0;
                        {
                            long setBits;
                            setBits = set.bits[i];
                        } //End block
                    } //End collapsed parenthetic
                } //End block
            } //End collapsed parenthetic
        } //End block
        boolean varF7A7E8D103444376F893F3304E0C70F4_1309103607 = (!(collection instanceof EnumSet) && super.containsAll(collection));
        addTaint(collection.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_609263159 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_609263159;
        // ---------- Original Method ----------
        //if (collection.isEmpty()) {
            //return true;
        //}
        //if (collection instanceof HugeEnumSet) {
            //HugeEnumSet<?> set = (HugeEnumSet<?>) collection;
            //if (isValidType(set.elementClass)) {
                //for (int i = 0; i < bits.length; i++) {
                    //long setBits = set.bits[i];
                    //if ((bits[i] & setBits) != setBits) {
                        //return false;
                    //}
                //}
                //return true;
            //}
        //}
        //return !(collection instanceof EnumSet) && super.containsAll(collection);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:52.044 -0400", hash_original_method = "29B1F731631A653DA7254FAD146C3D30", hash_generated_method = "B2D90B547C5F62E59D5F4C8C7D236961")
    @Override
    public boolean equals(Object object) {
        {
            boolean var0BEE195FDC5A4C364075EE964A7A7328_1195421260 = (!isValidType(object.getClass()));
            {
                boolean var5F3224CFE728C1743180B4BAE5039FE5_821034369 = (super.equals(object));
            } //End block
        } //End collapsed parenthetic
        boolean var06CA9D625FDB0DFEAEA936AF129E1B4E_1950630408 = (Arrays.equals(bits, ((HugeEnumSet<?>) object).bits));
        addTaint(object.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1845157428 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1845157428;
        // ---------- Original Method ----------
        //if (object == null) {
            //return false;
        //}
        //if (!isValidType(object.getClass())) {
            //return super.equals(object);
        //}
        //return Arrays.equals(bits, ((HugeEnumSet<?>) object).bits);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:52.045 -0400", hash_original_method = "B316E1958D9D53581FC97DA7E1235F34", hash_generated_method = "45FE143821017D212DA23D846B5FFC3B")
    @Override
    public Iterator<E> iterator() {
        Iterator<E> varB4EAC82CA7396A68D541C85D26508E83_1641530650 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1641530650 = new HugeEnumSetIterator();
        varB4EAC82CA7396A68D541C85D26508E83_1641530650.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1641530650;
        // ---------- Original Method ----------
        //return new HugeEnumSetIterator();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:52.045 -0400", hash_original_method = "0CEE396056E1D776D537706DDC043702", hash_generated_method = "5959F186B1CE7B812406511C3EA6FE2E")
    @Override
    public boolean remove(Object object) {
        {
            boolean varE5952BCD6CF6F9557D7D5FDD0B6C62AB_737077329 = (object == null || !isValidType(object.getClass()));
        } //End collapsed parenthetic
        @SuppressWarnings("unchecked") int ordinal;
        ordinal = ((E) object).ordinal();
        int index;
        index = ordinal / BIT_IN_LONG;
        int inBits;
        inBits = ordinal % BIT_IN_LONG;
        long oldBits;
        oldBits = bits[index];
        long newBits;
        newBits = oldBits & ~(1L << inBits);
        {
            bits[index] = newBits;
        } //End block
        addTaint(object.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_641519578 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_641519578;
        // ---------- Original Method ----------
        //if (object == null || !isValidType(object.getClass())) {
            //return false;
        //}
        //@SuppressWarnings("unchecked") 
        //int ordinal = ((E) object).ordinal();
        //int index = ordinal / BIT_IN_LONG;
        //int inBits = ordinal % BIT_IN_LONG;
        //long oldBits = bits[index];
        //long newBits = oldBits & ~(1L << inBits);
        //if (oldBits != newBits) {
            //bits[index] = newBits;
            //size--;
            //return true;
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:52.059 -0400", hash_original_method = "3A1F4E4B375F17905B34B03F15B39BEF", hash_generated_method = "568456378E34FC56190414D98D7F8D76")
    @Override
    public boolean removeAll(Collection<?> collection) {
        {
            boolean var8E459D14D8063CC6C44012E6D0BE3338_1415952860 = (collection.isEmpty());
        } //End collapsed parenthetic
        {
            EnumSet<?> set;
            set = (EnumSet<?>) collection;
            {
                boolean varBA48F6D095241919836645401D6F116E_507938393 = (!isValidType(set.elementClass));
            } //End collapsed parenthetic
            HugeEnumSet<E> hugeSet;
            hugeSet = (HugeEnumSet<E>) set;
            boolean changed;
            changed = false;
            {
                int i;
                i = 0;
                {
                    long oldBits;
                    oldBits = bits[i];
                    long newBits;
                    newBits = oldBits & ~hugeSet.bits[i];
                    {
                        bits[i] = newBits;
                        size += Long.bitCount(newBits) - Long.bitCount(oldBits);
                        changed = true;
                    } //End block
                } //End block
            } //End collapsed parenthetic
        } //End block
        boolean var683870BA88109C83545AC694C96B458A_1409154169 = (super.removeAll(collection));
        addTaint(collection.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1325384699 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1325384699;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:52.060 -0400", hash_original_method = "60F21531B5154FAF39DCC5FD8D5C4219", hash_generated_method = "2BF9B213549E2FBF312037CC59F0970D")
    @Override
    public boolean retainAll(Collection<?> collection) {
        {
            EnumSet<?> set;
            set = (EnumSet<?>) collection;
            {
                boolean varBA48F6D095241919836645401D6F116E_1135938359 = (!isValidType(set.elementClass));
                {
                    {
                        clear();
                    } //End block
                } //End block
            } //End collapsed parenthetic
            HugeEnumSet<E> hugeSet;
            hugeSet = (HugeEnumSet<E>) set;
            boolean changed;
            changed = false;
            {
                int i;
                i = 0;
                {
                    long oldBits;
                    oldBits = bits[i];
                    long newBits;
                    newBits = oldBits & hugeSet.bits[i];
                    {
                        bits[i] = newBits;
                        size += Long.bitCount(newBits) - Long.bitCount(oldBits);
                        changed = true;
                    } //End block
                } //End block
            } //End collapsed parenthetic
        } //End block
        boolean var2CAA4A68044DBB7B5CB3E7FF23679230_762380308 = (super.retainAll(collection));
        addTaint(collection.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_745002350 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_745002350;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:52.061 -0400", hash_original_method = "8A87EADAF5D536F1830CF4EB88261592", hash_generated_method = "11AF9D0E1184F4C332D9A814BF1C237D")
    @Override
     void setRange(E start, E end) {
        int startOrdinal;
        startOrdinal = start.ordinal();
        int startIndex;
        startIndex = startOrdinal / BIT_IN_LONG;
        int startInBits;
        startInBits = startOrdinal % BIT_IN_LONG;
        int endOrdinal;
        endOrdinal = end.ordinal();
        int endIndex;
        endIndex = endOrdinal / BIT_IN_LONG;
        int endInBits;
        endInBits = endOrdinal % BIT_IN_LONG;
        {
            long range;
            range = (-1L >>> (BIT_IN_LONG -(endInBits - startInBits + 1))) << startInBits;
            size -= Long.bitCount(bits[startIndex]);
            bits[startIndex] |= range;
            size += Long.bitCount(bits[startIndex]);
        } //End block
        {
            long range;
            range = (-1L >>> startInBits) << startInBits;
            size -= Long.bitCount(bits[startIndex]);
            bits[startIndex] |= range;
            size += Long.bitCount(bits[startIndex]);
            range = -1L >>> (BIT_IN_LONG - (endInBits + 1));
            size -= Long.bitCount(bits[endIndex]);
            bits[endIndex] |= range;
            size += Long.bitCount(bits[endIndex]);
            {
                int i;
                i = (startIndex + 1);
                {
                    size -= Long.bitCount(bits[i]);
                    bits[i] = -1L;
                    size += Long.bitCount(bits[i]);
                } //End block
            } //End collapsed parenthetic
        } //End block
        addTaint(start.getTaint());
        addTaint(end.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    private class HugeEnumSetIterator implements Iterator<E> {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:52.062 -0400", hash_original_field = "82C47125B2259EDDE10B83EF1976B39A", hash_generated_field = "C1B6116DE9FEB291CD26A801EC34041A")

        private long currentBits = bits[0];
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:52.062 -0400", hash_original_field = "6A992D5529F459A44FEE58C733255E86", hash_generated_field = "56A277C77B76B31C1E1045C8C11CA802")

        private int index;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:52.062 -0400", hash_original_field = "F2CE11EBF110993621BEDD8E747D7B1B", hash_generated_field = "EAE061265E9AAFE24A096DF314F2EEC2")

        private long mask;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:52.062 -0400", hash_original_field = "98BD1C45684CF587AC2347A92DD7BB51", hash_generated_field = "D8F234509BE4DCE084A89E169B9321DD")

        private E last;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:52.062 -0400", hash_original_method = "FF84D40F2248B9BB6D017CB27211B237", hash_generated_method = "93D38B12F784CDCB9694A9331A12A737")
        private  HugeEnumSetIterator() {
            computeNextElement();
            // ---------- Original Method ----------
            //computeNextElement();
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:52.062 -0400", hash_original_method = "2CE5F24A4C571BEECB25C40400E44908", hash_generated_method = "B01AC19B8CE850FE23343A0E33487176")
         void computeNextElement() {
            {
                {
                    mask = currentBits & -currentBits;
                } //End block
                {
                    currentBits = bits[index];
                } //End block
                {
                    mask = 0;
                } //End block
            } //End block
            // ---------- Original Method ----------
            //while (true) {
                //if (currentBits != 0) {
                    //mask = currentBits & -currentBits; 
                    //return;
                //} else if (++index < bits.length) {
                    //currentBits = bits[index];
                //} else {
                    //mask = 0;
                    //return;
                //}
            //}
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:52.073 -0400", hash_original_method = "04AD09EE87D1D0FB4F163A9180F152BA", hash_generated_method = "2C1F66958A84BFF02CF3CFC7DADFDEBE")
        public boolean hasNext() {
            boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_464223038 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_464223038;
            // ---------- Original Method ----------
            //return mask != 0;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:52.075 -0400", hash_original_method = "B99B4F6D513EFDAF8AFCA1BFB6A725C7", hash_generated_method = "38B53B98E5CE7A02877108B2BDECAF99")
        public E next() {
            E varB4EAC82CA7396A68D541C85D26508E83_373866933 = null; //Variable for return #1
            {
                if (DroidSafeAndroidRuntime.control) throw new NoSuchElementException();
            } //End block
            int ordinal;
            ordinal = Long.numberOfTrailingZeros(mask) + index * BIT_IN_LONG;
            last = enums[ordinal];
            currentBits &= ~mask;
            computeNextElement();
            varB4EAC82CA7396A68D541C85D26508E83_373866933 = last;
            varB4EAC82CA7396A68D541C85D26508E83_373866933.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_373866933;
            // ---------- Original Method ----------
            //if (mask == 0) {
                //throw new NoSuchElementException();
            //}
            //int ordinal = Long.numberOfTrailingZeros(mask) + index * BIT_IN_LONG;
            //last = enums[ordinal];
            //currentBits &= ~mask;
            //computeNextElement();
            //return last;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:52.075 -0400", hash_original_method = "56FBFE20B1E9D061DA542B4F3A5EEEAB", hash_generated_method = "2BC8768FFE79230446A2B3EDEC7C23AA")
        public void remove() {
            {
                if (DroidSafeAndroidRuntime.control) throw new IllegalStateException();
            } //End block
            HugeEnumSet.this.remove(last);
            last = null;
            // ---------- Original Method ----------
            //if (last == null) {
                //throw new IllegalStateException();
            //}
            //HugeEnumSet.this.remove(last);
            //last = null;
        }

        
    }


    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:52.075 -0400", hash_original_field = "0292F67E7C59ADF794759ADEDFC60560", hash_generated_field = "EB1F313FAB591854E64AB1D6F318F2E1")

    private static int BIT_IN_LONG = 64;
}

