import java.util.Scanner;

public class SnackMatrixText {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int x=0;
        int y=n-1;//1在右上角
        int [][]a=new int[m][n];
        int toc=1;
        a[x][y]=1;
        while (toc<m*n){
            while(x+1<m&&a[x+1][y]==0){
                a[++x][y]=++toc;
            }
            while(y-1>=0&&a[x][y-1]==0){
                a[x][--y]=++toc;

            }
            while (x-1>=0&&a[x-1][y]==0){
                a[--x][y]=++toc;
            }
            while (y+1<n&&a[x][y+1]==0){
                a[x][++y]=++toc;
            }
        }
        for (int i = 0; i < m; i++) {
            for(int j=0;j<n;j++){
                System.out.printf("%5d",a[i][j]);
            }
            System.out.println();

        }
    }
}
