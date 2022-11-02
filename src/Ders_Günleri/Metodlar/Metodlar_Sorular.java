package Ders_Günleri.Metodlar;

import java.util.Arrays;
import java.util.Scanner;

public class Metodlar_Sorular {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] dizi= new int[5];
        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Lütfen doldurmak istediğiniz değeri girin= ");
            dizi[i]= scanner.nextInt();
        }
        maxbulma(dizi);
        minbulma(dizi);
        ortalamabulma(dizi);

        int [] dizi2= new int[5];
        for (int j = 0; j < dizi2.length; j++) {
            dizi2[j]=dizi[j]*dizi[j];

        }
        maxbulma(dizi2);
        minbulma(dizi2);
        ortalamabulma(dizi2);


    }

    public  static void maxbulma (int[] değer){
        Arrays.sort(değer);
        System.out.println("Dizinin en büyük değeri= "+değer[değer.length-1]);

    }
    public  static void minbulma(int[] sayı){
        Arrays.sort(sayı);
        System.out.println("Dizinin en küçük değeri= "+sayı[0]);

    }
    public  static void ortalamabulma(int[] sayı){
        int toplam=0;
        for (int i = 0; i < sayı.length ; i++) {
            toplam=toplam+sayı[i];
        }
        toplam=toplam/ sayı.length;
        System.out.println("Dizinin ortalaması= "+toplam);

    }


}
