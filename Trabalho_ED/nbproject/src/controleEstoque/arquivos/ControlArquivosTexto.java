package controleEstoque.arquivos;

import controleEstoque.entidades.Estatisticas;
import controleEstoque.entidades.Estoque;
import controleEstoque.entidades.Funcionario;
import controleEstoque.entidades.Produto;
import java.io.*;
import javax.swing.JOptionPane;


/**
 * @author Eduardo Lacerda
 * Data: May 29, 2012
 */
public class ControlArquivosTexto {

    File file;
    
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
    
    public void criaArquivoProduto(Produto produto){
        if(file.exists()){
            String arquivoProdutos = carregaArquivo();
            escreveArquivoProduto(produto, arquivoProdutos);
        }else{
            escreveArquivoProduto(produto, "");
        }
    }
    
    public String carregaArquivo(){
        String string = "";
        String strReader = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            string = bufferedReader.readLine();            
            while(string != null){
                strReader += string + "\n";
                string = bufferedReader.readLine();                
            }        
            bufferedReader.close();
        }   catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());            
        }
        
        return strReader;
    }
    
    public File leArquivo(){
        if(file.exists()){
            return file;
        }else{
            return new File("");
        }
                
    }
    
    private void escreveArquivoProduto(Produto produto, String arquivoAnterior){
            try {                
                BufferedWriter bufWriter = new BufferedWriter(new FileWriter(file));
                Estoque estoque = produto.getEstoque();
                Estatisticas estatistica = estoque.getEstatistica();
                
                bufWriter.write(arquivoAnterior);                              
                bufWriter.write(produto.getId());
                bufWriter.newLine();
                bufWriter.write(produto.getDescricao());
                bufWriter.newLine();
                bufWriter.write(Double.toString(produto.getValorUnitario()));
                bufWriter.newLine();
                bufWriter.write(Integer.toString(estoque.getQuantidade()));
                bufWriter.newLine();
                bufWriter.write(Double.toString(estatistica.getVendaMediaMensal()));
                bufWriter.newLine();
                bufWriter.write(Double.toString(estatistica.getTempoCobertura()));
                bufWriter.newLine();
                bufWriter.write(Integer.toString(estatistica.getEstoqueMinimo()));
                bufWriter.newLine();
                bufWriter.write(Integer.toString(estatistica.getEstoqueMaximo()));
                bufWriter.newLine();
                
                bufWriter.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    private void criaArquivoFuncionario(Funcionario funcionario){
        if(file.exists()){
            String arquivoFuncionarios = carregaArquivo();
            escreveArquivoFuncionario(funcionario, arquivoFuncionarios);
        }else{
            escreveArquivoFuncionario(funcionario);
        }
    }
    
    private void escreveArquivoFuncionario(Funcionario funcionario){
         try {                
                BufferedWriter bufWriter = new BufferedWriter(new FileWriter(file));                
                
                bufWriter.write(funcionario.getNome());
                bufWriter.newLine();
                bufWriter.write(funcionario.getCargo());
                bufWriter.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    private void escreveArquivoFuncionario(Funcionario funcionario, String arquivoAnterior){
        try {                
                BufferedWriter bufWriter = new BufferedWriter(new FileWriter(file));                
                
                bufWriter.write(arquivoAnterior);                              
                bufWriter.write(funcionario.getNome());
                bufWriter.newLine();
                bufWriter.write(funcionario.getCargo());
                bufWriter.newLine();
                
                bufWriter.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
public enum Arquivo {
    PRODUTO, FUNCIONARIO, LOGIN
    
}      
    


}

