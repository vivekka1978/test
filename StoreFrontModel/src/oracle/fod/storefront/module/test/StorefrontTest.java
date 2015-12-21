package oracle.fod.storefront.module.test;

import oracle.jbo.ApplicationModule;
import oracle.jbo.Row;
import oracle.jbo.ViewObject;
import oracle.jbo.client.Configuration;


public class StorefrontTest {
    public StorefrontTest() {
        super();
    }

    public static void main(String[] args) {
       String amDef ="oracle.fod.storefront.module.test.TestAM"; 
       String config ="TestAMLocal";
       ApplicationModule am = Configuration.createRootApplicationModule(amDef, config);
       ViewObject vo =am.findViewObject("PaymentOptionV1");
       System.out.println("getEstimatedRowCount:"+ vo.getEstimatedRowCount()+ " rows");
        System.out.println("getRowCount :"+ vo.getRowCount()+ " rows");
        System.out.println("getRowCountInRange :"+ vo.getRowCountInRange()+ " rows");
         vo.executeQuery();
           while (vo.hasNext()){
               Row paymentOptionRow =vo.next();
               System.out.println("Customer id:"+paymentOptionRow.getAttribute("CustomerId")+" Payment type code:"+
                                  paymentOptionRow.getAttribute("PaymentTypeCode"));
           }
           Configuration.releaseRootApplicationModule(am, true);
    }
}
