import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=1;
        System.out.println("Table of "+ num);
        while (i<11){
            System.out.println(num+"*"+i+" = "+(num*i));
            i++;
        }

    }
}
