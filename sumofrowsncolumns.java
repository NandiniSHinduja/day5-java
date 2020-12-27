import java.util.*;
public class sumofrowsncolumns {
    public static void main(String[] args) {
        System.out.println("Finding the sum of rows and columns.");
        System.out.println("Enter the number of rows:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the number of columns:");
        int m=sc.nextInt();
        System.out.println("Enter the elements of the matrix:");
        int A[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("This is the matrix that you entered:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(A[i][j]+ " ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                sum=sum+A[i][j];
            }
            System.out.println("The sum of the row " +(i+1)+ " is " +sum);
        }
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                sum=sum+A[j][i];
            }
            System.out.println("The sum of the column " +(i+1)+ " is " +sum);
        }
        sc.close();
        
    }
    
}
