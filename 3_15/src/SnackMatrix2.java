
import java.util.Scanner;

public class SnackMatrix2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] a = new int[m][n];

        // 初始化起始位置，1在右上角
        int x = 0;
        int y = n - 1;
        a[x][y] = 1;
        int tot = 1;

        // 顺时针填写数字，直到填满整个矩阵
        while (tot < m * n) {
            // 右方一列从上到下
            while (x + 1 < m && a[x + 1][y] == 0) {
                a[++x][y] = ++tot;
            }
            // 下方一行从右到左
            while (y - 1 >= 0 && a[x][y - 1] == 0) {
                a[x][--y] = ++tot;
            }
            // 左方一列从下到上
            while (x - 1 >= 0 && a[x - 1][y] == 0) {
                a[--x][y] = ++tot;
            }

            // 上方一行从左到右
            while (y + 1 < n && a[x][y + 1] == 0) {
                a[x][++y] = ++tot;
            }
        }

        // 输出矩阵
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%5d", a[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
