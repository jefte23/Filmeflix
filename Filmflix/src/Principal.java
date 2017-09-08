import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		// Instanciaro Banco de dados BDSimulado
		BDSimulado bds = new BDSimulado();

		// Recuperar a lista de filmmes e usuarios
		ArrayList<Filme> filmes = bds.getFilmes();

		/* ArrayList<Usuario> usuarios = bds.getUsuarios(); */

		// Exibindo filmes que foram feitos depois o ano 2000
		for (int i = 0; i < filmes.size(); i++) {
			if (filmes.get(i).getAnoLancamento() > 2000) {
				System.out.println(filmes.get(i).getTitulo() + " - " + filmes.get(i).getGenero());
			}
		}

		System.out.println("---------------------------");

		ArrayList<Filme> filmesPorAno = bds.getFilmesPorAno(1999);

		for (int i = 0; i < filmesPorAno.size(); i++) {
			System.out.println(filmesPorAno.get(i).getTitulo());

		}

		System.out.println("---------------------------");

		ArrayList<Filme> filmesPorDiretor = bds.getListaFilmeDiretor("Jorge Lucas");
		for (int i = 0; i < filmesPorDiretor.size(); i++) {
			System.out.println(filmesPorDiretor.get(i).getTitulo());

		}

		System.out.println("---------------------------");

		ArrayList<Filme> filmesPorGenero = bds.getFilmePorGenero("Drama");
		for (int i = 0; i < filmesPorGenero.size(); i++) {
			System.out.println(filmesPorGenero.get(i).getTitulo());

		}

		System.out.println("---------------------------");

		ArrayList<Filme> FilmesPorNome = bds.getFilmePorNome("Star Wars");
		for (int i = 0; i < FilmesPorNome.size(); i++) {
			System.out.println(FilmesPorNome.get(i).getTitulo() + ", " + FilmesPorNome.get(i).getGenero() + ", "
					+ FilmesPorNome.get(i).getAnoLancamento());

		}

	}

}
