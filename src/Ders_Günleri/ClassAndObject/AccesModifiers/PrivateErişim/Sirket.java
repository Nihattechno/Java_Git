package Ders_Günleri.ClassAndObject.AccesModifiers.PrivateErişim;

public class Sirket {
    public static void main(String[] args) {
        Calışan cls1=new Calışan();
        cls1.id=1;
        cls1.name="Nihat";
        cls1.surname="Yavuz";

        cls1.şifreatama("Grille9112");
        // Private yapıldığı için şifreye direk erişim olmuyor
        // Dolaylı yoldan kontrol sağlanarak ulaşım oluşturuluyor
        // Güvenliği arttırmak için
        // Mesela şifre 1234'de olabilirdi ve güvenliği az olurdu
        // Bu şekilde kendi kontrolune aldın
        cls1.sifregoster();
    }

}
