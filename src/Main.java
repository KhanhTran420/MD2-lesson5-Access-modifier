import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập bán kính: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Diện tích bán kính là: " + circle.getArea());
    }
}
