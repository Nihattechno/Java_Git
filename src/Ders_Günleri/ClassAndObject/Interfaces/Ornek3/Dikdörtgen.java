package Ders_Günleri.ClassAndObject.Interfaces.Ornek3;

public class Dikdörtgen extends Sekil {
    private double uzunluk;
    private double genişlik;
    private double alan;
    private double çevre;

    public void setAlan(double alan) {
        this.alan = alan;
    }


    public void setÇevre(double çevre) {
        this.çevre = çevre;
    }


   /* public Dikdörtgen(double uzunluk, double genişlik) {
        setGenişlik(genişlik);
        setUzunluk(uzunluk);
    }

    public Dikdörtgen(double uzunluk) {
       setUzunluk(uzunluk);
    }*/

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
    public void getAlan1(double... dizi) {
        setAlan(dizi[0]*dizi[1]);
    }

    @Override
    public void getCevre(double... dizi) {
       setÇevre((dizi[0]*2)+(dizi[1]*2));
    }

    public String toString() {
        return "Dikdörtgen{" +
                "uzunluk=" + uzunluk +
                ", genişlik=" + genişlik +
                ", alan=" + alan +
                ", çevre=" + çevre +
                '}';
    }


    public String krtoString() {
        return "Kare{" +
                "uzunluk=" + uzunluk +
                ", alan=" + alan +
                ", çevre=" + çevre +
                '}';
    }
}
