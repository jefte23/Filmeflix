import java.util.ArrayList;

public class BDSimulado {
	// Atributos
	private ArrayList<Filme> filmes;
	private ArrayList<Usuario> usuarios;

	// Metodo COnstrutor
	public BDSimulado() {

		// instanciar o atributo fimes
		this.filmes = new ArrayList<Filme>();

		// Instanciar objetos
		Filme f1 = new Filme("Star Wars", "Jorge Lucas", 1977, "Ficçã cientifica", null);
		Filme f2 = new Filme("Star Wars 7: O despertar da força", "Jorge Lucas", 2015, "Ficçã cientifica", null);
		Filme f3 = new Filme("Forest Gump", "Robert Zemeckis", 1994, "Drama", null);
		Filme f4 = new Filme("Clube da luta", "David Fincher", 1999, "Drama", null);
		Filme f5 = new Filme("Os Outros", "Alejandro Amenábar", 2001, "suspense", null);
		Filme f6 = new Filme("Titanic", "James Cameron", 1997, "Romance", null);

		// colocar os filmes na Lista
		this.filmes.add(f1);
		this.filmes.add(f2);
		this.filmes.add(f3);
		this.filmes.add(f4);
		this.filmes.add(f5);
		this.filmes.add(f6);

		// Instanciar o atributo usuario
		this.usuarios = new ArrayList<Usuario>();

		// instancia objetos da clase usuario
		Usuario u1 = new Usuario("12356412", "João", "Masculino", 55);
		Usuario u2 = new Usuario("02919223", "José", "Masculino", 15);
		Usuario u3 = new Usuario("12345677", "Adão", "Masculino", 45);
		Usuario u4 = new Usuario("09012912", "Maria", "Feminino", 27);
		Usuario u5 = new Usuario("03379190", "Juliana", "Feminino", 42);
		Usuario u6 = new Usuario("12123456", "Alice", "Feminino", 16);

		// Colocar usuarios na lista
		this.usuarios.add(u1);
		this.usuarios.add(u2);
		this.usuarios.add(u3);
		this.usuarios.add(u4);
		this.usuarios.add(u5);
		this.usuarios.add(u6);

	}

	public ArrayList<Filme> getFilmes() {
		return filmes;
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	// Metodo que retorna a lista de filmes de um ano informado
	public ArrayList<Filme> getFilmesPorAno(int ano) {
		ArrayList<Filme> resultado = new ArrayList<Filme>();

		// Percorrer a lista de filmes
		for (int i = 0; i < filmes.size(); i++) {
			// verificar se o filme é do ano informado
			if (filmes.get(i).getAnoLancamento() == ano) {
				resultado.add(this.filmes.get(i));
			}

		}

		return resultado;
	}

	// Metodo que retorna a lista de filmes de um diretor
	public ArrayList<Filme> getListaFilmeDiretor(String diretor) {
		ArrayList<Filme> resultado = new ArrayList<Filme>();

		// Percorrer lista de filmes
		for (int i = 0; i < filmes.size(); i++) {
			// Veerificar se o file é do diretor
			if (this.filmes.get(i).getDiretor().equals(diretor)) {
				resultado.add(this.filmes.get(i));
			}

		}
		return resultado;
	}

	// Metodo que retorna filme pelo genero
	public ArrayList<Filme> getFilmePorGenero(String genero) {
		ArrayList<Filme> resultado = new ArrayList<>();

		// percorrer lista de filmes
		for (int i = 0; i < filmes.size(); i++) {
			if (this.filmes.get(i).getGenero().equals(genero)) {
				resultado.add(this.filmes.get(i));
			}
		}
		return resultado;
	}

	public Usuario getUsuarioPorCPF(String CPU) {

		Usuario resultado = null;
		// Percorre a lista de usuarios
		for (int i = 0; i < this.usuarios.size(); i++) {
			// Verificar se CPF corresponde ao CPF informado
			if (this.usuarios.get(i).getCPF().equals(CPU)) {
				resultado = this.usuarios.get(i);
			}
		}

		return resultado;
	}

	// Metodo busca filme por nome
	public Filme getFilmePorNome(String nome) {
		Filme resultado = null;

		// Pecorrer lista de filme
		for (int i = 0; i < this.filmes.size(); i++) {
			if (this.filmes.get(i).getTitulo().equals(nome)) {
				resultado = this.filmes.get(i);
			}
		}
		return resultado;
	}

	// Metodo que dá avaliação a um filme
	public void addAvaliacaoFilme(String nomeFilme, String CPFUsuario, int notaFilme) {
		// Declarar um objeto de avaliação
		Avaliacao avaliacao = new Avaliacao(getUsuarioPorCPF(CPFUsuario), notaFilme);

		// percorrer a lista de filme
		for (int i = 0; i < this.filmes.size(); i++) {
			if (this.filmes.get(i).getTitulo().equals(nomeFilme)) {
				this.filmes.get(i).getAvaliacoes().add(avaliacao);
			}

		}
	}

	public ArrayList<Filme> getBuscaAvaliacao(int valor) {

		ArrayList<Filme> resultado = new ArrayList<>();

		// Percorrer Lista
		for (int i = 0; i < this.filmes.size(); i++) {
			for (int j = 0; j < filmes.get(i).getAvaliacoes().size(); j++) {
				if (this.filmes.get(i).getAvaliacoes().get(j).getNota() >= valor) {
					resultado.add(this.filmes.get(i));
				}
			}
		}
		return resultado;
	}

}
