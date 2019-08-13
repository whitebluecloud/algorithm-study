package codewars;

public class LongestConsec {

    public static String longestConsec(String[] strarr, int k) {

        if(k < 1 || strarr.length < 1 || k > strarr.length) return "";

        int res = 0;
        int idx = 0;
        for(int i=0; i< strarr.length; i++){
            if(i + k <= strarr.length){
                int sum = 0;
                for(int j=0; j<k; j++){
                    sum += strarr[i+j].length();
                }
                if(res < sum){
                    res = sum;
                    idx = i;
                }
            }
        }
        String str = "";
        for(int i=0; i<k; i++){
            System.out.println(idx);
            str += strarr[i+idx];
        }
        return str;
    }
}
