import java.util.Scanner;

public class R {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float d=sc.nextFloat();
        long time=System.currentTimeMillis();
        System.out.println(Math.round(d*Math.pow(2,n)));
        long time2=System.currentTimeMillis();
        System.out.println(time2-time);
    }
}
