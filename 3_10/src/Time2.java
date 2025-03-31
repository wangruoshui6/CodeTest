public class Time2 {

    public static void main(String[] args) {
        int t = 0, flag = 0;
        for (int year = 2014; year <= 2025; year++) {
            for (int month = 1; month <= 12; month++) {
                int daysInMonth;
                // 判断每个月的天数
                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                    daysInMonth = 31;
                } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                    daysInMonth = 30;
                } else { // 2 月
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        daysInMonth = 29; // 闰年 2 月有 29 天
                    } else {
                        daysInMonth = 28; // 平年 2 月有 28 天
                    }
                }
                // 遍历该月的每一天
                for (int day = 1; day <= daysInMonth; day++) {
                    if (year == 2014 && month == 11 && day == 9) {
                        flag = 1;
                    }
                    if (flag == 1) {
                        t++;

                    }
                    if(t==1001){
                        System.out.printf("%d-%02d-%02d\n",year,month,day);

                        break;
                    }
                }
            }
        }
    }
}
