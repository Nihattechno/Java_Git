package Ders_Günleri.ClassAndObject.Inheritance.Ornek2;

public class Yılan extends Hayvan{
    int uzunluğu;

    public Yılan(String adı, int boyu, String cinsi,int uzunluğu) {
        super(adı, boyu, cinsi);
        this.uzunluğu=uzunluğu;
    }

    @Override
    public void konuşma() {
        super.konuşma();
    }
}
