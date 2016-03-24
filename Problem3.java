import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        float b = scan.nextFloat();
        float c = scan.nextFloat();

        String aHex = Integer.toHexString(a);
        String aBin = String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');

        System.out.printf("|%-10s|%s|%3$10.2f|%4$-10.3f|", aHex.toUpperCase(), aBin, b, c);
    }
}
