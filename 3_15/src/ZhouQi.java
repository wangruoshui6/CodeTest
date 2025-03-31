import java.math.BigInteger;

public class ZhouQi {
    public static void main(String[] args) {
        BigInteger bg1=new BigInteger("17");
        BigInteger bg2=bg1.pow(22);
        BigInteger bg3=new BigInteger("7");
        BigInteger bg4=bg2.mod(bg3);
        System.out.println(bg4);
        System.out.println(bg1.isProbablePrime(50));
        System.out.println(bg1.remainder(bg2));


    }
}
