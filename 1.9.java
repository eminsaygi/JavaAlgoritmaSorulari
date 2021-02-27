package soru2;
import java.util.*;

public class Soru2 {

    
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz : ");
        int say1=a.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        int say2=a.nextInt();
        buyukolanibul(say1,say2);
        
    }
    static void buyukolanibul(int a,int b){
        if (a<b) {
            System.out.println("En büyük sayı : "+b);
        }
        else System.out.println("En büyük sayı : "+a);
        
    }
    
}