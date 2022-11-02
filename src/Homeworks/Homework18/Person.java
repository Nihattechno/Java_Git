package Homeworks.Homework18;

public class Person {
    private String ad;
    private String soyad;
    private String görevi;

    public Person() {
    }

    public Person(String ad, String soyad, String görevi) {
       setAd(ad);
       setGörevi(görevi);
       setSoyad(soyad);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGörevi() {
        return görevi;
    }

    public void setGörevi(String görevi) {
        this.görevi = görevi;
    }

    public static void kimlikYazdır(Person gelen){

        System.out.println("******* Kimlik Yazdırma ******");
        System.out.println("adı= "+gelen.ad);
        System.out.println("Soyadı= "+gelen.soyad);
        System.out.println("Görevi= "+gelen.görevi);

        if (gelen instanceof Ogrenci){
            System.out.println("Şubesi= "+((Ogrenci) gelen).getSube());
        }
        if (gelen instanceof Calısan){
            System.out.println("Departmanı= "+((Calısan) gelen).getDepartman());
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", görevi='" + görevi + '\'' +
                '}';
    }
}
