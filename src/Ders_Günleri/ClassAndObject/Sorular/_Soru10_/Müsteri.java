package Ders_Günleri.ClassAndObject.Sorular._Soru10_;

public class Müsteri {
    int hesapID;
    String ad;
    String soyad;
    Hesap müsterihesap;

    public Müsteri(){

    }
    public Müsteri(int hesapID,String ad,String soyad, Hesap müsterihesap){
        this.hesapID=hesapID;
        this.ad=ad;
        this.soyad=soyad;
        this.müsterihesap=müsterihesap;
    }
}
