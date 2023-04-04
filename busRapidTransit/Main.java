import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Bus bus = new Bus(5);
        Halte[] halte = new Halte[] {
            new Halte("PULL/Kantor"),
            new Halte("PORONG"),
            new Halte("SURABAYA"),
            new Halte("GRESIK")
        };
        int[] penumpang_turun = new int[4];
        int penumpangnunggu;

        System.out.println("----------------------------------------------");
        System.out.println("OUTPUT:");
        System.out.println("----------------------------------------------");
        
        for (int i = 0; i < halte.length; i++) {
            if (i == 0) {
                System.out.println("-> Bus berangkat dari " + halte[i].getNama());
                System.out.println("   - jumlah penumpang " + bus.penumpangdibus() + " penumpang");
                for(int j=i; j < 3; j++){
                    System.out.print("   - Penumpang yang turun di halte " + halte[j + 1].getNama() + " : ");
                    penumpang_turun[j+1]= scanner.nextInt();
                    bus.penumpangturun(j+1, penumpang_turun[j+1]);
                }
                System.out.println("----------------------------------------------");
            }else if(i==halte.length-1){
                System.out.println("-> Bus sampai di halte " + halte[i].getNama());
                System.out.println("   - "+bus.penumpangdibus()+" penumpang turun");
                bus.gtpenumpangdibus(0);
                System.out.println(" - jumlah penumpang: "+bus.penumpangdibus()+ " penumpang");
                System.out.println("-> Halte "+halte[i].getNama()+": "+bus.penumpangdibus()+" Penumpang Menunggu");
                System.out.println("----------------------------------------------");
            }else{
                System.out.print("-> Jumlah penumpang yang menunggu di halte "+halte[i].getNama()+" : ");
                penumpangnunggu = scanner.nextInt();
                bus.penumpangnaik(penumpangnunggu);
                System.out.println("-> Bus sampai di halte " + halte[i].getNama());
                System.out.println("   - "+bus.tampilpenumpangturun(i)+" penumpang turun");
                bus.getpenumpangturun(i);
                for(int j=i; j < 3; j++){
                    System.out.print("   - Penumpang yang memiliki tujuan di halte " + halte[j + 1].getNama() + " : ");
                    penumpang_turun[j + 1] = scanner.nextInt();
                    penumpangnunggu= penumpangnunggu-penumpang_turun[j+1];
                    halte[0].getpenumpangnunggu(penumpangnunggu);
                    bus.penumpangturun(j+1, penumpang_turun[j+1]);
                }
                System.out.println(" - jumlah penumpang: "+bus.penumpangdibus()+" penumpang");
                System.out.println("-> Halte "+halte[i].getNama()+": "+halte[0].penumpangnunggu()+" Penumpang Menunggu");
                System.out.println("----------------------------------------------");
            }
        }
    }
}