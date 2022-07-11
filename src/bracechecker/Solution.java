package bracechecker;
import java.util.regex.Pattern;
public class Solution {
    public static boolean validParentheses(String parens) {
//        parens = parens.replaceFirst("\\(.*\\)","");
//        return !Pattern.compile("\\(|\\)").matcher(parens).find();
        int n = 0;
        for (int i = 0; i < parens.length(); i++) {
            if (parens.charAt(i) == '(')  n++;
            else if (parens.charAt(i) == ')') n--;
            if (n < 0) break;
        }
        return n == 0;
    }

    public static void main(String[] args) {
        System.out.println(Solution.validParentheses(")(()))"));
    }

}
