public class monkey_eat_banana {
    public static void main(String[] args) {
//        设香蕉为n，n%5==1,a=(n-1)/5*4
//        a%5=2,b=(a-2)/5*4
//        b%5=3,c=(b-3)/5*4
//        c%5=4,d=(c-4)/5*4
//        d%5=0,d>0
//思路:不知道循环次数，用while,先将香蕉数量从1开始，一点一点的加，
        int n=1;
        while (true){
            if(n%5==1){
                int a=(n-1)/5*4;
                if(a%5==2){
                    int b=(a-2)/5*4;
                    if(b%5==3){
                       int  c=(b-3)/5*4 ;
                       if(c%5==4){
                           int d=(c-4)/5*4;
                           if(d%5==0&&d>0){
                               break;
                           }
                       }
                    }
                }
            }
               n++;
         }
        System.out.println(n);


        }
}
