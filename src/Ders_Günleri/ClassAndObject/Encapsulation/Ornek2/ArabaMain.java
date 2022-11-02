package Ders_Günleri.ClassAndObject.Encapsulation.Ornek2;

public class ArabaMain {
    public static void main(String[] args) {

        // Encapsulation Yazılım kuralı
        //Bütün değişkenler private olmak zorundadır
        //Eğer gerekirse private kaldırılabilir.

        Araba araba1= new Araba();
        araba1.setYıl(1978);
        araba1.setRenk("Mavi");
        araba1.setHacim(1998);
        araba1.setModel("Sedan");
        System.out.println(araba1);
    }
}
