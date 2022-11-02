package Ders_Günleri.ClassAndObject.Enum.Ek_Konu;

public class Konu {
    public static void main(String[] args) {

        Aylar ay = Aylar.EKİM;

        System.out.println("Kaçıncı ay= "+ay.ayNo);
        System.out.println("Kaç gün= "+ay.günNo);
        System.out.println("Ayın ismi= "+ay.isim);
        System.out.println(ay);
    }
}
