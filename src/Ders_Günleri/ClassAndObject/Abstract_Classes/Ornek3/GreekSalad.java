package Ders_Günleri.ClassAndObject.Abstract_Classes.Ornek3;

public class GreekSalad extends Salad{
    @Override
    void madeIn() {
        System.out.println("Greek salad is made in greece");
    }

    @Override
    void taste() {
        super.taste();
    }
}
