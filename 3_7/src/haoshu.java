import java.util.Scanner;

public class haoshu {
    public static void main(String[] args) {
      //思路：能不能判断循环次数，不能的话用while,先输入24，看结果
        int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0;
        int g,s,b,q,w,sw,bw;
        int sum;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for (int i = 0; i <= n; i++) {
            g=i%10;
            s=i/10%10;
            b=i/100%10;
            q=i/1000%10;
            w=i/10000%10;
            sw=i/100000%10;

            if(i<10&&g%2!=0){
                count1++;
            }
            if(i>=10&&i<100&&g%2!=0&&s%2==0){
                count2++;
            }
            if(i>=100&&i<1000&&g%2!=0&&s%2==0&&b%2!=0){
                count3++;
            }
            if(i>=1000&&i<10000&&g%2!=0&&s%2==0&&b%2!=0&&q%2==0){
                count4++;
            }
            if(i>=10000&&i<100000&&g%2!=0&&s%2==0&&b%2!=0&&q%2==0&&w%2!=0){
                count5++;
            }
            if(i>=100000&&i<1000000&&g%2!=0&&s%2==0&&b%2!=0&&q%2==0&&w%2!=0&&sw%2==0){
                count6++;
            }




        }

        sum=count1+count2+count3+count4+count5+count6;


        System.out.println(sum);
    }
}
