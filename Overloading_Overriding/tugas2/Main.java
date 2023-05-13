public class Main {
    public static void main(String[] args){
        Sekolah bangunan1 = new Sekolah(55, 200, 2009, "Desa Jumputrejo", 50, 10, 200, "TK");
        bangunan1.printInfo(true);
        System.out.println("\n");
        Rumah bangunan2 = new Rumah(20, 100, 2021, "Dusun Beciro", "Taukid", 4);
        bangunan2.printInfo();
    }
}
