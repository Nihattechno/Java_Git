package Ders_Günleri.ilk_Konular;

import java.util.Scanner;

public class if_switch_sorular {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*System.out.print("Lütfen kaç saat kalacağınızı yazınız= ");
        int kalma = scanner.nextInt();

        if (kalma<=3){
            System.out.println("Ücretiniz saatlik 10 tldir.");
        }
        else {
            if (kalma<=5 ){
                System.out.println("Ücretiniz saatlik 15tldir.");

            }
            else {
                System.out.println("Ücretiniz saatlik 20 tldir.");

            }

        }

        int sayı1 = scanner.nextInt();

        int cevap = (sayı1>50)?1:0;
        System.out.println(cevap);


        System.out.print("Lütfen ard arda 3 sayı giriniz= ");
        int h1= scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();
        // Birinci yöntem en büyük sayıyı bulma
       /* int y = (Math.max(h1,h2));
        y =Math.max(y,h3);

        int enb = Math.max(h1,(Math.max(h2,h3)));
        System.out.println(enb);

        System.out.print("Random sayı aralığı için bir sayı giriniz= ");
        int sayı1 = scanner.nextInt();

        int randomsayı = (int)(Math.random()*sayı1);
        System.out.println(randomsayı);

        System.out.print("Lütfen sayıyı tahmin ediniz= ");
        int sayıg = scanner.nextInt();

        if (sayıg==randomsayı){
            System.out.println("Tebrikler doğru buldunuz");
        }
        else {
            System.out.println("Girilen sayı eşleşmiyor");

        }

        System.out.println("Lütfen sırasıyla random sayı oluşturmak istediğiniz aralığı giriniz");
        System.out.println("Lütfen min sayıyı giriniz= ");
        int minsayı = scanner.nextInt();
        System.out.println("Lütfen max sayıyı giriniz= ");
        int maxsayı = scanner.nextInt();

        int randomsayı = (int)(Math.random()*(maxsayı-minsayı)+1)+minsayı;
        System.out.println("Random sayınız= "+ randomsayı);

        System.out.println("Lütfen 2 tam sayı giriniz= ");
        System.out.print("Sayı 1 = ");
        int sayı1 = scanner.nextInt();
        System.out.print("Sayı 2 = ");
        int sayı2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Lütfen bu sayılarla yapmak istediğiniz işlemi girin= ");
        String işlem = scanner.nextLine();
        String işlem1 = işlem.toUpperCase();

        switch (işlem1){

            case "T":
                int toplam = sayı1+sayı2;
                System.out.print("Toplama sonucunuz= "+toplam);
                break;

            case "C":
                int çıkarma = sayı1-sayı2;
                System.out.println("Çıkarma sonucunuz= "+çıkarma);
                break;

            case "Ç":
                int çarpma = sayı1*sayı2;
                System.out.println("Çarpma sonucunuz"+çarpma);
                break;

            case "B":
                int bölme = sayı1/sayı2;
                System.out.print("Bölme sonucu= "+bölme);
                break;
        }

        System.out.print("Lütfen sınav notunuzu giriniz (örnek Fizik:90)= ");
        String girilenot = scanner.nextLine();
        String ayrıknot = girilenot.replaceAll("[^0-9]","");

        int not = Integer.parseInt(ayrıknot);

        if (not>=90 && not<=100){

            System.out.print("Harf notunuz= A");
        }
        else {
            if (not>79 && not<90){
                System.out.print("Harf notunuz= B");
            }
            else if (not>100){
                System.out.print("Hatalı rakam giriniz");
            }
            else {
                if (not>69){
                    System.out.print("Harf Notunuz= C");
                }
                else {
                    if (not>59){
                        System.out.print("Harf Notunuz= D");
                    }
                    else {
                        if (not>49){
                            System.out.print("Harf Notunuz= F");
                        }
                        else {
                                System.out.print("Sınıfta kaldınız keşpişolsun");
                        }
                    }
                }
            }


        }

        System.out.print("Lütfen bir sayı giriniz= ");
        int girilensayı = scanner.nextInt();

        int onlar = (girilensayı/10)%10;

        switch (onlar){

            case 1:
                System.out.println("Bir");
                break;
            case 2:
                System.out.println("İki");
                break;
            case 3:
                System.out.println("Üç");
                break;
            case 4:
                System.out.println("Dört");
                break;
            case 5:
                System.out.println("Beş");
                break;
            case 6:
                System.out.println("Altı");
                break;
            case 7:
                System.out.println("Yedi");
                break;
            case 8:
                System.out.println("Sekiz");
                break;
            case 9:
                System.out.println("Dokuz");
                break;
            case 0:
                System.out.println("Sıfır");
                break;
        }*/

        System.out.print("Bir ay ismi giriniz= ");
        String ay = scanner.nextLine();

        switch (ay){

            case "Ocak":
            case "Şubat":
            case "Mart":
            case "Nisan":
            case "Mayıs":
            case "Haziran":
                System.out.print("30");
                break;

            case "Temmuz":
            case "Ağustos":
            case "Eylül":
            case "Ekim":
            case "Kasım":
            case "Aralık":
                System.out.print("31");
                break;
            default:
                System.out.println("Hata aldıysanız lütfen baş harfini büyük yazınız");
                break;




        }

    }
}
