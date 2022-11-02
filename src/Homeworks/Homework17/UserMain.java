package Homeworks.Homework17;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {

        System.out.println(userEkle());


    }

    public static ArrayList<User> userEkle (){

        Scanner scanner = new Scanner(System.in);
        ArrayList<User> kullanıcı = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            System.out.println("Lütfen username'i giriniz= ");
            String username = scanner.nextLine();

            System.out.println("Lütfen password'u giriniz= ");
            String password = scanner.nextLine();

            User user1 = new User(username,password,true,false);
            kullanıcı.add(user1);
        }
        return kullanıcı;
    }

}
