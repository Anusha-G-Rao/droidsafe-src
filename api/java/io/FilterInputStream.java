package java.io;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;



public class FilterInputStream extends InputStream {
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:32.648 -0500", hash_original_field = "0A829BC26C36EAF422E245C1EC11D5B0", hash_generated_field = "6D3D0ED73C3C0D0A9AF6A684E0D210F5")

    protected volatile InputStream in;

    /**
     * Constructs a new {@code FilterInputStream} with the specified input
     * stream as source.
     *
     * <p><strong>Warning:</strong> passing a null source creates an invalid
     * {@code FilterInputStream}, that fails on every method that is not
     * overridden. Subclasses should check for null in their constructors.
     *
     * @param in the input stream to filter reads on.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:32.649 -0500", hash_original_method = "28F38498A0B180D5BCC888F2248F3934", hash_generated_method = "D28A4C86943E8574377DFF40EEBB983E")
    protected FilterInputStream(InputStream in) {
        this.in = in;
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:32.650 -0500", hash_original_method = "0AD8415E97210126520B7235309B4152", hash_generated_method = "8E5606FF0A120193314716C29AE15BAC")
    @Override
public int available() throws IOException {
        return in.available();
    }

    /**
     * Closes this stream. This implementation closes the filtered stream.
     *
     * @throws IOException
     *             if an error occurs while closing this stream.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:32.651 -0500", hash_original_method = "8853C25F592811C3C813B7E0334D3C5F", hash_generated_method = "150283417C2E86293C532259A36378CD")
    @Override
public void close() throws IOException {
        in.close();
    }

    /**
     * Sets a mark position in this stream. The parameter {@code readlimit}
     * indicates how many bytes can be read before the mark is invalidated.
     * Sending {@code reset()} will reposition this stream back to the marked
     * position, provided that {@code readlimit} has not been surpassed.
     * <p>
     * This implementation sets a mark in the filtered stream.
     *
     * @param readlimit
     *            the number of bytes that can be read from this stream before
     *            the mark is invalidated.
     * @see #markSupported()
     * @see #reset()
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:32.652 -0500", hash_original_method = "FFAC7C303832D87EA3757F73ECC9CF0F", hash_generated_method = "97D4206E523BA3252F44669193A79E5B")
    @Override
public synchronized void mark(int readlimit) {
        in.mark(readlimit);
    }

    /**
     * Indicates whether this stream supports {@code mark()} and {@code reset()}.
     * This implementation returns whether or not the filtered stream supports
     * marking.
     *
     * @return {@code true} if {@code mark()} and {@code reset()} are supported,
     *         {@code false} otherwise.
     * @see #mark(int)
     * @see #reset()
     * @see #skip(long)
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:32.653 -0500", hash_original_method = "41BA5D3E6CD82551F6C2FAFF3850B986", hash_generated_method = "AAA0E9FA70DCC42A6EF6C686E3CCDC7E")
    @Override
public boolean markSupported() {
        return in.markSupported();
    }

    /**
     * Reads a single byte from the filtered stream and returns it as an integer
     * in the range from 0 to 255. Returns -1 if the end of this stream has been
     * reached.
     *
     * @return the byte read or -1 if the end of the filtered stream has been
     *         reached.
     * @throws IOException
     *             if the stream is closed or another IOException occurs.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:32.654 -0500", hash_original_method = "E44784058F4742ED0C6AEE646C9728C1", hash_generated_method = "6F8C3CEAFF598327D551893A3095CDD9")
    @Override
public int read() throws IOException {
        return in.read();
    }

    /**
     * Reads at most {@code count} bytes from this stream and stores them in the
     * byte array {@code buffer} starting at {@code offset}. Returns the number
     * of bytes actually read or -1 if no bytes have been read and the end of
     * this stream has been reached. This implementation reads bytes from the
     * filtered stream.
     *
     * @param buffer
     *            the byte array in which to store the bytes read.
     * @param offset
     *            the initial position in {@code buffer} to store the bytes
     *            read from this stream.
     * @param count
     *            the maximum number of bytes to store in {@code buffer}.
     * @return the number of bytes actually read or -1 if the end of the
     *         filtered stream has been reached while reading.
     * @throws IOException
     *             if this stream is closed or another I/O error occurs.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:32.654 -0500", hash_original_method = "77ABDF7CA6BAECB9E04E38AE745E4AA8", hash_generated_method = "595F6EE2F2435B28EBBB9F808779088C")
    @Override
public int read(byte[] buffer, int offset, int count) throws IOException {
        return in.read(buffer, offset, count);
    }

    /**
     * Resets this stream to the last marked location. This implementation
     * resets the target stream.
     *
     * @throws IOException
     *             if this stream is already closed, no mark has been set or the
     *             mark is no longer valid because more than {@code readlimit}
     *             bytes have been read since setting the mark.
     * @see #mark(int)
     * @see #markSupported()
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:32.655 -0500", hash_original_method = "61478AA9F56747991020142C67580FB8", hash_generated_method = "F44C74B35137AEFCC17E0B0D490721CE")
    @Override
public synchronized void reset() throws IOException {
        in.reset();
    }

    /**
     * Skips {@code byteCount} bytes in this stream. Subsequent
     * calls to {@code read} will not return these bytes unless {@code reset} is
     * used. This implementation skips {@code byteCount} bytes in the
     * filtered stream.
     *
     * @return the number of bytes actually skipped.
     * @throws IOException
     *             if this stream is closed or another IOException occurs.
     * @see #mark(int)
     * @see #reset()
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:32.656 -0500", hash_original_method = "871C50CABEA9E636393963333B4BFE2A", hash_generated_method = "41FD1968033290FD52A55E2E96D53127")
    @Override
public long skip(long byteCount) throws IOException {
        return in.skip(byteCount);
    }

    
}

