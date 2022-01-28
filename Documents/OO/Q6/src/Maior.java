import java.util.Scanner; //Leitura de dados
public class Maior {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		int maiorNumero = 0;

		System.out.print("Entre com o  primeiro numero:\n");
		numero = ler.nextInt(); //Lendo número
		if (numero > maiorNumero)
			maiorNumero = numero; //Verificando o maior número
		numero = 0; //Reiniciando variavel
		System.out.print("Entre com o segundo numero:\n");
		numero = ler.nextInt();
		if (numero > maiorNumero)
			maiorNumero = numero;//Verificando o maior número
		numero= 0;
		System.out.print("Entre com o terceiro numero:\n");
		numero = ler.nextInt();
		if (numero > maiorNumero)
			maiorNumero = numero;//Verificando o maior número
		numero = 0;
		System.out.print("Entre com o quarto numero:\n");
		numero = ler.nextInt();
		if (numero > maiorNumero)
			maiorNumero = numero;//Verificando o maior número
		numero = 0;
		System.out.print("Entre com o quinto numero:\n");
		numero = ler.nextInt();
		if (numero> maiorNumero)
			maiorNumero = numero;//Verificando o maior número
		numero = 0;

		System.out.print(maiorNumero); //Printando maior numero

	}
}