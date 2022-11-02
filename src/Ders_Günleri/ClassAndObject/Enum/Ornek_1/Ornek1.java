package Ders_Günleri.ClassAndObject.Enum.Ornek_1;

import java.util.Scanner;

public class Ornek1 {
    public static void main(String[] args) {
        Gun.Aylar ay = Gun.Aylar.ARALIK;
        Gun.günyazma(ay);

        System.out.println("İsmi= "+ay);
        System.out.println("İndexi= "+ay.ordinal());
        System.out.println("Aynı şekilde ismi= "+ay.name());

        for (Gun.Aylar a: Gun.Aylar.values()){
            System.out.println("Enumun içindeki değerler= "+a);
        }
    }

    public static String günalma (){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Lütfen seçtiğiniz ayı giriniz= ");
        String girdi = scanner.nextLine();

        return girdi;
    }
}
