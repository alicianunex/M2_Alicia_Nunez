package main;


import clases.AppIot;
import clases.AppMobile;
import clases.AppWeb;
import interfaces.AppIotServiceImpl;
import interfaces.AppMobileServiceImpl;
import interfaces.AppWebServiceImpl;

public class Main {
    public static void main(String[] args) {
        
       AppWebServiceImpl appWebServiceImpl=new AppWebServiceImpl();
       AppWeb appweb= appWebServiceImpl.createApp();
       appweb.setLanguage("Java");
       appweb.tech();
        System.out.println(appweb.toString());
        

        AppMobileServiceImpl appMobileServiceImpl=new AppMobileServiceImpl();
        AppMobile appmobile=appMobileServiceImpl.createAPP();
       System.out.println(appmobile.toString());

       AppIotServiceImpl appIotServiceImpl=new AppIotServiceImpl();
       AppIot appiot=appIotServiceImpl.createAPP();
        System.out.println(appiot.toString());
    }
  
}












