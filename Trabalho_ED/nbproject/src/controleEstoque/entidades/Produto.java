package controleEstoque.entidades;
/**
 * @author Eduardo Lacerda
 * Data: May 26, 2012
 */
public class Produto {
    
    private int id;
    private String descricao;
    private double valorUnitario;
    private Estoque estoque = new Estoque();

    public Produto() {
        this.id = 0;
        this.descricao = "";
        this.valorUnitario = 0.00;
        this.estoque = new Estoque();
    }

    public Produto(int id, String descricao, double valorUnitario, Estoque estoque) {
        this.id = id;
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
        this.estoque = estoque;
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

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
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

    @Override
    public String toString() {
        return id + "\n" + descricao + "\n" + valorUnitario + "\n";
    }
    
    

}
