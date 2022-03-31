public class TestaMetodos {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1919,999999);
		
		Cliente davi = new Cliente();
		
		conta.deposita(200);
		
		
		davi.setNome("Davi Moura Souza"); //define nome = a Davi Moura Souza, mas o objeto davi 
											//ainda não tinha vinculo com objeto conta
		
		conta.setTitular(davi);//referenciei a o obejto conta ao objeto davi
		
		conta.getTitular().setProfissao("Dev");
		
		System.out.println("Titular é  " + conta.getTitular());
		System.out.println("Titular é  " + davi);
		System.out.println("Titular é  " + conta.getTitular().getNome());
		System.out.println("Titular é  " + conta.getTitular().getProfissao());
		System.out.println("O Saldo da conta é de " + conta.getSaldo());
		System.out.println(Conta.getTotal());
		
		Conta conta2 = new Conta(1999,9191919);
		
		System.out.println(Conta.getTotal());
	}
}
