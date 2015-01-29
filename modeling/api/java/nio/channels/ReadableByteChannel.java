package java.nio.channels;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import java.io.IOException;
import java.nio.ByteBuffer;

public interface ReadableByteChannel extends Channel {
    
    @DSComment("Abstract Method")
    @DSSpec(DSCat.IO)
    @DSSource({DSSourceKind.IO})
    public int read(ByteBuffer buffer) throws IOException;
}