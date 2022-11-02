package Homeworks.Homework20.Soru2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Employee cls1 = new Employee("Fernando",8000,"11/23/2000");
       if (ageCalculator(cls1.getDob())>18){
           System.out.println("Welcome to our company Fernando your salary is 80000.");
       }
       else if (ageCalculator(cls1.getDob())<18){
           System.out.println("come back when you are 18 years old.");
       }
       else {
           System.out.println("we can have inter with you after that you can have a 80000 salary");
       }

    }

    public static int ageCalculator (String girdi){
        LocalDate date = LocalDate.now();
        int xd=girdi.lastIndexOf("/");
        String ty=girdi.substring(xd+1);
        return date.getMonthValue()-Integer.parseInt(ty);
    }
}
