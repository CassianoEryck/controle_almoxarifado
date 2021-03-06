/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleEstoque.estruturaDados;

import controleEstoque.entidades.Produto;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class MergeSort {
    ListaProdutos lista;
    Produto[] produtos;
    
    /**
     * Construtor da classe MergeSort para organizar uma Lista de Produtos
     * @param lista 
     */
    public MergeSort(ListaProdutos lista){
        this.lista = lista;
        //obtem a quantidade de itens na lista, mesmo sendo estática.
        int count = lista.count();
        try {            
            produtos = new Produto[count];     
            /**
             * instancia o vetor com os produtos da lista.
             */
            No aux = lista.getLista();            
            for(int i = 0; i < count; i++ ){
                produtos[i] = (Produto) aux.getObjeto();
                aux = aux.getProx();
            }            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString() + ", Lista vazia!");
        }
        
    }
    
    /**
     * Ordena e retorna a lista de produtos instanciada anteriormente
     * @return Lista de produtos organizada
     */
    public ListaProdutos mergeProdutos(){
        mergeProdutos(0, produtos.length - 1);        
        return reestruturaLista();
    }
    
    /**
     * Ordena a lista instanciada a partir do array ordenado.
     * @return Lista organizada
     */
    private ListaProdutos reestruturaLista(){
        ListaProdutos lista = new ListaProdutos();
        for(int i = 0; i < produtos.length; i++){
            lista.adiciona(produtos[i]);
        }
        
        return lista;
    }
   
    /**
     * Recursiva que organiza o array ainda não ordenado.
     * @param inicio primeiro indice do array (use 0)
     * @param fim  ultimo indice do array (use array.lenght - 1)
     */
    private void mergeProdutos(int inicio, int fim){
        if(inicio < fim){
            int meio = (inicio + fim)/2;
            mergeProdutos(inicio, meio);
            mergeProdutos(meio+1, fim);
            mesclaProduto(inicio, meio, fim);        
        }       
    }
    
    /**
     * Ordena e passa para o array da classe
     * @param inicio
     * @param meio
     * @param fim 
     */
    private void mesclaProduto(int inicio, int meio, int fim){
        int i1 = inicio, f1 = meio, i2 = meio+1, f2 = fim;
        int iaux = inicio;        
              
        Produto aux[] = new Produto[produtos.length];
        while(i1 <= f1 && i2 <= f2){
            if(produtos[i1].getId() < produtos[i2].getId()){
                aux[iaux] = produtos[i1];
                iaux++;
                i1++;
            }else{
                aux[iaux++] = produtos[i2++];
            }
        }
        
        while(i1 <= f1)
            aux[iaux++] = produtos[i1++];
        while(i2 <= f2)
            aux[iaux++] = produtos[i2++];
        
        for(int i = inicio; i <= fim; i++){
            produtos[i] = aux [i];
        }
    }
    
    
    
   
    
}
