package Homeworks.Homework21;

import java.util.ArrayList;

public class Okul {
    private String isim;
    private int maxOgrenci;
    private Ogrenci  ogr;
    private Calısan cls;

    public Okul(String isim, int maxOgrenci, Ogrenci ogr, Calısan cls) {
      setIsim(isim);
       setMaxOgrenci(maxOgrenci);
        setOgr(ogr);
        setCls(cls);
    }

    public Okul(String isim, int maxOgrenci) {
       setIsim(isim);
       setMaxOgrenci(maxOgrenci);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaxOgrenci() {
        return maxOgrenci;
    }

    public void setMaxOgrenci(int maxOgrenci) {
        this.maxOgrenci = maxOgrenci;
    }

    public Ogrenci getOgr() {
        return ogr;
    }

    public void setOgr(Ogrenci ogr) {
        this.ogr = ogr;
    }

    public Calısan getCls() {
        return cls;
    }

    public void setCls(Calısan cls) {
        this.cls = cls;
    }
    ArrayList<Person> prs = new ArrayList<>();

    @Override
    public String toString() {
        return "Okul{" +
                "isim='" + isim + '\'' +
                '}';
    }
}
