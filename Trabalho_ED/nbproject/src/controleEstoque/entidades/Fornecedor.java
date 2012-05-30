package controleEstoque.entidades;
/**
 * @author Eduardo Lacerda
 * Data: May 29, 2012
 */
public class Fornecedor {
    
    private String nome;
    private String telefone;
    private Produto produto;

    public Fornecedor() {
        this.nome = "";
        this.telefone = "";
        this.produto = new Produto();
    }
    
    public Fornecedor(String nome, String telefone, Produto produto){
        this.nome = nome;
        this.telefone = telefone;
        this.produto = produto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    
    

}
