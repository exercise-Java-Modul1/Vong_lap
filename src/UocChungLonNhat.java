import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true){
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
            if (a > b) {
                int ucln;
                for (int i = b; i > 0; i--) {
                    if (a % i == 0 && b % i == 0 && i != 1) {
                        ucln = i;
                        System.out.println("Ước chung lớn nhất của hai số " + a + " và " + b + " là: " + ucln);
                        break;
                    } else if (a % i == 0 && b % i == 0 && i == 1) {
                        System.out.println("Hai số " + a + " và " +b + " Không có ước chung");
                        break;
                    }
                }
            } else {
                int ucln;
                for (int i = a; i > 0; i--) {
                    if (a % i == 0 && b % i == 0 & i != 1) {
                        ucln = i;
                        System.out.println("Ước chung lớn nhất của hai số " + a + " và " + b + " là: " + ucln);
                        break;
                    }else if (a % i == 0 && b % i == 0 && i == 1) {
                        System.out.println("Hai số " + a + " và " +b + " Không có ước chung");
                        break;
                    }

                }
            }
            System.out.println("----------------------------------------------------------------------------");
        }
    }
}
