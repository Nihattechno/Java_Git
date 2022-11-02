package Ders_Günleri.Setler;


import java.util.*;

public class Setler {
    public static void main(String[] args) {
        // Tekrar etmeyen diziler

        // Dizide tekrar etmeyen diziler vardır ve bunlar 3 tiptir
        // 1- Hangi sırayla atılmışsa o sıraya göre sırayalayan // Linkedhashset \\
        // 2- Hangi sırayla atarsan at alfabetik veya sayısal sırayla sıralayan(kendinden sortlu) // Treeset \\
        // 3- En hızlı çalışandır, en hızlı çalışmak için kendine göre sıralar, belirli bi patterni yok // Hashset \\
        // Yazılım dilinde genel olarak bunlara SET denir

        // Aynı arraylistler gibi çoğu özelliği sadece get() özelliği yok
        HashSet<Integer>sa=new java.util.HashSet<>();
        sa.add(1);
        sa.add(21);
        sa.add(11);
        sa.add(11);
        System.out.println(sa);

        // En hızlı şekilde kendi algoritmasına göre tutuyor
        HashSet<String>nhs=new java.util.HashSet<>();
        nhs.add("sa");
        nhs.add("as");
        nhs.add("merhaba");
        System.out.println(nhs);

        // Verilen sıraya göre tutuyor
        LinkedHashSet<String>lh = new LinkedHashSet<>();
        lh.add("sa");
        lh.add("as");
        lh.add("merhaba");
        System.out.println(lh);

        // Alfabetik olarak tutuyor
        TreeSet<String>ts=new TreeSet<>();
        ts.add("sa");
        ts.add("as");
        ts.add("merhaba");
        System.out.println(ts);

        // Bunda index değeri olmadığı için for'a koyup döndürüp kullanamıyoruz, o yüzden for-each-loop'u kullanıyoruz
        HashSet<String> renkler = new java.util.HashSet<>();
        renkler.add("Red");
        renkler.add("Blue");
        renkler.add("RED");
        renkler.add("Red");
        renkler.add("Green");
        for(String s :renkler){
            System.out.println(s);
        } // İndex sırası veya index sırasına göre bir sıralama lazım değil ise heryerde bu şekilde kullanılabilir

        // Eğer ki bu Setlerde sıralı lazım değil ise foreach kullanılır sıralı lazım ise bu alttaki kullanılır.

        // For'da i'nin yaptığını yapıyor
        Iterator sıralı = ts.iterator();

        while (sıralı.hasNext()){ // Eğer bir sonraki eleman varsa döndü devam etsin yoksa dursun demek bu
            System.out.println(sıralı.next());
        }
        // Bu ıterator gösterge diye geçiyor, sırayla her elemanı böyle alabiliyoruz.
        // Kendi sırasına göre elemanlara ulaşmak için kullanılır.
        // Pek kullanılan bir şey değildir ama  illa da sıralı olması gerekiyorsa şarttır.

        // Eğer herhangi bir parametre vermeyip böyle yaparsan bütün parametreleri koyabilirsin içine.
        // Çok kullanılan bir şey değildir.
        // Hashset yanını boşta bırakabilirsin ama object yazıp kullanmak daha doğru olur
        HashSet<Object> düz = new java.util.HashSet<>();
        düz.add(5);
        düz.add("beş");
        düz.add(true);
        düz.add(4.50);
        for (Object o:düz){
            System.out.println(o);
        }

        renkler.remove("RED");
        System.out.println("Silindikten sonra renkler= "+renkler);
        // Bütün diziyi siler
        renkler.clear();
        // İçeriyor mu diye bakarm
        renkler.contains("Red");

        // Normal diziden Hashsete atma yöntemleri
        // Bu 1. yöntem
        Integer [] dizi ={1,2,3,4,5,5,6,6,8,8,7,9,8};
        System.out.println(Arrays.toString(dizi));
        HashSet<Integer> yndizi = new HashSet<>();
        for (int i = 0; i < dizi.length ; i++) {
            yndizi.add(dizi[i]);
        }
        System.out.println(yndizi);

        // Bu da 2. yöntem
        HashSet<Integer>yndizi1=new HashSet<>(Arrays.asList(dizi));

        // Bu aşağıdaki komutların hepsi aynı zamanda arraylistlerde de  geçerli

        // 2 tane HashSet'i birleştirme yöntemi
        HashSet<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(3);
        setA.add(4);
        setA.add(2);
        setA.add(5);

        HashSet<Integer>setB = new HashSet<>();
        setB.add(5);
        setB.add(6);
        setB.add(7);

        HashSet<Integer> birleşikhal = new HashSet<>();
        birleşikhal.addAll(setA);
        birleşikhal.addAll(setB);

        System.out.println("SetA= "+setA);
        System.out.println("SetB= "+setB);
        System.out.println("Birleşik hali= "+birleşikhal); // 1234567 çıktı verir.

        setA.removeAll(setB);// Aynı değerde olanları siler
        System.out.println(setA); // 1234 olur çıktısı

        // tekrar yap sonra bunu yeni hashsete atayarak
        setA.retainAll(setB); // Ortak elemanlarını verir
        System.out.println(setA); // çıktısı 5 olur
    }
}
