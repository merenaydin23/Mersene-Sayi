import java.util.Scanner;
public class Main {
    // Sisteme girilen sayı asal ve bu sayı n olamk üzere 2^n-1 de asalsa bu sayıya mersene sayı denir.
    public static void main(String[] args) {
        System.out.println("Mersene sayı buma programına hoş geldiniz");
        boolean asal = true;
        boolean mersen = true;
        Scanner klavye = new Scanner(System.in);
        int sayi = 0;
        do {
            System.out.println("Sisteme pozitif sayı girin");
            sayi = klavye.nextInt();
        } while (sayi < 0);
        if (sayi == 1) {
            System.out.println("Asal Sayı değil, Mersene Sayı hiç değil");
        } else if (sayi == 2) {
            System.out.println("Hem Asal Sayı hem Mersene Sayı ");
        } else {
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    asal = false;
                    System.out.println("Asal değil Mersene hiç değil");
                    break;
                }
                if (asal == true) {
                    double mersene = Math.pow(2,sayi) - 1;
                    for (int k = 2; k < mersene; k++) {
                        if (mersene % k == 0) {
                            asal = true;
                            mersen = false;
                            break;
                        }

                    }
                }
if (asal==true&mersen==true){
    System.out.println("Hem Asal Sayı hem de  Mersene Sayı");
    break;
} else if (asal==true&mersen==false) {
    System.out.println("Asal Sayı  ama Mersene Sayı değil");
    break;
}

            }
    }
    }
}
