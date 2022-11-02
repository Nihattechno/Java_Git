package Ders_Günleri.ClassAndObject.AccesModifiers.DiğerErişimler.bir;

public class Kitapçı {
    public static void main(String[] args) {
        kitap ktp1 = new kitap();
        ktp1.name="Yeni java";

        kitap ktp2= new kitap("Algoritma");

        // Burada aynı pakette olduğu için rahatlıkla çağırılabiliyor default
        // olanlar.

    }
}
