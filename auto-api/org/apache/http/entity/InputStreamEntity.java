package org.apache.http.entity;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEntity extends AbstractHttpEntity {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:15.923 -0400", hash_original_field = "9A0364B9E99BB480DD25E1F0284C8555", hash_generated_field = "E10265C22C3282384A3FF9B20A322BFE")

    private InputStream content;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:15.923 -0400", hash_original_field = "2FA47F7C65FEC19CC163B195725E3844", hash_generated_field = "C62D106264E132930C7955708C9A9CDD")

    private long length;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:15.923 -0400", hash_original_field = "56ABCB31D60DF0EE33CD31B673E135E7", hash_generated_field = "7CAB7C0CCDF9ABBB1D6144ACE3ECB9F8")

    private boolean consumed = false;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:15.930 -0400", hash_original_method = "9ECB63D0474F50482B9F88A6526A3761", hash_generated_method = "D8071E8644AF2D53D625A1C593BCBAFF")
    public  InputStreamEntity(final InputStream instream, long length) {
        super();
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Source input stream may not be null");
        } //End block
        this.content = instream;
        this.length = length;
        // ---------- Original Method ----------
        //if (instream == null) {
            //throw new IllegalArgumentException("Source input stream may not be null");
        //}
        //this.content = instream;
        //this.length = length;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:15.933 -0400", hash_original_method = "731D88F5D8865617BA362DCED4C30896", hash_generated_method = "66F544C39776A0591C272EF59EDB5919")
    public boolean isRepeatable() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1526000945 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1526000945;
        // ---------- Original Method ----------
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:15.933 -0400", hash_original_method = "120309BFFDD6935F8B30886147626A04", hash_generated_method = "107C2E308B9D22D0704CB94AB579F448")
    public long getContentLength() {
        long var0F5264038205EDFB1AC05FBB0E8C5E94_763179704 = getTaintLong();
        return var0F5264038205EDFB1AC05FBB0E8C5E94_763179704;
        // ---------- Original Method ----------
        //return this.length;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:15.934 -0400", hash_original_method = "ED2F9B5D6194544F22CDAF63FF5B39F6", hash_generated_method = "8FC20ED53DD7DD324B6BC6E4F41A604F")
    public InputStream getContent() throws IOException {
        InputStream varB4EAC82CA7396A68D541C85D26508E83_1424360279 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1424360279 = this.content;
        varB4EAC82CA7396A68D541C85D26508E83_1424360279.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1424360279;
        // ---------- Original Method ----------
        //return this.content;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:15.949 -0400", hash_original_method = "094DB6B8612142F129E3320AF13B6EB0", hash_generated_method = "753FCEC4ED3375250AED74F36B076510")
    public void writeTo(final OutputStream outstream) throws IOException {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Output stream may not be null");
        } //End block
        InputStream instream;
        instream = this.content;
        byte[] buffer;
        buffer = new byte[BUFFER_SIZE];
        int l;
        {
            {
                boolean var20A239439BFC45885A38ACB5E9FF40DA_545300203 = ((l = instream.read(buffer)) != -1);
                {
                    outstream.write(buffer, 0, l);
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            long remaining;
            remaining = this.length;
            {
                l = instream.read(buffer, 0, (int)Math.min(BUFFER_SIZE, remaining));
                outstream.write(buffer, 0, l);
                remaining -= l;
            } //End block
        } //End block
        this.consumed = true;
        addTaint(outstream.getTaint());
        // ---------- Original Method ----------
        //if (outstream == null) {
            //throw new IllegalArgumentException("Output stream may not be null");
        //}
        //InputStream instream = this.content;
        //byte[] buffer = new byte[BUFFER_SIZE];
        //int l;
        //if (this.length < 0) {
            //while ((l = instream.read(buffer)) != -1) {
                //outstream.write(buffer, 0, l);
            //}
        //} else {
            //long remaining = this.length;
            //while (remaining > 0) {
                //l = instream.read(buffer, 0, (int)Math.min(BUFFER_SIZE, remaining));
                //if (l == -1) {
                    //break;
                //}
                //outstream.write(buffer, 0, l);
                //remaining -= l;
            //}
        //}
        //this.consumed = true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:15.949 -0400", hash_original_method = "3E82383C0A86BE67DCD75D0F1508916B", hash_generated_method = "664685581947DD153156105A4894AC4C")
    public boolean isStreaming() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_113192157 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_113192157;
        // ---------- Original Method ----------
        //return !this.consumed;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:15.949 -0400", hash_original_method = "1B9AD287611C066C29846341DA0AFC9D", hash_generated_method = "BB7A77B851C987DED184DD1B2AE91934")
    public void consumeContent() throws IOException {
        this.consumed = true;
        this.content.close();
        // ---------- Original Method ----------
        //this.consumed = true;
        //this.content.close();
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:15.949 -0400", hash_original_field = "D4808A3FE7592153FBF8721DE2EDDCBC", hash_generated_field = "C3C5E694D870BDC8ED228168ED2566CC")

    private static int BUFFER_SIZE = 2048;
}

