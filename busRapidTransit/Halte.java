public class Halte {
    public String namahalte;
    public int penumpangnungguh;

    public Halte(String nama_halte) {
        this.namahalte = nama_halte;
    }

    public String getNama() {
        return this.namahalte;
    }

    public void getpenumpangnunggu(int penumpang_nunggu){
        this.penumpangnungguh = penumpang_nunggu;
    }

    public int penumpangnunggu(){
        return this.penumpangnungguh;
    }
}