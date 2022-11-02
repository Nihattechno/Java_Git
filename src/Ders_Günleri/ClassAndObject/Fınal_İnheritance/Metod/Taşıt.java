package Ders_Günleri.ClassAndObject.Fınal_İnheritance.Metod;

public class Taşıt {
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Taşıt(String model) {
       setModel(model);
    }

    @Override
    public final String toString() {
        return "Taşıt{" +
                "model='" + model + '\'' +
                '}';
    }
}
