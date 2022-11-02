package Ders_Günleri.ClassAndObject.Inheritance.Soru6;

public class Okul {
    public static void main(String[] args) {
        LiseOgrencisi ls1 = new LiseOgrencisi("Nihat",ogrTip.LİSE);
        System.out.println(ls1);

        IlkOgrenci lk1 = new IlkOgrenci("Yavuz",ogrTip.ILK);
        System.out.println(lk1);
    }
}
