package Ders_Günleri.ClassAndObject.Inheritance.Soru5;

public class Sekil {
    private double alan;
    private double cevre;

    public Sekil() {
    }


    public double getAlan() {
        return alan;
    }

    public void setAlan(double alan) {
        this.alan = alan;
    }

    public double getCevre() {
        return cevre;
    }

    public void setCevre(double cevre) {
        this.cevre = cevre;
    }

    @Override
    public String toString() {
        return "Sekil{" +
                "alan=" + alan +
                ", cevre=" + cevre +
                '}';
    }
}
