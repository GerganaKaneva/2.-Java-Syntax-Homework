import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        if (target != 0) {
            for (int i = 1; i <= 19; i++) {
                for (int j = i + 1; j <= 20; j++) {

                    if (i + j == target) {
                        System.out.printf("%1$d + %2$d = %3$d\n", i, j, target);
                        System.out.printf("%2$d + %1$d = %3$d\n", i, j, target);
                    }
                }
            }
            for (int i = 1; i <= 19; i++) {
                for (int j = i + 1; j <= 20; j++) {

                    if (j - i == target) {
                        System.out.printf("%1$d - %2$d = %3$d\n", j, i, target);
                    }
                }
            }
        } else {
            for (int i = 1; i <= 20; i++) {
                for (int j = 1; j <= 20; j++) {

                    if (i + j == target) {
                        System.out.printf("%1$d + %2$d = %3$d\n", i, j, target);
                        System.out.printf("%2$d + %1$d = %3$d\n", i, j, target);
                    }
                }
            }
            for (int i = 1; i <= 20; i++) {
                for (int j = 1; j <= 20; j++) {

                    if (j - i == target) {
                        System.out.printf("%1$d - %2$d = %3$d\n", j, i, target);
                    }
                }
            }

        }
    }
}
