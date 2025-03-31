public class qiuhe {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 10000; i++) {
            int dig = (int) (Math.log10(i) + 1);
            int powerofTen = (int) Math.pow(10, dig);
            if (i * i * i % powerofTen == i) {
                count++;
            }
        }
        System.out.println(count);
    }
}