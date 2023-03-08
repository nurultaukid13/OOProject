public class kubus {
    public int sisi, volume;

    public kubus(int sisi){
        this.sisi = sisi;
    }

    public void setsisi(int sisiBaru) {
        this.sisi = sisiBaru;
    }

    public void ComputeAndSetVolume() {
        int calculate_vol = this.sisi*this.sisi*this.sisi*this.sisi;
        this.volume = calculate_vol;
    }

    public int GetVolume(){
        return this.volume;
    }
}