package Ders_Günleri.ClassAndObject.Interfaces.Ornek3;

public class Geometri {
    public static void main(String[] args) {
        Kare kr1 = new Kare();
        kr1.getAlan1(4);
        kr1.getCevre(4);
        System.out.println(kr1);

        Dikdörtgen dk1 = new Dikdörtgen();
        dk1.getAlan1(3,4);
        dk1.getCevre(3,4);
        System.out.println(dk1);


    }
}
