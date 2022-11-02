package Ders_Günleri.Metodlar;

import java.util.Arrays;
import java.util.Scanner;

public class Metod_Sorular_4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        notalma();
    }

    public static String[] notalma (){
        Scanner scanner=new Scanner(System.in);
        int[][] notlar=new int[3][3];
        String [] isimler= new String[3];
        int[] ortalama=new int[isimler.length];

        for (int i = 0; i < notlar.length ; i++) {
            System.out.print("Öğrenci ismi= ");
            isimler[i]= scanner.nextLine();
            for (int j = 0; j < notlar[i].length; j++) {
                System.out.print("Lütfen öğrencinin ismini ardından notunu ");
                notlar[i][j]= scanner.nextInt();
                scanner.nextLine();
            }
        }
        for (int k = 0; k < notlar.length ; k++) {
            for (int l = 0; l <notlar[k].length ; l++) {
                ortalama[k]=notlar[k][l]+ortalama[k];
            }
            ortalama[k]=ortalama[k]/notlar[k].length;
        }



       String[]  dönen=new String[3];
        for (int i = 0; i < dönen.length ; i++) {
            dönen[i]=isimler[i]+":"+" "+ortalama[i];
            System.out.println(dönen[i]);
        }
        return dönen;
    }


}
