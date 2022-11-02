package Ders_Günleri.ClassAndObject.Static_Modifiers;

public class Ogrenci {
    String ad;
    String soyad;
    static String okuladı="Ege üni";
    // Bu şekil static yapıp tanımladığında her oluşturduğun objecte
    // Bu şekilde tanımlanır ve hem zamandan hem de hafızadan kazanırsın.

    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", okuladı='" + okuladı + '\'' +
                '}';
    }
}
