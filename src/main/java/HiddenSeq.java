import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

//https://www.codewars.com/kata/563f0c54a22b9345bf000053/train/java
class HiddenSeq {

    public static BigInteger fcn(int n) {

        if(n == 0) return BigInteger.ONE;
        if(n == 1) return BigInteger.valueOf(2);

        List<BigInteger> seqList = new ArrayList<BigInteger>();
        seqList.add(BigInteger.ONE);
        seqList.add(BigInteger.valueOf(2));
        while(seqList.size() != n){
            int size = seqList.size();
            seqList.add(getNum(seqList.get(size-1), seqList.get(size-2)));
        }
        return seqList.get(seqList.size() - 1);
    }

    public static BigInteger getNum(BigInteger a, BigInteger b){
        return a.multiply(b).multiply(BigInteger.valueOf(6)).divide(a.multiply(BigInteger.valueOf(5)).subtract(b));
    }
}