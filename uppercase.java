import java.util.*;
public class uppercase {
    public static void main(String[] args) {
        System.out.println("Change to uppercase.");
        System.out.println("Enter the string:");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=a.toUpperCase();
        System.out.println("The converted string is:" +b);
        sc.close();
    }
    
}
