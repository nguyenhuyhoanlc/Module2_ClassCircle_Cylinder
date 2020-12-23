import ClassCircle.Circle.Circle;
import ClassCircle.Cylinder.Cylinder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập bán kính: ");
        double r = scanner.nextDouble();
        System.out.print("Nhập đường kính: ");
        double d = scanner.nextDouble();

        System.out.println("Hình tròn");
        Circle circle = new Circle(r, d);
        System.out.println("Diện tích hình tròn là: ");
        System.out.println(circle.getS());
        System.out.println("Hoặc ( tính theo đường kính): ");
        System.out.println(circle.getA());

        System.out.println("\n");
        System.out.println("Hình trụ");
        System.out.print("Nhập chiều cao: ");
        double h = scanner.nextDouble();
        Cylinder cylinder = new Cylinder(r, d, h);
        System.out.println(cylinder.toString());
        System.out.println("Diện tích hình trụ là: ");
        System.out.println(cylinder.getS());

    }
}
