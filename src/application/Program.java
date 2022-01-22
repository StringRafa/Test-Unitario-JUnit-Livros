package application;

public class Program {

	public static void main(String[] args) {
		
		PilhaTest test = new PilhaTest();
		boolean resultado;
		
		resultado = test.testLimiteAdicionarLivro();
		System.out.println("Teste Limite para adicinar livros: " + resultado);
		
		resultado = test.testRetiraUltimoLivro();
		System.out.println("Teste retirar último livro: " + resultado);
		
		resultado = test.testLivroComAouO();
		System.out.println("Teste livro com A ou O: " + resultado);
	}

}
