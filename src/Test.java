import java.util.InputMismatchException;

public class Test {
    public static void main(String[] args) {

        userScan.printInfo();
        boolean error = true;

        do {
            try {
                switch (userScan.userChoice()) {
                    case Shape.RECTANGLE:
                        System.out.println(userScan.createRectangle().toString());
                        error = false;
                        break;
                    case Shape.TRIANGLE:
                        System.out.println(userScan.createTriangle().toString());
                        error = false;
                        break;
                    case Shape.CIRCLE:
                        System.out.println(userScan.createCircle().toString());
                        error = false;
                        break;
                    default:
                        throw new NoSuchFigure("Nie ma takiego kształtu");
                }

            } catch (InputMismatchException | NoSuchFigure ex) {
                System.err.println("Błąd");
                System.err.println(ex.getMessage());
            }
        } while (error);
    }
}