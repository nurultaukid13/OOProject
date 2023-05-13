public class Sekolah extends Gedung{
    private int jumlah_kelas;
    private String pendidikan;

    public Sekolah(int no_bangunan, int luas_bangunan, int tahun_dibangun, String alamat_bangunan, int tinggi_gedung, int jumlah_tingkat_gedung, int jumlah_kelas_sekolah, String tingkat_pendidikan){
        super(no_bangunan, luas_bangunan, tahun_dibangun, alamat_bangunan, tinggi_gedung, jumlah_tingkat_gedung);
        this.jumlah_kelas = jumlah_kelas_sekolah;
        this.pendidikan = tingkat_pendidikan;
    }

    @Override //overriding
    public void printInfo(boolean negeri){
        if(negeri){
            super.printInfo(true);
        }else{
            super.printInfo(false);
        }
        System.out.println("Jumlah kelas: "+this.jumlah_kelas);
        System.out.println("Tingkat Pendidikan "+this.pendidikan);
    }
}