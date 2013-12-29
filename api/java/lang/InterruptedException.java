package java.lang;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;





public class InterruptedException extends Exception {
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:27.036 -0500", hash_original_field = "69871343D09570B4754661DBF739989F", hash_generated_field = "D6A522235FA0337AFC71B5905EFDB292")


    private static final long serialVersionUID = 6700697376100628473L;

    /**
     * Constructs a new {@code InterruptedException} that includes the current
     * stack trace.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:27.037 -0500", hash_original_method = "276D0C061081F968E041F3504D86F3DC", hash_generated_method = "5CE7ADEBB840028F432D53EA0FC13DBF")
    public InterruptedException() {
    }

    /**
     * Constructs a new {@code InterruptedException} with the current stack
     * trace and the specified detail message.
     *
     * @param detailMessage
     *            the detail message for this exception.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:27.038 -0500", hash_original_method = "47A24B4A9D41770C1E928AFF25C6693A", hash_generated_method = "FA9C2D418D0A1338A3E54F344EAEF76E")
    public InterruptedException(String detailMessage) {
        super(detailMessage);
    }
}

