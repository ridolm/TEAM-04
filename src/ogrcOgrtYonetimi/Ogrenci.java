package ogrcOgrtYonetimi;

public class Ogrenci extends Kisi {
    int numara;
    String sinif;

    public Ogrenci() {
        super();

    }

    public Ogrenci(String adiSoyadi, String kimlikNo, int yas, int numara, String sinif) {
        super(adiSoyadi, kimlikNo, yas);
        this.numara = numara;
        this.sinif = sinif;
    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "adiSoyadi='" + adiSoyadi + '\'' +
                ", kimlikNo='" + kimlikNo + '\'' +
                ", yas=" + yas +
                ", numara=" + numara +
                ", sınıf='" + sinif + '\'' +
                '}';
    }
}
