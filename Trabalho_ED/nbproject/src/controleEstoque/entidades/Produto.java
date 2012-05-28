package controleEstoque.entidades;

import controleEstoque.estruturaDados.ListaProdutos;

/**
 * @author Eduardo Lacerda
 * Data: May 26, 2012
 */
public class Produto {
    
    private Fornecedor fornecedor;
    private ListaProdutos produtosIndicados = new ListaProdutos();    
    private int id;
    private String nome;
    private String descricao;
    private double valorUnitario;
    private Estoque estoque = new Estoque();
    private EntradaProduto entradaProduto = new EntradaProduto();
    private SaidaProduto saidaProduto = new SaidaProduto();

    public Produto() {
        this.id = 0;
        this.nome = "";
        this.descricao = "";
        this.valorUnitario = 0.00;
        this.estoque = new Estoque();
        this.saidaProduto = new SaidaProduto();
        this.entradaProduto = new EntradaProduto();
        this.fornecedor = new Fornecedor();
    }

    
    public Produto(int id, String nome, String descricao, double valorUnitario,
            Estoque estoque, SaidaProduto saidaProduto, EntradaProduto entradaProduto, String nomeFornecedor) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
        this.estoque = estoque;
        this.saidaProduto = saidaProduto;
        this.entradaProduto = entradaProduto;
        this.fornecedor = new Fornecedor(nomeFornecedor);
    }
    
    public Produto (String nome, String nomeFornecedor) {
        this.nome = nome;
        this.fornecedor = new Fornecedor(nomeFornecedor);
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
    
    public void indicarProduto(String nome, String fornecedor){
        produtosIndicados.adiciona(new Produto(nome, fornecedor));
    }

    public EntradaProduto getEntradaProduto() {
        return entradaProduto;
    }

    public void setEntradaProduto(EntradaProduto entradaProduto) {
        this.entradaProduto = entradaProduto;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ListaProdutos getProdutosIndicados() {
        return produtosIndicados;
    }

    public void setProdutosIndicados(ListaProdutos produtosIndicados) {
        this.produtosIndicados = produtosIndicados;
    }

    public SaidaProduto getSaidaProduto() {
        return saidaProduto;
    }

    public void setSaidaProduto(SaidaProduto saidaProduto) {
        this.saidaProduto = saidaProduto;
    }

    @Override
    public String toString() {
        return Integer.toString(id) + "\n" + descricao + "\n" + Double.toString(valorUnitario) + "\n" + estoque.toString();
    }
}
