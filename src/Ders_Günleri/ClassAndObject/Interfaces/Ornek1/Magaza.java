package Ders_Günleri.ClassAndObject.Interfaces.Ornek1;

public class Magaza implements IMagaza,Iürün {
    // Bu şekilde 2 tane interface implementation yapıyorsun

    // istediğin kadar implements alabilirsin virgül koyup yanına eklersin
    @Override
    public void bilgileriAl() {
        // Kodlar buraya
    }

    @Override
    public void kredibiliteyiKontrol() {
        // kodlar buraya
    }

    @Override
    public void krediSecenekleri() {
        // kodlar buraya
    }

    @Override
    public void urunİsmi() {
        System.out.println("Ürün isimleri yazılıyor");
    }

    @Override
    public void urunHesap() {

    }
}
