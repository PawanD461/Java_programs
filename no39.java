/*
2D Array craeting (Matrix)
and also search an element is exist in this matrix or not 
*/
import java.util.*;

public class no39{

    // Search an element in matrix
    public static boolean search(int m[][], int key){

        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[0].length; j++){
                if(m[i][j] == key){
                    System.out.println("Element found in ["+i+"]["+j+"]th position");
                    return true;
                }
            }
        }
        System.out.println("Element is not found ");
        return false;
    }

    //main method
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);

        int A[][] = new int [10][10];
        System.out.print("Enter the no of row you want for matrix A : ");
        int r = sc.nextInt();
        System.out.print("Enter the no of coloumn you want for matrix A : ");
        int c = sc.nextInt();

        //Inputing elements to the matrix
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print("Enter the value for a["+i+"]"+"["+j+"]");
                A[i][j] = sc.nextInt();
            }
        }

        //Output of the Matrix
        System.out.println("The Matrix is as follows : ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(A[i][j]+ " ");
            }
            System.out.println();
        }

        //Funtion calling
        search(A, 2);
    }
}