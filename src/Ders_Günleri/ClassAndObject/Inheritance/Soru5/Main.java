package Ders_Günleri.ClassAndObject.Inheritance.Soru5;

public class Main {
    public static void main(String[] args) {
        Dikdörtgen dk1 = new Dikdörtgen(4,5);
        dk1.cevreHesap();
        dk1.alanHesap();
        System.out.println(dk1);

        Kare kr1 = new Kare(6,6);
        kr1.alanHesap();
        kr1.cevreHesap();
        System.out.println(kr1);

        Cember cmbr1 = new Cember(2.6);
        cmbr1.alanHesap();
        cmbr1.cevrehesap();
        System.out.println(cmbr1);

    }
}
