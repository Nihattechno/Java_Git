package Homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework15 {
    public static void main(String[] args) {
       String a ="Bugün hava çok sıcak geldı $25";
       ArrayList<String> paralar=new ArrayList<>();
       paralar.add("$-25");
       paralar.add("$-25");
       paralar.add("$25");
        String b="6678421312";
        int [] dizi1 ={2,4,6};
        int []dizi2={1,2,3,4,5};
        int[] list = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
        int[] list1 = {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};


    }

    // Soru 1
    public static int randomNum(int max){
        int dönen=(int)(Math.random()*max);
        return dönen;
    }

    // Soru 2
    public static String ortaKelime(String kelime){
        String[] mehmet=kelime.split(" ");
        int değer = (mehmet.length/2);
        String ortkelime =mehmet[değer];
        return ortkelime;
    }

    // Soru 3
    public static void reverseString (String girdi){
        char [] dizi = new char[girdi.length()];
        for (int i = 0; i < girdi.length()-1; i++) {
            dizi[i]=girdi.charAt(i);
        }
        for (int j = girdi.length()-1; j >=0 ; j--) {
            System.out.print(dizi[j]);
        }
    }

    // Soru 4
    public static String reverseWord (String gelen){
        String dönen ="";
       int sayı=1;
        for (int i = 0; i < gelen.length()-1; i++) {
           if (gelen.charAt(i)==' '){
               sayı++;
           }
        }
        String[] kelime = new String[sayı];
        for (int j = 0; j <gelen.length()-1 ; j++) {
            kelime=gelen.split(" ");
        }
        for (int i = kelime.length-1; i >=0 ; i--) {
            dönen=dönen+" "+kelime[i];
        }
        return dönen;
    }

    // Soru 5
    public static int getSum (ArrayList<String> gelen){
        int dönen=0;
        int toplam=0;
        for (int i = 0; i <=gelen.size()-1 ; i++) {
            dönen = Integer.parseInt(gelen.get(i).replaceAll("[^0-9-]",""));
            toplam=dönen+toplam;
        }
        if (toplam<0){
            toplam=-1;
        }
        return toplam;
    }

    // Soru 6
    public static void EvenOddNums (String geldi){
        int dönen=0;
        int toplam=0;
        String b="";
        for (int i = 0; i < geldi.length(); i++) {
            b=Character.toString(geldi.charAt(i));
            dönen=Integer.parseInt(b);
            if (dönen%2==0)
                toplam=toplam+dönen;
            else
                toplam=toplam-dönen;
        }
        System.out.print(toplam);
    }

    // Soru 7
    public static int addDigit (int gelen){
       int dönen=0;
       int değer =gelen;
       int mod = 0;
       do {
           mod=değer%10;
           dönen=mod+dönen;
           değer=değer/10;
           if (değer<10){
               dönen=dönen+değer;
               değer=dönen;
               dönen=0;
           }
       } while (değer>10);
return değer;
    }

    // Soru 8
    public static boolean powerofThree(int girilen){
        int değer=girilen;
        int sayı=1;
        boolean döndü=false;
       while (değer>=1){
           değer=değer/3;

           if (değer==1 && Math.pow(3,sayı)==girilen){
               döndü=true;
               break;
           }
           sayı++;
       }
        return döndü;
    }

    // Soru 9
    public static ArrayList<Integer> append (int [] dizi1, int [] dizi2){
       ArrayList<Integer> dizi3=new ArrayList<>();

        for (int i = 0; i < dizi1.length; i++) {
            dizi3.add(dizi1[i]);
        }
        for (int i =0; i <dizi2.length ; i++) {
            dizi3.add(dizi2[i]);
        }

        return dizi3;
    }

    // Soru 10
    public static boolean isUnique (int[]dizi){
        boolean dönen=false;
        ArrayList<Integer>varmı=new ArrayList<>();

        for (int i = 0; i <dizi.length ; i++) {
            if (varmı.contains(dizi[i])){
                dönen=true;
            }
            varmı.add(dizi[i]);

        }
        return dönen;
    }

}
