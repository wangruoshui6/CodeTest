import java.math.BigInteger;

public class JieChengQiuHe {
    public static void main(String[] args) {

        BigInteger bg1=BigInteger.ZERO;
        BigInteger bg2=BigInteger.ONE;

        long n=40L;
        for(long i=1;i<=n;i++){
            bg2=bg2.multiply(BigInteger.valueOf(i));

        }

        System.out.println(bg2);
    }
}
