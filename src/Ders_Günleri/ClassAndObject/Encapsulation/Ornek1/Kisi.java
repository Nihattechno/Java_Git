package Ders_Günleri.ClassAndObject.Encapsulation.Ornek1;

public class Kisi {
    String ad;
    String soyad;
    private int yaş;

    @Override
    public String toString() {
        return "kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yaş=" + yaş +
                '}';
    }



    public Kisi(String ad, String soyad, int yaş) {
        this.ad = ad;
        this.soyad = soyad;
        yasAta(yaş);
    }
    public Kisi(){

    }

    public void yasAta (int yas){
        this.yaş=Math.abs(yas);
    }
    public int yasGetir (){
        return this.yaş;
    }
}
