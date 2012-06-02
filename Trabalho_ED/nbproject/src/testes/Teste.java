package testes;

import controleEstoque.arquivos.ControlGravaArquivos;
import controleEstoque.arquivos.ControlRelatorios;
import controleEstoque.entidades.EntradaProduto;
import controleEstoque.entidades.Produto;
import controleEstoque.entidades.SaidaProduto;

/**
 * @author Eduardo Lacerda
 * Data: May 30, 2012
 */
public class Teste {
    
    public static void main(String args[]){
       
       SaidaProduto entradaProduto = new SaidaProduto();
       Produto produto = new Produto();
       ControlRelatorios cr = new ControlRelatorios();
       ControlGravaArquivos ga = new ControlGravaArquivos(entradaProduto, produto.getId());
       String geraRelatorioProdutos = cr.geraRelatorioProdutos(produto, entradaProduto);
        
       System.out.println(geraRelatorioProdutos);
        
    }
            

}
