package ogrcOgrtYonetimi;

public class Ogretmen extends Kisi{
    String bolum;
    String sicilNo;

    public Ogretmen(String adiSoyadi, String kimlikNo, int yas) {
        super(adiSoyadi, kimlikNo, yas);
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "adiSoyadi='" + adiSoyadi + '\'' +
                ", kimlikNo='" + kimlikNo + '\'' +
                ", yas=" + yas +
                ", bolum='" + bolum + '\'' +
                ", sicilNo='" + sicilNo + '\'' +
                '}';
    }
}
