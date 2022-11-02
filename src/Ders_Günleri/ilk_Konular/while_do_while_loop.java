package Ders_Günleri.ilk_Konular;

import java.util.Scanner;

public class while_do_while_loop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

      /*  int sayac = 0;
        int toplam = 0;

        while (sayac<6){

            System.out.print("Lütfen bir sayı giriniz= ");
            int sayı = scanner.nextInt();
            toplam=sayı+toplam;
            sayac++;


        }
        System.out.println("Girilen sayıların toplam sonucu= "+toplam);

        System.out.print("Lütfen bir sayı giriniz= ");
        int sayı1 = scanner.nextInt();

        int sayac1=sayı1;
        int toplama = 0;

        while (sayac1>=0){

            toplama=sayac1+toplama;
            sayac1--;

        }
        System.out.println(toplama);

        System.out.print("Lütfen bir sayı giriniz= ");
        int girilen = scanner.nextInt();

        int sayac =girilen;
        int toplam =0;

        while (sayac>=0){

            if (sayac%2==1){
                toplam=toplam+sayac;
                sayac--;
            }
            else {
                sayac--;
            }

        }
        System.out.print(toplam);


        // 1. yol uzun yol
        boolean sayac=true;
        int toplam =0;

        while (sayac){
            System.out.print("Lütfen bir sayı giriniz= ");
            int girilen = scanner.nextInt();

            if (girilen==0){
                sayac=false;
            }
            else {
                toplam=toplam+girilen;
            }

        }
        System.out.print(toplam);

        // 2.orta yol
        System.out.print("Lütfen bir sayı giriniz= ");
        int girilen = scanner.nextInt();

        int toplam =0;

        while (girilen!=0){

                toplam=toplam+girilen;

                girilen= scanner.nextInt();

        }
        System.out.print(toplam);


        // Bu da do while hali 1 kere yap doğruysa yanlış olana kadar yapmaya devam et
        int girilen=0;
        int toplam=0;

        do {
            System.out.print("Lütfen bir sayı giriniz= ");
           girilen = scanner.nextInt();

            toplam=toplam+girilen;

        }while (girilen!=0);
        System.out.println(toplam);*/

        String girilen;

        do {
            System.out.print("Programı durmak için x'e basınız= ");
            girilen= scanner.nextLine();
            if (!girilen.equalsIgnoreCase("x")){
            System.out.print("Program çalışmaya devam ediyor...\n");}

        }while (!girilen.equalsIgnoreCase("x"));
        System.out.print("Program sona erdi.");




    }
}
