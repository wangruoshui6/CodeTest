import java.util.Scanner;

public class baoshi {


    // 计算最大公约数
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 计算最小公倍数
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    // 计算三个数的最小公倍数
    public static int lcm(int a, int b, int c) {
        return lcm(a, lcm(b, c));
    }

    // 计算精美程度
    public static double calculateS(int a, int b, int c) {
        int numerator = a * b * c * lcm(a, b, c);
        int denominator = lcm(a, b) * lcm(a, c) * lcm(b, c);
        return (double) numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] gems = new int[n];
        for (int i = 0; i < n; i++) {
            gems[i] = scanner.nextInt();
        }

        double maxS = 0;
        int gem1 = 0, gem2 = 0, gem3 = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    double s = calculateS(gems[i], gems[j], gems[k]);
                    if (s > maxS) {
                        maxS = s;
                        gem1 = gems[i];
                        gem2 = gems[j];
                        gem3 = gems[k];
                    } else if (s == maxS) {
                        int[] current = new int[]{gems[i], gems[j], gems[k]};
                        int[] best = new int[]{gem1, gem2, gem3};
                        java.util.Arrays.sort(current);
                        java.util.Arrays.sort(best);
                        if (isLexicographicallySmaller(current, best)) {
                            gem1 = gems[i];
                            gem2 = gems[j];
                            gem3 = gems[k];
                        }
                    }
                }
            }
        }

        // 按升序输出
        int[] result = new int[]{gem1, gem2, gem3};
        java.util.Arrays.sort(result);
        for (int r : result) {
            System.out.print(r + " ");
        }

        scanner.close();
    }

    // 判断current是否字典序小于best
    public static boolean isLexicographicallySmaller(int[] current, int[] best) {
        for (int i = 0; i < current.length; i++) {
            if (current[i] < best[i]) {
                return true;
            } else if (current[i] > best[i]) {
                return false;
            }
        }
        return false;
    }
}

