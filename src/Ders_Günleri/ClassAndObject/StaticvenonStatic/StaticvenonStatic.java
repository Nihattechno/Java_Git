package Ders_Günleri.ClassAndObject.StaticvenonStatic;

public class StaticvenonStatic {
    public static void main(String[] args) {


        // 1. yöntem javanın metodlarıyla
        int sayı =345;
        String strrakam=String.valueOf(sayı);
        int değer = Integer.parseInt(strrakam);

        // 2. yöntem object kullanarak
        // kendi yarattığımız kütüphaneyi kullanarak
        // Static yapmazsan metodd nesneye ait olmuş olur
        // Baştan tanımlaman gerekir

        Utility util = new Utility();
        util.getInt(strrakam);
        util.getString(sayı);

        // 3. yöntem Static yapıp direk classtan çekerek
        // Static yaptığında metod class'ın olmuş olur o yüzden class ismiyle
        // heryerden çağırabilirsin.

        Utility.getint2(strrakam);
        Utility.getstring2(sayı);

        // Math Metod deneme
        System.out.println(Math_Metodları.aralıkrandomsayı(10));
        System.out.println(Math_Metodları.max(15,27));
        System.out.println(Math_Metodları.min(15,27));
        int[] dizi = {1,2,3,4,5,6,7};
        System.out.println(Math_Metodları.dizielemantopla(dizi));
        System.out.println(Math_Metodları.karesi(3,4));
    }
}
