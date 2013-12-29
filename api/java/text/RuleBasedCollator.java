package java.text;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import libcore.icu.RuleBasedCollatorICU;




public class RuleBasedCollator extends Collator {
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:18.974 -0500", hash_original_method = "31FBA21C05DBD02C02879BE90D845185", hash_generated_method = "31FBA21C05DBD02C02879BE90D845185")
    RuleBasedCollator(RuleBasedCollatorICU wrapper) {
        super(wrapper);
    }

    /**
     * Constructs a new instance of {@code RuleBasedCollator} using the
     * specified {@code rules}. The {@code rules} are usually either
     * hand-written based on the {@link RuleBasedCollator class description} or
     * the result of a former {@link #getRules()} call.
     * <p>
     * Note that the {@code rules} are actually interpreted as a delta to the
     * standard Unicode Collation Algorithm (UCA). This differs
     * slightly from other implementations which work with full {@code rules}
     * specifications and may result in different behavior.
     *
     * @param rules
     *            the collation rules.
     * @throws NullPointerException
     *             if {@code rules == null}.
     * @throws ParseException
     *             if {@code rules} contains rules with invalid collation rule
     *             syntax.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:18.975 -0500", hash_original_method = "A2DABBE445FB3F5820A862D094AFC471", hash_generated_method = "840BD50A6031165BD7BE803F46CCD2A6")
    public RuleBasedCollator(String rules) throws ParseException {
        if (rules == null) {
            throw new NullPointerException();
        }
        if (rules.isEmpty()) {
            throw new ParseException("empty rules", 0);
        }
        try {
            icuColl = new RuleBasedCollatorICU(rules);
        } catch (Exception e) {
            if (e instanceof ParseException) {
                throw (ParseException) e;
            }
            /*
             * -1 means it's not a ParseException. Maybe IOException thrown when
             * an error occurred while reading internal data.
             */
            throw new ParseException(e.getMessage(), -1);
        }
    }

    /**
     * Obtains a {@code CollationElementIterator} for the given
     * {@code CharacterIterator}. The source iterator's integrity will be
     * preserved since a new copy will be created for use.
     *
     * @param source
     *            the source character iterator.
     * @return a {@code CollationElementIterator} for {@code source}.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:18.976 -0500", hash_original_method = "C93FCBD8C41C04013259A24B3BA25AFC", hash_generated_method = "19E5E258C162D2AA8B88185575754404")
    public CollationElementIterator getCollationElementIterator(CharacterIterator source) {
        if (source == null) {
            throw new NullPointerException();
        }
        return new CollationElementIterator(icuColl.getCollationElementIterator(source));
    }

    /**
     * Obtains a {@code CollationElementIterator} for the given string.
     *
     * @param source
     *            the source string.
     * @return the {@code CollationElementIterator} for {@code source}.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:18.976 -0500", hash_original_method = "0A03AD4A8EA2D5EFD885AFF079D1FBF8", hash_generated_method = "AD1B8AD7AFE2E9C0E340482B3A9D095A")
    public CollationElementIterator getCollationElementIterator(String source) {
        if (source == null) {
            throw new NullPointerException();
        }
        return new CollationElementIterator(icuColl.getCollationElementIterator(source));
    }

    /**
     * Returns the collation rules of this collator. These {@code rules} can be
     * fed into the {@code RuleBasedCollator(String)} constructor.
     * <p>
     * Note that the {@code rules} are actually interpreted as a delta to the
     * standard Unicode Collation Algorithm (UCA). Hence, an empty {@code rules}
     * string results in the default UCA rules being applied. This differs
     * slightly from other implementations which work with full {@code rules}
     * specifications and may result in different behavior.
     *
     * @return the collation rules.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:18.977 -0500", hash_original_method = "FF8EDD58F3376852427F0295E98F1202", hash_generated_method = "883506D97BFF401123E80AC480D00700")
    public String getRules() {
        return icuColl.getRules();
    }

    /**
     * Returns a new collator with the same collation rules, decomposition mode and
     * strength value as this collator.
     *
     * @return a shallow copy of this collator.
     * @see java.lang.Cloneable
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:18.978 -0500", hash_original_method = "FBA963D7A9FB0658F4932AD387478243", hash_generated_method = "BD7CF7AD8C750BA12A60D8708AABA86F")
    @Override
public Object clone() {
        RuleBasedCollator clone = (RuleBasedCollator) super.clone();
        return clone;
    }

    /**
     * Compares the {@code source} text to the {@code target} text according to
     * the collation rules, strength and decomposition mode for this
     * {@code RuleBasedCollator}. See the {@code Collator} class description
     * for an example of use.
     * <p>
     * General recommendation: If comparisons are to be done with the same strings
     * multiple times, it is more efficient to generate {@code CollationKey}
     * objects for the strings and use
     * {@code CollationKey.compareTo(CollationKey)} for the comparisons. If each
     * string is compared to only once, using
     * {@code RuleBasedCollator.compare(String, String)} has better performance.
     *
     * @param source
     *            the source text.
     * @param target
     *            the target text.
     * @return an integer which may be a negative value, zero, or else a
     *         positive value depending on whether {@code source} is less than,
     *         equivalent to, or greater than {@code target}.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:18.979 -0500", hash_original_method = "6590B43BC0A35CBDE76A6B18FA6459C5", hash_generated_method = "0DF60C39C52DB2B5C9099A792AE49CAE")
    @Override
public int compare(String source, String target) {
        if (source == null || target == null) {
            throw new NullPointerException();
        }
        return icuColl.compare(source, target);
    }

    /**
     * Returns the {@code CollationKey} for the given source text.
     *
     * @param source
     *            the specified source text.
     * @return the {@code CollationKey} for the given source text.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:18.980 -0500", hash_original_method = "A9AF4E46AA414E7FF98E8748BB278551", hash_generated_method = "FF55CC53E57881B8F6A0E0C8E176DD06")
    @Override
public CollationKey getCollationKey(String source) {
        return icuColl.getCollationKey(source);
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:18.980 -0500", hash_original_method = "B4EBBD96DB20771CAD5EB8825D399E3B", hash_generated_method = "FBDB92B114BF8DE843F423E76B85435F")
    @Override
public int hashCode() {
        return icuColl.getRules().hashCode();
    }

    /**
     * Compares the specified object with this {@code RuleBasedCollator} and
     * indicates if they are equal. In order to be equal, {@code object} must be
     * an instance of {@code Collator} with the same collation rules and the
     * same attributes.
     *
     * @param obj
     *            the object to compare with this object.
     * @return {@code true} if the specified object is equal to this
     *         {@code RuleBasedCollator}; {@code false} otherwise.
     * @see #hashCode
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:45:18.981 -0500", hash_original_method = "1D9A70F4229C9ABE49C60D2B9C1F5E2A", hash_generated_method = "508188801AE74624F2F85A8DB46E72E5")
    @Override
public boolean equals(Object obj) {
        if (!(obj instanceof Collator)) {
            return false;
        }
        return super.equals(obj);
    }

    
}

