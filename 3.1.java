package soru3;
import java.util.*;
public class Soru3 {
    public static char karakterUret(char karakter1 , char karakter2){
       
         
        return (char)(karakter1+Math.random()*(karakter2-karakter1+1));
        
    }
    
   public static char kucukKarakterUret(char karakter1 , char karakter2){
        
       return karakterUret('a', 'z');
   }
    
    public static char buyukKarakterUret(char karakter1 , char karakter2){
        
       return karakterUret('A', 'Z');
   } 
     
     public static char rakamUret(char karakter1 , char karakter2){
        
       return karakterUret('0', '9');
   } 

    public static void main(String[] args) {
       Scanner a = new Scanner(System.in);
       System.out.print("Büyük harf adedini giriniz : ");
       int B_harf = a.nextInt();
       System.out.print("Küçük harf adedini giriniz :  ");
       int K_harf = a.nextInt();   
       System.out.print("Rakam adedini giriniz : ");
       int rakam =a.nextInt();
       StringBuilder butunKarakterler =  new StringBuilder("");
       char B_uretilenKarakter; 
       char K_uretilenKarakter;
       char uretilenRakam;     
        int uzunluk =10;
        uzunluk/=3;
        for (int i = 0; i < uzunluk; i++) {     
           K_uretilenKarakter=kucukKarakterUret('a','z');
           B_uretilenKarakter=buyukKarakterUret('A', 'Z');
           uretilenRakam=rakamUret('0', '9');
           butunKarakterler.append(B_uretilenKarakter);
           butunKarakterler.append(K_uretilenKarakter);
           butunKarakterler.append(uretilenRakam);
        }
        uretilenRakam=rakamUret('0', '9');
        butunKarakterler.append(uretilenRakam);
        
        System.out.println("********************************************");
        System.out.println("* 10 Elemanlı CAPTHA Şifremiz : "+butunKarakterler+" *");
        System.out.println("********************************************");
        
    }     
}