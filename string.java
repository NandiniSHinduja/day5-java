import java.util.*;
public class string {
    public static void main(String[] args) {
        System.out.println("Total number of characters in a string.");
        System.out.println("Enter a string:");
        String a=new String();
        Scanner sc=new Scanner(System.in);
        a=sc.nextLine();
        System.out.println("The number of characters in the given string is " +a.length());
        sc.close();
    }
    
}
