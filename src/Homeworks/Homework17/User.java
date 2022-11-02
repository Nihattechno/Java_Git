package Homeworks.Homework17;

import java.util.Scanner;

public class User {
   private  int id;
   private String username;
   private  String password;
   private boolean active=true;
   private boolean signedIn=false;

   private static int idsayac=0;

   enum userRole {
       ADMIN, OGRENCI, CALISAN, HOCA
    }

    public User() {
    }


    public User(String username, String password, boolean active, boolean signedIn) {

        setUsername(username);
        setPassword(password);
        setSignedIn(signedIn);
        setActive(active);
        id=++idsayac;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
       Scanner scanner= new Scanner(System.in);
       if (password.length()<6){
           System.out.println("Girilen değer 6 haneden küçük olamaz!");
           System.out.println("Lütfen parolayı tekrar giriniz.");
           setPassword(scanner.nextLine());
       }
       else {
           this.password=password;
       }

    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isSignedIn() {
        return signedIn;
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", active=" + active +
                ", signedIn=" + signedIn +
                '}';
    }
}
