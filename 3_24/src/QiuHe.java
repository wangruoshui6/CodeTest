import java.util.Scanner;

public class QiuHe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int []a=new int[(int) (n+1)];
        for(int i=1;i<=n;i++){
            a[i]=sc.nextInt();
        }
        long sum=0;
        for(int i=1;i<n;i++){
            for(int j=i+1;j<=n;j++){
                sum+=a[i]*a[j];
            }
        }
        System.out.println(sum);

    }
}
