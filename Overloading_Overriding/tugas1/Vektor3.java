public class Vektor3{
    private int[] array = new int[3];

    public Vektor3(int x, int y, int z){
        this.array[0] = x;
        this.array[1] = y;
        this.array[2] = z;
    }

    public Vektor3 perkalian(int skalar) {
        Vektor3 result = new Vektor3(0, 0, 0); // membuat objek Vektor3 baru dengan nilai awal 0
        for (int i = 0; i < 3; i++) { // melakukan loop sebanyak 3 kali
            result.array[i] = this.array[i] * skalar; // mengalikan elemen array dari objek Vektor3 ini dengan skalar dan menaruh hasilnya pada objek Vektor3 baru yang sudah dibuat sebelumnya
        }
        return result; // mengembalikan objek Vektor3 baru yang telah dihasilkan
    }

    public int perkalian(Vektor3 other) {
        int result = 0;// membuat variabel result dengan nilai awal 0
        for (int i = 0; i < 3; i++) {// melakukan loop sebanyak 3 kali
            result += this.array[i] * other.array[i];// mengalikan elemen array pada indeks ke-i dari objek Vector3 ini dengan elemen array pada indeks ke-i dari objek Vector3 lain yang diberikan sebagai parameter, kemudian menjumlahkan hasilnya ke dalam variabel result
        }
        return result;// mengembalikan variabel result yang berisi hasil perkalian skalar dari dua vektor
    }

    public static void main(String[] args){
        int a=5;
        Vektor3 vektor1 = new Vektor3(3, 2 , 1);
        System.out.print("[ ");
        for(int i =0; i<vektor1.array.length; i++){
            System.out.print(+vektor1.array[i]+" ");
        }
        System.out.print("] * "+a+" = [ ");
        for(int i=0; i<vektor1.array.length; i++){
            System.out.print(vektor1.perkalian(a).array[i]+" ");
        }
        System.out.println("] \n");

        Vektor3 vektor2 = new Vektor3(1, 2 , 3);
        System.out.print("[ ");
        for(int i =0; i<vektor1.array.length; i++){
            System.out.print(+vektor1.array[i]+" ");
        }
        System.out.print("] * [ ");
        for(int i =0; i<vektor2.array.length; i++){
            System.out.print(+vektor2.array[i]+" ");
        }
        System.out.println("] = "+vektor1.perkalian(vektor2));

    }
}