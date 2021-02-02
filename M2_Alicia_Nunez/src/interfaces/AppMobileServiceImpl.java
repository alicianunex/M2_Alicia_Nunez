
package interfaces;

import clases.AppMobile;


public class AppMobileServiceImpl implements AppMobileService{

    @Override
    public AppMobile createAPP() {
     String[] permission={"music","camera","location"};
     AppMobile appmobile=new AppMobile(true, permission);
     
     return appmobile;
    }
    
}












