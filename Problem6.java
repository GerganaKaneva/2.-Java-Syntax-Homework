import java.util.*;

public class Problem6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String baseSevenNum = scan.next();
        System.out.print(Integer.toString(Integer.parseInt(baseSevenNum, 7), 10));
    }
}