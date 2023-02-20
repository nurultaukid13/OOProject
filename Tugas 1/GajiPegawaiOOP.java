import java.util.Scanner;

public class GajiPegawaiOOP {
    private String nama;
    private String alamat;
    private String pengalaman;
    private String skill;
    private String departemen;
    private int gaji;

    public GajiPegawaiOOP(String nama, String alamat, String pengalaman, String skill, String departemen) {
        this.nama = nama;
        this.alamat = alamat;
        this.pengalaman = pengalaman;
        this.skill = skill;
        this.departemen = departemen;
        this.gaji = hitungGaji();
    }

    public int hitungGaji() {
        int gaji = 0;
        if(pengalaman.equalsIgnoreCase("Pemula")){
            gaji+=500000;
        }else if(pengalaman.equalsIgnoreCase("Menengah")){
            gaji+=1000000;
        }else if(pengalaman.equalsIgnoreCase("expert")){
            gaji+=2000000; 
        }

        if(skill.equalsIgnoreCase("web")){
            gaji+=1000000;
        }else if(skill.equalsIgnoreCase("mobile")){
            gaji+=2000000;
        }else if(skill.equalsIgnoreCase("desktop")){
            gaji+=2500000; 
        }

        if(departemen.equalsIgnoreCase("IT")){
            gaji+=8000000;
        }else if(departemen.equalsIgnoreCase("HRD")){
            gaji+=5000000;
        }else if(departemen.equalsIgnoreCase("Finance")){
            gaji+=4000000; 
        }
        return gaji;
    }

    public void printInfo() {
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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data pegawai
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

        GajiPegawaiOOP pegawai = new GajiPegawaiOOP(nama, alamat, pengalaman, skill, departemen);
        pegawai.printInfo();

        input.close();
    }
}
