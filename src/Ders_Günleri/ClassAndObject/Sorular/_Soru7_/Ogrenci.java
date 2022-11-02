package Ders_Günleri.ClassAndObject.Sorular._Soru7_;

import java.util.ArrayList;

public class Ogrenci {
    String name;
    int maxcredit;
    ArrayList<Lesson>derslistesi=new ArrayList<>();

    public Ogrenci (){

    }

    public Ogrenci (String name, int maxcredit,ArrayList<Lesson> derslistesi){
        this.name=name;
        this.maxcredit=maxcredit;
        this.derslistesi=derslistesi;

    }
    public Ogrenci (String name, int maxcredit){
        this.name=name;
        this.maxcredit=maxcredit;

    }
    public void liste  (Lesson ders){
        int toplamkredi=0;
        for (Lesson l: derslistesi)
            toplamkredi+=l.credit;

        if ((toplamkredi+ders.credit<=maxcredit)){
            derslistesi.add(ders);
            System.out.println("Eklenen ders= "+ders.name);
        }
        else {
            System.out.println("Kredi limitinizi aştınız.");
            System.out.println("Alınamayan ders= "+ders.name);
        }
    }
}