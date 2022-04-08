public class TestaReferencias {
	public static void main (String[] args) {
		Funcionario d1 = new Desenvolvedor ();
		Gerente g1 = new Gerente();
		Funcionario c1 = new Coordenador();
		
		g1.setSalario(10000);
		d1.setSalario(6000);
		c1.setSalario(8000);
		
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registra(d1);
		
		System.out.println(controle.getSoma());
		
		controle.registra(c1);
		
		System.out.println(controle.getSoma());
		
		controle.registra(g1);
		
		System.out.println(controle.getSoma());
	}
}
