package java.nio.channels;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import java.io.Closeable;
import java.io.IOException;

public interface Channel extends Closeable {

    
    public boolean isOpen();

    
    public void close() throws IOException;
}
