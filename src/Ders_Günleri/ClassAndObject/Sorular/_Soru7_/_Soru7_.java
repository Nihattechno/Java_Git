package Ders_Günleri.ClassAndObject.Sorular._Soru7_;

import java.util.ArrayList;

public class _Soru7_ {
    public static void main(String[] args) {
        Lesson kimya = new Lesson("kimya",3);
        Lesson mat = new Lesson("mat",5);
        Lesson tarih = new Lesson("tarih",2);
        Lesson fizik = new Lesson("fizik",5);


        Ogrenci ogr1 = new Ogrenci("Nihat",10);
        ogr1.liste(kimya);
        ogr1.liste(mat);
        ogr1.liste(tarih);
        ogr1.liste(fizik);
    }
}