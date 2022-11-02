package Ders_Günleri.ClassAndObject.Polymorphism;

public class Kedi extends Hayvan{
    public Kedi(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void ses() {
        System.out.println("Miyavladı");
    }

}
