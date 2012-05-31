package controleEstoque.controladores;

import controleEstoque.arquivos.Arquivo;
import controleEstoque.arquivos.ControlGravaArquivos;
import controleEstoque.entidades.Estatisticas;
import controleEstoque.entidades.Estoque;
import controleEstoque.entidades.Produto;
import controleEstoque.estruturaDados.ListaProdutos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 * @author Eduardo Lacerda
 * Data: May 28, 2012
 */
public class ControlProduto {
    
    ListaProdutos listaProdutos = new ListaProdutos();
    ControlGravaArquivos controlArquivosTexto = new ControlGravaArquivos(Arquivo.PRODUTO);    
    
    public File leArquivo(){
        return controlArquivosTexto.leArquivo();
    }
    
    public void criaLista(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(leArquivo()));
            String strReader = reader.readLine();
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
                        produto.setDescricao(strReader);
                    break;    
                    case 2:
                        produto.setValorUnitario(Double.parseDouble(strReader));
                    break;    
                    case 3:
                        estoque.setQuantidade(Integer.parseInt(strReader));
                    break;    
                    case 5:
                        estatistica.setVendaMediaMensal(Double.parseDouble(strReader));
                    break;    
                        
                    case 6:
                        estatistica.setTempoCobertura(Double.parseDouble(strReader));
                    break;    
                        
                    case 7:
                        estatistica.setEstoqueMinimo(Integer.parseInt(strReader));
                    break;    
                        
                    case 8:
                        estatistica.setEstoqueMaximo(Integer.parseInt(strReader));
                    break;    
                        
                }
                
               
                i++;
                if(i == 8){
                    i = 0;
                    estoque.setEstatistica(estatistica);
                    produto.setEstoque(estoque);                    
                    listaProdutos.adiciona(produto);
                }
                strReader = reader.readLine();                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
     
        
    }
    
    public ListaProdutos retornaLista(){
        return this.listaProdutos;
    }
    
    
    

}
