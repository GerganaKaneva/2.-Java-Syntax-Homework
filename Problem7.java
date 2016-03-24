import java.util.*;

public class Problem7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> numbers = new ArrayList<>();

        if (n > m){
            for (int i = m; i <= n; i++) {
                numbers.add(i);
            }
        }else if (m > n){
            for (int i = n; i <= m; i++) {
                numbers.add(i);
            }
        }else if (n == m){
            System.out.print(n);
        }
        Collections.shuffle(numbers);

        for (Integer item: numbers){
            System.out.print(item + " ");
        }

    }
}
