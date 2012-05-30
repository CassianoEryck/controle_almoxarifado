package controleEstoque.controladores;

import controleEstoque.arquivos.ControlArquivosTexto;
import controleEstoque.estruturaDados.ListaProdutos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;

/**
 * @author Eduardo Lacerda
 * Data: May 28, 2012
 */
public class ControlProduto {
    
    ListaProdutos listaProdutos = new ListaProdutos();
    ControlArquivosTexto controlArquivosTexto = new ControlArquivosTexto(ControlArquivosTexto.Arquivo.PRODUTO);    
    
    public File leArquivo(){
        return controlArquivosTexto.leArquivo();
    }
    
    public void criaLista(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(leArquivo()));
            
        } catch (Exception e) {
        }
        
       
        
    }
    
    
    

}
