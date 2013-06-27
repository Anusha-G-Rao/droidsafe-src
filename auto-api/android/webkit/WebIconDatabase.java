package android.webkit;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.provider.Browser;
import android.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.Vector;

public final class WebIconDatabase {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.755 -0400", hash_original_field = "FD607A408617F0526DD1616AA88B403D", hash_generated_field = "00A17466879DDA676F4AD092B7751870")

    private EventHandler mEventHandler = new EventHandler();
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.765 -0400", hash_original_method = "D97F7EFB28FBFEC67D724170FB0509C5", hash_generated_method = "282A0D53C15427A619DE121EA3CBF850")
    private  WebIconDatabase() {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.779 -0400", hash_original_method = "3087EA5DA62EA4F11A4DE20CD6A73D07", hash_generated_method = "3AB22C66B79BC9C951F4B502F50F8E6C")
    public void open(String path) {
        {
            File db;
            db = new File(path);
            {
                boolean varB622938D402E011904848985C78EB22E_402999737 = (!db.exists());
                {
                    db.mkdirs();
                } //End block
            } //End collapsed parenthetic
            mEventHandler.postMessage(
                    Message.obtain(null, EventHandler.OPEN, db.getAbsolutePath()));
        } //End block
        addTaint(path.getTaint());
        // ---------- Original Method ----------
        //if (path != null) {
            //File db = new File(path);
            //if (!db.exists()) {
                //db.mkdirs();
            //}
            //mEventHandler.postMessage(
                    //Message.obtain(null, EventHandler.OPEN, db.getAbsolutePath()));
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.780 -0400", hash_original_method = "331AABE14B3E5742E4C5E7CDDA5A9C2E", hash_generated_method = "A4D270AD90EEAE71E57F3A5DC98F2FC3")
    public void close() {
        mEventHandler.postMessage(
                Message.obtain(null, EventHandler.CLOSE));
        // ---------- Original Method ----------
        //mEventHandler.postMessage(
                //Message.obtain(null, EventHandler.CLOSE));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.780 -0400", hash_original_method = "A85BFB776007018F103CC92C345AF37F", hash_generated_method = "7BDEB7DCE0A1FAA95EC131AE3AF5AB03")
    public void removeAllIcons() {
        mEventHandler.postMessage(
                Message.obtain(null, EventHandler.REMOVE_ALL));
        // ---------- Original Method ----------
        //mEventHandler.postMessage(
                //Message.obtain(null, EventHandler.REMOVE_ALL));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.780 -0400", hash_original_method = "794C674767A8A815CC73A4F95B03095B", hash_generated_method = "41EDC090B0AFC324665D0343BFACB4D7")
    public void requestIconForPageUrl(String url, IconListener listener) {
        Message msg;
        msg = Message.obtain(null, EventHandler.REQUEST_ICON, listener);
        msg.getData().putString("url", url);
        mEventHandler.postMessage(msg);
        addTaint(url.getTaint());
        addTaint(listener.getTaint());
        // ---------- Original Method ----------
        //if (listener == null || url == null) {
            //return;
        //}
        //Message msg = Message.obtain(null, EventHandler.REQUEST_ICON, listener);
        //msg.getData().putString("url", url);
        //mEventHandler.postMessage(msg);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.781 -0400", hash_original_method = "7ACE864BB2DE1EE9743E78ECD884C38E", hash_generated_method = "5911CFB56A91BF84E2EABFA36D67B21D")
    public void bulkRequestIconForPageUrl(ContentResolver cr, String where,
            IconListener listener) {
        {
            boolean var46D479A9F8E9FE39318F478CD5FAD643_1370429878 = (mEventHandler.hasHandler());
            {
                HashMap<String, Object> map;
                map = new HashMap<String, Object>();
                map.put("contentResolver", cr);
                map.put("where", where);
                map.put("listener", listener);
                Message msg;
                msg = Message.obtain(null, EventHandler.BULK_REQUEST_ICON, map);
                mEventHandler.postMessage(msg);
            } //End block
        } //End collapsed parenthetic
        addTaint(cr.getTaint());
        addTaint(where.getTaint());
        addTaint(listener.getTaint());
        // ---------- Original Method ----------
        //if (listener == null) {
            //return;
        //}
        //if (mEventHandler.hasHandler()) {
            //HashMap<String, Object> map = new HashMap<String, Object>();
            //map.put("contentResolver", cr);
            //map.put("where", where);
            //map.put("listener", listener);
            //Message msg =
                    //Message.obtain(null, EventHandler.BULK_REQUEST_ICON, map);
            //mEventHandler.postMessage(msg);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.781 -0400", hash_original_method = "4FB0334B2FC007108F7A611624721C63", hash_generated_method = "CB6A83006639F905EF822ABC21EE6B82")
    public void retainIconForPageUrl(String url) {
        {
            mEventHandler.postMessage(
                    Message.obtain(null, EventHandler.RETAIN_ICON, url));
        } //End block
        addTaint(url.getTaint());
        // ---------- Original Method ----------
        //if (url != null) {
            //mEventHandler.postMessage(
                    //Message.obtain(null, EventHandler.RETAIN_ICON, url));
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.782 -0400", hash_original_method = "742C1A356F3DFC35D629978FF2508090", hash_generated_method = "E3B1A3A01423C337B01064C1A4D145AB")
    public void releaseIconForPageUrl(String url) {
        {
            mEventHandler.postMessage(
                    Message.obtain(null, EventHandler.RELEASE_ICON, url));
        } //End block
        addTaint(url.getTaint());
        // ---------- Original Method ----------
        //if (url != null) {
            //mEventHandler.postMessage(
                    //Message.obtain(null, EventHandler.RELEASE_ICON, url));
        //}
    }

    
        public static WebIconDatabase getInstance() {
        if (sIconDatabase == null) {
            sIconDatabase = new WebIconDatabase();
        }
        return sIconDatabase;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.791 -0400", hash_original_method = "B1AD2CC25FCD72FA4E655F2F00EE9B34", hash_generated_method = "C9CAC81B44791934BB05AC045BCDD274")
     void createHandler() {
        mEventHandler.createHandler();
        // ---------- Original Method ----------
        //mEventHandler.createHandler();
    }

    
        private static void nativeOpen(String path) {
    }

    
        private static void nativeClose() {
    }

    
        private static void nativeRemoveAllIcons() {
    }

    
        private static Bitmap nativeIconForPageUrl(String url) {
        //DSFIXME:  CODE0012: Native static method requires manual modeling
    }

    
        private static void nativeRetainIconForPageUrl(String url) {
    }

    
        private static void nativeReleaseIconForPageUrl(String url) {
    }

    
    private static class EventHandler extends Handler {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.806 -0400", hash_original_field = "C78BEDFC523DB73DF63EFB071AF1C35B", hash_generated_field = "03E47BA0CE42772601F0A13D178B12B5")

        private Handler mHandler;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.806 -0400", hash_original_field = "ED45FF5D313A78F9E6C93B2590E118DE", hash_generated_field = "9B89FFC17BC75E97744A4692FA4B431D")

        private Vector<Message> mMessages = new Vector<Message>();
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.806 -0400", hash_original_method = "FFA7F4A8F990D2647EE1D5FBAEBEF779", hash_generated_method = "FFA7F4A8F990D2647EE1D5FBAEBEF779")
        public EventHandler ()
        {
            //Synthesized constructor
        }


        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.806 -0400", hash_original_method = "933A9372A0E78DFEA9569EC4FAF2FF2F", hash_generated_method = "024450BAD6A97B45D6A3096E3B694518")
        @Override
        public void handleMessage(Message msg) {
            //Begin case ICON_RESULT 
            ((IconResult) msg.obj).dispatch();
            //End case ICON_RESULT 
            addTaint(msg.getTaint());
            // ---------- Original Method ----------
            //switch (msg.what) {
                //case ICON_RESULT:
                    //((IconResult) msg.obj).dispatch();
                    //break;
            //}
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.813 -0400", hash_original_method = "93C53855D8E83D18C38BE52A1D7D3DDC", hash_generated_method = "2B5D9B2C23FB1F23D630B802FA6735C9")
        private synchronized void createHandler() {
            {
                mHandler = new Handler() {                    
                    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.812 -0400", hash_original_method = "3C22CFB4454B8CCB86512982F7DADD26", hash_generated_method = "3BE19EEE75DAA48B44FF5F8665B75B56")
                    @Override
                    public void handleMessage(Message msg) {
                        //Begin case OPEN 
                        nativeOpen((String) msg.obj);
                        //End case OPEN 
                        //Begin case CLOSE 
                        nativeClose();
                        //End case CLOSE 
                        //Begin case REMOVE_ALL 
                        nativeRemoveAllIcons();
                        //End case REMOVE_ALL 
                        //Begin case REQUEST_ICON 
                        IconListener l;
                        l = (IconListener) msg.obj;
                        //End case REQUEST_ICON 
                        //Begin case REQUEST_ICON 
                        String url;
                        url = msg.getData().getString("url");
                        //End case REQUEST_ICON 
                        //Begin case REQUEST_ICON 
                        requestIconAndSendResult(url, l);
                        //End case REQUEST_ICON 
                        //Begin case BULK_REQUEST_ICON 
                        bulkRequestIcons(msg);
                        //End case BULK_REQUEST_ICON 
                        //Begin case RETAIN_ICON 
                        nativeRetainIconForPageUrl((String) msg.obj);
                        //End case RETAIN_ICON 
                        //Begin case RELEASE_ICON 
                        nativeReleaseIconForPageUrl((String) msg.obj);
                        //End case RELEASE_ICON 
                        addTaint(msg.getTaint());
                        // ---------- Original Method ----------
                        // Original Method Too Long, Refer to Original Implementation
                    }
};
                {
                    int size;
                    size = mMessages.size();
                    {
                        mHandler.sendMessage(mMessages.remove(0));
                    } //End block
                } //End collapsed parenthetic
                mMessages = null;
            } //End block
            // ---------- Original Method ----------
            // Original Method Too Long, Refer to Original Implementation
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.820 -0400", hash_original_method = "9D0DE68A4BFD007DC242C5FC5FA57FA9", hash_generated_method = "0277CE7CB15A7E1E7D6E8F924EB79C38")
        private synchronized boolean hasHandler() {
            boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_562157327 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_562157327;
            // ---------- Original Method ----------
            //return mHandler != null;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.820 -0400", hash_original_method = "4B2498A7504C7636E794F105FA929903", hash_generated_method = "EC1942C222D230CADE8FBD413B6677C1")
        private synchronized void postMessage(Message msg) {
            {
                mMessages.add(msg);
            } //End block
            {
                mHandler.sendMessage(msg);
            } //End block
            addTaint(msg.getTaint());
            // ---------- Original Method ----------
            //if (mMessages != null) {
                //mMessages.add(msg);
            //} else {
                //mHandler.sendMessage(msg);
            //}
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.821 -0400", hash_original_method = "14DAA8F1389B41CD064DE9C446247235", hash_generated_method = "B39EC606847BA8273B6010C2A56D4D94")
        private void bulkRequestIcons(Message msg) {
            HashMap map;
            map = (HashMap) msg.obj;
            IconListener listener;
            listener = (IconListener) map.get("listener");
            ContentResolver cr;
            cr = (ContentResolver) map.get("contentResolver");
            String where;
            where = (String) map.get("where");
            Cursor c;
            c = null;
            try 
            {
                c = cr.query(
                        Browser.BOOKMARKS_URI,
                        new String[] { Browser.BookmarkColumns.URL },
                        where, null, null);
                {
                    boolean varED44997391BF703F93FF8714A8F8E209_653095468 = (c.moveToFirst());
                    {
                        {
                            String url;
                            url = c.getString(0);
                            requestIconAndSendResult(url, listener);
                        } //End block
                        {
                            boolean varC617FF8D7663D3FF178F4C9831B26157_1717143617 = (c.moveToNext());
                        } //End collapsed parenthetic
                    } //End block
                } //End collapsed parenthetic
            } //End block
            catch (IllegalStateException e)
            { }
            finally 
            {
                c.close();
            } //End block
            addTaint(msg.getTaint());
            // ---------- Original Method ----------
            // Original Method Too Long, Refer to Original Implementation
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.850 -0400", hash_original_method = "FD70C30826AD390D3E7262DECFBF2A75", hash_generated_method = "232EB3B29E06FEF1D4876693A43028E4")
        private void requestIconAndSendResult(String url, IconListener listener) {
            Bitmap icon;
            icon = nativeIconForPageUrl(url);
            {
                sendMessage(obtainMessage(ICON_RESULT,
                            new IconResult(url, icon, listener)));
            } //End block
            addTaint(url.getTaint());
            addTaint(listener.getTaint());
            // ---------- Original Method ----------
            //Bitmap icon = nativeIconForPageUrl(url);
            //if (icon != null) {
                //sendMessage(obtainMessage(ICON_RESULT,
                            //new IconResult(url, icon, listener)));
            //}
        }

        
        private class IconResult {
            @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.850 -0400", hash_original_field = "8299C83E9CFFA2EF5909444648349221", hash_generated_field = "9C2E85EC79E8F8349BF2E81BA4AC7991")

            private String mUrl;
            @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.850 -0400", hash_original_field = "1A265556E59DF15CAEC4E55FB61E68C7", hash_generated_field = "817E9CCF7085AADAC424D9C5A9C974DC")

            private Bitmap mIcon;
            @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.850 -0400", hash_original_field = "9B3DD33B99719CE65C53FA6749E2AD69", hash_generated_field = "5923DC2A4A9F5F2A44874626DE94545F")

            private IconListener mListener;
            
            @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.850 -0400", hash_original_method = "88D8D1712732D1C320641A492AB35980", hash_generated_method = "02AF325532F14A0DBED7958BA93541CF")
              IconResult(String url, Bitmap icon, IconListener l) {
                mUrl = url;
                mIcon = icon;
                mListener = l;
                // ---------- Original Method ----------
                //mUrl = url;
                //mIcon = icon;
                //mListener = l;
            }

            
            @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.851 -0400", hash_original_method = "0BD69C5EE78EDD047C8FC1E711DA2EA8", hash_generated_method = "37E27E327CE1FC5B9184E444CD4F387F")
             void dispatch() {
                mListener.onReceivedIcon(mUrl, mIcon);
                // ---------- Original Method ----------
                //mListener.onReceivedIcon(mUrl, mIcon);
            }

            
        }


        
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.851 -0400", hash_original_field = "43717087C14CDCDCFDB18BD5D73ABF14", hash_generated_field = "FA2601CBDDBCF7012A56ECA557088F09")

        static int OPEN = 0;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.851 -0400", hash_original_field = "18310FC3CD7070BE891619B822283AE9", hash_generated_field = "03DCA87D2516B8CAD943934FEFD3645D")

        static int CLOSE = 1;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.851 -0400", hash_original_field = "21B244C6846C6ADF33D927F052761C6E", hash_generated_field = "D483B253ECC7EC3722C1ABFD9D301763")

        static int REMOVE_ALL = 2;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.851 -0400", hash_original_field = "537C6DB203C5D8D84ADD60B22C45CC1A", hash_generated_field = "93916869D6F243A576659861814C98ED")

        static int REQUEST_ICON = 3;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.851 -0400", hash_original_field = "B7004FBC13FA77F75E28084C88B3C052", hash_generated_field = "B749CB1EA8C581AB1BF39992BAFD6F38")

        static int RETAIN_ICON = 4;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.851 -0400", hash_original_field = "A965153BA664276AC54748DB21E81458", hash_generated_field = "DE0CF17A11BA1129925990891D576A48")

        static int RELEASE_ICON = 5;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.851 -0400", hash_original_field = "97DDCAE8EE3CF6051295DDB51D779E89", hash_generated_field = "9808B5A8E5C0341EC926F557FA3FB564")

        static int BULK_REQUEST_ICON = 6;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.851 -0400", hash_original_field = "56556CDDF4E8A1A0524A2C00FD227265", hash_generated_field = "47C20139DD5648455137C33367B904F2")

        private static int ICON_RESULT = 10;
    }


    
    public interface IconListener {
        
        public void onReceivedIcon(String url, Bitmap icon);
    }
    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.851 -0400", hash_original_field = "8357A9E0412FA3D1716757D2F1D5F1BA", hash_generated_field = "6847764DACAFCD2E18567D81D1852BB0")

    private static String LOGTAG = "WebIconDatabase";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.851 -0400", hash_original_field = "02465D8C3B346AC5C8E8CC44424AAA09", hash_generated_field = "30A3B2F719758B961B07CE52D4048FB9")

    private static WebIconDatabase sIconDatabase;
}

