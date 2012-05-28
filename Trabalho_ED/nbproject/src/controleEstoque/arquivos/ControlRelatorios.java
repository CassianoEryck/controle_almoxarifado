package controleEstoque.arquivos;

import controleEstoque.entidades.Fornecedor;
import controleEstoque.entidades.Produto;
import controleEstoque.estruturaDados.ListaFornecedor;
import controleEstoque.estruturaDados.No;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

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
    
    public String relatorioProdutos(){
        return "";
    }
    
    public String relatorioConsumoFuncionario(){
        return "";
    }
    
    
}
