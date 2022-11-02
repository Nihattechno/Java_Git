package Homeworks;

import java.util.Scanner;

public class Homework7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Soru 1
        System.out.print("Lütfen bir sayı giriniz= ");
        int h1 = scanner.nextInt();

        if ((h1%10)%2==1 ){
            System.out.println("Bu sayı tektir");

        }
        else {

            System.out.println("Bu sayı çifttir");
        }


        // Soru 2
        System.out.print("Lütfen şifrenizi giriniz= ");
        String h2 = scanner.nextLine();
        boolean t2 = h2.equals("Bayrak");

        if (t2){
            System.out.println("Şifre doğru girilmiştir");

        }
        else {
            System.out.println("Şifrede hata vardır");
        }


        // Soru 3
        System.out.print("Lütfen bir cümle giriniz= ");
        String h3 = scanner.nextLine();
        String q3 = h3.toLowerCase();
        char t3 =q3.charAt(0);
        int y3 = q3.length();
        char u3 =q3.charAt(y3-1);

        if (t3==u3){
            System.out.println("Cümlenin ilk harfi ile son harfi aynı");
        }
        else {
            System.out.println("Cümlenin ilk harfi ile son harfi farklı");
        }


        // Soru 4
        System.out.print("Lütfen bir kelime giriniz= ");
        String kelime1 = scanner.nextLine();

        if (kelime1.contains("A")){
            System.out.println("Bu kelimede A harfi vardır");
        }
        else {
            System.out.println("Bu kelimede A harfi yoktur");
        }


        // Soru 5
        System.out.print("Lütfen 2 kelime giriniz= ");
        String kelime2 = scanner.nextLine();
        int index = kelime2.indexOf(" ");
        String ilkbölüm = kelime2.substring(0,index);
        String ikincib = kelime2.substring(index+1);
        int sayı1 = ilkbölüm.length();
        int sayı2 = ikincib.length();

        if (sayı1==sayı2){

            System.out.println("İlk kelime ile ikinci kelimenin harf sayısı aynıdır.");
        }
        else {
            System.out.println("Kelimelerin harf sayısı farklıdır.");
        }


        // Soru 6
        System.out.print("Lütfen şifreniiz giriniz= ");
        String şifre1 = scanner.nextLine();
        int şifreuzun = şifre1.length();

        if (şifreuzun<8){
            System.out.println("Şifreniz kabul edilmedi!");
        }
        else {
            System.out.println("Şifreniz kabul edildiç");
        }



    }}
