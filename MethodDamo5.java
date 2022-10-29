package Method;

public class MethodDamo5 {
    public static void main(String[] args) {
        //判断整数是奇数还是偶数
        check(100000001);
    }
    public  static void check(int a){
        if(a % 2 ==0){
            System.out.println(a + "是偶数");
        }else{
            System.out.println(a + "是奇数"); //100000001是奇数
        }
    }
}
