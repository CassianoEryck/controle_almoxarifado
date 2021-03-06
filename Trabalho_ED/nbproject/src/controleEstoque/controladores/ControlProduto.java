package controleEstoque.controladores;

import controleEstoque.arquivos.Arquivo;
import controleEstoque.arquivos.ControlGravaArquivos;
import controleEstoque.entidades.Estatisticas;
import controleEstoque.entidades.Estoque;
import controleEstoque.entidades.Produto;
import controleEstoque.estruturaDados.ListaProdutos;
import controleEstoque.estruturaDados.MergeSort;
import controleEstoque.formularios.frmIndicarCompra;
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

    public ControlProduto() {
        criaLista();
    }
    
    
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
                            produto.setNome(strReader);                           
                        break;
                            
                        case 2:
                           produto.setDescricao(strReader);                                                   
                        break;
                            
                        case 3:
                            produto.setValorUnitario(Double.parseDouble(strReader)); 
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
                            
                       case 4:
                            estoque.setQuantidade(Integer.parseInt(strReader));
                        break;        
                    }
                  i++;
                  if(i == 9){
                    i = 0;
                    estoque.setEstatistica(estatistica);
                    produto.setEstoque(estoque);                    
                    listaProdutos.adiciona(produto);
                }
                strReader = reader.readLine();                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString() + "Erro ao carregar a lista de produtos" + e.getLocalizedMessage());
        }
        
     
        
    }
    
    public ListaProdutos retornaLista(){
        return this.listaProdutos;
    }
    
    public void indicarProduto() {
        frmIndicarCompra frmIndicarCompra = new frmIndicarCompra();
        Produto p = new Produto();
        
        p.indicarProduto(frmIndicarCompra.getTxtNome().getText(),
                (String) frmIndicarCompra.getCmbFornecedor().getSelectedItem());
    }
    
    public void adicionaProduto(Produto produto){
        listaProdutos.adiciona(produto);
        MergeSort mergeSort = new MergeSort(listaProdutos);
        listaProdutos = mergeSort.mergeProdutos();
        controlArquivosTexto.criaArquivoProduto(listaProdutos);
        criaLista();       
        
    }

}
