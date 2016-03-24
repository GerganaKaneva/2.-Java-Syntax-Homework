import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        int rectangleArea = a*b;
        System.out.println(rectangleArea);
    }
}
