package Ders_Günleri.ClassAndObject.Sorular._Soru8_;

public class Kitapci {
    public static void main(String[] args) {
        Book ktp1=new Book("Moby Dick",1865,"İsabella");
        Book ktp2=new Book("Oku",1756);
        Book ktp3 = new Book("Common Sense");

        ktp2.yazdırma();
        ktp3.yazdırma();

        // Ekrana yazdırdığın zaman toString yaparak ekrana yazdırır
        // Bu yüzden önce bi class'ında arar tostringi bulursa
        // Direk yazdırır bulamazsa nasıl yazacağını bilemediği için
        // yazdıramaz
        System.out.println(ktp1);

    }
}
