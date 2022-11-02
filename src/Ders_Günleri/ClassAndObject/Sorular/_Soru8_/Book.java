package Ders_Günleri.ClassAndObject.Sorular._Soru8_;

public class Book {
    String name;
    int publishyear;
    String author;

    public Book (String name, int publishyear,String author){
        this.name=name;
        this.publishyear=publishyear;
        this.author=author;
    }
    public Book (String name,int publishyear){

        this(name,publishyear,"");
    }
    public Book(String name){
        this(name,0,"");
    }
    public void yazdırma (){
        System.out.println("Kitabın ismi= "+name+", Kitabin yayınlanma tarihi= "+publishyear+", Kitabin yazarı= "+author);
    }
    public String toString (){

        return name+" "+publishyear+" "+author;
    }
}
