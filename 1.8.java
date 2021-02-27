package soru3;
import java.util.Scanner;

public class Soru3 {

   
    public static void main(String[] args) {
    
        
        int toplam = 0;
        int  deneme =2;
        toplam = (int)(deneme*(0.2));
        
      Scanner klavye = new Scanner(System.in);
      System.out.print("Vizenizi giriniz : ");
      int vize=klavye.nextInt();
      System.out.print("Finalizi giriniz : ");
      int finnal = klavye.nextInt();
        System.out.println("Ortalamanız : "+hesapla(vize, finnal));
        if (hesapla(vize, finnal)<=100 && hesapla(vize, finnal)>=90) {
            System.out.println("A");
        }
        else if (hesapla(vize, finnal)<=89 && hesapla(vize, finnal)>=80) {
            System.out.println("b");
        }
        else if (hesapla(vize, finnal)<=79 && hesapla(vize, finnal)>=70) {
            System.out.println("C");
        }
        else if (hesapla(vize, finnal)<=69 && hesapla(vize, finnal)>=60) {
            System.out.println("D");
        }
       else if (hesapla(vize, finnal)<=59 && hesapla(vize, finnal)>=50) {
            System.out.println("F");
        }
      
       else System.err.println("KALDINIZ :( ");
       
        
    }
    static int hesapla(int a,int b){
       
     
      return  (int)(a*0.4+b*0.6);
       
             
    }
    
}