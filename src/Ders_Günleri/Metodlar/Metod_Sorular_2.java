package Ders_Günleri.Metodlar;

import java.util.Scanner;

public class Metod_Sorular_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int girdi=0;

        do {
            System.out.print("1-Çıkarma\n2-Toplama\n3-Çarpma\n4-Bölme\n5 Faktoriyel\n6-Çıkış\nSeçiminiz=");
            girdi= scanner.nextInt();
            işlemler(girdi);

        }while (girdi<6);

    }

    public static void toplama (int a, int b){
        int toplam = a+b;
        System.out.println("Toplama sonucu= "+toplam+"\n");

    }
    public static void çıkarma (int a, int b){
        int çıkarma = a-b;
        System.out.print("Çıkarma sonucu= "+çıkarma+"\n");
    }
    public static void çarpma (int a, int b){
        int çarpma =a*b;
        System.out.print("Çarpma sonucu= "+çarpma+"\n");
    }
    public static void bölme (int a, int b){
        int bölme =a/b;
        System.out.print("Bölme sonucu= "+bölme+"\n");

    }
    public static void faktoriyel (int a){
        int faktoriyel=1;
        for (int i = 1; i <= a; i++) {
            faktoriyel=i*faktoriyel;
        }
        System.out.print("Girdiğiniz sayının faktoriyel sonucu= "+faktoriyel+"\n");

    }
    public static void çıkış (){
        System.out.print("Programdan çıkış yapılıyor, Hoşçakalın");

    }
    public static void işlemler (int a){
        int girdi1=0;
        int girdi2=0;
        if (a<5){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Lütfen ilk girdiyi giriniz= ");
            girdi1 = scanner.nextInt();
            System.out.print("Lütfen ikinci girdiyi giriniz= ");
            girdi2= scanner.nextInt();

        }
        else {
            if (a==5){Scanner scanner = new Scanner(System.in);
            System.out.print("Lütfen ilk girdiyi giriniz= ");
            girdi1= scanner.nextInt();}

        }
        switch (a){

            case 1:
                çıkarma(girdi1,girdi2);
                break;
            case 2:
                toplama(girdi1,girdi2);
                break;
            case 3:
                çarpma(girdi1,girdi2);
                break;
            case 4:
                bölme(girdi1,girdi2);
                break;
            case 5:
                faktoriyel(girdi1);
                break;
            case 6:
                çıkış();
                break;
            default:
                System.out.print("Lütfen belirtilen rakamlardan birini giriniz");
        }

    }
}
