package Ders_Günleri.Metodlar;

import java.util.Scanner;

public class Metodlar {
    Scanner scanner=new Scanner(System.in);
    /*public static void main(String[] args) {

        System.out.println(enb(5,6));
        int enbsayı = enb(5,6);


    }

// Bunlar void metodlar, bunlar herhangi bir bilgiyi return etmezler. Bunların içinde yapılacak bir görevi vardır
// yaparlar ve biter. Bu metodları bir parametreye atayamazsin.
    public static void merhaba (){
        System.out.println("Merhaba dünya ");

    }
    public static void ozelmerhaba (String isim){
        System.out.println(isim+" Merhaba");

    }
    public static void tekmiçiftmi (int sayı){
        if (sayı%2==0)
            System.out.println("çift");
        else
            System.out.println("tek");

    }

    public static void sayıokukontrol (){

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lütfen bi sayı değeri giriniz= ");
        int okunansayı= scanner.nextInt();
        if (okunansayı%2==0)
            System.out.println("çift");
        else
            System.out.println("tek");

    }
    // Bunlar returnable metodlar. Bunlar bir işlemi yapar ve sonuç döndürür. Mesela 4ve 5 sayılarından en büyüğünü
    // ver metodu yaparsın ve bu en büyüğünü bulur ve sana geri döndürür. Bu metodları bir parametreye atayabilirsin.

    public static int enb (int a, int b){
        int enb=a;
        if (b>a){
            enb=b;
        }
        return enb;
    }*/

    // Metod overloading yaparken eğer 1'den fazla ve yapıcağın overloadin sayısı çoksa şu şekli kullanırsın
    public static int toplam (int... sayı){
        int toplam=0;
        for (int i = 0; i < sayı.length ; i++) {
            toplam=toplam+sayı[i];
        }
        return toplam;
    }// 3 noktadan sonra aldığı sayıları bir dizi olarak alır. Overloadladığın metodları dizi haline getirip kullanıyormuşsun
    // gibi bir şey.



}
