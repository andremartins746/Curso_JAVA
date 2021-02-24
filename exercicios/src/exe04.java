import java.util.Locale;
import java.util.Scanner;

public class exe04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		int nf, ht;
		double salario, vh;
			
		System.out.println("digite o seu numero/ID: ");
		nf = sc.nextInt();
		System.out.println("digite o numero de horas trabalhadas: ");
		ht = sc.nextInt();
		System.out.println("digite o valor que voce recebe pro hora: ");
		vh = sc.nextDouble();
			
			
		salario = ht * vh;
			
		System.out.println("NUMBER = " + nf);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();

	}

}
