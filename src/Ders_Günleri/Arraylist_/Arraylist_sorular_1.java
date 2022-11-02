package Ders_Günleri.Arraylist_;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist_sorular_1 {
    public static void main(String[] args) {
        System.out.println(tekeler());

    }
    public static ArrayList<Integer> tekeler(){
        Scanner scanner =new Scanner(System.in);
        ArrayList<Integer> tekler = new ArrayList<>();
        int [] sayılar=new int[6];

        for (int i = 0; i < sayılar.length ; i++) {
            System.out.print("Lütfen "+i+". sayıyı giriniz= ");
            sayılar[i]= scanner.nextInt();
            if (sayılar[i]%2==1){
                tekler.add(sayılar[i]);
            }
        }
        return tekler;

    }
}
