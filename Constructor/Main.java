// import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // int pilihan = 0;

        Kubus kubus1 = new Kubus(2);
        Bola bola1 = new Bola(10);
        Tabung tabung1 = new Tabung(7, 11);
        LimasSegiEmpat limas1 = new LimasSegiEmpat(5, 12);
        Balok balok1 = new Balok(6, 7, 10);

        Bangun[] arrayBangun = { kubus1, bola1, tabung1, limas1, balok1 };

        double totalVolume = 0;

        for (Bangun bangun : arrayBangun) {
            double volume = bangun.ComputeAndSetVolume();
            totalVolume += volume;
            System.out.println("Volume " + bangun.getClass().getSimpleName() + ": " + volume);
        }

        double rataRataVolume = totalVolume / arrayBangun.length;
        System.out.println("Rata-rata volume: " + rataRataVolume);

        // while(pilihan != 6){
        // System.out.println("===============================");
        // System.out.println("Perhitungan Volume bangun ruang");
        // System.out.println("===============================");
        // System.out.println("1. Kubus");
        // System.out.println("2. Balok");
        // System.out.println("3. Tabung");
        // System.out.println("4. Limas Segi Empat");
        // System.out.println("5. Bola");
        // System.out.println("6. Keluar");
        // System.out.println("===============================");

        // System.out.print("Masukkan nomer pilihan:");
        // pilihan = input.nextInt();
        // System.out.println("===============================");

        // switch(pilihan){
        // case 1:
        // Kubus kubus = new Kubus();
        // System.out.print("Masukkan sisi kubus: ");
        // double sisi = input.nextDouble();
        // kubus.Getsisi(sisi);
        // kubus.ComputeAndSetVolume();
        // kubus.GetVolume();
        // break;

        // case 2:
        // System.out.print("Masukkan Panjang balok: ");
        // double panjang = input.nextDouble();
        // System.out.print("Masukkan Lebar balok: ");
        // double lebar = input.nextDouble();
        // System.out.print("Masukkan Tinggi balok: ");
        // double tinggi = input.nextDouble();
        // Balok balok = new Balok(panjang, lebar, tinggi);
        // balok.GetVolume();
        // break;

        // case 3:
        // System.out.print("Masukkan Radius tabung: ");
        // double radius = input.nextDouble();
        // System.out.print("Masukkan Tinggi tabung: ");
        // double tinggitab = input.nextDouble();
        // Tabung tabung = new Tabung(radius, tinggitab);
        // tabung.GetVolume();
        // break;

        // case 4:
        // LimasSegiEmpat limas = new LimasSegiEmpat();
        // System.out.print("Masukkan sisi alas Limas Segi Empat: ");
        // double sisi_alas = input.nextDouble();
        // limas.Setsisi_alas(sisi_alas);
        // System.out.print("Masukkan Tinggi Limas Segi Empat: ");
        // double tinggi_limas = input.nextDouble();
        // limas.Setinggi_limas(tinggi_limas);
        // limas.ComputeAndSetVolume();
        // limas.GetVolume();
        // break;

        // case 5:
        // Bola bola = new Bola();
        // System.out.print("Masukkan jari-jari Bola: ");
        // double jari_bola = input.nextDouble();
        // bola.SetRadius(jari_bola);
        // bola.ComputeAndSetVolume();
        // bola.GetVolume();
        // break;

        // case 6:
        // System.out.println("Terima kasih dan selemat tinggal");
        // break;
        // default:
        // System.out.println("Pilihan tidak valid");
        // }
        // }
        // input.close();
    }
}
