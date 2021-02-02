
package interfaces;

import clases.AppWeb;


public class AppWebServiceImpl implements AppWebService{

    @Override
    public AppWeb createApp() {
        AppWeb web=new AppWeb("React", "ReactNative");
        return web;
    }
    
}













