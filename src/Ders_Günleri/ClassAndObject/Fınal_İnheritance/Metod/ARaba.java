package Ders_Günleri.ClassAndObject.Fınal_İnheritance.Metod;

public class ARaba extends Taşıt{
    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    public ARaba(String model) {
        super(model);
    }

}
