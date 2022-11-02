package Ders_Günleri.ClassAndObject.Polymorphism;

public class Kopek extends Hayvan{
    public Kopek(String name) {
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
        System.out.println("Havladı");
    }
}
