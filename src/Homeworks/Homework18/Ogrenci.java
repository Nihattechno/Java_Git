package Homeworks.Homework18;

public class Ogrenci extends Person {
    private OGRSube sube;

    public OGRSube getSube() {
        return sube;
    }

    public void setSube(OGRSube sube) {
        this.sube = sube;
    }

    public Ogrenci() {
        super();
    }

    public Ogrenci(String ad, String soyad, String görevi, OGRSube sube) {
        super(ad, soyad, görevi);
        setSube(sube);
    }

    @Override
    public String getAd() {
        return super.getAd();
    }

    @Override
    public void setAd(String ad) {
        super.setAd(ad);
    }

    @Override
    public String getSoyad() {
        return super.getSoyad();
    }

    @Override
    public void setSoyad(String soyad) {
        super.setSoyad(soyad);
    }

    @Override
    public String getGörevi() {
        return super.getGörevi();
    }

    @Override
    public void setGörevi(String görevi) {
        super.setGörevi(görevi);
    }


}
