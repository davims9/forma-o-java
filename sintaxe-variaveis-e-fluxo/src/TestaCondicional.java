public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Teste de condi��es");
		
		int idade = 13;
		int acompanhantes = 0;
		
		if (idade > 18) {
			System.out.println("Sua idade � maior que 18");
			System.out.println("Pode entrar");
		} else if (idade == 18) {
			System.out.println("Sua idade � 18");
			System.out.println("Pode entrar");
		} else {
			System.out.println("Voc� tem menos de 18 anos");
			
			if (acompanhantes >= 1) {
				System.out.println("Mas est� companhado, ent�o pode entrar");
			} else {
				System.out.println("Voc� n�o pode entrar");
			}
		}
	}
}
