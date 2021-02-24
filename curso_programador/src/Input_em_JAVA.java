import java.util.Locale;
import java.util.Scanner;

public class Input_em_JAVA {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		String y;
		String t;

		System.out.print("digite o seu nome: ");
		y = sc.next();
		
		System.out.print("digite a sua idade:" );
		x = sc.nextInt();
		
		System.out.print("digite o seu sexo: ");
		t = sc.next();
		
		System.out.printf("ola %s está é a sua idade %d e seu sexo é: %s", y,x,t);
		sc.close();
	}

}
