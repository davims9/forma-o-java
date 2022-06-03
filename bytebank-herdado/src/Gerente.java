 
public class Gerente extends Funcionario implements Autenticavel{
	
	public AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha (int senha) {
		this.autenticador.setSenha(senha);
	}
	
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

	public double getBonificacao() {
		return super.getSalario(); //super indica que veio da classe mãe(super classe)
	}
	
}
