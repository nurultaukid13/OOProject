public class Kubus{
    public double sisi, volume;

    public Kubus(){
        this.sisi = 0;
        this.volume = 0;
    }

    public Kubus(double sisi){
        this.sisi = sisi;
        this.ComputeAndSetVolume();
    }

    public void Getsisi(double sisiBaru){
        this.sisi = sisiBaru;
    }

    public void ComputeAndSetVolume(){
        this.volume = Math.pow(this.sisi, 3);
    }

    public void GetVolume(){
        System.out.println("Kubus dengan sisi " + this.sisi + " memiliki volume: " + this.volume );
    }
}