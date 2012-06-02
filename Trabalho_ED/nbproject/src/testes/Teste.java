package testes;

import controleEstoque.arquivos.Arquivo;
import controleEstoque.arquivos.ControlCarregaArquivos;
import controleEstoque.arquivos.ControlGravaArquivos;
import controleEstoque.arquivos.ControlRelatorios;
import controleEstoque.entidades.*;
import controleEstoque.estruturaDados.ListaFornecedor;
import java.io.File;
/**
 * @author Eduardo Lacerda
 * Data: May 30, 2012
 */
public class Teste {
    
    public static void main(String args[]){
       EntradaProduto entradaProduto = new EntradaProduto();
       SaidaProduto saidaProduto = new SaidaProduto();
       Produto produto = new Produto();
       ControlGravaArquivos controlGravaArquivos = new ControlGravaArquivos(entradaProduto, produto.getId());
  //      ControlGravaArquivos controlGravaArquivos = new ControlGravaArquivos(saidaProduto, produto.getId());
       
        
    }
            

}
