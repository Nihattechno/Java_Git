package Homeworks.Homework20.Soru4;

public class Main {
    public static void main(String[] args) {
        RentApartmants apt1 = new RentApartmants("Nihat",2,true);
        System.out.println("Username= "+apt1.getName()+"\nRent cost= "+rentMoney(apt1.getRoomCount(),apt1.isBalconyOrno()));

    }
    public static int rentMoney (int girdi,boolean balkon){
        int rent=0;
        switch (girdi){
            case 0:
                rent=1400;
                break;
            case 1:
                rent=1700;
                break;
            case 2:
                rent=2200;
                break;
            case 3:
                rent=2700;
                break;
            default:
                System.out.println("Lütfen belirtilen rakamlardan birini giriniz.");
                break;
        }
        if (balkon){
            rent+=200;
        }
        return rent;
    }
}
