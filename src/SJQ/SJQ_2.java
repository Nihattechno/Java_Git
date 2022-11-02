package SJQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class SJQ_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dizix={"Peach", "Berry" , "Orange" , "WaterMelon" , "Orange"};
        int [] bigdiff = {10,3,5,6};
        int [] dizi1 = {1,2,3};
        int [] dizi2 = {3,1,2,3};
        int [][] boyut = {{1,2,3},{2,3,1},{5,5,5},{2,10,3}};
        int [] tekrarlan = {1,2,2,2,2,3,3,4,4,4,5,5,5};
        String[][] para = {{"$12","$22","$5"},{"€9","€40","$1","$2"},{"€12"}};

        soru1(dizi1,dizi2);
    }

    // Soru 1
    public static void soru1(int [] dizi1, int [] dizi2){

        int [] yndizi = new int[dizi1.length+ dizi2.length];
        for (int i = 0; i < dizi1.length ; i++) {
            yndizi[i]=dizi1[i];
        }
        for (int j = dizi1.length; j < yndizi.length ; j++) {

        }
        System.out.println(Arrays.toString(yndizi));

    }
    // Soru 2
    public static void Soru2 (String [] dizi){
        for (int i = 0; i < dizi.length ; i++) {
            if (dizi[i].equals("Orange")){
                dizi[i]="Apple";
            }
        }
        System.out.print(Arrays.toString(dizi));
    }

    // Soru 3
    public static boolean soru3 (int [] dizi1, int[] dizi2){
        boolean dönen=false;
        if (dizi1[dizi1.length-1]==dizi2[0]){
            dönen=true;
        }
        return dönen;
    }

    // Soru 4
    public static int soru4 (int[] dizi ){
        int dönen =0;
        Arrays.sort(dizi);
        dönen=dizi[dizi.length-1]-dizi[0];
        return dönen;
    }

    // Soru 5
    public static int maxNumber (int [][] boyut){
        int maxnumber=boyut[0][0];
        for (int i = 0; i < boyut.length; i++) {
            for (int j = 0; j <boyut[i].length ; j++) {
                if (maxnumber<boyut[i][j]){
                    maxnumber=boyut[i][j];
                }
            }
        }
        return maxnumber;
    }

    // Soru 6
    public static int minNumber (int [][] boyut){
        int minnumber=boyut[0][0];
        for (int i = 0; i <boyut.length ; i++) {
            for (int j = 0; j <boyut[i].length ; j++) {
                if (minnumber>boyut[i][j]){
                    minnumber=boyut[i][j];
                }
            }
        }
        return minnumber;
    }

    // Soru 7
    public static HashSet<Integer> duplicate (int [] tekrarlanan){
        HashSet<Integer> tekrar = new HashSet<>();

        for (int i = 0; i < tekrarlanan.length ; i++) {
            tekrar.add(tekrarlanan[i]);
        }
        return tekrar;
    }

    // Soru 8
    public static void soru8 (String[] dizi){
        String[] yeni = new String[dizi.length];
        for (int i = dizi.length-1; i >0 ; i--) {
            yeni[i]=dizi[dizi.length-i];
        }
        System.out.print(Arrays.toString(yeni));
    }

    // Soru 9

    public static boolean soru9 (int[] dizi1){
        boolean dönen=false;
        if (dizi1[0]==dizi1[dizi1.length-1]){
            System.out.println("Dizinin ilk ve son harfi aynıdır");
            dönen=true;
        }

        return dönen;
    }

    // Soru 10

    public static double soru10 (String[][] para){
        double değer=0;
        double parabirim=1;
        for (int i = 0; i < para.length ; i++) {
            for (int j = 0; j <para[i].length ; j++) {
                if (para[i][j].contains("$")){
                    String harf=para[i][j].replaceAll("[^0-9]","");
                    parabirim=Integer.parseInt(harf);
                    parabirim=parabirim*3.2;

                }
                else if (para[i][j].contains("€")){
                    String harf=para[i][j].replaceAll("[^0-9]","");
                    parabirim=Integer.parseInt(harf);
                    parabirim=parabirim*4.2;
                }
                değer=değer+parabirim;
            }
        }
        return değer;
    }

}
