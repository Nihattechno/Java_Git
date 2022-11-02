package Ders_Günleri.ClassAndObject.Sorular._Soru12_;

import java.util.Scanner;

public class Soru12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen sırsıyla saati, dakikayı ve saniyeyi giriniz= ");
        int saat = scanner.nextInt();
        scanner.nextLine();
        int dakika = scanner.nextInt();
        scanner.nextLine();
        int saniye = scanner.nextInt();

        System.out.println(Sabitler.saniyehesaplama(saat,dakika,saniye));

    }
}
