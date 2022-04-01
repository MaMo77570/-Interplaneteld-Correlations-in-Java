package hafta5;

public class Musteri  extends kisi{
    private Adres isAdres;
    private String telefonNumara;

    public Musteri(String adi, String soyadi, String evAdres, String telefonNumara, String isAdres) {
    }

    public Adres getIsAdres() {
        return isAdres;
    }

    public void setIsAdres(Adres isAdres) {
        this.isAdres = isAdres;
    }

    public String getTelefonNumara() {
        return telefonNumara;
    }

    public void setTelefonNumara(String telefonNumara) {
        this.telefonNumara = telefonNumara;
    }

    @Override
    public String toString() {
        return "Musteri{" +
                "isAdres=" + isAdres +
                ", telefonNumara='" + telefonNumara + '\'' +
                '}';
    }
}
