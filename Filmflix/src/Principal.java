import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		// Instanciaro Banco de dados BDSimulado
		BDSimulado bds = new BDSimulado();

		// Recuperar a lista de filmmes e usuarios
		ArrayList<Filme> filmes = bds.getFilmes();
		ArrayList<Usuario> usuarios = bds.getUsuarios();

		// Exibindo filmes que foram feitos depois o ano 2000
		for (int i = 0; i < filmes.size(); i++) {
			if (filmes.get(i).getAnoLancamento() > 2000) {
				System.out.println(filmes.get(i).getTitulo() + " - " + filmes.get(i).getGenero());
			}
		}

		ArrayList<Filme> filmesPorAno = bds.getFilmesPorAno(1999);

		for (int i = 0; i < filmesPorAno.size(); i++) {
			System.out.println(filmesPorAno.get(i).getTitulo());

		}

		ArrayList<Filme> filmesPorDiretor = bds.getListaFilmeDiretor("Jorge Lucas");
		for (int i = 0; i < filmesPorDiretor.size(); i++) {
			System.out.println(filmesPorDiretor.get(i).getTitulo());

		}

	}

}
