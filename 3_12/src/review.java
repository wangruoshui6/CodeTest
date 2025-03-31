import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class review {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        BigDecimal d=sc.nextBigDecimal();
        BigDecimal m=new BigDecimal(2);
        System.out.println(m.pow(n).multiply(d).setScale(0, RoundingMode.HALF_UP));
    }
}
