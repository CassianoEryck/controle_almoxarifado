package testes;

import controleEstoque.arquivos.Arquivo;
import controleEstoque.arquivos.ControlCarregaArquivos;
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
        Produto produto = new Produto(1,"lol","teste", 0.00, new Estoque(), new SaidaProduto(), new EntradaProduto(), "haha");
        ListaFornecedor lista = new ListaFornecedor();
        ControlRelatorios relatorio = new ControlRelatorios();
         ControlCarregaArquivos arquivo = new ControlCarregaArquivos(Arquivo.PRODUTO);
        
        for(int i =0; i < 4; i++){
            Fornecedor forn = new Fornecedor("Zé " + i);
            lista.adiciona(forn);
        }
        
        String texto = relatorio.geraRelatorioFornecedor(produto, lista);
        System.out.println(arquivo.retornaStringArquivo(texto));
        
        
       
        
    }
            

}
