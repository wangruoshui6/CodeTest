public class TimeA {
    public static void main(String[] args) {
        int sum=0;
        for(int year=2000;year<=1999999;year++){
            for(int month=1;month<=12;month++){
                int daymonth=31;
                if(month==4||month==6||month==9||month==11){
                    daymonth=30;
                }else if(month==2){
                    if((year%4==0&&year%100!=0)||year%400==0){
                        daymonth=29;
                    }
                    else {
                        daymonth=28;
                    }
                }
                for (int day=1;day<=daymonth;day++){
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
