import java.util.Locale;
import java.util.Scanner;
public class Operadores_Cumutativa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		int minutos = teclado.nextInt();
		
		double conta = 50.0;
		if(minutos > 100) {
			conta += (minutos - 100) *( 2.0);
		}
		
		
		System.out.printf("Valor da conta = R$ %.2f%n", conta);

		
		teclado.close();
	}

}
