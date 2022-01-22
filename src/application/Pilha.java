package application;

import java.util.ArrayList;

public class Pilha {

	private int limite = 5;

	ArrayList<Livro> pilha = new ArrayList<Livro>();

	private IPilhaDAO pilhaDAO;
	
	public Pilha(IPilhaDAO pilhaDAO) {
		this.pilhaDAO = pilhaDAO;
	}

	public void push(Livro livro) {
		if (pilha.size() >= limite) {
			throw new ArrayStoreException();
		}
		if (!livro.getTitulo().startsWith("A") && !livro.getTitulo().startsWith("O")) {
			return;
		}

		pilha.add(livro);
		pilhaDAO.save(this);
	}

	public Livro pop() {
		Livro livro = pilha.get(pilha.size() - 1);
		pilha.remove(pilha.size() - 1);
		return livro;
	}

	public int count() {
		return pilha.size();
	}

}
