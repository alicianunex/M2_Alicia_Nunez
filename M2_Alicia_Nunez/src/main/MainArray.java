package main;

import clases.AppIot;
import clases.AppMobile;
import clases.AppWeb;
import clases.EProtocols;
import java.util.Arrays;
import java.util.Scanner;

public class MainArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter operation\n");
        int AppExample = sc.nextInt();
        if (AppExample == 1) {
            AppWeb[] webs = new AppWeb[2];
            for (int i = 0; i < 2; i++) {
                System.out.print("enter first object \n");
                String Y = sc.next();
                String Z = sc.next();
                webs[i] = new AppWeb(Y, Z);
                System.out.println(webs[i].toString());
            }

            // 
        } else if (AppExample == 2) {

            AppMobile[] appMobiles = new AppMobile[2];
            
            

            for (int i = 0; i < appMobiles.length; i++) {
                System.out.print("useHybrid: enter for "+i+" object  \n");
                boolean Y = sc.nextBoolean();
                appMobiles[i] = new AppMobile(Y, permission());  
            } sc.close();
            for (AppMobile appMobile : appMobiles) {
                  System.out.println(appMobile.toString()); 
            }

    
        } else if (AppExample == 3) {
            AppIot[] appIots = new AppIot[2];
            int i;
            for (i = 0; i < appIots.length; i++) {
                System.out.print("enter");
                boolean Y = sc.nextBoolean();
                boolean Z = sc.nextBoolean();
                EProtocols X = EProtocols.valueOf(sc.next());
                appIots[i] = new AppIot(Y, Z, X);
                System.out.println(appIots[i].toString());

            }

        } else {
            System.out.println("out");
        }

    }

    public static String[] permission() {
        Scanner sc = new Scanner(System.in);
        String[] per = new String[3];
        for (int i = 0; i < per.length; i++) {
            System.out.println("set permission " + i + " permission");
            permission[i] = sc.next();

        }
        return permission;

    }

}

