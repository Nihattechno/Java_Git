package Homeworks;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String h1 = "paper";
        String s1 =h1.toUpperCase();
        System.out.println("Büyük harf hali= "+s1);

        String h2 = "OraNge";
        String s2 = h2.toLowerCase();
        System.out.println("Küçük harf hali= "+s2);

        String h3 = "New Jersey";
        String s3 = h3.toUpperCase();
        System.out.println("Büyük harf hali= "+s3);

        String h4 = "New York";
        String s4 = h4.toLowerCase();
        System.out.println("Küçük harf hali= "+s4);

        String h5 = "PADDLE";
        String s5 = h5.toLowerCase();
        System.out.println("Küçük harf hali= "+s5);

        String h6 = "apple";
        boolean s6 = h6.contains("app");
        System.out.println("app içeriyor mu? ="+s6);

        System.out.println("Lütfen bir cümle yazınız");
        String girdi = scanner.nextLine();
        String çıktı = girdi.replaceAll("[ ]","");
        int girdi1 = girdi.length();
        int çıktı1 = çıktı.length();
        int sonuç = (girdi1-çıktı1)+1;
        System.out.println("Girilen cümlenin kelime sayısı= "+sonuç);



    }
}
