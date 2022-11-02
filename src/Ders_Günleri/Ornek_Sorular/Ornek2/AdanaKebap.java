package Ders_Günleri.Ornek_Sorular.Ornek2;

public class AdanaKebap extends food implements IFood {
    void marinade (){
        System.out.println("Marine ediliyor.");
    }
    void  grill (){
        System.out.println("Orta pişmiş kâfidir ustam");
    }

    @Override
    public void taste() {
        System.out.println("Fena acıdır bulaşma");
    }

    @Override
    public double ucret() {
        return 55;
    }
}
