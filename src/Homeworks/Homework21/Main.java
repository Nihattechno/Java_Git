package Homeworks.Homework21;

public class Main {
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci("Nihat","Biga",UyeTipi.OGRENCI,2000);
        Ogrenci ogr2= new Ogrenci("Yavuz","Çanakkale",UyeTipi.OGRENCI,2500);

        Calısan cls1 = new Calısan("Umut","İzmir",UyeTipi.CALISAN,3000);
        Calısan cls2 = new Calısan("UNY","Florida",UyeTipi.CALISAN,8000);

        Okul okl1 = new Okul("Ege",25);
        okl1.prs.add(ogr1);
        okl1.prs.add(ogr2);
        okl1.prs.add(cls1);
        okl1.prs.add(cls2);

        ogr1.setOkulu(okl1);
        ogr2.setOkulu(okl1);
        cls1.setOkulu(okl1);
        cls2.setOkulu(okl1);

        for (Person t : okl1.prs){
            if (ogr1 instanceof Person){
                System.out.println(ogr1);
            }
            if (ogr2 instanceof Person){
                System.out.println(ogr2);
            }
            if (cls1 instanceof Person){
                System.out.println(cls1);
            }
            if (cls2 instanceof Person){
                System.out.println(cls2);
            }
            break;
        }

    }
}
