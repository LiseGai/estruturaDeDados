package estruturaLinear;

public class Cliente {
	private String cpf, nome;
	
	public Cliente(String novoCPF, String novoNome) {
		this.cpf = novoCPF; 
		this.nome = novoNome; 
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	} 
	
	public String toString(){
		return this.nome;
	}

}
