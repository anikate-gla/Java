import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks = sc.nextInt();
        if(marks>90) System.out.println("Topper");
        else if(marks>50) System.out.println("Average");
        else System.out.println("Below Average");
    }
}
