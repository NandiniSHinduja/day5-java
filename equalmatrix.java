import java.util.*;
public class equalmatrix {
    public static void main(String[] args) {
        System.out.println("Checking if two matrices are equal or not");
        System.out.println("Enter the number of rows:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the number of columns:");
        int m=sc.nextInt();
        int A[][]=new int[n][m];
        int B[][]=new int[n][m];
        int counter=0;
        System.out.println("Enter the elements of the first matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the second matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                B[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(A[i][j]==B[i][j]){
                    counter++;
                }
            }
        }
        if(counter==(n*m)){
            System.out.println("The two matrices are equal");
        }
        else{
            System.out.println("The two matrices are not equal");
        }
        sc.close();
    }
    
}
