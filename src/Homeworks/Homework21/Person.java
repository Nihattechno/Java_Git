package Homeworks.Homework21;

public class Person {
    private String isim;
    private String adres;
    private Okul okulu;
    private UyeTipi tipi;

    public Person(String isim, String adres, Okul okulu, UyeTipi tipi) {
        setIsim(isim);
        setAdres(adres);
        setOkulu(okulu);
        setTipi(tipi);
    }

    public Person(String isim, String adres, UyeTipi tipi) {
        setIsim(isim);
        setAdres(adres);
        setTipi(tipi);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Okul getOkulu() {
        return okulu;
    }

    public void setOkulu(Okul okulu) {
        this.okulu = okulu;
    }

    public UyeTipi getTipi() {
        return tipi;
    }

    public void setTipi(UyeTipi tipi) {
        this.tipi = tipi;
    }

    @Override
    public String toString() {
        return "Person{" +
                "isim='" + isim + '\'' +
                ", adres='" + adres + '\'' +
                ", okulu=" + okulu +
                ", tipi=" + tipi +
                '}';
    }
}
