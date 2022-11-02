package Ders_Günleri.ClassAndObject.Sorular._5_;

public class Rectangle {
    double widht;
    double length;

    public void çevre() {
        double çevre = (length*2)+(widht*2);
        System.out.println("Verilen dikdörtgenin çevresi= "+çevre);
    }
    public void alan (){
         double alan= widht*length;
        System.out.println("Verilen dikdörtgenin alanı= "+alan);
    }
}
