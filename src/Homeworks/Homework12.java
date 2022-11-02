package Homeworks;

import java.util.Scanner;

public class Homework12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       /*  // Soru 1
        for (int i=0;i<=100;i++){
            if (i%2==0){
                System.out.println(i);
            }
        }

        // Soru 2
        for (int i=0;i<=100;i++){

            if (i%4 == 0 && i%5 == 0){
                System.out.println(i);
            }
        }

        // Soru 3
        int toplam=0;
       for (int i=1;i<=10;i++){
           System.out.print("Lütfen bir sayı giriniz= ");
           int girilen =scanner.nextInt();

           if (girilen%2==0){
               toplam=toplam+girilen;
           }
           else {
               System.out.print("Döngü sonlanmıştır.");
               break;
           }
       }
        System.out.print("\nDöngü sonu toplam değer= "+toplam);

       // Soru 4 Çözüm 1
        System.out.print("Lütfen bir sayı giriniz= ");
        String sayı1 = scanner.nextLine();
        sayı1=sayı1.replaceAll("[ ]","" );
        int değer = sayı1.length();
        System.out.println(değer);

        // Soru 4 Çözüm 2
        double değer1 = scanner.nextDouble();
        int sayac1=1;
        int bölüm1=0;
        while (sayac1>=0){

            if (değer1<1){
                break;
            }değer1=değer1/10;

            bölüm1++;
            sayac1++;
        }
        System.out.println(bölüm1);

        // Soru 5
        System.out.print("Lütfen bir sayı giriniz= ");
        int sayı = scanner.nextInt();

        int sayac=1;
        int bölüm=sayı;
        while (sayac>=0){
            if (bölüm<10){
                break;
            }
            bölüm=bölüm/10;
            sayac++;
        }
        if (bölüm==sayı%10){
            System.out.print("Girilen sayının ilk basamağı ile son basamağı aynıdır.");
        }
        else {
            System.out.print("Sayının ilk ve son basamağı farklıdır.");
        }

        // Soru 6
        System.out.print("Lütfen bir sayı giriniz= ");
        int sayı1 = scanner.nextInt();
        int değer =0;
        int sonuç=0;

        while (sayı1>0){

            değer=sayı1%10;

            sonuç=sonuç*10+değer;
            sayı1=sayı1/10;
        }
        System.out.print("Girilen sayının tersi= "+sonuç);

        // Soru 7
        System.out.print("Lütfen bir cümle giriniz= ");
        String cümle = scanner.nextLine().toLowerCase();

        int uzunluk = cümle.length();
        int asayısı=0;
        char harf;

        for (int i=0;i<uzunluk;i++){

            harf=cümle.charAt(i);
            if (harf==' '){
                asayısı++;
            }
        }
        System.out.print("Girilen cümlede ki a sayısı= "+asayısı);

        // Soru 8
        System.out.print("Lütfen bir cümle giriniz= ");
        String cümle = scanner.nextLine().trim();

        int uzunluk = cümle.length();
        int ksayısı=0;
        char boşluk;

        for (int i=0;i<uzunluk;i++){

            boşluk=cümle.charAt(i);
            if (boşluk==' '){
                ksayısı++;
            }
        }
        ksayısı++;
        System.out.print("Girilen cümlede ki kelime sayısı= "+ksayısı);


        // Soru 9
        System.out.print("Lütfen bir cümle giriniz= ");
        String cümle1 = scanner.nextLine().trim();

        int uzunluk1 = cümle1.length();
        char boşluk1=cümle1.charAt(0);
        System.out.println(boşluk1);

        for (int i=0;i<uzunluk1;i++){

            boşluk1=cümle1.charAt(i);

            if (boşluk1==' '){
                System.out.println(cümle1.charAt(i+1));
            }
        }*/

        // Soru 10
        int sayac=1;
        int değer=0;

        do {
            System.out.print("Lütfen bir sayı giriniz= ");
            int sayı = scanner.nextInt();
            if (değer>sayı){
                System.out.print("Girilen sayı bir önceki girilenden küçük olduğu için döngü sona erdi.");
                break;
            }
            değer=sayı;

        }while (sayac<=10);
    }
    }



