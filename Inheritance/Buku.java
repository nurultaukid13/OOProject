public class Buku extends Koleksi{
    private String penulis;

    public Buku(String judul_buku, String penulis_buku ,String penerbit_buku, int tahun_rilis ){
        super(judul_buku, penerbit_buku, tahun_rilis);
        this.penulis = penulis_buku;
    }

    public String toString(){
        return super.toString()+
            "Penulis: "+this.penulis+"\n"+
            "Tipe: Buku"+"\n";
    }
}
