public class Tabung {
    public double radius, tinggitab, volume;

    public Tabung(){
        this.radius = 0;
        this.tinggitab = 0;
        this.volume = 0;
    }

    public Tabung(double radius, double tinggi){
        this.radius = radius;
        this.tinggitab = tinggi;
        this.ComputeAndSetVolume();
    }

    public void SetRadius (double radius){
        this.radius = radius;
    }

    public void SeTinggi( double tinggi){
        this.tinggitab = tinggi;
    }

    public void ComputeAndSetVolume(){
        this.volume = Math.PI * this.radius * this.radius * this.tinggitab;
    }

    public void GetVolume(){
        System.out.println("Tabung dengan radius " + this.radius + ", tinggi " + this.tinggitab + " memiliki volume: " + this.volume);
    }
}
