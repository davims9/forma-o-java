//classes abstratas n�o tem instancia, n�o criam objetos
public abstract class Funcionario {
	private String nome;
	private String cpf;
	private double salario; // protected deixa o atributo visivel para as classes filhas
	
	public abstract double getBonificacao(); //metodos abstratos n�o tem implementa��o, a implementa��o ficam nos filhos.
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
