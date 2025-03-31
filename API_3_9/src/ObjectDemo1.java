public class ObjectDemo1 {
    public static void main(String[] args) {
        Object obj=new Object();
        String str1=obj.toString();
        System.out.println(str1);
        Student stu=new Student("zhangsan","23");
        Student stu3=new Student();
        String str2=stu.toString();
        System.out.println(str2);
        final String stu4 = stu3.toString();
        System.out.println(stu4);


    }
}
