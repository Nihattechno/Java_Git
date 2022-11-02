package Ders_Günleri.ClassAndObject.Protected_Inheritance.P2Ornek;

import Ders_Günleri.ClassAndObject.Protected_Inheritance.P1Ornek.Hayvan_1;

public class P2Kedi extends Hayvan_1 {

    public P2Kedi(String cinsi, int yaş) {
        super.cinsi=cinsi;
        super.yaş=yaş;
    }

    // İstersen constructorlar istersen metodla çağırabiliyorsun
    // ama düz field olarak ulaşamıyorsun veyahut değişim yapamıyorsun
    // illa metod veya constructor olması lazım
    public void setCinsi (String cinsi){

        super.cinsi=cinsi;
    }
}
