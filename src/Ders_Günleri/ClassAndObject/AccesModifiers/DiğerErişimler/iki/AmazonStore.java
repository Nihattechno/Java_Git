package Ders_Günleri.ClassAndObject.AccesModifiers.DiğerErişimler.iki;

import Ders_Günleri.ClassAndObject.AccesModifiers.DiğerErişimler.bir.kitap;

public class AmazonStore {
    public static void main(String[] args) {
        kitap ktp2=new kitap("kitapcı");
        // Public constructor tanımlandığı için çağırılabildi diğer paketten
        // ama diğeri default olduğu için diğer paketten çağırılamadı

    }
}
