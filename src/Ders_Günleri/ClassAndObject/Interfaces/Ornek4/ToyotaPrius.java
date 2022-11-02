package Ders_Günleri.ClassAndObject.Interfaces.Ornek4;

public class ToyotaPrius extends Vehicle implements Electric,Gas{
    public ToyotaPrius(String model, double engine) {
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
        return "Right now car is being driven.";
    }

    @Override
    public String changeBattery() {
        return "After 1000 km you should change the battery otherwise you can lose it";
    }

    @Override
    public String changeOil() {
        return "After 1000 km you should change the oil otherwise you can take your engine onto your hands";
    }
}
