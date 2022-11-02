package Ders_Günleri.ClassAndObject.Final_Modifier;

public class tcno {
    String name;
  final int Tcno; // Değiştirilemez sadece 1 kere atama şansı vardır.

  static int tcnosayac=1001;

    public tcno(String name) {
        this.name = name;
        this.Tcno=++tcnosayac;
    }

    @Override
    public String toString() {
        return "tcno{" +
                "name='" + name + '\'' +
                ", Tcno=" + Tcno +
                '}';
    }
}
