import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Inside main");
        //call by value
        fun(num);
    }
    static void fun(int num){
        System.out.println(num+" is inside fun function");
    }
}
