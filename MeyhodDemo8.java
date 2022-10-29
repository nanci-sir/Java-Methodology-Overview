package Method;

public class MeyhodDemo8 {
    public static void main(String[] args) {

                int[] arrs = new int[]{10, 20, 30};
                change(arrs);
                System.out.println(arrs[1]); // 222
            }
            public static void change(int[] arrs){
                System.out.println("方法内部2："+arrs[1]); // 20
                arrs[1] = 222;
                System.out.println("方法内部2："+arrs[1]); // 222
    }
}
