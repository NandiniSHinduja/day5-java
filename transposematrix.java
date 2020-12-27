import java.util.*;
public class transposematrix{
    public static void main(String[] args) {
        System.out.println("Transpose of a matrix");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows of the matrix:");
        int n=sc.nextInt();
        System.out.println("Enter the number of columns of the matrix:");
        int m=sc.nextInt();
        int A[][]=new int[n][m];
        int B[][]=new int[n][m];
        System.out.println("Enter the elements of the matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("The transpose matrix is:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                B[i][j]=A[j][i];
                System.out.println(B[i][j]);
            }
        }
        sc.close();
    }
}