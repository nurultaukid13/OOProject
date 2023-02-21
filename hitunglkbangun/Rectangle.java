import java.util.Scanner;

public class Rectangle {
    private int[] input;

    public int[] input(){
        this.input = new int[2];
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan panjang: ");
        this.input[0] = masukan.nextInt();
        System.out.print("Masukkan lebar: ");
        this.input[1] = masukan.nextInt();
        return this.input;
    }

    public int luas() {
        int luas;
        luas = this.input[0] * this.input[1];
        return luas;
    }

    public int keliling() {
        int keliling;
        keliling = 2 * (this.input[0] + this.input[1]);
        return keliling;
    }

    public void printInfo() {
        System.out.println("=================");
        System.out.println("Persegi Panjang");
        System.out.println("=================");
        System.out.println("luas= " + luas());
        System.out.println("keliling= " + keliling() + "\n");
    }
}
