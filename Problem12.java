import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] text = sc.nextLine().split(" ");
        String str1 = text[0];
        String str2 = text[1];
        int sum = 0;

        if (str1.length() > str2.length()){

            for (int i = 0; i < str2.length() ; i++) {
                char one = str1.charAt(i);
                char two = str2.charAt(i);
                int codeOne = one;
                int codeTwo = two;

                sum += codeOne * codeTwo;
            }
            for (int j = str2.length(); j < str1.length() ; j++) {
                char one = str1.charAt(j);
                int codeOne = one;

                sum += codeOne;
            }
        }else  if (str2.length() > str1.length()) {

            for (int i = 0; i < str1.length(); i++) {
                char one = str1.charAt(i);
                char two = str2.charAt(i);
                int codeOne = one;
                int codeTwo = two;

                sum += codeOne * codeTwo;
            }
            for (int j = str1.length(); j < str2.length(); j++) {
                char two = str2.charAt(j);
                int codeTwo = two;

                sum += codeTwo;
            }
        }else {

            for (int i = 0; i < str1.length(); i++) {
                char one = str1.charAt(i);
                char two = str2.charAt(i);
                int codeOne = one;
                int codeTwo = two;

                sum += codeOne * codeTwo;
            }
        }

        System.out.print(sum);
    }
}
