import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Accumul {

    public static String accum(String s) {
        System.out.println(s);
        return "";
    }

    public static String accum2(String s) {
        List<String> res = new ArrayList<String>();
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            sb.append(Character.toUpperCase(s.charAt(i)));
            for(int j=0; j< cnt; j++) {
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
            res.add(sb.toString());
            cnt += 1;
            sb = new StringBuilder();
        }
        return String.join("-", res);
    }
}