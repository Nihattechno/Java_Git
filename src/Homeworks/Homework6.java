package Homeworks;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {

       /* int numh1 = 10;
        int nums1 = 5;
        int sonuc1 = numh1/nums1;
        System.out.println("Sonuc1= "+sonuc1);


        int numh2 = 25;
        int nums2 = 5;
        int sonuc2 = numh2/nums2;
        System.out.println("Sonuc2= "+sonuc2);


        double numh3 = 23.8;
        double nums3 = 3.8;
        double numt3 = 7.5;
        double sonuc3 = (numh3*nums3)*numt3;
        System.out.println("Sonuc3 = "+sonuc3);


        double numh4 = 17.5;
        double nums4 = 3.7;
        double numt4 = 74.3;
        double numr4 = 4.5;
        double sonuc4 = (numh4*nums4)*(numt4*numr4);
        System.out.println("Sonuc4= "+sonuc4);


        int numh5 = 10;
        int nums5 = 30;
        int numt5 = 25;
        int numr5 = 18;
        int sonuc5 = (numh5*nums5)*(numt5*numr5);
        System.out.println("Sonuc5= "+sonuc5);


        int numh6 = 18;
        int nums6 = 7;
        int sonuc6 = numh6%nums6;
        System.out.println("Sonuc6= "+sonuc6);


        int numh9 = 27;
        int nums9 = 9;
        int sonuc9 = numh9-nums9;
        System.out.println("Sonuc9= "+sonuc9);


        int numh10 = 90;
        int nums10 = 40;
        int numt10 = 10;
        int numr10 = 10;
        int sonuc10 = (((numh10-nums10)-numt10)-numr10);*/

        Scanner scanner = new Scanner(System.in);

        int h11 = scanner.nextInt();
        int s11 = h11%10;
        System.out.println("h11'in birler basamağı= "+s11);


        int h12= scanner.nextInt();
        int s12 = (h12/10)%10;
        System.out.println("h12'nin yüzler basamağı= "+s12);


        int h13 = scanner.nextInt();
        int s13 = (h13/100)%10;
        System.out.println("h13'ün yüzler basamağı= "+s13);


        System.out.println("Lütfen vize notunuzu giriniz= ");
        int vize = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Lütfen final notunuzu giriniz= ");
        int final1 = scanner.nextInt();
        double vizeort = (vize*0.4);
        double finalort = (final1*0.6);
        double ort = vizeort+finalort;
        System.out.println("Sene sonu ortalamanız= "+ort);




    }
}
