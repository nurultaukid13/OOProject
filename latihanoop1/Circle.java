import java.util.Scanner;

public class Circle {
    private double radius;

    public double input() {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan jari-jari lingkaran: ");
        this.radius = masukan.nextDouble();
        return this.radius;
    }

    public double luas() {
        double luas;
        luas = Math.PI * Math.pow(this.radius, 2);
        return luas;
    }

    public double keliling() {
        double keliling;
        keliling = 2 * Math.PI * this.radius;
        return keliling;
    }

    public void printInfo() {
        System.out.println("=================");
        System.out.println("Lingkaran");
        System.out.println("=================");
        System.out.printf("Luas= %.3f",luas());
        System.out.printf("Keliling= %.3f",keliling());
    }
}
