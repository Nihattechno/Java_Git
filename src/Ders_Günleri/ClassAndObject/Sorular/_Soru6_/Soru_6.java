package Ders_Günleri.ClassAndObject.Sorular._Soru6_;

public class Soru_6 {
    public static void main(String[] args) {
        Müşteri nmt = new Müşteri();
        nmt.hesap=new Elektrik_hesabı(); // Diyede oluşturabiliriz
        nmt.isim="Nihat";

         nmt.tuketimEkle(75);
         nmt.tuketimEkle(85);
         nmt.tuketimEkle(75);

        System.out.println(nmt.isim+" Ödenecek fatura tutarı= "+nmt.ödenecektutar());
    }
}
