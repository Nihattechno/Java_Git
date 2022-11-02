package Homeworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;

public class Homework16 {
    public static void main(String[] args) {
        ArrayList<String> hm1 = new ArrayList<>();
        hm1.add("Orange");
        hm1.add("Kiwi");
        hm1.add("Peach");
        hm1.add("Banana");
        hm1.add("Orange");
        String hw1 = "Orange";
        String hw2="xd";

        ArrayList<Integer> sayılar = new ArrayList<>();
        sayılar.add(5);
        sayılar.add(4);
        sayılar.add(6);
        sayılar.add(2);
        sayılar.add(1);

        int [][] dizi ={{1,2,3},{4,5,6},{7,8,9}};

        HashSet<Integer>set=new HashSet<>();
        set.add(4);
        set.add(3);
        set.add(2);
        set.add(1);
        set.add(7);

        HashSet<String> meyve = new HashSet<>();
        meyve.add("banana");
        meyve.add("strawberry");
        meyve.add("kiwi");
        meyve.add("pineapple");


        System.out.println(totalCount(set));

        System.out.println(dönüşüm(dizi));
    }


    // Soru 1
    public static int getCount(ArrayList<String> liste, String kelime) {
        int dönen = 0;

        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i).equals(kelime)) {
                dönen++;
            }
        }
        return dönen;
    }


    // Soru 2
    public static int getSum(ArrayList<Integer> sayılar) {
        int toplam = 0;

        for (int i = 0; i < sayılar.size(); i++) {
            toplam = toplam + sayılar.get(i);
        }

        return toplam;
    }


    // Soru 3
    public static ArrayList<Integer> getLenght(ArrayList<String> liste) {
        ArrayList<Integer> harfler = new ArrayList<>();
        int r = 0;

        for (int i = 0; i < liste.size(); i++) {
            r = liste.get(i).length();
            harfler.add(r);

        }
        return harfler;
    }


    // Soru 4
    public static ArrayList<String> changeInArraylist (ArrayList<String> liste, String s1,String s2){
        Collections.replaceAll(liste,s1,s2);
        return liste;
    }

    // Soru 5
    public static ArrayList<String> rotateList(ArrayList<String> liste){
        ArrayList<String>dönen=new ArrayList<>();
        for (int i = liste.size()-1; i >=0 ; i--) {
            dönen.add(liste.get(i));
        }
        return dönen;
    }

    // Soru 6 tekrar bak
   /* public static int hillNum(ArrayList<Integer> liste){
        int dönen=0;
        int j=1;
        int değer;
        for (int i = 0; i <= liste.size() ; i++) {
            değer=liste.get(j-1);
            if (liste.get(j)<değer){
                if (liste.get(j+1)>liste.get(j)){
                    dönen=liste.get(j);
                }
            }
            j++;
        }
        return dönen;
    }*/

    //Soru 7
    public static ArrayList<Integer>common_values(ArrayList<Integer>liste1,ArrayList<Integer>liste2){
        ArrayList<Integer>dönen=new ArrayList<>();

        return dönen;
    }

    //Soru 8
    public static int secondMax(ArrayList<Integer> liste){
        int dönen=0;
        Collections.sort(liste);
        dönen= liste.get(liste.size()-2);

        return dönen;
    }

    //Soru 9
    public static int rangeBTW (ArrayList<Integer>liste, int max,int min){
        int dönen=0;


        return dönen;
    }

    // Soru 10
    public static ArrayList<Integer> dönüşüm (int [][]dizi){
        ArrayList<Integer>dönen=new ArrayList<>();
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j <dizi[i].length ; j++) {
                dönen.add(dizi[i][j]);
            }
        }
        return dönen;
    }

    // Soru 11
    public static int totalCount (HashSet<Integer>hash){
        int toplam=0;
        toplam=hash.size();

        return toplam;
    }

    // Soru 12
    /*public static HashSet<String>changeSet(HashSet<String>set, String kelime, String kelime2){
        if (set.contains(kelime)){

        }


    }*/
}
