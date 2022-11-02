package Homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class Homework14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // Soru 1
        int [] dizi = new int[4];

        for (int i = 0; i < dizi.length ; i++) {
            System.out.print("Lütfen "+i+". değeri giriniz= ");
            dizi[i]=scanner.nextInt();
        }
        Arrays.sort(dizi);
        int sonuc=dizi[dizi.length-1]-dizi[0];
        System.out.print("Enb ve enk farkı= "+sonuc);

        // Soru 2
        String [][] para = new String[2][3];
        int değer=0;
        int toplam=0;

        for (int i = 0; i < para.length ; i++) {
            for (int j = 0; j <para[i].length ; j++) {
                System.out.print("Lütfen verilen para değerini giriniz= (Orn=65$) ");
                para[i][j]= scanner.nextLine();
                para[i][j]=para[i][j].replaceAll("[^0-9]","");
                değer=Integer.parseInt(para[i][j]);
                toplam=değer+toplam;
            }
        }
        System.out.println(toplam);

    }
}
