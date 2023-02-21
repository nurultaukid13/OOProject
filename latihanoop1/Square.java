import java.util.Scanner;

public class Square{
    private int sisi;

    public int input(){
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi: ");
        this.sisi = masukan.nextInt();
        return this.sisi;
    }

    public int luas(){
        int luas;
        luas = this.sisi * this.sisi;
        return luas;
    }

    public int keliling(){
        int keliling;
        keliling = this.sisi * 4;
        return keliling;
    }

    public void printInfo(){
        System.out.println("=================");
        System.out.println("Persegi");
        System.out.println("=================");
        System.out.println("luas= "+luas());
        System.out.println("keliling= "+keliling());
    }
}