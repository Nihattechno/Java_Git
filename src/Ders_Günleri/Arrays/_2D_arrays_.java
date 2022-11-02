package Ders_Günleri.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _2D_arrays_ {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

      /*  int [][] notlar = new int[2][3]; // 2 satır 3 sutun tanımlar mesela 2 öğrencinin  3 ders notu gibi, 6 elemanlı bir dizidir.
        int [][] notlar1={{23,45,67},{56,69,36}}; // Bu şekilde de tanımlanabilir, 2 öğrencini 3 ders notu

        int toplam=0;
        for (int i = 0; i <2; i++) {
            for (int j = 0; j <3 ; j++) {
                notlar[i][j]= scanner.nextInt();
                System.out.println("Öğrenci "+i+" Ders "+j+" "+notlar[i][j]);
                toplam=toplam+notlar1[i][j];
            }
        }
        System.out.println(toplam);

        int [][] random= new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                random[i][j]=(int)(Math.random()*11);
            }
        }
        for (int k = 0; k < 3 ; k++) {
            for (int i = 0; i <4 ; i++) {

                System.out.println(k+" sutun "+i+" harf "+random[k][i]);
            }

        }

        int[][] tablo= new int[4][3];

        int enb =0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Lütfen belirtilen değerleri giriniz= ");
                tablo[i][j]= scanner.nextInt();
                enb=Math.max(tablo[i][j],enb);

            }
        }
        System.out.println(enb);
        // Dizinin uzunluğunu bulmak içinde şöyle yapılır

        System.out.println("Satırın uzunluğu= "+ tablo.length);
        System.out.println("1. Sutunun uzunluğu= "+tablo[0].length); // Veya oraya i'de yazılıp döngü ile kontrol edilebilir.
        System.out.println("2. Sutunun uzunluğu= "+tablo[1].length);
        System.out.println("3. Sutunun uzunluğu= "+tablo[2].length);*/


        // Tablonun uzunlukları hep sabit olmak zorunda değildir şu şekilde de olabilir. // sonucu yazdırdığında çıkıyor

        int [][] tablo1=
                {       {1, 2, 3, 4},
                        {4, 5, 6},
                        {1,2},
                        {1,5,8,6,3,2}
                    };
        for (int i = 0; i < tablo1.length; i++) {
            for (int j = 0; j < tablo1[i].length ; j++) {
                System.out.print(tablo1[i][j]);
            }
            System.out.println();
        }

    }}
