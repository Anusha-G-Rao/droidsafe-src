package java.util.logging;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;





public class ErrorManager {
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:50.680 -0500", hash_original_field = "35CD5F8D561784239532240E5C5966F0", hash_generated_field = "464AF05E9A04A362279DE255D6605961")

    public static final int GENERIC_FAILURE = 0;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:50.681 -0500", hash_original_field = "EFD477C97B035581B2C8ED49EA5DACD1", hash_generated_field = "F22CE731DA3FD6989075E327EBB7330E")

    public static final int WRITE_FAILURE = 1;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:50.682 -0500", hash_original_field = "97DE3D0B4628C22254D7693932E1E1CD", hash_generated_field = "EF0BDEF760F9D938BB7D5F653F1FE2A6")

    public static final int FLUSH_FAILURE = 2;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:50.683 -0500", hash_original_field = "A4D712D7A2345815E55CF21ECF9DE7E9", hash_generated_field = "4215BE491DE9753FD343B62B11D1C557")

    public static final int CLOSE_FAILURE = 3;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:50.684 -0500", hash_original_field = "0A8C3508FCA552ED187FE4DF6FFAB61A", hash_generated_field = "04A4D244CC1991C29A7BD7797236C553")

    public static final int OPEN_FAILURE = 4;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:50.684 -0500", hash_original_field = "1B3D78800309AB16484D14B3357BAC65", hash_generated_field = "D833583B3DBBAB508B3949722BE36E0B")

    public static final int FORMAT_FAILURE = 5;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:50.685 -0500", hash_original_field = "3D976F439DDFB7F9AA241E551BD86E48", hash_generated_field = "BD39D7396A9D2741C80F65787B65559D")


    private static final String[] FAILURES = new String[] { "GENERIC_FAILURE",
            "WRITE_FAILURE", "FLUSH_FAILURE", "CLOSE_FAILURE", "OPEN_FAILURE",
            "FORMAT_FAILURE" };
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:50.686 -0500", hash_original_field = "2E6DB9E5E0D82DBA3BAFA17E40C3F5D7", hash_generated_field = "73DCA3E62AD96D31516E07B7942B98AB")

    private boolean called;

    /**
     * Constructs an instance of {@code ErrorManager}.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:50.687 -0500", hash_original_method = "F8543B5AF6CB4B42529104ECFDE08620", hash_generated_method = "96B5B411CA1BF127B60F4230FA78D871")
    public ErrorManager() {
    }

    /**
     * Reports an error using the given message, exception and error code. This
     * implementation will write out the message to {@link System#err} on the
     * first call and all subsequent calls are ignored. A subclass of this class
     * should override this method.
     *
     * @param message
     *            the error message, which may be {@code null}.
     * @param exception
     *            the exception associated with the error, which may be
     *            {@code null}.
     * @param errorCode
     *            the error code that identifies the type of error; see the
     *            constant fields of this class for possible values.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:50.688 -0500", hash_original_method = "88D78C1D6CF19D14D0670D7F86679469", hash_generated_method = "F54423ABBD0AAE2A1F5070C3B34E3A67")
    public void error(String message, Exception exception, int errorCode) {
        synchronized (this) {
            if (called) {
                return;
            }
            called = true;
        }
        System.err.println(this.getClass().getName() + ": " + FAILURES[errorCode]);
        if (message != null) {
            System.err.println("Error message - " + message);
        }
        if (exception != null) {
            System.err.println("Exception - " + exception);
        }
    }
}

