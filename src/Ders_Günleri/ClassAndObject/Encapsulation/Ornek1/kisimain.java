package Ders_Günleri.ClassAndObject.Encapsulation.Ornek1;

public class kisimain {
    public static void main(String[] args) {

        // Değişkene direk erişimi kapatıp metodlar ile veri almaya ve vermeye
        //(Get and Set) Encapsulation denir
        // Şekil örnekte görüldüğü gibi
        // Yaş private oldu erişimi sadece metod ile yapabiliyoruz

        Kisi kisi1= new Kisi();
        kisi1.ad="Nihat";
        kisi1.soyad="Yavuz";
        kisi1.yasAta(-23);
    }
}
