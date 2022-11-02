package Ders_Günleri.Ornek_Sorular.Ornek2;

public class Lahmacun extends food implements IFood {
    void dough (){
        System.out.println("İnce güzel hamur olsa güzel pişer");
    }
    void addMeat (){
        System.out.println("Az soğanlı kaliteli et ekledik.");
    }
    void bake (){
        System.out.println("Kısık odun ateşinde çıtır hale getiriliyor.");
    }

    @Override
    public void taste() {

    }

    @Override
    public double ucret() {
        return 33;
    }
}
