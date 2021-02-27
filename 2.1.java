package soru1;
import java.util.Scanner;

public class Soru1 {

    
    public static void main(String[] args) {
       Scanner a = new Scanner(System.in);
        System.out.print("İlk Sayıyı giriniz : ");
        int ilksayi = a.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
        int ikincisayi = a.nextInt();
         System.out.println("Girilen iki sayı arasındaki sayıların toplamı="+ toplam(ilksayi, ikincisayi));
         
        
    }
    static int toplam(int say1,int say2){
        int toplam=0;
        for (int i = say1; i <=say2; i++) {
            toplam+=i;
        }
        return toplam;
        
    }
    


}