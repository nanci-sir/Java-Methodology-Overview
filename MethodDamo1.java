package Method;

public class MethodDamo1 {
    public static void main(String[] args) {
        //张三
       int c2 = sum(10,20);
        System.out.println(c2);//30
        //王五
        int c3 = sum(10,20);
        System.out.println(c3);//30
    }
    public static int sum(int a,int b){
        int c = a + b;
        return c;
    }
}
