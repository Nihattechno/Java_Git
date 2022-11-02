package Ders_Günleri.ClassAndObject.Inheritance.Soru6;

public class LiseOgrencisi extends Ogrenci {
    public LiseOgrencisi() {
        super();
    }

    @Override
    public ogrTip getTipi() {
        return super.getTipi();
    }

    @Override
    public void setTipi(ogrTip tipi) {
        super.setTipi(tipi);
    }

    public LiseOgrencisi(String isim, ogrTip tipi) {
        super(isim, tipi);
    }

    public LiseOgrencisi(String isim) {
        super( isim);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
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
    public String toString() {
        return super.toString();
    }

}
