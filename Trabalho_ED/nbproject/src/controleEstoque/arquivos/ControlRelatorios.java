package controleEstoque.arquivos;

import controleEstoque.entidades.EntradaProduto;
import controleEstoque.entidades.Fornecedor;
import controleEstoque.entidades.Produto;
import controleEstoque.entidades.SaidaProduto;
import controleEstoque.estruturaDados.ListaFornecedor;
import controleEstoque.estruturaDados.No;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ControlRelatorios {    
   
    /**
     * A partir de um determinado produto e de uma lista de fornecedores é gerado um relatório dos Fornecedores
     * por este produto.
     * @param produto produto especifico
     * @param listaFornecedor lista de fornecedores do produto
     * @return O local do arquivo de texto
     */
    public String geraRelatorioFornecedor(Produto produto, ListaFornecedor listaFornecedor ){
        File file = new File(produto.getNome() + ".txt");               
        No aux;
          
            try {                
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                writer.write("---------- Relatório Fornecedor ----------");
                writer.newLine();
                writer.write("Produto: " + produto.getNome());
                writer.newLine();
                writer.write("---------- Fornecedores ------------------");
                writer.newLine();
                aux = listaFornecedor.getInicio();
                
                int i = 1;
                
                while(aux != null){
                    Fornecedor fornecedor = (Fornecedor) aux.getObjeto();
                    writer.write("Nome: " + fornecedor.getNome());
                    writer.newLine();
                    writer.write("Telefone: " + fornecedor.getTelefone());
                    writer.newLine();
                    writer.newLine();
                    aux = aux.getProx();
                    i++;
                }
                
                writer.write("-----------------------------------------");
                writer.newLine();
                writer.write("Total: " + Integer.toString(i));
                writer.newLine();
                writer.write("Data: " + new SimpleDateFormat("dd/mm/yyyy").format(new Date()));
                writer.close();
                
            } catch (Exception e) {
                return "";
            }
            
            return file.getPath();
      
    
    }
    
    int total = 0;    
    /**
     * Gera relatório de entrada de produtos
     * @param produto
     * @param entradaProduto
     * @return 
     */
    public String geraRelatorioProdutos(Produto produto, EntradaProduto entradaProduto){
        File arquivoProduto = new File("Produtos/EntradaProdutos/entradaProduto" + Integer.toString(produto.getId())+".txt");
        File arquivoRelatorio = new File("Produtos/EntradaProdutos/RelatorioProduto" + produto.getNome() + Integer.toString(produto.getId()) + ".txt");
        if(arquivoProduto.exists()){            
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoRelatorio));
                writer.write("--- Relatório Entrada Produto ----------");
                writer.newLine();
                writer.write("Produto: " + produto.getNome());
                writer.newLine();
                writer.write("---------- Entradas --------------------");
                writer.newLine();
                writer.write(leArquivoEntrada(arquivoProduto));
                writer.write("----------------------------------------");
                writer.newLine();
                writer.write("Total: " + Integer.toString(total));
                writer.newLine();
                writer.write("Data: " + new SimpleDateFormat("dd/mm/yyyy").format(new Date()));
                writer.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
           
            
            
        }
        return new ControlCarregaArquivos().retornaStringArquivo(arquivoRelatorio.getPath());
    }    
    
    /**
     * Le o arquivo de texto de entrada de produtos
     * @param arquivoProduto
     * @return 
     */
    public String leArquivoEntrada(File arquivoProduto){
        String strRetorno = "";        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(arquivoProduto));
            String strReader = reader.readLine();
            
            int i = 0;   
            total = 0;
            while(strReader != null){
                switch (i){
                    case 0:
                        strRetorno += "Data: " + strReader;
                    break;
                    case 1:
                        strRetorno += "Fornecedor: " + strReader;
                    break;
                    case 2:
                        strRetorno += "Telefone: " + strReader;
                    break;
                    case 3:
                        i = 0;
                        total++;
                    break;
                }
                i++;               
                strRetorno += "\n";
                strReader = reader.readLine();
                    
            }
            reader.close();
        } catch (Exception ex) {
            Logger.getLogger(ControlRelatorios.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                
        return strRetorno;
    }   
    
    /**
     * Le o arquivo de saída de produto
     * @param arquivoProduto
     * @return 
     */
    
    public String leArquivoSaida(File arquivoProduto){
        String strRetorno = "";        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(arquivoProduto));
            String strReader = reader.readLine();
            
            int i = 0;   
            total = 0;
            while(strReader != null){
                switch (i){
                    case 0:
                        strRetorno += "Quantidade: " + strReader;
                    break;
                    case 1:
                        strRetorno += "Funcionario: " + strReader;
                    break;
                    case 2:
                        strRetorno += "Data: " + strReader;
                    break;
                    case 3:
                        i = 0;
                        total++;
                    break;
                }
                i++;               
                strRetorno += "\n";
                strReader = reader.readLine();
                    
            }
            reader.close();
        } catch (Exception ex) {
            Logger.getLogger(ControlRelatorios.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                
        return strRetorno;
    }   
    
    /**
     * Cria o arquivo de saida de produtos
     * @param produto
     * @param saidaProduto
     * @return 
     */
    public String geraRelatorioProdutos(Produto produto, SaidaProduto saidaProduto){
        File arquivoProduto = new File("Produtos/SaidaProdutos/saidaProduto" + Integer.toString(produto.getId())+".txt");
        File arquivoRelatorio = new File("Produtos/SaidaProdutos/RelatorioProduto" + produto.getNome() + Integer.toString(produto.getId()) + ".txt");
        if(arquivoProduto.exists()){            
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoRelatorio));
                writer.write("--- Relatório Saída Produto ----------");
                writer.newLine();
                writer.write("Produto: " + produto.getNome());
                writer.newLine();
                writer.write("---------- Saídas --------------------");
                writer.newLine();
                writer.write(leArquivoSaida(arquivoProduto));
                writer.write("----------------------------------------");
                writer.newLine();
                writer.write("Total: " + Integer.toString(total));
                writer.newLine();
                writer.write("Data: " + new SimpleDateFormat("dd/mm/yyyy").format(new Date()));
                writer.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
           
            
            
        }
        return new ControlCarregaArquivos().retornaStringArquivo(arquivoRelatorio.getPath());
    }
    
    public String relatorioConsumoFuncionario(){
        return "";
    }
    
    
}
