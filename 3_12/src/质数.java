public class 质数 {
    public static void main(String[] args) {
        System.out.println(isprime(1000));
        System.out.println(isprime2(997));

    }
    public static boolean isprime(int n){
        for (int i =2; i < n; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean isprime2(int num){
        int count=0;
        //极大优化了算法
        for (int i =2; i <Math.sqrt(num); i++) {
            count++;
            if(num%i==0){
                return false;
            }
        }
        System.out.println(count);
        return true;
    }

}
