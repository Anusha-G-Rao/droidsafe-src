package java.io;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;



public class NotSerializableException extends ObjectStreamException {
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:32.849 -0500", hash_original_field = "60837B5C1B966117A8FB2ADDBC15466F", hash_generated_field = "48F39D42996338B3D3EADC139002C622")


    private static final long serialVersionUID = 2906642554793891381L;

    /**
     * Constructs a new {@code NotSerializableException} with its stack trace
     * filled in.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:32.850 -0500", hash_original_method = "F05776C79D2C056D2A5E9037EDB03920", hash_generated_method = "8CFF896851B0FED7312E9CAEDF084484")
    public NotSerializableException() {
    }

    /**
     * Constructs a new {@link NotSerializableException} with its stack trace
     * and detail message filled in.
     *
     * @param detailMessage
     *            the detail message for this exception.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:32.851 -0500", hash_original_method = "AC41FE5CB653485B7C55102BD4EBFA1E", hash_generated_method = "F054EB24726814C2CD166590686070CF")
    public NotSerializableException(String detailMessage) {
        super(detailMessage);
    }
}

