package squarenumber;

public class Square {
    public static boolean isSquare(int n) {
        int s = (int) Math.sqrt(n);
        return  (s * s == n);
    }

    public static void main(String[] args) {

    }
}
