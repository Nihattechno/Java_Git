package Ders_Günleri.ClassAndObject.Encapsulation.Ornek3;

public class Ogrenci {
    private String ad;
    private String soyad;
    private int yaş;
    private static int id=0;


    public Ogrenci() {
    }

    public Ogrenci(String ad, String soyad, int yaş) {
        setAd(ad);
        setSoyad(soyad);
        setYaş(yaş);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYaş() {
        return yaş;
    }

    public void setYaş(int yaş) {
        this.yaş = yaş;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yaş=" + yaş +
                ", id=" + id +
                '}';
    }
}
