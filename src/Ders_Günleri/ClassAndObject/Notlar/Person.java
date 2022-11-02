package Ders_Günleri.ClassAndObject.Notlar;

public class Person {
    // Bunlara proterties deniyor.
    String name;
    String surname;
    int yaş;
    int doğumyılı;

    public void yazdırma(){

        System.out.println("Kişinin ismi= "+name);
        System.out.println("Kişinin soyadı= "+surname);
        System.out.println("Kişinin yaşı= "+yaş);
    }
    public void getBirthYear(){

        System.out.println("Kişinin doğum yılı= "+doğumyılı);
    }
    public void getInitials(){

        char bharf=name.trim().toUpperCase().charAt(0);
        char sharf =surname.trim().toUpperCase().charAt(0);
        System.out.println(bharf+"."+sharf+".");

    }
}
