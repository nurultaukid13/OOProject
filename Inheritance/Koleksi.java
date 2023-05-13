public class Koleksi{
    protected String judul, penerbit;
    protected int tahun;

    public Koleksi(String judul_koleksi,String nama_penerbit, int tahun_rilis){
        this.judul = judul_koleksi;
        this.penerbit = nama_penerbit;
        this.tahun = tahun_rilis;
    }

    public String toString(){
        return "Koleksi :\n" +
            "Judul: " + this.judul + "\n" +
            "Penerbit: " + this.penerbit + "\n" +
            "Tahun rilis: " + this.tahun + "\n";
    }
}