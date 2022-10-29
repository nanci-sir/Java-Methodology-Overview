package Method;

public class MethodDamo6 {
    public static void main(String[] args) {
        //定义一个数组，用静态初始化完成数组元素初始化
        int[] arr = {12, 45, 98, 73, 60};

        //调用获取最大值方法，用变量接收返回结果
        int number = getMax(arr);

        //把结果输出在控制台
        System.out.println("number:" + number);
    }
    public static int getMax(int[] arr) {
        int max = arr[0];
        for(int x=1; x<arr.length; x++) {
            if(arr[x] > max) {
                max = arr[x];
            }
        }
        return max;
    }
}
