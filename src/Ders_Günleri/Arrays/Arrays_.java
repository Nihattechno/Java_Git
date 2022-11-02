package Ders_Günleri.Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Arrays_ {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

      /*  // istersek böyle tek tek tanımlıyoruz ve tanımlama olayı index gibi 0'dan başlıyor
        int [] notlar= new int[250];

        notlar[0]=1;
        notlar[1]=5;
        notlar[2]=3;
        notlar[3]=5;
        notlar[4]=6;
        notlar[5]=7;
        notlar[6]=8;
        notlar[7]=9;

        // istersekte böyle döngüye sokabiliyoruz
        // ek olarak dizinin uzunluk değerini almak için .lenght yapabiliriz
        for (int i=0;i<notlar.length;i++){

            System.out.print("Lütfen öğrencinin notunu giriniz= ");
            notlar[i]= scanner.nextInt();

        }

        int[] sayı={1,2,3,5,6,9,9,7888,999,0,8}; // Bu şekilde de dizi oluşturulabilir, illla yukarıda ki gibi tanım yapmana gerek yok

        String[] kelimeler = new String[5]; // Bütün değişkenlere bu şekilde dizi olarak atayabiliyoruz.
        Boolean[] doğrular = new Boolean[5];// Baş harfleri string hariç büyük küçük ikiside olur
        Double[] oranlar = new Double[5];

        // Kullanıcıdan 5 girdi alın aldığınız girdilerin ortalamasını alın, ortalamayı geçen kaç kişi olduğunu yazdırın.
        int [] sayılar = new int[5];
        int ortalama=0;
        int geçen=0;

        for (int i = 0; i < sayılar.length; i++) {
            System.out.print("Lütfen dizinin değerlerini giriniz= ");
            sayılar [i]=scanner.nextInt();
            ortalama=sayılar[i]+ortalama;
        }
        ortalama=ortalama/ sayılar.length;
        System.out.println(ortalama);

        for (int j = 0; j < sayılar.length; j++) {
            if (sayılar[j]>=ortalama){
                geçen++;
            }

        }
        System.out.print("Not ortalamasını geçen sayısı= "+geçen);

        //// Kullanıcıdan 7 girdi alın aldığınız girdilerin ortalamasını alın, ortalamayı geçen ve tek olan sayı miktarını bulun
        int [] girilen= new int[7];
        int ortalama1=0;
        int tek=0;

        for (int i = 0; i < girilen.length; i++) {

            System.out.println((i+1)+".Sayıyı giriniz= ");
            girilen[i]=scanner.nextInt();
            ortalama1=girilen[i]+ortalama1;
        }
        ortalama1=ortalama1/ girilen.length;

        for (int j = 0; j < girilen.length; j++) {
            if (girilen[j]>=ortalama1&&girilen[j]%2==1){
                tek++;
            }
        }
        System.out.print("Ortalamadan büyük ve tek olan sayı miktarı= "+tek);

        int [] randomsayılar= new int[50];


        for (int i = 0; i < randomsayılar.length; i++) {

            randomsayılar[i]=(int)(Math.random()*11);
        }

        for (int j=0;j< randomsayılar.length;j++){

            if (randomsayılar[j]%2==0){
                randomsayılar[j]=2;
            }
            else {
                randomsayılar[j]=1;
            }
            System.out.println(randomsayılar[j]);
        }

        System.out.print("Lütfen bir cümle giriniz= ");
        String cümle = scanner.nextLine().trim();
        char[] boşluk = new char[cümle.length()];
        int kelimesayısı=0;

        for (int i = 0; i <cümle.length() ; i++) {
            boşluk[i]=cümle.charAt(i);
            if (boşluk[i]==' '){
                kelimesayısı++;
            }
        }
        System.out.print("Girdiğiniz cümlenin kelime sayısı= "+(kelimesayısı+1));

        // 100 dizilik bir dizi oluşturun bu sayıları 100'e kadar sayılardan random oluşturun en büyük olanı ve indexini bulun
        // Bu bir yolu bulmanın

        int [] dizi=new int[100];
        int enb=0;
        int numara=0;

        for (int i = 0; i < dizi.length; i++) {

            dizi[i]=(int)(Math.random()*101);
            enb=Math.max(dizi[i],enb);
            if (dizi[i]>=enb){
                numara=i;
            }
        }

        System.out.print("Oluşturulan sayıların içerisinde en büyük sayı= "+enb+"\nBu sayının indexi= "+numara);

        // Bu da ikinci hali
        int [] dizi=new int[100];

        int numara=0;

        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=(int)(Math.random()*101);
        }
        int enb=dizi[0];
        for (int j = 0; j < dizi.length; j++) {
            enb=Math.max(dizi[j],enb);
            if (dizi[j]>=enb){
                numara=j;
            }
        }

        // Diziyi String olarak direk yazdırır// Arrays.toString();
        String[] isimler ={"Umut","nihat","yavuz"};
        System.out.println(Arrays.toString(isimler));

        // Diziyi küçükten büyüğe doğru sıralar// Arrays.sort();
        int[] sayılar={1,3,5,6,9,0,3,5};
        Arrays.sort(sayılar);
        for (int i = 0; i < sayılar.length; i++) {
            System.out.println(sayılar[i]);
        }

        // Dizilerin elemanları birbirine eşit mi diye kontrol ederken// Array.equals(dizi1,dizi2);
        int[] a={1,5,9,55};
        int[] b={1,5,9,55};
        int[] c={2,5,9,54};

        System.out.println("Arrays.equals(a,c) = " + Arrays.equals(a,c)); // False döndürür çünkü 1 dizi bile farklı olsa farklıdır.
        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,b)); // True döndürür çünkü birebir aynı

        // Array.fill(c,7)// c dizisinde ki bütün kutucuklara 7 atar.
        Arrays.fill(c,7);

        // Arrays.binarysearch(c,25)// c dizisinde ki 25 değerinin kaçıncı indexte olduğuna.
        // Düzgün çalışması için önce sort yapman gerekir. Aranan eleman 1'den fazla ise hatalı sonuç verebilir.

        // Split metodu bir stringi parçalara ayırmak için kullanılır.

        System.out.println("Lütfen bi cümle giriniz= ");
        String cümle = scanner.nextLine();

        String[] cümleler=cümle.split(" ");
        System.out.println("Girilen cümlenin kelimeleri= "+Arrays.toString(cümleler));
        System.out.println("Girilen cümlenin kelime sayısı= "+cümleler.length);*/

        // 100 sayılık diziyi 0-100 arası sayılara random olarak atayınız ve sonra tek olanlarını farklı diziye atayınız.
        int[] sayıdizi= new int[100];
        int sayı=0;
        int teksayı=0;


        for (int i = 0; i < sayıdizi.length; i++) {

            sayıdizi[i]=(int)(Math.random()*101);
            if (sayıdizi[i]%2==1){
                teksayı++;
            }
        }
        int[] sayıdizi2= new int[teksayı];
        for (int j = 0; j < sayıdizi2.length; j++) {
            sayıdizi2[sayı]=sayıdizi[j];
            sayı++;
        }
        System.out.println(sayıdizi2.length);
        System.out.println(Arrays.toString(sayıdizi2));

    }
}
