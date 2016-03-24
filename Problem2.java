import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int aX = scan.nextInt();
        int aY = scan.nextInt();
        int bX = scan.nextInt();
        int bY = scan.nextInt();
        int cX = scan.nextInt();
        int cY = scan.nextInt();

        int triangleArea = Math.abs(((aX*(bY - cY)+ bX*(cY - aY)+cX*(aY-bY))/2));

        if (triangleArea == 0){
            System.out.println("0");
         } else {
            System.out.println(triangleArea);
        }
    }
}
