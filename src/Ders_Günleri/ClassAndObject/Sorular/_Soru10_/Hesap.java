package Ders_Günleri.ClassAndObject.Sorular._Soru10_;

public class Hesap {
     int yatan;
     int çekilen;
    private int bakiye;

    public  void paraYatır (int yatırma){
        bakiye+=yatırma;
        this.yatan+=yatırma;
    }
    public  void paraÇekme (int çekim){
        bakiye-=çekim;
        this.çekilen-=çekim;

    }

    @Override
    public String toString() {
        return "Hesap{" +
                "yatan=" + yatan +
                ", çekilen=" + çekilen +
                ", bakiye=" + bakiye +
                '}';
    }
}
