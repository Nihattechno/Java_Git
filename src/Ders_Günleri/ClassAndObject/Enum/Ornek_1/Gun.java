package Ders_Günleri.ClassAndObject.Enum.Ornek_1;

public class Gun {

    // Bu şekilde kendin sayı girerek tanımlayabilirsin ama ortaya hata ihtimali
    // çıkarır. Onun yerine ENUM diye bir tanım belirleme yöntemi var
    // Onun tanımlayıp çağırabiliriz.
    public static void günyazma (Aylar girdi){
        switch (girdi){
            case OCAK:
            case MART:
            case MAYIS:
            case TEMMUZ:
            case AĞUSTOS:
            case EKİM:
            case ARALIK:
                System.out.println("Girdiğiniz ay 31 gün çeker:");
                break;
            case NİSAN:
            case HAZİRAN:
            case EYLÜL:
            case KASIM:
                System.out.println("Girdiğiniz ay 30 gün çeker:");
                break;
            default:
                System.out.println("Girdiğiniz ay şubattır 28 gün çeker");

        }


    }

    enum Aylar {OCAK, SUBAT, MART, NİSAN, MAYIS, HAZİRAN, TEMMUZ, AĞUSTOS, EYLÜL
    , EKİM, KASIM, ARALIK}

}
