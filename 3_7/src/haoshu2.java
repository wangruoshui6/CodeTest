import java.util.Scanner;

public class haoshu2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (; n > 0; n--) {
            int m = n;
            while (m > 0) {
                if (m % 2 != 0) {
                    m = m / 10;
                }else {
                    break;
                }
                if (m == 0) {
                    break;
                }
                if (m % 2 == 0) {
                    m = m / 10;
                }
                else {
                    break;
                }

            }
            if (m == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}



