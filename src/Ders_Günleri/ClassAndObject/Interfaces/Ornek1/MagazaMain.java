package Ders_Günleri.ClassAndObject.Interfaces.Ornek1;

public class MagazaMain {
    public static void main(String[] args) {

        Trendyol try1 = new Trendyol();
        try1.bilgileriAl();

        IMagaza trt2 = new Trendyol();
        trt2.kredibiliteyiKontrol();

        // Burada anlatmak istediğim interface ile aynıı zamanda polymorphism de yapabiliyorsun

        try1.urunİsmi();

        Hepsiburada hps1 = new Hepsiburada();
        hps1.urunİsmi();
    }
}
