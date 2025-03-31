import java.util.Scanner;

public class TimeZhuanHuan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       long  n=sc.nextInt();
        long  h=n/1000/3600%24;
        long  m=n/1000/60%60;
        long  s=n/1000%60;
        System.out.printf("%02d:%02d:%02d",h,m,s);
    }

}
