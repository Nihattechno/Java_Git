package Ders_Günleri.ClassAndObject.Inheritance.Ornek2;

public class Kus extends Hayvan {
    public Kus(String adı, int boyu, String cinsi, int kanakuzunluğu) {
        super(adı, boyu, cinsi);
        this.kanakuzunluğu=kanakuzunluğu;
    }

    @Override
    public void konuşma() {
        super.konuşma();
        System.out.println("cik cik dedi");
    }

    int kanakuzunluğu;
}
