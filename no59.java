/*Addition of two Sauare Matrix*/

import java.util.*;
class no59{
    public static void main(String args[]) {
        int a[][] = new int[3][3];
        int [][] b = new int[3][3]; 
        int c[][] = new int[3][3];
        int row1 = 3, col1 = 3, row2=3, col2=3;
        Scanner s = new Scanner(System.in);

        if(row1==row2 && col1==col2)
        {
        for(int i=0; i<row1; i++) {
            for(int j=0; j<col1; j++) {
                System.out.println("Enter the value for "+i+","+j+": ");
                a[i][j] = s.nextInt();
            }
        }

        System.out.println("The matrix A is :");
        for(int i=0; i<row1; i++) {
            for(int j=0; j<col1; j++) {
                System.out.print(a[i][j]+" ");
            }
                System.out.println();
        }

        for(int i=0; i<row2; i++) {
            for(int j=0; j<col2; j++) {
                System.out.println("Enter the value for "+i+","+j+": ");
                b[i][j] = s.nextInt();
            }
        }

        System.out.println("The matrix B is :");
        for(int i=0; i<row2; i++) {
            for(int j=0; j<col2; j++) {
                System.out.print(b[i][j]+" ");
            }
                System.out.println();
        }

        System.out.println("Addition of two matrix is :");
        for(int i=0; i<row1; i++) {
            for(int j=0; j<col2; j++) {
                c[i][j] = a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
    else{
        System.out.print("Addition is not possible...!");
    }
}}