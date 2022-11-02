package Ders_Günleri.ClassAndObject.Encapsulation.Ornek3;

import java.util.ArrayList;

public class Okul {
    String okulad;
    int maxogrenci;
    ArrayList<Ogrenci> ogr;

    public Okul() {
    }

    public Okul(String okulad, int maxogrenci, ArrayList<Ogrenci> ogr) {
        this.okulad = okulad;
        this.maxogrenci = maxogrenci;
        this.ogr = ogr;
    }

    public Okul(String okulad, int maxogrenci) {
        this.okulad = okulad;
        this.maxogrenci = maxogrenci;
    }

    @Override
    public String toString() {
        return "Okul{" +
                "okulad='" + okulad + '\'' +
                ", maxogrenci=" + maxogrenci +
                ", ogr=" + ogr +
                '}';
    }
}
