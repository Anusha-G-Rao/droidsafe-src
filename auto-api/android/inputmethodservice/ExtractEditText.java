package android.inputmethodservice;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public class ExtractEditText extends EditText {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:17.255 -0400", hash_original_field = "BB5B873D5AA4316358E44EE9F67CDC3B", hash_generated_field = "451A1E4BDED6910D4643671429CF353C")

    private InputMethodService mIME;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:17.255 -0400", hash_original_field = "AA5A7C446988A5EAB1082BA21E32A53D", hash_generated_field = "AB1C548527F3FF1A47C31A81B3CFA018")

    private int mSettingExtractedText;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:17.265 -0400", hash_original_method = "7A0DE6148CA5B17A67B82391A3703FFF", hash_generated_method = "A54B2D16CEA9673C0951F076CC26E7EF")
    public  ExtractEditText(Context context) {
        super(context, null);
        addTaint(context.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:17.266 -0400", hash_original_method = "4124FA04E6528A50C013D8FF7E28B610", hash_generated_method = "0821D20229B4F8D7479910629FF1FD6A")
    public  ExtractEditText(Context context, AttributeSet attrs) {
        super(context, attrs, com.android.internal.R.attr.editTextStyle);
        addTaint(context.getTaint());
        addTaint(attrs.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:17.267 -0400", hash_original_method = "E7AB7BAEBF60AF77BB15799C720B6EC6", hash_generated_method = "4D701F41EF2CDCC6203D44F4B9B37913")
    public  ExtractEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        addTaint(context.getTaint());
        addTaint(attrs.getTaint());
        addTaint(defStyle);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:17.269 -0400", hash_original_method = "E6DBB41915E723C9F2EECFAC48030375", hash_generated_method = "B5DB85C3F2BB9A526DFFD35933729A52")
     void setIME(InputMethodService ime) {
        mIME = ime;
        // ---------- Original Method ----------
        //mIME = ime;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:17.285 -0400", hash_original_method = "29AED765F6785A82C9D8840D589CD172", hash_generated_method = "27A568DC538086C464A343B5494E6E51")
    public void startInternalChanges() {
        mSettingExtractedText += 1;
        // ---------- Original Method ----------
        //mSettingExtractedText += 1;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:17.286 -0400", hash_original_method = "B6A18168A6952BD0C0F99B7AFD2A1CFC", hash_generated_method = "6D0BECC3D9DA8C9768F35AB3B6B16D1B")
    public void finishInternalChanges() {
        mSettingExtractedText -= 1;
        // ---------- Original Method ----------
        //mSettingExtractedText -= 1;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:17.308 -0400", hash_original_method = "6BAFF88F25F6637786E87F71A6E886F7", hash_generated_method = "FA368FFC099F98AE1D602C8167602ACF")
    @Override
    public void setExtractedText(ExtractedText text) {
        try 
        {
            super.setExtractedText(text);
        } //End block
        finally 
        { }
        addTaint(text.getTaint());
        // ---------- Original Method ----------
        //try {
            //mSettingExtractedText++;
            //super.setExtractedText(text);
        //} finally {
            //mSettingExtractedText--;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:17.310 -0400", hash_original_method = "FB80BE45A1B322D49A7CF30AB5AC4B14", hash_generated_method = "8F26236E4BEAD7606FFAA12C10F7FF83")
    @Override
    protected void onSelectionChanged(int selStart, int selEnd) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        {
            mIME.onExtractedSelectionChanged(selStart, selEnd);
        } //End block
        addTaint(selStart);
        addTaint(selEnd);
        // ---------- Original Method ----------
        //if (mSettingExtractedText == 0 && mIME != null && selStart >= 0 && selEnd >= 0) {
            //mIME.onExtractedSelectionChanged(selStart, selEnd);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:17.311 -0400", hash_original_method = "7168E8EA0FE72B98E042580455F1047F", hash_generated_method = "684D2EA079C4B07901072A9BAE769F05")
    @Override
    public boolean performClick() {
        {
            boolean varB7837EDF8D7DE3FA8DC8119B7C8011E0_1409744236 = (!super.performClick() && mIME != null);
            {
                mIME.onExtractedTextClicked();
            } //End block
        } //End collapsed parenthetic
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1834368014 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1834368014;
        // ---------- Original Method ----------
        //if (!super.performClick() && mIME != null) {
            //mIME.onExtractedTextClicked();
            //return true;
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:17.332 -0400", hash_original_method = "7C9BA2F8326E15326AC5ACB19DAA03AF", hash_generated_method = "EC38316F2658F26B69BD46E0FE2CC0D4")
    @Override
    public boolean onTextContextMenuItem(int id) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        {
            boolean var396F8D5887804111B6BB4135FF998354_477996910 = (mIME != null && mIME.onExtractTextContextMenuItem(id));
        } //End collapsed parenthetic
        boolean varAC8CDD01574679C252B071E5F8BE2559_1209743592 = (super.onTextContextMenuItem(id));
        addTaint(id);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1445775651 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1445775651;
        // ---------- Original Method ----------
        //if (mIME != null && mIME.onExtractTextContextMenuItem(id)) {
            //return true;
        //}
        //return super.onTextContextMenuItem(id);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:17.333 -0400", hash_original_method = "CC164D54DA859C5908F37C0D6AF369B4", hash_generated_method = "F48CF4AC576C36E214F2B2899D0529C4")
    @Override
    public boolean isInputMethodTarget() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1761803603 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1761803603;
        // ---------- Original Method ----------
        //return true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:17.333 -0400", hash_original_method = "04872214ED3EAFCD92368D9E52854C64", hash_generated_method = "D1AE9DC6B4EDF35C1459383202722F35")
    public boolean hasVerticalScrollBar() {
        boolean var3752A1DCE47418B0BD929DC4A11C843D_1872307755 = (computeVerticalScrollRange() > computeVerticalScrollExtent());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1106893567 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1106893567;
        // ---------- Original Method ----------
        //return computeVerticalScrollRange() > computeVerticalScrollExtent();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:17.334 -0400", hash_original_method = "1D3D3676B67FC953B437D952E76D3E93", hash_generated_method = "E18056D30584CD0BFFF137D3D9D26DAA")
    @Override
    public boolean hasWindowFocus() {
        boolean varC1F40335F648F143357C360526871A16_1207020101 = (this.isEnabled());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_52800001 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_52800001;
        // ---------- Original Method ----------
        //return this.isEnabled();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:17.344 -0400", hash_original_method = "CC084819861CE9346C088F826DD71D3D", hash_generated_method = "1F6141ED8C70A993F4BF23FEDD262CD8")
    @Override
    public boolean isFocused() {
        boolean varC1F40335F648F143357C360526871A16_55761621 = (this.isEnabled());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1225474023 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1225474023;
        // ---------- Original Method ----------
        //return this.isEnabled();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:17.345 -0400", hash_original_method = "C5038B1CABC8B8B00C688F0FD76B923F", hash_generated_method = "73F4D61B65DCAEA6632F63B08633587C")
    @Override
    public boolean hasFocus() {
        boolean varC1F40335F648F143357C360526871A16_710076805 = (this.isEnabled());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_685248626 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_685248626;
        // ---------- Original Method ----------
        //return this.isEnabled();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:17.345 -0400", hash_original_method = "8821EFE99206E3F001E81A89F23C541D", hash_generated_method = "A56AF72E67AE5E0694603B1D2A5B948B")
    @Override
    protected void viewClicked(InputMethodManager imm) {
        {
            mIME.onViewClicked(false);
        } //End block
        addTaint(imm.getTaint());
        // ---------- Original Method ----------
        //if (mIME != null) {
            //mIME.onViewClicked(false);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:17.346 -0400", hash_original_method = "5EFADD14D723A5DDC172F34D6074AA1D", hash_generated_method = "4543D6BA060AFEED302A5874E519205F")
    @Override
    protected void deleteText_internal(int start, int end) {
        mIME.onExtractedDeleteText(start, end);
        addTaint(start);
        addTaint(end);
        // ---------- Original Method ----------
        //mIME.onExtractedDeleteText(start, end);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:17.347 -0400", hash_original_method = "439F32381BAC49247AD70546B9BEE6A0", hash_generated_method = "FD2FFE3D9F3CFB594454E66F84002207")
    @Override
    protected void replaceText_internal(int start, int end, CharSequence text) {
        mIME.onExtractedReplaceText(start, end, text);
        addTaint(start);
        addTaint(end);
        addTaint(text.getTaint());
        // ---------- Original Method ----------
        //mIME.onExtractedReplaceText(start, end, text);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:17.347 -0400", hash_original_method = "68A0F27720FB577E88EB01CE64B3B91C", hash_generated_method = "44FED705AF1FD6E5FC2CD4F4A6A0DAC9")
    @Override
    protected void setSpan_internal(Object span, int start, int end, int flags) {
        mIME.onExtractedSetSpan(span, start, end, flags);
        addTaint(span.getTaint());
        addTaint(start);
        addTaint(end);
        addTaint(flags);
        // ---------- Original Method ----------
        //mIME.onExtractedSetSpan(span, start, end, flags);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:17.372 -0400", hash_original_method = "4F35DEE60ED94EEB6924945BBEBAAE46", hash_generated_method = "40146FF4898A99E2932A48869D2FBDFB")
    @Override
    protected void setCursorPosition_internal(int start, int end) {
        mIME.onExtractedSelectionChanged(start, end);
        addTaint(start);
        addTaint(end);
        // ---------- Original Method ----------
        //mIME.onExtractedSelectionChanged(start, end);
    }

    
}

