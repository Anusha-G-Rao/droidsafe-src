package java.util;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;

public abstract class Dictionary<K, V> {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:50.243 -0400", hash_original_method = "9548777BBF89E111326DB823D31BF669", hash_generated_method = "14E151CF1CAF4908929119D552F99B0F")
    public  Dictionary() {
        // ---------- Original Method ----------
    }

    
    public abstract Enumeration<V> elements();

    
    public abstract V get(Object key);

    
    public abstract boolean isEmpty();

    
    public abstract Enumeration<K> keys();

    
    public abstract V put(K key, V value);

    
    public abstract V remove(Object key);

    
    public abstract int size();

    
}

