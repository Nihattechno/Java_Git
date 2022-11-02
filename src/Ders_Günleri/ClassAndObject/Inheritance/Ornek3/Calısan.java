package Ders_Günleri.ClassAndObject.Inheritance.Ornek3;

public class Calısan {
   private String isim;
   private double maas;
   private int maasKatsayısı;

    public Calısan() {
    }

    public Calısan(String isim, double maas, int maasKatsayısı) {
       setIsim(isim);
        setMaas(maas);
        setMaasKatsayısı(maasKatsayısı);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public int getMaasKatsayısı() {
        return maasKatsayısı;
    }

    public void setMaasKatsayısı(int maasKatsayısı) {
        this.maasKatsayısı = maasKatsayısı;
    }

    @Override
    public String toString() {
        return "Calısan{" +
                "isim='" + isim + '\'' +
                ", maas=" + maas +
                ", maasKatsayısı=" + maasKatsayısı +
                '}';
    }
    public double maasHesapla (){
       return maas*maasKatsayısı;
    }
}
