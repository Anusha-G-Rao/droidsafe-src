package org.apache.commons.io.filefilter;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.File;
import java.io.Serializable;

public class EmptyFileFilter extends AbstractFileFilter implements Serializable {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:07.590 -0400", hash_original_method = "9BC06F7377A0DB1FDB0822C77016180F", hash_generated_method = "CAF64C1342A07523AB0B5028C89CFCBF")
    protected  EmptyFileFilter() {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:07.597 -0400", hash_original_method = "5C49B996D079DB6527DA00AF822DC40F", hash_generated_method = "632354132B0E49FEED6AD5B30FF6E975")
    @Override
    public boolean accept(File file) {
        {
            boolean varB4EF7A82C29897D1EBAB65E15CCB5408_1462644097 = (file.isDirectory());
            {
                File[] files;
                files = file.listFiles();
            } //End block
            {
                boolean varECB59558C6A213402F507D042ABC058F_571858475 = (file.length() == 0);
            } //End block
        } //End collapsed parenthetic
        addTaint(file.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1834345472 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1834345472;
        // ---------- Original Method ----------
        //if (file.isDirectory()) {
            //File[] files = file.listFiles();
            //return files == null || files.length == 0;
        //} else {
            //return file.length() == 0;
        //}
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:07.601 -0400", hash_original_field = "867852AC1C645F00F57DEF9EE7ED2AC0", hash_generated_field = "F29DC327EE24EE9447F5DFA9FF269BB1")

    public static final IOFileFilter EMPTY = new EmptyFileFilter();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:07.601 -0400", hash_original_field = "2C6D86F50191C1E3FA8F50607BAA4C6C", hash_generated_field = "2EEDE478EC7A9AD9630A131280F6556D")

    public static final IOFileFilter NOT_EMPTY = new NotFileFilter(EMPTY);
}

