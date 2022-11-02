package Ders_Günleri.ClassAndObject.Static_Modifiers;

public class Okul {
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci("Umut","Nihat");
        Ogrenci ogr2 = new Ogrenci("Umut","Nihat");
        Ogrenci ogr3 = new Ogrenci("Umut","Nihat");
        Ogrenci ogr4 = new Ogrenci("Umut","Nihat");

        //...
        //...
        //...
        Ogrenci ogr5 = new Ogrenci("Umut","Nihat");
        Ogrenci ogr6 = new Ogrenci("Umut","Nihat");

        // Bütün öğrenciler ege ünide kayıtlı olarak duruyor classta
        System.out.println(ogr2);


    }
}
