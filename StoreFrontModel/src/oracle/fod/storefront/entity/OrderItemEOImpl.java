package oracle.fod.storefront.entity;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Nov 14 19:57:27 PST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class OrderItemEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        OrderId,
        LineItemId,
        ProductId,
        Quantity,
        UnitPrice,
        CreatedBy,
        CreationDate,
        LastUpdatedBy,
        LastUpdateDate,
        ObjectVersionId,
        Order,
        Order1,
        Product,
        ProductVVO1;
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


    public static final int ORDERID = AttributesEnum.OrderId.index();
    public static final int LINEITEMID = AttributesEnum.LineItemId.index();
    public static final int PRODUCTID = AttributesEnum.ProductId.index();
    public static final int QUANTITY = AttributesEnum.Quantity.index();
    public static final int UNITPRICE = AttributesEnum.UnitPrice.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int OBJECTVERSIONID = AttributesEnum.ObjectVersionId.index();
    public static final int ORDER = AttributesEnum.Order.index();
    public static final int ORDER1 = AttributesEnum.Order1.index();
    public static final int PRODUCT = AttributesEnum.Product.index();
    public static final int PRODUCTVVO1 = AttributesEnum.ProductVVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public OrderItemEOImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("oracle.fod.storefront.entity.OrderItemEO");
    }


    /**
     * Gets the attribute value for OrderId, using the alias name OrderId.
     * @return the value of OrderId
     */
    public Long getOrderId() {
        return (Long) getAttributeInternal(ORDERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for OrderId.
     * @param value value to set the OrderId
     */
    public void setOrderId(Long value) {
        setAttributeInternal(ORDERID, value);
    }

    /**
     * Gets the attribute value for LineItemId, using the alias name LineItemId.
     * @return the value of LineItemId
     */
    public oracle.jbo.domain.Number getLineItemId() {
        return (oracle.jbo.domain.Number) getAttributeInternal(LINEITEMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for LineItemId.
     * @param value value to set the LineItemId
     */
    public void setLineItemId(oracle.jbo.domain.Number value) {
        setAttributeInternal(LINEITEMID, value);
    }

    /**
     * Gets the attribute value for ProductId, using the alias name ProductId.
     * @return the value of ProductId
     */
    public Long getProductId() {
        return (Long) getAttributeInternal(PRODUCTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProductId.
     * @param value value to set the ProductId
     */
    public void setProductId(Long value) {
        setAttributeInternal(PRODUCTID, value);
    }

    /**
     * Gets the attribute value for Quantity, using the alias name Quantity.
     * @return the value of Quantity
     */
    public oracle.jbo.domain.Number getQuantity() {
        return (oracle.jbo.domain.Number) getAttributeInternal(QUANTITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Quantity.
     * @param value value to set the Quantity
     */
    public void setQuantity(oracle.jbo.domain.Number value) {
        setAttributeInternal(QUANTITY, value);
    }

    /**
     * Gets the attribute value for UnitPrice, using the alias name UnitPrice.
     * @return the value of UnitPrice
     */
    public BigDecimal getUnitPrice() {
        return (BigDecimal) getAttributeInternal(UNITPRICE);
    }

    /**
     * Sets <code>value</code> as the attribute value for UnitPrice.
     * @param value value to set the UnitPrice
     */
    public void setUnitPrice(BigDecimal value) {
        setAttributeInternal(UNITPRICE, value);
    }

    

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the value of CreationDate
     */
    public Timestamp getCreationDate() {
        return (Timestamp) getAttributeInternal(CREATIONDATE);
    }

    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the value of LastUpdatedBy
     */
    public String getLastUpdatedBy() {
        return (String) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedBy.
     * @param value value to set the LastUpdatedBy
     */
    public void setLastUpdatedBy(String value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LastUpdateDate, using the alias name LastUpdateDate.
     * @return the value of LastUpdateDate
     */
    public Timestamp getLastUpdateDate() {
        return (Timestamp) getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Gets the attribute value for ObjectVersionId, using the alias name ObjectVersionId.
     * @return the value of ObjectVersionId
     */
    public Long getObjectVersionId() {
        return (Long) getAttributeInternal(OBJECTVERSIONID);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public OrderEOImpl getOrder() {
        return (OrderEOImpl) getAttributeInternal(ORDER);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setOrder(OrderEOImpl value) {
        setAttributeInternal(ORDER, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public OrderEOImpl getOrder1() {
        return (OrderEOImpl) getAttributeInternal(ORDER1);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setOrder1(OrderEOImpl value) {
        setAttributeInternal(ORDER1, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getProduct() {
        return (RowIterator) getAttributeInternal(PRODUCT);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ProductVVO1.
     */
    public RowSet getProductVVO1() {
        return (RowSet) getAttributeInternal(PRODUCTVVO1);
    }

    /**
     * @param orderId key constituent
     * @param lineItemId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Long orderId, Number lineItemId) {
        return new Key(new Object[] { orderId, lineItemId });
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

    @Override
    protected void initDefaults() {
        // TODO Implement this method
        super.initDefaults();
        SequenceImpl seq= new SequenceImpl("ORDER_ITEMS_SEQ",getDBTransaction());
        populateAttributeAsChanged(LINEITEMID, seq.getSequenceNumber());
    }

}

