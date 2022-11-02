package Ders_Günleri.ClassAndObject.Inheritance.Soru6;

public class Ogrenci {
    private int id;
    private String isim;
    private ogrTip tipi;
    private static int idsayac=0;

    public Ogrenci(String isim) {
    }

    public  void idsayac(){
        this.id=++id;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", tipi=" + tipi +
                '}';
    }

    public ogrTip getTipi() {
        return tipi;
    }

    public void setTipi(ogrTip tipi) {
        this.tipi = tipi;
    }

    public Ogrenci() {
    }

    public Ogrenci( String isim, ogrTip tipi) {
        idsayac();
        setIsim(isim);
        setTipi(tipi);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

}
