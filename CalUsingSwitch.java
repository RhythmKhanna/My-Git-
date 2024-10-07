import java.util.*;

public class CalUsingSwitch{
public static void main(String []args){


Scanner sc=new Scanner(System.in);

System.out.print("enter 1 for addition, 2 for subtraction, three for multiplication and 4 for division: ");
int n=sc.nextInt();
System.out.println("Enter two numbers: ");
int a=sc.nextInt();
int b=sc.nextInt();

switch(n){

case 1:
    System.out.println(Sum(a,b));
    break;
  case 2:
    System.out.println(Diff(a,b));
    break;
  case 3:
    System.out.println(Product(a,b));
    break;
  case 4:
    System.out.println(Division(a,b));
    break;
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
