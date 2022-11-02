package Ders_Günleri.ClassAndObject.Constructors;

public class Student {
    int id;
    String name;
    String surname;
    int classroom;

    public Student(){


    }

    public Student (int id, String name, String surname, int classroom){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.classroom=classroom;
    }
    public Student(int id,String name,String surname){
        this(id,name,surname,0);
    }
    public Student(int id,String name){
        this(id,name,"",0);
    }
    public Student(int id){
        this(id,"","",0);
    }

}
