import java.util.Scanner;

public class Ellipse {
    private double jarakSumbuHorizontal;
    private double jarakSumbuVertikal;

    public void input() {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan jarak sumbu horizontal: ");
        this.jarakSumbuHorizontal = masukan.nextDouble();
        System.out.print("Masukkan jarak sumbu vertikal: ");
        this.jarakSumbuVertikal = masukan.nextDouble();
    }

    public double luas() {
        double luas;
        luas = Math.PI * (this.jarakSumbuHorizontal / 2) * (this.jarakSumbuVertikal / 2);
        return luas;
    }

    public double keliling() {
        double keliling;
        keliling = Math.PI * Math
                .sqrt(2 * (Math.pow(this.jarakSumbuHorizontal / 2, 2) + Math.pow(this.jarakSumbuVertikal / 2, 2)));
        return keliling;
    }

    public void printInfo() {
        System.out.println("=================");
        System.out.println("Elips");
        System.out.println("=================");
        System.out.printf("luas= %.3f \n", luas());
        System.out.printf("keliling= %.3f \n\n", keliling());
    }
}
