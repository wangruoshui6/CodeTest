public class QieZhengFangXing {
    public static void main(String[] args) {
        int length=2019,weith=324;
        int count=0;
        while (true){
            if (length>weith){
                count++;
                length=length-weith;
            } else if (weith>length) {
                count++;
                weith=weith-length;
                
            }else if(weith==length){
                count++;
                break;
            }


        }
        System.out.println(count);
    }
}
