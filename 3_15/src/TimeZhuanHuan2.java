import java.math.BigInteger;
import java.util.Scanner;

public class TimeZhuanHuan2 {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        long  n=sc.nextInt();
//        long  h=n/1000/3600%24;
//        long  m=n/1000/60%60;
//        long  s=n/1000%60;
//        System.out.printf("%02d:%02d:%02d",h,m,s);
//    }

        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        BigInteger bg1=new BigInteger(str);
        BigInteger thousands=new BigInteger("1000");
        BigInteger ThreeThousands=new BigInteger("3600");
        BigInteger hours=new BigInteger("24");
        BigInteger minutes=new BigInteger("60");
        BigInteger h=bg1.divide(thousands).divide(ThreeThousands).mod(hours);
        BigInteger m=bg1.divide(thousands).divide(minutes).mod(minutes);
        BigInteger s=bg1.divide(thousands).mod(minutes);
        System.out.printf("%02d:%02d:%02d",h,m,s);


    }
}


