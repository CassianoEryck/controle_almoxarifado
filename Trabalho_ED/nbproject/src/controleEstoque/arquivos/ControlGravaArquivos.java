package controleEstoque.arquivos;

import controleEstoque.entidades.EntradaProduto;
import controleEstoque.entidades.Produto;
import controleEstoque.entidades.SaidaProduto;
import controleEstoque.estruturaDados.ListaProdutos;
import controleEstoque.estruturaDados.No;
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

    public ControlGravaArquivos() {
    }
    /**
     * Construtor da classe ControlArquivosTexto
     * @param nomeArquivo selecione o tipo de arquivo (PRODUTO, FUNCIONARIO, LOGIN)
     * 
     */
    public ControlGravaArquivos(Arquivo nomeArquivo) {
        switch (nomeArquivo){
            case PRODUTO: 
                this.file = new File("Produtos/produto.txt");
                this.dir = new File("Produtos");
            break;
            case FUNCIONARIO:
                this.file = new File("Funcionario/funcionario.txt");
                this.dir = new File("Funcionarios");
            break; 
            case LOGIN:
                this.file = new File("Login/login.txt");
                this.dir = new File("Login");
            break; 
        }
        verificaDiretorio(file, dir);
    }
    
    private void verificaDiretorio(File file, File dir){
        if(!dir.exists())
            dir.mkdirs();
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
        this.dir = new File("Produtos/SaidaProdutos");
        this.file = new File("Produtos/SaidaProdutos/SaidaProduto" + Integer.toString(id) + ".txt");  
        this.saidaProduto = saidaProduto;
        gravaRegistroProduto(saidaProduto);
    }
    
    /**
     * Verifica se já existe algum arquivo existente seus diretórios e passa seu conteúdo para o returno
     * @return 
     */
    private String carregaArquivoAnterior(){
        String strAnterior = null;
        if(!dir.exists()){
           dir.mkdirs();
        }else{
            if(file.exists())                
                strAnterior = new ControlCarregaArquivos(file).retornaStringArquivo(file.getPath());    
        }   
        
        return strAnterior;
    }
    
    /**
     * Registra a entrada de um produto
     * @param entradaProduto 
     */
    public void gravaRegistroProduto(EntradaProduto entradaProduto){
        String strAnterior = carregaArquivoAnterior();                     
        gravaRegistroProduto(strAnterior, entradaProduto);
    }
    
    
    
    /**
     * Registra a saída de um produto
     * @param saidaProduto 
     */
    public void gravaRegistroProduto(SaidaProduto saidaProduto){
        String strAnterior = carregaArquivoAnterior();              
        gravaRegistroProduto(strAnterior, saidaProduto);
    }
    
    
    private void gravaRegistroProduto(String arquivoAnterior, Object objeto){
        String arquivo = "";
        if(arquivoAnterior != "" && arquivoAnterior != null){
            arquivo = arquivoAnterior;
        }
        
        arquivo += objeto.toString();
        
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
            No aux;
            aux = produtos.getLista();
            
            while(aux != null){
           
                produto = (Produto) aux.getObjeto();

                escreveNoArquivo(writer, produto.toString());

                aux = aux.getProx();
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
    
    public void escreveNoArquivo(String textoArquivo){
        try {            
            BufferedWriter bufWriter = new BufferedWriter(new FileWriter(new File(textoArquivo)));
            bufWriter.write(textoArquivo);
            bufWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(ControlGravaArquivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    

}

