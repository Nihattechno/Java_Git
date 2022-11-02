package Ders_Günleri.ClassAndObject.Abstract_Classes.Ornek2;

public class Daire extends Sekil{
    private double yarıçap;

    public Daire(double yarıçap) {
       setYarıçap(yarıçap);
    }

    public double getYarıçap() {
        return yarıçap;
    }

    public void setYarıçap(double yarıçap) {
        this.yarıçap = yarıçap;
    }

    @Override
    public double alanBul() {
        return Math.PI*(yarıçap*yarıçap);
    }

    @Override
    public double cevreBul() {
        return (yarıçap*Math.PI)*2;
    }

    @Override
    public String toString() {
        return super.toString()+"Daire{" +
                "yarıçap=" + yarıçap +
                '}';
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

    @Override
    public void ciz() {
        super.ciz();
    }
}
