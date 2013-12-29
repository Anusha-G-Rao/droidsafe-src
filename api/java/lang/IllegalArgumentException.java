package java.lang;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;





public class IllegalArgumentException extends RuntimeException {
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:27.444 -0500", hash_original_field = "8DEEE63FE04A48E614A2AE98B906C1D0", hash_generated_field = "A3B01955C80211826C1EDBC7C3F56AAA")


    private static final long serialVersionUID = -5365630128856068164L;

    /**
     * Constructs a new {@code IllegalArgumentException} that includes the
     * current stack trace.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:27.445 -0500", hash_original_method = "BA7A8F41F569FABF17AACC9F2A0F75BC", hash_generated_method = "108225E116CCD19305134C87B93E06AB")
    public IllegalArgumentException() {
    }

    /**
     * Constructs a new {@code IllegalArgumentException} with the current stack
     * trace and the specified detail message.
     *
     * @param detailMessage
     *            the detail message for this exception.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:27.446 -0500", hash_original_method = "D7D337F40643B35AC799AE8640B0B8F6", hash_generated_method = "9562BB172BC5C2EDC30D6E00CCDF876E")
    public IllegalArgumentException(String detailMessage) {
        super(detailMessage);
    }

    /**
     * Constructs a new {@code IllegalArgumentException} with the current stack
     * trace, the specified detail message and the specified cause.
     *
     * @param message
     *            the detail message for this exception.
     * @param cause
     *            the cause of this exception, may be {@code null}.
     * @since 1.5
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:27.447 -0500", hash_original_method = "7E098EA3EF50B45CC4772F0CD835FBB7", hash_generated_method = "B91024B75E52AFAC1BF8C2E01D1C72EE")
    public IllegalArgumentException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs a new {@code IllegalArgumentException} with the current stack
     * trace and the specified cause.
     *
     * @param cause
     *            the cause of this exception, may be {@code null}.
     * @since 1.5
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:27.448 -0500", hash_original_method = "F1590E7EC4D7642CCEBCDC7875206A8D", hash_generated_method = "617ADCCDB708FBFF48044B80AD1463C6")
    public IllegalArgumentException(Throwable cause) {
        super((cause == null ? null : cause.toString()), cause);
    }
}

