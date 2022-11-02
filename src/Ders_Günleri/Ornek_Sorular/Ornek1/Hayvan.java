package Ders_Günleri.Ornek_Sorular.Ornek1;

public abstract class Hayvan {
    private int id ;
    private String isim;
    private boolean vahşi;
    private String doğumTarihi;
    private static int idsayac=0;

    public Hayvan(String isim, boolean vahşi, String doğumTarihi) {
        id=++idsayac;
        setIsim(isim);
        setVahşi(vahşi);
        setDoğumTarihi(doğumTarihi);
    }

    public int getId() {
        return id;
    }


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahşi() {
        return vahşi;
    }

    public void setVahşi(boolean vahşi) {
        this.vahşi = vahşi;
    }

    public String getDoğumTarihi() {
        return doğumTarihi;
    }

    public void setDoğumTarihi(String doğumTarihi) {
        this.doğumTarihi = doğumTarihi;
    }

    abstract void yiyecek ();
    abstract void yemekMiktarı ();
    abstract void gunlükUykuSüresi ();
    abstract void ses ();

    @Override
    public String toString() {
        return "Hayvan{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", vahşi=" + vahşi +
                ", doğumTarihi='" + doğumTarihi + '\'' +
                '}';
    }
}
