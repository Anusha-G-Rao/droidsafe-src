package android.database;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.File;
import java.util.List;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;

public final class DefaultDatabaseErrorHandler implements DatabaseErrorHandler {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:11.004 -0400", hash_original_method = "896C9D78E64EAD9D50DC29D09D68C65A", hash_generated_method = "896C9D78E64EAD9D50DC29D09D68C65A")
    public DefaultDatabaseErrorHandler ()
    {
        //Synthesized constructor
    }


    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:11.196 -0400", hash_original_method = "4074EC86E696A918C28D96A3FA80513A", hash_generated_method = "8FDA2DBDB731C69ECC8283D6BB20B874")
    public void onCorruption(SQLiteDatabase dbObj) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        {
            boolean varCC82C5DB1413B99E1CCAB065EFAB5770_792425416 = (!dbObj.isOpen());
            {
                deleteDatabaseFile(dbObj.getPath());
            } //End block
        } //End collapsed parenthetic
        List<Pair<String, String>> attachedDbs;
        attachedDbs = null;
        try 
        {
            try 
            {
                attachedDbs = dbObj.getAttachedDbs();
            } //End block
            catch (SQLiteException e)
            { }
            try 
            {
                dbObj.close();
            } //End block
            catch (SQLiteException e)
            { }
        } //End block
        finally 
        {
            {
                {
                    Iterator<Pair<String, String>> varAB3CF8EE812F512696CBC54246C34449_1907900048 = (attachedDbs).iterator();
                    varAB3CF8EE812F512696CBC54246C34449_1907900048.hasNext();
                    Pair<String, String> p = varAB3CF8EE812F512696CBC54246C34449_1907900048.next();
                    {
                        deleteDatabaseFile(p.second);
                    } //End block
                } //End collapsed parenthetic
            } //End block
            {
                deleteDatabaseFile(dbObj.getPath());
            } //End block
        } //End block
        addTaint(dbObj.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:11.198 -0400", hash_original_method = "47DF5B8E2F3C355F760906ED9FB0475D", hash_generated_method = "0264B6C9B011B0CF3D89CDB3665F9866")
    private void deleteDatabaseFile(String fileName) {
        {
            boolean var8E5C270C0C0207C35D217A26023CE022_1486356717 = (fileName.equalsIgnoreCase(":memory:") || fileName.trim().length() == 0);
        } //End collapsed parenthetic
        try 
        {
            new File(fileName).delete();
        } //End block
        catch (Exception e)
        { }
        addTaint(fileName.getTaint());
        // ---------- Original Method ----------
        //if (fileName.equalsIgnoreCase(":memory:") || fileName.trim().length() == 0) {
            //return;
        //}
        //Log.e(TAG, "deleting the database file: " + fileName);
        //try {
            //new File(fileName).delete();
        //} catch (Exception e) {
            //Log.w(TAG, "delete failed: " + e.getMessage());
        //}
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:11.198 -0400", hash_original_field = "10759C745B09949ED080760414F4B85B", hash_generated_field = "3FF0D2B46B264EF96B5C422E4B041955")

    private static String TAG = "DefaultDatabaseErrorHandler";
}

