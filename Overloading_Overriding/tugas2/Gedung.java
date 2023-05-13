public class Gedung extends Bangunan{
    protected int tinggi, jumlah_tingkat;
    
    public Gedung(int no_bangunan, int luas_bangunan, int tahun_dibangun, String alamat_bangunan, int tinggi_gedung, int jumlah_tingkat_gedung){
        super(no_bangunan, luas_bangunan, tahun_dibangun, alamat_bangunan);
        this.tinggi = tinggi_gedung;
        this.jumlah_tingkat = jumlah_tingkat_gedung;
    }

    @Override //overriding
    public void printInfo(){
        super.printInfo();
        System.out.println("Tipe Bangunan: Gedung");
        System.out.println("Tinggi Gedung: "+this.tinggi+"m");
        System.out.println("Jumlah Tingkat: "+this.jumlah_tingkat);
    }

    //overloading
    public void printInfo(boolean milik_pemerintah){
        super.printInfo();
        if(milik_pemerintah){
            System.out.println("Milik: Pemerintah");
        }else{
            System.out.println("Milik: Swasta");
        }
        System.out.println("Tinggi Gedung: "+this.tinggi+"m");
        System.out.println("Jumlah Tingkat: "+this.jumlah_tingkat);
    }
}
