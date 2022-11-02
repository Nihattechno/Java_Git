package Homeworks.Homework21;

public class Ogrenci extends Person{
    private int ucret;

    public Ogrenci(String isim, String adres, Okul okulu, UyeTipi tipi, int ucret) {
        super(isim, adres, okulu, tipi);
        setUcret(ucret);
    }

    public Ogrenci(String isim, String adres, UyeTipi tipi, int ucret) {
        super(isim, adres, tipi);
       setUcret(ucret);
    }

    public int getUcret() {
        return ucret;
    }

    public void setUcret(int ucret) {
        this.ucret = ucret;
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
        return super.toString()+"Ogrenci{" +
                "ucret=" + ucret +
                '}';
    }
}
