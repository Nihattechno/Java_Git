package Ders_Günleri.Metodlar;

import java.util.Scanner;

public class Metod_Sorular_3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Karşılaştırılacak 1. sayıyı giriniz= ");
        int sayı1= scanner.nextInt();
        System.out.print("Karşılaştırılacak 2. sayıyı giriniz= ");
        int sayı2= scanner.nextInt();

        System.out.print(enb(sayı1,sayı2));


    }

    public static int enb (int a,int b){
        int enb =a;
        if (b>a){
            enb=b;
        }
        return enb;
    }
}
