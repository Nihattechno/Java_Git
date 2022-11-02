package Ders_Günleri.ClassAndObject.Inheritance.Ornek1;

public class Main {
    public static void main(String[] args) {
        // 2 farklı classta aynı amac diğer aynı fieldlar yazılmak yerine
        // Bu şekilde inherit edilip "Extends ile" tek 1 class'a yazılıp
        // diğer bütün classlarda aynı işlev ile kullanabilirsin.
        Yonetici mudur= new Yonetici();
        mudur.ad="Nihat";
        mudur.bordoYazdır();
        mudur.yoneticiBordro();
    }
}
