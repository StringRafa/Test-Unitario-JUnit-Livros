package application;

public class PilhaDAO implements IPilhaDAO {

	@Override
	public void save(Pilha p) {
		System.out.println("Eu salvo a pilha no Banco");
	}
}
