package hafta5;
import java.net.SocketImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Uygulama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Musteri> MusiterListesi = new ArrayList<Musteri>();

        System.out.println("***********************Misteri Bilgileri Giriniz******************************");
        String cevap = null;
        String adi = null;
        String Soyadi= null;
        String telefonNumara = null;
        String AdresSatrir = null;
        String il = null;
        String isAdres = null;
        String EvAdres = null;

        do {
            System.out.println("********Musteri Adi  , soyAdi ve telefNumara Giriniz********8: \n");
            adi=input.nextLine();
            Soyadi= input.nextLine();
            telefonNumara= input.nextLine();

            System.out.print("******************Ev Adres Giriniz*********************\n");
            AdresSatrir= input.nextLine();
            il= input.nextLine();
            EvAdres = input.nextLine();

            System.out.print("******************Is Adres Giriniz*********************\n");
            AdresSatrir = input.nextLine();
            il = input.nextLine();
            isAdres = input.nextLine();

          MusiterListesi.add(new Musteri(adi , Soyadi , EvAdres , telefonNumara , isAdres));


          System.out.println("Baska Bir sey Yapmak istiyor Musunuz: (E & H)");
          cevap= input.nextLine();
        }

        while(cevap.equalsIgnoreCase("E"));
        
//        for(Musteri musiter11:MusiterListesi)
//            System.out.println(musiter11.getAdi()+ " " + musiter11.getSoyadi()+ " " +
//                    musiter11.getTelefonNumara()+ " "+ musiter11.getIsAdres()+ " "+ musiter11.getEvAdres()+ " " );

        System.out.println(MusiterListesi);

        MusiterListesi.forEach((item -> System.out.println(item.getEvAdres().getIl())));

    }
}
