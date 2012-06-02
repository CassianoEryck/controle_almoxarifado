package controleEstoque.arquivos;

import controleEstoque.entidades.EntradaProduto;
import controleEstoque.entidades.Produto;
import controleEstoque.entidades.SaidaProduto;
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
public class ControlGravaArquivos {
    static ControlCarregaArquivos controlCarregaArquivos;

    File file;
    File dir;
    EntradaProduto entradaProduto;
    SaidaProduto saidaProduto;
    
    /**
     * Construtor da classe ControlArquivosTexto
     * @param nomeArquivo selecione o tipo de arquivo (PRODUTO, FUNCIONARIO, LOGIN)
     * 
     */
    public ControlGravaArquivos(Arquivo nomeArquivo) {
        switch (nomeArquivo){
            case PRODUTO: 
                this.file = new File("produto.txt");
                this.dir = new File("Produtos");
            break;
            case FUNCIONARIO:
                this.file = new File("funcionario.txt");
                this.dir = new File("Funcionarios");
            break; 
            case LOGIN:
                this.file = new File("login.txt");                
            break; 
        }
    }
    
    /**
     * Cria um arquivo com a entrada de um produto
     * Primeiro ele cria o diretório(caso não exista) EntradaProdutos e o arquivo entradaProdutos+ idProduto + .txt 
     * @param entradaProduto Classe EntradaProduto para registrar uma entrada de um produto
     * @param id Id do produto correspondente a saida
     */
    public ControlGravaArquivos(EntradaProduto entradaProduto, int id) {
        this.dir = new File("Produtos/EntradaProdutos");       
        this.file = new File("Produtos/EntradaProdutos/entradaProduto" + Integer.toString(id) + ".txt");  
        this.entradaProduto = entradaProduto;
        gravaRegistroProduto(entradaProduto);
    }
    
     /**
     * Cria um arquivo com a entrada de um produto
     * @param saidaProduto Classe SaidaProduto para registrar uma saida de um produto
     * @param id Id do produto correspondente a saida
     */
    public ControlGravaArquivos(SaidaProduto saidaProduto, int id) {
        this.file = new File("entradaProduto" + Integer.toString(id) + ".txt");  
        this.saidaProduto = saidaProduto;
        gravaRegistroProduto(saidaProduto);
    }
    
    public void gravaRegistroProduto(EntradaProduto entradaProduto){
        String strAnterior = "";
        if(!dir.exists()){
           dir.mkdirs();
        }else{
            if(file.exists())                
                strAnterior = new ControlCarregaArquivos(file).retornaStringArquivo(file.getPath());    
        }                
        gravaRegistroProduto(strAnterior);
    }
    
    public void gravaRegistroProduto(SaidaProduto saidaProduto){
        String strAnterior = "";
        if(!file.exists())
            strAnterior = controlCarregaArquivos.retornaStringArquivo(file.getPath());            
        gravaRegistroProduto(strAnterior);
    }
    
    private void gravaRegistroProduto(String arquivoAnterior){
        String arquivo = "";
        if(arquivoAnterior != "" || arquivoAnterior != null){
            arquivo = arquivoAnterior;
        }
        
        arquivo += this.entradaProduto.toString();
        
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(arquivo);
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(ControlGravaArquivos.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }
    
    
    
    /**
     * Através de uma Lista de Produtos, será armazenada em um arquivo.
     * @param produtos Lista com todos os produtos do Sistema.
     */
    public void criaArquivoProduto(ListaProdutos produtos){       
       Produto produto;     
       
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
            Logger.getLogger(ControlGravaArquivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

