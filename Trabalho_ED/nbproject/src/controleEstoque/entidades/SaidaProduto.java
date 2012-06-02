package controleEstoque.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Eduardo Lacerda
 * Data: May 28, 2012
 */
public class SaidaProduto {
    private Funcionario funcionario;
    private Date data;
    private int quantidade;

    public SaidaProduto() {
        this.funcionario = new Funcionario();
        this.data = new Date();
        this.quantidade = 0;
    }

    public SaidaProduto(Funcionario funcionario, Date data, int quantidade) {
        this.funcionario = funcionario;
        this.data = data;
        this.quantidade = quantidade;
    }
    
    

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
    
    /**
     * 
     * @param periodo
     * @return 
     */
    
    public int obtemQuantidadeSaidas(int periodo){
        return 0;
    }
    
    /**
     * Este método é usado para registrar a saída de um produtom
     * @param quantidade
     * @param funcionario 
     */
    public void registraSaida(int quantidade, Funcionario funcionario){
        
    }

   @Override
    public String toString() {
        return  Integer.toString(quantidade) + "\n"+ funcionario.getNome() + "\n" + new SimpleDateFormat("dd/mm/yyyy").format(data) + "\n";
    }
    
    
    

}
