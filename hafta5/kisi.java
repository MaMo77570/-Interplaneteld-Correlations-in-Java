package hafta5;

public class kisi {

    private String adi;
    private Adres EvAdres;
    private String Soyadi;

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public Adres getEvAdres() {
        return EvAdres;
    }

    public void setEvAdres(Adres evAdres) {
        EvAdres = evAdres;
    }

    public String getSoyadi() {
        return Soyadi;
    }

    public void setSoyadi(String soyadi) {
        Soyadi = soyadi;
    }

    @Override
    public String toString() {
        return "kisi{" +
                "adi='" + adi + '\'' +
                ", EvAdres=" + EvAdres +
                ", Soyadi='" + Soyadi + '\'' +
                '}';
    }
}
