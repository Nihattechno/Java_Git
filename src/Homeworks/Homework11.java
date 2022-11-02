package Homeworks;

import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Soru 1
       System.out.print("Lütfen bir sayı giriniz= ");
        int sayı = scanner.nextInt();

        int çarpım=1;

        while (sayı>=1){

            çarpım=çarpım*sayı;
            sayı--;

        }
        System.out.println(çarpım);

        // Soru 2
        int çtoplam=0;
        int ttoplam=0;
        int sayac =10;

        while (sayac>=0){

            if (sayac%2==0){
                çtoplam=çtoplam+sayac;
            }
            else {
                ttoplam=ttoplam+sayac;
            }
            sayac--;
        }
        System.out.print("Çift sayıların toplamı= "+çtoplam+"\nTek sayıların toplarmı= "+ttoplam);

        // Soru 3
        int sayac1 =100;

        while (sayac1>=0){
            if (sayac1%2==1){
                System.out.println(sayac1);
            }
            sayac1--;
        }

        // Soru 4
        int sayac2=100;

        while (sayac2>=0){
           if (sayac2%4==0 && sayac2%5==0){

               System.out.println(sayac2);
           }
           sayac2--;
        }

        // Soru 5
        int randomsayı;
        int şans;

        do {
            System.out.print("Lütfen 0-100 arasında bir sayı giriniz= ");
             şans = scanner.nextInt();
             randomsayı = (int)(Math.random()*101);
             if (şans==randomsayı){
                 System.out.println("Tebrikler doğru sonuç");
                 break;
             }
             else {
                 System.out.println("Tekrar deneyiniz unluku !!");
                 System.out.println("Random sayı buydu= "+randomsayı);
             }
        }while (şans!=randomsayı);

    }
}
