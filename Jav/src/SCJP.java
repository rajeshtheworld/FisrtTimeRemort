
public class SCJP {

	public static void main(String[] args) {
		      
		for(int i=1;i<=6;i++)
		{
			for(int k=5;k>=i;k--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				
				if((i+j)%2==0)
				{
					System.out.print(1);
				}
				else
				{
					System.out.print(0);
				}
				
			}
			System.out.println();
			
		}
		     
	}

}
