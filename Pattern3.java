public class Pattern3{
public static void main(String []args){
Scanner sc=new Scanner(System.in);

int n= sc.nextInt();


for(int i=1;i<=n;i++){
for(int j=n-1; j>=1;j--){
System.out.print(" ");

}
for(j=1;j<=1;j++){
	System.out.print("*");
}
System.out.println();
}
}
}