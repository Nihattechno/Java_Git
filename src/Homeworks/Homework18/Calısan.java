package Homeworks.Homework18;

public class Calısan extends Person{
    private Departman departman;

    public Departman getDepartman() {
        return departman;
    }

    public void setDepartman(Departman departman) {
        this.departman = departman;
    }

    public Calısan() {
        super();
    }

    public Calısan(String ad, String soyad, String görevi, Departman departman) {
        super(ad, soyad, görevi);
        setDepartman(departman);
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
