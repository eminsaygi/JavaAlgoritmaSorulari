package soru7;


public class Soru7 {

   
    public static void main(String[] args) {
        toplama(1, 2, 3);
        toplama(5, 6);
    }
    public static void toplama(int a,int b,int c){
        
        System.out.println("Toplam : "+(a+b+c));
    }
    public static void toplama(int a,int b){
        
        System.out.println("Toplam : "+(a+b));
    }
    
}