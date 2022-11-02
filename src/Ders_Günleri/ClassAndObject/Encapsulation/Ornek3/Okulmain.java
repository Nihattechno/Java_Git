package Ders_Günleri.ClassAndObject.Encapsulation.Ornek3;

import java.util.ArrayList;
import java.util.Scanner;

public class Okulmain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Ogrenci> ynogr = new ArrayList<>();

        Okul okl1 = new Okul("Ege",2,ynogr);
        ogrekleme(okl1);

        System.out.println(okl1.ogr);

    }

    public static void ogrekleme (Okul okl1){
        Scanner scanner= new Scanner(System.in);
        for (int i = 0; i < okl1.maxogrenci; i++) {
            Ogrenci ogr1 = new Ogrenci();

            System.out.println("Lütfen öğrencinin adını giriniz= ");
            ogr1.setAd(scanner.nextLine());


            System.out.println("Lütfen öğrencinin soyadını giriniz= ");
            ogr1.setSoyad(scanner.nextLine());

            System.out.println("Lütfen öğrencinin yaşını giriniz= ");
            ogr1.setYaş(scanner.nextInt());
            scanner.nextLine();
            if (ogr1.getYaş()>15){
                System.out.println("Okula kayıt yaşı max 15'tir");
                i--;
            }
            else {
                okl1.ogr.add(ogr1);
            }
        }

    }
}
