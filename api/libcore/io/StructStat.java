package libcore.io;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;



public final class StructStat {
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:37.750 -0500", hash_original_field = "D5228789103CCAD759E68428DAA475E0", hash_generated_field = "219514068DCC6E28620F0B134974345C")

    public  long st_dev;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:37.751 -0500", hash_original_field = "B081C9C195F1E84A22DB598D1A35E781", hash_generated_field = "3BE7AADBFEC6C43E78BE173BFDC50589")


    /** File serial number (inode). */
    public  long st_ino;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:37.752 -0500", hash_original_field = "5A6ED64AAADAE732235E47AE3826A0EC", hash_generated_field = "7B6691B662C9BDF63ED70415BD3762B9")


    /** Mode (permissions) of file. */
    public  int st_mode;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:37.752 -0500", hash_original_field = "890E1CF6CF474C0945C9A4E7230D4C9E", hash_generated_field = "E8BC0AC9C308AB636E1AF4C58D104DAB")


    /** Number of hard links to the file. */
    public  long st_nlink;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:37.753 -0500", hash_original_field = "CB9C7747EDFCF74F582477F43C2143DF", hash_generated_field = "476B0D33EDFA825E7DD8599BCD4E085F")


    /** User ID of file. */
    public  int st_uid;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:37.754 -0500", hash_original_field = "F7A2584DDBC394FD884ED245AD4E76AE", hash_generated_field = "D91C1FF83C6DDCC666657B50E79D026D")


    /** Group ID of file. */
    public  int st_gid;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:37.755 -0500", hash_original_field = "FB354CF30655174997FC560C2BA39231", hash_generated_field = "40278925D5657F563A10DC88927CFEAF")


    /** Device ID (if file is character or block special). */
    public  long st_rdev;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:37.755 -0500", hash_original_field = "CF626E4CB89B0D420EA59BDB2ACF8F81", hash_generated_field = "F3BC01D145779361AC6164F040FC9C7C")


    /**
     * For regular files, the file size in bytes.
     * For symbolic links, the length in bytes of the pathname contained in the symbolic link.
     * For a shared memory object, the length in bytes.
     * For a typed memory object, the length in bytes.
     * For other file types, the use of this field is unspecified.
     */
    public  long st_size;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:37.756 -0500", hash_original_field = "07BA90BF457EBA2F20FAC03B09641AE6", hash_generated_field = "2B0C30B071C285B6FF6489F53B1A14EF")


    /** Time of last access. */
    public  long st_atime;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:37.757 -0500", hash_original_field = "D9A4146328ADAFC3C28B971782A91FEC", hash_generated_field = "B41B5CD87A2C233536B74F413DEF81F9")


    /** Time of last data modification. */
    public  long st_mtime;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:37.758 -0500", hash_original_field = "63712240F78299E96C37D98F55BB734F", hash_generated_field = "C514220DA80D4952DC7BA4B8D920D805")


    /** Time of last status change. */
    public  long st_ctime;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:37.758 -0500", hash_original_field = "74DCEC43FDB6D6DCF44C7670D9FC57AE", hash_generated_field = "356DBDB7017FC591793DFF7F89073887")


    /**
     * A file system-specific preferred I/O block size for this object.
     * For some file system types, this may vary from file to file.
     */
    public  long st_blksize;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:37.759 -0500", hash_original_field = "D044A2122BC962AC1CFB9E06007ECC26", hash_generated_field = "ACF662B2C221E14843272BA4C18B1929")


    /** Number of blocks allocated for this object. */
    public  long st_blocks; /*blkcnt_t*/

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:37.760 -0500", hash_original_method = "22486884C03B7F82D2DEC9BC949FA3E4", hash_generated_method = "22486884C03B7F82D2DEC9BC949FA3E4")
    StructStat(long st_dev, long st_ino, int st_mode, long st_nlink, int st_uid, int st_gid,
            long st_rdev, long st_size, long st_atime, long st_mtime, long st_ctime,
            long st_blksize, long st_blocks) {
        this.st_dev = st_dev;
        this.st_ino = st_ino;
        this.st_mode = st_mode;
        this.st_nlink = st_nlink;
        this.st_uid = st_uid;
        this.st_gid = st_gid;
        this.st_rdev = st_rdev;
        this.st_size = st_size;
        this.st_atime = st_atime;
        this.st_mtime = st_mtime;
        this.st_ctime = st_ctime;
        this.st_blksize = st_blksize;
        this.st_blocks = st_blocks;
    }

    
}

