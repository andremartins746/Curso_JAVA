import java.util.Scanner;
public class exe_WHILE02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int x = teclado.nextInt();
		int y = teclado.nextInt();
		
		while(x != 0 && y != 0) {
			if(x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			else if(x < 0 && y > 0) {
				System.out.println("segundo");
			}
			else if(x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			else {
				System.out.println("quarto");
			}
			 x = teclado.nextInt();
			 y = teclado.nextInt();
		}
		
		teclado.close();
	}

}
