import java.util.Scanner;

public class Positivo {

	public static void main(String[] args) {
		int numero;
		int soma = 0;
		Scanner ler = new Scanner(System.in);
		
		do {
			
			System.out.println("Insira numeros positivos para serem somados, caso desejar sair insira um negativo: ");
			numero = ler.nextInt();
			if (numero >= 0)
				soma += numero;
			
		} while (numero >= 0);

		System.out.println("A soma é: " + soma);
	}

}