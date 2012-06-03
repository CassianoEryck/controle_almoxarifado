/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleEstoque.arquivos;

import controleEstoque.entidades.Estatisticas;
import controleEstoque.entidades.Estoque;
import controleEstoque.entidades.Produto;
import controleEstoque.estruturaDados.ListaProdutos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ControlCarregaArquivos {
    
    File file;

    public ControlCarregaArquivos() {
        file = null;
    }
    
    
    
    public ControlCarregaArquivos(File file){
        this.file = file;
    }
    
    public ControlCarregaArquivos(Arquivo arquivo){
        switch (arquivo){
            case PRODUTO: 
                this.file = new File("Produtos/produto.txt");
            break;
            case FUNCIONARIO:
                this.file = new File("Funcionarios/funcionario.txt");
            break; 
            case LOGIN:
                this.file = new File("Login/login.txt");
            break; 
        }        
    }
    
    /**
     * verifica se o arquivo existe
     * @return true se existe, false se não.
     */
    public boolean verificaArquivo(){
        if(file.exists())
            return true;
        
        return false;
                    
    }
    
    /**
     * Carrega a lista de produtos direto do bloco de notas
     * @return a Lista completa com todos arquivos salvos
     */
    public ListaProdutos carregaListaProdutos(){
        ListaProdutos lista = new ListaProdutos();
        
        if(verificaArquivo()){
            try {                
                BufferedReader bufReader = new BufferedReader(new FileReader(file));
                String strReader = bufReader.readLine();
                int i = 0;                
                Produto produto = new Produto();
                Estoque estoque = new Estoque();
                Estatisticas estatistica = new Estatisticas();
                
                while(strReader != null){
                    switch (i){
                        case 0:                            
                            produto.setId(Integer.parseInt(strReader));                           
                        break;
                            
                        case 1:                            
                            produto.setNome(strReader);                           
                        break;
                            
                        case 2:
                           produto.setDescricao(strReader);                                                   
                        break;
                            
                        case 3:
                            produto.setValorUnitario(Double.parseDouble(strReader)); 
                        break;
                            
                        case 4:
                            estatistica.setVendaMediaMensal(Double.parseDouble(strReader));
                        break;   
                            
                        case 5:
                            estatistica.setTempoCobertura(Double.parseDouble(strReader));
                        break;   
                            
                        case 6:
                            estatistica.setEstoqueMinimo(Integer.parseInt(strReader));
                        break;   
                            
                        case 7:
                            estatistica.setEstoqueMaximo(Integer.parseInt(strReader));                                                       
                        break;                               
                            
                       case 8:
                            estoque.setQuantidade(Integer.parseInt(strReader));
                        break;        
                    }
                  i++;
                  if(i == 9){
                      estoque.setEstatistica(estatistica);
                      produto.setEstoque(estoque);
                      lista.adiciona(produto);
                      i = 0;
                  }
                      
                  strReader = bufReader.readLine();
                }
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
            
        }
        
        return lista;
    }
    
    /**
     * Retorna o conteúdo de um arquivo de texto
     * @param arquivo diretório do arquivo de texto.
     * @return conteúdo do arquivo
     */
    public String retornaStringArquivo(String arquivo){
        String strReader = "", strFinal = "";        
        try{
            BufferedReader bufReader = new BufferedReader(new FileReader(arquivo));
            
            strReader = bufReader.readLine();            
            while(strReader != null){
                strFinal += strReader + "\n";
                strReader = bufReader.readLine();
            }
            
            bufReader.close();
        }catch (Exception e){
            strReader = "";
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
        return strFinal;
    }
    
    public String[] retornaStringArquivo(){
        String strReader = "", strFinal = "";        
        String[] vetRetorno = null;
        int index = 0;
        try{
            BufferedReader bufReader = new BufferedReader(new FileReader(this.file));
            while((strReader = bufReader.readLine()) != null)
                index++;
            bufReader.close();
            
            vetRetorno = new String[index];
            index = 0;
            bufReader = new BufferedReader(new FileReader(this.file));
            while((strReader = bufReader.readLine()) != null){
                vetRetorno[index] = strReader;
                index++;
            }
            
            
        }catch (Exception e){
            strReader = "";
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
        return vetRetorno;
    }
    
}
