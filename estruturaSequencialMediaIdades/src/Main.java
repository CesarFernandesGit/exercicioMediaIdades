import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Digite as idades: ");
		int idade = scanner.nextInt();

		int contagem = 0;
		double soma = 0;

		if (idade < 0) {
			System.out.println("IMPOSSÍVEL CALCULAR");
		}
		else {
			while (idade > 0) {
				soma = soma + idade;
				contagem += 1;
				idade = scanner.nextInt();
			}
			System.out.printf("MEDIA = %.2f", soma / contagem);
		}
	
		scanner.close();

	}
}
