import java.util.ArrayList;
import java.util.List;

public class ListadeCompras extends Produto {

    public static void main(String [] args){

        Produto produto1 = new Produto ("SABONETE", Segmento.HIGIENE, 2.5, 6);

        Produto produto2 = new Produto ("FEIJAO", Segmento.ALIMENTACAO, 4.9, 2);

        Produto produto3 = new Produto ("DETERGENTE", Segmento.LIMPEZA, 0.99, 3);

        Produto produto4 = new Produto ("ARROZ", Segmento.ALIMENTACAO, 3.1, 1);

        List<Produto> Produto = new ArrayList<>();
        produtos.add(produto1);
    }
}
