import java.util.Scanner;
import java.util.Locale;
public class CondicaoTernaria {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		double preco = 34.5;
		double desconto = (preco < 20.0) ?  preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);
		
		teclado.close();
	}

}
