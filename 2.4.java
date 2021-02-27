package soru7;

import java.util.Scanner;

public class Soru7 {

    public static int kelime_Sayisi(String gelen_metin){
    int kelime_say=0;
    for (int i = 0; i <=gelen_metin.length()-1; i++) {
        if(gelen_metin.charAt(i)==' '){
            kelime_say++;}
    }
    return kelime_say+1;
}
    
    public static void main(String[] args) {
    Scanner klavye=new Scanner(System.in);
    System.out.println("Bir metin giriniz");
    String metin=klavye.nextLine();
    System.out.println("Girilen metin="+metin);
    System.out.println("Girilen metin toplam '"+ kelime_Sayisi(metin)+"' adet kelimeden oluşmaktadır.");
    
   
    }
    
}