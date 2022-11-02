package Ders_Günleri.ilk_Konular;

import java.util.Locale;
import java.util.Scanner;

public class Gun_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Stringin belli bir bölümünü alma işlemi yapar
        String s1 = "Merhaba iyi günler";
        String parca1 = s1.substring(2,8); // index sırasına göre ayırırsın, 2 dahil, 8 dahil değil.
        System.out.println(parca1); // kredi kartı son 4 hanesini alırken, isimlerin soyadını alrıken kullanılır.

        // Substringin ikinci kullanım şekli de bu
        String s2 = "Merhaba iyi günler";
        String parca2 = s2.substring(4); // Yazdığın indexten başlayıp sonuna kadar alır
        System.out.println(parca2);


        //Substring kullanımı örnek soru
        System.out.println("Lütfen adınızı ve soyadınızı giriniz");
        String girdi = scanner.nextLine();
        int bdeğer = girdi.indexOf(" ");
        String isim = girdi.substring(0,bdeğer);
        String soyad = girdi.substring(bdeğer+1);
        System.out.println(isim);
        System.out.println(soyad);


        //Stringin ne ile bittiğini boolen üzerinden kontrol eder yani bununla bitiyor mu bitmiyor mu gibisinden
        String kelime = "Merhaba dünya";
        boolean bitiyormu = kelime.endsWith("ya"); //true
        boolean bitiyormu1 = kelime.endsWith("a"); // true
        boolean bitiyormu2 = kelime.endsWith("nya"); // true
        boolean bitiyormu3 = kelime.endsWith("A"); // false
        System.out.println(bitiyormu);


        // Stringin ne ile başladığını boolen üzerinden kontrol eder
        String kelim1 = "Bethesta Studios";
        boolean başlıyormu = kelim1.startsWith("Bet"); // true
        boolean başlıyormu1 = kelim1.startsWith("be"); // false
        boolean başlıyormu2 = kelim1.startsWith("Bethesta");  //true
        System.out.println(başlıyormu);


        //Stringin bütün harflerini küçük harf yapar
        String kelime2 = "Merhaba dünya";
        String kharf = kelime2.toLowerCase(); // merhaba dünya olarak verir.
        System.out.println(kharf);


        //Stringin bütün harflerini büyük harf yapar
        String text = "Merhaba Dünya";
        String btext = text.toUpperCase();
        System.out.println(btext); // MERHABA DÜNYA olur cevap


        //Stringin başındaki ve sonundaki gereksiz boşlukları siler
        String s21 = "  Merhaba Dünya  ";
        String s2o = s21.trim();
        System.out.println("Cümlenini boşluksuz hali= "+s2o);


        //Stringin içinden istenen karakterleri verilen yenisi ile değiştirir
        String text1 = "Merhaba DÜnya";
        String test1 = text1.replace("a","e");
        System.out.println("Yeni hali= "+ test1); // Merhebe Dünye olur sonuç olarak


        //Stringin içinden istenen karakterleri verilen kritere göre yenisi ile değiştiri.
        String text2 = "Merhaba Dünya";
        String  test2 = text2.replaceAll("[A-Z]","_");
        System.out.println(test2);// _erhaba _ünya olarak çıktı verir.
        String test3 = text2.replaceAll("[abn]", "_");
        System.out.println(test3);// Merh___ Dü_y_ olarak çıktı verir.


        //Stringin içinden istenen karakterin ilk denk gelenini değiştirir.
        String text3 = "Merhaba Dünya";
        String test4 = text3.replaceFirst("a","_");
        System.out.println(test4); // Merh_ba Dünya olarak çıktı verir.


        //Küçük veya büyük harf farketmeksizin 'me' ile bitiyor mu
        String s3 = "Merhaba dünya";
        String k3harf = s3.toLowerCase();
        boolean başlıyormu11 = k3harf.startsWith("me");
        System.out.println(başlıyormu11);

        //Küçük veya büyük farketmeksizin 'YA' ile bitiyor mu
        String text11 = "Merhaba dünya";
        String bharf = text1.toUpperCase();
        boolean bitiyormu12 = bharf.endsWith("YA");
        System.out.println(bitiyormu12);


        //Girilen stringte kaç tane nokta olduğunu bulma
        String text13 = scanner.nextLine();
        String test13 = text13.replaceAll("[.]","");
        int test21 = test13.length();
        int text21 = text13.length();
        int sonuç = text21-test21;
        System.out.println(sonuç);
}

}
