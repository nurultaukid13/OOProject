public class Balok implements Bangun{
    public double panjang, lebar, tinggi, volume;

    public Balok(){
        this.panjang = 0;
        this.lebar = 0;
        this.tinggi = 0;
        this.volume = 0;
    }

    public Balok(double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.ComputeAndSetVolume();
    }

    public void SetPanjang( double panjang){
        this.panjang = panjang;
    }

    public void SetLebar( double lebar){
        this.lebar = lebar;
    }

    public void SeTinggi( double tinggi){
        this.tinggi = tinggi;
    }

    public double ComputeAndSetVolume(){
        this.volume = this.panjang * this.lebar * this.tinggi;
        return this.volume;
    }

    public void GetVolume(){
        System.out.println("Balok dengan panjang " + this.panjang + ", lebar " + this.lebar +", tinggi " + this.tinggi + " memiliki volume: " + this.volume);
    }
}
