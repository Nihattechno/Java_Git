package Homeworks;

import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Soru 1
        System.out.print("Lütfen 3 tane sayı giriniz= ");
        int sayı1_1 = scanner.nextInt();
        scanner.nextLine();
        int sayı2 = scanner.nextInt();
        scanner.nextLine();
        int sayı3 = scanner.nextInt();

        if (sayı1_1>sayı2 && sayı1_1>sayı3){
            System.out.println("Girilen en büyük sayı ilk sayıdır");

        }
        else {

            if (sayı2>sayı1_1 && sayı2>sayı3){
                System.out.println("Girilen en büyük sayı ikinci sayıdır.");
            }
            else {
                System.out.println("Girilen en büyük sayı son sayıdır.");

            }

        }

        // Soru 2
        System.out.print("Lütfen bir sayı giriniz= ");
        int sayı1 = scanner.nextInt();
        int bas_1 = sayı1%10;
        int bas_10 = (sayı1/10)%10;

        if ((bas_1%2)==1 && (bas_10%2)==1){

            if (bas_1==bas_10){
                System.out.println("Girilen sayının birler basamağı ile onlar basamağı tektir ve eşittir.");
            }
            else {
                System.out.println("Girilen sayının birler basamağı ile onlar basamağı tektir ve eşit değildir.");
            }

        }
        else {
            if (bas_1==bas_10){

                System.out.println("Girilen sayının birler basamağı veya onlar basamağı tek değildir ama eşittir.");
            }
            else {
                System.out.println("Girilen sayının birler basamağı  veya onlar basamağı tek değildir ve eşitte değildir.");

            }

        }

        // Soru 3
        System.out.print("Lütfen bir cümle giriniz= ");
        String kelime1= scanner.nextLine();

        if (kelime1.contains(" ") && kelime1.contains("A")){

            System.out.println("Kelimenin içinde hem boşluk hemde A harfi vardır.");
        }
        else {
            if (kelime1.contains(" ")){
                System.out.println("Kelimede boşluk vardır ama A yoktur.");
            }
            else if(kelime1.contains("A")) {
                System.out.println("Kelimede boşluk yoktur ama A vardır.");

            }
            else {
                System.out.println("Kelimede boşlukta  yoktur A'da yoktur.");
            }
        }


    }
}
