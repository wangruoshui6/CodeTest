public class SnackMatrix {

        public static void main(String[] args) {
            int n = 20;
            // 计算斜行序号，从1开始计数，第n行第n列在第2 * n - 1斜行
            int diagonal = 2 * n - 1;
            // 计算前diagonal - 1斜行的数字总数
            int totalBefore = (1 + diagonal - 1) * (diagonal - 1) / 2;
            int num;
            if (diagonal % 2 == 1) {
                // 如果是奇数斜行，数字从下往上递增
                num = totalBefore + n;
            } else {
                // 如果是偶数斜行，数字从上往下递增
                num = totalBefore + diagonal - n + 1;
            }
            System.out.println(num);
        }
    }
