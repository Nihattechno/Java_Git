package Ders_Günleri.ClassAndObject.Abstract_Classes.Ornek3;

public class YemekDunyası {
    public static void main(String[] args) {

        Baklava tatlı = new Baklava();
        tatlı.taste();
        tatlı.madeIn();
        System.out.println("\n********\n");
        CheseCake chs = new CheseCake();
        chs.madeIn();
        chs.taste();
        System.out.println("\n********\n");
       GreekSalad salad = new GreekSalad();
       salad.madeIn();
       salad.taste();
        System.out.println("\n********\n");
       SezarSalad szr = new SezarSalad();
       szr.madeIn();
       szr.taste();

    }
}
