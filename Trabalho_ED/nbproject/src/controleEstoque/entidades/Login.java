package controleEstoque.entidades;

public class Login {
    private String usuario;
    private char[] senha;
    private Permissao permission;

    public Permissao getPermission() {
        return permission;
    }

    public void setPermission(Permissao permission) {
        this.permission = permission;
    }

    public char[] getSenha() {
        return senha;
    }

    public void setSenha(char[] senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public boolean validaAcesso(String usuario, String senha){
        return true;
    }
    
   
    
       
}
