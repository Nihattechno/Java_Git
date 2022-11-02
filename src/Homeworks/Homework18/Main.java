package Homeworks.Homework18;

public class Main {
    public static void main(String[] args) {
        Person cls1 = new Calısan("Umut","Yavuz","Tercümanlık",Departman.SATIŞ);
       Person ogr1= new Ogrenci("Nihat","Yavuz","Öğrencilik",OGRSube.C4);

       Person.kimlikYazdır(cls1);
       Person.kimlikYazdır(ogr1);
    }
}
