package application;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PillhaTestFixture {

	private static Pilha pilha;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		pilha = new Pilha();
		System.out.println("Executou o @BeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		pilha = null;
		System.out.println("Executou o @AfterClass");
	}

	@Before
	public void setUp() throws Exception {
		Livro livro1 = new Livro("A Fortaleza");
		Livro livro2 = new Livro("A Emboscada");
		Livro livro3 = new Livro("O Palhaço");
		Livro livro4 = new Livro("A Lua");
		Livro livro5 = new Livro("O Sol");

		pilha.push(livro1);
		pilha.push(livro2);
		pilha.push(livro3);
		pilha.push(livro4);
		pilha.push(livro5);

		System.out.println("Executou o @Before");

	}

	@After
	public void tearDown() throws Exception {
		int tamanho = pilha.count();
		while (tamanho > 0) {
			pilha.pop();
			tamanho--;
		}
		System.out.println("Executou o @After");
	}

	@Test
	public void testLimiteAdicionarLivro() {

		try {
			pilha.push(new Livro("A volta ao mundo"));
			fail();
		} catch (ArrayStoreException e) {
			assertTrue(true);
		}
		System.out.println("Executou testtestLimiteAdicionarLivro");
	}

	@Test(expected = ArrayStoreException.class)
	public void testLimiteAdicionarLivroException() {

		pilha.push(new Livro("A volta ao mundo"));

		System.out.println("Executou testtestLimiteAdicionarLivro");
	}

	@Test
	public void testLivroComAouO() {
		pilha.pop();
		pilha.push(new Livro("Nao vale"));
		Livro livro = pilha.pop();

		assertEquals("A Lua", livro.getTitulo());
		System.out.println("Executou testLivroComAouO");
	}

}
