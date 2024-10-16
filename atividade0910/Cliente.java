package atividade0910;

public class Cliente {
	private int id;
	private String nome;
	private String telefone;
	private String cpf;
	private String RG;
	
	public Cliente(int id, String nome, String telefone, String cpf, String RG) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
		this.RG = RG;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String RG) {
		this.RG = RG;
	}
	public void exibindoCliente() {
		System.out.println("ID: " + id + ", Nome: " + nome + ", Telefone: " + telefone + "CPF: " + cpf + ", RG: " + RG);
	}
}