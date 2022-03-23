public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Teste de condições");
		
		int idade = 13;
		int acompanhantes = 0;
		
		if (idade > 18) {
			System.out.println("Sua idade é maior que 18");
			System.out.println("Pode entrar");
		} else if (idade == 18) {
			System.out.println("Sua idade é 18");
			System.out.println("Pode entrar");
		} else {
			System.out.println("Você tem menos de 18 anos");
			
			if (acompanhantes >= 1) {
				System.out.println("Mas está companhado, então pode entrar");
			} else {
				System.out.println("Você não pode entrar");
			}
		}
	}
}
