package Ders_Günleri.Arraylist_;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist_Sorular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       ArrayList<Integer> geçenler=new ArrayList<>();

       int toplam=0;
       int sayı=0;
       int ort=0;
       String turu="";

       do {
           System.out.print("Lütfen öğrencinin notunu giriniz= ");
           sayı = scanner.nextInt();
           scanner.nextLine();
           geçenler.add(sayı);
           toplam+=sayı;
           System.out.print("Not girmeye devam için e değil için h= ");
           turu = scanner.nextLine();

       }while (turu.equalsIgnoreCase("e"));

       ort=toplam/geçenler.size();


        System.out.print("Sınıfın ortalaması= "+ort+"\n");
        System.out.print("Sınıfı geçen sayısı= "+geçen(ort,geçenler));
    }
    public static int geçen (int a, ArrayList<Integer> b){
        int geçen =0;
        for (int i = 0; i < b.size(); i++) {
            if (b.get(i)>=a){
                geçen++;
            }
        }
        return geçen;
    }

    /*public static ArrayList notalma (){
        ArrayList<Integer> girilen=new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen öğrencinin notunu giriniz= ");
        int girilen1 = scanner.nextInt();
        scanner.nextLine();
        girilen.add(girilen1);

       return girilen;
    }*/

   /* public static int devammı (){
        Scanner scanner = new Scanner(System.in);
        int döndürülen=0;
        String dönen="";
        System.out.print("Not girmeye devam etmek istiyor musunuz evet ise E hayır ise H tıklayınız.");
        dönen=scanner.nextLine();
        if (dönen.equalsIgnoreCase("E")){
            döndürülen=1;
        }
        else
            döndürülen=0;

        return döndürülen;
    }*/

}
