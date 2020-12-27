import java.util.*;
public class identitymatrix {
    public static void main(String[] args) {
        System.out.println("Identity matrix.");
        System.out.println("Enter the number of rows of the matrix:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the number of columns of the matrix:");
        int m=sc.nextInt();
        int A[][]=new int[n][m];
        int C[][]=new int[n][m];
        int counter=0;
        System.out.println("Enter the elements of the matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                A[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                C[i][j]=0;
                for(int k=0;k<m;k++){
                    C[i][j]=C[i][j]+(A[i][k]*A[k][j]);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(C[i][j]==A[i][j]){
                    counter++;
                }
            }
        }
        if(counter==(n*m)){
            System.out.println("The given matrix is an identity matrix.");
        }
        else{
            System.out.println("The given matrix is not an identity matrix.");
        }
        sc.close();
    }
    
}
