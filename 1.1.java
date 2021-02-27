package soru10;
import java.util.*;

public class Soru10 {

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner a = new Scanner(System.in);
        System.out.print("Dizi boyutunu belirleyiniz : ");
        int boyut = a.nextInt();
            int[] sayilar = new int[boyut];
            for(int i=0;i<sayilar.length;i++)
            {
                sayilar[i] = rnd.nextInt(100)+1;
                System.out.print(sayilar[i]+" " );
            }
            System.out.println("");
          
            System.out.println("-----------------------------------------------");
            System.out.println("Dizi içindeki sayıların toplamı :" + Topla(sayilar));
            System.out.println("-----------------------------------------------");
            System.out.println("Dizi içindeki sayıların ortalaması :" + Ortalama(sayilar));
            System.out.println("-----------------------------------------------");
            System.out.println("Dizi içindeki en büyük sayı  : "+buyuk(sayilar));
            System.out.println("-----------------------------------------------");
            System.out.println("Dizi içindeki en küçük sayı  : "+kucuk(sayilar));
            System.out.println("-----------------------------------------------");
           // System.out.println("KONTROL "+ortanca(sayilar));
             ortanca(sayilar, boyut);
            System.out.println("-----------------------------------------------");
            
        }
 
        public static int Topla(int[] dizi)
        {
            int toplam = 0;
            for (int i = 0; i < dizi.length; ++i)
                toplam += dizi[i];
            return toplam;
        }
 
        public static double Ortalama(int[] dizi)
        {
            double ortalama = 0;
            int toplam = 0;
            for (int i = 0; i < dizi.length; ++i)
            { toplam += dizi[i]; }
            ortalama = (double)toplam/(dizi.length);
            return ortalama;
        }
        public static void ortanca(int[] dizi,int b) {
            int kalan =0;
            for (int i = 0; i < dizi.length; ++i)
             Arrays.sort(dizi);
            
            for (int i = 0; i <dizi.length; i++) {
                //System.out.print(dizi[i]+" ");
            }
            if (b %2==1) {
                kalan=(b/2);
                
                System.out.println("Ortadaki terim : "+dizi[kalan]);
            }
            else {
            kalan =b/2;
                System.out.println("Ortanca terim : "+(dizi[kalan]+dizi[kalan-1])/2);
            }
             
    }
        public static int buyuk(int[] dizi){
            
            int en_buyuk=dizi[0];
            for (int i = 0; i < dizi.length; ++i) { 
                if(dizi[i]>en_buyuk){
                 en_buyuk=dizi[i];
        }
                
            }
             return en_buyuk;
        }
        public static int kucuk(int[] dizi){
            int en_kucuk=dizi[0];
            
            for (int i = 0; i < dizi.length; ++i) {
                if(dizi[i]<en_kucuk) {
                 en_kucuk=dizi[i];
        }           
        }
            return en_kucuk;
    }
}