package Ders_Günleri.ClassAndObject.Sorular._02_soru;

import java.util.ArrayList;
import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        ArrayList<Ogrenci>sınıf=new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            Ogrenci ogr=new Ogrenci();
            System.out.print("Lütfen "+i+". öğrencinin ismini giriniz= ");
            ogr.ad= scanner.nextLine();
            System.out.print("Lütfen "+i+". öğrencinin soyadını giriniz= ");
            ogr.soyad= scanner.nextLine();
            System.out.print("Lütfen "+i+". öğrencinin sınıfını giriniz= ");
            ogr.sınıfı= scanner.nextInt();
            scanner.nextLine();
            System.out.print("Lütfen "+i+". öğrencinin adresini giriniz= ");
            ogr.adres= scanner.nextLine();
            sınıf.add(ogr);
        }
        for (Ogrenci ogr : sınıf){
            System.out.println(ogr.ad);
            System.out.println(ogr.soyad);
            System.out.println(ogr.sınıfı);
            System.out.println(ogr.adres);
        }

    }
}
class Ogrenci{
    String ad;
    String soyad;
    int sınıfı;
    String adres;

}
