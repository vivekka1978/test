package oracle.fod.storefront.entity;

import oracle.jbo.Key;
import oracle.jbo.domain.DBSequence;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Nov 16 15:43:33 PST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SupplierEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        SupplierId,
        SupplierName,
        SupplierStatus,
        PhoneNumber,
        Email,
        UiSkin,
        CreatedBy,
        CreationDate,
        LastUpdatedBy,
        LastUpdateDate,
        ObjectVersionId;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }

    public static final int SUPPLIERID = AttributesEnum.SupplierId.index();
    public static final int SUPPLIERNAME = AttributesEnum.SupplierName.index();
    public static final int SUPPLIERSTATUS = AttributesEnum.SupplierStatus.index();
    public static final int PHONENUMBER = AttributesEnum.PhoneNumber.index();
    public static final int EMAIL = AttributesEnum.Email.index();
    public static final int UISKIN = AttributesEnum.UiSkin.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int OBJECTVERSIONID = AttributesEnum.ObjectVersionId.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SupplierEOImpl() {
    }

    /**
     * @param supplierId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(DBSequence supplierId) {
        return new Key(new Object[] { supplierId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("oracle.fod.storefront.entity.SupplierEO");
    }


    @Override
    protected Object getHistoryContextForAttribute(AttributeDefImpl attributeDefImpl) {
        // TODO Implement this method
        Object value =super.getHistoryContextForAttribute(attributeDefImpl);
        /*
         * If the value is NULL and is modifiy user or create user, return user 
         * value as anonymous.
         * 
         */
        if  (( value == null) && (attributeDefImpl.getHistoryKind()== attributeDefImpl.HISTORY_MODIFY_USER || attributeDefImpl.getHistoryKind()== attributeDefImpl.HISTORY_CREATE_USER) )
               {
                   return "anonymous";
               }
        return value;
    }

}
