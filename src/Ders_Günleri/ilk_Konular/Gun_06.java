package Ders_Günleri.ilk_Konular;

import java.util.Scanner;

public class Gun_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Stringin kaç harf olduğunu bulma
        String cumle = "Bugün havalar sıcak.";
        int uzunluk = cumle.length();
        System.out.println(uzunluk);


        //Stringin girilen rakamın kaçıncı harf olduğunu bulma
        String cumle2 = "karnım aç";
         char kaçıncık = cumle.charAt(3);
        System.out.println(kaçıncık);


        // Girilen kelimenin son harfini bulma
        System.out.println("Lütfen bir cümle giriniz");
        String girdi = scanner.nextLine();
        int sayı = girdi.length();
        char sonharf = girdi.charAt(sayı-1);
        System.out.println(sonharf);


        //Stringte girilen harfin kaçıncı harf olduğunu bulma
        String kelime = "MErhaba";
        int sıra = kelime.indexOf("r");
        System.out.println(sıra);


        //String içinden harf yazdırma Örn(U.N.Y)
        System.out.println("Ismet Temur yazınız");
        String girdi1 = scanner.nextLine();

        int harf2 = girdi1.indexOf(" ");
        int harf3 = girdi1.indexOf(" ",harf2+1);
        char iharf = girdi1.charAt(0);
        char ikimciharf = girdi1.charAt(harf2+1);
        char ucuncuharf = girdi1.charAt(harf3+1);

        System.out.println(iharf+"."+ikimciharf+"."+ucuncuharf+".");


        //Stringin eşit olup olmadığını kontrol etme
        String girdi2 = "Merhaba";
        String girdi22 = "Merhaba";
        boolean aynımı = girdi2.equals(girdi22);
        boolean aynımı1 = girdi2.equals("Merhaba");


        //Stringin harflerinin küçük büyük farketmeksizin aynı mı olduğunu kontrol eder
        String girdi3 = "İyi günler";
        String girdi33 = "İYİ GÜNLER";
        boolean aynı1 = girdi3.equalsIgnoreCase(girdi33);
        boolean aynı11 = girdi3.equalsIgnoreCase("İYİ GÜNLER");


        //Stringin içinde harfin veya kelimenin olup olmadığını kontrol eder
        String kelime1 = "Hava sıcak";
        boolean kontrol = kelime1.contains("a");
        boolean kontrol1 = kelime1.contains("sıcak");


        //Stringin dolu olup olmadığını kontrol eder
        String kelime2 ="Sabah oldu";
        boolean kontrol2 = kelime2.isEmpty(); // false
        String kelime3 = "";
        boolean kontrol3 = kelime3.isEmpty(); // true


        //İndexof gibi çalışır ama Stringin içinden harfi sonda başa doğru araştırmaya başlar
        String kelime4 = "Merhaba";
        int harfsayısı = kelime4.lastIndexOf("a"); // İlk olarak en sonda ki a'yı bulur



    }



}
