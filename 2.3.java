package soru8;
import java.util.*;

public class Soru8 {
    
 public static HashMap<Object, Object> Tekrar_Eden_harfler(String metin){
     HashMap<Object, Object> hmap = new HashMap<Object, Object>();
     for (int i = 0; i < metin.length(); i++) {
            if(!hmap.containsKey(metin.charAt(i)))
            {
                  hmap.put(metin.charAt(i),1); 
            }
            else
            {
                int count= (int)hmap.get(metin.charAt(i));
                hmap.put(metin.charAt(i),count+1);
            }    
        }
     return  hmap;
 }
    
    public static void main(String[] args) {
    Scanner klavye=new Scanner(System.in);
    System.out.print("Bir metin giriniz : ");
    String metin=klavye.nextLine();
    System.out.println("Metnimiz : "+metin);
    System.out.println("Tekrar eden karakterler : "+Tekrar_Eden_harfler(metin) );
    }
}