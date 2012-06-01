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
    
    
    
    

}
