package controleEstoque.entidades;

public class Login {
    private String usuario;
    private char[] senha;
    private Permissao permission;

    public Permissao getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        if(permission.equals("DIRETOR"))
            this.permission = Permissao.DIRETOR;
        else
            this.permission = Permissao.COMUM;
    }
    
    public void setPermission(Permissao permission){
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
    
    /**
     * 
     * @param usuario
     * @param senha
     * @return 
     */
    public boolean validaAcesso(String usuario, char[] senha){
        boolean valida = true;
        if(this.usuario.equals(usuario)){
            int i = 0;
            while(i < senha.length){
                if(!(this.senha[i] == senha[i])){
                    valida = false;
                    break;                    
                }
                    
                i++;
            }
            return valida;
        }
        return false;
        
       
    }
    
   
    
       
}
