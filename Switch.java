import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        char op = sc.next().charAt(0);
        int ans;
        switch (op){
            case '+':ans=num1+num2;break;
            case '-':ans=num1-num2;break;
            case '*':ans=num1*num2;break;
            case '/':ans=num1/num2;break;
            default:ans=-1;
                System.out.println("Wrong operator");
        }
        System.out.println(ans);
    }
}
