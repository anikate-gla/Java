import java.util.Scanner;

public class Strings {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a="Ram";
        String b="Ram";
        // True Because of String pool Area
        System.out.println(a==b);

        String c=new String("Ram");
        String d=new String("Ram");
        System.out.println(c==d);

        // String methods
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.charAt(0));
        System.out.println(a.indexOf("m"));
        System.out.println(a.contains("m"));
        System.out.println(a+" Agrawal");
    }
}
