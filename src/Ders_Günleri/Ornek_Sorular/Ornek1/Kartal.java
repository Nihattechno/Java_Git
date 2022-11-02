package Ders_Günleri.Ornek_Sorular.Ornek1;

public class Kartal extends Hayvan {
    public Kartal(String isim, boolean vahşi, String doğumTarihi) {
        super(isim, vahşi, doğumTarihi);
    }

    @Override
    void yiyecek() {
        System.out.println("Kartal avcıdır ne bulursa yer");
    }


    @Override
    void yemekMiktarı() {
        System.out.println("Bugün şansında ne varsa");
    }

    @Override
    void gunlükUykuSüresi() {
        System.out.println("Kartallar 8 saat min uyur");
    }

    @Override
    void ses() {
        System.out.println("Daha önce duymadım");
    }

    @Override
    public int getId() {
        return super.getId();
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
