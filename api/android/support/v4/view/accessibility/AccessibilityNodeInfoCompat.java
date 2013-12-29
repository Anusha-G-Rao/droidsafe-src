package android.support.v4.view.accessibility;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;





public class AccessibilityNodeInfoCompat {

    /**
     * Returns a cached instance if such is available otherwise a new one and
     * sets the source.
     *
     * @return An instance.
     * @see #setSource(View)
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.810 -0500", hash_original_method = "1F4E2CFCB9B6AB6D284C53D40E0B0314", hash_generated_method = "A9A572826662B37A8332B0CCB494C3BE")
    public static AccessibilityNodeInfoCompat obtain(View source) {
        return new AccessibilityNodeInfoCompat(IMPL.obtain(source));
    }

    /**
     * Returns a cached instance if such is available otherwise a new one.
     *
     * @return An instance.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.811 -0500", hash_original_method = "A402A726760E6DAF1E0AF76E81952BC6", hash_generated_method = "5524ABA8A430A99C4C0ACAFF6398D588")
    public static AccessibilityNodeInfoCompat obtain() {
        return new AccessibilityNodeInfoCompat(IMPL.obtain());
    }

    /**
     * Returns a cached instance if such is available or a new one is create.
     * The returned instance is initialized from the given <code>info</code>.
     *
     * @param info The other info.
     * @return An instance.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.812 -0500", hash_original_method = "549A745DD67419074C2DCCEFB81C709E", hash_generated_method = "3F244144ECF370F52B96AD0C8888B9ED")
    public static AccessibilityNodeInfoCompat obtain(AccessibilityNodeInfoCompat info) {
        return new AccessibilityNodeInfoCompat(IMPL.obtain(info.mInfo));
    }
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.803 -0500", hash_original_field = "B1D8AB103F046CFEA3FC9CDC8BCBC3C0", hash_generated_field = "97BD12C859C1DA2B5849DD1AFA547C72")


    private static  AccessibilityNodeInfoImpl IMPL;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:34:02.018 -0500", hash_original_field = "617EB5A49831D4E42CC1FEF3965E4033", hash_generated_field = "F78F9523CB351E82CADC0E3370F65663")


    /**
     * Action that focuses the node.
     */
    public static final int ACTION_FOCUS = 0x00000001;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.806 -0500", hash_original_field = "9F650D1FD27771928876D8E4DD202D99", hash_generated_field = "4E51052F791AAD7CED4606387206AC02")

    public static final int ACTION_CLEAR_FOCUS = 0x00000002;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.807 -0500", hash_original_field = "0DF782BD9DC3375190032A37A32E539E", hash_generated_field = "D94F4C12E9D93257353DF25CED690B59")

    public static final int ACTION_SELECT = 0x00000004;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.807 -0500", hash_original_field = "8ECD989E8F1471431728127462E951C5", hash_generated_field = "A07F23DA35D396F8F58D59EF3496C08F")

    public static final int ACTION_CLEAR_SELECTION = 0x00000008;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.804 -0500", hash_original_field = "6DDA95A03CB574AE472C66BB1085F01C", hash_generated_field = "EA545B797CAE6A5B712CE13E995894C9")


    private  Object mInfo;

    /*
     * Hide constructor from clients.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.808 -0500", hash_original_method = "27EEB78B664A0859CE9D2482B14EDA44", hash_generated_method = "1537DEEDF291D03E1EC9A2D44728DFE0")
    public AccessibilityNodeInfoCompat(Object info) {
        mInfo = info;
    }

    /**
     * @return The wrapped actual implementation.
     *
     * @hide
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.809 -0500", hash_original_method = "180B11831FF091AFD58918B491DA5734", hash_generated_method = "C29B40C85E86F5B0F40B2123568397B1")
    public Object getImpl() {
        return mInfo;
    }

    /**
     * Sets the source.
     *
     * @param source The info source.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.812 -0500", hash_original_method = "DBD6C4E567C7947922529BA45E2088C3", hash_generated_method = "90B66C2995A5D6DDFBBCBCFC7050DA5D")
    public void setSource(View source) {
        IMPL.setSource(mInfo, source);
    }

    /**
     * Gets the id of the window from which the info comes from.
     *
     * @return The window id.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.813 -0500", hash_original_method = "2FCD3C5691FCBE6EB393188032460842", hash_generated_method = "532CDC7BE655D6CCA090E084464B70A9")
    public int getWindowId() {
        return IMPL.getWindowId(mInfo);
    }

    /**
     * Gets the number of children.
     *
     * @return The child count.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.814 -0500", hash_original_method = "2AD4C51D718899601C93A5649AD946AD", hash_generated_method = "A8C4B49542793C1ECB3A1A24BEC4FBB9")
    public int getChildCount() {
        return IMPL.getChildCount(mInfo);
    }

    /**
     * Get the child at given index.
     * <p>
     * <strong>Note:</strong> It is a client responsibility to recycle the
     * received info by calling {@link AccessibilityNodeInfoCompat#recycle()} to
     * avoid creating of multiple instances.
     * </p>
     *
     * @param index The child index.
     * @return The child node.
     * @throws IllegalStateException If called outside of an
     *             AccessibilityService.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.815 -0500", hash_original_method = "8EA123998643A19BBF17F459FF07BE7E", hash_generated_method = "3D4836C004522DDCF2D4E1208945D15B")
    public AccessibilityNodeInfoCompat getChild(int index) {
        return new AccessibilityNodeInfoCompat(IMPL.getChild(mInfo, index));
    }

    /**
     * Adds a child.
     * <p>
     * <strong>Note:</strong> Cannot be called from an
     * {@link android.accessibilityservice.AccessibilityService}. This class is
     * made immutable before being delivered to an AccessibilityService.
     * </p>
     *
     * @param child The child.
     * @throws IllegalStateException If called from an AccessibilityService.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.815 -0500", hash_original_method = "96991CF3D104F82AE28D15A837764722", hash_generated_method = "16E809D8BA444B09A15AA1DB6234B0DB")
    public void addChild(View child) {
        IMPL.addChild(mInfo, child);
    }

    /**
     * Gets the actions that can be performed on the node.
     *
     * @return The bit mask of with actions.
     * @see android.view.accessibility.AccessibilityNodeInfo#ACTION_FOCUS
     * @see android.view.accessibility.AccessibilityNodeInfo#ACTION_CLEAR_FOCUS
     * @see android.view.accessibility.AccessibilityNodeInfo#ACTION_SELECT
     * @see android.view.accessibility.AccessibilityNodeInfo#ACTION_CLEAR_SELECTION
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.816 -0500", hash_original_method = "933CE3223B5CD7F54D5F21B403DB8A7E", hash_generated_method = "537D5CB0A559CBBF67228F479B60ED73")
    public int getActions() {
        return IMPL.getActions(mInfo);
    }

    /**
     * Adds an action that can be performed on the node.
     * <p>
     * <strong>Note:</strong> Cannot be called from an
     * {@link android.accessibilityservice.AccessibilityService}. This class is
     * made immutable before being delivered to an AccessibilityService.
     * </p>
     *
     * @param action The action.
     * @throws IllegalStateException If called from an AccessibilityService.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.817 -0500", hash_original_method = "F620D8EC3817B6EC64D02A805E40B2B4", hash_generated_method = "1F3F2FFA9362EAD00B99DB76616D4CD3")
    public void addAction(int action) {
        IMPL.addAction(mInfo, action);
    }

    /**
     * Performs an action on the node.
     * <p>
     * <strong>Note:</strong> An action can be performed only if the request is
     * made from an {@link android.accessibilityservice.AccessibilityService}.
     * </p>
     *
     * @param action The action to perform.
     * @return True if the action was performed.
     * @throws IllegalStateException If called outside of an
     *             AccessibilityService.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.818 -0500", hash_original_method = "76F70B64C56F7E2DCA168B652A090370", hash_generated_method = "93DD76A34CE5DF8253F6A81AF8E167E4")
    public boolean performAction(int action) {
        return IMPL.performAction(mInfo, action);
    }

    /**
     * Finds {@link android.view.accessibility.AccessibilityNodeInfo}s by text. The match
     * is case insensitive containment. The search is relative to this info i.e. this
     * info is the root of the traversed tree.
     * <p>
     * <strong>Note:</strong> It is a client responsibility to recycle the
     * received info by calling {@link android.view.accessibility.AccessibilityNodeInfo#recycle()}
     * to avoid creating of multiple instances.
     * </p>
     *
     * @param text The searched text.
     * @return A list of node info.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.819 -0500", hash_original_method = "D972868A6ABA9BEE83DE29ABCCDE4A4C", hash_generated_method = "D4FCE95BF9B8E9E49357701DFD27F6B5")
    public List<AccessibilityNodeInfoCompat> findAccessibilityNodeInfosByText(String text) {
        List<AccessibilityNodeInfoCompat> result = new ArrayList<AccessibilityNodeInfoCompat>();
        List<Object> infos = IMPL.findAccessibilityNodeInfosByText(mInfo, text);
        final int infoCount = infos.size();
        for (int i = 0; i < infoCount; i++) {
            Object info = infos.get(i);
            result.add(new AccessibilityNodeInfoCompat(info));
        }
        return result;
    }

    /**
     * Gets the parent.
     * <p>
     * <strong>Note:</strong> It is a client responsibility to recycle the
     * received info by calling {@link android.view.accessibility.AccessibilityNodeInfo#recycle()}
     * to avoid creating of multiple instances.
     * </p>
     *
     * @return The parent.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.819 -0500", hash_original_method = "2E852E0313CFFDFAD47286627DB8F00F", hash_generated_method = "5832632681BAC2C122FB1FB1B6407E64")
    public AccessibilityNodeInfoCompat getParent() {
        return new AccessibilityNodeInfoCompat(IMPL.getParent(mInfo));
    }

    /**
     * Sets the parent.
     * <p>
     * <strong>Note:</strong> Cannot be called from an
     * {@link android.accessibilityservice.AccessibilityService}. This class is
     * made immutable before being delivered to an AccessibilityService.
     * </p>
     *
     * @param parent The parent.
     * @throws IllegalStateException If called from an AccessibilityService.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.820 -0500", hash_original_method = "86518FC5D5AE3E2BA199BEEAA088933F", hash_generated_method = "A9CC7F035545F94FB6F4921F709546B9")
    public void setParent(View parent) {
        IMPL.setParent(mInfo, parent);
    }

    /**
     * Gets the node bounds in parent coordinates.
     *
     * @param outBounds The output node bounds.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.821 -0500", hash_original_method = "E0ACD239D05CD134F4788FDE11AB973D", hash_generated_method = "DF442BEA6EFF145BFDDC74F1596920B2")
    public void getBoundsInParent(Rect outBounds) {
        IMPL.getBoundsInParent(mInfo, outBounds);
    }

    /**
     * Sets the node bounds in parent coordinates.
     * <p>
     * <strong>Note:</strong> Cannot be called from an
     * {@link android.accessibilityservice.AccessibilityService}. This class is
     * made immutable before being delivered to an AccessibilityService.
     * </p>
     *
     * @param bounds The node bounds.
     *@throws IllegalStateException If called from an AccessibilityService.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.822 -0500", hash_original_method = "3D18F1D3A722CB931F3C0EA8FCAAFCB7", hash_generated_method = "4800FFEAA8FE374D7F76DD508373AD10")
    public void setBoundsInParent(Rect bounds) {
        IMPL.setBoundsInParent(mInfo, bounds);
    }

    /**
     * Gets the node bounds in screen coordinates.
     *
     * @param outBounds The output node bounds.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.823 -0500", hash_original_method = "603EEE18F9883128AEF640A26C131D4C", hash_generated_method = "DD24380EE95AB6750BC5D493BDB21D91")
    public void getBoundsInScreen(Rect outBounds) {
        IMPL.getBoundsInScreen(mInfo, outBounds);
    }

    /**
     * Sets the node bounds in screen coordinates.
     * <p>
     * <strong>Note:</strong> Cannot be called from an
     * {@link android.accessibilityservice.AccessibilityService}. This class is
     * made immutable before being delivered to an AccessibilityService.
     * </p>
     *
     * @param bounds The node bounds.
     * @throws IllegalStateException If called from an AccessibilityService.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.823 -0500", hash_original_method = "59EABEF98A7E138E1AB24AE8A708DBC4", hash_generated_method = "BD71A64F0D3604B386EE96EB08AD35D1")
    public void setBoundsInScreen(Rect bounds) {
        IMPL.setBoundsInParent(mInfo, bounds);
    }

    /**
     * Gets whether this node is checkable.
     *
     * @return True if the node is checkable.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.824 -0500", hash_original_method = "AC8D43F54DC3BA7E7C149D4503D525F3", hash_generated_method = "F2938EAA3048AB629FE1EE997D43827D")
    public boolean isCheckable() {
        return IMPL.isCheckable(mInfo);
    }

    /**
     * Sets whether this node is checkable.
     * <p>
     * <strong>Note:</strong> Cannot be called from an
     * {@link android.accessibilityservice.AccessibilityService}. This class is
     * made immutable before being delivered to an AccessibilityService.
     * </p>
     *
     * @param checkable True if the node is checkable.
     * @throws IllegalStateException If called from an AccessibilityService.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.825 -0500", hash_original_method = "02532B45DC391F52A2535027893C38AD", hash_generated_method = "DB9149D5D970D65DD9A6A80E6072ABDF")
    public void setCheckable(boolean checkable) {
        IMPL.setCheckable(mInfo, checkable);
    }

    /**
     * Gets whether this node is checked.
     *
     * @return True if the node is checked.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.826 -0500", hash_original_method = "519FEB307C383A2CCF5C74B89068518B", hash_generated_method = "43860E8682617411EB0F8D925489E905")
    public boolean isChecked() {
        return IMPL.isChecked(mInfo);
    }

    /**
     * Sets whether this node is checked.
     * <p>
     * <strong>Note:</strong> Cannot be called from an
     * {@link android.accessibilityservice.AccessibilityService}. This class is
     * made immutable before being delivered to an AccessibilityService.
     * </p>
     *
     * @param checked True if the node is checked.
     * @throws IllegalStateException If called from an AccessibilityService.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.827 -0500", hash_original_method = "FAB30364812370D4A3BF52C70FA75BB2", hash_generated_method = "A59C6BCE2CD8DB866372B92FC3B179DB")
    public void setChecked(boolean checked) {
        IMPL.setChecked(mInfo, checked);
    }

    /**
     * Gets whether this node is focusable.
     *
     * @return True if the node is focusable.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.828 -0500", hash_original_method = "C9FC8F868000F9B33292AD780E66DCA0", hash_generated_method = "1B0C7C9ED4E3061FC117CF300391E932")
    public boolean isFocusable() {
        return IMPL.isFocusable(mInfo);
    }

    /**
     * Sets whether this node is focusable.
     * <p>
     * <strong>Note:</strong> Cannot be called from an
     * {@link android.accessibilityservice.AccessibilityService}. This class is
     * made immutable before being delivered to an AccessibilityService.
     * </p>
     *
     * @param focusable True if the node is focusable.
     * @throws IllegalStateException If called from an AccessibilityService.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.828 -0500", hash_original_method = "FBAE0F38121F1E86CBC8B993867A4A27", hash_generated_method = "9EE3B225F0BB900FFF66FF8CFE4D2755")
    public void setFocusable(boolean focusable) {
        IMPL.setFocusable(mInfo, focusable);
    }

    /**
     * Gets whether this node is focused.
     *
     * @return True if the node is focused.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.829 -0500", hash_original_method = "4F186107AF4B40F30B1A87108529D484", hash_generated_method = "1CE5FAA6469CB8E3576D4A61733A2FB1")
    public boolean isFocused() {
        return IMPL.isFocused(mInfo);
    }

    /**
     * Sets whether this node is focused.
     * <p>
     * <strong>Note:</strong> Cannot be called from an
     * {@link android.accessibilityservice.AccessibilityService}. This class is
     * made immutable before being delivered to an AccessibilityService.
     * </p>
     *
     * @param focused True if the node is focused.
     * @throws IllegalStateException If called from an AccessibilityService.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.830 -0500", hash_original_method = "9869A69DD9422BD72F2EA6EC374F4934", hash_generated_method = "20F520430D8D21E4D7B31FF626E2060D")
    public void setFocused(boolean focused) {
        IMPL.setFocused(mInfo, focused);
    }

    /**
     * Gets whether this node is selected.
     *
     * @return True if the node is selected.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.830 -0500", hash_original_method = "DDA60D7434111992259669E63D890C29", hash_generated_method = "F851DFD3AB4682AEC9781FD2E8716529")
    public boolean isSelected() {
        return IMPL.isSelected(mInfo);
    }

    /**
     * Sets whether this node is selected.
     * <p>
     * <strong>Note:</strong> Cannot be called from an
     * {@link android.accessibilityservice.AccessibilityService}. This class is
     * made immutable before being delivered to an AccessibilityService.
     * </p>
     *
     * @param selected True if the node is selected.
     * @throws IllegalStateException If called from an AccessibilityService.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.831 -0500", hash_original_method = "CCBAF3645335D86B821DEAC9BDDB4ED2", hash_generated_method = "00F8596CE99ACE290DD1B676F34D71C6")
    public void setSelected(boolean selected) {
        IMPL.setSelected(mInfo, selected);
    }

    /**
     * Gets whether this node is clickable.
     *
     * @return True if the node is clickable.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.832 -0500", hash_original_method = "6F39B6C0009288DFEA1A8807AE028922", hash_generated_method = "A3D847D73DF1E2DD92FCBC32FE6B781B")
    public boolean isClickable() {
        return IMPL.isClickable(mInfo);
    }

    /**
     * Sets whether this node is clickable.
     * <p>
     * <strong>Note:</strong> Cannot be called from an
     * {@link android.accessibilityservice.AccessibilityService}. This class is
     * made immutable before being delivered to an AccessibilityService.
     * </p>
     *
     * @param clickable True if the node is clickable.
     * @throws IllegalStateException If called from an AccessibilityService.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.832 -0500", hash_original_method = "CBF9AA1E7F6DA4EEE21EFD519E970C6E", hash_generated_method = "43B26BD6D513B5F41067E1E4D4FAF666")
    public void setClickable(boolean clickable) {
        IMPL.setClickable(mInfo, clickable);
    }

    /**
     * Gets whether this node is long clickable.
     *
     * @return True if the node is long clickable.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.833 -0500", hash_original_method = "2A0651AA24697C87D5B10A2F592D15AE", hash_generated_method = "4D2C2FC18945A9E163C831680B184A24")
    public boolean isLongClickable() {
        return IMPL.isLongClickable(mInfo);
    }

    /**
     * Sets whether this node is long clickable.
     * <p>
     * <strong>Note:</strong> Cannot be called from an
     * {@link android.accessibilityservice.AccessibilityService}. This class is
     * made immutable before being delivered to an AccessibilityService.
     * </p>
     *
     * @param longClickable True if the node is long clickable.
     * @throws IllegalStateException If called from an AccessibilityService.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.834 -0500", hash_original_method = "C41DB90B24D967665ADB7BE195D933F7", hash_generated_method = "450B17F683658666E99C7B3076539982")
    public void setLongClickable(boolean longClickable) {
        IMPL.setLongClickable(mInfo, longClickable);
    }

    /**
     * Gets whether this node is enabled.
     *
     * @return True if the node is enabled.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.835 -0500", hash_original_method = "652E5B5F063CB50BC77186FF37F33BDF", hash_generated_method = "6BA66641655E00C9ED155D7F2DCE0E9C")
    public boolean isEnabled() {
        return IMPL.isEnabled(mInfo);
    }

    /**
     * Sets whether this node is enabled.
     * <p>
     * <strong>Note:</strong> Cannot be called from an
     * {@link android.accessibilityservice.AccessibilityService}. This class is
     * made immutable before being delivered to an AccessibilityService.
     * </p>
     *
     * @param enabled True if the node is enabled.
     * @throws IllegalStateException If called from an AccessibilityService.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.835 -0500", hash_original_method = "38B56F1A12BFB4B4EFFD2BC2116AF996", hash_generated_method = "6CE97DBF8734F261892A971A7D8BDF52")
    public void setEnabled(boolean enabled) {
        IMPL.setEnabled(mInfo, enabled);
    }

    /**
     * Gets whether this node is a password.
     *
     * @return True if the node is a password.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.836 -0500", hash_original_method = "65A99E085FF9E307AFC93D67B83055DB", hash_generated_method = "C464D20B5B06D4A8BB2AAB921D019802")
    public boolean isPassword() {
        return IMPL.isPassword(mInfo);
    }

    /**
     * Sets whether this node is a password.
     * <p>
     * <strong>Note:</strong> Cannot be called from an
     * {@link android.accessibilityservice.AccessibilityService}. This class is
     * made immutable before being delivered to an AccessibilityService.
     * </p>
     *
     * @param password True if the node is a password.
     * @throws IllegalStateException If called from an AccessibilityService.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.837 -0500", hash_original_method = "B97A25B40B977908B12069641BAB55A8", hash_generated_method = "F607BC9F283964AD117DE9BEB44E99B1")
    public void setPassword(boolean password) {
        IMPL.setPassword(mInfo, password);
    }

    /**
     * Gets if the node is scrollable.
     *
     * @return True if the node is scrollable, false otherwise.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.838 -0500", hash_original_method = "C7AAD2830522B8BD5949276001A4D042", hash_generated_method = "930838EDEF0DD5A1791DF4F002E34E4C")
    public boolean isScrollable() {
        return IMPL.isScrollable(mInfo);
    }

    /**
     * Sets if the node is scrollable.
     * <p>
     * <strong>Note:</strong> Cannot be called from an
     * {@link android.accessibilityservice.AccessibilityService}. This class is
     * made immutable before being delivered to an AccessibilityService.
     * </p>
     *
     * @param scrollable True if the node is scrollable, false otherwise.
     * @throws IllegalStateException If called from an AccessibilityService.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.838 -0500", hash_original_method = "EF0CC581E7F7F261AFF7A1550C16EBCA", hash_generated_method = "FF10968521D7D7EE6AA386EF051FC800")
    public void setScrollable(boolean scrollable) {
        IMPL.setScrollable(mInfo, scrollable);
    }

    /**
     * Gets the package this node comes from.
     *
     * @return The package name.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.839 -0500", hash_original_method = "11DA2F2F6D35A0A5BD4D3AD5855546F2", hash_generated_method = "E376132D49C22EECF8940FC095DC9C7A")
    public CharSequence getPackageName() {
        return IMPL.getPackageName(mInfo);
    }

    /**
     * Sets the package this node comes from.
     * <p>
     * <strong>Note:</strong> Cannot be called from an
     * {@link android.accessibilityservice.AccessibilityService}. This class is
     * made immutable before being delivered to an AccessibilityService.
     * </p>
     *
     * @param packageName The package name.
     * @throws IllegalStateException If called from an AccessibilityService.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.841 -0500", hash_original_method = "51BDE657C455C3947A276CD4621D88BF", hash_generated_method = "B10217DFFD45DFE59CD0708B3A3739E6")
    public void setPackageName(CharSequence packageName) {
        IMPL.setPackageName(mInfo, packageName);
    }

    /**
     * Gets the class this node comes from.
     *
     * @return The class name.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.841 -0500", hash_original_method = "80725931141339E528C95BCDFA69AC67", hash_generated_method = "AD5985DA033FE7AA31D10BC4686F4408")
    public CharSequence getClassName() {
        return IMPL.getClassName(mInfo);
    }

    /**
     * Sets the class this node comes from.
     * <p>
     * <strong>Note:</strong> Cannot be called from an
     * {@link android.accessibilityservice.AccessibilityService}. This class is
     * made immutable before being delivered to an AccessibilityService.
     * </p>
     *
     * @param className The class name.
     * @throws IllegalStateException If called from an AccessibilityService.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.842 -0500", hash_original_method = "95DBB6C9D00CCAE01AE6EC9F7D77613E", hash_generated_method = "8F56A94F6ACCE2223C09F279D7B8EC3A")
    public void setClassName(CharSequence className) {
        IMPL.setClassName(mInfo, className);
    }

    /**
     * Gets the text of this node.
     *
     * @return The text.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.843 -0500", hash_original_method = "384621808EBD921F20A6EB28B91ADAD5", hash_generated_method = "5E5A150E827CB2DE5FA31B44CEBACCE2")
    public CharSequence getText() {
        return IMPL.getText(mInfo);
    }

    /**
     * Sets the text of this node.
     * <p>
     * <strong>Note:</strong> Cannot be called from an
     * {@link android.accessibilityservice.AccessibilityService}. This class is
     * made immutable before being delivered to an AccessibilityService.
     * </p>
     *
     * @param text The text.
     * @throws IllegalStateException If called from an AccessibilityService.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.844 -0500", hash_original_method = "CCE84BD471DC2DB3AF81C568CF944475", hash_generated_method = "21AF717A075F3D5014CAD534ABD735C0")
    public void setText(CharSequence text) {
        IMPL.setText(mInfo, text);
    }

    
    static class AccessibilityNodeInfoStubImpl implements AccessibilityNodeInfoImpl {
        
        @DSModeled(DSC.SAFE)
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:33.913 -0400", hash_original_method = "D9A4AFBF5AD5A775B6C1281730E5BA11", hash_generated_method = "D9A4AFBF5AD5A775B6C1281730E5BA11")
        public AccessibilityNodeInfoStubImpl ()
        {
            //Synthesized constructor
        }
        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.720 -0500", hash_original_method = "817FD8D623FDA4524F619AFC293F09EC", hash_generated_method = "E63F20960B6D02B12716A3819EFD1DB3")
        public Object obtain() {
            return null;
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.720 -0500", hash_original_method = "92695667FFAB3FACD22606EFAA0A43BA", hash_generated_method = "B228B913824C0061F3FC9E0ACFA1513A")
        public Object obtain(View source) {
            return null;
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.721 -0500", hash_original_method = "773588C99ADE780DBDFC19514017BC1F", hash_generated_method = "35116944E92967590C7B1582759A075D")
        public Object obtain(Object info) {
            return null;
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.722 -0500", hash_original_method = "8D71C6A90F236F7F17CE9F0DA3BE99D2", hash_generated_method = "D079D6F3460222FD56CB17FD00B22288")
        public void addAction(Object info, int action) {

        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.723 -0500", hash_original_method = "6B9372E604C01DF70F526B6A8E570148", hash_generated_method = "CA4334FE615ADF5FF93BDEFF92048E15")
        public void addChild(Object info, View child) {

        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.724 -0500", hash_original_method = "DDFBD7F537083E060F4196E4CBB1F004", hash_generated_method = "0C302232632E2BE33F7B1E2F99F920B0")
        public List<Object> findAccessibilityNodeInfosByText(Object info, String text) {
            return Collections.emptyList();
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.725 -0500", hash_original_method = "62879C9A6873AFA1FE78492502C9E8C1", hash_generated_method = "1B09725F28EC0FD7CCC68EC5681527B1")
        public int getActions(Object info) {
            return 0;
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.725 -0500", hash_original_method = "194BB4DCA6CDD611708C0DBE13AE8AE6", hash_generated_method = "FDF96C587609658A1C7CC7B85FE7AA2F")
        public void getBoundsInParent(Object info, Rect outBounds) {

        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.726 -0500", hash_original_method = "AD025A7E801C16406D0F86CAFA041F7F", hash_generated_method = "EAC0067D53A64557D6AC53C7F0EEC501")
        public void getBoundsInScreen(Object info, Rect outBounds) {

        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.727 -0500", hash_original_method = "3EFC24789BAB789DBA02244C19291A8A", hash_generated_method = "870DBE28D652511DF55C447015312F10")
        public Object getChild(Object info, int index) {
            return null;
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.728 -0500", hash_original_method = "DE0573752D5D98EE2B44C4024F5102E5", hash_generated_method = "6B94932D70B58FA45BCEFC06F48841A1")
        public int getChildCount(Object info) {
            return 0;
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.729 -0500", hash_original_method = "0F7CFAB631E1B134DCF395A7797DAF67", hash_generated_method = "E8E0B48CB275E1E67174E1852A0D2501")
        public CharSequence getClassName(Object info) {
            return null;
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.729 -0500", hash_original_method = "7D3E1748FD6A5B3BAF1D83AAF2AE15DE", hash_generated_method = "C2A3B2C429CC7C82C38ABC848FC736B5")
        public CharSequence getContentDescription(Object info) {
            return null;
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.730 -0500", hash_original_method = "D7A11002847EF3E5746055DA2B429105", hash_generated_method = "27815C2DE12138498A811FD259DFB57A")
        public CharSequence getPackageName(Object info) {
            return null;
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.731 -0500", hash_original_method = "6E57EFC15A3C835051BC240D78A056B3", hash_generated_method = "49261D57053CC23BA22654333616A8A3")
        public AccessibilityNodeInfoCompat getParent(Object info) {
            return null;
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.732 -0500", hash_original_method = "CA1AE5519AB49B9F955ADEDF9C3C214E", hash_generated_method = "BD45C21C71A5796FEB425A789EB7111D")
        public CharSequence getText(Object info) {
            return null;
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.733 -0500", hash_original_method = "EB7D2054B13C972973DD67D9B21CE0E5", hash_generated_method = "1CA2BBF715ED25817F4D259DF2170015")
        public int getWindowId(Object info) {
            return 0;
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.734 -0500", hash_original_method = "4E39FE68FD90D69FA08C7AD1E979DF07", hash_generated_method = "5AA5713FEAF2A3541F057FB3F0EA6AB3")
        public boolean isCheckable(Object info) {
            return false;
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.734 -0500", hash_original_method = "F2469434A89FA62BE9B2DB78034140F5", hash_generated_method = "66ED3C092CC7019EF9829DF445BFF20D")
        public boolean isChecked(Object info) {
            return false;
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.736 -0500", hash_original_method = "F7781A93E107315385A57825C2B0B78A", hash_generated_method = "8B729B21713FDFDA602278279787045F")
        public boolean isClickable(Object info) {
            return false;
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.736 -0500", hash_original_method = "6BAAC3777342DFE283E965C06FC8D874", hash_generated_method = "C7502920BB7EB353859573348C7487BF")
        public boolean isEnabled(Object info) {
            return false;
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.737 -0500", hash_original_method = "24826F7A102BA4F82C9D9B08241E284F", hash_generated_method = "4A8E8BF489067EBEBBA043153F5E11C3")
        public boolean isFocusable(Object info) {
            return false;
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.738 -0500", hash_original_method = "4D0616B5A88718B8558E59C7943E57B4", hash_generated_method = "7C70A61FF4EB9417B79D26C961A54C95")
        public boolean isFocused(Object info) {
            return false;
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.739 -0500", hash_original_method = "3EB36752093CDD3C24048A6DFD7EC73D", hash_generated_method = "689344C1E023DD6328F379B8EDE0FF66")
        public boolean isLongClickable(Object info) {
            return false;
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.739 -0500", hash_original_method = "CB922389EC3BD00D9BEE74A550F7293C", hash_generated_method = "0631DDA363DE7088678E7AAF9AE290A0")
        public boolean isPassword(Object info) {
            return false;
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.740 -0500", hash_original_method = "0A24FC3E128A848006031E8724C7F0A9", hash_generated_method = "ECE07DC162E0BB665D8F33A417CE59B6")
        public boolean isScrollable(Object info) {
            return false;
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.741 -0500", hash_original_method = "6AFAC3555346166234EF254615BCA05C", hash_generated_method = "1E1C35E786DCA17F23D23B5E0D714103")
        public boolean isSelected(Object info) {
            return false;
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.742 -0500", hash_original_method = "FCBED87974E8349E51CFE67F3FE8BAAB", hash_generated_method = "981939D2E2CE075D7961575819539A89")
        public boolean performAction(Object info, int action) {
            return false;
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.742 -0500", hash_original_method = "6311EA40C38D5B6B34E9E1F7C3DBB879", hash_generated_method = "A26B4E2A7BDD2FA71BC9BAAB08E4C552")
        public void setBoundsInParent(Object info, Rect bounds) {

        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.743 -0500", hash_original_method = "D2C9C693466BA3A7E4B14036D2B17A5B", hash_generated_method = "0FC111DB7DE6058E7083B0209F29310E")
        public void setBoundsInScreen(Object info, Rect bounds) {

        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.744 -0500", hash_original_method = "38431A6D5EE00E0099D8DB2DEFF6D601", hash_generated_method = "4D3ABFBBB0E2573CC1DCD5EE529CB2FC")
        public void setCheckable(Object info, boolean checkable) {

        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.745 -0500", hash_original_method = "4FE562645B89F53A2E3F577D51BE4F8C", hash_generated_method = "98DE3AC033BFE06B26C4F0698FFC32D2")
        public void setChecked(Object info, boolean checked) {

        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.745 -0500", hash_original_method = "82032763AB44B88BDF6C3C4AC2ABB1CF", hash_generated_method = "AFE296A61CCEE4D84EF0872398D9733C")
        public void setClassName(Object info, CharSequence className) {

        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.746 -0500", hash_original_method = "31E6103163DC809F9F67CE01A33EE87B", hash_generated_method = "D43E421195E9BB3ADFD20F1A34A77B94")
        public void setClickable(Object info, boolean clickable) {

        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.747 -0500", hash_original_method = "B500330A66D743DBA7E460FD212D7744", hash_generated_method = "EB7B5797CB096E840BA1BF48B7980B6C")
        public void setContentDescription(Object info, CharSequence contentDescription) {

        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.748 -0500", hash_original_method = "2E8A30481E49B666D7564B714DFA8A28", hash_generated_method = "D814BFEA204A885E830BD4627DD5B8E2")
        public void setEnabled(Object info, boolean enabled) {

        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.748 -0500", hash_original_method = "6FC489938507A8AC8A67E31F4C0F3485", hash_generated_method = "CED39C71C8CA57FCD42E56264A07759C")
        public void setFocusable(Object info, boolean focusable) {

        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.750 -0500", hash_original_method = "D760A9B869FD1EE026AE8BC4B17036E8", hash_generated_method = "90D84AF15CF9D150E277CDCAB2FEDC9D")
        public void setFocused(Object info, boolean focused) {

        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.751 -0500", hash_original_method = "FD5EDA58E4935860A3097167F37FF25A", hash_generated_method = "F7AF40C77103695AA347AF345D4408E2")
        public void setLongClickable(Object info, boolean longClickable) {

        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.752 -0500", hash_original_method = "7ACCCA5C650FD61E0E741AE4759FF12D", hash_generated_method = "52138046DAE4B6428E3CA6B1062E96F8")
        public void setPackageName(Object info, CharSequence packageName) {

        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.752 -0500", hash_original_method = "69043B1B7F4EB8EB9BDC8511E4B08BEE", hash_generated_method = "8F59DCA4A71FFC66B6C4776E8B8E43FC")
        public void setParent(Object info, View parent) {

        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.753 -0500", hash_original_method = "363672B9055A3FB9061F2E3103405704", hash_generated_method = "AFB485FB25B45D94517E202F237D9102")
        public void setPassword(Object info, boolean password) {

        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.754 -0500", hash_original_method = "709C7E935F852B3F6266600FDF6B6337", hash_generated_method = "00FF14C5054D7CF0D9FEEFAACFC3C21F")
        public void setScrollable(Object info, boolean scrollable) {

        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.756 -0500", hash_original_method = "3EF8627D1C0109EB2B6665EF94BA680A", hash_generated_method = "2022E389F5DF8560EB0A77F324639730")
        public void setSelected(Object info, boolean selected) {

        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.756 -0500", hash_original_method = "483D361A53672C2015F284EB727D68EB", hash_generated_method = "1A75E73E829BC172520C248A709D2A6D")
        public void setSource(Object info, View source) {

        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.757 -0500", hash_original_method = "A82131F0C1B3FA9CC52D0C37845C305A", hash_generated_method = "EB3701D4E9A7B92B651A7349176BE310")
        public void setText(Object info, CharSequence text) {

        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.758 -0500", hash_original_method = "83070C3537D062E3CF530D85D02FB919", hash_generated_method = "9F9D28B5FEF5D06E1BC9D148E7B407A1")
        public void recycle(Object info) {

        }

        
    }


    
    static class AccessibilityNodeInfoIcsImpl extends AccessibilityNodeInfoStubImpl {
        
        @DSModeled(DSC.SAFE)
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:33.920 -0400", hash_original_method = "21FE378E79CF4BF2260F84D20D666AC8", hash_generated_method = "21FE378E79CF4BF2260F84D20D666AC8")
        public AccessibilityNodeInfoIcsImpl ()
        {
            //Synthesized constructor
        }
        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.760 -0500", hash_original_method = "E5E40CEE71B96A750609FB525C810C40", hash_generated_method = "9C98B20F720B793D88C1C7807C4ABC07")
        @Override
public Object obtain() {
            return AccessibilityNodeInfoCompatIcs.obtain();
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.761 -0500", hash_original_method = "8DA77B182C4547DFE3D4092985103CE0", hash_generated_method = "4E31A3B5FDD4A65E1D06687FA68A0F78")
        @Override
public Object obtain(View source) {
            return AccessibilityNodeInfoCompatIcs.obtain(source);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.762 -0500", hash_original_method = "AAB3A8D4C437B198564587B92520BA15", hash_generated_method = "6A67AF30C976CF56FB1A5B26BDF9AC73")
        @Override
public Object obtain(Object info) {
            return AccessibilityNodeInfoCompatIcs.obtain(info);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.763 -0500", hash_original_method = "0A7E097CDAE39DDB6B86DB3C969CB42E", hash_generated_method = "88D0C38EC0A685382C3E43BE4FD6AE00")
        @Override
public void addAction(Object info, int action) {
            AccessibilityNodeInfoCompatIcs.addAction(info, action);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.764 -0500", hash_original_method = "341A0CD277745082770A69C5D7681A5A", hash_generated_method = "7999F78E1CC3D9E70A88BF8BFF37E7E3")
        @Override
public void addChild(Object info, View child) {
            AccessibilityNodeInfoCompatIcs.addChild(info, child);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.764 -0500", hash_original_method = "E451DF79B85F7C5360B2FFDA4305ECB9", hash_generated_method = "6F1167718C902018835EA9A740AD5193")
        @Override
public List<Object> findAccessibilityNodeInfosByText(Object info, String text) {
            return AccessibilityNodeInfoCompatIcs.findAccessibilityNodeInfosByText(info, text);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.765 -0500", hash_original_method = "D17F96C78962590280138C187D4A4D01", hash_generated_method = "038D94C9057E39C9288E52941419AD78")
        @Override
public int getActions(Object info) {
            return AccessibilityNodeInfoCompatIcs.getActions(info);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.766 -0500", hash_original_method = "B26B5755D84A45820A9127024B317E2D", hash_generated_method = "06F460BFEEB23C3FD04EFA2BF13716BC")
        @Override
public void getBoundsInParent(Object info, Rect outBounds) {
            AccessibilityNodeInfoCompatIcs.getBoundsInParent(info, outBounds);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.767 -0500", hash_original_method = "B5FD542CD4348223D6FD8509002D9D1B", hash_generated_method = "EE9A68D2A596C89C4D07EC4668B9C5A5")
        @Override
public void getBoundsInScreen(Object info, Rect outBounds) {
            AccessibilityNodeInfoCompatIcs.getBoundsInScreen(info, outBounds);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.768 -0500", hash_original_method = "11896B02F65554BEE96755430EF5F8E2", hash_generated_method = "E0FE1CA459F4C28E358E588FD767FA52")
        @Override
public AccessibilityNodeInfoCompat getChild(Object info, int index) {
            return new AccessibilityNodeInfoCompat(IMPL.getChild(info, index));
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.769 -0500", hash_original_method = "1060851E4756FF33B64BCC78AB967D36", hash_generated_method = "32758C1B8D07C83633D4FC00528FE373")
        @Override
public int getChildCount(Object info) {
            return AccessibilityNodeInfoCompatIcs.getChildCount(info);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.770 -0500", hash_original_method = "001ED67ACCB05215E0C0C1269607FAAC", hash_generated_method = "02CC4E2B9DE0B55A9158EBB03462AB59")
        @Override
public CharSequence getClassName(Object info) {
            return AccessibilityNodeInfoCompatIcs.getClassName(info);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.771 -0500", hash_original_method = "49E68BE928284122DC1CE4D1F9B3E016", hash_generated_method = "907350C22A9366745ED071193F7E294F")
        @Override
public CharSequence getContentDescription(Object info) {
            return AccessibilityNodeInfoCompatIcs.getContentDescription(info);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.771 -0500", hash_original_method = "E8A4C3E3432029A8834D6142201B45ED", hash_generated_method = "14F4E302FCAD3DA68454BCFFAE48AE96")
        @Override
public CharSequence getPackageName(Object info) {
            return AccessibilityNodeInfoCompatIcs.getPackageName(info);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.772 -0500", hash_original_method = "D663E14A044DAD7A809F789DAE716A60", hash_generated_method = "605D88CAFE15BE7C063F9F484056BF87")
        @Override
public AccessibilityNodeInfoCompat getParent(Object info) {
            return new AccessibilityNodeInfoCompat(IMPL.getParent(info));
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.773 -0500", hash_original_method = "E0898B972D5792ED49F6E082AA078009", hash_generated_method = "D1F5BA0C76A99F61B56536882DF82B52")
        @Override
public CharSequence getText(Object info) {
            return AccessibilityNodeInfoCompatIcs.getText(info);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.774 -0500", hash_original_method = "E3B5F3C7383213DB54B59D99B9C21DDF", hash_generated_method = "1CE8ED298F6B874449851FC58CF93C9C")
        @Override
public int getWindowId(Object info) {
            return AccessibilityNodeInfoCompatIcs.getWindowId(info);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.775 -0500", hash_original_method = "E86FBEBDF802FE51EE90043BABBDBD26", hash_generated_method = "DE047490AC2B11B4296E0FD160E8CC44")
        @Override
public boolean isCheckable(Object info) {
            return AccessibilityNodeInfoCompatIcs.isCheckable(info);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.776 -0500", hash_original_method = "100CB854A73833CFD79DA770C6A93054", hash_generated_method = "82B7660DB47C866157C8108546AB384D")
        @Override
public boolean isChecked(Object info) {
            return AccessibilityNodeInfoCompatIcs.isChecked(info);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.777 -0500", hash_original_method = "D3DFDB52B10ADA5E3C3F15A26FC7FBD7", hash_generated_method = "0D7A1720CB072A34CFF678C13F695D1E")
        @Override
public boolean isClickable(Object info) {
            return AccessibilityNodeInfoCompatIcs.isClickable(info);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.777 -0500", hash_original_method = "36209ADA0F5A959372A76079E2B78D93", hash_generated_method = "E29BDD50E4DC9B959C09780C69F6FD7A")
        @Override
public boolean isEnabled(Object info) {
            return AccessibilityNodeInfoCompatIcs.isEnabled(info);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.778 -0500", hash_original_method = "C6DC12553020499681AB366980A40B1F", hash_generated_method = "6EC46A37653A83E48901BE244882BF20")
        @Override
public boolean isFocusable(Object info) {
            return AccessibilityNodeInfoCompatIcs.isFocusable(info);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.779 -0500", hash_original_method = "3B18C47ECC5B4B3818BF155318346723", hash_generated_method = "163F0B900F046D6F3F210B1C7A2A04B5")
        @Override
public boolean isFocused(Object info) {
            return AccessibilityNodeInfoCompatIcs.isFocused(info);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.781 -0500", hash_original_method = "0E74B77ABC4CEB867A986595A38161A2", hash_generated_method = "9E615A3969469B8289F10A7B1C37821C")
        @Override
public boolean isLongClickable(Object info) {
            return AccessibilityNodeInfoCompatIcs.isLongClickable(info);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.781 -0500", hash_original_method = "B10B564B73623100875F088E9DD770C1", hash_generated_method = "CA1E6BDCE51D4C07C98DD4EF41D80543")
        @Override
public boolean isPassword(Object info) {
            return AccessibilityNodeInfoCompatIcs.isPassword(info);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.782 -0500", hash_original_method = "27190DC49C8364B899CAE814D744FE8B", hash_generated_method = "02CED8A5437B075AB364CD9ECB96FA6F")
        @Override
public boolean isScrollable(Object info) {
            return AccessibilityNodeInfoCompatIcs.isScrollable(info);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.783 -0500", hash_original_method = "A622640AC1F4DA88BF6801D78709518C", hash_generated_method = "921F83D61EA7C1FDA3BBA7080EC22AFF")
        @Override
public boolean isSelected(Object info) {
            return AccessibilityNodeInfoCompatIcs.isSelected(info);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.784 -0500", hash_original_method = "9AD9C2656115753FB34BB6FBDDF94F3E", hash_generated_method = "B5456A3DAFC4BD79F67F653CBC98498C")
        @Override
public boolean performAction(Object info, int action) {
            return AccessibilityNodeInfoCompatIcs.performAction(info, action);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.785 -0500", hash_original_method = "B83B9E944F82D8AD27FBEADECC6E7EF2", hash_generated_method = "2647F3478ED17B710ACBA53542B4D843")
        @Override
public void setBoundsInParent(Object info, Rect bounds) {
            AccessibilityNodeInfoCompatIcs.setBoundsInParent(info, bounds);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.785 -0500", hash_original_method = "AA193C796629869323B4C215F767EF10", hash_generated_method = "4D9981938FF2DF453C3B1DA339874E4F")
        @Override
public void setBoundsInScreen(Object info, Rect bounds) {
            AccessibilityNodeInfoCompatIcs.setBoundsInScreen(info, bounds);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.786 -0500", hash_original_method = "E50D3EA2B511910BFCFCC317E73F9BD4", hash_generated_method = "C23E7F7A01F078C532951911CC56301B")
        @Override
public void setCheckable(Object info, boolean checkable) {
            AccessibilityNodeInfoCompatIcs.setCheckable(info, checkable);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.787 -0500", hash_original_method = "AC21400C52299765810DFE83F0ADACE8", hash_generated_method = "F0FA6DA513BF5F50BB6A8B4E16DE6CE6")
        @Override
public void setChecked(Object info, boolean checked) {
            AccessibilityNodeInfoCompatIcs.setChecked(info, checked);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.788 -0500", hash_original_method = "7A94FF987D45DDACFD0402C8FB7DDE97", hash_generated_method = "82F21377F35F8C3A6FAB50E56122B5EE")
        @Override
public void setClassName(Object info, CharSequence className) {
            AccessibilityNodeInfoCompatIcs.setClassName(info, className);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.789 -0500", hash_original_method = "BB8527C09D9C6151F737E8B59EC0FCE8", hash_generated_method = "828D506B4248EC1034B2DB716480810B")
        @Override
public void setClickable(Object info, boolean clickable) {
            AccessibilityNodeInfoCompatIcs.setClickable(info, clickable);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.789 -0500", hash_original_method = "0169AC239075ED7B4C4FDF21404839A2", hash_generated_method = "3696DA6EEEAE2402D0D48EF468736B52")
        @Override
public void setContentDescription(Object info, CharSequence contentDescription) {
            AccessibilityNodeInfoCompatIcs.setContentDescription(info, contentDescription);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.790 -0500", hash_original_method = "E3468D53BBC641A160F74004C61B3122", hash_generated_method = "8E2BC90C970B0AE37CE8A8CFBCC7C2E8")
        @Override
public void setEnabled(Object info, boolean enabled) {
            AccessibilityNodeInfoCompatIcs.setEnabled(info, enabled);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.791 -0500", hash_original_method = "DF0F47AC0A3E9517E54BD77506E987C2", hash_generated_method = "8278AB1BEFF52DE050C1265A2D9642B6")
        @Override
public void setFocusable(Object info, boolean focusable) {
            AccessibilityNodeInfoCompatIcs.setFocusable(info, focusable);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.792 -0500", hash_original_method = "06FD2B381779CA5EC6EDBB576923A85B", hash_generated_method = "479FC632BE92B78EE5DA7FE389163392")
        @Override
public void setFocused(Object info, boolean focused) {
            AccessibilityNodeInfoCompatIcs.setFocused(info, focused);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.793 -0500", hash_original_method = "C3AB7DB810B3043F9F52463A756847CD", hash_generated_method = "B6B08A7DED397287E74115917150B6B7")
        @Override
public void setLongClickable(Object info, boolean longClickable) {
            AccessibilityNodeInfoCompatIcs.setLongClickable(info, longClickable);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.794 -0500", hash_original_method = "7DAB17659A9A31AE8995C1EE54CC3933", hash_generated_method = "27ED886B166104585F6E9E4357A853D0")
        @Override
public void setPackageName(Object info, CharSequence packageName) {
            AccessibilityNodeInfoCompatIcs.setPackageName(info, packageName);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.795 -0500", hash_original_method = "DDE950F8FB9AD10FE97D3324E7FA0C0C", hash_generated_method = "96ECE2EB2E2BD04EA7D069BA191E8613")
        @Override
public void setParent(Object info, View parent) {
            AccessibilityNodeInfoCompatIcs.setParent(info, parent);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.796 -0500", hash_original_method = "784E93A04B49626C38656FD7564AAD9D", hash_generated_method = "4F0AEBDBDE4D47BE8F28A1BE381503C7")
        @Override
public void setPassword(Object info, boolean password) {
            AccessibilityNodeInfoCompatIcs.setPassword(info, password);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.797 -0500", hash_original_method = "B5EF4CAA0C493D78F8DD003411B53892", hash_generated_method = "8E186105448657C47B519F094B0CC976")
        @Override
public void setScrollable(Object info, boolean scrollable) {
            AccessibilityNodeInfoCompatIcs.setScrollable(info, scrollable);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.798 -0500", hash_original_method = "1A8DBC2AB955429552ADF95538A7CF85", hash_generated_method = "AF6B7FD9DB06043378A520A8640081DC")
        @Override
public void setSelected(Object info, boolean selected) {
            AccessibilityNodeInfoCompatIcs.setSelected(info, selected);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.799 -0500", hash_original_method = "F051415C170BC070EB1133EF8AE51280", hash_generated_method = "C8AF2D2470D4AE2BAE446AC2F4B6B0B0")
        @Override
public void setSource(Object info, View source) {
            AccessibilityNodeInfoCompatIcs.setSource(info, source);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.800 -0500", hash_original_method = "FF3C01EEB678F09ADF7342B2D20BBA32", hash_generated_method = "68BCF6BEE66DB1403AE813E2D8EF035A")
        @Override
public void setText(Object info, CharSequence text) {
            AccessibilityNodeInfoCompatIcs.setText(info, text);
        }

        @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.801 -0500", hash_original_method = "4487949C2661410233FC93B0FC70F4AF", hash_generated_method = "3E165CCF1F1883A3DC5E2292F5CA7577")
        @Override
public void recycle(Object info) {
            AccessibilityNodeInfoCompatIcs.recycle(info);
        }

        
    }


    
    static interface AccessibilityNodeInfoImpl {
        public Object obtain();
        public Object obtain(View source);
        public Object obtain(Object info);
        public void setSource(Object info, View source);
        public int getWindowId(Object info);
        public int getChildCount(Object info);
        public Object getChild(Object info, int index);
        public void addChild(Object info, View child);
        public int getActions(Object info);
        public void addAction(Object info, int action);
        public boolean performAction(Object info, int action);
        public List<Object> findAccessibilityNodeInfosByText(Object info, String text);
        public Object getParent(Object info);
        public void setParent(Object info, View parent);
        public void getBoundsInParent(Object info, Rect outBounds);
        public void setBoundsInParent(Object info, Rect bounds);
        public void getBoundsInScreen(Object info, Rect outBounds);
        public void setBoundsInScreen(Object info, Rect bounds);
        public boolean isCheckable(Object info);
        public void setCheckable(Object info, boolean checkable);
        public boolean isChecked(Object info);
        public void setChecked(Object info, boolean checked);
        public boolean isFocusable(Object info);
        public void setFocusable(Object info, boolean focusable);
        public boolean isFocused(Object info);
        public void setFocused(Object info, boolean focused);
        public boolean isSelected(Object info);
        public void setSelected(Object info, boolean selected);
        public boolean isClickable(Object info);
        public void setClickable(Object info, boolean clickable);
        public boolean isLongClickable(Object info);
        public void setLongClickable(Object info, boolean longClickable);
        public boolean isEnabled(Object info);
        public void setEnabled(Object info, boolean enabled);
        public boolean isPassword(Object info);
        public void setPassword(Object info, boolean password);
        public boolean isScrollable(Object info);
        public void setScrollable(Object info, boolean scrollable);
        public CharSequence getPackageName(Object info);
        public void setPackageName(Object info, CharSequence packageName);
        public CharSequence getClassName(Object info);
        public void setClassName(Object info, CharSequence className);
        public CharSequence getText(Object info);
        public void setText(Object info, CharSequence text);
        public CharSequence getContentDescription(Object info);
        public void setContentDescription(Object info, CharSequence contentDescription);
        public void recycle(Object info);
    }
    
    static {
        if (Build.VERSION.SDK_INT >= 14) { 
            IMPL = new AccessibilityNodeInfoIcsImpl();
        } else {
            IMPL = new AccessibilityNodeInfoStubImpl();
        }
    }

    /**
     * Gets the content description of this node.
     *
     * @return The content description.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.844 -0500", hash_original_method = "17A5AE651613EAEE40274E28D0DBF3CB", hash_generated_method = "7BA20ABCE576512166E9EC2E2C4CCBB0")
    public CharSequence getContentDescription() {
        return IMPL.getContentDescription(mInfo);
    }

    /**
     * Sets the content description of this node.
     * <p>
     * <strong>Note:</strong> Cannot be called from an
     * {@link android.accessibilityservice.AccessibilityService}. This class is
     * made immutable before being delivered to an AccessibilityService.
     * </p>
     *
     * @param contentDescription The content description.
     * @throws IllegalStateException If called from an AccessibilityService.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.845 -0500", hash_original_method = "0581568FD089D03E78C8C673EC290A8E", hash_generated_method = "68AF30028603DEE6092DD3B53086E5AA")
    public void setContentDescription(CharSequence contentDescription) {
        IMPL.setContentDescription(mInfo, contentDescription);
    }

    /**
     * Return an instance back to be reused.
     * <p>
     * <strong>Note:</strong> You must not touch the object after calling this function.
     *
     * @throws IllegalStateException If the info is already recycled.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.846 -0500", hash_original_method = "4012C2A77CF6E1C54F1B4372AFDF8962", hash_generated_method = "371816176A0FE984D43E7A281211A3A7")
    public void recycle() {
        IMPL.recycle(mInfo);
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.847 -0500", hash_original_method = "3D44C3AC54A391BB7EEFE6DCE99834D5", hash_generated_method = "1820D3808537E877B4E310BAB0EC6052")
    @Override
public int hashCode() {
        return (mInfo == null) ? 0 : mInfo.hashCode();
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:48:34.848 -0500", hash_original_method = "9F360410AD288A74DD17C77A13BAB054", hash_generated_method = "C5D6ED61C819BF3A883EE2D10FA827A0")
    @Override
public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        AccessibilityNodeInfoCompat other = (AccessibilityNodeInfoCompat) obj;
        if (mInfo == null) {
            if (other.mInfo != null) {
                return false;
            }
        } else if (!mInfo.equals(other.mInfo)) {
            return false;
        }
        return true;
    }
}

