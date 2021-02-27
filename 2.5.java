package soru6;
import java.util.*;

public class Soru6 {

     public static void Sifrele()
       {
           Scanner scan=new Scanner (System.in);
           System.out.print("kelime giriniz: ");
           String ad=scan.nextLine();
           System.out.print("Anahtar Sayısı :  ");
           int otele=scan.nextInt();
            char [] alfabe=new char [52];
            int k=0,tut;
               for (int i = 65; i <91; i++) {
                   alfabe[k]=(char) i;
                   k++;
               }
               for (int i =97; i < 123; i++) {
                   alfabe[k]=(char) i;
                   k++;
               }
               for (int i = 0; i < ad.length(); i++) {
                   for (int j = 0; j < 52; j++) {
                       if(ad.charAt(i)==alfabe[j]){
                           if(j<26){
                               tut=j+otele;
                               tut%=26;
                               System.out.print((char) alfabe[tut]);
                           }
                          else {
                               tut=j+otele;
                               if(tut>51){
                               tut=(tut%52)+26;
                               System.out.print((char) alfabe[tut]);break;
                               }
                               else
                                   
                              tut=(tut%52);
                               System.out.print((char) alfabe[tut]);
                         }
                          
                           System.out.print("");
                       }
                      
                      
                   }
               }
               System.out.println("");
               

       }
      

                       
    public static void main(String[] args) {
       
        Sifrele();
    }
    
}