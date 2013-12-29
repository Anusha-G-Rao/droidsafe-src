package java.lang.ref;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;


public class WeakReference<T> extends Reference<T> {

    /**
     * Constructs a new weak reference to the given referent. The newly created
     * reference is not registered with any reference queue.
     *
     * @param r the referent to track
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:27.613 -0500", hash_original_method = "8EA2EBB87AD36DFCCFE2AFAE0E37BC47", hash_generated_method = "017308E48D7250A3BF3BE12CDE53806C")
    public WeakReference(T r) {
        super(r, null);
    }

    /**
     * Constructs a new weak reference to the given referent. The newly created
     * reference is registered with the given reference queue.
     *
     * @param r the referent to track
     * @param q the queue to register to the reference object with. A null value
     *          results in a weak reference that is not associated with any
     *          queue.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:27.614 -0500", hash_original_method = "5A9A40099BD4C3938AFF91F9B1097812", hash_generated_method = "9BD1637300A18F5DCD6CAE440482C7C2")
    public WeakReference(T r, ReferenceQueue<? super T> q) {
        super(r, q);
    }

    
}

