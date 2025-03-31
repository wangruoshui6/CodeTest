import java.util.HashSet;

public class set {
    public static void main(String[] args) {
        String string="0100110001010001";
        HashSet<Object>set=new HashSet<>();//去重
        for (int i = 0; i < string.length(); i++)//外层循环控制从第几个下标开始截取
        {
            for (int j = i; j <string.length() ; j++)//内层循环控制截取的次数
            {
                String s=string.substring(i,j+1);//左闭右开
                set.add(s);
            }

        }
        System.out.println(set.size());
    }
}
