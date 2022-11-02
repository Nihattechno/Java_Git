package Ders_Günleri.ClassAndObject.Inheritance.Soru5;

public class Kare extends Dikdörtgen{
    public Kare( double genişlik, double uzunluk) {
        super(genişlik, uzunluk);
    }

    public Kare() {
        super();
    }

    @Override
    public double getAlan() {
        return super.getAlan();
    }

    @Override
    public void setAlan(double alan) {
        super.setAlan(alan);
    }

    @Override
    public double getCevre() {
        return super.getCevre();
    }

    @Override
    public void setCevre(double cevre) {
        super.setCevre(cevre);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double getUzunluk() {
        return super.getUzunluk();
    }

    @Override
    public void setUzunluk(double uzunluk) {
        super.setUzunluk(uzunluk);
    }

    @Override
    public double getGenişlik() {
        return super.getGenişlik();
    }

    @Override
    public void setGenişlik(double genişlik) {
        super.setGenişlik(genişlik);
    }

    @Override
    public void alanHesap() {
        super.alanHesap();
    }

    @Override
    public void cevreHesap() {
        super.cevreHesap();
    }
}
