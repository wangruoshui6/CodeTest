import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {

        int count=0;
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for (int i = 1; i<=N/3 ; i++) {
            for(int j=i;j<=N/2;j++){
                for(int k=j;k<=N;k++){
                    if(i*j*k>N){
                        break;
                    }
                    if(i*j*k<=N){
                        count++;
                    }

                }
            }
        }
        System.out.println(count);
    }
}
