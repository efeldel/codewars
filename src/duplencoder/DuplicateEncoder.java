package duplencoder;

public class DuplicateEncoder {
    static String encode(String word){
        StringBuilder sb = new StringBuilder();
        char[] letters = word.toLowerCase().toCharArray();
        for (Character c : letters) {
            if (word.toLowerCase().lastIndexOf(c) > word.toLowerCase().indexOf(c))
                sb.append(")");
            else
                sb.append("(");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(encode("Success"));
    }
}

