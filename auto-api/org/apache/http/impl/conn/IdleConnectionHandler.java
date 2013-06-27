package org.apache.http.impl.conn;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpConnection;

public class IdleConnectionHandler {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:16.810 -0400", hash_original_field = "0B7469F2850D918A96D1C36E99B23F5C", hash_generated_field = "4E4E630304492253CB8147CAE1C7D2A5")

    private Log log = LogFactory.getLog(getClass());
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:16.810 -0400", hash_original_field = "11259197E9F2FD0337F26EC48EBACD5D", hash_generated_field = "2F5EF38A07EA6A9636288F530673294A")

    private Map<HttpConnection,TimeValues> connectionToTimes;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:16.810 -0400", hash_original_method = "3E916BA1101D3583C84AA90CF4FC67D4", hash_generated_method = "4BD14E84E6BEF8BC711F8ACA39C0C62B")
    public  IdleConnectionHandler() {
        super();
        connectionToTimes = new HashMap<HttpConnection,TimeValues>();
        // ---------- Original Method ----------
        //connectionToTimes = new HashMap<HttpConnection,TimeValues>();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:16.811 -0400", hash_original_method = "3D4804DC68DE62BE888340914D1164A1", hash_generated_method = "62118BBD412715FE988B3E70EE3133DE")
    public void add(HttpConnection connection, long validDuration, TimeUnit unit) {
        Long timeAdded;
        timeAdded = Long.valueOf(System.currentTimeMillis());
        {
            boolean var983CD6AA124987301747A815A5742497_2098269561 = (log.isDebugEnabled());
            {
                log.debug("Adding connection at: " + timeAdded);
            } //End block
        } //End collapsed parenthetic
        connectionToTimes.put(connection, new TimeValues(timeAdded, validDuration, unit));
        addTaint(connection.getTaint());
        addTaint(validDuration);
        addTaint(unit.getTaint());
        // ---------- Original Method ----------
        //Long timeAdded = Long.valueOf(System.currentTimeMillis());
        //if (log.isDebugEnabled()) {
            //log.debug("Adding connection at: " + timeAdded);
        //}
        //connectionToTimes.put(connection, new TimeValues(timeAdded, validDuration, unit));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:16.811 -0400", hash_original_method = "1D31D4C3FCFC5F71DF82BB85794AF70A", hash_generated_method = "F647F5777CD90BB600E1E377E4942092")
    public boolean remove(HttpConnection connection) {
        TimeValues times;
        times = connectionToTimes.remove(connection);
        {
            log.warn("Removing a connection that never existed!");
        } //End block
        {
            boolean var68ABEAB36C37B2208D81C31C56B2390C_1358642693 = (System.currentTimeMillis() <= times.timeExpires);
        } //End block
        addTaint(connection.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2144922039 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2144922039;
        // ---------- Original Method ----------
        //TimeValues times = connectionToTimes.remove(connection);
        //if(times == null) {
            //log.warn("Removing a connection that never existed!");
            //return true;
        //} else {
            //return System.currentTimeMillis() <= times.timeExpires;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:16.812 -0400", hash_original_method = "7AF66332DEC016DA2AA9D0945D3022F8", hash_generated_method = "A48EFFE9E0FDB5EF17F54AE30B159084")
    public void removeAll() {
        this.connectionToTimes.clear();
        // ---------- Original Method ----------
        //this.connectionToTimes.clear();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:16.812 -0400", hash_original_method = "1B5843932F53A941705DBD73966AF816", hash_generated_method = "45AD313A0EB966815D5D80227F01230E")
    public void closeIdleConnections(long idleTime) {
        long idleTimeout;
        idleTimeout = System.currentTimeMillis() - idleTime;
        {
            boolean var983CD6AA124987301747A815A5742497_1017566162 = (log.isDebugEnabled());
            {
                log.debug("Checking for connections, idleTimeout: "  + idleTimeout);
            } //End block
        } //End collapsed parenthetic
        Iterator<HttpConnection> connectionIter;
        connectionIter = connectionToTimes.keySet().iterator();
        {
            boolean var7D1D4944B83B2A9376B72A2F65A81964_1337337358 = (connectionIter.hasNext());
            {
                HttpConnection conn;
                conn = connectionIter.next();
                TimeValues times;
                times = connectionToTimes.get(conn);
                Long connectionTime;
                connectionTime = times.timeAdded;
                {
                    boolean varFCAEEA5D7EBBB7E6CDA1ECDBD815823B_1242872333 = (connectionTime.longValue() <= idleTimeout);
                    {
                        {
                            boolean varF1685CB26B0999B3A47E854C01691B8F_1569644234 = (log.isDebugEnabled());
                            {
                                log.debug("Closing connection, connection time: "  + connectionTime);
                            } //End block
                        } //End collapsed parenthetic
                        connectionIter.remove();
                        try 
                        {
                            conn.close();
                        } //End block
                        catch (IOException ex)
                        {
                            log.debug("I/O error closing connection", ex);
                        } //End block
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        addTaint(idleTime);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:16.813 -0400", hash_original_method = "1F224929907ADC4A2755470D6C0EBC61", hash_generated_method = "A11601384121333F6B06D98D21D1043E")
    public void closeExpiredConnections() {
        long now;
        now = System.currentTimeMillis();
        {
            boolean var983CD6AA124987301747A815A5742497_1456868319 = (log.isDebugEnabled());
            {
                log.debug("Checking for expired connections, now: "  + now);
            } //End block
        } //End collapsed parenthetic
        Iterator<HttpConnection> connectionIter;
        connectionIter = connectionToTimes.keySet().iterator();
        {
            boolean var7D1D4944B83B2A9376B72A2F65A81964_1274866716 = (connectionIter.hasNext());
            {
                HttpConnection conn;
                conn = connectionIter.next();
                TimeValues times;
                times = connectionToTimes.get(conn);
                {
                    {
                        boolean varB5EA13E236059479AA556C9226E19405_767533673 = (log.isDebugEnabled());
                        {
                            log.debug("Closing connection, expired @: "  + times.timeExpires);
                        } //End block
                    } //End collapsed parenthetic
                    connectionIter.remove();
                    try 
                    {
                        conn.close();
                    } //End block
                    catch (IOException ex)
                    {
                        log.debug("I/O error closing connection", ex);
                    } //End block
                } //End block
            } //End block
        } //End collapsed parenthetic
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    private static class TimeValues {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:16.813 -0400", hash_original_field = "C5898A47DA208DD0939DA04CEF31DFE3", hash_generated_field = "40BAAF0C7A31F5A05875046903303AFA")

        private long timeAdded;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:16.823 -0400", hash_original_field = "77B76A602562FEAEE08C9740658298D5", hash_generated_field = "AB9F405E92086F3B1BDE350A1E939FA3")

        private long timeExpires;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:39:16.825 -0400", hash_original_method = "3DD4099178F08AFF793AFE03575649DF", hash_generated_method = "6069AA5BA7FAAA825555B6B23E0EA559")
          TimeValues(long now, long validDuration, TimeUnit validUnit) {
            this.timeAdded = now;
            {
                this.timeExpires = now + validUnit.toMillis(validDuration);
            } //End block
            {
                this.timeExpires = Long.MAX_VALUE;
            } //End block
            // ---------- Original Method ----------
            //this.timeAdded = now;
            //if(validDuration > 0) {
                //this.timeExpires = now + validUnit.toMillis(validDuration);
            //} else {
                //this.timeExpires = Long.MAX_VALUE;
            //}
        }

        
    }


    
}

