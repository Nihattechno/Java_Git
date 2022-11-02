package Homeworks;

import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {

        Scanner scannerr= new Scanner(System.in);
        // Soru 1
      System.out.print("Lütfen sayının tam kısmını giriniz= ");
        int tamsayı= scannerr.nextInt();
        System.out.print("Lütfen sayının ondalıklı kısmını giriniz= ");
        int ondalıksayı= scannerr.nextInt();

        String yenisayı = tamsayı+"."+ondalıksayı;
        double son = Double.parseDouble(yenisayı);
        System.out.println(son);


        // Soru 2
        System.out.print("Lütfen bir sayı giriniz= ");
        int sayı = scannerr.nextInt();

        if (sayı%9==0 && sayı%5==0){
            System.out.print("Able to divide 9 and 5");
        }
        else {
            if (sayı%4==0 && sayı%5==0){
                System.out.print("Able to divide 4 and 5");
            }
            else {
                System.out.println("This number cannot be divided properly with 9-5 and 4-5");
            }
        }


        // Soru 3
        System.out.print("Lütfen bir sayı giriniz= ");
        int sayı1 = scannerr.nextInt();
        System.out.print("Lütfen bir sayı giriniz= ");
        int sayı2 = scannerr.nextInt();
        System.out.print("Lütfen bir sayı giriniz= ");
        int sayı3 = scannerr.nextInt();

        int enk = Math.min(sayı1,(Math.min(sayı2,sayı3)));
        System.out.print("Girilen en küçük sayı= "+enk);
        // Soru 4
        System.out.print("Lütfen para birimini giriniz= ");
        String para = scannerr.nextLine();

        if (para.contains("$")){
            System.out.print("This is dollar");
        }
        else {
            if (para.contains("€")){
                System.out.print("This is Euro");
            }
            else {
                System.out.print("We dont use this currency");
            }
        }
        // Soru 5
        System.out.print("Lütfen sınav notunuzu giriniz= ");
        int sınav = scannerr.nextInt();
        System.out.print("Lütfen ara sınav notunuzu giriniz= ");
        int arasınav = scannerr.nextInt();
        System.out.print("Lütfen final notunuzu giriniz= ");
        int final_1 = scannerr.nextInt();
        int ortalama = (sınav+arasınav+final_1)/3;
        if (ortalama>100) {
            System.out.print("You entered a wrong number.");
        }
        else {
            if (ortalama>=90){
                System.out.print("Your grade is A");
            }
            else {
                if (ortalama>=70){
                    System.out.print("Your grade is B");
                }
                else {
                    if (ortalama>=50){
                        System.out.print("Your grade is C");
                    }
                    else {
                        System.out.print("Your grade is F");
                    }
                }
            }
        }
    }
}
