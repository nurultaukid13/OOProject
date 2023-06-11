public class Main {
    public static void main(String[] args) {
        // Kode di bawah ini akan menghasilkan kesalahan kompilasi
        // karena mencoba menginstansiasi kelas abstract
        // Kelas obj = new Kelas();

        // Namun, kita dapat menggunakan polimorfisme
        // dengan menggunakan subclass yang mengimplementasikan kelas abstract
        Kelas obj = new Subkelas(); // kalo kelas() tidak bisa
        obj.myMethod();
    }
}
