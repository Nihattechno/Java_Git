package Homeworks;

import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Soru 1
        System.out.print("Lütfen seçmek istediğiniz ayın numarasını giriniz= ");
        int numara = scanner.nextInt();

        switch (numara){

            case 1:
                System.out.print("Ocak ayıdır ve 31 gündür.");
                break;
            case 2:
                System.out.print("Şubat ayıdır ve 28 gündür.");
                break;
            case 3:
                System.out.print("Mart ayıdır ve 31 gündür.");
                break;
            case 4:
                System.out.print("Nisan ayıdır ve 30 gündür.");
                break;
            case 5:
                System.out.print("Mayıs ayıdır ve 31 gündür.");
                break;
            case 6:
                System.out.print("Haziran ayıdır ve 30 gündür.");
                break;
            case 7:
                System.out.print("Temmuz ayıdır ve 31 gündür.");
                break;
            case 8:
                System.out.print("Ağustos ayıdır ve 31 gündür.");
                break;
            case 9:
                System.out.print("Eylül ayıdır ve 30 gündür.");
                break;
            case 10:
                System.out.print("Ekim ayıdır ve 31 gündür.");
                break;
            case 11:
                System.out.print("Kasım ayıdır ve 30 gündür.");
                break;
            case 12:
                System.out.print("Aralık ayıdır ve 31 gündür.");
                break;
            default:
                System.out.print("Hatalı giriş yaptınız!!!!");
                break;
        }

        //Soru 2
        System.out.print("Lütfen 3 basamaklı bir sayı giriniz= ");
        int sayı1 = scanner.nextInt();

        int birler = sayı1%10;
        int onlar =(sayı1/10)%10;
        int yüzler = (sayı1/100)%10;
        String yüzler_="";
        String onlar_="";
        String birler_="";

        switch (yüzler){
            case 1:
                yüzler_="Yüz";
                break;
            case 2:
                yüzler_="İki Yüz";
                break;
            case 3:
                yüzler_="Üç Yüz";
                break;
            case 4:
                yüzler_="Dört Yüz";
                break;
            case 5:
                yüzler_="Beş Yüz";
                break;
            case 6:
                yüzler_="Altı Yüz";
                break;
            case 7:
                yüzler_="Yedi Yüz";
                break;
            case 8:
                yüzler_="Sekiz Yüz";
                break;
            case 9:
                yüzler_="Dokuz Yüz";
                break;
        }
        switch (onlar){
            case 1:
                onlar_="On";
                break;
            case 2:
                onlar_="Yirmi";
                break;
            case 3:
                onlar_="Otuz";
                break;
            case 4:
                onlar_="Kırk";
                break;
            case 5:
                onlar_="Elli";
                break;
            case 6:
                onlar_="Altmış";
                break;
            case 7:
                onlar_="Yetmiş";
                break;
            case 8:
                onlar_="Seksen";
                break;
            case 9:
                onlar_="Doksan";
                break;
        }

        switch (birler) {
            case 1:
                birler_ = "Bir";
                break;
            case 2:
                birler_ = "İki";
                break;
            case 3:
                birler_ = "Üç";
                break;
            case 4:
                birler_ = "Dört";
                break;
            case 5:
                birler_ = "Beş";
                break;
            case 6:
                birler_ = "Altı";
                break;
            case 7:
                birler_ = "Yedi";
                break;
            case 8:
                birler_ = "Sekiz";
                break;
            case 9:
                birler_ = "Dokuz";
                break;

        }
        System.out.print(yüzler_+" "+onlar_+" "+" "+birler_);

        // Soru 3
        int min=20;
        int max=80;

        int random= (int)(Math.random()*((max-min)+1)+min);
        System.out.println("Random oluşan sayı= "+random);
        int randombirler=random%10;
        System.out.print("Random oluşan sayının birler basamağı= "+randombirler);
    }
}
