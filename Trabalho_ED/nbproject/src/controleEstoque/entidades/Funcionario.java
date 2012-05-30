package controleEstoque.entidades;
/**
 * @author Eduardo Lacerda
 * Data: May 28, 2012
 */
public class Funcionario {
    private String nome;
    private String cargo;
    private boolean comprarProduto;
    private Login login;    

    public Funcionario() {
        
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isComprarProduto() {
        return comprarProduto;
    }

    public void setComprarProduto(boolean comprarProduto) {
        this.comprarProduto = comprarProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Funcionario verificaDados(String usuario, char[] senha){
        login = new Login();
        login.setUsuario(usuario);
        login.setSenha(senha);
        
        return this;
    }
    
    public Permissao verificaPermissao(){
        return login.getPermission();
    }
    
    public void permitirCompra(boolean permitir){
        
    }
    
    
    

}
