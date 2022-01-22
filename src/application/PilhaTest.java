package application;

public class PilhaTest {

	public boolean testRetiraUltimoLivro() {
		Pilha pilha = new Pilha();
		Livro livro = new Livro("A Fortaleza");
		pilha.push(livro);

		livro = new Livro("A Emboscada");
		pilha.push(livro);

		livro = new Livro("O Naufrago");
		pilha.push(livro);

		String resultadoEsperado = "O Naufrago";

		return pilha.pop().getTitulo().equals(resultadoEsperado);
	}

	public boolean testLimiteAdicionarLivro() {
		Pilha pilha = new Pilha();
		Livro livro1 = new Livro("A Fortaleza");
		Livro livro2 = new Livro("A Emboscada");
		Livro livro3 = new Livro("O Palhaço");
		Livro livro4 = new Livro("A Terra");
		Livro livro5 = new Livro("O Sol");
		Livro livro6 = new Livro("A Lua");

		pilha.push(livro1);
		pilha.push(livro2);
		pilha.push(livro3);
		pilha.push(livro4);
		pilha.push(livro5);
		pilha.push(livro6);

		String resultadoEsperado = "O Sol";

		return pilha.pop().getTitulo().equals(resultadoEsperado);
	}

	public boolean testLivroComAouO() {
		Pilha pilha = new Pilha();
		Livro livro1 = new Livro("A Fortaleza");
		pilha.push(livro1);
		Livro livro2 = new Livro("Homem");
		pilha.push(livro2);

		String resultadoEsperado = "A Fortaleza";

		return pilha.pop().getTitulo().equals(resultadoEsperado);
	}
}
