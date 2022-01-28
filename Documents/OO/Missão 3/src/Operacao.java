import java.util.Scanner;
import java.io.Console;
import java.lang.System.Logger;
public class Operacao {

	public static void main(String[] args) {
		 	int n1;
		 	int n2;
		 	int resultado;
	        String operacao;

	        Scanner ler = new Scanner(System.in);

	        System.out.println("Insira a operação a ser realizada (+, - ou *):");
	        operacao = ler.nextLine();
	        System.out.println("Insira o primeiro número:");
	        n1 = ler.nextInt();
	        System.out.println("Insira o segundo número:");
	        n2 = ler.nextInt();
	        switch (operacao) {
	        case "+": {
	            resultado = n1 + n2;
	            System.out.println("O resultado da operação é: "+resultado);
	            break;
	        }
	        case "-": {
	            resultado = n1 - n2;
	            System.out.println("O resultado da operação é: "+resultado);
	            break;
	        }
	        case "*": {
	            resultado = n1 * n2;
	            System.out.println("O resultado da operação é: "+resultado);
	            break;
	        }
	        default:
	            System.out.println("Operação inválida");
	        }

	    }

	}
