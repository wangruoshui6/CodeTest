public class JieChengQiuHe3 {
    public static void main(String[] args) {
        long fac=1,sum=0;
        for(int i=1;i<40;i++){
            fac=fac*i%1000000000;
            sum=(sum+fac)%1000000000;
        }
        System.out.println(sum);
    }
}
