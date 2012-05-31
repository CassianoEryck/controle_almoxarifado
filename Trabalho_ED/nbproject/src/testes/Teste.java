package testes;

import controleEstoque.entidades.EntradaProduto;
import controleEstoque.entidades.Estoque;
import controleEstoque.entidades.Produto;
import controleEstoque.entidades.SaidaProduto;
import controleEstoque.estruturaDados.ListaProdutos;
import controleEstoque.estruturaDados.MergeSort;
import java.util.Random;
/**
 * @author Eduardo Lacerda
 * Data: May 30, 2012
 */
public class Teste {
    
    public static void main(String args[]){
        ListaProdutos lista = new ListaProdutos();
        Random random = new Random();        
        //ControlArquivosTexto arquivo = new ControlArquivosTexto(ControlArquivosTexto.Arquivo.PRODUTO);
        
        for(int i = 0; i < 4; i++){
            Produto produto = new Produto(random.nextInt(100), "teste", i + i/100, new Estoque() , new SaidaProduto(), new EntradaProduto());  
            lista.adiciona(produto);      
        }
        
        
        MergeSort mergeSort = new MergeSort(lista);
        lista = mergeSort.mergeProdutos();
        
        System.out.println(lista.percorreLista());
    }
            

}
