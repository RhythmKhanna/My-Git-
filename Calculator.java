import java.util.*;
public class Calculator{

static void main(String []args){

Scanner sc=new Scanner(System.in);

System.out.print("enter 1 for addition, 2 for subtraction, three for multiplication and 4 for division: ");
int n=sc.nextInt();
System.out.println("Enter two numbers: ");
int a=sc.nextInt();
int b=sc.nextInt();

if(n==1){
Sum(a,b);
}
else if(n==2){
Diff(a,b);
}
else if(n==3){
Product(a,b);
}
else if(n==4){
Division(a,b);
}
}

static int Sum(int a, int b){

return a + b;

}

static int Diff(int a, int b){
return a - b;
}

static int Product(int a, int b){
return a * b;
}

static int Division(int a, int b){
return a / b;
}







}