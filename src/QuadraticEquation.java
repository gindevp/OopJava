import java.util.Scanner;

public class QuadraticEquation {
    private double a,b,c;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap a:");
        double a= scanner.nextDouble();
        System.out.println("nhap b:");
        double b= scanner.nextDouble();
        System.out.println("nhap c:");
        double c= scanner.nextDouble();
        QuadraticEquation quadraticEquation= new QuadraticEquation(a,b,c);
        double delta= quadraticEquation.getDiscriminant();
        if(delta>0){
            System.out.println("pt 2 nhgiem");
        }else if (delta==0){
            System.out.println("pt 1 nghiem");

        }else{
            System.out.println("The equation has no roots");
        }

    }
    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant(){
        return b*b-4*a*c;
    }
}
