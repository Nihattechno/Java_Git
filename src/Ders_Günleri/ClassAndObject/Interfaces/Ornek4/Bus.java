package Ders_Günleri.ClassAndObject.Interfaces.Ornek4;

public class Bus extends Vehicle implements Diesel{
    public Bus(String model, double engine) {
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
        return "Car is being driven.";
    }

    @Override
    public String changeDiesel() {
        return "If you see the red light before it is too late you should put some diesel to your car";
    }
}
