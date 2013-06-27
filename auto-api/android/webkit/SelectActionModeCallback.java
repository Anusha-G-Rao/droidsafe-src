package android.webkit;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.provider.Browser;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

class SelectActionModeCallback implements ActionMode.Callback {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.202 -0400", hash_original_field = "72439B8F99EB438C3DA5D9CD798C6786", hash_generated_field = "99346B50377E115231263981E00655CA")

    private WebView mWebView;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.203 -0400", hash_original_field = "3B382D379664B509F22D0EB5D96F2BA8", hash_generated_field = "941205D807AC4DF9704A65BDAF4756EC")

    private ActionMode mActionMode;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.203 -0400", hash_original_method = "5762F84230A8FBDA28C52CC5E7905CF7", hash_generated_method = "5762F84230A8FBDA28C52CC5E7905CF7")
    public SelectActionModeCallback ()
    {
        //Synthesized constructor
    }


    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.222 -0400", hash_original_method = "2B5F8950C4750F957BA2CE7A16E0E578", hash_generated_method = "3E39CDF9FDEC82BE13585E703DC3AFD8")
     void setWebView(WebView webView) {
        mWebView = webView;
        // ---------- Original Method ----------
        //mWebView = webView;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.222 -0400", hash_original_method = "AEE4CA66C11C42A4DFBE3B808BED80FD", hash_generated_method = "66D929DE2C21F83A863FCAAB4BD8A719")
     void finish() {
        {
            mActionMode.finish();
        } //End block
        // ---------- Original Method ----------
        //if (mActionMode != null) {
            //mActionMode.finish();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.231 -0400", hash_original_method = "EEC72C77A82E33054EA06A487B276F43", hash_generated_method = "6A118951EF9A03263E53EB4FCF0B11CA")
    @Override
    public boolean onCreateActionMode(ActionMode mode, Menu menu) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        mode.getMenuInflater().inflate(com.android.internal.R.menu.webview_copy, menu);
        Context context;
        context = mWebView.getContext();
        boolean allowText;
        allowText = context.getResources().getBoolean(
                com.android.internal.R.bool.config_allowActionMenuItemTextWithIcon);
        mode.setTitle(allowText ?
                context.getString(com.android.internal.R.string.textSelectionCABTitle) : null);
        {
            boolean varDC330101E9FCC7E5F1AB6C44D489AA26_230533539 = (!mode.isUiFocusable());
            {
                MenuItem findOnPageItem;
                findOnPageItem = menu.findItem(com.android.internal.R.id.find);
                {
                    findOnPageItem.setVisible(false);
                } //End block
            } //End block
        } //End collapsed parenthetic
        mActionMode = mode;
        addTaint(menu.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1938861620 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1938861620;
        // ---------- Original Method ----------
        //mode.getMenuInflater().inflate(com.android.internal.R.menu.webview_copy, menu);
        //final Context context = mWebView.getContext();
        //boolean allowText = context.getResources().getBoolean(
                //com.android.internal.R.bool.config_allowActionMenuItemTextWithIcon);
        //mode.setTitle(allowText ?
                //context.getString(com.android.internal.R.string.textSelectionCABTitle) : null);
        //if (!mode.isUiFocusable()) {
            //final MenuItem findOnPageItem = menu.findItem(com.android.internal.R.id.find);
            //if (findOnPageItem != null) {
                //findOnPageItem.setVisible(false);
            //}
        //}
        //mActionMode = mode;
        //return true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.237 -0400", hash_original_method = "E3574021502A1E90BCF4C46DB1841054", hash_generated_method = "5BBC18BACF19780B801E0346AA9C6E7D")
    @Override
    public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(mode.getTaint());
        addTaint(menu.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_408106527 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_408106527;
        // ---------- Original Method ----------
        //return true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.246 -0400", hash_original_method = "D632FC0DC2F573BE68AD858FDE491D0B", hash_generated_method = "625451FF3F4AA9E2B0D3F0472431ED4D")
    @Override
    public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        {
            Object var2B22EE13B3F8EF78698CBA34390A5432_217521551 = (item.getItemId());
            //Begin case android.R.id.copy 
            mWebView.copySelection();
            //End case android.R.id.copy 
            //Begin case android.R.id.copy 
            mode.finish();
            //End case android.R.id.copy 
            //Begin case com.android.internal.R.id.share 
            String selection;
            selection = mWebView.getSelection();
            //End case com.android.internal.R.id.share 
            //Begin case com.android.internal.R.id.share 
            Browser.sendString(mWebView.getContext(), selection);
            //End case com.android.internal.R.id.share 
            //Begin case com.android.internal.R.id.share 
            mode.finish();
            //End case com.android.internal.R.id.share 
            //Begin case com.android.internal.R.id.select_all 
            mWebView.selectAll();
            //End case com.android.internal.R.id.select_all 
            //Begin case com.android.internal.R.id.find 
            String sel;
            sel = mWebView.getSelection();
            //End case com.android.internal.R.id.find 
            //Begin case com.android.internal.R.id.find 
            mode.finish();
            //End case com.android.internal.R.id.find 
            //Begin case com.android.internal.R.id.find 
            mWebView.showFindDialog(sel, false);
            //End case com.android.internal.R.id.find 
            //Begin case com.android.internal.R.id.websearch 
            mode.finish();
            //End case com.android.internal.R.id.websearch 
            //Begin case com.android.internal.R.id.websearch 
            Intent i;
            i = new Intent(Intent.ACTION_WEB_SEARCH);
            //End case com.android.internal.R.id.websearch 
            //Begin case com.android.internal.R.id.websearch 
            i.putExtra(SearchManager.EXTRA_NEW_SEARCH, true);
            //End case com.android.internal.R.id.websearch 
            //Begin case com.android.internal.R.id.websearch 
            i.putExtra(SearchManager.QUERY, mWebView.getSelection());
            //End case com.android.internal.R.id.websearch 
            //Begin case com.android.internal.R.id.websearch 
            mWebView.getContext().startActivity(i);
            //End case com.android.internal.R.id.websearch 
        } //End collapsed parenthetic
        addTaint(mode.getTaint());
        addTaint(item.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_484312817 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_484312817;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:01.247 -0400", hash_original_method = "E29E2B7D27E4F7A85592500EAD3A4CE6", hash_generated_method = "D313794DBC346D0ACB5AB5EF3194A404")
    @Override
    public void onDestroyActionMode(ActionMode mode) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        mWebView.selectionDone();
        addTaint(mode.getTaint());
        // ---------- Original Method ----------
        //mWebView.selectionDone();
    }

    
}

