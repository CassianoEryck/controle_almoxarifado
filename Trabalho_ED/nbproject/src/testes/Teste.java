package testes;

import controleEstoque.arquivos.ControlRelatorios;
import controleEstoque.entidades.EntradaProduto;
import controleEstoque.entidades.Produto;

/**
 * @author Eduardo Lacerda
 * Data: May 30, 2012
 */
public class Teste {
    
    public static void main(String args[]){
       
       EntradaProduto entradaProduto = new EntradaProduto();
       Produto produto = new Produto();
       ControlRelatorios cr = new ControlRelatorios();
       String geraRelatorioProdutos = cr.geraRelatorioProdutos(produto, entradaProduto);
        
       System.out.println(geraRelatorioProdutos);
        
    }
            

}
