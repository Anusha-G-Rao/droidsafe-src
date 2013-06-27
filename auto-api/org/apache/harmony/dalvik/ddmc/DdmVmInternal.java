package org.apache.harmony.dalvik.ddmc;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;

public class DdmVmInternal {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:08.814 -0400", hash_original_method = "D0F76540C42EA165AE45A0473185E42C", hash_generated_method = "25D97099B63C10431BD47D09A2644BA5")
    private  DdmVmInternal() {
        // ---------- Original Method ----------
    }

    
        public static void threadNotify(boolean enable) {
    }

    
        public static boolean heapInfoNotify(int when) {
        return DSUtils.UNKNOWN_BOOLEAN;
    }

    
        public static boolean heapSegmentNotify(int when, int what,
        boolean isNative) {
        return DSUtils.UNKNOWN_BOOLEAN;
    }

    
        public static byte[] getThreadStats() {
        return {DSUtils.UNKNOWN_BYTE};
    }

    
        public static StackTraceElement[] getStackTraceById(int threadId) {
        //DSFIXME:  CODE0012: Native static method requires manual modeling
    }

    
        public static void enableRecentAllocations(boolean enable) {
    }

    
        public static boolean getRecentAllocationStatus() {
        return DSUtils.UNKNOWN_BOOLEAN;
    }

    
        public static byte[] getRecentAllocations() {
        return {DSUtils.UNKNOWN_BYTE};
    }

    
}

