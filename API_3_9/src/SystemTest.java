public class SystemTest {
    public static void main(String[] args) {
        //目标：了解下System 类的常见方法
        //1. public static void exit(int status)
        //终止当前运行的java虚拟机
//        System.exit(0);  人为的终止虚拟机。（不要使用）

        //2. public static long currentTimeMills();
        //获取当前系统时间
        //   返回的是long 类型的时间毫秒值：指的是1970-1-1 0:0:0开始走到此刻的总毫秒值，1s=1000ms

        long time=System.currentTimeMillis();
        System.out.println(time);
        for(int i=0;i<1000000;i++){
            System.out.println("输出了 ,"+i);

        }

        long time2=System.currentTimeMillis();
        System.out.println((time2-time)/1000.0+"s");
    }
}
