package Ders_Günleri.ClassAndObject.Sorular._03_soru_;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_ {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        ArrayList<Ogrenci>snf=new ArrayList<>();

        for (int i = 1; i <=3 ; i++) {
            Ogrenci ogr = new Ogrenci();
            System.out.print("Lütfen "+i+". öğrencinin notunu giriniz= ");
            ogr.not= scanner.nextInt();
            scanner.nextLine();
            System.out.print("Lütfen"+i+". öğrencinin tam adını giriniz= ");
            ogr.tamAdı= scanner.nextLine();
            System.out.print("Lütfen "+i+". öğrencinin numarasını giriniz= ");
            ogr.okulNo= scanner.nextInt();
            snf.add(ogr);
        }
        yzdrma(snf);
        System.out.println("Sınıfın not ortalaması= "+ort(snf));

    }
    // Yazdırma
    public static void yzdrma (ArrayList<Ogrenci>liste){
        for (Ogrenci ogr: liste){
            System.out.println("Öğrenci numarası= "+ogr.okulNo);
            System.out.println("Öğrenci adı= "+ogr.tamAdı);
            System.out.println("Öğrenci notu = "+ogr.not);
        }
    }
    // ort
    public static int ort (ArrayList<Ogrenci>liste){
        int ort=0;
        int toplam=0;
        for (int i = 0; i <liste.size() ; i++) {
            toplam=toplam+liste.get(i).not;
        }
        ort=toplam/liste.size();
        return ort;
    }
}
