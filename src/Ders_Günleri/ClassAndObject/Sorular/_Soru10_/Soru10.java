package Ders_Günleri.ClassAndObject.Sorular._Soru10_;

public class Soru10 {
    public static void main(String[] args) {
        Hesap ynhesap = new Hesap();
        Müsteri mt1 = new Müsteri(25,"Umut","Yavuz",ynhesap);

        mt1.müsterihesap.paraYatır(100);
        mt1.müsterihesap.paraYatır(200);
        mt1.müsterihesap.paraÇekme(50);
        System.out.println(mt1.müsterihesap);
    }
}
