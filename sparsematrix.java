import java.util.*;
public class sparsematrix{
    public static void main(String[] args) {
        System.out.println("Sparse matrix.");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows of the matrix:");
        int n=sc.nextInt();
        System.out.println("Enter the number of columns of the matrix:");
        int m=sc.nextInt();
        int A[][]=new int[n][m];
        int counter=0;
        System.out.println("Enter the elements of the matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                A[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(A[i][j]!=0){
                    counter++;
                }
            }
        }
        if(counter<=n){
            System.out.println("The given matrix is a sparse matrix");
        }
        else{
            System.out.println("The given matrix is a dense matrix");
        }
        sc.close();
    }
}