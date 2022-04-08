public class TestaMetodos {
	
	public static void main(String[] args) {
		ContaCorrente CC = new ContaCorrente(1919,999999);
		
		Cliente davi = new Cliente();
		
		CC.deposita(200);
		
		
		davi.setNome("Davi Moura Souza"); //define nome = a Davi Moura Souza, mas o objeto davi 
											//ainda não tinha vinculo com objeto conta
		
		CC.setTitular(davi);//referenciei a o objeto conta ao objeto davi
		
		CC.getTitular().setProfissao("Dev");
		
		System.out.println("Titular é  " + CC.getTitular());
		System.out.println("Titular é  " + davi);
		System.out.println("Titular é  " + CC.getTitular().getNome());
		System.out.println("Titular é  " + CC.getTitular().getProfissao());
		System.out.println("O Saldo da conta é de " + CC.getSaldo());
		System.out.println(Conta.getTotal());
		
		ContaPoupanca CP = new ContaPoupanca(1999,9191919);
		
		System.out.println(Conta.getTotal());
		
		CP.deposita(1000);
		
		CC.transfere(100, CP);
		
		System.out.println("O Saldo da CC é de " + CC.getSaldo());
		System.out.println("O Saldo da CP é de " + CP.getSaldo());
	}
}
