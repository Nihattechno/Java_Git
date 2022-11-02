package Ders_Günleri.ClassAndObject.Enum.Ornek_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Soru {
    public static void main(String[] args) {

        sepetyazdır(Menu());

    }

    public static ArrayList<Pizza>Menu (){
        int girdi=0;
        Scanner scanner= new Scanner(System.in);
        ArrayList<Pizza> pizzalist = new ArrayList<>();
        do {
            System.out.println(" 1-Small\n 2-Medium \n 3-Large \n 4-Sepeti Göster");
            girdi= scanner.nextInt();
            switch (girdi){
                case 1:
                    Pizza p1= new Pizza(Pizza_size.SMALL);
                    pizzalist.add(p1);
                    break;
                case 2:
                    Pizza p2 = new Pizza(Pizza_size.MEDIUM);
                    pizzalist.add(p2);
                    break;
                case 3:
                    Pizza p3 = new Pizza(Pizza_size.LARGE);
                    pizzalist.add(p3);
                    break;
                case 4:
                    System.out.println("Sepeti göstermeye geçiliyor.");
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız tekrar seçim yapın");
            }

        }while (girdi!=4);
        return pizzalist;
    }

    public static void sepetyazdır (ArrayList<Pizza> liste){
        int smlcnt=0;
        int mdcnt=0;
        int lrgcnt=0;
       for (Pizza p : liste ){

           if (p.size==Pizza_size.SMALL){
               smlcnt++;
           }
           else if (p.size==Pizza_size.MEDIUM){
               mdcnt++;
           }
           else if (p.size==Pizza_size.LARGE){
               lrgcnt++;
           }

       }
        System.out.println(smlcnt+" Tane küçük boy "+mdcnt+" tane orta boy "+lrgcnt+" tane büyük boy pizza sipariş edilmiştir.");
    }
}
