
public class Avaliacao {
	// Atributos
	private Usuario usuarios;
	private int nota;

	// Metodo construtor
	public Avaliacao(Usuario usuarios, int nota) {
		super();
		this.usuarios = usuarios;
		this.nota = nota;
	}

	// metodo Get e Set
	public Usuario getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuario usuarios) {
		this.usuarios = usuarios;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

}
