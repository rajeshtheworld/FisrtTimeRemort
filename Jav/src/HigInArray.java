import java.util.Scanner;

public class HigInArray {

	public static void main(String[]  args){
		
		System.out.println("Enter lengh of array"); 
		
		Scanner in = new Scanner(System.in);
		
		int num= in.nextInt();
		System.out.println("Enter the "+num +" Number");
		
		int[] arr = new int[num];
		
		for(int i=0;i<arr.length;i++){
			arr[i]= in.nextInt();
		}
		
		System.out.println("Enteered array is =");
		for(int var: arr){
			System.out.println(var);
		}
		
		
		int mac = HigInArray.MaxNum(arr, num);
		System.out.println("High Number is "+ mac);
	}
	
	
	public static  int MaxNum(int[] Arr1 , int n )
	{
		System.out.println("Enetre in Fun");
		
		int[] Arr =new int[n];
		Arr= Arr1;
		int max=Arr[0];
		
		for(int i=0;i<Arr.length;i++){
			
			if(max>Arr[i])
			{
				i++;
			}else{
				max=Arr[i];
			}
			
		}
		System.out.println("Exit in Fun");
		return max;
	}
	
	
}
