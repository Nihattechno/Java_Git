package Ders_Günleri.ClassAndObject.Sorular._04_;

public class _04_ {
    public static void main(String[] args) {
        Ogrenci ogr  = new Ogrenci();
        Okul okl = new Okul();

        ogr.okulno=758;
        ogr.tamad="nihat";
        ogr.okulu=okl;

        okl.okuladı="Ege";
        okl.ucret=8766;
        okl.muduradı="Yavuz";

        System.out.println(ogr.okulno);
        System.out.println(ogr.tamad);
        System.out.println(ogr.okulu.okuladı);
        System.out.println(ogr.okulu.muduradı);
        System.out.println(ogr.okulu.ucret);

    }
}
