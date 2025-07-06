import java.util.Scanner;

public class Second_Program {
    public static void main(String[] args) {
        // for user input
        Scanner sc=new Scanner(System.in);
        // data types
        //Integer types
        byte b=sc.nextByte();
        short sh=sc.nextShort();
        int n=sc.nextInt();
        long l=sc.nextLong();

        //Floating point
        float f=sc.nextFloat();
        double d=sc.nextDouble();

        // String
        String s=sc.next();
        //Character
        char ch=s.charAt(0);

        System.out.println("Integer types => "+b+" "+sh+" "+n+" "+l);
        System.out.println("Floating point types => "+f+" "+d);
        System.out.println("String and character types => "+s+" "+ch);
    }
}
