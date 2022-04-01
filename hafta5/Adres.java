package hafta5;

public class Adres {
    private String AdresSatrir;
    private String il;

    public String getAdresSatrir() {
        return AdresSatrir;
    }

    public void setAdresSatrir(String adresSatrir) {
        AdresSatrir = adresSatrir;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    @Override
    public String toString() {
        return "Adres{" + "AdresSatrir='" + AdresSatrir + '\'' + ", il='" + il + '\'' + '}';
    }
}
