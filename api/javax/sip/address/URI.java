package javax.sip.address;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import java.io.Serializable;

public interface URI extends Cloneable, Serializable {
    String getScheme();
    boolean isSipURI();

    Object clone();
    String toString();
}
