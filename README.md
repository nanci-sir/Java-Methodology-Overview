# Java-Methodology-Overview
Java方法概述
### 1方法的概念

​	方法（method）是将具有独立功能的代码块组织成为一个整体，使其具有特殊功能的代码集

* 注意：

  * 方法必须先创建才可以使用，该过程成为方法定义

  * 方法创建后并不是直接可以运行的，需要手动使用后，才执行，该过程成为方法调用

    ```
    package Method;
    
    public class MethodDamo1 {
        public static void main(String[] args) {
            //张三
           int c2 = sum(10,20);
            System.out.println(c2);//30
            //王五
            int c3 = sum(10,20)
            System.out.println(c3);//30
        }
        public static int sum(int a,int b){
            int c = a + b;
            return c;
        }
    }
    ```

## 2. 方法的定义和调用

#### 	2.1方法必须先定义，后调用，否则程序将报错

```
package Method;

public class MethodDamo2 {
    public static void main(String[] args) {
        //学习方法定义格式
       int rs =  add(100,200);
        System.out.println("和是: "+rs);

    }
    public  static  int add(int a,int b){
        int c = a+ b;
        return  c;
    }
}
```

#### 2.2  修饰符 返回值类型 方法名( 形参列表 )

   { 方法体代码(需要执行的功能代码) 

​    return 返回值;}

#### 2.3  方法要执行必须怎么办，如何进行？ 

 必须进行调用；调用格式：方法名称(…)。

#### 2.4  如果方法不需要返回结果

返回值类型必须申明成void（无返回值）, 此时方法内部不可以使用return返回数据。 

 方法如果没有参数，或者返回值类型申明为void可以称为无参数、无返回值的方法，依次类推。

#### 2.5如果方法不需要返回结果

不需要接收参数，应该怎么办，要注意什么？ 

方法不需要返回结果，则申明返回值类型为void；方法不需要参数，则形参列表可以不写。

方法没有申明返回值类型，内部不能使用return返回数据。

方法如果没有形参列表，调用的时候则不能传入参数值，否则报错

* 

  ```java
  public class MethodTest {
      public static void main(String[] args) {
          //在main()方法中调用定义好的方法并使用变量保存
          int result = getMax(10,20);
          System.out.println(result);
  
          //在main()方法中调用定义好的方法并直接打印结果
          System.out.println(getMax(10,20));
      }
  
      //定义一个方法，用于获取两个数字中的较大数
      public static int getMax(int a, int b) {
          //使用分支语句分两种情况对两个数字的大小关系进行处理
          //根据题设分别设置两种情况下对应的返回结果
          if(a > b) {
              return a;
          } else {
              return b;
          }
      }
  }
  ```

## 3. 方法的注意事项

### 3.1 方法的注意事项

* 方法不能嵌套定义

  * 示例代码：

    ```java
    public class MethodDemo {
        public static void main(String[] args) {
    
        }
    
        public static void methodOne() {
    		public static void methodTwo() {
           		// 这里会引发编译错误!!!
        	}
        }
    }
    ```

* void表示无返回值，可以省略return，也可以单独的书写return，后面不加数据

  * 示例代码：

    ```java
    package Method;
    
    public class MethodDamo3 {
        public static void main(String[] args) {
            //学会方法定义其他格式
             print();
    
        }
        public  static void print(){
            for (int i = 0;i < 3; i++) {
                System.out.println("Hello World");
            }
        }
    }
    
    ```

方法的编写顺序无所谓。 

⚫ 方法与方法之间是平级关系，不能嵌套定义。

 ⚫ 方法的返回值类型为void（无返回值），方法内则不能使用return返回数据，如果方法的返回值类型写了具体类型，方法内部则必 须使用return返回对应类型的数据。

 ⚫ return语句下面，不能编写代码，因为永远执行不到，属于无效的代码。

 ⚫ 方法不调用就不执行, 调用时必须严格匹配方法的参数情况。 

⚫ 有返回值的方法调用时可以选择定义变量接收结果，或者直接输出调用，甚至直接调用；无返回值方法的调用只能直接调用

### 3.2 方法的通用格式

* 格式：

  ```java
  public static 返回值类型 方法名(参数) {
     方法体; 
     return 数据 ;
  }
  ```

* 定义方法时，要做到两个明确

  * **明确返回值类型**：主要是明确方法操作完毕之后是否有数据返回，如果没有，写void；如果有，写对应的数据类型
  * **明确参数：**主要是明确参数的类型和数量

* 调用方法时的注意：

  * void类型的方法，直接调用即可
  * 非void类型的方法，推荐用变量接收调用



## 4.方法案例

#### 4.1计算1-n的和返回

```java
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
```

定义方法重点关注的是哪两点？

 方法是否需要申明返回值类型。 

 方法是否需要定义形参列表。

#### 4.2判断整数是奇数还是偶数

```java
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

```

#### 4.3 数组最大值

* 需求：设计一个方法用于获取数组中元素的最大值 

* 代码：

  ```java
  public class MethodTest02 {
      public static void main(String[] args) {
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
  
  ```

  

##  5.方法的参数传递案例

#### 5.1打印数组内容

```java
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
```

#### 5.2从数组中查询元素的索引返回 

设计一个方法可以接收整型数组，和要查询的元素值；最终要返回元素在该数组中的索引，如果数组中 不存在该元素则返回 -1。

```java
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
```

#### 5.3比较两个数组内容是否相等

请使用方法完成：能够判断任意两个整型数组是否一样，并返回true或者false。

```java
package Method;

public class MeyhodTest3 {
    public static void main(String[] args) {
   int[] arr1 = {1,2,3};
   int[] arr2 = {1,2,3};
        System.out.println(compare(arr1,arr2));
    }
    public static boolean compare(int[] arr1,int[] arr2){
        if(arr1.length == arr2.length){
            for (int i = 0; i <arr1.length ; i++) {
                if(arr1[i] != arr2 [i]){
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
    }
}
```



## 6.方法重载

 同一个类中，出现多个方法名称相同，但是形参列表是不同的，那么这些方法就是重载方法。

#### 6.1方法重载的作用 

可读性好，方法名称相同提示是同一类型的功能，通过形参不同实现功能差异化的选择，这是一种专业的代码设计

####  6.2方法重载是什么样的？

 同一个类中，多个方法的名称相同，形参列表不同。 2. 使用方法重载的好处 ？

 对于相似功能的业务场景：可读性好，方法名称相同提示是同一类型的功能，通过 形参不同实现功能差异化的选择，这是一种专业的代码设计

####  6.3方法重载的关键要求是什么样的？ 

 同一个类中，多个方法的名称相同，形参列表不同，其他无所谓。 2.形参列表不同指的是什么？ 

形参的个数、类型、顺序不同。不关心形参的名称。

```java
package Method;

public class MeyhodTest4 {
    public static void main(String[] args) {
        fire();
        fire("米米");
        fire("大米");
    }

        public static void fire(){
            System.out.println("默认发射一枚武器给米国！");
        }

        public static void fire(String location){
            System.out.println("给"+location+"发射一枚武器！");
        }

        public static void fire(String location , int nums){
            System.out.println("给"+location+"发射"+nums+"枚武器！");
        }
    }
```

## 7.return关键字单独使用

#### 7.1如果要直接结束当前方法的执行，怎么解决？ 

 return; 跳出并立即结束所在方法的执行。 

break; 跳出并结束当前所在循环的执行。 

 continue; 结束当前所在循环的当次继续，进入下一次执行。
