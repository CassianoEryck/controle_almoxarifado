package controleEstoque.entidades;
/**
 * @author Eduardo Lacerda
 * Data: May 26, 2012
 */
public class Produto {
    
    int id;
    String descricao;
    double valorUnitario;
    private Estoque estoque = new Estoque();
    
    
    

    public Produto() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    
    public void cadastrarProduto(){
       
    }
    
    public void alterarProduto(){
        
    }
    
    public Produto solicitarProduto(){
        return this;
    }
    
    public void indicarProduto(){
        
    }

}
