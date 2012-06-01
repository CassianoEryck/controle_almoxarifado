package testes;

import controleEstoque.arquivos.Arquivo;
import controleEstoque.arquivos.ControlCarregaArquivos;
import controleEstoque.estruturaDados.ListaProdutos;
/**
 * @author Eduardo Lacerda
 * Data: May 30, 2012
 */
public class Teste {
    
    public static void main(String args[]){
        ListaProdutos lista = new ListaProdutos();
        
        ControlCarregaArquivos controlArquivo = new ControlCarregaArquivos(Arquivo.PRODUTO);
        lista = controlArquivo.carregaListaProdutos();        
        
        System.out.println(lista.percorreLista());
    }
            

}
