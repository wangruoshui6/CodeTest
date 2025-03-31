import java.util.Scanner;


public class YouQiMianJI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        boolean [][]a=new boolean[10001][10001];
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int x2=sc.nextInt();
            int y2=sc.nextInt();
            if(x1>x2){
                int temp=x1;x1=x2;x2=temp;
            }
            if(y1>y2){
                int temp=y1;y1=y2;y2=temp;
            }
            for(int j=x1;j<x2;j++){
                for(int k=y1;k<y2;k++){
                    if (!a[j][k]) {
                        a[j][k]=true;
                        sum++;
                    }


                }
            }
        }
        System.out.println(sum);


    }
}
