package Homeworks;

import java.util.Scanner;

public class Homework2 {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen isminizi giriniz: ");
        String h1 = scanner.nextLine();
        System.out.println("h1= "+h1+"\n");

        System.out.print("Aklınızda tuttuğunuz bir sayıyı ekrana girin: ");
        int h2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("h2= "+h2+"\n");

        System.out.print("Lütfen en sevdiğiniz meyveyi girin: ");
        String h3 = scanner.nextLine();
        System.out.println("h3= "+h3+"\n");

        System.out.print("Lütfen arabanızda ki kapı sayısını giriniz: ");
        int h4 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("h4= "+h4+"\n");

        System.out.print("Lütfen 10 sene önce yaşadığınız şehri yazınız: ");
        String h5 = scanner.nextLine();
        System.out.println("h5= "+h5+"\n");

        System.out.print("Lütfen doğum gününüzü giriniz: ");
        String h6 = scanner.nextLine();
        System.out.println("h6= "+h6+"\n");

        System.out.print("Bir banka hesabınız var mı? ");
        String cevap = scanner.nextLine();
        String banka;
        if (cevap.equals("Evet") || cevap.equals("evet")){

            banka = "True";
            System.out.println("h7= "+banka+"\n");
        }
        else {

            banka="false";
            System.out.println("h7= "+banka+"\n");
        }

        System.out.print("Lütfen kilonuzu kilo cinsinden giriniz: ");
        byte h8 = scanner.nextByte();
        System.out.println("h8= "+h8+"\n");

        System.out.print("Lütfen boyunuzu metre cinsinden yazınız: ");
        float h9 = scanner.nextFloat();
        System.out.println("h9= "+h9+"\n");
    }

}
