import java.io.PrintStream;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double average = calculateAvg(a,b,c);

        double f1 = calculateF1(a, b, c);
        double f2 = calculateF2(a, b, c);
        double averageF1F2 = calculateAvg(f1, f2);

        double diff = Math.abs(average - averageF1F2);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", f1,f2, diff);
    }
    public static double calculateAvg (double a, double b, double c){

        double average = (a+b+c)/3;
        return average;
            }
    public static double calculateAvg (double f1, double f2){

        double averageF1F2 = (f1+f2)/2;
        return averageF1F2;
    }
    public static double calculateF1 (double a, double b, double c){

        double f1 =  Math.pow(((Math.pow(a,2) + Math.pow(b,2))/(Math.pow(a,2) - Math.pow(b,2))),
                (a+b+c)/Math.sqrt(c));
        return  f1;
    }
        public static double calculateF2 (double a, double b, double c){

        double f2 = Math.pow((Math.pow(a,2) + Math.pow(b,2)- Math.pow(c,3)), (a - b));
        return f2;
    }
}
