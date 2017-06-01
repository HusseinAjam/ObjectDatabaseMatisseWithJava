/*
 * ComissionBidsDetails.java
 *
 * Generated with Matisse Schema Definition Language 9.1.8
 * Generation date: Thu Apr 07 21:16:54 2016
 */

// Note: the package and extends declarations are generated by mt_sdl, do not modify them

import com.matisse.reflect.*;

/**
 * <code>ComissionBidsDetails</code> is a schema class generated by <code>mt_sdl</code>.
 * Any user-written classes will be found at the end of the file, after
 * the '// END of Matisse SDL Generated Code' comment.
 * Attribute types, default values, and relationship minimum and maximum
 * cardinality are stored in the database itself, not in this source code.
 * For more information, see <i>Getting Started with MATISSE</i>.
 */
public class ComissionBidsDetails extends com.matisse.reflect.MtObject {

    // BEGIN Matisse SDL Generated Code
    // DO NOT MODIFY UNTIL THE 'END of Matisse SDL Generated Code' MARK BELOW
    /*
     * Generated with Matisse Schema Definition Language 9.1.8
     * Generation Date: Thu Apr 07 21:16:54 2016
     */

    /*
     * Class variables and methods
     */

    /** Class <code>ComissionBidsDetails</code> cache ID */
    private static int CID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtClass.Loader("ComissionBidsDetails"));

    /**
     * Gets the <code>ComissionBidsDetails</code> class descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db a database
     * @return a class descriptor
     */
    public static com.matisse.reflect.MtClass getClass(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtClass)db.getCachedObject(CID);
    }

    /**
     * Factory constructor. This constructor is called by <code>MtObjectFactory</code>.
     * It is public for technical reasons but is not intended to be called
     * directly by user methods.
     * @param db a database
     * @param mtOid an existing object ID in the database
     */
    public ComissionBidsDetails(com.matisse.MtDatabase db, int mtOid)  {
        super(db, mtOid);
    }

    /**
     * Cascaded constructor, used by subclasses to create a new object in the database.
     * It is protected for technical reasons but is not intended to be called
     * directly by user methods.
     * @param mtCls a class descriptor (the class to instantiate)
     */
    protected ComissionBidsDetails(com.matisse.reflect.MtClass mtCls)  {
        super(mtCls);
    }

    /**
     * Opens an iterator on all instances of this class (and its subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> instanceIterator(com.matisse.MtDatabase db) {
        return getClass(db).<E>instanceIterator(ComissionBidsDetails.class);
    }

    /**
     * Opens an iterator on all instances of this class (and its subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @param numObjPerBuffer maximum number of objects to fetch from the server at a time
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> instanceIterator(com.matisse.MtDatabase db, int numObjPerBuffer) {
        return getClass(db).<E>instanceIterator(numObjPerBuffer, ComissionBidsDetails.class);
    }

    /**
     * Counts the number of instances of this class (and its subclasses).
     * @param db a database
     * @return total number of instances
     */
    public static long getInstanceNumber(com.matisse.MtDatabase db) {
        return getClass(db).getInstanceNumber();
    }

    /**
     * Opens an iterator on all own instances of this class (excluding subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> ownInstanceIterator(com.matisse.MtDatabase db) {
        return getClass(db).<E>ownInstanceIterator(ComissionBidsDetails.class);
    }

    /**
     * Opens an iterator on all own instances of this class (excluding subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @param numObjPerBuffer maximum number of objects to fetch from the server at a time
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> ownInstanceIterator(com.matisse.MtDatabase db, int numObjPerBuffer) {
        return getClass(db).<E>ownInstanceIterator(numObjPerBuffer, ComissionBidsDetails.class);
    }

    /**
     * Counts the number of own instances of this class (excluding subclasses).
     * @param db a database
     * @return total number of instances
     */
    public static long getOwnInstanceNumber(com.matisse.MtDatabase db) {
        return getClass(db).getOwnInstanceNumber();
    }

    /*
     * Attribute access methods
     */

    /* Attribute 'ArtLotNo' */

    /** Attribute <code>ArtLotNo</code> cache ID */
    private static int artLotNoCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("ArtLotNo",CID));

    /**
     * Gets the <code>ArtLotNo</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getArtLotNoAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(artLotNoCID);
    }


    /**
     * Gets the <code>ArtLotNo</code> attribute value.
     * @return the value
     *
     * @see #setArtLotNo
     * @see #removeArtLotNo
     */
    public final int getArtLotNo() {
        return getInteger(getArtLotNoAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>ArtLotNo</code> attribute value.
     * @param val the new value
     *
     * @see #getArtLotNo
     * @see #removeArtLotNo
     */
    public final void setArtLotNo(int val) {
        setInteger(getArtLotNoAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>ArtLotNo</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getArtLotNo
     * @see #setArtLotNo
     */
    public final void removeArtLotNo() {
        removeValue(getArtLotNoAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getArtLotNo
     * @see #setArtLotNo
     */
    public final boolean isArtLotNoDefaultValue() {
        return isDefaultValue(getArtLotNoAttribute(getMtDatabase()));
    }

    /* EntryPoint 'findBidding' of attribute 'ArtLotNo' */

    /** EntryPointDictionary <code>findBidding</code> cache ID */
    private static int findBiddingDictionaryCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtEntryPointDictionary.Loader("findBidding"));

    /**
     * Gets the <code>findBidding</code> entry point dictionary descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the dictionary
     * @return the entry point dictionary descriptor object
     */
    public static com.matisse.reflect.MtEntryPointDictionary getFindBiddingDictionary(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtEntryPointDictionary)db.getCachedObject(findBiddingDictionaryCID);
    }

    /**
     * Finds the <code>ComissionBidsDetails</code> object where <code>ArtLotNo</code> matches this value.
     * @param db a database
     * @param value the search string
     * @return the matching <code>ComissionBidsDetails</code> or <code>null</code> if none was found
     * @throws MtException if more than one match found
     */
    public static ComissionBidsDetails lookupFindBidding(com.matisse.MtDatabase db, String value) {
        return (ComissionBidsDetails)getFindBiddingDictionary(db).lookup(value, getClass(db));
    }

    /**
     * Creates an iterator on all <code>ComissionBidsDetails</code> objects where <code>ArtLotNo</code> matches this value.
     * @param <E> a MtObject class     * @param db a database
     * @param value the search string
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> findBiddingIterator(com.matisse.MtDatabase db, String value) {
        return getFindBiddingDictionary(db).<E>iterator(value, getClass(db), ComissionBidsDetails.class);
    }

    /**
     * Creates an iterator on all <code>ComissionBidsDetails</code> objects where <code>ArtLotNo</code> matches this value.
     * Use this method to restrict the iterator to members of a subclass of this class,
     * or to set a maximum number of objects.
     * @param <E> a MtObject class     * @param db a database
     * @param value the search string
     * @param filterClass a subclass; use <code>null</code> not to restrict iterator to a subclass
     * @param numObjPerBuffer maximum number of objects to include in the iterator
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> findBiddingIterator(com.matisse.MtDatabase db, String value, com.matisse.reflect.MtClass filterClass, int numObjPerBuffer) {
        return getFindBiddingDictionary(db).<E>iterator(value, filterClass, numObjPerBuffer, ComissionBidsDetails.class);
    }


    /* Attribute 'StartFromBidding' */

    /** Attribute <code>StartFromBidding</code> cache ID */
    private static int startFromBiddingCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("StartFromBidding",CID));

    /**
     * Gets the <code>StartFromBidding</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getStartFromBiddingAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(startFromBiddingCID);
    }


    /**
     * Gets the <code>StartFromBidding</code> attribute value.
     * @return the value
     *
     * @see #setStartFromBidding
     * @see #removeStartFromBidding
     */
    public final double getStartFromBidding() {
        return getDouble(getStartFromBiddingAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>StartFromBidding</code> attribute value.
     * @param val the new value
     *
     * @see #getStartFromBidding
     * @see #removeStartFromBidding
     */
    public final void setStartFromBidding(double val) {
        setDouble(getStartFromBiddingAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>StartFromBidding</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getStartFromBidding
     * @see #setStartFromBidding
     */
    public final void removeStartFromBidding() {
        removeValue(getStartFromBiddingAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getStartFromBidding
     * @see #setStartFromBidding
     */
    public final boolean isStartFromBiddingDefaultValue() {
        return isDefaultValue(getStartFromBiddingAttribute(getMtDatabase()));
    }


    /* Attribute 'MaximumBidding' */

    /** Attribute <code>MaximumBidding</code> cache ID */
    private static int maximumBiddingCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("MaximumBidding",CID));

    /**
     * Gets the <code>MaximumBidding</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getMaximumBiddingAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(maximumBiddingCID);
    }


    /**
     * Gets the <code>MaximumBidding</code> attribute value.
     * @return the value
     *
     * @see #setMaximumBidding
     * @see #removeMaximumBidding
     */
    public final double getMaximumBidding() {
        return getDouble(getMaximumBiddingAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>MaximumBidding</code> attribute value.
     * @param val the new value
     *
     * @see #getMaximumBidding
     * @see #removeMaximumBidding
     */
    public final void setMaximumBidding(double val) {
        setDouble(getMaximumBiddingAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>MaximumBidding</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getMaximumBidding
     * @see #setMaximumBidding
     */
    public final void removeMaximumBidding() {
        removeValue(getMaximumBiddingAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getMaximumBidding
     * @see #setMaximumBidding
     */
    public final boolean isMaximumBiddingDefaultValue() {
        return isDefaultValue(getMaximumBiddingAttribute(getMtDatabase()));
    }


    /*
     * Relationship access methods
     */

    /* Relationship 'actual_buyer' */

    /** Relationship <code>actual_buyer</code> cache ID */
    private static int actual_buyerCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtRelationship.Loader("actual_buyer",CID));

    /**
     * Gets the <code>actual_buyer</code> relationship descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db a database
     * @return a relationship descriptor object
     */
    public static com.matisse.reflect.MtRelationship getActual_buyerRelationship(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtRelationship)db.getCachedObject(actual_buyerCID);
    }

    /**
     * Gets the <code>actual_buyer</code> relationship's successors.
     * @return an array of objects
     *
     * @see #getActual_buyerSize
     * @see #actual_buyerIterator
     */
    public final BuyerClient[] getActual_buyer() {
        return (BuyerClient[])getSuccessors(getActual_buyerRelationship(getMtDatabase()), BuyerClient.class);
    }

    /**
     * Counts the <code>actual_buyer</code> relationship's successors.
     * @return the number of successors
     *
     * @see #getActual_buyer
     * @see #actual_buyerIterator
     */
    public final int getActual_buyerSize() {
        return getSuccessorSize(getActual_buyerRelationship(getMtDatabase()));
    }

    /**
     * Opens an iterator on the <code>actual_buyer</code> relationship's successors.
     * @param <E> a MtObject class     * @return an object iterator
     *
     * @see #getActual_buyer
     * @see #getActual_buyerSize
     */
    public final <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> actual_buyerIterator() {
        return this.<E>successorIterator(getActual_buyerRelationship(getMtDatabase()), BuyerClient.class);
    }


    // END of Matisse SDL Generated Code

    /*
     * You may add your own code here...
     */

    /**
     * Default constructor provided as an example.
     * You may delete this constructor or modify it to suit your needs. If you
     * modify it, please revise this comment accordingly.
     * @param db a database
     */
    public ComissionBidsDetails(com.matisse.MtDatabase db) {
        super(getClass(db));
    }

    /**
     * Example of <code>toString</code> method.
     * You may delete this method or modify it to suit your needs. If you
     * modify it, please revise this comment accordingly.
     * @return a string
     */
    public java.lang.String toString() {
        return super.toString() + "[ComissionBidsDetails]";
    }
}
