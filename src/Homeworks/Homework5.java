package Homeworks;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir cümle giriniz= ");
        String h1 = scanner.nextLine();
        char s1 = h1.charAt(0);
        int t1 = h1.length();
        char b1 = h1.charAt(t1-1);
        System.out.println("ilk harf= "+s1+"\nikinci harf= "+b1);


       System.out.print("Lütfen 3 kelimelik bir cümle giriniz=");
        String h2 = scanner.nextLine();
        int b2 = h2.indexOf(" ");
        int t2 = h2.indexOf(" ",b2+1);
        String s2 = h2.substring(0,b2);
        String r2 = h2.substring(b2+1,t2);
        String w2 = h2.substring(t2+1);
        System.out.println("ilk kelime= "+s2+"\nikinci kelime= "+r2+"\nüçüncü kelime= "+w2);


        System.out.print("Lütfen 3 kelimelik bir cümle giriniz= ");
        String h3 = scanner.nextLine();
        int t3 = h3.indexOf(" ");
        int s3 = h3.lastIndexOf(" ");
        char b3 = h3.charAt(0);
        char w3 = h3.charAt(t3+1);
        char r3 = h3.charAt(s3+1);
        System.out.println("İlk kelimenin harfi= "+b3+"\nİkinci kelimenin harfi= "+w3+"\nÜçüncü kelimenin harfi= "+r3);


       System.out.print("Lütfen bir kelime giriniz= ");
        String h4 = scanner.nextLine();
        boolean r4 = h4.contains("B");
        System.out.println("İçinde B kelimesi var= "+r4);


        System.out.println("Lütfen kredi kartı bilgilerinizi giriniz= ");
        String h5 = scanner.nextLine();
        int r5 = h5.lastIndexOf(" ");
        String w5 = h5.substring(0,r5+1);
        String s5 = h5.substring(r5+1);
        String t5 = w5.replaceAll("[1234567890]","*");
        System.out.println(t5+s5);


        System.out.println("Lütfen bir cümle giriniz= ");
        String h6 = scanner.nextLine();
        int t6 = h6.length();
        char w6 = h6.charAt(t6-1);
        System.out.println("Girilen cümlede ki son kelimenin son harfi= "+w6);





    }
}
