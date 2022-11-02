package Ders_Günleri.ClassAndObject.Inheritance.Ornek2;

public class Kedi extends Hayvan {
    public Kedi(String adı, int boyu, String cinsi) {
        super(adı, boyu, cinsi);
    }

    @Override
    public void konuşma() {
        System.out.println("Miyav dedi");
        super.konuşma();
    }
}
