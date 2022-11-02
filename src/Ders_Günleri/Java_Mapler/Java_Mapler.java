package Ders_Günleri.Java_Mapler;

import java.util.HashMap;
import java.util.Map;

public class Java_Mapler {
    public static void main(String[] args) {

        // Sets Hashset - Linkedhashset - Treeset
        // Maps Hashmap - Linkedhashmap - Treemap

        // Map ailesinden hashmap
        Map<Integer,Integer>harita=new HashMap<>(); // Key 1 ve value'si integer olan bir map
        harita.put(2,15);
        harita.put(3,27);
        harita.put(4,85);
        harita.put(5,0);
        harita.put(3,3); // Aynı key'den 2 tane olamaz. Böyle olursa değeri günceller.
        System.out.println(harita); // {2=15, 3=3, 4=85, 5=0}

        // Keyde'ki değeri almak için get kullanılır
        System.out.println(harita.get(4));// 4 key'indeki değeri verir.

        // Anahtarları almak için
        System.out.println(harita.keySet()); // 2,3,4,5 olur çıktısı // key numaralarını verir
        // Değerleri almak için
        System.out.println(harita.values()); // 15,3,85,0 olur çıktısı // Değerleri verir

        // Key'leri tek tek yazdırmak için for böyle kullanılabilir
        for (Integer k : harita.keySet())
            System.out.println(k);

        // Değerleri yazdırmak için for böyle kullanılabilir
        for (Integer t : harita.values())
            System.out.println(t);

        // Hem value hem de key yazdırmak için
        for (Map.Entry<Integer,Integer> anahtar: harita.entrySet()) // Burada entry set'in başındaki değere ulaşıyoruz
        {
            System.out.println("key" + anahtar.getKey());
            System.out.println("value= " + anahtar.getValue());
        }

        // Contains diğerleri gibi kullanılır ama bunda key ve value'de vardır
        harita.containsKey(2);
        harita.containsValue(13);

        // Remove'da hem tek key silmek için kullanılır hem de key+value silmek için kullanılır
        harita.remove(2);
        harita.remove(3,15);

        // Clear ile de bütün listesi silersin
    }
}
