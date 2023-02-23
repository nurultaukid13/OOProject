public class Circle {
    public double radius;

    public double luas() {
        double luas;
        luas = Math.PI * Math.pow(this.radius, 2);
        return luas;
    }

    public double keliling() {
        double keliling;
        keliling = 2 * Math.PI * this.radius;
        return keliling;
    }

    public void printInfo() {
        System.out.println("=================");
        System.out.println("Lingkaran");
        System.out.println("=================");
        System.out.printf("Luas= %.3f \n",luas());
        System.out.printf("Keliling= %.3f \n\n",keliling());
    }
}
