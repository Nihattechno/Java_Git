package Ders_Günleri.ClassAndObject.Abstract_Classes.Ornek2;

public class Geometri {
    public static void main(String[] args) {
        Dikdörtgen1 dk1 = new Dikdörtgen1(3,4);
        dk1.cevreBul();
        dk1.alanBul();
        dk1.getName();
        dk1.ciz();
        System.out.println(dk1);

        Daire dr1 = new Daire(3.75);
        dr1.cevreBul();
        dr1.alanBul();
        dr1.getName();
        dr1.ciz();
        System.out.println(dr1);
    }
}
