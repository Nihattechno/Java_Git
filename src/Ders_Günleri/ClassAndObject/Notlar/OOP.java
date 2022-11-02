package Ders_Günleri.ClassAndObject.Notlar;

public class OOP {
    public static void main(String[] args) {
        Araba arb1=new Araba(); // Araba class, arb1 object
        arb1.renk="Kırmızı";
        arb1.yılı=2018;
        arb1.hacmi=1800;

    }
}
class Araba {
    String renk;
    int yılı;
    double hacmi;
}
