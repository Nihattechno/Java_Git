package Ders_Günleri.Ornek_Sorular.Ornek2;

import java.util.ArrayList;
import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args) {
        AdanaKebap adn = new AdanaKebap();
        Borsh brs = new Borsh();
        Lahmacun lhm = new Lahmacun();
        Palov plv = new Palov();
        ArrayList<food>yemek = new ArrayList<>();

        do {
            menu();
            switch (secim()){
                case 1:
                    yemek.add(adn);
                    break;
                case 2:
                    yemek.add(lhm);
                    break;
                case 3:
                    yemek.add(brs);
                    break;
                case 4:
                    yemek.add(plv);break;
                case 0:
                    System.out.println("Siparişleriniz alındı mutfağa iletiliyor.");
                    break;
                default:
                    System.out.println("Yanlış seçim yaptınız lütfen tekrar seçiniz");
                    break;
            }
        }while (secim()!=0);





    }
    public static void menu (){
        System.out.println("\t***Menü***\n1-Adana Kebap (55 TL)\n2-Lahmacun (33 TL)\n3-Borsh (33 TL)\n4-Palov (44 TL)\nÇıkış yapmak için 0'a basınız");
    }

    public static int secim (){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen siparişinizi giriniz= ");
        int sipariş= scanner.nextInt();
        return sipariş;
    }

}
