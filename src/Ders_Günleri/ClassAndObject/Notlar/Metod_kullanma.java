package Ders_Günleri.ClassAndObject.Notlar;

public class Metod_kullanma {
    public static void main(String[] args) {

        // Class'ın içine yazdırma metodu oluşturarak tek satırla bütün class'ı yazdırabiliyorsun
        Person insan=new Person();
        Person insa1 = new Person();
        insan.name="nihat";
        insan.surname="yavuz";
        insan.yaş=23;
        insan.doğumyılı=1998;

        insan.yazdırma();
        insan.getBirthYear();
        insan.getInitials();

    }
}
