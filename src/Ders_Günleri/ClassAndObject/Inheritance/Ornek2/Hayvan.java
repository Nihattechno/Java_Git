package Ders_Günleri.ClassAndObject.Inheritance.Ornek2;

public class Hayvan {
    String adı;
    int boyu;
    String cinsi;

    public Hayvan(String adı, int boyu, String cinsi) {
        this.adı = adı;
        this.boyu = boyu;
        this.cinsi = cinsi;
    }

    public void konuşma (){

        System.out.println("Hayvan konuştu");
    }
}
