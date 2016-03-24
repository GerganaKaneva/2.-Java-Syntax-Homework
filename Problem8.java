import java.util.Scanner;

public class Problem8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] numbers = sc.nextLine().split(" ");

        if (numbers.length % 2 != 0){

            System.out.println("Invalid length");

        } else {
            for (int i = 0, p = 1; i < numbers.length - 1; i+= 2 , p += 2) {

                if(Integer.parseInt(numbers[i]) % 2 == 0 && Integer.parseInt(numbers[p]) % 2 == 0){

                    System.out.printf("%s, %s -> both are even", numbers[i], numbers[p]);

                } else if(Integer.parseInt(numbers[i]) % 2 != 0 && Integer.parseInt(numbers[p]) % 2 != 0){

                    System.out.printf("%s, %s -> both are odd\n", numbers[i], numbers[p]);

                } else{

                    System.out.printf("%s, %s -> different\n", numbers[i], numbers[p]);
                }
            }
        }
    }
}
