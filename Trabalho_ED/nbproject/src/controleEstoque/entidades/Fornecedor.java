package controleEstoque.entidades;

import controleEstoque.estruturaDados.ListaProdutos;

/**
 * @author Eduardo Lacerda
 * Data: May 29, 2012
 */
public class Fornecedor {
    
    private String nome;
    private String telefone;
    private ListaProdutos produtos;

    public Fornecedor() {
        this.nome = "";
        this.telefone = "";
        this.produtos = new ListaProdutos();
    }
    
    public Fornecedor(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public Fornecedor(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ListaProdutos getProdutos() {
        return produtos;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
    /**
     * Retornar o fornecedor como uma String
     * @param listaProdutos se true, vai retornar todos os arquivos da lista.
     * @return 
     */
    public String toString(boolean listaProdutos) {
        if (listaProdutos)
            return nome.toString() + "\n" + telefone.toString() + "\n" + this.produtos.percorreLista();
        else
            return nome.toString() + "\n" + telefone.toString() + "\n";
        
    }
    
    
    
    

}
