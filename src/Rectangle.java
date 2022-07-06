import java.util.Scanner;

public class Rectangle {
    Double width;
    Double height;

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double width= scanner.nextInt();
        double height= scanner.nextDouble();
        Rectangle rectangle= new Rectangle(width,height);
        System.out.println(rectangle.toString());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

    }
    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Rectangle{" +
                "width=" + this.width +
                ", height=" + this.height +
                '}';
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return (width + height)*2;
    }


}
