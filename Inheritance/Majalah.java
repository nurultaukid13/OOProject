public class Majalah extends Koleksi {
    private String edisi;

    public Majalah(String judul_majalah,String edisi_majalah ,String penerbit_majalah, int tahun_rilis ){
        super(judul_majalah, penerbit_majalah, tahun_rilis);
        this.edisi = edisi_majalah;
    }

    public String toString(){
        return super.toString()+
            "Edisi: "+this.edisi+"\n"+
            "Tipe: Majalah";
    }
}
