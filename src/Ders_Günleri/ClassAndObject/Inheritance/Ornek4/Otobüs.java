package Ders_Günleri.ClassAndObject.Inheritance.Ornek4;

public class Otobüs extends Araclar {
    private int yolcuSayısı;

    public Otobüs(String renk, int motor, String model, int yolcuSayısı) {
        super(renk, motor, model);
        this.yolcuSayısı=yolcuSayısı;
    }

    public Otobüs() {
        super();
    }

    @Override
    public String getRenk() {
        return super.getRenk();
    }

    @Override
    public void setRenk(String renk) {
        super.setRenk(renk);
    }

    @Override
    public int getMotor() {
        return super.getMotor();
    }

    @Override
    public void setMotor(int motor) {
        super.setMotor(motor);
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
    public String toString() {
        return super.toString()+ "Otobüs{" +
                "yolcuSayısı=" + yolcuSayısı +
                '}';
    }


}
