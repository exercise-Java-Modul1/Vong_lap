import java.util.Scanner;

public class DesignMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("menu:");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        while (true) {
            System.out.print("Your choise: ");
            int choise = input.nextInt();

            switch (choise) {
                case 1:
                    System.out.println("1. Draw the triangle");
                    break;
                case 2:
                    System.out.println("2. Draw the square");
                    break;
                case 3:
                    System.out.println("3. Draw the rectangle");
                    break;
                case 0:
                    System.out.println("0. Exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("No result");
                    System.exit(0);
            }
            System.out.println("--------------------------------------------------------");
        }
    }
}
