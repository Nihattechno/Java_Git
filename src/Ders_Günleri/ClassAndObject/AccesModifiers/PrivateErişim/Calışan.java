package Ders_Günleri.ClassAndObject.AccesModifiers.PrivateErişim;

public class Calışan {
    int id;
    String name;
    String surname;
   private String password;

   public void şifreatama (String şifre){

       if (şifre.length()<8){
           System.out.println("Kurala uygun şifre giriniz");
       }
       else {
           this.password=şifre;
           System.out.println("Şifreniz başarıyla atanmıştır.");
       }

   }

   public void sifregoster (){

       if(password.length()>=8)
       System.out.println("****"+this.password.substring(4));
   }
}
