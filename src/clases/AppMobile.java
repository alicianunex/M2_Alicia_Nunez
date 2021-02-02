package clases;

import java.util.Arrays;
import java.util.Scanner;

public class AppMobile extends AppSoftware {
    // atributes
    private boolean useHybrid;
    private String[] permission;
    // constructor
    public AppMobile() {
    }

    public AppMobile(boolean useHybrid,String[]permission) {
        //super();
        this.useHybrid = useHybrid;
        this.permission=permission;
    }

    public boolean isuseHybrid() {
        return useHybrid;
    }

    public void setuseHybrid(boolean useHybrid) {
        this.useHybrid = useHybrid;
    }

    public String[] getpermission() {
        return permission;
    }

    public void setpermission(String[] permission) {
        this.permission = permission;
    }

    @Override
    public void tech() {
        if (useHybrid == true) {
            System.out.println(getLanguage() + " use hybrid");
        } else {
            System.out.println(getLanguage() + " use native");
        }

    }

    @Override
    public String toString() {
        return "AppMobile{" + "useHybrid=" + useHybrid + ", Permission=" + Arrays.toString(Permission) + '}';
    }

    String tecnostack(){
      return null;
    }


    
}
 

