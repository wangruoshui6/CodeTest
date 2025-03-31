public class TimeA {


        public static void main(String[] args) {
            int sum=0;
            for(int year=2000;year<=1999999;year++){
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
                        if(year%month==0&&year%day==0){
                            sum++;
                        }

                    }
                }
            }
            sum+=1;
            System.out.println(sum);
        }
    }


