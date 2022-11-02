package Ders_Günleri.Java_Mapler;

import java.util.HashMap;
import java.util.Map;

public class Javamaps_Qs {
    public static void main(String[] args) {

        Map<String,String>ukartvizit= new HashMap<>();
        ukartvizit.put("İsim","Umut");
        ukartvizit.put("mail","grille9112@gmail.com");
        ukartvizit.put("tel","5397178479");
        ukartvizit.put("meslek","Software Tester");

        Map<String,String>nkartvizit=new HashMap<>();
        nkartvizit.put("isim","Nihat");
        nkartvizit.put("mail","nihatmail.com");
        nkartvizit.put("tel","48484848");
        nkartvizit.put("meslek","QA Engineer");

        System.out.println("Ukartvizit isim= "+ukartvizit.get("İsim"));
        System.out.println("Nkartvizit meslek= "+nkartvizit.get("meslek"));

        Map<String,Map<String,String>>mapofmap=new HashMap<>();
        mapofmap.put("Umut kartvizit",ukartvizit);
        mapofmap.put("Nihat kartvizit",nkartvizit);
        System.out.println(mapofmap.get("Umut kartvizit").get("meslek"));

        for (Map.Entry<String,Map<String,String>> kartvizit: mapofmap.entrySet()){
            System.out.println(kartvizit);

        }
    }
}
