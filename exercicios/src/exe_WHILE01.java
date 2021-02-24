import java.util.Scanner;
public class exe_WHILE01 {

	public static void main(String[] args) {
		Scanner teclado =new Scanner(System.in);
		
		int x = teclado.nextInt();
		
		while (x != 2002) {
			System.out.println("senha Invalida!");
			x = teclado.nextInt();
			
		} 

		System.out.println("acesso permitido!");
		teclado.close();
	}

}
