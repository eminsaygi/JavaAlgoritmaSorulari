package soru8;
public class Soru8 {
 public static void main(String[] args) {
    int adet=100;
    int altsatir=10;
    for (int i = 1; i <= adet; i++) {
        if (i % altsatir == 0) {
            System.out.print(pantegonalsayi(i) + " ");
            System.out.println(" ");
        } else {
            System.out.print(pantegonalsayi(i) + " ");
        }
    }
    for (int i = 1; i <= adet; i++) {
        pantegonalsayi(i);
    }
}

static int pantegonalsayi(int n)
{
    return n*(3*n-1)/2;
}
}