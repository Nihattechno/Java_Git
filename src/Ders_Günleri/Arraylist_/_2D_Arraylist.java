package Ders_Günleri.Arraylist_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _2D_Arraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> listebaşı = new ArrayList<>(); // Burası listelerin listesi

        ArrayList<Integer> kimyanot=new ArrayList<>();
        kimyanot.add(85);
        kimyanot.add(95);

        ArrayList<Integer> matnot = new ArrayList<>();
        matnot.add(52);
        matnot.add(96);
        matnot.add(12);

        ArrayList<Integer> fiziknot = new ArrayList<>();
        fiziknot.add(45);
        fiziknot.add(20);
        fiziknot.add(63);
        fiziknot.add(98);
        // Buraya kadar ana listede oluşacak olan arraylistleri oluşturuyoruz

        // Burada ise oluşturduğumuz diğer arraylisltleri ana listenin içine ekliyoruz
        listebaşı.add(kimyanot);
        listebaşı.add(matnot);
        listebaşı.add(fiziknot);

       /* listebaşı.get(0); // Her bir elemenı liste olduğu için istenen indexteki listeyi verir
        listebaşı.get(0).get(0); // Dersek 0. listenin 0.elemanını verir.

        System.out.println("Listebaşının ilk listesini yazdırır= "+listebaşı.get(0));
        System.out.println("Listebaşının ikinci listesini yazdırır= "+listebaşı.get(1));
        System.out.println("Listebaşının üçüncü listesini yazdırır= "+listebaşı.get(2));

        // Dizilerle aynı mantıkla for döngsüne sokulur
        ArrayList<String> dersler = new ArrayList<>();
        dersler.add("Matematik");
        dersler.add("Fizik");
        dersler.add("Kimya");
        for (int i = 0; i < listebaşı.size() ; i++) {
            System.out.println(dersler.get(i)+"= ");
            for (int j = 0; j <listebaşı.get(i).size() ; j++) {
                System.out.print((i+1)+". kişinin "+(j+1)+". notu= ");
                System.out.println(listebaşı.get(i).get(j));

            }
        }*/

        System.out.println(ortalama(listebaşı));
        enkenb(listebaşı);

    }
    public static int alınan (){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bilgisini almak istediğiniz ders no'sunu girin= ");
        int dersno = scanner.nextInt();
        return dersno;
    }

    // Girilen değerdeki derslerin ortalamasını veren kod
    public static int dönen (int sayı, ArrayList<ArrayList<Integer>> liste){
        int toplam=0;
        int ort=0;

        for (int i = 0; i <liste.get(sayı).size() ; i++) {
            toplam=toplam+liste.get(sayı).get(i);
        }
        ort=toplam/liste.get(sayı).size();
        return ort;
        }


            // Bu kod girilen sayıdaki listenin içindeki değerleri yazdırıryor.
   /* public static void dönen (int sayı, ArrayList<ArrayList<Integer>> liste){
        int [] dizi = new int[liste.size()];

        for (int i = 0; i <liste.get(sayı).size() ; i++) {
            System.out.print("Girilen sayıdaki listenin "+(i+1)+". değeri= ");
            System.out.println(liste.get(sayı).get(i));
        }

    }*/

    //

    // Tüm derslerin ortalaması
    public static double ortalama (ArrayList<ArrayList<Integer>> liste){
        double toplam =0;
        int ortsayı =0;
        for (int i = 0; i < liste.size(); i++) {
            for (int j = 0; j <liste.get(i).size() ; j++) {
                toplam=toplam+liste.get(i).get(j);
                ortsayı++;
            }
        }
        toplam=toplam/ortsayı;
        return toplam;
    }

    public static void enkenb (ArrayList<ArrayList<Integer>> liste){
        int enb=liste.get(0).get(0);
        int enk=liste.get(0).get(0);
        for (int i = 0; i < liste.size() ; i++) {
            if (enb< Collections.max(liste.get(i))){
                enb=Collections.max(liste.get(i));
            }
            if (enk>Collections.min(liste.get(i))){
                enk=Collections.min(liste.get(i));
            }
            }

        System.out.print("Listedeki en büyük sayı= "+enb+"\n Listedeki en küçük sayı= "+enk);
    }
    public static void değiştirme(String cümle1){
        Character [] dizi =new Character[cümle1.length()];
        String cümle2="3a2b4c1d3e2f";
        ArrayList<Character> yncümle = new ArrayList<>();
        String cümle ="";

        for (int i = 0; i < dizi.length ; i++) {
            dizi[i]=cümle1.charAt(i);
        }
    }
    }

// `"aaabbccccdeeeff" seklinde verilen bir stringi yine string olarak "3a2b4c1d3e2f"
//        //  seklinde yazdiran methodu yapiniz. parametre string