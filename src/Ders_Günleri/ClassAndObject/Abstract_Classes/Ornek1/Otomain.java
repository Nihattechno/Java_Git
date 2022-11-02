package Ders_Günleri.ClassAndObject.Abstract_Classes.Ornek1;

public class Otomain {
    public static void main(String[] args) {
        Ford fr1 = new Ford();
        fr1.getVitesadedi();
        fr1.setÜretimyılı(1985);
        fr1.setMarka("MAzda");
        fr1.setVitesadedi(6);
        System.out.println(fr1);
    }
}
