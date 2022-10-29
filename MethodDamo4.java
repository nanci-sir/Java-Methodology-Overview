package Method;

public class MethodDamo4 {
    public static void main(String[] args) {
        //计算1-n的和返回
        System.out.println("一到五的和：" + sum(5));//15
        System.out.println("一到100的和：" + sum(100));//5050
    }
    public static int sum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
