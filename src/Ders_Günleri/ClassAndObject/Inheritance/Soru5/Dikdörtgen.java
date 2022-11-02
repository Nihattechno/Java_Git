package Ders_Günleri.ClassAndObject.Inheritance.Soru5;

public class Dikdörtgen extends Sekil {
    private double uzunluk;
    private double genişlik;

    public Dikdörtgen(double genişlik, double uzunluk) {
        setGenişlik(genişlik);
        setUzunluk(uzunluk);
    }

    public Dikdörtgen() {
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
        return super.toString()+"Dikdörtgen{" +
                "uzunluk=" + uzunluk +
                ", genişlik=" + genişlik +
                '}';
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

    public void alanHesap (){

        setAlan(uzunluk*genişlik);
    }

    public  void cevreHesap (){

       setCevre (uzunluk*2+(genişlik*2));
    }
}
