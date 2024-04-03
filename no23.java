/*
Pattern 2
A 
B C
D E F
G H I J
K L M N O
*/
public class no23{
    public static void main(String args[]){
        int i,j;
        char ch='A';
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.print("\n");
        }
    }
}