public class Text {
    public static void main(String[] args) {
        int flag = 0;
        int count = 0;
        for (int year = 1921; year <= 2021; year++) {
            for (int month = 1; month <= 12; month++) {
                int daytime;

                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                    daytime = 31;
                } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                    daytime = 30;

                } else {
                    if ((year % 4) == 0 && (year % 100 != 0) || (year % 400 == 0)) {
                        daytime = 29;
                    } else daytime = 28;
                }
                for (int day = 1; day <= daytime; day++) {
                    if (year == 1921 && month == 7 && day == 23) {

                        flag = 1;
                    }
                    if (flag == 1) {
                        count++;
                        if (year == 2020 && month == 7 && day == 1) {
                            System.out.println((count-1)*60*24);

                        }

                    }
                }
            }
        }
    }
}

