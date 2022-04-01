package hafta5;

public class Personel  extends kisi{

    private int SicinNum;
    private String bolum;

    public int getSicinNum() {
        return SicinNum;
    }

    public void setSicinNum(int sicinNum) {
        SicinNum = sicinNum;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        return "Personel{" +
                "SicinNum=" + SicinNum +
                ", bolum='" + bolum + '\'' +
                '}';
    }
}
