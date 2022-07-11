package bracechecker;

import java.util.regex.Pattern;

public class BraceChecker {
    public static boolean isValid(String braces) {
        do
            braces = braces.replaceAll("\\{\\}|\\[\\]|\\(\\)","");
        while (Pattern.compile("\\(\\)|\\[]|\\{}").matcher(braces).find());
        return braces.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(BraceChecker.isValid("[({})](]"));
    }
}
