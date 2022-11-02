package Ders_Günleri.ClassAndObject.Abstract_Classes.Ornek3;

public class CheseCake extends Sweet{
    @Override
    void taste() {
        super.taste();
    }

    @Override
    void madeIn() {
        System.out.println("These desert ordered made in USA");
    }
}
