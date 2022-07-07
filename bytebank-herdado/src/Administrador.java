
public class Administrador extends Funcionario implements Autenticavel {
	public AutenticacaoUtil autenticador;
	
	public Administrador() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha (int senha) {
		this.autenticador.setSenha(senha);
	}
	
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

	
	@Override
	public double getBonificacao() {
		return 100;
	}
	

}
