package Ders_Günleri.ClassAndObject.Inheritance.Soru5;

public class Cember extends  Sekil{
    private double yarıçap;

    public Cember( double yarıçap) {
        setYarıçap(yarıçap);
    }

    public double getYarıçap() {
        return yarıçap;
    }

    public void setYarıçap(double yarıçap) {
        this.yarıçap = yarıçap;
    }

    public Cember() {
        super();
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
        return super.toString()+"Cember{" +
                "yarıçap=" + yarıçap +
                '}';
    }
    public void cevrehesap (){

        setCevre((yarıçap*2)*Math.PI);
    }
    public void alanHesap (){

        setAlan((Math.sqrt(yarıçap)*Math.PI));
    }

}
