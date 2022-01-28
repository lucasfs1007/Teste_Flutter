import java.util.Scanner; //leitura de dados
public class TrueFalse {

	public static void main(String[] args) {
		int numero;
    	Scanner ler = new Scanner(System.in);
    	System.out.print("Digite o numero:\n");
    	numero = ler.nextInt();
        boolean res = false; //Impares, não pares
        if( (numero % 2) == 0) //Numeros pares
            res = true;
        System.out.print(res);
    }
}