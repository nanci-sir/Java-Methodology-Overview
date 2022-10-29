package Method;

public class MeyhodTest2 {
    public static void main(String[] args) {
        int[] arr={12,213,34,34,234,2345,345,2345};
        int index = searchIndex(arr,345);
        System.out.println("您查询数组索引是："+index);//您查询数组索引是：6
    }
    public  static int searchIndex(int[] arr,int data){
        for (int i = 0; i <arr.length; i++) {
            if(arr[i] == data){
                return i;
            }

        }
        return -1;
    }

}
