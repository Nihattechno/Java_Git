package Ders_Günleri.Ornek_Sorular.Ornek2;

public class Palov extends food implements IFood {
    void fry (){
        System.out.println("Palov pişiriliyor");
    }
    void boil (){
        System.out.println("Palov haşlanıyor");
    }

    @Override
    public void taste() {

    }

    @Override
    public double ucret() {
        return 44;
    }
}
