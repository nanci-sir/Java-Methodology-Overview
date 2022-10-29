package Method;

    public class MeyhodTeat1 {
        public static void main(String[] args) {
            //打印任意整型数组
            int[] ages = {12,13,44,22,33,23};
            printArray(ages);

        }
        public static void printArray(int[] arr){
            System.out.print("[");
            if(arr != null && arr.length > 0)
            for (int i = 0; i <arr.length; i++) {
                //if(i == arr.length - 1){
                  //  System.out.print(arr[i] );
               // }else
                //System.out.print(arr[i] + ",");
                System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
           }
            System.out.println("]");
        }
}
