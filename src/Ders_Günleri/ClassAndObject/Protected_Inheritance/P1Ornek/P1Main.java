package Ders_Günleri.ClassAndObject.Protected_Inheritance.P1Ornek;

public class P1Main {
    public static void main(String[] args) {
        Hayvan_1 hyvn = new Hayvan_1();
        hyvn.yaş=5; // Public olduğu için her yerden erişilir
        hyvn.ad="North"; // default olduğu için sadece aynı paketten erişilir
        hyvn.cinsi="Cİns"; // protected olduğu için sadece aynı paketten erişilir
    }
}
