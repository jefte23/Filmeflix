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

		Usuario usuario = bds.getUsuarioPorCPF("03379190");
		System.out.println(usuario);

		System.out.println("---------------------------");

		Filme filme = bds.getFilmePorNome("Star Wars");
		System.out.println(filme);

		// Criar avaliações para ps filmes
		bds.addAvaliacaoFilme("Star Wars", "12356412", 5);
		bds.addAvaliacaoFilme("Clube da luta", "02919223", 4);
		bds.addAvaliacaoFilme("Star Wars 7: O despertar da força", "09012912", 3);
		bds.addAvaliacaoFilme("Forest Gump", "12123456", 4);
		bds.addAvaliacaoFilme("Os Outros", "09012912", 3);

		// Listar todos os filmes com avaliacao >= 4

		System.out.println("---------------------------");

		ArrayList<Filme> filmesPorNota = bds.getBuscaAvaliacao(4);
		for (int i = 0; i < filmesPorNota.size(); i++) {
			System.out.println(filmesPorNota.get(i).getTitulo());

		}
	}

}
