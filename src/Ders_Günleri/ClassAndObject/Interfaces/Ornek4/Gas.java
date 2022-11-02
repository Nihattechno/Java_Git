package Ders_Günleri.ClassAndObject.Interfaces.Ornek4;

public interface Gas extends IVehicle {
    @Override
    default String drive() {
        return null;
    }
    String changeOil ();
}
