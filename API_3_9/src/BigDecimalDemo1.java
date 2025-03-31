import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo1 {
    public BigDecimalDemo1(String string) {
    }

    public static void main(String[] args) {
        //精度问题  如0.1+0.2

        System.out.println(0.1+0.2);

        //BigDecimal 用来精度计算
        //1. 把他们变成字符串封装成BigDecimal对象来运算
        double a=0.1,b=0.2;

//        BigDecimal a1=new BigDecimal(Double.toString(a));
//        BigDecimal b1=new BigDecimal(Double.toString(b));
//        BigDecimal c1=a1.add(b1);
//        System.out.println(c1);

        BigDecimal a1=BigDecimal.valueOf(a); //放到数组中，0.1，存放三个位置
        BigDecimal b1=BigDecimal.valueOf(b);
//        System.out.println(a1.add(b1));

//        BigDecimal c1=a1.add(b1); //加法
//        BigDecimal d1=a1.subtract(b1);//减法
//        BigDecimal e1=a1.multiply(b1);//乘法
        BigDecimal f1=a1.divide(b1);//除法
        System.out.println(f1);

        BigDecimal i=BigDecimal.valueOf(0.1);
        BigDecimal j=BigDecimal.valueOf(0.3);
        //因为BigDecimal需要精度，但是0.1/0.3不行，所以要换种方法
        BigDecimal k=i.divide(j,2, RoundingMode.HALF_UP);
        System.out.println(k);

         //把BigDecimal对象转换成double类型的数据
        double rs=k.doubleValue();
        System.out.println(rs);


    }
}
