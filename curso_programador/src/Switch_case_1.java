import java.util.Scanner;

public class Switch_case_1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int x = teclado.nextInt();
		String dia = "andre";

		switch (x) {
		case 1:
			dia = "Domingo";
			break;

		case 2:
			dia = "Segunda";
			break;

		case 3:
			dia = "terça";
			break;

		case 4:
			dia = "quarta";
			break;

		case 5:
			dia = "quinta";
			break;

		case 6:
			dia = "Sexta";
			break;

		case 7:
			dia = "sabado";
			break;

		default:
			dia = "valor invalido";
			break;

		}

		System.out.println("dia da semana: " + dia);
		teclado.close();
	}

}
