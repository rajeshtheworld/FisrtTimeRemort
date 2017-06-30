
public class Daimond {

	public static void main(String[] args) {
		
		int noOfspaces=3;
		int n=1;
		for(int i=1;i<=7;i++)
		{
			for(int k=noOfspaces;k>=1;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
			if(i<4)
			{
				n=n+2;
				noOfspaces=noOfspaces-1;
			}
			else
			{
				n=n-2;
				noOfspaces=noOfspaces+1;
			}
		}
		
		
		
	}

}
