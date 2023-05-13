public class Rumah extends Bangunan{
    private String pemilik;
    private int jumlah_penghuni;

    public Rumah(int no_bangunan, int luas_bangunan, int tahun_dibangun, String alamat_bangunan, String pemilik_rumah, int jumlah_penghuni_rumah){
        super(no_bangunan, luas_bangunan, tahun_dibangun, alamat_bangunan);
        this.pemilik = pemilik_rumah;
        this.jumlah_penghuni = jumlah_penghuni_rumah;
    }

    @Override //overriding
    public void printInfo(){
        super.printInfo();
        System.out.println("Tipe Bangunan: Rumah");
        System.out.println("Pemilik: "+this.pemilik);
        System.out.println("Jumlah Penghuni: "+this.jumlah_penghuni);
    }
    
    //overloading
    public void printInfo(int jumlah_keluarga){
        super.printInfo();
        System.out.println("Pemilik: "+this.pemilik);
        System.out.println("Jumlah Keluaga: "+jumlah_keluarga);
        System.out.println("Jumlah Penghuni: "+this.jumlah_penghuni);
    }
}
