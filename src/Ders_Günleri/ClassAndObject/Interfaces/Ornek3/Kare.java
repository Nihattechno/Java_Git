package Ders_Günleri.ClassAndObject.Interfaces.Ornek3;

public class Kare extends Dikdörtgen{
   /* public Kare(double uzunluk) {
        super(uzunluk);
    }*/


    @Override
    public double getUzunluk() {
        return super.getUzunluk();
    }

    @Override
    public void setUzunluk(double uzunluk) {
        super.setUzunluk(uzunluk);
    }

    @Override
    public void getAlan1(double... dizi) {
       setAlan(dizi[0]*dizi[0]);
    }

    @Override
    public void getCevre(double... dizi) {
       setÇevre(dizi[0]*4);
    }

    public String krtoString() {
        return super.krtoString();
    }
}
