package Ders_Günleri.ZamanveTarih;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class LocalDateJava {
    public static void main(String[] args) {
        
        // Şuanki Tarihi oluşturma ve alıp kullanma
        LocalDate tarih = LocalDate.now();
        System.out.println("tarih = " + tarih.getDayOfMonth());
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek());
        System.out.println("tarih = " + tarih.getDayOfYear());
        System.out.println("tarih = " + tarih.getMonth());
        System.out.println("tarih = " + tarih.getMonthValue());


        // Tarihi local'e göre gösteriyor ve ona göre kısaltıp uzun halini yazıyor
        System.out.println("tarih.format(DateTimeFormatter.ISO_DATE) = " + tarih.format(DateTimeFormatter.ISO_DATE));
        System.out.println("tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)) = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)) = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)) = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        
        // Local'e göre olan saati farklı ülkelerin yazılış şekline çevirme
        System.out.println("tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMANY)) = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMANY)));

    }
}
