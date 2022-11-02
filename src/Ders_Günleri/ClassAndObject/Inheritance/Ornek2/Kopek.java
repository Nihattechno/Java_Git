package Ders_Günleri.ClassAndObject.Inheritance.Ornek2;

public class Kopek extends Hayvan{
    public Kopek(String adı, int boyu, String cinsi) {
        super(adı, boyu, cinsi);
    }

    @Override
    public void konuşma() {
        super.konuşma();
        System.out.println("Hav hav dedi");
    }
}
