package testeArrayList;

import java.util.ArrayList;

public class ProdutoServico {
	static ArrayList<Produto> ListaDeCompra = new ArrayList<>();
	static {
		Produto p1 = new Produto();
		p1.nome = "Macarrão";
		p1.preco = 15;
		ListaDeCompra.add(p1);
		
	}
	
}
