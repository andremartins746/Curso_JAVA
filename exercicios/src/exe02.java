import java.util.Scanner;
import java.util.Locale;


public class exe02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			double area, raio;
			
			System.out.println("digite o raio: ");
			raio = sc.nextDouble();
			
			area = 3.14159 * Math.pow(raio, 2);
			System.out.printf("este é a área: %.4f", area);
		
		
			sc.close();
	}

}
