package Homeworks.Homework21;

public class Calısan extends Person{
    private int maas;

    public Calısan(String isim, String adres, Okul okulu, UyeTipi tipi,int maas) {
        super(isim, adres, okulu, tipi);
        setMaas(maas);
    }

    public Calısan(String isim, String adres, UyeTipi tipi, int maas) {
        super(isim, adres, tipi);
       setMaas(maas);
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    @Override
    public String getIsim() {
        return super.getIsim();
    }

    @Override
    public String getAdres() {
        return super.getAdres();
    }

    @Override
    public Okul getOkulu() {
        return super.getOkulu();
    }

    @Override
    public UyeTipi getTipi() {
        return super.getTipi();
    }

    @Override
    public String toString() {
        return super.toString()+"Calısan{" +
                "maas=" + maas +
                '}';
    }
}
