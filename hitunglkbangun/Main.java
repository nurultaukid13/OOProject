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
                    persegi.input();
                    persegi.luas();
                    persegi.keliling();
                    persegi.printInfo();
                    break;
                case 2:
                    Rectangle ppanjang = new Rectangle();
                    ppanjang.input();
                    ppanjang.luas();
                    ppanjang.keliling();
                    ppanjang.printInfo();
                    break;
                case 3:
                    Circle lingkaran = new Circle();
                    lingkaran.input();
                    lingkaran.luas();
                    lingkaran.keliling();
                    lingkaran.printInfo();
                    break;
                case 4:
                    Ellipse elips = new Ellipse();
                    elips.input();
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
