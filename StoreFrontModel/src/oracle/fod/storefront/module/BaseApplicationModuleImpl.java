package oracle.fod.storefront.module;

import oracle.jbo.server.ApplicationModuleImpl;

public class BaseApplicationModuleImpl extends ApplicationModuleImpl {
    private String mCurrentUser=null;

    @Override
    public String getUserPrincipalName() {
        // TODO Implement this method
        if (mCurrentUser == null) {
            String userPrincipal ="DRAPHEAL";
            mCurrentUser    =userPrincipal;
        }
    return mCurrentUser;
    }

    public BaseApplicationModuleImpl() {
        super();
    }
}
