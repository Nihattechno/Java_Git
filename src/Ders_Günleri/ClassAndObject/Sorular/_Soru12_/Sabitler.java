package Ders_Günleri.ClassAndObject.Sorular._Soru12_;

public class Sabitler {
   final static int saat=24;
   final static int dakika=60;
   final static int saniye=60;

   public static int saniyehesaplama (int saat1,int dakika1,int saniye1){
       int toplamsaniye=0;
       toplamsaniye=((saat1*dakika)*saniye)+(dakika1*saniye)+saniye1;
       return toplamsaniye;
   }


}
