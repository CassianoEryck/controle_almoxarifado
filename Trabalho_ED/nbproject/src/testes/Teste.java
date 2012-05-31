package testes;

import controleEstoque.entidades.Produto;
import controleEstoque.estruturaDados.ListaProdutos;

/**
 * @author Eduardo Lacerda
 * Data: May 30, 2012
 */
public class Teste {
    
    public static void main(String args[]){
        ListaProdutos lista = new ListaProdutos();
        
        Produto produto = new Produto();
        
        lista.adiciona(produto);
    }
            

}
