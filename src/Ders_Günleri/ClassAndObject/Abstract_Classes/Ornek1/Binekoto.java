package Ders_Günleri.ClassAndObject.Abstract_Classes.Ornek1;

public abstract class Binekoto {
    private String marka;
    private int üretimyılı;
    private int vitesadedi;

    public abstract String getMarka();

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getÜretimyılı() {
        return üretimyılı;
    }

    public void setÜretimyılı(int üretimyılı) {
        this.üretimyılı = üretimyılı;
    }

    public int getVitesadedi() {
        return vitesadedi;
    }

    public void setVitesadedi(int vitesadedi) {
        this.vitesadedi = vitesadedi;
    }

    @Override
    public String toString() {
        return "Binekoto{" +
                "marka='" + marka + '\'' +
                ", üretimyılı=" + üretimyılı +
                ", vitesadedi=" + vitesadedi +
                '}';
    }
}
