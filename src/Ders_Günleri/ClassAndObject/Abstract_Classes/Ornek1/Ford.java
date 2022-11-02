package Ders_Günleri.ClassAndObject.Abstract_Classes.Ornek1;

public class Ford extends Binekoto {
    @Override
    public String getMarka() {
        return "Ford";
    }

    @Override
    public void setMarka(String marka) {
        super.setMarka(marka);
    }

    @Override
    public void setVitesadedi(int vitesadedi) {
        super.setVitesadedi(vitesadedi);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
