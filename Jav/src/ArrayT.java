import java.util.Scanner;

public class ArrayT {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);	
	
	System.out.println("Ennter the two didgit of two array");
	
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	int[][] arr=new int[num1][num2];
	
	for(int i=0;i<num1;i++){
		for(int j=0;j<num2;j++){
			
			
			arr[i][j]= (int)(Math.random()*100);
			
		}
	}
	
	for(int[] var: arr){
		for(int var2:var){
			System.out.print(var2 + " ");
		}
		System.out.println();
	}
	
	

	}

}
