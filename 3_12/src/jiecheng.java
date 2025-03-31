import java.math.BigInteger;
import java.util.Scanner;

public class jiecheng {
    public static void main(String[] args) {
        System.out.println("请输入n，计算n的阶乘");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        BigInteger result=BigInteger.ONE;
        for (int i = 1; i <=n ; i++) {
            //在阶乘计算中，循环变量 i 是 int 类型，BigInteger.valueOf(i) 的作用是将 i 转换为 BigInteger 对象，
            // 这样就可以和 result 这个 BigInteger 对象进行数学运算了。
            // 因为 BigInteger 类的方法只能处理 BigInteger 类型的参数，所以需要先将 i 转换为 BigInteger 类型。
            result=result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result);



    }
}
