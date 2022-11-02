package Ders_Günleri.ClassAndObject.Abstract_Classes.Ornek2;

public abstract class Sekil {
    private String name;

    public abstract double alanBul ();
    public abstract double cevreBul ();


    public String getName() {
        return name;
    }
    public void ciz (){
        System.out.println(getName()+" Çiziliyor");
    }

    @Override
    public String toString() {
        return "Sekil{" +
                "name='" + getName() + '\'' +
                ", alan=" + alanBul() +
                ", cevre=" + cevreBul() +
                '}';
    }
}
