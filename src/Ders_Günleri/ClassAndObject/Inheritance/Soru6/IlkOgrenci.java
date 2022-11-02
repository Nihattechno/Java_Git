package Ders_Günleri.ClassAndObject.Inheritance.Soru6;

public class IlkOgrenci extends Ogrenci{
    public IlkOgrenci() {
        super();
    }

    public IlkOgrenci( String isim) {
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
    public ogrTip getTipi() {
        return super.getTipi();
    }

    @Override
    public void setTipi(ogrTip tipi) {
        super.setTipi(tipi);
    }

    public IlkOgrenci(String isim, ogrTip tipi) {
        super(isim, tipi);
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
