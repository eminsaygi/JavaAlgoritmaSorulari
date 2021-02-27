package soru4;

import java.util.Scanner;


public class Soru4 {

    
    public static void main(String[] args) {
      Scanner klavye = new Scanner(System.in);
      System.out.print("Boyunuzu cm cinsinden giriniz (Örn:183): ");
      double boy=klavye.nextInt();
      System.out.print("Kilonuzu kg cinsinden giriniz (Örn:82) : ");
      double kilo = klavye.nextInt();
        endeks(kilo, boy);
        System.out.println("Kontrol : "+endeks(kilo, boy));
        if (endeks(kilo, boy)<=18.4 && endeks(kilo, boy)>=0) {
            System.out.println("ZAYIF");
            
        }
        else if (endeks(kilo, boy)<=24.9 && endeks(kilo, boy)>=18.5) {
            System.out.println("NORMAL");
            
        }
         else  if (endeks(kilo, boy)<=29.9 && endeks(kilo, boy)>=25) {
            System.out.println("FAZLA KİLOLU");
            
        }
          else if (endeks(kilo, boy)<=34.9 && endeks(kilo, boy)>=30) {
            System.out.println("ŞİŞMAN(OBEZ)");
            
        }
           else if (endeks(kilo, boy)<44.9 && endeks(kilo, boy)>35) {
            System.out.println("2.SINIF OBEZ");
            
        }
            else if (endeks(kilo, boy)>45) {
            System.out.println("AŞIRI ŞİŞMAN");
            
        } else System.out.println("Hatalı giriş yaptınız.");
      
    }
    static double endeks(double a,double b){
        //MKS CİNSİNDEN YAZDIM
        return (b*1000)/(a*a);
        
    }
    
        
       
}