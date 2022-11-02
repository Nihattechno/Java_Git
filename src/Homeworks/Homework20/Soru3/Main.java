package Homeworks.Homework20.Soru3;

public class Main {
    public static void main(String[] args) {
        Subscribe uye1 = new Subscribe("Victoria",true,MemberShip.BOS);
        if (uye1.getWhichMember()==MemberShip.GOLD){
            System.out.println("Welcome to membership Victoria. Your membership is 40 dollar for month you can enjoy the videos , all homework and see you soon");
        }
        else if (uye1.getWhichMember()==MemberShip.SILVER){
            System.out.println("Welcome to membership Victoria. Your membership is 20 dollar for month you can enjoy the videos and all homework.");
        }
        else if (uye1.getWhichMember()==MemberShip.BRONZE){
            System.out.println("Welcome to membership Victoria. Your membership is 10 dollar for month you can enjoy the videos");
        }
        else {
            System.out.println("See you when you want to be a member. Thanks yazdırınız.");
        }

    }
}
