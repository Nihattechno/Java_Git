package Ders_Günleri;

import java.util.Scanner;

public class ss1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String girilen = scanner.nextLine();

        int sayı = girilen.length();
        sayı=sayı-1;
        int h1 =0;
        int y1=1;


        for ( int i=0; i<=sayı;i++){

            int y2 =y1+1;
            int h2 = h1+1;
            char x =girilen.charAt(h1);
            char y = girilen.charAt(h2);
            if (x==y){
                System.out.print(y1+". harf ve "+y2+". harf aynıdır.");
                System.out.print("Harf 1 ="+x +" harf 2 ="+y);
                break;

            }
            else {
                if (i==sayı)
                {
                    System.out.println("Yan yana aynı gelen harf yoktur.");
                    break;
                }
                h1++;
                y1++;


            }


        }

    }
}
