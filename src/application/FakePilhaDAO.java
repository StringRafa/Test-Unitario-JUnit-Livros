package application;

public class FakePilhaDAO implements IPilhaDAO {

	@Override
	public void save(Pilha p) {

		System.out.println("N�o me comunico com o Banco de Dados");

	}

}
