package ogrcOgrtYonetimi;

public class Kisi {
    String adiSoyadi;
    String kimlikNo;
    int yas;

    public Kisi(String adiSoyadi, String kimlikNo, int yas) {
        this.adiSoyadi = adiSoyadi;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
    }

    public Kisi() {

    }

    public String getAdiSoyadi() {
        return adiSoyadi;
    }

    public void setAdiSoyadi(String adiSoyadi) {
        this.adiSoyadi = adiSoyadi;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "adiSoyadi='" + adiSoyadi + '\'' +
                ", kimlikNo='" + kimlikNo + '\'' +
                ", yas=" + yas +
                '}';
    }
}
