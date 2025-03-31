import java.math.BigInteger;
import java.util.Random;

public class BigInteger1 {


    public static void main(String[] args) {
//        public BigInteger(int num,Random)   获取随机大整数，范围[0~2的num次方-1]
//        public BigInteger(String val)  获取指定大的整数
//            public BigInteger(String val,int radix)获取指定进制的大整数
//                public static BigInteger valueOf(long val) 静态方法获取BigInteger,内部有优化
//                细节： 对象一旦创建里面的数据不能发生改变

//        1.获取一个随机大的整数
//        Random r=new Random();
//        for (int i = 0; i < 100; i++) {
//            BigInteger bg1 = new BigInteger(4, r);
//            System.out.println(bg1);
//        }
            //2.获取一个指定大的整数
            //细节：字符串中必须是整数，否则会报错
            BigInteger bg2=new BigInteger("99999999999999999999999");
            System.out.println(bg2);

            //3. 获取指定进制大的整数
        //细节：1.字符串中的数字必须是整数
        //2.字符串中的数字必须要跟进制吻合
        //比如二进制中，只能写0,1别的就报错
        BigInteger bg4=new BigInteger("100",10);
        System.out.println(bg4);
        BigInteger bg5=new BigInteger("100",2);//二进制中100转换成十进制
        System.out.println(bg5);

        //静态方法获取BigInteger,内部有优化
        //细节： 能表示的范围比较小，只能在long取值范围之内，如果超出Long的范围就不行了
        //在内部对常用的数字，-16~16进行了优化
        //提前把-16~16先创建好BigInteger的对象，如果多次获取就不会创建新的
        BigInteger Bg6= BigInteger.valueOf(16);
        BigInteger Bg7=BigInteger.valueOf(16);
        System.out.println(Bg7==Bg6); //true 等号两边返回的是地址值
        BigInteger Bg8= BigInteger.valueOf(17);
        BigInteger Bg9=BigInteger.valueOf(17);
        System.out.println(Bg8==Bg9);

        //5.对象一旦创建内部的数据不能发生改变
        BigInteger bg10=BigInteger.valueOf(1);
        BigInteger bg11=BigInteger.valueOf(2);
        BigInteger bg12=BigInteger.valueOf(3);
        BigInteger result=bg10.add(bg11);
        System.out.println(result);
        System.out.println(bg12==result); //产生了新的对象





    }
}
