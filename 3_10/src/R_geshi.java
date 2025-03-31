import java.math.BigDecimal;
import java.util.Scanner;

public class R_geshi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        BigDecimal d=sc.nextBigDecimal();
        BigDecimal m=new BigDecimal(2);
        System.out.println(m.pow(n).multiply(d).setScale(0,BigDecimal.ROUND_HALF_UP));

    }
}
