package Ders_Günleri.ClassAndObject.Interfaces.Ornek4;

public class TeslaCar extends Vehicle implements Electric,Gas{
    public TeslaCar(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public double getEngine() {
        return super.getEngine();
    }

    @Override
    public void setEngine(double engine) {
        super.setEngine(engine);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String drive() {
        return "Araba sürülüyor";
    }

    @Override
    public String changeBattery() {
        return "After 1000 kms you should change the battery";
    }

    @Override
    public String changeOil() {
        return "If you pass 1000 km you should change the oil";
    }
}
