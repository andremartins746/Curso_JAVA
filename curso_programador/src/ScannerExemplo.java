import java.util.Scanner;
import java.util.Locale;

public class ScannerExemplo {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		char a;
		String x;
		int y;
		double z; // double são numeros com ponto flutuante.
		
		
		a = sc.next().charAt(0);// aqui o charAt(0) pegara somente o primeiro caractere da string e ira amarzenar no char a.
		x = sc.next();// o next() serve para vc ler uma palavra somente
		y = sc.nextInt(); // o nextInt serve para vc ler um numero inteiro
		z = sc.nextDouble(); // o nextDouble serve para vc ler um numero flutuante.
		
		System.out.println("dados digitados:");
		System.out.println("voce digitou:" + a);
		System.out.println("voce digitou: " + x);
		System.out.println("voce digitou:" + y);
		System.out.println("voce digitou:" + z);
		
		sc.close();
	}
}