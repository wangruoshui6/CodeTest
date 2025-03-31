import java.math.BigInteger;

public class JieChengQiuHe2 {


        public static void main(String[] args) {
            BigInteger sum = BigInteger.ZERO;
            BigInteger factorial = BigInteger.ONE;
            long n = 202320232023L;
            for (long i = 1; i <= n; i++) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
                sum = sum.add(factorial);
            }
            System.out.println(sum);
        }
    }

