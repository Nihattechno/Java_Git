package SJQ;

import java.util.Scanner;

public class SJQ_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Soru 1
        System.out.print("Lütfen yaşınızı giriniz= ");
        int yaş= scanner.nextInt();

        if (yaş<=10){
            System.out.print("Facebook hesabi acmak icin cok gencsin");
        }
        else {
            if (yaş<=16){
                System.out.print("Ehliyet almak icin cok gencsin");
            }
            else {
                if (yaş<=18){
                    System.out.print("Dövme yaptirmak icin cok gencsin");
                }
                else {
                    if (yaş<=21){
                        System.out.print("Alkol icmek icin cok gencsin");
                    }
                    else {
                        System.out.print("Istediğini yapabilirsin");
                    }
                }
            }
        }

        // Soru 2
        System.out.print("Lütfen bir sayı giriniz= ");
        int sayı = scanner.nextInt();

        if (sayı%2==0){
            System.out.print("Bu sayı çifttir");
        }
        else {
            System.out.print("Bu sayı tektir");
        }

        // Soru 3
        System.out.print("Lütfen bir cümle giriniz= ");
        String cümle = scanner.nextLine();

        int uzunluk = cümle.length();
        String cümle1 = cümle.toLowerCase().replaceAll("[b]","");
        int uzunluk1 =cümle1.length();

        int sonuç = uzunluk-uzunluk1;
        System.out.print("Yazdığınız cümlede ki b harf sayısı= "+sonuç);

        // Soru 4
        System.out.print("Seçmek istediğiniz günü sayı ile giriniz= ");
        int gün = scanner.nextInt();

        switch (gün){

            case 1: System.out.print("Monday"); break;
            case 2: System.out.print("Tuesday"); break;
            case 3: System.out.print("Wednesday"); break;
            case 4: System.out.print("Thursday"); break;
            case 5: System.out.print("Friday"); break;
            case 6: System.out.print("Saturday"); break;
            case 7: System.out.print("Sunday"); break;
            default: System.out.print("You did not enter a valid day number"); break;
        }

        // Soru 5
        System.out.print("Faktoriyelini bulmak istediğiniz sayıyı girin= ");
        int girdi = scanner.nextInt();
        int toplam=1;

        for (int i=1;i<=girdi;i++){
            toplam=toplam*i;

        }
        System.out.print("Girdiğin sayının faktoriyeli= "+toplam);

        // Soru 6
        int toplam1=0;
        for (int i=1;i<=3;i++){
            System.out.print("Lütfen para birimiyle birlikte para değerini de giriniz= (örn=$15) ");
            String para = scanner.nextLine();
            para=para.replaceAll("[^0-9-]","");
            int sayı1 = Integer.parseInt(para);
            toplam=toplam+sayı1;

        }
        if (toplam1>0){
            System.out.print(toplam);
        }
        else {
            System.out.print("Sonuç eksidir");
        }

        // Soru 7
        System.out.print("Lütfen bir sayı giriniz= ");
        int girilen = scanner.nextInt();
        int sonuç1=1;

        for (int i=1;i<=girilen;i++){

            sonuç1=i*i;
            if (sonuç1==girilen){
                System.out.print("Girilen sayı tam kare bir sayıdır.");
                break;
            }
        }
        if (sonuç!=girilen){
            System.out.print("Girilen sayı tam kare bir sayı değildir.");
        }

        // Soru 8
        System.out.print("Lütfen bir sayı giriniz= ");
        int tyt = scanner.nextInt();

        for (int i =0;i<=tyt;i++){
            if (i%2==0){
                System.out.println(i);
            }
        }

        // Soru 9
        boolean kontrol= true;
        int random;
        do {
            System.out.print("Lütfen random üretilecek sayıyı giriniz ve sayı pozitif ve 0'dan büyük olmalı= ");
            random =scanner.nextInt();
            if (random>=1){
                break;
            }
        }
        while (kontrol);

        int randomsayı=(int)(Math.random()*random+1);
        System.out.print("Üretilen random sayınız= "+randomsayı);


        // Soru 10
        System.out.print("Lütfen üretilmesi istediğiniz random sayının min değerini giriniz= ");
        int min = scanner.nextInt();
        System.out.print("Lütfen üretilmesi istediğiniz random sayının max değerini giriniz= ");
        int max = scanner.nextInt();

        int randomsayı1=(int)(Math.random()*((max-min)+1)+min);
        System.out.print("Üretilen random sayı= "+randomsayı1);

        // Soru 11
        System.out.print("Lütfen bir ifade giriniz= ");
        String ifade = scanner.nextLine();

        ifade=ifade.toLowerCase().replaceAll("[^a-z]","");
        int kelime = ifade.length();
        if (kelime%2==1){
            System.out.print("Girilen ifadede ki kelime sayısı tektir");
        }
        else {
            System.out.print("Girilen ifadede ki kelime sayısı çifttir");
        }

        // Soru 12
        System.out.print("Lütfen ilk kelimeyi giriniz= ");
        String kelime1= scanner.nextLine();
        System.out.print("Lütfen 2. kelimeyi giriniz= ");
        String kelime2= scanner.nextLine();

        char h = kelime1.charAt(kelime1.length()-1);
        char y = kelime2.charAt(0);
        String yenik ="";

        if (h==y){
            kelime2=kelime2.substring(1);
            yenik=kelime1+kelime2;
            System.out.println(yenik);
        }
        else
            System.out.print(yenik=kelime1+kelime2);
    }
}
