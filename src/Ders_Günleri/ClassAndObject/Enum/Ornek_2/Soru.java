package Ders_Günleri.ClassAndObject.Enum.Ornek_2;

public class Soru {
    public static void main(String[] args) {
        User user1= new User("Nihat",Rol.MUDUR,STATU.AKTIF);
        User user2= new User("Mihat",Rol.SATIS,STATU.PASIF);
        User user3= new User("Yavuz",Rol.PERSONEL,STATU.AKTIF);



    }
    public static void Usersil (User user){
        if (user.rol==Rol.ADMIN){
            System.out.println("You cannot delete the admin!!!");
        }


    }
}
