package java.lang;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;





public class NullPointerException extends RuntimeException {
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:21.679 -0500", hash_original_field = "03E4BC0AAEE343048823929513A337BB", hash_generated_field = "059D1248FC34ADECE2A43C5EBD68DEF3")


    private static final long serialVersionUID = 5162710183389028792L;

    /**
     * Constructs a new {@code NullPointerException} that includes the current
     * stack trace.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:21.680 -0500", hash_original_method = "4CD1558B74CC9F94FAFFAA64104ABAFD", hash_generated_method = "80EFC21E6DFEF78CFA9239D83E9FD331")
    public NullPointerException() {
    }

    /**
     * Constructs a new {@code NullPointerException} with the current stack
     * trace and the specified detail message.
     *
     * @param detailMessage
     *            the detail message for this exception.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:21.681 -0500", hash_original_method = "35797291F30B5B7A43FB2D60560B242A", hash_generated_method = "78912F16292951A1E7095CD677974DCC")
    public NullPointerException(String detailMessage) {
        super(detailMessage);
    }
}

