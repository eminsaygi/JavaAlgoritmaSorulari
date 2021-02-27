package soru4;

import java.util.Scanner;


public class Soru4 {
public static void Sesli_harfleri_yazdirma(String gelen_metin)
{   String kelime="";
    
    String sesli_harfler="aeiuoAEIOU";
    for (int i = 0;i<=sesli_harfler.length()-1; i++) {
        for (int j = 0; j < gelen_metin.length()-1; j++) {
            if(gelen_metin.charAt(j)==sesli_harfler.charAt(i))
            {
                kelime = gelen_metin.charAt(j)+kelime;
            } 
        }
       
    }
    System.out.println("Sesli kelimeler : "+kelime);
}
public static void Sessiz_hafleri_yazdirma(String gelen_metin){
    {   String kelime="";
    
    String sessiz_harfler="bcçdfgğhjklmnprsştvyzBCÇDFGĞHJKLMNPRSŞTVYZ";
    for (int i = 0;i<=sessiz_harfler.length()-1; i++) {
        for (int j = 0; j < gelen_metin.length(); j++) {
            if(gelen_metin.charAt(j)==sessiz_harfler.charAt(i))
            {
                kelime = gelen_metin.charAt(j)+kelime;
            } 
        }
        
       
    }
    System.out.println("Sessiz kelimeler : "+kelime);
    }
}
    public static void main(String[] args) {
    Scanner klavye=new Scanner(System.in);
    System.out.print("Bir metin giriniz : ");
    String metin=klavye.nextLine();
     
     Sesli_harfleri_yazdirma(metin);
     Sessiz_hafleri_yazdirma(metin);
    }
    
}