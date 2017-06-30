
public class Newloop {

	public static void main(String[] args ) {
		
		System.out.println("Pyramid pattern of star in Java : "); 
		
				System.out.println("Pyramid of numbers in Java : "); 
		
		Newloop.drawPyramidOfNumbers();

	}
		
public static void drawPyramidOfNumbers() { 
	
					for (int i = 0; i < 5; i++) { 
						for (int j = 0; j < 5 - i; j++) {
							System.out.print("#"); 
														} 
									for (int k = 0; k <= i; k++) { 
											System.out.print("*"); 
																} 
										System.out.println(); 
												} 
	} 
}

