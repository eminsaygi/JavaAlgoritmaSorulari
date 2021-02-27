package soru1;
import java.util.*;

public class Soru1 {
    
public static String ters_metin(String gelen_metin){
    String ters="";
    for (int i = gelen_metin.length()-1; i >=0; i--) {
        ters=ters+gelen_metin.charAt(i);
        
    }
    return ters;
}
    
    public static void main(String[] args) {
    Scanner klavye=new Scanner(System.in);
    System.out.print("Bir metin giriniz : ");
    String metin=klavye.nextLine();
    System.out.println("Metnimiz : "+metin);
   System.out.println("Ter çevrilmiş hali : "+ters_metin(metin));
    
    }
}