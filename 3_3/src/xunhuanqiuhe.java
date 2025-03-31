public class xunhuanqiuhe {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 0; i <= 2019; i++) {
            String j=i+"";
            char []c=j.toCharArray();
            for (int k = 0; k < c.length; k++) {
                if(c[k]=='0'||c[k]=='1'||c[k]=='2'||c[k]==9){
                    sum+=i;
                }
            }


        }
        System.out.println(sum);
    }
}
