package controleEstoque.arquivos;

import controleEstoque.entidades.Estatisticas;
import controleEstoque.entidades.Estoque;
import controleEstoque.entidades.Produto;
import controleEstoque.estruturaDados.ListaProdutos;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 * @author Eduardo Lacerda
 * Data: May 29, 2012
 */
public class ControlArquivosTexto {

    File file;
    
    /**
     * Construtor da classe ControlArquivosTexto
     * @param nomeArquivo selecione o tipo de arquivo (PRODUTO, FUNCIONARIO, LOGIN)
     * 
     */
    public ControlArquivosTexto(Arquivo nomeArquivo) {
        switch (nomeArquivo){
            case PRODUTO: 
                this.file = new File("produto.txt");
            break;
            case FUNCIONARIO:
                this.file = new File("funcionario.txt");
            break; 
            case LOGIN:
                this.file = new File("login.txt");
            break; 
        }
    }
    
    /**
     * Através de uma Lista de Produtos, será armazenada uma lista.
     * @param produtos Lista com todos os produtos do Sistema.
     */
    public void criaArquivoProduto(ListaProdutos produtos){       
       Produto produto;
       Estoque estoque;
       Estatisticas estatistica;
       
       try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            
            while(produtos.getLista().getProx() != null){
           
            produto = (Produto) produtos.getLista().getObjeto();
                       
            escreveNoArquivo(writer, produto.toString());
            
            produtos.setLista(produtos.getLista().getProx());
            }
            
            writer.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());            
        }
       
      
    }
    
    public File leArquivo(){
        if(file.exists()){
            return file;
        }else{
            return new File("");
        }    
    }
    
    private void escreveNoArquivo(BufferedWriter bufWriter, String textoArquivo){
        try {
            bufWriter.write(textoArquivo);
        } catch (IOException ex) {
            Logger.getLogger(ControlArquivosTexto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   
    
public enum Arquivo {
    PRODUTO, FUNCIONARIO, LOGIN
    
}      
    


}

