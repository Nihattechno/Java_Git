package Ders_Günleri.Ornek_Sorular.Ornek1;

public class Kedi extends Hayvan{
    @Override
    void yiyecek() {
        System.out.println("Kedinin yiyeceği Somonlu mamadır.");
    }


    @Override
    void yemekMiktarı() {
        System.out.println("Kedinin yemek miktarı günlük 50 gramdır.");
    }

    @Override
    void gunlükUykuSüresi() {
        System.out.println("Günde 10 saat uyumalıdır.");
    }

    @Override
    void ses() {
        System.out.println("Kedi miyav der.");
    }

    public Kedi(String isim, boolean vahşi, String doğumTarihi) {

        super(isim, vahşi, doğumTarihi);
    }

    @Override
    public String getIsim() {
        return super.getIsim();
    }

    @Override
    public void setIsim(String isim) {
        super.setIsim(isim);
    }

    @Override
    public boolean isVahşi() {
        return super.isVahşi();
    }

    @Override
    public void setVahşi(boolean vahşi) {
        super.setVahşi(vahşi);
    }

    @Override
    public String getDoğumTarihi() {
        return super.getDoğumTarihi();
    }

    @Override
    public void setDoğumTarihi(String doğumTarihi) {
        super.setDoğumTarihi(doğumTarihi);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
