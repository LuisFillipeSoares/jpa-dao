package teste.basico;

import java.util.List;

import Infra.ProdutoDAO;
import modelo.basico.Produto;

public class ObterProdutosDAO {
	
	public static void main(String[] args) {
		
		ProdutoDAO dao = new ProdutoDAO();
		List<Produto> produtos = dao.obterTodos();
		
		for(Produto produto: produtos) {
			System.out.println("ID: " + produto.getId() + " | " + produto.getNome() + " | " + produto.getPreco());
		}
		
		double precoTotal = produtos
				.stream()
				.map(p -> p.getPreco())
				.reduce(0.0, (t, p) -> t + p)
				.doubleValue();
		System.out.println("O valor total é: " + precoTotal);

		dao.fechar();
		
	}
}
