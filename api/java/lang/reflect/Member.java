package java.lang.reflect;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;

public interface Member {

    
    public static final int PUBLIC = 0;

    
    public static final int DECLARED = 1;

    
    @SuppressWarnings("unchecked")
    Class<?> getDeclaringClass();

    
    int getModifiers();

    
    String getName();

    
    boolean isSynthetic();
}
