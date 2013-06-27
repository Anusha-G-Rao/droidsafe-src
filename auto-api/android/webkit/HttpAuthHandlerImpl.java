package android.webkit;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.ListIterator;
import java.util.LinkedList;

class HttpAuthHandlerImpl extends HttpAuthHandler {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:00.746 -0400", hash_original_field = "92BCA70246F96A0F4366A7F1448D9E16", hash_generated_field = "E0FAA2A6C497494B58133B8740B95CC3")

    private Network mNetwork;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:00.746 -0400", hash_original_field = "0924E7DA0697C861A386D2C4A20421F8", hash_generated_field = "1DFA7AE1BD952C18E1D76D9BAFCEAA92")

    private LinkedList<LoadListener> mLoaderQueue;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:00.746 -0400", hash_original_field = "98833F887433A020D9AC475903355379", hash_generated_field = "FBA1E121D7E2FF697782F001BE51E87B")

    Object mRequestInFlightLock = new Object();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:00.746 -0400", hash_original_field = "8CD96C4C1FB9EADAE7C8DEFDA59DF052", hash_generated_field = "D45D4B46CC19E8188195D2A11D8D61D7")

    boolean mRequestInFlight;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:00.746 -0400", hash_original_field = "2FB3EB7CD104D0E14FE0487884A12591", hash_generated_field = "F6C0B2A92BAD484AE3E9DE7409D6C7A8")

    String mUsername;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:00.746 -0400", hash_original_field = "5C6B7EE711155A7472DA571800057A96", hash_generated_field = "6E680D0312272F1C50F2E99ACBEA882B")

    String mPassword;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:00.747 -0400", hash_original_method = "DD7F5BEFB1D050713E2D554BF9DDD08D", hash_generated_method = "8911D217534BAC31E2F8A0A202A6FEB6")
      HttpAuthHandlerImpl(Network network) {
        mNetwork = network;
        mLoaderQueue = new LinkedList<LoadListener>();
        // ---------- Original Method ----------
        //mNetwork = network;
        //mLoaderQueue = new LinkedList<LoadListener>();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:00.747 -0400", hash_original_method = "92EA526117BA58D828A346DC2F14E6C7", hash_generated_method = "B1C28822D44BC8B0CA35B11FD811907D")
    @Override
    public void handleMessage(Message msg) {
        LoadListener loader;
        loader = null;
        {
            loader = mLoaderQueue.poll();
        } //End block
        //Begin case AUTH_PROCEED 
        String username;
        username = msg.getData().getString("username");
        //End case AUTH_PROCEED 
        //Begin case AUTH_PROCEED 
        String password;
        password = msg.getData().getString("password");
        //End case AUTH_PROCEED 
        //Begin case AUTH_PROCEED 
        loader.handleAuthResponse(username, password);
        //End case AUTH_PROCEED 
        //Begin case AUTH_CANCEL 
        loader.handleAuthResponse(null, null);
        //End case AUTH_CANCEL 
        processNextLoader();
        addTaint(msg.getTaint());
        // ---------- Original Method ----------
        //LoadListener loader = null;
        //synchronized (mLoaderQueue) {
            //loader = mLoaderQueue.poll();
        //}
        //assert(loader.isSynchronous() == false);
        //switch (msg.what) {
            //case AUTH_PROCEED:
                //String username = msg.getData().getString("username");
                //String password = msg.getData().getString("password");
                //loader.handleAuthResponse(username, password);
                //break;
            //case AUTH_CANCEL:
                //loader.handleAuthResponse(null, null);
                //break;
        //}
        //processNextLoader();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:00.748 -0400", hash_original_method = "633BAC1354102784355BBDC241836385", hash_generated_method = "1A011F972F7FBECFC6D27682018D916C")
    private boolean handleResponseForSynchronousRequest(String username, String password) {
        LoadListener loader;
        loader = null;
        {
            loader = mLoaderQueue.peek();
        } //End block
        {
            boolean var221166D89B647BFDA3D85F45A3E4348F_591537788 = (loader.isSynchronous());
            {
                mUsername = username;
                mPassword = password;
            } //End block
        } //End collapsed parenthetic
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_730037232 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_730037232;
        // ---------- Original Method ----------
        //LoadListener loader = null;
        //synchronized (mLoaderQueue) {
            //loader = mLoaderQueue.peek();
        //}
        //if (loader.isSynchronous()) {
            //mUsername = username;
            //mPassword = password;
            //return true;
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:00.748 -0400", hash_original_method = "D0913A95E2E0984BDC30D85F1A6DD6EF", hash_generated_method = "C96FDDEB25AEAE33C868369E88FC51C0")
    private void signalRequestComplete() {
        {
            mRequestInFlight = false;
            mRequestInFlightLock.notify();
        } //End block
        // ---------- Original Method ----------
        //synchronized (mRequestInFlightLock) {
            //assert(mRequestInFlight);
            //mRequestInFlight = false;
            //mRequestInFlightLock.notify();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:00.749 -0400", hash_original_method = "3FC26787C5211E44D8B34B9447EFC8D6", hash_generated_method = "596FC1EDA92088B1212754751451F524")
    public void proceed(String username, String password) {
        {
            boolean var48EB5472B994D58361A4636BAEC97DA1_1653998228 = (handleResponseForSynchronousRequest(username, password));
            {
                signalRequestComplete();
            } //End block
        } //End collapsed parenthetic
        Message msg;
        msg = obtainMessage(AUTH_PROCEED);
        msg.getData().putString("username", username);
        msg.getData().putString("password", password);
        sendMessage(msg);
        signalRequestComplete();
        addTaint(username.getTaint());
        addTaint(password.getTaint());
        // ---------- Original Method ----------
        //if (handleResponseForSynchronousRequest(username, password)) {
            //signalRequestComplete();
            //return;
        //}
        //Message msg = obtainMessage(AUTH_PROCEED);
        //msg.getData().putString("username", username);
        //msg.getData().putString("password", password);
        //sendMessage(msg);
        //signalRequestComplete();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:00.753 -0400", hash_original_method = "1C78A3648C04874A6B02C5BA2CA8304A", hash_generated_method = "D674FDB258BEB489275CAB4A1842CE1E")
    public void cancel() {
        {
            boolean varE3A4C0A30ABB3BD770ADE223EB4A6CC1_1209431594 = (handleResponseForSynchronousRequest(null, null));
            {
                signalRequestComplete();
            } //End block
        } //End collapsed parenthetic
        sendMessage(obtainMessage(AUTH_CANCEL));
        signalRequestComplete();
        // ---------- Original Method ----------
        //if (handleResponseForSynchronousRequest(null, null)) {
            //signalRequestComplete();
            //return;
        //}
        //sendMessage(obtainMessage(AUTH_CANCEL));
        //signalRequestComplete();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:00.768 -0400", hash_original_method = "0DB7D7C368B555F88B0E01139A6FA13A", hash_generated_method = "2C10717D8B2E10D23D2BCA0348263439")
    public boolean useHttpAuthUsernamePassword() {
        LoadListener loader;
        loader = null;
        {
            loader = mLoaderQueue.peek();
        } //End block
        {
            boolean varE8520BA1038614FF7EE7C51C46F527D1_480151061 = (!loader.authCredentialsInvalid());
        } //End block
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_626745617 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_626745617;
        // ---------- Original Method ----------
        //LoadListener loader = null;
        //synchronized (mLoaderQueue) {
            //loader = mLoaderQueue.peek();
        //}
        //if (loader != null) {
            //return !loader.authCredentialsInvalid();
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:00.768 -0400", hash_original_method = "69FA3518C12F8613622C8FCCAB6F2AF7", hash_generated_method = "C5F7065BACC5208BFB4D2BAE41879789")
     void handleAuthRequest(LoadListener loader) {
        {
            boolean var221166D89B647BFDA3D85F45A3E4348F_855522096 = (loader.isSynchronous());
            {
                waitForRequestToComplete();
                {
                    mLoaderQueue.addFirst(loader);
                } //End block
                processNextLoader();
                waitForRequestToComplete();
                {
                    mLoaderQueue.poll();
                } //End block
                loader.handleAuthResponse(mUsername, mPassword);
            } //End block
        } //End collapsed parenthetic
        boolean processNext;
        processNext = false;
        {
            mLoaderQueue.offer(loader);
            processNext =
                (mLoaderQueue.size() == 1);
        } //End block
        {
            processNextLoader();
        } //End block
        addTaint(loader.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:00.769 -0400", hash_original_method = "886E13332A9209796D68B57BD4AA101D", hash_generated_method = "8E8DD249AB23742088627630533DAA85")
    private void waitForRequestToComplete() {
        {
            {
                try 
                {
                    mRequestInFlightLock.wait();
                } //End block
                catch (InterruptedException e)
                { }
            } //End block
        } //End block
        // ---------- Original Method ----------
        //synchronized (mRequestInFlightLock) {
            //while (mRequestInFlight) {
                //try {
                    //mRequestInFlightLock.wait();
                //} catch(InterruptedException e) {
                    //Log.e(LOGTAG, "Interrupted while waiting for request to complete");
                //}
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:00.769 -0400", hash_original_method = "915750F5CD3DA8563236F4856CDF7624", hash_generated_method = "FE0AD7F2D8F450FF03948479C7A6F310")
    private void processNextLoader() {
        LoadListener loader;
        loader = null;
        {
            loader = mLoaderQueue.peek();
        } //End block
        {
            {
                mRequestInFlight = true;
            } //End block
            CallbackProxy proxy;
            proxy = loader.getFrame().getCallbackProxy();
            String hostname;
            boolean varB1DB9B9D9A13B0735B7565BED708C327_1437159052 = (loader.proxyAuthenticate());
            hostname = mNetwork.getProxyHostname();
            hostname = loader.host();
            String realm;
            realm = loader.realm();
            proxy.onReceivedHttpAuthRequest(this, hostname, realm);
        } //End block
        // ---------- Original Method ----------
        //LoadListener loader = null;
        //synchronized (mLoaderQueue) {
            //loader = mLoaderQueue.peek();
        //}
        //if (loader != null) {
            //synchronized (mRequestInFlightLock) {
                //assert(mRequestInFlight == false);
                //mRequestInFlight = true;
            //}
            //CallbackProxy proxy = loader.getFrame().getCallbackProxy();
            //String hostname = loader.proxyAuthenticate() ?
                //mNetwork.getProxyHostname() : loader.host();
            //String realm = loader.realm();
            //proxy.onReceivedHttpAuthRequest(this, hostname, realm);
        //}
    }

    
        public static void onReceivedCredentials(LoadListener loader,
            String host, String realm, String username, String password) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        CallbackProxy proxy = loader.getFrame().getCallbackProxy();
        proxy.onReceivedHttpAuthCredentials(host, realm, username, password);
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:00.769 -0400", hash_original_field = "9C0E52F6EA09A89CC23A82A807E7244F", hash_generated_field = "D6FF1579342774FD892BEA7EB0825E1D")

    private static String LOGTAG = "network";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:00.770 -0400", hash_original_field = "9A2AE89924929921CDB39F682EE97CD7", hash_generated_field = "53380D5D41E2C5C7C0553568623D8851")

    private static int AUTH_PROCEED = 100;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:00.770 -0400", hash_original_field = "2075C787E601ADE7A2B6630E2147FC94", hash_generated_field = "7FDEA7337433436507657612C68287DD")

    private static int AUTH_CANCEL = 200;
}

