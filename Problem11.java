import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        Pattern extractWords = Pattern.compile("\\b([A-Z])[A-Za-z]*([A-Z])\\b");
        Matcher matcher = extractWords.matcher(words);

        while (matcher.find()){
            System.out.print(matcher.group() + " ");
        }
    }
}
