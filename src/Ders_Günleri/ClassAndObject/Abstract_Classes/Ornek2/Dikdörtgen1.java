package Ders_Günleri.ClassAndObject.Abstract_Classes.Ornek2;

public class Dikdörtgen1 extends Sekil{
    private double uzunluk;
    private double genişlik;

    public Dikdörtgen1(double uzunluk, double genişlik) {
        setGenişlik(genişlik);
       setUzunluk(uzunluk);
    }

    public double getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(double uzunluk) {
        this.uzunluk = uzunluk;
    }

    public double getGenişlik() {
        return genişlik;
    }

    public void setGenişlik(double genişlik) {
        this.genişlik = genişlik;
    }

    @Override
    public double alanBul() {
        return (getUzunluk()*getGenişlik());
    }

    @Override
    public double cevreBul() {
        return ((getUzunluk()*2)+(getGenişlik()*2));}

    @Override
    public void ciz() {
        super.ciz();
    }

    @Override
    public String toString() {
        return super.toString()+"Dikdörtgen1{" +
                "uzunluk=" + uzunluk +
                ", genişlik=" + genişlik +
                '}';
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
}
