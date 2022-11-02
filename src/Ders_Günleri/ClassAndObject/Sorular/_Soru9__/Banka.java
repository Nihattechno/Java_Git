package Ders_Günleri.ClassAndObject.Sorular._Soru9__;

public class Banka {
    String adı;
    int kuruluşyılı;
    int şubesayısı;

    public Banka() {
    }

    public Banka(String adı, int kuruluşyılı, int şubesayısı) {
        this.adı = adı;
        this.kuruluşyılı = kuruluşyılı;
        this.şubesayısı = şubesayısı;
    }

    public Banka(String adı, int kuruluşyılı) {
        this.adı = adı;
        this.kuruluşyılı = kuruluşyılı;
    }

    public Banka(int kuruluşyılı, int şubesayısı) {
        this.kuruluşyılı = kuruluşyılı;
        this.şubesayısı = şubesayısı;
    }

    @Override
    public String toString() {
        return "Banka{" +
                "adı='" + adı + '\'' +
                ", kuruluşyılı=" + kuruluşyılı +
                ", şubesayısı=" + şubesayısı +
                '}';
    }
}
