public class Fatorial {
	public static void main(String[] args) {
		int fatorial = 1;
		for (int contador = 1; contador <= 10; contador++) {
			System.out.print("O fatorial do numero "+contador+" é: ");
			fatorial *= contador;
			System.out.println(fatorial);
		}
	}
}

/*	
public class Fatorial {
	public static void main(String[] args) {
		for (int contador = 1; contador <= 10; contador++) {
			System.out.print("O fatorial do numero "+contador+" é: ");
			int soma = 1;
			for (int fatorial = contador; fatorial > 0; fatorial--) {
				soma = soma * fatorial;
			}
			System.out.println(soma);
		}
	}
}
	
*/