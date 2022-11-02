package Ders_Günleri.Ornek_Sorular.Ornek2;

public class Borsh extends food implements IFood {
    void boil (){
        System.out.println("Haşlanıyor");
    }
    void eatTomorrow (){
        System.out.println("Yarın yenmek için hazırlandı");
    }

    @Override
    public void taste() {

    }

    @Override
    public double ucret() {
        return 33;
    }
}
