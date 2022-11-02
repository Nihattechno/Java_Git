package Ders_Günleri.Arraylist_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {

        // Normalde diziler böyle tanımlanır
        int [] dizi = new int[5]; // Belli bir uzunluğa sahip dizi.

        // Ama Arraylist eklendikçe artan sildikçe azalan dinamik olan array.

       // ArrayList<Integer> sayılar = new ArrayList<>();
        ArrayList<String> kelimeler = new ArrayList<>();
        ArrayList<Boolean> booleanlar = new ArrayList<>(); // Tanımlamaları böyle yapılır, belli bir sayı değeri yoktur

        // Bir string tanımlayıp değer atayalım

        ArrayList<String> kelime= new ArrayList<>();

        kelime.add("Umut");
        kelime.add("Nihat");
        kelime.add("Yavuz");// uzunluğu 3 olan arraylist string dizisi
        // Zincir gibi sonuna ekleyerek devam ediyor.


        // Dizilerdeki Array.tostring gibi yazdırmak için böyle yazdırman yeterli kendisi tostring yapıyor.
        System.out.println(kelime); // [Umut, Nihat, Yavuz] çıktısı bu şekil olur


        // Olarak uzunluğunu alırsın length değil !!!
        kelime.size();


        // Add'i araya ekleme yapmak için de kullanılır. İndex'i girdiğin kutucuğa ekleme yapar.
        kelime.add(1,"Rosales");
        System.out.println("Eklenmiş kelime sonucu= "+kelime);// [Umut, Rosales, Nihat, Yavuz] çıktısı böyle olur.


        // bu ise belirlediğimiz indexteki ifadeyi değiştirmek için kullanılır.
        kelime.set(1,"Rosalex");
        System.out.println("Değiştirilmiş index= "+kelime);// [Umut, Rosalex, Nihat, Yavuz] çıktısı böyle olur.


        //Silme işlemi remove ile yapılır
        kelime.remove("Rosalex"); // Burada eleman ismini vererek sildik
        System.out.println("Rosalex silindikten sonra dizi= "+kelime);// [Umut, Nihat, Yavuz] çıktısı bu olur.

        // Aynı şekilde index vererekte silme yapabiliyoruz.
        kelime.remove(1);
        System.out.println("index sildikten sonraki dizi hali= "+kelime);// [Umut, Yavuz] çıktısı bu olur.

        // Bir elemanın indexini almak için indexof veya lastindexof kullanılır.
        int umutindex=kelime.indexOf("Umut");
        System.out.println(umutindex);// Çıktısı 0 olur

        //Dizideki  elemanların değerlerini almak için get kullanılır.
        for (int i = 0; i <kelime.size() ; i++) {
            System.out.println("Kelime arraylistinin elemanları= "+kelime.get(i));// get ve index değeri veriyorsun oradaki elemanı getiriyor.
        }

        /*// Tüm listeyi boşaltır
        kelime.clear();// Girilen bütün değerleri siler.*/

        // Sayılarla ilgili farklı fonksiyonlar
        ArrayList<Integer> sayılar1 = new ArrayList<>();
        sayılar1.add(5);
        sayılar1.add(85);
        sayılar1.add(985);
        sayılar1.add(75);

        System.out.println("Sayıların ilk hali= "+sayılar1); // [5, 85, 985, 75] çıktı hali

        Collections.sort(sayılar1);
        System.out.println("Sayıların sıralandıktan sonraki hali= "+sayılar1);// [5, 75, 85, 985] çıktı hali

        Collections.reverse(sayılar1);
        System.out.println("Sayıların ters çevrildikten sonraki hali= "+sayılar1);// [985, 85, 75, 5] çıktı hali


        System.out.println("Dizideki en büyük sayıyı yazdırır= "+ Collections.max(sayılar1));// 985 olur çıktısı

        System.out.println("Dizideki en küçük sayıyı yazdırır= "+ Collections.min(sayılar1));// 5 olur çıktısı

         Collections.fill(sayılar1,0);// Dizideki bütün elemanları verilen değere atar.
        System.out.println("Dizinin elemanları 0 yapılmış hali= "+sayılar1);

        Collections.replaceAll(sayılar1,0,2); // Dizideki ilk girilen değerdeki rakamları 2. değerle değiştirir.
        // Yani bütün 0'ları 2 yapar.
        System.out.println("Dizideki 0'ların hepsinin 2 yapılmış hali= "+sayılar1);

    }

}
