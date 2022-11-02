package Ders_Günleri.ClassAndObject.Encapsulation.Ornek2;

public class Araba {
  private   String model;
   private String renk;
   private int yıl;
   private int hacim;

    public Araba() {
    }

    public Araba(String model, String renk, int yıl, int hacim) {
        setHacim(hacim);
        setModel(model);
        setRenk(renk);
        setYıl(yıl);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getYıl() {
        return yıl;
    }

    public void setYıl(int yıl) {
        this.yıl = yıl;
    }

    public int getHacim() {
        return hacim;
    }

    public void setHacim(int hacim) {
        this.hacim = hacim;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", yıl=" + yıl +
                ", hacim=" + hacim +
                '}';
    }
}
