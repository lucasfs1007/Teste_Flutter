import java.util.Scanner;// Leitura de dados 
public class TrueFalse {

	public static void main(String[] args) {

			Scanner ler = new Scanner(System.in);
			String digito;
			boolean verifica;

			System.out.print("Digite o caracter a ser verificado:\n");
			digito = ler.nextLine();

			if (digito.matches("[0-9]*")) {
				verifica = true;
				System.out.println(verifica);
			} else {
				verifica = false;
				System.out.println(verifica);
			}

		}
	}
