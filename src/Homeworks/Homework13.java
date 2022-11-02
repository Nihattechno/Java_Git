package Homeworks;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Homework13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

      /*   // Soru 1
        String[] girdiler= new String[4];

        for (int i = 0; i < girdiler.length; i++) {
            System.out.print("Lütfen girdileri giriniz= ");
            girdiler[i]=scanner.nextLine();
        }
        for (int j = 0; j < girdiler.length ; j++) {
            if (girdiler[j].contains("Apple")){
                System.out.print("İstediğiniz girdi bulunmaktadır.");
                break;
            }
        }

        // Soru 1 çözüm 2

        String[] kelimeler={"Apple","Banana","Orange","Pineapple"};
        System.out.println(Arrays.binarySearch(kelimeler,"Apple"));


        // Soru 2
        int [] sayılar=new int[5];
        int enb=0;

        for (int i = 0; i < sayılar.length; i++) {
            System.out.print("Lütfen sayıları sıradan giriniz= ");
            sayılar[i]= scanner.nextInt();
            enb=Math.max(sayılar[i],enb );
        }
        System.out.println("Girilen en büyük rakam= "+enb);

        // Soru 3
        int [] küçükler= new int[4];

        int enk=0;
        for (int i = 0; i < küçükler.length; i++) {

            System.out.print("Lütfen sayıları sıradan giriniz= ");
            küçükler[i]= scanner.nextInt();
            if (i==0){
                enk=küçükler[0];
            }
            enk=Math.min(küçükler[i],enk);
        }
        System.out.print("Girilen en küçük değer= "+enk);

        // Soru 4
        int [] rakamlar= new int[5];

        for (int i = 0; i < rakamlar.length; i++) {
            System.out.print("Lütfen sayı değerlerini giriniz= ");
            rakamlar[i]= scanner.nextInt();
        }
        Arrays.sort(rakamlar);
        System.out.println(Arrays.toString(rakamlar));
        System.out.print("Girilen en büyük 2. kelime= "+rakamlar[rakamlar.length-2]);

        // Soru 5

        int [] değerler= new int[6];
        int sonuc=0;

        for (int i = 0; i < değerler.length ; i++) {

            System.out.print("Lütfen değerleri giriniz= ");
            değerler[i]= scanner.nextInt();
            if (değerler[i]%2==0){
                sonuc=sonuc+değerler[i];
            }
            else {
                sonuc=sonuc-değerler[i];
            }
        }
        System.out.println(sonuc);

        // Soru 6

        int[] toplamlar =new int[6];
        int toplam=0;

        for (int i = 0; i < toplamlar.length ; i++) {

            System.out.print("Lütfen "+i+". değeri giriniz= ");
            toplamlar[i]= scanner.nextInt();
            if (toplamlar[i]%2==0)
                toplam=toplam+toplamlar[i];
            else
                toplam=toplam-toplamlar[i];
        }
        System.out.print("Girilen dizinin toplam değeri= "+toplam);



       // Soru 7
        int [] ortalama = new int[6];

        int toplam=0;
        for (int i = 0; i < ortalama.length ; i++) {
            System.out.print("Lütfen değerleri giriniz= ");
            ortalama[i]= scanner.nextInt();
            toplam=toplam+ortalama[i];
        }
        toplam=toplam/ ortalama.length;
        System.out.println(toplam);

        // Soru 8

        String[] yazdır=new String[4];
        for (int i = 0; i < yazdır.length ; i++) {
            System.out.print("Lütfen değerleri giriniz= ");
            yazdır[i]= scanner.nextLine();
        }
        System.out.print( Arrays.toString(yazdır));

        // Soru 9

        String [] şehirler={"new jersey" , "new york", "boston","California"};
        System.out.println(şehirler.length);

        // Soru 10

        int [] toplamlar = new int[5];
        int toplama=0;

        for (int i = 0; i < toplamlar.length; i++) {
            System.out.print("Lütfen verileri giriniz= ");
            toplamlar[i]= scanner.nextInt();
            toplama=toplama+toplamlar[i];
        }
        System.out.println(toplama);*/

       // Soru 11
        String[] isimler = new String[5];
        for (int i = 0; i < isimler.length ; i++) {
            System.out.print("Lütfen kelimeyi giriniz= ");
            isimler[i]= scanner.nextLine();
        }
        String kelime="";
        int enb = isimler[0].length();
        for (int j = 0; j < isimler.length; j++) {
            if (isimler[j].length()>=enb){
                enb=isimler[j].length();
                kelime=isimler[j];
            }
        }
        System.out.println(kelime);
        char at =kelime.charAt(0);
        char bet =kelime.charAt(kelime.length()-1);
        kelime=kelime.substring(1,kelime.length()-1);
        kelime=bet+kelime+at;
        System.out.println(kelime);


    }
}
