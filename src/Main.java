
public class Main {
	public static void main(String[] args) {

		
		
		
yildizlar();




	}
	
		
		

	public static void yildizlar() {
		for (int i = 0; i < 4; i++) {

			for (int k = 0; k < 7; k++) {

				System.out.print("*");

			}
			System.out.println("");
		}

		for (int i = 7; i >= 0; i--) {
			for (int k = 0; k < i - 1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

	

	

}
