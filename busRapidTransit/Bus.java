public class Bus {
    public int penumpang;
    public int[] penumpang_turun = new int[4];

    public Bus(int jumlah_penumpang) {
        this.penumpang = jumlah_penumpang;
    }

    public int penumpangdibus() {
        return this.penumpang;
    }

    public void gtpenumpangdibus(int jumpenumpang2) {
        this.penumpang = jumpenumpang2;
    }

    public void penumpangturun(int index, int penumpangturunn) {
        this.penumpang_turun[index] = penumpangturunn;
    }

    public void getpenumpangturun(int index){
        this.penumpang = this.penumpang - tampilpenumpangturun(index);
    }

    public void penumpangnaik(int penumpangnaik) {
        this.penumpang = this.penumpang + penumpangnaik;
    }

    public int tampilpenumpangturun(int index) {
        return this.penumpang_turun[index];
    }

}