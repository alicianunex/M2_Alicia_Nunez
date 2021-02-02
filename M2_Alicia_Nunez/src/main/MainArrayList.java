package main;

import java.util.Scanner;

import clases.AppMobile;
import clases.AppWeb;
import clases.AppIot;
import clases.EProtocols;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> app = new ArrayList<String>();
    app.add("AppWeb");
    app.add("AppMobile");
    app.add("AppIot");
    for (String i : app) {
      System.out.println(i);
    }
  
    ArrayList<String> app = new ArrayList<String>();

            int contador =0;
            while ( contador <= 3 ) {
               System.out.println("Trying");
               String Y = sc.next();
               System.out.println("String1");
               String Z = sc.next();
               System.out.println("String2");
               contador++;
            }
}
