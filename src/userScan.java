import java.util.Scanner;

public class userScan {

    public static void printInfo() {
        System.out.println("Wybierz figurę, którą chcesz obliczyć.\nDostępne figury:\n1.Prostokąt.\n2.Trójkąt.\n3.Koło.");
    }

    public static int userChoice() {
        Scanner s = new Scanner(System.in);
        int userChoice = s.nextInt();
        return userChoice;
    }

    public static Rectangle createRectangle() {
        Scanner s = new Scanner(System.in);
        System.out.println("Wprowadź bok a:");
        double userA = s.nextDouble();
        System.out.println("Wprowadź bok b:");
        double userB = s.nextDouble();
        Rectangle rectangle = new Rectangle(userA, userB);
        return rectangle;
    }

    public static Triangle createTriangle() {
        Scanner s = new Scanner(System.in);
        System.out.println("Wprowadź bok a:");
        double userA = s.nextDouble();
        System.out.println("Wprowadź bok b:");
        double userB = s.nextDouble();
        System.out.println("Wprowadź bok c:");
        double userC = s.nextDouble();
        System.out.println("Wprowadź wysokość h:");
        double userH = s.nextDouble();
        Triangle triangle = new Triangle(userA, userB, userC, userH);
        return triangle;
    }

    public static Circle createCircle() {
        Scanner s = new Scanner(System.in);
        System.out.println("Wprowadź promień r:");
        double userR = s.nextDouble();
        Circle circle = new Circle(userR);
        return circle;
    }
}