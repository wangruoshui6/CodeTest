public class xiaoqiu {


// 1:无需package
// 2: 类名必须Main, 不可修改

        public static void main(String[] args) {
             int width=343720*2,height=233333*2;
             int dx=15,dy=17;
            //镜中原点肯定是长和宽的二倍位置
            for(int t=1;;t++){
                if(t*dx%width==0&&t*dy%height==0){
                    System.out.printf("%.2f",Math.hypot(t*dx,t*dy));
                    break;
                }
            }

        }
    }
