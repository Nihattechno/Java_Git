package Ders_Günleri.ClassAndObject.Polymorphism;

public class Hayvan {
    private String name;

    public Hayvan(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void ses (){

        System.out.println("ses çıkardı");
    }
}
