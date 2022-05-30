import java.util.Scanner;

public class Arrtest {
    public static void main(String[] args) {
        MyTools mt = new MyTools();
        int[] arr = {100, 200, 10, 43, 1};
        mt.Bubble(arr);     //ctrl+B 光标在方法使用ctrl+B，自动跳转到相应的方法区
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        Scanner scanner = new Scanner(System.in);//自动分配变量名，在后面加.var
    }
}

//IDEA中，src文件存放.java文件
//out存放.class文件

//一些常用快捷键：
//ctrl+d 删除光标所在行
//ctrl+alt+向下箭头 复制光标所在行
//ctrl+/ 注释
//alt+/ 补全代码
//ctrl+alt+L自动格式化
//alt+enter 自动导入包
//alt+R 自动运行

//测试冒泡排
//ctrl+H 查看一个类的层级关系，在继承的时候很有用
class Person{
    int age;
    String name;

    public Person(int age, String name) {   //自动创建构造器：alt+insert，笔记本需要加fn，
                                            //或者右键Generate，无参构造器就点select none
        this.age = age;
        this.name = name;

    }
}


class MyTools {
    public void Bubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int num = 0;
                    num = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = num;
                }
            }
        }
    }
}