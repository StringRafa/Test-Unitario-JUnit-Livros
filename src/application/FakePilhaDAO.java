package application;

public class FakePilhaDAO implements IPilhaDAO {

	@Override
	public void save(Pilha p) {

		System.out.println("Não me comunico com o Banco de Dados");

	}

}
