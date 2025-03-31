public class MathTest {
    public static void main(String[] args) {
        //abs  取绝对值
        System.out.println(Math.abs(-10));

        //ceil 向上取整
        System.out.println(Math.ceil(5.01));

        //floor 向下取整
        System.out.println(Math.floor(4.9));

        //max,min
        System.out.println(Math.max(5, 10));
        System.out.println(Math.min(6, 10));

        //取次方pow
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.pow(3, 2));

        //取随机数random()  [0,1)

        System.out.println(Math.random());

        //sqrt 开根号
        System.out.println(Math.sqrt(4));
        //开立方
        System.out.println(Math.cbrt(8));
    }
}
