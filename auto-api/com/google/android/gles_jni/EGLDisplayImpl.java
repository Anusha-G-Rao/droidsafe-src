package com.google.android.gles_jni;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import javax.microedition.khronos.egl.*;

public class EGLDisplayImpl extends EGLDisplay {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:27.121 -0400", hash_original_field = "7810D656710CDE2BFF1D12293649CFAE", hash_generated_field = "621047E76FA165F15A0AC4BEB008D4AC")

    int mEGLDisplay;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:27.124 -0400", hash_original_method = "B0322934834DBEC13FC1DFBB79B301E2", hash_generated_method = "EA529739750644A061A0822664F2C9E8")
    public  EGLDisplayImpl(int dpy) {
        mEGLDisplay = dpy;
        // ---------- Original Method ----------
        //mEGLDisplay = dpy;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:27.124 -0400", hash_original_method = "08AB90584EA2F88F440B1C972613D186", hash_generated_method = "FCC2E0E63C063F2CAD9068C973FC9C42")
    @Override
    public boolean equals(Object o) {
        {
            boolean var62E9FD43E59369C472D5FDFD656300C3_1331021757 = (o == null || getClass() != o.getClass());
        } //End collapsed parenthetic
        EGLDisplayImpl that;
        that = (EGLDisplayImpl) o;
        addTaint(o.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_166827865 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_166827865;
        // ---------- Original Method ----------
        //if (this == o) return true;
        //if (o == null || getClass() != o.getClass()) return false;
        //EGLDisplayImpl that = (EGLDisplayImpl) o;
        //return mEGLDisplay == that.mEGLDisplay;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:38:27.125 -0400", hash_original_method = "BE5B0756D1165F3111B638ABD354FBB1", hash_generated_method = "4F9CAD1FED633754A015A0C24DCFC837")
    @Override
    public int hashCode() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_574446519 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_574446519;
        // ---------- Original Method ----------
        //return mEGLDisplay;
    }

    
}

