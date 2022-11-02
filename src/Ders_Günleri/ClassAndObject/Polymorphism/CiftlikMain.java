package Ders_Günleri.ClassAndObject.Polymorphism;

public class CiftlikMain {
    public static void main(String[] args) {

        // Ortak kullanılacak metodları tek bir metodda kullanabilmek için kullanılır

        Kopek kopek1 = new Kopek("Karabaş");
        Kedi kedi1 = new Kedi("North");

        Hayvan kedi2 = new Kedi("xxsd");
        Hayvan kopek2 = new Kopek("sadasda");

        kedi2.ses();

        sesGetir(kedi1);
        sesGetir(kopek2);

    }
    public static void sesGetir (Hayvan h){
        h.ses();
    }
}
