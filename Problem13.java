import java.lang.reflect.Array;
import java.util.*;

public class Problem13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] numbers = sc.nextLine().split(" ");
        String[] oddOrEven = sc.nextLine().split(" ");

        List<Integer> myList = new ArrayList<Integer>();
        for(String num : numbers){
            myList.add(Integer.parseInt(num));
        }

        for (int i = 0; i < oddOrEven.length; i++) {
            if (oddOrEven[i].equals("odd")){
                getOddElements(myList);
            }else if (oddOrEven[i].equals("even")){
                getEvenElements(myList);
            }
        }
    }

    public static  void getEvenElements (List<Integer>  input){

        for (int i = 0; i < input.size(); i++) {
            if (input.get(i) % 2 != 0) {
                input.remove(i);
                }
        }
        for (Integer s : input) {
            System.out.print(s + " ");
        }
    }

    public static  void getOddElements (List<Integer> input){

        for (int i = 0; i < input.size(); i++) {
            if (input.get(i) % 2 == 0) {
                input.remove(i);
            }
        }
        for (Integer s : input) {
            System.out.print(s + " ");
        }
    }
}
