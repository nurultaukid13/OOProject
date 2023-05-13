public class Skripsi extends Buku{
    private String npm;

    public Skripsi(String npm_mahasiswa, String penulis_skrpsi, String judul_skripsi, String penerbit_skripsi, int tahun_rilis){
        super(judul_skripsi,penulis_skrpsi ,penerbit_skripsi, tahun_rilis);
        this.npm=npm_mahasiswa;
    }

    public String toString(){
        return super.toString()+
            "NPM: "+this.npm+"\n";
    }
}
