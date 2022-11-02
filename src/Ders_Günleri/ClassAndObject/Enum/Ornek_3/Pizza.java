package Ders_Günleri.ClassAndObject.Enum.Ornek_3;

public class Pizza {
    Pizza_size size;

    public Pizza(Pizza_size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                '}';
    }
}
