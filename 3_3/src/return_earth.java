public class return_earth {
    public static void main(String[] args) {
        int sum=1;
        int day=1;
        int count=2;
        while (true){
            sum+=count;
            day+=1;
            count+=2;
            if(sum>=108){
                break;
            }
        }

        System.out.println(day);

    }
}
