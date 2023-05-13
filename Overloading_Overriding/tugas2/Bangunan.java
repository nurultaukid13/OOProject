public class Bangunan{
    protected int no, luas, tahun;
    protected String alamat;

    public Bangunan(int no_bangunan, int luas_bangunan, int tahun_dibangun, String alamat_bangunan){
        this.no = no_bangunan;
        this.luas = luas_bangunan;
        this.tahun = tahun_dibangun;
        this.alamat = alamat_bangunan;
    }

    public void printInfo(){
        System.out.println("No Bangunan: "+this.no);
        System.out.println("Luas Bangunan: "+this.luas+"m^2");
        System.out.println("Tahun Berdiri: "+this.tahun);
        System.out.println("Alamat: "+this.alamat);
    }
}