
public class TestaMetodos {

	public static void main(String[] args) {
		Desenvolvedor f1 = new Desenvolvedor();
		
		f1.setNome("Davi Moura Souza");
		f1.setCpf("01358880014");
		f1.setSalario(8000);
		
		System.out.println(f1.getNome());
		System.out.println(f1.getCpf());
		System.out.println(f1.getSalario());
		System.out.println(f1.getBonificacao());
		
		Gerente g1 = new Gerente();
		
		g1.setNome("Lucia Maria de Moura Souza");
		g1.setCpf("08516922299");
		g1.setSalario(17000);
		g1.setSenha(025444);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		System.out.println(g1.getBonificacao());
		System.out.println(g1.autentica(2212145));
		System.out.println(g1.autentica(025444));
	}

}

