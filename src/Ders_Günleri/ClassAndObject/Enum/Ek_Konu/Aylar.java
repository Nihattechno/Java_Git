package Ders_Günleri.ClassAndObject.Enum.Ek_Konu;

public enum Aylar {
    OCAK(1,31,"Ocak"),
    SUBAT(2,28,"Şubat"),
    MART(3,31,"Mart"),
    NİSAN(4,30,"Nisan"),
    MAYIS(5,31,"Mayıs"),
    HAZİRAN(6,30,"Haziran"),
    TEMMUZ(7,31,"Temmuz"),
    AĞUSTOS(8,30,"Ağustos"),
    EYLÜL(9,30,"Eylül"),
    EKİM(10,30,"Ekim"),
    KASIM(11,31,"Kasım"),
    ARALIK(12,31,"Aralık");

    final int ayNo;
    final int günNo;
    final String isim;

    Aylar(int ayNo, int günNo, String isim) {
        this.ayNo = ayNo;
        this.günNo = günNo;
        this.isim = isim;
    }

    @Override
    public String toString() {
        return "Aylar{" +
                "ayNo=" + ayNo +
                ", günNo=" + günNo +
                ", isim='" + isim + '\'' +
                '}';
    }
}
