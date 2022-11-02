package Ders_Günleri.ClassAndObject.Inheritance.Ornek4;

public class Araclar {
    private String renk;
    private int motor;
    protected String model;

    public Araclar(String renk, int motor, String model) {
       setRenk(renk);
       setMotor(motor);
        setModel(model);
    }

    public Araclar() {
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Araclar{" +
                "renk='" + renk + '\'' +
                ", motor=" + motor +
                ", model='" + model + '\'' +
                '}';
    }
}
