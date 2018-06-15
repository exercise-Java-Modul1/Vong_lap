import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Nhập số bạn muốn kiểm tra: ");
            int number = sc.nextInt();
            if (number <= 0) {
                System.out.println(number + " Không phải là số nguyên tố.");
            } else {
                int bien_tang = 1;
                for (int i = number - 1; i > 1; i--) {

                    if (number % i == 0) {
                        bien_tang++;
                    } else {
                        bien_tang = bien_tang;
                    }
                }
                if (bien_tang != 1) {
                    System.out.println(number + " Không phải là số nguyên tố.");
                } else {
                    System.out.println(number + " Là số nguyên tố.");
                }
            }
            System.out.println();
            System.out.println("-------------------------------------------------------------");
            System.out.println();
        }
    }
}
