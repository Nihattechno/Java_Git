package Ders_Günleri.Java_Mapler;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMaps_QS1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

       döngü();
    }



    public static int girdi(){
        Scanner scanner=new Scanner(System.in);
            System.out.println(" 1- Ekleme \n 2- Düzeltme \n 3- Listeleme \n 4- Arama \n 5- Silme \n 6- Çıkış");
            System.out.println("Lütfen yapmak istediğiniz işlemi seçin= ");
           int girdi = scanner.nextInt();
        return girdi;
    }

    public static void döngü (){
        Scanner scanner = new Scanner(System.in);
        Map<String,String>sözlük=new HashMap<>();
        String kelime=";";

        do {
            switch (girdi()){
                case 1:
                    System.out.println("Eklemek istediğiniz kelimeyi giriniz= ");
                    kelime= scanner.nextLine();
                    System.out.print("Kelimenin anlamını giriniz= ");
                    String anlam = scanner.nextLine();
                    sözlük.put(kelime,anlam);
                    break;
                case 2:
                    System.out.println("Lütfen değiştirmek istediğiniz kelimeyi giriniz= ");
                    String değiştirme = scanner.nextLine();
                    System.out.println("Değiştirmek istediğiniz anlamı giriniz= ");
                    String değişen = scanner.nextLine();
                    sözlük.replace(değiştirme,değişen);
                    break;
                case 3:
                    for (Map.Entry<String,String> yazdırma: sözlük.entrySet()){
                        System.out.println("Kelime= "+yazdırma.getKey());
                        System.out.println("Anlamı= "+yazdırma.getValue());
                    }
                    break;
                case 4:
                    System.out.println("Aramak istediğiniz kelimeyi giriniz= ");
                    String arama = scanner.nextLine();
                    System.out.println("Aradğınız "+arama+" kelimesinin anlamı= "+ sözlük.get(arama));
                    break;
                case 5:
                    System.out.println("Silmek istediğiniz kelimeyi giriniz= ");
                    String silme = scanner.nextLine();
                    sözlük.remove(silme);
                    System.out.println("Girdiğimiz "+silme+" kelime silinmiştir.");
                    break;
                case 6:
                    System.out.println("Canlı sözlüğü tercih ettiğiniz için teşekkürler!!!");
                    break;
            }

        }while (girdi()!=6);

    }
}
