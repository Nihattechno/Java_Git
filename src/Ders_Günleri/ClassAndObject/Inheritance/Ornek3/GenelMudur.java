package Ders_Günleri.ClassAndObject.Inheritance.Ornek3;

public class GenelMudur extends Calısan {
   private int tazminat;

    public int getTazminat() {
        return tazminat;
    }

    public void setTazminat(int tazminat) {
        this.tazminat = tazminat;
    }

    public GenelMudur() {
        super();
    }

    public GenelMudur(String isim, double maas, int maasKatsayısı, int tazminat) {
        super(isim, maas, maasKatsayısı);
        setTazminat(tazminat);
    }

    @Override
    public String getIsim() {
        return super.getIsim();
    }

    @Override
    public void setIsim(String isim) {
        super.setIsim(isim);
    }

    @Override
    public double getMaas() {
        return super.getMaas();
    }

    @Override
    public void setMaas(double maas) {
        super.setMaas(maas);
    }

    @Override
    public int getMaasKatsayısı() {
        return super.getMaasKatsayısı();
    }

    @Override
    public void setMaasKatsayısı(int maasKatsayısı) {
        super.setMaasKatsayısı(maasKatsayısı);
    }

    @Override
    public double maasHesapla() {
      return  super.maasHesapla()+tazminat;

    }

    @Override
    public String toString() {
        return super.toString()+
        "GenelMudur{" +
                "tazminat=" + tazminat +
                '}';
    }
}
