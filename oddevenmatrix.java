import java.util.*;
public class oddevenmatrix {
    public static void main(String[] args) {
        System.out.println("Finding the number of odd and even elements in a matrix.");
        System.out.println("Enter the number of rows:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the number of columns:");
        int m=sc.nextInt();
        int A[][]=new int[n][m];
        int counter=0;
        int odd_counter=0;
        System.out.println("Enter the elements of the matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                A[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(A[i][j]%2==0){
                    counter++;
                }
                else{
                    odd_counter++;
                }
            }
        }
        System.out.println("The number of even elements in the matrix is " +counter);
        System.out.println("The number of odd elements in the matrix is " +odd_counter);
        sc.close();
    }
    
}
