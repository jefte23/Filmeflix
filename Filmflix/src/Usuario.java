
public class Usuario {
	// Atributos
	private String CPF;
	private String nome;
	private String sexo;
	private int idade;

	// Metodo Construtor
	public Usuario(String CPF, String nome, String sexo, int idade) {
		super();
		this.CPF = CPF;
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
	}

	// Metodo To String
	@Override
	public String toString() {
		return "Usuario [CPF=" + CPF + ", nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + "]";
	}

	// Metodos Get e Sets
	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
