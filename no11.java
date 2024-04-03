/* Types of operator 
1. Arithmetic Operator(binary/unary/ternary)
2. Relational Operators
3. Logical Operator
4. Assignment Operator
5. Bitwise Operator
*/

public class no11 {
public static void main(String args[]) {

// 1.Arithmetic Operator 

//i. Binary operators are +,-,*,/,% they should have minimum 2 operands
int a =10;
int b=5;
System.out.println("\nBinary Operator");
System.out.println(" '+' = "+(a+b));
System.out.println(" '-' = "+(a-b));
System.out.println(" '*' = "+(a*b));
System.out.println(" '/' = "+(a/b));
System.out.println(" '%' = "+(a%b));

//ii. Unary Operators are ++,--
//they are have only one operand
// ++operand is used for pre-increment(incresed by 1 before use the value)
// operand++ is used for post-increment(increment by 1 after use the value)
System.out.println("\nUnary Operator");
//++
int c=10;
int e = ++c;
System.out.println("\nC ="+c);
System.out.println("Pre-incremented "+e);
int d=10;
int f = d++;
System.out.println("D ="+d);
System.out.println("Post-incremented "+f);
//--
int x=10;
int y = --x;
System.out.println("\nx ="+x);
System.out.println("Pre-decremented "+y);

int m=10;
int n = m--;
System.out.println("m ="+m);
System.out.println("Post-decremented "+n);

/*
2. Relational Operators
   '==' equal
   '!=' Not equal to 
   '>'  greater than 
   '<'  less than
   '>=' greater than equal
   '<=' less than equal

3. Logical Operators
    '&&'    Logical AND     (if both statements are true then the condition returns true other wise false)
    '||'    Logical OR      (if both statements are false then the condition returns false other wise true)
    '!'     Logical NOT     

4. Assignment Operators
    '='     equals to (a=b)
    '+='    pluse equals to (for example (a+=b) which means (a=a+b) )
    '-='    minuse equals to (for example (a-=b) which means (a=a-b) )
    '*='    multiply equals to (for example (a*=b) which means (a=a*b) )
    '/='    divide equals to (for example (a/=b) which means (a=a/b) )
*/
}}
