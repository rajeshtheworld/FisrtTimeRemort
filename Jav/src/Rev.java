import java.util.Scanner;

public class Rev {

	public static void main(String[] args) {
	System.out.println("Enter Any 2 didgit Number");
	
	Scanner in = new Scanner(System.in);
	int num= in.nextInt();
	System.out.println("Number is = "+num);

	int d1= num/10;
	int d2=num%10;
	
	int newNo= (d2*10)+d1;

	System.out.println("New Number is : " +newNo);
	
	}

}
