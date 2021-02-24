import java.util.Locale;
import java.util.Scanner;


public class Next_line{
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextInt(); // consumindo o espaço em braco entre o numero int e a proxima linha.
		s1 = sc.nextLine(); // o nextLine() serve para vc pegar frases de strings, ele é igual o next() que pega somente palavras;
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("dados digitados:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}
}