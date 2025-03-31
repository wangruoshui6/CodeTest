public class ObjectDemo2 {
    public static void main(String[] args) {
        Student stu=new Student("张三","23");
        Student stu2=new Student("张三","23");
        //如果不重写，那么就默认使用Object中的方法进行比较，就比较的是地址值，
        // 一般来讲地址值对于我们意义不大，所以我们重写，快捷键 alt+ insert 重写之后的equals方法比较的就是对象内部的属性值了
        System.out.println(stu.equals(stu2));
    }
}
