package Ders_Günleri.ClassAndObject.StaticvenonStatic;

public class Math_Metodları {

    public static int max (int a,int b){
        if (b>a)
            return b;
        return a;
    }
    public static int min (int a,int b){
        if (b<a)
            return b;
        return a;
    }
    public static int dizielemantopla (int []dizi){
        int toplam=0;
        for (int i = 0; i <dizi.length ; i++) {
            toplam=toplam+dizi[i];
        }
        return toplam;

    }
    public static int aralıkrandomsayı (int sayı){
        int random=(int)(Math.random()*sayı);
        return random;
    }
    public static int karesi (int sayı1, int sayı2){
        int karesi=1;
        for (int i = 0; i <sayı2 ; i++) {
            karesi=sayı1*karesi;
        }
        return karesi;
    }


}
