public class Bola{
    public double radius_bola, volume;

    public Bola(){
        this.radius_bola = 0;
        this.volume = 0;
    }

    public Bola(double radius_bola){
        this.radius_bola = radius_bola;
    }

    public void SetRadius(double radius_bola){
        this.radius_bola = radius_bola;
    }

    public void ComputeAndSetVolume(){
        this.volume = (4.0/3.0) * Math.PI * Math.pow(radius_bola, 3);
    }

    public void GetVolume(){
        System.out.println("Bola dengan jari-jari " + this.radius_bola + " mempunyai volume " + this.volume);
    }
}