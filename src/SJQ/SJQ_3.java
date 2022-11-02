package SJQ;

public class SJQ_3 {
    public static void main(String[] args) {

        Soru2("umut");
    }

    // Soru1
    public static int Soru1 (int sayı){
        int dönen=0;
        int değer;
        int xd;

        while (sayı>0) {
            değer=sayı%10;
            dönen=dönen+(int)Math.pow(değer,4);
            sayı=sayı/10;}

        return dönen;
    }

    // Soru2

    public static void Soru2 (String kelime){
        int harfdeğer=0;
        for (int i = 0; i <kelime.length() ; i++) {
            harfdeğer=kelime.charAt(i);

            System.out.println(harfdeğer+" sayısının char karşılığı= "+kelime.charAt(i));
        }

    }

}
