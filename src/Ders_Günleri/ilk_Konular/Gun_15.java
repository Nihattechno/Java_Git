package Ders_Günleri.ilk_Konular;

import java.util.Scanner;

public class Gun_15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

      /*  System.out.print("Lütfen bir sayı giriniz= ");
        int sayı = scanner.nextInt();
        int sonuc = sayı;

        while (sayı>=0){
            if (sayı*sayı==sonuc){
                System.out.print("Girilen sayının çarpımına ulaşılan sayı= "+sayı);
                break;
            }
            else {
                sayı--;
            }
        }

        System.out.print("Lütfen bir sayı giriniz= ");
        int girilen = scanner.nextInt();

        int çarpım=1;

        for (int i =1;i<=girilen;i++){

            çarpım=çarpım*i;

        }
        System.out.println("çarpım sonucu= "+çarpım);

        int ilkç=2;
        int sonuç=0;

        for (int i =1;i<=10;i++){
            sonuç=ilkç*i;
            System.out.println(ilkç+" x "+i+" = "+sonuç);
        }

        System.out.print("Lütfen bir ifade giriniz= ");
        String ifade = scanner.nextLine();

        int uzunluk = ifade.length()-1;
        char harf;

        for (int i=0;i<=uzunluk;i++){

            harf=ifade.charAt(i);
            if (harf==' '){
                continue;
            }
            System.out.println("Cümlenin"+i+". harfı= "+harf);v

        }

        char harf1;

        for (int i=1;i<=255;i++){

            harf1=(char)i;
            System.out.println(i+". numaralı harf= "+harf1);

        }

        // Çarpım tablosunu 1'den 10'a kadar yaz
        int sonuc;

        for (int i=1;i<=10;i++){

            for (int j=1;j<=10;j++){

                sonuc=i*j;
                System.out.println(i+" x "+j+" = "+sonuc);
            }
            System.out.println();
        }

        for (int i=1;i<=5;i++){

            for (int j =1;j<=5;j++){

                System.out.print("#");
            }
            System.out.println();
        }

        for (int i=5;i>=0;i--){

            for (int j=1;j<=i;j++){
            System.out.print("*");

            }
            System.out.println();
        }*/

        for (int i=1;i<=10;i++){
          /*  if (i<=5){
                for (int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
                continue;
            }*/

                for (int y=5;y>=1;y--){
                    System.out.print("*");
                }
                System.out.println();



        }



    }}

