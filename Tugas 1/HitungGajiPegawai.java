import java.util.Scanner;

public class HitungGajiPegawai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data pegawai halo
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("Alamat: ");
        String alamat = input.nextLine();
        System.out.print("Pengalaman: ");
        String pengalaman = input.nextLine();
        System.out.print("Skill: ");
        String skill = input.nextLine();
        System.out.print("Departemen: ");
        String departemen = input.nextLine();

        input.close();

        // Menghitung gaji pegawai
        int gaji = 0;
        if(pengalaman.equalsIgnoreCase("Pemula")){
            gaji+=500000;
        }else if(pengalaman.equalsIgnoreCase("Menengah")){
            gaji+=1000000;
        }else if(pengalaman.equalsIgnoreCase("expert")){
            gaji+=2000000; 
        }//pengalaman

        if(skill.equalsIgnoreCase("web")){
            gaji+=1000000;
        }else if(skill.equalsIgnoreCase("mobile")){
            gaji+=2000000;
        }else if(skill.equalsIgnoreCase("desktop")){
            gaji+=2500000; 
        }//skill

        if(departemen.equalsIgnoreCase("IT")){
            gaji+=8000000;
        }else if(departemen.equalsIgnoreCase("HRD")){
            gaji+=5000000;
        }else if(departemen.equalsIgnoreCase("Finance")){
            gaji+=4000000; 
        }//departemen

        // Output rincian gaji pegawai
        System.out.println("=====================");
        System.out.println("Rincian Gaji Pegawai");
        System.out.println("=====================");
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Alamat\t\t: " + alamat);
        System.out.println("Departemen\t: " + departemen);
        System.out.println("Pengalaman\t: " + pengalaman);
        System.out.println("Skill\t\t: " + skill);
        System.out.println("Gaji\t\t: Rp " + gaji);
    }
}
