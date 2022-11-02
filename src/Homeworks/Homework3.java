package Homeworks;

public class Homework3 {
    public static void main(String[] args) {

        String odev1 = "I love Java";
        int ödev1s = odev1.length();
        System.out.println("Ödev1 harf sayısı= "+ödev1s);

        String odev2 = "Sprint Planning";
        int ödev2s = odev2.length();
        System.out.println("Ödev2s harf sayısı= "+ödev2s);

        String odev3 = "apple";
        boolean ödev3varmı = odev3.contains("app");
        System.out.println("App içeriyor mu? ="+ödev3varmı);

        String odev4 = "Orange";
        boolean ödev4eşit = odev4.equals("Apple");
        System.out.println("Birbirine eşit mi? ="+ödev4eşit);

        String odev5 = "apple";
        boolean ödev5eşitmi = odev5.equalsIgnoreCase("apple");
        System.out.println("Büyük küçük eşit mi? ="+ödev5eşitmi);

        String odev6 = "Florida";
        int odev6index = odev6.indexOf("o");
        System.out.println("O'nun bulunduğu index= "+odev6index);

        String odev7 = "Thank You";
        int odev7index = odev7.indexOf("Y");
        System.out.println("Y'nin bulunduğu index= "+odev7index);

        String odev8 = "Mouse";
        char indexharf = odev8.charAt(3);
        System.out.println("3. sıradaki harf= "+indexharf);

        String odev10 = "Umut Nihat Yavuz";
        int harf2 = odev10.indexOf(" ");
        int harf3 = odev10.indexOf(" ",harf2+1);
        char illharf = odev10.charAt(0);
        char ikinciharf = odev10.charAt(harf2+1);
        char ucuncuharf = odev10.charAt(harf3+1);
        System.out.println(illharf+"."+ikinciharf+"."+ucuncuharf+".");

    }
}
