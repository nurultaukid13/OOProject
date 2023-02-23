import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Pilih bentuk:");
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Circle");
            System.out.println("4. Ellipse");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    Square persegi = new Square();
                    System.out.print("Masukkan panjang sisi: ");
                    persegi.sisi = scanner.nextInt();
                    persegi.luas();
                    persegi.keliling();
                    persegi.printInfo();
                    break;
                case 2:
                    Rectangle ppanjang = new Rectangle();
                    ppanjang.input = new int[2];
                    System.out.print("Masukkan panjang: ");
                    ppanjang.input[0] = scanner.nextInt();
                    System.out.print("Masukkan lebar: ");
                    ppanjang.input[1] = scanner.nextInt();
                    ppanjang.luas();
                    ppanjang.keliling();
                    ppanjang.printInfo();
                    break;
                case 3:
                    Circle lingkaran = new Circle();
                    System.out.print("Masukkan jari-jari lingkaran: ");
                    lingkaran.radius = scanner.nextDouble();
                    lingkaran.luas();
                    lingkaran.keliling();
                    lingkaran.printInfo();
                    break;
                case 4:
                    Ellipse elips = new Ellipse();
                    System.out.print("Masukkan jarak sumbu horizontal: ");
                    elips.jarakSumbuHorizontal = scanner.nextDouble();
                    System.out.print("Masukkan jarak sumbu vertikal: ");
                    elips.jarakSumbuVertikal = scanner.nextDouble();
                    elips.luas();
                    elips.keliling();
                    elips.printInfo();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }
}
