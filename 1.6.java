package soru5;
import java.util.Scanner;


public class Soru5 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("1. Sayıyı giriniz : ");
        int say1=a.nextInt();
        System.out.print("2. Sayıyı giriniz : ");
        int say2=a.nextInt();
        
         
        System.out.println(say1+" ve "+say2+" sayılarının EBOB'u : "+Ebob(say1, say2) );
        System.out.println(say1+" ve "+say2+" sayılarının EKOK'u : "+Ekok(say1, say2) );
    }
    public static int Ebob(int a,int b){
        int ebob =1;
        for(int i = 1; i <= a && i <= b; ++i)
        {
            if(a % i == 0 && b % i == 0)
                ebob = i;
        }
        return ebob;
        
    }
    public static int Ekok(int a,int b){
        int ebob =1,ekok;
        for(int i = 1; i <= a && i <= b; ++i)
        {
            if(a % i == 0 && b % i == 0)
                ebob = i;
        }
        ekok = (a * b) / ebob;
        return ekok;
    } 
    
}