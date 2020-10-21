package teste.basico;

import Infra.NovoDAO;
import modelo.basico.Produto;

public class NovoProdutoDao {

	public static void main(String[] args) {
	
		NovoDAO dao = new NovoDAO();
		Produto po = new Produto("Lapis", 1.50);
		dao.incluirAtomico(po);
		dao.fechar();

	}

}
