import java.math.BigInteger;

public class BigIntegerDemo1 {
    public static void main(String[] args) {
        BigInteger bg1= BigInteger.valueOf(10);
        BigInteger bg2= BigInteger.valueOf(5);
        BigInteger bg3=bg1.add(bg2);
        System.out.println(bg3);

        //除法，获取商和余数
        BigInteger[] arr=bg1.divideAndRemainder(bg2);
        System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        //equals 比较是否相同
        boolean result = bg1.equals(bg2);
        System.out.println(result);

        //次幂
         BigInteger bg4 = bg1.pow(2);
        System.out.println(bg4);

        //max
         BigInteger bg5 = bg1.max(bg2);
        System.out.println(bg5);
        System.out.println(bg5==bg1);//true
        System.out.println(bg5==bg2);//false

        //转换为Int 类型整数，超出范围数据有误
        final BigInteger bg6 = BigInteger.valueOf(2047483673L);
        final int i = bg6.intValue();
        System.out.println(i);

        BigInteger bg7=BigInteger.valueOf(200);
        final double v = bg7.doubleValue();
        System.out.println(v);

    }
}
