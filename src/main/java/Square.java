import java.lang.Math;
public class Square {
    public static boolean isSquare(int n) {
        if(n==0) return true;
        return ((int)(n / Math.sqrt(n)) == Math.sqrt(n)) ? true : false;
    }
}