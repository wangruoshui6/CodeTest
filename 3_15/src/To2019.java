public class To2019 {
    public static void main(String[] args) {
        int count=0;
        for (int i = 1; i <2019/3 ; i++) {
            if(find(i)){
                for(int j=i+1;j<2019/2;j++){
                    int k=2019-i-j;
                    if(find(j)&&find(k)&&k>j){
                        count++;

                    }
                }
            }
        }
        System.out.println(count/6);
    }
    //判断一个数中是否包含某些数
    public static boolean find(int num){
        String str=Integer.toString(num);
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='2'||str.charAt(i)=='4')
                return false;
        }
        return true;
    }


}