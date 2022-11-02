package Ders_Günleri.ClassAndObject.Interfaces.Ornek4;

import java.util.ArrayList;

public class ArabaMain {
    public static void main(String[] args) {
        TeslaCar rt10 = new TeslaCar("Yeni",1950);
        ToyotaPrius tytpri = new ToyotaPrius("Prius",1850);
        Bus merso = new Bus("Merso",2857);

        ArrayList<Vehicle> araba = new ArrayList<>();
        araba.add(rt10);
        araba.add(tytpri);
        araba.add(merso);

        for (Vehicle v : araba){
            System.out.println(v.getClass().getSimpleName());
            System.out.println("\n**********\n");
            System.out.println("Arabanın motoru "+v.getEngine());
            System.out.println("Arabanın modeli "+v.getModel());

            if (v instanceof TeslaCar){
                System.out.println(((TeslaCar) v).changeBattery());
                System.out.println(((TeslaCar) v).changeOil());
                System.out.println(((TeslaCar) v).drive());
                System.out.println("\n**********\n");
            }
            else if (v instanceof ToyotaPrius){
                System.out.println(((ToyotaPrius) v).drive());
                System.out.println(((ToyotaPrius) v).changeOil());
                System.out.println(((ToyotaPrius) v).changeBattery());
                System.out.println("\n**********\n");
            }
            else if (v instanceof Bus){
                System.out.println(((Bus) v).drive());
                System.out.println(((Bus) v).changeDiesel());
            }
        }
    }
}
