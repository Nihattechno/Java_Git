package Ders_Günleri.Ornek_Sorular.Ornek1;

public class HayvanatMain {
    public static void main(String[] args) {
        Kedi pisi = new Kedi("North",true,"11/10/89");
        pisi.yiyecek();
        pisi.yemekMiktarı();
        pisi.gunlükUykuSüresi();
        pisi.ses();
        System.out.println(pisi);
        System.out.println("\n**********\n");
        Kartal bjk = new Kartal("Bjk",true,"25/04/1903");
        bjk.yiyecek();
        bjk.yemekMiktarı();
        bjk.gunlükUykuSüresi();
        bjk.ses();
        System.out.println(bjk);
    }
}
