package Ders_Günleri.ClassAndObject.Sorular._Soru6_;

public class Müşteri {
    Elektrik_hesabı hesap;
    String isim;

    public int tuketimEkle (int tüketilen){
        hesap.toplamtüketim= hesap.toplamtüketim+tüketilen;
        return hesap.toplamtüketim;
    }
    public double ödenecektutar (){
        double ödenen;
        ödenen=hesap.toplamtüketim*hesap.oran;
        return ödenen;
    }
}
