import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
System.out.println("Enter any number to fibonac series");
System.out.println("Enter any number to fibonac series");

Scanner in = new Scanner(System.in);
int num= in.nextInt();
System.out.println("Number is = "+num);

int a= 0;
int b=1;
System.out.print( "Series is :"+a +" " +b);

for(int i=0;i<=num;i++){
	int c=a+b;
	 a=b;
	 b=c;
	
	 System.out.print(" "+ c);
						}
}


	}


