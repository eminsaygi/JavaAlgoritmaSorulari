package soru5;

import java.util.Scanner;


public class Soru5 {
public static int bosluk_sayisi(String gelen_metin){
    int bosluk_say=0;
    for (int i = 0; i <=gelen_metin.length()-1; i++) {
        if(gelen_metin.charAt(i)==' '){
            bosluk_say++;}
    }
    return bosluk_say;
}

    public static int sesli_harf_sayisi(String gelen_metin)
{
    int sesli_harf_say=0;
    String sesli_harfler="aeiuoAEIOU";
    for (int i = 0;i<=sesli_harfler.length()-1; i++) {
        for (int j = 0; j < gelen_metin.length()-1; j++) {
            if(gelen_metin.charAt(j)==sesli_harfler.charAt(i))
            {
                sesli_harf_say++;
            }
        }
    }
    return sesli_harf_say;
}
public static int sessiz_harf_sayisi(String gelen_metin,int bosluk_sayisi, int sesli_haf_sayisi){
    int sessiz_harf_say;
    int metnin_toplam_boyutu=gelen_metin.length();
    sessiz_harf_say=metnin_toplam_boyutu-bosluk_sayisi-sesli_haf_sayisi;
    return sessiz_harf_say;
}
    public static void main(String[] args) {
    Scanner klavye=new Scanner(System.in);
    System.out.print("Bir metin giriniz : ");
    String metin=klavye.nextLine();
    int sesli=sesli_harf_sayisi(metin);
    int bosluk=bosluk_sayisi(metin);
    int sessiz=sessiz_harf_sayisi(metin, bosluk, sesli);
    System.out.println("Girilen metinteki sesli harf sayısı="+sesli+" \nSessiz harf sayisi="+sessiz);
        if (sesli>sessiz) {
           String Kucuk_metin= metin.toLowerCase();
            System.out.println("Sesli haflerin sayısı,sessiz harflerden fazladır\n"+Kucuk_metin);
        } 
        else if (sesli<=sessiz){
        String Buyuk_metin = metin.toUpperCase();
            System.out.println("Sessiz haflerin sayısı,Sesli harflerden fazladır\n"+Buyuk_metin);
        }
        
   
    }
    
}