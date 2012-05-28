/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleEstoque.estruturaDados;

import controleEstoque.entidades.Fornecedor;

/**
 *
 * @author User
 */
public class ListaFornecedor {
    No inicio;

    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }
    
    public void adiciona(Fornecedor fornecedor){
        No novo = new No(fornecedor);
        
        if(inicio == null){
            inicio = novo;
        }else{
            No aux = inicio;
            while(aux.prox != null){
                aux = aux.prox;
            }
            aux.prox = novo;
        }
    }
    
    public Fornecedor remove(Fornecedor fornecedor){
        Fornecedor fornecedorRetorno = new Fornecedor();
        
        No lista = this.inicio;
        while(lista.getProx() != null){
            
            if(lista.getObjeto() == fornecedor){
                fornecedorRetorno = fornecedor;
            }
            
            lista.setObjeto(lista.getProx());
        }
        
        
        return fornecedorRetorno;
    }
    
    public boolean alteraProduto(Fornecedor fornecedorAntigo, Fornecedor fornecedorNovo){
        boolean alterar = false;
        
        No lista = this.inicio;
        while(lista.getProx() != null){
            
            if(lista.getObjeto() == fornecedorAntigo){
                alterar = true;
            }
            
            if(!alterar)
                lista.setObjeto(lista.getProx());
            else{
                lista.setObjeto(fornecedorNovo);
                break;
            }
        }
        
        
        return alterar;
    }
    
    public No getLista(){
        return inicio;
    }
    
    public void setLista(No lista){
        this.inicio = lista;
    }
    
    public int count(){
        int i = 0;
        No aux = inicio;
        
        while(aux != null){
            i++;
            aux = aux.getProx();
        }                    
        return i;
    }
    
    public String percorreLista(){
        String lista = "";
        No aux = inicio;
        
        while(aux != null){
            lista += aux.getObjeto().toString();
            aux = aux.getProx();
        }
        
        return lista;
    }
    
}
