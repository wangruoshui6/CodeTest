public class TimeText {
    public static void main(String[] args) {
        for(int year=2020;year<=2025;year++){
            for(int month=1;month<=12;month++) {
                int dayInMonth;
                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                    dayInMonth = 31;
                } else if (month == 2 || month == 6 || month == 9 || month == 11) {
                    dayInMonth = 30;
                } else {
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                        dayInMonth = 29;
                    } else
                        dayInMonth = 28;
                }
                for (int day = 1; day <= dayInMonth; day++) {
                    System.out.printf("%d-%02d-%02d\n",year,month,day);
                    
                }
            }
        }
    }
}
