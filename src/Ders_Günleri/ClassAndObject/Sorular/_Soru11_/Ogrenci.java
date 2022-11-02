package Ders_Günleri.ClassAndObject.Sorular._Soru11_;

public class Ogrenci {
    static int id;
    String ad;
    String soyad;

    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
        id+=1;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                '}';
    }
    public static void ogryazdırma (){

        System.out.println(id);
    }
}
