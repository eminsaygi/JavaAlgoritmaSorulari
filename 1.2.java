package soru9;


public class Soru9 {

   
    public static void main(String[] args) {
      int sayac =1,sayi=2;
        String sonuc ="";
       
        while (sayac<100) {            
            if (Asal(sayi) && Palindromik(sayi) && AsalTersi(sayi)) {
                 if(sayac%10==0){        
                    sonuc += " "+sayi+"\n";  
                }else{
                    sonuc += " "+sayi;
                }
                 sayac++;
            }
         sayi++;
        }
    System.out.print(sonuc);
    }
    static boolean Palindromik(int a){
        int sonuc = 10;
        int numara = a;
            while(a!=0){
                int sondeger= a%10;
                sonuc = sonuc*10+sondeger;
                a /=10;
            }
        return numara!=sonuc;
    }
    static boolean Asal (int a){
        
        for (int bolen = 2; bolen <= a/2; bolen++) {
            if (a%bolen==0) {
                return false;
            }
        }
        
        return true;
    }
    static boolean AsalTersi(int a){
        int sonuc = 0;
        int numara = a;
            while(a!=0){
                int sondeger= a%10;
                sonuc = sonuc*10+sondeger;
                a /=10;
            }
            for (int bolen = 2; bolen <= sonuc/2; bolen++) {
            if (sonuc%bolen==0) {
                return false;
            }
        }
        return true;
    }
}