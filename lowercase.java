import java.util.*;
public class lowercase {
    public static void main(String[] args) {
        System.out.println("Changes to lowercase.");
        System.out.println("Enter the string:");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=a.toLowerCase();
        System.out.println("The converted string is: " +b);
        sc.close();
    }
    
}
