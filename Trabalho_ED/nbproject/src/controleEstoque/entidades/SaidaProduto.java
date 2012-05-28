package controleEstoque.entidades;

import java.util.Date;

/**
 * @author Eduardo Lacerda
 * Data: May 28, 2012
 */
public class SaidaProduto {
    private Funcionario funcionario;
    private Date data;
    private int quantidade;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public int obtemQuantidadeSaidas(int periodo){
        return 0;
    }
    
    public void registraSaida(int quantidade, Funcionario funcionario){
        
    }

}
